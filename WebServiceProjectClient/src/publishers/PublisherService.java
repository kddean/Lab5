/**
 * PublisherService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package publishers;

public interface PublisherService extends javax.xml.rpc.Service {
    public java.lang.String getPublisherAddress();

    public publishers.Publisher getPublisher() throws javax.xml.rpc.ServiceException;

    public publishers.Publisher getPublisher(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
