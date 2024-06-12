public class App {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.mostrarEstado();

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(20);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        smartTv.mostrarEstado();
    }
}
