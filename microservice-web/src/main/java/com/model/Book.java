package com.model;

/**
 * Book
 *
 * @author wutaotao
 * @version 2019/5/6 9:50
 */
public class Book {

    private String author;
    private String title;
    private String url;

    public Book() {
    }

    public Book(String author, String title, String url) {
        this.author = author;
        this.title = title;
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
