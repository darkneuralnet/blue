package p000;

import android.content.Context;
import okhttp3.OkHttpClient;
/* renamed from: U53 */
/* loaded from: classes4.dex */
public final class U53 implements InterfaceC48812sj1<InterfaceC39622dD1> {

    /* renamed from: a */
    public final P43 f36831a;

    /* renamed from: b */
    public final Y94<Context> f36832b;

    /* renamed from: c */
    public final Y94<OkHttpClient> f36833c;

    /* renamed from: d */
    public final Y94<C51174wi2> f36834d;

    public U53(P43 p43, Y94<Context> y94, Y94<OkHttpClient> y942, Y94<C51174wi2> y943) {
        this.f36831a = p43;
        this.f36832b = y94;
        this.f36833c = y942;
        this.f36834d = y943;
    }

    /* renamed from: a */
    public static U53 m81994a(P43 p43, Y94<Context> y94, Y94<OkHttpClient> y942, Y94<C51174wi2> y943) {
        return new U53(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static InterfaceC39622dD1 m81992c(P43 p43, Context context, OkHttpClient okHttpClient, C51174wi2 c51174wi2) {
        return (InterfaceC39622dD1) C51679xZ3.m5002e(p43.m90940g0(context, okHttpClient, c51174wi2));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC39622dD1 get() {
        return m81992c(this.f36831a, this.f36832b.get(), this.f36833c.get(), this.f36834d.get());
    }
}
