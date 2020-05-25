# MeowScheduler
 Course Schedule Management Tool for College Students

## For Users
### Introduction
MeowScheduler is a open-source Java project to help college student better manage their course schedules, initially developed for students from the University of British Columbia.

### Installation
**System requirement**

Windows, macOS, or Linux with JRE installed. 

**How to install?**

The project is currently in the pre-developing process and cannot be installed. Future update on installation will be posted on this page. 

### Update Log (Standard Versions Only)

NO standard versions available. 

## For Developers
### Update Tags
- **Regular**: the most common updates, mostly daily/weekly maintenance, normally with slight changes to the program and without modification to the functions of the program. Update is not always necessary.
- **Important**: important updates, normally with big changes on the source code(e.g. a method is created but not implemented). Update is recommended. An "Important" update may also indicate future plan of development, hence reading of the update log is also recommended. 
- **TOP-Priority**: very important updates, with huge changes on the program structure or functions (e.g. a class is created/deleted, an important method is implemented/modified). Update is highly recommended. 

### Update Log (Full Versions, labeled with dates)
#### Update 200509 (Regular)
1. Created three new public methods in `TimeInstant.java`;
2. Created one new private method in `TimeInstant.java`;
3. Created one public method in `TimeInterval.java`;
4. Added comments in `Main.java`;

#### Update 200510 (TOP-Priority)
1. Implemented four methods in `TimeInstant.java`, with successful tests;
	- `void addSeconds(int secondsAdded)`
    - `void addMinutes(int minutesAdded)`
    - `void addHours(int hoursAdded)`
    - `void fixDisplayedTime()`
2. Implemented one method in `TimeInterval.java`, with successful tests;
    - `extendMinute(int minutesExtended)`
3. Added relevant testing code in `Main.java`;

#### Update 200511 (TOP-Priority)
1. Added a private data field `credits` in the `Course` class;
2. Added two public assessors to get the data fields in `Course` class;
    - `String getCourseID()`
    - `int getCredits()`
3. Created a new `Timetable` class, partially implemented.
    - Private data fields declared. 
        - `String session`
        - `int totalCredits`
        - `ArrayList<Course> courseList`
    - Constructors created and implemented for `TimeTable`. 
        - `TimeTable()`
        - `TimeTable(String sessionAssigned)`
    - Assessors to get the private data fields created. 
        - `String getSession()`
        - `int getTotalCredits()`
        - `Course[] getCourseList()`
    - Some mutators created and implemented for future use. 
        - `void addCourse(Course courseAdded)`
        - `deleteCourse(Course courseDeleted)`
        - `void fixTotalCredits()`
    - Some of the methods above, labeled `//TODO`, have not been tested.
4. Modified static method `printCourse()` in `Course.java`;

#### Update 200512 (Important)
1. Added some static methods in the `Timetable` class, for testing.
2. Overrided `toString()` method in `Course` class.
3. Implemented some Javadoc comments in `Timetable.java`. 
4. Modified the implementation of some mutator in `Timetable` class.
    - `void addCourse(Course... courseAdded)`
    - `void deleteCourse(Course courseDeleted)`
5. Tested all previous methods. 
6. Declared `void autoSchedule()` in `Timetable` class, to be implemented. 

#### Update 200521 (TOP-Priority)
1. Modify the program structure.
    - All previous functional classes are moved to newly-created package `application`.
        - `Course.java`
        - `Main.java`
        - `Schedule.java`
        - `TimeInstant.java`
        - `TimeInterval.java`
        - `Timetable.java`
    - Newly created UI classes and JavaFX-related files are moved into package `window`. 
        - `MainUI.java`
        - `MainWindowController.java`
        - `application.css`
        - `MainWindow.fxml`
2. The UI are created with JavaFX 2, using FXML. 
    - Main window created, see `MainWindow.fxml`. 
3. The main program is modified to `window/MainUI.java`, previous main program `application/Main.java` will be temporarily kept for the tests in the `application` package, but will be removed soon. 
4. `window/MainWindowController.java` created; some event listeners are declared without implementations. 

#### Update 200522 (Regular)
1. Re-structure the layout of `window/MainWindow.fxml`.
    - Using `VBox` for root layout; 
    - Wrapping `Menubar` and `AnchorPane` into `VBox`;
2. Other slight changes on UI and event listeners. 

#### Update 200523 (Regular)
1. Created `AlertWindow.fxml` and `AlertWindowController.java` for alert template, **will not be used in main program**. 
2. Created and implemented exit-confirm window layout and functions. 
    - To exit the program, click "File - Exit - OK". 
3. Other slight changes on UI and event listeners. 

#### Update 200525 (Regular)
1. Created `NewWindow.fxml` and controller `NewWindowController.java` for pop-up window of creating a new timetable. 
    - Window layout in error, **TO BE FIXED**, see //FIXME in `MainWindowController.eventNew()`. 
    - Relevant event listeners implemented in `MainWindowController.java`. 
2. Other slight changes. 


