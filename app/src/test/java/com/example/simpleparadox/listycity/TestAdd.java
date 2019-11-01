package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAdd {
    @Test

    public void testAdd(){
        Add add = new Add(1,2);
        assertEquals(3,add.add());
    }
    @Test
    public void testAdd2(){
        Add add = new Add(1,2);
        assertEquals(3,add.add());
    }
}

