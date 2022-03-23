package com.irdaislakhuafa.basicspringboot.cyclic;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CyclicA {
    private CyclicB cyclicB;
}
