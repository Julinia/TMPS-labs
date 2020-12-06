package com.tiuliana.Proxy;

import java.util.ArrayList;
import java.util.List;

interface Car {
    void connectTo(String owner) throws Exception;
}

class SportCar implements Car {
    @Override
    public void connectTo(String owner)
    {
        System.out.println("Engine can start. Owner is "+ owner);
    }
}

class ProxySportCar implements Car {
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
        if(!allowedOwners.contains(owner))
        {
            throw new Exception("Access Denied");
        }

        car.connectTo(owner);
    }

}

public class ClientProxyDemo {
    public static void main(String[] args)  {
        Car car = new ProxySportCar();
        try {
            car.connectTo("Tudor Dumitrescu");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}