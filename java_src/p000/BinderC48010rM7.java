package p000;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
/* renamed from: rM7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class BinderC48010rM7 extends BinderC52096yF7 {

    /* renamed from: a */
    public final /* synthetic */ IM7 f106904a;

    public BinderC48010rM7(IM7 im7) {
        this.f106904a = im7;
    }

    @Override // p000.BinderC52096yF7, p000.XH7
    /* renamed from: d2 */
    public final void mo3738d2(ProxyResponse proxyResponse) {
        this.f106904a.setResult((IM7) new UN7(proxyResponse));
    }
}
