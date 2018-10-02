package org.intermine.model.bio;

public interface ProteinMatch extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getSignatureDesc();
    public void setSignatureDesc(final java.lang.String signatureDesc);

    public java.lang.String getStatus();
    public void setStatus(final java.lang.String status);

    public java.lang.String getDate();
    public void setDate(final java.lang.String date);

    public org.intermine.model.bio.Protein getProtein();
    public void setProtein(final org.intermine.model.bio.Protein protein);
    public void proxyProtein(final org.intermine.objectstore.proxy.ProxyReference protein);
    public org.intermine.model.InterMineObject proxGetProtein();

    public org.intermine.model.bio.SOTerm getSequenceOntologyTerm();
    public void setSequenceOntologyTerm(final org.intermine.model.bio.SOTerm sequenceOntologyTerm);
    public void proxySequenceOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference sequenceOntologyTerm);
    public org.intermine.model.InterMineObject proxGetSequenceOntologyTerm();

    public org.intermine.model.bio.Location getProteinLocation();
    public void setProteinLocation(final org.intermine.model.bio.Location proteinLocation);
    public void proxyProteinLocation(final org.intermine.objectstore.proxy.ProxyReference proteinLocation);
    public org.intermine.model.InterMineObject proxGetProteinLocation();

}
