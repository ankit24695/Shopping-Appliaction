//package com.shopping.module;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//
//import lombok.Data;
//
//@Entity
//@Data
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer orderId;
//    private LocalDate localDate;
//    private String status;
//    
//    @OneToOne
//    private Customer customer;
//    
//    @OneToOne
//    private Cart cart;
//
//	
//
//	
//    
//    
//	
//}
