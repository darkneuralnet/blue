package p000;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
/* renamed from: n52  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C45475n52<T> implements ResponseHandler<T> {

    /* renamed from: a */
    public final ResponseHandler<? extends T> f99337a;

    /* renamed from: b */
    public final Timer f99338b;

    /* renamed from: c */
    public final M73 f99339c;

    public C45475n52(ResponseHandler<? extends T> responseHandler, Timer timer, M73 m73) {
        this.f99337a = responseHandler;
        this.f99338b = timer;
        this.f99339c = m73;
    }

    public T handleResponse(HttpResponse httpResponse) throws IOException {
        this.f99339c.m95774s(this.f99338b.m47036c());
        this.f99339c.m95781l(httpResponse.getStatusLine().getStatusCode());
        Long m94353a = N73.m94353a(httpResponse);
        if (m94353a != null) {
            this.f99339c.m95776q(m94353a.longValue());
        }
        String m94352b = N73.m94352b(httpResponse);
        if (m94352b != null) {
            this.f99339c.m95777p(m94352b);
        }
        this.f99339c.m95790b();
        return (T) this.f99337a.handleResponse(httpResponse);
    }
}
