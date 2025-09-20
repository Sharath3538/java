class Human{
public String name;
public int noOfEar;
public Kidneys kidneys;
public Eyes eyes;
public Liver liver;
public Human(String name,int noOfEar,Kidneys kidneys,Eyes eyes,Liver liver){
this.name=name;
this.noOfEar=noOfEar;
this.kidneys=kidneys;
this.eyes=eyes;
this.liver=liver;
}
public void displayHumanDetails(){
System.out.println("name of the person is="+name);
System.out.println("numbers of ear is="+noOfEar);
System.out.println("total saving liter of water is="+kidneys.waterPercentage);
System.out.println("using no of types is="+kidneys.types);
System.out.println("varity type of color name is="+eyes.colorName);
System.out.println("eye is claerly seeing there is="+eyes.isClearSeeing);
System.out.println("total liver types is="+liver.types);
System.out.println("relesing water liter is="+liver.percentageOfWater);
}
}