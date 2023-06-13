package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\u0007R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, m28432d2 = {"LQM1;", "", "LiX3;", "pointerId", "", "LrX3;", "pointerInputNodes", "", C17296a.f69688o, "(JLjava/util/List;)V", "Lt62;", "internalPointerEvent", "", "isInBounds", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lnm2;", "Lnm2;", "rootCoordinates", "LR83;", "LR83;", "getRoot$ui_release", "()LR83;", "root", "<init>", "(Lnm2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,538:1\n366#2,12:539\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n*L\n61#1:539,12\n*E\n"})
/* renamed from: QM1 */
/* loaded from: classes.dex */
public final class QM1 {

    /* renamed from: a */
    public final InterfaceC45879nm2 f30242a;

    /* renamed from: b */
    public final R83 f30243b;

    public QM1(InterfaceC45879nm2 rootCoordinates) {
        Intrinsics.checkNotNullParameter(rootCoordinates, "rootCoordinates");
        this.f30242a = rootCoordinates;
        this.f30243b = new R83();
    }

    /* renamed from: a */
    public final void m88647a(long j, List<? extends InterfaceC48105rX3> pointerInputNodes) {
        E83 e83;
        Intrinsics.checkNotNullParameter(pointerInputNodes, "pointerInputNodes");
        R83 r83 = this.f30243b;
        int size = pointerInputNodes.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            InterfaceC48105rX3 interfaceC48105rX3 = pointerInputNodes.get(i);
            if (z) {
                LX2<E83> m87242g = r83.m87242g();
                int m96690u = m87242g.m96690u();
                if (m96690u > 0) {
                    E83[] m96691s = m87242g.m96691s();
                    int i2 = 0;
                    do {
                        e83 = m96691s[i2];
                        if (Intrinsics.areEqual(e83.m109347k(), interfaceC48105rX3)) {
                            break;
                        }
                        i2++;
                    } while (i2 < m96690u);
                    e83 = null;
                } else {
                    e83 = null;
                }
                E83 e832 = e83;
                if (e832 != null) {
                    e832.m109345m();
                    if (!e832.m109348j().m96695j(C42768iX3.m33837a(j))) {
                        e832.m109348j().m96701b(C42768iX3.m33837a(j));
                    }
                    r83 = e832;
                } else {
                    z = false;
                }
            }
            E83 e833 = new E83(interfaceC48105rX3);
            e833.m109348j().m96701b(C42768iX3.m33837a(j));
            r83.m87242g().m96701b(e833);
            r83 = e833;
        }
    }

    /* renamed from: b */
    public final boolean m88646b(C49042t62 internalPointerEvent, boolean z) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        if (!this.f30243b.mo87248a(internalPointerEvent.m13077a(), this.f30242a, internalPointerEvent, z)) {
            return false;
        }
        boolean mo87243f = this.f30243b.mo87243f(internalPointerEvent.m13077a(), this.f30242a, internalPointerEvent, z);
        if (!this.f30243b.mo87244e(internalPointerEvent) && !mo87243f) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void m88645c() {
        this.f30243b.mo87245d();
        this.f30243b.m87246c();
    }

    /* renamed from: d */
    public final void m88644d() {
        this.f30243b.m87241h();
    }
}
