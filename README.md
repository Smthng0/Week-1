# Week-1

##Exercise 1.b, page 21:
I needed to see which of the 3 part of code have errors... (i should be a compiler...)

A Goes to a endless loop (missing and x=x+1)

B Missing the start of the program, "class Excercise 1b{}"

C Missing psvm

##Exercise 2.a, page 42:
See if the files will compile, how to fix and what is their output...

A  Missing "TapeDeck t = new TapeDeck", output: "tape playing" //ln// "tape recording" 

B  Missing method "playDVD" (can just remove line d.playDVD;), output: "DVD recording"

##Exercise 3.a, page 63:
See if the files will compile, how to fix and what is their output...

A  Missing the creation of new books for every book in the array! (Books myBooks[x]=new Books())

B  It's trying to create a object that's not in the bounderies of the array (array[3] -> 0-2, gona make object 3)

##Exercise 4.a, page 88:
See if the files will compile, how to fix and what is their output...

A  Everything is ok here (i couldn't find and error with is the solution)

B  public/private? -> the problem was that getters need to have a defined type (i didn't manage to notice that... :S)

##Exercise 4.b, page 89:
###"who am i?" -> 13 statements and i have to assign 10 stuff to those statements...
**Instance variable, argument, return, getter, setter, encapsulation, public, private, pass by value, method**


1. *"A class can have any number of these."* -> instance variable, getter, setter, method
2. *"A method can have only one of these."* -> return
3. *"this can be implicitly promoted."* -> ??? (argument, return, they can be a smaller type then the output type)
4. *"I prefer my instance variables private."* -> encapsulation
5. *"It really means "make a copy"* -> pass by value
6. *"Only setters should update these"* -> ~~private~~ (correct is instance variable :S)
7. *"A method can have many of these."* -> argument, instance variable (correct is only argument :O)
8. *"I return something by definition"* -> return (method, getter) / correct is getter
9. *"I shouldn't be used with instance variables."* -> public
10. *"I can have many arguments."* -> method
11. *"By definition, I take one argument."* -> setter
12. *"These help create encapsulation."* -> getter, setter, public, private
13. *"I always fly solo."* -> return