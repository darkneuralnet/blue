package com.amazonaws.services.p026s3.model;

import java.io.Serializable;
/* renamed from: com.amazonaws.services.s3.model.CanonicalGrantee */
/* loaded from: classes3.dex */
public class CanonicalGrantee implements Grantee, Serializable {

    /* renamed from: id */
    private String f68593id = null;
    private String displayName = null;

    public CanonicalGrantee(String str) {
        setIdentifier(str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CanonicalGrantee) {
            return this.f68593id.equals(((CanonicalGrantee) obj).f68593id);
        }
        return false;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    @Override // com.amazonaws.services.p026s3.model.Grantee
    public String getIdentifier() {
        return this.f68593id;
    }

    @Override // com.amazonaws.services.p026s3.model.Grantee
    public String getTypeIdentifier() {
        return "id";
    }

    public int hashCode() {
        return this.f68593id.hashCode();
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    @Override // com.amazonaws.services.p026s3.model.Grantee
    public void setIdentifier(String str) {
        this.f68593id = str;
    }
}
