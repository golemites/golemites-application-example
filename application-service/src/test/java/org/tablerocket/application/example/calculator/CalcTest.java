package org.tablerocket.application.example.calculator;

import org.junit.jupiter.api.Test;
import org.tablerocket.application.example.mytest.MyTestEntry;
import org.tablerocket.febo.api.Boot;
import org.tablerocket.febo.autobundle.AutoBundleSupport;
import org.tablerocket.febo.repository.ClasspathRepositoryStore;

class CalcTest {
    @Test
    void simpleTest() throws Exception {
        AutoBundleSupport autoBundle = new AutoBundleSupport();
        Boot.febo()
                .platform(new ClasspathRepositoryStore()) // the target platform
                .require(autoBundle.scan(getClass().getClassLoader())) // domain bundles
                .require(autoBundle.from(MyTestEntry.class)) // test probe
                .run(new String[]{});
    }
}
