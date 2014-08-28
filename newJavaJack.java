
import java.util.Random;
public class newJavaJack {

  private double account, randomNum, guessNumber, dollar, bank, saved;
  Random gen = new Random();
 
public void setBet(double bet){
dollar = bet;  
}

public void setAccount(double bet){
account = 100;  
}

 
 public double getWin(){ //method
randomNum = gen.nextInt (2) + 1; // ganarates a random number from 1-100
     
if (guessNumber == randomNum)
account = account+dollar;
else 
account = account-dollar;


return account;

}
  
public double getResult(double intAccount){
return intAccount;  
}

}
