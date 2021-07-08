package com.sergiomartinrubio.agent;

import java.lang.instrument.Instrumentation;

public class MyAgent {
    public static void premain(String agentArgs, Instrumentation inst) {
        System.setProperty("my-property", "Hello World!");
    }
}
