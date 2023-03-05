class calculaIMC{
		double pessoa;
		double massa;
		double altura;
		double calcula;

		
		public void calculaImc(double massa, double altura) {
			calcula = massa/(altura*altura);
			
			System.out.println("seu IMC é de: " + calcula);
			
		}


}
