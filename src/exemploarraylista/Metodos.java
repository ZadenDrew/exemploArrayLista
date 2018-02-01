package exemploarraylista;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author acabezaslopez
 */
public class Metodos {

    private static int mayor;
    private static int menor;

    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }

    //añadir-elemento
    public void engadir(ArrayList<Integer> lista) {
        Integer n;
        n = Integer.parseInt(JOptionPane.showInputDialog("numero"));
        lista.add(n);

    }
    //mostrar-array
    public void amosarIterador(ArrayList<Integer> lista) {
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    //borrar elemento-posicion
    public void borrarElementoPosicion(ArrayList<Integer> lista, int posicion) {
        lista.remove(posicion - 1);
    }

    //borrar-elemento
    public void borrarElemento(ArrayList<Integer> lista) {
        int elemento = Integer.parseInt(JOptionPane.showInputDialog("¿Qué elemento deseas borrar?"));
        lista.remove(new Integer(elemento));

    }

    //cambiar valor-posicion
    public void mudarValorPosicion(ArrayList<Integer> lista) {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué posición deseas modificar?"));
        int valor = Integer.parseInt(JOptionPane.showInputDialog("¿Cal é o novo valor?"));
        lista.set(posicion, valor);
    }

    //cambiar valor 
    public void mudarValor(ArrayList<Integer> lista, int elemento) {
        int valorAnt = Integer.parseInt(JOptionPane.showInputDialog("¿Qué elemento deseas modificar?:"));
        //   int valorNovo=Integer.parseInt(JOptionPane.showInputDialog("¿Qué elemento deseas modificar?:"));
        int valorNovo = lista.indexOf(elemento);
        lista.add(valorAnt, valorNovo);
    }

    //mostrar el mayor y el menor
    public void mayorMenor(ArrayList<Integer> lista) {
        Comparator<? super Integer> c = null;
        lista.sort(c);
        mayor = lista.get(lista.size() - 1);
        menor = lista.get(0);
    }

    //mostrar los pares de la lista
    public ArrayList<Integer> pares(ArrayList<Integer> lista) {
        Iterator it = lista.iterator();
        ArrayList<Integer> listaPar = new ArrayList();
        while (it.hasNext()) {
            int num = (int) it.next();
            if (num % 2 == 0) {
                listaPar.add(num);
            }
         //   System.out.println(it.next());
        }
        return listaPar;
    }
}
