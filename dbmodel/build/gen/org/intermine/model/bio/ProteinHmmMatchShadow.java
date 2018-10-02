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

public class ProteinHmmMatchShadow implements ProteinHmmMatch, ShadowClass
{
    public static final Class<ProteinHmmMatch> shadowOf = ProteinHmmMatch.class;
    // Ref: org.intermine.model.bio.ProteinHmmMatch.proteinDomain
    protected org.intermine.model.InterMineObject proteinDomain;
    public org.intermine.model.bio.ProteinDomain getProteinDomain() { if (proteinDomain instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.ProteinDomain) ((org.intermine.objectstore.proxy.ProxyReference) proteinDomain).getObject()); }; return (org.intermine.model.bio.ProteinDomain) proteinDomain; }
    public void setProteinDomain(final org.intermine.model.bio.ProteinDomain proteinDomain) { this.proteinDomain = proteinDomain; }
    public void proxyProteinDomain(final org.intermine.objectstore.proxy.ProxyReference proteinDomain) { this.proteinDomain = proteinDomain; }
    public org.intermine.model.InterMineObject proxGetProteinDomain() { return proteinDomain; }

    // Ref: org.intermine.model.bio.ProteinHmmMatch.proteinDomainLocation
    protected org.intermine.model.InterMineObject proteinDomainLocation;
    public org.intermine.model.bio.Location getProteinDomainLocation() { if (proteinDomainLocation instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Location) ((org.intermine.objectstore.proxy.ProxyReference) proteinDomainLocation).getObject()); }; return (org.intermine.model.bio.Location) proteinDomainLocation; }
    public void setProteinDomainLocation(final org.intermine.model.bio.Location proteinDomainLocation) { this.proteinDomainLocation = proteinDomainLocation; }
    public void proxyProteinDomainLocation(final org.intermine.objectstore.proxy.ProxyReference proteinDomainLocation) { this.proteinDomainLocation = proteinDomainLocation; }
    public org.intermine.model.InterMineObject proxGetProteinDomainLocation() { return proteinDomainLocation; }

    // Attr: org.intermine.model.bio.ProteinMatch.signatureDesc
    protected java.lang.String signatureDesc;
    public java.lang.String getSignatureDesc() { return signatureDesc; }
    public void setSignatureDesc(final java.lang.String signatureDesc) { this.signatureDesc = signatureDesc; }

    // Attr: org.intermine.model.bio.ProteinMatch.status
    protected java.lang.String status;
    public java.lang.String getStatus() { return status; }
    public void setStatus(final java.lang.String status) { this.status = status; }

    // Attr: org.intermine.model.bio.ProteinMatch.date
    protected java.lang.String date;
    public java.lang.String getDate() { return date; }
    public void setDate(final java.lang.String date) { this.date = date; }

    // Ref: org.intermine.model.bio.ProteinMatch.protein
    protected org.intermine.model.InterMineObject protein;
    public org.intermine.model.bio.Protein getProtein() { if (protein instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Protein) ((org.intermine.objectstore.proxy.ProxyReference) protein).getObject()); }; return (org.intermine.model.bio.Protein) protein; }
    public void setProtein(final org.intermine.model.bio.Protein protein) { this.protein = protein; }
    public void proxyProtein(final org.intermine.objectstore.proxy.ProxyReference protein) { this.protein = protein; }
    public org.intermine.model.InterMineObject proxGetProtein() { return protein; }

    // Ref: org.intermine.model.bio.ProteinMatch.sequenceOntologyTerm
    protected org.intermine.model.InterMineObject sequenceOntologyTerm;
    public org.intermine.model.bio.SOTerm getSequenceOntologyTerm() { if (sequenceOntologyTerm instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.SOTerm) ((org.intermine.objectstore.proxy.ProxyReference) sequenceOntologyTerm).getObject()); }; return (org.intermine.model.bio.SOTerm) sequenceOntologyTerm; }
    public void setSequenceOntologyTerm(final org.intermine.model.bio.SOTerm sequenceOntologyTerm) { this.sequenceOntologyTerm = sequenceOntologyTerm; }
    public void proxySequenceOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference sequenceOntologyTerm) { this.sequenceOntologyTerm = sequenceOntologyTerm; }
    public org.intermine.model.InterMineObject proxGetSequenceOntologyTerm() { return sequenceOntologyTerm; }

    // Ref: org.intermine.model.bio.ProteinMatch.proteinLocation
    protected org.intermine.model.InterMineObject proteinLocation;
    public org.intermine.model.bio.Location getProteinLocation() { if (proteinLocation instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Location) ((org.intermine.objectstore.proxy.ProxyReference) proteinLocation).getObject()); }; return (org.intermine.model.bio.Location) proteinLocation; }
    public void setProteinLocation(final org.intermine.model.bio.Location proteinLocation) { this.proteinLocation = proteinLocation; }
    public void proxyProteinLocation(final org.intermine.objectstore.proxy.ProxyReference proteinLocation) { this.proteinLocation = proteinLocation; }
    public org.intermine.model.InterMineObject proxGetProteinLocation() { return proteinLocation; }

    // Attr: org.intermine.model.bio.BioEntity.chadoUniqueName
    protected java.lang.String chadoUniqueName;
    public java.lang.String getChadoUniqueName() { return chadoUniqueName; }
    public void setChadoUniqueName(final java.lang.String chadoUniqueName) { this.chadoUniqueName = chadoUniqueName; }

    // Attr: org.intermine.model.bio.BioEntity.symbol
    protected java.lang.String symbol;
    public java.lang.String getSymbol() { return symbol; }
    public void setSymbol(final java.lang.String symbol) { this.symbol = symbol; }

    // Attr: org.intermine.model.bio.BioEntity.chadoFeatureId
    protected java.lang.Integer chadoFeatureId;
    public java.lang.Integer getChadoFeatureId() { return chadoFeatureId; }
    public void setChadoFeatureId(final java.lang.Integer chadoFeatureId) { this.chadoFeatureId = chadoFeatureId; }

    // Attr: org.intermine.model.bio.BioEntity.chadoName
    protected java.lang.String chadoName;
    public java.lang.String getChadoName() { return chadoName; }
    public void setChadoName(final java.lang.String chadoName) { this.chadoName = chadoName; }

    // Attr: org.intermine.model.bio.BioEntity.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.BioEntity.secondaryIdentifier
    protected java.lang.String secondaryIdentifier;
    public java.lang.String getSecondaryIdentifier() { return secondaryIdentifier; }
    public void setSecondaryIdentifier(final java.lang.String secondaryIdentifier) { this.secondaryIdentifier = secondaryIdentifier; }

    // Ref: org.intermine.model.bio.BioEntity.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.BioEntity.locations
    protected java.util.Set<org.intermine.model.bio.Location> locations = new java.util.HashSet<org.intermine.model.bio.Location>();
    public java.util.Set<org.intermine.model.bio.Location> getLocations() { return locations; }
    public void setLocations(final java.util.Set<org.intermine.model.bio.Location> locations) { this.locations = locations; }
    public void addLocations(final org.intermine.model.bio.Location arg) { locations.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.synonyms
    protected java.util.Set<org.intermine.model.bio.Synonym> synonyms = new java.util.HashSet<org.intermine.model.bio.Synonym>();
    public java.util.Set<org.intermine.model.bio.Synonym> getSynonyms() { return synonyms; }
    public void setSynonyms(final java.util.Set<org.intermine.model.bio.Synonym> synonyms) { this.synonyms = synonyms; }
    public void addSynonyms(final org.intermine.model.bio.Synonym arg) { synonyms.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.crossReferences
    protected java.util.Set<org.intermine.model.bio.CrossReference> crossReferences = new java.util.HashSet<org.intermine.model.bio.CrossReference>();
    public java.util.Set<org.intermine.model.bio.CrossReference> getCrossReferences() { return crossReferences; }
    public void setCrossReferences(final java.util.Set<org.intermine.model.bio.CrossReference> crossReferences) { this.crossReferences = crossReferences; }
    public void addCrossReferences(final org.intermine.model.bio.CrossReference arg) { crossReferences.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.locatedFeatures
    protected java.util.Set<org.intermine.model.bio.Location> locatedFeatures = new java.util.HashSet<org.intermine.model.bio.Location>();
    public java.util.Set<org.intermine.model.bio.Location> getLocatedFeatures() { return locatedFeatures; }
    public void setLocatedFeatures(final java.util.Set<org.intermine.model.bio.Location> locatedFeatures) { this.locatedFeatures = locatedFeatures; }
    public void addLocatedFeatures(final org.intermine.model.bio.Location arg) { locatedFeatures.add(arg); }

    // Attr: org.intermine.model.bio.Annotatable.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Col: org.intermine.model.bio.Annotatable.ontologyAnnotations
    protected java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations = new java.util.HashSet<org.intermine.model.bio.OntologyAnnotation>();
    public java.util.Set<org.intermine.model.bio.OntologyAnnotation> getOntologyAnnotations() { return ontologyAnnotations; }
    public void setOntologyAnnotations(final java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations) { this.ontologyAnnotations = ontologyAnnotations; }
    public void addOntologyAnnotations(final org.intermine.model.bio.OntologyAnnotation arg) { ontologyAnnotations.add(arg); }

    // Col: org.intermine.model.bio.Annotatable.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet<org.intermine.model.bio.Publication>();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof ProteinHmmMatch && id != null) ? id.equals(((ProteinHmmMatch)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "ProteinHmmMatch [chadoFeatureId=" + chadoFeatureId + ", chadoName=" + (chadoName == null ? "null" : "\"" + chadoName + "\"") + ", chadoUniqueName=" + (chadoUniqueName == null ? "null" : "\"" + chadoUniqueName + "\"") + ", date=" + (date == null ? "null" : "\"" + date + "\"") + ", id=" + id + ", name=" + (name == null ? "null" : "\"" + name + "\"") + ", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", primaryIdentifier=" + (primaryIdentifier == null ? "null" : "\"" + primaryIdentifier + "\"") + ", protein=" + (protein == null ? "null" : (protein.getId() == null ? "no id" : protein.getId().toString())) + ", proteinDomain=" + (proteinDomain == null ? "null" : (proteinDomain.getId() == null ? "no id" : proteinDomain.getId().toString())) + ", proteinDomainLocation=" + (proteinDomainLocation == null ? "null" : (proteinDomainLocation.getId() == null ? "no id" : proteinDomainLocation.getId().toString())) + ", proteinLocation=" + (proteinLocation == null ? "null" : (proteinLocation.getId() == null ? "no id" : proteinLocation.getId().toString())) + ", secondaryIdentifier=" + (secondaryIdentifier == null ? "null" : "\"" + secondaryIdentifier + "\"") + ", sequenceOntologyTerm=" + (sequenceOntologyTerm == null ? "null" : (sequenceOntologyTerm.getId() == null ? "no id" : sequenceOntologyTerm.getId().toString())) + ", signatureDesc=" + (signatureDesc == null ? "null" : "\"" + signatureDesc + "\"") + ", status=" + (status == null ? "null" : "\"" + status + "\"") + ", symbol=" + (symbol == null ? "null" : "\"" + symbol + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("proteinDomain".equals(fieldName)) {
            if (proteinDomain instanceof ProxyReference) {
                return ((ProxyReference) proteinDomain).getObject();
            } else {
                return proteinDomain;
            }
        }
        if ("proteinDomainLocation".equals(fieldName)) {
            if (proteinDomainLocation instanceof ProxyReference) {
                return ((ProxyReference) proteinDomainLocation).getObject();
            } else {
                return proteinDomainLocation;
            }
        }
        if ("signatureDesc".equals(fieldName)) {
            return signatureDesc;
        }
        if ("status".equals(fieldName)) {
            return status;
        }
        if ("date".equals(fieldName)) {
            return date;
        }
        if ("protein".equals(fieldName)) {
            if (protein instanceof ProxyReference) {
                return ((ProxyReference) protein).getObject();
            } else {
                return protein;
            }
        }
        if ("sequenceOntologyTerm".equals(fieldName)) {
            if (sequenceOntologyTerm instanceof ProxyReference) {
                return ((ProxyReference) sequenceOntologyTerm).getObject();
            } else {
                return sequenceOntologyTerm;
            }
        }
        if ("proteinLocation".equals(fieldName)) {
            if (proteinLocation instanceof ProxyReference) {
                return ((ProxyReference) proteinLocation).getObject();
            } else {
                return proteinLocation;
            }
        }
        if ("chadoUniqueName".equals(fieldName)) {
            return chadoUniqueName;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("chadoFeatureId".equals(fieldName)) {
            return chadoFeatureId;
        }
        if ("chadoName".equals(fieldName)) {
            return chadoName;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("locations".equals(fieldName)) {
            return locations;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("crossReferences".equals(fieldName)) {
            return crossReferences;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return locatedFeatures;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return ontologyAnnotations;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ProteinHmmMatch.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("proteinDomain".equals(fieldName)) {
            return proteinDomain;
        }
        if ("proteinDomainLocation".equals(fieldName)) {
            return proteinDomainLocation;
        }
        if ("signatureDesc".equals(fieldName)) {
            return signatureDesc;
        }
        if ("status".equals(fieldName)) {
            return status;
        }
        if ("date".equals(fieldName)) {
            return date;
        }
        if ("protein".equals(fieldName)) {
            return protein;
        }
        if ("sequenceOntologyTerm".equals(fieldName)) {
            return sequenceOntologyTerm;
        }
        if ("proteinLocation".equals(fieldName)) {
            return proteinLocation;
        }
        if ("chadoUniqueName".equals(fieldName)) {
            return chadoUniqueName;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("chadoFeatureId".equals(fieldName)) {
            return chadoFeatureId;
        }
        if ("chadoName".equals(fieldName)) {
            return chadoName;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("locations".equals(fieldName)) {
            return locations;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("crossReferences".equals(fieldName)) {
            return crossReferences;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return locatedFeatures;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return ontologyAnnotations;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ProteinHmmMatch.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("proteinDomain".equals(fieldName)) {
            proteinDomain = (org.intermine.model.InterMineObject) value;
        } else if ("proteinDomainLocation".equals(fieldName)) {
            proteinDomainLocation = (org.intermine.model.InterMineObject) value;
        } else if ("signatureDesc".equals(fieldName)) {
            signatureDesc = (java.lang.String) value;
        } else if ("status".equals(fieldName)) {
            status = (java.lang.String) value;
        } else if ("date".equals(fieldName)) {
            date = (java.lang.String) value;
        } else if ("protein".equals(fieldName)) {
            protein = (org.intermine.model.InterMineObject) value;
        } else if ("sequenceOntologyTerm".equals(fieldName)) {
            sequenceOntologyTerm = (org.intermine.model.InterMineObject) value;
        } else if ("proteinLocation".equals(fieldName)) {
            proteinLocation = (org.intermine.model.InterMineObject) value;
        } else if ("chadoUniqueName".equals(fieldName)) {
            chadoUniqueName = (java.lang.String) value;
        } else if ("symbol".equals(fieldName)) {
            symbol = (java.lang.String) value;
        } else if ("chadoFeatureId".equals(fieldName)) {
            chadoFeatureId = (java.lang.Integer) value;
        } else if ("chadoName".equals(fieldName)) {
            chadoName = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("secondaryIdentifier".equals(fieldName)) {
            secondaryIdentifier = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("locations".equals(fieldName)) {
            locations = (java.util.Set) value;
        } else if ("synonyms".equals(fieldName)) {
            synonyms = (java.util.Set) value;
        } else if ("crossReferences".equals(fieldName)) {
            crossReferences = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("locatedFeatures".equals(fieldName)) {
            locatedFeatures = (java.util.Set) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations = (java.util.Set) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ProteinHmmMatch.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("proteinDomain".equals(fieldName)) {
            return org.intermine.model.bio.ProteinDomain.class;
        }
        if ("proteinDomainLocation".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("signatureDesc".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("status".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("date".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("protein".equals(fieldName)) {
            return org.intermine.model.bio.Protein.class;
        }
        if ("sequenceOntologyTerm".equals(fieldName)) {
            return org.intermine.model.bio.SOTerm.class;
        }
        if ("proteinLocation".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("chadoUniqueName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("symbol".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("chadoFeatureId".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("chadoName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("locations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("synonyms".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("crossReferences".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.ProteinHmmMatch.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ProteinHmmMatch.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ProteinHmmMatchShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ProteinHmmMatch");
        if (proteinDomain != null) {
            sb.append("$_^rproteinDomain$_^").append(proteinDomain.getId());
        }
        if (proteinDomainLocation != null) {
            sb.append("$_^rproteinDomainLocation$_^").append(proteinDomainLocation.getId());
        }
        if (signatureDesc != null) {
            sb.append("$_^asignatureDesc$_^");
            String string = signatureDesc;
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
        if (status != null) {
            sb.append("$_^astatus$_^");
            String string = status;
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
        if (date != null) {
            sb.append("$_^adate$_^");
            String string = date;
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
        if (protein != null) {
            sb.append("$_^rprotein$_^").append(protein.getId());
        }
        if (sequenceOntologyTerm != null) {
            sb.append("$_^rsequenceOntologyTerm$_^").append(sequenceOntologyTerm.getId());
        }
        if (proteinLocation != null) {
            sb.append("$_^rproteinLocation$_^").append(proteinLocation.getId());
        }
        if (chadoUniqueName != null) {
            sb.append("$_^achadoUniqueName$_^");
            String string = chadoUniqueName;
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
        if (symbol != null) {
            sb.append("$_^asymbol$_^");
            String string = symbol;
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
        if (chadoFeatureId != null) {
            sb.append("$_^achadoFeatureId$_^").append(chadoFeatureId);
        }
        if (chadoName != null) {
            sb.append("$_^achadoName$_^");
            String string = chadoName;
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
        if (name != null) {
            sb.append("$_^aname$_^");
            String string = name;
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
        if (secondaryIdentifier != null) {
            sb.append("$_^asecondaryIdentifier$_^");
            String string = secondaryIdentifier;
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
        if (organism != null) {
            sb.append("$_^rorganism$_^").append(organism.getId());
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
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.ProteinHmmMatchShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ProteinHmmMatch)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) &&"rproteinDomain".equals(notXml[i])) {
                i++;
                proteinDomain = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.ProteinDomain.class);
                i++;
            };
            if ((i < notXml.length) &&"rproteinDomainLocation".equals(notXml[i])) {
                i++;
                proteinDomainLocation = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Location.class);
                i++;
            };
            if ((i < notXml.length) && "asignatureDesc".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                signatureDesc = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "astatus".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                status = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "adate".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                date = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rprotein".equals(notXml[i])) {
                i++;
                protein = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Protein.class);
                i++;
            };
            if ((i < notXml.length) &&"rsequenceOntologyTerm".equals(notXml[i])) {
                i++;
                sequenceOntologyTerm = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.SOTerm.class);
                i++;
            };
            if ((i < notXml.length) &&"rproteinLocation".equals(notXml[i])) {
                i++;
                proteinLocation = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Location.class);
                i++;
            };
            if ((i < notXml.length) && "achadoUniqueName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                chadoUniqueName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asymbol".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                symbol = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "achadoFeatureId".equals(notXml[i])) {
                i++;
                chadoFeatureId = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "achadoName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                chadoName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aname".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                name = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asecondaryIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                secondaryIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rorganism".equals(notXml[i])) {
                i++;
                organism = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Organism.class);
                i++;
            };
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
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        locations = new ProxyCollection<org.intermine.model.bio.Location>(os, this, "locations", org.intermine.model.bio.Location.class);
        synonyms = new ProxyCollection<org.intermine.model.bio.Synonym>(os, this, "synonyms", org.intermine.model.bio.Synonym.class);
        crossReferences = new ProxyCollection<org.intermine.model.bio.CrossReference>(os, this, "crossReferences", org.intermine.model.bio.CrossReference.class);
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
        locatedFeatures = new ProxyCollection<org.intermine.model.bio.Location>(os, this, "locatedFeatures", org.intermine.model.bio.Location.class);
        ontologyAnnotations = new ProxyCollection<org.intermine.model.bio.OntologyAnnotation>(os, this, "ontologyAnnotations", org.intermine.model.bio.OntologyAnnotation.class);
        publications = new ProxyCollection<org.intermine.model.bio.Publication>(os, this, "publications", org.intermine.model.bio.Publication.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("locations".equals(fieldName)) {
            locations.add((org.intermine.model.bio.Location) element);
        } else if ("synonyms".equals(fieldName)) {
            synonyms.add((org.intermine.model.bio.Synonym) element);
        } else if ("crossReferences".equals(fieldName)) {
            crossReferences.add((org.intermine.model.bio.CrossReference) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else if ("locatedFeatures".equals(fieldName)) {
            locatedFeatures.add((org.intermine.model.bio.Location) element);
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations.add((org.intermine.model.bio.OntologyAnnotation) element);
        } else if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else {
            if (!org.intermine.model.bio.ProteinHmmMatch.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("locations".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("synonyms".equals(fieldName)) {
            return org.intermine.model.bio.Synonym.class;
        }
        if ("crossReferences".equals(fieldName)) {
            return org.intermine.model.bio.CrossReference.class;
        }
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return org.intermine.model.bio.OntologyAnnotation.class;
        }
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if (!org.intermine.model.bio.ProteinHmmMatch.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ProteinHmmMatch.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
