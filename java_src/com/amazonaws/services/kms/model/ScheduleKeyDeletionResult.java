package com.amazonaws.services.kms.model;

import java.io.Serializable;
import java.util.Date;
/* loaded from: classes3.dex */
public class ScheduleKeyDeletionResult implements Serializable {
    private Date deletionDate;
    private String keyId;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ScheduleKeyDeletionResult)) {
            return false;
        }
        ScheduleKeyDeletionResult scheduleKeyDeletionResult = (ScheduleKeyDeletionResult) obj;
        if (scheduleKeyDeletionResult.getKeyId() == null) {
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
        if (scheduleKeyDeletionResult.getKeyId() != null && !scheduleKeyDeletionResult.getKeyId().equals(getKeyId())) {
            return false;
        }
        if (scheduleKeyDeletionResult.getDeletionDate() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getDeletionDate() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (scheduleKeyDeletionResult.getDeletionDate() == null || scheduleKeyDeletionResult.getDeletionDate().equals(getDeletionDate())) {
            return true;
        }
        return false;
    }

    public Date getDeletionDate() {
        return this.deletionDate;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        if (getKeyId() == null) {
            hashCode = 0;
        } else {
            hashCode = getKeyId().hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        if (getDeletionDate() != null) {
            i = getDeletionDate().hashCode();
        }
        return i2 + i;
    }

    public void setDeletionDate(Date date) {
        this.deletionDate = date;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId() + ",");
        }
        if (getDeletionDate() != null) {
            sb.append("DeletionDate: " + getDeletionDate());
        }
        sb.append("}");
        return sb.toString();
    }

    public ScheduleKeyDeletionResult withDeletionDate(Date date) {
        this.deletionDate = date;
        return this;
    }

    public ScheduleKeyDeletionResult withKeyId(String str) {
        this.keyId = str;
        return this;
    }
}
