package p000;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsCodeBrowserClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: Zt9 */
/* loaded from: classes5.dex */
public final class Zt9 extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsCodeBrowserClient {

    /* renamed from: a */
    public static final Api.ClientKey<C51904xv9> f49453a;

    /* renamed from: b */
    public static final Api.AbstractClientBuilder<C51904xv9, Api.ApiOptions.NoOptions> f49454b;

    /* renamed from: c */
    public static final Api<Api.ApiOptions.NoOptions> f49455c;

    static {
        Api.ClientKey<C51904xv9> clientKey = new Api.ClientKey<>();
        f49453a = clientKey;
        Sq9 sq9 = new Sq9();
        f49454b = sq9;
        f49455c = new Api<>("SmsCodeBrowser.API", sq9, clientKey);
    }

    public Zt9(Activity activity) {
        super(activity, f49455c, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeBrowserClient
    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(TaskApiCall.builder().setFeatures(C32385Dh7.f6199b).run(new RemoteCall() { // from class: So9
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((C33196Gt8) ((C51904xv9) obj).getService()).m104604h5(new BinderC50096us9(Zt9.this, (TaskCompletionSource) obj2));
            }
        }).setMethodKey(1566).build());
    }

    public Zt9(Context context) {
        super(context, f49455c, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
