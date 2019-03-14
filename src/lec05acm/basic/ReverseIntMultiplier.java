package lec05acm.basic;

public class ReverseIntMultiplier {
	public static void main(String[] args) {
		int x=52;
		int y=52;
		int z=r(r(x)*r(y));
		System.out.println(z);
	}

	 static int r(int x) {		 
		return Integer.parseInt(new StringBuffer(Integer.toString(x)).reverse()
				.toString());
	}
	 static int r2(int x)
	 {
		 int t=0;
		 while(x>0)
		 {
			 t=t*10+(x%10);
			 x/=10;
		 }
		 return t;
	 }
}