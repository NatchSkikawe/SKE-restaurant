package restaurant;

import java.util.Scanner;


       public class Restaurant {
        
        static Scanner input = new Scanner(System.in);
	static String[] menuItem;
        static double[] prices;
        static int[] order;
 
       public static void printMenu(){
        RestaurantManager readMenu = new RestaurantManager();
        menuItem = readMenu.getMenuItems();
        prices = readMenu.getPrices();
        System.out.println("+-------- Welcome to SKE Restaurant --------+");
        for(int i = 0; i < menuItem.length; i++){
            System.out.printf("[%d] %s\t%10.2f Baht.\n",i+1, menuItem[i], prices[i]);
        }
        System.out.println("[T]otal");
        System.out.println("[E]xit");
        System.out.println();
        order = new int[menuItem.length];

    }
        
       public static void printTotal() {
        double total=0;
             
     	String prompt = "[T] Total\n" + "[E] Exit";
        
         for (int i = 0; i < menuItem.length; i++) {
            System.out.printf("[%d] %s\t\t%.2f Baht\n", i + 1, menuItem[i], prices[i]);
        }
             System.out.println(prompt);
             System.out.println("+-------------------+-----------+------------------+");
              for(int k = 0; k < menuItem.length; k++){
                total += prices[k]*order[k];
            }
            System.out.printf("| Total                         |\t%11.2f|\n",total);

            System.out.println("+-------------------+-----------+------------------+");
    
    }

       public static boolean isNumber(String word) {
        try {
            Integer.parseInt(word);
            return true;
        } catch(NumberFormatException ex ) {
            return false;
        }
    }

       public static String getOrder(String prompt) {
        System.out.print(prompt);
        return input.nextLine();
    }

       public static void menuSelection() {
        int quantity;
        String choice;
        do{
            choice = getOrder("\nEnter your choice: ");
            if(isNumber(choice)){
                if(Integer.parseInt(choice) <= menuItem.length){
                    quantity = Integer.parseInt(getOrder("Enter Quantity: "));
                    order[Integer.parseInt(choice) - 1] += quantity;
                }
            }else if(choice.equals("T")){
                printTotal();
            }
        }while(!choice.equals("E"));
        System.out.println();
        printTotal();
        System.out.println();
        System.out.println("============== THANK YOU!===========================");
    }

       public static void main(String[] args) {

        printMenu();
        menuSelection();

    }
}
      
    

  
