package com.fourvisionlab.bytestream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author fourvisionlab
 *
 */
public class ByteStream {

	/**
	 * Copy file content from one file to another file
	 * 
	 * @param sourceFile      - the file holding the content to be copied
	 * @param destinationFile - the file receiving copied content
	 * @throws IOException ( we will let the main function of ( Test class) to
	 *                     handle the exception)
	 */
	public void copy(String sourceFile, String destinationFile) throws IOException {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {

			fis = new FileInputStream(sourceFile);// holds source file content
			fos = new FileOutputStream(destinationFile);// holds destination file content
			int data = 0;// will store each byte we read from source file

			// -1 indicates end of file
			while ((data = fis.read()) != -1) {

				fos.write(data);
			}
		} finally {

			if (fis != null)
				fis.close();
			if (fos != null)
				fos.close();
		}

	}
	// end of copy method

	/**
	 * Print file content
	 * 
	 * @param file - to read
	 * @throws IOException
	 */
	public void read(String file) throws IOException {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);// holds source file content
			int data = 0;

			// -1 indicates end of file
			while ((data = fis.read()) != -1) {

				// convert to char before printing it
				char content = (char) data;

				System.out.print(content);
			}

		} finally {
			if (fis != null)
				fis.close();
		}
	}
	// end of read method
}
// ByteStream class
