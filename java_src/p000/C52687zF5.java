package p000;

import android.content.Context;
/* renamed from: zF5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52687zF5 {

    /* renamed from: a */
    public final Y94<Context> f121021a;

    /* renamed from: b */
    public final Y94<InterfaceC42042hI5> f121022b;

    public C52687zF5(Y94<Context> y94, Y94<InterfaceC42042hI5> y942) {
        this.f121021a = y94;
        this.f121022b = y942;
    }

    /* renamed from: a */
    public static C52687zF5 m1594a(Y94<Context> y94, Y94<InterfaceC42042hI5> y942) {
        return new C52687zF5(y94, y942);
    }

    /* renamed from: c */
    public static C52094yF5 m1592c(Context context, InterfaceC42042hI5 interfaceC42042hI5, ZC0 zc0, C48528sE5 c48528sE5, boolean z) {
        return new C52094yF5(context, interfaceC42042hI5, zc0, c48528sE5, z);
    }

    /* renamed from: b */
    public C52094yF5 m1593b(ZC0 zc0, C48528sE5 c48528sE5, boolean z) {
        return m1592c(this.f121021a.get(), this.f121022b.get(), zc0, c48528sE5, z);
    }
}
