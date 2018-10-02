package org.intermine.model.bio;

public interface ProteinHmmMatch extends org.intermine.model.bio.ProteinMatch
{
    public org.intermine.model.bio.ProteinDomain getProteinDomain();
    public void setProteinDomain(final org.intermine.model.bio.ProteinDomain proteinDomain);
    public void proxyProteinDomain(final org.intermine.objectstore.proxy.ProxyReference proteinDomain);
    public org.intermine.model.InterMineObject proxGetProteinDomain();

    public org.intermine.model.bio.Location getProteinDomainLocation();
    public void setProteinDomainLocation(final org.intermine.model.bio.Location proteinDomainLocation);
    public void proxyProteinDomainLocation(final org.intermine.objectstore.proxy.ProxyReference proteinDomainLocation);
    public org.intermine.model.InterMineObject proxGetProteinDomainLocation();

}
