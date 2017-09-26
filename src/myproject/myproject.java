import java.util.Scanner ;
package myproject;

public class myproject {
 // public int subTotal ;
   // public static int RunningTotal ;
    ///public static int  ItemPrice;
    static int food;static int qty;
   
   public static int pizza;  public static int chik;  public static int coke;
     public static int sum1;  public static int sum2;  public static int sum3;
     public static int qty1;  public static int qty2;  public static int qty3;
   //static boolean ordering=true;
   static Scanner input=new Scanner(System.in) ;
   //
    private static int mfood(int food,int num) {
           
    switch (food) {
        case 1:
            pizza = num;
            sum1 = 50*pizza;
            qty1 = 99;
            break;
        case 2:
            chik = num;
            sum2 = 70*chik;
            qty2 = 99;
            break;
        case 3:
            coke = num;
            sum3 = 120*coke;
            qty3 = 99;
            break;
        default:
            break;
    }
    
return qty1|qty2|qty3;

    }
    public static void main(String[] args) {
        
       System.out.println("-------------Welcome to SKE Restaurant-------------") ;
               
       System.out.println("1) Pizza          250    Baht.") ;
       System.out.println("2) Chikens        120    Baht.") ;
       System.out.println("3) Coke            45    Baht.") ;
       System.out.println("4) Total") ;
       System.out.println("5) Exit" ) ;
       
       do{
System.out.print("Enter your Choice: ");
food = input.nextInt();
if (food==5){
System.out.print("===== Thank You =====");}
else if(food!=4){
System.out.print("Enter Quantity: ");
qty = input.nextInt();
}
System.out.println("");
mfood(food,qty);
if (food==4){
System.out.println("+------ Menu ------+-- Qty --+-- Price --+");
if(qty1==99){
System.out.printf("|Pizza\t           |  %5d  |  %5d    |\n",pizza,sum1);
}
if(qty2==99){
System.out.printf("|Chicken\t   |  %5d  |  %5d    |\n",chik,sum2);
}
if(qty3==99){
System.out.printf("|Coke\t           |  %5d  |  %5d    |\n",coke,sum3);
}
System.out.println("+------------------+---------+-----------+");
System.out.printf("|Total\t\t\t    |  %5d    |\n",sum1+sum2+sum3);
System.out.println("+------------------+---------+-----------+");
System.out.println("");
}
}while(food!=5);
}
}
       
  