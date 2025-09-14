package test.quanlysanpham;
import test.QuanLySinhVien.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
public class QuanLySoLuong{
    private ArrayList<Sanpham> sanphams = new ArrayList();

    //Thêm sản phẩm
    public void themSP(Sanpham sp){
        sanphams.add(sp);
    }

    //Hiển thị danh sách sản phẩm
    public void hienThiSP(){
        if (sanphams.isEmpty()){
            System.out.println("Danh sách rỗng");
            return;
        }
        for (Sanpham sp : sanphams){
            System.out.println(sp);
        }
    }

    //Tìm sản phẩm theo id

    public void timSPTheoID(int maSP) {
        boolean found = false;
        for(Sanpham sp : sanphams){
            if(sp.getMaSP() == maSP){
                System.out.println(sp);
                found = true;
            }
        }
        if(!found){
            System.out.println("Không tìm thấy sản phẩm");
        }
    }

    //Xóa sản phẩm theo ID

    public void xoaSPtheoID(int maSP) {
        Sanpham toRemove = null;
        for (Sanpham sp : sanphams) {
            if (sp.getMaSP() == maSP) {
                toRemove = sp;
                break;
            }
        }
        if (toRemove != null) {
            sanphams.remove(toRemove);
            System.out.println("Đã xóa sản phẩm có mã sản phẩm là: " + maSP);
        } else {
            System.out.println("Không tìm thấy mã sản phẩm này này.");
        }
    }

    //Xếp theo tên sản phẩm
    public void xepTheoTen() {
        sanphams.sort(Comparator.comparing(Sanpham::getTenSp));
        System.out.println("Đã sắp xếp theo tên.");
    }

    public void saveToFile(String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Sanpham sp : sanphams) {
                bw.write(sp.getMaSP() + "," + sp.getTenSp() + "," + sp.getGiaThanh() + "," + sp.getSoLuongSP());
                bw.newLine();
            }
            System.out.println("Đã lưu vào file " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void loadFromFile(String filename) {
        sanphams.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                if (arr.length == 5) {
                    int maSP = Integer.parseInt(arr[0]);
                    String tenSp = arr[1];
                    double giaThanh = Integer.parseInt(arr[2]);
                    int soLuongSP = Integer.parseInt(arr[3]);

                    sanphams.add(new Sanpham(maSP, tenSp, giaThanh, soLuongSP));
                }
            }
            System.out.println("Đã load dữ liệu từ file.");
        } catch (IOException e) {
            System.out.println("Không tìm thấy file, bắt đầu danh sách trống.");
        }
    }
}
