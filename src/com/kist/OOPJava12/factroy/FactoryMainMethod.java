package com.kist.OOPJava12.factroy;

import java.util.Scanner;

import com.kist.OOPJava12.VechileFactory.VechileFactory;
import com.kist.OOPJava12.serviceDept.Vechile;

public class FactoryMainMethod {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String value=sc.nextLine();
		
		VechileFactory vf=new VechileFactory();
		Vechile v=vf.getVechile(value);
		v.design();
		v.manufacture();
	
	}
	
}
