package cl.aiep.java;

public class Calculadora {

	public Integer sumar(Integer a, Integer b) {
		if(a == null) {
			a = 0;
		}
		
		if(b == null) {
			b = 0;
		}
		
		
		return a+b;
	}
	
	public Double dividir(Double a, Double b) throws Exception {
		if(b == null || b == 0) {
			throw new Exception("Denominador invalido");
		}
		
		Double i = a / b;
		
		return i;
	}
}
