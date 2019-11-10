package com.fourvisionlab.bytestream;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		String sourceFile ="./sourceFile";
		String destinationFile ="./destinationFile";
		
		ByteStream byteStream = new ByteStream();
		byteStream.copy(sourceFile, destinationFile);
		byteStream.read(destinationFile);
		

	}

}
