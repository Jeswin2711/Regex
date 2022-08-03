package com.assignment;

@FunctionalInterface
public interface IFunctionalInterface<R>
{
    /*
    Predicate PredefinedFunctionalInterface to test the String
     */
    boolean test(String nameRegex , String input);
}
