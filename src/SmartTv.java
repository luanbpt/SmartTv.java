public class SmartTv {
    
    boolean ligada = false;
    int canal = 2;
    int volume = 25;

        public void mudarCanal(int novoCanal){
            canal = novoCanal;


        }

        public void subirCanal(){
            canal++;

        }

        public void dimimuirCanal(){
            canal--;

        }


        public void aumentarVolume(){
            System.out.println("Aumentando o volume para: " + volume);
          
            volume++;
        }
        

        public void diminuirVolume(){
            System.out.println("Diminuindo o volume para: " + volume);
            
            volume--;


        }

        public void ligar(){
            ligada = true;


        }
        public void desligar(){
            ligada = false;


        }
    


}
