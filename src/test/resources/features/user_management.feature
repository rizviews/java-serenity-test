Feature: User management
    
    @test=signup-invalid
    Scenario: Sign up attempt with invalid email address
        Given I click on Signup menu
        And I enter email and password
        | email | password |
        | abcd | abcdfd | 
        When I press signup button
        Then Error message should appear with text 'Please enter a valid email (e.g: example@email.com)'
        And I should remain in the signup page