package com.thebooksmart.booksmart;

public class ListItem {

    private String bizImg;
    private String availBiz;
    private String availBizDetail;
    private String viewPackage;

    public ListItem(String bizImg, String availBiz, String availBizDetail, String viewPackage) {
        this.bizImg = bizImg;
        this.availBiz = availBiz;
        this.availBizDetail = availBizDetail;
        this.viewPackage = viewPackage;
    }

    public String getBizImg() {
        return bizImg;
    }

    public void setBizImg(String bizImg) {
        this.bizImg = bizImg;
    }

    public String getAvailBiz() {
        return availBiz;
    }

    public void setAvailBiz(String availBiz) {
        this.availBiz = availBiz;
    }

    public String getViewPackage() {
        return viewPackage;
    }

    public void setViewPackage(String viewPackage) {
        this.viewPackage = viewPackage;
    }
}

