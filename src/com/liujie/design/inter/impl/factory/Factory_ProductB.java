package com.liujie.design.inter.impl.factory;

import com.liujie.design.inter.factory.AbstractFactory;
import com.liujie.design.inter.factory.AbstractFactory_ProductA;
import com.liujie.design.inter.factory.AbstractFactory_ProductB;

public class Factory_ProductB implements AbstractFactory {

	@Override
	public AbstractFactory_ProductA createAbstractFactory_ProductA() {
		return new AbstractFactory_ProductA2Impl();
	}

	@Override
	public AbstractFactory_ProductB createAbstractFactory_ProductB() {
		// TODO Auto-generated method stub
		return new AbstractFactory_ProductB2Impl();
	}

}
