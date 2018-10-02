package org.intermine.model.bio;

public interface Protein extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getMd5checksum();
    public void setMd5checksum(final java.lang.String md5checksum);

    public java.lang.String getPrimaryAccession();
    public void setPrimaryAccession(final java.lang.String primaryAccession);

    public java.lang.Double getMolecularWeight();
    public void setMolecularWeight(final java.lang.Double molecularWeight);

    public java.lang.Integer getLength();
    public void setLength(final java.lang.Integer length);

    public java.lang.String getNote();
    public void setNote(final java.lang.String note);

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public org.intermine.model.bio.SOTerm getSequenceOntologyTerm();
    public void setSequenceOntologyTerm(final org.intermine.model.bio.SOTerm sequenceOntologyTerm);
    public void proxySequenceOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference sequenceOntologyTerm);
    public org.intermine.model.InterMineObject proxGetSequenceOntologyTerm();

    public org.intermine.model.bio.Sequence getSequence();
    public void setSequence(final org.intermine.model.bio.Sequence sequence);
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence);
    public org.intermine.model.InterMineObject proxGetSequence();

    public java.util.Set<org.intermine.model.bio.CDS> getcDSs();
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs);
    public void addcDSs(final org.intermine.model.bio.CDS arg);

    public java.util.Set<org.intermine.model.bio.ConsensusRegion> getConsensusRegions();
    public void setConsensusRegions(final java.util.Set<org.intermine.model.bio.ConsensusRegion> consensusRegions);
    public void addConsensusRegions(final org.intermine.model.bio.ConsensusRegion arg);

    public java.util.Set<org.intermine.model.bio.ProteinMatch> getProteinMatches();
    public void setProteinMatches(final java.util.Set<org.intermine.model.bio.ProteinMatch> proteinMatches);
    public void addProteinMatches(final org.intermine.model.bio.ProteinMatch arg);

    public java.util.Set<org.intermine.model.bio.ProteinDomain> getProteinDomains();
    public void setProteinDomains(final java.util.Set<org.intermine.model.bio.ProteinDomain> proteinDomains);
    public void addProteinDomains(final org.intermine.model.bio.ProteinDomain arg);

    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts();
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts);
    public void addTranscripts(final org.intermine.model.bio.Transcript arg);

}
