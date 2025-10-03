class IcIc{
public int noOfPersonWorking;
public boolean isReallyWork;
public Account account;
public Village village;
public Loans loans;
public IcIc(int noOfPersonWorking,boolean isReallyWork,Account account,Village village,Loans loans){
this.noOfPersonWorking=noOfPersonWorking;
this.isReallyWork=isReallyWork;
this.account=account;
this.village=village;
this.loans=loans;
}
public void displayIcIcDetail(){
System.out.println("icic bank number of person working is="+noOfPersonWorking);
System.out.println("icic bank is really good working="+isReallyWork);
System.out.println("IcIc bank used account name is="+account.accountName);
System.out.println("IcIc account register number is="+account.registerNo);
System.out.println("IcIc bank is there village name is="+village.villageName);
System.out.println("IcIc inside canarabank pincode is="+village.villagePincode);
System.out.println("IcIc bank give no type of loans is="+loans.noTypeLoans);
System.out.println("IcIc bank taking total loans percentage is="+loans.takingPercentage);
}
}