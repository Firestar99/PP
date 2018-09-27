package io.dama.par.cf.rsa;

import java.math.BigInteger;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class RSAKeyPar {
	
	private static CompletableFuture<BigInteger> getAsyncPrim(final int len) {
		final Supplier<BigInteger> primSupplier = () -> {
//			final CompletableFuture<Object> cfPrim = CompletableFuture /* ... */;
			final CompletableFuture<Object> cfPrim = null;
			return (BigInteger) cfPrim.join();
		};
		
		return CompletableFuture.supplyAsync(primSupplier);
	}
	
	public static KeyValue getKeyParallel(final int len) {
		// Berechne zwei Primzahlen
		final CompletableFuture<BigInteger> primPFuture = RSAKeyPar.getAsyncPrim(len);
		final CompletableFuture<BigInteger> primQFuture = RSAKeyPar.getAsyncPrim(len);
		
		// Berechne phi und N
		
		// Wähle e
		
		// Berechne d
		
		return null;
//		return new KeyValue(N, e, d);
	}
	
	public static void main(final String[] args) {
		final long now = System.currentTimeMillis();
		final KeyValue result = RSAKeyPar.getKeyParallel(4096);
		System.out.println("Runtime: " + (System.currentTimeMillis() - now) + "ms");
	}
}
