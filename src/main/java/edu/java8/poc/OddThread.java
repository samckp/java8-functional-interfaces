package edu.java8.poc;

public class OddThread {

    public static void main(String[] args)   {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for(int i=1;i<100;i+=2){
                    System.out.println(i);

                        notify();
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for(int i=0;i<100;i+=2){
                    System.out.println(i);
                    notify();

                }
            }
        };


        t1.start();

        t2.start();


    }
}
