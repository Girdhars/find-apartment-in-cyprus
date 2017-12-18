package com.tech.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author Girdhar.Singh
 * @date November 16, 2017
 */
public class FindApartment {

	public static ArrayList<String> apartmentsLinksOld = new ArrayList<String>();
	public static ArrayList<String> apartmentsLinksNew = new ArrayList<String>();

	/**
	 * 
	 * This method will take url as argument and find the available apartments
	 * 
	 * @param url - search criteria url
	 * @return void
	 * @throws IOException
	 * @throws none
	 */
	public static void findApartment(String url) throws IOException {

		MainApp.driver.get(url);
		List<WebElement> apartments = MainApp.driver.findElements(By.className("announcement-container"));
		System.out.println("total apartments matching your search criteria is: " + apartments.size());
		if (apartmentsLinksOld.size() == 0) {
			for (WebElement apartment : apartments) {
				apartmentsLinksNew.add(apartment.findElements(By.className("mask")).get(0).getAttribute("href").trim());
			}
			apartmentsLinksOld.addAll(apartmentsLinksNew);
		} else {
			apartmentsLinksNew.clear();
			for (WebElement apartment : apartments) {
				String apartmentlink = apartment.findElements(By.className("mask")).get(0).getAttribute("href").trim();
				apartmentsLinksNew.add(apartmentlink);
				if (!apartmentsLinksOld.contains(apartmentlink)) {
					System.out.println("latest post: " + apartmentlink);
					PlaySound playSound = new PlaySound();
					playSound.playClips();

				}
			}
			apartmentsLinksOld.clear();
			apartmentsLinksOld.addAll(apartmentsLinksNew);
		}

	}

}
