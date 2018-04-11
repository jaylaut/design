package com.liujie.design.inter.factory;

/** 
* @ClassName: AbstractFactory 
* @Description: 创建工厂的接口 
* @author liujie
* @date 2018年4月11日 下午3:48:31 
*  
*/
public interface AbstractFactory {

	/** 
	* @Title: createAbstractFactory_ProductA 
	* @Description: 创建产品A 
	* @param @return    
	* @return AbstractFactory_ProductA   
	* @throws 
	* @author
	*/
	public AbstractFactory_ProductA createAbstractFactory_ProductA();
	
	/** 
	* @Title: createAbstractFactory_ProductB 
	* @Description: 创建产品B 
	* @param @return    
	* @return AbstractFactory_ProductB   
	* @throws 
	* @author
	*/
	public AbstractFactory_ProductB createAbstractFactory_ProductB();
}
