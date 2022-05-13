public class ImpressoraMain {
    public static void main(String[] args){
        Impressora imp = new Impressora();
        String s1 = "s1";
        String s2 = "s2";
        String s3 = "s3";
        int a = 1;
        int b = 2;
        float f1 = 3.5f;
        float f2 = 5.4f;
        imp.exibir(s1, f1);
        imp.exibir(s1, s2, s3);
        imp.exibir(f1);
        imp.exibir(f1, s1);
        imp.exibir(f1, f2);
    }
}
