
/**
 * Write a description of class Numero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Numero
{
   private long n;
   public long serie1(int n){
       int num1;
       int num2;
       int num3;
       int num4;
       int num5;
       num1 = 1;
       System.out .print (num1+" ");
       num2 = 0;
       num3 = 0;
       num4 = 0;
       num5 = 0;
       int i;
       for(i=0;i<=n;i++){
           num2 = num1 + 1;
           System.out .print (num2+" ");
           num3 = num2 + 2;
           System.out .print (num3+" ");
           num4 = num3 + 3;
           System.out .print (num4+" ");
           num5 = num4 + 2;
           System.out .print (num5+" ");
           
           num1=num5;
        }
       return n;
    }
    /*
     *   1     2    4    7    9    10    12    15    17     18 
     * num1  num2  num3 num4 num5
    */
   public long serie2 (int n){
        int num1;
        int num2;
        int num3;
        int numRes;
        num1 = 1;
        System.out .print (num1+" ");
        num2 = 1;
        System.out .print (num2+" ");
        num3 = 1;
        System.out .print (num3+" ");
        numRes = 0;
        int i;
        for(i=2; i<=n; i++){
           numRes = num1 + num2;
           System.out .print (numRes+" ");
           num1 = num2;
           num2 = num3;
           num3 = numRes;
        }
        return n;
      }
      /*
       1     1     1     2    2    3     4    5 
           num1  num2  num3    numRes
       */
}
