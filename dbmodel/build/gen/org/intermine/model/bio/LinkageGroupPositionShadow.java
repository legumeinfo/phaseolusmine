package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.model.StringConstructor;
import org.intermine.metadata.TypeUtil;
import org.intermine.util.DynamicUtil;
import org.intermine.model.ShadowClass;

public class LinkageGroupPositionShadow implements LinkageGroupPosition, ShadowClass
{
    public static final Class<LinkageGroupPosition> shadowOf = LinkageGroupPosition.class;
    // Attr: org.intermine.model.bio.LinkageGroupPosition.position
    protected java.lang.Double position;
    public java.lang.Double getPosition() { return position; }
    public void setPosition(final java.lang.Double position) { this.position = position; }

    // Ref: org.intermine.model.bio.LinkageGroupPosition.linkageGroup
    protected org.intermine.model.InterMineObject linkageGroup;
    public org.intermine.model.bio.LinkageGroup getLinkageGroup() { if (linkageGroup instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.LinkageGroup) ((org.intermine.objectstore.proxy.ProxyReference) linkageGroup).getObject()); }; return (org.intermine.model.bio.LinkageGroup) linkageGroup; }
    public void setLinkageGroup(final org.intermine.model.bio.LinkageGroup linkageGroup) { this.linkageGroup = linkageGroup; }
    public void proxyLinkageGroup(final org.intermine.objectstore.proxy.ProxyReference linkageGroup) { this.linkageGroup = linkageGroup; }
    public org.intermine.model.InterMineObject proxGetLinkageGroup() { return linkageGroup; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof LinkageGroupPosition && id != null) ? id.equals(((LinkageGroupPosition)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "LinkageGroupPosition [id=" + id + ", linkageGroup=" + (linkageGroup == null ? "null" : (linkageGroup.getId() == null ? "no id" : linkageGroup.getId().toString())) + ", position=" + position + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("position".equals(fieldName)) {
            return position;
        }
        if ("linkageGroup".equals(fieldName)) {
            if (linkageGroup instanceof ProxyReference) {
                return ((ProxyReference) linkageGroup).getObject();
            } else {
                return linkageGroup;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.LinkageGroupPosition.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("position".equals(fieldName)) {
            return position;
        }
        if ("linkageGroup".equals(fieldName)) {
            return linkageGroup;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.LinkageGroupPosition.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("position".equals(fieldName)) {
            position = (java.lang.Double) value;
        } else if ("linkageGroup".equals(fieldName)) {
            linkageGroup = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.LinkageGroupPosition.class.equals(getClass())) {
                DynamicUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("position".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("linkageGroup".equals(fieldName)) {
            return org.intermine.model.bio.LinkageGroup.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.LinkageGroupPosition.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.LinkageGroupPosition.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.LinkageGroupPositionShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.LinkageGroupPosition");
        if (position != null) {
            sb.append("$_^aposition$_^").append(position);
        }
        if (linkageGroup != null) {
            sb.append("$_^rlinkageGroup$_^").append(linkageGroup.getId());
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
        if (!org.intermine.model.bio.LinkageGroupPositionShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.LinkageGroupPosition)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aposition".equals(notXml[i])) {
                i++;
                position = Double.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rlinkageGroup".equals(notXml[i])) {
                i++;
                linkageGroup = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.LinkageGroup.class);
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
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        {
            if (!org.intermine.model.bio.LinkageGroupPosition.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.LinkageGroupPosition.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.LinkageGroupPosition.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}
