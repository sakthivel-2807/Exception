package exception;

import java.util.ArrayList;

public class UseAc {
	public static void main (String[]args) throws NoWarrantyException {
		Ac a1=new Ac("daikin","inverter",45000,12);
		Ac a2=new Ac("LG","normal",48000,6);
		Ac a3=new Ac("tata","inverter",42000,6);
		Ac a4=new Ac("samsang","normal",38000,8);
		Ac a5=new Ac("carrier","normal",39000,0);
		ArrayList<Ac> acs=new ArrayList<>();
		acs.add(a1);
		acs.add(a2);
		acs.add(a3);
		acs.add(a4);
		acs.add(a5);
		for(Ac i:acs) {
		  if(i.getNoofmonthWarranty()>0) {	
			  System.out.println(i.getBrand()+" good to buy");
		  }
		  else {
		     throw new NoWarrantyException("not a warranty one");
		  }
		  System.out.println("done");
			
			
		}
		
	}

}
