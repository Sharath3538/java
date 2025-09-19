class Bathing{
public String bathSoapName;
public float bathDuration;
public Water water;
public(String bathSoapName,float bathDuration,Water water){
this.bathSoapName=bathSoapName;
this.bathDuration=bathDuration;
this.water=water;
}
public void displayBathingDetails(){
System.out.println("name of the bath SoapName="+bathSoapName);
System.out.println("bath total Duration="+bathDuration);
System.out.println(water.litOfWater);
System.out.println(water.isFilterWater);
}
}