package pruebas;

class Split {
    Nodo mPuntero;
    Llave mLlave;

    public Split(Nodo puntero, Llave llave) {
        this.mPuntero = puntero;
        this.mLlave = llave;
    }

    public void setPuntero(Nodo mPuntero) {
        this.mPuntero = mPuntero;
    }

    public Nodo getPuntero() {
        return mPuntero;
    }

    public void setLlave(Llave mLlave) {
        this.mLlave = mLlave;
    }

    public Llave getLlave() {
        return mLlave;
    }
}
