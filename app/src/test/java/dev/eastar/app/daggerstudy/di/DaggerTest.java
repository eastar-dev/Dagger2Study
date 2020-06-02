package dev.eastar.app.daggerstudy.di;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DaggerTest {
    @Test
    public void testMemberInjection() {
        MyClass myClass = new MyClass();
        assertNull("처음에 그냥 받으면 null 이다", myClass.name);

        MyComponent myComponent = DaggerMyComponent.create();
        myComponent.inject(myClass);
        assertEquals("eastar 10", myClass.name + " " + myClass.age);
        assertEquals("eastar 10", myClass.name + " " + myClass.age2);
    }
}