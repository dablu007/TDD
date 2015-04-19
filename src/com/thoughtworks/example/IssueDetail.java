package com.thoughtworks.example;

public class IssueDetail {
    private Book book;
    private String nameOfCustomer;

    public IssueDetail(Book book, String nameOfCustomer) {

        this.book = book;
        this.nameOfCustomer = nameOfCustomer;
    }
}
