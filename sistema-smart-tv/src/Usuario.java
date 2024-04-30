public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? "+ smartTv.ligada);
        System.out.println("Canal Atual : "+ smartTv.canal);
        System.out.println("Volume Atual : "+ smartTv.volume);

        smartTv.ligar ();
        System.out.println(" Novo Status --> TV Ligada ? "+ smartTv.ligada);

        smartTv.desligar();
        System.out.println(" Novo Status --> TV Ligada ? "+ smartTv.ligada);

        smartTv.diminuirVolume(); // volume 24  o volume começa no 25
        smartTv.diminuirVolume(); // volume 23
        smartTv.diminuirVolume(); // volume 22
        smartTv.aumentarVolume(); // volume 23
        System.out.println("Volume Atual : "+ smartTv.volume);   

        System.out.println("O novo canal é:" + smartTv.canal); //Canal iniciado que é o 1
        smartTv.mudarCanal(60); //Selecionado o novo canal.
        smartTv.aumentarCanal(); // Selecionado o novo canal +1
        smartTv.aumentarCanal(); // Selecionado o novo canal +1
        smartTv.diminuirCanal(); // Selecionado o novo canal -1
        System.out.println("O novo canal é:" + smartTv.canal); // Canal atual selecionado..

        }        

    }

