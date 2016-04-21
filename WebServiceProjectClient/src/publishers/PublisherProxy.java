package publishers;

public class PublisherProxy implements publishers.Publisher {
  private String _endpoint = null;
  private publishers.Publisher publisher = null;
  
  public PublisherProxy() {
    _initPublisherProxy();
  }
  
  public PublisherProxy(String endpoint) {
    _endpoint = endpoint;
    _initPublisherProxy();
  }
  
  private void _initPublisherProxy() {
    try {
      publisher = (new publishers.PublisherServiceLocator()).getPublisher();
      if (publisher != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)publisher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)publisher)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (publisher != null)
      ((javax.xml.rpc.Stub)publisher)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public publishers.Publisher getPublisher() {
    if (publisher == null)
      _initPublisherProxy();
    return publisher;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (publisher == null)
      _initPublisherProxy();
    publisher.main(args);
  }
  
  
}