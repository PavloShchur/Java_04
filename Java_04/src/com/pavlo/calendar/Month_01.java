package com.pavlo.calendar;

public enum Month_01 {

		JUNUARY(Season_01.WINTER, 31), FEBRUARY(Season_01.WINTER, 29), MARCH(Season_01.SPRING, 31), 
		APRIL(Season_01.SPRING, 30), MAY(Season_01.SPRING, 30), JUNE(Season_01.SUMER, 28), JULY(Season_01.SUMER, 30), 
		AUGUST(Season_01.SUMER, 30), SEPTEMBER(Season_01.AUTUMN, 30), NOVEMBER(Season_01.AUTUMN, 30),
		OCTBER(Season_01.AUTUMN, 30), DECEMBER(Season_01.WINTER, 30);
	
	
	private Season_01 season;
	private int days;
	private Month_01(Season_01 season, int days) {
		this.season = season;
		this.days = days;
	}
	public Season_01 getSeason() {
		return season;
	}
	public void setSeason(Season_01 season) {
		this.season = season;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	
	}
