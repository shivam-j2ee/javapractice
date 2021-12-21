package com.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter1 {
	
	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("C:/Users/Shivam Tiwari/Desktop/FileIO/FileReader.txt");
		FileWriter fw=new FileWriter("C:/Users/Shivam Tiwari/Desktop/FileIO/FileWriter.txt",true);
        int ch=fr.read();
        while(ch!=-1){
        	fw.write((char)ch);
            System.out.println((char)ch);
            ch=fr.read();
        }
        
        fr.close();
        fw.close();
	}
	

}
