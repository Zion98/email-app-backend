package emailapp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
   private String firstName;
   private String lastName;
   private String email;
   private String password;
   private String department;
   private int mailboxCapacity=500;
   private int defaultPasswordLength=10;
   private String alternateEmail;
private String companySuffix="decagonhq.com";
   //Parameterised Constructor
   public Email(String firstName,String lastName){
       this.firstName=firstName;
       this.lastName=lastName;
       System.out.println("Email created "+this.firstName+" "+this.lastName);

   this.department=setDepartment();
       System.out.println("The selected department is:"+this.department);


   this.password=randomPassword(defaultPasswordLength);
       System.out.println("Your Password is "+this.password );

   email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+companySuffix;
       System.out.println("Your email is "+email);
   }


   private String setDepartment (){
       System.out.println("Enter the department\n1 for Sales\n1 for Development\n3 for Accounting for\n0 none");
       Scanner in=new Scanner(System.in);
       int depChoice=in.nextInt();
       if(depChoice==1){
          return "Sales";
       }else if(depChoice==2){
           return "dev";
       }else if(depChoice==3){
           return "acct";
       }else{
           return "";
       }
   }

   private String randomPassword(int length){
       String passwordSet="ABCCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@£$%67`89)";
       char[] password = new char[length];
       for(int i=0; i<length;i++){
           int rand=(int)(Math.random()*passwordSet.length());
           password[i]=passwordSet.charAt(rand);
       }
       return new String (password);
   }


public void setMailboxCapacity(int capacity){
this.mailboxCapacity=capacity;

}

public void setAlternateEmail(String altEmail){
       this.alternateEmail=altEmail;
}

public void changePassword(String password){
 this.password=password;
}

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

//    public getInfo(){
//       return
//    }
}
