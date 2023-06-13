package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: Ey9 */
/* loaded from: classes5.dex */
public final class Ey9 extends IA8 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f8397a;

    public Ey9(C32610Eg7 c32610Eg7, TaskCompletionSource taskCompletionSource) {
        this.f8397a = taskCompletionSource;
    }

    @Override // p000.InterfaceC44408lH8
    public final void zzb(Status status) {
        TaskUtil.setResultOrApiException(status, this.f8397a);
    }
}
