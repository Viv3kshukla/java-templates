package practice;

// A dynamic resizing array is an array that resizes itself as
// needed while still providing O(1) access .
	
	
public class DynamicArrayOfInt {
	
	private int[] data;
	
	private int newSize;
	private int position;
	
	public DynamicArrayOfInt() {
		data = new int[1];
		newSize = 1;
		position = 1;
	}
	
	public int get(int position) {
		return data[position];
	}
	
	public void put(int pos,int val) {
		if(pos >= data.length) {
			
			if(pos >= newSize) {
				newSize = 2*position;
			}
			
			int [] newData = new int[newSize];
			
			System.arraycopy(data, 0, newData,0, data.length);
			
			data = newData;
			
		}
		data[pos] = val;
	}
	
	public static void main(String args[]) {
		DynamicArrayOfInt arr = new DynamicArrayOfInt();
		
		arr.put(1, 3);
		
		
	}
	
}
