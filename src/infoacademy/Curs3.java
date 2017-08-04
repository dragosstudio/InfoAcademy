
package infoacademy;
/*
public class Curs3 {

    class Persoana {                  // clasa
        Persoana p = new Persoana();  // obiect
	String nume;          // atribut
        int greutate = 50;    // atribut
   
    public void prezentare(){
        System.out.println("Salut, sunt " + nume + " si am " + greutate + " de kg");
    }

    public void schimbaNume(String n){ 
        nume = n;
    }

    public void mananca(){
        greutate++;

   
    p.prezentare();	// Salut, sunt Mihai si am 50 de kg p.mananca();
    p.mananca(); 
    p.prezentare();	// Salut, sunt Mihai si am 51 de kg p.mananca();
    p.mananca(); 

}    
}
}
*/
// public static void main(String[] args){


class Catzel {
    String nume;
    Catzel(String n) {
    nume=n;
    System.out.println("S-a creat un obiect Catzel cu numele "+n);
    }
}
    
class Prog1 {
    public static void main(String[] args) {
    Catzel c=new Catzel("Azor"); // S-a creat un obiect Catzel cu numele Azor
    }
}
