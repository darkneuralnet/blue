package p000;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
/* renamed from: bQ8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38542bQ8 implements InterfaceC38633ba9 {

    /* renamed from: a */
    public final QP8 f57485a;

    public C38542bQ8(QP8 qp8) {
        Charset charset = XV8.f43341a;
        this.f57485a = qp8;
        qp8.f30337a = this;
    }

    /* renamed from: J */
    public static C38542bQ8 m64535J(QP8 qp8) {
        C38542bQ8 c38542bQ8 = qp8.f30337a;
        return c38542bQ8 != null ? c38542bQ8 : new C38542bQ8(qp8);
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: A */
    public final void mo64338A(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f57485a.mo28998p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += QP8.m88514y(((Integer) list.get(i4)).intValue());
            }
            this.f57485a.mo28996r(i3);
            while (i2 < list.size()) {
                this.f57485a.mo28996r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57485a.mo28997q(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: B */
    public final void mo64337B(int i, AbstractC40913fO8 abstractC40913fO8) throws IOException {
        this.f57485a.mo29007g(i, abstractC40913fO8);
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: C */
    public final void mo64336C(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof InterfaceC48702sX8) {
            InterfaceC48702sX8 interfaceC48702sX8 = (InterfaceC48702sX8) list;
            while (i2 < list.size()) {
                Object zzf = interfaceC48702sX8.zzf(i2);
                if (zzf instanceof String) {
                    this.f57485a.mo28999o(i, (String) zzf);
                } else {
                    this.f57485a.mo29007g(i, (AbstractC40913fO8) zzf);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57485a.mo28999o(i, (String) list.get(i2));
            i2++;
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: D */
    public final void mo64335D(int i, long j) throws IOException {
        this.f57485a.mo28995s(i, j);
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: E */
    public final void mo64334E(int i, Object obj, F39 f39) throws IOException {
        InterfaceC47814r19 interfaceC47814r19 = (InterfaceC47814r19) obj;
        C43887kP8 c43887kP8 = (C43887kP8) this.f57485a;
        c43887kP8.mo28996r((i << 3) | 2);
        c43887kP8.mo28996r(((QJ8) interfaceC47814r19).mo19212a(f39));
        f39.mo43316d(interfaceC47814r19, c43887kP8.f30337a);
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: F */
    public final void mo64333F(int i, int i2) throws IOException {
        this.f57485a.mo29006h(i, i2);
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: G */
    public final void mo64332G(int i, long j) throws IOException {
        this.f57485a.mo29004j(i, j);
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: H */
    public final void mo64331H(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f57485a.mo28998p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f57485a.mo28996r(i3);
            while (i2 < list.size()) {
                this.f57485a.mo29005i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57485a.mo29006h(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: I */
    public final void mo64330I(int i, Object obj, F39 f39) throws IOException {
        QP8 qp8 = this.f57485a;
        qp8.mo28998p(i, 3);
        f39.mo43316d((InterfaceC47814r19) obj, qp8.f30337a);
        qp8.mo28998p(i, 4);
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: a */
    public final void mo64329a(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f57485a.mo28998p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f57485a.mo28996r(i3);
            while (i2 < list.size()) {
                this.f57485a.mo29009e(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57485a.mo29008f(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: b */
    public final void mo64328b(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f57485a.mo28998p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f57485a.mo28996r(i3);
            while (i2 < list.size()) {
                this.f57485a.mo29005i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57485a.mo29006h(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: c */
    public final void mo64327c(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f57485a.mo28998p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += QP8.m88517v(((Integer) list.get(i4)).intValue());
            }
            this.f57485a.mo28996r(i3);
            while (i2 < list.size()) {
                this.f57485a.mo29001m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57485a.mo29002l(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: d */
    public final void mo64326d(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f57485a.mo28998p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f57485a.mo28996r(i3);
            while (i2 < list.size()) {
                this.f57485a.mo29003k(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57485a.mo29004j(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: e */
    public final void mo64325e(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f57485a.mo28998p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f57485a.mo28996r(i3);
            while (i2 < list.size()) {
                this.f57485a.mo29003k(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57485a.mo29004j(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: f */
    public final void mo64324f(int i, boolean z) throws IOException {
        this.f57485a.mo29008f(i, z);
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: g */
    public final void mo64323g(int i, double d) throws IOException {
        this.f57485a.mo29004j(i, Double.doubleToRawLongBits(d));
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: h */
    public final void mo64322h(int i, int i2) throws IOException {
        this.f57485a.mo29006h(i, i2);
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: i */
    public final void mo64321i(int i, int i2) throws IOException {
        this.f57485a.mo29002l(i, i2);
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: j */
    public final void mo64320j(int i, float f) throws IOException {
        this.f57485a.mo29006h(i, Float.floatToRawIntBits(f));
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: k */
    public final void mo64319k(int i, long j) throws IOException {
        this.f57485a.mo29004j(i, j);
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: l */
    public final void mo64318l(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f57485a.mo29007g(i, (AbstractC40913fO8) list.get(i2));
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: m */
    public final void mo64317m(int i, long j) throws IOException {
        this.f57485a.mo28995s(i, j);
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: n */
    public final void mo64316n(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f57485a.mo28998p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += QP8.m88517v(((Integer) list.get(i4)).intValue());
            }
            this.f57485a.mo28996r(i3);
            while (i2 < list.size()) {
                this.f57485a.mo29001m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57485a.mo29002l(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: o */
    public final void mo64315o(int i, int i2) throws IOException {
        this.f57485a.mo29002l(i, i2);
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: p */
    public final void mo64314p(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f57485a.mo28998p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f57485a.mo28996r(i3);
            while (i2 < list.size()) {
                this.f57485a.mo29005i(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57485a.mo29006h(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: q */
    public final void mo64313q(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f57485a.mo28998p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += QP8.m88513z(((Long) list.get(i4)).longValue());
            }
            this.f57485a.mo28996r(i3);
            while (i2 < list.size()) {
                this.f57485a.mo28994t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57485a.mo28995s(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: r */
    public final void mo64312r(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f57485a.mo28998p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += QP8.m88514y((intValue >> 31) ^ (intValue + intValue));
            }
            this.f57485a.mo28996r(i3);
            while (i2 < list.size()) {
                QP8 qp8 = this.f57485a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                qp8.mo28996r((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            QP8 qp82 = this.f57485a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            qp82.mo28997q(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: s */
    public final void mo64311s(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f57485a.mo28998p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += QP8.m88513z((longValue >> 63) ^ (longValue + longValue));
            }
            this.f57485a.mo28996r(i3);
            while (i2 < list.size()) {
                QP8 qp8 = this.f57485a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                qp8.mo28994t((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            QP8 qp82 = this.f57485a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            qp82.mo28995s(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: t */
    public final void mo64310t(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f57485a.mo28998p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += QP8.m88513z(((Long) list.get(i4)).longValue());
            }
            this.f57485a.mo28996r(i3);
            while (i2 < list.size()) {
                this.f57485a.mo28994t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57485a.mo28995s(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: u */
    public final void mo64309u(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f57485a.mo28998p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f57485a.mo28996r(i3);
            while (i2 < list.size()) {
                this.f57485a.mo29003k(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f57485a.mo29004j(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: v */
    public final void mo64308v(int i, int i2) throws IOException {
        this.f57485a.mo28997q(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: w */
    public final void mo64307w(int i, String str) throws IOException {
        this.f57485a.mo28999o(i, str);
    }

    @Override // p000.InterfaceC38633ba9
    @Deprecated
    /* renamed from: x */
    public final void mo64306x(int i) throws IOException {
        this.f57485a.mo28998p(i, 3);
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: y */
    public final void mo64305y(int i, long j) throws IOException {
        this.f57485a.mo28995s(i, (j >> 63) ^ (j + j));
    }

    @Override // p000.InterfaceC38633ba9
    /* renamed from: z */
    public final void mo64304z(int i, int i2) throws IOException {
        this.f57485a.mo28997q(i, i2);
    }

    @Override // p000.InterfaceC38633ba9
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.f57485a.mo28998p(i, 4);
    }
}
