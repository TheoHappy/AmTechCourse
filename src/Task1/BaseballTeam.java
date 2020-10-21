package Task1;

public class BaseballTeam extends Team{
    public BaseballTeam() {
        System.out.println("Creating new class of type" + this.getClass().getName());
    }

    public BaseballTeam(String name, int numberOfPlayers, String teamTalisman, String country) {
        super(name, numberOfPlayers, teamTalisman, country);
    }

    @Override
    public void singHymn(){
        System.out.println("Go Go Baseball team");
    }

    public void singHymn(String country){
        System.out.println("Go Go Baseball team from " + country);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
