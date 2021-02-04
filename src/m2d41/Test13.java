package m2d41;

/**
 * 如果需要大量的字符串拼接，使用JDK自带的java.lang.StringBuffer   java.lang.StringBuilder
 * 
 * StringBuffer在使用时尽可能给定一个大的初始容量，以减少底层扩容次数
 * 
 * StringBuilder中的方法都有synchronized关键字修饰，表示StringBuilder在多线程环境下是不安全的，而StringBuffer是安全的
 * @author yyds
 *
 */
public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer(); 
		s.append("a");
		s.append("b");
		s.append("3.14");
		System.out.println(s.toString());
		
		StringBuffer ss=new StringBuffer(100); 
		ss.append("h");
		ss.append("100l");
		System.out.println(ss);
		
		
		StringBuilder sb1=new StringBuilder();
		sb1.append("100");
		sb1.append("ni");
		sb1.append(true);
		System.out.println(sb1);
	}

}
