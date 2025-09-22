class BankOfBaroda{
public int noOfAtms;
public float userPercentage;
public Account account;
public Village village;
public Loans loans;
public BankOfBaroda(int noOfAtms,float userPercentage,Account account,Village village,Loans loans){
this.noOfAtms=noOfAtms;
this.userPercentage=userPercentage;
this.account=account;
this.village=village;
this.loans=loans;
}
public void displayBankBordaDetails(){
System.out.println("bank of boroda no of atms is="+noOfAtms);
System.out.println("bank of boroda total user percentage is="+userPercentage);
System.out.println("IcIc bank used account name is="+account.accountName);
System.out.println("IcIc account register number is="+account.registerNo);
System.out.println("IcIc bank is there village name is="+village.villageName);
System.out.println("IcIc inside canarabank pincode is="+village.villagePincode);
System.out.println("IcIc bank give no type of loans is="+loans.noTypeLoans);
System.out.println("IcIc bank taking total loans percentage is="+loans.takingPercentage);
}
}