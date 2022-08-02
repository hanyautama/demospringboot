package com.catur.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class Book {

	private Integer id;
        
	private long balance;

        public long getBalance() {
            return balance;
        }

        public void setBalance(long balance) {
            this.balance = balance;
        }
        
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



}