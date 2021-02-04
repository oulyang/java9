package m2d41;
/**
 * java.lang.String 
 * String表示字符串类型，是引用数据类型，不是基本数据类型
 * java中随便用""包括起来的都是String对象
 * java中规定""包括起来的字符串是不可变的，其直接存储在方法区的字符串常量池中（因为字符串在实际开发中使用太频繁，为了提高效率）
 * 
 * @author yyds
*
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建了3个字符串常量
		String s1="sss";
		String s2="sss"+"+";
		
		//在堆中有一个String对象，对象的内容是地址，指向字符串，在栈中创建变量s3内容为地址指向对象。
		String s3=new String("xy");
		
		String s4="123";
		String s5="123";
		System.out.println(s4==s5);
		
		String s6=new String("xyz");
		String s7=new String("xyz");
		System.out.println(s6==s7);
		
		
		User u1=new User(100,"zahng");
	}

}
