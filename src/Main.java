import nArea.NArea;

public class Main {
    public static void main(String[] args) {
        System.out.println(":)");
        NArea raiz = new NArea();
        raiz.Inserir(100);
        raiz.Inserir(120);
        raiz.Inserir(150);
        raiz.Inserir(50);
        raiz.Inserir(90);
        raiz.Inserir(80);
        raiz.Inserir(105);
        raiz.Inserir(110);
        raiz.in_ordem_interativo();
    }
}