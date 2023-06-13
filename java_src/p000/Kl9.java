package p000;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsCodeAutofillClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: Kl9 */
/* loaded from: classes5.dex */
public final class Kl9 extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsCodeAutofillClient {

    /* renamed from: a */
    public static final Api.ClientKey<C51904xv9> f20197a;

    /* renamed from: b */
    public static final Api.AbstractClientBuilder<C51904xv9, Api.ApiOptions.NoOptions> f20198b;

    /* renamed from: c */
    public static final Api<Api.ApiOptions.NoOptions> f20199c;

    static {
        Api.ClientKey<C51904xv9> clientKey = new Api.ClientKey<>();
        f20197a = clientKey;
        C38349b59 c38349b59 = new C38349b59();
        f20198b = c38349b59;
        f20199c = new Api<>("SmsCodeAutofill.API", c38349b59, clientKey);
    }

    public Kl9(Activity activity) {
        super(activity, f20199c, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final Task<Integer> checkPermissionState() {
        return doRead(TaskApiCall.builder().setFeatures(C32385Dh7.f6198a).run(new RemoteCall() { // from class: NN8
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((C33196Gt8) ((C51904xv9) obj).getService()).m104607e5(new BinderC52910zd9(Kl9.this, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(1564).build());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        Preconditions.checkNotNull(str);
        Preconditions.checkArgument(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(TaskApiCall.builder().setFeatures(C32385Dh7.f6198a).run(new RemoteCall() { // from class: DZ8
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                Kl9 kl9 = Kl9.this;
                ((C33196Gt8) ((C51904xv9) obj).getService()).m104606f5(str, new Ph9(kl9, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(1565).build());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(TaskApiCall.builder().setFeatures(C32385Dh7.f6198a).run(new RemoteCall() { // from class: NT8
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((C33196Gt8) ((C51904xv9) obj).getService()).m104605g5(new BinderC52043y99(Kl9.this, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(1563).build());
    }

    public Kl9(Context context) {
        super(context, f20199c, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
