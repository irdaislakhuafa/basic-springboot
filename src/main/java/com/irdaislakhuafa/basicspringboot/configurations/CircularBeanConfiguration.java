package com.irdaislakhuafa.basicspringboot.configurations;

import com.irdaislakhuafa.basicspringboot.cyclic.CyclicA;
import com.irdaislakhuafa.basicspringboot.cyclic.CyclicB;
import com.irdaislakhuafa.basicspringboot.cyclic.CyclicC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CircularBeanConfiguration {
    @Bean
    public CyclicA cyclicA(CyclicB cyclicB) {
        return CyclicA.builder().cyclicB(cyclicB).build();
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC) {
        return CyclicB.builder().cyclicC(cyclicC).build();
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA) {
        return CyclicC.builder().cyclicA(cyclicA).build();
    }
}
