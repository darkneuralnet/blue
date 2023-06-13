package p000;

import android.content.Context;
import okhttp3.OkHttpClient;
/* renamed from: f73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40752f73 implements InterfaceC48812sj1<OkHttpClient> {

    /* renamed from: a */
    public final P43 f79486a;

    /* renamed from: b */
    public final Y94<Context> f79487b;

    /* renamed from: c */
    public final Y94<OkHttpClient> f79488c;

    /* renamed from: d */
    public final Y94<C22454gl> f79489d;

    /* renamed from: e */
    public final Y94<InterfaceC0650Bc> f79490e;

    /* renamed from: f */
    public final Y94<AbstractC39873de5> f79491f;

    /* renamed from: g */
    public final Y94<C45444n21> f79492g;

    /* renamed from: h */
    public final Y94<InterfaceC40001dr4> f79493h;

    /* renamed from: i */
    public final Y94<C47626qj0> f79494i;

    public C40752f73(P43 p43, Y94<Context> y94, Y94<OkHttpClient> y942, Y94<C22454gl> y943, Y94<InterfaceC0650Bc> y944, Y94<AbstractC39873de5> y945, Y94<C45444n21> y946, Y94<InterfaceC40001dr4> y947, Y94<C47626qj0> y948) {
        this.f79486a = p43;
        this.f79487b = y94;
        this.f79488c = y942;
        this.f79489d = y943;
        this.f79490e = y944;
        this.f79491f = y945;
        this.f79492g = y946;
        this.f79493h = y947;
        this.f79494i = y948;
    }

    /* renamed from: a */
    public static C40752f73 m41995a(P43 p43, Y94<Context> y94, Y94<OkHttpClient> y942, Y94<C22454gl> y943, Y94<InterfaceC0650Bc> y944, Y94<AbstractC39873de5> y945, Y94<C45444n21> y946, Y94<InterfaceC40001dr4> y947, Y94<C47626qj0> y948) {
        return new C40752f73(p43, y94, y942, y943, y944, y945, y946, y947, y948);
    }

    /* renamed from: c */
    public static OkHttpClient m41993c(P43 p43, Context context, OkHttpClient okHttpClient, C22454gl c22454gl, InterfaceC0650Bc interfaceC0650Bc, AbstractC39873de5 abstractC39873de5, C45444n21 c45444n21, InterfaceC40001dr4 interfaceC40001dr4, C47626qj0 c47626qj0) {
        return (OkHttpClient) C51679xZ3.m5002e(p43.m90900t1(context, okHttpClient, c22454gl, interfaceC0650Bc, abstractC39873de5, c45444n21, interfaceC40001dr4, c47626qj0));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public OkHttpClient get() {
        return m41993c(this.f79486a, this.f79487b.get(), this.f79488c.get(), this.f79489d.get(), this.f79490e.get(), this.f79491f.get(), this.f79492g.get(), this.f79493h.get(), this.f79494i.get());
    }
}
