package p000;

import android.util.Size;
/* renamed from: DV5 */
/* loaded from: classes.dex */
public abstract class DV5 {

    /* renamed from: DV5$a */
    /* loaded from: classes.dex */
    public enum EnumC1499a {
        VGA(0),
        s720p(5),
        PREVIEW(1),
        s1440p(6),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);
        

        /* renamed from: b */
        public final int f5799b;

        EnumC1499a(int i) {
            this.f5799b = i;
        }

        /* renamed from: b */
        public int m110344b() {
            return this.f5799b;
        }
    }

    /* renamed from: DV5$b */
    /* loaded from: classes.dex */
    public enum EnumC1500b {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    /* renamed from: a */
    public static DV5 m110349a(EnumC1500b enumC1500b, EnumC1499a enumC1499a) {
        return new C25037ju(enumC1500b, enumC1499a);
    }

    /* renamed from: d */
    public static EnumC1500b m110348d(int i) {
        if (i == 35) {
            return EnumC1500b.YUV;
        }
        if (i == 256) {
            return EnumC1500b.JPEG;
        }
        if (i == 32) {
            return EnumC1500b.RAW;
        }
        return EnumC1500b.PRIV;
    }

    /* renamed from: f */
    public static DV5 m110346f(boolean z, int i, Size size, AbstractC44540lW5 abstractC44540lW5, Size size2) {
        int i2;
        EnumC1500b m110348d = m110348d(i);
        EnumC1499a enumC1499a = EnumC1499a.NOT_SUPPORT;
        int m102817a = IB5.m102817a(size);
        if (z) {
            if (size2 != null) {
                i2 = IB5.m102817a(size2);
            } else {
                i2 = 0;
            }
            if (m102817a <= Math.min(i2, IB5.m102817a(abstractC44540lW5.mo22216f()))) {
                enumC1499a = EnumC1499a.s720p;
            } else if (m102817a <= Math.min(i2, IB5.m102817a(abstractC44540lW5.mo22217e()))) {
                enumC1499a = EnumC1499a.s1440p;
            }
        } else if (m102817a <= IB5.m102817a(abstractC44540lW5.mo22220b())) {
            enumC1499a = EnumC1499a.VGA;
        } else if (m102817a <= IB5.m102817a(abstractC44540lW5.mo22219c())) {
            enumC1499a = EnumC1499a.PREVIEW;
        } else if (m102817a <= IB5.m102817a(abstractC44540lW5.mo22218d())) {
            enumC1499a = EnumC1499a.RECORD;
        } else {
            enumC1499a = EnumC1499a.MAXIMUM;
        }
        return m110349a(m110348d, enumC1499a);
    }

    /* renamed from: b */
    public abstract EnumC1499a mo29774b();

    /* renamed from: c */
    public abstract EnumC1500b mo29773c();

    /* renamed from: e */
    public final boolean m110347e(DV5 dv5) {
        EnumC1500b mo29773c = dv5.mo29773c();
        if (dv5.mo29774b().m110344b() <= mo29774b().m110344b() && mo29773c == mo29773c()) {
            return true;
        }
        return false;
    }
}
