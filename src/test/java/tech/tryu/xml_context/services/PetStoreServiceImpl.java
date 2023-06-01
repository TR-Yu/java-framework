package tech.tryu.xml_context.services;

/**
 * @author tryu
 */
public class PetStoreServiceImpl {
    public String name;

    public String address;

    public PetStoreServiceImpl() {
    }

    @Override
    public String toString() {
        return "PetStoreServiceImpl{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
