package com.liujie.design.subject;

import java.util.ArrayList;
import java.util.List;

import com.liujie.design.inter.Observer;

public class ConcreteObserver implements Observer {

	//用来存放注册的观察者对象的集合
	private List<Observer> observers = new ArrayList<Observer>();
	
	/** 
	* @Title: attach 
	* @Description: 添加观察者
	* @param @param observer    
	* @return void   
	* @throws 
	* @author
	*/
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	/** 
	* @Title: detach 
	* @Description: 删除观察者 
	* @param @param observer    
	* @return void   
	* @throws 
	* @author
	*/
	public void detach(Observer observer){
		observers.remove(observer);
	}
}
