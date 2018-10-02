package org.intermine.model.bio;

public interface LinkageGroup extends org.intermine.model.bio.Annotatable
{
    public java.lang.String getChadoUniqueName();
    public void setChadoUniqueName(final java.lang.String chadoUniqueName);

    public java.lang.Integer getChadoFeatureId();
    public void setChadoFeatureId(final java.lang.Integer chadoFeatureId);

    public java.lang.String getChadoName();
    public void setChadoName(final java.lang.String chadoName);

    public java.lang.Double getLength();
    public void setLength(final java.lang.Double length);

    public java.lang.String getAssignedLinkageGroup();
    public void setAssignedLinkageGroup(final java.lang.String assignedLinkageGroup);

    public java.lang.String getSecondaryIdentifier();
    public void setSecondaryIdentifier(final java.lang.String secondaryIdentifier);

    public java.lang.Integer getNumber();
    public void setNumber(final java.lang.Integer number);

    public org.intermine.model.bio.GeneticMap getGeneticMap();
    public void setGeneticMap(final org.intermine.model.bio.GeneticMap geneticMap);
    public void proxyGeneticMap(final org.intermine.objectstore.proxy.ProxyReference geneticMap);
    public org.intermine.model.InterMineObject proxGetGeneticMap();

    public java.util.Set<org.intermine.model.bio.QTL> getqTLs();
    public void setqTLs(final java.util.Set<org.intermine.model.bio.QTL> QTLs);
    public void addqTLs(final org.intermine.model.bio.QTL arg);

    public java.util.Set<org.intermine.model.bio.GeneticMarker> getMarkers();
    public void setMarkers(final java.util.Set<org.intermine.model.bio.GeneticMarker> markers);
    public void addMarkers(final org.intermine.model.bio.GeneticMarker arg);

}
