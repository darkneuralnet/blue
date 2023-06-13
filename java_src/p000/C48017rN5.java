package p000;

import java.util.Arrays;
import java.util.HashSet;
/* renamed from: rN5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C48017rN5 implements Comparable<C48017rN5> {

    /* renamed from: s */
    public static int f106916s = 1;

    /* renamed from: b */
    public boolean f106917b;

    /* renamed from: c */
    public String f106918c;

    /* renamed from: g */
    public float f106922g;

    /* renamed from: k */
    public EnumC27904a f106926k;

    /* renamed from: d */
    public int f106919d = -1;

    /* renamed from: e */
    public int f106920e = -1;

    /* renamed from: f */
    public int f106921f = 0;

    /* renamed from: h */
    public boolean f106923h = false;

    /* renamed from: i */
    public float[] f106924i = new float[9];

    /* renamed from: j */
    public float[] f106925j = new float[9];

    /* renamed from: l */
    public C30303xo[] f106927l = new C30303xo[16];

    /* renamed from: m */
    public int f106928m = 0;

    /* renamed from: n */
    public int f106929n = 0;

    /* renamed from: o */
    public boolean f106930o = false;

    /* renamed from: p */
    public int f106931p = -1;

    /* renamed from: q */
    public float f106932q = 0.0f;

    /* renamed from: r */
    public HashSet<C30303xo> f106933r = null;

    /* renamed from: rN5$a */
    /* loaded from: classes.dex */
    public enum EnumC27904a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C48017rN5(EnumC27904a enumC27904a, String str) {
        this.f106926k = enumC27904a;
    }

    /* renamed from: c */
    public static void m16024c() {
        f106916s++;
    }

    /* renamed from: a */
    public final void m16026a(C30303xo c30303xo) {
        int i = 0;
        while (true) {
            int i2 = this.f106928m;
            if (i < i2) {
                if (this.f106927l[i] == c30303xo) {
                    return;
                }
                i++;
            } else {
                C30303xo[] c30303xoArr = this.f106927l;
                if (i2 >= c30303xoArr.length) {
                    this.f106927l = (C30303xo[]) Arrays.copyOf(c30303xoArr, c30303xoArr.length * 2);
                }
                C30303xo[] c30303xoArr2 = this.f106927l;
                int i3 = this.f106928m;
                c30303xoArr2[i3] = c30303xo;
                this.f106928m = i3 + 1;
                return;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(C48017rN5 c48017rN5) {
        return this.f106919d - c48017rN5.f106919d;
    }

    /* renamed from: d */
    public final void m16023d(C30303xo c30303xo) {
        int i = this.f106928m;
        int i2 = 0;
        while (i2 < i) {
            if (this.f106927l[i2] == c30303xo) {
                while (i2 < i - 1) {
                    C30303xo[] c30303xoArr = this.f106927l;
                    int i3 = i2 + 1;
                    c30303xoArr[i2] = c30303xoArr[i3];
                    i2 = i3;
                }
                this.f106928m--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: e */
    public void m16022e() {
        this.f106918c = null;
        this.f106926k = EnumC27904a.UNKNOWN;
        this.f106921f = 0;
        this.f106919d = -1;
        this.f106920e = -1;
        this.f106922g = 0.0f;
        this.f106923h = false;
        this.f106930o = false;
        this.f106931p = -1;
        this.f106932q = 0.0f;
        int i = this.f106928m;
        for (int i2 = 0; i2 < i; i2++) {
            this.f106927l[i2] = null;
        }
        this.f106928m = 0;
        this.f106929n = 0;
        this.f106917b = false;
        Arrays.fill(this.f106925j, 0.0f);
    }

    /* renamed from: f */
    public void m16021f(C34342Lr2 c34342Lr2, float f) {
        this.f106922g = f;
        this.f106923h = true;
        this.f106930o = false;
        this.f106931p = -1;
        this.f106932q = 0.0f;
        int i = this.f106928m;
        this.f106920e = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f106927l[i2].m4692A(c34342Lr2, this, false);
        }
        this.f106928m = 0;
    }

    /* renamed from: g */
    public void m16020g(EnumC27904a enumC27904a, String str) {
        this.f106926k = enumC27904a;
    }

    /* renamed from: h */
    public final void m16019h(C34342Lr2 c34342Lr2, C30303xo c30303xo) {
        int i = this.f106928m;
        for (int i2 = 0; i2 < i; i2++) {
            this.f106927l[i2].mo4691B(c34342Lr2, c30303xo, false);
        }
        this.f106928m = 0;
    }

    public String toString() {
        if (this.f106918c != null) {
            return "" + this.f106918c;
        }
        return "" + this.f106919d;
    }
}
