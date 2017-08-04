/*

ENUNT
-----

1. Se "da cu zarul". Se afiseaza fie valoarea zarului in litere,
    fie fata zarului

2. Se da cu doua zaruri. Se afiseaza zarurile. Se evidentiaza 
    dubla (z1 = z2) si poarta in casa ( z1-z2=2 sau z1-z2 = -2)

3. Se da cu 2 zaruri de 20 de ori. Se memoreaza toate aruncarile 
intr-un array bidimensional (20 x 2). Se parcurge array-ul si se
afiseaza:
- numar si procent de duble
- numar si procent de porti

 */
package infoacademy;

public class Zaruri {

    public static void main(String[] args) {

        int nrAruncari = 20;
        int[][] aruncari = new int[nrAruncari][2];
        for (int i = 0; i < nrAruncari; i++) {
            aruncari[i][0] = (int) (Math.random() * 6) + 1;
            aruncari[i][1] = (int) (Math.random() * 6) + 1;
            //afisareZar(a[0]);
            //afisareZar(a[1]);
        }
        statistica(aruncari);
    }

    /* pt refolosire cod la generare zar:
    public static int arunca(){
	return (int) (Math.random() * 6) + 1;
    }
     */
    public static void afisareZar(int z) {
        switch (z) {
            case 1:
                System.out.println("Ati dat: UNU");
                System.out.println("   ");
                System.out.println(" * ");
                System.out.println("   ");
                break;
            case 2:
                System.out.println("Ati dat: DOI");
                System.out.println("*  ");
                System.out.println("   ");
                System.out.println("  *");
                break;
            case 3:
                System.out.println("Ati dat: TREI");
                System.out.println("*  ");
                System.out.println(" * ");
                System.out.println("  *");
                break;
            case 4:
                System.out.println("Ati dat: PATRU");
                System.out.println("* *");
                System.out.println("   ");
                System.out.println("* *");
                break;
            case 5:
                System.out.println("Ati dat: CINCI");
                System.out.println("* *");
                System.out.println(" * ");
                System.out.println("* *");
                break;
            case 6:
                System.out.println("Ati dat: SASE");
                System.out.println("* *");
                System.out.println("* *");
                System.out.println("* *");
                break;
        }
        System.out.println();
    }

    public static void afisareZarInLitere(int z) {
        String[] fetze = {"unu", "doi", "trei", "patru", "cinci", "sase"};
        System.out.println(fetze[z - 1]);

        //System.out.println(new String[]{"unu","doi","trei","patru","cinci","sase"}[z-1]);
//	int[] i={1,2,3};
//	int[] j;
//	j = {4,5,6}; --> NU MERGE!
//	j = new int[]{1,2,3};
//	void f(int[] i){....}
// 	f(new int[]{1,2,3});
    }

    private static void statistica(int[][] aruncari) {
        int nrPorti = 0, nrDuble = 0;
        for (int i = 0; i < aruncari.length; i++) {
            int[] a = aruncari[i];

            // afisareInParalel(a[0],a[1]);
            switch (a[0] - a[1]) {
                case 0:
                    System.out.println("Dubla!");
                    nrDuble++;
                    break;
                case 2:
                case -2:
                    System.out.println("Poarta-n casa!");
                    nrPorti++;
                    break;
            }

        }
        System.out.println("-----------------------------------------");
        System.out.println("STATISTICI: " + nrDuble + " duble, " + nrPorti + " porti in casa");
        System.out.println("Procent duble: " + (int) ((float) nrDuble / aruncari.length * 100));
        System.out.println("Procent porti: " + (int) ((float) nrPorti / aruncari.length * 100));
    }

    // valori si linii numerotate de la 1
    public static String linieZar(int valoareZar, int linie) {
        String[][] feteZar = {
            {"   ",
                " * ",
                "   "
            },
            {"*  ",
                "   ",
                "  *"
            },
            {"*  ",
                " * ",
                "  *"
            },
            {"* *",
                "   ",
                "* *"
            },
            {"* *",
                " * ",
                "* *"
            },
            {"* *",
                "* *",
                "* *"
            }
        };
        return feteZar[valoareZar - 1][linie - 1];
    }

    public static void afisareInParalel(int z1, int z2) {
        for (int i = 1; i <= 3; i++) {
            System.out.print(linieZar(z1, i)); // linia curenta din zarul 1
            System.out.print("\t");		// TAB
            System.out.println(linieZar(z2, i)); // linia curenta din zarul 2
        }

    }

}

/* structura generala a clasei
class A{

	.....main.......{
		int z1 = ...........;
		int z2 = ...........;
		afisare(z1);
		afisare(z2);
	}
	...afisare(int x){
		System.out.println(x);
	}

 */
