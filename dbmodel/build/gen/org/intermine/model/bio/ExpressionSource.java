package org.intermine.model.bio;

public interface ExpressionSource extends org.intermine.model.InterMineObject
{
    public java.lang.String getSra();
    public void setSra(final java.lang.String sra);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getBioProject();
    public void setBioProject(final java.lang.String bioProject);

    public java.lang.String getUnit();
    public void setUnit(final java.lang.String unit);

    public java.lang.String getUrl();
    public void setUrl(final java.lang.String url);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public java.lang.String getGeo();
    public void setGeo(final java.lang.String geo);

    public org.intermine.model.bio.Publication getPublication();
    public void setPublication(final org.intermine.model.bio.Publication publication);
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication);
    public org.intermine.model.InterMineObject proxGetPublication();

    public java.util.Set<org.intermine.model.bio.ExpressionSample> getSamples();
    public void setSamples(final java.util.Set<org.intermine.model.bio.ExpressionSample> samples);
    public void addSamples(final org.intermine.model.bio.ExpressionSample arg);

}
