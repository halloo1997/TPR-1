import java.util.ArrayList;
public class Main{
  public static void main(String[] args){
    ArrayList<Carrot> pinkcarrots = new ArrayList<Carrot>();
    ArrayList<Carrot> orangecarrots = new ArrayList<Carrot>();
    Rabbit[] rabbits = new Rabbit[1];

    rabbits[0] = new Rabbit();
    for(int i = 0; i < 10; i++){
      pinkcarrots.add(new Carrot());
      orangecarrots.add(new Carrot());
    }
    rabbits[0].eat(4,pinkcarrots);
    rabbits[0].eat(2,orangecarrots);
    rabbits[0].eat(11,orangecarrots);
    rabbits[0].eat(4,orangecarrots);
  }
}

//Opdracht 1:
//Los de 2 fouten op die allebij te maken hebben met "scope"

//Opdracht 2:
//Plaats de Carrot class in een map die "Vegetables" heet en de Rabbit class in een map met de naam "Animals"
//Zorg ervoor dat de namespace van deze classes wordt correct wordt aangepast zodat de compiler deze classes weer kan vinden.