package com.amazonaws.services.p026s3.model;

import java.io.Serializable;
/* renamed from: com.amazonaws.services.s3.model.Owner */
/* loaded from: classes3.dex */
public class Owner implements Serializable {
    private static final long serialVersionUID = -8916731456944569115L;
    private String displayName;

    /* renamed from: id */
    private String f68601id;

    public Owner() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Owner)) {
            return false;
        }
        Owner owner = (Owner) obj;
        String id = owner.getId();
        String displayName = owner.getDisplayName();
        String id2 = getId();
        String displayName2 = getDisplayName();
        if (id == null) {
            id = "";
        }
        if (displayName == null) {
            displayName = "";
        }
        if (id2 == null) {
            id2 = "";
        }
        if (displayName2 == null) {
            displayName2 = "";
        }
        if (!id.equals(id2) || !displayName.equals(displayName2)) {
            return false;
        }
        return true;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getId() {
        return this.f68601id;
    }

    public int hashCode() {
        String str = this.f68601id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setId(String str) {
        this.f68601id = str;
    }

    public String toString() {
        return "S3Owner [name=" + getDisplayName() + ",id=" + getId() + "]";
    }

    public Owner(String str, String str2) {
        this.f68601id = str;
        this.displayName = str2;
    }
}
