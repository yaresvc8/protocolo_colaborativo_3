interface Nadador {
    void nadar();
}

//Clase sin relación lógica con la interfaz
class Computadora implements Nadador {
    @Override
    public void nadar() {
        System.out.println("La computadora se está ahogando ");
    }
}

//Correcion 

class Pez implements Nadador {
    @Override
    public void nadar() {
        System.out.println("El pez nada en el océano ");
    }
}
