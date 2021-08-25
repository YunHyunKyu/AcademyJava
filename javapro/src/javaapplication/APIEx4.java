package javaapplication;

public class APIEx4 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); // 객체 생성
		sb.append("우리모두 ");
		sb.append("화이팅");
		
		System.out.println(sb.toString());
		sb.insert(4, " 힘차게");
		System.out.println(sb.toString());
		sb.setCharAt(9, '파');
		System.out.println(sb.toString());
		sb.replace(5, 8, "아자아자");
		System.out.println(sb.toString());
		sb.delete(5, 10);
		System.out.println(sb.toString());
		System.out.println(sb.length());
		String result = sb.toString();
		System.out.println(result);
	}

}
