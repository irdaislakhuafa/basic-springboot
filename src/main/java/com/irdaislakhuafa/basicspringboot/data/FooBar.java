package com.irdaislakhuafa.basicspringboot.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class FooBar {
    private Foo foo;
    private Bar bar;
}
