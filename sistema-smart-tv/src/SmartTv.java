public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++; // aumentando de 1 em 1
        System.out.println("Aumentando o volume para:" + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para:" + volume);
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novocanal){  // Aqui ele armazena nesse método o canal selecionado..
        canal = novocanal;

    }
}
