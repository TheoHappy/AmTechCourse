package Task1;

public class BasketballTeam extends Team{
    public BasketballTeam() {
        System.out.println("Creating new class of type" + this.getClass().getName());
    }

    public BasketballTeam(String name, int numberOfPlayers, String teamTalisman, String country) {
        super(name, numberOfPlayers, teamTalisman, country);
    }

    @Override
    public void singHymn(){
        System.out.println("Go Go Basketball team");
    }

    public void singHymn(String country){
        System.out.println("Go Go Basketball team from " + country);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
