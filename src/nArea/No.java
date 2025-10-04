package nArea;

public class No {
    public static final int N = 3;
    private int vInfo[];
    private int TL;
    private No vLig[];

    public No(int info) {
        vInfo = new int[N-1];
        vLig = new No[N];
        TL=0;
        vInfo[TL++] = info;
    }

    public int getInfo(int pos) {
        return vInfo[pos];
    }

    public void setInfo(int pos, int vInfo) {
        this.vInfo[pos] = vInfo;
    }

    public int getTL() {
        return TL;
    }

    public void setTL(int TL) {
        this.TL = TL;
    }

    public No getLig(int pos) {
        return vLig[pos];
    }

    public void setLig(int pos, No vLig) {
        this.vLig[pos] = vLig;
    }

    public int buscarPos(int info) {
        int pos = 0;
        while(pos<TL && vInfo[pos]<info){
            pos++;
        }
        return  pos;
    }
    public void remanejar(int pos){
        for(int i=TL; i>pos;i--){
            vInfo[i]=vInfo[i-1];
        }
    }
}
