package javaontap.Files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File newfile = new File("D:\\JavaFirst\\src\\javaontap\\Files\\text.txt");

        if(newfile.delete()){
            System.out.println("Da xoa " + newfile.getName());
        }
        else{
            System.out.println("Khong tim thay de xoa");

        }
    }

}
