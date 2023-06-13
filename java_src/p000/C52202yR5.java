package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.AbstractC11253p;
import androidx.camera.core.impl.C11209m;
import androidx.camera.core.impl.C11210n;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.InterfaceC11197f;
import androidx.camera.core.impl.InterfaceC11205j;
import androidx.camera.core.impl.InterfaceC11208l;
import androidx.camera.core.impl.InterfaceC11225s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000.InterfaceC36578Vf6;
import p000.LY0;
import p000.YV5;
/* renamed from: yR5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C52202yR5 extends AbstractC11253p {

    /* renamed from: s */
    public static final AR5 f119553s;

    /* renamed from: n */
    public final C51891xu6 f119554n;

    /* renamed from: o */
    public YV5 f119555o;

    /* renamed from: p */
    public YV5 f119556p;

    /* renamed from: q */
    public MV5 f119557q;

    /* renamed from: r */
    public MV5 f119558r;

    static {
        InterfaceC11208l mo1343b = new C52795zR5().mo1343b();
        mo1343b.mo69373C(InterfaceC11205j.f52625k, 34);
        f119553s = new AR5(C11210n.m69366T(mo1343b));
    }

    public C52202yR5(InterfaceC34196Lb0 interfaceC34196Lb0, Set<AbstractC11253p> set, InterfaceC36578Vf6 interfaceC36578Vf6) {
        this(new C51891xu6(interfaceC34196Lb0, set, interfaceC36578Vf6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m3484b0(String str, InterfaceC11225s interfaceC11225s, BR5 br5, C11213q c11213q, C11213q.EnumC11220f enumC11220f) {
        m3489W();
        if (m69047w(str)) {
            m69068S(m3488X(str, interfaceC11225s, br5));
            m69078C();
        }
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: F */
    public void mo3497F() {
        super.mo3497F();
        this.f119554n.m4461m();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.camera.core.impl.s<?>, androidx.camera.core.impl.s] */
    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: H */
    public InterfaceC11225s<?> mo3496H(InterfaceC33962Kb0 interfaceC33962Kb0, InterfaceC11225s.InterfaceC11226a<?, ?, ?> interfaceC11226a) {
        this.f119554n.m4474A(interfaceC11226a.mo1343b());
        return interfaceC11226a.mo1341d();
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: I */
    public void mo3495I() {
        super.mo3495I();
        this.f119554n.m4473B();
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: J */
    public void mo3494J() {
        super.mo3494J();
        this.f119554n.m4472C();
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: K */
    public BR5 mo3493K(BR5 br5) {
        m69068S(m3488X(m69059h(), m69058i(), br5));
        m69080A();
        return br5;
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: L */
    public void mo3492L() {
        super.mo3492L();
        m3489W();
        this.f119554n.m4469F();
    }

    /* renamed from: V */
    public final void m3490V(C11213q.C11215b c11215b, final String str, final InterfaceC11225s<?> interfaceC11225s, final BR5 br5) {
        c11215b.m69338f(new C11213q.InterfaceC11216c() { // from class: xR5
            @Override // androidx.camera.core.impl.C11213q.InterfaceC11216c
            /* renamed from: a */
            public final void mo1277a(C11213q c11213q, C11213q.EnumC11220f enumC11220f) {
                C52202yR5.this.m3484b0(str, interfaceC11225s, br5, c11213q, enumC11220f);
            }
        });
    }

    /* renamed from: W */
    public final void m3489W() {
        MV5 mv5 = this.f119557q;
        if (mv5 != null) {
            mv5.m95266h();
            this.f119557q = null;
        }
        MV5 mv52 = this.f119558r;
        if (mv52 != null) {
            mv52.m95266h();
            this.f119558r = null;
        }
        YV5 yv5 = this.f119556p;
        if (yv5 != null) {
            yv5.m74961h();
            this.f119556p = null;
        }
        YV5 yv52 = this.f119555o;
        if (yv52 != null) {
            yv52.m74961h();
            this.f119555o = null;
        }
    }

    /* renamed from: X */
    public final C11213q m3488X(String str, InterfaceC11225s<?> interfaceC11225s, BR5 br5) {
        O36.m92961a();
        InterfaceC34196Lb0 interfaceC34196Lb0 = (InterfaceC34196Lb0) HZ3.m103731g(m69061f());
        Matrix m69051q = m69051q();
        boolean mo4458q = interfaceC34196Lb0.mo4458q();
        Rect m3486Z = m3486Z(br5.mo31669c());
        Objects.requireNonNull(m3486Z);
        MV5 mv5 = new MV5(3, 34, br5, m69051q, mo4458q, m3486Z, 0, false);
        this.f119557q = mv5;
        this.f119558r = m3485a0(mv5, interfaceC34196Lb0);
        this.f119556p = new YV5(interfaceC34196Lb0, LY0.C5025a.m96644a());
        Map<AbstractC11253p, YV5.AbstractC9796d> m4453v = this.f119554n.m4453v(this.f119558r);
        YV5.C9795c m74957l = this.f119556p.m74957l(YV5.AbstractC9794b.m74954c(this.f119558r, new ArrayList(m4453v.values())));
        HashMap hashMap = new HashMap();
        for (Map.Entry<AbstractC11253p, YV5.AbstractC9796d> entry : m4453v.entrySet()) {
            hashMap.put(entry.getKey(), m74957l.get(entry.getValue()));
        }
        this.f119554n.m4470E(hashMap);
        C11213q.C11215b m69329o = C11213q.C11215b.m69329o(interfaceC11225s, br5.mo31669c());
        m69329o.m69333k(this.f119557q.m95259o());
        m69329o.m69335i(this.f119554n.m4451x());
        m3490V(m69329o, str, interfaceC11225s, br5);
        return m69329o.m69331m();
    }

    /* renamed from: Y */
    public Set<AbstractC11253p> m3487Y() {
        return this.f119554n.m4454u();
    }

    /* renamed from: Z */
    public final Rect m3486Z(Size size) {
        if (m69048v() != null) {
            return m69048v();
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    /* renamed from: a0 */
    public final MV5 m3485a0(MV5 mv5, InterfaceC34196Lb0 interfaceC34196Lb0) {
        if (m69057k() == null) {
            return mv5;
        }
        this.f119555o = new YV5(interfaceC34196Lb0, m69057k().m3212a());
        YV5.AbstractC9796d m74952i = YV5.AbstractC9796d.m74952i(mv5);
        MV5 mv52 = this.f119555o.m74957l(YV5.AbstractC9794b.m74954c(mv5, Collections.singletonList(m74952i))).get(m74952i);
        Objects.requireNonNull(mv52);
        return mv52;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.s<?>, androidx.camera.core.impl.s] */
    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: j */
    public InterfaceC11225s<?> mo3483j(boolean z, InterfaceC36578Vf6 interfaceC36578Vf6) {
        InterfaceC11197f mo25424a = interfaceC36578Vf6.mo25424a(InterfaceC36578Vf6.EnumC8718b.VIDEO_CAPTURE, 1);
        if (z) {
            mo25424a = InterfaceC11197f.m69421N(mo25424a, f119553s.mo1036B());
        }
        if (mo25424a == null) {
            return null;
        }
        return mo3481u(mo25424a).mo1341d();
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: s */
    public Set<Integer> mo3482s() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // androidx.camera.core.AbstractC11253p
    /* renamed from: u */
    public InterfaceC11225s.InterfaceC11226a<?, ?, ?> mo3481u(InterfaceC11197f interfaceC11197f) {
        return new C52795zR5(C11209m.m69371W(interfaceC11197f));
    }

    public C52202yR5(C51891xu6 c51891xu6) {
        super(f119553s);
        this.f119554n = c51891xu6;
    }
}
