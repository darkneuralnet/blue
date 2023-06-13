package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class ListAliasesRequest extends AmazonWebServiceRequest implements Serializable {
    private String keyId;
    private Integer limit;
    private String marker;

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
        if (obj == null || !(obj instanceof ListAliasesRequest)) {
            return false;
        }
        ListAliasesRequest listAliasesRequest = (ListAliasesRequest) obj;
        if (listAliasesRequest.getKeyId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getKeyId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (listAliasesRequest.getKeyId() != null && !listAliasesRequest.getKeyId().equals(getKeyId())) {
            return false;
        }
        if (listAliasesRequest.getLimit() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getLimit() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (listAliasesRequest.getLimit() != null && !listAliasesRequest.getLimit().equals(getLimit())) {
            return false;
        }
        if (listAliasesRequest.getMarker() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getMarker() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (listAliasesRequest.getMarker() == null || listAliasesRequest.getMarker().equals(getMarker())) {
            return true;
        }
        return false;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getMarker() {
        return this.marker;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        if (getKeyId() == null) {
            hashCode = 0;
        } else {
            hashCode = getKeyId().hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (getLimit() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = getLimit().hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (getMarker() != null) {
            i = getMarker().hashCode();
        }
        return i3 + i;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setMarker(String str) {
        this.marker = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId() + ",");
        }
        if (getLimit() != null) {
            sb.append("Limit: " + getLimit() + ",");
        }
        if (getMarker() != null) {
            sb.append("Marker: " + getMarker());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListAliasesRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public ListAliasesRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public ListAliasesRequest withMarker(String str) {
        this.marker = str;
        return this;
    }
}