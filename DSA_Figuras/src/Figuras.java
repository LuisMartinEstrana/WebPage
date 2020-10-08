import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Figuras {

    int id;
    ArrayList<String> figure_name = new ArrayList<String>();
    ArrayList<Integer> figure_metros_a = new ArrayList<Integer>();
    ArrayList<Integer> figure_metros_h = new ArrayList<Integer>();

        public static void main (String[]args) {

            Figuras myFiguras = new Figuras();


            //------------------------------- Creamos las Figuras

            myFiguras.figure_name.add("Rectangulo");
            myFiguras.figure_name.add("Cuadrado");
            myFiguras.figure_name.add("Circulo");

            myFiguras.figure_metros_a.add(4);
            myFiguras.figure_metros_a.add(4);
            myFiguras.figure_metros_a.add(3);

            myFiguras.figure_metros_h.add(5);
            myFiguras.figure_metros_h.add(4);
            myFiguras.figure_metros_h.add(0);
            myFiguras.id = myFiguras.figure_name.size();

            //-------------------------------

            //-------------------------------   Pedimos las figuras

            Scanner myFig = new Scanner(System.in);
            System.out.println("Introduce la primera figura");
            String Figura_1 = myFig.nextLine();
            System.out.println("Introduce la primera figura");
            String Figura_2 = myFig.nextLine();

            //-------------------------------   Comparador

            int metros_ancho1, metros_altura1, metros_anchura2, metros_alto2, comp = 0, m2_1 = 0, m2_2 = 0;

            for (int i = 0; i < myFiguras.figure_name.size(); i++) {
                //Figura 1
                if (Figura_1.equals(myFiguras.figure_name.get(i))) {
                    metros_ancho1 = myFiguras.figure_metros_a.get(i);
                    metros_altura1 = myFiguras.figure_metros_h.get(i);

                    if(metros_altura1 == 0){
                        m2_1 = (metros_ancho1 * metros_ancho1) * 3;
                    }
                    else {
                        m2_1 = metros_ancho1 * metros_altura1;
                    }

                    System.out.println("Figura: " +Figura_1+ " Ancho: " + metros_ancho1 + " Alto: " + metros_altura1);
                    comp++;
                }

                //Figura 2
                if (Figura_2.equals(myFiguras.figure_name.get(i))){
                    metros_anchura2 = myFiguras.figure_metros_a.get(i);
                    metros_alto2 = myFiguras.figure_metros_h.get(i);

                    if(metros_alto2 == 0){
                        m2_2 = (metros_anchura2 * metros_anchura2) * 3;
                    }
                    else {
                        m2_2 = metros_anchura2 * metros_alto2;
                    }
                    System.out.println("Figura: " +Figura_2+ " Ancho: " + metros_anchura2 + " Alto: " + metros_alto2);
                    comp = comp +1;
                }

            }
            //-------------------------------

            int comparador;
            if(comp == 2){
                if(m2_1 > m2_2){
                    comparador = m2_1 - m2_2;
                    System.out.println("La comparació de metros cuadrados son: " +comparador+ "m2");
                }
                else{
                    comparador = m2_2 - m2_1;
                    System.out.println("la comparación en metros cuadrados son " +comparador+ "m2");
                }


            }
            else{
                System.out.println("No se puede comparar si no estan las dos figuras en el programa");
            }

        }
}
