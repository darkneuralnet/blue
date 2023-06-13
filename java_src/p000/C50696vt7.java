package p000;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/* renamed from: vt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50696vt7 implements InterfaceC34158Kw7 {

    /* renamed from: a */
    public final AbstractC50104ut7 f114867a;

    public C50696vt7(AbstractC50104ut7 abstractC50104ut7) {
        C46557ou7.m20292f(abstractC50104ut7, "output");
        this.f114867a = abstractC50104ut7;
        abstractC50104ut7.f113170a = this;
    }

    /* renamed from: L */
    public static C50696vt7 m7836L(AbstractC50104ut7 abstractC50104ut7) {
        C50696vt7 c50696vt7 = abstractC50104ut7.f113170a;
        return c50696vt7 != null ? c50696vt7 : new C50696vt7(abstractC50104ut7);
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: A */
    public final void mo7847A(int i, int i2) throws IOException {
        this.f114867a.mo9574N(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: B */
    public final void mo7846B(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f114867a.mo9575M(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += AbstractC50104ut7.m9557n((longValue >> 63) ^ (longValue + longValue));
            }
            this.f114867a.mo9573O(i3);
            while (i2 < list.size()) {
                AbstractC50104ut7 abstractC50104ut7 = this.f114867a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                abstractC50104ut7.mo9571Q((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            AbstractC50104ut7 abstractC50104ut72 = this.f114867a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            abstractC50104ut72.mo9572P(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: C */
    public final void mo7845C(int i, long j) throws IOException {
        this.f114867a.mo9572P(i, j);
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: D */
    public final void mo7844D(int i, Object obj) throws IOException {
        if (obj instanceof AbstractC44175kt7) {
            this.f114867a.mo9578J(i, (AbstractC44175kt7) obj);
        } else {
            this.f114867a.mo9579I(i, (InterfaceC41230fv7) obj);
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: E */
    public final void mo7843E(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof InterfaceC35076Ou7) {
            InterfaceC35076Ou7 interfaceC35076Ou7 = (InterfaceC35076Ou7) list;
            while (i2 < list.size()) {
                Object zzf = interfaceC35076Ou7.zzf(i2);
                if (zzf instanceof String) {
                    this.f114867a.mo9577K(i, (String) zzf);
                } else {
                    this.f114867a.mo9546y(i, (AbstractC44175kt7) zzf);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f114867a.mo9577K(i, (String) list.get(i2));
            i2++;
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: F */
    public final void mo7842F(int i, int i2) throws IOException {
        this.f114867a.mo9574N(i, i2);
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: G */
    public final void mo7841G(int i, Object obj, InterfaceC34851Nv7 interfaceC34851Nv7) throws IOException {
        this.f114867a.mo9581G(i, (InterfaceC41230fv7) obj, interfaceC34851Nv7);
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: H */
    public final void mo7840H(int i, Object obj, InterfaceC34851Nv7 interfaceC34851Nv7) throws IOException {
        AbstractC50104ut7 abstractC50104ut7 = this.f114867a;
        abstractC50104ut7.mo9575M(i, 3);
        interfaceC34851Nv7.mo29758f((InterfaceC41230fv7) obj, abstractC50104ut7.f113170a);
        abstractC50104ut7.mo9575M(i, 4);
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: I */
    public final void mo7839I(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f114867a.mo9575M(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC50104ut7.m9557n(((Long) list.get(i4)).longValue());
            }
            this.f114867a.mo9573O(i3);
            while (i2 < list.size()) {
                this.f114867a.mo9571Q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f114867a.mo9572P(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: J */
    public final void mo7838J(int i, int i2) throws IOException {
        this.f114867a.mo9587A(i, i2);
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: K */
    public final void mo7837K(int i, AbstractC44175kt7 abstractC44175kt7) throws IOException {
        this.f114867a.mo9546y(i, abstractC44175kt7);
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: a */
    public final void mo7835a(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f114867a.mo9575M(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f114867a.mo9573O(i3);
            while (i2 < list.size()) {
                this.f114867a.mo9550u(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f114867a.mo9549v(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: b */
    public final void mo7834b(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f114867a.mo9575M(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f114867a.mo9573O(i3);
            while (i2 < list.size()) {
                this.f114867a.mo9586B(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f114867a.mo9587A(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: c */
    public final void mo7833c(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f114867a.mo9575M(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC50104ut7.m9565f(((Integer) list.get(i4)).intValue());
            }
            this.f114867a.mo9573O(i3);
            while (i2 < list.size()) {
                this.f114867a.mo9582F(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f114867a.mo9583E(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: d */
    public final void mo7832d(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f114867a.mo9575M(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f114867a.mo9573O(i3);
            while (i2 < list.size()) {
                this.f114867a.mo9584D(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f114867a.mo9585C(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: e */
    public final void mo7831e(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f114867a.mo9575M(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f114867a.mo9573O(i3);
            while (i2 < list.size()) {
                this.f114867a.mo9584D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f114867a.mo9585C(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: f */
    public final void mo7830f(int i, boolean z) throws IOException {
        this.f114867a.mo9549v(i, z);
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: g */
    public final void mo7829g(int i, double d) throws IOException {
        this.f114867a.mo9585C(i, Double.doubleToRawLongBits(d));
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: h */
    public final void mo7828h(int i, int i2) throws IOException {
        this.f114867a.mo9587A(i, i2);
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: i */
    public final void mo7827i(int i, int i2) throws IOException {
        this.f114867a.mo9583E(i, i2);
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: j */
    public final void mo7826j(int i, float f) throws IOException {
        this.f114867a.mo9587A(i, Float.floatToRawIntBits(f));
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: k */
    public final void mo7825k(int i, long j) throws IOException {
        this.f114867a.mo9585C(i, j);
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: l */
    public final void mo7824l(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f114867a.mo9546y(i, (AbstractC44175kt7) list.get(i2));
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: m */
    public final void mo7823m(int i, long j) throws IOException {
        this.f114867a.mo9572P(i, j);
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: n */
    public final void mo7822n(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f114867a.mo9575M(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC50104ut7.m9565f(((Integer) list.get(i4)).intValue());
            }
            this.f114867a.mo9573O(i3);
            while (i2 < list.size()) {
                this.f114867a.mo9582F(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f114867a.mo9583E(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: o */
    public final void mo7821o(int i, int i2) throws IOException {
        this.f114867a.mo9583E(i, i2);
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: p */
    public final void mo7820p(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f114867a.mo9575M(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f114867a.mo9573O(i3);
            while (i2 < list.size()) {
                this.f114867a.mo9586B(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f114867a.mo9587A(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: q */
    public final void mo7819q(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f114867a.mo9575M(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC50104ut7.m9557n(((Long) list.get(i4)).longValue());
            }
            this.f114867a.mo9573O(i3);
            while (i2 < list.size()) {
                this.f114867a.mo9571Q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f114867a.mo9572P(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: r */
    public final void mo7818r(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f114867a.mo9575M(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f114867a.mo9573O(i3);
            while (i2 < list.size()) {
                this.f114867a.mo9584D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f114867a.mo9585C(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: s */
    public final void mo7817s(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f114867a.mo9575M(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += AbstractC50104ut7.m9558m((intValue >> 31) ^ (intValue + intValue));
            }
            this.f114867a.mo9573O(i3);
            while (i2 < list.size()) {
                AbstractC50104ut7 abstractC50104ut7 = this.f114867a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                abstractC50104ut7.mo9573O((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            AbstractC50104ut7 abstractC50104ut72 = this.f114867a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            abstractC50104ut72.mo9574N(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: t */
    public final void mo7816t(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f114867a.mo9575M(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC50104ut7.m9558m(((Integer) list.get(i4)).intValue());
            }
            this.f114867a.mo9573O(i3);
            while (i2 < list.size()) {
                this.f114867a.mo9573O(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f114867a.mo9574N(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: u */
    public final void mo7815u(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f114867a.mo9575M(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f114867a.mo9573O(i3);
            while (i2 < list.size()) {
                this.f114867a.mo9586B(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f114867a.mo9587A(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: v */
    public final void mo7814v(int i, long j) throws IOException {
        this.f114867a.mo9585C(i, j);
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: w */
    public final void mo7813w(int i, String str) throws IOException {
        this.f114867a.mo9577K(i, str);
    }

    @Override // p000.InterfaceC34158Kw7
    @Deprecated
    /* renamed from: x */
    public final void mo7812x(int i) throws IOException {
        this.f114867a.mo9575M(i, 3);
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: y */
    public final void mo7811y(int i, long j) throws IOException {
        this.f114867a.mo9572P(i, (j >> 63) ^ (j + j));
    }

    @Override // p000.InterfaceC34158Kw7
    /* renamed from: z */
    public final void mo7810z(int i, C37182Xu7 c37182Xu7, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            this.f114867a.mo9575M(i, 2);
            this.f114867a.mo9573O(C37416Yu7.m74016b(c37182Xu7, entry.getKey(), entry.getValue()));
            C37416Yu7.m74013e(this.f114867a, c37182Xu7, entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.InterfaceC34158Kw7
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.f114867a.mo9575M(i, 4);
    }
}
