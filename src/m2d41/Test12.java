package m2d41;
/**
 * String 方法
 * 		char charAt(int index)
 * 		int compareTo(String anotherString)
 * 	 !  boolean contains(CharSequence s)
 *   !  boolean endsWith(String suffix)
 *   !	equals(Object anObject)
 *   !  boolean equalsIgnoreCase(String anotherString)
 *   !  bute[] getBytes()
 *   ！ int indexOf(String str)
 *   !  boolean isEmpty()
 *   !  int length()
 *   !  int lastIndexOf(String str)
 *   ！ String.replace(CharSequence target,CharSequence replacement)
 *   !  split(String regex)
 *   !  startsWith(String prefix)
 *   !  substring(int beginIndex)
 *   !  substring(int beginIndex, int endIndex)
 *   !  char[] toCharArray()
 *   !  String.toLowerCase()
 *   ！ String.toUpperCase()
 *   !  String.trim()
 *   !  String.valueOf()
 * @author yyds
 *
 */
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char charAt(int index)
		char c="hello".charAt(1);
		System.out.println(c);
		
		//int compareTo(String anotherString);
		//拿两字符串第一个相比较，相等则往后推
		//0:前后一致  <0  前小后大  >0前大后小
		int i="hello".compareTo("hello");
		System.out.println(i);
		
		//boolean contains(CharSequence s)
		//判断前面字符串是否包含后面字符串
		System.out.println("hello".contains("java"));
		
		//boolean endsWith(String suffix)
		//判断前面字符串是否已后面字符串为结尾
		System.out.println("hello".endsWith("lo"));
		
		//equals(Object anObject)
		//比较字符串是否相等
		
		//boolean equalsIgnoreCase(String anotherString)
		//判断两个字符串是否相等，并忽略大小写
		System.out.println("ABc".equalsIgnoreCase("abc"));
		
		//byte[] getBytes()
		//将字符串转换成字节数组
		byte[] b="hello".getBytes();
		for(int x=0;x<b.length;x++) {
			System.out.println(b[x]);
		}
		
		//int indexOf(String str)
		//找出某个字符串在当前字符串中第一次出现处的下标
		System.out.println("hello".indexOf("l"));
		
		//boolean isEmpty()
		//判断某个字符串是否为空
		System.out.println("aa".isEmpty());
		
		//int length()
		//判断数组长度是length属性，判断字符串长度是length方法
		System.out.println("abc".length());
		
		//int lastIndexOf(String str)
		//找出某个字符串在当前字符串中最后一次出现处的下标
		System.out.println("helloworld".lastIndexOf("l"));
		
		//String.replace(CharSequence target,CharSequence replacement)
		//替换，String的父接口是CharSequence
		System.out.println("hello".replace("hel","Hel"));
		
		//.split(String regex)
		//拆分字符串
		String[] s="hello".split("l");
		for(int y=0;y<s.length;y++) {
			System.out.println(s[y]);
		}
		
		//.startsWith(String prefix)
		//判断某个字符串是否以某字符串开始
		System.out.println("hello".startsWith("h"));
		
		//.substring(int beginIndex)
		//截取字符串
		System.out.println("hello".substring(2));
		
		//substring(int beginIndex, int endIndex)
		//左闭右开，包含起始位置，不含结束位置
		System.out.println("hello".substring(3, 4));
		
		//char[] toCharArray()
		//将字符串转换成char数组
		char[] ch="hello".toCharArray();
		for(int z=0;z<ch.length;z++) {
			System.out.println(ch[z]);
		}
		
		//String.toLowerCase()
		//将字符串转换成小写
		System.out.println("HELLO".toLowerCase());
		
		//String.toUpperCase()
		//将字符串转换成大写
		System.out.println("hello".toUpperCase());
		
		//String.trim()
		//去除字符串前后空白
		System.out.println("  hello  world  ".trim());
		
		//String中只有一个方法是静态的，该方法为valueOf()，作用是将非字符串转换成字符串
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(3.14));
		System.out.println(String.valueOf(new Animal()));//没有重写toString之前是内存地址,重写后是snake
		System.out.println(String.valueOf(new Object()));
	}

}
class Animal{
	public String toString(){
		return "snake";
	}
}