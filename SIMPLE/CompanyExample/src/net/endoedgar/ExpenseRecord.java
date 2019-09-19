package net.endoedgar;

import java.util.Date;

public class ExpenseRecord {
	private Category category;
	private String description;
	private Double amount;
	private Date date;
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ExpenseRecord(Category category, String description, Double amount, Date date) {
		super();
		this.category = category;
		this.description = description;
		this.amount = amount;
		this.date = date;
	}
	
	
}
