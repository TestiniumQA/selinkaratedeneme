package runner;

import com.intuit.karate.junit5.Karate;

class SmokeRunner {

    @Karate.Test
    Karate testUi() {
        return Karate.run("denemeSc").tags("smoke").relativeTo(getClass());
    }
}
