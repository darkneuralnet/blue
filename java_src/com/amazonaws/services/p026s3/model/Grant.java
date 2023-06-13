package com.amazonaws.services.p026s3.model;
/* renamed from: com.amazonaws.services.s3.model.Grant */
/* loaded from: classes3.dex */
public class Grant {
    private Grantee grantee;
    private Permission permission;

    public Grant(Grantee grantee, Permission permission) {
        this.grantee = grantee;
        this.permission = permission;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Grant grant = (Grant) obj;
        Grantee grantee = this.grantee;
        if (grantee == null) {
            if (grant.grantee != null) {
                return false;
            }
        } else if (!grantee.equals(grant.grantee)) {
            return false;
        }
        if (this.permission == grant.permission) {
            return true;
        }
        return false;
    }

    public Grantee getGrantee() {
        return this.grantee;
    }

    public Permission getPermission() {
        return this.permission;
    }

    public int hashCode() {
        int hashCode;
        Grantee grantee = this.grantee;
        int i = 0;
        if (grantee == null) {
            hashCode = 0;
        } else {
            hashCode = grantee.hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        Permission permission = this.permission;
        if (permission != null) {
            i = permission.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "Grant [grantee=" + this.grantee + ", permission=" + this.permission + "]";
    }
}
