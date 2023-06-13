package p000;
/* renamed from: Bo7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C31980Bo7 implements InterfaceC48868so7 {

    /* renamed from: a */
    public final Im9 f2919a;

    public C31980Bo7(Im9 im9, int i) {
        this.f2919a = im9;
        C44135kp7.m28378a();
    }

    /* renamed from: d */
    public static InterfaceC48868so7 m113467d(Im9 im9) {
        return new C31980Bo7(im9, 0);
    }

    /* renamed from: e */
    public static int m113466e(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // p000.InterfaceC48868so7
    /* renamed from: a */
    public final byte[] mo13615a(int i, boolean z) {
        return ((Om9) this.f2919a.mo42381i()).m2341e();
    }

    @Override // p000.InterfaceC48868so7
    /* renamed from: b */
    public final InterfaceC48868so7 mo13614b(EnumC36858Wk7 enumC36858Wk7) {
        this.f2919a.m101721t(C41132fl9.m40886a(enumC36858Wk7.zza()));
        return this;
    }

    @Override // p000.InterfaceC48868so7
    /* renamed from: c */
    public final InterfaceC48868so7 mo13613c(C32196Cm7 c32196Cm7) {
        C32664Em7 m111706m = c32196Cm7.m111706m();
        Pu9 m86229D = Ru9.m86229D();
        m86229D.m89431r(NR8.m93891b(m111706m.m108378g()));
        m86229D.m89430t(NR8.m93891b(m111706m.m108377h()));
        m86229D.m89441B(NR8.m93891b(null));
        m86229D.m89436I(NR8.m93891b(m111706m.m108375j()));
        m86229D.m89434M(NR8.m93891b(m111706m.m108374k()));
        m86229D.m89440C(NR8.m93891b(null));
        m86229D.m89432q(NR8.m93891b(null));
        m86229D.m89437H(NR8.m93891b(m111706m.m108376i()));
        Boolean m108383b = m111706m.m108383b();
        Boolean bool = Boolean.TRUE;
        m86229D.m89439D(bool.equals(m108383b));
        m86229D.m89438G(bool.equals(m111706m.m108381d()));
        m86229D.m89442A(m113466e(m111706m.m108380e()));
        m86229D.m89435J(m113466e(m111706m.m108379f()));
        AbstractC50453vU8 m108384a = m111706m.m108384a();
        if (m108384a != null) {
            m86229D.m89433p(m108384a);
        }
        this.f2919a.m101722r(m86229D);
        return this;
    }

    @Override // p000.InterfaceC48868so7
    public final int zza() {
        return 0;
    }

    @Override // p000.InterfaceC48868so7
    public final String zzd() {
        Ru9 m91449G = ((Om9) this.f2919a.mo42381i()).m91449G();
        if (!m91449G.m86226G().isEmpty()) {
            return m91449G.m86226G();
        }
        return "NA";
    }
}
