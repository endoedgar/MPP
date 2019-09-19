package net.endoedgar;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
	private List<Department> departments;
	
	public static void putValue(Map<Category,Double> dst, Category cat, double value) {
		if(dst.get(cat) != null) {
			if(value > dst.get(cat))
				dst.replace(cat, value);
		} else
			dst.put(cat,value);
	}
	
	public Company(List<Department> departments) {
		super();
		this.departments = departments;
	}
	
	public Map<Category,Double> getMostExpensiveCategoryAndExpenses() {
		Map<Category,Double> listCategories = new HashMap<>();
		
		for(Department d : departments) {
			Map<Category,Double> tmp = d.getMostExpensiveCategoryValue();
			for (Map.Entry<Category,Double> entry : tmp.entrySet()) {
				Company.putValue(listCategories, entry.getKey(), entry.getValue());
			}
		}
		return listCategories;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Someguy");
		ManagerPosition pp = new ManagerPosition("Director", null, p1);
		Person p2 = new Person("OtherGuy");
		FulltimePosition pp2 = new FulltimePosition("Developer", pp, p2);
		Person p3 = new Person("NewUnfortunateIntern");
		Position pp3 = new InternPosition("Junior", pp, p3);
		
		Category hotelCategory = new Category("Hotel");
		Category gasCategory = new Category("Gas");
		Category entertainmentCategory = new Category("Entertainment");
		
		ExpenseClaim ec = new ExpenseClaim(Arrays.asList(
					new ExpenseRecord(hotelCategory, "yeah some traveling", 222.0d, new Date()),
					new ExpenseRecord(gasCategory, "yeah some traveling", 82.0d, new Date())
				), (FulltimePosition)p2.getPositions().get(0), null);
		
		ExpenseClaim ec2 = new ExpenseClaim(Arrays.asList(
				new ExpenseRecord(entertainmentCategory, "yeah some entertainment", 22.0d, new Date()),
				new ExpenseRecord(hotelCategory, "yeah some hotels", 822.0d, new Date())
			), (FulltimePosition)p2.getPositions().get(0), null);
		
		pp2.getExpenseClaims().add(ec);
		pp2.getExpenseClaims().add(ec2);
		
		Company c = new Company(Arrays.asList(
				new Department("IT", Arrays.asList(
						p1,p2,p3
				)
		)));
		
		System.out.println(c.getMostExpensiveCategoryAndExpenses());
	}
}
