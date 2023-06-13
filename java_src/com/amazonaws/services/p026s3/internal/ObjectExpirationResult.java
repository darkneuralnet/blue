package com.amazonaws.services.p026s3.internal;

import java.util.Date;
/* renamed from: com.amazonaws.services.s3.internal.ObjectExpirationResult */
/* loaded from: classes3.dex */
public interface ObjectExpirationResult {
    Date getExpirationTime();

    String getExpirationTimeRuleId();

    void setExpirationTime(Date date);

    void setExpirationTimeRuleId(String str);
}
