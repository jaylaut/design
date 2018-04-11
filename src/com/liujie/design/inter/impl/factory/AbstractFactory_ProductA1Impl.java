package com.liujie.design.inter.impl.factory;

import com.liujie.design.inter.factory.AbstractFactory_ProductA;

/** 
* @ClassName: AbstractFactory_Product1Impl 
* @Description: 抽象工厂模式，产品1接口的实现类1
* @author liujie
* @date 2018年4月11日 上午11:15:27 
*  
*/
public class AbstractFactory_ProductA1Impl implements AbstractFactory_ProductA {
	
	public AbstractFactory_ProductA1Impl(){
		System.out.println("抽象工厂模式：制造产品A1");
	}

}
