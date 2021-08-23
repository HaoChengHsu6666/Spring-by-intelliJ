package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HpPrinter implements Printer{

//    @Value("${printer.name}")
//    private  String name;
//
//    @Value("${printer.count}")
//    private int count;

    //設定檔無key-value時可預設的寫法，若設定檔有值則以設定檔的值為主
//    @Value("${printer.color:black}")
//    private String color;

//    @PostConstruct
//    public void init(){
//        count = 5;
//    }

    @Override
    public void print(String message){

        //count--;
        System.out.println("HP印表機: " +message);
//        System.out.println(name + ": " + message);
//        System.out.println("剩餘使用次數:" + count);
//        System.out.println("印表機顏色為:" + color);
    }
}
