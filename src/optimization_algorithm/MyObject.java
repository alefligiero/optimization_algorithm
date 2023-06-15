package optimization_algorithm;

public class MyObject {

	private Integer id;
	private Integer weigth;
	private Integer profit;
	
	public MyObject() {
		
	}

	public MyObject(Integer id, Integer weigth, Integer profit) {
		this.id = id;
		this.weigth = weigth;
		this.profit = profit;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(Integer weigth) {
		this.weigth = weigth;
	}

	public Integer getProfit() {
		return profit;
	}

	public void setProfit(Integer profit) {
		this.profit = profit;
	}
	
	public Double getMostValuabe() {
		return (double)profit / weigth;
	}

}
