package p000;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/* renamed from: yj9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52377yj9 implements Vs9 {

    /* renamed from: a */
    public final AbstractC48228rj9 f120081a;

    public C52377yj9(AbstractC48228rj9 abstractC48228rj9) {
        Fn9.m106449f(abstractC48228rj9, "output");
        this.f120081a = abstractC48228rj9;
        abstractC48228rj9.f107544a = this;
    }

    /* renamed from: K */
    public static C52377yj9 m2742K(AbstractC48228rj9 abstractC48228rj9) {
        C52377yj9 c52377yj9 = abstractC48228rj9.f107544a;
        if (c52377yj9 != null) {
            return c52377yj9;
        }
        return new C52377yj9(abstractC48228rj9);
    }

    @Override // p000.Vs9
    /* renamed from: A */
    public final void mo2752A(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof InterfaceC44127ko9) {
            InterfaceC44127ko9 interfaceC44127ko9 = (InterfaceC44127ko9) list;
            while (i2 < list.size()) {
                Object zzf = interfaceC44127ko9.zzf(i2);
                if (zzf instanceof String) {
                    this.f120081a.mo15525H(i, (String) zzf);
                } else {
                    this.f120081a.mo15494x(i, (AbstractC45836nh9) zzf);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f120081a.mo15525H(i, list.get(i2));
            i2++;
        }
    }

    @Override // p000.Vs9
    /* renamed from: B */
    public final void mo2751B(int i, long j) throws IOException {
        this.f120081a.mo15520M(i, j);
    }

    @Override // p000.Vs9
    /* renamed from: C */
    public final void mo2750C(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f120081a.mo15523J(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC48228rj9.m15505m(list.get(i4).longValue());
            }
            this.f120081a.mo15521L(i3);
            while (i2 < list.size()) {
                this.f120081a.mo15519N(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f120081a.mo15520M(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.Vs9
    /* renamed from: D */
    public final void mo2749D(int i, int i2) throws IOException {
        this.f120081a.mo15492z(i, i2);
    }

    @Override // p000.Vs9
    /* renamed from: E */
    public final void mo2748E(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f120081a.mo15523J(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f120081a.mo15521L(i3);
            while (i2 < list.size()) {
                this.f120081a.mo15532A(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f120081a.mo15492z(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.Vs9
    /* renamed from: F */
    public final void mo2747F(int i, long j) throws IOException {
        this.f120081a.mo15531B(i, j);
    }

    @Override // p000.Vs9
    /* renamed from: G */
    public final void mo2746G(int i, Object obj, InterfaceC38803br9 interfaceC38803br9) throws IOException {
        this.f120081a.mo15527F(i, (Np9) obj, interfaceC38803br9);
    }

    @Override // p000.Vs9
    /* renamed from: H */
    public final <K, V> void mo2745H(int i, C49473tp9<K, V> c49473tp9, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f120081a.mo15523J(i, 2);
            this.f120081a.mo15521L(C50658vp9.m7954b(c49473tp9, entry.getKey(), entry.getValue()));
            C50658vp9.m7951e(this.f120081a, c49473tp9, entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.Vs9
    /* renamed from: I */
    public final void mo2744I(int i, Object obj, InterfaceC38803br9 interfaceC38803br9) throws IOException {
        AbstractC48228rj9 abstractC48228rj9 = this.f120081a;
        abstractC48228rj9.mo15523J(i, 3);
        interfaceC38803br9.mo62269e((Np9) obj, abstractC48228rj9.f107544a);
        abstractC48228rj9.mo15523J(i, 4);
    }

    @Override // p000.Vs9
    /* renamed from: J */
    public final void mo2743J(int i, AbstractC45836nh9 abstractC45836nh9) throws IOException {
        this.f120081a.mo15494x(i, abstractC45836nh9);
    }

    @Override // p000.Vs9
    /* renamed from: a */
    public final void mo2741a(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f120081a.mo15523J(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.f120081a.mo15521L(i3);
            while (i2 < list.size()) {
                this.f120081a.mo15498t(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f120081a.mo15497u(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // p000.Vs9
    /* renamed from: b */
    public final void mo2740b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f120081a.mo15523J(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.f120081a.mo15521L(i3);
            while (i2 < list.size()) {
                this.f120081a.mo15532A(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f120081a.mo15492z(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.Vs9
    /* renamed from: c */
    public final void mo2739c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f120081a.mo15523J(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC48228rj9.m15513e(list.get(i4).intValue());
            }
            this.f120081a.mo15521L(i3);
            while (i2 < list.size()) {
                this.f120081a.mo15528E(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f120081a.mo15529D(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.Vs9
    /* renamed from: d */
    public final void mo2738d(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f120081a.mo15523J(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.f120081a.mo15521L(i3);
            while (i2 < list.size()) {
                this.f120081a.mo15530C(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f120081a.mo15531B(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    @Override // p000.Vs9
    /* renamed from: e */
    public final void mo2737e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f120081a.mo15523J(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f120081a.mo15521L(i3);
            while (i2 < list.size()) {
                this.f120081a.mo15530C(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f120081a.mo15531B(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.Vs9
    /* renamed from: f */
    public final void mo2736f(int i, boolean z) throws IOException {
        this.f120081a.mo15497u(i, z);
    }

    @Override // p000.Vs9
    /* renamed from: g */
    public final void mo2735g(int i, double d) throws IOException {
        this.f120081a.mo15531B(i, Double.doubleToRawLongBits(d));
    }

    @Override // p000.Vs9
    /* renamed from: h */
    public final void mo2734h(int i, int i2) throws IOException {
        this.f120081a.mo15492z(i, i2);
    }

    @Override // p000.Vs9
    /* renamed from: i */
    public final void mo2733i(int i, int i2) throws IOException {
        this.f120081a.mo15529D(i, i2);
    }

    @Override // p000.Vs9
    /* renamed from: j */
    public final void mo2732j(int i, float f) throws IOException {
        this.f120081a.mo15492z(i, Float.floatToRawIntBits(f));
    }

    @Override // p000.Vs9
    /* renamed from: k */
    public final void mo2731k(int i, long j) throws IOException {
        this.f120081a.mo15531B(i, j);
    }

    @Override // p000.Vs9
    /* renamed from: l */
    public final void mo2730l(int i, List<AbstractC45836nh9> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f120081a.mo15494x(i, list.get(i2));
        }
    }

    @Override // p000.Vs9
    /* renamed from: m */
    public final void mo2729m(int i, long j) throws IOException {
        this.f120081a.mo15520M(i, j);
    }

    @Override // p000.Vs9
    /* renamed from: n */
    public final void mo2728n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f120081a.mo15523J(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC48228rj9.m15513e(list.get(i4).intValue());
            }
            this.f120081a.mo15521L(i3);
            while (i2 < list.size()) {
                this.f120081a.mo15528E(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f120081a.mo15529D(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.Vs9
    /* renamed from: o */
    public final void mo2727o(int i, int i2) throws IOException {
        this.f120081a.mo15529D(i, i2);
    }

    @Override // p000.Vs9
    /* renamed from: p */
    public final void mo2726p(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f120081a.mo15523J(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.f120081a.mo15521L(i3);
            while (i2 < list.size()) {
                this.f120081a.mo15532A(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f120081a.mo15492z(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    @Override // p000.Vs9
    /* renamed from: q */
    public final void mo2725q(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f120081a.mo15523J(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC48228rj9.m15505m(list.get(i4).longValue());
            }
            this.f120081a.mo15521L(i3);
            while (i2 < list.size()) {
                this.f120081a.mo15519N(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f120081a.mo15520M(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.Vs9
    /* renamed from: r */
    public final void mo2724r(int i, String str) throws IOException {
        this.f120081a.mo15525H(i, str);
    }

    @Override // p000.Vs9
    /* renamed from: s */
    public final void mo2723s(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f120081a.mo15523J(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.f120081a.mo15521L(i3);
            while (i2 < list.size()) {
                this.f120081a.mo15530C(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f120081a.mo15531B(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.Vs9
    /* renamed from: t */
    public final void mo2722t(int i, long j) throws IOException {
        this.f120081a.mo15520M(i, (j >> 63) ^ (j + j));
    }

    @Override // p000.Vs9
    /* renamed from: u */
    public final void mo2721u(int i, int i2) throws IOException {
        this.f120081a.mo15522K(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // p000.Vs9
    /* renamed from: v */
    public final void mo2720v(int i) throws IOException {
        this.f120081a.mo15523J(i, 3);
    }

    @Override // p000.Vs9
    /* renamed from: w */
    public final void mo2719w(int i, int i2) throws IOException {
        this.f120081a.mo15522K(i, i2);
    }

    @Override // p000.Vs9
    /* renamed from: x */
    public final void mo2718x(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f120081a.mo15523J(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC48228rj9.m15506l(list.get(i4).intValue());
            }
            this.f120081a.mo15521L(i3);
            while (i2 < list.size()) {
                this.f120081a.mo15521L(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f120081a.mo15522K(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.Vs9
    /* renamed from: y */
    public final void mo2717y(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f120081a.mo15523J(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += AbstractC48228rj9.m15506l((intValue >> 31) ^ (intValue + intValue));
            }
            this.f120081a.mo15521L(i3);
            while (i2 < list.size()) {
                AbstractC48228rj9 abstractC48228rj9 = this.f120081a;
                int intValue2 = list.get(i2).intValue();
                abstractC48228rj9.mo15521L((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            AbstractC48228rj9 abstractC48228rj92 = this.f120081a;
            int intValue3 = list.get(i2).intValue();
            abstractC48228rj92.mo15522K(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // p000.Vs9
    /* renamed from: z */
    public final void mo2716z(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f120081a.mo15523J(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += AbstractC48228rj9.m15505m((longValue >> 63) ^ (longValue + longValue));
            }
            this.f120081a.mo15521L(i3);
            while (i2 < list.size()) {
                AbstractC48228rj9 abstractC48228rj9 = this.f120081a;
                long longValue2 = list.get(i2).longValue();
                abstractC48228rj9.mo15519N((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            AbstractC48228rj9 abstractC48228rj92 = this.f120081a;
            long longValue3 = list.get(i2).longValue();
            abstractC48228rj92.mo15520M(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // p000.Vs9
    public final void zzh(int i) throws IOException {
        this.f120081a.mo15523J(i, 4);
    }
}
