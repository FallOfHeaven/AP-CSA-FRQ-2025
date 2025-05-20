## Question 3 Analysis

### Competitors and Match Making

This section contains my analysis of Question 3 (Making ArrayList):

#### Approach during the exam:

1. Think what was needed base on the description provided.
2. Make sure if the question returns something you put keyword return with the correct data type.
3. Write down pieces of solutoion(s) base on those thoughts.
   - For example: in this question it talked about helper method like **buildMatches()** and constructor **Round()** so you should:
      - Write down "//buildMatches()" and "//Round()"(with what is needed in the parameter) so you won't forget.
      - Write down "//if this ... happens, ... will happen" so you remember ideas that you have.
4. Code the ideas you have above.
5. Since you can copy and paste your codes, if you don't think the code will work then copy a verison of your code, paste it and edit it to compare the code which you think will work.
6. If you think it works, don't do extra things, it might let you overthink things.
   

#### My revised solution after review:

- After reviewing and thought back to my orginal solution, I believe that I made a mistake when building the method buildMatches(). I believe when the list is odd, I didn't put the right condition to stop the for-loop as I need to plus one to the size divide by 2 or set the condition to i <= size/2.
  
#### Key concepts tested in this question:

- How to create methods.
- How to create constructor.
- How to declare and intialize arraylist.
- How to make it so that you can traverse through the arraylist.
- Difference between array and arraylist. 
- How to set condition for certain things to happen.
- Critical thinking and Reading comprehension based on the example and explanation given.

#### What I learned from revisiting this problem:

- I learn that if you going to skip one element in an array make sure that the loop do an extra loop.
