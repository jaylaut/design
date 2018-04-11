package com.liujie.design.test;

import com.liujie.deisgn.abstactClass.factory.Product_SimpleFactory;
import com.liujie.design.CommonClass.factory.SimpleFactory;
import com.liujie.design.factory.ProductA_MethodFactory;
import com.liujie.design.factory.ProductB_MethodFactory;
import com.liujie.design.inter.impl.factory.Factory_ProductA;
import com.liujie.design.inter.impl.factory.Factory_ProductB;
import com.liujie.design.inter.impl.factory.MethodFactory_CreateA;
import com.liujie.design.inter.impl.factory.MethodFactory_CreateB;

public class FactoryTest {

	public static void main(String[] args) {
		//简单工厂模式
		testSimpleFactory();
		//工厂方式模式
		//testMethodFactory();

		//抽象工厂模式
		//testAbstractFactory();
	}
	
	/** 
	* @Title: testSimpleFactory 
	* @Description: 简单工厂模式的测试类
	* @param     
	* @return void   
	* @throws 
	* @author
	*/
	public static void testSimpleFactory(){
		SimpleFactory simpleFactory = new SimpleFactory();
		Product_SimpleFactory productA_SimpleFactory = simpleFactory.createProduct(1);
		Product_SimpleFactory productB_SimpleFactory = simpleFactory.createProduct(2);
	}
	
	public static void testMethodFactory(){
		MethodFactory_CreateA methodFactory_CreateA = new MethodFactory_CreateA();
		ProductA_MethodFactory productA_MethodFactory = methodFactory_CreateA.createProduct_MethodFactory();
		
		MethodFactory_CreateB methodFactory_CreateB = new MethodFactory_CreateB();
		ProductB_MethodFactory ProductB_MethodFactory = methodFactory_CreateB.createProduct_MethodFactory();
	}
	
	public static void testAbstractFactory(){
		Factory_ProductA factory_ProductA = new Factory_ProductA();
		factory_ProductA.createAbstractFactory_ProductA();
		factory_ProductA.createAbstractFactory_ProductB();
		
		Factory_ProductB factory_ProductB = new Factory_ProductB();
		factory_ProductB.createAbstractFactory_ProductA();
		factory_ProductB.createAbstractFactory_ProductB();
		
	}

}
