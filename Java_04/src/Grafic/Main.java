package Grafic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main {
	public static void main(String[] args) throws IOException {
		final byte spaces_beetween_nums = 2;
		byte spacing_asterisk = 0;

		Document document = Jsoup
				.connect("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population").get();

		Elements elements2 = document.select("table.wikitable > tbody");
		List<Country> countries = new ArrayList<Country>();
		int N = Integer.parseInt(JOptionPane.showInputDialog("Enter number of countries:"));
		for (org.jsoup.nodes.Element element : elements2) {
			for (short i = 1; i <= N; i++) {
				Collections.shuffle(countries);
				countries.add(new Country(
						element.getElementsByTag("tr").get(i).getElementsByTag("td").get(1).text()
								.replaceAll("\\[.*?\\]", ""),
						Integer.parseInt(element.getElementsByTag("tr").get(i).getElementsByTag("td").get(2).text()
								.replaceAll(",", ""))));
			}
		}

		String[] arrname = new String[countries.size() - 1];
		String[] arrpopulation = new String[countries.size() - 1];
		for (short i = 0; i < arrname.length; i++) {
			arrname[i] = countries.get(i).getName();
			arrpopulation[i] = String.valueOf(countries.get(i).getPopulation());
		}

		byte spacing = (byte) (Arrays.stream(arrname).map(row -> row.length()).max(Integer::compare).get() + 3);
		for (short i = 0; i < arrname.length; i++) {
			System.out.println(rightPadding(arrname[i], (short) (spacing + spacing_asterisk)) + "*" + "(" + arrname[i] + ";\n"
					+ rightPadding("", (short) (spacing + spacing_asterisk)) + arrpopulation[i] + ")");
			spacing_asterisk += arrpopulation[i].length() + spaces_beetween_nums;
			System.out.println();
		}

		System.out.printf("%" + spacing + "s", " ");
		for (short j = 0; j < arrpopulation.length; j++) {
			System.out.printf(arrpopulation[j] + "; ");
		}
	}

	public static String rightPadding(String str, short num) {
		return String.format("%1$-" + num + "s", str);
	}
}
