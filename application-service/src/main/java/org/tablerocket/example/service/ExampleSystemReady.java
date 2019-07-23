package org.tablerocket.example.service;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tablerocket.example.calculator.api.Calculator;
import org.tablerocket.example.calculator.extra.Operator;
import org.tablerocket.febo.api.FeboEntrypoint;

import java.io.InputStream;
import java.io.PrintStream;

@Component(immediate = true)
public class ExampleSystemReady implements FeboEntrypoint
{
    @Reference Calculator calculator;

    private static Logger LOG = LoggerFactory.getLogger(ExampleSystemReady.class);

    @Override public void execute( String[] args, InputStream in, PrintStream out, PrintStream err )
    {
        String ar = String.join(" ",args);
        out.println( "Thank You for passing in " + ar);
        if (args.length >= 2) {
            int p1 = Integer.parseInt(args[0]);
            int p2 = Integer.parseInt(args[1]);

            int result = calculator.sum(p1, p2, Operator.EARTH);
            out.println("Result is " + result);
            LOG.warn("Result: " + result);
        }else {
            LOG.warn("Not enough parameters for a calculation.");

            err.println("Not enough parameters for a calculation.");
        }
    }
}
