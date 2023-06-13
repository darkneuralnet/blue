package com.amazonaws.services.p026s3.internal;

import java.util.Date;
/* renamed from: com.amazonaws.services.s3.internal.ObjectRestoreResult */
/* loaded from: classes3.dex */
public interface ObjectRestoreResult {
    Boolean getOngoingRestore();

    Date getRestoreExpirationTime();

    void setOngoingRestore(boolean z);

    void setRestoreExpirationTime(Date date);
}
