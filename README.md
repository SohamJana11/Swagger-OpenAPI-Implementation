# Swagger-OpenAPI-Implementation
A Spring Boot Microservice with REST API Documentation using Swagger OpenAPI in 4 simple steps.

### Step 1: Add Dependency to pom.xml

##### Added the following dependency to the pom.xml file to include Swagger (OpenAPI) in the project:
![Screenshot 2024-06-10 185408](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/d61253f3-bd46-44af-a883-f4fb3624a209)


### Step 2: Create OpenAPIConfig Class

##### Created a new package named config and added a class called OpenAPIConfig.

![Screenshot 2024-06-10 185850](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/8bdfcf19-78e6-4297-b6db-dcb68d53f19e)

![Screenshot 2024-06-12 125500](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/da812c60-3a22-4dc4-a4e6-165cde04151b)


##### Steps Performed in OpenAPIConfig Class

- Package Declaration: Declared the package.
- Import Swagger Annotations: Imported necessary Swagger (OpenAPI) annotations.
- Start OpenAPI Definition: Started the OpenAPI definition.
- Set API Title: Set the title for the API.
- Provide API Summary: Added a brief summary of the API.
- Add Terms of Service: Included terms of service.
- Add Contact Info: Provided contact information.
- Set API Version: Specified the API version.
- Define Servers: Defined development and test servers (these can be further implemented later).
  
Example OpenAPIConfig class:

### Step 3: Add API Operations in Controller

##### In the Controller class, added some API operations to make the interface more vivid and informative. Used appropriate Swagger annotations to document the endpoints. One such example is shown below - 


![Screenshot 2024-06-12 124512](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/9ca0a91a-662f-4c23-90d3-f12923d8fce7)


### Step 4: Run the main file

![Screenshot 2024-06-12 124613](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/19bbe4ff-471c-4b2b-a3b1-9620415468e7)


________________________________________________________________________________________________________________________________________________

## Output

###### After completing the above steps, the output is as follows:

![Screenshot 2024-06-12 124644](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/0e7568ba-36b9-489b-9c5c-54f53f641246)



- A visual interface for interacting with and testing APIs is generated.
- Interactive API documentation is created automatically from the OpenAPI specification.
- Users can explore, understand, and test API endpoints directly from their browser without needing to write any code.

_________________________________________________________________________________________________________________________________________________

### Testing the Endpoints

#### Testing the /addBook Endpoint

One can test the addBook method at the endpoint /addBook through the Swagger UI.

![Screenshot 2024-06-12 124711](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/624734ef-c43e-4ce0-ad31-f6c0b80dac2d)

![Screenshot 2024-06-12 124751](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/0bba26d6-c756-4946-bef3-2e949ab72689)



#### Testing the /getAllBooks Endpoint

Similarly, you can test the getAllBooks method at the endpoint /getAllBooks.

![Screenshot 2024-06-12 124853](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/1df1d0b2-ce7e-4408-b25a-998f0a635ea8)

![Screenshot 2024-06-12 124917](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/5cfb8512-3678-4d6b-a375-dfdf5e1c6176)



##### Conclusion

##### The code is running successfully, providing a fully interactive and informative interface for API documentation and testing.
