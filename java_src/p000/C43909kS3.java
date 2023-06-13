package p000;

import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
@KeepForSdk
/* renamed from: kS3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43909kS3 {

    /* renamed from: a */
    public static final Api.ClientKey<C42526i68> f94401a;

    /* renamed from: b */
    public static final Api.AbstractClientBuilder<C42526i68, Api.ApiOptions.NoOptions> f94402b;
    @Deprecated

    /* renamed from: c */
    public static final Api<Api.ApiOptions.NoOptions> f94403c;
    @Deprecated

    /* renamed from: d */
    public static final InterfaceC46942pZ8 f94404d;

    /* JADX WARN: Type inference failed for: r0v1, types: [RX7, pZ8] */
    static {
        Api.ClientKey<C42526i68> clientKey = new Api.ClientKey<>();
        f94401a = clientKey;
        C52816zT8 c52816zT8 = new C52816zT8();
        f94402b = c52816zT8;
        f94403c = new Api<>("Phenotype.API", c52816zT8, clientKey);
        f94404d = new RX7();
    }

    private C43909kS3() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static Uri m28954a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        return Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
    }
}
