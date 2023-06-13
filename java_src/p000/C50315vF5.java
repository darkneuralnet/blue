package p000;

import android.content.Context;
/* renamed from: vF5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50315vF5 {

    /* renamed from: a */
    public final Y94<Context> f113774a;

    /* renamed from: b */
    public final Y94<InterfaceC42042hI5> f113775b;

    public C50315vF5(Y94<Context> y94, Y94<InterfaceC42042hI5> y942) {
        this.f113774a = y94;
        this.f113775b = y942;
    }

    /* renamed from: a */
    public static C50315vF5 m8947a(Y94<Context> y94, Y94<InterfaceC42042hI5> y942) {
        return new C50315vF5(y94, y942);
    }

    /* renamed from: c */
    public static C49723uF5 m8945c(Context context, InterfaceC42042hI5 interfaceC42042hI5, ZC0 zc0, C48528sE5 c48528sE5, boolean z) {
        return new C49723uF5(context, interfaceC42042hI5, zc0, c48528sE5, z);
    }

    /* renamed from: b */
    public C49723uF5 m8946b(ZC0 zc0, C48528sE5 c48528sE5, boolean z) {
        return m8945c(this.f113774a.get(), this.f113775b.get(), zc0, c48528sE5, z);
    }
}
