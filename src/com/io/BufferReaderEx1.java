package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderEx1 {

	public static void main(String[] args) throws IOException {
            FileReader f=new FileReader("C:/Users/Shivam Tiwari/Desktop/FileIO/BufferReader.txt");
	    BufferedReader b=new BufferedReader(f);
	    String s=b.readLine();
	    if (s!=null) {
			System.out.println(s);
			int i=b.read();
			System.out.println(i);
			System.out.println((char)i);
		}
	
	b.close();
	
	
	}
	
}
