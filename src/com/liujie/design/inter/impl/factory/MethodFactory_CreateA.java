package com.liujie.design.inter.impl.factory;

import com.liujie.design.factory.ProductA_MethodFactory;
import com.liujie.design.inter.factory.MethodFactory;

/** 
* @ClassName: MethodFactory_CreateA 
* @Description: 创建工厂类 
* @author liujie
* @date 2018年4月11日 上午10:55:37 
*  
*/
public class MethodFactory_CreateA implements MethodFactory {

	@Override
	public ProductA_MethodFactory createProduct_MethodFactory() {
		
		return new ProductA_MethodFactory();
	}

}
