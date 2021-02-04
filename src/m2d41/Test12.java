package m2d41;
/**
 * String ����
 * 		char charAt(int index)
 * 		int compareTo(String anotherString)
 * 	 !  boolean contains(CharSequence s)
 *   !  boolean endsWith(String suffix)
 *   !	equals(Object anObject)
 *   !  boolean equalsIgnoreCase(String anotherString)
 *   !  bute[] getBytes()
 *   �� int indexOf(String str)
 *   !  boolean isEmpty()
 *   !  int length()
 *   !  int lastIndexOf(String str)
 *   �� String.replace(CharSequence target,CharSequence replacement)
 *   !  split(String regex)
 *   !  startsWith(String prefix)
 *   !  substring(int beginIndex)
 *   !  substring(int beginIndex, int endIndex)
 *   !  char[] toCharArray()
 *   !  String.toLowerCase()
 *   �� String.toUpperCase()
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
		//�����ַ�����һ����Ƚϣ������������
		//0:ǰ��һ��  <0  ǰС���  >0ǰ���С
		int i="hello".compareTo("hello");
		System.out.println(i);
		
		//boolean contains(CharSequence s)
		//�ж�ǰ���ַ����Ƿ���������ַ���
		System.out.println("hello".contains("java"));
		
		//boolean endsWith(String suffix)
		//�ж�ǰ���ַ����Ƿ��Ѻ����ַ���Ϊ��β
		System.out.println("hello".endsWith("lo"));
		
		//equals(Object anObject)
		//�Ƚ��ַ����Ƿ����
		
		//boolean equalsIgnoreCase(String anotherString)
		//�ж������ַ����Ƿ���ȣ������Դ�Сд
		System.out.println("ABc".equalsIgnoreCase("abc"));
		
		//byte[] getBytes()
		//���ַ���ת�����ֽ�����
		byte[] b="hello".getBytes();
		for(int x=0;x<b.length;x++) {
			System.out.println(b[x]);
		}
		
		//int indexOf(String str)
		//�ҳ�ĳ���ַ����ڵ�ǰ�ַ����е�һ�γ��ִ����±�
		System.out.println("hello".indexOf("l"));
		
		//boolean isEmpty()
		//�ж�ĳ���ַ����Ƿ�Ϊ��
		System.out.println("aa".isEmpty());
		
		//int length()
		//�ж����鳤����length���ԣ��ж��ַ���������length����
		System.out.println("abc".length());
		
		//int lastIndexOf(String str)
		//�ҳ�ĳ���ַ����ڵ�ǰ�ַ��������һ�γ��ִ����±�
		System.out.println("helloworld".lastIndexOf("l"));
		
		//String.replace(CharSequence target,CharSequence replacement)
		//�滻��String�ĸ��ӿ���CharSequence
		System.out.println("hello".replace("hel","Hel"));
		
		//.split(String regex)
		//����ַ���
		String[] s="hello".split("l");
		for(int y=0;y<s.length;y++) {
			System.out.println(s[y]);
		}
		
		//.startsWith(String prefix)
		//�ж�ĳ���ַ����Ƿ���ĳ�ַ�����ʼ
		System.out.println("hello".startsWith("h"));
		
		//.substring(int beginIndex)
		//��ȡ�ַ���
		System.out.println("hello".substring(2));
		
		//substring(int beginIndex, int endIndex)
		//����ҿ���������ʼλ�ã���������λ��
		System.out.println("hello".substring(3, 4));
		
		//char[] toCharArray()
		//���ַ���ת����char����
		char[] ch="hello".toCharArray();
		for(int z=0;z<ch.length;z++) {
			System.out.println(ch[z]);
		}
		
		//String.toLowerCase()
		//���ַ���ת����Сд
		System.out.println("HELLO".toLowerCase());
		
		//String.toUpperCase()
		//���ַ���ת���ɴ�д
		System.out.println("hello".toUpperCase());
		
		//String.trim()
		//ȥ���ַ���ǰ��հ�
		System.out.println("  hello  world  ".trim());
		
		//String��ֻ��һ�������Ǿ�̬�ģ��÷���ΪvalueOf()�������ǽ����ַ���ת�����ַ���
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(3.14));
		System.out.println(String.valueOf(new Animal()));//û����дtoString֮ǰ���ڴ��ַ,��д����snake
		System.out.println(String.valueOf(new Object()));
	}

}
class Animal{
	public String toString(){
		return "snake";
	}
}