class BataniSambar{
public int bataniSambarPrice;
public boolean isTaste;
public Oil oil;
public Tamotoes tamotoes;
public Batani batani;
public BataniSambar(int bataniSambarPrice,boolean isTaste,Oil oil,Tamotoes tamotoes,Batani batani){
this.bataniSambarPrice=bataniSambarPrice;
this.isTaste=isTaste;
this.oil=oil;
this.tamotoes=tamotoes;
this.batani=batani;
}
public void displayBataniSamberDetails(){
System.out.println("batani Sambar Price is="+bataniSambarPrice);
System.out.println("it is really taste is nice there="+isTaste);
System.out.println("total oil percentage is="+oil.usingPerc);
System.out.println("bataniSambar used no of liter oil is="+oil.noOfLiter);
System.out.println("bataniSambar used no of tamotoes is="+tamotoes.noOfUsing);
System.out.println("tamotoes is frying is taste is spicy="+tamotoes.isTaste);
System.out.println("another type batani name is="+batani.bataniName);
System.out.println("bataniSambar total batani used percentage is="+batani.usingPer);
}
}