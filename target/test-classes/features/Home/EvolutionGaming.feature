@zalando 
Feature: Move The Item To Wishlist 

@evolutiongaming 
Scenario Outline: Validate Wishlist 
	Given Switch to russian language 
	And Select Electrical Engineering 
	And Go to search and search for <item> 
	When Sort the result by price and select <option> in transaction type 
	And Go to advance search and enter price between <min> and <max> 
	Then Select <random> adds 
	And Add adds to bookmark 
	And Verify adds are moved to bookmark 
	
	##Positive flow with valid article and valid quantity
	##Any article number can be provided in below example with quantity
	@Sanity 
	Examples: 
	| 	item     |   option  | random | min | max |
	| Computer	 | 	 Продажа |   3    | 160 | 300 |
	
	
