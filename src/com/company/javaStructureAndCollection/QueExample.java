package com.company.javaStructureAndCollection;

import java.util.Queue;


public class QueExample {
        int queueLength = 3;
        int items[] = new int[queueLength];
        int front = -1;
        int rear = -1;

        boolean isFull(){
            if(rear == queueLength - 1){
                return true;
            } else {
                return false;
            }
        }

        boolean isEmpty(){
            if(front == -1 && rear == -1){
                return true;
            } else {
                return false;
            }
        }



        void enQueue(int itemValue) {
            if(isFull()){
                System.out.println("Queue is full");
            } else if(front == -1 && rear == -1){
                front = rear = 0;
                items[rear] = itemValue;
            } else{
                rear++;
                items[rear] = itemValue;
            }
        }

        void deQueue(){
            if(isEmpty()){
                System.out.println("Queue is empty. Nothing to dequeue");
            } else if (front == rear){
                front = rear = -1;
            } else {
                front++;
            }
        }

        void display(){
            int i;

            if(isEmpty()){
                System.out.println("Queue is empty");
            } else {
                for(i = front; i <= rear; i++){
                    System.out.println(items[i]);
                }
            }
        }

        void peak(){
            System.out.println("Front value is: " + items[front]);
        }


        public static void main(String[] args) {
            QueExample que = new QueExample();

            que.enQueue(3);
            que.enQueue(2);
            que.enQueue(1);


            que.display();

            que.peak();

        }

    }
