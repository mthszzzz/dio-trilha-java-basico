public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal alterado para: \n"+canal);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Canal aumentou para: \n"+canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Canal diminuiu para: \n"+canal);
    }

    public void aumentarVolume() {
        volume++;
        System.out.printf("Volume aumentado para %d\n\n",volume);
    }

    public void baixarVolume() {
        volume--;
        System.out.printf("Volume baixado para %d!\n\n",volume);
    }

    public void ligar() {
        ligada = true;
        System.out.println("Tv ligada!\n\n");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Tv desligada!\n\n");
    }


    public void mostrarEstado() {
        System.out.println("Tv ligada? " + ligada);
        System.out.println("Canal atual : "+ canal);
        System.out.println("Volume atual : "+volume);
        System.out.println();
    }
}
