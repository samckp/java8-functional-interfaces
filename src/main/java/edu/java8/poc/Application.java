package edu.java8.poc;

@FunctionalInterface
interface Greet
{
	public void m1();
}
@FunctionalInterface
interface Addition{
	public void add(int a, int b);
}

public class Application {

	public static void main(String[] args) {

		Greet t = ()-> System.out.println("Hello interface !!");
		t.m1();

		Addition addition = ( a,  b)->System.out.println("add =" + (a + b));
		addition.add(5, 6);

	}
}
