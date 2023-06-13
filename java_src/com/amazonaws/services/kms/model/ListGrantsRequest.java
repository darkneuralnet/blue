package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class ListGrantsRequest extends AmazonWebServiceRequest implements Serializable {
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
        if (obj == null || !(obj instanceof ListGrantsRequest)) {
            return false;
        }
        ListGrantsRequest listGrantsRequest = (ListGrantsRequest) obj;
        if (listGrantsRequest.getLimit() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getLimit() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (listGrantsRequest.getLimit() != null && !listGrantsRequest.getLimit().equals(getLimit())) {
            return false;
        }
        if (listGrantsRequest.getMarker() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getMarker() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (listGrantsRequest.getMarker() != null && !listGrantsRequest.getMarker().equals(getMarker())) {
            return false;
        }
        if (listGrantsRequest.getKeyId() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getKeyId() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (listGrantsRequest.getKeyId() == null || listGrantsRequest.getKeyId().equals(getKeyId())) {
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
        if (getLimit() == null) {
            hashCode = 0;
        } else {
            hashCode = getLimit().hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (getMarker() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = getMarker().hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        if (getKeyId() != null) {
            i = getKeyId().hashCode();
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
        if (getLimit() != null) {
            sb.append("Limit: " + getLimit() + ",");
        }
        if (getMarker() != null) {
            sb.append("Marker: " + getMarker() + ",");
        }
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListGrantsRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public ListGrantsRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public ListGrantsRequest withMarker(String str) {
        this.marker = str;
        return this;
    }
}
