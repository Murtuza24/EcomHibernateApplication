package com.hib.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ProductID")
    private int ProductID;

    @Column(name="ProductSKU")
    private int ProductSKU;

    @Column(name = "ProductName")
    private String ProductName;

    @Column(name = "ProductPrice")
    private float ProductPrice;

    @Column(name = "ProductWeight")
    private float ProductWeight;

    @Column(name = "ProductCartDesc")
    private String ProductCartDesc;

    @Column(name = "ProductShortDesc")
    private String ProductShortDesc;

    @Column(name = "ProductLongDesc")
    private String ProductLongDesc;

    @Column(name = "ProductThumb")
    private String ProductThumb;

    @Column(name = "ProductImage")
    private String ProductImage;

    @Column(name = "ProductCategoryID")
    private int ProductCategoryID;

    @Column(name = "ProductUpdateDate")
    private Timestamp ProductUpdateDate;

    @Column(name = "ProductStock")
    private float ProductStock;

    @Column(name = "ProductLive")
    private int ProductLive;

    @Column(name = "ProductUnlimited")
    private int ProductUnlimited;

    @Column(name ="ProductLocation")
    private String ProductLocation;

    public Product() {

    }


    public Product(int productID, int productSKU, String productName, float productPrice, float productWeight,
                   String productCartDesc, String productShortDesc, String productLongDesc,
                   String productThumb, String productImage, int productCategoryID, Timestamp productUpdateDate,
                   float productStock, int productLive, int productUnlimited, String productLocation) {
        ProductID = productID;
        ProductSKU = productSKU;
        ProductName = productName;
        ProductPrice = productPrice;
        ProductWeight = productWeight;
        ProductCartDesc = productCartDesc;
        ProductShortDesc = productShortDesc;
        ProductLongDesc = productLongDesc;
        ProductThumb = productThumb;
        ProductImage = productImage;
        ProductCategoryID = productCategoryID;
        ProductUpdateDate = productUpdateDate;
        ProductStock = productStock;
        ProductLive = productLive;
        ProductUnlimited = productUnlimited;
        ProductLocation = productLocation;
    }


    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getProductSKU() {
        return ProductSKU;
    }

    public void setProductSKU(int productSKU) {
        ProductSKU = productSKU;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public float getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(float productPrice) {
        ProductPrice = productPrice;
    }

    public float getProductWeight() {
        return ProductWeight;
    }

    public void setProductWeight(float productWeight) {
        ProductWeight = productWeight;
    }

    public String getProductCartDesc() {
        return ProductCartDesc;
    }

    public void setProductCartDesc(String productCartDesc) {
        ProductCartDesc = productCartDesc;
    }

    public String getProductShortDesc() {
        return ProductShortDesc;
    }

    public void setProductShortDesc(String productShortDesc) {
        ProductShortDesc = productShortDesc;
    }

    public String getProductLongDesc() {
        return ProductLongDesc;
    }

    public void setProductLongDesc(String productLongDesc) {
        ProductLongDesc = productLongDesc;
    }

    public String getProductThumb() {
        return ProductThumb;
    }

    public void setProductThumb(String productThumb) {
        ProductThumb = productThumb;
    }

    public String getProductImage() {
        return ProductImage;
    }

    public void setProductImage(String productImage) {
        ProductImage = productImage;
    }

    public int getProductCategoryID() {
        return ProductCategoryID;
    }

    public void setProductCategoryID(int productCategoryID) {
        ProductCategoryID = productCategoryID;
    }

    public Timestamp getProductUpdateDate() {
        return ProductUpdateDate;
    }

    public void setProductUpdateDate(Timestamp productUpdateDate) {
        ProductUpdateDate = productUpdateDate;
    }

    public float getProductStock() {
        return ProductStock;
    }

    public void setProductStock(float productStock) {
        ProductStock = productStock;
    }

    public int getProductLive() {
        return ProductLive;
    }

    public void setProductLive(int productLive) {
        ProductLive = productLive;
    }

    public int getProductUnlimited() {
        return ProductUnlimited;
    }

    public void setProductUnlimited(int productUnlimited) {
        ProductUnlimited = productUnlimited;
    }

    public String getProductLocation() {
        return ProductLocation;
    }

    public void setProductLocation(String productLocation) {
        ProductLocation = productLocation;
    }

}
