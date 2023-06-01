package tech.tryu.transaction.service;

import tech.tryu.transaction.entity.Foo;

public interface IFootMapper {
    Foo getFoo(String fooName);

    Foo getFoo(String fooName, String barName);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);
}
