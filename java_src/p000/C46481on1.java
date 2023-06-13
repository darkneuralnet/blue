package p000;

import android.content.Context;
/* renamed from: on1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46481on1 implements InterfaceC48812sj1<String> {

    /* renamed from: a */
    public final C43516jn1 f102490a;

    /* renamed from: b */
    public final Y94<Context> f102491b;

    public C46481on1(C43516jn1 c43516jn1, Y94<Context> y94) {
        this.f102490a = c43516jn1;
        this.f102491b = y94;
    }

    /* renamed from: a */
    public static C46481on1 m20497a(C43516jn1 c43516jn1, Y94<Context> y94) {
        return new C46481on1(c43516jn1, y94);
    }

    /* renamed from: c */
    public static String m20495c(C43516jn1 c43516jn1, Context context) {
        return (String) C51679xZ3.m5002e(c43516jn1.m29930e(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public String get() {
        return m20495c(this.f102490a, this.f102491b.get());
    }
}
