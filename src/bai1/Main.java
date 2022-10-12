package bai1;

import bai1.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static ArrayList<Product> productArrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("***************Menu*****************");
            System.out.println("1. Them moi san pham");
            System.out.println("2.Hien thi thong tin san pham");
            System.out.println("3. Sua thong tin theo id");
            System.out.println("4.Xoa san pham theo id");
            System.out.println("5.tim kiem san pham theo ten");
            System.out.println("6.Sap xep san pham theo gia tang dan");
            System.out.println("7.Sap xem san pham theo gia giam dan");
            System.out.println("8.Thoat");
            System.out.println("lua chon cua ban la: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    inputproduct(sc);
                    break;
                case 2:
                    showlistproduct();
                    break;
                case 3:
                    editproduct(sc);
                    break;
                case 4:
                    deleteproduct(sc);
                    break;
                case 5:
                    searchProduct(sc);
                    break;
                case 6:
                    arrangeUp();
                    break;
                case 7:
                    arrangedown();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("vui long chon tu 1 den 8");
            }
        } while (true);
    }

    public static void inputproduct(Scanner sc) {
        System.out.println("nhap so luong san pham muon them: ");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number; i++) {
            Product product = new Product();
            product.inputData(sc);
            productArrayList.add(product);
            System.out.println("them thanh cong");
        }
    }

    public static void showlistproduct() {
        for (Product product : productArrayList) {
            System.out.println(product.toString());
            System.out.println("");
        }
    }

    public static void editproduct(Scanner sc) {
        System.out.println("nhap id san pham muon sua");
        int inutID=Integer.parseInt(sc.nextLine());
        for (Product product : productArrayList) {
            if (product.getProductId()==inutID){
                product.inputData(sc);
            }else {
                System.out.println("id khong ton tai");
            }
        }
    }
    public static void deleteproduct(Scanner sc){
        if (productArrayList.size()!=0){
            System.out.println("nhap id san pham muon xoa");
            int inutID=Integer.parseInt(sc.nextLine());
            for (Product product : productArrayList) {
                if (product.getProductId()==inutID){
//               int indexproduct= productArrayList.indexOf(product);
                    productArrayList.remove(product);
                    System.out.println("xoa thanh cong");
                    break;
                }
            }
        }else {
            System.out.println("danh sach trong!");
        }

    }
    public static void searchProduct(Scanner sc){
        System.out.println("nhap ten san pham muon tim kiem");
        String inputName=sc.nextLine();
        for (Product product : productArrayList) {
            if (product.getProductName().equals(inputName)){
                product.toString();
            }else {
                System.out.println("ten khong ton tai");
            }
        }
    }
    public static void arrangeUp(){
        Collections.sort(productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                    return o1.getProductprice()- o2.getProductprice();
            }
        });
    }
    public static void arrangedown(){
        Collections.sort(productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return(1 - (o1.getProductprice()- o2.getProductprice()));
            }
        });
    }
}