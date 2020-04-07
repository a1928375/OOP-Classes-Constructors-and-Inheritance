# OOP-Classes-Constructors-and-Inheritance

1. SumCalculator:

        (1) Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and             secondNumber both of type double.

        (2) Write the following methods (instance methods):

                *Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
                
                *Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
                
                *Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
                
                *Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
                
                *Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of                     firstNumber and secondNumber.
                
                *Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values                 of secondNumber from the firstNumber.
                
                *Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field                     values of firstNumber and secondNumber.
                
                *Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of                     firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.

        (3) TEST EXAMPLE: 

            TEST CODE:

                SimpleCalculator calculator = new SimpleCalculator();
                calculator.setFirstNumber(5.0);
                calculator.setSecondNumber(4);
                System.out.println("add= " + calculator.getAdditionResult());
                System.out.println("subtract= " + calculator.getSubtractionResult());
                calculator.setFirstNumber(5.25);
                calculator.setSecondNumber(0);
                System.out.println("multiply= " + calculator.getMultiplicationResult());
                System.out.println("divide= " + calculator.getDivisionResult());

            OUTPUT

                add= 9.0
                subtract= 1.0
                multiply= 0.0
                divide= 0.0

        (4) TIPS:

                *add= 9.0 is printed because 5.0 + 4 is 9.0
                *subtract= 1.0 is printed because 5.0 - 4 is 1.0
                *multiply= 0.0 is printed because 5.25 * 0 is 0.0
                *divide= 0.0 is printed because secondNumber is set to 0

2. Person:

        (1) Write a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of         type String and age of type int. 

        (2) Write the following methods (instance methods):

                *Method named getFirstName without any parameters, it needs to return the value of the firstName field.
                
                *Method named getLastName without any parameters, it needs to return the value of the lastName field.
                
                *Method named getAge without any parameters, it needs to return the value of the age field.
                
                *Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
                
                *Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
                
                *Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is                     less than 0 or greater than 100, it needs to set the age field value to 0.
                
                *Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12                   and less than 20, otherwise, return false.
                
                *Method named getFullName without any parameters, it needs to return the full name of the person.
                
                *In case both firstName and lastName fields are empty, Strings return an empty String.
                
                *In case lastName is an empty String, return firstName.
                
                *In case firstName is an empty String, return lastName.
    
        (3) To check if s String is empty, use the method isEmpty from the String class. For example, firstName.isEmpty() returns true           if the String is empty or in other words, when the String does not contain any characters.


        (4) TEST EXAMPLE

        TEST CODE:

                  Person person = new Person();
                  person.setFirstName("");   // firstName is set to empty string
                  person.setLastName("");    // lastName is set to empty string
                  person.setAge(10);
                  System.out.println("fullName= " + person.getFullName());
                  System.out.println("teen= " + person.isTeen());
                  person.setFirstName("John");    // firstName is set to John
                  person.setAge(18);
                  System.out.println("fullName= " + person.getFullName());
                  System.out.println("teen= " + person.isTeen());
                  person.setLastName("Smith");    // lastName is set to Smith
                  System.out.println("fullName= " + person.getFullName());

        OUTPUT

                  fullName=
                  teen= false
                  fullName= John
                  teen= true
                  fullName= John Smith

