package com.bridgelabz.companyshare.datamain;

import java.util.LinkedList;

import com.bridgelabz.companyshare.data.CompanyShareService;
import com.bridgelabz.companyshare.dataimple.CompanyShareServiceImple;
import com.bridgelabz.companyshare.model.CompanyShare;
import com.bridgelabz.util.DataStructureProgramming;

public class CompanyShareApp {

	public static void main(String[] args) {

		CompanyShareService ref = new CompanyShareServiceImple();
		LinkedList<CompanyShare> shares = new LinkedList<>();
		ref.fileRead();
		ref.add();
		System.out.println("enter the name you want to delet");
		String name = DataStructureProgramming.getString();
		ref.remove(name);
		ref.writeFile();
	}
}
