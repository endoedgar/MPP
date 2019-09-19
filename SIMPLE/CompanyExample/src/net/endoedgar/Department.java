package net.endoedgar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Department {
	private String name;
	List<Person> employees;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Person> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Person> employees) {
		this.employees = employees;
	}
	public Department(String name, List<Person> employees) {
		super();
		this.name = name;
		this.employees = employees;
	}
	
	public Map<Category,Double> getMostExpensiveCategoryValue() {
		Map<Category,Double> listCategories = new HashMap<>();
		
		for(Person p : employees) {
			Map<Category,Double> tmp = p.getMostExpensiveCategoryValue();
			for (Map.Entry<Category,Double> entry : tmp.entrySet()) {
				Company.putValue(listCategories, entry.getKey(), entry.getValue());
			}
		}
		return listCategories;
	}
	
}
