package test;

/**
 * 
 * 有一对兔子，从出生后第 3 个月起每个月都生一对兔 子，
 * 小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问 每个月的兔子总数为多少？
 * 
 * @author theTry
 *
 */
public class Rabbit {

	public static void main(String[] args) {
		int mouth=15;
		int f1 = 1;
		int f2 = 1;
		int f=0;
		for(int i=3;i<mouth; i++) {
		f = f2;
		f2 = f1 + f2;
		f1 = f;
		System.out.print("第" + i +"个月的兔子个数: ");
		System.out.println(" " + f2*2);

	}

	}
}
