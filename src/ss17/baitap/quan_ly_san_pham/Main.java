package ss17.baitap.quan_ly_san_pham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProductManager> productManagers = new ArrayList<>();
        productManagers.add( new ProductManager(1,"AAA","local",123,"..."));
        productManagers.add( new ProductManager(2,"BBB","local",123,"..."));
        productManagers.add( new ProductManager(3,"CCC","local",123,"..."));
        productManagers.add( new ProductManager(4,"DDD","local",123,"..."));
        productManagers.add( new ProductManager(5,"EEE","local",123,"..."));
        File file = new File("src/ss17/baitap/quan_ly_san_pham/Product.csv");
        ObjectOutputStream objectOutputStream = null ;
        try {
            FileOutputStream fileOutputStream =new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productManagers);
        }catch (FileNotFoundException e){
            System.out.println("file không tìm thấy");
        }catch (IOException e) {
            System.out.println("lỗi ghi file ");
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                System.out.println("Lỗi đóng file");
            }
        }
    }
}

