package org.intermine.model.bio;

public interface ExpressionSample extends org.intermine.model.InterMineObject
{
    public java.lang.Integer getNum();
    public void setNum(final java.lang.Integer num);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public org.intermine.model.bio.ExpressionSource getSource();
    public void setSource(final org.intermine.model.bio.ExpressionSource source);
    public void proxySource(final org.intermine.objectstore.proxy.ProxyReference source);
    public org.intermine.model.InterMineObject proxGetSource();

}
