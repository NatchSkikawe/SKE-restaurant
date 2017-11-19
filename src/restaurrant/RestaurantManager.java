package restaurant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 * This class is for bring  menu.txt in src file to read in next method.
 *
 * @author  Natch Skikawe na wan
 */
 


class RestaurantManager {
   

    public static final String MENU_FILE = "src/data/menu.txt";
    private static String[] menuItems;
    private static double[] prices;
/**
*This method use BufferedReader for reading menu.txt and arrange food list for menu.
*use try statement for throwing an exception,and it will auto exit if program was crash .
*use parseDouble for transform string to double.
 */

    public static String[] getMenuItems() {
        String path = MENU_FILE;
        File file = new File(path);
        try {
            BufferedReader structure = new BufferedReader(new FileReader(file));
            String lineString;
            String[] list;

            int lines = 0;
            int amount = 0;

            while ((lineString = structure.readLine()) != null) {
                 lines += 1;
            }

            structure = new BufferedReader(new FileReader(file));
            prices = new double[lines];
            menuItems = new String[lines];

            while ((lineString = structure.readLine()) != null) {
                list = lineString.split(";", 2);
                String part1 = list[0].trim();
                menuItems[amount] = part1;
                String part2 = list[1].trim();
                prices[amount] = Double.parseDouble(part2);
                amount++;

            }
            structure.close();
        } catch (IOException e) {
            System.out.println("ERROR!!");
            e.printStackTrace();
        }
        return menuItems;
    }
/**
*This method use BufferedReader for reading menu.txt  and arrange food list for menu.
*use try statement for throwing an exception,and it will auto exit if program was crash .
*use parseDouble for transform string to double.
 */
    public static double[] getPrices() {
        String path = MENU_FILE;
        File file = new File(path);
        try {
            BufferedReader structure = new BufferedReader(new FileReader(file));
            String lineString;
            String[] list;

            int lines = 0;
            int amount = 0;

            while ((lineString = structure.readLine()) != null) {
                lines += 1;
            }

            structure = new BufferedReader(new FileReader(file));
            prices = new double[lines];
            menuItems = new String[lines];

            while ((lineString = structure.readLine()) != null) {
                list = lineString.split(";", 2);
                String part1 = list[0].trim();
                menuItems[amount] = part1;
                String part2 = list[1].trim();
                prices[amount] = Double.parseDouble(part2);
                amount++;
            }
            structure.close();
        } catch (IOException e) {
            System.out.println("ERROR!!");
            e.printStackTrace();
        }
        return prices;
    }
}







