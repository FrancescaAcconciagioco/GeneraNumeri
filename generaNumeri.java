package generaNumeri;

public class generaNumeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//numero in imput
		int max = Integer.parseInt(args[0]);
		//numero (psudo)casuale compreso tra 0 e 1
		double r = Math.random();
		//intero (pseudo) casuale 0 e max -1
	    int n = (int) (r*max);
	    //fammi vedere in console
	    System.out.println(n);
	    

	}

}
