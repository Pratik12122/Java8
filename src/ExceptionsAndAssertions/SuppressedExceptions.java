package ExceptionsAndAssertions;

import java.io.IOException;

public class SuppressedExceptions {

	public static void main(String[] args) {
		try(Zoo z1 = new Zoo("z1");Zoo z2 = new Zoo("z2")){
			throw new IOException("Heavy Rains ...");
		}catch (IOException e) {
			System.err.println(e.getMessage());
			for (Throwable t  : e.getSuppressed()) {
				System.out.println(t.getMessage());
			}
		}
	}

}


class Zoo implements AutoCloseable {

	String name;
	
	public Zoo(String name) {
		this.name = name;
	}
	
	@Override
	public void close() throws IOException {
		throw new IOException("Error While Closing zoo " + name);
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
