package com.pavlo.parallel.programming;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class GreenhouseScheduler {

	private volatile boolean light = false;
	private volatile boolean water = false;
	private String termostat = "Day";

	public synchronized String getTermostat() {
		return termostat;
	}

	public synchronized void setTermostat(String termostat) {
		this.termostat = termostat;
	}

	ScheduledThreadPoolExecutor scheduler = new ScheduledThreadPoolExecutor(10);

	public void schedule(Runnable event, long delay) {
		scheduler.schedule(event, delay, TimeUnit.MILLISECONDS);
	}

	public void repeat(Runnable event, long initialDelay, long period) {
		scheduler.scheduleAtFixedRate(event, initialDelay, period, TimeUnit.MILLISECONDS);
	}

	class LightOn implements Runnable {

		@Override
		public void run() {
			System.out.println("Світло включене.");
			light = true;
		}

	}
	
	class LightOff implements Runnable {

		@Override
		public void run() {
			System.out.println("Світло виключено.");
			light = false;
		}

	}
	
	class WaterOn implements Runnable {

		@Override
		public void run() {
			System.out.println("Полив включено.");
			water = false;
		}

	}
	
	class WaterOff implements Runnable {

		@Override
		public void run() {
			System.out.println("Полив виключено.");
			water = false;
		}

	}
	
	class ThermostatNight implements Runnable {

		@Override
		public void run() {
			System.out.println("Включення нічного режиму.");
			setTermostat("Ніч");
		}

	}
	
	class ThermostatDay implements Runnable {

		@Override
		public void run() {
			System.out.println("Включення денного режиму.");
			setTermostat("День");
		}

	}
	
	class Bell implements Runnable {

		@Override
		public void run() {
			System.out.println("Бам.");
		}

	}
	
	class Terminate implements Runnable {

		@Override
		public void run() {
			System.out.println("ВЗавершення.");
			scheduler.shutdown();
			new Thread() {
				public void run() {
					for(DataPoint d: data) {
						System.out.println(d);
					}
				}
			}.start();
		}

	}
	
	static class DataPoint {
		final Calendar time;
		final float temperature;
		final float humidity;
		
		public DataPoint(Calendar time, float temperature, float humidity) {
			super();
			this.time = time;
			this.temperature = temperature;
			this.humidity = humidity;
		}

		@Override
		public String toString() {
			return time.getTime() + String.format(" температура: %1$.1f волога: %2$.2f",
					temperature, humidity);
		}
		
	}
	
	private Calendar lastTime = Calendar.getInstance();
	{
		lastTime.set(Calendar.MINUTE, 30);
		lastTime.set(Calendar.SECOND, 0);
	}
	
	private float lastTemp = 65.0f;
	private int tempDirection = +1;
	private float lastHumidity = 50.0f;
	private int humidityDirection = +1;
	private Random random = new Random(47);
	List<DataPoint> data = Collections.synchronizedList(
			new ArrayList<DataPoint>());
	
	class CollectData implements Runnable {

		@Override
		public void run() {
			System.out.println("Збір даних.");
			synchronized (GreenhouseScheduler.this) {
				lastTime.set(Calendar.MINUTE, lastTime.get(Calendar.MINUTE) + 30);
				if(random.nextInt(5) == 4) {
					tempDirection = -tempDirection;
				}
				lastTemp = lastTemp + tempDirection * (1.0f + random.nextFloat());
				if(random.nextInt(5) == 4) {
					humidityDirection = -humidityDirection;
					lastHumidity = lastHumidity * humidityDirection * random.nextFloat();
					data.add(new DataPoint((Calendar)lastTime.clone(), lastTemp, lastHumidity));
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		GreenhouseScheduler greenhouseScheduler = new GreenhouseScheduler();
		greenhouseScheduler.schedule(greenhouseScheduler.new Terminate(), 5000 );
		greenhouseScheduler.repeat(greenhouseScheduler.new Bell(), 0, 1000);
		greenhouseScheduler.repeat(greenhouseScheduler.new ThermostatNight(), 0, 2000);
		greenhouseScheduler.repeat(greenhouseScheduler.new LightOn(), 0, 200);
		greenhouseScheduler.repeat(greenhouseScheduler.new LightOff(), 0, 400);
		greenhouseScheduler.repeat(greenhouseScheduler.new WaterOn(), 0, 600);
		greenhouseScheduler.repeat(greenhouseScheduler.new WaterOff(), 0, 800);
		greenhouseScheduler.repeat(greenhouseScheduler.new ThermostatDay(), 0, 1400);
		greenhouseScheduler.repeat(greenhouseScheduler.new CollectData(), 500, 500);
	}
	
}
































































