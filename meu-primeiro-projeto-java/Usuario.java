public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual ?" + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual ?" + smartTv.canal);

        System.out.println("A TV está ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual ?" + smartTv.canal);
        System.out.println("Volume Atual ?" + smartTv.volume);

        smartTv.ligar();
        System.out.println("A TV está ligada ?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("A TV está ligada ?" + smartTv.ligada);
        
    }
}