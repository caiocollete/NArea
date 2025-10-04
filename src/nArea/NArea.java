package nArea;

public class NArea {
    private No raiz;

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public NArea() {}

    public void Inserir(int info) {
        if(raiz == null) {
            raiz = new No(info);
        }
        else {
            No aux = raiz, ant = raiz;
            while(aux!=null && aux.getTL()<No.N-1){
                ant = aux;
                aux = aux.getvLig(aux.buscarInfo(info));
            }
            if(aux==null){
                ant.setvLig(ant.buscarInfo(info), new No(info));
            }
            else{
                int pos = aux.buscarInfo(info);
                aux.remanejar(pos);
                aux.setvLig(pos, new No(info));
                aux.setTL(aux.getTL()+1);
            }
        }
    }

    public void in_ordem() {
        inordem(this.raiz);
    }
    public void inordem(No raiz){
        int pos = -1;
        while(raiz!=null && pos<raiz.getTL()){
            if(pos!=-1){
                System.out.println(raiz.getvInfo(pos));
            }
            inordem(raiz.getvLig(++pos));
        }
    }
}
