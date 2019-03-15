package studyJava;

import java.io.*;

public class IODemo {
	public static void main(String[] args) throws IOException {
		File file = new File("D://data//1.txt");
		System.out.println(file.exists());
		System.out.println(file.toPath());
		System.out.println(file.canWrite());
		System.out.println(file.isDirectory());
		System.out.println(file.isAbsolute());
		
		RandomAccessFile file2 = new RandomAccessFile(file, "r");
		file2.seek(12);
		
		InputStream stream = new FileInputStream(file);
		byte[] buffer = new byte[1024];
		stream.read(buffer, 0, 1020);
		
		char[] buff = new char[20];
		InputStreamReader reader = new InputStreamReader(System.in);
		reader.read(buff, 0, 20);
		reader.close();
		
		BufferedInputStream bs = new BufferedInputStream(System.in);
		bs.read(buffer);
		
		InputStreamReader reader2 = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader2);
		String str = br.readLine();
		
		PrintWriter printer = new PrintWriter(System.out);
		printer.println(str);
		printer.close();
	}
}
