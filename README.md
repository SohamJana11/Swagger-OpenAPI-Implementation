# Swagger-OpenAPI-Implementation
A Spring Boot Microservice with REST API Documentation using Swagger OpenAPI

### Step 1: Add Dependency to pom.xml

##### Added the following dependency to the pom.xml file to include Swagger (OpenAPI) in the project:
![Screenshot 2024-06-10 185408](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/d61253f3-bd46-44af-a883-f4fb3624a209)


### Step 2: Create OpenAPIConfig Class

##### Created a new package named config and added a class called OpenAPIConfig.

![Screenshot 2024-06-10 185850](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/8bdfcf19-78e6-4297-b6db-dcb68d53f19e)

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

##### In the Controller class, added some API operations to make the interface more vivid and informative. Used appropriate Swagger annotations to document the endpoints.


![Screenshot 2024-06-10 191336](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/386c2a29-3000-4e22-b3e8-fb42883d4bbc)

________________________________________________________________________________________________________________________________________________

## Output

###### After completing the above steps, the output is as follows:

![Screenshot 2024-06-10 190210](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/0de6ab7d-2b06-489c-afa9-b67d1ee86d0f)


- A visual interface for interacting with and testing APIs is generated.
- Interactive API documentation is created automatically from the OpenAPI specification.
- Users can explore, understand, and test API endpoints directly from their browser without needing to write any code.

_________________________________________________________________________________________________________________________________________________

### Testing the Endpoints

#### Testing the /addBook Endpoint

One can test the addBook method at the endpoint /addBook through the Swagger UI.

![Screenshot 2024-06-10 190849](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/fde30d5f-e882-4e40-967a-da5554590801)


#### Testing the /getAllBooks Endpoint

Similarly, you can test the getAllBooks method at the endpoint /getAllBooks.

![Screenshot 2024-06-10 191021](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/53c73a64-e9ac-43a7-bd0a-1b0f94833c72)

![Screenshot 2024-06-10 191008](https://github.com/SohamJana11/Swagger-OpenAPI-Implementation/assets/162604344/7cdf6c29-de24-48ca-a4c1-fb6afbf364d8)


##### Conclusion

##### The code is running successfully, providing a fully interactive and informative interface for API documentation and testing.
