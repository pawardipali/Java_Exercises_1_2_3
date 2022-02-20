package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FootballTeam implements Team{
    String teamName;
    int points;
    String sponsor;
    String result;
    String sportsTeam;
    String line = "";
    String splitBy = ",";
    ArrayList<Team> content=new ArrayList<>();
    public FootballTeam(String teamName, int points, String sponsor,String result) {
        this.teamName = teamName;
        this.points = points;
        this.sponsor = sponsor;
        this.result=result;
    }
public FootballTeam(){

}
    @Override
    public void updatePoints() {
         List<Team> teamResult=new ArrayList<>();
        try {
            BufferedReader brFirst = new BufferedReader(new FileReader("C:/Users/lenovo/JavaExercise3/src/main/resources/teams.csv"));
            BufferedReader brSecond = new BufferedReader(new FileReader("C:/Users/lenovo/JavaExercise3/src/main/resources/results.csv"));
            while ((line = brFirst.readLine()) != null)
            {
                String[] team = line.split(splitBy);
                String sports = team[0];

                String teamName = team[1];
                String result=team[2];

                int points = Integer.parseInt(team[2]);

                Team t = new BasketballTeam(sports, teamName, points+3,result);
                content.add(t);

            }
            while ((line = brSecond.readLine()) != null)
            {
                String[] result = line.split(splitBy);
                String teamName = result[0];
                String res = result[1];
                String team=result[2];
                Team t22=new BasketballTeam(teamName,res,team);
                teamResult.add(t22);
            }


            List<Team> FootballTeamList= content.stream().filter(article -> article.getSportsTeam().contains("Football")).collect(Collectors.toList());
            List<Team> newlist= teamResult.stream().filter(article -> article.getSportsTeam().contains("Football")).collect(Collectors.toList());

            FootballTeamList.sort(Comparator.comparing(Team::getPoints));
            System.out.println("Football Team List is :");
            for (Team tm : FootballTeamList) {

                System.out.println("Team Name : "+ tm.getTeamName()+" and " + " Team Points : "+tm.getPoints());

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }



    }

    @Override
    public String getTeamName() {
        return this.teamName;

    }

    @Override
    public int getPoints() {
       return points;

    }
 public String getResult() {
        return result;
   }
public void getFootballTeam(){
    try {
        BufferedReader brFirst = new BufferedReader(new FileReader("C:/Users/lenovo/JavaExercise3/src/main/resources/teams.csv"));
        while ((line = brFirst.readLine()) != null)
        {

            String[] team = line.split(splitBy);
            String sports = team[0];

            String teamName = team[1];
            String result=team[2];

            int points = Integer.parseInt(team[2]);

            Team t = new BasketballTeam(sports, teamName, points,result);

            content.add(t);

        }
        List<Team> FootballTeamList= content.stream().filter(article -> article.getSportsTeam().contains("Football")).collect(Collectors.toList());

        FootballTeamList.sort(Comparator.comparing(Team::getPoints));
        System.out.println("Football Team List is :");
        for (Team tm : FootballTeamList) {

            System.out.println("Team Name : "+ tm.getTeamName()+" and " + " Team Points : "+tm.getPoints());

        }
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
}
    @Override
    public String getSportsTeam() {
        return sportsTeam;
    }
}
