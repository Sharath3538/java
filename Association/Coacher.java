class Coacher{
public String coachername;
public int salary;
public Coaching branch;
public Coacher(String coachername,int salary,Coaching branch){
this.coachername=coachername;
this.salary=salary;
this.branch=branch;
}
public void displayCoacherTeams(){
System.out.println(coachername+salary);
System.out.println(branch.fees);
System.out.println(branch.coachingName);
}
}