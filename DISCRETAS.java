import javax.swing.*;
import java.util.Scanner;

public class DISCRETAS {

    public static Scanner Keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        String serie = "1";
        int n = 0;
        int cont = 2;
        double result=1;



        n = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE VALOR N "));

        while (cont <= n) {
            serie +=  "*"+cont ;

            result*=cont;

            cont++;
        }
        JOptionPane.showMessageDialog(null,serie + "=" + result);

        JOptionPane.showMessageDialog(null," veamos la formula n(n+1)(2n+7) /6 ");

        result= (n * (n+1) * ((2 * n) + 7)) /6;

        JOptionPane.showMessageDialog(null,"RESULTADO DE LA OPERACION  "+result);

        JOptionPane.showMessageDialog(null," SUPONGAMOS QUE SE CUMPLE PARA n = k, ES DECIR ");

        JOptionPane.showMessageDialog(null," 1*3+2*4+...+ k(k+2)= k(k+1) (2k + 7) / 6 ESTA ES LA H I ");

        JOptionPane.showMessageDialog(null, " EMPECEMOS CON HI ");
        JOptionPane.showMessageDialog(null," 1*3+2*4+...+ k(k+2)= k(k+1) (2k + 7) / 6 ");
        JOptionPane.showMessageDialog(null," LE SUMAMOS EL K+1 EN AMBOS LADOS ");
        JOptionPane.showMessageDialog(null,"1*3+2*4+...+ k(k+2)+(k+1)(k+3)= k(k+1) (2k + 7)+(k+1)(k+3) / 6");



    }
}
