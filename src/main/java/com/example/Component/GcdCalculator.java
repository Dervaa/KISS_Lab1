package com.example.Component;

import javax.inject.Inject;
import javax.interceptor.Interceptors;

// import com.example.Annotation.EUCLIDEAN;
import com.example.GcdMethods.IGcdCalculator;
import com.example.Interceptors.TimeProfilerInterceptor;

@Interceptors(TimeProfilerInterceptor.class)
public class GcdCalculator {
    @Inject 
    private IGcdCalculator gcdCalculator;
    public int calculateGcd(int a, int b){
        return gcdCalculator.calculateGcd(a, b);
    }
}
