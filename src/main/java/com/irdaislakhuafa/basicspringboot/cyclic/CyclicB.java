package com.irdaislakhuafa.basicspringboot.cyclic;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CyclicB {
    private CyclicC cyclicC;
}
