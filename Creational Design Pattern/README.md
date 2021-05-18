# TMPS-labs
## Lab 1 - Creational Design Pattern

### Tasks:
 
1. Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed);
   
2. Select a domain area for the sample project;
   
3. Define the main involved classes and think about what instantiation mechanisms are needed;
   
4. Based on the previous point, implement atleast 3 creational design patterns in your project;

### Abstract Factory

Abstract Factory
Abstract Factory pattern helps us to create factory of related objects. In my case create objects inherited from Animal parent class or from Toy parent class. ( This pattern is connected with Factory).

    
 ```java
    public class Creator {
           public static Car createFactory(String type) {
               if(type.equalsIgnoreCase("sport car")) {
                   return new SportCar();
               } else if(type.equalsIgnoreCase("simple car")) {
                   return new SimpleCar();
               } else {
                   System.out.println("Please specify a valid type");
                   return null;
               }
           }
       }
```

### Builder 

It is creational design pattern which operate with creating the complex objects and we need to use when the process involved in creating an object is extremely complex, with lots of mandatory and optional parameters.

```java
    Car car = new CarBuilder().setColor("black").setBrand("Toyota").setNumberOfSeats(4).setNumberOfDoors(2).setIsConvertible(true).createCar();
```

### Prototype

Prototype pattern it is used for cloning the original object to the new and if it is needed modify the parameters.

```java
    @Override
    public Brand clone() {
        try {
            return (Brand) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
```

### Conclusion: 

In this laboratory work I used 3 creational design patterns to a specific domain in real life.
