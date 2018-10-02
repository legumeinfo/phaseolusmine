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

public class ExpressionSourceShadow implements ExpressionSource, ShadowClass
{
    public static final Class<ExpressionSource> shadowOf = ExpressionSource.class;
    // Attr: org.intermine.model.bio.ExpressionSource.sra
    protected java.lang.String sra;
    public java.lang.String getSra() { return sra; }
    public void setSra(final java.lang.String sra) { this.sra = sra; }

    // Attr: org.intermine.model.bio.ExpressionSource.description
    protected java.lang.String description;
    public java.lang.String getDescription() { return description; }
    public void setDescription(final java.lang.String description) { this.description = description; }

    // Attr: org.intermine.model.bio.ExpressionSource.bioProject
    protected java.lang.String bioProject;
    public java.lang.String getBioProject() { return bioProject; }
    public void setBioProject(final java.lang.String bioProject) { this.bioProject = bioProject; }

    // Attr: org.intermine.model.bio.ExpressionSource.unit
    protected java.lang.String unit;
    public java.lang.String getUnit() { return unit; }
    public void setUnit(final java.lang.String unit) { this.unit = unit; }

    // Attr: org.intermine.model.bio.ExpressionSource.url
    protected java.lang.String url;
    public java.lang.String getUrl() { return url; }
    public void setUrl(final java.lang.String url) { this.url = url; }

    // Attr: org.intermine.model.bio.ExpressionSource.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Attr: org.intermine.model.bio.ExpressionSource.geo
    protected java.lang.String geo;
    public java.lang.String getGeo() { return geo; }
    public void setGeo(final java.lang.String geo) { this.geo = geo; }

    // Ref: org.intermine.model.bio.ExpressionSource.publication
    protected org.intermine.model.InterMineObject publication;
    public org.intermine.model.bio.Publication getPublication() { if (publication instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Publication) ((org.intermine.objectstore.proxy.ProxyReference) publication).getObject()); }; return (org.intermine.model.bio.Publication) publication; }
    public void setPublication(final org.intermine.model.bio.Publication publication) { this.publication = publication; }
    public void proxyPublication(final org.intermine.objectstore.proxy.ProxyReference publication) { this.publication = publication; }
    public org.intermine.model.InterMineObject proxGetPublication() { return publication; }

    // Col: org.intermine.model.bio.ExpressionSource.samples
    protected java.util.Set<org.intermine.model.bio.ExpressionSample> samples = new java.util.HashSet<org.intermine.model.bio.ExpressionSample>();
    public java.util.Set<org.intermine.model.bio.ExpressionSample> getSamples() { return samples; }
    public void setSamples(final java.util.Set<org.intermine.model.bio.ExpressionSample> samples) { this.samples = samples; }
    public void addSamples(final org.intermine.model.bio.ExpressionSample arg) { samples.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof ExpressionSource && id != null) ? id.equals(((ExpressionSource)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "ExpressionSource [bioProject=" + (bioProject == null ? "null" : "\"" + bioProject + "\"") + ", description=" + (description == null ? "null" : "\"" + description + "\"") + ", geo=" + (geo == null ? "null" : "\"" + geo + "\"") + ", id=" + id + ", primaryIdentifier=" + (primaryIdentifier == null ? "null" : "\"" + primaryIdentifier + "\"") + ", publication=" + (publication == null ? "null" : (publication.getId() == null ? "no id" : publication.getId().toString())) + ", sra=" + (sra == null ? "null" : "\"" + sra + "\"") + ", unit=" + (unit == null ? "null" : "\"" + unit + "\"") + ", url=" + (url == null ? "null" : "\"" + url + "\"") + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("sra".equals(fieldName)) {
            return sra;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("bioProject".equals(fieldName)) {
            return bioProject;
        }
        if ("unit".equals(fieldName)) {
            return unit;
        }
        if ("url".equals(fieldName)) {
            return url;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("geo".equals(fieldName)) {
            return geo;
        }
        if ("publication".equals(fieldName)) {
            if (publication instanceof ProxyReference) {
                return ((ProxyReference) publication).getObject();
            } else {
                return publication;
            }
        }
        if ("samples".equals(fieldName)) {
            return samples;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExpressionSource.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("sra".equals(fieldName)) {
            return sra;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("bioProject".equals(fieldName)) {
            return bioProject;
        }
        if ("unit".equals(fieldName)) {
            return unit;
        }
        if ("url".equals(fieldName)) {
            return url;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("geo".equals(fieldName)) {
            return geo;
        }
        if ("publication".equals(fieldName)) {
            return publication;
        }
        if ("samples".equals(fieldName)) {
            return samples;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.ExpressionSource.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("sra".equals(fieldName)) {
            sra = (java.lang.String) value;
        } else if ("description".equals(fieldName)) {
            description = (java.lang.String) value;
        } else if ("bioProject".equals(fieldName)) {
            bioProject = (java.lang.String) value;
        } else if ("unit".equals(fieldName)) {
            unit = (java.lang.String) value;
        } else if ("url".equals(fieldName)) {
            url = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("geo".equals(fieldName)) {
            geo = (java.lang.String) value;
        } else if ("publication".equals(fieldName)) {
            publication = (org.intermine.model.InterMineObject) value;
        } else if ("samples".equals(fieldName)) {
            samples = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.ExpressionSource.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("sra".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("description".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("bioProject".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("unit".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("url".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("geo".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("publication".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("samples".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.ExpressionSource.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.ExpressionSource.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.ExpressionSourceShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.ExpressionSource");
        if (sra != null) {
            sb.append("$_^asra$_^");
            String string = sra;
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
        if (bioProject != null) {
            sb.append("$_^abioProject$_^");
            String string = bioProject;
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
        if (url != null) {
            sb.append("$_^aurl$_^");
            String string = url;
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
        if (geo != null) {
            sb.append("$_^ageo$_^");
            String string = geo;
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
        if (publication != null) {
            sb.append("$_^rpublication$_^").append(publication.getId());
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
        if (!org.intermine.model.bio.ExpressionSourceShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.ExpressionSource)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "asra".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                sra = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "abioProject".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                bioProject = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "aurl".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                url = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "ageo".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                geo = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rpublication".equals(notXml[i])) {
                i++;
                publication = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Publication.class);
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
        samples = new ProxyCollection<org.intermine.model.bio.ExpressionSample>(os, this, "samples", org.intermine.model.bio.ExpressionSample.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("samples".equals(fieldName)) {
            samples.add((org.intermine.model.bio.ExpressionSample) element);
        } else {
            if (!org.intermine.model.bio.ExpressionSource.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("samples".equals(fieldName)) {
            return org.intermine.model.bio.ExpressionSample.class;
        }
        if (!org.intermine.model.bio.ExpressionSource.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.ExpressionSource.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
