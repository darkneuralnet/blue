package com.google.android.gms.location;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
/* loaded from: classes6.dex */
public abstract class zzb<R extends Result> extends BaseImplementation.ApiMethodImpl<R, TA7> {
    public zzb(GoogleApiClient googleApiClient) {
        super(ActivityRecognition.API, googleApiClient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzb<R>) ((Result) obj));
    }
}
