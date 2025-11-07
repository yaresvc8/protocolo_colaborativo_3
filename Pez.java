interface Nadador {
    void nadar();
}

interface Respirador {
    void respirar(); 
}

class Pez1 implements Nadador, Respirador {

    
    @Override
    public void nadar() {
        System.out.println("El pez nada suavemente entre las corrientes del agua ");
    }

    @Override
    public void respirar() {
        System.out.println("El pez respira oxígeno a través de sus branquias ");
    }
}

public class Pez {
    public static void main(String[] args) {
        
        Pez1 miPez = new Pez1();

        
        miPez.nadar();
        miPez.respirar();
    }
}
