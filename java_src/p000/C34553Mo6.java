package p000;

import android.util.Size;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p000.C52885zb4;
import p000.InterfaceC44592lc1;
/* renamed from: Mo6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34553Mo6 {

    /* renamed from: a */
    public final Map<C52885zb4, AbstractC52434yp6> f23615a = new LinkedHashMap();

    /* renamed from: b */
    public final TreeMap<Size, C52885zb4> f23616b = new TreeMap<>(new C36194Tp0());

    /* renamed from: c */
    public final AbstractC52434yp6 f23617c;

    /* renamed from: d */
    public final AbstractC52434yp6 f23618d;

    /* renamed from: e */
    public final InterfaceC43999kc1 f23619e;

    public C34553Mo6(InterfaceC33962Kb0 interfaceC33962Kb0) {
        this.f23619e = new ML4(interfaceC33962Kb0.mo98718g(), interfaceC33962Kb0.mo98716k());
        for (C52885zb4 c52885zb4 : C52885zb4.m1058b()) {
            InterfaceC44592lc1 m94774e = m94774e(interfaceC33962Kb0, c52885zb4);
            if (m94774e != null) {
                C33928Jx2.m99533a("VideoCapabilities", "profiles = " + m94774e);
                AbstractC52434yp6 m94770i = m94770i(m94774e);
                if (m94770i == null) {
                    C33928Jx2.m99522l("VideoCapabilities", "EncoderProfiles of quality " + c52885zb4 + " has no video validated profiles.");
                } else {
                    InterfaceC44592lc1.AbstractC25739c mo2519h = m94770i.mo2519h();
                    this.f23616b.put(new Size(mo2519h.mo4511k(), mo2519h.mo4514h()), c52885zb4);
                    this.f23615a.put(c52885zb4, m94770i);
                }
            }
        }
        if (this.f23615a.isEmpty()) {
            C33928Jx2.m99531c("VideoCapabilities", "No supported EncoderProfiles");
            this.f23618d = null;
            this.f23617c = null;
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque(this.f23615a.values());
        this.f23617c = (AbstractC52434yp6) arrayDeque.peekFirst();
        this.f23618d = (AbstractC52434yp6) arrayDeque.peekLast();
    }

    /* renamed from: a */
    public static void m94778a(C52885zb4 c52885zb4) {
        boolean m1059a = C52885zb4.m1059a(c52885zb4);
        HZ3.m103736b(m1059a, "Unknown quality: " + c52885zb4);
    }

    /* renamed from: d */
    public static C34553Mo6 m94775d(InterfaceC33728Jb0 interfaceC33728Jb0) {
        return new C34553Mo6((InterfaceC33962Kb0) interfaceC33728Jb0);
    }

    /* renamed from: b */
    public AbstractC52434yp6 m94777b(Size size) {
        C52885zb4 m94776c = m94776c(size);
        C33928Jx2.m99533a("VideoCapabilities", "Using supported quality of " + m94776c + " for size " + size);
        if (m94776c != C52885zb4.f121580g) {
            AbstractC52434yp6 m94773f = m94773f(m94776c);
            if (m94773f == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
            }
            return m94773f;
        }
        return null;
    }

    /* renamed from: c */
    public C52885zb4 m94776c(Size size) {
        Map.Entry<Size, C52885zb4> ceilingEntry = this.f23616b.ceilingEntry(size);
        if (ceilingEntry != null) {
            return ceilingEntry.getValue();
        }
        Map.Entry<Size, C52885zb4> floorEntry = this.f23616b.floorEntry(size);
        if (floorEntry != null) {
            return floorEntry.getValue();
        }
        return C52885zb4.f121580g;
    }

    /* renamed from: e */
    public final InterfaceC44592lc1 m94774e(InterfaceC33962Kb0 interfaceC33962Kb0, C52885zb4 c52885zb4) {
        HZ3.m103728j(c52885zb4 instanceof C52885zb4.AbstractC31050b, "Currently only support ConstantQuality");
        int mo1056d = ((C52885zb4.AbstractC31050b) c52885zb4).mo1056d();
        if (this.f23619e.mo28796b(mo1056d) && m94771h(interfaceC33962Kb0, c52885zb4)) {
            return this.f23619e.mo28797a(mo1056d);
        }
        return null;
    }

    /* renamed from: f */
    public AbstractC52434yp6 m94773f(C52885zb4 c52885zb4) {
        m94778a(c52885zb4);
        if (c52885zb4 == C52885zb4.f121579f) {
            return this.f23617c;
        }
        if (c52885zb4 == C52885zb4.f121578e) {
            return this.f23618d;
        }
        return this.f23615a.get(c52885zb4);
    }

    /* renamed from: g */
    public List<C52885zb4> m94772g() {
        return new ArrayList(this.f23615a.keySet());
    }

    /* renamed from: h */
    public final boolean m94771h(InterfaceC33962Kb0 interfaceC33962Kb0, C52885zb4 c52885zb4) {
        for (InterfaceC50063up6 interfaceC50063up6 : Q21.m89096b(InterfaceC50063up6.class)) {
            if (interfaceC50063up6 != null && interfaceC50063up6.mo6489b(interfaceC33962Kb0, c52885zb4) && !interfaceC50063up6.mo9692a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public final AbstractC52434yp6 m94770i(InterfaceC44592lc1 interfaceC44592lc1) {
        if (interfaceC44592lc1.mo6190d().isEmpty()) {
            return null;
        }
        return AbstractC52434yp6.m2521f(interfaceC44592lc1);
    }
}
