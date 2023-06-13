package p000;

import com.google.android.gms.internal.places.AbstractC17530c;
import com.google.android.gms.internal.places.zzaj;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* renamed from: rq7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48296rq7 implements InterfaceC43393ja8 {

    /* renamed from: a */
    public final zzaj f107778a;

    public C48296rq7(zzaj zzajVar) {
        zzaj zzajVar2 = (zzaj) C44389lF7.m27615e(zzajVar, "output");
        this.f107778a = zzajVar2;
        zzajVar2.f71193a = this;
    }

    /* renamed from: f */
    public static C48296rq7 m15197f(zzaj zzajVar) {
        C48296rq7 c48296rq7 = zzajVar.f71193a;
        if (c48296rq7 != null) {
            return c48296rq7;
        }
        return new C48296rq7(zzajVar);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: B */
    public final void mo15224B(int i, long j) throws IOException {
        this.f107778a.mo51055P(i, j);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: C */
    public final void mo15223C(int i, long j) throws IOException {
        this.f107778a.mo51049j(i, j);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: E */
    public final void mo15222E(int i, int i2) throws IOException {
        this.f107778a.mo51050c0(i, i2);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: F */
    public final void mo15221F(int i) throws IOException {
        this.f107778a.mo51039z(i, 3);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: G */
    public final void mo15220G(int i) throws IOException {
        this.f107778a.mo51039z(i, 4);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: H */
    public final void mo15219H(int i, double d) throws IOException {
        this.f107778a.m51089h(i, d);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: I */
    public final void mo15218I(int i, float f) throws IOException {
        this.f107778a.m51087i(i, f);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: J */
    public final void mo15217J(int i, Object obj) throws IOException {
        if (obj instanceof AbstractC43604jv9) {
            this.f107778a.mo51062B(i, (AbstractC43604jv9) obj);
        } else {
            this.f107778a.mo51047l(i, (InterfaceC52815zT7) obj);
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: K */
    public final void mo15216K(int i, int i2) throws IOException {
        this.f107778a.mo51050c0(i, i2);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: L */
    public final void mo15215L(int i, boolean z) throws IOException {
        this.f107778a.mo51061C(i, z);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: M */
    public final void mo15214M(int i, Object obj, LY7 ly7) throws IOException {
        zzaj zzajVar = this.f107778a;
        zzajVar.mo51039z(i, 3);
        ly7.mo51166g((InterfaceC52815zT7) obj, zzajVar.f71193a);
        zzajVar.mo51039z(i, 4);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: N */
    public final void mo15213N(int i, long j) throws IOException {
        this.f107778a.mo51055P(i, j);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: O */
    public final void mo15212O(int i, Object obj, LY7 ly7) throws IOException {
        this.f107778a.mo51045m(i, (InterfaceC52815zT7) obj, ly7);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: P */
    public final void mo15211P(int i, String str) throws IOException {
        this.f107778a.mo51048k(i, str);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: Q */
    public final <K, V> void mo15210Q(int i, SQ7<K, V> sq7, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f107778a.mo51039z(i, 2);
            this.f107778a.mo51041s0(C42718iR7.m33909a(sq7, entry.getKey(), entry.getValue()));
            C42718iR7.m33908b(this.f107778a, sq7, entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: R */
    public final void mo15209R(int i, int i2) throws IOException {
        this.f107778a.mo51056O(i, i2);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: S */
    public final void mo15208S(int i, AbstractC43604jv9 abstractC43604jv9) throws IOException {
        this.f107778a.mo51044n(i, abstractC43604jv9);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: T */
    public final void mo15207T(int i, List<AbstractC43604jv9> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f107778a.mo51044n(i, list.get(i2));
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: U */
    public final int mo15206U() {
        return AbstractC17530c.C17534d.f71164l;
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: V */
    public final void mo15205V(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f107778a.mo51039z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m51092f0(list.get(i4).longValue());
            }
            this.f107778a.mo51041s0(i3);
            while (i2 < list.size()) {
                this.f107778a.m51108Q(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f107778a.m51121A(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: W */
    public final void mo15204W(int i, List<?> list, LY7 ly7) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo15214M(i, list.get(i2), ly7);
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: X */
    public final void mo15203X(int i, List<?> list, LY7 ly7) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo15212O(i, list.get(i2), ly7);
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: a */
    public final void mo15202a(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f107778a.mo51039z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m51063z0(list.get(i4).intValue());
            }
            this.f107778a.mo51041s0(i3);
            while (i2 < list.size()) {
                this.f107778a.mo51040u0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f107778a.mo51050c0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: b */
    public final void mo15201b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f107778a.mo51039z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m51120A0(list.get(i4).intValue());
            }
            this.f107778a.mo51041s0(i3);
            while (i2 < list.size()) {
                this.f107778a.mo51040u0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f107778a.mo51050c0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: c */
    public final void mo15200c(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f107778a.mo51039z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m51111K(list.get(i4).booleanValue());
            }
            this.f107778a.mo51041s0(i3);
            while (i2 < list.size()) {
                this.f107778a.m51116F(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f107778a.mo51061C(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: d */
    public final void mo15199d(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f107778a.mo51039z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m51107R(list.get(i4).floatValue());
            }
            this.f107778a.mo51041s0(i3);
            while (i2 < list.size()) {
                this.f107778a.m51109N(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f107778a.m51087i(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: e */
    public final void mo15198e(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f107778a.mo51039z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m51064y0(list.get(i4).intValue());
            }
            this.f107778a.mo51041s0(i3);
            while (i2 < list.size()) {
                this.f107778a.m51073t0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f107778a.m51101Z(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: h */
    public final void mo15196h(int i, long j) throws IOException {
        this.f107778a.mo51049j(i, j);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: i */
    public final void mo15195i(int i, long j) throws IOException {
        this.f107778a.m51121A(i, j);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: j */
    public final void mo15194j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f107778a.mo51039z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m51068w0(list.get(i4).intValue());
            }
            this.f107778a.mo51041s0(i3);
            while (i2 < list.size()) {
                this.f107778a.mo51042r0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f107778a.mo51056O(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: k */
    public final void mo15193k(int i, int i2) throws IOException {
        this.f107778a.m51101Z(i, i2);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: l */
    public final void mo15192l(int i, int i2) throws IOException {
        this.f107778a.mo51056O(i, i2);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: m */
    public final void mo15191m(int i, int i2) throws IOException {
        this.f107778a.mo51054V(i, i2);
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: n */
    public final void mo15190n(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f107778a.mo51039z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m51119B0(list.get(i4).intValue());
            }
            this.f107778a.mo51041s0(i3);
            while (i2 < list.size()) {
                this.f107778a.mo51042r0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f107778a.mo51056O(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: o */
    public final void mo15189o(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f107778a.mo51039z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m51078q(list.get(i4).doubleValue());
            }
            this.f107778a.mo51041s0(i3);
            while (i2 < list.size()) {
                this.f107778a.m51091g(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f107778a.m51089h(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: p */
    public final void mo15188p(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f107778a.mo51039z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m51066x0(list.get(i4).intValue());
            }
            this.f107778a.mo51041s0(i3);
            while (i2 < list.size()) {
                this.f107778a.mo51041s0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f107778a.mo51054V(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: q */
    public final void mo15187q(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f107778a.mo51039z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m51099b0(list.get(i4).longValue());
            }
            this.f107778a.mo51041s0(i3);
            while (i2 < list.size()) {
                this.f107778a.mo51060D(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f107778a.mo51049j(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: r */
    public final void mo15186r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f107778a.mo51039z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m51102Y(list.get(i4).longValue());
            }
            this.f107778a.mo51041s0(i3);
            while (i2 < list.size()) {
                this.f107778a.mo51060D(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f107778a.mo51049j(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: s */
    public final void mo15185s(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f107778a.mo51039z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m51086i0(list.get(i4).longValue());
            }
            this.f107778a.mo51041s0(i3);
            while (i2 < list.size()) {
                this.f107778a.mo51053W(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f107778a.mo51055P(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: t */
    public final void mo15184t(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f107778a.mo51039z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzaj.m51084k0(list.get(i4).longValue());
            }
            this.f107778a.mo51041s0(i3);
            while (i2 < list.size()) {
                this.f107778a.mo51053W(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f107778a.mo51055P(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC43393ja8
    /* renamed from: u */
    public final void mo15183u(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof KM7) {
            KM7 km7 = (KM7) list;
            while (i2 < list.size()) {
                Object mo64612O1 = km7.mo64612O1(i2);
                if (mo64612O1 instanceof String) {
                    this.f107778a.mo51048k(i, (String) mo64612O1);
                } else {
                    this.f107778a.mo51044n(i, (AbstractC43604jv9) mo64612O1);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f107778a.mo51048k(i, list.get(i2));
            i2++;
        }
    }
}
