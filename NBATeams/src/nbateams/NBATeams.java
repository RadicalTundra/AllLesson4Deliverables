/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbateams;

import java.util.Scanner;

/**
 *
 * @author tgrady4
 */
public class NBATeams {
//private string city, private string name
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hey! What's your favorite NBA team from the Central conference?");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String userTeam = "";
        for(Team t : Team.values()){
            if(t.getCity().length() > 3 && userInput.length() == 3){
                if(userInput.equalsIgnoreCase(t.getCity().substring(0, 3))){
                    userTeam = t.getCity() + " " + t.getTeamName();
                }
            }
            else{
                if(userInput.equalsIgnoreCase(t.getCity())){
                    userTeam = t.getCity() + " " + t.getTeamName();
                }
            }
            if(t.getTeamName().length() > 3 && userInput.length() == 3){
                if(userInput.equalsIgnoreCase(t.getTeamName().substring(0, 3))){
                    userTeam = t.getCity() + " " + t.getTeamName();
                }
            }
            else{
                if(userInput.equalsIgnoreCase(t.getTeamName())){
                    userTeam = t.getCity() + " " + t.getTeamName();
                }
            }
        }
        System.out.println(userTeam);
    }
    
    public enum Team {  
        BUCKS ("Milwaukee", "Bucks"),
        PACERS ("Indiana", "Pacers"),
        BULLS ("Chicago", "Bulls"),
        CAVALIERS ("Cleveland", "Cavaliers"),
        PISTONS ("Detriot", "Pistons");
        
        private String city, name;
        private Team(String city, String name){
            this.city = city;  
            this.name = name;
        }
        public String getCity(){
            return city;
        }
        public String getTeamName(){
            return name;
        }
    }
    
}
