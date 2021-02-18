package de.hw7.data;

import javax.sound.midi.Soundbank;

public class Book {
    private String name;
    private String author;
    private boolean feedback;
    private int pages;
    private double rating;
    private int pubYear;
    private boolean inStock;
    private String cover;

    public Book(String name, String author, boolean feedback, double rating, int pages) {  //This is constructor
        this.name = name;
        this.author = author;
        this.feedback = feedback;
        this.pages = pages;
        this.rating = rating;
        this.pages=pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setFeedback(boolean feedback) {
        this.feedback = feedback;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isFeedback() {
        return feedback;
    }

    public int getPages() {
        return pages;
    }

    public double getRating() {
        return rating;
    }

    public int getPubYear() {
        return pubYear;
    }

    public boolean isInStock() {
        return inStock;
    }

    public String getCover() {
        return cover;
    }


}


