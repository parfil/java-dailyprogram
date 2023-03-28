import java.util.Scanner;
import java.util.regex.*;


class loginwithregex
{
   public static void main(String args[])
   {
        Scanner bs=new Scanner(System.in);
        String username,pwd,mob;
        System.out.println("-----------Login Page----------");
        System.out.println("Enter username : ");
        username=bs.nextLine();
        System.out.println("Enter Password : ");
        pwd=bs.nextLine();
        System.out.println(" Enter Mobile number ; ");
        mob=bs.nextLine();
        
        if(Pattern.matches("[a-zA-Z@]{4,}",username))
        {
           if(Pattern.matches("[a-zA-Z0-9]{6,}",pwd))
             {
                  if(Pattern.matches("[a-zA-Z0-9]{10}",mob))
                     {
                       if(pwd.equals("123456789"))
                          {
                             System.out.println("Login success");
                          }
                          else{
                                 System.out.println("wrong password");
                              }
                      }
                      else{
                      System.out.println("password is not valid");
                      }
         }
         else{
                System.out.println("username is not valid");
             }
       }
   }
}