# Ebay Take Home Exercise

Welcome to my take home exercise solution for eBay. The following contains my Spring Boot solution for building a RESTful endpoint for eBay to workout the price for delivery. 
I have refractored and changed around the original code given and created my own project from scratch using the existing files to ensure that I have installed 
all of the correct dependencies that were available. Kindly see below for the list of dependencies.

## Dependencies
* starter-thymeleaf
* starter-web
* Build with Gradle

## Languages/Frameworks
* Spring Boot Java 
* HTML
* CSS
* AJAX
* JavaScript
* JSON

## Basic Service/Price By Vehicle
Given that various vehicles would have a different markup on the price, I determined the final price by using a switch inside the `calculateNewPrice` method. This method 
operated by taking the type of vehicle as a parameter, then multiplying by the corresponding markup. This can be access by running the Spring Boot server then typing 
`http://localhost:8080/quotes` URL into the browser.


# Web Interface - I call it the "Quote Calculator"
This interface was developed using HTML, CSS, JavaScript and  Ajax, which uses the `quote.html` file. In order to see it working properly, you will need
to be running Spring Boot server then type `http://localhost:8080/quote` to see the actual Web Interface. Firstly, I created and styled a form to ensure it was responsive 
with all devices, and applied a theme similar to ebay's business color to make it more appealing and realistic. See below:

![eBay Quote Calculator](/images/calculator1.png)

The next problem, was to send the form date to the backend without refreshing the page. Ajax and Javascript
allowed me to overcome this problem by accessing each form element, concatenating them into a JS Object, then converting them to a JSON Object which was sent to the backend. 
In order to communicate with the backend, I needed both the backend and frontend to speak a common language/syntax. This problem was solved using JSON. Thus, on submission of 
form data, it would be sent to the RESTful service previously created. Afterwards, the server would return the calculated price along with its other properties to produce a quote.
