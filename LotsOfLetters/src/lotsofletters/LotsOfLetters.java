/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotsofletters;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;

/**
 *
 * @author tgrady4
 */
public class LotsOfLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        NumberFormat form = NumberFormat.getInstance();
        BigInteger wisconsinPop = new BigInteger("5726398");
        BigInteger californiaPop = new BigInteger("38041430");
        BigInteger texasPop = new BigInteger("26059203");
        BigInteger wiscAndCalPop = wisconsinPop.multiply(californiaPop);
        BigInteger allPops = wiscAndCalPop.multiply(texasPop);
        BigDecimal lotsOfMoney = new BigDecimal (allPops.floatValue() * 3.23);
        System.out.println("Number of letters written by every person in Wisconsin to every person in California is " + form.format(wiscAndCalPop));
        System.out.println("After we make a copy of all of these letters for each person in Texas, you'll get " + form.format(allPops) + " letters.");
        System.out.println("If you pay $3.23 for each leter sent to Texas, you'd pay " + formatter.format(lotsOfMoney));
    }
    
}
