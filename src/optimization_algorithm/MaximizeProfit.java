package optimization_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaximizeProfit {

	private List<MyObject> objects;
	private int[] solution;

	public MaximizeProfit() {
		MyObject obj1 = new MyObject(1, 400, 200);
		MyObject obj2 = new MyObject(2, 500, 200);
		MyObject obj3 = new MyObject(3, 700, 300);
		MyObject obj4 = new MyObject(4, 900, 400);
		MyObject obj5 = new MyObject(5, 600, 400);

		objects = new ArrayList<>();
		objects.add(obj1);
		objects.add(obj2);
		objects.add(obj3);
		objects.add(obj4);
		objects.add(obj5);

		this.solution = new int[objects.size()];
	}

	public void maximizeProfit(Vehicle v) {
		showObjects();
		System.out.println();
		Collections.sort(objects, Comparator.comparingDouble(MyObject::getMostValuabe).reversed());
		for (MyObject o : objects) {
			if (o.getWeigth() <= v.getCapacity()) {
				solution[o.getId() - 1] = 1;
				v.insertObject(o);
				v.setCapacity(v.getCapacity() - o.getWeigth());
			}
		}

		v.showObjects();
		System.out.println();
		showSolution();
		System.out.println();
		System.out.println("LUCRO TOTAL = R$" + getTotalProfit(v));
	}

	public void showObjects() {
		System.out.println("Lista de Objetos:");
		for (MyObject o : objects) {
			System.out.print(" " + o.getId() + "(" + (o.getMostValuabe()) + ") |");
		}
		System.out.println();
	}

	public void showSolution() {
		System.out.println("VETOR SOLUÇÃO:");
		for (int i = 0; i < solution.length; i++) {
			System.out.print(solution[i] + " | ");
		}
		System.out.println();
	}

	public Double getTotalProfit(Vehicle v) {
		Double totalProfit = 0.0;
		for (int i = 0; i < v.getObjects().size(); i++) {
			totalProfit += v.getObjects().get(i).getProfit();
		}
		return totalProfit;
	}

}
