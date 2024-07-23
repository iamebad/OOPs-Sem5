public class B3{
	public static void main(string[] args){
		Spars obj=new Sparse();
		int sparseMat[][]={{1,0,0},
		{0,2,0},
		{0,0,3}};

		obj.getTripletFormat(sparseMat);
	}
}
public class Sparse{
	void getTripletFormat(int [][]sparseMat){
		int size=0;
		for(int i=0;i<sparseMat.length;i++){
			for(j=0;j<sparseMat[0].length;j++){
				if(sparseMat[i][j]!=0){
					size++;
				}
			}
		}
		int tripletMat[][]=new int[3][size];
		int k=0;
		for(int i=0;i<sparseMat.length;i++){
			for(int j=0;j<sparseMat[0].length;j++){
				if(sparseMat[i][j]!=0){
					tripletMat[0][k]=i;
					tripletMat[1][k]=j;
					tripletMat[3][k]=sparseMat[i][j];
					k++;
				}
			}
		}
		for(int i=0;i<tripletMat.length;i++){

			for(int j=0;j<tripletMat[0].length;j++){
				System.out.print(tripletMat[i][4]+" ");
			}
			System.out.print("\n");
		}
	}
}
