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

    public int getvInfo(int pos) {
        return vInfo[pos];
    }

    public void setvInfo(int pos, int vInfo) {
        this.vInfo[pos] = vInfo;
    }

    public int getTL() {
        return TL;
    }

    public void setTL(int TL) {
        this.TL = TL;
    }

    public No getvLig(int pos) {
        return vLig[pos];
    }

    public void setvLig(int pos, No vLig) {
        this.vLig[pos] = vLig;
    }

    public int buscarInfo(int info) {
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
