package Primfactor;

import java.math.BigInteger;
import java.util.*;

public class Primfactor {
	static Map<BigInteger, List<BigInteger>> faktor = new HashMap<>();
	private static final BigInteger TWO = BigInteger.ONE.add(BigInteger.ONE);

	public static List<BigInteger> fac(BigInteger n, boolean duplicates) {
	  List<BigInteger> BigIList = faktor.get(n);
	  if (BigIList == null) {
	    BigIList = new ArrayList<>();
	    BigInteger last = BigInteger.ZERO;
	    for (BigInteger i = TWO; i.compareTo(n.divide(i)) <= 0; i = i.add(BigInteger.ONE)) {
	      while (n.mod(i).equals(BigInteger.ZERO)) {
	        if (duplicates || !i.equals(last)) {
	          BigIList.add(i);
	          last = i;
	        }
	        n = n.divide(i);
	      }
	    }
	    if (n.compareTo(BigInteger.ONE) > 0){
	      if (duplicates || n != last) 
	        BigIList.add(n);
	    }
	    faktor.put(n, BigIList);
	  }
	  return BigIList;
	}

	public static void main(String[] args) {
		BigInteger bi = new BigInteger("600851475143");
		for(BigInteger in : fac(bi, false)) {
			System.out.println(in);
		}
	}

}
