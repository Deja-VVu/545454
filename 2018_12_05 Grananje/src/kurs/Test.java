package kurs;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner in = new Scanner(System.in);
		
		// ctrl space import
		// in je tipa skener
		// sve objekte moramo sa new da kreiramo
		// antonim system in i out moze kasnije umesto toga fajl
		
		
		int n =in.nextInt();
		in.close(); // nakon svakog ucitavanja treba da se stvori navika zbog fajlova uvrstiti nit
		
		// sugestina uz next tj lista izlazi
		
		// radice bez syso nakon run cekace unos i sa crvenom ikonicom videmo
		
		System.out.println("n ="+n);
		// outcome n =5
		
		// ako unesemo nesto sto nije int decimala pucice
		// tj pokazace exception i to ne sme da se desi
		//sustina je obraditi problem  ili barem ukazati korisniku gresku sa exceptionima try i catch
		// dozvolice kasnije da ga primetimo 
		
		// napismeno moramo da znamo izlaz
		
		// ako ne znamo da damo primer onda ne znamo koji je problem
		
		// testiranje programa 
		
		
		// uneti broj a da mi znamo da je trocifreni broj
		
		
		
		
		
		
		//Grananje Boolean
		
		
		//boolean b=true;
		boolean b= n >= 2;
		
		
		// uz operatore > < itd pravimo upit
		
		System.out.println("b = " + b);
		
		// outcome moze true ili false da bude u zavisnosti od uslova
		// vise uslova naziva se blok naredbi
		//if(uslov)
//		if (b)
//		//naredba;
//		System.out.println("Jeste vece ili jednako 2");
//		System.out.println("kraj");
	
		
		// ukoliko je true izvrsice se ove ukoliko nije onda ce samo kraj
		
		
		
		
		//if (b)
		if (n>=2)
		
		{
			System.out.println("Jeste vece ili jednako 2");
		    System.out.println("Jos jedna naredba");
		}
		// ovo je jednostavniji vid grananja
		// ici cu na utakmicu ako mi jedan od roditelja da pare 
		// T i netacno matematicka logika
		// ako nesto pripada zagradama npr pyton trazi da bude uvucen ekspicitno ako nesto pripada necemo
		// ako je sve u 1 liniji nije pregledno tesko je za prepoznavanje
		// ali ako je ucuceno onda je dobro
		// ovo je jednostavniji primer
		//svaki programer treba da prodje matematicku logiku povezano za nacine razmisljanja i zakljucivanje
		// htei da ne znate nismo jos radili petlju promeniti boju boundary value analysis black box test design techniques white box testing kombinatorika sta jos bese khan academy neki test?interagujemo 
		// veznici veznik i
		System.out.println("kraj");
		
		// && - i , || - ili ! - ne
		if (n >= 1&& n <=10)
		System.out.println("Pripada");
		// manje od desne i leve granice
		
		
		
		// Da li n pripada intervalu (-inf , 1 ) U - unija (10,+inf)
		//if(n < 1 || n > 10) // ne && da li je neko pobedio 1 ili drugu utakmicu
		if ((n >= 1 && n<=10)) 
		System.out.println("Pripada 2");
		// zdrava logika ne zalicite se
		//De Morganov zakon kad imamo ne ispred a i b to prelazi u ne a ili ne b
		// nekad je lakse napraviti suprotan uslov za nesto
		
		
		
		
		
		
		//////////////////////////////////////////////////////////
		System.out.println("****************************");
		// da li je n paran ili neparan nemamo funkciju za to ali mozemo da
		// imamo neparan ostatak pri deljenju sa 2 mu je 0
		
		if (n % 2 == 0)
		System.out.println("Paran");
		else
		//if (n % 2 == 1) umesto toga else
		System.out.println("Neparan");
		
		
		
		
		
		
		
//		if ()
//		{
//		
//        }
//else if ()
//{
//	
//}
//		
//else if ()
//{
//	
//}
//else	
//{
//}	
		
		// kako naci max(n,m,k)
		
		//n=15;
		int m =25;
		int k=30;
		int max;
		
//		if (n >m)
//		max = n;
//		else
//			max=m;
//		System.out.println("max =" + max);
		
		
//		if (m >k && m > n)
//		max = m;
//		else if (n>k && n>m)
//			max = n;
//		else
//			max = k;
//		System.out.println("max" + max);
		
		
		max = n;
		if(m > max)
		max = m;
		if(k>max)
		max =k;
		System.out.println("max" + max);
		
		// terazija naci najvecu jabuku meri prve dve koja je veca ostaje suprotno ako zelite min
		// max ostaje 30 do kraja 
		
		
		
		
		
		
		
		
	
	// else mozemo samo 1 put da imamo a else if koliko god zelimo

		// cak iako je prvi else if tacan nastavice dalje tj postavice svakom pitanje da li je zelena boja itd
		// else iskljucuje ostale stvari
		// if operacija je skupa za racunar
		// skuplja od operacija sabiranja itd
		// vise stvari se vrti ispod haube takoreci
		//u najgorem slucaju ako imamo 5 upita i 6 else u najgorem slucaju pitace 5 puta
		
		// break je uzasna naredba uglavnom za switch ima smisla i switch je beskoristan 
		// u if funkcionise kao zagrada }
		
		
		
		// nece run proveriti na git
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
