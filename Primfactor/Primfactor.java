package Primfactor;

import java.math.BigInteger;
import java.util.*;

public class Primfactor {
	
	// Memoization of factors.
	static Map<BigInteger, List<BigInteger>> factors = new HashMap<>();
	private static final BigInteger TWO = BigInteger.ONE.add(BigInteger.ONE);

	public static List<BigInteger> factors(BigInteger n, boolean duplicates) {
	  // Have we done this one before?
	  List<BigInteger> f = factors.get(n);
	  if (f == null) {
	    // Start empty.
	    f = new ArrayList<>();
	    // Check for duplicates.
	    BigInteger last = BigInteger.ZERO;
	    // Limit the range as far as possible.
	    for (BigInteger i = TWO; i.compareTo(n.divide(i)) <= 0; i = i.add(BigInteger.ONE)) {
	      // Can have multiple copies of the same factor.
	      while (n.mod(i).equals(BigInteger.ZERO)) {
	        if (duplicates || !i.equals(last)) {
	          f.add(i);
	          last = i;
	        }
	        // Remove that factor.
	        n = n.divide(i);
	      }
	    }
	    if (n.compareTo(BigInteger.ONE) > 0) {
	      // Could be a residue.
	      if (duplicates || n != last) {
	        f.add(n);
	      }
	    }
	    // Memoize.
	    factors.put(n, f);
	  }
	  return f;
	}

	public static void main(String[] args) {
		BigInteger bi = new BigInteger("600851475143");
		for(BigInteger in : factors(bi, false)) {
			System.out.println(in);
		}
	}

}
