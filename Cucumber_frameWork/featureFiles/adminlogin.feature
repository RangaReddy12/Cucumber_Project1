@tag
Feature: 
i want to test login functionlity
@singledata
Scenario:
validate admin login with valid username and password
Background:
Given i want to launch url "http://orangehrm.qedgetech.com/" in a browser
When i enter username as "Admin" and enter password as "Qedge123!@#"
And i click login button
Then i validate url 
When i close browser
@Multipedata
Scenario Outline:
Validate login with multiple data
Background:
Given i want to launch url "http://orangehrm.qedgetech.com/" in a browser
When i enter username as "<username>" and enter password as "<password>"
And i click login button
Then i validate url 
When i close browser
Examples:
|username|password|
|Admin|Qedge123!@#|
|Admin|Qedge12|
|Admin||
||Qedge123!@#|
|||
|Admin|Qedge123!@#|
@addemp
Scenario Outline:
i want to add multiple employees
Background:
Given i want to launch url "http://orangehrm.qedgetech.com/" in a browser
When i enter username as "Admin" and enter password as "Qedge123!@#"
And i click login button
When navigate to add employee page
When i enter first name as "<FirstName>"
When i enter middle name as "<Middlename>"
When i enter last name as "<LastName>"
When i capture emp id value
When i click save button
When i capture Employee id value
When i close browser
Examples:
|FirstName|Middlename|LastName|
|akhi1|selenium71|manual41|
|akhi2|selenium81|manual61|
|akhi4|selenium91|manual661|
|akhi6|selenium15|manual71|
|akhi13|selenium51|manual81|
|akhi11|selenium51|manual91|
|akhi18|selenium51|manual21|