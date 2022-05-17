package lev1_2;

public class HarshadNumber {
    public boolean isHarshad(int num){
        String[] temp = String.valueOf(num).split("");

        int sum = 0;
        for(String s : temp){
            sum += Integer.parseInt(s);
        }
        if(num % sum == 0){
            return true;
        }else {
            return false;
        }

        }
    public static void main(String[] args){
        HarshadNumber sn = new HarshadNumber();
        System.out.println(sn.isHarshad(18));
    }
}