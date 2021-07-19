Steps to run test scripts,

1. This is a MAVEN project, please make sure all dependency librarues be installed into this project
2. Please download chromedriver, and make sure its versison is macthing your local chrome browser version
3. Please modify the diretory where you put chromedriver in Base.class, and change the diretory of global.properties as well
4. Please provide the diretory of feature files in Runner files in runner classes RunnerWebTests and RunnerAPITests (can configure feature files as parameter)
5. Right click RunnerWebTests or RunnerAPITests, directly run test suite


CI/CD
1. Creat a MAVEN project on Jenkins
2. Provide Git repository and credentials 
3. provide pom.xml
4. Configure the way trigger this proejct 