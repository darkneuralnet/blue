package p000;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
/* renamed from: s52  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48439s52 implements Callback {

    /* renamed from: a */
    public final Callback f108231a;

    /* renamed from: b */
    public final M73 f108232b;

    /* renamed from: c */
    public final Timer f108233c;

    /* renamed from: d */
    public final long f108234d;

    public C48439s52(Callback callback, C41612ga6 c41612ga6, Timer timer, long j) {
        this.f108231a = callback;
        this.f108232b = M73.m95789c(c41612ga6);
        this.f108234d = j;
        this.f108233c = timer;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        Request request = call.request();
        if (request != null) {
            HttpUrl url = request.url();
            if (url != null) {
                this.f108232b.m95772u(url.url().toString());
            }
            if (request.method() != null) {
                this.f108232b.m95782k(request.method());
            }
        }
        this.f108232b.m95778o(this.f108234d);
        this.f108232b.m95774s(this.f108233c.m47036c());
        N73.m94350d(this.f108232b);
        this.f108231a.onFailure(call, iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) throws IOException {
        FirebasePerfOkHttpClient.m47059a(response, this.f108232b, this.f108234d, this.f108233c.m47036c());
        this.f108231a.onResponse(call, response);
    }
}
