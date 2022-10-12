package bai1;

import java.util.Comparator;
import java.util.Scanner;

public class Product implements Comparator<Product> {
    private String productName;
    private int productId;
    private int productprice;

    public Product() {
    }

    public Product(String productName, int productId, int productprice) {
        this.productName = productName;
        this.productId = productId;
        this.productprice = productprice;
    }

    public int getProductprice() {
        return productprice;
    }

    public void setProductprice(int productprice) {
        this.productprice = productprice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void inputData(Scanner sc){
        System.out.println("nhap id san pham");
        this.productId=Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten san pham");
        this.productName=sc.nextLine();
        System.out.println("nhap gia san pham");
        this.productprice=Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return
                "productName='" + productName + '\'' +
                ", productId=" + productId +
                ", productprice=" + productprice
                ;
    }

    @Override
    public int compare(Product o1, Product o2) {
        return 0;
    }
}
