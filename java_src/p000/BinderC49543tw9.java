package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.PaymentData;
/* renamed from: tw9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC49543tw9 extends Fq9 {

    /* renamed from: a */
    public final TaskCompletionSource f111402a;

    public BinderC49543tw9(TaskCompletionSource taskCompletionSource) {
        this.f111402a = taskCompletionSource;
    }

    @Override // p000.Fq9, p000.Dh9
    /* renamed from: X2 */
    public final void mo11176X2(Status status, PaymentData paymentData, Bundle bundle) {
        C12186at.m65331g(status, paymentData, this.f111402a);
    }
}
