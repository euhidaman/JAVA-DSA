import java.util.*;

public class removePrimes {

    public static void solution(ArrayList<Integer> al){
        // write your code here
        for (int i = al.size()-1; i >=0  ; i--) {
            int val = al.get(i);
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(val); j++)
            {
                if(val%j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                al.remove(i);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }

}