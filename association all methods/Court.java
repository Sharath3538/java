class Court{
public String courtName;
public int courtBenches;
public Courting branch;
public Court(String courtName,int courtBenches,Courting branch){
this.courtName=courtName;
this.courtBenches=courtBenches;
this.branch=branch;
}
public void displayCourtdetails(){
System.out.println(courtName+courtBenches);
System.out.println(branch.courtneatPer);
System.out.println(branch.givingcorrectJudgement);
}
}