//package com.example.user;
//
//import java.io.IOException;
//
//import org.postgresql.Driver;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import com.example.user.model.Contact;
//
//@SpringBootApplication
//public class XStream {
//
//	
//	
//	    public static void main(String[] args)
//	        throws IOException
//	    {
//	        // Initializing XStream with Dom driver
//	        XStream xStream = new XStream();
//	  
//	        // We need to configure the security framework in
//	        // XStream, so it deserializes the object from the
//	        // XML
//	        xStream.allowTypes(new Class[] { Contact.class });
//	  
//	        // Now, to make the XML outputted by XStream more
//	        // concise, you can create aliases for your custom
//	        // class names to XML element names. This is the
//	        // only type of mapping required to use XStream and
//	        // even this is optional.
//	        xStream.alias("contact",Contact.class);
//	  
//	        Contact c1 = new Contact();
//	  
//	        // Serializing a Java object into XML
//	        String xml
//	            = xStream.toXML(c1); // Converting it to XML
//	  
//	        // Deserializing a Java object from XML
//	        Contact contact = (Contact)xStream.fromXML(xml);
//	  
////	        System.out.println("id of Contact:  "
////	                           + contact.getId());
//	        System.out.println(" name of Contact:   "
//	                           + contact.getName());
//	        System.out.println("address of contact :          "
//	                           + contact.getAddress());
//	        System.out.println("contact  of gender:       "
//	                           + contact.getGender());
//	        System.out.println("contact  of interestedinit:       "
//                    + contact.getInterestedinIT());
//	        System.out.println("contact  of coursesinterested:       "
//                    + contact.getCoursesinterested());
//	        System.out.println("contact percentage:       $"
//	                           + contact.getPercentage());
//	    }
//
//		private Contact fromXML(String xml) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		private String toXML(Contact c1) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		private void alias(String string, Class<Contact> class1) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		private void allowTypes(Class[] classes) {
//			// TODO Auto-generated method stub
//			
//		}
//	}
