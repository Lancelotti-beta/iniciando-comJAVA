
public class TestaSoma {
	
	public static void main(String[] args) {
		MatematicaAvancada ma=new MatematicaAvancada();
		ma.soma(7 , 5);
		
		double resuta = ma.getResultado();
		System.out.println("Resultado: " +  resuta);
		
		if(ma.par(resuta)) {
			System.out.println("Este numero é Par");
		} else {
			System.out.println("Este numero é Impar");
		}
	}
}
