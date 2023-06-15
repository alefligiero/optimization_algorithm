package optimization_algorithm;

public class Program {

	public static void main(String[] args) {

		MaximizeProfit optimizeDeliveries = new MaximizeProfit();
		Vehicle truck = new Vehicle(2000);

		optimizeDeliveries.maximizeProfit(truck);
		
	}

}
