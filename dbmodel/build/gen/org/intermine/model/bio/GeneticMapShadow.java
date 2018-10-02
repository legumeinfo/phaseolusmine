package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class GeneticMapShadow implements GeneticMap, ShadowClass
{
    public static final Class<GeneticMap> shadowOf = GeneticMap.class;
    // Attr: org.intermine.model.bio.GeneticMap.description
    protected java.lang.String description;
    public java.lang.String getDescription() { return description; }
    public void setDescription(final java.lang.String description) { this.description = description; }

    // Attr: org.intermine.model.bio.GeneticMap.unit
    protected java.lang.String unit;
    public java.lang.String getUnit() { return unit; }
    public void setUnit(final java.lang.String unit) { this.unit = unit; }

    // Col: org.intermine.model.bio.GeneticMap.linkageGroups
    protected java.util.Set<org.intermine.model.bio.LinkageGroup> linkageGroups = new java.util.HashSet<org.intermine.model.bio.LinkageGroup>();
    public java.util.Set<org.intermine.model.bio.LinkageGroup> getLinkageGroups() { return linkageGroups; }
    public void setLinkageGroups(final java.util.Set<org.intermine.model.bio.LinkageGroup> linkageGroups) { this.linkageGroups = linkageGroups; }
    public void addLinkageGroups(final org.intermine.model.bio.LinkageGroup arg) { linkageGroups.add(arg); }

    // Col: org.intermine.model.bio.GeneticMap.markers
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

    @Override public boolean equals(Object o) { return (o instanceof GeneticMap && id != null) ? id.equals(((GeneticMap)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "GeneticMap [description=" + (description == null ? "null" : "\"" + description + "\"") + ", id=" + id + ", primaryIdentifier=" + (primaryIdentifier == null ? "null" : "\"" + primaryIdentifier + "\"") + ", unit=" + (unit == null ? "null" : "\"" + unit + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("unit".equals(fieldName)) {
            return unit;
        }
        if ("linkageGroups".equals(fieldName)) {
            return linkageGroups;
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
        if (!org.intermine.model.bio.GeneticMap.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("unit".equals(fieldName)) {
            return unit;
        }
        if ("linkageGroups".equals(fieldName)) {
            return linkageGroups;
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
        if (!org.intermine.model.bio.GeneticMap.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("description".equals(fieldName)) {
            description = (java.lang.String) value;
        } else if ("unit".equals(fieldName)) {
            unit = (java.lang.String) value;
        } else if ("linkageGroups".equals(fieldName)) {
            linkageGroups = (java.util.Set) value;
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
            if (!org.intermine.model.bio.GeneticMap.class.equals(getClass())) {
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
        if ("unit".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("linkageGroups".equals(fieldName)) {
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
        if (!org.intermine.model.bio.GeneticMap.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.GeneticMap.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.GeneticMapShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.GeneticMap");
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
        if (unit != null) {
            sb.append("$_^aunit$_^");
            String string = unit;
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
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.GeneticMapShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.GeneticMap)");
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
            if ((i < notXml.length) && "aunit".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                unit = string == null ? notXml[i] : string.toString();
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
        linkageGroups = new ProxyCollection<org.intermine.model.bio.LinkageGroup>(os, this, "linkageGroups", org.intermine.model.bio.LinkageGroup.class);
        markers = new ProxyCollection<org.intermine.model.bio.GeneticMarker>(os, this, "markers", org.intermine.model.bio.GeneticMarker.class);
        ontologyAnnotations = new ProxyCollection<org.intermine.model.bio.OntologyAnnotation>(os, this, "ontologyAnnotations", org.intermine.model.bio.OntologyAnnotation.class);
        publications = new ProxyCollection<org.intermine.model.bio.Publication>(os, this, "publications", org.intermine.model.bio.Publication.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("linkageGroups".equals(fieldName)) {
            linkageGroups.add((org.intermine.model.bio.LinkageGroup) element);
        } else if ("markers".equals(fieldName)) {
            markers.add((org.intermine.model.bio.GeneticMarker) element);
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations.add((org.intermine.model.bio.OntologyAnnotation) element);
        } else if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else {
            if (!org.intermine.model.bio.GeneticMap.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("linkageGroups".equals(fieldName)) {
            return org.intermine.model.bio.LinkageGroup.class;
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
        if (!org.intermine.model.bio.GeneticMap.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.GeneticMap.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
