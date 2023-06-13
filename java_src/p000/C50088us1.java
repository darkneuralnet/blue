package p000;

import dagger.MembersInjector;
/* renamed from: us1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50088us1 implements MembersInjector<C49495ts1> {

    /* renamed from: a */
    public final Y94<C32478Ds1> f113111a;

    /* renamed from: b */
    public static void m9631b(C49495ts1 c49495ts1, C32478Ds1 c32478Ds1) {
        c49495ts1.f111174e = c32478Ds1;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C49495ts1 c49495ts1) {
        m9631b(c49495ts1, this.f113111a.get());
    }
}
