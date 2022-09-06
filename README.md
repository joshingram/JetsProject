# JetsProject

## Description:
This application simulates a fleet of jet aircraft.  It begins by reading a .txt file which contains CSV values for the attributes (type, model, speed, range, and price) of 5 jets.  It then allows the user, through a menu, to call comparisons (fastest, longest range), invoke actions by class (all jets) or subclass (e.g., only cargo jets), add their own jet(s) by entering their own specifications, or remove jets of their choosing. Once a jet is added or removed, the comparison and invocations adjust accordingly based on the new contents of the fleet.  Finally, the user may select to quit, upon which they are given a parting message and the application exits.  

### Lessons Learned:
The main lesson of the project is the fundamentals of Object Oriented Programming.  Abstraction took the form of how we represent the real-world object of a jet with lines of code (states and behaviors(both concrete and abstract)) and Encapsulation was preset with private data fields.  In particular, this lesson allowed me to better understand Inheritance and Polymorphism.  These are most easily seen in how sub/child classes (in this case CargoJet, FighterJet, and PassengerJet) inherit fields and methods from their super/parent class (in this case, Jet).  Those inherited "traits" can be used as is and referred to with "super" notation, or can be overriden, thus exemplifying Polymorphism to adapt an inherited trait (e.g., a method) to better suit the child class.  A similar relationship exists for interfaces.  When an interface (in this case, CargoCarrier or CombatReady) is implemented by a concrete class (in this case, CargoJet and FigherJet respectively), the concrete class must override the implemented method because the interface's methods are by definition abstract/without a body.  

### Tech Used:
Java, Eclipse, git/gitHub, Zoom, Slack

### Java Tools Used:
Buffered Reader, File Reader, line.split, ArrayList, parsing, try catch, method invocation/passing arguments, method returns, switch, scanner, if, else if, else, while loop, IgnoreCase, constructors, getters/setters, @Override, String.format, super class, sub class, interface