@PrintData
Feature: Print data - Text Box
  As a user i want to print my data

  @PrintData
  Scenario Outline: Print data - Text Box
    Given Open application Text Box
    When I want to print Full Name "<FullName>"
    When I want to print Email "<Email>"

    Examples: 
      | FullName | Email             |
      | Sunset   | Sun123@gmail.com  |
      | Touma    | Touma00@gmail.com |
