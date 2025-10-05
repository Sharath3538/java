class Material{
public Material(){
this("GasCylinder");
System.out.println("its a default constructor");
}
public Material (String materialName){
	this("GasCylinder",680);
System.out.println("name of the material is="+materialName);

}
public Material(String materialName,int price){
	this("GasCylinder",680,7.1f);
System.out.println("name of the material is="+materialName);
System.out.println("material price is="+price);

}
public Material(String materialName,int price,float qualityPer){
	this("GasCylinder",680,7.1f,9833934939l);
System.out.println("name of the material is="+materialName);
System.out.println("material price is="+price);
System.out.println("material quality percentage is="+qualityPer);

}
public Material(String materialName,int price,float qualityPer,long ownerPhoneNum){
	this("GasCylinder",680,7.1f,9833934939l,8500);
System.out.println("name of the material is="+materialName);
System.out.println("material price is="+price);
System.out.println("material quality percentage is="+qualityPer);
System.out.println("material owner Phone Number is="+ownerPhoneNum);

}
public Material(String materialName,int price,float qualityPer,long ownerPhoneNum,double onlineprice){
	this("GasCylinder",680,7.1f,9833934939l,8500,true);
System.out.println("name of the material is="+materialName);
System.out.println("material price is="+price);
System.out.println("material quality percentage is="+qualityPer);
System.out.println("material owner Phone Number is="+ownerPhoneNum);
System.out.println("material online price is="+onlineprice);

}
public Material(String materialName,int price,float qualityPer,long ownerPhoneNum,double onlineprice,boolean superqualityisthere){
	this("GasCylinder",680,7.1f,9833934939l,8500,true,'M');
System.out.println("name of the material is="+materialName);
System.out.println("material price is="+price);
System.out.println("material quality percentage is="+qualityPer);
System.out.println("material owner Phone Number is="+ownerPhoneNum);
System.out.println("material online price is="+onlineprice);
System.out.println("material purchase is super quality is there="+superqualityisthere);

}
public Material(String materialName,int price,float qualityPer,long ownerPhoneNum,double onlineprice,boolean superqualityisthere,char firstLetter){
System.out.println("name of the material is="+materialName);
System.out.println("material price is="+price);
System.out.println("material quality percentage is="+qualityPer);
System.out.println("material owner Phone Number is="+ownerPhoneNum);
System.out.println("material online price is="+onlineprice);
System.out.println("material purchase is super quality is there="+superqualityisthere);
System.out.println("name first letter is="+firstLetter);
}
}