package fr.tom.acterax.yanis.yanis6660;

public class EProxy {

    private EProxy eProxy;
    
    public EProxy() {
        System.out.println("Proxy dans les starting block");
        this.eProxy = this;
    }

    public EProxy getEProxy() {
        return eProxy;
    }

    public static void main(String[] args) { new EProxy(); }
}
