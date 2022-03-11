package com.aysimasavas.northwind.core.utilities.results;

public class Result {
	private boolean succes;
	private String message;

	public Result(boolean succes) {
		this.succes = succes;
	}

	public Result(boolean succes, String message) {
		this(succes);
		this.message = message;
	}

	public boolean isSucces() {
		return this.succes;
	}

	public String message() {
		return this.message;
	}


}
