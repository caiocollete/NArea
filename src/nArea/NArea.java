package nArea;

import java.util.Stack;

public class NArea {
    private No raiz;

    public NArea() {}

    public No getRaiz() {
        return raiz;
    }

    public void Inserir(int info) {
        if(raiz == null) {
            raiz = new No(info);
        }
        else {
            No aux = raiz, ant = raiz;
            while(aux!=null && aux.getTL()<No.N-1){
                ant = aux;
                aux = aux.getLig(aux.buscarPos(info));
            }
            if(aux==null){
                ant.setLig(ant.buscarPos(info), new No(info));
            }
            else{
                int pos = aux.buscarPos(info);
                aux.remanejar(pos);
                aux.setInfo(pos, info);
                aux.setTL(aux.getTL()+1);
            }
        }
    }

    public void in_ordem_interativo(){
        int pos;
        No aux;
        Stack<No> p = new Stack<>();
        Stack<Integer> pi = new Stack<>();

        p.push(raiz);
        pi.push(-1);

        while(!p.isEmpty()){
            aux = p.pop();
            pos = pi.pop();

            while(aux!=null && pos<aux.getTL()){
                pi.push(pos+1);
                p.push(aux);
                if(pos>-1){
                    System.out.println(aux.getInfo(pos));
                }
                aux = aux.getLig(pos+1);
                pos = -1;
            }
        }
    }
}
