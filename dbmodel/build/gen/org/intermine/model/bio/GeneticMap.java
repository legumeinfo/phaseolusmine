package org.intermine.model.bio;

public interface GeneticMap extends org.intermine.model.bio.Annotatable
{
    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getUnit();
    public void setUnit(final java.lang.String unit);

    public java.util.Set<org.intermine.model.bio.LinkageGroup> getLinkageGroups();
    public void setLinkageGroups(final java.util.Set<org.intermine.model.bio.LinkageGroup> linkageGroups);
    public void addLinkageGroups(final org.intermine.model.bio.LinkageGroup arg);

    public java.util.Set<org.intermine.model.bio.GeneticMarker> getMarkers();
    public void setMarkers(final java.util.Set<org.intermine.model.bio.GeneticMarker> markers);
    public void addMarkers(final org.intermine.model.bio.GeneticMarker arg);

}
