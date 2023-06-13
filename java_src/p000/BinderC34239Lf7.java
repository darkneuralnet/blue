package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: Lf7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC34239Lf7 extends IA8 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f21880a;

    public BinderC34239Lf7(C32610Eg7 c32610Eg7, TaskCompletionSource taskCompletionSource) {
        this.f21880a = taskCompletionSource;
    }

    @Override // p000.InterfaceC44408lH8
    public final void zzb(Status status) {
        TaskUtil.setResultOrApiException(status, this.f21880a);
    }
}
