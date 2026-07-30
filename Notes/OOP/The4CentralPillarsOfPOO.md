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
> Car (inherits everything )

