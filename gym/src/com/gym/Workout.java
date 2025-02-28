package com.gym;

public class Workout {
private String type;
	private String equip;
	private int weights;
	
	private int sets;
	
	private String reason;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEquip() {
		return equip;
	}

	public void setEquip(String equip) {
		this.equip = equip;
	}

	public int getWeights() {
		return weights;
	}

	public void setWeights(int weights) {
		this.weights = weights;
	}

	public int getSets() {
		return sets;
	}

	public void setSets(int sets) {
		this.sets = sets;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "Workout [type=" + type + ", equip=" + equip + ", weights=" + weights + ", sets=" + sets + ", reason="
				+ reason + "]";
	}

	public Workout(String type, String equip, int weights, int sets, String reason) {
		super();
		this.type = type;
		this.equip = equip;
		this.weights = weights;
		this.sets = sets;
		this.reason = reason;
	}
	
}
