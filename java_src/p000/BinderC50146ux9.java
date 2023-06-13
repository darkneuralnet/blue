package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: ux9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC50146ux9 extends AbstractBinderC43815kH8 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f113249a;

    public BinderC50146ux9(C35886Sg7 c35886Sg7, TaskCompletionSource taskCompletionSource) {
        this.f113249a = taskCompletionSource;
    }

    @Override // p000.MN8
    /* renamed from: j */
    public final void mo9427j(Status status, Bundle bundle) {
        C35886Sg7.m85132i(status, bundle, this.f113249a);
    }
}
