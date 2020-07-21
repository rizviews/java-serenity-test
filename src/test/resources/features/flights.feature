Feature: Verify flights screen and booking

    @test=flights
    Scenario: Flights screen loaded as expected
        Given I click on 'Flights'
        When I enter proper data
        | From | To | DepartDate | ReturnDate | Adult | Type |
        | Kuala Lumpur | Dhaka | 29/07/2020 | 01/08/2020 | 1 | Return |
        And I hit the search button
        Then Depart section should display proper data
        | Route | Date | FlightStart | FlightEnd | Price |
        | Kuala Lumpur to Dhaka | 29/07/2020 | 22:05 | 23:55 | Unavailable |        
        And I should not see the continue button