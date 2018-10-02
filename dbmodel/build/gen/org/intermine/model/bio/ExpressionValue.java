package org.intermine.model.bio;

public interface ExpressionValue extends org.intermine.model.InterMineObject
{
    public java.lang.Double getValue();
    public void setValue(final java.lang.Double value);

    public org.intermine.model.bio.ExpressionSample getSample();
    public void setSample(final org.intermine.model.bio.ExpressionSample sample);
    public void proxySample(final org.intermine.objectstore.proxy.ProxyReference sample);
    public org.intermine.model.InterMineObject proxGetSample();

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

}
