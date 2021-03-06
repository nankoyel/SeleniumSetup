### Selenium Practise Katas

Use this setup to get started working on a set of small problems to practise your UI Automation skills with Selenium.

#### How to get set up?
1. Follow the instructions in [this video](https://youtu.be/vB0rF0ElOT8?t=1146) to set up an EC2 instance.
2. Follow the instructions in the .ps1 file to get a machine set up that will have a working Selenium dev environment

#### What problems will we solve?
This website has a series of common web components. Have your script navigate to the site, manipulate each component, and verify the result.

#### What about code quality?
Test automation code is first class code. It is equally as important as any production code you write because it enables the timely and efficient delivery of that code. When you do these problems, consider how you can solve them by using the best practises of TDD and the four rules of simple design.

##### Tips for TDD
The golden rule of TDD is that you should only write code if you have at least one failing test that needs it in order to pass. 

In this kata, most of your code should have tests written for it. The exceptions to this rule are:
1. The actual assertions of the the individual test cases
2. The Selenium operations that do the actual browser manipulation

A good way to do this is by wrapping the two in a layer of abstraction that will allow you to test supporting code, but use mocks for these pieces otherwise.

##### Tips for good design
A good place to start when thinking about a good design for your tests is with Kent Beck's four rules of simple design:

1. Tests pass - as in unit tests pass
2. Express intent - your code should be clear and legible
3. Remove Duplication
4. Keep it small

Because we are writing tests, it's also a good idea to keep his [test desiderata](https://medium.com/@kentbeck_7670/test-desiderata-94150638a4b3) in mind.
