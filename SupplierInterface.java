// import java.util.*;
import java.util.function.Supplier;

public class SupplierInterface
{
	public static void main(String[] args) {
	    Supplier<Double> sp= ()->Math.random();
		System.out.println(sp.get());
	}
}
