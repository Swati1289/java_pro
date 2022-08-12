package com.lti.bank;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import com.opencsv.CSVReader;

public class USBankFileRead {
HashMap <String, ComplaintDetails> MapBankobjcompdet = new HashMap<>();
public void fileLoader() {
	 String path="C:\\Users\\swati hegde\\Documents\\Downloads\\complaints.csv";
	 String[] elements=null;
 
 try {
		FileReader fr = new FileReader(path);
		CSVReader csr = new CSVReader(fr);

	while ((elements=csr.readNext())!=null)
	{   
			
//		System.out.println(elements.length);

		ComplaintDetails objcompdet=new ComplaintDetails();
		objcompdet.dateReceived=elements[0];
		objcompdet.product=elements[1];
		objcompdet.subProduct=elements[2];
		objcompdet.issue=elements[3];
		objcompdet.subIssue=elements[4];
		objcompdet.company=elements[5];
		objcompdet.state=elements[6];
		objcompdet.ZIPcode=elements[7];
		objcompdet.submittedVia=elements[8];
		objcompdet.dateSentToCompany=elements[9];
		objcompdet.companyResponseToConsumer=elements[10];
		objcompdet.timelyResponse=elements[11];
		objcompdet.consumerDisputed=elements[12];
		objcompdet.consumerDisputed=elements[12];
		
		MapBankobjcompdet.put(elements[13],objcompdet); 
	}
	
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
 
}

HashMap<String,ComplaintDetails> GetMapBankobjcompdet(){
	
	return MapBankobjcompdet;
	
}
}