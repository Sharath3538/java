class Table{
public String tableName;
public int tablePrice;
public Tableing branch;
public Table(String tableName,int tablePrice,Tableing branch){
this.tableName=tableName;
this.tablePrice=tablePrice;
this.branch=branch;
}
public void displayTableDetails(){
System.out.println("name of the table is="+tableName);
System.out.println("table price is="+tablePrice);
System.out.println(branch.tableSpace);
System.out.println(branch.tableisSuper);
}
}