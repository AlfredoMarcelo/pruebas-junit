package cl.aiep.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class) //Con esta anotacion indicamos que vamos a ordenar la ejecución de los test
public class CalculadoraTest {
	
	
	
	
	/*
	@BeforeAll
	public static void beforeAll() {
		System.out.println("BeforeAll");
	}
	@BeforeEach //esta anotacion no debe ser static
	public  void beforeEach() {
		System.out.println("BeforeEach");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After All");
	}
	
	@AfterEach //esta anotacion no debe ser static
	public  void afterEach() {
		System.out.println("After Each");
	}
	*/
	@Test
	@Order(1) //Con la anotacion Order, podemos indicar el orden en que se van ejecutando los Test con JUnit
	public void testSumar() {
		int a = 2, b = 3, c = 5, resultado = 0;
		
		Calculadora calc = new Calculadora();
		resultado = calc.sumar(a, b);
		
		System.out.println("resultado suma 1=> "+ resultado);
	}
	@Test
	@Order(2) //Con la anotacion Order, podemos indicar el orden en que se van ejecutando los Test con JUnit
	public void testSumar1() {
		int a = 2, b = 3, c = 5, resultado = 0;
		
		Calculadora calc = new Calculadora();
		resultado = calc.sumar(a, b);
		
		System.out.println("resultado suma 2 => "+ resultado);
	}
	
	@Test
	@Order(4) //Con la anotacion Order, podemos indicar el orden en que se van ejecutando los Test con JUnit
	public void testDividir() {
		Double a=2.0, b=3.0, esperado=0.6666666666666666, resultado=0.0;
		
		Calculadora calc = new Calculadora();
		try {
			resultado = calc.dividir(a, b);
		} catch (Exception e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		
		Assertions.assertEquals(esperado, resultado); //El assertion assertEqual es para comprobar que el resultado de la prueba sea igual a lo esperado que indicamos
				
		System.out.println("resultado division => "+ resultado);
	}
	
	
	@Test
	@Order(3) //Con la anotacion Order, podemos indicar el orden en que se van ejecutando los Test con JUnit
	public void testDividirDenominadorCero() {
		Double a=2.0, b=3.0, esperado=0.6666666666666666, resultado=0.0;
		
		Calculadora calc = new Calculadora();
		try {
			resultado = calc.dividir(a, b);
		} catch (Exception e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		
		Assertions.assertTrue(esperado != resultado); //El assertion asserTrue o assertFalse, se puede utilizar el == o !=
		
		System.out.println("resultado division 2 => "+ resultado);
	}
	
	
	@Test
	@Order(5) //Con la anotacion Order, podemos indicar el orden en que se van ejecutando los Test con JUnit
	public void testDividirCheckExcepction() {
		Double a=2.0, b=0.0, esperado=0.6666666666666666, resultado=0.0;
		
		Calculadora calc = new Calculadora();
		try {
			Exception ex = assertThrows(Exception.class, () -> {
				calc.dividir(a, b);
				}); 
			assertEquals("Denominador invalido", ex.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		
		Assertions.assertTrue(esperado != resultado); //El assertion asserTrue o assertFalse, se puede utilizar el == o !=
		
		System.out.println("resultado division 2 => "+ resultado);
	}
}
