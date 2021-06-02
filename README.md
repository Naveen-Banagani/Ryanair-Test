# **Ryanair Test Automation Framework**

This project automates a booking up to a declined payment on https://www.ryanair.com/ie/en/

# **Tech Stack used**

- Java
- Maven - project builder
- JUnit - runner
- Cucumber - BDD framework
- Cucumber html reporter plugin - test outcome reporter
- Log4j - logger

# **Getting Started**

Software to be pre-installed :

- Install JDK in your machine
- Maven

- Clone repository git clone`https://github.com/Naveen-Banagani/Ryanair-Test.git
- Open File -\&gt; New -\&gt; Project from Existing Source -\&gt; Select ../RyanairTest/pom.xml -\&gt; Right Click on Run\&gt; Run as Maven Test
- Go to Ryanair Test/src/test/java/test\_runners/FlightsBookingTest.java -\&gt; Click on Run \&gt; Run as JUnit

# **Running from command line or terminal**

1. Clone repository ` git clone https://github.com/Naveen-Banagani/Ryanair-Test.git `
2. Open directory: Ryanair Test/
3. In command line execute:
4. `mvn test- exetutes all tests inside RyanairTest/src/test/java/test\_runners/` with default browser set in config file
5. `mvn -Dbrowser=chrome test` - executes test in chrome browser
6. `mvn test -Dcucumber.options=&quot;--tags @flights\_booking&quot;` - to run specific tags

# **BDD**

Tests are developed using BDD approach, thanks to extremely powerful Cucumber framework, which brings benefits of using DSL specification stories called &#39;Features&#39;, so basically, it&#39;s aimed to write human-readable scenarios to involve non-technical people in process of automation

# **Test Layers**

- Pages (webpages and elements)
- Test steps(logic implementation)
- Test launch(runners)
- Test data(feature files)

# **Tests support cross-platform browser testing.**

- Windows:
  - Chrome
- MacOS:
  - Chrome

Default browser is Chrome.

# **Results Reporting**

Every step is logged by log4j. It prints all actions performed by scripts to console output and stores all logs in: ` RyanairTest/target/logs
` Cucumber generates simple html reports using html-report-plugin. To browse cucumber reports, go to: ` RyanairTest/target/cucumber-reports/_\*_Test
` Open a file with extension `\*\*\*\*\*.html` in any preferrable browser
