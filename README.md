# Swagger-OpenAPI-Implementation
A Spring Boot Microservice with REST API Documentation using Swagger OpenAPI

### Step 1: Add Dependency to pom.xml

##### Add the following dependency to your pom.xml file to include Swagger (OpenAPI) in your project:

### Step 2: Create OpenAPIConfig Class

##### Create a new package named config and add a class called OpenAPIConfig.

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

##### In your Controller class, add some API operations to make the interface more vivid and informative. Ensure you use appropriate Swagger annotations to document the endpoints.

## Output

###### After completing the above steps, the output is as follows:

- A visual interface for interacting with and testing APIs is generated.
- Interactive API documentation is created automatically from the OpenAPI specification.
- Users can explore, understand, and test API endpoints directly from their browser without needing to write any code.

  
### Testing the Endpoints

#### Testing the /addBook Endpoint

You can test the addBook method at the endpoint /addBook through the Swagger UI.

#### Testing the /getAllBooks Endpoint

Similarly, you can test the getAllBooks method at the endpoint /getAllBooks.

##### Conclusion

##### The code is running successfully, providing a fully interactive and informative interface for API documentation and testing.
