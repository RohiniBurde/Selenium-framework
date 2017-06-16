package com.demo;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnitDriver {

	private char[] getTitle;

	public HtmlUnitDriver(BrowserVersion firefox52) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HtmlUnitDriver dr =new HtmlUnitDriver(BrowserVersion.FIREFOX_52);
dr.get("http://toolsqa.com/automation-practice-table/");
System.out.println(dr.getTitle);
	}

	private void get(String string) {
		// TODO Auto-generated method stub
		
	}

}
