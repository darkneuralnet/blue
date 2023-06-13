package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes6.dex */
abstract class zzap implements RemoteCall<TA7, TaskCompletionSource<Boolean>> {
    private boolean zza = true;

    public final boolean zza() {
        return this.zza;
    }

    public final void zzb(boolean z) {
        this.zza = false;
    }
}
