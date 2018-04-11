package com.liujie.design.inter.impl;

import com.liujie.deisgn.abstactClass.Product_MethodFactory;
import com.liujie.design.factory.ProductB_MethodFactory;
import com.liujie.design.inter.MethodFactory;

/** 
* @ClassName: MethodFactory_CreateB 
* @Description: 创建工厂类B 
* @author acer
* @date 2018年4月11日 上午10:57:06 
*  
*/
public class MethodFactory_CreateB implements MethodFactory {

	@Override
	public ProductB_MethodFactory createProduct_MethodFactory() {
		return new ProductB_MethodFactory();
	}

}
