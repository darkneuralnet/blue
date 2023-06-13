package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C18142B;
import com.google.crypto.tink.shaded.protobuf.C18178U;
import com.google.crypto.tink.shaded.protobuf.InterfaceC18186V;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.crypto.tink.shaded.protobuf.j */
/* loaded from: classes6.dex */
public final class C18215j implements InterfaceC18186V {

    /* renamed from: a */
    public final CodedOutputStream f74173a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.j$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18216a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74174a;

        static {
            int[] iArr = new int[C18178U.EnumC18180b.values().length];
            f74174a = iArr;
            try {
                iArr[C18178U.EnumC18180b.f74096k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74174a[C18178U.EnumC18180b.f74095j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74174a[C18178U.EnumC18180b.f74093h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74174a[C18178U.EnumC18180b.f74103r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74174a[C18178U.EnumC18180b.f74105t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74174a[C18178U.EnumC18180b.f74101p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74174a[C18178U.EnumC18180b.f74094i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f74174a[C18178U.EnumC18180b.f74091f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f74174a[C18178U.EnumC18180b.f74104s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f74174a[C18178U.EnumC18180b.f74106u.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f74174a[C18178U.EnumC18180b.f74092g.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f74174a[C18178U.EnumC18180b.f74097l.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C18215j(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C18238v.m47422b(codedOutputStream, "output");
        this.f74173a = codedOutputStream2;
        codedOutputStream2.f74019a = this;
    }

    /* renamed from: P */
    public static C18215j m47570P(CodedOutputStream codedOutputStream) {
        C18215j c18215j = codedOutputStream.f74019a;
        if (c18215j != null) {
            return c18215j;
        }
        return new C18215j(codedOutputStream);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: A */
    public void mo47585A(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74173a.mo48118M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m48176N(list.get(i4).longValue());
            }
            this.f74173a.mo48116O0(i3);
            while (i2 < list.size()) {
                this.f74173a.m48187G0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74173a.m48189F0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: B */
    public InterfaceC18186V.EnumC18187a mo47584B() {
        return InterfaceC18186V.EnumC18187a.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: C */
    public void mo47583C(int i, long j) throws IOException {
        this.f74173a.m48125y0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: D */
    public void mo47582D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74173a.mo48118M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m48178L(list.get(i4).intValue());
            }
            this.f74173a.mo48116O0(i3);
            while (i2 < list.size()) {
                this.f74173a.m48191E0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74173a.m48193D0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: E */
    public void mo47581E(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74173a.mo48118M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m48156e(list.get(i4).booleanValue());
            }
            this.f74173a.mo48116O0(i3);
            while (i2 < list.size()) {
                this.f74173a.m48150i0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74173a.mo48105h0(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: F */
    public void mo47580F(int i, float f) throws IOException {
        this.f74173a.m48135s0(i, f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: G */
    public void mo47579G(int i, int i2) throws IOException {
        this.f74173a.m48143m0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: H */
    public void mo47578H(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74173a.mo48118M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m48126y(list.get(i4).longValue());
            }
            this.f74173a.mo48116O0(i3);
            while (i2 < list.size()) {
                this.f74173a.m48123z0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74173a.m48125y0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: I */
    public void mo47577I(int i, int i2) throws IOException {
        this.f74173a.m48185H0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: J */
    public <K, V> void mo47576J(int i, C18142B.C18143a<K, V> c18143a, Map<K, V> map) throws IOException {
        if (this.f74173a.m48159c0()) {
            m47569Q(i, c18143a, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f74173a.mo48118M0(i, 2);
            this.f74173a.mo48116O0(C18142B.m48211b(c18143a, entry.getKey(), entry.getValue()));
            C18142B.m48209d(this.f74173a, c18143a, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: K */
    public void mo47575K(int i, Object obj, InterfaceC18157M interfaceC18157M) throws IOException {
        this.f74173a.m48131u0(i, (InterfaceC18149F) obj, interfaceC18157M);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: L */
    public void mo47574L(int i, List<?> list, InterfaceC18157M interfaceC18157M) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo47573M(i, list.get(i2), interfaceC18157M);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: M */
    public void mo47573M(int i, Object obj, InterfaceC18157M interfaceC18157M) throws IOException {
        this.f74173a.mo48122A0(i, (InterfaceC18149F) obj, interfaceC18157M);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: N */
    public void mo47572N(int i, List<?> list, InterfaceC18157M interfaceC18157M) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo47575K(i, list.get(i2), interfaceC18157M);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: O */
    public void mo47571O(int i, AbstractC18199g abstractC18199g) throws IOException {
        this.f74173a.mo48104j0(i, abstractC18199g);
    }

    /* renamed from: Q */
    public final <K, V> void m47569Q(int i, C18142B.C18143a<K, V> c18143a, Map<K, V> map) throws IOException {
        int[] iArr = C18216a.f74174a;
        throw null;
    }

    /* renamed from: R */
    public final void m47568R(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f74173a.mo48119L0(i, (String) obj);
        } else {
            this.f74173a.mo48104j0(i, (AbstractC18199g) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: a */
    public void mo47567a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74173a.mo48118M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m48137r(list.get(i4).floatValue());
            }
            this.f74173a.mo48116O0(i3);
            while (i2 < list.size()) {
                this.f74173a.m48133t0(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74173a.m48135s0(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: b */
    public final void mo47566b(int i, Object obj) throws IOException {
        if (obj instanceof AbstractC18199g) {
            this.f74173a.mo48120C0(i, (AbstractC18199g) obj);
        } else {
            this.f74173a.mo48121B0(i, (InterfaceC18149F) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: c */
    public void mo47565c(int i, int i2) throws IOException {
        this.f74173a.mo48103o0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: d */
    public void mo47564d(int i, String str) throws IOException {
        this.f74173a.mo48119L0(i, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: e */
    public void mo47563e(int i, long j) throws IOException {
        this.f74173a.mo48115P0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: f */
    public void mo47562f(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74173a.mo48118M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m48128w(list.get(i4).intValue());
            }
            this.f74173a.mo48116O0(i3);
            while (i2 < list.size()) {
                this.f74173a.mo48098x0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74173a.mo48099w0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: g */
    public void mo47561g(int i, int i2) throws IOException {
        this.f74173a.mo48099w0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: h */
    public void mo47560h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74173a.mo48118M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m48142n(list.get(i4).intValue());
            }
            this.f74173a.mo48116O0(i3);
            while (i2 < list.size()) {
                this.f74173a.mo48102p0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74173a.mo48103o0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: i */
    public void mo47559i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74173a.mo48118M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m48167W(list.get(i4).intValue());
            }
            this.f74173a.mo48116O0(i3);
            while (i2 < list.size()) {
                this.f74173a.mo48116O0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74173a.mo48117N0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: j */
    public void mo47558j(int i, long j) throws IOException {
        this.f74173a.m48181J0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: k */
    public void mo47557k(int i, int i2) throws IOException {
        this.f74173a.mo48117N0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: l */
    public void mo47556l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74173a.mo48118M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m48165Y(list.get(i4).longValue());
            }
            this.f74173a.mo48116O0(i3);
            while (i2 < list.size()) {
                this.f74173a.mo48114Q0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74173a.mo48115P0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: m */
    public void mo47555m(int i, long j) throws IOException {
        this.f74173a.mo48101q0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: n */
    public void mo47554n(int i, boolean z) throws IOException {
        this.f74173a.mo48105h0(i, z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: o */
    public void mo47553o(int i, int i2) throws IOException {
        this.f74173a.m48193D0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: p */
    public void mo47552p(int i) throws IOException {
        this.f74173a.mo48118M0(i, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: q */
    public void mo47551q(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74173a.mo48118M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m48139p(list.get(i4).longValue());
            }
            this.f74173a.mo48116O0(i3);
            while (i2 < list.size()) {
                this.f74173a.mo48100r0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74173a.mo48101q0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: r */
    public void mo47550r(int i) throws IOException {
        this.f74173a.mo48118M0(i, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: s */
    public void mo47549s(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74173a.mo48118M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m48174P(list.get(i4).intValue());
            }
            this.f74173a.mo48116O0(i3);
            while (i2 < list.size()) {
                this.f74173a.m48183I0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74173a.m48185H0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: t */
    public void mo47548t(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74173a.mo48118M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m48149j(list.get(i4).doubleValue());
            }
            this.f74173a.mo48116O0(i3);
            while (i2 < list.size()) {
                this.f74173a.m48145l0(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74173a.m48147k0(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: u */
    public void mo47547u(int i, List<AbstractC18199g> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f74173a.mo48104j0(i, list.get(i2));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: v */
    public void mo47546v(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof InterfaceC35251Po2) {
            InterfaceC35251Po2 interfaceC35251Po2 = (InterfaceC35251Po2) list;
            while (i2 < list.size()) {
                m47568R(i, interfaceC35251Po2.mo11974l(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74173a.mo48119L0(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: w */
    public void mo47545w(int i, long j) throws IOException {
        this.f74173a.m48189F0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: x */
    public void mo47544x(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74173a.mo48118M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m48172R(list.get(i4).longValue());
            }
            this.f74173a.mo48116O0(i3);
            while (i2 < list.size()) {
                this.f74173a.m48179K0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74173a.m48181J0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: y */
    public void mo47543y(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74173a.mo48118M0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m48146l(list.get(i4).intValue());
            }
            this.f74173a.mo48116O0(i3);
            while (i2 < list.size()) {
                this.f74173a.m48141n0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74173a.m48143m0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18186V
    /* renamed from: z */
    public void mo47542z(int i, double d) throws IOException {
        this.f74173a.m48147k0(i, d);
    }
}
