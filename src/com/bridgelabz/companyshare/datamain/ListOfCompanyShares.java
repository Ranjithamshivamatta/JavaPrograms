package com.bridgelabz.companyshare.datamain;

import java.util.LinkedList;

import com.bridgelabz.companyshare.data.CompanyShareInterface;
import com.bridgelabz.companyshare.dataimple.CompanyShareImpl;
import com.bridgelabz.companyshare.model.CompanyShare;
import com.bridgelabz.util.DataStructureProgramming;

public class ListOfCompanyShares {

	public static void main(String[] args) {
		
		 CompanyShareInterface ref=new CompanyShareImpl();
		 LinkedList<CompanyShare> shares = new LinkedList<>();
		ref.fileRead();
	     ref.add();
		System.out.println("enter the name you want to delet");
		String name=DataStructureProgramming.getString();
		ref.remove(name);
		ref.writeFile();
	}
}
