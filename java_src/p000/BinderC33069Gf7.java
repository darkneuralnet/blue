package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: Gf7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC33069Gf7 extends AbstractBinderC43815kH8 {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f12222a;

    public BinderC33069Gf7(C35886Sg7 c35886Sg7, TaskCompletionSource taskCompletionSource) {
        this.f12222a = taskCompletionSource;
    }

    @Override // p000.MN8
    /* renamed from: j */
    public final void mo9427j(Status status, Bundle bundle) {
        C35886Sg7.m85132i(status, bundle, this.f12222a);
    }
}
