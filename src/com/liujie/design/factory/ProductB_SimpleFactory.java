package com.liujie.design.factory;

import com.liujie.deisgn.abstactClass.Product_SimpleFactory;

/** 
* @ClassName: ProductB_SimpleFactory 
* @Description:产品B
* @author liujie
* @date 2018年4月11日 上午9:24:14 
*  
*/
public class ProductB_SimpleFactory extends Product_SimpleFactory {

	public ProductB_SimpleFactory(){
		System.out.println("制造产品B");
	}
}
