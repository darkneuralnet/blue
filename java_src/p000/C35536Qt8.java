package p000;

import com.google.android.gms.internal.clearcut.C17508i;
import com.google.android.gms.internal.clearcut.C17510j;
import com.google.android.gms.internal.clearcut.zzbn;
import java.io.IOException;
import java.util.Arrays;
/* renamed from: Qt8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35536Qt8 extends C32179Ck8<C35536Qt8> implements Cloneable {

    /* renamed from: A */
    public C17510j f31142A;

    /* renamed from: B */
    public boolean f31143B;

    /* renamed from: d */
    public long f31144d = 0;

    /* renamed from: e */
    public long f31145e = 0;

    /* renamed from: f */
    public long f31146f = 0;

    /* renamed from: g */
    public String f31147g = "";

    /* renamed from: h */
    public int f31148h = 0;

    /* renamed from: i */
    public String f31149i = "";

    /* renamed from: j */
    public int f31150j = 0;

    /* renamed from: k */
    public boolean f31151k = false;

    /* renamed from: l */
    public C41221fu8[] f31152l = C41221fu8.m40564k();

    /* renamed from: m */
    public byte[] f31153m;

    /* renamed from: n */
    public C17508i f31154n;

    /* renamed from: o */
    public byte[] f31155o;

    /* renamed from: p */
    public String f31156p;

    /* renamed from: q */
    public String f31157q;

    /* renamed from: r */
    public C32251Cs8 f31158r;

    /* renamed from: s */
    public String f31159s;

    /* renamed from: t */
    public long f31160t;

    /* renamed from: u */
    public C35761Rs8 f31161u;

    /* renamed from: v */
    public byte[] f31162v;

    /* renamed from: w */
    public String f31163w;

    /* renamed from: x */
    public int f31164x;

    /* renamed from: y */
    public int[] f31165y;

    /* renamed from: z */
    public long f31166z;

    public C35536Qt8() {
        byte[] bArr = C40558en8.f78868h;
        this.f31153m = bArr;
        this.f31154n = null;
        this.f31155o = bArr;
        this.f31156p = "";
        this.f31157q = "";
        this.f31158r = null;
        this.f31159s = "";
        this.f31160t = 180000L;
        this.f31161u = null;
        this.f31162v = bArr;
        this.f31163w = "";
        this.f31164x = 0;
        this.f31165y = C40558en8.f78861a;
        this.f31166z = 0L;
        this.f31142A = null;
        this.f31143B = false;
        this.f4623c = null;
        this.f30878b = -1;
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: d */
    public final void mo40568d(C39325ck8 c39325ck8) throws IOException {
        long j = this.f31144d;
        if (j != 0) {
            c39325ck8.m60948u(1, j);
        }
        String str = this.f31147g;
        if (str != null && !str.equals("")) {
            c39325ck8.m60967b(2, this.f31147g);
        }
        C41221fu8[] c41221fu8Arr = this.f31152l;
        int i = 0;
        if (c41221fu8Arr != null && c41221fu8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C41221fu8[] c41221fu8Arr2 = this.f31152l;
                if (i2 >= c41221fu8Arr2.length) {
                    break;
                }
                C41221fu8 c41221fu8 = c41221fu8Arr2[i2];
                if (c41221fu8 != null) {
                    c39325ck8.m60966c(3, c41221fu8);
                }
                i2++;
            }
        }
        byte[] bArr = this.f31153m;
        byte[] bArr2 = C40558en8.f78868h;
        if (!Arrays.equals(bArr, bArr2)) {
            c39325ck8.m60965d(4, this.f31153m);
        }
        if (!Arrays.equals(this.f31155o, bArr2)) {
            c39325ck8.m60965d(6, this.f31155o);
        }
        C32251Cs8 c32251Cs8 = this.f31158r;
        if (c32251Cs8 != null) {
            c39325ck8.m60966c(7, c32251Cs8);
        }
        String str2 = this.f31156p;
        if (str2 != null && !str2.equals("")) {
            c39325ck8.m60967b(8, this.f31156p);
        }
        C17508i c17508i = this.f31154n;
        if (c17508i != null) {
            c39325ck8.m60954o(9, c17508i);
        }
        int i3 = this.f31148h;
        if (i3 != 0) {
            c39325ck8.m60957l(11, i3);
        }
        String str3 = this.f31157q;
        if (str3 != null && !str3.equals("")) {
            c39325ck8.m60967b(13, this.f31157q);
        }
        String str4 = this.f31159s;
        if (str4 != null && !str4.equals("")) {
            c39325ck8.m60967b(14, this.f31159s);
        }
        long j2 = this.f31160t;
        if (j2 != 180000) {
            c39325ck8.m60959j(15, 0);
            c39325ck8.m60946w(C39325ck8.m60947v(j2));
        }
        C35761Rs8 c35761Rs8 = this.f31161u;
        if (c35761Rs8 != null) {
            c39325ck8.m60966c(16, c35761Rs8);
        }
        long j3 = this.f31145e;
        if (j3 != 0) {
            c39325ck8.m60948u(17, j3);
        }
        if (!Arrays.equals(this.f31162v, bArr2)) {
            c39325ck8.m60965d(18, this.f31162v);
        }
        int[] iArr = this.f31165y;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f31165y;
                if (i >= iArr2.length) {
                    break;
                }
                c39325ck8.m60957l(20, iArr2[i]);
                i++;
            }
        }
        C17510j c17510j = this.f31142A;
        if (c17510j != null) {
            c39325ck8.m60954o(23, c17510j);
        }
        String str5 = this.f31163w;
        if (str5 != null && !str5.equals("")) {
            c39325ck8.m60967b(24, this.f31163w);
        }
        boolean z = this.f31143B;
        if (z) {
            c39325ck8.m60958k(25, z);
        }
        String str6 = this.f31149i;
        if (str6 != null && !str6.equals("")) {
            c39325ck8.m60967b(26, this.f31149i);
        }
        super.mo40568d(c39325ck8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35536Qt8) {
            C35536Qt8 c35536Qt8 = (C35536Qt8) obj;
            if (this.f31144d == c35536Qt8.f31144d && this.f31145e == c35536Qt8.f31145e) {
                String str = this.f31147g;
                if (str == null) {
                    if (c35536Qt8.f31147g != null) {
                        return false;
                    }
                } else if (!str.equals(c35536Qt8.f31147g)) {
                    return false;
                }
                if (this.f31148h != c35536Qt8.f31148h) {
                    return false;
                }
                String str2 = this.f31149i;
                if (str2 == null) {
                    if (c35536Qt8.f31149i != null) {
                        return false;
                    }
                } else if (!str2.equals(c35536Qt8.f31149i)) {
                    return false;
                }
                if (C32422Dl8.m109971c(this.f31152l, c35536Qt8.f31152l) && Arrays.equals(this.f31153m, c35536Qt8.f31153m)) {
                    C17508i c17508i = this.f31154n;
                    if (c17508i == null) {
                        if (c35536Qt8.f31154n != null) {
                            return false;
                        }
                    } else if (!c17508i.equals(c35536Qt8.f31154n)) {
                        return false;
                    }
                    if (Arrays.equals(this.f31155o, c35536Qt8.f31155o)) {
                        String str3 = this.f31156p;
                        if (str3 == null) {
                            if (c35536Qt8.f31156p != null) {
                                return false;
                            }
                        } else if (!str3.equals(c35536Qt8.f31156p)) {
                            return false;
                        }
                        String str4 = this.f31157q;
                        if (str4 == null) {
                            if (c35536Qt8.f31157q != null) {
                                return false;
                            }
                        } else if (!str4.equals(c35536Qt8.f31157q)) {
                            return false;
                        }
                        C32251Cs8 c32251Cs8 = this.f31158r;
                        if (c32251Cs8 == null) {
                            if (c35536Qt8.f31158r != null) {
                                return false;
                            }
                        } else if (!c32251Cs8.equals(c35536Qt8.f31158r)) {
                            return false;
                        }
                        String str5 = this.f31159s;
                        if (str5 == null) {
                            if (c35536Qt8.f31159s != null) {
                                return false;
                            }
                        } else if (!str5.equals(c35536Qt8.f31159s)) {
                            return false;
                        }
                        if (this.f31160t != c35536Qt8.f31160t) {
                            return false;
                        }
                        C35761Rs8 c35761Rs8 = this.f31161u;
                        if (c35761Rs8 == null) {
                            if (c35536Qt8.f31161u != null) {
                                return false;
                            }
                        } else if (!c35761Rs8.equals(c35536Qt8.f31161u)) {
                            return false;
                        }
                        if (Arrays.equals(this.f31162v, c35536Qt8.f31162v)) {
                            String str6 = this.f31163w;
                            if (str6 == null) {
                                if (c35536Qt8.f31163w != null) {
                                    return false;
                                }
                            } else if (!str6.equals(c35536Qt8.f31163w)) {
                                return false;
                            }
                            if (C32422Dl8.m109973a(this.f31165y, c35536Qt8.f31165y)) {
                                C17510j c17510j = this.f31142A;
                                if (c17510j == null) {
                                    if (c35536Qt8.f31142A != null) {
                                        return false;
                                    }
                                } else if (!c17510j.equals(c35536Qt8.f31142A)) {
                                    return false;
                                }
                                if (this.f31143B != c35536Qt8.f31143B) {
                                    return false;
                                }
                                C39335cl8 c39335cl8 = this.f4623c;
                                if (c39335cl8 == null || c39335cl8.m60897d()) {
                                    C39335cl8 c39335cl82 = c35536Qt8.f4623c;
                                    return c39335cl82 == null || c39335cl82.m60897d();
                                }
                                return this.f4623c.equals(c35536Qt8.f4623c);
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: g */
    public final int mo40567g() {
        int[] iArr;
        int mo40567g = super.mo40567g();
        long j = this.f31144d;
        if (j != 0) {
            mo40567g += C39325ck8.m60956m(1, j);
        }
        String str = this.f31147g;
        if (str != null && !str.equals("")) {
            mo40567g += C39325ck8.m60962g(2, this.f31147g);
        }
        C41221fu8[] c41221fu8Arr = this.f31152l;
        int i = 0;
        if (c41221fu8Arr != null && c41221fu8Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C41221fu8[] c41221fu8Arr2 = this.f31152l;
                if (i2 >= c41221fu8Arr2.length) {
                    break;
                }
                C41221fu8 c41221fu8 = c41221fu8Arr2[i2];
                if (c41221fu8 != null) {
                    mo40567g += C39325ck8.m60961h(3, c41221fu8);
                }
                i2++;
            }
        }
        byte[] bArr = this.f31153m;
        byte[] bArr2 = C40558en8.f78868h;
        if (!Arrays.equals(bArr, bArr2)) {
            mo40567g += C39325ck8.m60960i(4, this.f31153m);
        }
        if (!Arrays.equals(this.f31155o, bArr2)) {
            mo40567g += C39325ck8.m60960i(6, this.f31155o);
        }
        C32251Cs8 c32251Cs8 = this.f31158r;
        if (c32251Cs8 != null) {
            mo40567g += C39325ck8.m60961h(7, c32251Cs8);
        }
        String str2 = this.f31156p;
        if (str2 != null && !str2.equals("")) {
            mo40567g += C39325ck8.m60962g(8, this.f31156p);
        }
        C17508i c17508i = this.f31154n;
        if (c17508i != null) {
            mo40567g += zzbn.m51431O(9, c17508i);
        }
        int i3 = this.f31148h;
        if (i3 != 0) {
            mo40567g += C39325ck8.m60944y(11) + C39325ck8.m60943z(i3);
        }
        String str3 = this.f31157q;
        if (str3 != null && !str3.equals("")) {
            mo40567g += C39325ck8.m60962g(13, this.f31157q);
        }
        String str4 = this.f31159s;
        if (str4 != null && !str4.equals("")) {
            mo40567g += C39325ck8.m60962g(14, this.f31159s);
        }
        long j2 = this.f31160t;
        if (j2 != 180000) {
            mo40567g += C39325ck8.m60944y(15) + C39325ck8.m60945x(C39325ck8.m60947v(j2));
        }
        C35761Rs8 c35761Rs8 = this.f31161u;
        if (c35761Rs8 != null) {
            mo40567g += C39325ck8.m60961h(16, c35761Rs8);
        }
        long j3 = this.f31145e;
        if (j3 != 0) {
            mo40567g += C39325ck8.m60956m(17, j3);
        }
        if (!Arrays.equals(this.f31162v, bArr2)) {
            mo40567g += C39325ck8.m60960i(18, this.f31162v);
        }
        int[] iArr2 = this.f31165y;
        if (iArr2 != null && iArr2.length > 0) {
            int i4 = 0;
            while (true) {
                iArr = this.f31165y;
                if (i >= iArr.length) {
                    break;
                }
                i4 += C39325ck8.m60943z(iArr[i]);
                i++;
            }
            mo40567g = mo40567g + i4 + (iArr.length * 2);
        }
        C17510j c17510j = this.f31142A;
        if (c17510j != null) {
            mo40567g += zzbn.m51431O(23, c17510j);
        }
        String str5 = this.f31163w;
        if (str5 != null && !str5.equals("")) {
            mo40567g += C39325ck8.m60962g(24, this.f31163w);
        }
        if (this.f31143B) {
            mo40567g += C39325ck8.m60944y(25) + 1;
        }
        String str6 = this.f31149i;
        return (str6 == null || str6.equals("")) ? mo40567g : mo40567g + C39325ck8.m60962g(26, this.f31149i);
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: h */
    public final /* synthetic */ C35464Ql8 mo40566h() throws CloneNotSupportedException {
        return (C35536Qt8) clone();
    }

    public final int hashCode() {
        long j = this.f31144d;
        long j2 = this.f31145e;
        int hashCode = (((((C35536Qt8.class.getName().hashCode() + 527) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31 * 31;
        String str = this.f31147g;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f31148h) * 31;
        String str2 = this.f31149i;
        int hashCode3 = ((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31 * 31) + 1237) * 31) + C32422Dl8.m109968f(this.f31152l)) * 31) + Arrays.hashCode(this.f31153m);
        C17508i c17508i = this.f31154n;
        int hashCode4 = ((((hashCode3 * 31) + (c17508i == null ? 0 : c17508i.hashCode())) * 31) + Arrays.hashCode(this.f31155o)) * 31;
        String str3 = this.f31156p;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f31157q;
        int hashCode6 = hashCode5 + (str4 == null ? 0 : str4.hashCode());
        C32251Cs8 c32251Cs8 = this.f31158r;
        int hashCode7 = ((hashCode6 * 31) + (c32251Cs8 == null ? 0 : c32251Cs8.hashCode())) * 31;
        String str5 = this.f31159s;
        int hashCode8 = str5 == null ? 0 : str5.hashCode();
        long j3 = this.f31160t;
        C35761Rs8 c35761Rs8 = this.f31161u;
        int hashCode9 = (((((((hashCode7 + hashCode8) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (c35761Rs8 == null ? 0 : c35761Rs8.hashCode())) * 31) + Arrays.hashCode(this.f31162v)) * 31;
        String str6 = this.f31163w;
        int hashCode10 = str6 == null ? 0 : str6.hashCode();
        C17510j c17510j = this.f31142A;
        int m109970d = (((((((hashCode9 + hashCode10) * 31 * 31) + C32422Dl8.m109970d(this.f31165y)) * 31 * 31) + (c17510j == null ? 0 : c17510j.hashCode())) * 31) + (this.f31143B ? 1231 : 1237)) * 31;
        C39335cl8 c39335cl8 = this.f4623c;
        if (c39335cl8 != null && !c39335cl8.m60897d()) {
            i = this.f4623c.hashCode();
        }
        return m109970d + i;
    }

    @Override // p000.C32179Ck8
    /* renamed from: j */
    public final /* synthetic */ C35536Qt8 mo40565j() throws CloneNotSupportedException {
        return (C35536Qt8) clone();
    }

    @Override // p000.C32179Ck8, p000.C35464Ql8
    /* renamed from: k */
    public final C35536Qt8 clone() {
        try {
            C35536Qt8 c35536Qt8 = (C35536Qt8) super.clone();
            C41221fu8[] c41221fu8Arr = this.f31152l;
            if (c41221fu8Arr != null && c41221fu8Arr.length > 0) {
                c35536Qt8.f31152l = new C41221fu8[c41221fu8Arr.length];
                int i = 0;
                while (true) {
                    C41221fu8[] c41221fu8Arr2 = this.f31152l;
                    if (i >= c41221fu8Arr2.length) {
                        break;
                    }
                    C41221fu8 c41221fu8 = c41221fu8Arr2[i];
                    if (c41221fu8 != null) {
                        c35536Qt8.f31152l[i] = (C41221fu8) c41221fu8.clone();
                    }
                    i++;
                }
            }
            C17508i c17508i = this.f31154n;
            if (c17508i != null) {
                c35536Qt8.f31154n = c17508i;
            }
            C32251Cs8 c32251Cs8 = this.f31158r;
            if (c32251Cs8 != null) {
                c35536Qt8.f31158r = (C32251Cs8) c32251Cs8.clone();
            }
            C35761Rs8 c35761Rs8 = this.f31161u;
            if (c35761Rs8 != null) {
                c35536Qt8.f31161u = (C35761Rs8) c35761Rs8.clone();
            }
            int[] iArr = this.f31165y;
            if (iArr != null && iArr.length > 0) {
                c35536Qt8.f31165y = (int[]) iArr.clone();
            }
            C17510j c17510j = this.f31142A;
            if (c17510j != null) {
                c35536Qt8.f31142A = c17510j;
            }
            return c35536Qt8;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
