package com.tech.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author Girdhar.Singh
 * @date November 16, 2017
 */
public class MainApp {

	public static String searchCriteriaUrl;
	public static long schedularTime;
	public static WebDriver driver;
	public static List<String> emailList = new ArrayList<String>();

	/**
	 * 
	 * This method will take input from user. Input as search criteria, schedular
	 * time and the email list
	 * 
	 * @param none
	 * @return void
	 * @throws none
	 */
	public static void init() {
		System.out.println("Enter your search criteria URL : ");
		Scanner scanner = new Scanner(System.in);
		searchCriteriaUrl = scanner.next().trim();
		System.out.println("Enter the scheduler time in minutes: ");
		long time = scanner.nextLong();
		schedularTime = TimeUnit.MINUTES.toMillis(time);
		/*
		 * System.out.println("enter emails(comma seperated):  "); String emailsId =
		 * scanner.next().trim(); String emails[] = emailsId.split(","); for (String
		 * email : emails) { emailList.add(email); }
		 */
		scanner.close();
		initDriver();
	}

	/**
	 * 
	 * this method will initialization the chrome web driver
	 * 
	 * @param none
	 * @return void
	 * @throws none
	 */
	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	/**
	 * 
	 * The main application starts from here
	 * 
	 * @param none
	 * @return void
	 * @throws none
	 */
	public static void main(String[] args) {
		init();
		System.out.println("Starting application");
		Timer time = new Timer();
		ScheduledTask scheduledTask = new ScheduledTask();
		time.schedule(scheduledTask, 0, schedularTime);
		System.out.println("Application started successfully");
	}
}
