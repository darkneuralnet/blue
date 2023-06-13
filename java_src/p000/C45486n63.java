package p000;

import android.content.Context;
import okhttp3.OkHttpClient;
/* renamed from: n63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45486n63 implements InterfaceC48812sj1<OkHttpClient> {

    /* renamed from: a */
    public final P43 f99444a;

    /* renamed from: b */
    public final Y94<Context> f99445b;

    /* renamed from: c */
    public final Y94<OkHttpClient> f99446c;

    /* renamed from: d */
    public final Y94<C47626qj0> f99447d;

    public C45486n63(P43 p43, Y94<Context> y94, Y94<OkHttpClient> y942, Y94<C47626qj0> y943) {
        this.f99444a = p43;
        this.f99445b = y94;
        this.f99446c = y942;
        this.f99447d = y943;
    }

    /* renamed from: a */
    public static C45486n63 m24329a(P43 p43, Y94<Context> y94, Y94<OkHttpClient> y942, Y94<C47626qj0> y943) {
        return new C45486n63(p43, y94, y942, y943);
    }

    /* renamed from: c */
    public static OkHttpClient m24327c(P43 p43, Context context, OkHttpClient okHttpClient, C47626qj0 c47626qj0) {
        return (OkHttpClient) C51679xZ3.m5002e(p43.m91019A0(context, okHttpClient, c47626qj0));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public OkHttpClient get() {
        return m24327c(this.f99444a, this.f99445b.get(), this.f99446c.get(), this.f99447d.get());
    }
}
