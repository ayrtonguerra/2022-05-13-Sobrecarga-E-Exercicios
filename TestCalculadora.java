public class TestCalculadora {
    public static void main(String[] args){
        //Construir um objeto do tipo Calculadora
        Calculadora calc = new Calculadora();
        calc.somar(2, 3);
        calc.somar(2, 3, 1, 4, 5);
        calc.somar(1);
        calc.somar(1, 2, 1, 2, 1, 2, 1, 2);
        calc.somar(); //funciona mesmo assim. O compilador passa um vetor vazio para o método somar. //Devolvi zero
        int resultado = calc.somar(1, 2); //O compilador não reclama por causa da retrocompatibilidade.
                                               //com os códigos que foram feitos antes da versão 5.
    }
}

// //Chamar o método somar
// int x = 10;
// int y = 7;
// int resultado = calc.somar(x, y);
// System.out.println(resultado);
// float f1 = 3.5f;
// float f2 = 7.3F;
// float resF = calc.somar(f1, f2);
// int resInt3 = calc.somar(x, y, 3);
// String s1 = "3";
// String s2 = "4";
// int resS = calc.somar(s1, s2);
// int resSI = calc.somar(s1, x);
// int resIS = calc.somar(x, s1);
