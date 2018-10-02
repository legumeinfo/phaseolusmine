package org.intermine.model.bio;

public interface ProteinDomain extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getInterproShortName();
    public void setInterproShortName(final java.lang.String interproShortName);

    public java.lang.String getInterproId();
    public void setInterproId(final java.lang.String interproId);

    public java.lang.String getInterproName();
    public void setInterproName(final java.lang.String interproName);

    public org.intermine.model.bio.SOTerm getSequenceOntologyTerm();
    public void setSequenceOntologyTerm(final org.intermine.model.bio.SOTerm sequenceOntologyTerm);
    public void proxySequenceOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference sequenceOntologyTerm);
    public org.intermine.model.InterMineObject proxGetSequenceOntologyTerm();

    public java.util.Set<org.intermine.model.bio.Protein> getProteins();
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins);
    public void addProteins(final org.intermine.model.bio.Protein arg);

    public java.util.Set<org.intermine.model.bio.ProteinHmmMatch> getProteinHmmMatches();
    public void setProteinHmmMatches(final java.util.Set<org.intermine.model.bio.ProteinHmmMatch> proteinHmmMatches);
    public void addProteinHmmMatches(final org.intermine.model.bio.ProteinHmmMatch arg);

}
