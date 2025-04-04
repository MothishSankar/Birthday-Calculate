import java.util.*;
class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the year: ");
	    int a=sc.nextInt();
	    	    System.out.print("Enter the month: ");
	    int b=sc.nextInt();
	    
	    	    System.out.print("Enter the date: ");
	    int c=sc.nextInt();
	   
	    int q,A,D;
	    int Q=a%100;
	    if(Q%4==0){
	        q=0;
	    }
	    else{
	        q=Q/4;
	    }
	    
	    if(a<=1999 && a>=1900){
	         A=0;
	    }
	    else{
	        A=6;
	    }
	    

	    if(b==1){
	        D=0;
	    }
	    else if(b==2){
	        D=3;
	    }
	     else if(b==3){
	        D=3;
	    }
	     else if(b==4){
	        D=6;
	    }
	     else if(b==5){
	        D=1;
	    }
	     else if(b==6){
	        D=4;
	    }
	     else if(b==7){
	        D=6;
	    }
	     else if(b==8){
	        D=2;
	    }
	     else if(b==9){
	        D=5;
	    }
	     else if(b==10){
	        D=0;
	    }
	     else if(b==11){
	        D=3;
	    }
	     else {
	        D=5;
	    }
	   int tot=(c+q+Q+A+D);
	    int sum=tot%7;
	    if(sum==0){
	        System.out.print("Sunday");
	    }
	    else if(sum==1){
	        System.out.print("Monday");
	    }
	    else if(sum==2){
	        System.out.print("Tuesday");
    	}
      	else if(sum==3){
	        System.out.print("Wednesday");
        }
        else if(sum==4){
	        System.out.print("Thursday");
        }
	    else if(sum==5){
	        System.out.print("Friday");
	    }
	    else {
	        System.out.print("Satuday");
	    }
	    
	    
    }
}