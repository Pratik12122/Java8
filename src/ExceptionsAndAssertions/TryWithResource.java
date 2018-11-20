package ExceptionsAndAssertions;

import java.io.Closeable;

public class TryWithResource {

	
	public static void main(String[] args) {
		try(TruckeyCage t1 = new TruckeyCage(1);
			TruckeyCage t2 = new TruckeyCage(1)){
		    System.out.println("put turkeys in");
		}
		

	}
	
}

class TruckeyCage implements Closeable,AutoCloseable {

	private int num =0;
	public TruckeyCage(int num){
		this.num = num;
	}
	@Override
	public void close() {
		System.out.println("Close Gates");
	}
	
	public int getNum() {
		return num;
	}
	
	@Override
	public String toString() {
		return "Truckey " + this.num;
	}
}
