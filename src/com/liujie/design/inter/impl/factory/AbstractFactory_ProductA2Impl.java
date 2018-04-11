package com.liujie.design.inter.impl.factory;

import com.liujie.design.inter.factory.AbstractFactory_ProductA;

/** 
* @ClassName: AbstractFactory_Product2Impl 
* @Description: 抽象工厂模式，产品1接口的实现类2
* @author liujie
* @date 2018年4月11日 上午11:18:35 
*  
*/
public class AbstractFactory_ProductA2Impl implements AbstractFactory_ProductA {

	public AbstractFactory_ProductA2Impl(){
		System.out.println("象工厂模式：制造产品A2");
	}
}
