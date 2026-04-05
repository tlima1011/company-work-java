package com.company.app;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import com.company.entities.Department;
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
		System.out.println("How many contracts to this worker? "); 
		int conts = ler.nextInt(); 
		
		for(int i = 0; i < conts; i++) { 
			System.out.printf("Enter #%d contract data:\n", (i + 1)); 
			System.out.print("Date (DD/MM/YYYY): ");
			//20/08/2018
			String dt = ler.nextLine(); 
			LocalDateTime date = LocalDateTime.parse(dt);
			System.out.print("Value per hour: ");
			Double vph = ler.nextDouble();
			//50.00
			System.out.print("Duration (hours): ");
			//20
			Integer h = ler.nextInt(); 
			HourContract contract = new HourContract(date, vph, h);
		}
		
		
		
		System.out.println(wk);
		
		
		
		ler.close();
	}

}
