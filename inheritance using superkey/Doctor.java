class Doctor extends Person{
public String doctorName;
public int doctorfees;
public float doctorcuringPer;
public double bedCharge;
public long doctorphoNum;
public boolean iscuringisReal;
public  char centreLetter;
public Doctor(String doctorName,int doctorfees,float doctorcuringPer,double bedCharge,long doctorphoNum,boolean iscuringisReal,char centreLetter){
super();


this.doctorName=doctorName;
this.doctorfees=doctorfees;
this.doctorcuringPer=doctorcuringPer;
this.bedCharge=bedCharge;
this.doctorphoNum=doctorphoNum;
this.iscuringisReal=iscuringisReal;
this.centreLetter=centreLetter;
}
public void displayDoctorDetails(){
System.out.println("doctor name is="+this.doctorName);
System.out.println("Person Details"+super.doctorName);
System.out.println("doctor fees is="+this.doctorfees);
System.out.println("Person Details"+super.doctorfees);
System.out.println("doctor curing total percentage is="+this.doctorcuringPer);
System.out.println("Person Details"+super.doctorcuringPer);
System.out.println("patient bed charge is="+this.bedCharge);
System.out.println("Person Details"+super.bedCharge);
System.out.println("doctor phone number is="+this.doctorphoNum);
System.out.println("Person Details"+super.doctorphoNum);
System.out.println("doctor really curing symptoms are="+this.iscuringisReal);
System.out.println("Person Details"+super.iscuringisReal);
System.out.println("doctor name centre letter is="+this.centreLetter);
System.out.println("Person Details"+super.centreLetter);
}
}
