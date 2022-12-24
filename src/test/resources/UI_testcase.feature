######################################
######### Google #####################
######################################

Feature: Validate google home screen links
  I want to validate google home screen
#
#Background: This is a background
#	Given I want to login
#	When I enter creds
#	Then i am logged in

  @google @Smoke @TC1 @links 
  Scenario: Validate About link functionality
    Given User open the browser
    And user has link to google
    When user clicks on About link on home screen
    Then User enters the corresponding screen

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
#
      #
      #
  #@tag2
  #Scenario: Title of your scenario outline
    #Given I want to write a step with name
    #When I check for the <value> in step
    #|value |
    #|val1|
    #|val2|
    #Then I verify the status in step
      