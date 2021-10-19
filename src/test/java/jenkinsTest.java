import org.junit.Assert;
import org.junit.Test;

public class jenkinsTest {
    @Test
            public void test()
    {
      String userDomain = System.getenv("USERDOMAIN_ROAMINGPROFILE");
        Assert.assertEquals(userDomain,"DESKTOP-EB0V1PH");
    }

}
