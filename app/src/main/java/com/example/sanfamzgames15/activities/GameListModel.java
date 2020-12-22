package com.example.sanfamzgames15.activities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GameListModel {
    @SerializedName("previous")
    private Object previous;

    @SerializedName("next")
    private String next;

    @SerializedName("count")
    private int count;

    @SerializedName("results")
    private List<ItemResults> results;

    public Object getPrevious(){
        return previous;
    }
    public void setPrevious(Object previous){
        this.previous = previous;
    }

    public String getNext(){
        return next;
    }
    public void setNext(String next){
        this.next = next;
    }



    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count = count;
    }

    public List<ItemResults> getResults(){
        return results;
    }
    public void setResults(List<ItemResults> results){
        this.results = results;
    }



    @Override
    public String toString(){
        return
                "GameListModel{" +
                        "previous = '" + previous + '\'' +
                        ",next = '" + next + '\'' +
                        ",count = '" + count + '\'' +
                        ",results = '" + results + '\'' +
                        "}";
    }
}

