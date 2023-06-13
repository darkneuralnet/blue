package p000;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import p000.C35336Px6;
/* renamed from: EP3 */
/* loaded from: classes6.dex */
public class EP3 extends GoogleApi<C35336Px6.C6596a> {
    public EP3(Activity activity, C35336Px6.C6596a c6596a) {
        super(activity, C35336Px6.f29467a, c6596a, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    /* renamed from: i */
    public Task<Boolean> m109035i(final IsReadyToPayRequest isReadyToPayRequest) {
        return doRead(TaskApiCall.builder().setMethodKey(23705).run(new RemoteCall() { // from class: dm7
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((C50738vx9) obj).m7705c(IsReadyToPayRequest.this, (TaskCompletionSource) obj2);
            }
        }).build());
    }

    /* renamed from: j */
    public Task<PaymentData> m109034j(final PaymentDataRequest paymentDataRequest) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: hl7
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((C50738vx9) obj).m7704d(PaymentDataRequest.this, (TaskCompletionSource) obj2);
            }
        }).setFeatures(AN8.f464c).setAutoResolveMissingFeatures(true).setMethodKey(23707).build());
    }

    public EP3(Context context, C35336Px6.C6596a c6596a) {
        super(context, C35336Px6.f29467a, c6596a, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
