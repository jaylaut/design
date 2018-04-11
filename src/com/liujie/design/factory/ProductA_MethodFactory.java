package com.liujie.design.factory;

import com.liujie.deisgn.abstactClass.Product_MethodFactory;

/** 
* @ClassName: ProductA_MethodFactory 
* @Description: 产品具体类
* @author 刘杰
* @date 2018年4月11日 上午10:48:26 
*  
*/
public class ProductA_MethodFactory extends Product_MethodFactory {

	public ProductA_MethodFactory(){
		System.out.println("制造具体产品A");
	}
}
