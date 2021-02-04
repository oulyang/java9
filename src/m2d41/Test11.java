package m2d41;
/**
 * String常用构造方法:已重写toString()
 * 
 *	 	String s=new String("");
 * 		String s="";
 * 		String s=new String(char数组);
 * 		String s=new String(char数组,起始下标,长度);
 * 		String s=new String(byte数组);
 * 		String s=new String(byte数组,起始下标,长度);
 * 
 * 
 * @author yyds
 *
 */
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		System.out.println(s1);
		
		byte[] b= {97,98,99,100};
		String s2=new String(b);
		System.out.println(s2);//abcd
		
		//String(字节数组，数组元素起始位置，长度)
		String s3=new String(b,1,2);
		System.out.println(s3);//bc
		
		//将char数组全部转换成字符串
		char[] c= {'w','o','r','l','d'};
		String s4=new String(c);
		System.out.println(s4);
		
		//将char数组的一部分转换成字符串
		String s5=new String(c,2,3);
		System.out.println(s5);
		
		String s6=new String("hello");
		System.out.println(s6);
	}

}
