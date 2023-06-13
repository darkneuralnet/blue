package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a\u0018\u0010\t\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\f\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\r"}, m28432d2 = {"T", "Lkotlin/coroutines/Continuation;", "delegate", "LXc0;", "b", "LWc0;", "Lbx2;", "node", "", "c", "Lo51;", "handle", C17296a.f69688o, "kotlinx-coroutines-core"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: Zc0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C37481Zc0 {
    /* renamed from: a */
    public static final void m72855a(InterfaceC36779Wc0<?> interfaceC36779Wc0, InterfaceC46067o51 interfaceC46067o51) {
        interfaceC36779Wc0.mo76794H(new C48438s51(interfaceC46067o51));
    }

    /* renamed from: b */
    public static final <T> C37013Xc0<T> m72854b(Continuation<? super T> continuation) {
        if (!(continuation instanceof L41)) {
            return new C37013Xc0<>(continuation, 1);
        }
        C37013Xc0<T> m97878i = ((L41) continuation).m97878i();
        if (m97878i != null) {
            if (!m97878i.m76796F()) {
                m97878i = null;
            }
            if (m97878i != null) {
                return m97878i;
            }
        }
        return new C37013Xc0<>(continuation, 2);
    }

    /* renamed from: c */
    public static final void m72853c(InterfaceC36779Wc0<?> interfaceC36779Wc0, C38856bx2 c38856bx2) {
        interfaceC36779Wc0.mo76794H(new C45388mw4(c38856bx2));
    }
}
