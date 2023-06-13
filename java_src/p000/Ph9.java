package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: Ph9 */
/* loaded from: classes5.dex */
public final class Ph9 extends AbstractBinderC36337Ue8 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f28928a;

    public Ph9(Kl9 kl9, TaskCompletionSource taskCompletionSource) {
        this.f28928a = taskCompletionSource;
    }

    @Override // p000.InterfaceC33367Hm8
    /* renamed from: k3 */
    public final void mo89912k3(Status status, boolean z) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z), this.f28928a);
    }
}
