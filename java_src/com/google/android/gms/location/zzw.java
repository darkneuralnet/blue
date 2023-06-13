package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes6.dex */
final /* synthetic */ class zzw implements RemoteCall {
    static final RemoteCall zza = new zzw();

    private zzw() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        ((TA7) obj).m84249n(new zzao((TaskCompletionSource) obj2));
    }
}
