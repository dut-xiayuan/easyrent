package me.wuyi.easyrent.bean;

public class User {
	private int id;
	private String username;
	
	public User(){}
	
	public User(int id, String username) {
		this.id = id;
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return username;
	}

	public void setName(String name) {
		this.username = name;
	}

}
