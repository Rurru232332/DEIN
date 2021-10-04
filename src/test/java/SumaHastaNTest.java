/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Main.SumaHastaN;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alumno Tarde
 */
public class SumaHastaNTest {
    
    public SumaHastaNTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    /*
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
*/
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testSumarHasta(){
        assertEquals(SumaHastaN.sumarHasta(4), 10);
    }
    
    @Test
    public void testSumarHasta2(){
        assertNotEquals(SumaHastaN.sumarHasta(4), 11);
    }
    
    @Test
    public void testSumarHasta3(){
        assertEquals(SumaHastaN.sumarHasta(5), 15);
    }
    
}
/*
Here's a little lesson in trickery
This is going down in history
If you wanna be a villian number one
You have to chase a super hero on the run

Just follow my moves
And sneak around
Be careful not to make a sound
Shhh, don't touch that

We are number one! (Hey!)
We are number one!
We are number one!

Ha, ha, ha
Now look at this net
That I just found
When I say go
Be ready to throw
And go!
Throw it on him, not me!
Ugh, let's try something else

Now watch and learn
Here's the deal
Slip and slide on this banana peel
Hahaha!
What are you doing?!

We are number one! (Hey!)
Villian number one!
We are number one! (Hey!)
We are number one! (Hey!)
Na, nanaranananana
Nanaranana, nana, narananana
Na, nanaranananana
Nanaranana, nana, narananana
Na, nanaranananana
Nanaranana, nana, narananana
Na, nanaranananana
Nanaranana, nana
We are number one!
We are number one!
We are number one!
Hey! Hey!

*/