# Auto-Test Framework

Selenium & Java based frontend automation suite utilising the BDD methodologies of Cucumber and Gherkin 

## 1. Install JAVA SDK 8
## 2. Install Maven
## 3. Install Git
## 5. Download firefoxdriver 

### Set Path Variables

User Variable Path = directory for java sdk 8 
Set Maven home in environment Variables 

### For Windows
Create the following System variables
- JAVA_HOME = PAth to java sdk
- M2_HOME = Path to maven installation
- MAVEN_HOME = Path to maven installation

###dependency used
Selenium
Junit
Cucumber
Maven
Extent Reports

#### Cucumber Selenium - Overall testframework leveraging the Cucumber framework with Selenium,Junit and Maven written in JAVA.

#### Feature File - The feature file specifies the steps in BDD language style

#### Step Definition Feature File - Java class whereby the steps from  the feature file are broken down to be coded into automation tests

#### Cucumber Reports - Cucumber has a built in report generation whereby Feature files tested are automatically written to cucumbers own reporting system 

```
Steps to write an acceptance test
Each Feature file has it’s step defition, pageobject & model class
              
 ----> Install Cucumber
 ----->Create-->new maven project --->(name it) BDDframework (groupid)
	*In the src/main/java -->create three packages 1)Features 2)runner 3)stepdefinition
	*In the feature -->create login.feature file.
	*In the runner -->create testrunner.java (class file).
	*In the stepdefinition -->create loginstepdefinition.java (class file)
 ----> Write your Scenario using the Gherkin syntax
 ----> Write your step definition in Java
 ----> Create xml file under src folder and name it extent-config.xml.
 ----> Then add plugins and @afterclass method in testrunner.java then right click on it-->run as--->junit test.
 ----> Then target folder will automatically generated under BDDframework and report.html file will genrate under cucumber-reports.
 ----> Put it on github.
