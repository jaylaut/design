package com.liujie.design.CommonClass;

import com.liujie.deisgn.abstactClass.Product_SimpleFactory;
import com.liujie.design.factory.ProductA_SimpleFactory;
import com.liujie.design.factory.ProductB_SimpleFactory;

/** 
* @ClassName: SimpleFactory 
* @Description: 工厂类
* @author liujie
* @date 2018年4月11日 上午9:27:25 
*  
*/
public class SimpleFactory {
	
	public Product_SimpleFactory createProduct(int type){
		switch (type){
			case 1 :
				return new ProductA_SimpleFactory();
			case 2 :
				return new ProductB_SimpleFactory();
				
			default	:
				break;
		}
		return null;
	}

}
