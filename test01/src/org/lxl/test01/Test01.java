package org.lxl.test01;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
	public static void main(String args[]){
		String tests = "this is just a test String";
		String[] arrs = tests.split(" ");
		List<String> list1 = new ArrayList<String>();
		int len = arrs.length;
		Test02.ShowInfo(""+len+10);
		//System.out.println(len+10);
	}
}
