/**
 * ContactService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.service;

public interface ContactService extends java.rmi.Remote {
    public java.lang.String rechercherContact(java.lang.String critere) throws java.rmi.RemoteException;
    public java.lang.String listerContacts() throws java.rmi.RemoteException;
    public java.lang.String ajouterContact(java.lang.String nom, java.lang.String prenom, java.lang.String tel, java.lang.String email) throws java.rmi.RemoteException;
    public java.lang.String envoyerEmail(java.lang.String destinataire, java.lang.String sujet, java.lang.String contenu) throws java.rmi.RemoteException;
    public java.lang.String envoyerSms(java.lang.String destinataireSms, java.lang.String message) throws java.rmi.RemoteException;
}
