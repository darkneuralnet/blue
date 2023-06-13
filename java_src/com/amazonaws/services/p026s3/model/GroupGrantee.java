package com.amazonaws.services.p026s3.model;
/* renamed from: com.amazonaws.services.s3.model.GroupGrantee */
/* loaded from: classes3.dex */
public enum GroupGrantee implements Grantee {
    AllUsers("http://acs.amazonaws.com/groups/global/AllUsers"),
    AuthenticatedUsers("http://acs.amazonaws.com/groups/global/AuthenticatedUsers"),
    LogDelivery("http://acs.amazonaws.com/groups/s3/LogDelivery");
    
    private String groupUri;

    GroupGrantee(String str) {
        this.groupUri = str;
    }

    public static GroupGrantee parseGroupGrantee(String str) {
        GroupGrantee[] values;
        for (GroupGrantee groupGrantee : values()) {
            if (groupGrantee.groupUri.equals(str)) {
                return groupGrantee;
            }
        }
        return null;
    }

    @Override // com.amazonaws.services.p026s3.model.Grantee
    public String getIdentifier() {
        return this.groupUri;
    }

    @Override // com.amazonaws.services.p026s3.model.Grantee
    public String getTypeIdentifier() {
        return "uri";
    }

    @Override // com.amazonaws.services.p026s3.model.Grantee
    public void setIdentifier(String str) {
        throw new UnsupportedOperationException("Group grantees have preset identifiers that cannot be modified.");
    }

    @Override // java.lang.Enum
    public String toString() {
        return "GroupGrantee [" + this.groupUri + "]";
    }
}
