package org.intermine.model.bio;

public interface GeneFamily extends org.intermine.model.InterMineObject
{
    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public org.intermine.model.bio.ConsensusRegion getConsensusRegion();
    public void setConsensusRegion(final org.intermine.model.bio.ConsensusRegion consensusRegion);
    public void proxyConsensusRegion(final org.intermine.objectstore.proxy.ProxyReference consensusRegion);
    public org.intermine.model.InterMineObject proxGetConsensusRegion();

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

}
