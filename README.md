# TodoAppAutomation

A Selenium WebDriver project for automating tests on a todo list web application using Java, TestNG, ExtentReports, and data-driven testing.

## Features
- Automates adding, editing, and deleting todo items
- Data-driven testing using CSV for multiple test cases
- Cross-browser testing (Chrome and Firefox)
- Generates detailed ExtentReports in HTML format
- Uses Page Object Model (POM) for maintainability

## Prerequisites
- Java JDK 17 or later
- Maven
- Chrome and Firefox browsers
- Git

## Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/AnuragPandit01/TodoAppAutomation.git
Navigate to the project directory:
cd TodoAppAutomation
Install dependencies:
mvn clean install
Run tests:
mvn test
Project Structure
src/main/java/com/anuragpandit/pages: Page Object classes
src/test/java/com/anuragpandit/tests: TestNG test classes
src/test/resources/testdata: CSV files for test data
extent-reports: Generated HTML reports
Test Cases
TodoTest: Verifies adding todo items using data from a CSV file
Reports
ExtentReports are generated in the extent-reports directory after running tests. Open ExtentReport.html to view the detailed test report.
Contributing
Feel free to fork the repository and submit pull requests to contribute!
License
MIT License
### Instructions
1. Copy the above content.
2. In your `TodoAppAutomation` project directory, create or update the `README.md` file.
3. Paste the content into `README.md`.
4. Commit and push to your GitHub repository (`https://github.com/AnuragPandit01/TodoAppAutomation`):
   ```bash
   git add README.md
   git commit -m "Add README.md for TodoAppAutomation project"
   git push origin main
