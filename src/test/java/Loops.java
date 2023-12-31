
public class Loops {

	public static void main(String[] args) {
		
		
		int[][] matrix = {{5,2,3},{8,6,7},{1,9,4}};
		int big = matrix[0][0];
		//find the largest of all

		for(int i=0; i<3;i++){
			//inner for loop
			
			for(int j=0; j<3; j++) {
				
				if(matrix[i][j]>big) {
					big = matrix[i][j];
				}
			}
		}
		System.out.println(big);

		
		}
}
