package leetcode;
/*
 * stack을 사용함
 * 여는 괄호들이 들어오면 스텍에 넣음
 * 닫는 괄호들이 들어오면 가장 최근에 넣은 괄호를 가져와서 비교하여 매칭되면 통과 아니면 실패
 * 모든 문자를 본후에 스텍에 무언가 남아있다면 실패
 * O(N)
 * 1ms 37.5 MB
 */
import java.util.*;
public class valid_parentheses {
	static String s="(}";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		boolean can=true;
		for(int i=0;i<s.length();i++) {
			char now=s.charAt(i);
			if(now=='['||now=='{'||now=='(') {
				stack.push(now);
			}else {
				if(stack.isEmpty()) {
					can=false;break;
				}else {
					char temp=(char)stack.pop();
					if(temp=='[') {
						if(now!=']') {can=false;break;}
					}else if(temp=='{') {
						if(now!='}') {can=false;break;}
					}else {
						if(now!=')') {can=false;break;}
					}
				}
			}
		}
		if(!stack.isEmpty())can=false;
		
    return can;
	}

}
