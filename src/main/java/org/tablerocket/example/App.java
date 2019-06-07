package org.tablerocket.example;

import org.tablerocket.example.calculator.CalculatorBundle;
import org.tablerocket.example.service.BookingService;
import org.tablerocket.febo.autobundle.AutoBundleSupport;
import org.tablerocket.febo.core.Febo;
import org.tablerocket.febo.repository.ClasspathRepositoryStore;

/**
 * Minimal example application showing the basic setup and some optional concepts that complement febo core.
 */
public class App {

    public static void main(String[] args) throws Exception {
        // Optional concept from febo-repository giving static access to bundle resources loaded by gradle plugin.
        FeboRepository repo = new FeboRepository(new ClasspathRepositoryStore());
        // Optional concept from febo-autobundle allowing bundleization of parts of the classpath from here based on convention.

        AutoBundleSupport autoBundle = new AutoBundleSupport();
        Febo app = Febo.febo()
                //.keepRunning(true)
                .require(repo.org_osgi_util_function())
                .require(repo.org_osgi_util_promise())
                .require(repo.org_apache_felix_scr())
                /**
                .require(repo.org_apache_felix_http_jetty())
                .require(repo.org_apache_felix_http_servlet_api())
                .require(repo.org_apache_aries_jax_rs_whiteboard())
                .require(repo.org_osgi_service_jaxrs())
                .require(repo.org_apache_servicemix_specs_annotation_api_1_3())
                 **/
                .require(repo.org_apache_felix_configadmin())
                .require(repo.org_apache_aries_javax_jax_rs_api())

                .require(repo.org_ops4j_pax_logging_pax_logging_api())
                .require(repo.org_ops4j_pax_logging_pax_logging_service())
                //.require(repo.org_apache_felix_webconsole())


                .require(autoBundle.from(BookingService.class))
                .require(autoBundle.from(CalculatorBundle.class).withAutoExportApi(true));

        app.run(new String[] {"21","99"});
    }
}
