package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Ln21;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "", "retry", "", "b", "Lo21;", C17296a.f69688o, "Lo21;", "deviceCheckManager", "<init>", "(Lo21;)V", "devicecheck-interceptor_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: n21  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45444n21 implements Interceptor {

    /* renamed from: a */
    public final InterfaceC46037o21 f99260a;

    public C45444n21(InterfaceC46037o21 deviceCheckManager) {
        Intrinsics.checkNotNullParameter(deviceCheckManager, "deviceCheckManager");
        this.f99260a = deviceCheckManager;
    }

    /* renamed from: b */
    public final String m24548b(boolean z) {
        try {
            Thread.sleep(500L);
            String mo1967a = this.f99260a.mo1967a();
            if (mo1967a == null) {
                if (!z) {
                    return null;
                }
                return m24548b(false);
            }
            return mo1967a;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        if (this.f99260a.mo1964d(request.url().host(), request.method(), request.url().toString())) {
            String m24548b = m24548b(true);
            if (m24548b == null) {
                return chain.proceed(request);
            }
            Request.Builder newBuilder = request.newBuilder();
            newBuilder.addHeader("Device-Verification", m24548b);
            return chain.proceed(newBuilder.build());
        }
        return chain.proceed(request);
    }
}
