package Task1;

public abstract class Team {
    private String name;
    private int numberOfPlayers;
    private String teamTalisman;
    private String country;

    public Team() {
    }

    public Team(String name, int numberOfPlayers, String teamTalisman, String country) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.teamTalisman = teamTalisman;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getTeamTalisman() {
        return teamTalisman;
    }

    public void setTeamTalisman(String teamTalisman) {
        this.teamTalisman = teamTalisman;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void singHymn(){ }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", teamTalisman='" + teamTalisman + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
