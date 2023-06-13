package p000;

import java.util.TreeSet;
/* renamed from: fC1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C40798fC1 {

    /* renamed from: a */
    public WB1 f79655a;

    public C40798fC1(WB1 wb1) {
        this.f79655a = wb1;
    }

    /* renamed from: a */
    public static double m41750a(WB1 wb1) {
        double m41748c = m41748c(wb1);
        C40414eZ3 m78755h0 = wb1.m78755h0();
        if (m78755h0.m42763c() == C40414eZ3.f78545e) {
            double m42764b = ((1.0d / m78755h0.m42764b()) * 2.0d) / 1.415d;
            if (m42764b > m41748c) {
                return m42764b;
            }
            return m41748c;
        }
        return m41748c;
    }

    /* renamed from: b */
    public static double m41749b(WB1 wb1, WB1 wb12) {
        return Math.min(m41750a(wb1), m41750a(wb12));
    }

    /* renamed from: c */
    public static double m41748c(WB1 wb1) {
        C48772sf1 m78759Z = wb1.m78759Z();
        return Math.min(m78759Z.m13872m(), m78759Z.m13867r()) * 1.0E-9d;
    }

    /* renamed from: e */
    public static WB1[] m41746e(WB1 wb1, WB1 wb12, double d) {
        WB1[] wb1Arr = {new C40798fC1(wb1).m41745f(wb12, d), new C40798fC1(wb12).m41745f(wb1Arr[0], d)};
        return wb1Arr;
    }

    /* renamed from: d */
    public final C52053yB0[] m41747d(WB1 wb1) {
        TreeSet treeSet = new TreeSet();
        for (C52053yB0 c52053yB0 : wb1.mo77238Y()) {
            treeSet.add(c52053yB0);
        }
        return (C52053yB0[]) treeSet.toArray(new C52053yB0[0]);
    }

    /* renamed from: f */
    public WB1 m41745f(WB1 wb1, double d) {
        return new C46229oM5(d, m41747d(wb1)).m39882b(this.f79655a);
    }
}
