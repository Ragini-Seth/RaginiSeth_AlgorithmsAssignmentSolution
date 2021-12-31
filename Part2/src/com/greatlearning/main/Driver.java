package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.CompanyService;

public class Driver {
	private static final Scanner sc = new Scanner(System.in);
	
	private static void operationRequested(int optionValue) {
		switch(optionValue) {
			case 0:
				System.out.println("Exited successfully");
				sc.close();
				break;
			case 1:
				CompanyService.sortStockAsc();
				getUserInputOptions();
				break;
			case 2:
				CompanyService.sortStockDesc();
				getUserInputOptions();
				break;
			case 3:
				CompanyService.companiesCountStockRose();
				getUserInputOptions();
				break;
			case 4:
				CompanyService.companiesCountStockDeclined();
				getUserInputOptions();
				break;
			case 5:
				CompanyService.isStockPresent();
				getUserInputOptions();
				break;
			case 6:
				System.out.println("Incorrect option entered. Please choose again");
				getUserInputOptions();
				break;
		}
	}
	
	private static void getUserInputOptions() {
		System.out.println("\n");
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the operation that you want to perform");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");
		System.out.println("-----------------------------------------------");
		
		operationRequested(sc.nextInt());
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the no of companies");
		CompanyService.createPopulateCompanyList(sc.nextInt());
		
		//Get the user input option for operation they want to perform
		getUserInputOptions();
	}
}
