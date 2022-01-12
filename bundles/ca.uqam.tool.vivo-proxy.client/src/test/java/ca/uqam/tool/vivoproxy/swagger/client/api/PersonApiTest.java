/*
 * VIVO Proxy API
 * Proxy API for VIVO Data Manipulation
 *
 * OpenAPI spec version: 1.0.0 - 2021-10-23
 * Contact: vivo@uqam.ca
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ca.uqam.tool.vivoproxy.swagger.client.api;

import ca.uqam.tool.vivoproxy.swagger.client.handler.ApiException;
import ca.uqam.tool.vivoproxy.swagger.client.model.AuthorOfADocument;
import ca.uqam.tool.vivoproxy.swagger.client.model.ModelAPIResponse;
import ca.uqam.tool.vivoproxy.swagger.client.model.Person;
import ca.uqam.tool.vivoproxy.swagger.client.model.PersonWithOfficeInfo;
import ca.uqam.tool.vivoproxy.swagger.client.model.PositionOfPerson;
import ca.uqam.tool.vivoproxy.swagger.client.model.ResourceToResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PersonApi
 */
@Ignore
public class PersonApiTest {

    private final PersonApi api = new PersonApi();

    /**
     * Create a person in VIVO
     *
     * This can only be done by the logged in person.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPersonTest() throws ApiException {
        Person body = null;
        ModelAPIResponse response = api.createPerson(body);

        // TODO: test validations
    }
    /**
     * Create a user in VIVO using the eMail address as an IRI key
     *
     * This can only be done by the logged in person.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPersonWithEmailTest() throws ApiException {
        PersonWithOfficeInfo body = null;
        ModelAPIResponse response = api.createPersonWithEmail(body);

        // TODO: test validations
    }
    /**
     * Creates list of users with given input array
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUsersWithListInputTest() throws ApiException {
        List<Person> body = null;
        String response = api.createUsersWithListInput(body);

        // TODO: test validations
    }
    /**
     * Associate a Document to a Person
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void personAddDocumentTest() throws ApiException {
        AuthorOfADocument body = null;
        String response = api.personAddDocument(body);

        // TODO: test validations
    }
    /**
     * Add an organizational position for
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void personAddOrganisationalPositionToTest() throws ApiException {
        PositionOfPerson body = null;
        ModelAPIResponse response = api.personAddOrganisationalPositionTo(body);

        // TODO: test validations
    }
    /**
     * Create a &#x27;Research Area of&#x27; a person
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void personAddResearchAreaOfTest() throws ApiException {
        ResourceToResource body = null;
        ModelAPIResponse response = api.personAddResearchAreaOf(body);

        // TODO: test validations
    }
    /**
     * Create &#x27;has Research Area&#x27; for a person
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void personHasAddResearchAreaTest() throws ApiException {
        ResourceToResource body = null;
        ModelAPIResponse response = api.personHasAddResearchArea(body);

        // TODO: test validations
    }
}