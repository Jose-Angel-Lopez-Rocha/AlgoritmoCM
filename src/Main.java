import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double K,Xo,g,a,m;
        int opc;
        System.out.println("Humno ingresa la K: ");
        K=scanner.nextDouble();
        System.out.println("Humno ingresa la Xo: ");
        Xo=scanner.nextDouble();
        System.out.println("Humno ingresa la g: ");
        g=scanner.nextDouble();
        m=Math.pow(K,g);
        System.out.println("""
                Humano ingresa la forma de calcular a:
                 1) 3+8k\s
                 2) 5+8k\s""");
        opc=scanner.nextInt();
        if (opc == 1){
            a=3+8*(K);
        }else if(opc==2){
            a=5+8*(K);
        }else{
            System.out.println("Opcion invalida");
            return;
        }
        GenerarNumero generarNumero=new GenerarNumero(a,Xo,m,40);
    }
}