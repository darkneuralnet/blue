package p000;

import dagger.MembersInjector;
/* renamed from: c02  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38885c02 implements MembersInjector<C38292b02> {

    /* renamed from: a */
    public final Y94<C41274g02> f59876a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f59877b;

    /* renamed from: b */
    public static void m62040b(C38292b02 c38292b02, C41274g02 c41274g02) {
        c38292b02.f56775b = c41274g02;
    }

    /* renamed from: c */
    public static void m62039c(C38292b02 c38292b02, C36207Tq4 c36207Tq4) {
        c38292b02.f56776c = c36207Tq4;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C38292b02 c38292b02) {
        m62040b(c38292b02, this.f59876a.get());
        m62039c(c38292b02, this.f59877b.get());
    }
}
