import java.util.*;
class UserInputDemo1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your Name, Surname, Date of birth: ");
        String str= sc.nextLine();              //reads string
        System.out.print("Data is censored");
    }
}