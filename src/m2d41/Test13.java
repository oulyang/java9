package m2d41;

/**
 * �����Ҫ�������ַ���ƴ�ӣ�ʹ��JDK�Դ���java.lang.StringBuffer   java.lang.StringBuilder
 * 
 * StringBuffer��ʹ��ʱ�����ܸ���һ����ĳ�ʼ�������Լ��ٵײ����ݴ���
 * 
 * StringBuilder�еķ�������synchronized�ؼ������Σ���ʾStringBuilder�ڶ��̻߳������ǲ���ȫ�ģ���StringBuffer�ǰ�ȫ��
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
