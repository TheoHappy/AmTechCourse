package Task1;

public class FootballTeam extends Team {
    public FootballTeam() {
        System.out.println("Creating new class of type" + this.getClass().getName());
    }
    public FootballTeam(String name, int numberOfPlayers, String teamTalisman, String country) {
        super(name, numberOfPlayers, teamTalisman, country);
    }

    @Override
    public void singHymn(){
        System.out.println("Go Go Football team");
    }

    public void singHymn(String country){
        System.out.println("Go Go Football team from " + country);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
