import static java.lang.Integer.parseInt;
public class Calculadora {
    //varargs: desde a versão 5 do Java
    public int somar(int... valores){
        //Schugar code: Abstração -> um atalho para uma operação mais complexa ou cansativa de ser feita 
        //manualmente. Eu transfiro essa responsabilidade para o compilador fazer esse processo para mim.
        int soma = 0;
        for(int i = 0; i < valores.length; i++){
            soma += valores[i];
        }
        return soma;
    }

    public int somar(int a, int b){
        return a + b;
    }
}

// // public int somar(int primeiro, int segundo){
// //     return primeiro + segundo;
// // }
// // Ambiguidade, pois os dois métodos podem ser utilizados passando os mesmos parâmetros
// // O que faz o desempate:
// // Quantidade de parâmetros
// // Tipo dos parâmetros
// // Ordem dos parâmetros

// //polimorfismo estático -> Nome mais clássico da sobrecarga
// //Método de instância
// public int somar(int a, int b){
//     return a + b;
// }
// //Sobrecarga - overload - comodidade para o cliente
// public float somar(float f1, float f2){
//     return f1 + f2;
// }

// public int somar(int a, int b, int c){
//     return somar(a, somar(b, c));
// }

// public int somar(String s1, String s2){
//     return somar(parseInt(s1), parseInt(s2));
// }

// public int somar(String s1, int b){
//     return somar(parseInt(s1), b, 0);
// }

// public int somar(int a, String s2){
//     return somar(s2, a);
// }