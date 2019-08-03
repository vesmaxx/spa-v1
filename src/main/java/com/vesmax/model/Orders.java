package com.vesmax.model;
// Generated Aug 3, 2019 10:57:36 AM by Hibernate Tools 5.1.7.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Orders generated by hbm2java
 */
@Entity
@Table(name = "orders", schema = "dbo", catalog = "Qlspa")
public class Orders  {

	private Integer id;
	private Services services;
	private Users users;
	private Integer number;
	private Date times;
	private Integer orderStatus;
	private Set<StaffsOrder> staffsOrders = new HashSet<StaffsOrder>(0);

	public Orders() {
	}

	public Orders(Services services, Users users, Integer number, Date times, Integer orderStatus,
			Set<StaffsOrder> staffsOrders) {
		this.services = services;
		this.users = users;
		this.number = number;
		this.times = times;
		this.orderStatus = orderStatus;
		this.staffsOrders = staffsOrders;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "services_Id")
	public Services getServices() {
		return this.services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "users_Id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "number")
	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "times", length = 23)
	public Date getTimes() {
		return this.times;
	}

	public void setTimes(Date times) {
		this.times = times;
	}

	@Column(name = "order_status")
	public Integer getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
	public Set<StaffsOrder> getStaffsOrders() {
		return this.staffsOrders;
	}

	public void setStaffsOrders(Set<StaffsOrder> staffsOrders) {
		this.staffsOrders = staffsOrders;
	}

}
