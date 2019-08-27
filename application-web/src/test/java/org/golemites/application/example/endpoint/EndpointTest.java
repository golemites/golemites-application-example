package org.golemites.application.example.endpoint;

import org.golemites.testsupport.GolemitesExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static io.restassured.RestAssured.get;

@ExtendWith(GolemitesExtension.class)
class EndpointTest {

    @Test
    void testWebEndpointIsAvailable() {
        get("/foo").then().statusCode(200);
    }
}
