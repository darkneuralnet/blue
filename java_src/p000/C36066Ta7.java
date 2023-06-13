package p000;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
/* renamed from: Ta7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36066Ta7 {

    /* renamed from: d */
    public static final C36066Ta7 f35708d = new C36066Ta7(true);

    /* renamed from: a */
    public final C50526vc7 f35709a = new C44598lc7(16);

    /* renamed from: b */
    public boolean f35710b;

    /* renamed from: c */
    public boolean f35711c;

    private C36066Ta7() {
    }

    /* renamed from: a */
    public static int m83382a(EnumC35616Rc7 enumC35616Rc7, int i, Object obj) {
        int mo1072c;
        int m100166a;
        int m100166a2 = AbstractC33726Ja7.m100166a(i << 3);
        if (enumC35616Rc7 == EnumC35616Rc7.f32328m) {
            C46960pb7.m19077e((InterfaceC36075Tb7) obj);
            m100166a2 += m100166a2;
        }
        EnumC35850Sc7 enumC35850Sc7 = EnumC35850Sc7.INT;
        int i2 = 4;
        switch (enumC35616Rc7.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i2 = 8;
                break;
            case 1:
                ((Float) obj).floatValue();
                break;
            case 2:
                i2 = AbstractC33726Ja7.m100165b(((Long) obj).longValue());
                break;
            case 3:
                i2 = AbstractC33726Ja7.m100165b(((Long) obj).longValue());
                break;
            case 4:
                i2 = AbstractC33726Ja7.m100170B(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).longValue();
                i2 = 8;
                break;
            case 6:
                ((Integer) obj).intValue();
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                i2 = 1;
                break;
            case 8:
                if (obj instanceof AbstractC32088Ca7) {
                    mo1072c = ((AbstractC32088Ca7) obj).mo1072c();
                    m100166a = AbstractC33726Ja7.m100166a(mo1072c);
                    i2 = m100166a + mo1072c;
                    break;
                } else {
                    i2 = AbstractC33726Ja7.m100167E((String) obj);
                    break;
                }
            case 9:
                i2 = ((InterfaceC36075Tb7) obj).mo41143d();
                break;
            case 10:
                if (obj instanceof C51702xb7) {
                    mo1072c = ((C51702xb7) obj).m3195a();
                    m100166a = AbstractC33726Ja7.m100166a(mo1072c);
                    i2 = m100166a + mo1072c;
                    break;
                } else {
                    i2 = AbstractC33726Ja7.m100169C((InterfaceC36075Tb7) obj);
                    break;
                }
            case 11:
                if (obj instanceof AbstractC32088Ca7) {
                    mo1072c = ((AbstractC32088Ca7) obj).mo1072c();
                    m100166a = AbstractC33726Ja7.m100166a(mo1072c);
                } else {
                    mo1072c = ((byte[]) obj).length;
                    m100166a = AbstractC33726Ja7.m100166a(mo1072c);
                }
                i2 = m100166a + mo1072c;
                break;
            case 12:
                i2 = AbstractC33726Ja7.m100166a(((Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof InterfaceC42216hb7) {
                    i2 = AbstractC33726Ja7.m100170B(((InterfaceC42216hb7) obj).m36167y());
                    break;
                } else {
                    i2 = AbstractC33726Ja7.m100170B(((Integer) obj).intValue());
                    break;
                }
            case 14:
                ((Integer) obj).intValue();
                break;
            case 15:
                ((Long) obj).longValue();
                i2 = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i2 = AbstractC33726Ja7.m100166a((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i2 = AbstractC33726Ja7.m100165b((longValue >> 63) ^ (longValue + longValue));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return m100166a2 + i2;
    }

    /* renamed from: b */
    public static int m83381b(InterfaceC35832Sa7 interfaceC35832Sa7, Object obj) {
        EnumC35616Rc7 zbd = interfaceC35832Sa7.zbd();
        interfaceC35832Sa7.mo44028y();
        interfaceC35832Sa7.mo44030n0();
        return m83382a(zbd, 32149011, obj);
    }

    /* renamed from: e */
    public static C36066Ta7 m83378e() {
        return f35708d;
    }

    /* renamed from: k */
    public static void m83372k(AbstractC33726Ja7 abstractC33726Ja7, EnumC35616Rc7 enumC35616Rc7, int i, Object obj) throws IOException {
        if (enumC35616Rc7 != EnumC35616Rc7.f32328m) {
            abstractC33726Ja7.mo100145v(i, enumC35616Rc7.m86543y());
            EnumC35850Sc7 enumC35850Sc7 = EnumC35850Sc7.INT;
            switch (enumC35616Rc7.ordinal()) {
                case 0:
                    abstractC33726Ja7.mo100152o(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    abstractC33726Ja7.mo100154m(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    abstractC33726Ja7.mo100141z(((Long) obj).longValue());
                    return;
                case 3:
                    abstractC33726Ja7.mo100141z(((Long) obj).longValue());
                    return;
                case 4:
                    abstractC33726Ja7.mo100150q(((Integer) obj).intValue());
                    return;
                case 5:
                    abstractC33726Ja7.mo100152o(((Long) obj).longValue());
                    return;
                case 6:
                    abstractC33726Ja7.mo100154m(((Integer) obj).intValue());
                    return;
                case 7:
                    abstractC33726Ja7.mo100159h(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case 8:
                    if (obj instanceof AbstractC32088Ca7) {
                        abstractC33726Ja7.mo100156k((AbstractC32088Ca7) obj);
                        return;
                    } else {
                        abstractC33726Ja7.mo100146u((String) obj);
                        return;
                    }
                case 9:
                    ((InterfaceC36075Tb7) obj).mo41137j(abstractC33726Ja7);
                    return;
                case 10:
                    abstractC33726Ja7.mo100148s((InterfaceC36075Tb7) obj);
                    return;
                case 11:
                    if (obj instanceof AbstractC32088Ca7) {
                        abstractC33726Ja7.mo100156k((AbstractC32088Ca7) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    C33258Ha7 c33258Ha7 = (C33258Ha7) abstractC33726Ja7;
                    c33258Ha7.mo100143x(length);
                    c33258Ha7.m103695F(bArr, 0, length);
                    return;
                case 12:
                    abstractC33726Ja7.mo100143x(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof InterfaceC42216hb7) {
                        abstractC33726Ja7.mo100150q(((InterfaceC42216hb7) obj).m36167y());
                        return;
                    } else {
                        abstractC33726Ja7.mo100150q(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    abstractC33726Ja7.mo100154m(((Integer) obj).intValue());
                    return;
                case 15:
                    abstractC33726Ja7.mo100152o(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    abstractC33726Ja7.mo100143x((intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    abstractC33726Ja7.mo100141z((longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        }
        InterfaceC36075Tb7 interfaceC36075Tb7 = (InterfaceC36075Tb7) obj;
        C46960pb7.m19077e(interfaceC36075Tb7);
        abstractC33726Ja7.mo100145v(i, 3);
        interfaceC36075Tb7.mo41137j(abstractC33726Ja7);
        abstractC33726Ja7.mo100145v(i, 4);
    }

    /* renamed from: n */
    public static Object m83369n(Object obj) {
        if (obj instanceof InterfaceC38651bc7) {
            return ((InterfaceC38651bc7) obj).zbc();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: p */
    public static boolean m83367p(Map.Entry entry) {
        InterfaceC35832Sa7 interfaceC35832Sa7 = (InterfaceC35832Sa7) entry.getKey();
        if (interfaceC35832Sa7.mo44033B() != EnumC35850Sc7.MESSAGE) {
            return true;
        }
        interfaceC35832Sa7.mo44030n0();
        Object value = entry.getValue();
        if (value instanceof InterfaceC36309Ub7) {
            return ((InterfaceC36309Ub7) value).mo41142e();
        }
        if (value instanceof C51702xb7) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: q */
    public static final int m83366q(Map.Entry entry) {
        InterfaceC35832Sa7 interfaceC35832Sa7 = (InterfaceC35832Sa7) entry.getKey();
        Object value = entry.getValue();
        if (interfaceC35832Sa7.mo44033B() == EnumC35850Sc7.MESSAGE) {
            interfaceC35832Sa7.mo44030n0();
            interfaceC35832Sa7.mo44031i0();
            if (value instanceof C51702xb7) {
                ((InterfaceC35832Sa7) entry.getKey()).mo44028y();
                Logger logger = AbstractC33726Ja7.f17883b;
                int m3195a = ((C51702xb7) value).m3195a();
                int m100166a = AbstractC33726Ja7.m100166a(m3195a) + m3195a;
                int m100166a2 = AbstractC33726Ja7.m100166a(24);
                int m100166a3 = AbstractC33726Ja7.m100166a(16);
                int m100166a4 = AbstractC33726Ja7.m100166a(8);
                return m100166a4 + m100166a4 + m100166a3 + AbstractC33726Ja7.m100166a(32149011) + m100166a2 + m100166a;
            }
            ((InterfaceC35832Sa7) entry.getKey()).mo44028y();
            int m100166a5 = AbstractC33726Ja7.m100166a(24) + AbstractC33726Ja7.m100169C((InterfaceC36075Tb7) value);
            int m100166a6 = AbstractC33726Ja7.m100166a(16);
            int m100166a7 = AbstractC33726Ja7.m100166a(8);
            return m100166a7 + m100166a7 + m100166a6 + AbstractC33726Ja7.m100166a(32149011) + m100166a5;
        }
        return m83381b(interfaceC35832Sa7, value);
    }

    /* renamed from: c */
    public final int m83380c() {
        int i = 0;
        for (int i2 = 0; i2 < this.f35709a.m8363b(); i2++) {
            i += m83366q(this.f35709a.m8358g(i2));
        }
        for (Map.Entry entry : this.f35709a.m8362c()) {
            i += m83366q(entry);
        }
        return i;
    }

    /* renamed from: d */
    public final C36066Ta7 clone() {
        C36066Ta7 c36066Ta7 = new C36066Ta7();
        for (int i = 0; i < this.f35709a.m8363b(); i++) {
            Map.Entry m8358g = this.f35709a.m8358g(i);
            c36066Ta7.m83373j((InterfaceC35832Sa7) m8358g.getKey(), m8358g.getValue());
        }
        for (Map.Entry entry : this.f35709a.m8362c()) {
            c36066Ta7.m83373j((InterfaceC35832Sa7) entry.getKey(), entry.getValue());
        }
        c36066Ta7.f35711c = this.f35711c;
        return c36066Ta7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36066Ta7)) {
            return false;
        }
        return this.f35709a.equals(((C36066Ta7) obj).f35709a);
    }

    /* renamed from: f */
    public final Object m83377f(InterfaceC35832Sa7 interfaceC35832Sa7) {
        Object obj = this.f35709a.get(interfaceC35832Sa7);
        if (!(obj instanceof C51702xb7)) {
            return obj;
        }
        C51702xb7 c51702xb7 = (C51702xb7) obj;
        throw null;
    }

    /* renamed from: g */
    public final Iterator m83376g() {
        if (this.f35711c) {
            return new C51109wb7(this.f35709a.entrySet().iterator());
        }
        return this.f35709a.entrySet().iterator();
    }

    /* renamed from: h */
    public final void m83375h() {
        if (!this.f35710b) {
            for (int i = 0; i < this.f35709a.m8363b(); i++) {
                Map.Entry m8358g = this.f35709a.m8358g(i);
                if (m8358g.getValue() instanceof AbstractC41030fb7) {
                    ((AbstractC41030fb7) m8358g.getValue()).m41138i();
                }
            }
            this.f35709a.mo8364a();
            this.f35710b = true;
        }
    }

    public final int hashCode() {
        return this.f35709a.hashCode();
    }

    /* renamed from: i */
    public final void m83374i(C36066Ta7 c36066Ta7) {
        for (int i = 0; i < c36066Ta7.f35709a.m8363b(); i++) {
            m83368o(c36066Ta7.f35709a.m8358g(i));
        }
        for (Map.Entry entry : c36066Ta7.f35709a.m8362c()) {
            m83368o(entry);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if ((r7 instanceof p000.InterfaceC42216hb7) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        if ((r7 instanceof byte[]) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if ((r7 instanceof p000.C51702xb7) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m83373j(InterfaceC35832Sa7 interfaceC35832Sa7, Object obj) {
        boolean z;
        interfaceC35832Sa7.mo44030n0();
        EnumC35616Rc7 zbd = interfaceC35832Sa7.zbd();
        Charset charset = C46960pb7.f103839a;
        obj.getClass();
        EnumC35616Rc7 enumC35616Rc7 = EnumC35616Rc7.f32319d;
        EnumC35850Sc7 enumC35850Sc7 = EnumC35850Sc7.INT;
        switch (zbd.m86544a().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if (!(obj instanceof AbstractC32088Ca7)) {
                    break;
                }
                if (obj instanceof C51702xb7) {
                    this.f35711c = true;
                }
                this.f35709a.put(interfaceC35832Sa7, obj);
                return;
            case 7:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof C51702xb7) {
                }
                this.f35709a.put(interfaceC35832Sa7, obj);
                return;
            case 8:
                if (!(obj instanceof InterfaceC36075Tb7)) {
                    break;
                }
                if (obj instanceof C51702xb7) {
                }
                this.f35709a.put(interfaceC35832Sa7, obj);
                return;
            default:
                interfaceC35832Sa7.mo44028y();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 32149011, interfaceC35832Sa7.zbd().m86544a(), obj.getClass().getName()));
        }
    }

    /* renamed from: l */
    public final boolean m83371l() {
        return this.f35710b;
    }

    /* renamed from: m */
    public final boolean m83370m() {
        for (int i = 0; i < this.f35709a.m8363b(); i++) {
            if (!m83367p(this.f35709a.m8358g(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.f35709a.m8362c()) {
            if (!m83367p(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    public final void m83368o(Map.Entry entry) {
        InterfaceC36075Tb7 mo71104s;
        InterfaceC35832Sa7 interfaceC35832Sa7 = (InterfaceC35832Sa7) entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof C51702xb7)) {
            interfaceC35832Sa7.mo44030n0();
            if (interfaceC35832Sa7.mo44033B() == EnumC35850Sc7.MESSAGE) {
                Object m83377f = m83377f(interfaceC35832Sa7);
                if (m83377f == null) {
                    this.f35709a.put(interfaceC35832Sa7, m83369n(value));
                    return;
                }
                if (m83377f instanceof InterfaceC38651bc7) {
                    mo71104s = interfaceC35832Sa7.mo44032Q0((InterfaceC38651bc7) m83377f, (InterfaceC38651bc7) value);
                } else {
                    InterfaceC35841Sb7 mo41140g = ((InterfaceC36075Tb7) m83377f).mo41140g();
                    interfaceC35832Sa7.mo44029x3(mo41140g, (InterfaceC36075Tb7) value);
                    mo71104s = mo41140g.mo71104s();
                }
                this.f35709a.put(interfaceC35832Sa7, mo71104s);
                return;
            }
            this.f35709a.put(interfaceC35832Sa7, m83369n(value));
            return;
        }
        C51702xb7 c51702xb7 = (C51702xb7) value;
        throw null;
    }

    public C36066Ta7(boolean z) {
        m83375h();
        m83375h();
    }
}
