public abstract class AeronaveEstado {
    public AeronaveEstado() {
    }

    public abstract String getEstado();

    public boolean voar(Aeronave aeronave) {
        return false;
    }

    public boolean pousar(Aeronave aeronave) {
        return false;
    }

    public boolean decolar(Aeronave aeronave) {
        return false;
    }

    public boolean esperar(Aeronave aeronave) {
        return false;
    }
}
