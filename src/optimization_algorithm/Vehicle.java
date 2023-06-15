package optimization_algorithm;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

	private Integer capacity;
	private List<MyObject> objects;

	public Vehicle() {

	}

	public Vehicle(Integer capacity) {
		this.capacity = capacity;
		this.objects = new ArrayList<>();
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public List<MyObject> getObjects() {
		return objects;
	}

	public Double totalMass() {
		Double totalMass = 0.0;
		for (MyObject o : objects) {
			totalMass += o.getWeigth();	
		}
		return totalMass;
	}
	
	public void insertObject(MyObject o) {
		objects.add(o);
	}
	
	public void showObjects() {
		System.out.println("Lista de Objetos Carregados:");
		for (MyObject o : objects) {
			System.out.print(" "+ o.getId() + "(" + o.getMostValuabe() + ") | ");
		}
		System.out.println();
	}
}
