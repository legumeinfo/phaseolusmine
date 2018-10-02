package org.intermine.model.bio;

public interface Gene extends org.intermine.model.bio.SequenceFeature
{
    public java.lang.String getBriefDescription();
    public void setBriefDescription(final java.lang.String briefDescription);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getFamilyRepresentative();
    public void setFamilyRepresentative(final java.lang.String familyRepresentative);

    public org.intermine.model.bio.IntergenicRegion getUpstreamIntergenicRegion();
    public void setUpstreamIntergenicRegion(final org.intermine.model.bio.IntergenicRegion upstreamIntergenicRegion);
    public void proxyUpstreamIntergenicRegion(final org.intermine.objectstore.proxy.ProxyReference upstreamIntergenicRegion);
    public org.intermine.model.InterMineObject proxGetUpstreamIntergenicRegion();

    public org.intermine.model.bio.IntergenicRegion getDownstreamIntergenicRegion();
    public void setDownstreamIntergenicRegion(final org.intermine.model.bio.IntergenicRegion downstreamIntergenicRegion);
    public void proxyDownstreamIntergenicRegion(final org.intermine.objectstore.proxy.ProxyReference downstreamIntergenicRegion);
    public org.intermine.model.InterMineObject proxGetDownstreamIntergenicRegion();

    public org.intermine.model.bio.GeneFamily getGeneFamily();
    public void setGeneFamily(final org.intermine.model.bio.GeneFamily geneFamily);
    public void proxyGeneFamily(final org.intermine.objectstore.proxy.ProxyReference geneFamily);
    public org.intermine.model.InterMineObject proxGetGeneFamily();

    public java.util.Set<org.intermine.model.bio.GeneFlankingRegion> getFlankingRegions();
    public void setFlankingRegions(final java.util.Set<org.intermine.model.bio.GeneFlankingRegion> flankingRegions);
    public void addFlankingRegions(final org.intermine.model.bio.GeneFlankingRegion arg);

    public java.util.Set<org.intermine.model.bio.Intron> getIntrons();
    public void setIntrons(final java.util.Set<org.intermine.model.bio.Intron> introns);
    public void addIntrons(final org.intermine.model.bio.Intron arg);

    public java.util.Set<org.intermine.model.bio.CDS> getcDSs();
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs);
    public void addcDSs(final org.intermine.model.bio.CDS arg);

    public java.util.Set<org.intermine.model.bio.Homologue> getHomologues();
    public void setHomologues(final java.util.Set<org.intermine.model.bio.Homologue> homologues);
    public void addHomologues(final org.intermine.model.bio.Homologue arg);

    public java.util.Set<org.intermine.model.bio.Exon> getExons();
    public void setExons(final java.util.Set<org.intermine.model.bio.Exon> exons);
    public void addExons(final org.intermine.model.bio.Exon arg);

    public java.util.Set<org.intermine.model.bio.QTL> getSpanningQTLs();
    public void setSpanningQTLs(final java.util.Set<org.intermine.model.bio.QTL> spanningQTLs);
    public void addSpanningQTLs(final org.intermine.model.bio.QTL arg);

    public java.util.Set<org.intermine.model.bio.ExpressionValue> getExpressionValues();
    public void setExpressionValues(final java.util.Set<org.intermine.model.bio.ExpressionValue> expressionValues);
    public void addExpressionValues(final org.intermine.model.bio.ExpressionValue arg);

    public java.util.Set<org.intermine.model.bio.Pathway> getPathways();
    public void setPathways(final java.util.Set<org.intermine.model.bio.Pathway> pathways);
    public void addPathways(final org.intermine.model.bio.Pathway arg);

    public java.util.Set<org.intermine.model.bio.Protein> getProteins();
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins);
    public void addProteins(final org.intermine.model.bio.Protein arg);

    public java.util.Set<org.intermine.model.bio.UTR> getuTRs();
    public void setuTRs(final java.util.Set<org.intermine.model.bio.UTR> UTRs);
    public void adduTRs(final org.intermine.model.bio.UTR arg);

    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts();
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts);
    public void addTranscripts(final org.intermine.model.bio.Transcript arg);

    public java.util.Set<org.intermine.model.bio.Allele> getAlleles();
    public void setAlleles(final java.util.Set<org.intermine.model.bio.Allele> alleles);
    public void addAlleles(final org.intermine.model.bio.Allele arg);

    public java.util.Set<org.intermine.model.bio.RegulatoryRegion> getRegulatoryRegions();
    public void setRegulatoryRegions(final java.util.Set<org.intermine.model.bio.RegulatoryRegion> regulatoryRegions);
    public void addRegulatoryRegions(final org.intermine.model.bio.RegulatoryRegion arg);

}
