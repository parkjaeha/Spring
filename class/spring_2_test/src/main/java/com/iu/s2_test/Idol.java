package com.iu.s2_test;

public class Idol {

	private String team;
	private int members;
	
	
	public Idol() {
		// TODO Auto-generated constructor stub
	}
	
	public Idol(String team, int members) {
		// TODO Auto-generated constructor stub
		this.team =  team;
		this.members = members;
		
	}
	
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getMembers() {
		return members;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	
	
}
