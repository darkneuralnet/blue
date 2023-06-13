package p000;

import okhttp3.OkHttpClient;
/* renamed from: q63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47265q63 implements InterfaceC48812sj1<OkHttpClient> {

    /* renamed from: a */
    public final P43 f104703a;

    /* renamed from: b */
    public final Y94<OkHttpClient> f104704b;

    /* renamed from: c */
    public final Y94<InterfaceC6181Op> f104705c;

    public C47265q63(P43 p43, Y94<OkHttpClient> y94, Y94<InterfaceC6181Op> y942) {
        this.f104703a = p43;
        this.f104704b = y94;
        this.f104705c = y942;
    }

    /* renamed from: a */
    public static C47265q63 m18168a(P43 p43, Y94<OkHttpClient> y94, Y94<InterfaceC6181Op> y942) {
        return new C47265q63(p43, y94, y942);
    }

    /* renamed from: c */
    public static OkHttpClient m18166c(P43 p43, OkHttpClient okHttpClient, InterfaceC6181Op interfaceC6181Op) {
        return (OkHttpClient) C51679xZ3.m5002e(p43.m91010D0(okHttpClient, interfaceC6181Op));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public OkHttpClient get() {
        return m18166c(this.f104703a, this.f104704b.get(), this.f104705c.get());
    }
}
