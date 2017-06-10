import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zerosx on 10/6/2560.
 */
public class TestTdd {
    @Test
    public void captcha_OnePlus1() {
        Captcha captcha=new Captcha(1,1,1,1);
        String actual=captcha.getResult();
        assertEquals("ONE+1",actual);
    }
}
