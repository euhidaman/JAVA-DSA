package Extras.Codewars;

import java.util.*;

public class complementaryDNA {
    public static void main(String[] args) {
        String dna = "ATTGC";

        StringBuffer n_dna = new StringBuffer(dna);

        for (int i = 0; i < n_dna.length(); i++) {
            if (n_dna.charAt(i) == 'A')
                n_dna.setCharAt(i, 'T');
            else if (n_dna.charAt(i) == 'T')
                n_dna.setCharAt(i, 'A');
            else if (n_dna.charAt(i) == 'C')
                n_dna.setCharAt(i, 'G');
            else if (n_dna.charAt(i) == 'G')
                n_dna.setCharAt(i, 'C');
        }

        System.out.println(n_dna.toString());
    }
}
