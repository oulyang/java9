package m2d41;
/**
 * String���ù��췽��:����дtoString()
 * 
 *	 	String s=new String("");
 * 		String s="";
 * 		String s=new String(char����);
 * 		String s=new String(char����,��ʼ�±�,����);
 * 		String s=new String(byte����);
 * 		String s=new String(byte����,��ʼ�±�,����);
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
		
		//String(�ֽ����飬����Ԫ����ʼλ�ã�����)
		String s3=new String(b,1,2);
		System.out.println(s3);//bc
		
		//��char����ȫ��ת�����ַ���
		char[] c= {'w','o','r','l','d'};
		String s4=new String(c);
		System.out.println(s4);
		
		//��char�����һ����ת�����ַ���
		String s5=new String(c,2,3);
		System.out.println(s5);
		
		String s6=new String("hello");
		System.out.println(s6);
	}

}
