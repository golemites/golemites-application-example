package org.tablerocket.example;

import org.tablerocket.example.calculator.CalculatorBundle;
import org.tablerocket.example.service.BookingService;
import org.tablerocket.febo.api.Febo;
import org.tablerocket.febo.autobundle.AutoBundleSupport;
import org.tablerocket.febo.core.OSGiFebo;
import org.tablerocket.febo.repository.ClasspathRepositoryStore;

/**
 * Minimal example application showing the basic setup and some optional concepts that complement febo core.
 */
public class App {

    public static void main(String[] args) throws Exception {
        // Optional concept from febo-autobundle allowing bundleization of parts of the classpath from here based on convention.

        AutoBundleSupport autoBundle = new AutoBundleSupport();
        Febo app = OSGiFebo.febo()
                .platform(new ClasspathRepositoryStore())
                .require(autoBundle.from(BookingService.class))
                .require(autoBundle.from(CalculatorBundle.class).withAutoExportApi(true))
                .keepRunning(true);
        app.run(new String[] {"21","99"});
    }
}
