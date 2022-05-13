public class CalculadoraCientificaMain {
    public static void main(String[] args){
        CalculadoraCientifica calc = new CalculadoraCientifica();
        byte baseB = 10;
        byte expoB = 3;
        String baseS = "2";
        String expoS = "3";
        int baseI = 5;
        double expoD = 3;
        System.out.println(calc.potencia(baseB, expoB));
        System.out.println(calc.potencia(baseS, expoS));
        System.out.println(calc.potencia(baseI, expoD));

        int raizI = 4;
        double raizD = 100;
        String raizS = "2";
        System.out.println(calc.raiz(raizI));
        System.out.println(calc.raiz(raizS));
        System.out.println(calc.raiz(raizD));
    }
}
