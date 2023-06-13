package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: QP3 */
/* loaded from: classes2.dex */
public final class QP3 implements PP3 {

    /* renamed from: a */
    public final RP3 f30329a;

    public QP3(RP3 rp3) {
        this.f30329a = rp3;
    }

    /* renamed from: b */
    public static Y94<PP3> m88529b(RP3 rp3) {
        return C39546d52.m44621a(new QP3(rp3));
    }

    @Override // p000.PP3
    /* renamed from: a */
    public OP3 mo88530a(SP3 sp3, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13) {
        return this.f30329a.m86774b(sp3, scopeProvider, interfaceC40099e13);
    }
}
