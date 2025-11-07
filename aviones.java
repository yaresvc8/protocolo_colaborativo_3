interface Volador {
    void volar(); 
}

class Avion implements Volador {
    // No implementamos el método volar()
}

//Correccion
class Avion implements Volador {
    @Override
    public void volar() {
        System.out.println("El avión está volando a gran altura ");
    }
}

public class aviones {
    public static void main(String[] args) {
        Avion a = new Avion();
        a.volar();
    }
}


