package com.liujie.design.inter;

import com.liujie.deisgn.abstactClass.Product_MethodFactory;

/** 
* @ClassName: MethodFactory 
* @Description: 工厂方法接口，用于创建产品的抽象类
* @author acer
* @date 2018年4月11日 上午10:53:21 
*  
*/
public interface MethodFactory {

	Product_MethodFactory createProduct_MethodFactory();
}
