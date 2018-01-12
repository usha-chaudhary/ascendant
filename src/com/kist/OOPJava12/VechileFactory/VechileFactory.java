package com.kist.OOPJava12.VechileFactory;

import com.kist.OOPJava12.serviceDept.Vechile;
import com.kist.OOPJava12.serviceDept.Imp.Bus;
import com.kist.OOPJava12.serviceDept.Imp.Space;

public class VechileFactory {

public Vechile getVechile(String vechiletype){
	if(vechiletype==null){
		return null;
	}
	Vechile vechile=null;
	switch (vechiletype) {
	case "Bus":
		vechile=new Bus();
		break;
		
	case "Space":
		vechile = new Space();
		break;

	default:
		new NoSuchVechileFound();
 }
	return vechile;
	
	
}

}
