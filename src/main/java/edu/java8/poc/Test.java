package edu.java8.poc;

class Test1{
    void msg()throws Exception {            //Narrowing is allowed in Overriding concept
        System.out.println("parent method");
    }
}

public class Test extends Test1 {

    void msg() throws ArithmeticException {

        System.out.println("child method");
    }

    public static void main(String args[]) {
        Test1 p = new Test();
        try {
            p.msg();
        } catch (Exception e) {
        }
    }
}
