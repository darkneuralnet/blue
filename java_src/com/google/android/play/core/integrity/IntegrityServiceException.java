package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
/* loaded from: classes6.dex */
public class IntegrityServiceException extends ApiException {

    /* renamed from: b */
    public final Throwable f73710b;

    public IntegrityServiceException(int i, Throwable th) {
        super(new Status(i, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i), C36804We7.m78047a(i))));
        if (i != 0) {
            this.f73710b = th;
            return;
        }
        throw new IllegalArgumentException("ErrorCode should not be 0.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f73710b;
    }
}
