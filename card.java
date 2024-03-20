import java.lang.*;
import java.util.*;
abstract class CreditCard
{
    String type;
    String number;
    abstract boolean checkCard();
}

class MasterCard extends CreditCard
{

   MasterCard(String type, String number)
   {
     this.type = type;
     this.number = number;
   }
    
    boolean checkCard()
    {
        if(type.equalsIgnoreCase("mastercard") && (number.charAt(0) == '5') && number.length() == 16)
          return true;
        else
          return false;
    
    }
}

class Visa extends CreditCard
{

   Visa(String type, String number)
   {
     this.type = type;
     this.number = number;
   }
    
    boolean checkCard()
    {
        if(type.equalsIgnoreCase("visa") && (number.charAt(0) == '4') && (number.length() == 13 || number.length() == 16))
          return true;
        else
          return false;
    }
}

class AmericanExpress extends CreditCard
{

   AmericanExpress(String type, String number)
   {
     this.type = type;
     this.number = number;
   }
    
    boolean checkCard()
    {
        if(type.equalsIgnoreCase("americanexpress") && (number.charAt(0) == '3') && (number.charAt(1) == '4' || number.charAt(1) == '5' || number.charAt(1) == '6' || number.charAt(1) == '7') && number.length() == 15)
          return true;
        else
          return false;
    }
}

class Run
{
   public static void main(String []args)
   {
      CreditCard card;
      int n;
      scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      System.out.println(ob1.checkCard());  
   }

}
