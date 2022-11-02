package basicPatterns;

public class DataSource {

	int[] points = new int[25];
	
	public void setData() {
		
	for(int i=0; i<25;i++)
	{
		points[i] = (int) (Math.random() * 200) + 1;
	}
							}
	
	public int[] getData() {
		return points;
							}
	
}
