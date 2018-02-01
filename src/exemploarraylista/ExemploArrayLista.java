package exemploarraylista;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author acabezaslopez
 */
public class ExemploArrayLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ArrayList lista = new ArrayList();
        lista.add(1);
        lista.add("aaa");
        lista.add(1, 6);
        lista.add("d");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }*/
        ArrayList<Integer> listaNum = new ArrayList();
        int op;
        Metodos obx = new Metodos();
        do {
            System.out.println("***********-MENÚ-***********\n1)Añadir elemento a la lista\n2)Visualizar\n3)Salir"
                    + "\n4)Borrar posición\n5)Borrar elemento\n6)Mudar valor posición"
                    + "\n7)Mudar valor\n8)Mayor o Menor?\n9)Par o Impar?");
            op = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción :"));
            switch (op) {
                case 1:
                    obx.engadir(listaNum);
                    break;
                case 2:
                    obx.amosarIterador(listaNum);
                    break;
                case 3:
                    System.exit(0);
                    break;
                case 4:
                    obx.borrarElemento(listaNum);
                    break;
                case 5:
                    obx.borrarElementoPosicion(listaNum, op);
                    break;
                case 6:
                    obx.mudarValorPosicion(listaNum);
                    break;
                case 7:
                    obx.mudarValor(listaNum, op);
                    break;

                case 8:
                    obx.mayorMenor(listaNum);
                    System.out.println("El mayor numero es :" + obx.getMayor() + "\nEl menor número es :" + obx.getMenor());
                    break;

                case 9:
                    ArrayList<Integer> listaPar = new ArrayList();
                    listaPar = obx.pares(listaNum);
                    obx.amosarIterador(listaPar);
                    break;
            }
        } while (op != 3);
        // System.out.println("***********-MENÚ-***********\n1)Añadir elemento a la lista\n2)Visualizar\n3)Salir\n4)Borrar posición\n5)Borrar elemento\n6)Mudar valor posición\n7)Mudar valor");
        //op = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción :"));

    }
}
