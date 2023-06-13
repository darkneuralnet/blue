package com.amazonaws.services.p026s3.model;
/* renamed from: com.amazonaws.services.s3.model.ReplicationRuleStatus */
/* loaded from: classes3.dex */
public enum ReplicationRuleStatus {
    Enabled("Enabled"),
    Disabled(BucketLifecycleConfiguration.DISABLED);
    
    private final String status;

    ReplicationRuleStatus(String str) {
        this.status = str;
    }

    public String getStatus() {
        return this.status;
    }
}
