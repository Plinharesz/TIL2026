# The 4 Central Pillars of POO
## 1- Abstraction:
Is the ability to isolate complex details from a real-world element and expose only the essential characteristics for the domain of its application

→ What solves?: Avoids the system sprinkles witch attributes and irrelevant methods.
> Example: If you are modeling the "Person" class for a banking system, it is important to know the CPF, Income, creditScore. Details as eyeColor or bloodType should be abstracted (ignored). 
>
> In Hospital Systems, bloodType is taken essential and creditScore is abstracted.
## 2- Encapsulation: 
Consists of hiding the internal implementation of a class and protecting its data against improper direct acess or changes from abroad.

→ What solves?: Prevents the state of the object from being in a invalid value or inconsisty due to external interference.

→ How it works?: Attributes are kept private (private) and acess/nodifications only occurs through controlled methods (getters, setters, bussiness methods).
>Example: In a bankAccount class, the attribute "balance" should never be public. If any part o the code could make "balance = -5000", the integrity of the system would break. With encapsulation, you make it available the account.deposit(value) method, wich validates if the value is positive before adding to balance.

## 3- Inheritance:
Inheritance allows you create new classes based in classes that already exists, reusing attributes and commons behaviors, promoting reusability of codes.

→ What solves?: Avoids code duplication throughout the project (remember DRY principle: Don't Repeat Yourself).

→Terminology: The base class is called "Superclass" (or parent class), and the class that inherits is called "Subclass" (or daughter class).

>SuperClass:
>Vehicle(+brand, +model, + speed, + acellerates())
> 
> Subclass:
> Car (inherits everything of "Vehicle" and adds numberOfDoors), Motorcycle (inherits everything of "Vehicle" and adds engineDisplacements).

## 4- Polymorphism:
The Polymorphism is the capacity of different objects of different classes to respond to the same message (method) in specific ways.

→What solves?: Allows the code to depend on generic interfaces or superclasses without know the exactly class in compilation time, making the architecture extensive.

→ Types of Polymorphism:
 - Overriding: the subclass rewrites the implementation of a method inherited from the parent.
 - Overloading: A same class that has methods with the same name, but with differents parameters/signatures.
> Overriding:  if paymentMethod (superclass) has the method processPayment(), the following subclasses applies uniques behavior:
> 
> cardPayment -> processes communicating with the card acquirer.
> 
> pixPayment -> processes generating the payload and QRCode.
> 
> bankSlipPayment -> processes registering the bank payment slip.



|Pilar|Main Focus| Key Question                                                          |
|-|-|-----------------------------------------------------------------------|
|Abstraction|Model Simplification| What is really relevant to this domain?                               |
|Encapsulation|Protection and data control| How to ensure my data doesn't become inconsistent?                    | 
|Inheritance|Structure reuse| Is there a broader concept which this class derives?                  |
|Polymorphism|Behavior flexibility| How differents types can respond the same action with differents ways |

