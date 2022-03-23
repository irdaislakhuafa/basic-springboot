package com.irdaislakhuafa.basicspringboot.configurations;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CircularBeanConfiguration {
    /*
     * @Bean
     * public CyclicA cyclicA(CyclicB cyclicB) {
     * return CyclicA.builder().cyclicB(cyclicB).build();
     * }
     * 
     * @Bean
     * public CyclicB cyclicB(CyclicC cyclicC) {
     * return CyclicB.builder().cyclicC(cyclicC).build();
     * }
     * 
     * @Bean
     * public CyclicC cyclicC(CyclicA cyclicA) {
     * return CyclicC.builder().cyclicA(cyclicA).build();
     * }
     */
}
