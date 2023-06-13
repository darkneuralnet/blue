package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C38600bX3;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b2\u00103J7\u0010\f\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J7\u0010\u000e\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040%8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010*R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, m28432d2 = {"LE83;", "LR83;", "", "LiX3;", "LjX3;", "changes", "Lnm2;", "parentCoordinates", "Lt62;", "internalPointerEvent", "", "isInBounds", "f", "e", C17296a.f69688o, "", DateTokenConverter.CONVERTER_KEY, "m", "b", "", "toString", "LYW3;", "oldEvent", "newEvent", "l", "i", "LrX3;", "LrX3;", "k", "()LrX3;", "pointerInputNode", "LLX2;", "c", "LLX2;", "j", "()LLX2;", "pointerIds", "", "Ljava/util/Map;", "relevantChanges", "Lnm2;", "coordinates", "LYW3;", "pointerEvent", "g", "Z", "wasIn", "h", "isIn", "hasExited", "<init>", "(LrX3;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,538:1\n486#1,5:542\n493#1:558\n486#1,5:559\n493#1:575\n1182#2:539\n1161#2,2:540\n460#3,11:547\n460#3,11:564\n48#3:582\n523#3:583\n460#3,11:593\n33#4,6:576\n116#4,2:584\n33#4,6:586\n118#4:592\n33#4,6:604\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n292#1:542,5\n292#1:558\n326#1:559,5\n326#1:575\n263#1:539\n263#1:540,2\n300#1:547,11\n334#1:564,11\n407#1:582\n408#1:583\n504#1:593,11\n377#1:576,6\n415#1:584,2\n415#1:586,6\n415#1:592\n519#1:604,6\n*E\n"})
/* renamed from: E83 */
/* loaded from: classes.dex */
public final class E83 extends R83 {

    /* renamed from: b */
    public final InterfaceC48105rX3 f7006b;

    /* renamed from: c */
    public final LX2<C42768iX3> f7007c;

    /* renamed from: d */
    public final Map<C42768iX3, C43361jX3> f7008d;

    /* renamed from: e */
    public InterfaceC45879nm2 f7009e;

    /* renamed from: f */
    public YW3 f7010f;

    /* renamed from: g */
    public boolean f7011g;

    /* renamed from: h */
    public boolean f7012h;

    /* renamed from: i */
    public boolean f7013i;

    public E83(InterfaceC48105rX3 pointerInputNode) {
        Intrinsics.checkNotNullParameter(pointerInputNode, "pointerInputNode");
        this.f7006b = pointerInputNode;
        this.f7007c = new LX2<>(new C42768iX3[16], 0);
        this.f7008d = new LinkedHashMap();
        this.f7012h = true;
        this.f7013i = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x017f  */
    @Override // p000.R83
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo87248a(Map<C42768iX3, C43361jX3> changes, InterfaceC45879nm2 parentCoordinates, C49042t62 internalPointerEvent, boolean z) {
        List list;
        C43361jX3 c43361jX3;
        boolean z2;
        boolean z3;
        InterfaceC45879nm2 interfaceC45879nm2;
        int m74942f;
        C38600bX3.C12404a c12404a;
        int m64472b;
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        boolean mo87248a = super.mo87248a(changes, parentCoordinates, internalPointerEvent, z);
        if (!C48697sX3.m14085b(this.f7006b)) {
            return true;
        }
        this.f7009e = C48697sX3.m14086a(this.f7006b);
        Iterator<Map.Entry<C42768iX3, C43361jX3>> it = changes.entrySet().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<C42768iX3, C43361jX3> next = it.next();
            long m33831g = next.getKey().m33831g();
            C43361jX3 value = next.getValue();
            if (this.f7007c.m96695j(C42768iX3.m33837a(m33831g))) {
                ArrayList arrayList = new ArrayList();
                List<PM1> m30361d = value.m30361d();
                for (int size = m30361d.size(); i < size; size = size) {
                    PM1 pm1 = m30361d.get(i);
                    long m90443b = pm1.m90443b();
                    InterfaceC45879nm2 interfaceC45879nm22 = this.f7009e;
                    Intrinsics.checkNotNull(interfaceC45879nm22);
                    arrayList.add(new PM1(m90443b, interfaceC45879nm22.mo23187X(parentCoordinates, pm1.m90444a()), null));
                    i++;
                    m30361d = m30361d;
                }
                Map<C42768iX3, C43361jX3> map = this.f7008d;
                C42768iX3 m33837a = C42768iX3.m33837a(m33831g);
                InterfaceC45879nm2 interfaceC45879nm23 = this.f7009e;
                Intrinsics.checkNotNull(interfaceC45879nm23);
                long mo23187X = interfaceC45879nm23.mo23187X(parentCoordinates, value.m30356i());
                InterfaceC45879nm2 interfaceC45879nm24 = this.f7009e;
                Intrinsics.checkNotNull(interfaceC45879nm24);
                map.put(m33837a, C43361jX3.m30362c(value, 0L, 0L, interfaceC45879nm24.mo23187X(parentCoordinates, value.m30359f()), false, 0L, mo23187X, false, 0, arrayList, 0L, 731, null));
            }
        }
        if (this.f7008d.isEmpty()) {
            this.f7007c.m96696h();
            m87242g().m96696h();
            return true;
        }
        for (int m96690u = this.f7007c.m96690u() - 1; -1 < m96690u; m96690u--) {
            if (!changes.containsKey(C42768iX3.m33837a(this.f7007c.m96691s()[m96690u].m33831g()))) {
                this.f7007c.m96707C(m96690u);
            }
        }
        list = CollectionsKt___CollectionsKt.toList(this.f7008d.values());
        YW3 yw3 = new YW3(list, internalPointerEvent);
        List<C43361jX3> m74945c = yw3.m74945c();
        int size2 = m74945c.size();
        int i2 = 0;
        while (true) {
            if (i2 < size2) {
                c43361jX3 = m74945c.get(i2);
                if (internalPointerEvent.m13074d(c43361jX3.m30360e())) {
                    break;
                }
                i2++;
            } else {
                c43361jX3 = null;
                break;
            }
        }
        C43361jX3 c43361jX32 = c43361jX3;
        if (c43361jX32 != null) {
            if (!z) {
                this.f7012h = false;
            } else if (!this.f7012h && (c43361jX32.m30358g() || c43361jX32.m30355j())) {
                Intrinsics.checkNotNull(this.f7009e);
                z2 = true;
                this.f7012h = !ZW3.m72994e(c43361jX32, interfaceC45879nm2.mo23186a());
                if (this.f7012h != this.f7011g) {
                    int m74942f2 = yw3.m74942f();
                    C38600bX3.C12404a c12404a2 = C38600bX3.f57620a;
                    if (C38600bX3.m64474i(m74942f2, c12404a2.m64471c()) || C38600bX3.m64474i(yw3.m74942f(), c12404a2.m64473a()) || C38600bX3.m64474i(yw3.m74942f(), c12404a2.m64472b())) {
                        if (this.f7012h) {
                            m64472b = c12404a2.m64473a();
                        } else {
                            m64472b = c12404a2.m64472b();
                        }
                        yw3.m74941g(m64472b);
                    }
                }
                m74942f = yw3.m74942f();
                c12404a = C38600bX3.f57620a;
                if (!C38600bX3.m64474i(m74942f, c12404a.m64473a()) && this.f7011g && !this.f7013i) {
                    yw3.m74941g(c12404a.m64471c());
                } else if (C38600bX3.m64474i(yw3.m74942f(), c12404a.m64472b()) && this.f7012h && c43361jX32.m30358g()) {
                    yw3.m74941g(c12404a.m64471c());
                }
            }
            z2 = true;
            if (this.f7012h != this.f7011g) {
            }
            m74942f = yw3.m74942f();
            c12404a = C38600bX3.f57620a;
            if (!C38600bX3.m64474i(m74942f, c12404a.m64473a())) {
            }
            if (C38600bX3.m64474i(yw3.m74942f(), c12404a.m64472b())) {
                yw3.m74941g(c12404a.m64471c());
            }
        } else {
            z2 = true;
        }
        if (!mo87248a && C38600bX3.m64474i(yw3.m74942f(), C38600bX3.f57620a.m64471c()) && !m109346l(this.f7010f, yw3)) {
            z3 = false;
        } else {
            z3 = z2;
        }
        this.f7010f = yw3;
        return z3;
    }

    @Override // p000.R83
    /* renamed from: b */
    public void mo87247b(C49042t62 internalPointerEvent) {
        boolean z;
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        super.mo87247b(internalPointerEvent);
        YW3 yw3 = this.f7010f;
        if (yw3 == null) {
            return;
        }
        this.f7011g = this.f7012h;
        List<C43361jX3> m74945c = yw3.m74945c();
        int size = m74945c.size();
        for (int i = 0; i < size; i++) {
            C43361jX3 c43361jX3 = m74945c.get(i);
            if (!c43361jX3.m30358g() && (!internalPointerEvent.m13074d(c43361jX3.m30360e()) || !this.f7012h)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f7007c.m96709A(C42768iX3.m33837a(c43361jX3.m30360e()));
            }
        }
        this.f7012h = false;
        this.f7013i = C38600bX3.m64474i(yw3.m74942f(), C38600bX3.f57620a.m64472b());
    }

    @Override // p000.R83
    /* renamed from: d */
    public void mo87245d() {
        LX2<E83> m87242g = m87242g();
        int m96690u = m87242g.m96690u();
        if (m96690u > 0) {
            E83[] m96691s = m87242g.m96691s();
            int i = 0;
            do {
                m96691s[i].mo87245d();
                i++;
            } while (i < m96690u);
            this.f7006b.mo15817o();
        }
        this.f7006b.mo15817o();
    }

    @Override // p000.R83
    /* renamed from: e */
    public boolean mo87244e(C49042t62 internalPointerEvent) {
        LX2<E83> m87242g;
        int m96690u;
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        boolean z = false;
        int i = 0;
        z = false;
        if (!this.f7008d.isEmpty() && C48697sX3.m14085b(this.f7006b)) {
            YW3 yw3 = this.f7010f;
            Intrinsics.checkNotNull(yw3);
            InterfaceC45879nm2 interfaceC45879nm2 = this.f7009e;
            Intrinsics.checkNotNull(interfaceC45879nm2);
            this.f7006b.mo15816q(yw3, EnumC38007aX3.Final, interfaceC45879nm2.mo23186a());
            if (C48697sX3.m14085b(this.f7006b) && (m96690u = (m87242g = m87242g()).m96690u()) > 0) {
                E83[] m96691s = m87242g.m96691s();
                do {
                    m96691s[i].mo87244e(internalPointerEvent);
                    i++;
                } while (i < m96690u);
                z = true;
            } else {
                z = true;
            }
        }
        mo87247b(internalPointerEvent);
        m109349i();
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    @Override // p000.R83
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo87243f(Map<C42768iX3, C43361jX3> changes, InterfaceC45879nm2 parentCoordinates, C49042t62 internalPointerEvent, boolean z) {
        LX2<E83> m87242g;
        int m96690u;
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        int i = 0;
        if (this.f7008d.isEmpty() || !C48697sX3.m14085b(this.f7006b)) {
            return false;
        }
        YW3 yw3 = this.f7010f;
        Intrinsics.checkNotNull(yw3);
        InterfaceC45879nm2 interfaceC45879nm2 = this.f7009e;
        Intrinsics.checkNotNull(interfaceC45879nm2);
        long mo23186a = interfaceC45879nm2.mo23186a();
        this.f7006b.mo15816q(yw3, EnumC38007aX3.Initial, mo23186a);
        if (C48697sX3.m14085b(this.f7006b) && (m96690u = (m87242g = m87242g()).m96690u()) > 0) {
            E83[] m96691s = m87242g.m96691s();
            do {
                Map<C42768iX3, C43361jX3> map = this.f7008d;
                InterfaceC45879nm2 interfaceC45879nm22 = this.f7009e;
                Intrinsics.checkNotNull(interfaceC45879nm22);
                m96691s[i].mo87243f(map, interfaceC45879nm22, internalPointerEvent, z);
                i++;
            } while (i < m96690u);
            if (C48697sX3.m14085b(this.f7006b)) {
            }
            return true;
        }
        if (C48697sX3.m14085b(this.f7006b)) {
            this.f7006b.mo15816q(yw3, EnumC38007aX3.Main, mo23186a);
        }
        return true;
    }

    /* renamed from: i */
    public final void m109349i() {
        this.f7008d.clear();
        this.f7009e = null;
    }

    /* renamed from: j */
    public final LX2<C42768iX3> m109348j() {
        return this.f7007c;
    }

    /* renamed from: k */
    public final InterfaceC48105rX3 m109347k() {
        return this.f7006b;
    }

    /* renamed from: l */
    public final boolean m109346l(YW3 yw3, YW3 yw32) {
        if (yw3 == null || yw3.m74945c().size() != yw32.m74945c().size()) {
            return true;
        }
        int size = yw32.m74945c().size();
        for (int i = 0; i < size; i++) {
            if (!C32120Ce3.m111947l(yw3.m74945c().get(i).m30359f(), yw32.m74945c().get(i).m30359f())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final void m109345m() {
        this.f7012h = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.f7006b + ", children=" + m87242g() + ", pointerIds=" + this.f7007c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
