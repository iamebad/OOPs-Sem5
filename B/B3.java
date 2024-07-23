package B;
public class B3{
	public static void main(String[] args){
		Sparse obj=new Sparse();
		obj.getTripletFormat();
	}
}
class Sparse{
	int sparseMat[][]={{1,0,0},
	{0,2,0},
	{0,0,3}};
	void getTripletFormat(){
		int size=0;
		for(int i=0;i<sparseMat.length;i++){
			for(int j=0;j<sparseMat[0].length;j++){
				if(sparseMat[i][j]!=0){
					size++;
				}
			}
		}
		int [][]tripletMat=new int[3][size];
		int k=0;
		for(int i=0;i<sparseMat.length;i++){
			for(int j=0;j<sparseMat[0].length;j++){
				if(sparseMat[i][j]!=0){
					tripletMat[0][k]=i;
					tripletMat[1][k]=j;
					tripletMat[2][k]=sparseMat[i][j];
					k++;
				}
			}
		}
		System.out.println("The Sparse Matrix:");
		for(int i=0;i<sparseMat.length;i++){

			for(int j=0;j<sparseMat[0].length;j++){
				System.out.print(sparseMat[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("The tripletform of Sparse Matrix:");
		for(int i=0;i<tripletMat.length;i++){

			for(int j=0;j<tripletMat[0].length;j++){
				System.out.print(tripletMat[i][j]+" ");
			}
			System.out.print("\n");
		}
		//first row in triplet will represent the row of Sparse Matrix
		//Second row in triplet will represent the column of Sparse Matrix
		//third row in triplet will represnt the value of non zero element of Sparse Matrix corresponding to row and column .
	}

}
