package net.endoedgar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FulltimePosition extends Position {
	List<ExpenseClaim> expenseClaims;
	
	public FulltimePosition(String name, ManagerPosition managerPosition, Person who) {
		super(name, managerPosition, who);
		this.expenseClaims = new ArrayList<>();
	}

	public List<ExpenseClaim> getExpenseClaims() {
		return expenseClaims;
	}

	public void setExpenseClaims(List<ExpenseClaim> expenseClaims) {
		this.expenseClaims = expenseClaims;
	}
	
	public Category getMostExpensiveCategory() {
		return null;
	}
	
	public Map<Category,Double> getMostExpensiveCategoryValue() {
		Map<Category,Double> listCategories = new HashMap<>();
		
		for(ExpenseClaim p : expenseClaims) {
			Map<Category,Double> tmp = p.getMostExpensiveCategoryValue();
			for (Map.Entry<Category,Double> entry : tmp.entrySet()) {
				Company.putValue(listCategories, entry.getKey(), entry.getValue());
			}
		}
		return listCategories;
	}
	
}
