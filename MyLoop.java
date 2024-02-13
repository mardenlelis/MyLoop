class MyLoop{
	private void runLoop(){
		int x = 0;
		
		System.out.println("Antes do loop o valor de x: " + x);
		
		while(x < 10){
			x = x + 1;
	
			System.out.println("No loop o valor de x: " + x);
		} 

		System.out.println("Após o loop o valor de x: " + x);
	}

	public static void main(String[] args){
		MyLoop loop = new MyLoop();
		loop.runLoop();
	}
}