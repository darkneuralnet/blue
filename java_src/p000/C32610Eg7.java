package p000;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: Eg7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C32610Eg7 extends SmsRetrieverClient {
    public C32610Eg7(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverClient, com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public final Task<Void> startSmsRetriever() {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: Bw9
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((C33196Gt8) ((C51904xv9) obj).getService()).m104603i5(new Ey9(C32610Eg7.this, (TaskCompletionSource) obj2));
            }
        }).setFeatures(C32385Dh7.f6200c).setMethodKey(1567).build());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverClient, com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public final Task<Void> startSmsUserConsent(final String str) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: Ex9
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                C32610Eg7 c32610Eg7 = C32610Eg7.this;
                ((C33196Gt8) ((C51904xv9) obj).getService()).m104602j5(str, new BinderC34239Lf7(c32610Eg7, (TaskCompletionSource) obj2));
            }
        }).setFeatures(C32385Dh7.f6201d).setMethodKey(1568).build());
    }

    public C32610Eg7(Context context) {
        super(context);
    }
}
