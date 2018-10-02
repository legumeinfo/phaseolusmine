package org.intermine.model.bio;

public interface QTL extends org.intermine.model.bio.Annotatable
{
    public java.lang.String getTraitDescription();
    public void setTraitDescription(final java.lang.String traitDescription);

    public java.lang.String getFavorableAlleleSource();
    public void setFavorableAlleleSource(final java.lang.String favorableAlleleSource);

    public java.lang.String getChadoUniqueName();
    public void setChadoUniqueName(final java.lang.String chadoUniqueName);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getTraitName();
    public void setTraitName(final java.lang.String traitName);

    public java.lang.String getTraitUnit();
    public void setTraitUnit(final java.lang.String traitUnit);

    public java.lang.String getIdentifier();
    public void setIdentifier(final java.lang.String identifier);

    public java.lang.Integer getChadoFeatureId();
    public void setChadoFeatureId(final java.lang.Integer chadoFeatureId);

    public java.lang.String getChadoName();
    public void setChadoName(final java.lang.String chadoName);

    public java.lang.String getAnalysisMethod();
    public void setAnalysisMethod(final java.lang.String analysisMethod);

    public java.lang.String getSecondaryIdentifier();
    public void setSecondaryIdentifier(final java.lang.String secondaryIdentifier);

    public java.lang.String getPublicationLinkageGroup();
    public void setPublicationLinkageGroup(final java.lang.String publicationLinkageGroup);

    public java.lang.String getStudyTreatment();
    public void setStudyTreatment(final java.lang.String studyTreatment);

    public java.lang.Double getPeak();
    public void setPeak(final java.lang.Double peak);

    public java.util.Set<org.intermine.model.bio.GeneticMarker> getMarkers();
    public void setMarkers(final java.util.Set<org.intermine.model.bio.GeneticMarker> markers);
    public void addMarkers(final org.intermine.model.bio.GeneticMarker arg);

    public java.util.Set<org.intermine.model.bio.Gene> getSpannedGenes();
    public void setSpannedGenes(final java.util.Set<org.intermine.model.bio.Gene> spannedGenes);
    public void addSpannedGenes(final org.intermine.model.bio.Gene arg);

    public java.util.Set<org.intermine.model.bio.LinkageGroupRange> getLinkageGroupRanges();
    public void setLinkageGroupRanges(final java.util.Set<org.intermine.model.bio.LinkageGroupRange> linkageGroupRanges);
    public void addLinkageGroupRanges(final org.intermine.model.bio.LinkageGroupRange arg);

}
