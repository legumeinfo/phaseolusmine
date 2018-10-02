package org.intermine.model.bio;

public interface LinkageGroupPosition extends org.intermine.model.InterMineObject
{
    public java.lang.Double getPosition();
    public void setPosition(final java.lang.Double position);

    public org.intermine.model.bio.LinkageGroup getLinkageGroup();
    public void setLinkageGroup(final org.intermine.model.bio.LinkageGroup linkageGroup);
    public void proxyLinkageGroup(final org.intermine.objectstore.proxy.ProxyReference linkageGroup);
    public org.intermine.model.InterMineObject proxGetLinkageGroup();

}
