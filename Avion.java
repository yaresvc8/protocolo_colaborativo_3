interface Volador {
    void volar(); 
}

// Clase que implementa la interfaz, pero NO implementa el método
class Avion1 implements Volador {
    // Falta implementar el método volar()
}

//Correcion
class Avion implements Volador {
    @Override
    public void volar() {
        System.out.println("El avión está volando por los cielos ");
    }
}

public class Avion {
    public static void main(String[] args) {
        Avion1 a = new Avion1();
        a.volar(); 
    }
}
