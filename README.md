# IA02
IST 311 Java Interfaces

This is a HW for IST 311 Penn State Abington 

A project is provided by the professor. 
We are to change the code so that the UnitedParcelService and FederalExpress implements the interface IShipper.
No changes in the code design of these classes is to be made.

Furthermore we are to create a new class PlanetExpress:
- PlanetExpress shall implement IShipper interface 
- It must have its own storage for the products on the shipment
  Notice that FederalExpress and UnitedParcelService each have their own 
  way of string the products of the shipment
- Necessary changes in the Demo.java are to be made.
- must output all the fields that are in the Product class
- the output must be neat and readable
- output the total count of items to be shipped
- total weight of items to be shipped
- add this new shipper to Menu.runDemo()

The shipper objects must be declared as Ishipper
A case statement must not be used when calling outputProducts() but it is still needed when choosing the shipper from the menu
Do not modify the contents of the shipment e.g., items, description, qty, weight

