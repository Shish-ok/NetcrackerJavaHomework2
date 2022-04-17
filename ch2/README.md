### Задачи по второй главе Хорстмана:

ex5 (Point) — Implement an immutable class Point that describes a point in the plane. Provide a constructor to set it to a specific point, a no-arg constructor to set it to 
the origin, and methods getX, getY, translate, and scale. The translatemethod moves the point by a given amount in x- and y-direction. The scale method scales both 
coordinates by a given factor. Implement these methods so that they return new points with the results. For example,

Point p = new Point(3, 4).translate(1, 3).scale(0.5);

should set p to a point with coordinates (2, 3.5).

ex9 (Car) — Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves. Provide methods to drive by a given number of miles, to add a
given number of gallons to the gas tank, and to get the current distance from the origin and fuel level. Specify the fuel efficiency (in miles/gallons) in the constructor.
Should this be an immutable class? Why or why not?

ex13 (CSVRead) — Download the JAR file for OpenCSV from http://opencsv.sourceforge.net. Write a class with a main method that reads a CSV file of your choice and prints some of 
the content. There is sample code on the OpenCSV website. You haven’t yet learned to deal with exceptions. Just use the following header for the main method:

public static void main(String[] args) throws Exception

The point of this exercise is not to do anything useful with CSV files, but to practice using a library that is delivered as a JAR file.
