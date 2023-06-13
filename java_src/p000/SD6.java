package p000;

import dagger.MembersInjector;
/* renamed from: SD6 */
/* loaded from: classes3.dex */
public final class SD6 implements MembersInjector<RD6> {

    /* renamed from: a */
    public final Y94<XD6> f33354a;

    /* renamed from: b */
    public static void m85821b(RD6 rd6, XD6 xd6) {
        rd6.f31749b = xd6;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(RD6 rd6) {
        m85821b(rd6, this.f33354a.get());
    }
}
