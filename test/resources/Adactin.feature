Feature: Adactin 

Scenario Outline: Login Adactin Page 
	Given LoginPage 
	When Enter the "<userName>","<password>" on the login page 
	Then Click Login button 
	Then Enter the "<location>","<hotels>","<roomType>","<no.OfRooms>","<inDate>","<outDate>","<adult Per Room>","<child Per Room>"on the particular field 
	Then Click the search button 
	Then Select hotel 
	Then Click the Continue button 
	Then enter the personalInfo "<firstName>","<lastName>","<address>","<cardNo>","<cardType>","<exDate>","<exYear>","<cVV>" on the particular field 
	Then click the BookNow Button 
	Examples: 
		|userName|password|location|hotels|roomType|no.OfRooms|inDate|outDate|adult Per Room|child Per Room|firstName|lastName|address|cardNo|cardType|exDate|exYear|cVV|
		|Mathivanan35|Mathishil|Paris|Hotel Creek|Standard|2 - Two|25/08/2019|28/08/2019|2 - Two|1 - One |Mathi|T|Chennai-98|1234567890123456|VISA|April|2022|322|
		
		
		
