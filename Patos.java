interface Volador {
    void volar(); 
}

interface Nadador {
    void nadar(); 
}

class Pato implements Volador, Nadador {

    @Override
    public void volar() {
        System.out.println("El pato está volando sobre el lago ");
    }

    @Override
    public void nadar() {
        System.out.println("El pato está nadando tranquilamente en el agua ");
    }
}

public class Patos {
    public static void main(String[] args) {
        
        Pato miPato = new Pato();

        miPato.volar();
        miPato.nadar();
    }
}

