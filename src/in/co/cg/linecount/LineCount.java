package in.co.cg.linecount;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.io.LineNumberReader;
import java.util.Scanner;

//class to count number of lines in a file
public class LineCount {
	public static void main(String[] args) throws IOException {
		Scanner get = new Scanner(System.in);
		String path;
		System.out.println("Enter file path");
		path = get.next();// file path
		File file = new File(path);// passing path to file
		FileReader fileReader = new FileReader(path);// passing path to fileReader
		LineNumberReader lineNumberReader;// LineNumberReader reference

		if (file.exists() && !file.isDirectory()) {
			lineNumberReader = new LineNumberReader(fileReader);// LineNumberReader instance
			while ((lineNumberReader.readLine() != null))
				; // counting number of lines
			System.out.println("Number of lines in file are: " + lineNumberReader.getLineNumber());

		} else {
			System.out.println("File does'nt Exist!!");
		}

		get.close();
		fileReader.close();
	}
}
