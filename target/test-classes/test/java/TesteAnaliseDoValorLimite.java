package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.RaizQuadrada;

public class TesteAnaliseDoValorLimite {
	
	@Test
	public void numerosPositivos() {
		assertEquals(Double.valueOf(2.0), Double.valueOf(new RaizQuadrada().sqrt(3.9)));
		assertEquals(Double.valueOf(2.0), Double.valueOf(new RaizQuadrada().sqrt(4.0)));
		assertEquals(Double.valueOf(2.0), Double.valueOf(new RaizQuadrada().sqrt(4.1)));
	}
	
	@Test
	public void numeroZero() {
		assertEquals(Double.valueOf(0.0), Double.valueOf(new RaizQuadrada().sqrt(-0.1)));
		assertEquals(Double.valueOf(0.0), Double.valueOf(new RaizQuadrada().sqrt(0.0)));
		assertEquals(Double.valueOf(0.0), Double.valueOf(new RaizQuadrada().sqrt(0.1)));
	}
	
	@Test
	public void numerosNegativos() {
		assertEquals(Double.valueOf(0.0), Double.valueOf(new RaizQuadrada().sqrt(-3.9)));
		assertEquals(Double.valueOf(0.0), Double.valueOf(new RaizQuadrada().sqrt(-4.0)));
		assertEquals(Double.valueOf(0.0), Double.valueOf(new RaizQuadrada().sqrt(-4.1)));
	}

}
