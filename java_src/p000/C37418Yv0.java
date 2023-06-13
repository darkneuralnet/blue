package p000;

import dagger.MembersInjector;
/* renamed from: Yv0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37418Yv0 implements MembersInjector<C37184Xv0> {

    /* renamed from: a */
    public final Y94<C42419hw0> f47624a;

    /* renamed from: b */
    public final Y94<C36950Wv0> f47625b;

    /* renamed from: c */
    public final Y94<C35312Pv0> f47626c;

    /* renamed from: a */
    public static void m74012a(C37184Xv0 c37184Xv0, C36950Wv0 c36950Wv0) {
        c37184Xv0.f44220c = c36950Wv0;
    }

    /* renamed from: b */
    public static void m74011b(C37184Xv0 c37184Xv0, C35312Pv0 c35312Pv0) {
        c37184Xv0.f44221d = c35312Pv0;
    }

    /* renamed from: d */
    public static void m74009d(C37184Xv0 c37184Xv0, C42419hw0 c42419hw0) {
        c37184Xv0.f44219b = c42419hw0;
    }

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(C37184Xv0 c37184Xv0) {
        m74009d(c37184Xv0, this.f47624a.get());
        m74012a(c37184Xv0, this.f47625b.get());
        m74011b(c37184Xv0, this.f47626c.get());
    }
}
