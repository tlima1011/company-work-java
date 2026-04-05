package com.company.app;

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
		System.out.println(wk);
		
		
		
		ler.close();
	}

}
