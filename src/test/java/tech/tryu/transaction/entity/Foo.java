package tech.tryu.transaction.entity;

public class Foo {
    private String fooName;
    private String barName;

    public Foo(String fooName, String barName) {
        this.fooName = fooName;
        this.barName = barName;
    }

    public Foo() {
    }

    public String getFooName() {
        return fooName;
    }

    public void setFooName(String fooName) {
        this.fooName = fooName;
    }

    public String getBarName() {
        return barName;
    }

    public void setBarName(String barName) {
        this.barName = barName;
    }
}
