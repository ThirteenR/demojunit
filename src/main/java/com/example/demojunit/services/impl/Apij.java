package com.example.demojunit.services.impl;

import com.example.demojunit.services.Api;
import com.example.demojunit.services.TestB;

public class Apij implements Api {
    private TestB testB;
    @Override
    public String test() {
        return testB.test();
    }
}
