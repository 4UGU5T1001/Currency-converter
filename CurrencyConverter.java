//START
import java.util.Scanner;
public class CurrencyConverter
{
    public static void main(String[] args)
    { 
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Welcome to the Currency Converter");
            System.out.println("Please choose any one of the available conversions"); //users must input only numerical values of the corresponding conversion type
            System.out.println("1. USD to INR"+"\t"+"4. INR to USD"+"\t"+"7. EUR to USD"+"\t"+"10. GBP to USD");
            System.out.println("2. USD to EUR"+"\t"+"5. INR to EUR"+"\t"+"8. EUR to INR"+"\t"+"11. GBP to EUR");
            System.out.println("3. USD to GBP"+"\t"+"6. INR to GBP"+"\t"+"9. EUR to GBP"+"\t"+"12. GBP to INR");
            System.out.println("\n"+"More conversions available soon"+"\n"+"Please note that the conversion rates are not real time");
            System.out.println("\n"+"Last updated on 27/04/2024 at 10:22am"); //stay tuned
            System.out.println("Choose any one of the following conversions from above");
            int choice=sc.nextInt(); //choice taker
            System.out.println("Enter the amount to be converted");
            double amount=sc.nextDouble(); //input amount
            double finalamount=0.0; //initial value
            switch(choice)
            {
                case 1:
                finalamount = USDINR(amount); //USD TO INR
                break;
                case 2:
                finalamount = USDEUR(amount); //USD TO EUR
                break;
                case 3:
                finalamount = USDGBP(amount); //USD TO GBP
                break;
                case 4:
                finalamount = INRUSD(amount); //INR TO USD
                break;
                case 5:
                finalamount = INREUR(amount); //INR TO EUR
                break;
                case 6:
                finalamount = INRGBP(amount); //INR TO GBP
                break;
                case 7:
                finalamount = EURUSD(amount); //EUR TO USD
                break;
                case 8:
                finalamount = EURINR(amount); //EUR TO INR
                break;
                case 9:
                finalamount = EURGBP(amount); //EUR TO GBP
                break;
                case 10:
                finalamount = GBPUSD(amount); //GBP TO USD
                break;
                case 11:
                finalamount = GBPEUR(amount); //GBP TO EUR
                break;
                case 12:
                finalamount = GBPINR(amount); //GBP TO INR
                break;
                default:
                System.out.println("Invalid choice"); //incase the user inputs an invalid choice
            }
            System.out.println("Converted amount: " + finalamount); //result
            System.out.println("Press 1 to restart, press 0 to end"); //restarter
            int choice1=sc.nextInt();
            if(choice1==0)
            {
                System.exit(0);
            }
            else
            {
                main(args);
            }
        }
    }
    //ACTUAL CONVERSIONS
    public static double USDINR(double amount)
    {
        double rate = 83.40;
        return amount * rate;
    }
    public static double USDEUR(double amount)
    {
        double rate = 0.93;
        return amount * rate;
    }
    public static double USDGBP(double amount)
    {
        double rate = 0.80;
        return amount * rate;
    }
    public static double INRUSD(double amount)
    {
        double rate = 0.012;
        return amount * rate;
    }
    public static double INREUR(double amount)
    {
        double rate = 0.011;
        return amount * rate;
    }
    public static double INRGBP(double amount)
    {
        double rate = 0.0096;
        return amount * rate;
    }
    public static double EURUSD(double amount)
    {
        double rate = 1.07;
        return amount * rate;
    }
    public static double EURINR(double amount)
    {
        double rate = 89.25;
        return amount * rate;
    }
    public static double EURGBP(double amount)
    {
        double rate = 0.86;
        return amount * rate;
    }
    public static double GBPUSD(double amount)
    {
        double rate = 1.25;
        return amount * rate;
    }
    public static double GBPEUR(double amount)
    {
        double rate = 1.17;
        return amount * rate;
    }
    public static double GBPINR(double amount)
    {
        double rate = 104.15;
        return amount * rate;
    }
}
//END

   