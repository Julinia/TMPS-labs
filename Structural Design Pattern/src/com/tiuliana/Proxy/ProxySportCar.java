package com.tiuliana.Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxySportCar implements Car {
    private Car car = new SportCar();
    private static List<String> allowedOwners;

    static {
        allowedOwners = new ArrayList<>();
        allowedOwners.add("Tudor Dumitrescu");
        allowedOwners.add("Stefan Cebotar");
        allowedOwners.add("Petrica Ilasco");
    }

    @Override
    public void connectTo(String owner) throws Exception {
        if (!allowedOwners.contains(owner)) {
            throw new Exception("Access Denied");
        }

        car.connectTo(owner);
    }

}
