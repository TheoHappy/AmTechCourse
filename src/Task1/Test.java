package Task1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static List<Team> teams = new ArrayList<>();
    public static void main(String[] args) {
        createTeams();
        System.out.println("Football teams:");
        for (Team team:teams){
            if (team instanceof FootballTeam){
                System.out.println(team);
            }
        }

        System.out.println("Basketball teams:");
        for (Team team:teams){
            if (team instanceof BasketballTeam){
                System.out.println(team);
            }
        }

        System.out.println("Non football and non basketball teams:");
        for (Team team:teams){
            if ((team instanceof FootballTeam == false) && (team instanceof BasketballTeam == false)){
                System.out.println(team);
            }
        }

    }

    public static void createTeams(){
        Team baseballTeam1 = new BaseballTeam();
        Team baseballTeam2 = new BaseballTeam("Detroit Tigers",25,"lion","USA");
        Team baseballTeam3 = new BaseballTeam("Spartak",25,"bear","Russia");

        Team footballTeam1 = new FootballTeam();
        Team footballTeam2 = new FootballTeam("Arsenal",11,"monkey","Great Britain");
        Team footballTeam3 = new FootballTeam("Real Madrid",11,"snike","Spain");

        Team basketballTeam1 = new BasketballTeam();
        Team basketballTeam2 = new BasketballTeam("Chicago Bulls",5,"mouse","USA");
        Team basketballTeam3 = new BasketballTeam("Spartak",5,"tiger","Russia");

        teams.add(baseballTeam1);
        teams.add(baseballTeam2);
        teams.add(baseballTeam3);
        teams.add(footballTeam1);
        teams.add(footballTeam2);
        teams.add(footballTeam3);
        teams.add(basketballTeam1);
        teams.add(basketballTeam2);
        teams.add(basketballTeam3);

    }
}
