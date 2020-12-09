# TMPS-lab-2
## Lab 1 - Structural Design Pattern
### Author 
Turcanu Iuliana

## Lab 2 - Structural Design Pattern
### Tasks:
 
1. Implement at least 3 structural design patterns in your project:
   
2. Keep your files grouped (into packages/directories) by their responsibilities
   
3. Document your work in a separate markdown file according to the requirements presented below 
### Bridge

Say the client have a Car class with 2 subclasses Simple car and Sport car. The client wants to extend this class hierarchy to incorporate different combustible types. Bridge is used to switch from inheritance to the object composition. I extract combustible related code into its own class with 3 subclasses: electricity, petrol, diesel. The car class then gets a reference field pointing to one of the combustible object. That reference is acting as a bridge between car and combustible type.
    
 ```java
class BridgePattern {
    public static void main(String[] args)
    {
        Car SimpleCar1 = new SimpleCar(new Battery());
        SimpleCar1.getType();
        Car SimpleCar2 = new SimpleCar(new Diesel());
        SimpleCar2.getType();
        Car SportCar = new SportCar(new Petrol());
        SportCar.getType();
    }
}
```

### Facade

In my project, Facade is used to hide the framework's complexity behind a simple interface, wrapping a set of interfaces: CarBody, CarEngine, CarAccessories

```java
public class FacadeCarApp {
    public static void main(String[] args) {
        CarFacade facade = new CarFacade();
        facade.createCar();
    }
}```

### Proxy

Proxy is used to secure car movement. If you don't have the rights to start car engine, proxy will not let you do that by verifying your identity and check if your name is in the list of allowed persons or not.

```java
public class CarProxy {
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
```