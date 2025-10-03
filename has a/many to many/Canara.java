class Canara{
public int noOfAccount;
public float totalAccountPer;
public Account account;
public Village village;
public Loans loans;
public Canara(int noOfAccount,float totalAccountPer,Account account,Village village,Loans loans){
this.noOfAccount=noOfAccount;
this.totalAccountPer=totalAccountPer;
this.account=account;
this.village=village;
this.loans=loans;
}
public void displayCanaraDetails(){
System.out.println("account user no of account is="+noOfAccount);
System.out.println("canara total account percentage is="+totalAccountPer);
System.out.println("canara bank used account name is="+account.accountName);
System.out.println("canara account register number is="+account.registerNo);
System.out.println("canara bank is there village name is="+village.villageName);
System.out.println("village inside canarabank pincode is="+village.villagePincode);
System.out.println("canara bank give no type of loans is="+loans.noTypeLoans);
System.out.println("canara bank taking total loans percentage is="+loans.takingPercentage);
}
}