/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2album;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author tgrady4
 */
public class U2Album {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate JoshuaTree = LocalDate.of(1987, 3 , 9);
        LocalDate RattleAndHum = LocalDate.of(1988, 10 , 10);
        LocalDate currentDate = LocalDate.now();
        Period howLong = Period.between(JoshuaTree, currentDate);
        Period difference = Period.between(JoshuaTree, RattleAndHum);
        System.out.println(howLong.getYears() + " years " + howLong.getMonths() + " months " + howLong.getDays() + " days have passed since the release of U2's album of The Joshua Tree.\n");
        System.out.println("The difference between the album Joshua Tree and Rattle And Hum is " + difference.getYears() + " year " + difference.getMonths() + " months and " + difference.getDays()+ " days.\n");
        LocalDate newAlbum = RattleAndHum.plus(difference);
        System.out.println("If another album was released in the same time after Rattle And Hum it would be: " + newAlbum);
    }
    
}
