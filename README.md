# fizzbuzz-app
A simple app that depends on [fizzbuzz-model](https://github.com/hotmeatballsoup/fizzbuzz-model).

## Build & Publish Locally
1. Clone this repo
2. Make sure you have Ant and Ivy installed correctly; if not follow the steps below under the **Ant/Ivy Setup** section
3. In a terminal, navigate to the cloned directory
4. Run `ant resolve`
5. Inspect your `lib/main` directory and verify that Ivy has correctly pulled in the latest fizzbuzz-model snapshot
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
Run a `ls -al` on your Ant lib directory like so:

> ls -al $ANT_HOME/lib

Look for an Ivy jar, such as `ivy-2.4.0.jar`. If you don't see one, run

1. `curl -O "http://www.webhostingjams.com/mirror/apache//ant/ivy/2.4.0/apache-ivy-2.4.0-bin-with-deps.tar.gz"`
2. `tar -xvf apache-ivy-2.4.0-bin-with-deps.tar.gz`
3. Copy all the jars inside of it to `$ANT_HOME/lib`

If something gets botched in that process, you can just manually download the archive directly from Ivy's [download site](http://ant.apache.org/ivy/download.cgi), just make sure to get the archive "with deps".

## Local Dev/Test Cycles
1. In your cloned `fizzbuzz-model` project, change `Fizzbuzz.java` to have a string field called `boo` (instead of its integral `foobar` field)
2. Publish the changes locally using the instructions in the `fizzbuzz-model` project
3. In this project, run `ant resolve` to pull those changes in (from the local Ivy cache)
4. Modify `Application.java` to make use of the new `boo` field
5. Run `ant compile` to verify your changes compile correctly
6. **If you can get to this step, you've solved my StackOverflow question!!!**
