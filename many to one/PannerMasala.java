class PannerMasala{
public String Name;
public int usingTomatoes;
public Oil oil;
public GarlicPaste garlicPaste;
public Vegetables vegetables;
public PannerMasala(String anotherName,int usingTomatoes,Oil oil,GarlicPaste garlicPaste,Vegetables vegetables){
this.Name=Name;
this.usingTomatoes=usingTomatoes;
this.oil=oil;
this.garlicPaste=garlicPaste;
this.vegetables=vegetables;
}
public void displayPannerMasalaDetails(){
System.out.println("name of the pannermasala is="+Name);
System.out.println("fry using of tomatoes is="+usingTomatoes);
System.out.println(oil.noOfLitre);
System.out.println(oil.usingPer);
System.out.println(garlicPaste.garlicPasName);
System.out.println(garlicPaste.usingPer);
System.out.println(vegetables.typeOfNames);
System.out.println(vegetables.frying);
}
}