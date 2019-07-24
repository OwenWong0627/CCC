
public class CCC05S3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] A = {{1,1},{1,-1}};
		int [][] B = {{1,0},{0,1}};
		int ar = A.length;
		int ac = A[0].length;
		int br = B.length;
		int bc = B[0].length;
		int [][] C = new int[ar*br][ac*bc];
		for (int r=0; r<ar*br; r++) {
			for(int c=0; c<ac*bc; c++) {
				C[r][c] = A[r/br][c/bc]*B[r%br][c%bc];
			}
		}
		for (int r=0; r<ar*br; r++) {
			for(int c=0; c<ac*bc; c++) {
				System.out.print(C[r][c]+" ");
			}
			System.out.println();
		}
		// min max minrow maxrow mincol maxcol
	}

}
