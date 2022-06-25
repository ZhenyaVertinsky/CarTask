# CarTask
Create a class Car, the fields of which will contain information about 5 different parts of the car + 2 fields that will contain the name 
of the make and model of the car (for example, int doors, double engineVolume, and so on). The Car class complies with the requirements 
of the Java Bean specification (using certain variable access specifiers, overriding methods of the Object class). The class must have 
2 overloaded constructors, methods for accessing/changing variables.
Create a utility class whose static method will generate an array of objects of the Car class. The number of objects to be generated is set via an integer parameter 
in the static method.
Create an interface that will store the names of car brand names, these names should participate in the generation of car objects.
Create an interface that will define methods related to auto movement (for example, void run(), int move()). Implement interface methods in the Car class.
In the main method, generate 10 cars and print information about the generated cars to the console (the output format to the console is free, 
you can simply print the result of toString() in a row).
Sort the array of generated cars by some class parameter (by number of doors, by engine size, etc.) and execute interface methods by interface reference.
