# Makersharks
Makersharks is building a search page where buyers can search for manufacturers based on their customised requirements.
Use Spring Boot to build the RESTful API.


**Supplier  Details:**
1. supplier_id : unique identifier for each supplier
2. company_name
3. website
4. location : city, assuming one supplier_id maps to just one location
5. nature_of_business : Possible values: small_scale, medium_scale, large_scale
6. manufacturing_processes : Possible values for POC: moulding, 3d_printing, casting, coating

**API Endpoints**:
1. /api/supplier/query [POST]

**Requirement:**
1. Retrieve a list of X number of manufacturer(s) in a given location, with a specific nature of business, and the capability to perform a specific manufacturing process.
2. Example Query: Fetch a list of small_scale manufacturers onboarded on Makersharks, located in India, and having the capability to perform 3d_printing.
3. Expected Response: The API should return a list of manufacturers matching the given criteria, including their supplier_id, company_name, website, location, nature_of_business, and manufacturing_processes.

**Instructions on how to run the application and any other relevant information.**
** 1. Ensure Your Development Environment is Set Up**
Before running your application, ensure you have the following installed:
1. Java Development Kit (JDK): Ensure you have JDK 8 or above installed.
2. Spring Tool Suite (STS): STS is an IDE specifically tailored for Spring applications.

**2. Import Your Project into STS**
If your project is not already open in STS, follow these steps to import it:
1. Open STS.
2. File > Import.
3. Select "Existing Maven Projects" (assuming your project is a Maven project).
4. Browse to your project directory and select it.
5. Click Finish.
STS will automatically import your project, download necessary dependencies, and build the project.

**3. Configure Your Application Properties**
Before running the application, make sure your application.properties or application.yml file is properly configured. This file typically resides in the src/main/resources directory.

**4. Run the Application**
To run your application:
Right-click on your main application class (the one annotated with @SpringBootApplication).
Example: MakersharksApplication.java.
Select "Run As" > "Spring Boot App".

**5. Accessing the Application**
Once the application is running, you can access it via your web browser.
API Endpoint: The main API endpoint for querying suppliers will be something like:
Use tools like Postman
http://localhost:8080/api/supplier/query

or you can also use Swagger for API Documentation
http://localhost:8080/swagger-ui.html

Explore API Endpoints: Swagger UI will list all available endpoints, including the /api/supplier/query endpoint. 
You can test your API directly from this interface by providing input parameters and submitting requests.

**8. Stop the Application**
To stop the application:
Click the red "Terminate" button in the Console view of STS, or right-click the application in the "Servers" tab and choose "Stop".
