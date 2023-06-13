package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\f\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J7\u0010\r\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000fJ\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m28432d2 = {"LR83;", "", "", "LiX3;", "LjX3;", "changes", "Lnm2;", "parentCoordinates", "Lt62;", "internalPointerEvent", "", "isInBounds", C17296a.f69688o, "f", "e", "", DateTokenConverter.CONVERTER_KEY, "c", "h", "b", "LLX2;", "LE83;", "LLX2;", "g", "()LLX2;", "children", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,538:1\n1182#2:539\n1161#2,2:540\n460#3,11:542\n460#3,11:553\n460#3,11:564\n460#3,11:575\n523#3:586\n48#3:587\n523#3:588\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n*L\n143#1:539\n143#1:540,2\n152#1:542,11\n182#1:553,11\n201#1:564,11\n212#1:575,11\n228#1:586\n240#1:587\n241#1:588\n*E\n"})
/* renamed from: R83 */
/* loaded from: classes.dex */
public class R83 {

    /* renamed from: a */
    public final LX2<E83> f31599a = new LX2<>(new E83[16], 0);

    /* renamed from: a */
    public boolean mo87248a(Map<C42768iX3, C43361jX3> changes, InterfaceC45879nm2 parentCoordinates, C49042t62 internalPointerEvent, boolean z) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        LX2<E83> lx2 = this.f31599a;
        int m96690u = lx2.m96690u();
        if (m96690u <= 0) {
            return false;
        }
        E83[] m96691s = lx2.m96691s();
        int i = 0;
        boolean z2 = false;
        do {
            if (!m96691s[i].mo87248a(changes, parentCoordinates, internalPointerEvent, z) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
            i++;
        } while (i < m96690u);
        return z2;
    }

    /* renamed from: b */
    public void mo87247b(C49042t62 internalPointerEvent) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        int m96690u = this.f31599a.m96690u();
        while (true) {
            m96690u--;
            if (-1 < m96690u) {
                if (this.f31599a.m96691s()[m96690u].m109348j().m96688w()) {
                    this.f31599a.m96707C(m96690u);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m87246c() {
        this.f31599a.m96696h();
    }

    /* renamed from: d */
    public void mo87245d() {
        LX2<E83> lx2 = this.f31599a;
        int m96690u = lx2.m96690u();
        if (m96690u > 0) {
            E83[] m96691s = lx2.m96691s();
            int i = 0;
            do {
                m96691s[i].mo87245d();
                i++;
            } while (i < m96690u);
        }
    }

    /* renamed from: e */
    public boolean mo87244e(C49042t62 internalPointerEvent) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        LX2<E83> lx2 = this.f31599a;
        int m96690u = lx2.m96690u();
        boolean z = false;
        if (m96690u > 0) {
            E83[] m96691s = lx2.m96691s();
            int i = 0;
            boolean z2 = false;
            do {
                if (!m96691s[i].mo87244e(internalPointerEvent) && !z2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                i++;
            } while (i < m96690u);
            z = z2;
        }
        mo87247b(internalPointerEvent);
        return z;
    }

    /* renamed from: f */
    public boolean mo87243f(Map<C42768iX3, C43361jX3> changes, InterfaceC45879nm2 parentCoordinates, C49042t62 internalPointerEvent, boolean z) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        LX2<E83> lx2 = this.f31599a;
        int m96690u = lx2.m96690u();
        if (m96690u <= 0) {
            return false;
        }
        E83[] m96691s = lx2.m96691s();
        int i = 0;
        boolean z2 = false;
        do {
            if (!m96691s[i].mo87243f(changes, parentCoordinates, internalPointerEvent, z) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
            i++;
        } while (i < m96690u);
        return z2;
    }

    /* renamed from: g */
    public final LX2<E83> m87242g() {
        return this.f31599a;
    }

    /* renamed from: h */
    public final void m87241h() {
        int i = 0;
        while (i < this.f31599a.m96690u()) {
            E83 e83 = this.f31599a.m96691s()[i];
            if (!C48697sX3.m14085b(e83.m109347k())) {
                this.f31599a.m96707C(i);
                e83.mo87245d();
            } else {
                i++;
                e83.m87241h();
            }
        }
    }
}
