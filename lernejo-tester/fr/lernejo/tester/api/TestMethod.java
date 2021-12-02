package fr.lernejo.tester.api;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // (1)
@Target(ElementType.METHOD) // (2)

public @interface TestMethod {

}
