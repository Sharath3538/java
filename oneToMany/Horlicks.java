class Horlicks{
public String name;
public boolean isTaste;
public Sugar sugar;
public Horlicks(String name,boolean isTaste,Sugar sugar){
this.name=name;
this.isTaste=isTaste;
this.sugar=sugar;
}
public void displayHorlicksDetails(){
System.out.println("so many name of horlicks="+name);
System.out.println("horlicks is very taste="+isTaste);
System.out.println(sugar.sugarName);
System.out.println(sugar.isSweet);
}
}