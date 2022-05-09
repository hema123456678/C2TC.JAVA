
public class MatricsTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original[][]= {{1,2},{3,4}};
		System.out.println("Printing Matrix without transpose:");
		for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{System.out.println(original[i][j]+" ");
			}
			System.out.println();
			}
			System.out.println("Printing Matrix After Transpose");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					System.out.println(original[i][j]+" ");
				}
				System.out.println();
			
		}

	}

}
