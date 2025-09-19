class SandWitch{
public String sandWitchName;
public int cost;
public Maggi maggi;
public SandWitch(String sandWitchName,int cost,Maggi maggi){
this.sandWitchName=sandWitchName;
this.cost=cost;
this.maggi=maggi;
}
public void displaySandWitchDetails(){
System.out.println("sandWitch varity types of Name="+sandWitchName);
System.out.println("sandWitch lowest cost other items="+cost);
System.out.println(maggi.maggiName);
System.out.println(maggi.isTastey);
}
}