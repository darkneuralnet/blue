package com.google.protobuf;

import com.google.protobuf.C18489P;
import com.google.protobuf.C18565z;
import com.google.protobuf.InterfaceC18497Q;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.protobuf.h */
/* loaded from: classes6.dex */
public final class C18521h implements InterfaceC18497Q {

    /* renamed from: a */
    public final CodedOutputStream f74829a;

    /* renamed from: com.google.protobuf.h$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18522a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74830a;

        static {
            int[] iArr = new int[C18489P.EnumC18491b.values().length];
            f74830a = iArr;
            try {
                iArr[C18489P.EnumC18491b.f74763k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74830a[C18489P.EnumC18491b.f74762j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74830a[C18489P.EnumC18491b.f74760h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74830a[C18489P.EnumC18491b.f74770r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74830a[C18489P.EnumC18491b.f74772t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74830a[C18489P.EnumC18491b.f74768p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74830a[C18489P.EnumC18491b.f74761i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f74830a[C18489P.EnumC18491b.f74758f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f74830a[C18489P.EnumC18491b.f74771s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f74830a[C18489P.EnumC18491b.f74773u.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f74830a[C18489P.EnumC18491b.f74759g.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f74830a[C18489P.EnumC18491b.f74764l.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C18521h(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C18544t.m45999b(codedOutputStream, "output");
        this.f74829a = codedOutputStream2;
        codedOutputStream2.f74685a = this;
    }

    /* renamed from: P */
    public static C18521h m46167P(CodedOutputStream codedOutputStream) {
        C18521h c18521h = codedOutputStream.f74685a;
        if (c18521h != null) {
            return c18521h;
        }
        return new C18521h(codedOutputStream);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: A */
    public void mo46182A(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74829a.mo46645S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m46712M(list.get(i4).longValue());
            }
            this.f74829a.mo46643U0(i3);
            while (i2 < list.size()) {
                this.f74829a.m46713L0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74829a.m46715K0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: B */
    public InterfaceC18497Q.EnumC18498a mo46181B() {
        return InterfaceC18497Q.EnumC18498a.ASCENDING;
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: C */
    public void mo46180C(int i, long j) throws IOException {
        this.f74829a.m46727C0(i, j);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: D */
    public void mo46179D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74829a.mo46645S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m46716K(list.get(i4).intValue());
            }
            this.f74829a.mo46643U0(i3);
            while (i2 < list.size()) {
                this.f74829a.m46717J0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74829a.m46719I0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: E */
    public void mo46178E(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74829a.mo46645S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m46687e(list.get(i4).booleanValue());
            }
            this.f74829a.mo46643U0(i3);
            while (i2 < list.size()) {
                this.f74829a.m46683h0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74829a.mo46635g0(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: F */
    public void mo46177F(int i, float f) throws IOException {
        this.f74829a.m46664u0(i, f);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: G */
    public void mo46176G(int i, int i2) throws IOException {
        this.f74829a.m46672o0(i, i2);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: H */
    public void mo46175H(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74829a.mo46645S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m46657y(list.get(i4).longValue());
            }
            this.f74829a.mo46643U0(i3);
            while (i2 < list.size()) {
                this.f74829a.m46725D0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74829a.m46727C0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: I */
    public void mo46174I(int i, int i2) throws IOException {
        this.f74829a.m46711M0(i, i2);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: J */
    public void mo46173J(int i, Object obj, InterfaceC33832Jm5 interfaceC33832Jm5) throws IOException {
        this.f74829a.m46658x0(i, (InterfaceC18462D) obj, interfaceC33832Jm5);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: K */
    public void mo46172K(int i, AbstractC18504e abstractC18504e) throws IOException {
        this.f74829a.mo46633k0(i, abstractC18504e);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: L */
    public void mo46171L(int i, List<?> list, InterfaceC33832Jm5 interfaceC33832Jm5) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo46170M(i, list.get(i2), interfaceC33832Jm5);
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: M */
    public void mo46170M(int i, Object obj, InterfaceC33832Jm5 interfaceC33832Jm5) throws IOException {
        this.f74829a.mo46651E0(i, (InterfaceC18462D) obj, interfaceC33832Jm5);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: N */
    public <K, V> void mo46169N(int i, C18565z.C18566a<K, V> c18566a, Map<K, V> map) throws IOException {
        if (this.f74829a.m46692b0()) {
            m46163T(i, c18566a, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f74829a.mo46645S0(i, 2);
            this.f74829a.mo46643U0(C18565z.m45951b(c18566a, entry.getKey(), entry.getValue()));
            C18565z.m45948e(this.f74829a, c18566a, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: O */
    public void mo46168O(int i, List<?> list, InterfaceC33832Jm5 interfaceC33832Jm5) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo46173J(i, list.get(i2), interfaceC33832Jm5);
        }
    }

    /* renamed from: Q */
    public final <V> void m46166Q(int i, boolean z, V v, C18565z.C18566a<Boolean, V> c18566a) throws IOException {
        this.f74829a.mo46645S0(i, 2);
        this.f74829a.mo46643U0(C18565z.m45951b(c18566a, Boolean.valueOf(z), v));
        C18565z.m45948e(this.f74829a, c18566a, Boolean.valueOf(z), v);
    }

    /* renamed from: R */
    public final <V> void m46165R(int i, C18565z.C18566a<Integer, V> c18566a, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer num : map.keySet()) {
            iArr[i2] = num.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.f74829a.mo46645S0(i, 2);
            this.f74829a.mo46643U0(C18565z.m45951b(c18566a, Integer.valueOf(i4), v));
            C18565z.m45948e(this.f74829a, c18566a, Integer.valueOf(i4), v);
        }
    }

    /* renamed from: S */
    public final <V> void m46164S(int i, C18565z.C18566a<Long, V> c18566a, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long l : map.keySet()) {
            jArr[i2] = l.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.f74829a.mo46645S0(i, 2);
            this.f74829a.mo46643U0(C18565z.m45951b(c18566a, Long.valueOf(j), v));
            C18565z.m45948e(this.f74829a, c18566a, Long.valueOf(j), v);
        }
    }

    /* renamed from: T */
    public final <K, V> void m46163T(int i, C18565z.C18566a<K, V> c18566a, Map<K, V> map) throws IOException {
        switch (C18522a.f74830a[c18566a.f74898a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    m46166Q(i, false, v, c18566a);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    m46166Q(i, true, v2, c18566a);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m46165R(i, c18566a, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m46164S(i, c18566a, map);
                return;
            case 12:
                m46162U(i, c18566a, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + c18566a.f74898a);
        }
    }

    /* renamed from: U */
    public final <V> void m46162U(int i, C18565z.C18566a<String, V> c18566a, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        int i2 = 0;
        for (String str : map.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            V v = map.get(str2);
            this.f74829a.mo46645S0(i, 2);
            this.f74829a.mo46643U0(C18565z.m45951b(c18566a, str2, v));
            C18565z.m45948e(this.f74829a, c18566a, str2, v);
        }
    }

    /* renamed from: V */
    public final void m46161V(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f74829a.mo46647Q0(i, (String) obj);
        } else {
            this.f74829a.mo46633k0(i, (AbstractC18504e) obj);
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: a */
    public void mo46160a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74829a.mo46645S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m46668r(list.get(i4).floatValue());
            }
            this.f74829a.mo46643U0(i3);
            while (i2 < list.size()) {
                this.f74829a.m46662v0(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74829a.m46664u0(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: b */
    public final void mo46159b(int i, Object obj) throws IOException {
        if (obj instanceof AbstractC18504e) {
            this.f74829a.mo46648H0(i, (AbstractC18504e) obj);
        } else {
            this.f74829a.mo46649G0(i, (InterfaceC18462D) obj);
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: c */
    public void mo46158c(int i, int i2) throws IOException {
        this.f74829a.mo46631q0(i, i2);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: d */
    public void mo46157d(int i, String str) throws IOException {
        this.f74829a.mo46647Q0(i, str);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: e */
    public void mo46156e(int i, long j) throws IOException {
        this.f74829a.mo46642V0(i, j);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: f */
    public void mo46155f(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74829a.mo46645S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m46661w(list.get(i4).intValue());
            }
            this.f74829a.mo46643U0(i3);
            while (i2 < list.size()) {
                this.f74829a.mo46652B0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74829a.mo46653A0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: g */
    public void mo46154g(int i, int i2) throws IOException {
        this.f74829a.mo46653A0(i, i2);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: h */
    public void mo46153h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74829a.mo46645S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m46675n(list.get(i4).intValue());
            }
            this.f74829a.mo46643U0(i3);
            while (i2 < list.size()) {
                this.f74829a.mo46630r0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74829a.mo46631q0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: i */
    public void mo46152i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74829a.mo46645S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m46699V(list.get(i4).intValue());
            }
            this.f74829a.mo46643U0(i3);
            while (i2 < list.size()) {
                this.f74829a.mo46643U0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74829a.mo46644T0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: j */
    public void mo46151j(int i, long j) throws IOException {
        this.f74829a.m46707O0(i, j);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: k */
    public void mo46150k(int i, int i2) throws IOException {
        this.f74829a.mo46644T0(i, i2);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: l */
    public void mo46149l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74829a.mo46645S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m46697X(list.get(i4).longValue());
            }
            this.f74829a.mo46643U0(i3);
            while (i2 < list.size()) {
                this.f74829a.mo46641W0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74829a.mo46642V0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: m */
    public void mo46148m(int i, long j) throws IOException {
        this.f74829a.mo46629s0(i, j);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: n */
    public void mo46147n(int i, boolean z) throws IOException {
        this.f74829a.mo46635g0(i, z);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: o */
    public void mo46146o(int i, int i2) throws IOException {
        this.f74829a.m46719I0(i, i2);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    @Deprecated
    /* renamed from: p */
    public void mo46145p(int i) throws IOException {
        this.f74829a.mo46645S0(i, 3);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: q */
    public void mo46144q(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74829a.mo46645S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m46671p(list.get(i4).longValue());
            }
            this.f74829a.mo46643U0(i3);
            while (i2 < list.size()) {
                this.f74829a.mo46628t0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74829a.mo46629s0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    @Deprecated
    /* renamed from: r */
    public void mo46143r(int i) throws IOException {
        this.f74829a.mo46645S0(i, 4);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: s */
    public void mo46142s(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74829a.mo46645S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m46708O(list.get(i4).intValue());
            }
            this.f74829a.mo46643U0(i3);
            while (i2 < list.size()) {
                this.f74829a.m46709N0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74829a.m46711M0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: t */
    public void mo46141t(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74829a.mo46645S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m46680j(list.get(i4).doubleValue());
            }
            this.f74829a.mo46643U0(i3);
            while (i2 < list.size()) {
                this.f74829a.m46674n0(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74829a.m46676m0(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: u */
    public void mo46140u(int i, List<AbstractC18504e> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f74829a.mo46633k0(i, list.get(i2));
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: v */
    public void mo46139v(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof InterfaceC35017Oo2) {
            InterfaceC35017Oo2 interfaceC35017Oo2 = (InterfaceC35017Oo2) list;
            while (i2 < list.size()) {
                m46161V(i, interfaceC35017Oo2.mo13907l(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74829a.mo46647Q0(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: w */
    public void mo46138w(int i, long j) throws IOException {
        this.f74829a.m46715K0(i, j);
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: x */
    public void mo46137x(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74829a.mo46645S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m46704Q(list.get(i4).longValue());
            }
            this.f74829a.mo46643U0(i3);
            while (i2 < list.size()) {
                this.f74829a.m46705P0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74829a.m46707O0(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: y */
    public void mo46136y(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f74829a.mo46645S0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m46678l(list.get(i4).intValue());
            }
            this.f74829a.mo46643U0(i3);
            while (i2 < list.size()) {
                this.f74829a.m46670p0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f74829a.m46672o0(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.InterfaceC18497Q
    /* renamed from: z */
    public void mo46135z(int i, double d) throws IOException {
        this.f74829a.m46676m0(i, d);
    }
}
