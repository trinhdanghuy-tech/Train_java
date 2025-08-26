package javaontap.Files;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File myObj = new File("D:\\JavaFirst\\src\\javaontap\\Files\\text.txt");
        if(myObj.exists()) {
            System.out.println("File name " + myObj.getName());
            System.out.println("Absolute path " + myObj.getAbsolutePath());
            System.out.println("Writable:" + myObj.canWrite());
            System.out.println("Readable:" + myObj.canRead());
            System.out.println("File size in byte :" + myObj.length());
        } else {
            System.out.println("File does not exist");
        }
    }
}
