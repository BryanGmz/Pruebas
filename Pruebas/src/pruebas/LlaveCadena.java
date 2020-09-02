package pruebas;

public class LlaveCadena extends Llave {
    
    public LlaveCadena(String pValor) {
        mLlave = pValor;
    }    
    private String mLlave = null;    

    public Object getKey() {
        return mLlave;
    }
    
    public boolean igualA(Llave pObjeto) {
        return mLlave.equals(pObjeto.getKey());
    }

    public boolean menorQue(Llave pObjeto) {
        return mLlave.compareTo((String)pObjeto.getKey()) < 0;
    }
    
    public boolean mayorQue(Llave pObjeto) {
        return mLlave.compareTo((String)pObjeto.getKey()) > 0;
    }
    
    public boolean menorOIgualQue(Llave pObjeto) {
        return mLlave.compareTo((String)pObjeto.getKey()) <= 0;
    }
    
    public boolean mayorOIgualQue(Llave pObjeto) {
        return mLlave.compareTo((String)pObjeto.getKey()) >= 0;
    }
    
    public Llave minKey() {
        return new LlaveCadena("");
    }

}
