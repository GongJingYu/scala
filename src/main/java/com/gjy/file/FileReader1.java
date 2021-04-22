package com.gjy.file;

import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader1 {
    
    @Test
    public void testFiles() throws Exception{
        BufferedWriter bw = Files.newBufferedWriter(Paths.get("src/main/resources/file2.txt"));
        bw.write("nihao");
        bw.flush();
    }

    @Test
    public void testPrintWriter() throws Exception{
        File inFile = new File("src/main/resources/null.txt");
        File outFile = new File("src/main/resources/file2.txt");
        BufferedReader br = new BufferedReader(new FileReader(inFile));
        PrintWriter printWriter = new PrintWriter(outFile);
        String line = "";
        while ((line = br.readLine()) != null){
//            printWriter.write(line);
//            printWriter.write("\n");
            printWriter.println(line);
        }
        printWriter.flush();
    }

    @Test
    public void testBufferedWriter() throws Exception{
        File file = new File("src/main/resources/file2.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);

        FileWriter fw = new FileWriter("src/main/resources/file11.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String line = null;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
        }
        bw.flush();
    }

    @Test
    public void testFileWriter() throws Exception{
        File file = new File("src/main/resources/file2.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);

        FileWriter fw = new FileWriter("src/main/resources/file11.txt");

        String line = null;
        while ((line = br.readLine()) != null){
            fw.write(line);
            fw.write("\n");
        }
        fw.flush();

        fw.close();
        br.close();
        fileReader.close();
    }

    @Test
    public void testFileInputStream() throws Exception{
        File file = new File("src/main/resources/file1.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("src/main/resources/file11.txt")));
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = bis.read()) != -1){
            bos.write(buffer,0,len);
        }
        bos.flush();
        bos.close();
        bis.close();
    }

    @Test
    public void testFileReader() throws Exception{
        File file = new File("src/main/resources/file1.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
    }
}
