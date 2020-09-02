package pruebas;

public class LlaveEntero extends Llave {

    private Integer mLlave = null;

    public LlaveEntero(int pValor) {
        mLlave = pValor;
    }

    public LlaveEntero(Integer pValor) {
        mLlave = pValor;
    }

    public Object getKey() {
        return mLlave;
    }
    
    public boolean igualA(Llave pObjeto) {
        return mLlave.equals(pObjeto.getKey());
    }

    public boolean menorQue(Llave pObjeto) {
        return mLlave.compareTo((Integer)pObjeto.getKey()) < 0;
    }
    
    public boolean mayorQue(Llave pObjeto) {
        return mLlave.compareTo((Integer)pObjeto.getKey()) > 0;
    }
    
    public boolean menorOIgualQue(Llave pObjeto) {
        return mLlave.compareTo((Integer)pObjeto.getKey()) <= 0;
    }
  
    public boolean mayorOIgualQue(Llave pObjeto) {
        return mLlave.compareTo((Integer)pObjeto.getKey()) >= 0;
    }
    
    public Llave minKey() {
        return new LlaveEntero(Integer.MIN_VALUE);
    }

}
