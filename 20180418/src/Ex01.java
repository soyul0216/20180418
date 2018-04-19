import java.util.*;

public class Ex01 {

public static void main(String[] args){
	
	int value[] = new int[5];
	
	for(int i=0; i<value.length; i++){
		value[i] = (int)(Math.random()*46);
	}
	
	for(int i=0; i<value.length; i++){
		System.out.printf(value[i]+",");
	}
	
	}
}