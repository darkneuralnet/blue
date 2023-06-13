package p000;

import dagger.MembersInjector;
/* renamed from: Ba3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31850Ba3 implements MembersInjector<C52281ya3> {

    /* renamed from: a */
    public final Y94<C38044ab3> f2533a;

    /* renamed from: b */
    public final Y94<C48724sa3> f2534b;

    /* renamed from: c */
    public final Y94<C34989Ol1> f2535c;

    /* renamed from: d */
    public final Y94<C32415Dl1> f2536d;

    /* renamed from: a */
    public static void m113847a(C52281ya3 c52281ya3, C48724sa3 c48724sa3) {
        c52281ya3.f119760c = c48724sa3;
    }

    /* renamed from: b */
    public static void m113846b(C52281ya3 c52281ya3, C32415Dl1 c32415Dl1) {
        c52281ya3.f119762e = c32415Dl1;
    }

    /* renamed from: c */
    public static void m113845c(C52281ya3 c52281ya3, C34989Ol1 c34989Ol1) {
        c52281ya3.f119761d = c34989Ol1;
    }

    /* renamed from: e */
    public static void m113843e(C52281ya3 c52281ya3, C38044ab3 c38044ab3) {
        c52281ya3.f119759b = c38044ab3;
    }

    @Override // dagger.MembersInjector
    /* renamed from: d */
    public void injectMembers(C52281ya3 c52281ya3) {
        m113843e(c52281ya3, this.f2533a.get());
        m113847a(c52281ya3, this.f2534b.get());
        m113845c(c52281ya3, this.f2535c.get());
        m113846b(c52281ya3, this.f2536d.get());
    }
}
