/*
 *  다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 *  
 *  메서드 명 : isNumber
 *  기능 : 주어진 문자열리 모두 숫자로만 이루어져있는지 확인한다.
 *  모두 숫자로만 이루어져있으면 true를 반환하고,
 *  그렇지 않으면 false를 반환한다.
 *  만일 주어진 문자열이 null이거나 빈문자열""이라면 false를 반환한다.
 *  반환타입 : boolean
 *  매개변수 : String str - 검사 할 문자열
 *  
 *  [HINT]
 *  String 클래스의 charAt(int i)
 *  매서드를 사용하면 문자열의 i번지 위치한 문자를 얻을 수 있다.
 *  
 *  isNan 이미 제공
 */
public class Ex02 {
	public static void main(String[] args) {
		String str1 = "1234";
		System.out.println("str1은 숫자입니까?" + isNumber(str1));
		
		String str2 = "12345ㅇ";
		System.out.println("str2은 숫자입니까?" + isNumber(str2));
		
		String str3 = "";
		System.out.println("str3은 숫자입니까?" + isNumber(str3));
	}
	
	public static boolean isNumber(String str){
		if(str == null || str.equals("")){
			return false;
		}
		for(int i = 0; i<str.length(); i++){
		
			char ch = str.charAt(i);
			
			if(ch < '0' || ch>'9'){
				return false;
			}
		}
		return true;
	}
}