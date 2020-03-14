package com.company;

public class Custom1 {
    private int skd;
    private String title;
    private String describe;
    private String avatar;
    private String mainContent;
    private String author;
    private int date;

    public Custom1(int skd, String title, String describe, String avatar, String mainContent, String author, int date) {
        this.skd = skd;
        this.title = title;
        this.describe = describe;
        this.avatar = avatar;
        this.mainContent = mainContent;
        this.author = author;
        this.date = date;
    }

    public Custom1() {

    }

    public int getSkd() {
        return skd;
    }

    public String getTitle() {
        return title;
    }

    public String getDescribe() {
        return describe;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getMainContent() {
        return mainContent;
    }

    public String getAuthor() {
        return author;
    }

    public int getDate() {
        return date;
    }

    public void setSkd(int skd) {
        this.skd = skd;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setMainContent(String mainContent) {
        this.mainContent = mainContent;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
