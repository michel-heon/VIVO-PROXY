package ca.uqam.tool.vivoproxy.pattern.command.receiver;

import java.io.IOException;

import com.squareup.okhttp.Response;

import ca.uqam.tool.util.credential.VIVO_PROXY_Properties;
import ca.uqam.tool.vivoproxy.pattern.command.AbstractReceiver;
import ca.uqam.tool.vivoproxy.pattern.command.CommandResult;
import ca.uqam.tool.vivoproxy.swagger.model.AddressSchema;
import ca.uqam.tool.vivoproxy.swagger.model.LinguisticLabel;
import ca.uqam.tool.vivoproxy.swagger.model.PersonWithOfficeInfo;

/**
 * @author Michel Héon; Université du Québec à Montréal
 * @filename VivoReceiver_addPerson_Test.java
 * @date 6 oct. 2021
 */
public class VivoReceiver_addPersonWithMail_Test extends AbstractReceiver {
	public static void main(String[] argv) throws Exception {
		String username = VIVO_PROXY_Properties.getUserName();
		String password = VIVO_PROXY_Properties.getPasswd();
		VivoReceiver vr = new VivoReceiver();
		vr.login(username, password);
		PersonWithOfficeInfo pers = new PersonWithOfficeInfo();
		LinguisticLabel fn = new LinguisticLabel();
		String UID = "Tel9o"
				+ "";
		fn.setLabel(UID);
		LinguisticLabel ln = new LinguisticLabel();
		ln.setLabel("Telephone");
		pers.addFirstNameItem(fn);
		pers.addDisplayNameItem(fn);
		pers.addLastNameItem(ln);
		pers.setPersonType("http://vivoweb.org/ontology/core#FacultyMember");
		pers.setEMail(UID+".fn3@example.org");
		pers.addSecondaryMailsItem(UID+".fn3-b@example.org");
		pers.addSecondaryMailsItem(UID+".fn3-c@example.org");
		pers.addSecondaryMailsItem(UID+".fn3-d@example.org");
		pers.setTelephone("+1 (514) 654-6543 poste 1234");
		pers.setId(UID);
		AddressSchema address = new AddressSchema();
		address.setStreetAddress("Faculté des sciences; Case postale 8888, succ. Centre-ville");
		address.setLocality("Montréal");
		address.setRegion("Québec");
		address.setCountry("Canada");
		address.setPostalCode("HOH OHO");
		address.setOfficeNumber("0002");
		pers.addAddressItem(address);
		CommandResult resu = vr.addPerson(pers);
		System.out.println(resu.toString());
	}
}
