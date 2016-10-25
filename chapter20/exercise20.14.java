public class postfix {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stringEx = "81+11+*42-/";
				
		System.out.println(	postfix(stringEx));
		
		
	}
	
	static int postfix(String exp){
		
		
		Stack <Integer> oper = new Stack <Integer>();
		
		
		if(exp.length() == 0){
			return 0;
		}
				
		
		for(int i = 0; i < exp.length() ; i++){
			int  f,s;
			
			if(exp.charAt(i) == '/'){
				f = oper.pop();
				s = oper.pop();
				oper.push( (s/f));
			}
		
			else if(exp.charAt(i) == '*'){
				f = oper.pop();
				s = oper.pop();
				oper.push((f * s));

			}
			else if( exp.charAt(i) == '+' ){
				f = oper.pop();
				s = oper.pop();
				oper.push(f + s);

			}
			else if(exp.charAt(i) == '-'){
				f = oper.pop();
				s = oper.pop();
				oper.push((s-f));

			}
			else {
				
				oper.push(Character.getNumericValue(exp.charAt(i)));		
			
			}
		
	}
		return oper.peek();
		


	}
}
