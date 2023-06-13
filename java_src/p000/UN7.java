package p000;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;
/* renamed from: UN7 */
/* loaded from: classes5.dex */
public final class UN7 implements ProxyApi.ProxyResult {

    /* renamed from: b */
    public final Status f37315b;

    /* renamed from: c */
    public ProxyResponse f37316c;

    public UN7(Status status) {
        this.f37315b = status;
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult
    public final ProxyResponse getResponse() {
        return this.f37316c;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f37315b;
    }

    public UN7(ProxyResponse proxyResponse) {
        this.f37316c = proxyResponse;
        this.f37315b = Status.RESULT_SUCCESS;
    }
}
