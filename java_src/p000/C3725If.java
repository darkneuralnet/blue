package p000;
/* renamed from: If */
/* loaded from: classes6.dex */
public final class C3725If extends AbstractC3201Hf {

    /* renamed from: c */
    public final C52849zX5 f15985c;

    /* renamed from: d */
    public final boolean f15986d;

    /* renamed from: e */
    public final O70 f15987e;

    /* renamed from: f */
    public final int f15988f;

    /* renamed from: g */
    public int f15989g;

    /* renamed from: h */
    public final C3725If f15990h;

    /* renamed from: i */
    public C3725If f15991i;

    public C3725If(C52849zX5 c52849zX5, boolean z, O70 o70, C3725If c3725If) {
        super(589824);
        int i;
        this.f15985c = c52849zX5;
        this.f15986d = z;
        this.f15987e = o70;
        int i2 = o70.f25908b;
        if (i2 == 0) {
            i = -1;
        } else {
            i = i2 - 2;
        }
        this.f15988f = i;
        this.f15990h = c3725If;
        if (c3725If != null) {
            c3725If.f15991i = this;
        }
    }

    /* renamed from: f */
    public static int m101837f(C3725If c3725If, C3725If c3725If2, C3725If c3725If3, C3725If c3725If4) {
        int i = 0;
        if (c3725If != null) {
            i = 0 + c3725If.m101836g("RuntimeVisibleAnnotations");
        }
        if (c3725If2 != null) {
            i += c3725If2.m101836g("RuntimeInvisibleAnnotations");
        }
        if (c3725If3 != null) {
            i += c3725If3.m101836g("RuntimeVisibleTypeAnnotations");
        }
        if (c3725If4 != null) {
            return i + c3725If4.m101836g("RuntimeInvisibleTypeAnnotations");
        }
        return i;
    }

    /* renamed from: h */
    public static int m101835h(String str, C3725If[] c3725IfArr, int i) {
        int i2 = (i * 2) + 7;
        for (int i3 = 0; i3 < i; i3++) {
            C3725If c3725If = c3725IfArr[i3];
            i2 += c3725If == null ? 0 : c3725If.m101836g(str) - 8;
        }
        return i2;
    }

    /* renamed from: i */
    public static C3725If m101834i(C52849zX5 c52849zX5, int i, C32330Db6 c32330Db6, String str, C3725If c3725If) {
        O70 o70 = new O70();
        C32564Eb6.m108690a(i, o70);
        C32330Db6.m110120d(c32330Db6, o70);
        o70.m92888k(c52849zX5.m1241D(str)).m92888k(0);
        return new C3725If(c52849zX5, true, o70, c3725If);
    }

    /* renamed from: j */
    public static C3725If m101833j(C52849zX5 c52849zX5, String str, C3725If c3725If) {
        O70 o70 = new O70();
        o70.m92888k(c52849zX5.m1241D(str)).m92888k(0);
        return new C3725If(c52849zX5, true, o70, c3725If);
    }

    /* renamed from: l */
    public static void m101831l(C52849zX5 c52849zX5, C3725If c3725If, C3725If c3725If2, C3725If c3725If3, C3725If c3725If4, O70 o70) {
        if (c3725If != null) {
            c3725If.m101832k(c52849zX5.m1241D("RuntimeVisibleAnnotations"), o70);
        }
        if (c3725If2 != null) {
            c3725If2.m101832k(c52849zX5.m1241D("RuntimeInvisibleAnnotations"), o70);
        }
        if (c3725If3 != null) {
            c3725If3.m101832k(c52849zX5.m1241D("RuntimeVisibleTypeAnnotations"), o70);
        }
        if (c3725If4 != null) {
            c3725If4.m101832k(c52849zX5.m1241D("RuntimeInvisibleTypeAnnotations"), o70);
        }
    }

    /* renamed from: m */
    public static void m101830m(int i, C3725If[] c3725IfArr, int i2, O70 o70) {
        int i3 = (i2 * 2) + 1;
        for (int i4 = 0; i4 < i2; i4++) {
            C3725If c3725If = c3725IfArr[i4];
            i3 += c3725If == null ? 0 : c3725If.m101836g(null) - 8;
        }
        o70.m92888k(i);
        o70.m92890i(i3);
        o70.m92892g(i2);
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = 0;
            C3725If c3725If2 = null;
            for (C3725If c3725If3 = c3725IfArr[i5]; c3725If3 != null; c3725If3 = c3725If3.f15990h) {
                c3725If3.mo101839d();
                i6++;
                c3725If2 = c3725If3;
            }
            o70.m92888k(i6);
            while (c3725If2 != null) {
                O70 o702 = c3725If2.f15987e;
                o70.m92891h(o702.f25907a, 0, o702.f25908b);
                c3725If2 = c3725If2.f15991i;
            }
        }
    }

    @Override // p000.AbstractC3201Hf
    /* renamed from: a */
    public void mo101842a(String str, Object obj) {
        this.f15989g++;
        if (this.f15986d) {
            this.f15987e.m92888k(this.f15985c.m1241D(str));
        }
        if (obj instanceof String) {
            this.f15987e.m92894e(115, this.f15985c.m1241D((String) obj));
        } else if (obj instanceof Byte) {
            this.f15987e.m92894e(66, this.f15985c.m1201l(((Byte) obj).byteValue()).f114226a);
        } else if (obj instanceof Boolean) {
            this.f15987e.m92894e(90, this.f15985c.m1201l(((Boolean) obj).booleanValue() ? 1 : 0).f114226a);
        } else if (obj instanceof Character) {
            this.f15987e.m92894e(67, this.f15985c.m1201l(((Character) obj).charValue()).f114226a);
        } else if (obj instanceof Short) {
            this.f15987e.m92894e(83, this.f15985c.m1201l(((Short) obj).shortValue()).f114226a);
        } else if (obj instanceof C31628Ab6) {
            this.f15987e.m92894e(99, this.f15985c.m1241D(((C31628Ab6) obj).m115480d()));
        } else {
            int i = 0;
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f15987e.m92894e(91, bArr.length);
                int length = bArr.length;
                while (i < length) {
                    this.f15987e.m92894e(66, this.f15985c.m1201l(bArr[i]).f114226a);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                this.f15987e.m92894e(91, zArr.length);
                int length2 = zArr.length;
                while (i < length2) {
                    this.f15987e.m92894e(90, this.f15985c.m1201l(zArr[i] ? 1 : 0).f114226a);
                    i++;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                this.f15987e.m92894e(91, sArr.length);
                int length3 = sArr.length;
                while (i < length3) {
                    this.f15987e.m92894e(83, this.f15985c.m1201l(sArr[i]).f114226a);
                    i++;
                }
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                this.f15987e.m92894e(91, cArr.length);
                int length4 = cArr.length;
                while (i < length4) {
                    this.f15987e.m92894e(67, this.f15985c.m1201l(cArr[i]).f114226a);
                    i++;
                }
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                this.f15987e.m92894e(91, iArr.length);
                int length5 = iArr.length;
                while (i < length5) {
                    this.f15987e.m92894e(73, this.f15985c.m1201l(iArr[i]).f114226a);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                this.f15987e.m92894e(91, jArr.length);
                int length6 = jArr.length;
                while (i < length6) {
                    this.f15987e.m92894e(74, this.f15985c.m1197p(jArr[i]).f114226a);
                    i++;
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                this.f15987e.m92894e(91, fArr.length);
                int length7 = fArr.length;
                while (i < length7) {
                    this.f15987e.m92894e(70, this.f15985c.m1202k(fArr[i]).f114226a);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                this.f15987e.m92894e(91, dArr.length);
                int length8 = dArr.length;
                while (i < length8) {
                    this.f15987e.m92894e(68, this.f15985c.m1208f(dArr[i]).f114226a);
                    i++;
                }
            } else {
                AbstractC50477vX5 m1212d = this.f15985c.m1212d(obj);
                this.f15987e.m92894e(".s.IFJDCS".charAt(m1212d.f114227b), m1212d.f114226a);
            }
        }
    }

    @Override // p000.AbstractC3201Hf
    /* renamed from: b */
    public AbstractC3201Hf mo101841b(String str, String str2) {
        this.f15989g++;
        if (this.f15986d) {
            this.f15987e.m92888k(this.f15985c.m1241D(str));
        }
        this.f15987e.m92894e(64, this.f15985c.m1241D(str2)).m92888k(0);
        return new C3725If(this.f15985c, true, this.f15987e, null);
    }

    @Override // p000.AbstractC3201Hf
    /* renamed from: c */
    public AbstractC3201Hf mo101840c(String str) {
        this.f15989g++;
        if (this.f15986d) {
            this.f15987e.m92888k(this.f15985c.m1241D(str));
        }
        this.f15987e.m92894e(91, 0);
        return new C3725If(this.f15985c, false, this.f15987e, null);
    }

    @Override // p000.AbstractC3201Hf
    /* renamed from: d */
    public void mo101839d() {
        int i = this.f15988f;
        if (i != -1) {
            byte[] bArr = this.f15987e.f25907a;
            int i2 = this.f15989g;
            bArr[i] = (byte) (i2 >>> 8);
            bArr[i + 1] = (byte) i2;
        }
    }

    @Override // p000.AbstractC3201Hf
    /* renamed from: e */
    public void mo101838e(String str, String str2, String str3) {
        this.f15989g++;
        if (this.f15986d) {
            this.f15987e.m92888k(this.f15985c.m1241D(str));
        }
        this.f15987e.m92894e(101, this.f15985c.m1241D(str2)).m92888k(this.f15985c.m1241D(str3));
    }

    /* renamed from: g */
    public int m101836g(String str) {
        if (str != null) {
            this.f15985c.m1241D(str);
        }
        int i = 8;
        for (C3725If c3725If = this; c3725If != null; c3725If = c3725If.f15990h) {
            i += c3725If.f15987e.f25908b;
        }
        return i;
    }

    /* renamed from: k */
    public void m101832k(int i, O70 o70) {
        int i2 = 2;
        int i3 = 0;
        C3725If c3725If = null;
        for (C3725If c3725If2 = this; c3725If2 != null; c3725If2 = c3725If2.f15990h) {
            c3725If2.mo101839d();
            i2 += c3725If2.f15987e.f25908b;
            i3++;
            c3725If = c3725If2;
        }
        o70.m92888k(i);
        o70.m92890i(i2);
        o70.m92888k(i3);
        while (c3725If != null) {
            O70 o702 = c3725If.f15987e;
            o70.m92891h(o702.f25907a, 0, o702.f25908b);
            c3725If = c3725If.f15991i;
        }
    }
}
