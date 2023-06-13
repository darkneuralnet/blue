package p000;

import com.uber.autodispose.ScopeProvider;
/* renamed from: OQ2 */
/* loaded from: classes2.dex */
public final class OQ2 {

    /* renamed from: a */
    public final Y94<InterfaceC23227iO> f26555a;

    /* renamed from: b */
    public final Y94<InterfaceC40001dr4> f26556b;

    public OQ2(Y94<InterfaceC23227iO> y94, Y94<InterfaceC40001dr4> y942) {
        this.f26555a = y94;
        this.f26556b = y942;
    }

    /* renamed from: a */
    public static OQ2 m92321a(Y94<InterfaceC23227iO> y94, Y94<InterfaceC40001dr4> y942) {
        return new OQ2(y94, y942);
    }

    /* renamed from: c */
    public static LQ2 m92319c(InterfaceC23227iO interfaceC23227iO, InterfaceC40001dr4 interfaceC40001dr4, PQ2 pq2, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, C36207Tq4 c36207Tq4) {
        return new LQ2(interfaceC23227iO, interfaceC40001dr4, pq2, scopeProvider, interfaceC40099e13, c36207Tq4);
    }

    /* renamed from: b */
    public LQ2 m92320b(PQ2 pq2, ScopeProvider scopeProvider, InterfaceC40099e13 interfaceC40099e13, C36207Tq4 c36207Tq4) {
        return m92319c(this.f26555a.get(), this.f26556b.get(), pq2, scopeProvider, interfaceC40099e13, c36207Tq4);
    }
}
