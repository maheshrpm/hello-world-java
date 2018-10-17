package org.pictolearn.docker;

/**
 * {@code HelloWorldPing}
 *
 * @author Maheshkumar Periyasamy
 * @since 17-10-2018
 */
public class HelloWorldPing {
	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 50; i++){
			System.out.println("Maheshrpm Hello World Ping " + i );
			Thread.sleep(1000);
		}
	}
}
