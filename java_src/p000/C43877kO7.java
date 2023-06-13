package p000;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: kO7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43877kO7 implements ProxyApi.SpatulaHeaderResult {

    /* renamed from: b */
    public final Status f94347b;

    /* renamed from: c */
    public final String f94348c;

    public C43877kO7(Status status) {
        this.f94347b = (Status) Preconditions.checkNotNull(status);
        this.f94348c = "";
    }

    @Override // com.google.android.gms.auth.api.proxy.ProxyApi.SpatulaHeaderResult
    public final String getSpatulaHeader() {
        return this.f94348c;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f94347b;
    }

    public C43877kO7(String str) {
        this.f94348c = (String) Preconditions.checkNotNull(str);
        this.f94347b = Status.RESULT_SUCCESS;
    }
}
