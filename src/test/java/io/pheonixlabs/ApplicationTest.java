package io.pheonixlabs;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple Application.
 */
public class ApplicationTest{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        Boolean hi = new Boolean("Ssd");
        assertTrue(true);
    }

    public static void main(String[] args) throws Exception{

        //Integer asdsad = new Integer("");
        //int i = 5/0;
        int[] i = new  int[4];
        int x = i[3];

        StringBuilder a = new StringBuilder("as");
        StringBuilder b = new StringBuilder("as");
        b.append("444").insert(1,"yyy");

        Boolean a1 = (a.equals(b));
        Boolean b1 = (a == b);

        HashSet<String> hs = new HashSet<String>();
        hs.add("s");
        hs.remove(a);

        System.out.println( x );
        System.out.println(b1 );
        String ad = "four ";
    }
}
