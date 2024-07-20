// 2. Write a program to gnrerate Odd numbers from 1 to 100.

package A2;

public class A2{
    public static void main(String[] args) {
        GnerateOddNumber obj = new GnerateOddNumber();
        obj.printOdds();
    }
}

public class GnerateOddNumber{
    void printOdds() {
        for(int i=1;i<=100;i++){
            if(i%2!=0)System.out.println(i);
        }
    
    }
}
