package inflearn;

import java.util.Scanner;

class Addee{

    int a;
    int b;

    public Addee(int c,int d) {
        this.a = c;
        this.b = d;
    }


    public void add() {
        System.out.println(a+b);
    }


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}

}



public class Addtest {

    public static void main(String[] args) { 
        // TODO Auto-generated method stu

        int v;
        int m;

        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        m = sc.nextInt();
        Addee n = new Addee(v,m);

        System.out.println(n.a);
        System.out.println(n.b);

        n.add();
    }

}