import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int num1, num2, num3, num4, num5;
	    System.out.print("Enter first integer: ");
        num1 = input.nextInt();
        System.out.print("Enter second integer: ");
	    num2 = input.nextInt();
	    System.out.print("Enter third integer: ");
	    num3 = input.nextInt();
	    System.out.print("Enter fourth integer: ");
	    num4 = input.nextInt();
	    System.out.print("Enter fifth integer: ");
	    num5 = input.nextInt();

		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5)
		    System.out.println("Num1 is the largest");
		if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5)
		    System.out.println("Num2 is the largest");
		if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5)
		    System.out.println("Num3 is the largest");
		if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5)
		    System.out.println("Num4 is the largest");
		if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4)
		    System.out.println("Num5 is the largest");

		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5)
		    System.out.println("Num1 is the smallest");
		if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5)
		    System.out.println("Num2 is the smallest");
		if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5)
		    System.out.println("Num3 is the smallest");
		if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5)
		    System.out.println("Num4 is the smallest");
		if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4)
		    System.out.println("Num5 is the smallest");
		int q,r,t,x,y,z;
		/*
		   sume = sum of even
		   sum0 = sum of odd
		   sumo = sum of one digit numbers
		   sumt = sum of two digit numbers
		   sump = sum of postive numbers
		   sumn = sum of negative numbers
		*/
	    int sume,sum0,sumo,sumt,sump,sumn;
		sume = 0;
		sum0 = 0;
		sumo = 0;
		sumt = 0;
		sump = 0;
		sumn = 0;
		x = 0;
		y = 0;
		if (num1 % 2 == 0)
		   { x += 1;
		    sume += num1;}
		else
			y += 1;
		    sum0 += num1;
		if (num2 % 2 == 0)
		    {x += 1;
		    sume += num2;}
		else
			{y += 1;
		    sum0 += num2;}
		if (num3 % 2 == 0)
		    {x += 1;
		    sume += num3;}
		else
			{y += 1;
		    sum0 += num3;}
	    if (num4 % 2 == 0)
		    {x += 1;
		    sume += num4;}
		else
			{y += 1;
		    sum0 += num4;}
		if (num5 % 2 == 0)
		    {x += 1;
            sume += num5;}
		else
			{y += 1;
		    sum0 += num5;}

		z = 0;
		r = 0;
		if (num1 < 10 ^ num1 < -9 ){
		    z += 1;
		    sumo += num1;}
		    else
		        {r +=1;
		        sumt += num1;}

		if (num2 < 10 ^ num2 < -9 ){
		    z += 1;
		    sumo += num2;}
		    else
		        {r +=1;
		        sumt += num2;}
		if (num3 < 10 ^ num3 < -9 ){
		    z += 1;
		    sumo += num3;}
		    else{
		        r +=1;
		        sumt += num3;}
		if (num4 < 10 ^ num4 < -9 ){
		    z += 1;
		    sumo += num4;}
		    else{
		        r +=1;
		        sumt += num4;}
		if (num5 < 10 ^ num5 < -9 ){
		    z += 1;
		    sumo += num5;}
		    else{
		        r +=1;
		        sumt += num5;}
		q = 0;
		t = 0;
		if (num1 < 0){
		    q += 1;
		    sumn += num1;}
		    else{
		        t += 1;
		        sump += num1;}
		if (num2 < 0){
		    q += 1;
		    sumn += num2;}
		    else{
		        t += 1;
		        sump += num2;
		        }
		if (num3 < 0){
		    q += 1;
		    sumn += num3;}
		    else{
		        t += 1;
		        sump += num3;}
		if (num4 < 0)
		    {q += 1;
		    sumn += num4;}
		    else{
		        t += 1;
		        sump += num4;}
		if (num5 < 0)
		 {   q += 1;
		 sumn += num5;}
		    else{
		        t += 1;
		        sump += num5;}



		System.out.println("The amount of numbers that were even: " + x);
		System.out.println("The amount of numbers that were odd: " + y);
        System.out.println("The amount of numbers that are one digit: " + z);
	    System.out.println("The amount of numbers that are two digit: " + r);
	    System.out.println("The amount of numbers that are postive: " + t);
	    System.out.println("The amount of numbers that are negative: " + q);
	    System.out.println("The sum of all even numbers: " + sume);
        System.out.println("The sum of all odd numbers: " + sum0);
        System.out.println("The sum of all one digit numbers: " + sumo);
        System.out.println("The sum of all two digit numbers: " + sumt);
        System.out.println("The sum of all postive numbers: " + sump);
        System.out.println("The sum of all negative numbers: " + sumn);




	}
}
