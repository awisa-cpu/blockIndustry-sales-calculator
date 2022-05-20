import java.util.Scanner;

public class PurchaseCalculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Block Quantity to be sold");
        int blockQuantity = scan.nextInt();
        System.out.println("Enter Total Bags of Cement Used");
        int cementBagQuantity = scan.nextInt();

        System.out.println("Are you outsourcing vehicle? (Enter 1 for yes or 2 for No)");
        int vehiceOutsource = scan.nextInt();

        if (vehiceOutsource == 1) {
            System.out.println("Enter price for outsourcing a vehicle per block");
            double vehiclePerBlockOutsource = scan.nextDouble();
            double[] salesDetails = calculator.calculateProfit(blockQuantity, cementBagQuantity, vehiclePerBlockOutsource);
            System.out.println(
                    ".................SALES_REPORT......................."+
                            "\nQuantity of Block Sold ="+blockQuantity+
                            "\nTotal Bags of Cement Used ="+cementBagQuantity+
                            "\nPrice Per Hollow Block = #"+calculator.getPricePerHollowBlock()+
                            "\nTotal Block Price = #"+salesDetails[0]+
                            "\n.................................................."+
                            "\n...............DEDUCTIONS (COST)...................."+
                            "\nCost For Vehicle = #"+salesDetails[1]+
                            "\nCost For Labourers = #"+salesDetails[2]+
                            "\nCost For Loading of Block = #"+salesDetails[3]+
                            "\nTotal Cement Cost = #"+salesDetails[4]+
                            "\n..................................................."+
                            "\nFinal Profit After Subtracting Deductions=#"+salesDetails[5]

            );
        } else if (vehiceOutsource == 2){
            double[] salesDetails = calculator.calculateProfit(blockQuantity, cementBagQuantity);
            System.out.println(
                    ".................SALES_REPORT......................"+
                            "\nQuantity of Block Sold ="+blockQuantity+
                            "\nTotal Bags of Cement Used ="+cementBagQuantity+
                            "\nPrice Per Hollow Block = #"+calculator.getPricePerHollowBlock()+
                            "\nTotal Block Price = #"+salesDetails[0]+
                            "\n.................................................."+
                            "\n...............DEDUCTIONS (COST)...................."+
                            "\nCost For Labourers = #"+salesDetails[1]+
                            "\nCost For Loading of Block = #"+salesDetails[2]+
                            "\nTotal Cement Cost = #"+salesDetails[3]+
                            "\n..................................................."+
                            "\nFinal Profit After Subtracting Deductions=#"+salesDetails[4]

            );
        }else{
            System.out.println("Wrong entry, restart program.");
        }
    }
}
