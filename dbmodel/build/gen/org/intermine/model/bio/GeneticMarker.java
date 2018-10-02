package org.intermine.model.bio;

public interface GeneticMarker extends org.intermine.model.bio.SequenceFeature
{
    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getSourceDescription();
    public void setSourceDescription(final java.lang.String sourceDescription);

    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.String getCanonicalMarker();
    public void setCanonicalMarker(final java.lang.String canonicalMarker);

    public java.util.Set<org.intermine.model.bio.QTL> getqTLs();
    public void setqTLs(final java.util.Set<org.intermine.model.bio.QTL> QTLs);
    public void addqTLs(final org.intermine.model.bio.QTL arg);

    public java.util.Set<org.intermine.model.bio.LinkageGroupPosition> getLinkageGroupPositions();
    public void setLinkageGroupPositions(final java.util.Set<org.intermine.model.bio.LinkageGroupPosition> linkageGroupPositions);
    public void addLinkageGroupPositions(final org.intermine.model.bio.LinkageGroupPosition arg);

}
