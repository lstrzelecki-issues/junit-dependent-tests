# How to run
run `runme.sh` script

# Configuration
## App.class
Whole Spring context - assemblies 'Functionality contexts'. Its delivered to production application.

## Functionality contexts
* Logging
* Registering

## Entities.class
Configuration for core entities like User.class used by both modules.

# Problem
I know that tests may be run on multithread.
I want to fire AppTest which will check if context if configured properly. And AFTER that whole context is properly configured i check
more Modules. In each test I create small spring context.
Currently we have this situation that each test fails because of bad configuration. BUT when you have a lot of spring tests its annoying.
Because it try create invalid context in each test and it takes ages. I want something like Group of test and dependent tests like in
TestNG.

# Proposition of flow
When AppTest is **success**
Then LoginServiceTest & RegisterServiceTest are fired.

When AppTest is **failure**
Rest of tests with spring are not fired.

Regular Unit tests wihout Spring should be fired.
