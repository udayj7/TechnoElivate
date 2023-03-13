package com.designpattern;

interface Iphone {
	//Iphone implement Iphones interface that allows
	//them to battery and color adapter interface
	public void battery();
	public void color();
}

class IphoneModel implements Iphone {
	//Concrete implementation of IphoneModel
	@Override
	public void battery() {
		System.out.println("Battery");
	}

	@Override
	public void color() {
		System.out.println("Color");
	}
}

interface Samsung{
	//target interface
	//Samsung dont battery they just make having color
	void model();
}

class SamsungModel implements Samsung{
	
	@Override
	public void model() {
		System.out.println("Model");
	}
}

class AdapterPlug implements Samsung{
//You need to implement the interface your client expects to use
	Iphone iphone;
	public AdapterPlug(Iphone iphone) {
		//We need reference to the object we are adapting
		this.iphone=iphone;
	}
	@Override
	public void model() {
		//translate the methods appropriately
		iphone.color();
		iphone.battery();
	}
}

public class MainClass {
	public static void main(String[] args) {
		
	IphoneModel iphoneModel = new IphoneModel();
	Samsung samsung = new SamsungModel();
	
	//Wrap a Iphone in a AdapterPlug so that it
	//behave like SamsungCharger
	Samsung adapterPlug = new AdapterPlug(iphoneModel);
	
	System.out.println("IPHONE MODEL ....");
	iphoneModel.battery();
	iphoneModel.color();
	
	System.out.println("\nSAMSUNG MODEL...");
	samsung.model();
	
	//Samsung behvaing like a IphoneCharger
	System.out.println("\nAdapterPlug....");
	adapterPlug.model();
	}
}
