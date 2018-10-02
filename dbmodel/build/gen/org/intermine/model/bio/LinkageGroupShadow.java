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

public class LinkageGroupShadow implements LinkageGroup, ShadowClass
{
    public static final Class<LinkageGroup> shadowOf = LinkageGroup.class;
    // Attr: org.intermine.model.bio.LinkageGroup.chadoUniqueName
    protected java.lang.String chadoUniqueName;
    public java.lang.String getChadoUniqueName() { return chadoUniqueName; }
    public void setChadoUniqueName(final java.lang.String chadoUniqueName) { this.chadoUniqueName = chadoUniqueName; }

    // Attr: org.intermine.model.bio.LinkageGroup.chadoFeatureId
    protected java.lang.Integer chadoFeatureId;
    public java.lang.Integer getChadoFeatureId() { return chadoFeatureId; }
    public void setChadoFeatureId(final java.lang.Integer chadoFeatureId) { this.chadoFeatureId = chadoFeatureId; }

    // Attr: org.intermine.model.bio.LinkageGroup.chadoName
    protected java.lang.String chadoName;
    public java.lang.String getChadoName() { return chadoName; }
    public void setChadoName(final java.lang.String chadoName) { this.chadoName = chadoName; }

    // Attr: org.intermine.model.bio.LinkageGroup.length
    protected java.lang.Double length;
    public java.lang.Double getLength() { return length; }
    public void setLength(final java.lang.Double length) { this.length = length; }

    // Attr: org.intermine.model.bio.LinkageGroup.assignedLinkageGroup
    protected java.lang.String assignedLinkageGroup;
    public java.lang.String getAssignedLinkageGroup() { return assignedLinkageGroup; }
    public void setAssignedLinkageGroup(final java.lang.String assignedLinkageGroup) { this.assignedLinkageGroup = assignedLinkageGroup; }

    // Attr: org.intermine.model.bio.LinkageGroup.secondaryIdentifier
    protected java.lang.String secondaryIdentifier;
    public java.lang.String getSecondaryIdentifier() { return secondaryIdentifier; }
    public void setSecondaryIdentifier(final java.lang.String secondaryIdentifier) { this.secondaryIdentifier = secondaryIdentifier; }

    // Attr: org.intermine.model.bio.LinkageGroup.number
    protected java.lang.Integer number;
    public java.lang.Integer getNumber() { return number; }
    public void setNumber(final java.lang.Integer number) { this.number = number; }

    // Ref: org.intermine.model.bio.LinkageGroup.geneticMap
    protected org.intermine.model.InterMineObject geneticMap;
    public org.intermine.model.bio.GeneticMap getGeneticMap() { if (geneticMap instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.GeneticMap) ((org.intermine.objectstore.proxy.ProxyReference) geneticMap).getObject()); }; return (org.intermine.model.bio.GeneticMap) geneticMap; }
    public void setGeneticMap(final org.intermine.model.bio.GeneticMap geneticMap) { this.geneticMap = geneticMap; }
    public void proxyGeneticMap(final org.intermine.objectstore.proxy.ProxyReference geneticMap) { this.geneticMap = geneticMap; }
    public org.intermine.model.InterMineObject proxGetGeneticMap() { return geneticMap; }

    // Col: org.intermine.model.bio.LinkageGroup.QTLs
    protected java.util.Set<org.intermine.model.bio.QTL> QTLs = new java.util.HashSet<org.intermine.model.bio.QTL>();
    public java.util.Set<org.intermine.model.bio.QTL> getqTLs() { return QTLs; }
    public void setqTLs(final java.util.Set<org.intermine.model.bio.QTL> QTLs) { this.QTLs = QTLs; }
    public void addqTLs(final org.intermine.model.bio.QTL arg) { QTLs.add(arg); }

    // Col: org.intermine.model.bio.LinkageGroup.markers
    protected java.util.Set<org.intermine.model.bio.GeneticMarker> markers = new java.util.HashSet<org.intermine.model.bio.GeneticMarker>();
    public java.util.Set<org.intermine.model.bio.GeneticMarker> getMarkers() { return markers; }
    public void setMarkers(final java.util.Set<org.intermine.model.bio.GeneticMarker> markers) { this.markers = markers; }
    public void addMarkers(final org.intermine.model.bio.GeneticMarker arg) { markers.add(arg); }

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

    @Override public boolean equals(Object o) { return (o instanceof LinkageGroup && id != null) ? id.equals(((LinkageGroup)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "LinkageGroup [assignedLinkageGroup=" + (assignedLinkageGroup == null ? "null" : "\"" + assignedLinkageGroup + "\"") + ", chadoFeatureId=" + chadoFeatureId + ", chadoName=" + (chadoName == null ? "null" : "\"" + chadoName + "\"") + ", chadoUniqueName=" + (chadoUniqueName == null ? "null" : "\"" + chadoUniqueName + "\"") + ", geneticMap=" + (geneticMap == null ? "null" : (geneticMap.getId() == null ? "no id" : geneticMap.getId().toString())) + ", id=" + id + ", length=" + length + ", number=" + number + ", primaryIdentifier=" + (primaryIdentifier == null ? "null" : "\"" + primaryIdentifier + "\"") + ", secondaryIdentifier=" + (secondaryIdentifier == null ? "null" : "\"" + secondaryIdentifier + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("chadoUniqueName".equals(fieldName)) {
            return chadoUniqueName;
        }
        if ("chadoFeatureId".equals(fieldName)) {
            return chadoFeatureId;
        }
        if ("chadoName".equals(fieldName)) {
            return chadoName;
        }
        if ("length".equals(fieldName)) {
            return length;
        }
        if ("assignedLinkageGroup".equals(fieldName)) {
            return assignedLinkageGroup;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("number".equals(fieldName)) {
            return number;
        }
        if ("geneticMap".equals(fieldName)) {
            if (geneticMap instanceof ProxyReference) {
                return ((ProxyReference) geneticMap).getObject();
            } else {
                return geneticMap;
            }
        }
        if ("QTLs".equals(fieldName)) {
            return QTLs;
        }
        if ("markers".equals(fieldName)) {
            return markers;
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
        if (!org.intermine.model.bio.LinkageGroup.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("chadoUniqueName".equals(fieldName)) {
            return chadoUniqueName;
        }
        if ("chadoFeatureId".equals(fieldName)) {
            return chadoFeatureId;
        }
        if ("chadoName".equals(fieldName)) {
            return chadoName;
        }
        if ("length".equals(fieldName)) {
            return length;
        }
        if ("assignedLinkageGroup".equals(fieldName)) {
            return assignedLinkageGroup;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("number".equals(fieldName)) {
            return number;
        }
        if ("geneticMap".equals(fieldName)) {
            return geneticMap;
        }
        if ("QTLs".equals(fieldName)) {
            return QTLs;
        }
        if ("markers".equals(fieldName)) {
            return markers;
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
        if (!org.intermine.model.bio.LinkageGroup.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("chadoUniqueName".equals(fieldName)) {
            chadoUniqueName = (java.lang.String) value;
        } else if ("chadoFeatureId".equals(fieldName)) {
            chadoFeatureId = (java.lang.Integer) value;
        } else if ("chadoName".equals(fieldName)) {
            chadoName = (java.lang.String) value;
        } else if ("length".equals(fieldName)) {
            length = (java.lang.Double) value;
        } else if ("assignedLinkageGroup".equals(fieldName)) {
            assignedLinkageGroup = (java.lang.String) value;
        } else if ("secondaryIdentifier".equals(fieldName)) {
            secondaryIdentifier = (java.lang.String) value;
        } else if ("number".equals(fieldName)) {
            number = (java.lang.Integer) value;
        } else if ("geneticMap".equals(fieldName)) {
            geneticMap = (org.intermine.model.InterMineObject) value;
        } else if ("QTLs".equals(fieldName)) {
            QTLs = (java.util.Set) value;
        } else if ("markers".equals(fieldName)) {
            markers = (java.util.Set) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations = (java.util.Set) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.LinkageGroup.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("chadoUniqueName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("chadoFeatureId".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("chadoName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("length".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("assignedLinkageGroup".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("number".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("geneticMap".equals(fieldName)) {
            return org.intermine.model.bio.GeneticMap.class;
        }
        if ("QTLs".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("markers".equals(fieldName)) {
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
        if (!org.intermine.model.bio.LinkageGroup.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.LinkageGroup.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.LinkageGroupShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.LinkageGroup");
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
        if (length != null) {
            sb.append("$_^alength$_^").append(length);
        }
        if (assignedLinkageGroup != null) {
            sb.append("$_^aassignedLinkageGroup$_^");
            String string = assignedLinkageGroup;
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
        if (number != null) {
            sb.append("$_^anumber$_^").append(number);
        }
        if (geneticMap != null) {
            sb.append("$_^rgeneticMap$_^").append(geneticMap.getId());
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
        if (!org.intermine.model.bio.LinkageGroupShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.LinkageGroup)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
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
            if ((i < notXml.length) && "alength".equals(notXml[i])) {
                i++;
                length = Double.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aassignedLinkageGroup".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                assignedLinkageGroup = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "anumber".equals(notXml[i])) {
                i++;
                number = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rgeneticMap".equals(notXml[i])) {
                i++;
                geneticMap = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.GeneticMap.class);
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
        QTLs = new ProxyCollection<org.intermine.model.bio.QTL>(os, this, "QTLs", org.intermine.model.bio.QTL.class);
        markers = new ProxyCollection<org.intermine.model.bio.GeneticMarker>(os, this, "markers", org.intermine.model.bio.GeneticMarker.class);
        ontologyAnnotations = new ProxyCollection<org.intermine.model.bio.OntologyAnnotation>(os, this, "ontologyAnnotations", org.intermine.model.bio.OntologyAnnotation.class);
        publications = new ProxyCollection<org.intermine.model.bio.Publication>(os, this, "publications", org.intermine.model.bio.Publication.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("QTLs".equals(fieldName)) {
            QTLs.add((org.intermine.model.bio.QTL) element);
        } else if ("markers".equals(fieldName)) {
            markers.add((org.intermine.model.bio.GeneticMarker) element);
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations.add((org.intermine.model.bio.OntologyAnnotation) element);
        } else if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else {
            if (!org.intermine.model.bio.LinkageGroup.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("QTLs".equals(fieldName)) {
            return org.intermine.model.bio.QTL.class;
        }
        if ("markers".equals(fieldName)) {
            return org.intermine.model.bio.GeneticMarker.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return org.intermine.model.bio.OntologyAnnotation.class;
        }
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if (!org.intermine.model.bio.LinkageGroup.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.LinkageGroup.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
