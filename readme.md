# Modelling an RPG with Java - CodeClan Week 7

## Project Objectives

After two weeks of learning Java, as well as modelling with interfaces and inheritance, myself and fellow CodeClan student [Mike](https://github.com/Mike-Heneghan) decided to collaborate on a Java fantasy adventure game.

Our objectives were:
- practice modelling and relationships
- practice git branching and team working
- collaborate with a "many hands make light work" approach, meaning we would be able to tackle more complex logic problems in the time available rather than having to spend a lot of time on setup.

## Project Brief

The task is to model a fantasy adventure. The game will have players, who will have a number of health points and weapons/spells. Players will fall into different categories:

**Dwarves, Barbarians, Knights**

- Each of these will have a weapon and fight with other players (Sword, Axe, Club, etc)
- Should be able to change their weapon at any point in the game.

**Warlocks and Wizards**

- They will be able to cast spells on others (Fireball, Lightning Strike, etc).
- They will have a mythical creature (e.g. Ogre, Dragon) who will defend them from attackers.
- Should be able to change spells or creature at any point in the game.

**Clerics**

- They will have healing tools with which they can heal other players (potion, herbs, etc).
- Should be able to change healing tool at any point in the game.

**Game Interaction**

- The game will also have rooms to work through.
- Each room should either have some kind of treasure (Gold, Gems) to collect or an Enemy (Troll, Orc) to defeat before moving on.

## Design Process

Mike and I spent a day planning out the game before starting any coding. We decided to opt for an inheritance tree, as our various character classes had shared attributes and behaviours. We also used enums to help create treasure, baddies and creatures.

We modelled all classes and identified most methods, formalised the interactions with UML diagrams and set up a Trello to manage the weekend project together.

Over the course of the weekend we built most of the game, excepting some of the room interactions and a runner file to play the game in Terminal.

## What I learned

On first glance, this felt like a big weekend project to tackle. However, collaboration with Mike made the project feel significantly more manageable. Teamwork is absolutely vital.  

We broke down the game together, made joint decisions about how to build the game and had several discussions with differing viewpoints; it was extremely useful to see how someone else thinks and approaches problems.

It was good to start to work with some of git's functionality - branching is obviously extremely useful and it was great to get a head start on it (we don't look at branching until our Javascipt project in week 14).

We used randomisation in our project (dice roll methods), which made for some testing difficulties. This was a great learning point.

I also learned it's quite pointless to code when you're tired, as you'll just create problems for yourself with bugs and bad decisions!

## If I had more time

I would have liked to have finished the game and written a runner file to play it in the terminal.

Mike decided to use this Java to create an Android version of the game for his week 9 project, which is fantastic fun! As we had initially coded this game to run in terminal, he refactored it for Android.
