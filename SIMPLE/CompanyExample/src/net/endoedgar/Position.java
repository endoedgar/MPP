package net.endoedgar;

public abstract class Position {
	private String name;
	private ManagerPosition managerPosition;
	private Person who;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ManagerPosition getManagerPosition() {
		return managerPosition;
	}
	public void setManagerPosition(ManagerPosition managerPosition) {
		this.managerPosition = managerPosition;
	}
	public Person getWho() {
		return who;
	}
	public void setWho(Person who) {
		this.who = who;
	}
	public Position(String name, ManagerPosition managerPosition, Person who) {
		super();
		this.name = name;
		this.managerPosition = managerPosition;
		this.who = who;
		who.getPositions().add(this);
	}
	
	
}
