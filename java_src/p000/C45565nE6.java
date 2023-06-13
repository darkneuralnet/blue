package p000;

import dagger.MembersInjector;
/* renamed from: nE6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45565nE6 implements MembersInjector<C44972mE6> {

    /* renamed from: a */
    public final Y94<InterfaceC48529sE6> f99669a;

    /* renamed from: b */
    public final Y94<InterfaceC46158oE6> f99670b;

    /* renamed from: b */
    public static void m24111b(C44972mE6 c44972mE6, InterfaceC46158oE6 interfaceC46158oE6) {
        c44972mE6.f97699c = interfaceC46158oE6;
    }

    /* renamed from: c */
    public static void m24110c(C44972mE6 c44972mE6, InterfaceC48529sE6 interfaceC48529sE6) {
        c44972mE6.f97698b = interfaceC48529sE6;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C44972mE6 c44972mE6) {
        m24110c(c44972mE6, this.f99669a.get());
        m24111b(c44972mE6, this.f99670b.get());
    }
}
