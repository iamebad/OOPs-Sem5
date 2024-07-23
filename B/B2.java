package B2;
public class B2{
	public static void main(String[] args) {
		Matrix obj = new Matrix();
		int [][]matrix={
		{1,2,2},
		{4,1,6},
		{2,8,1}};
		obj.sumDiagonals(matrix);
	}
}
public class Matrix{
	void sumDiagonals(int [][]matrix){
		int i,j;
		int leftSum=0,rightSum=0;
		for( i=0,j=matrix.length-1;i<matrix.length&&j>=0;i++,j--){
			leftSum+=matrix[i][i];
			rightSum+=matrix[i][j];
		}	
		/*for(i=0;i<matrix.length;i++){
			for(j=0;j<matrix.length;j++){
				if(i==j)leftSum+=matrix[i][j];
				if((i+j)==matrix.length-1)rightSum+=matrix[i][j];
			}
		}*/
		System.out.println("Sum of left digonal="+leftSum);
		System.out.println("Sum of right diagonal="+rightSum);
	}
}
