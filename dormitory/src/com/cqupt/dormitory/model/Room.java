package com.cqupt.dormitory.model;
/**
 * 房间类
 * @author Bern
 *
 */
public class Room {
	private int id;	//逻辑主键，自增id
	private int totalBed;	//总共床数
	private int cost;	//费用 元\年
	private String roomNum;	//房间id
	private Floor floor;	//所属楼层
	private int alreadyStay; // hhy 新增属性. 已经入住的人数
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotalBed() {
		return totalBed;
	}
	public void setTotalBed(int totalBed) {
		this.totalBed = totalBed;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public Floor getFloor() {
		return floor;
	}
	public void setFloor(Floor floor) {
		this.floor = floor;
	}
	
}
