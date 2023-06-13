package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a.\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000\u001a.\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b\u001a4\u0010\u000f\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002\u001a4\u0010\u0010\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002\u001a4\u0010\u0011\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002\u001a<\u0010\u0013\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002¨\u0006\u0014"}, m28432d2 = {"", "stiffness", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "", "b", "", C17296a.f69688o, "Lkotlin/Pair;", "Lvs0;", "roots", "p0", "v0", "i", "c", "g", "initialPosition", "f", "animation-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n1#1,318:1\n317#1:319\n317#1:320\n313#1:321\n317#1:322\n317#1:323\n313#1:324\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n141#1:319\n142#1:320\n183#1:321\n211#1:322\n212#1:323\n259#1:324\n*E\n"})
/* renamed from: fO5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40910fO5 {

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"", "t", C17296a.f69688o, "(D)Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fO5$a */
    /* loaded from: classes.dex */
    public static final class C20389a extends Lambda implements Function1<Double, Double> {

        /* renamed from: g */
        public final /* synthetic */ double f80034g;

        /* renamed from: h */
        public final /* synthetic */ double f80035h;

        /* renamed from: i */
        public final /* synthetic */ double f80036i;

        /* renamed from: j */
        public final /* synthetic */ double f80037j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20389a(double d, double d2, double d3, double d4) {
            super(1);
            this.f80034g = d;
            this.f80035h = d2;
            this.f80036i = d3;
            this.f80037j = d4;
        }

        /* renamed from: a */
        public final Double m41444a(double d) {
            return Double.valueOf(((this.f80034g + (this.f80035h * d)) * Math.exp(this.f80036i * d)) + this.f80037j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return m41444a(d.doubleValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"", "t", C17296a.f69688o, "(D)Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fO5$b */
    /* loaded from: classes.dex */
    public static final class C20390b extends Lambda implements Function1<Double, Double> {

        /* renamed from: g */
        public final /* synthetic */ double f80038g;

        /* renamed from: h */
        public final /* synthetic */ double f80039h;

        /* renamed from: i */
        public final /* synthetic */ double f80040i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20390b(double d, double d2, double d3) {
            super(1);
            this.f80038g = d;
            this.f80039h = d2;
            this.f80040i = d3;
        }

        /* renamed from: a */
        public final Double m41443a(double d) {
            double d2 = this.f80038g;
            double d3 = this.f80039h;
            return Double.valueOf(((d2 * ((d3 * d) + 1)) + (this.f80040i * d3)) * Math.exp(d3 * d));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return m41443a(d.doubleValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"", "t", C17296a.f69688o, "(D)Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fO5$c */
    /* loaded from: classes.dex */
    public static final class C20391c extends Lambda implements Function1<Double, Double> {

        /* renamed from: g */
        public final /* synthetic */ double f80041g;

        /* renamed from: h */
        public final /* synthetic */ double f80042h;

        /* renamed from: i */
        public final /* synthetic */ double f80043i;

        /* renamed from: j */
        public final /* synthetic */ double f80044j;

        /* renamed from: k */
        public final /* synthetic */ double f80045k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20391c(double d, double d2, double d3, double d4, double d5) {
            super(1);
            this.f80041g = d;
            this.f80042h = d2;
            this.f80043i = d3;
            this.f80044j = d4;
            this.f80045k = d5;
        }

        /* renamed from: a */
        public final Double m41442a(double d) {
            return Double.valueOf((this.f80041g * Math.exp(this.f80042h * d)) + (this.f80043i * Math.exp(this.f80044j * d)) + this.f80045k);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return m41442a(d.doubleValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"", "t", C17296a.f69688o, "(D)Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fO5$d */
    /* loaded from: classes.dex */
    public static final class C20392d extends Lambda implements Function1<Double, Double> {

        /* renamed from: g */
        public final /* synthetic */ double f80046g;

        /* renamed from: h */
        public final /* synthetic */ double f80047h;

        /* renamed from: i */
        public final /* synthetic */ double f80048i;

        /* renamed from: j */
        public final /* synthetic */ double f80049j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20392d(double d, double d2, double d3, double d4) {
            super(1);
            this.f80046g = d;
            this.f80047h = d2;
            this.f80048i = d3;
            this.f80049j = d4;
        }

        /* renamed from: a */
        public final Double m41441a(double d) {
            double d2 = this.f80046g;
            double d3 = this.f80047h;
            double exp = d2 * d3 * Math.exp(d3 * d);
            double d4 = this.f80048i;
            double d5 = this.f80049j;
            return Double.valueOf(exp + (d4 * d5 * Math.exp(d5 * d)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Double invoke(Double d) {
            return m41441a(d.doubleValue());
        }
    }

    /* renamed from: a */
    public static final long m41453a(double d, double d2, double d3, double d4, double d5) {
        return m41448f(C51272ws0.m6203a(1.0d, 2.0d * d2 * Math.sqrt(d), d), d2, d3, d4, d5);
    }

    /* renamed from: b */
    public static final long m41452b(float f, float f2, float f3, float f4, float f5) {
        return m41453a(f, f2, f3, f4, f5);
    }

    /* renamed from: c */
    public static final double m41451c(Pair<C50679vs0, C50679vs0> pair, double d, double d2, double d3) {
        boolean z;
        boolean z2;
        double d4;
        double d5;
        C20389a c20389a;
        C20390b c20390b;
        double d6;
        double m7908f = pair.getFirst().m7908f();
        double d7 = m7908f * d;
        double d8 = d2 - d7;
        double log = Math.log(Math.abs(d3 / d)) / m7908f;
        double m41450d = m41450d(Math.log(Math.abs(d3 / d8)), m7908f) / m7908f;
        int i = 0;
        if (!Double.isInfinite(log) && !Double.isNaN(log)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            d4 = m41450d;
        } else {
            if (!Double.isInfinite(m41450d) && !Double.isNaN(m41450d)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!(!z2)) {
                log = Math.max(log, m41450d);
            }
            d4 = log;
        }
        double d9 = (-(d7 + d8)) / (m7908f * d8);
        if (!Double.isNaN(d9) && d9 > 0.0d) {
            if (d9 > 0.0d && (-m41449e(d, m7908f, d9, d8)) < d3) {
                if (d8 < 0.0d && d > 0.0d) {
                    d4 = 0.0d;
                }
            } else {
                d4 = (-(2.0d / m7908f)) - (d / d8);
                d5 = d3;
                c20389a = new C20389a(d, d8, m7908f, d5);
                c20390b = new C20390b(d8, m7908f, d);
                d6 = Double.MAX_VALUE;
                while (d6 > 0.001d && i < 100) {
                    i++;
                    double doubleValue = d4 - (c20389a.invoke(Double.valueOf(d4)).doubleValue() / c20390b.invoke(Double.valueOf(d4)).doubleValue());
                    double abs = Math.abs(d4 - doubleValue);
                    d4 = doubleValue;
                    d6 = abs;
                }
                return d4;
            }
        }
        d5 = -d3;
        c20389a = new C20389a(d, d8, m7908f, d5);
        c20390b = new C20390b(d8, m7908f, d);
        d6 = Double.MAX_VALUE;
        while (d6 > 0.001d) {
            i++;
            double doubleValue2 = d4 - (c20389a.invoke(Double.valueOf(d4)).doubleValue() / c20390b.invoke(Double.valueOf(d4)).doubleValue());
            double abs2 = Math.abs(d4 - doubleValue2);
            d4 = doubleValue2;
            d6 = abs2;
        }
        return d4;
    }

    /* renamed from: d */
    public static final double m41450d(double d, double d2) {
        double d3 = d;
        for (int i = 0; i < 6; i++) {
            d3 = d - Math.log(Math.abs(d3 / d2));
        }
        return d3;
    }

    /* renamed from: e */
    public static final double m41449e(double d, double d2, double d3, double d4) {
        double d5 = d2 * d3;
        return (d * Math.exp(d5)) + (d4 * d3 * Math.exp(d5));
    }

    /* renamed from: f */
    public static final long m41448f(Pair<C50679vs0, C50679vs0> pair, double d, double d2, double d3, double d4) {
        boolean z;
        double m41451c;
        int i = (d3 > 0.0d ? 1 : (d3 == 0.0d ? 0 : -1));
        boolean z2 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (d2 != 0.0d) {
                z2 = false;
            }
            if (z2) {
                return 0L;
            }
        }
        if (i < 0) {
            d2 = -d2;
        }
        double d5 = d2;
        double abs = Math.abs(d3);
        if (d > 1.0d) {
            m41451c = m41447g(pair, abs, d5, d4);
        } else if (d < 1.0d) {
            m41451c = m41445i(pair, abs, d5, d4);
        } else {
            m41451c = m41451c(pair, abs, d5, d4);
        }
        return (long) (m41451c * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final double m41447g(Pair<C50679vs0, C50679vs0> pair, double d, double d2, double d3) {
        boolean z;
        boolean z2;
        double d4;
        double d5;
        C20391c c20391c;
        double d6 = d3;
        double m7908f = pair.getFirst().m7908f();
        double m7908f2 = pair.getSecond().m7908f();
        double d7 = m7908f - m7908f2;
        double d8 = ((m7908f * d) - d2) / d7;
        double d9 = d - d8;
        double log = Math.log(Math.abs(d6 / d9)) / m7908f;
        double log2 = Math.log(Math.abs(d6 / d8)) / m7908f2;
        if (!Double.isInfinite(log) && !Double.isNaN(log)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            d4 = log2;
        } else {
            if (!Double.isInfinite(log2) && !Double.isNaN(log2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!(!z2)) {
                log = Math.max(log, log2);
            }
            d4 = log;
        }
        double d10 = d9 * m7908f;
        double log3 = Math.log(d10 / ((-d8) * m7908f2)) / (m7908f2 - m7908f);
        if (!Double.isNaN(log3) && log3 > 0.0d) {
            if (log3 > 0.0d) {
                d5 = d8;
                if ((-m41446h(d9, m7908f, log3, d8, m7908f2)) < d6) {
                    if (d5 > 0.0d && d9 < 0.0d) {
                        d4 = 0.0d;
                    }
                }
            } else {
                d5 = d8;
            }
            d4 = Math.log((-((d5 * m7908f2) * m7908f2)) / (d10 * m7908f)) / d7;
            double d11 = d5;
            c20391c = new C20391c(d9, m7908f, d11, m7908f2, d6);
            C20392d c20392d = new C20392d(d9, m7908f, d11, m7908f2);
            if (Math.abs(c20391c.invoke(Double.valueOf(d4)).doubleValue()) >= 1.0E-4d) {
                return d4;
            }
            double d12 = Double.MAX_VALUE;
            int i = 0;
            while (d12 > 0.001d && i < 100) {
                i++;
                double doubleValue = d4 - (c20391c.invoke(Double.valueOf(d4)).doubleValue() / c20392d.invoke(Double.valueOf(d4)).doubleValue());
                double abs = Math.abs(d4 - doubleValue);
                d4 = doubleValue;
                d12 = abs;
            }
            return d4;
        }
        d5 = d8;
        d6 = -d6;
        double d112 = d5;
        c20391c = new C20391c(d9, m7908f, d112, m7908f2, d6);
        C20392d c20392d2 = new C20392d(d9, m7908f, d112, m7908f2);
        if (Math.abs(c20391c.invoke(Double.valueOf(d4)).doubleValue()) >= 1.0E-4d) {
        }
    }

    /* renamed from: h */
    public static final double m41446h(double d, double d2, double d3, double d4, double d5) {
        return (d * Math.exp(d2 * d3)) + (d4 * Math.exp(d5 * d3));
    }

    /* renamed from: i */
    public static final double m41445i(Pair<C50679vs0, C50679vs0> pair, double d, double d2, double d3) {
        double m7908f = pair.getFirst().m7908f();
        double m7909e = (d2 - (m7908f * d)) / pair.getFirst().m7909e();
        return Math.log(d3 / Math.sqrt((d * d) + (m7909e * m7909e))) / m7908f;
    }
}
