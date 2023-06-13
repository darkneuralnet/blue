package p000;

import java.io.IOException;
import java.util.List;
/* renamed from: h89  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41954h89 {

    /* renamed from: a */
    public final Z79 f84747a;

    public C41954h89(Z79 z79) {
        C44007kc9.m28734f(z79, "output");
        this.f84747a = z79;
        z79.f47867a = this;
    }

    /* renamed from: m */
    public static C41954h89 m36785m(Z79 z79) {
        C41954h89 c41954h89 = z79.f47867a;
        return c41954h89 != null ? c41954h89 : new C41954h89(z79);
    }

    /* renamed from: A */
    public final void m36809A(int i, float f) throws IOException {
        this.f84747a.mo73692n(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: B */
    public final void m36808B(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f84747a.mo73684v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f84747a.mo73682x(i3);
            while (i2 < list.size()) {
                this.f84747a.mo73691o(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f84747a.mo73692n(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: C */
    public final void m36807C(int i, Object obj, Ei9 ei9) throws IOException {
        Z79 z79 = this.f84747a;
        z79.mo73684v(i, 3);
        ei9.mo83163d((InterfaceC47012pg9) obj, z79.f47867a);
        z79.mo73684v(i, 4);
    }

    /* renamed from: D */
    public final void m36806D(int i, int i2) throws IOException {
        this.f84747a.mo73688r(i, i2);
    }

    /* renamed from: E */
    public final void m36805E(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f84747a.mo73684v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += Z79.m73708E(((Integer) list.get(i4)).intValue());
            }
            this.f84747a.mo73682x(i3);
            while (i2 < list.size()) {
                this.f84747a.mo73687s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f84747a.mo73688r(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: F */
    public final void m36804F(int i, long j) throws IOException {
        this.f84747a.mo73681y(i, j);
    }

    /* renamed from: G */
    public final void m36803G(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f84747a.mo73684v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += Z79.m73701e(((Long) list.get(i4)).longValue());
            }
            this.f84747a.mo73682x(i3);
            while (i2 < list.size()) {
                this.f84747a.mo73680z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f84747a.mo73681y(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: H */
    public final void m36802H(int i, Object obj, Ei9 ei9) throws IOException {
        Object obj2 = (InterfaceC47012pg9) obj;
        E79 e79 = (E79) this.f84747a;
        e79.mo73682x((i << 3) | 2);
        A39 a39 = (A39) obj2;
        int mo9994a = a39.mo9994a();
        if (mo9994a == -1) {
            mo9994a = ei9.zza(a39);
            a39.mo9993b(mo9994a);
        }
        e79.mo73682x(mo9994a);
        ei9.mo83163d(obj2, e79.f47867a);
    }

    /* renamed from: I */
    public final void m36801I(int i, Object obj) throws IOException {
        if (obj instanceof T69) {
            E79 e79 = (E79) this.f84747a;
            e79.mo73682x(11);
            e79.mo73683w(2, i);
            e79.mo73693m(3, (T69) obj);
            e79.mo73682x(12);
            return;
        }
        Z79 z79 = this.f84747a;
        InterfaceC47012pg9 interfaceC47012pg9 = (InterfaceC47012pg9) obj;
        E79 e792 = (E79) z79;
        e792.mo73682x(11);
        e792.mo73683w(2, i);
        e792.mo73682x(26);
        e792.mo73682x(interfaceC47012pg9.mo9989i());
        interfaceC47012pg9.mo9992d(z79);
        e792.mo73682x(12);
    }

    /* renamed from: J */
    public final void m36800J(int i, int i2) throws IOException {
        this.f84747a.mo73692n(i, i2);
    }

    /* renamed from: K */
    public final void m36799K(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f84747a.mo73684v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f84747a.mo73682x(i3);
            while (i2 < list.size()) {
                this.f84747a.mo73691o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f84747a.mo73692n(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: L */
    public final void m36798L(int i, long j) throws IOException {
        this.f84747a.mo73690p(i, j);
    }

    /* renamed from: a */
    public final void m36797a(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f84747a.mo73684v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f84747a.mo73682x(i3);
            while (i2 < list.size()) {
                this.f84747a.mo73689q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f84747a.mo73690p(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void m36796b(int i, int i2) throws IOException {
        this.f84747a.mo73683w(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: c */
    public final void m36795c(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f84747a.mo73684v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += Z79.m73702d((intValue >> 31) ^ (intValue + intValue));
            }
            this.f84747a.mo73682x(i3);
            while (i2 < list.size()) {
                Z79 z79 = this.f84747a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                z79.mo73682x((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            Z79 z792 = this.f84747a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            z792.mo73683w(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: d */
    public final void m36794d(int i, long j) throws IOException {
        this.f84747a.mo73681y(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: e */
    public final void m36793e(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f84747a.mo73684v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += Z79.m73701e((longValue >> 63) ^ (longValue + longValue));
            }
            this.f84747a.mo73682x(i3);
            while (i2 < list.size()) {
                Z79 z79 = this.f84747a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                z79.mo73680z((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            Z79 z792 = this.f84747a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            z792.mo73681y(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: f */
    public final void m36792f(int i) throws IOException {
        this.f84747a.mo73684v(i, 3);
    }

    /* renamed from: g */
    public final void m36791g(int i, String str) throws IOException {
        this.f84747a.mo73685u(i, str);
    }

    /* renamed from: h */
    public final void m36790h(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof Id9) {
            Id9 id9 = (Id9) list;
            while (i2 < list.size()) {
                Object zzf = id9.zzf(i2);
                if (zzf instanceof String) {
                    this.f84747a.mo73685u(i, (String) zzf);
                } else {
                    this.f84747a.mo73693m(i, (T69) zzf);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f84747a.mo73685u(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: i */
    public final void m36789i(int i, int i2) throws IOException {
        this.f84747a.mo73683w(i, i2);
    }

    /* renamed from: j */
    public final void m36788j(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f84747a.mo73684v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += Z79.m73702d(((Integer) list.get(i4)).intValue());
            }
            this.f84747a.mo73682x(i3);
            while (i2 < list.size()) {
                this.f84747a.mo73682x(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f84747a.mo73683w(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void m36787k(int i, long j) throws IOException {
        this.f84747a.mo73681y(i, j);
    }

    /* renamed from: l */
    public final void m36786l(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f84747a.mo73684v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += Z79.m73701e(((Long) list.get(i4)).longValue());
            }
            this.f84747a.mo73682x(i3);
            while (i2 < list.size()) {
                this.f84747a.mo73680z(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f84747a.mo73681y(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void m36784n(int i, boolean z) throws IOException {
        this.f84747a.mo73694l(i, z);
    }

    /* renamed from: o */
    public final void m36783o(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f84747a.mo73684v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f84747a.mo73682x(i3);
            while (i2 < list.size()) {
                this.f84747a.mo73695k(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f84747a.mo73694l(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: p */
    public final void m36782p(int i, T69 t69) throws IOException {
        this.f84747a.mo73693m(i, t69);
    }

    /* renamed from: q */
    public final void m36781q(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f84747a.mo73693m(i, (T69) list.get(i2));
        }
    }

    /* renamed from: r */
    public final void m36780r(int i, double d) throws IOException {
        this.f84747a.mo73690p(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: s */
    public final void m36779s(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f84747a.mo73684v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f84747a.mo73682x(i3);
            while (i2 < list.size()) {
                this.f84747a.mo73689q(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f84747a.mo73690p(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    /* renamed from: t */
    public final void m36778t(int i) throws IOException {
        this.f84747a.mo73684v(i, 4);
    }

    /* renamed from: u */
    public final void m36777u(int i, int i2) throws IOException {
        this.f84747a.mo73688r(i, i2);
    }

    /* renamed from: v */
    public final void m36776v(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f84747a.mo73684v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += Z79.m73708E(((Integer) list.get(i4)).intValue());
            }
            this.f84747a.mo73682x(i3);
            while (i2 < list.size()) {
                this.f84747a.mo73687s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f84747a.mo73688r(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: w */
    public final void m36775w(int i, int i2) throws IOException {
        this.f84747a.mo73692n(i, i2);
    }

    /* renamed from: x */
    public final void m36774x(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f84747a.mo73684v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f84747a.mo73682x(i3);
            while (i2 < list.size()) {
                this.f84747a.mo73691o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f84747a.mo73692n(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: y */
    public final void m36773y(int i, long j) throws IOException {
        this.f84747a.mo73690p(i, j);
    }

    /* renamed from: z */
    public final void m36772z(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f84747a.mo73684v(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f84747a.mo73682x(i3);
            while (i2 < list.size()) {
                this.f84747a.mo73689q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f84747a.mo73690p(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
