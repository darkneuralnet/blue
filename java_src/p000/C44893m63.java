package p000;

import okhttp3.OkHttpClient;
import p000.MN4;
/* renamed from: m63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44893m63 implements InterfaceC48812sj1<MN4.C5282b> {

    /* renamed from: a */
    public final P43 f97356a;

    /* renamed from: b */
    public final Y94<OkHttpClient> f97357b;

    public C44893m63(P43 p43, Y94<OkHttpClient> y94) {
        this.f97356a = p43;
        this.f97357b = y94;
    }

    /* renamed from: a */
    public static C44893m63 m26344a(P43 p43, Y94<OkHttpClient> y94) {
        return new C44893m63(p43, y94);
    }

    /* renamed from: c */
    public static MN4.C5282b m26342c(P43 p43, OkHttpClient okHttpClient) {
        return (MN4.C5282b) C51679xZ3.m5002e(p43.m90883z0(okHttpClient));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4.C5282b get() {
        return m26342c(this.f97356a, this.f97357b.get());
    }
}
