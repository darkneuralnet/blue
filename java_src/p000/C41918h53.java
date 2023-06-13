package p000;

import android.content.Context;
import okhttp3.OkHttpClient;
/* renamed from: h53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41918h53 implements InterfaceC48812sj1<OkHttpClient> {

    /* renamed from: a */
    public final P43 f84695a;

    /* renamed from: b */
    public final Y94<Context> f84696b;

    public C41918h53(P43 p43, Y94<Context> y94) {
        this.f84695a = p43;
        this.f84696b = y94;
    }

    /* renamed from: a */
    public static C41918h53 m36860a(P43 p43, Y94<Context> y94) {
        return new C41918h53(p43, y94);
    }

    /* renamed from: c */
    public static OkHttpClient m36858c(P43 p43, Context context) {
        return (OkHttpClient) C51679xZ3.m5002e(p43.m90905s(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public OkHttpClient get() {
        return m36858c(this.f84695a, this.f84696b.get());
    }
}
