package org.intermine.model.bio;

public interface ConsensusRegion extends org.intermine.model.bio.BioEntity
{
    public java.lang.Double getLength();
    public void setLength(final java.lang.Double length);

    public org.intermine.model.bio.SOTerm getSequenceOntologyTerm();
    public void setSequenceOntologyTerm(final org.intermine.model.bio.SOTerm sequenceOntologyTerm);
    public void proxySequenceOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference sequenceOntologyTerm);
    public org.intermine.model.InterMineObject proxGetSequenceOntologyTerm();

    public org.intermine.model.bio.GeneFamily getGeneFamily();
    public void setGeneFamily(final org.intermine.model.bio.GeneFamily geneFamily);
    public void proxyGeneFamily(final org.intermine.objectstore.proxy.ProxyReference geneFamily);
    public org.intermine.model.InterMineObject proxGetGeneFamily();

    public org.intermine.model.bio.Sequence getSequence();
    public void setSequence(final org.intermine.model.bio.Sequence sequence);
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence);
    public org.intermine.model.InterMineObject proxGetSequence();

}
