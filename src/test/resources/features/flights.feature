Feature: Verify flights screen and booking

    @test=flights
    Scenario: Flights screen loaded as expected
        Given I click on 'Flights'
        When I enter proper data
        | From | To | DepartDate | ReturnDate | Adult | Type |
        | Kuala Lumpur | Dhaka | 01/12/2020 | 02/12/2020 | 1 | Return |
        And I hit the search button
        Then Depart section should display proper data
        | Route | Date | FlightStart | FlightEnd | Price |
        | Kuala Lumpur to Dhaka | 01/12/2020 | 22:10 | 00:05 | 594.00 |
        And Total should show total Price
        And I should see a continue button