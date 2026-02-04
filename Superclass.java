import java.util.*;
import java.io.*;

class Person{
	String define_me(){
		return "placed in a Good Reputed Company.";
	}
}

class  Women extends Person{
	String define_me(){
		return "a Pre-Final Year Student.";
	}
	
	Women(){
		System.out.println("Hello I am Ponkarthika, I am "+ define_me());

		String temp=super.define_me(); //Fix this line

		System.out.println("My Goal is to  "+ temp );
	}
	
}
class Superclass{
	public static void main(String []args){
		Women w=new Women();
	}
}
