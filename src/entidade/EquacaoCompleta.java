package entidade;

public class EquacaoCompleta {
	private double coeficienteA;
	private double coeficienteB;
	private double coeficienteC;
	
	
	public double getCoeficienteA() {
		return coeficienteA;
	}
	
	
	public void setCoeficienteA(double a) throws CoeficienteException {
		if(a == 0) {
			throw new CoeficienteException("coeficiente tem que ser maior que 0\n");
		}
		this.coeficienteA = a;
	}
	
	
	public double getCoeficienteB() {
		return coeficienteB;
	}
	
	
	
	public void setCoeficienteB(double b) throws CoeficienteException {
		if(b == 0) {
			throw new CoeficienteException("coeficiente tem que ser maior que 0\n");
		}
		this.coeficienteB = b;
	}
	
	
	
	public double getCoeficienteC() {
		return coeficienteC;
	}
	
	
	
	public void setCoeficienteC(double c) throws CoeficienteException {
		if(c == 0) {
			throw new CoeficienteException("coeficiente tem que ser maior que 0\n");
		}
		this.coeficienteC = c;
	}
	
	
	
	//formula do delta
	public double calcularDelta() throws RaizException {
		double delta = (this.coeficienteB * this.coeficienteB) - 4 * this.coeficienteA * this.coeficienteC;
		if(delta < 0) {
			throw new RaizException("A equação não possui solução real.");
		}
		return delta;
	}
	
	
	
	//formula de Bhaskara
	public double raizPositiva() throws RaizException {
		double x = (- (this.coeficienteB) + Math.sqrt(calcularDelta())) / 2 * this.coeficienteA;
		return x;
	}
	
	
	//formula de Bhaskara
		public double raizNegativa() throws RaizException {
			double x = (- (this.coeficienteB) - Math.sqrt(calcularDelta())) / 2 * this.coeficienteA;
			return x;
	}
		
	//calcular a equacao completa
		public void mostrarRaizes() throws RaizException{
			System.out.println("\nRaizes:");
			System.out.println("x' = "+raizPositiva());
			System.out.println("x'' = "+ raizNegativa());
		}
		
		//corpo da equacao
		public void imprimeEquacao() {
			
		}
	
	
	@Override
	public String toString() {
		return "EquacaoCompleta [coeficienteA=" + coeficienteA + ", coeficienteB=" + coeficienteB + ", coeficienteC="
				+ coeficienteC + "]";
	}
	
	
	
	
	
	

}
