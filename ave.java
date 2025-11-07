interface Volador {
    void volar();
}

interface Cantante {
    void cantar(); 
}

class Ave implements Volador, Cantante {

    @Override
    public void volar() {
        System.out.println("El ave está volando alto en el cielo ");
    }

    @Override
    public void cantar() {
        System.out.println("El ave está cantando una melodía hermosa ");
    }
}

public class ave {
    public static void main(String[] args) {
        
        Ave miAve = new Ave();

        miAve.volar();
        miAve.cantar();
    }
}

