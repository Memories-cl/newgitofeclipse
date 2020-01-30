package test;

public class Test1{  
	 public static void main(String args[]){  
	  try{  
	    Class<?> c=Class.forName("test.Simple");  
		Simple s=(Simple)c.newInstance();   
	    s.message("Hello Java");  
	  }catch(Exception e){System.out.println(e);}  
	  
	 }  
	}
//sdsdfsdfsdfsdfsdf