package m2d41;
/**
 * java.lang.String 
 * String��ʾ�ַ������ͣ��������������ͣ����ǻ�����������
 * java�������""���������Ķ���String����
 * java�й涨""�����������ַ����ǲ��ɱ�ģ���ֱ�Ӵ洢�ڷ��������ַ����������У���Ϊ�ַ�����ʵ�ʿ�����ʹ��̫Ƶ����Ϊ�����Ч�ʣ�
 * 
 * @author yyds
*
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������3���ַ�������
		String s1="sss";
		String s2="sss"+"+";
		
		//�ڶ�����һ��String���󣬶���������ǵ�ַ��ָ���ַ�������ջ�д�������s3����Ϊ��ַָ�����
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
