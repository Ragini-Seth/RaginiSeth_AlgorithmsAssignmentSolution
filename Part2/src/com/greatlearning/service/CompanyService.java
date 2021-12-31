package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.utility.BinarySearchImplementation;
import com.greatlearning.utility.LinearSearchImplementation;
import com.greatlearning.utility.MergeSortImplementation;
import com.greatlearning.model.CompanyStockInfo;

public class CompanyService {
	private static final Scanner sc = new Scanner(System.in);
	private static CompanyStockInfo companyList[];
	private static double companyStockPriceList[];
	private static boolean isCompanyStockGreaterList[];
	
	private static MergeSortImplementation ms = new MergeSortImplementation();
	private static LinearSearchImplementation ls = new LinearSearchImplementation();

	public static void createPopulateCompanyList(int companiesCount) {
		int j = 0;
		CompanyStockInfo currentCSI;
		
		//Creating an array to store objects of type CompanyStockInfo
		companyList = new CompanyStockInfo[companiesCount];
		
		//Creating an array to store stockPrices of the companies
		companyStockPriceList = new double[companyList.length];
		
		//Creating an array to store state of the companies for stock price -- whether rose or declined
		isCompanyStockGreaterList = new boolean[companyList.length];
		
		//Populating the arrays
		for(int i = 0; i < companiesCount; i++) {
			j = i+1;
			currentCSI = new CompanyStockInfo();
			
			System.out.println("Enter current stock price of the company " + j);
			currentCSI.setStockPrice(sc.nextDouble());
			
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			currentCSI.setStockGreater(sc.nextBoolean());
			
			companyList[i] = currentCSI;
			
			companyStockPriceList[i] = currentCSI.getStockPrice();
			
			isCompanyStockGreaterList[i] = currentCSI.isStockGreater();
		}
	}
	
	//1. Display the companies stock prices in Ascending order
	public static void sortStockAsc() {
		ms.sort(companyStockPriceList, 0, companyStockPriceList.length - 1, false);	//For Ascending order sort
		System.out.println("Stock prices in ascending order are :");
		
		for(int j = 0; j < companyStockPriceList.length; j++) {
			System.out.print(companyStockPriceList[j] + " ");
		}
	}
	
	//2:- Display the companies stock prices in Descending order
	public static void sortStockDesc() {	
		ms.sort(companyStockPriceList, 0, companyStockPriceList.length - 1, true); //For Descending order sort
		System.out.println("Stock prices in descending order are :");
		
		for(int j = 0; j < companyStockPriceList.length; j++) {
			System.out.print(companyStockPriceList[j] + " ");
		}
	}
	
	//3. Display the total no of companies for which stock prices rose today
	public static void companiesCountStockRose(){
		System.out.println("Total no of companies whose stock price rose today : " + ls.linearSearch(isCompanyStockGreaterList));
	}
	
	//4. Display the total no of companies for which stock prices declined today
	public static void companiesCountStockDeclined(){
		int count = isCompanyStockGreaterList.length - (ls.linearSearch(isCompanyStockGreaterList));
		System.out.println("Total no of companies whose stock price declined today : " + count);
	}
	
	//5. Search a specific stock price
	public static void isStockPresent() {
		System.out.println("Enter the key value");
		double stockValueEntered = (double) sc.nextDouble();
		
		ms.sort(companyStockPriceList, 0, companyStockPriceList.length - 1, false);
		
		BinarySearchImplementation bs = new BinarySearchImplementation();
		bs.searchValue(companyStockPriceList, stockValueEntered);
	}
}
