package com.greatlearning.building.stub;

public class FloorDetails {

	private int floorSize;
	private int day;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getFloorSize() {
		return floorSize;
	}

	public void setFloorSize(int floorSize) {
		this.floorSize = floorSize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + floorSize;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FloorDetails other = (FloorDetails) obj;
		if (day != other.day)
			return false;
		if (floorSize != other.floorSize)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[floorSize=" + floorSize + ", day=" + day + "]";
	}

}
