package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: ks9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC44167ks9 extends Fq9 {

    /* renamed from: a */
    public final TaskCompletionSource f95152a;

    public BinderC44167ks9(TaskCompletionSource taskCompletionSource) {
        this.f95152a = taskCompletionSource;
    }

    @Override // p000.Fq9, p000.Dh9
    /* renamed from: L0 */
    public final void mo28245L0(Status status, boolean z, Bundle bundle) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z), this.f95152a);
    }

    @Override // p000.Fq9, p000.Dh9
    /* renamed from: o2 */
    public final void mo28244o2(int i, boolean z, Bundle bundle) {
        TaskUtil.setResultOrApiException(new Status(i), Boolean.valueOf(z), this.f95152a);
    }
}
