package in;

import static org.custommonkey.xmlunit.XMLAssert.assertXMLEqual;

import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.ElementNameAndTextQualifier;
import org.custommonkey.xmlunit.XMLUnit;
import org.junit.Test;
import org.w3c.dom.Document;

public class Order2InvoiceTest {
	@Test
	public void testStylesheet() throws Exception {
		StreamSource input = new StreamSource(getClass().getResourceAsStream(
				"Order2Invoice-input.xml"));
		StreamSource xslt = new StreamSource(getClass().getResourceAsStream(
				"Order2Invoice.xsl"));
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer(xslt);

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document expected = db.parse(getClass().getResourceAsStream(
                "Order2Invoice-expected.xml"));

// If there are problems, it may help to print the result        
//        StringWriter out = new StringWriter();
//        transformer.transform(new StreamSource(getClass().getResourceAsStream(
//				"Order2Invoice-input.xml")), new StreamResult(out));
//        System.out.println(out);
        
        DOMResult result = new DOMResult();
        transformer.transform(input, result);
        
        Document output = (Document)result.getNode();
	    XMLUnit.setIgnoreWhitespace(true);
	    XMLUnit.setIgnoreComments(true);
	    XMLUnit.setIgnoreAttributeOrder(true);
	
	    DetailedDiff diff = new DetailedDiff(XMLUnit.compareXML(expected,
	                output));
	    diff.overrideElementQualifier(new ElementNameAndTextQualifier());
	    assertXMLEqual(diff, true);
	}
}
