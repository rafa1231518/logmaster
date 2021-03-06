
    package fallk.logmaster;

import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LogTest31 {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        LogmasterSettings.c().outputToFile(false).apply();
        System.setOut(new PrintStream(new NullOutputStream()));
        System.setErr(new PrintStream(new NullOutputStream()));
    }

    @After
    public void tearDown() throws Exception {
    }
    
    //! $CHALK_START
    
    
    @Test
    public final void test_severe_Exception_long() {
        HLogger.severe(new Exception(), System.currentTimeMillis());
        HLogger.severe(new Exception(), System.nanoTime());
        HLogger.severe(new Exception(), Long.MAX_VALUE);
        HLogger.severe(new Exception(), Long.MIN_VALUE);
        HLogger.severe(new Exception(), 0);
        HLogger.severe((Exception) null, System.currentTimeMillis());
        HLogger.severe((Exception) null, System.nanoTime());
        HLogger.severe((Exception) null, Long.MAX_VALUE);
        HLogger.severe((Exception) null, Long.MIN_VALUE);
    }

    
    //! $CHALK_END
}
    