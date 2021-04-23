# Planning DSL

## A simple team management DSL

### Installation
* Import the projects from the `test_runtime_projects_from_eclipse` folder into Eclipse.

or

* Import the `planningDsl.zip` archive using File -> Import -> Archive File in your main Eclipse.

The runtime projects are:

* `uk.ac.kcl.eanghel.planning.tests`
* `uk.ac.kcl.eanghel.planning.xpect`

Similarly to the language infrastructure, there are two ways of importing these into your runtime Eclipse:

* Import the projects from the `uk.ac.kcl.eanghel.planning.tests` and the `uk.ac.kcl.eanghel.planning.xpect` folders into the runtime Eclipse.

or

* In the runtime Eclipse, use the File -> Import -> Archive File to import the `test_runtime_eclipse.zip` archive file.

### Usage

The language grammar is defined in the `Plannin.xtext` file. It has the following structure:

```
Team {team name}
Owners {space separated list of owners}
Projects {space separated list of projects}

{one or more} Task
    {TaskType} {task name}
    owner {space separated list of owners}
    priority {int}
    points {number of story points}
    status {Stuck/Done/In Progress/Waiting for review}
```

The `TaskType` can be one of the following:

* Document
* Test
* Bug
* Deploy
* Analyse
* Feature

The files need to use the `.plan` extension for the language features to be usable.

Upon successful creation of a planning file, two files are generated, in the `src-gen` folder, of the following formats:

* {teamName}Planning.html
* {teamName}Planning.txt

The HTML file transforms the data from the `.plan` file into a nice web page, containg the following elements and functions:

* a table presenting the data defined in the `.plan` file
* a pie chart showing the status of the tasks
* a function to allow the data to be exported to a CSV file, downloading it to the user's folder of choice
* the table supports rearranging based on the headers (highest->lowest, or vice-versa)

### Usage notes

1. The owners must be unique and their names must start with a capital letter. Checks have been implemented to ensure this.

2. Priority cannot be higher than 25. In case any is higher than 25, the implemented checks aid the user to reduce it to 25.

3. In addition to point (2) above, an info message is shown if any priority is over 10, to ensure the user does not overplan. Moreover, a warning will be shown if any priority is over 20.

4. The Story Points number needs to be a Fibonacci number, lower than one hundred. Checks are implemented, but due to Xtend limitations, it was not possible to suggest the first lowest Fibonacci number (Eclipse freezes). Instead, if the user uses a number higher than 100, 89 is suggested as a replacement. If the number is lower than 100, five is suggested.
