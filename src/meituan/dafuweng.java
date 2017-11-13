package meituan;

import java.util.Scanner;

public class dafuweng {

	/**
	 * 大富翁游戏，玩家根据骰子的点数决定走的步数，即骰子点数为1时可以走一步，点数为2时可以走两步，点数为n时可以走n步。求玩家走到第n步（n<=骰子最大点数且是方法的唯一入参）时，总共有多少种投骰子的方法。
输入描述:

输入包括一个整数n,(1 ≤ n ≤ 6)



输出描述:

输出一个整数,表示投骰子的方法


输入例子1:

6


输出例子1:

32
台阶问题变异，有点意思
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.print(taijie(i));
	}
	
	public static int taijie(int n) {
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		if(n<=0)
			return 0;
		
		return taijie(n-5)+taijie(n-4)+taijie(n-3)+taijie(n-2)+taijie(n-1)+1;
	}

}
