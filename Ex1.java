import java.util.*;
import java.Math.*;
public class Ex1{
	public static void main(String[] args){
		String str;
		Scanner inp = new Scanner(System.in);
		System.out.print("Please give a mathematcal expression in any of the three given numeral systems");
		int pos; // the position of the operation symbol
		int sum1, sum2, sum; // the first number, the second number and the outcome of their operation
		char oper;
		do{
			do{
				str = inp.next();
				pos = -1;
				for( int i=0;i<str.length()-1 ;i++ ) {
					if (str.charAt(i) == '+' || str.charAt (i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/'){
						oper = str.charAt(i);
						pos = i;
					}
				}
				if (pos == -1) System.out.print("There was no given operation. Try again");
			} while (pos == -1);
			double digit = 1; //multiplier, power of 10, depending on the arabic digit's value
			int value; // gives the value of each roman letter considering the next digit
			for (int i=pos-1;i<0; i--){
				char current = str.charAt(i);
					switch (current){
						case '1':
						sum1+= digit;
						break;
						case '2': sum1 += 2*Math.pow(10.0, digit);
						digit++;
						break;
						case '3': sum1 += 3*Math.pow(10.0, digit);
						digit++;
						break;
						case '4' : sum1 +=4*Math.pow(10.0, digit);
						digit++;
						break;
						case '5' : sum1 +=5*Math.pow(10.0, digit);
						digit++;
						break;
						case '6' : sum1 +=6*Math.pow(10.0, digit);
						digit++;
						break;
						case '7' : sum1 +=7*Math.pow(10.0, digit);
						digit++;
						break;
						case '8' : sum1 +=8*Math.pow(10.0, digit);
						digit++;
						break;
						case '9' : sum1 +=9*Math.pow(10.0, digit);
						digit++;
						break;
						case '0' : digit++;
						break;
						case 'I' :
							value = 1;
							if (str.charAt(i+1) !='V' && str.charAt(i+1) !='X' && str.charAt(i+1) !='L'
									&& str.charAt(i+1) !='C' && str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
								sum1 -= value;
							}
							else sum1 += value;
						break;
						case 'V' :
							value = 5;
							if (str.charAt(i+1) !='L' && str.charAt(i+1) !='C' && str.charAt(i+1) !='D'
									&& str.charAt(i+1) !='M' && i != pos-1){
								sum1 -= value;
							}
							else sum1 += value;
						break;
						case 'X' :
							value = 10;
							if (str.charAt(i+1) !='L' && str.charAt(i+1) !='C' && str.charAt(i+1) !='D'
									&& str.charAt(i+1) !='M' && i != pos-1){
								sum1 -= value;
							}
							else sum1 += value;
						break;
						case 'L' :
							value = 50;
							if  (str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
								sum1 -= value;
							}
							else sum1 += value;
						break;
						case 'C' :
							value = 100;
							if  (str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
								sum1 -= value;
							}
							else sum1 += value;
						break;
						case 'D' :
							sum1 += 500;
						break;
						case 'M' :
							sum1 += 1000;
						break;
						case '?' : sum1 += 1000;
						break;
						case '?' : sum1 +=1;
						break;
						case '?' : sum1 +=2;
						break;
						case '?' : sum1 +=3;
						break;
						case '?' : sum1 +=4;
						break;
						case '?' : sum1+=5;
						break;
						case '?' : sum1 +=6;
						break;
						case '?' : sum1 +=7;
						break;
						case '?' : sum1 +=8;
						break;
						case '?' : sum1 +=9;
						break;
						case '?' : sum1 +=10;
						break;
						case '?' : sum1 +=20;
						break;
						case '?' : sum1 +=30;
						break;
						case '?' : sum1 +=40;
						break;
						case '?' : sum1 +=50;
						break;
						case '?' : sum1 +=60;
						break;
						case '?' : sum1 +=70;
						break;
						case '?' : sum1 +=80;
						break;
						case 'q' : sum1 +=90;
						break;
						case '?' : sum1 +=100;
						break;
						case '?' : sum1 +=200;
						break;
						case '?' : sum1 +=300;
						break;
						case '?' : sum1 +=400;
						break;
						case '?' : sum1 +=500;
						break;
						case '?' : sum1 +=600;
						break;
						case '?' : sum1 +=700;
						break;
						case '?' : sum1 +=800;
						break;
						case 'w' : sum1 +=900;
						break;
						}
					for (int i=str.length()-1;i<=pos; i--){
						current = str.charAt(i);
							switch (current){
								case '1':
								sum2+= digit;
								break;
								case '2': sum2 += 2*Math.pow(10.0, digit);
								digit++;
								break;
								case '3': sum2 += 3*Math.pow(10.0, digit);
								digit++;
								break;
								case '4' : sum2 +=4*Math.pow(10.0, digit);
								digit++;
								break;
								case '5' : sum2 +=5*Math.pow(10.0, digit);
								digit++;
								break;
								case '6' : sum2 +=6*Math.pow(10.0, digit);
								digit++;
								break;
								case '7' : sum2 +=7*Math.pow(10.0, digit);
								digit++;
								break;
								case '8' : sum2 +=8*Math.pow(10.0, digit);
								digit++;
								break;
								case '9' : sum2 +=9*Math.pow(10.0, digit);
								digit++;
								break;
								case '0' : digit++;
								break;
								case 'I' :
									value = 1;
									if (str.charAt(i+1) !='V' && str.charAt(i+1) !='X' && str.charAt(i+1) !='L'
											&& str.charAt(i+1) !='C' && str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
										sum2 -= value;
									}
									else sum2 += value;
								break;
								case 'V' :
									value = 5;
									if (str.charAt(i+1) !='L' && str.charAt(i+1) !='C' && str.charAt(i+1) !='D'
											&& str.charAt(i+1) !='M' && i != pos-1){
										sum2 -= value;
									}
									else sum2 += value;
								break;
								case 'X' :
									value = 10;
									if (str.charAt(i+1) !='L' && str.charAt(i+1) !='C' && str.charAt(i+1) !='D'
											&& str.charAt(i+1) !='M' && i != pos-1){
										sum2 -= value;
									}
									else sum2 += value;
								break;
								case 'L' :
									value = 50;
									if  (str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
										sum2 -= value;
									}
									else sum2 += value;
								break;
								case 'C' :
									value = 100;
									if  (str.charAt(i+1) !='D' && str.charAt(i+1) !='M' && i != pos-1){
										sum2 -= value;
									}
									else sum2 += value;
								break;
								case 'D' :
									sum2 += 500;
								break;
								case 'M' :
									sum2 += 1000;
								break;
							case '?' : sum2 += 1000;
							break;
							case '?' : sum2 +=1;
							break;
							case '?' : sum2 +=2;
							break;
							case '?' : sum2 +=3;
							break;
							case '?' : sum2 +=4;
							break;
							case '?' : sum2+=5;
							break;
							case '?' : sum2 +=6;
							break;
							case '?' : sum2 +=7;
							break;
							case '?' : sum2 +=8;
							break;
							case '?' : sum2 +=9;
							break;
							case '?' : sum2 +=10;
							break;
							case '?' : sum2 +=20;
							break;
							case '?' : sum2 +=30;
							break;
							case '?' : sum2 +=40;
							break;
							case '?' : sum2 +=50;
							break;
							case '?' : sum2 +=60;
							break;
							case '?' : sum2 +=70;
							break;
							case '?' : sum2 +=80;
							break;
							case 'q' : sum2 +=90;
							break;
							case '?' : sum2 +=100;
							break;
							case '?' : sum2 +=200;
							break;
							case '?' : sum2 +=300;
							break;
							case '?' : sum2 +=400;
							break;
							case '?' : sum2 +=500;
							break;
							case '?' : sum2 +=600;
							break;
							case '?' : sum2 +=700;
							break;
							case '?' : sum2 +=800;
							break;
							case 'w' : sum2 +=900;
							break;
							}
						if ( sum1<1 || sum1>1000 || sum2<1 || sum2>1000){
							System.out.print("The numbers are out of range. Please give them again");
						}
					}
			}
		}while( sum1<1 || sum1>1000 || sum2<1 || sum2>1000);
			if (oper=='+'){
				sum=sum1+sum2;
			}
			else if (oper=='-'){
				sum= sum1-sum2;
			}
			else if (oper=='*'){
				sum= sum1*sum2;
			}
			else {
				sum= sum1/sum2;
			}
			String roman_sum = "", greek_sum = "";
			int sum_base = sum; // sum_base is used in the strings creation, without losing the original sum value

			if (sum_base >= 1000) {
        roman_sum += "M";
        sum_base -= 1000;        }
    while (sum >= 900) {
        roman_sum += "CM";
        sum_base -= 900;
    }
    while (sum_base >= 500) {
        roman_sum += "D";
        sum_base -= 500;
    }
    while (sum_base >= 400) {
        roman_sum += "CD";
        sum_base -= 400;
    }
    while (sum_base >= 100) {
        roman_sum += "C";
        sum_base -= 100;
    }
    while (sum_base >= 90) {
        roman_sum += "XC";
        sum_base -= 90;
    }
    while (sum_base >= 50) {
        roman_sum += "L";
        sum_base -= 50;
    }
    while (sum_base >= 40) {
        roman_sum += "XL";
        sum_base -= 40;
    }
    while (sum_base >= 10) {
        roman_sum += "X";
        sum_base -= 10;
    }
    while (sum_base >= 9) {
        roman_sum += "IX";
        sum_base -= 9;
    }
    while (sum_base >= 5) {
        roman_sum += "V";
        sum_base -= 5;
    }
    while (sum_base >= 4) {
        roman_sum += "IV";
        sum_base -= 4;
    }
    while (sum_base >= 1) {
        roman_sum += "I";
        sum_base -= 1;
    }
		sum_base = sum;
		if sum_base=1000{
			greek_sum += "?";
			sum_base = 0;
		if (sum_base >= 900){
			greek_sum += "w";
			sum_base -= 900;
		}
		if (sum_base >= 800){
			greek_sum +="?";
			sum_base -=800;
		}
		if (sum_base >= 700){
			greek_sum += "?"
			sum_base -= 700;
		}
		if (sum_base >= 600){
				greek_sum += "?";
				sum_base -= 600;
		}
		if (sum_base >= 500){
			 greek_sum += "?";
			 sum_base -= 500;
		}
		if (sum_base >= 400){
			greek_sum += "?";
			sum_base -= 400;
		}
		if (sum_base >= 300){
			greek_sum += "?";
			sum_base -= 300;
		}
		if (sum_base >= 200){
			greek_sum += "?";
			sum_base -= 200;
		}
		if (sum_base >= 100){
			greek_sum += "?";
			sum_base -= 100;
		}
		if (sum_base >= 90){
			greek_sum += "q";
			sum_base -= 90;
		}
		if (sum_base >= 80){
			greek_sum += "?";
			sum_base -= 80;
		}
		if (sum_base >= 70){
			greek_sum += "?";
			sum_base -= 70;
		}
		if (sum_base >= 60){
			greek_sum += "?";
			sum_base -= 60;
		}
		if (sum_base >=50){
			greek_sum += "?";
			sum_base -= 50;
		}
		if (sum_base >= 40){
			greek_sum += "?";
			sum_base -= 40;
		}
		if (sum_base >=30){
			greek_sum += "?";
			sum_base -= 30;
		}
		if (sum_base >=20){
			greek_sum += "?";
			sum_base -= 20;
		}
		if (sum_base >=10){
			greek_sum += "?";
			sum_base -= 10;
		}
		if (sum_base >=9){
			greek_sum += "?";
			sum_base -= 9;
		}
		if (sum_base >=8){
			greek_sum += "?";
			sum_base -= 8;
		}
		if (sum_base >=7){
			greek_sum += "?";
			sum_base -= 7;
		}
		if (sum_base >=6){
			greek_sum += "?";
			sum_base -= 6;
		}
		if (sum_base >=5){
			greek_sum += "?";
			sum_base -= 5;
		}
		if ( sum_base >= 4){
			greek_sum += "?";
			sum_base -=4;
		}
		if ( sum_base >= 3){
			greek_sum += "?";
			sum_base -=3;
		}
		if ( sum_base >=2){
			greek_sum += "?";
			sum_base -= 2;
		}
		if ( sum_base >=1){
			greek_sum += "?";
			sum_base -= 1;
		}
		System.out.println("The number" + "is represented as " + roman_sum + "in Roman numeral and as "
												+ greek_sum + "in Greek numeral")
	}
}
