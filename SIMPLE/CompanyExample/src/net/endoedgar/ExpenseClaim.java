package net.endoedgar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseClaim {
	private List<ExpenseRecord> expenseRecords;
	private FulltimePosition author;
	private InternPosition intern;
	public List<ExpenseRecord> getExpenseRecords() {
		return expenseRecords;
	}
	public void setExpenseRecords(List<ExpenseRecord> expenseRecords) {
		this.expenseRecords = expenseRecords;
	}
	public FulltimePosition getAuthor() {
		return author;
	}
	public void setAuthor(FulltimePosition author) {
		this.author = author;
	}
	public InternPosition getIntern() {
		return intern;
	}
	public void setIntern(InternPosition intern) {
		this.intern = intern;
	}
	public ExpenseClaim(List<ExpenseRecord> expenseRecords, FulltimePosition author, InternPosition intern) {
		super();
		this.expenseRecords = expenseRecords;
		this.author = author;
		this.intern = intern;
		
		author.getExpenseClaims().add(this);
	}
	
	public Map<Category,Double> getMostExpensiveCategoryValue() {
		Map<Category,Double> listCategories = new HashMap<>();
		
		for(ExpenseRecord er : expenseRecords) {
			Company.putValue(listCategories, er.getCategory(), er.getAmount());
		}
		
		return listCategories;
	}
	
	
}
