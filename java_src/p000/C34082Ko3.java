package p000;

import dagger.MembersInjector;
/* renamed from: Ko3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34082Ko3 implements MembersInjector<C33614Io3> {

    /* renamed from: a */
    public final Y94<C42352hp3> f20241a;

    /* renamed from: b */
    public final Y94<C33146Go3> f20242b;

    /* renamed from: a */
    public static void m98276a(C33614Io3 c33614Io3, C33146Go3 c33146Go3) {
        c33614Io3.f16225c = c33146Go3;
    }

    /* renamed from: c */
    public static void m98274c(C33614Io3 c33614Io3, C42352hp3 c42352hp3) {
        c33614Io3.f16224b = c42352hp3;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(C33614Io3 c33614Io3) {
        m98274c(c33614Io3, this.f20241a.get());
        m98276a(c33614Io3, this.f20242b.get());
    }
}
