package net.endoedgar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
	private String name;
	private List<Position> positions;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Position> getPositions() {
		return positions;
	}
	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}
	public Person(String name) {
		super();
		this.name = name;
		this.positions = new ArrayList<>();
	}
	
	public Map<Category,Double> getMostExpensiveCategoryValue() {
		Map<Category,Double> listCategories = new HashMap<>();
		
		for(Position p : positions) {
			if(p instanceof FulltimePosition) {
				FulltimePosition fp = (FulltimePosition)p;
				
				Map<Category,Double> tmp = fp.getMostExpensiveCategoryValue();
				for (Map.Entry<Category,Double> entry : tmp.entrySet()) {
					Company.putValue(listCategories, entry.getKey(), entry.getValue());
				}
			}
		}
		return listCategories;
	}
	
	
}
