package com.google.mlkit.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes6.dex */
public class MlKitException extends Exception {

    /* renamed from: b */
    public final int f74661b;

    @KeepForSdk
    public MlKitException(String str, int i) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."));
        this.f74661b = i;
    }

    /* renamed from: a */
    public int m46765a() {
        return this.f74661b;
    }

    @KeepForSdk
    public MlKitException(String str, int i, Throwable th) {
        super(Preconditions.checkNotEmpty(str, "Provided message must not be empty."), th);
        this.f74661b = i;
    }
}
