package com.company.Multithreading;

public class ThreadImple implements Runnable{
    public static void main(String[]args){

        ThreadImple obj=new ThreadImple();
        for(int i=0;i<=10;i++){
            Thread thread=new Thread(obj);
            thread.setPriority(10);

            thread.start();
        }
        System.out.println("code is running outside thread");
    }
    public void run(){

        System.out.println("Code is running inside thread"+Thread.currentThread().getId()+"\n"+Thread.currentThread().getPriority());
    }
}
