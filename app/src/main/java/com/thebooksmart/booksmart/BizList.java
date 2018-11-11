package com.thebooksmart.booksmart;

public class BizList {

    private String Name;
    private String Details;
    private String Products;
    private String Keyword;

    public BizList() {
    }

    public BizList(String name, String details, String products, String keyword) {
        Name = name;
        Details = details;
        Products = products;
        Keyword = keyword;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public String getProducts() {
        return Products;
    }

    public void setProducts(String products) {
        Products = products;
    }

    public String getKeyword() {
        return Keyword;
    }

    public void setKeyword(String keyword) {
        Keyword = keyword;
    }
}
