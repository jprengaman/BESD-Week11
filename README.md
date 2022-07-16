# BESD-Week11
Relational Databases with MySQL Week 11 Assignment

Coding Steps:

Create a class of whatever type you want (Animal, Person, Camera, Cheese, etc.).

Do not implement the Comparable interface.

Add a name instance variable so that you can tell the objects apart.

Add getters, setters and/or a constructor as appropriate.

Add a toString method that returns the name and object type (like "Pentax Camera").

Create a static method named compare in the class that returns an int and takes two of the objects as parameters. Return -1 if parameter 1 is "less than" parameter 2. Return 1 if parameter 1 is "greater than" parameter 2. Return 0 if the two parameters are "equal".

Create a static list of these objects, adding at least 4 objects to the list.

In another class, write a method to sort the objects using a Lambda expression using the compare method you created earlier.

Write a method to sort the objects using a Method Reference to the compare method you created earlier.

Create a main method to call the sort methods.

Print the list after sorting (System.out.println).

Create a new class with a main method. Using the list of objects you created in the prior step.

Create a Stream from the list of objects.

Turn the Stream of object to a Stream of String (use the map method for this).

Sort the Stream in the natural order. (Note: The String class implements the Comparable interface, so you won't have to supply a Comparator to do the sorting.)

Collect the Stream and return a comma-separated list of names as a single String. Hint: use Collectors.joining(", ") for this.

Print the resulting String.

Create a new class with a main method. Create a method (method a) that accepts an Optional of some type of object (Animal, Person, Camera, etc.).

The method should return the object unwrapped from the Optional if the object is present. For example, if you have an object of type Cheese, your method signature should look something like this:

public Cheese cheesyMethod(Optional<Cheese> optionalCheese) {...}

The method should throw a NoSuchElementException with a custom message if the object is not present.

Create another method (method b) that calls method a with an object wrapped by an Optional. Show that the object is returned unwrapped from the Optional (i.e., print the object).

Method b should also call method a with an empty Optional. Show that a NoSuchElementException is thrown by method a by printing the exception message. Hint: catch the NoSuchElementException as parameter named "e" and do System.out.println(e.getMessage()).

Note: your method should handle the Optional as shown in the video on Optionals using the orElseThrow method. For the missing object, you must use a Lambda expression in orElseThrow to return a NoSuchElementException with a custom message.
