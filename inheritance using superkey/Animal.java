class Animal extends Dog{
public String animalName;
public int animalmatPrice; 
public long animaldoctorNum;
public double animalfoodRate;
public char animalfirstWord;
public float animallovePer;
public boolean animalcaring;
public Animal(String animalName,int animalmatPrice,long animaldoctorNum,double animalfoodRate,char animalfirstWord,float animallovePer,boolean animalcaring){
super();
this.animalName=animalName;
this.animalmatPrice=animalmatPrice; 
this.animaldoctorNum=animaldoctorNum;
this.animalfoodRate=animalfoodRate;
this.animalfirstWord=animalfirstWord;
this.animallovePer=animallovePer;
this.animalcaring=animalcaring;

}
public void displayAnimalDetails(){
System.out.println("name of the animal is="+this.animalName);
System.out.println("animal price is="+this.animalmatPrice);
System.out.println("animal doctor number is="+this.animaldoctorNum);
System.out.println("animal food rate is="+this.animalfoodRate);
System.out.println("animal first word is="+this.animalfirstWord);
System.out.println("animal love percentage is="+this.animallovePer);
System.out.println("animal caring is real are="+this.animalcaring);
System.out.println("Dog Details"+super.animalName);
System.out.println("Dog Details"+super.animalmatPrice);
System.out.println("Dog Details"+super.animaldoctorNum);
System.out.println("Dog Details"+super.animalfoodRate);
System.out.println("Dog Details"+super.animalfirstWord);
System.out.println("Dog Details"+super.animallovePer);
System.out.println("Dog Details"+super.animalcaring);
}
}