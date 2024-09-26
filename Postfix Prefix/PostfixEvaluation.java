import java.util.Stack;
import java.util.Scanner;
public class PostfixEvaluation{
	public static void main(String[] args){
		Stack<Integer> stack = new Stack<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Postfix Evaluation");
		System.out.print("Enter any postfix expression: ");
		String postfix=sc.next();
		String[] arr=postfix.split(",");
		for(int i=0;i<arr.length;i++){
			if(Character.isDigit(arr[i].charAt(0))){
				int n=Integer.parseInt(arr[i]);
				stack.push(n);
			}
			else{
				if(stack.size()<2){
					System.out.println("Invalid Input");
					return;
				}
				int op2=stack.pop();
				int op1=stack.pop();
				int value=0;
				char operand=arr[i].charAt(0);
				switch(operand){
					case '+': value=op1+op2;
						break;
					case '-': value=op1-op2;
						break;
					case '*': value=op1*op2;
						break;
					case '/': value=op1/op2;
						break;
					case '^': value=(int)(Math.pow(op1,op2));
						break;
				}
				stack.push(value);
			}
		}
		System.out.println("Answer: "+stack.pop());
	}
}