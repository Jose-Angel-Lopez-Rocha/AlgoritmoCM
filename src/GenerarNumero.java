public class GenerarNumero {
    double res,MOD,ri;
    public GenerarNumero(double a, double Xo,double m, int cantidad) {
        if (m <= 0) {
            System.out.println("m debe ser mayor que 0");
            return;
        }
        double m1=m-1;
        for (int i=0;i<40;i++){
            res=a*Xo;
            MOD=(a*Xo)%(m);
            ri=MOD/m1;
            Xo=MOD;
            double rired = Math.round(ri * 10000.0) / 10000.0;
            System.out.println((1+i) + "resultado: " + rired);
        }
    }
}
