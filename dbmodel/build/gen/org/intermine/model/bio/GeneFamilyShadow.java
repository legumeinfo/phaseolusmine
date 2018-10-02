package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class GeneFamilyShadow implements GeneFamily, ShadowClass
{
    public static final Class<GeneFamily> shadowOf = GeneFamily.class;
    // Attr: org.intermine.model.bio.GeneFamily.description
    protected java.lang.String description;
    public java.lang.String getDescription() { return description; }
    public void setDescription(final java.lang.String description) { this.description = description; }

    // Attr: org.intermine.model.bio.GeneFamily.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Ref: org.intermine.model.bio.GeneFamily.consensusRegion
    protected org.intermine.model.InterMineObject consensusRegion;
    public org.intermine.model.bio.ConsensusRegion getConsensusRegion() { if (consensusRegion instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.ConsensusRegion) ((org.intermine.objectstore.proxy.ProxyReference) consensusRegion).getObject()); }; return (org.intermine.model.bio.ConsensusRegion) consensusRegion; }
    public void setConsensusRegion(final org.intermine.model.bio.ConsensusRegion consensusRegion) { this.consensusRegion = consensusRegion; }
    public void proxyConsensusRegion(final org.intermine.objectstore.proxy.ProxyReference consensusRegion) { this.consensusRegion = consensusRegion; }
    public org.intermine.model.InterMineObject proxGetConsensusRegion() { return consensusRegion; }

    // Col: org.intermine.model.bio.GeneFamily.genes
    protected java.util.Set<org.intermine.model.bio.Gene> genes = new java.util.HashSet<org.intermine.model.bio.Gene>();
    public java.util.Set<org.intermine.model.bio.Gene> getGenes() { return genes; }
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes) { this.genes = genes; }
    public void addGenes(final org.intermine.model.bio.Gene arg) { genes.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof GeneFamily && id != null) ? id.equals(((GeneFamily)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "GeneFamily [consensusRegion=" + (consensusRegion == null ? "null" : (consensusRegion.getId() == null ? "no id" : consensusRegion.getId().toString())) + ", description=" + (description == null ? "null" : "\"" + description + "\"") + ", id=" + id + ", primaryIdentifier=" + (primaryIdentifier == null ? "null" : "\"" + primaryIdentifier + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("consensusRegion".equals(fieldName)) {
            if (consensusRegion instanceof ProxyReference) {
                return ((ProxyReference) consensusRegion).getObject();
            } else {
                return consensusRegion;
            }
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GeneFamily.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("consensusRegion".equals(fieldName)) {
            return consensusRegion;
        }
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GeneFamily.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("description".equals(fieldName)) {
            description = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("consensusRegion".equals(fieldName)) {
            consensusRegion = (org.intermine.model.InterMineObject) value;
        } else if ("genes".equals(fieldName)) {
            genes = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.GeneFamily.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("description".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("consensusRegion".equals(fieldName)) {
            return org.intermine.model.bio.ConsensusRegion.class;
        }
        if ("genes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.GeneFamily.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.GeneFamily.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.GeneFamilyShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.GeneFamily");
        if (description != null) {
            sb.append("$_^adescription$_^");
            String string = description;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (primaryIdentifier != null) {
            sb.append("$_^aprimaryIdentifier$_^");
            String string = primaryIdentifier;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (consensusRegion != null) {
            sb.append("$_^rconsensusRegion$_^").append(consensusRegion.getId());
        }
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.GeneFamilyShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.GeneFamily)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "adescription".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                description = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aprimaryIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                primaryIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rconsensusRegion".equals(notXml[i])) {
                i++;
                consensusRegion = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.ConsensusRegion.class);
                i++;
            };
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        genes = new ProxyCollection<org.intermine.model.bio.Gene>(os, this, "genes", org.intermine.model.bio.Gene.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("genes".equals(fieldName)) {
            genes.add((org.intermine.model.bio.Gene) element);
        } else {
            if (!org.intermine.model.bio.GeneFamily.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("genes".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if (!org.intermine.model.bio.GeneFamily.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.GeneFamily.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
