package p000;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
/* renamed from: E18 */
/* loaded from: classes5.dex */
public final class E18 implements InterfaceC36040Sx8 {

    /* renamed from: a */
    public final AbstractC47813r18 f6860a;

    public E18(AbstractC47813r18 abstractC47813r18) {
        Charset charset = C32791Fa8.f9736a;
        this.f6860a = abstractC47813r18;
        abstractC47813r18.f106237a = this;
    }

    /* renamed from: K */
    public static E18 m109492K(AbstractC47813r18 abstractC47813r18) {
        E18 e18 = abstractC47813r18.f106237a;
        return e18 != null ? e18 : new E18(abstractC47813r18);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: A */
    public final void mo84568A(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof InterfaceC42830id8) {
            InterfaceC42830id8 interfaceC42830id8 = (InterfaceC42830id8) list;
            while (i2 < list.size()) {
                Object zzf = interfaceC42830id8.zzf(i2);
                if (zzf instanceof String) {
                    this.f6860a.mo16639p(i, (String) zzf);
                } else {
                    this.f6860a.mo16647h(i, (AbstractC41604gZ7) zzf);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6860a.mo16639p(i, (String) list.get(i2));
            i2++;
        }
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: B */
    public final void mo84567B(int i, long j) throws IOException {
        this.f6860a.mo16635t(i, j);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: C */
    public final void mo84566C(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f6860a.mo16638q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC47813r18.m16655B(((Long) list.get(i4)).longValue());
            }
            this.f6860a.mo16636s(i3);
            while (i2 < list.size()) {
                this.f6860a.mo16634u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6860a.mo16635t(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: D */
    public final void mo84565D(int i, int i2) throws IOException {
        this.f6860a.mo16646i(i, i2);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: E */
    public final void mo84564E(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f6860a.mo16638q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f6860a.mo16636s(i3);
            while (i2 < list.size()) {
                this.f6860a.mo16645j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6860a.mo16646i(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: F */
    public final void mo84563F(int i, long j) throws IOException {
        this.f6860a.mo16644k(i, j);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: G */
    public final void mo84562G(int i, Object obj, InterfaceC32449Do8 interfaceC32449Do8) throws IOException {
        InterfaceC39926dj8 interfaceC39926dj8 = (InterfaceC39926dj8) obj;
        A08 a08 = (A08) this.f6860a;
        a08.mo16636s((i << 3) | 2);
        a08.mo16636s(((GT7) interfaceC39926dj8).mo80353b(interfaceC32449Do8));
        interfaceC32449Do8.mo40915e(interfaceC39926dj8, a08.f106237a);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: H */
    public final void mo84561H(int i, Object obj, InterfaceC32449Do8 interfaceC32449Do8) throws IOException {
        AbstractC47813r18 abstractC47813r18 = this.f6860a;
        abstractC47813r18.mo16638q(i, 3);
        interfaceC32449Do8.mo40915e((InterfaceC39926dj8) obj, abstractC47813r18.f106237a);
        abstractC47813r18.mo16638q(i, 4);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: I */
    public final void mo84560I(int i, Object obj) throws IOException {
        if (obj instanceof AbstractC41604gZ7) {
            A08 a08 = (A08) this.f6860a;
            a08.mo16636s(11);
            a08.mo16637r(2, i);
            a08.mo16647h(3, (AbstractC41604gZ7) obj);
            a08.mo16636s(12);
            return;
        }
        AbstractC47813r18 abstractC47813r18 = this.f6860a;
        InterfaceC39926dj8 interfaceC39926dj8 = (InterfaceC39926dj8) obj;
        A08 a082 = (A08) abstractC47813r18;
        a082.mo16636s(11);
        a082.mo16637r(2, i);
        a082.mo16636s(26);
        a082.mo16636s(interfaceC39926dj8.mo43831l());
        interfaceC39926dj8.mo43829z(abstractC47813r18);
        a082.mo16636s(12);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: J */
    public final void mo84559J(int i, AbstractC41604gZ7 abstractC41604gZ7) throws IOException {
        this.f6860a.mo16647h(i, abstractC41604gZ7);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: a */
    public final void mo84558a(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f6860a.mo16638q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f6860a.mo16636s(i3);
            while (i2 < list.size()) {
                this.f6860a.mo16649f(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6860a.mo16648g(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: b */
    public final void mo84557b(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f6860a.mo16638q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f6860a.mo16636s(i3);
            while (i2 < list.size()) {
                this.f6860a.mo16645j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6860a.mo16646i(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: c */
    public final void mo84556c(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f6860a.mo16638q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC47813r18.m16632w(((Integer) list.get(i4)).intValue());
            }
            this.f6860a.mo16636s(i3);
            while (i2 < list.size()) {
                this.f6860a.mo16641n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6860a.mo16642m(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: d */
    public final void mo84555d(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f6860a.mo16638q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f6860a.mo16636s(i3);
            while (i2 < list.size()) {
                this.f6860a.mo16643l(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6860a.mo16644k(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: e */
    public final void mo84554e(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f6860a.mo16638q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f6860a.mo16636s(i3);
            while (i2 < list.size()) {
                this.f6860a.mo16643l(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6860a.mo16644k(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: f */
    public final void mo84553f(int i, boolean z) throws IOException {
        this.f6860a.mo16648g(i, z);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: g */
    public final void mo84552g(int i, double d) throws IOException {
        this.f6860a.mo16644k(i, Double.doubleToRawLongBits(d));
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: h */
    public final void mo84551h(int i, int i2) throws IOException {
        this.f6860a.mo16646i(i, i2);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: i */
    public final void mo84550i(int i, int i2) throws IOException {
        this.f6860a.mo16642m(i, i2);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: j */
    public final void mo84549j(int i, float f) throws IOException {
        this.f6860a.mo16646i(i, Float.floatToRawIntBits(f));
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: k */
    public final void mo84548k(int i, long j) throws IOException {
        this.f6860a.mo16644k(i, j);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: l */
    public final void mo84547l(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f6860a.mo16647h(i, (AbstractC41604gZ7) list.get(i2));
        }
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: m */
    public final void mo84546m(int i, long j) throws IOException {
        this.f6860a.mo16635t(i, j);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: n */
    public final void mo84545n(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f6860a.mo16638q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC47813r18.m16632w(((Integer) list.get(i4)).intValue());
            }
            this.f6860a.mo16636s(i3);
            while (i2 < list.size()) {
                this.f6860a.mo16641n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6860a.mo16642m(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: o */
    public final void mo84544o(int i, int i2) throws IOException {
        this.f6860a.mo16642m(i, i2);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: p */
    public final void mo84543p(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f6860a.mo16638q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f6860a.mo16636s(i3);
            while (i2 < list.size()) {
                this.f6860a.mo16645j(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6860a.mo16646i(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: q */
    public final void mo84542q(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f6860a.mo16638q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC47813r18.m16655B(((Long) list.get(i4)).longValue());
            }
            this.f6860a.mo16636s(i3);
            while (i2 < list.size()) {
                this.f6860a.mo16634u(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6860a.mo16635t(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: r */
    public final void mo84541r(int i, String str) throws IOException {
        this.f6860a.mo16639p(i, str);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: s */
    public final void mo84540s(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f6860a.mo16638q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f6860a.mo16636s(i3);
            while (i2 < list.size()) {
                this.f6860a.mo16643l(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6860a.mo16644k(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: t */
    public final void mo84539t(int i, long j) throws IOException {
        this.f6860a.mo16635t(i, (j >> 63) ^ (j + j));
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: u */
    public final void mo84538u(int i, int i2) throws IOException {
        this.f6860a.mo16637r(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // p000.InterfaceC36040Sx8
    @Deprecated
    /* renamed from: v */
    public final void mo84537v(int i) throws IOException {
        this.f6860a.mo16638q(i, 3);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: w */
    public final void mo84536w(int i, int i2) throws IOException {
        this.f6860a.mo16637r(i, i2);
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: x */
    public final void mo84535x(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f6860a.mo16638q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC47813r18.m16656A(((Integer) list.get(i4)).intValue());
            }
            this.f6860a.mo16636s(i3);
            while (i2 < list.size()) {
                this.f6860a.mo16636s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f6860a.mo16637r(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: y */
    public final void mo84534y(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f6860a.mo16638q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += AbstractC47813r18.m16656A((intValue >> 31) ^ (intValue + intValue));
            }
            this.f6860a.mo16636s(i3);
            while (i2 < list.size()) {
                AbstractC47813r18 abstractC47813r18 = this.f6860a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                abstractC47813r18.mo16636s((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            AbstractC47813r18 abstractC47813r182 = this.f6860a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            abstractC47813r182.mo16637r(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // p000.InterfaceC36040Sx8
    /* renamed from: z */
    public final void mo84533z(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f6860a.mo16638q(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += AbstractC47813r18.m16655B((longValue >> 63) ^ (longValue + longValue));
            }
            this.f6860a.mo16636s(i3);
            while (i2 < list.size()) {
                AbstractC47813r18 abstractC47813r18 = this.f6860a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                abstractC47813r18.mo16634u((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            AbstractC47813r18 abstractC47813r182 = this.f6860a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            abstractC47813r182.mo16635t(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // p000.InterfaceC36040Sx8
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.f6860a.mo16638q(i, 4);
    }
}
