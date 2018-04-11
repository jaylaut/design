package com.liujie.design.factory;

import com.liujie.deisgn.abstactClass.Product_SimpleFactory;

/** 
* @ClassName: ProductOne_SimpleFactory 
* @Description: 产品1
* @author liujie
* @date 2018年4月11日 上午9:22:27 
*  
*/
public class ProductA_SimpleFactory extends Product_SimpleFactory {
	
	public ProductA_SimpleFactory(){
		System.out.println("制造产品A");
	}

}
