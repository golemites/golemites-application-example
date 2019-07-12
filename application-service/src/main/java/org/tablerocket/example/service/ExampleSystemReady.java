package org.tablerocket.example.service;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.tablerocket.example.calculator.api.Calculator;
import org.tablerocket.febo.api.FeboEntrypoint;

import java.io.InputStream;
import java.io.PrintStream;

@Component
public class ExampleSystemReady implements FeboEntrypoint
{
    @Reference Calculator calculator;

    @Override public void execute( String[] args, InputStream in, PrintStream out, PrintStream err )
    {
        out.println( "Hello from Felix.");
    }
}
