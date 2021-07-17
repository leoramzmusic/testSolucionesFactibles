package SolucionesFactibles.ProjectSolucionesFactibles;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class AreTheSameTest {
	public static void main(String[] args) {
		//System.out.println(assertEquals(true, AreTheSame);
	}
	
	@org.junit.Test
	 public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, AreTheSame.comp(a, b));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
	
	@org.junit.Test
    public void test2() {
        int[] a = new int[]{2,2,3};
        int[] b = new int[]{9,9,4};
        assertEquals(false, AreTheSame.comp(a, b));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}
