package PC;

import java.util.*;

public class trial {

    public static void main(String[] args) {
        String str = "abqkec hello";

        String[] res = str.split("\\s");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}