public class CalculadoraCientifica {
    public double potencia(byte base, byte expoente){
        return Math.pow(base, expoente);
    }

    public double potencia(String base, String expoente){
        return Math.pow(Double.parseDouble(base), Double.parseDouble(expoente));
    }

    public double potencia(int base, double expoente){
        return Math.pow(base, expoente);
    }

    public double raiz(int valor){
        return this.raiz((double) valor);
    }

    public double raiz(String valor){
        return this.raiz(Double.parseDouble(valor));
    }

    public double raiz(double valor){
        return Math.sqrt(valor);
    }
}