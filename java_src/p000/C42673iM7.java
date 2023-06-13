package p000;

import com.google.android.gms.internal.clearcut.AbstractC17497c;
import com.google.android.gms.internal.clearcut.zzbn;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* renamed from: iM7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42673iM7 implements InterfaceC35212Pj8 {

    /* renamed from: a */
    public final zzbn f87202a;

    public C42673iM7(zzbn zzbnVar) {
        zzbn zzbnVar2 = (zzbn) C37975aT7.m71328e(zzbnVar, "output");
        this.f87202a = zzbnVar2;
        zzbnVar2.f70499a = this;
    }

    /* renamed from: g */
    public static C42673iM7 m34076g(zzbn zzbnVar) {
        C42673iM7 c42673iM7 = zzbnVar.f70499a;
        return c42673iM7 != null ? c42673iM7 : new C42673iM7(zzbnVar);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: A */
    public final void mo34098A(int i, float f) throws IOException {
        this.f87202a.m51408k(i, f);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: C */
    public final void mo34097C(int i, long j) throws IOException {
        this.f87202a.mo51376U(i, j);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: D */
    public final void mo34096D(int i, String str) throws IOException {
        this.f87202a.mo51367m(i, str);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: E */
    public final void mo34095E(int i, int i2) throws IOException {
        this.f87202a.mo51377T(i, i2);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: F */
    public final void mo34094F(int i) throws IOException {
        this.f87202a.mo51384G(i, 3);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: G */
    public final void mo34093G(int i) throws IOException {
        this.f87202a.mo51384G(i, 4);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: H */
    public final void mo34092H(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof WW7)) {
            while (i2 < list.size()) {
                this.f87202a.mo51367m(i, list.get(i2));
                i2++;
            }
            return;
        }
        WW7 ww7 = (WW7) list;
        while (i2 < list.size()) {
            Object mo43923l = ww7.mo43923l(i2);
            if (mo43923l instanceof String) {
                this.f87202a.mo51367m(i, (String) mo43923l);
            } else {
                this.f87202a.mo51365n(i, (TD7) mo43923l);
            }
            i2++;
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: I */
    public final void mo34091I(int i, Object obj, InterfaceC51439x88 interfaceC51439x88) throws IOException {
        this.f87202a.mo51363p(i, (H28) obj, interfaceC51439x88);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: J */
    public final void mo34090J(int i, List<?> list, InterfaceC51439x88 interfaceC51439x88) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo34084P(i, list.get(i2), interfaceC51439x88);
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: K */
    public final void mo34089K(int i, List<?> list, InterfaceC51439x88 interfaceC51439x88) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo34091I(i, list.get(i2), interfaceC51439x88);
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: L */
    public final void mo34088L(int i, long j) throws IOException {
        this.f87202a.mo51368l(i, j);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: M */
    public final void mo34087M(int i, int i2) throws IOException {
        this.f87202a.mo51369i0(i, i2);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: N */
    public final void mo34086N(int i, TD7 td7) throws IOException {
        this.f87202a.mo51365n(i, td7);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: O */
    public final int mo34085O() {
        return AbstractC17497c.C17502e.f70414l;
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: P */
    public final void mo34084P(int i, Object obj, InterfaceC51439x88 interfaceC51439x88) throws IOException {
        zzbn zzbnVar = this.f87202a;
        zzbnVar.mo51384G(i, 3);
        interfaceC51439x88.mo5811c((H28) obj, zzbnVar.f70499a);
        zzbnVar.mo51384G(i, 4);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: Q */
    public final <K, V> void mo34083Q(int i, K08<K, V> k08, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f87202a.mo51384G(i, 2);
            this.f87202a.mo51358y0(C51359x08.m5989a(k08, entry.getKey(), entry.getValue()));
            C51359x08.m5988b(this.f87202a, k08, entry.getKey(), entry.getValue());
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: a */
    public final void mo34082a(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f87202a.mo51368l(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f87202a.mo51384G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzbn.m51417e0(list.get(i4).longValue());
        }
        this.f87202a.mo51358y0(i3);
        while (i2 < list.size()) {
            this.f87202a.mo51379L(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: b */
    public final void mo34081b(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f87202a.mo51376U(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f87202a.mo51384G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzbn.m51399s0(list.get(i4).longValue());
        }
        this.f87202a.mo51358y0(i3);
        while (i2 < list.size()) {
            this.f87202a.mo51371c0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: c */
    public final void mo34080c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f87202a.mo51373b0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f87202a.mo51384G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzbn.m51442D0(list.get(i4).intValue());
        }
        this.f87202a.mo51358y0(i3);
        while (i2 < list.size()) {
            this.f87202a.mo51358y0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: d */
    public final void mo34079d(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f87202a.m51410j(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.f87202a.mo51384G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzbn.m51393w(list.get(i4).doubleValue());
        }
        this.f87202a.mo51358y0(i3);
        while (i2 < list.size()) {
            this.f87202a.m51413h(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: e */
    public final void mo34078e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f87202a.m51436H(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f87202a.mo51384G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzbn.m51406l0(list.get(i4).longValue());
        }
        this.f87202a.mo51358y0(i3);
        while (i2 < list.size()) {
            this.f87202a.m51426V(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: f */
    public final void mo34077f(int i, boolean z) throws IOException {
        this.f87202a.mo51381K(i, z);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: h */
    public final void mo34075h(int i, long j) throws IOException {
        this.f87202a.m51436H(i, j);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: i */
    public final void mo34074i(int i, long j) throws IOException {
        this.f87202a.mo51376U(i, j);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: j */
    public final void mo34073j(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f87202a.mo51369i0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f87202a.mo51384G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzbn.m51438F0(list.get(i4).intValue());
        }
        this.f87202a.mo51358y0(i3);
        while (i2 < list.size()) {
            this.f87202a.mo51385A0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: k */
    public final void mo34072k(int i, int i2) throws IOException {
        this.f87202a.mo51369i0(i, i2);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: l */
    public final void mo34071l(int i, int i2) throws IOException {
        this.f87202a.mo51373b0(i, i2);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: m */
    public final void mo34070m(int i, int i2) throws IOException {
        this.f87202a.m51415f0(i, i2);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: n */
    public final void mo34069n(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f87202a.mo51381K(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.f87202a.mo51384G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzbn.m51439F(list.get(i4).booleanValue());
        }
        this.f87202a.mo51358y0(i3);
        while (i2 < list.size()) {
            this.f87202a.m51398t(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: o */
    public final void mo34068o(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f87202a.mo51377T(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f87202a.mo51384G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzbn.m51435H0(list.get(i4).intValue());
        }
        this.f87202a.mo51358y0(i3);
        while (i2 < list.size()) {
            this.f87202a.mo51359x0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: p */
    public final void mo34067p(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f87202a.mo51369i0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f87202a.mo51384G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzbn.m51437G0(list.get(i4).intValue());
        }
        this.f87202a.mo51358y0(i3);
        while (i2 < list.size()) {
            this.f87202a.mo51385A0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: q */
    public final void mo34066q(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f87202a.mo51376U(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f87202a.mo51384G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzbn.m51403p0(list.get(i4).longValue());
        }
        this.f87202a.mo51358y0(i3);
        while (i2 < list.size()) {
            this.f87202a.mo51371c0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: r */
    public final void mo34065r(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f87202a.mo51368l(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f87202a.mo51384G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzbn.m51412h0(list.get(i4).longValue());
        }
        this.f87202a.mo51358y0(i3);
        while (i2 < list.size()) {
            this.f87202a.mo51379L(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: s */
    public final void mo34064s(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f87202a.m51408k(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.f87202a.mo51384G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzbn.m51391x(list.get(i4).floatValue());
        }
        this.f87202a.mo51358y0(i3);
        while (i2 < list.size()) {
            this.f87202a.m51411i(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: t */
    public final void mo34063t(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f87202a.m51415f0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f87202a.mo51384G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzbn.m51440E0(list.get(i4).intValue());
        }
        this.f87202a.mo51358y0(i3);
        while (i2 < list.size()) {
            this.f87202a.m51388z0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: u */
    public final void mo34062u(int i, List<TD7> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f87202a.mo51365n(i, list.get(i2));
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: v */
    public final void mo34061v(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f87202a.mo51377T(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f87202a.mo51384G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzbn.m51444C0(list.get(i4).intValue());
        }
        this.f87202a.mo51358y0(i3);
        while (i2 < list.size()) {
            this.f87202a.mo51359x0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: w */
    public final void mo34060w(int i, int i2) throws IOException {
        this.f87202a.mo51377T(i, i2);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: x */
    public final void mo34059x(int i, Object obj) throws IOException {
        if (obj instanceof TD7) {
            this.f87202a.mo51383I(i, (TD7) obj);
        } else {
            this.f87202a.mo51382J(i, (H28) obj);
        }
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: y */
    public final void mo34058y(int i, long j) throws IOException {
        this.f87202a.mo51368l(i, j);
    }

    @Override // p000.InterfaceC35212Pj8
    /* renamed from: z */
    public final void mo34057z(int i, double d) throws IOException {
        this.f87202a.m51410j(i, d);
    }
}
