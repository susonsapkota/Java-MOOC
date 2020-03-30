

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Suson
 */
public class StringUtils {

    public static boolean included(String word, String searched) {
        return word.toUpperCase().contains(searched.trim().toUpperCase());
        // converting all to uppercase so it will be easier to compare
    }

}
