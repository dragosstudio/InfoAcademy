package infoacademy;

import java.util.Random;

public class Curs_2_Challenge {
    
    public static void main(String[] args) {
        int numar1, numar2, countDoubles=0;
        Random rand = new Random();

        numar1 = rand.nextInt(6)+1;
        numar2 = rand.nextInt(6)+1;
        switch (numar1){
            case 1: System.out.print("unu");
            break;
            case 2: System.out.print("doi");
            break;
            case 3: System.out.print("trei");
            break;
            case 4: System.out.print("patru");
            break;
            case 5: System.out.print("cinci");
            break;
            case 6: System.out.print("sase");
            break;
        }
        System.out.print(" si ");
        switch (numar2){
            case 1: System.out.println("unu");
            break;
            case 2: System.out.println("doi");
            break;
            case 3: System.out.println("trei");
            break;
            case 4: System.out.println("patru");
            break;
            case 5: System.out.println("cinci");
            break;
            case 6: System.out.println("sase");
            break;
        }      
        if (numar1 == numar2){
            System.out.println("dubla");
        }
        else if(numar1 - numar2 == 2 || numar2 - numar1 ==2){
            System.out.println("poarta in casa");
        }
    }
}