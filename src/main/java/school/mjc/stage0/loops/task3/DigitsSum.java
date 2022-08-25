package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String numString = ""+t;
        int sum = 0;
        for(int i = 0; i < numString.length(); i++){
            if(numString.charAt(i) != 0 && numString.charAt(i) != '-')
                sum += Integer.parseInt(numString.substring(i, i + 1));
        }
        System.out.println(sum);
    }
}
