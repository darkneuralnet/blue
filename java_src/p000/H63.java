package p000;

import okhttp3.OkHttpClient;
import p000.MN4;
/* renamed from: H63 */
/* loaded from: classes4.dex */
public final class H63 implements InterfaceC48812sj1<MN4.C5282b> {

    /* renamed from: a */
    public final P43 f12846a;

    /* renamed from: b */
    public final Y94<OkHttpClient> f12847b;

    /* renamed from: c */
    public final Y94<C51174wi2> f12848c;

    public H63(P43 p43, Y94<OkHttpClient> y94, Y94<C51174wi2> y942) {
        this.f12846a = p43;
        this.f12847b = y94;
        this.f12848c = y942;
    }

    /* renamed from: a */
    public static H63 m104403a(P43 p43, Y94<OkHttpClient> y94, Y94<C51174wi2> y942) {
        return new H63(p43, y94, y942);
    }

    /* renamed from: c */
    public static MN4.C5282b m104401c(P43 p43, OkHttpClient okHttpClient, C51174wi2 c51174wi2) {
        return (MN4.C5282b) C51679xZ3.m5002e(p43.m90968V0(okHttpClient, c51174wi2));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4.C5282b get() {
        return m104401c(this.f12846a, this.f12847b.get(), this.f12848c.get());
    }
}
