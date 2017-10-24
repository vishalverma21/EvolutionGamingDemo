@evolutiongaming 
Feature: Verify BookMark Data

@evolutiongaming 
Scenario Outline: Validate BookMark Data with the selected data 
	Given Switch to russian language 
	And Select Electrical Engineering 
	And Go to search and search for <item> 
	When Sort the result by price and select <option> in transaction type 
	And Go to advance search and enter price between <min> and <max> 
	Then Select <random> adds 
	And Add adds to bookmark 
	And Verify adds are moved to bookmark 
	
	Examples: 
	| 	item     |   option  | random | min | max |
	| Computer	 | 	 Продажа |   3    | 160 | 300 |
	
	
