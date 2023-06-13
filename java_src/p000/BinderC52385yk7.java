package p000;

import com.google.android.gms.common.api.Status;
/* renamed from: yk7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC52385yk7 extends BinderC47070pm7 {

    /* renamed from: a */
    public final /* synthetic */ C49431tl7 f120101a;

    public BinderC52385yk7(C49431tl7 c49431tl7) {
        this.f120101a = c49431tl7;
    }

    @Override // p000.BinderC47070pm7, com.google.android.gms.auth.account.zzb
    public final void zzc(boolean z) {
        Status status;
        C49431tl7 c49431tl7 = this.f120101a;
        if (z) {
            status = Status.RESULT_SUCCESS;
        } else {
            status = C34797Np7.f25234a;
        }
        c49431tl7.setResult((C49431tl7) new C37128Xo7(status));
    }
}
