package com.company.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import com.company.entities.Department;
import com.company.entities.HourContract;
import com.company.entities.Worker;
import com.company.entities.enums.WorkLevel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		System.out.print("Enter department's name: ");
		String dept = ler.nextLine(); 
		
		Department department = new Department(dept); 
		
		System.out.print("Name: ");
		String Name = ler.nextLine(); 
		//Name: Alex
		System.out.print("Level (Junior/MidLevel/Senior): ");
		String Level = ler.nextLine(); 
		//MidLevel
		WorkLevel workLevel = WorkLevel.valueOf(Level);
		System.out.print("Base salary: ");
		Double baseSalary = ler.nextDouble(); 
		Worker wk = new Worker(Name, workLevel, baseSalary, department);
		//String n, WorkLevel l, Double bs, Department d
		//1200.00
		System.out.print("How many contracts to this worker? "); 
		int conts = ler.nextInt(); 
		ler.nextLine(); 
		for(int i = 0; i < conts; i++) { 
			System.out.printf("Enter #%d contract data:\n", (i + 1)); 
			System.out.print("Date (DD/MM/YYYY): ");
			//20/08/2018
			String dt = ler.nextLine(); 
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date = LocalDate.parse(dt, formatter);
			System.out.print("Value per hour: ");
			Double vph = ler.nextDouble();
			//50.00
			System.out.print("Duration (hours): ");
			//20
			Integer h = ler.nextInt(); 
			ler.nextLine();
			HourContract contract = new HourContract(date, vph, h);
			wk.addContract(contract); 	
			System.out.println();
		}	
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): "); 
		String [] my = ler.nextLine().split("/"); 
		int month = Integer.parseInt(my[0]); 
		int year = Integer.parseInt(my[1]);
		double income = wk.income(year, month); 
				
		System.out.println(wk);
		System.out.printf("Income for %d/%d: %.2f", month, year, income);
		//Income for 08/2018: 3000.00
		ler.close();
	}
}
