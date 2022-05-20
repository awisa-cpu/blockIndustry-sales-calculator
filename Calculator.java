public class Calculator {

     double pricePerHollowBlock = 235.0;
     double pricePerLabourer = 1400.0;
     double pricePerBlockLoading = 10.0;
     double pricePerCementBag = 4000.0;

    public  double getPricePerHollowBlock() {
        return pricePerHollowBlock;
    }

    public  void setPricePerHollowBlock(double pricePerHollowBlock) {
        this.pricePerHollowBlock = pricePerHollowBlock;
    }

    public  double getPricePerLabourer() {
        return pricePerLabourer;
    }

    public void setPricePerLabourer(double pricePerLabourer) {
        this.pricePerLabourer = pricePerLabourer;
    }

    public  double getPricePerBlockLoading() {
        return pricePerBlockLoading;
    }

    public  void setPricePerBlockLoading(double pricePerBlockLoading) {
        this.pricePerBlockLoading = pricePerBlockLoading;
    }

    public  double getPricePerCementBag() {
        return pricePerCementBag;
    }

    public  void setPricePerCementBag(double pricePerCementBag) {
        this.pricePerCementBag = pricePerCementBag;
    }


    public  double[] calculateProfit(int blockQuantity, int cementBagsUsed, double vehiclePerBlock) {

        double totalBlockPrice = blockQuantity * pricePerHollowBlock;
        double totalVehiclePerOutsourceCost = blockQuantity * vehiclePerBlock;
        double totalLabourerCost = cementBagsUsed * pricePerLabourer;
        double totalBlockLoadingCost = blockQuantity * pricePerBlockLoading;
        double totalCementCost = cementBagsUsed * pricePerCementBag;
        double finalProfit = totalBlockPrice - (totalVehiclePerOutsourceCost + totalLabourerCost + totalBlockLoadingCost + totalCementCost);

        double[] salesDetails = new double[6];
        salesDetails[0] = totalBlockPrice;
        salesDetails[1] = totalVehiclePerOutsourceCost;
        salesDetails[2] = totalLabourerCost;
        salesDetails[3] = totalBlockLoadingCost;
        salesDetails[4] = totalCementCost;
        salesDetails[5] = finalProfit;
        return  salesDetails;

    }


    public  double[] calculateProfit(int blockQuantity, int cementBagsUsed) {
        double totalBlockPrice = blockQuantity * pricePerHollowBlock;
        double totalLabourerCost = cementBagsUsed * pricePerLabourer;
        double totalBlockLoadingCost = blockQuantity * pricePerBlockLoading;
        double totalCementCost = cementBagsUsed * pricePerCementBag;
        double finalProfit = totalBlockPrice - (totalLabourerCost + totalBlockLoadingCost + totalCementCost);

        double[] salesDetails = new double[5];
        salesDetails[0] = totalBlockPrice;
        salesDetails[1] = totalLabourerCost;
        salesDetails[2] = totalBlockLoadingCost;
        salesDetails[3] = totalCementCost;
        salesDetails[4] = finalProfit;
        return  salesDetails;
    }
}
