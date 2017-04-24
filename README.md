# LAD

Levi Olevski
Adrian Boylan
Daniel Regassa

## Design
Our design uses the four methods in the ArrayPriorityQueue API (add(Object o), peekMin(), isEmpty(), removeMin()) so that you can access the methods the HelpDesk's ArrayPriorityQueue normally uses since without them you could not access these methods due to the ArrayPriorityQueue being private. We also included a method to solve tickets which uses a Ticket parameter and a String solution parameter. We also included a method so that we could input tickets, promptly named inputTicket(), which uses command line input to input the tickets.

## Embellishments
What we included that went beyond the basic design was using the command line input to create tickets, which also returns the tickets created so that the user can see what they have inputted as a problem.
