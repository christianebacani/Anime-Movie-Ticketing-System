import java.util.Scanner;
public class AnimeMovieTicketingSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int price[] = {180,190,200,210,220,230,240};
        boolean transaction = true;
        
        System.out.print("Welcome to AniFlix Movie Theatre\n");
        
        System.out.print("Username : ");
        String username = input.nextLine();
        
        System.out.print("Password : ");
        String password = input.nextLine();
        
        System.out.print("1.) Buy a movie ticke\n");
        System.out.print("2.) About\n");
        System.out.print("3.) Exit\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                while(transaction){
                    
                System.out.print("\n\tAVAILABLE MOVIES\n\n");
                System.out.print("MOVIESt\t\t\tPRICE\n\n");
                System.out.print("1.) Black Clover\tP 180\n\n");
                System.out.print("2.) How do you live?   P 190\n\n");
                System.out.print("3.) Detective Conan    p 200\n\n");
                System.out.print("4.) Doraemon           P 210\n\n");
                System.out.print("5.) Sailor Moon        P 220\n\n");
                System.out.print("6.) Psycho Pass        P 230\n\n");
                System.out.print("7.) Gridman Universe   P 240\n\n");
                
                System.out.print("Enter your choice here : ");
                int userChoice = input.nextInt();
                
                System.out.print("Enter the quantity : ");
                int quantity = input.nextInt();
                
                total += price[userChoice - 1] * quantity;
                
                System.out.print("Do you want to buy more tickets? (y/n): ");
                input.nextLine();
                String buyMore = input.nextLine();
                
                if(buyMore.equalsIgnoreCase("n")){
                    transaction = false;
                    System.out.print("The total price is : P " + total + "\n");
                    
                    System.out.print("Enter your payment here : ");
                    int payment = input.nextInt();
                    
                    int change = payment - total;
                    
                    System.out.print("Change : P " + change + "\n\n");
                    
                }
                
                
                
                
                }
                
                break;
                
            case 2:
                System.out.print("Welcome to AnimeFlix, the ultimate online destination for anime movie lovers!\n\nAnimeFlix is a smart online movie ticket booking system that allows you to browse, book, and pay for\ntickets for the latest and greatest anime movies in a few easy steps. Whether you are a fan of action,\nromance, comedy, or horror, you will find something to suit your taste on our website.\n\n");
                break;
                
            case 3:
                System.out.print("\n\n---EXITED---\n\n");
                break;
                
            default:
               System.out.print("\n\nINVALID CHOICE!\n\n");
                    
        }
    }
}
