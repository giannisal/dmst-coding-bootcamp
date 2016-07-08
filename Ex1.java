import java.util.*;
public class Ex1{
	public static void main(String[] args){
		String str;
		Scanner inp = new Scanner(System.in);
		System.out.print("Please give a mathematcal expression in any of the three given numeral systems");
		str = inp.next();
		int pos = -1;
		do{
			for( int i=0;i<str.length()-1 ;i++ ) {
				if (str.charAt(i) == '+' || str.charAt (i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/'){
					int oper = str.charAt(i);
					pos = i;
				}
			}
			if (pos == -1) System.out.print("There was no given operation. Try again");
		} while (pos == -1);
		int digit = 1; //gives the position of the digit starting from units
		int value; // gives the value of each roman letter as used
		int sum1, sum2, sum;
		for (int i=pos;i<0; i--){
			char current = str.charAt(i);
			if (current>= (char) 0 && str.charAt(i) <= (char) 9){
				switch (current){
					case '1':
					sum1+= digit;
					break;
					case '2': sum1 += 2*digit;
					break;
					case '3': sum1 += 3*digit;
					break;
					case '4' : sum1 +=4*digit;
					break;
					case '5' : sum1 +=5*digit;
					break;
					case '6' : sum1 +=6*digit;
					break;
					case '7' : sum1 +=7*digit;
					break;
					case '8' : sum1 +=8*digit;
					break;
					case '9' : sum1 +=9*digit;
					break;
					case '0' :
					break;
					digit++;
				}
			}
			if (current >= 'C' && current <='X'){
				switch (current){
				case 'I' :
					value = 1;
					if (str.charAt(i+1) !='V' && str.charAt(i+1) !='X' && str.charAt(i+1) !='L' && str.charAt(i+1) !='C' && str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
						value = - value;
					}
				case 'V' :
					value = 5;
					if (str.charAt(i+1) !='L' && str.charAt(i+1) !='C' && str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
						value = - value;
					}
				break;
				case 'X' :
					value = 10;
					if (str.charAt(i+1) !='L' && str.charAt(i+1) !='C' && str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
						value = - value;
					}
				break;
				case 'L' :
					value = 50;
					if  (str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
						value = - value;
					}
				break;
				case 'C' :
					value = 100;
					if  (str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
						value = - value;
					}
				break;
				case 'D' :
					value = 500;
				break;
				case 'M' :
					value = 1000;
				break;
				}
				sum1 += value;


			}
			if (current >= '?' && current <= '?'){
				switch (current){
				case 'Α' : sum1 += 1000;
				break;
				case 'α' : sum1 +=1;
				break;
				case 'β' : sum1 +=2;
				break;
				case 'γ' : sum1 +=3;
				break;
				case 'δ' : sum1 +=4;
				break;
				case 'ε' : sum1+=5;
				break;
				case 'ς' : sum1 +=6;
				break;
				case 'ζ' : sum1 +=7;
				break;
				case 'η' : sum1 +=8;
				break;
				case 'θ' : sum1 +=9;
				break;
				case 'ι' : sum1 +=10;
				break;
				case 'κ' : sum1 +=20;
				break;
				case 'λ' : sum1 +=30;
				break;
				case 'μ' : sum1 +=40;
				break;
				case 'ν' : sum1 +=50;
				break;
				case 'ξ' : sum1 +=60;
				break;
				case 'ο' : sum1 +=70;
				break;
				case 'π' : sum1 +=80;
				break;
				case 'q' : sum1 +=90;
				break;
				case 'ρ' : sum1 +=100;
				break;
				case 'σ' : sum1 +=200;
				break;
				case 'τ' : sum1 +=300;
				break;
				case 'υ' : sum1 +=400;
				break;
				case 'φ' : sum1 +=500;
				break;
				case 'χ' : sum1 +=600;
				break;
				case 'ψ' : sum1 +=700;
				break;
				case 'ω' : sum1 +=800;
				break;
				case 'w' : sum1 +=900;
				break;
				}
			}
		}
		for (int i=str.length()-1 ;i<=pos; i--){
					char current = str.charAt(i);
					if (current>= (char) 0 && str.charAt(i) <= (char) 9){
						switch (current){
							case '1':
							sum1+= digit;
							break;
							case '2': sum2 += 2*digit;
							break;
							case '3': sum2 += 3*digit;
							break;
							case '4' : sum2 +=4*digit;
							break;
							case '5' : sum2 +=5*digit;
							break;
							case '6' : sum2 +=6*digit;
							break;
							case '7' : sum2 +=7*digit;
							break;
							case '8' : sum2 +=8*digit;
							break;
							case '9' : sum2 +=9*digit;
							break;
							case '0' :
							break;
							digit++;
						}
					}
					if (current >= 'C' && current <='X'){
						switch (current){
						case 'I' :
							value = 1;
							if (str.charAt(i+1) !='V' && str.charAt(i+1) !='X' && str.charAt(i+1) !='L' && str.charAt(i+1) !='C' && str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
								value = - value;
							}
						case 'V' :
							value = 5;
							if (str.charAt(i+1) !='L' && str.charAt(i+1) !='C' && str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
								value = - value;
							}
						break;
						case 'X' :
							value = 10;
							if (str.charAt(i+1) !='L' && str.charAt(i+1) !='C' && str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
								value = - value;
							}
						break;
						case 'L' :
							value = 50;
							if  (str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
								value = - value;
							}
						break;
						case 'C' :
							value = 100;
							if  (str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
								value = - value;
							}
						break;
						case 'D' :
							value = 500;
						break;
						case 'M' :
							value = 1000;
						break;
						}
						sum2 += value;


					}
					if (current >= '?' && current <= '?'){
						switch (current){
						case 'Α' : sum2 += 1000;
						break;
						case 'α' : sum2 +=1;
						break;
						case 'β' : sum2 +=2;
						break;
						case 'γ' : sum2 +=3;
						break;
						case 'δ' : sum2 +=4;
						break;
						case 'ε' : sum2 +=5;
						break;
						case 'ς' : sum2 +=6;
						break;
						case 'ζ' : sum2 +=7;
						break;
						case 'η' : sum2 +=8;
						break;
						case 'θ' : sum2 +=9;
						break;
						case 'ι' : sum2 +=10;
						break;
						case 'κ' : sum2 +=20;
						break;
						case 'λ' : sum2 +=30;
						break;
						case 'μ' : sum2 +=40;
						break;
						case 'ν' : sum2 +=50;
						break;
						case 'ξ' : sum2 +=60;
						break;
						case 'ο' : sum2 +=70;
						break;
						case 'π' : sum2 +=80;
						break;
						case 'q' : sum2 +=90;
						break;
						case 'ρ' : sum2 +=100;
						break;
						case 'σ' : sum2 +=200;
						break;
						case 'τ' : sum2 +=300;
						break;
						case 'υ' : sum2 +=400;
						break;
						case 'φ' : sum2 +=500;
						break;
						case 'χ' : sum2 +=600;
						break;
						case 'ψ' : sum2 +=700;
						break;
						case 'ω' : sum2 +=800;
						break;
						case 'w' : sum2 +=900;
						break;
						}
					}
			}
			System.out.println(sum1+sum2);
	}
}
