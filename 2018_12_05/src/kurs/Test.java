package kurs;

public class Test 
{
	// nova navika za zagrade preglednije

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		
		// funkcija main interesuje nas samo sta se nalazi unutar nje pocetak i kraj sveta odnosno izvrsavanja sa play
		//imamo problem i treba da umesimo tortu i ne znamo kako
		//ako je recept dobor definisan znacemo
		//odukativni recepti ne pomazu
		//algoritam je strogo definisan za resavanje
		
		//postoje vise tipova algoritama
		//linijski algoritmi = imaju pocetak ulaz sa pravoguaonicama za izvrsavanje
		// kraj i izlaz
		//kljuc programiranje je dati podatak i dobiti neku informaciju
		// flow chart pokazuje redom linijsko izvrsavanje 1 po 1 naredba
		//2 tip razgranati oni menjaju strukturu mogu levo i desno da idu u zavisnosti od situacije npr stavite maslac a ako nemate stavite nesto drugo itd
		//fleksibilan je ima razlicite puteve sestougao u kome se nalazi upit u zavisnosti da li je tacan zavisi da li ce da nastavi / da ne putevi
		//uglavnom se u pocetku prica samo od jednom zajednickom kraju a ne o razlicitim putevima
		
		//3 tip ciklicni algoritmi neki deo programa se ponavlja vise pta 2 nacina upit ili uradi ovo komandu vise puta
		//i u upitu dok je tacno vracaj se gore ako nije nastavi dole
		
		//ovo je glavni deo programiranja
		// posle toga zaista postaje lakse dok ne stignete do oop pa preswichujete mozak 
		// ali bez algoritama nema programiranja
		
		// prva stvar potreban nam je prostor u memoriji a imenujemo taj deo varijablama
		// hard disk nije memorija u ovom slucaju ram je mesto gde se cuvaju podaci
		//moramo da imamo tip promenljive i imamo vise tipova zbog velicine memorije tj bajtova
		//podatke o studentu to zauzima visa
		// java je strogo tipiziran jezik
		//ruby php swift nisu tipizirani
		//promenljiva ne zna se kojeg je tipa uglavnog su script jezici nemaju compiler itd
		//svaka promenljiva ili tip ima svoje mogucnosti
		//osnovni tipovi celi i realni brojevi i slozeni tipovi nizovi stringovi objekti i klase
		//svaka promenljiva ima svoje ponasanje? kako interaguje? sa drugim tipovima
		
		//kompajler mora da zna sta je kog tipa
		
		// osnovni tipovi su
		
		//celi brojevi int
		//realni float double koja je razlika? vise decimala u vecini float je potrebniji double profesor koristi nekad 12 decimala potrebna uglavnom se bavi numeracijom
		//nakon 8 decimale nije bitno tako da double nam nece trebati
		//boolean bulin true false samo 2 vrednosti
		//char znakovni tip 
		//ucitavanje necemo vec od neke zavisnosti ulaza
		//jer u realnosti..
		
		//operacije + - itd kad racunamo 2 tipa int i double 5/3 na kraju dobijamo realan broj   morao je da uci na tezi nacin hmm sta je naucio hmm // cim podelite nesto sto je vece dobijate 0
		// napravio je simulaciju koji je imao katastrofalne rezultate
		// dobro vezba je pogledati problem i predvideti gresku ili resenje
		
		
		
		
		
		// pitati profesora za oblasti matematike koji su presudni za programiranje da provezbam kombinatorima itd?
		
		
		//int c = 5;
		//int d= 3;
		
		
		//double a = (double)c/d; // c se pretvori u realan broj podel se sa vrednoscu d u procesoru osnovni tipovi se nikad ne menjaju ako se nalaze nakon = jedini je nacin je dodeliti nesto ovako samo kopiramo 
		
		//double a = 1.0*c /d; // jos jedno resenje realan broj puta ceo broj
		
		double a = (double)5/3; // dodato double // dobijena 1/6 ako dodamo d na 3 onda ce 3 da bude double // ako imamo konstante mozemo da stavimo 5.0 i resen je problem
		//
		System.out.println(a);
		
		// rezultan 1.0 nije tacan
		// kada vrsimo operaciju istig tipova uvek dobijamo taj rezultat
		// ali ako zelimo da dodelimo u double int
		// nema nikakav problem
		//nema gubljenja podataka
		//jednakost nije matematicka vec operator dodele izracuna 5/3 spakuje je u promenljivu a tj kopira ga primenljive se uvek kopiraju
		//ako zelimo int u double ne mozemo int u double dobijamo compile gresku
		//castovanje je prebacivanje iz tipa u tip
		//castovanje prevodjenje iz 1 tipa u drugom
		// on radi unutrasnje kastovanje prelazenje iz uzeg u sire ali suprotno ne moze da ide automatski vec mora cast
		//mozda parse? manual ili autocast?
		
		
		int x = (int)2.5;
		//Double x = 2.5; kako bese preko helper klase
		System.out.println(x);
		
		
		
		// % ostatak ljudi tesko ljudi prihvataju jer nakon 5 nisu radili
		
		
		// k % n = { 0,1,2,..... n-1 } korisna stvari za neku klasifikaciju?
		
		// pravimo klase odredjenih elemenata odvojimo parne od neparnih brojeva ako npr znamo da je prvi dan u mesecu ponedeljak 1 2 itd u mesecu ima neki k broj koji je to dan ostatak sa deljenju sa 7 + 1
		//k%7+1 
		// drugi nacin gde se koristi kako izdvojiti poslednju cifru iz celog broja
		
		// int x =..... ostatak sa deljenju sa 10 izdvajanje nacin razmisljanja matematicki je daleko koristan ali nece da trazi bog zna sta ali dace analogiju gde se trazi koje nemaju vezu sa matematiku
		// treba da dobijemo cifru od 0 do 9 i
		
		
		
		// imamo celobrojni trocifreni broj kako dobiti zbir cifara
		
		
		
		// 489 / 100 pa kao int
		x=489; // koji god broj da stavimo radice
		//zbir cifara trocifrenog broja
		//kako resiti problem koji nije problemski tezak vec u nivou sta smo radili
		//delimo problem
		
		
		int c1 = x /100;
		int c2 = (x/10) % 10; // moze ali i ne mora u zagradi i mora % jer samo x / 10 napisace 48 sredisnja cifra 489 / 10 dobicemo dvocifreni broj
		int c3 = x %10;
		// nisu inicijalizovane nemaju zadatu vrednost tj nemaju nikakvu vrednost prazne su
		// u javi mora da se inicijalizuje u nekima ne mora
		int s = c1 + c2 + c3;
		System.out.println();
		
		
		
		// 489
		// c1 = x/100;
		// c2 = (x - 100 * c1)/10;
		//c2 = (x%100)/10;
		
		


		int y = x ; // state machine jedino menjamo stanje memorije
		int s1 = 0;
		int c = x%10; // uzmem poslednju cifru 
		s1=s+c;
		 x=x/10; // odsecem poslednju cifru
		c=x%10;
		 c = x%10; // uzmem poslednju cifru 
					s1=s+c;
					 x=x/10; // odsecem poslednju cifru
					c=x%10;
					 c = x%10; // uzmem poslednju cifru 
								s1=s+c;
								 x=x/10; // odsecem poslednju cifru
								c=x%10;
								
								x = y;
								// mogli smo umesto x da stavimo y
		System.out.println("zbir cifara broja"+ x+"je" + s);
		
		
		// unosenje trece varijable analogija 2 serpe 1 sporet ili imamo u 1 ruci telefon u drugu laptop moramo da spustimo 1 stvar to je nova varijabla kako bismo ih zamenili
		// c= a;
		//a = b;
		//b=c;
		// moze i bez c ali to je vise bilo potrebno pre kad je memorija bila ogranicenija
		
		// x b c imaju toliko bombona koliko bombona ce da imaju ako podele sa istim brojem itd zadaci iz 1 i drugog razreda
		
		
		// za ucitavanje promeljivih koristili smo skener 
		// postoje razlicite mogucnosti za iscitavanje  spolja
		// sto skener pa
		//u sustini trebamo biti svesno necega sto nam treba a sto nismo videli moramo bili sposobni naci resenje preko googla
		// ako si jedini sto radis nesto u svetu ne brini postoje par kineza sto rade to isto
		
		
		
		//traze se ljudi koji znaju da razmisljaju cak i bez iskustva matematiku uce napamet ko to?
		
		// stackoverflow najpopularniji sajt za resene probleme
		// npr vise nacina za pisanje skenera
		
		
		
		
		
		
		// importovanje tipova
		
		
		
		
		
		
		
	}

}
