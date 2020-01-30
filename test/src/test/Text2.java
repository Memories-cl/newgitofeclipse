package test;
import java.lang.reflect.Method;
public class Text2 {
	public void getInformation(){
		Class<?> simple = Simple.class;
		Method[] me = simple.getDeclaredMethods();
		for(Method m : me) {
			System.out.println(m);
			System.out.println("方法名：" + m.getName());
			Class<?>[] para = m.getParameterTypes();
			System.out.println("返回类型：" + m.getReturnType());
			for(Class<?> k : para) {
				System.out.println("参数类型：" + k);
			}
			
		}
	}
		public static void main(String args[]){  
			  try{  
			    Class<?> c=Class.forName("test.Text2");  
			    Text2 s=(Text2)c.newInstance();  
			    s.getInformation();  
			  }catch(Exception e){System.out.println(e);}  
			  
			 }  
}
