package p000;

import okhttp3.OkHttpClient;
import p000.MN4;
/* renamed from: g73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41345g73 implements InterfaceC48812sj1<MN4.C5282b> {

    /* renamed from: a */
    public final P43 f81641a;

    /* renamed from: b */
    public final Y94<OkHttpClient> f81642b;

    /* renamed from: c */
    public final Y94<C51174wi2> f81643c;

    public C41345g73(P43 p43, Y94<OkHttpClient> y94, Y94<C51174wi2> y942) {
        this.f81641a = p43;
        this.f81642b = y94;
        this.f81643c = y942;
    }

    /* renamed from: a */
    public static C41345g73 m39990a(P43 p43, Y94<OkHttpClient> y94, Y94<C51174wi2> y942) {
        return new C41345g73(p43, y94, y942);
    }

    /* renamed from: c */
    public static MN4.C5282b m39988c(P43 p43, OkHttpClient okHttpClient, C51174wi2 c51174wi2) {
        return (MN4.C5282b) C51679xZ3.m5002e(p43.m90894v1(okHttpClient, c51174wi2));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4.C5282b get() {
        return m39988c(this.f81641a, this.f81642b.get(), this.f81643c.get());
    }
}
