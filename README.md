# fizzbuzz-app
A simple app that depends on [fizzbuzz-model](https://github.com/hotmeatballsoup/fizzbuzz-model).

## Build & Publish Locally
1. Clone this repo
2. Make sure you have Ant installed correctly; if not follow the steps below under the **Ant/Ivy Setup** section
3. In a terminal, navigate to the cloned directory
4. Run `ant`
5. Inspect your `dist` directory and verify that an executable jar has been created with its dependencies in the `dist/lib` directory
Ivy has correctly pulled in the latest fizzbuzz-model snapshot
6. You may now start some local dev/test cycles; see the **Local Dev/Test Cycle** section below

## Ant/Ivy Setup
### Ant
First, lets see if your Ant exists. From a terminal, run:

> echo $ANT_HOME

If nothing shows up, navigate to this cloned repo and run `ant clean`. If you get errors, you don't have Ant installed. To install Ant, run:

1. `curl -s "https://get.sdkman.io" | bash`
2. `sdk install ant`

Now verify that `echo $ANT_HOME` produces successful output.

### Ivy

Will be installed automatically into "~/.ant/lib" by the build file if it does not exist

## Local Dev/Test Cycles
1. In your cloned `fizzbuzz-model` project, change `Fizzbuzz.java` to have a string field called `boo` (instead of its integral `foobar` field)
2. Publish the changes locally using the instructions in the `fizzbuzz-model` project
3. In this project, run `ant resolve` to pull those changes in (from the local Ivy cache)
4. Modify `Application.java` to make use of the new `boo` field
5. Run `ant compile` to verify your changes compile correctly
6. **If you can get to this step, you've solved my StackOverflow question!!!**


# Test

Example will now print string that comes from model class.

    $ java -jar dist/fizzbuzz-app.jar
    Hello world


