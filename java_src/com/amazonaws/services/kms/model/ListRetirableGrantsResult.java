package com.amazonaws.services.kms.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes3.dex */
public class ListRetirableGrantsResult implements Serializable {
    private List<GrantListEntry> grants = new ArrayList();
    private String nextMarker;
    private Boolean truncated;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListRetirableGrantsResult)) {
            return false;
        }
        ListRetirableGrantsResult listRetirableGrantsResult = (ListRetirableGrantsResult) obj;
        if (listRetirableGrantsResult.getGrants() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getGrants() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (listRetirableGrantsResult.getGrants() != null && !listRetirableGrantsResult.getGrants().equals(getGrants())) {
            return false;
        }
        if (listRetirableGrantsResult.getNextMarker() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getNextMarker() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (listRetirableGrantsResult.getNextMarker() != null && !listRetirableGrantsResult.getNextMarker().equals(getNextMarker())) {
            return false;
        }
        if (listRetirableGrantsResult.getTruncated() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getTruncated() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (listRetirableGrantsResult.getTruncated() == null || listRetirableGrantsResult.getTruncated().equals(getTruncated())) {
            return true;
        }
        return false;
    }

    public List<GrantListEntry> getGrants() {
        return this.grants;
    }

    public String getNextMarker() {
        return this.nextMarker;
    }

    public Boolean getTruncated() {
        return this.truncated;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        if (getGrants() == null) {
            hashCode = 0;
        } else {
            hashCode = getGrants().hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (getNextMarker() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = getNextMarker().hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (getTruncated() != null) {
            i = getTruncated().hashCode();
        }
        return i3 + i;
    }

    public Boolean isTruncated() {
        return this.truncated;
    }

    public void setGrants(Collection<GrantListEntry> collection) {
        if (collection == null) {
            this.grants = null;
        } else {
            this.grants = new ArrayList(collection);
        }
    }

    public void setNextMarker(String str) {
        this.nextMarker = str;
    }

    public void setTruncated(Boolean bool) {
        this.truncated = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGrants() != null) {
            sb.append("Grants: " + getGrants() + ",");
        }
        if (getNextMarker() != null) {
            sb.append("NextMarker: " + getNextMarker() + ",");
        }
        if (getTruncated() != null) {
            sb.append("Truncated: " + getTruncated());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListRetirableGrantsResult withGrants(GrantListEntry... grantListEntryArr) {
        if (getGrants() == null) {
            this.grants = new ArrayList(grantListEntryArr.length);
        }
        for (GrantListEntry grantListEntry : grantListEntryArr) {
            this.grants.add(grantListEntry);
        }
        return this;
    }

    public ListRetirableGrantsResult withNextMarker(String str) {
        this.nextMarker = str;
        return this;
    }

    public ListRetirableGrantsResult withTruncated(Boolean bool) {
        this.truncated = bool;
        return this;
    }

    public ListRetirableGrantsResult withGrants(Collection<GrantListEntry> collection) {
        setGrants(collection);
        return this;
    }
}