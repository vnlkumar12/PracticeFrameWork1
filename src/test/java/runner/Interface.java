package runner;

import org.testng.annotations.DataProvider;

public interface Interface {
    @DataProvider(parallel = true)
    Object[][] scenario();
}
