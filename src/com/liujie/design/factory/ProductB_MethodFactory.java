package com.liujie.design.factory;

import com.liujie.deisgn.abstactClass.Product_MethodFactory;

/** 
* @ClassName: ProductB_MethodFactory 
* @Description:具体产品B 
* @author liujie
* @date 2018年4月11日 上午10:49:15 
*  
*/
public class ProductB_MethodFactory extends Product_MethodFactory {

	public ProductB_MethodFactory(){
		System.out.println("制造具体产品B");
	}
}
