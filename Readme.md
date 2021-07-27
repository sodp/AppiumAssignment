AppiumAssignment_Siddhant_Panda_3164895
=========================
Work Day Apk UI Automation
==========================

Abstract
==========================

This project uses Page Object Model (POM) Java Framework Project automates 8 test cases for Work India Apk. 


Use the following steps to execute this project.
1. Extract the zip and then place it in your workspace.
2. Open a terminal window/command prompt from that location.
3. Open the android emulator target device from AVD manage android studio.
4. `mvn clean` : to build the project
5. `mvn eclipse:eclipse -U`
6. `mvn install` to run the test cases.

# or
Run  the "runner.bat" file present in the directory itself to run it directly. Ignore the windows warning.

## Special Note:

* Uninstall work day apk if previously installed this will hinder the XPATHs present in project lead to test failures
* Longer XPATHs(which should not be used) are used as there no id or class for specific elements.
* Shorter XPATHs are not working for most of the test case  scenarios.
   for eg: xpath("//android.widget.TextView[contains(@text,‘ Search for Products, Brands and More’)]")  
* Will Run on NEXUS S (480 X 800, Android 8.1) 
* Run 
 
    
# Requirements
* Java 8

# Dependencies
* java-client 6.1.0
* cucumber-picocontainer 6.10.4
* cucumber-java 6.10.4
* cucumber-jvm 6.10.4
* cucumber-testng 6.10.4
* cucumber-jvm-deps 1.0.6
* cucumber-reporting 1.0.0
* cucumber-gherkin 6.10.4
* extentreports-cucumber6-adapter 1.2.0
* log4j 1.2.17
* selenium-java 3.141.5
* selenium-api 3.141.5
* testng 6.14.3
* extentreport 2.41.2
* commons-io 2.8.0


Note : The dependencies are already present in pom.xml file.


# Folder structure
### src/main/java                        
- base
  * commonbase.java
- hooks 
   * utilhook.java			    			   
- screens                        
   * CityActivity.java
   * FillDetails.java
   * JobSearchActivity.java
   * LanguagePageActivity.java
   * RecommendedJobActivity.java
   * RegisterActivity.java
   * SkillActivity.java
- utils
   * commonutil.java   
     
### src/test/java                         
- features
   * feature1Register.feature
   * feature2Jobpage.feature   
- hooks 
   * utilhook.java			    			   
- runner                        
   * testrunner.java      
- stepdefinations                        
   * CityActivityStepdef.java
   * FillDetailsStepdef.java
   * JobfeatureStepdef.java
   * LanguagePageStepdef.java
   * RecommendedJobstepdef.java
   * RegisterActivityStepdef.java
   * SkillActivityStepdef.java
       	        	 
### log 
 * application.html   
 * testlog.log                    
 
### Reports 
 - Output_Report
    * Report.html   
 	                   
### Resources 
 * cucumber.properties
 * in.workindia.apk  
 * log4j.properties
                  
### src            
### target              
### test-output           
### pom.xml                   
### testng.xml      
### README.md

# resources Folder
The Resources folder contains the cucumber.properties file, log4j.properties file & Work Day Apk file.

# Report Folder
Report.html file generated inside the Output_Report folder once all the test cases are runned.Test reports  can be checked from this file. Also contains the failed screenshots.

# log folder
This folder contains all the log files of the test cases. Check the application.html file to view the logs.


# src/main/java

1. Contains a Base package file which has commonbase.java file functionality methods of which are used in all files present in screen package. 
2. Contains a screen package file which has different screen functionality defined and which extends commonbase.java
3. Contains a Utils package which is used by every java file present in step definition , contains helper function like appium server opening, closing etc.

# src/main/test
1. Contains a package feature  which defines different features used in this framework (BDD cucumber feature files)
2. Contains a hooks package file which is runned  before and after scenario logger, screenshot & extent report functionality present
3. Contains a runner package file to run every feature file before and after scenario
4. Contains StepDefinitionpackage  files for the features written in features package.


## Problems
Sometimes the test cases would fail as it won't be locate the AndroidElements. Please re-run the test in such cases. Recommended re-install the apk.
This project is tested on device
- NEXUS S (480 X 800, Android 8.1)  

