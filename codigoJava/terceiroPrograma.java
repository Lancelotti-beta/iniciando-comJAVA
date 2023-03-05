class terceiroPrograma{
	public static void main(String args[]){
		double valorBoleto;
		double valorMulta;
		double valorTotal;
		
		valorBoleto= 450;
		
		valorMulta = valorBoleto*0.10;
		
		valorTotal = valorBoleto + valorMulta;
		
		System.out.println("O valor do seu Boleto é: " + valorBoleto);
		System.out.println("Seu percentual de multa é de 10%");
		System.out.println("valor da multa: " + valorMulta);
		System.out.println("Total a ser pago: " + valorTotal);
	}
}