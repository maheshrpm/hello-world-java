package org.pictolearn.docker;

/**
 * {@code HelloWorldPing}
 *
 * @author Maheshkumar Periyasamy
 * @since 17-10-2018
 */
public class HelloWorldPing {
	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 10; i++){
			System.out.println("HI World Ping " + i );
			Thread.sleep(1000);
		}
	}
}
