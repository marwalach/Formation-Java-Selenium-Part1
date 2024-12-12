package Initialisation;

import java.util.Scanner;

public class CalculeSomme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//Calcul();
		//Sold();
		Factorielle();
	}
	
	
	public static Void Calcul(){
		
		//declaration 
		int a,b,c;
		
		Scanner Clavier = new Scanner(System.in);
		
		System.out.println("veuilez saisir a");
		a= Clavier.nextInt();
		System.out.println("veuilez saisir b");
		b= Clavier.nextInt();
		Clavier.close();
		c=a+b;
		System.out.println("La somme de "+a+" plus "+b+" est : "+c);
		return null;
		}

public static void Sold() {
	float t;
	int p1;
	Scanner clavier = new Scanner(System.in);
	System.out.println("veuilez saisir p1");
	p1= clavier.nextInt();
	System.out.println("veuilez saisir t");
	t= clavier.nextFloat();
	clavier.close();
	if (t==1) {
		p1=p1-((p1*20)/100);
		System.out.println("le prix est soldé de 20%    :"+p1);
		
	}
	else if (t==2) {
		p1=p1-((p1*40)/100);
		System.out.println("le prix est soldé de 40%    :"+p1);
		
	}
	else if (t==3) {
		p1=p1-((p1*60)/100);
		System.out.println("le prix est soldé de 60%    :"+p1);
		
	}
	else 
		System.out.println("cet article n'est pas soldé");
	
}

public static void Factorielle() {
	int a,i,f;
	Scanner Clavier = new Scanner(System.in);
	
	System.out.println("veuilez saisir a");
	a= Clavier.nextInt();
	Clavier.close();
	if (a<0)
	{
		System.out.println("ERROR  a ne peut pas etres négatif!!!!!!");
	}
	else {
	f=1;
	for(i=1;i<=a;i++)
	{
	f=f*i;
	}
	System.out.println("Le Factorielle de   "+a+"  est  : "+f);
}

}
}
