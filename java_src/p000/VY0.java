package p000;

import com.fasterxml.jackson.core.JsonPointer;
import java.util.Iterator;
import java.util.Set;
/* renamed from: VY0 */
/* loaded from: classes6.dex */
public class VY0 implements InterfaceC42265hg6 {

    /* renamed from: a */
    public final String f39213a;

    /* renamed from: b */
    public final RC1 f39214b;

    public VY0(Set<AbstractC49476tq2> set, RC1 rc1) {
        this.f39213a = m79785e(set);
        this.f39214b = rc1;
    }

    /* renamed from: c */
    public static C32711Es0<InterfaceC42265hg6> m79787c() {
        return C32711Es0.m108309e(InterfaceC42265hg6.class).m108292b(C43645k01.m29481m(AbstractC49476tq2.class)).m108288f(new InterfaceC36455Us0() { // from class: UY0
            @Override // p000.InterfaceC36455Us0
            /* renamed from: a */
            public final Object mo1631a(InterfaceC35051Os0 interfaceC35051Os0) {
                InterfaceC42265hg6 m79786d;
                m79786d = VY0.m79786d(interfaceC35051Os0);
                return m79786d;
            }
        }).m108290d();
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC42265hg6 m79786d(InterfaceC35051Os0 interfaceC35051Os0) {
        return new VY0(interfaceC35051Os0.m91274b(AbstractC49476tq2.class), RC1.m87206a());
    }

    /* renamed from: e */
    public static String m79785e(Set<AbstractC49476tq2> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<AbstractC49476tq2> it = set.iterator();
        while (it.hasNext()) {
            AbstractC49476tq2 next = it.next();
            sb.append(next.mo11690b());
            sb.append(JsonPointer.SEPARATOR);
            sb.append(next.mo11689c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // p000.InterfaceC42265hg6
    /* renamed from: a */
    public String mo36101a() {
        if (this.f39214b.m87205b().isEmpty()) {
            return this.f39213a;
        }
        return this.f39213a + ' ' + m79785e(this.f39214b.m87205b());
    }
}
