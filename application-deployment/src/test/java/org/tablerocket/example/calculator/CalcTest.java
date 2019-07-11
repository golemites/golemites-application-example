package org.tablerocket.example.calculator;

import org.junit.jupiter.api.Test;
import org.tablerocket.example.mytest.MyTestEntry;
import org.tablerocket.febo.api.Boot;
import org.tablerocket.febo.autobundle.AutoBundleSupport;
import org.tablerocket.febo.repository.ClasspathRepositoryStore;

class CalcTest {
    @Test
    void simpleTest() throws Exception {
        AutoBundleSupport autoBundle = new AutoBundleSupport();
        Boot.febo()
                .platform(new ClasspathRepositoryStore())
                .require(autoBundle.from(MyTestEntry.class))
                .require(autoBundle.from(CalculatorBundle.class).withAutoExportApi(true))
                .run(new String[]{});
    }
}
