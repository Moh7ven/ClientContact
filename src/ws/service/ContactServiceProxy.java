package ws.service;

public class ContactServiceProxy implements ws.service.ContactService {
  private String _endpoint = null;
  private ws.service.ContactService contactService = null;
  
  public ContactServiceProxy() {
    _initContactServiceProxy();
  }
  
  public ContactServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initContactServiceProxy();
  }
  
  private void _initContactServiceProxy() {
    try {
      contactService = (new ws.service.ContactServiceImplServiceLocator()).getContactServiceImplPort();
      if (contactService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)contactService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)contactService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (contactService != null)
      ((javax.xml.rpc.Stub)contactService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.service.ContactService getContactService() {
    if (contactService == null)
      _initContactServiceProxy();
    return contactService;
  }
  
  public java.lang.String rechercherContact(java.lang.String critere) throws java.rmi.RemoteException{
    if (contactService == null)
      _initContactServiceProxy();
    return contactService.rechercherContact(critere);
  }
  
  public java.lang.String listerContacts() throws java.rmi.RemoteException{
    if (contactService == null)
      _initContactServiceProxy();
    return contactService.listerContacts();
  }
  
  public java.lang.String ajouterContact(java.lang.String nom, java.lang.String prenom, java.lang.String tel, java.lang.String email) throws java.rmi.RemoteException{
    if (contactService == null)
      _initContactServiceProxy();
    return contactService.ajouterContact(nom, prenom, tel, email);
  }
  
  public java.lang.String envoyerEmail(java.lang.String destinataire, java.lang.String sujet, java.lang.String contenu) throws java.rmi.RemoteException{
    if (contactService == null)
      _initContactServiceProxy();
    return contactService.envoyerEmail(destinataire, sujet, contenu);
  }
  
  public java.lang.String envoyerSms(java.lang.String destinataireSms, java.lang.String message) throws java.rmi.RemoteException{
    if (contactService == null)
      _initContactServiceProxy();
    return contactService.envoyerSms(destinataireSms, message);
  }
  
  
}