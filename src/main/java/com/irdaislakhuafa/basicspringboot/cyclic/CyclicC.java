package com.irdaislakhuafa.basicspringboot.cyclic;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CyclicC {
    private CyclicA cyclicA;
}
