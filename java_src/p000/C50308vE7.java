package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.recaptcha.zzag;
import com.google.android.gms.internal.recaptcha.zzv;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.gms.recaptcha.RecaptchaResultData;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: vE7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50308vE7 extends GoogleApi<Api.ApiOptions.NoOptions> implements InterfaceC41790gs4 {

    /* renamed from: d */
    public static final Api.ClientKey<C44982mF7> f113735d;

    /* renamed from: e */
    public static final DV7 f113736e;

    /* renamed from: f */
    public static final Api.AbstractClientBuilder<C44982mF7, Api.ApiOptions.NoOptions> f113737f;

    /* renamed from: g */
    public static final Api<Api.ApiOptions.NoOptions> f113738g;

    /* renamed from: a */
    public final Context f113739a;

    /* renamed from: b */
    public final C42772iX7 f113740b;

    /* renamed from: c */
    public final C40687f08 f113741c;

    static {
        Api.ClientKey<C44982mF7> clientKey = new Api.ClientKey<>();
        f113735d = clientKey;
        f113736e = RV7.m86681a();
        C52525yy7 c52525yy7 = new C52525yy7();
        f113737f = c52525yy7;
        f113738g = new Api<>("Recaptcha.API", c52525yy7, clientKey);
    }

    public C50308vE7(Context context) {
        super(context, f113738g, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f113739a = context;
        DV7 dv7 = f113736e;
        this.f113740b = new C42772iX7(dv7);
        this.f113741c = new C40687f08(context, dv7);
    }

    @Override // p000.InterfaceC41790gs4
    /* renamed from: b */
    public final Task<RecaptchaHandle> mo8973b(final String str) {
        if (str != null) {
            return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: Sw7
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    C50308vE7 c50308vE7 = C50308vE7.this;
                    String str2 = str;
                    ((C42306hk7) ((C44982mF7) obj).getService()).m35901f5(new BinderC45421mz7(c50308vE7, (TaskCompletionSource) obj2), new zzag(str2, Eq9.m108326a()));
                }
            }).setFeatures(WP7.f40978b).setMethodKey(19802).build());
        }
        throw new NullPointerException("Cannot call init with a null site key.");
    }

    @Override // p000.InterfaceC41790gs4
    /* renamed from: g */
    public final Task<RecaptchaResultData> mo8972g(final RecaptchaHandle recaptchaHandle, final RecaptchaAction recaptchaAction) {
        if (recaptchaHandle != null && recaptchaAction != null) {
            return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: mv7
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    C50308vE7.this.m8971i(recaptchaHandle, recaptchaAction, (C44982mF7) obj, (TaskCompletionSource) obj2);
                }
            }).setFeatures(WP7.f40979c).setMethodKey(19803).build());
        }
        throw new NullPointerException("Cannot call execute with a null RecaptchaHandle or a null RecaptchaAction. Make sure to call init first.");
    }

    /* renamed from: i */
    public final /* synthetic */ void m8971i(RecaptchaHandle recaptchaHandle, RecaptchaAction recaptchaAction, C44982mF7 c44982mF7, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((C42306hk7) c44982mF7.getService()).m35902e5(new BinderC38990cA7(this, taskCompletionSource), new zzv(recaptchaHandle, new RecaptchaAction(recaptchaAction, C38029aZ7.m71215a(this.f113739a, recaptchaHandle.m50544v())), Eq9.m108326a()));
    }
}
