package javaontap.Files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try{
            FileWriter writeFile = new FileWriter("D:\\JavaFirst\\src\\javaontap\\Files\\text1  .txt");
            writeFile.write("Hello xin chao moi nguoi");
            writeFile.close();
            System.out.println("Ghi thanh cong");
        }
        catch (IOException e){
            System.out.println("Ghi khong thanh cong" + e.getMessage());
            e.printStackTrace();
        }
    }
}
