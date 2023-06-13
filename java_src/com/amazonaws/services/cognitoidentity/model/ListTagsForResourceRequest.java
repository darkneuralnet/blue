package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {
    private String resourceArn;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTagsForResourceRequest)) {
            return false;
        }
        ListTagsForResourceRequest listTagsForResourceRequest = (ListTagsForResourceRequest) obj;
        if (listTagsForResourceRequest.getResourceArn() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getResourceArn() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (listTagsForResourceRequest.getResourceArn() == null || listTagsForResourceRequest.getResourceArn().equals(getResourceArn())) {
            return true;
        }
        return false;
    }

    public String getResourceArn() {
        return this.resourceArn;
    }

    public int hashCode() {
        return 31 + (getResourceArn() == null ? 0 : getResourceArn().hashCode());
    }

    public void setResourceArn(String str) {
        this.resourceArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceArn() != null) {
            sb.append("ResourceArn: " + getResourceArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListTagsForResourceRequest withResourceArn(String str) {
        this.resourceArn = str;
        return this;
    }
}