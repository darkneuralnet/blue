package p000;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* renamed from: Le3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34226Le3<T> implements InterfaceC51431x80<T> {

    /* renamed from: b */
    public final KI4 f21856b;

    /* renamed from: c */
    public final Object[] f21857c;

    /* renamed from: d */
    public final Call.Factory f21858d;

    /* renamed from: e */
    public final InterfaceC48496sB0<ResponseBody, T> f21859e;

    /* renamed from: f */
    public volatile boolean f21860f;

    /* renamed from: g */
    public Call f21861g;

    /* renamed from: h */
    public Throwable f21862h;

    /* renamed from: i */
    public boolean f21863i;

    /* renamed from: Le3$a */
    /* loaded from: classes8.dex */
    public class C5051a implements Callback {

        /* renamed from: a */
        public final /* synthetic */ H80 f21864a;

        public C5051a(H80 h80) {
            this.f21864a = h80;
        }

        /* renamed from: a */
        public final void m96515a(Throwable th) {
            try {
                this.f21864a.mo1283a(C34226Le3.this, th);
            } catch (Throwable th2) {
                C34031Ki6.m98465s(th2);
                th2.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            m96515a(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                try {
                    this.f21864a.mo1282b(C34226Le3.this, C34226Le3.this.m96516g(response));
                } catch (Throwable th) {
                    C34031Ki6.m98465s(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C34031Ki6.m98465s(th2);
                m96515a(th2);
            }
        }
    }

    /* renamed from: Le3$b */
    /* loaded from: classes8.dex */
    public static final class C5052b extends ResponseBody {

        /* renamed from: b */
        public final ResponseBody f21866b;

        /* renamed from: c */
        public final InterfaceC46046o30 f21867c;

        /* renamed from: d */
        public IOException f21868d;

        /* renamed from: Le3$b$a */
        /* loaded from: classes8.dex */
        public class C5053a extends AbstractC35331Px1 {
            public C5053a(AN5 an5) {
                super(an5);
            }

            @Override // p000.AbstractC35331Px1, p000.AN5
            public long read(C42488i30 c42488i30, long j) throws IOException {
                try {
                    return super.read(c42488i30, j);
                } catch (IOException e) {
                    C5052b.this.f21868d = e;
                    throw e;
                }
            }
        }

        public C5052b(ResponseBody responseBody) {
            this.f21866b = responseBody;
            this.f21867c = C34928Oe3.m91759d(new C5053a(responseBody.source()));
        }

        /* renamed from: a */
        public void m96514a() throws IOException {
            IOException iOException = this.f21868d;
            if (iOException == null) {
                return;
            }
            throw iOException;
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f21866b.close();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.f21866b.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.f21866b.contentType();
        }

        @Override // okhttp3.ResponseBody
        public InterfaceC46046o30 source() {
            return this.f21867c;
        }
    }

    /* renamed from: Le3$c */
    /* loaded from: classes8.dex */
    public static final class C5054c extends ResponseBody {

        /* renamed from: b */
        public final MediaType f21870b;

        /* renamed from: c */
        public final long f21871c;

        public C5054c(MediaType mediaType, long j) {
            this.f21870b = mediaType;
            this.f21871c = j;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.f21871c;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.f21870b;
        }

        @Override // okhttp3.ResponseBody
        public InterfaceC46046o30 source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C34226Le3(KI4 ki4, Object[] objArr, Call.Factory factory, InterfaceC48496sB0<ResponseBody, T> interfaceC48496sB0) {
        this.f21856b = ki4;
        this.f21857c = objArr;
        this.f21858d = factory;
        this.f21859e = interfaceC48496sB0;
    }

    @Override // p000.InterfaceC51431x80
    /* renamed from: E0 */
    public void mo1284E0(H80<T> h80) {
        Call call;
        Throwable th;
        Objects.requireNonNull(h80, "callback == null");
        synchronized (this) {
            if (!this.f21863i) {
                this.f21863i = true;
                call = this.f21861g;
                th = this.f21862h;
                if (call == null && th == null) {
                    Call m96518e = m96518e();
                    this.f21861g = m96518e;
                    call = m96518e;
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            h80.mo1283a(this, th);
            return;
        }
        if (this.f21860f) {
            call.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call, new C5051a(h80));
    }

    @Override // p000.InterfaceC51431x80
    public void cancel() {
        Call call;
        this.f21860f = true;
        synchronized (this) {
            call = this.f21861g;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // p000.InterfaceC51431x80
    /* renamed from: d */
    public C34226Le3<T> mo116227clone() {
        return new C34226Le3<>(this.f21856b, this.f21857c, this.f21858d, this.f21859e);
    }

    /* renamed from: e */
    public final Call m96518e() throws IOException {
        Call newCall = this.f21858d.newCall(this.f21856b.m99035a(this.f21857c));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // p000.InterfaceC51431x80
    public HM4<T> execute() throws IOException {
        Call m96517f;
        synchronized (this) {
            if (!this.f21863i) {
                this.f21863i = true;
                m96517f = m96517f();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f21860f) {
            m96517f.cancel();
        }
        return m96516g(FirebasePerfOkHttpClient.execute(m96517f));
    }

    /* renamed from: f */
    public final Call m96517f() throws IOException {
        Call call = this.f21861g;
        if (call != null) {
            return call;
        }
        Throwable th = this.f21862h;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw ((IOException) th);
        }
        try {
            Call m96518e = m96518e();
            this.f21861g = m96518e;
            return m96518e;
        } catch (IOException | Error | RuntimeException e) {
            C34031Ki6.m98465s(e);
            this.f21862h = e;
            throw e;
        }
    }

    /* renamed from: g */
    public HM4<T> m96516g(Response response) throws IOException {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new C5054c(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code >= 200 && code < 300) {
            if (code != 204 && code != 205) {
                C5052b c5052b = new C5052b(body);
                try {
                    return HM4.m103934k(this.f21859e.convert(c5052b), build);
                } catch (RuntimeException e) {
                    c5052b.m96514a();
                    throw e;
                }
            }
            body.close();
            return HM4.m103934k(null, build);
        }
        try {
            return HM4.m103941d(C34031Ki6.m98483a(body), build);
        } finally {
            body.close();
        }
    }

    @Override // p000.InterfaceC51431x80
    public boolean isCanceled() {
        boolean z = true;
        if (this.f21860f) {
            return true;
        }
        synchronized (this) {
            Call call = this.f21861g;
            if (call == null || !call.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.InterfaceC51431x80
    public synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return m96517f().request();
    }
}
