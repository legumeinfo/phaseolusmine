package org.intermine.model.bio;

public interface LinkageGroupRange extends org.intermine.model.InterMineObject
{
    public java.lang.Double getBegin();
    public void setBegin(final java.lang.Double begin);

    public java.lang.Double getEnd();
    public void setEnd(final java.lang.Double end);

    public java.lang.Double getLength();
    public void setLength(final java.lang.Double length);

    public org.intermine.model.bio.LinkageGroup getLinkageGroup();
    public void setLinkageGroup(final org.intermine.model.bio.LinkageGroup linkageGroup);
    public void proxyLinkageGroup(final org.intermine.objectstore.proxy.ProxyReference linkageGroup);
    public org.intermine.model.InterMineObject proxGetLinkageGroup();

}
