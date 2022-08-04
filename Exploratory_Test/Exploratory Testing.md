# Home Challenge
## _Brian Castillo_

## Exploratory testing charters for Monefy App organized by priority

- Make sum of amounts [5 min]
- Add new expense records from category icons [20 min]
- Add new expense records from the red debit button  [20 min]
- Add new income record from the green credit button  [20 min]
- Go to settings and modify the currency. [10 min]
- Go to settings and modify the language. [10 min]
- Go to settings and Create a Data Backup [10 min]
- Select the time measurement options from the left menu. [5 min]
- Use the new transfer option [10 min]
- Open the application and navigate to the main screen. [3 min]
- Search categories of expenses in the search engine [10 min]
- Slide up the summary of movements [5 min]

## Exploratory test plan

In this exploratory test, those involving amounts will be taken as first priority cases. The cases that correspond to the configuration of the app will be considered of second order of priority. Finally, the cases that correspond to the visualization layer will be considered of third order of priority.

With this priority defined, the objective is to give priority to the transactional functionality of Monefy App.

The risks that must be mitigated for this type of application correspond to the differences in amounts. As it is an application that handles different amounts of money and performs mathematical operations of addition and subtraction, it is mandatory that this is the risk that is monitored more closely.

## Charters Detail

Open the application and navigate to the main screen.
```sh
EXPLORE Monefy App: Verify that the application opens correctly and that it is ready to be used.
WITH RESOURCES: a mobile device, in this case an android device was used for the test
TO DISCOVER: The functionality was verified and it was determined that it works correctly.
```
Select the time measurement options from the left menu.
```sh
EXPLORE Monefy App: Verify that I can select in the menu on the left between the options day, week, month, year, All, interval and custom date
WITH RESOURCES: a mobile device, in this case an android device was used for the test
TO DISCOVER: The functionality was verified and it was determined that it works correctly.
```
Add new expense records from category icons
```sh
EXPLORE Monefy App: To verify that a debit amount can be added in one of the categories of the application.
WITH RESOURCES: a mobile device, in this case an android device was used for the test
TO DISCOVER: The functionality was verified and it was determined that it works correctly.
```
Add new expense records from the red debit button
```sh
EXPLORE Monefy App: To verify that a debit amount can be added in one of the categories of the application.
WITH RESOURCES: a mobile device, in this case an android device was used for the test
TO DISCOVER: The functionality was verified and it was determined that it works correctly.
```
Add new income record from the green credit button
```sh
EXPLORE Monefy App: To verify that a income amount can be added in one of the categories of the application.
WITH RESOURCES: a mobile device, in this case an android device was used for the test
TO DISCOVER: The functionality was verified and it was determined that it works correctly.
```
Use the new transfer option
```sh
EXPLORE Monefy App: Verify that I can make a transfer from one account to another
WITH RESOURCES: a mobile device, in this case an android device was used for the test
TO DISCOVER: The functionality was verified and it was determined that it works correctly.
```
Go to settings and modify the currency.
```sh
EXPLORE Monefy App: Verify that I can make a currency exchange
WITH RESOURCES: a mobile device, in this case an android device was used for the test
TO DISCOVER: The functionality was verified and it was determined that it works correctly.
```
Go to settings and modify the language.
```sh
EXPLORE Monefy App: Verify that I can make a language change
WITH RESOURCES: a mobile device, in this case an android device was used for the test
TO DISCOVER: It only works correctly if the language is set to Spanish and English.
```
Go to settings and Create a Data Backup
```sh
EXPLORE Monefy App: Verify that I can back up and then restore from that backup.
WITH RESOURCES: a mobile device, in this case an android device was used for the test
TO DISCOVER: The functionality was verified and it was determined that it works correctly.
```
Search categories of expenses in the search engine
```sh
EXPLORE Monefy App: Verify that I can perform a search of expenses by category
WITH RESOURCES: a mobile device, in this case an android device was used for the test
TO DISCOVER: The functionality was verified and it was determined that it works correctly.
```
Slide up the summary of movements
```sh
EXPLORE Monefy App: Verify that I can view the last movements by category
WITH RESOURCES: a mobile device, in this case an android device was used for the test
TO DISCOVER: The functionality was verified and it was determined that it works correctly.
```
Make sum of amounts
```sh
EXPLORE Monefy App:Verify that all the amounts entered when adding it coincide with the totals shown on the screen.
WITH RESOURCES: a mobile device, in this case an android device was used for the test
TO DISCOVER: The functionality was verified and it was determined that it works correctly.
```

## Bugs

| Actions | Bug detail |
| ------ | ------ |
| Change language | When changing to another language (Korean for example) the left menu, right menu, search bar and the discount offer are shown in English |
| Change Currency | In the side menu to use the currency option you must accept the subscription offer and unlock that functionality, but if you go to settings even if you have not accepted the offer, it allows you to change the currency |
| Export CSV File | When Exporting to CSV File, even if it is configured in Spanish, the document headers are shown in English |
| Search Bar | The app in Spanish language still shows "search records" in English in the search bar.|

## Author

**-Brian Castillo**
