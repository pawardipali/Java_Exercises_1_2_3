package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BasketballTeam implements Team{
    String teamName;
    int points;
    String sportsTeam;
    String line = "";
    String splitBy = ",";
    String result;
    ArrayList<Team> content=new ArrayList<>();

    public BasketballTeam(String sportsTeam, String teamName, int points, String result) {
        this.teamName = teamName;
        this.points = points;
        this.sportsTeam=sportsTeam;
        this.result=result;
    }
  public BasketballTeam(){

  }

    public BasketballTeam(String teamName, String result,String sportsTeam) {
        this.teamName = teamName;
        this.result = result;
        this.sportsTeam=sportsTeam;
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

                Team t = new BasketballTeam(sports, teamName, points+2,result);
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


            List<Team> basketballTeamList= content.stream().filter(article -> article.getSportsTeam().contains("Basketball")).collect(Collectors.toList());
            List<Team> newlist= teamResult.stream().filter(article -> article.getSportsTeam().contains("Basketball")).collect(Collectors.toList());


            basketballTeamList.sort(Comparator.comparing(Team::getPoints));
            System.out.println("BasketBall Team List is :");

            for (Team tm : basketballTeamList) {
                System.out.println("Team Name : " + tm.getTeamName() + " Team Points : " + tm.getPoints());
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }

    @Override
    public String getTeamName() {
        return  this.teamName;

    }

    @Override
    public int getPoints() {
       return this.points;

    }
    public String getSportsTeam() {
        return sportsTeam;
    }
  public String getResult() {
       return result;
    }
    public void getBasketballTeam(){
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
            List<Team> basketballTeamList= content.stream().filter(article -> article.getSportsTeam().contains("Basketball")).collect(Collectors.toList());
            basketballTeamList.sort(Comparator.comparing(Team::getPoints));
            System.out.println("BasketBall Team List is :");
            for (Team tm : basketballTeamList) {
                System.out.println("Team Name : "+ tm.getTeamName()+" and "+" Team Points : "+tm.getPoints());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    public String toString(){
        return getTeamName() + " "+getPoints()+ " "+getSportsTeam()+" "+getResult();
    }
}
