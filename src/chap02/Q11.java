package chap02;

public class Q11 {

	class YMD {
		int y;
		int m;
		int d;
		
		static int[][] mdays= {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		
		public int isLeap(int y) {   
		    return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0 ? 1 : 0; 
		}
		
		public YMD(int y, int m, int d) {
			this.y = y;
			this.m = m;
			this.d = d;
		}
		
		public YMD after(int n) {
			
			if (n < 0)
				return before(-n);
			
			YMD temp = new YMD(y, m, d);
			temp.d += n;
			while (temp.d > mdays[isLeap(y)][temp.m - 1]) {
				temp.d -= mdays[isLeap(y)][temp.m - 1];
				if(++temp.m == 13) {
					temp.y++;
					temp.m = 1;
				}
			}
			return temp;
		}
		
		public YMD before(int n) {
			
			if (n < 0)
				return after(-n);
			
			YMD temp = new YMD(y, m, d);
			temp.d -= n;
			while (temp.d < 1) {
				temp.d += mdays[isLeap(temp.y)][temp.m - 1];
				if(--temp.m == 0) {
					temp.y--;
					temp.m = 12;
				}
			}
			return temp;
		}
		
	}
	
	
	public static void main(String[] args) {
		
	}
	
}
