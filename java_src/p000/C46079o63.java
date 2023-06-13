package p000;

import okhttp3.OkHttpClient;
import p000.MN4;
/* renamed from: o63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46079o63 implements InterfaceC48812sj1<MN4.C5282b> {

    /* renamed from: a */
    public final P43 f101377a;

    /* renamed from: b */
    public final Y94<OkHttpClient> f101378b;

    /* renamed from: c */
    public final Y94<C51174wi2> f101379c;

    public C46079o63(P43 p43, Y94<OkHttpClient> y94, Y94<C51174wi2> y942) {
        this.f101377a = p43;
        this.f101378b = y94;
        this.f101379c = y942;
    }

    /* renamed from: a */
    public static C46079o63 m21781a(P43 p43, Y94<OkHttpClient> y94, Y94<C51174wi2> y942) {
        return new C46079o63(p43, y94, y942);
    }

    /* renamed from: c */
    public static MN4.C5282b m21779c(P43 p43, OkHttpClient okHttpClient, C51174wi2 c51174wi2) {
        return (MN4.C5282b) C51679xZ3.m5002e(p43.m91016B0(okHttpClient, c51174wi2));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4.C5282b get() {
        return m21779c(this.f101377a, this.f101378b.get(), this.f101379c.get());
    }
}
