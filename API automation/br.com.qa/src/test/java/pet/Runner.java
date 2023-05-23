package pet;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class account_runner {

	int threads = 1;

	@Test
	void testParallel() {
		Results results = Runner.path("classpath:./").outputCucumberJson(true).karateEnv("dev").parallel(threads);
		assertTrue(results.getFailCount() == 0, results.getErrorMessages());
	}
}