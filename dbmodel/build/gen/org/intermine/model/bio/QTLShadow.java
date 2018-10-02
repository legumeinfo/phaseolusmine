package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class QTLShadow implements QTL, ShadowClass
{
    public static final Class<QTL> shadowOf = QTL.class;
    // Attr: org.intermine.model.bio.QTL.traitDescription
    protected java.lang.String traitDescription;
    public java.lang.String getTraitDescription() { return traitDescription; }
    public void setTraitDescription(final java.lang.String traitDescription) { this.traitDescription = traitDescription; }

    // Attr: org.intermine.model.bio.QTL.favorableAlleleSource
    protected java.lang.String favorableAlleleSource;
    public java.lang.String getFavorableAlleleSource() { return favorableAlleleSource; }
    public void setFavorableAlleleSource(final java.lang.String favorableAlleleSource) { this.favorableAlleleSource = favorableAlleleSource; }

    // Attr: org.intermine.model.bio.QTL.chadoUniqueName
    protected java.lang.String chadoUniqueName;
    public java.lang.String getChadoUniqueName() { return chadoUniqueName; }
    public void setChadoUniqueName(final java.lang.String chadoUniqueName) { this.chadoUniqueName = chadoUniqueName; }

    // Attr: org.intermine.model.bio.QTL.description
    protected java.lang.String description;
    public java.lang.String getDescription() { return description; }
    public void setDescription(final java.lang.String description) { this.description = description; }

    // Attr: org.intermine.model.bio.QTL.traitName
    protected java.lang.String traitName;
    public java.lang.String getTraitName() { return traitName; }
    public void setTraitName(final java.lang.String traitName) { this.traitName = traitName; }

    // Attr: org.intermine.model.bio.QTL.traitUnit
    protected java.lang.String traitUnit;
    public java.lang.String getTraitUnit() { return traitUnit; }
    public void setTraitUnit(final java.lang.String traitUnit) { this.traitUnit = traitUnit; }

    // Attr: org.intermine.model.bio.QTL.identifier
    protected java.lang.String identifier;
    public java.lang.String getIdentifier() { return identifier; }
    public void setIdentifier(final java.lang.String identifier) { this.identifier = identifier; }

    // Attr: org.intermine.model.bio.QTL.chadoFeatureId
    protected java.lang.Integer chadoFeatureId;
    public java.lang.Integer getChadoFeatureId() { return chadoFeatureId; }
    public void setChadoFeatureId(final java.lang.Integer chadoFeatureId) { this.chadoFeatureId = chadoFeatureId; }

    // Attr: org.intermine.model.bio.QTL.chadoName
    protected java.lang.String chadoName;
    public java.lang.String getChadoName() { return chadoName; }
    public void setChadoName(final java.lang.String chadoName) { this.chadoName = chadoName; }

    // Attr: org.intermine.model.bio.QTL.analysisMethod
    protected java.lang.String analysisMethod;
    public java.lang.String getAnalysisMethod() { return analysisMethod; }
    public void setAnalysisMethod(final java.lang.String analysisMethod) { this.analysisMethod = analysisMethod; }

    // Attr: org.intermine.model.bio.QTL.secondaryIdentifier
    protected java.lang.String secondaryIdentifier;
    public java.lang.String getSecondaryIdentifier() { return secondaryIdentifier; }
    public void setSecondaryIdentifier(final java.lang.String secondaryIdentifier) { this.secondaryIdentifier = secondaryIdentifier; }

    // Attr: org.intermine.model.bio.QTL.publicationLinkageGroup
    protected java.lang.String publicationLinkageGroup;
    public java.lang.String getPublicationLinkageGroup() { return publicationLinkageGroup; }
    public void setPublicationLinkageGroup(final java.lang.String publicationLinkageGroup) { this.publicationLinkageGroup = publicationLinkageGroup; }

    // Attr: org.intermine.model.bio.QTL.studyTreatment
    protected java.lang.String studyTreatment;
    public java.lang.String getStudyTreatment() { return studyTreatment; }
    public void setStudyTreatment(final java.lang.String studyTreatment) { this.studyTreatment = studyTreatment; }

    // Attr: org.intermine.model.bio.QTL.peak
    protected java.lang.Double peak;
    public java.lang.Double getPeak() { return peak; }
    public void setPeak(final java.lang.Double peak) { this.peak = peak; }

    // Col: org.intermine.model.bio.QTL.markers
    protected java.util.Set<org.intermine.model.bio.GeneticMarker> markers = new java.util.HashSet<org.intermine.model.bio.GeneticMarker>();
    public java.util.Set<org.intermine.model.bio.GeneticMarker> getMarkers() { return markers; }
    public void setMarkers(final java.util.Set<org.intermine.model.bio.GeneticMarker> markers) { this.markers = markers; }
    public void addMarkers(final org.intermine.model.bio.GeneticMarker arg) { markers.add(arg); }

    // Col: org.intermine.model.bio.QTL.spannedGenes
    protected java.util.Set<org.intermine.model.bio.Gene> spannedGenes = new java.util.HashSet<org.intermine.model.bio.Gene>();
    public java.util.Set<org.intermine.model.bio.Gene> getSpannedGenes() { return spannedGenes; }
    public void setSpannedGenes(final java.util.Set<org.intermine.model.bio.Gene> spannedGenes) { this.spannedGenes = spannedGenes; }
    public void addSpannedGenes(final org.intermine.model.bio.Gene arg) { spannedGenes.add(arg); }

    // Col: org.intermine.model.bio.QTL.linkageGroupRanges
    protected java.util.Set<org.intermine.model.bio.LinkageGroupRange> linkageGroupRanges = new java.util.HashSet<org.intermine.model.bio.LinkageGroupRange>();
    public java.util.Set<org.intermine.model.bio.LinkageGroupRange> getLinkageGroupRanges() { return linkageGroupRanges; }
    public void setLinkageGroupRanges(final java.util.Set<org.intermine.model.bio.LinkageGroupRange> linkageGroupRanges) { this.linkageGroupRanges = linkageGroupRanges; }
    public void addLinkageGroupRanges(final org.intermine.model.bio.LinkageGroupRange arg) { linkageGroupRanges.add(arg); }

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

    @Override public boolean equals(Object o) { return (o instanceof QTL && id != null) ? id.equals(((QTL)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "QTL [analysisMethod=" + (analysisMethod == null ? "null" : "\"" + analysisMethod + "\"") + ", chadoFeatureId=" + chadoFeatureId + ", chadoName=" + (chadoName == null ? "null" : "\"" + chadoName + "\"") + ", chadoUniqueName=" + (chadoUniqueName == null ? "null" : "\"" + chadoUniqueName + "\"") + ", description=" + (description == null ? "null" : "\"" + description + "\"") + ", favorableAlleleSource=" + (favorableAlleleSource == null ? "null" : "\"" + favorableAlleleSource + "\"") + ", id=" + id + ", identifier=" + (identifier == null ? "null" : "\"" + identifier + "\"") + ", peak=" + peak + ", primaryIdentifier=" + (primaryIdentifier == null ? "null" : "\"" + primaryIdentifier + "\"") + ", publicationLinkageGroup=" + (publicationLinkageGroup == null ? "null" : "\"" + publicationLinkageGroup + "\"") + ", secondaryIdentifier=" + (secondaryIdentifier == null ? "null" : "\"" + secondaryIdentifier + "\"") + ", studyTreatment=" + (studyTreatment == null ? "null" : "\"" + studyTreatment + "\"") + ", traitDescription=" + (traitDescription == null ? "null" : "\"" + traitDescription + "\"") + ", traitName=" + (traitName == null ? "null" : "\"" + traitName + "\"") + ", traitUnit=" + (traitUnit == null ? "null" : "\"" + traitUnit + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("traitDescription".equals(fieldName)) {
            return traitDescription;
        }
        if ("favorableAlleleSource".equals(fieldName)) {
            return favorableAlleleSource;
        }
        if ("chadoUniqueName".equals(fieldName)) {
            return chadoUniqueName;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("traitName".equals(fieldName)) {
            return traitName;
        }
        if ("traitUnit".equals(fieldName)) {
            return traitUnit;
        }
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("chadoFeatureId".equals(fieldName)) {
            return chadoFeatureId;
        }
        if ("chadoName".equals(fieldName)) {
            return chadoName;
        }
        if ("analysisMethod".equals(fieldName)) {
            return analysisMethod;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("publicationLinkageGroup".equals(fieldName)) {
            return publicationLinkageGroup;
        }
        if ("studyTreatment".equals(fieldName)) {
            return studyTreatment;
        }
        if ("peak".equals(fieldName)) {
            return peak;
        }
        if ("markers".equals(fieldName)) {
            return markers;
        }
        if ("spannedGenes".equals(fieldName)) {
            return spannedGenes;
        }
        if ("linkageGroupRanges".equals(fieldName)) {
            return linkageGroupRanges;
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
        if (!org.intermine.model.bio.QTL.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("traitDescription".equals(fieldName)) {
            return traitDescription;
        }
        if ("favorableAlleleSource".equals(fieldName)) {
            return favorableAlleleSource;
        }
        if ("chadoUniqueName".equals(fieldName)) {
            return chadoUniqueName;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("traitName".equals(fieldName)) {
            return traitName;
        }
        if ("traitUnit".equals(fieldName)) {
            return traitUnit;
        }
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("chadoFeatureId".equals(fieldName)) {
            return chadoFeatureId;
        }
        if ("chadoName".equals(fieldName)) {
            return chadoName;
        }
        if ("analysisMethod".equals(fieldName)) {
            return analysisMethod;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("publicationLinkageGroup".equals(fieldName)) {
            return publicationLinkageGroup;
        }
        if ("studyTreatment".equals(fieldName)) {
            return studyTreatment;
        }
        if ("peak".equals(fieldName)) {
            return peak;
        }
        if ("markers".equals(fieldName)) {
            return markers;
        }
        if ("spannedGenes".equals(fieldName)) {
            return spannedGenes;
        }
        if ("linkageGroupRanges".equals(fieldName)) {
            return linkageGroupRanges;
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
        if (!org.intermine.model.bio.QTL.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("traitDescription".equals(fieldName)) {
            traitDescription = (java.lang.String) value;
        } else if ("favorableAlleleSource".equals(fieldName)) {
            favorableAlleleSource = (java.lang.String) value;
        } else if ("chadoUniqueName".equals(fieldName)) {
            chadoUniqueName = (java.lang.String) value;
        } else if ("description".equals(fieldName)) {
            description = (java.lang.String) value;
        } else if ("traitName".equals(fieldName)) {
            traitName = (java.lang.String) value;
        } else if ("traitUnit".equals(fieldName)) {
            traitUnit = (java.lang.String) value;
        } else if ("identifier".equals(fieldName)) {
            identifier = (java.lang.String) value;
        } else if ("chadoFeatureId".equals(fieldName)) {
            chadoFeatureId = (java.lang.Integer) value;
        } else if ("chadoName".equals(fieldName)) {
            chadoName = (java.lang.String) value;
        } else if ("analysisMethod".equals(fieldName)) {
            analysisMethod = (java.lang.String) value;
        } else if ("secondaryIdentifier".equals(fieldName)) {
            secondaryIdentifier = (java.lang.String) value;
        } else if ("publicationLinkageGroup".equals(fieldName)) {
            publicationLinkageGroup = (java.lang.String) value;
        } else if ("studyTreatment".equals(fieldName)) {
            studyTreatment = (java.lang.String) value;
        } else if ("peak".equals(fieldName)) {
            peak = (java.lang.Double) value;
        } else if ("markers".equals(fieldName)) {
            markers = (java.util.Set) value;
        } else if ("spannedGenes".equals(fieldName)) {
            spannedGenes = (java.util.Set) value;
        } else if ("linkageGroupRanges".equals(fieldName)) {
            linkageGroupRanges = (java.util.Set) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations = (java.util.Set) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.QTL.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("traitDescription".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("favorableAlleleSource".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("chadoUniqueName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("description".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("traitName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("traitUnit".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("identifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("chadoFeatureId".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("chadoName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("analysisMethod".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("publicationLinkageGroup".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("studyTreatment".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("peak".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("markers".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("spannedGenes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("linkageGroupRanges".equals(fieldName)) {
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
        if (!org.intermine.model.bio.QTL.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.QTL.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.QTLShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.QTL");
        if (traitDescription != null) {
            sb.append("$_^atraitDescription$_^");
            String string = traitDescription;
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
        if (favorableAlleleSource != null) {
            sb.append("$_^afavorableAlleleSource$_^");
            String string = favorableAlleleSource;
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
        if (traitName != null) {
            sb.append("$_^atraitName$_^");
            String string = traitName;
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
        if (traitUnit != null) {
            sb.append("$_^atraitUnit$_^");
            String string = traitUnit;
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
        if (identifier != null) {
            sb.append("$_^aidentifier$_^");
            String string = identifier;
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
        if (analysisMethod != null) {
            sb.append("$_^aanalysisMethod$_^");
            String string = analysisMethod;
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
        if (publicationLinkageGroup != null) {
            sb.append("$_^apublicationLinkageGroup$_^");
            String string = publicationLinkageGroup;
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
        if (studyTreatment != null) {
            sb.append("$_^astudyTreatment$_^");
            String string = studyTreatment;
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
        if (peak != null) {
            sb.append("$_^apeak$_^").append(peak);
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
        if (!org.intermine.model.bio.QTLShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.QTL)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "atraitDescription".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                traitDescription = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "afavorableAlleleSource".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                favorableAlleleSource = string == null ? notXml[i] : string.toString();
                i++;
            }
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
            if ((i < notXml.length) && "atraitName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                traitName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atraitUnit".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                traitUnit = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aidentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                identifier = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "aanalysisMethod".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                analysisMethod = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "apublicationLinkageGroup".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                publicationLinkageGroup = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "astudyTreatment".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                studyTreatment = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "apeak".equals(notXml[i])) {
                i++;
                peak = Double.valueOf(notXml[i]);
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
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        markers = new ProxyCollection<org.intermine.model.bio.GeneticMarker>(os, this, "markers", org.intermine.model.bio.GeneticMarker.class);
        spannedGenes = new ProxyCollection<org.intermine.model.bio.Gene>(os, this, "spannedGenes", org.intermine.model.bio.Gene.class);
        linkageGroupRanges = new ProxyCollection<org.intermine.model.bio.LinkageGroupRange>(os, this, "linkageGroupRanges", org.intermine.model.bio.LinkageGroupRange.class);
        ontologyAnnotations = new ProxyCollection<org.intermine.model.bio.OntologyAnnotation>(os, this, "ontologyAnnotations", org.intermine.model.bio.OntologyAnnotation.class);
        publications = new ProxyCollection<org.intermine.model.bio.Publication>(os, this, "publications", org.intermine.model.bio.Publication.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("markers".equals(fieldName)) {
            markers.add((org.intermine.model.bio.GeneticMarker) element);
        } else if ("spannedGenes".equals(fieldName)) {
            spannedGenes.add((org.intermine.model.bio.Gene) element);
        } else if ("linkageGroupRanges".equals(fieldName)) {
            linkageGroupRanges.add((org.intermine.model.bio.LinkageGroupRange) element);
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations.add((org.intermine.model.bio.OntologyAnnotation) element);
        } else if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else {
            if (!org.intermine.model.bio.QTL.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("markers".equals(fieldName)) {
            return org.intermine.model.bio.GeneticMarker.class;
        }
        if ("spannedGenes".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("linkageGroupRanges".equals(fieldName)) {
            return org.intermine.model.bio.LinkageGroupRange.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return org.intermine.model.bio.OntologyAnnotation.class;
        }
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if (!org.intermine.model.bio.QTL.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.QTL.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
