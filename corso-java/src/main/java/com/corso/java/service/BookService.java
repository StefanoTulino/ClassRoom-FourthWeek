package com.corso.java.service;



public interface BookService {

    void updateTitle(String nam,String value);
    void updateAuthor(String author,String value);
    void updatePage(Integer nam,Integer value);
    void updateCost(Double cost,Double value);
}
