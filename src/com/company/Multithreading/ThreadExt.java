package com.company.Multithreading;

public class ThreadExt extends Thread{
    public static void main(String[] args) {

        ThreadExt thread=new ThreadExt();
        thread.start();
        System.out.println("Code is outside of the thread");
    }
    public void run(){
        System.out.println("Code is running inside thread");
    }

}
