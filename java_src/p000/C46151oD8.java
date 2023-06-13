package p000;

import com.google.android.gms.internal.vision.zzii;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* renamed from: oD8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46151oD8 implements InterfaceC37736a39 {

    /* renamed from: a */
    public final zzii f101621a;

    public C46151oD8(zzii zziiVar) {
        zzii zziiVar2 = (zzii) C52124yI8.m3689f(zziiVar, "output");
        this.f101621a = zziiVar2;
        zziiVar2.f71341a = this;
    }

    /* renamed from: N */
    public static C46151oD8 m21601N(zzii zziiVar) {
        C46151oD8 c46151oD8 = zziiVar.f71341a;
        if (c46151oD8 != null) {
            return c46151oD8;
        }
        return new C46151oD8(zziiVar);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: A */
    public final void mo21614A(int i, float f) throws IOException {
        this.f101621a.m50807l(i, f);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: B */
    public final void mo21613B(int i, long j) throws IOException {
        this.f101621a.mo50783Y(i, j);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: C */
    public final void mo21612C(int i, List<?> list, InterfaceC52825zU8 interfaceC52825zU8) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo21605J(i, list.get(i2), interfaceC52825zU8);
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: D */
    public final void mo21611D(int i, String str) throws IOException {
        this.f101621a.mo50773o(i, str);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: E */
    public final void mo21610E(int i, boolean z) throws IOException {
        this.f101621a.mo50769s(i, z);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: F */
    public final void mo21609F(int i, int i2) throws IOException {
        this.f101621a.mo50786P(i, i2);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: G */
    public final void mo21608G(int i, List<?> list, InterfaceC52825zU8 interfaceC52825zU8) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo21606I(i, list.get(i2), interfaceC52825zU8);
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: H */
    public final void mo21607H(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof InterfaceC41488gM8) {
            InterfaceC41488gM8 interfaceC41488gM8 = (InterfaceC41488gM8) list;
            while (i2 < list.size()) {
                Object mo6975g = interfaceC41488gM8.mo6975g(i2);
                if (mo6975g instanceof String) {
                    this.f101621a.mo50773o(i, (String) mo6975g);
                } else {
                    this.f101621a.mo50772p(i, (AbstractC53119zy8) mo6975g);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f101621a.mo50773o(i, list.get(i2));
            i2++;
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: I */
    public final void mo21606I(int i, Object obj, InterfaceC52825zU8 interfaceC52825zU8) throws IOException {
        this.f101621a.mo50770r(i, (InterfaceC44489lQ8) obj, interfaceC52825zU8);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: J */
    public final void mo21605J(int i, Object obj, InterfaceC52825zU8 interfaceC52825zU8) throws IOException {
        zzii zziiVar = this.f101621a;
        zziiVar.mo50775m(i, 3);
        interfaceC52825zU8.mo1313b((InterfaceC44489lQ8) obj, zziiVar.f71341a);
        zziiVar.mo50775m(i, 4);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: K */
    public final void mo21604K(int i, long j) throws IOException {
        this.f101621a.m50829Q(i, j);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: L */
    public final <K, V> void mo21603L(int i, C43294jP8<K, V> c43294jP8, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f101621a.mo50775m(i, 2);
            this.f101621a.mo50787O(C48621sO8.m14241a(c43294jP8, entry.getKey(), entry.getValue()));
            C48621sO8.m14240b(this.f101621a, c43294jP8, entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: M */
    public final void mo21602M(int i, AbstractC53119zy8 abstractC53119zy8) throws IOException {
        this.f101621a.mo50772p(i, abstractC53119zy8);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: a */
    public final void mo21600a(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f101621a.mo50775m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m50818d0(list.get(i4).longValue());
            }
            this.f101621a.mo50787O(i3);
            while (i2 < list.size()) {
                this.f101621a.mo50768t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f101621a.mo50774n(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: b */
    public final void mo21599b(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f101621a.mo50775m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m50795v0(list.get(i4).longValue());
            }
            this.f101621a.mo50787O(i3);
            while (i2 < list.size()) {
                this.f101621a.mo50782Z(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f101621a.mo50783Y(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: c */
    public final void mo21598c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f101621a.mo50775m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m50803o0(list.get(i4).intValue());
            }
            this.f101621a.mo50787O(i3);
            while (i2 < list.size()) {
                this.f101621a.mo50787O(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f101621a.mo50784X(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: d */
    public final void mo21597d(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f101621a.mo50775m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m50790z(list.get(i4).doubleValue());
            }
            this.f101621a.mo50787O(i3);
            while (i2 < list.size()) {
                this.f101621a.m50813h(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f101621a.m50809k(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: e */
    public final void mo21596e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f101621a.mo50775m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m50804n0(list.get(i4).longValue());
            }
            this.f101621a.mo50787O(i3);
            while (i2 < list.size()) {
                this.f101621a.m50828S(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f101621a.m50829Q(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: f */
    public final void mo21595f(int i, int i2) throws IOException {
        this.f101621a.mo50776j0(i, i2);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: g */
    public final void mo21594g(int i) throws IOException {
        this.f101621a.mo50775m(i, 4);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: h */
    public final void mo21593h(int i, long j) throws IOException {
        this.f101621a.mo50783Y(i, j);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: i */
    public final void mo21592i(int i, long j) throws IOException {
        this.f101621a.mo50774n(i, j);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: j */
    public final void mo21591j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f101621a.mo50775m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m50794w0(list.get(i4).intValue());
            }
            this.f101621a.mo50787O(i3);
            while (i2 < list.size()) {
                this.f101621a.mo50779e0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f101621a.mo50776j0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: k */
    public final void mo21590k(int i, int i2) throws IOException {
        this.f101621a.m50815f0(i, i2);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: l */
    public final void mo21589l(int i, int i2) throws IOException {
        this.f101621a.mo50776j0(i, i2);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: m */
    public final void mo21588m(int i, int i2) throws IOException {
        this.f101621a.mo50784X(i, i2);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: n */
    public final void mo21587n(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f101621a.mo50775m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m50832L(list.get(i4).booleanValue());
            }
            this.f101621a.mo50787O(i3);
            while (i2 < list.size()) {
                this.f101621a.m50792y(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f101621a.mo50769s(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: o */
    public final void mo21586o(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f101621a.mo50775m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m50845B0(list.get(i4).intValue());
            }
            this.f101621a.mo50787O(i3);
            while (i2 < list.size()) {
                this.f101621a.mo50777j(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f101621a.mo50786P(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: p */
    public final void mo21585p(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f101621a.mo50775m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m50789z0(list.get(i4).intValue());
            }
            this.f101621a.mo50787O(i3);
            while (i2 < list.size()) {
                this.f101621a.mo50779e0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f101621a.mo50776j0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: q */
    public final void mo21584q(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f101621a.mo50775m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m50800r0(list.get(i4).longValue());
            }
            this.f101621a.mo50787O(i3);
            while (i2 < list.size()) {
                this.f101621a.mo50782Z(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f101621a.mo50783Y(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: r */
    public final void mo21583r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f101621a.mo50775m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m50810i0(list.get(i4).longValue());
            }
            this.f101621a.mo50787O(i3);
            while (i2 < list.size()) {
                this.f101621a.mo50768t(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f101621a.mo50774n(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: s */
    public final void mo21582s(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f101621a.mo50775m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m50848A(list.get(i4).floatValue());
            }
            this.f101621a.mo50787O(i3);
            while (i2 < list.size()) {
                this.f101621a.m50811i(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f101621a.m50807l(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: t */
    public final void mo21581t(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f101621a.mo50775m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m50799s0(list.get(i4).intValue());
            }
            this.f101621a.mo50787O(i3);
            while (i2 < list.size()) {
                this.f101621a.m50824W(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f101621a.m50815f0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: u */
    public final void mo21580u(int i, List<AbstractC53119zy8> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f101621a.mo50772p(i, list.get(i2));
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: v */
    public final void mo21579v(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f101621a.mo50775m(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzii.m50808k0(list.get(i4).intValue());
            }
            this.f101621a.mo50787O(i3);
            while (i2 < list.size()) {
                this.f101621a.mo50777j(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f101621a.mo50786P(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: w */
    public final void mo21578w(int i, int i2) throws IOException {
        this.f101621a.mo50786P(i, i2);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: x */
    public final void mo21577x(int i, Object obj) throws IOException {
        if (obj instanceof AbstractC53119zy8) {
            this.f101621a.mo50785R(i, (AbstractC53119zy8) obj);
        } else {
            this.f101621a.mo50771q(i, (InterfaceC44489lQ8) obj);
        }
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: y */
    public final void mo21576y(int i, long j) throws IOException {
        this.f101621a.mo50774n(i, j);
    }

    @Override // p000.InterfaceC37736a39
    /* renamed from: z */
    public final void mo21575z(int i, double d) throws IOException {
        this.f101621a.m50809k(i, d);
    }

    @Override // p000.InterfaceC37736a39
    public final int zza() {
        return Q29.f29741a;
    }

    @Override // p000.InterfaceC37736a39
    public final void zza(int i) throws IOException {
        this.f101621a.mo50775m(i, 3);
    }
}
