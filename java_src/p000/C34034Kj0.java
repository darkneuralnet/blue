package p000;

import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import net.danlew.android.joda.DateUtils;
/* renamed from: Kj0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34034Kj0 {
    @Deprecated

    /* renamed from: a */
    public final byte[] f20095a;

    /* renamed from: b */
    public final int f20096b;

    /* renamed from: c */
    public final byte[] f20097c;

    /* renamed from: d */
    public final int[] f20098d;

    /* renamed from: e */
    public final String[] f20099e;

    /* renamed from: f */
    public final C35105Oy0[] f20100f;

    /* renamed from: g */
    public final int[] f20101g;

    /* renamed from: h */
    public final int f20102h;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C34034Kj0(byte[] bArr, int i, boolean z) {
        C35105Oy0[] c35105Oy0Arr;
        int i2;
        this.f20097c = bArr;
        this.f20095a = bArr;
        if (z) {
            if (m98456C(i + 6) > 61) {
                throw new IllegalArgumentException("Unsupported class file major version " + ((int) m98456C(i2)));
            }
        }
        int m98450I = m98450I(i + 8);
        this.f20098d = new int[m98450I];
        this.f20099e = new String[m98450I];
        int i3 = i + 10;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i5 = 1;
        while (i5 < m98450I) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            this.f20098d[i5] = i7;
            int i8 = 3;
            switch (bArr[i3]) {
                case 1:
                    i8 = 3 + m98450I(i7);
                    if (i8 > i4) {
                        i4 = i8;
                    }
                    i5 = i6;
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    i5 = i6;
                    i8 = 5;
                    break;
                case 5:
                case 6:
                    i6++;
                    i8 = 9;
                    i5 = i6;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i5 = i6;
                    break;
                case 15:
                    i8 = 4;
                    i5 = i6;
                    break;
                case 17:
                    z2 = true;
                    z3 = true;
                    i5 = i6;
                    i8 = 5;
                    break;
                case 18:
                    z3 = true;
                    i5 = i6;
                    i8 = 5;
                    break;
            }
            i3 += i8;
        }
        this.f20102h = i4;
        this.f20096b = i3;
        if (z2) {
            c35105Oy0Arr = new C35105Oy0[m98450I];
        } else {
            c35105Oy0Arr = null;
        }
        this.f20100f = c35105Oy0Arr;
        this.f20101g = z3 ? m98436k(i4) : null;
    }

    /* renamed from: A */
    public final void m98458A(YT2 yt2, KA0 ka0, int i, boolean z) {
        int i2 = i + 1;
        int i3 = this.f20097c[i] & UByte.MAX_VALUE;
        yt2.mo73048a(i3, z);
        char[] cArr = ka0.f19205c;
        for (int i4 = 0; i4 < i3; i4++) {
            int m98450I = m98450I(i2);
            i2 += 2;
            while (true) {
                int i5 = m98450I - 1;
                if (m98450I > 0) {
                    i2 = m98429r(yt2.mo73024y(i4, m98451H(i2, cArr), z), i2 + 2, true, cArr);
                    m98450I = i5;
                }
            }
        }
    }

    /* renamed from: B */
    public final int m98457B(AbstractC34736Nj0 abstractC34736Nj0, KA0 ka0, int i) {
        int i2;
        KA0 ka02 = ka0;
        char[] cArr = ka02.f19205c;
        String m98451H = m98451H(i, cArr);
        String m98451H2 = m98451H(i + 2, cArr);
        int i3 = i + 4;
        int m98450I = m98450I(i3);
        int i4 = i3 + 2;
        int i5 = 0;
        C28821tp c28821tp = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        String str = null;
        while (true) {
            int i9 = m98450I - 1;
            if (m98450I <= 0) {
                break;
            }
            String m98451H3 = m98451H(i4, cArr);
            int m98427t = m98427t(i4 + 2);
            int i10 = i4 + 6;
            if ("Signature".equals(m98451H3)) {
                str = m98451H(i10, cArr);
                i2 = i10;
            } else if ("RuntimeVisibleAnnotations".equals(m98451H3)) {
                i8 = i10;
                i2 = i8;
            } else if ("RuntimeVisibleTypeAnnotations".equals(m98451H3)) {
                i6 = i10;
                i2 = i6;
            } else if ("RuntimeInvisibleAnnotations".equals(m98451H3)) {
                i7 = i10;
                i2 = i7;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(m98451H3)) {
                i5 = i10;
                i2 = i5;
            } else {
                i2 = i10;
                C28821tp c28821tp2 = c28821tp;
                c28821tp = m98437j(ka02.f19203a, m98451H3, i2, m98427t, cArr, -1, null);
                c28821tp.f111062c = c28821tp2;
                i8 = i8;
                i7 = i7;
                i6 = i6;
                i5 = i5;
            }
            i4 = i2 + m98427t;
            ka02 = ka0;
            m98450I = i9;
        }
        int i11 = i5;
        C28821tp c28821tp3 = c28821tp;
        int i12 = i6;
        int i13 = i7;
        int i14 = i8;
        AbstractC48905ss4 mo91618m = abstractC34736Nj0.mo91618m(m98451H, m98451H2, str);
        if (mo91618m == null) {
            return i4;
        }
        if (i14 != 0) {
            int m98450I2 = m98450I(i14);
            int i15 = i14 + 2;
            while (true) {
                int i16 = m98450I2 - 1;
                if (m98450I2 <= 0) {
                    break;
                }
                i15 = m98429r(mo91618m.mo11272a(m98451H(i15, cArr), true), i15 + 2, true, cArr);
                m98450I2 = i16;
            }
        }
        if (i13 != 0) {
            int m98450I3 = m98450I(i13);
            int i17 = i13 + 2;
            while (true) {
                int i18 = m98450I3 - 1;
                if (m98450I3 <= 0) {
                    break;
                }
                i17 = m98429r(mo91618m.mo11272a(m98451H(i17, cArr), false), i17 + 2, true, cArr);
                m98450I3 = i18;
            }
        }
        if (i12 != 0) {
            int m98450I4 = m98450I(i12);
            int i19 = i12 + 2;
            while (true) {
                int i20 = m98450I4 - 1;
                if (m98450I4 <= 0) {
                    break;
                }
                int m98453F = m98453F(ka0, i19);
                i19 = m98429r(mo91618m.mo11269d(ka0.f19210h, ka0.f19211i, m98451H(m98453F, cArr), true), m98453F + 2, true, cArr);
                m98450I4 = i20;
            }
        }
        if (i11 != 0) {
            int m98450I5 = m98450I(i11);
            int i21 = i11 + 2;
            while (true) {
                int i22 = m98450I5 - 1;
                if (m98450I5 <= 0) {
                    break;
                }
                int m98453F2 = m98453F(ka0, i21);
                i21 = m98429r(mo91618m.mo11269d(ka0.f19210h, ka0.f19211i, m98451H(m98453F2, cArr), false), m98453F2 + 2, true, cArr);
                m98450I5 = i22;
            }
        }
        C28821tp c28821tp4 = c28821tp3;
        while (c28821tp4 != null) {
            C28821tp c28821tp5 = c28821tp4.f111062c;
            c28821tp4.f111062c = null;
            mo91618m.mo11271b(c28821tp4);
            c28821tp4 = c28821tp5;
        }
        mo91618m.mo11270c();
        return i4;
    }

    /* renamed from: C */
    public short m98456C(int i) {
        byte[] bArr = this.f20097c;
        return (short) ((bArr[i + 1] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 8));
    }

    /* renamed from: D */
    public final int m98455D(int i, boolean z, boolean z2, KA0 ka0) {
        int i2;
        int i3;
        int i4;
        char[] cArr = ka0.f19205c;
        C36160Tl2[] c36160Tl2Arr = ka0.f19209g;
        if (z) {
            i2 = i + 1;
            i3 = this.f20097c[i] & UByte.MAX_VALUE;
        } else {
            ka0.f19215m = -1;
            i2 = i;
            i3 = 255;
        }
        ka0.f19218p = 0;
        if (i3 < 64) {
            ka0.f19216n = 3;
            ka0.f19220r = 0;
        } else if (i3 < 128) {
            i3 -= 64;
            i2 = m98447L(i2, ka0.f19221s, 0, cArr, c36160Tl2Arr);
            ka0.f19216n = 4;
            ka0.f19220r = 1;
        } else if (i3 >= 247) {
            int m98450I = m98450I(i2);
            i2 += 2;
            if (i3 == 247) {
                i2 = m98447L(i2, ka0.f19221s, 0, cArr, c36160Tl2Arr);
                ka0.f19216n = 4;
                ka0.f19220r = 1;
            } else if (i3 >= 248 && i3 < 251) {
                ka0.f19216n = 2;
                int i5 = 251 - i3;
                ka0.f19218p = i5;
                ka0.f19217o -= i5;
                ka0.f19220r = 0;
            } else if (i3 == 251) {
                ka0.f19216n = 3;
                ka0.f19220r = 0;
            } else if (i3 < 255) {
                if (z2) {
                    i4 = ka0.f19217o;
                } else {
                    i4 = 0;
                }
                int i6 = i3 - 251;
                int i7 = i4;
                int i8 = i6;
                while (i8 > 0) {
                    i2 = m98447L(i2, ka0.f19219q, i7, cArr, c36160Tl2Arr);
                    i8--;
                    i7++;
                }
                ka0.f19216n = 1;
                ka0.f19218p = i6;
                ka0.f19217o += i6;
                ka0.f19220r = 0;
            } else {
                int m98450I2 = m98450I(i2);
                int i9 = i2 + 2;
                ka0.f19216n = 0;
                ka0.f19218p = m98450I2;
                ka0.f19217o = m98450I2;
                for (int i10 = 0; i10 < m98450I2; i10++) {
                    i9 = m98447L(i9, ka0.f19219q, i10, cArr, c36160Tl2Arr);
                }
                int m98450I3 = m98450I(i9);
                i2 = i9 + 2;
                ka0.f19220r = m98450I3;
                for (int i11 = 0; i11 < m98450I3; i11++) {
                    i2 = m98447L(i2, ka0.f19221s, i11, cArr, c36160Tl2Arr);
                }
            }
            i3 = m98450I;
        } else {
            throw new IllegalArgumentException();
        }
        int i12 = ka0.f19215m + i3 + 1;
        ka0.f19215m = i12;
        m98443d(i12, c36160Tl2Arr);
        return i2;
    }

    /* renamed from: E */
    public final String m98454E(int i, char[] cArr) {
        return m98451H(this.f20098d[m98450I(i)], cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m98453F(KA0 ka0, int i) {
        int i2;
        int i3;
        int m98435l;
        C32330Db6 c32330Db6;
        int m98427t = m98427t(i);
        int i4 = m98427t >>> 24;
        if (i4 != 0 && i4 != 1) {
            switch (i4) {
                case 16:
                case 17:
                case 18:
                case 23:
                    i2 = m98427t & (-256);
                    i3 = i + 3;
                    break;
                case 19:
                case 20:
                case 21:
                    i2 = m98427t & (-16777216);
                    i3 = i + 1;
                    break;
                case 22:
                    break;
                default:
                    switch (i4) {
                        case 64:
                        case 65:
                            i2 = m98427t & (-16777216);
                            int m98450I = m98450I(i + 1);
                            i3 = i + 3;
                            ka0.f19212j = new C36160Tl2[m98450I];
                            ka0.f19213k = new C36160Tl2[m98450I];
                            ka0.f19214l = new int[m98450I];
                            for (int i5 = 0; i5 < m98450I; i5++) {
                                int m98450I2 = m98450I(i3);
                                int m98450I3 = m98450I(i3 + 2);
                                int m98450I4 = m98450I(i3 + 4);
                                i3 += 6;
                                ka0.f19212j[i5] = m98443d(m98450I2, ka0.f19209g);
                                ka0.f19213k[i5] = m98443d(m98450I2 + m98450I3, ka0.f19209g);
                                ka0.f19214l[i5] = m98450I4;
                            }
                            break;
                        case 66:
                            break;
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            i2 = m98427t & (-16777216);
                            i3 = i + 3;
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            i2 = m98427t & (-16776961);
                            i3 = i + 4;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
            }
            ka0.f19210h = i2;
            m98435l = m98435l(i3);
            if (m98435l != 0) {
                c32330Db6 = null;
            } else {
                c32330Db6 = new C32330Db6(this.f20097c, i3);
            }
            ka0.f19211i = c32330Db6;
            return i3 + 1 + (m98435l * 2);
        }
        i2 = m98427t & (-65536);
        i3 = i + 2;
        ka0.f19210h = i2;
        m98435l = m98435l(i3);
        if (m98435l != 0) {
        }
        ka0.f19211i = c32330Db6;
        return i3 + 1 + (m98435l * 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] m98452G(YT2 yt2, KA0 ka0, int i, boolean z) {
        int i2;
        char[] cArr = ka0.f19205c;
        int m98450I = m98450I(i);
        int[] iArr = new int[m98450I];
        int i3 = i + 2;
        for (int i4 = 0; i4 < m98450I; i4++) {
            iArr[i4] = i3;
            int m98427t = m98427t(i3);
            int i5 = m98427t >>> 24;
            if (i5 != 23) {
                switch (i5) {
                    default:
                        switch (i5) {
                            case 64:
                            case 65:
                                int m98450I2 = m98450I(i3 + 1);
                                i2 = i3 + 3;
                                while (true) {
                                    int i6 = m98450I2 - 1;
                                    if (m98450I2 <= 0) {
                                        break;
                                    } else {
                                        int m98450I3 = m98450I(i2);
                                        int m98450I4 = m98450I(i2 + 2);
                                        i2 += 6;
                                        m98443d(m98450I3, ka0.f19209g);
                                        m98443d(m98450I3 + m98450I4, ka0.f19209g);
                                        m98450I2 = i6;
                                    }
                                }
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                break;
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                                i2 = i3 + 4;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    case 16:
                    case 17:
                    case 18:
                        i2 = i3 + 3;
                        break;
                }
                int m98435l = m98435l(i2);
                C32330Db6 c32330Db6 = null;
                if (i5 != 66) {
                    if (m98435l != 0) {
                        c32330Db6 = new C32330Db6(this.f20097c, i2);
                    }
                    int i7 = i2 + (m98435l * 2) + 1;
                    i3 = m98429r(yt2.mo73071A(m98427t & (-256), c32330Db6, m98451H(i7, cArr), z), i7 + 2, true, cArr);
                } else {
                    i3 = m98429r(null, i2 + (m98435l * 2) + 3, true, cArr);
                }
            }
            i2 = i3 + 3;
            int m98435l2 = m98435l(i2);
            C32330Db6 c32330Db62 = null;
            if (i5 != 66) {
            }
        }
        return iArr;
    }

    /* renamed from: H */
    public String m98451H(int i, char[] cArr) {
        int m98450I = m98450I(i);
        if (i != 0 && m98450I != 0) {
            return m98448K(m98450I, cArr);
        }
        return null;
    }

    /* renamed from: I */
    public int m98450I(int i) {
        byte[] bArr = this.f20097c;
        return (bArr[i + 1] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 8);
    }

    /* renamed from: J */
    public final String m98449J(int i, int i2, char[] cArr) {
        int i3;
        int i4 = i2 + i;
        byte[] bArr = this.f20097c;
        int i5 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte b = bArr[i];
            if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                i3 = i5 + 1;
                cArr[i5] = (char) (b & ByteCompanionObject.MAX_VALUE);
            } else if ((b & 224) == 192) {
                cArr[i5] = (char) (((b & 31) << 6) + (bArr[i6] & 63));
                i5++;
                i = i6 + 1;
            } else {
                i3 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = ((b & 15) << 12) + ((bArr[i6] & 63) << 6);
                i6 = i7 + 1;
                cArr[i5] = (char) (i8 + (bArr[i7] & 63));
            }
            i = i6;
            i5 = i3;
        }
        return new String(cArr, 0, i5);
    }

    /* renamed from: K */
    public final String m98448K(int i, char[] cArr) {
        String[] strArr = this.f20099e;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int i2 = this.f20098d[i];
        String m98449J = m98449J(i2 + 2, m98450I(i2), cArr);
        strArr[i] = m98449J;
        return m98449J;
    }

    /* renamed from: L */
    public final int m98447L(int i, Object[] objArr, int i2, char[] cArr, C36160Tl2[] c36160Tl2Arr) {
        int i3 = i + 1;
        switch (this.f20097c[i] & UByte.MAX_VALUE) {
            case 0:
                objArr[i2] = InterfaceC33551Ih3.f16054a;
                return i3;
            case 1:
                objArr[i2] = InterfaceC33551Ih3.f16055b;
                return i3;
            case 2:
                objArr[i2] = InterfaceC33551Ih3.f16056c;
                return i3;
            case 3:
                objArr[i2] = InterfaceC33551Ih3.f16057d;
                return i3;
            case 4:
                objArr[i2] = InterfaceC33551Ih3.f16058e;
                return i3;
            case 5:
                objArr[i2] = InterfaceC33551Ih3.f16059f;
                return i3;
            case 6:
                objArr[i2] = InterfaceC33551Ih3.f16060g;
                return i3;
            case 7:
                objArr[i2] = m98434m(i3, cArr);
                break;
            case 8:
                objArr[i2] = m98443d(m98450I(i3), c36160Tl2Arr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i3 + 2;
    }

    /* renamed from: a */
    public void m98446a(AbstractC34736Nj0 abstractC34736Nj0, C28821tp[] c28821tpArr, int i) {
        int i2;
        int i3;
        int i4;
        String[] strArr;
        KA0 ka0 = new KA0();
        ka0.f19203a = c28821tpArr;
        ka0.f19204b = i;
        char[] cArr = new char[this.f20102h];
        ka0.f19205c = cArr;
        int i5 = this.f20096b;
        int m98450I = m98450I(i5);
        String m98434m = m98434m(i5 + 2, cArr);
        String m98434m2 = m98434m(i5 + 4, cArr);
        int m98450I2 = m98450I(i5 + 6);
        String[] strArr2 = new String[m98450I2];
        int i6 = i5 + 8;
        for (int i7 = 0; i7 < m98450I2; i7++) {
            strArr2[i7] = m98434m(i6, cArr);
            i6 += 2;
        }
        int m98442e = m98442e();
        int i8 = m98450I;
        int m98450I3 = m98450I(m98442e - 2);
        String str = null;
        String str2 = null;
        int i9 = 0;
        String str3 = null;
        int i10 = 0;
        String str4 = null;
        String str5 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        C28821tp c28821tp = null;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (m98450I3 > 0) {
            String m98451H = m98451H(m98442e, cArr);
            int m98427t = m98427t(m98442e + 2);
            int i20 = m98442e + 6;
            String str6 = str;
            if ("SourceFile".equals(m98451H)) {
                i2 = i20;
                str2 = m98451H(i20, cArr);
            } else if ("InnerClasses".equals(m98451H)) {
                i18 = i20;
                i2 = i18;
            } else if ("EnclosingMethod".equals(m98451H)) {
                i11 = i20;
                i2 = i11;
            } else if ("NestHost".equals(m98451H)) {
                i2 = i20;
                str5 = m98434m(i20, cArr);
            } else if ("NestMembers".equals(m98451H)) {
                i16 = i20;
                i2 = i16;
            } else if ("PermittedSubclasses".equals(m98451H)) {
                i17 = i20;
                i2 = i17;
            } else {
                if ("Signature".equals(m98451H)) {
                    str3 = m98451H(i20, cArr);
                } else if ("RuntimeVisibleAnnotations".equals(m98451H)) {
                    i12 = i20;
                    i2 = i12;
                } else if ("RuntimeVisibleTypeAnnotations".equals(m98451H)) {
                    i14 = i20;
                    i2 = i14;
                } else if ("Deprecated".equals(m98451H)) {
                    i8 |= DateUtils.FORMAT_NUMERIC_DATE;
                } else if ("Synthetic".equals(m98451H)) {
                    i8 |= 4096;
                } else if ("SourceDebugExtension".equals(m98451H)) {
                    if (m98427t <= this.f20097c.length - i20) {
                        str = m98449J(i20, m98427t, new char[m98427t]);
                        i2 = i20;
                        i3 = i6;
                        i4 = m98427t;
                        strArr = strArr2;
                        m98442e = i2 + i4;
                        m98450I3--;
                        strArr2 = strArr;
                        i6 = i3;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else if ("RuntimeInvisibleAnnotations".equals(m98451H)) {
                    i13 = i20;
                    i2 = i13;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(m98451H)) {
                    i15 = i20;
                    i2 = i15;
                } else if ("Record".equals(m98451H)) {
                    i8 |= 65536;
                    i19 = i20;
                    i2 = i19;
                } else if ("Module".equals(m98451H)) {
                    i9 = i20;
                    i2 = i9;
                } else if ("ModuleMainClass".equals(m98451H)) {
                    str4 = m98434m(i20, cArr);
                } else if ("ModulePackages".equals(m98451H)) {
                    i10 = i20;
                    i2 = i10;
                } else {
                    if ("BootstrapMethods".equals(m98451H)) {
                        i2 = i20;
                        i3 = i6;
                        i4 = m98427t;
                        strArr = strArr2;
                        str = str6;
                    } else {
                        i2 = i20;
                        i3 = i6;
                        i4 = m98427t;
                        strArr = strArr2;
                        C28821tp m98437j = m98437j(c28821tpArr, m98451H, i2, m98427t, cArr, -1, null);
                        m98437j.f111062c = c28821tp;
                        c28821tp = m98437j;
                        i8 = i8;
                        str = str6;
                        str2 = str2;
                    }
                    m98442e = i2 + i4;
                    m98450I3--;
                    strArr2 = strArr;
                    i6 = i3;
                }
                i2 = i20;
            }
            i3 = i6;
            i4 = m98427t;
            strArr = strArr2;
            str = str6;
            m98442e = i2 + i4;
            m98450I3--;
            strArr2 = strArr;
            i6 = i3;
        }
        String str7 = str;
        String str8 = str2;
        int i21 = i6;
        String[] strArr3 = strArr2;
        C28821tp c28821tp2 = c28821tp;
        abstractC34736Nj0.mo91630a(m98427t(this.f20098d[1] - 7), i8, m98434m, str3, m98434m2, strArr3);
        if ((i & 2) == 0 && (str8 != null || str7 != null)) {
            abstractC34736Nj0.mo91617n(str8, str7);
        }
        if (i9 != 0) {
            m98422y(abstractC34736Nj0, ka0, i9, i10, str4);
        }
        String str9 = str5;
        if (str9 != null) {
            abstractC34736Nj0.mo91622i(str9);
        }
        int i22 = i11;
        if (i22 != 0) {
            String m98434m3 = m98434m(i22, cArr);
            int m98450I4 = m98450I(i22 + 2);
            abstractC34736Nj0.mo91620k(m98434m3, m98450I4 == 0 ? null : m98451H(this.f20098d[m98450I4], cArr), m98450I4 == 0 ? null : m98451H(this.f20098d[m98450I4] + 2, cArr));
        }
        int i23 = i12;
        if (i23 != 0) {
            int m98450I5 = m98450I(i23);
            int i24 = i23 + 2;
            while (true) {
                int i25 = m98450I5 - 1;
                if (m98450I5 <= 0) {
                    break;
                }
                i24 = m98429r(abstractC34736Nj0.mo91629b(m98451H(i24, cArr), true), i24 + 2, true, cArr);
                m98450I5 = i25;
            }
        }
        int i26 = i13;
        if (i26 != 0) {
            int m98450I6 = m98450I(i26);
            int i27 = i26 + 2;
            while (true) {
                int i28 = m98450I6 - 1;
                if (m98450I6 <= 0) {
                    break;
                }
                i27 = m98429r(abstractC34736Nj0.mo91629b(m98451H(i27, cArr), false), i27 + 2, true, cArr);
                m98450I6 = i28;
            }
        }
        int i29 = i14;
        if (i29 != 0) {
            int m98450I7 = m98450I(i29);
            int i30 = i29 + 2;
            while (true) {
                int i31 = m98450I7 - 1;
                if (m98450I7 <= 0) {
                    break;
                }
                int m98453F = m98453F(ka0, i30);
                i30 = m98429r(abstractC34736Nj0.mo91616o(ka0.f19210h, ka0.f19211i, m98451H(m98453F, cArr), true), m98453F + 2, true, cArr);
                m98450I7 = i31;
            }
        }
        int i32 = i15;
        if (i32 != 0) {
            int m98450I8 = m98450I(i32);
            int i33 = i32 + 2;
            while (true) {
                int i34 = m98450I8 - 1;
                if (m98450I8 <= 0) {
                    break;
                }
                int m98453F2 = m98453F(ka0, i33);
                i33 = m98429r(abstractC34736Nj0.mo91616o(ka0.f19210h, ka0.f19211i, m98451H(m98453F2, cArr), false), m98453F2 + 2, true, cArr);
                m98450I8 = i34;
            }
        }
        while (c28821tp2 != null) {
            C28821tp c28821tp3 = c28821tp2.f111062c;
            c28821tp2.f111062c = null;
            abstractC34736Nj0.mo91628c(c28821tp2);
            c28821tp2 = c28821tp3;
        }
        int i35 = i16;
        if (i35 != 0) {
            int m98450I9 = m98450I(i35);
            int i36 = i35 + 2;
            while (true) {
                int i37 = m98450I9 - 1;
                if (m98450I9 <= 0) {
                    break;
                }
                abstractC34736Nj0.mo91621j(m98434m(i36, cArr));
                i36 += 2;
                m98450I9 = i37;
            }
        }
        int i38 = i17;
        if (i38 != 0) {
            int m98450I10 = m98450I(i38);
            int i39 = i38 + 2;
            while (true) {
                int i40 = m98450I10 - 1;
                if (m98450I10 <= 0) {
                    break;
                }
                abstractC34736Nj0.mo91619l(m98434m(i39, cArr));
                i39 += 2;
                m98450I10 = i40;
            }
        }
        int i41 = i18;
        if (i41 != 0) {
            int m98450I11 = m98450I(i41);
            int i42 = i41 + 2;
            while (true) {
                int i43 = m98450I11 - 1;
                if (m98450I11 <= 0) {
                    break;
                }
                abstractC34736Nj0.mo91625f(m98434m(i42, cArr), m98434m(i42 + 2, cArr), m98451H(i42 + 4, cArr), m98450I(i42 + 6));
                i42 += 8;
                m98450I11 = i43;
            }
        }
        int i44 = i19;
        if (i44 != 0) {
            int m98450I12 = m98450I(i44);
            int i45 = i44 + 2;
            while (true) {
                int i46 = m98450I12 - 1;
                if (m98450I12 <= 0) {
                    break;
                }
                i45 = m98457B(abstractC34736Nj0, ka0, i45);
                m98450I12 = i46;
            }
        }
        int m98450I13 = m98450I(i21);
        int i47 = i21 + 2;
        while (true) {
            int i48 = m98450I13 - 1;
            if (m98450I13 <= 0) {
                break;
            }
            i47 = m98428s(abstractC34736Nj0, ka0, i47);
            m98450I13 = i48;
        }
        int m98450I14 = m98450I(i47);
        int i49 = i47 + 2;
        while (true) {
            int i50 = m98450I14 - 1;
            if (m98450I14 > 0) {
                i49 = m98424w(abstractC34736Nj0, ka0, i49);
                m98450I14 = i50;
            } else {
                abstractC34736Nj0.mo91627d();
                return;
            }
        }
    }

    /* renamed from: b */
    public final void m98445b(KA0 ka0) {
        int i;
        String str = ka0.f19208f;
        Object[] objArr = ka0.f19219q;
        int i2 = 0;
        if ((ka0.f19206d & 8) == 0) {
            if ("<init>".equals(ka0.f19207e)) {
                objArr[0] = InterfaceC33551Ih3.f16060g;
            } else {
                objArr[0] = m98434m(this.f20096b + 2, ka0.f19205c);
            }
            i2 = 1;
        }
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt != 'F') {
                if (charAt != 'L') {
                    if (charAt != 'S' && charAt != 'I') {
                        if (charAt != 'J') {
                            if (charAt != 'Z') {
                                if (charAt != '[') {
                                    switch (charAt) {
                                        case 'B':
                                        case 'C':
                                            break;
                                        case 'D':
                                            i = i2 + 1;
                                            objArr[i2] = InterfaceC33551Ih3.f16057d;
                                            break;
                                        default:
                                            ka0.f19217o = i2;
                                            return;
                                    }
                                } else {
                                    while (str.charAt(i4) == '[') {
                                        i4++;
                                    }
                                    if (str.charAt(i4) == 'L') {
                                        do {
                                            i4++;
                                        } while (str.charAt(i4) != ';');
                                        int i5 = i4 + 1;
                                        objArr[i2] = str.substring(i3, i5);
                                        i3 = i5;
                                        i2++;
                                    } else {
                                        int i52 = i4 + 1;
                                        objArr[i2] = str.substring(i3, i52);
                                        i3 = i52;
                                        i2++;
                                    }
                                }
                            }
                        } else {
                            i = i2 + 1;
                            objArr[i2] = InterfaceC33551Ih3.f16058e;
                        }
                    }
                    i = i2 + 1;
                    objArr[i2] = InterfaceC33551Ih3.f16055b;
                } else {
                    int i6 = i4;
                    while (str.charAt(i6) != ';') {
                        i6++;
                    }
                    objArr[i2] = str.substring(i4, i6);
                    i2++;
                    i3 = i6 + 1;
                }
            } else {
                i = i2 + 1;
                objArr[i2] = InterfaceC33551Ih3.f16056c;
            }
            i2 = i;
            i3 = i4;
        }
    }

    /* renamed from: c */
    public final void m98444c(int i, C36160Tl2[] c36160Tl2Arr) {
        if (c36160Tl2Arr[i] == null) {
            C36160Tl2 m98426u = m98426u(i, c36160Tl2Arr);
            m98426u.f36029a = (short) (m98426u.f36029a | 1);
        }
    }

    /* renamed from: d */
    public final C36160Tl2 m98443d(int i, C36160Tl2[] c36160Tl2Arr) {
        C36160Tl2 m98426u = m98426u(i, c36160Tl2Arr);
        m98426u.f36029a = (short) (m98426u.f36029a & (-2));
        return m98426u;
    }

    /* renamed from: e */
    public final int m98442e() {
        int i = this.f20096b;
        int m98450I = i + 8 + (m98450I(i + 6) * 2);
        int m98450I2 = m98450I(m98450I);
        int i2 = m98450I + 2;
        while (true) {
            int i3 = m98450I2 - 1;
            if (m98450I2 <= 0) {
                break;
            }
            int m98450I3 = m98450I(i2 + 6);
            i2 += 8;
            while (true) {
                int i4 = m98450I3 - 1;
                if (m98450I3 > 0) {
                    i2 += m98427t(i2 + 2) + 6;
                    m98450I3 = i4;
                }
            }
            m98450I2 = i3;
        }
        int m98450I4 = m98450I(i2);
        int i5 = i2 + 2;
        while (true) {
            int i6 = m98450I4 - 1;
            if (m98450I4 > 0) {
                int m98450I5 = m98450I(i5 + 6);
                i5 += 8;
                while (true) {
                    int i7 = m98450I5 - 1;
                    if (m98450I5 > 0) {
                        i5 += m98427t(i5 + 2) + 6;
                        m98450I5 = i7;
                    }
                }
                m98450I4 = i6;
            } else {
                return i5 + 2;
            }
        }
    }

    /* renamed from: f */
    public int m98441f(int i) {
        return this.f20098d[i];
    }

    /* renamed from: g */
    public int m98440g() {
        return this.f20098d.length;
    }

    /* renamed from: h */
    public int m98439h() {
        return this.f20102h;
    }

    /* renamed from: i */
    public final int m98438i(int[] iArr, int i) {
        if (iArr != null && i < iArr.length && m98435l(iArr[i]) >= 67) {
            return m98450I(iArr[i] + 1);
        }
        return -1;
    }

    /* renamed from: j */
    public final C28821tp m98437j(C28821tp[] c28821tpArr, String str, int i, int i2, char[] cArr, int i3, C36160Tl2[] c36160Tl2Arr) {
        for (C28821tp c28821tp : c28821tpArr) {
            if (c28821tp.f111060a.equals(str)) {
                return c28821tp.m11736i(this, i, i2, cArr, i3, c36160Tl2Arr);
            }
        }
        return new C28821tp(str).m11736i(this, i, i2, null, -1, null);
    }

    /* renamed from: k */
    public final int[] m98436k(int i) {
        char[] cArr = new char[i];
        int m98442e = m98442e();
        for (int m98450I = m98450I(m98442e - 2); m98450I > 0; m98450I--) {
            String m98451H = m98451H(m98442e, cArr);
            int m98427t = m98427t(m98442e + 2);
            int i2 = m98442e + 6;
            if ("BootstrapMethods".equals(m98451H)) {
                int m98450I2 = m98450I(i2);
                int[] iArr = new int[m98450I2];
                int i3 = i2 + 2;
                for (int i4 = 0; i4 < m98450I2; i4++) {
                    iArr[i4] = i3;
                    i3 += (m98450I(i3 + 2) * 2) + 4;
                }
                return iArr;
            }
            m98442e = i2 + m98427t;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public int m98435l(int i) {
        return this.f20097c[i] & UByte.MAX_VALUE;
    }

    /* renamed from: m */
    public String m98434m(int i, char[] cArr) {
        return m98454E(i, cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0828  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m98433n(YT2 yt2, KA0 ka0, int i) {
        C36160Tl2[] c36160Tl2Arr;
        int i2;
        int i3;
        int i4;
        C36160Tl2[] c36160Tl2Arr2;
        C28821tp c28821tp;
        int i5;
        int i6;
        C28821tp c28821tp2;
        int[] iArr;
        String str;
        int i7;
        int i8;
        int[] iArr2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        boolean z2;
        int i13;
        int i14;
        YT2 yt22;
        int i15;
        int i16;
        int i17;
        int i18;
        char[] cArr;
        char[] cArr2;
        char c;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int[] iArr3;
        int i24;
        int i25;
        int[] iArr4;
        int i26;
        int i27;
        int i28;
        boolean z3;
        int i29;
        int i30;
        int[] iArr5;
        int i31;
        char[] cArr3;
        boolean z4;
        int[] iArr6;
        int i32;
        C36160Tl2[] c36160Tl2Arr3;
        int i33;
        int m98450I;
        int[] iArr7;
        C36160Tl2[] c36160Tl2Arr4;
        int i34;
        int i35;
        int i36;
        YT2 yt23 = yt2;
        KA0 ka02 = ka0;
        byte[] bArr = this.f20097c;
        char[] cArr4 = ka02.f19205c;
        int m98450I2 = m98450I(i);
        int m98450I3 = m98450I(i + 2);
        int m98427t = m98427t(i + 4);
        int i37 = i + 8;
        if (m98427t <= this.f20097c.length - i37) {
            int i38 = i37 + m98427t;
            C36160Tl2[] c36160Tl2Arr5 = new C36160Tl2[m98427t + 1];
            ka02.f19209g = c36160Tl2Arr5;
            int i39 = i37;
            while (i39 < i38) {
                int i40 = i39 - i37;
                switch (bArr[i39] & UByte.MAX_VALUE) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 133:
                    case 134:
                    case 135:
                    case SyslogConstants.LOG_LOCAL1 /* 136 */:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case SyslogConstants.LOG_LOCAL2 /* 144 */:
                    case 145:
                    case 146:
                    case 147:
                    case 148:
                    case 149:
                    case 150:
                    case 151:
                    case SyslogConstants.LOG_LOCAL3 /* 152 */:
                    case 172:
                    case 173:
                    case 174:
                    case 175:
                    case SyslogConstants.LOG_LOCAL6 /* 176 */:
                    case 177:
                    case 190:
                    case 191:
                    case 194:
                    case 195:
                        i39++;
                        break;
                    case 16:
                    case 18:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 169:
                    case 188:
                        i39 += 2;
                        break;
                    case 17:
                    case 19:
                    case 20:
                    case 132:
                    case 178:
                    case 179:
                    case 180:
                    case 181:
                    case 182:
                    case 183:
                    case SyslogConstants.LOG_LOCAL7 /* 184 */:
                    case 187:
                    case 189:
                    case 192:
                    case 193:
                        i39 += 3;
                        break;
                    case 153:
                    case 154:
                    case 155:
                    case 156:
                    case 157:
                    case 158:
                    case 159:
                    case SyslogConstants.LOG_LOCAL4 /* 160 */:
                    case 161:
                    case 162:
                    case 163:
                    case 164:
                    case 165:
                    case 166:
                    case 167:
                    case 168:
                    case 198:
                    case 199:
                        m98443d(i40 + m98456C(i39 + 1), c36160Tl2Arr5);
                        i39 += 3;
                        break;
                    case 170:
                        int i41 = i39 + (4 - (i40 & 3));
                        m98443d(m98427t(i41) + i40, c36160Tl2Arr5);
                        int m98427t2 = (m98427t(i41 + 8) - m98427t(i41 + 4)) + 1;
                        i39 = i41 + 12;
                        while (true) {
                            int i42 = m98427t2 - 1;
                            if (m98427t2 > 0) {
                                m98443d(m98427t(i39) + i40, c36160Tl2Arr5);
                                i39 += 4;
                                m98427t2 = i42;
                            }
                        }
                        break;
                    case 171:
                        int i43 = i39 + (4 - (i40 & 3));
                        m98443d(m98427t(i43) + i40, c36160Tl2Arr5);
                        int m98427t3 = m98427t(i43 + 4);
                        i39 = i43 + 8;
                        while (true) {
                            int i44 = m98427t3 - 1;
                            if (m98427t3 > 0) {
                                m98443d(m98427t(i39 + 4) + i40, c36160Tl2Arr5);
                                i39 += 8;
                                m98427t3 = i44;
                            }
                        }
                        break;
                    case 185:
                    case 186:
                        i39 += 5;
                        break;
                    case 196:
                        int i45 = bArr[i39 + 1] & UByte.MAX_VALUE;
                        if (i45 != 132) {
                            if (i45 != 169) {
                                switch (i45) {
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                        break;
                                    default:
                                        switch (i45) {
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                            case 58:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                }
                            }
                            i39 += 4;
                            break;
                        } else {
                            i39 += 6;
                            break;
                        }
                    case 197:
                        i39 += 4;
                        break;
                    case C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
                    case 201:
                    case 220:
                        m98443d(i40 + m98427t(i39 + 1), c36160Tl2Arr5);
                        i39 += 5;
                        break;
                    case 202:
                    case 203:
                    case 204:
                    case 205:
                    case 206:
                    case 207:
                    case 208:
                    case 209:
                    case 210:
                    case 211:
                    case 212:
                    case 213:
                    case 214:
                    case 215:
                    case 216:
                    case 217:
                    case 218:
                    case 219:
                        m98443d(i40 + m98450I(i39 + 1), c36160Tl2Arr5);
                        i39 += 3;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
            int m98450I4 = m98450I(i39);
            int i46 = i39 + 2;
            while (true) {
                int i47 = m98450I4 - 1;
                if (m98450I4 > 0) {
                    i46 += 8;
                    yt23.mo73070B(m98443d(m98450I(i46), c36160Tl2Arr5), m98443d(m98450I(i46 + 2), c36160Tl2Arr5), m98443d(m98450I(i46 + 4), c36160Tl2Arr5), m98451H(this.f20098d[m98450I(i46 + 6)], cArr4));
                    m98450I4 = i47;
                    i38 = i38;
                } else {
                    int i48 = i38;
                    int m98450I5 = m98450I(i46);
                    int i49 = i46 + 2;
                    int[] iArr8 = null;
                    boolean z5 = true;
                    int i50 = 0;
                    int[] iArr9 = null;
                    int i51 = 0;
                    C28821tp c28821tp3 = null;
                    int i52 = 0;
                    int i53 = 0;
                    while (true) {
                        int i54 = m98450I5 - 1;
                        if (m98450I5 > 0) {
                            String m98451H = m98451H(i49, cArr4);
                            int m98427t4 = m98427t(i49 + 2);
                            int i55 = i49 + 6;
                            if ("LocalVariableTable".equals(m98451H)) {
                                if ((ka02.f19204b & 2) == 0) {
                                    int m98450I6 = m98450I(i55);
                                    int i56 = i55 + 2;
                                    while (true) {
                                        int i57 = m98450I6 - 1;
                                        if (m98450I6 > 0) {
                                            int m98450I7 = m98450I(i56);
                                            m98444c(m98450I7, c36160Tl2Arr5);
                                            m98444c(m98450I7 + m98450I(i56 + 2), c36160Tl2Arr5);
                                            i56 += 10;
                                            m98450I6 = i57;
                                        } else {
                                            c36160Tl2Arr4 = c36160Tl2Arr5;
                                            i34 = i55;
                                            i52 = i34;
                                            i36 = m98427t;
                                            i35 = i48;
                                            i49 = i34 + m98427t4;
                                            yt23 = yt2;
                                            c36160Tl2Arr5 = c36160Tl2Arr4;
                                            m98450I5 = i54;
                                            i48 = i35;
                                            m98427t = i36;
                                        }
                                    }
                                }
                                iArr7 = iArr8;
                                c36160Tl2Arr4 = c36160Tl2Arr5;
                                i34 = i55;
                                i36 = m98427t;
                                i35 = i48;
                                iArr8 = iArr7;
                                i49 = i34 + m98427t4;
                                yt23 = yt2;
                                c36160Tl2Arr5 = c36160Tl2Arr4;
                                m98450I5 = i54;
                                i48 = i35;
                                m98427t = i36;
                            } else {
                                if ("LocalVariableTypeTable".equals(m98451H)) {
                                    c36160Tl2Arr4 = c36160Tl2Arr5;
                                    i34 = i55;
                                    i53 = i34;
                                } else if ("LineNumberTable".equals(m98451H)) {
                                    if ((ka02.f19204b & 2) == 0) {
                                        int m98450I8 = m98450I(i55);
                                        int i58 = i55 + 2;
                                        while (true) {
                                            int i59 = m98450I8 - 1;
                                            if (m98450I8 > 0) {
                                                int m98450I9 = m98450I(i58);
                                                int[] iArr10 = iArr8;
                                                int m98450I10 = m98450I(i58 + 2);
                                                i58 += 4;
                                                m98444c(m98450I9, c36160Tl2Arr5);
                                                c36160Tl2Arr5[m98450I9].m83001c(m98450I10);
                                                m98450I8 = i59;
                                                iArr8 = iArr10;
                                            }
                                        }
                                    }
                                    iArr7 = iArr8;
                                    c36160Tl2Arr4 = c36160Tl2Arr5;
                                    i34 = i55;
                                    i36 = m98427t;
                                    i35 = i48;
                                    iArr8 = iArr7;
                                    i49 = i34 + m98427t4;
                                    yt23 = yt2;
                                    c36160Tl2Arr5 = c36160Tl2Arr4;
                                    m98450I5 = i54;
                                    i48 = i35;
                                    m98427t = i36;
                                } else {
                                    iArr7 = iArr8;
                                    if ("RuntimeVisibleTypeAnnotations".equals(m98451H)) {
                                        iArr8 = m98452G(yt23, ka02, i55, true);
                                        c36160Tl2Arr4 = c36160Tl2Arr5;
                                        i34 = i55;
                                    } else {
                                        if ("RuntimeInvisibleTypeAnnotations".equals(m98451H)) {
                                            iArr9 = m98452G(yt23, ka02, i55, false);
                                        } else if ("StackMapTable".equals(m98451H)) {
                                            if ((ka02.f19204b & 4) == 0) {
                                                i50 = i55 + 2;
                                                i51 = i55 + m98427t4;
                                            }
                                        } else if ("StackMap".equals(m98451H)) {
                                            if ((ka02.f19204b & 4) == 0) {
                                                i50 = i55 + 2;
                                                i51 = i55 + m98427t4;
                                                z5 = false;
                                            }
                                        } else {
                                            c36160Tl2Arr4 = c36160Tl2Arr5;
                                            i34 = i55;
                                            i35 = i48;
                                            i36 = m98427t;
                                            C28821tp m98437j = m98437j(ka02.f19203a, m98451H, i55, m98427t4, cArr4, i, c36160Tl2Arr4);
                                            m98437j.f111062c = c28821tp3;
                                            c28821tp3 = m98437j;
                                            iArr8 = iArr7;
                                            z5 = z5;
                                            i49 = i34 + m98427t4;
                                            yt23 = yt2;
                                            c36160Tl2Arr5 = c36160Tl2Arr4;
                                            m98450I5 = i54;
                                            i48 = i35;
                                            m98427t = i36;
                                        }
                                        c36160Tl2Arr4 = c36160Tl2Arr5;
                                        i34 = i55;
                                        i36 = m98427t;
                                        i35 = i48;
                                        iArr8 = iArr7;
                                        i49 = i34 + m98427t4;
                                        yt23 = yt2;
                                        c36160Tl2Arr5 = c36160Tl2Arr4;
                                        m98450I5 = i54;
                                        i48 = i35;
                                        m98427t = i36;
                                    }
                                }
                                i36 = m98427t;
                                i35 = i48;
                                i49 = i34 + m98427t4;
                                yt23 = yt2;
                                c36160Tl2Arr5 = c36160Tl2Arr4;
                                m98450I5 = i54;
                                i48 = i35;
                                m98427t = i36;
                            }
                        } else {
                            int[] iArr11 = iArr8;
                            boolean z6 = z5;
                            C36160Tl2[] c36160Tl2Arr6 = c36160Tl2Arr5;
                            int i60 = m98427t;
                            int i61 = i48;
                            C28821tp c28821tp4 = c28821tp3;
                            boolean z7 = (ka02.f19204b & 8) != 0;
                            if (i50 != 0) {
                                ka02.f19215m = -1;
                                ka02.f19216n = 0;
                                ka02.f19217o = 0;
                                ka02.f19218p = 0;
                                ka02.f19219q = new Object[m98450I3];
                                ka02.f19220r = 0;
                                ka02.f19221s = new Object[m98450I2];
                                if (z7) {
                                    m98445b(ka02);
                                }
                                int i62 = i50;
                                while (true) {
                                    i2 = i51;
                                    if (i62 < i2 - 2) {
                                        if (bArr[i62] != 8 || (m98450I = m98450I(i62 + 1)) < 0) {
                                            c36160Tl2Arr3 = c36160Tl2Arr6;
                                            i33 = i60;
                                        } else {
                                            i33 = i60;
                                            if (m98450I >= i33 || (bArr[i37 + m98450I] & UByte.MAX_VALUE) != 187) {
                                                c36160Tl2Arr3 = c36160Tl2Arr6;
                                            } else {
                                                c36160Tl2Arr3 = c36160Tl2Arr6;
                                                m98443d(m98450I, c36160Tl2Arr3);
                                            }
                                        }
                                        i62++;
                                        i60 = i33;
                                        i51 = i2;
                                        c36160Tl2Arr6 = c36160Tl2Arr3;
                                    } else {
                                        c36160Tl2Arr = c36160Tl2Arr6;
                                    }
                                }
                            } else {
                                c36160Tl2Arr = c36160Tl2Arr6;
                                i2 = i51;
                            }
                            int i63 = i60;
                            if (!z7 || (ka02.f19204b & 256) == 0) {
                                i3 = i63;
                                i4 = i2;
                                c36160Tl2Arr2 = c36160Tl2Arr;
                                c28821tp = c28821tp4;
                                i5 = 0;
                            } else {
                                i3 = i63;
                                i4 = i2;
                                c28821tp = c28821tp4;
                                i5 = 0;
                                c36160Tl2Arr2 = c36160Tl2Arr;
                                yt2.mo73041h(-1, m98450I3, null, 0, null);
                            }
                            int m98438i = m98438i(iArr11, i5);
                            int[] iArr12 = iArr9;
                            int m98438i2 = m98438i(iArr12, i5);
                            int i64 = (ka02.f19204b & 256) == 0 ? 33 : i5;
                            int i65 = m98438i;
                            int i66 = i5;
                            int i67 = i66;
                            int i68 = i67;
                            int i69 = i37;
                            int i70 = i50;
                            int i71 = m98438i2;
                            while (true) {
                                int i72 = i61;
                                if (i69 < i72) {
                                    int i73 = i69 - i37;
                                    int i74 = i70;
                                    C36160Tl2[] c36160Tl2Arr7 = c36160Tl2Arr2;
                                    C36160Tl2 c36160Tl2 = c36160Tl2Arr7[i73];
                                    int i75 = i72;
                                    if (c36160Tl2 != null) {
                                        i7 = m98450I2;
                                        c36160Tl2.m83003a(yt2, (ka02.f19204b & 2) == 0);
                                    } else {
                                        i7 = m98450I2;
                                    }
                                    int i76 = i66;
                                    int i77 = i74;
                                    while (true) {
                                        if (i77 != 0) {
                                            int i78 = ka02.f19215m;
                                            i9 = m98450I3;
                                            if (i78 == i73 || i78 == -1) {
                                                if (i78 != -1) {
                                                    boolean z8 = z6;
                                                    if (z8 && !z7) {
                                                        iArr6 = iArr11;
                                                        i32 = i73;
                                                        i31 = i75;
                                                        cArr3 = cArr4;
                                                        z4 = z8;
                                                        i29 = i69;
                                                        i30 = i77;
                                                        iArr5 = iArr12;
                                                        yt2.mo73041h(ka02.f19216n, ka02.f19218p, ka02.f19219q, ka02.f19220r, ka02.f19221s);
                                                    } else {
                                                        i29 = i69;
                                                        i30 = i77;
                                                        iArr5 = iArr12;
                                                        iArr6 = iArr11;
                                                        i31 = i75;
                                                        i32 = i73;
                                                        cArr3 = cArr4;
                                                        z4 = z8;
                                                        yt2.mo73041h(-1, ka02.f19217o, ka02.f19219q, ka02.f19220r, ka02.f19221s);
                                                    }
                                                    i76 = 0;
                                                } else {
                                                    i29 = i69;
                                                    i30 = i77;
                                                    iArr5 = iArr12;
                                                    i31 = i75;
                                                    cArr3 = cArr4;
                                                    z4 = z6;
                                                    iArr6 = iArr11;
                                                    i32 = i73;
                                                }
                                                if (i30 < i4) {
                                                    i77 = m98455D(i30, z4, z7, ka02);
                                                    i73 = i32;
                                                    i69 = i29;
                                                    m98450I3 = i9;
                                                    iArr11 = iArr6;
                                                    iArr12 = iArr5;
                                                } else {
                                                    i73 = i32;
                                                    i69 = i29;
                                                    m98450I3 = i9;
                                                    iArr11 = iArr6;
                                                    iArr12 = iArr5;
                                                    i77 = 0;
                                                }
                                                z6 = z4;
                                                cArr4 = cArr3;
                                                i75 = i31;
                                            } else {
                                                i11 = i69;
                                                i8 = i77;
                                                iArr2 = iArr12;
                                                i10 = i75;
                                            }
                                        } else {
                                            i8 = i77;
                                            iArr2 = iArr12;
                                            i9 = m98450I3;
                                            i10 = i75;
                                            i11 = i69;
                                        }
                                    }
                                    char[] cArr5 = cArr4;
                                    boolean z9 = z6;
                                    int[] iArr13 = iArr11;
                                    int i79 = i73;
                                    if (i76 != 0) {
                                        if ((ka02.f19204b & 8) != 0) {
                                            yt2.mo73041h(256, 0, null, 0, null);
                                        }
                                        i12 = 0;
                                    } else {
                                        i12 = i76;
                                    }
                                    int i80 = bArr[i11] & UByte.MAX_VALUE;
                                    switch (i80) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case SyslogConstants.LOG_LOCAL1 /* 136 */:
                                        case 137:
                                        case 138:
                                        case 139:
                                        case 140:
                                        case 141:
                                        case 142:
                                        case 143:
                                        case SyslogConstants.LOG_LOCAL2 /* 144 */:
                                        case 145:
                                        case 146:
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        case 151:
                                        case SyslogConstants.LOG_LOCAL3 /* 152 */:
                                        case 172:
                                        case 173:
                                        case 174:
                                        case 175:
                                        case SyslogConstants.LOG_LOCAL6 /* 176 */:
                                        case 177:
                                        case 190:
                                        case 191:
                                        case 194:
                                        case 195:
                                            z = z7;
                                            z2 = z9;
                                            i13 = i8;
                                            cArr4 = cArr5;
                                            i14 = 1;
                                            yt22 = yt2;
                                            i15 = i4;
                                            yt22.mo73039j(i80);
                                            i69 = i11 + 1;
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            while (iArr13 != null) {
                                                iArr3 = iArr13;
                                                if (i17 < iArr3.length && i16 <= i79) {
                                                    if (i16 == i79) {
                                                        z3 = i14;
                                                        int m98453F = m98453F(ka0, iArr3[i17]);
                                                        m98429r(yt22.mo73038k(ka0.f19210h, ka0.f19211i, m98451H(m98453F, cArr4), z3), m98453F + 2, z3, cArr4);
                                                    } else {
                                                        z3 = i14;
                                                    }
                                                    i17++;
                                                    i16 = m98438i(iArr3, i17);
                                                    iArr13 = iArr3;
                                                    i14 = z3;
                                                } else {
                                                    ka02 = ka0;
                                                    i24 = i71;
                                                    i25 = i68;
                                                    iArr4 = iArr2;
                                                    while (iArr4 != null && i25 < iArr4.length && i24 <= i79) {
                                                        if (i24 != i79) {
                                                            int m98453F2 = m98453F(ka02, iArr4[i25]);
                                                            i26 = i16;
                                                            i27 = i17;
                                                            i28 = i79;
                                                            m98429r(yt22.mo73038k(ka02.f19210h, ka02.f19211i, m98451H(m98453F2, cArr4), false), m98453F2 + 2, true, cArr4);
                                                        } else {
                                                            i26 = i16;
                                                            i27 = i17;
                                                            i28 = i79;
                                                        }
                                                        i25++;
                                                        i24 = m98438i(iArr4, i25);
                                                        i16 = i26;
                                                        i17 = i27;
                                                        i79 = i28;
                                                    }
                                                    i65 = i16;
                                                    i68 = i25;
                                                    iArr12 = iArr4;
                                                    c36160Tl2Arr2 = c36160Tl2Arr7;
                                                    i5 = 0;
                                                    i67 = i17;
                                                    m98450I2 = i7;
                                                    m98450I3 = i9;
                                                    i70 = i13;
                                                    z6 = z2;
                                                    z7 = z;
                                                    i71 = i24;
                                                    iArr11 = iArr3;
                                                    i4 = i15;
                                                    i61 = i10;
                                                }
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                                if (i24 != i79) {
                                                }
                                                i25++;
                                                i24 = m98438i(iArr4, i25);
                                                i16 = i26;
                                                i17 = i27;
                                                i79 = i28;
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 16:
                                        case 188:
                                            z = z7;
                                            z2 = z9;
                                            i13 = i8;
                                            cArr4 = cArr5;
                                            i14 = 1;
                                            yt22 = yt2;
                                            i15 = i4;
                                            yt22.mo73037l(i80, bArr[i11 + 1]);
                                            i69 = i11 + 2;
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 17:
                                            z = z7;
                                            z2 = z9;
                                            i13 = i8;
                                            cArr4 = cArr5;
                                            i14 = 1;
                                            yt22 = yt2;
                                            i15 = i4;
                                            yt22.mo73037l(i80, m98456C(i11 + 1));
                                            i69 = i11 + 3;
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 18:
                                            z = z7;
                                            z2 = z9;
                                            i13 = i8;
                                            cArr4 = cArr5;
                                            i14 = 1;
                                            yt22 = yt2;
                                            i15 = i4;
                                            yt22.mo73033p(m98432o(bArr[i11 + 1] & UByte.MAX_VALUE, cArr4));
                                            i69 = i11 + 2;
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 19:
                                        case 20:
                                            z = z7;
                                            z2 = z9;
                                            i13 = i8;
                                            cArr4 = cArr5;
                                            i14 = 1;
                                            yt22 = yt2;
                                            i15 = i4;
                                            yt22.mo73033p(m98432o(m98450I(i11 + 1), cArr4));
                                            i69 = i11 + 3;
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 169:
                                            z = z7;
                                            z2 = z9;
                                            i13 = i8;
                                            cArr4 = cArr5;
                                            i14 = 1;
                                            yt22 = yt2;
                                            i15 = i4;
                                            yt22.mo73067E(i80, bArr[i11 + 1] & UByte.MAX_VALUE);
                                            i69 = i11 + 2;
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                            z = z7;
                                            z2 = z9;
                                            i13 = i8;
                                            cArr4 = cArr5;
                                            i14 = 1;
                                            yt22 = yt2;
                                            i15 = i4;
                                            int i81 = i80 - 26;
                                            yt22.mo73067E((i81 >> 2) + 21, i81 & 3);
                                            i69 = i11 + 1;
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                            z = z7;
                                            z2 = z9;
                                            i13 = i8;
                                            cArr4 = cArr5;
                                            i14 = 1;
                                            yt22 = yt2;
                                            i15 = i4;
                                            int i82 = i80 - 59;
                                            yt22.mo73067E((i82 >> 2) + 54, i82 & 3);
                                            i69 = i11 + 1;
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 132:
                                            z = z7;
                                            z2 = z9;
                                            i13 = i8;
                                            cArr4 = cArr5;
                                            i14 = 1;
                                            yt22 = yt2;
                                            i15 = i4;
                                            yt22.mo73040i(bArr[i11 + 1] & UByte.MAX_VALUE, bArr[i11 + 2]);
                                            i69 = i11 + 3;
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                        case SyslogConstants.LOG_LOCAL4 /* 160 */:
                                        case 161:
                                        case 162:
                                        case 163:
                                        case 164:
                                        case 165:
                                        case 166:
                                        case 167:
                                        case 168:
                                        case 198:
                                        case 199:
                                            z = z7;
                                            z2 = z9;
                                            i13 = i8;
                                            cArr4 = cArr5;
                                            i14 = 1;
                                            yt22 = yt2;
                                            i15 = i4;
                                            yt22.mo73035n(i80, c36160Tl2Arr7[i79 + m98456C(i11 + 1)]);
                                            i69 = i11 + 3;
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 170:
                                            z = z7;
                                            z2 = z9;
                                            i13 = i8;
                                            cArr4 = cArr5;
                                            i14 = 1;
                                            yt22 = yt2;
                                            i15 = i4;
                                            int i83 = i11 + (4 - (i79 & 3));
                                            C36160Tl2 c36160Tl22 = c36160Tl2Arr7[i79 + m98427t(i83)];
                                            int m98427t5 = m98427t(i83 + 4);
                                            int m98427t6 = m98427t(i83 + 8);
                                            i69 = i83 + 12;
                                            int i84 = (m98427t6 - m98427t5) + 1;
                                            C36160Tl2[] c36160Tl2Arr8 = new C36160Tl2[i84];
                                            for (int i85 = 0; i85 < i84; i85++) {
                                                c36160Tl2Arr8[i85] = c36160Tl2Arr7[m98427t(i69) + i79];
                                                i69 += 4;
                                            }
                                            yt22.mo73023z(m98427t5, m98427t6, c36160Tl22, c36160Tl2Arr8);
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 171:
                                            z = z7;
                                            z2 = z9;
                                            i13 = i8;
                                            cArr4 = cArr5;
                                            i14 = 1;
                                            yt22 = yt2;
                                            i15 = i4;
                                            int i86 = i11 + (4 - (i79 & 3));
                                            C36160Tl2 c36160Tl23 = c36160Tl2Arr7[i79 + m98427t(i86)];
                                            int m98427t7 = m98427t(i86 + 4);
                                            i69 = i86 + 8;
                                            int[] iArr14 = new int[m98427t7];
                                            C36160Tl2[] c36160Tl2Arr9 = new C36160Tl2[m98427t7];
                                            for (int i87 = 0; i87 < m98427t7; i87++) {
                                                iArr14[i87] = m98427t(i69);
                                                c36160Tl2Arr9[i87] = c36160Tl2Arr7[m98427t(i69 + 4) + i79];
                                                i69 += 8;
                                            }
                                            yt22.mo73029t(c36160Tl23, iArr14, c36160Tl2Arr9);
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 178:
                                        case 179:
                                        case 180:
                                        case 181:
                                        case 182:
                                        case 183:
                                        case SyslogConstants.LOG_LOCAL7 /* 184 */:
                                        case 185:
                                            z = z7;
                                            i13 = i8;
                                            yt22 = yt2;
                                            i15 = i4;
                                            int i88 = this.f20098d[m98450I(i11 + 1)];
                                            int i89 = this.f20098d[m98450I(i88 + 2)];
                                            String m98434m = m98434m(i88, cArr5);
                                            String m98451H2 = m98451H(i89, cArr5);
                                            String m98451H3 = m98451H(i89 + 2, cArr5);
                                            if (i80 < 182) {
                                                yt22.mo73042g(i80, m98434m, m98451H2, m98451H3);
                                                i18 = i80;
                                                z2 = z9;
                                                i14 = 1;
                                                cArr4 = cArr5;
                                            } else {
                                                z2 = z9;
                                                cArr4 = cArr5;
                                                i14 = 1;
                                                i18 = i80;
                                                yt2.mo73027v(i80, m98434m, m98451H2, m98451H3, bArr[i88 + (-1)] == 11);
                                            }
                                            if (i18 == 185) {
                                                i69 = i11 + 5;
                                                i16 = i65;
                                                i17 = i67;
                                                i66 = i12;
                                                while (iArr13 != null) {
                                                }
                                                iArr3 = iArr13;
                                                ka02 = ka0;
                                                i24 = i71;
                                                i25 = i68;
                                                iArr4 = iArr2;
                                                while (iArr4 != null) {
                                                }
                                                i65 = i16;
                                                i68 = i25;
                                                iArr12 = iArr4;
                                                c36160Tl2Arr2 = c36160Tl2Arr7;
                                                i5 = 0;
                                                i67 = i17;
                                                m98450I2 = i7;
                                                m98450I3 = i9;
                                                i70 = i13;
                                                z6 = z2;
                                                z7 = z;
                                                i71 = i24;
                                                iArr11 = iArr3;
                                                i4 = i15;
                                                i61 = i10;
                                            }
                                            i69 = i11 + 3;
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 186:
                                            i13 = i8;
                                            cArr = cArr5;
                                            yt22 = yt2;
                                            int i90 = this.f20098d[m98450I(i11 + 1)];
                                            int i91 = this.f20098d[m98450I(i90 + 2)];
                                            String m98451H4 = m98451H(i91, cArr);
                                            String m98451H5 = m98451H(i91 + 2, cArr);
                                            int i92 = this.f20101g[m98450I(i90)];
                                            GE1 ge1 = (GE1) m98432o(m98450I(i92), cArr);
                                            int m98450I11 = m98450I(i92 + 2);
                                            z = z7;
                                            Object[] objArr = new Object[m98450I11];
                                            int i93 = i92 + 4;
                                            i15 = i4;
                                            int i94 = 0;
                                            while (i94 < m98450I11) {
                                                objArr[i94] = m98432o(m98450I(i93), cArr);
                                                i93 += 2;
                                                i94++;
                                                m98450I11 = m98450I11;
                                            }
                                            yt22.mo73036m(m98451H4, m98451H5, ge1, objArr);
                                            i69 = i11 + 5;
                                            z2 = z9;
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            i14 = 1;
                                            cArr4 = cArr;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 187:
                                        case 189:
                                        case 192:
                                        case 193:
                                            i13 = i8;
                                            cArr2 = cArr5;
                                            c = 132;
                                            i19 = 1;
                                            yt22 = yt2;
                                            yt22.mo73068D(i80, m98434m(i11 + 1, cArr2));
                                            i20 = i11 + 3;
                                            i14 = i19;
                                            z = z7;
                                            i15 = i4;
                                            z2 = z9;
                                            i17 = i67;
                                            i66 = i12;
                                            i69 = i20;
                                            cArr4 = cArr2;
                                            i16 = i65;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 196:
                                            i13 = i8;
                                            cArr2 = cArr5;
                                            i19 = 1;
                                            yt22 = yt2;
                                            int i95 = bArr[i11 + 1] & UByte.MAX_VALUE;
                                            c = 132;
                                            if (i95 == 132) {
                                                yt22.mo73040i(m98450I(i11 + 2), m98456C(i11 + 4));
                                                i20 = i11 + 6;
                                            } else {
                                                yt22.mo73067E(i95, m98450I(i11 + 2));
                                                i20 = i11 + 4;
                                            }
                                            i14 = i19;
                                            z = z7;
                                            i15 = i4;
                                            z2 = z9;
                                            i17 = i67;
                                            i66 = i12;
                                            i69 = i20;
                                            cArr4 = cArr2;
                                            i16 = i65;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 197:
                                            i13 = i8;
                                            yt22 = yt2;
                                            cArr = cArr5;
                                            yt22.mo73026w(m98434m(i11 + 1, cArr), bArr[i11 + 3] & UByte.MAX_VALUE);
                                            i69 = i11 + 4;
                                            i14 = 1;
                                            z = z7;
                                            i15 = i4;
                                            z2 = z9;
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            cArr4 = cArr;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
                                        case 201:
                                            i13 = i8;
                                            yt22 = yt2;
                                            yt22.mo73035n(i80 - i64, c36160Tl2Arr7[i79 + m98427t(i11 + 1)]);
                                            i69 = i11 + 5;
                                            i14 = 1;
                                            z = z7;
                                            z2 = z9;
                                            i16 = i65;
                                            i17 = i67;
                                            i66 = i12;
                                            cArr4 = cArr5;
                                            i15 = i4;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 202:
                                        case 203:
                                        case 204:
                                        case 205:
                                        case 206:
                                        case 207:
                                        case 208:
                                        case 209:
                                        case 210:
                                        case 211:
                                        case 212:
                                        case 213:
                                        case 214:
                                        case 215:
                                        case 216:
                                        case 217:
                                        case 218:
                                        case 219:
                                            i13 = i8;
                                            yt22 = yt2;
                                            int i96 = i80 < 218 ? i80 - 49 : i80 - 20;
                                            C36160Tl2 c36160Tl24 = c36160Tl2Arr7[m98450I(i11 + 1) + i79];
                                            if (i96 != 167 && i96 != 168) {
                                                if (i96 < 167) {
                                                    i21 = 1;
                                                    i23 = ((i96 + 1) ^ 1) - 1;
                                                } else {
                                                    i21 = 1;
                                                    i23 = i96 ^ 1;
                                                }
                                                yt22.mo73035n(i23, m98443d(i79 + 3, c36160Tl2Arr7));
                                                yt22.mo73035n(C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, c36160Tl24);
                                                i22 = i21;
                                            } else {
                                                i21 = 1;
                                                yt22.mo73035n(i96 + 33, c36160Tl24);
                                                i22 = i12;
                                            }
                                            i14 = i21;
                                            z = z7;
                                            z2 = z9;
                                            i17 = i67;
                                            cArr4 = cArr5;
                                            i66 = i22;
                                            i15 = i4;
                                            i69 = i11 + 3;
                                            i16 = i65;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        case 220:
                                            i13 = i8;
                                            yt22 = yt2;
                                            yt22.mo73035n(C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, c36160Tl2Arr7[m98427t(i11 + 1) + i79]);
                                            i69 = i11 + 5;
                                            z = z7;
                                            z2 = z9;
                                            i16 = i65;
                                            i17 = i67;
                                            cArr4 = cArr5;
                                            i66 = 1;
                                            i14 = 1;
                                            i15 = i4;
                                            while (iArr13 != null) {
                                            }
                                            iArr3 = iArr13;
                                            ka02 = ka0;
                                            i24 = i71;
                                            i25 = i68;
                                            iArr4 = iArr2;
                                            while (iArr4 != null) {
                                            }
                                            i65 = i16;
                                            i68 = i25;
                                            iArr12 = iArr4;
                                            c36160Tl2Arr2 = c36160Tl2Arr7;
                                            i5 = 0;
                                            i67 = i17;
                                            m98450I2 = i7;
                                            m98450I3 = i9;
                                            i70 = i13;
                                            z6 = z2;
                                            z7 = z;
                                            i71 = i24;
                                            iArr11 = iArr3;
                                            i4 = i15;
                                            i61 = i10;
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } else {
                                    int[] iArr15 = iArr12;
                                    int[] iArr16 = iArr11;
                                    int i97 = m98450I2;
                                    int i98 = m98450I3;
                                    int i99 = i5;
                                    C36160Tl2[] c36160Tl2Arr10 = c36160Tl2Arr2;
                                    C36160Tl2 c36160Tl25 = c36160Tl2Arr10[i3];
                                    if (c36160Tl25 != null) {
                                        yt2.mo73034o(c36160Tl25);
                                    }
                                    int i100 = i52;
                                    if (i100 != 0 && (ka02.f19204b & 2) == 0) {
                                        int i101 = i53;
                                        if (i101 != 0) {
                                            int m98450I12 = m98450I(i101) * 3;
                                            int[] iArr17 = new int[m98450I12];
                                            int i102 = i101 + 2;
                                            while (m98450I12 > 0) {
                                                int i103 = m98450I12 - 1;
                                                iArr17[i103] = i102 + 6;
                                                int i104 = i103 - 1;
                                                iArr17[i104] = m98450I(i102 + 8);
                                                m98450I12 = i104 - 1;
                                                iArr17[m98450I12] = m98450I(i102);
                                                i102 += 10;
                                            }
                                            iArr = iArr17;
                                        } else {
                                            iArr = null;
                                        }
                                        int m98450I13 = m98450I(i100);
                                        int i105 = i100 + 2;
                                        while (true) {
                                            int i106 = m98450I13 - 1;
                                            if (m98450I13 > 0) {
                                                int m98450I14 = m98450I(i105);
                                                int m98450I15 = m98450I(i105 + 2);
                                                String m98451H6 = m98451H(i105 + 4, cArr4);
                                                String m98451H7 = m98451H(i105 + 6, cArr4);
                                                int m98450I16 = m98450I(i105 + 8);
                                                int i107 = i105 + 10;
                                                if (iArr != null) {
                                                    for (int i108 = i99; i108 < iArr.length; i108 += 3) {
                                                        if (iArr[i108] == m98450I14 && iArr[i108 + 1] == m98450I16) {
                                                            str = m98451H(iArr[i108 + 2], cArr4);
                                                            yt2.mo73031r(m98451H6, m98451H7, str, c36160Tl2Arr10[m98450I14], c36160Tl2Arr10[m98450I14 + m98450I15], m98450I16);
                                                            m98450I13 = i106;
                                                            i105 = i107;
                                                            iArr15 = iArr15;
                                                            i99 = 0;
                                                        }
                                                    }
                                                }
                                                str = null;
                                                yt2.mo73031r(m98451H6, m98451H7, str, c36160Tl2Arr10[m98450I14], c36160Tl2Arr10[m98450I14 + m98450I15], m98450I16);
                                                m98450I13 = i106;
                                                i105 = i107;
                                                iArr15 = iArr15;
                                                i99 = 0;
                                            }
                                        }
                                    }
                                    int[] iArr18 = iArr15;
                                    int i109 = 65;
                                    int i110 = 64;
                                    if (iArr16 != null) {
                                        int length = iArr16.length;
                                        int i111 = 0;
                                        while (i111 < length) {
                                            int i112 = iArr16[i111];
                                            int m98435l = m98435l(i112);
                                            if (m98435l == 64 || m98435l == i109) {
                                                int m98453F3 = m98453F(ka02, i112);
                                                i6 = i111;
                                                c28821tp2 = c28821tp;
                                                m98429r(yt2.mo73030s(ka02.f19210h, ka02.f19211i, ka02.f19212j, ka02.f19213k, ka02.f19214l, m98451H(m98453F3, cArr4), true), m98453F3 + 2, true, cArr4);
                                            } else {
                                                i6 = i111;
                                                c28821tp2 = c28821tp;
                                            }
                                            i111 = i6 + 1;
                                            c28821tp = c28821tp2;
                                            i109 = 65;
                                        }
                                    }
                                    C28821tp c28821tp5 = c28821tp;
                                    if (iArr18 != null) {
                                        int length2 = iArr18.length;
                                        int i113 = 0;
                                        while (i113 < length2) {
                                            int i114 = iArr18[i113];
                                            int m98435l2 = m98435l(i114);
                                            if (m98435l2 == i110 || m98435l2 == 65) {
                                                int m98453F4 = m98453F(ka02, i114);
                                                m98429r(yt2.mo73030s(ka02.f19210h, ka02.f19211i, ka02.f19212j, ka02.f19213k, ka02.f19214l, m98451H(m98453F4, cArr4), false), m98453F4 + 2, true, cArr4);
                                            }
                                            i113++;
                                            i110 = 64;
                                        }
                                    }
                                    C28821tp c28821tp6 = c28821tp5;
                                    while (c28821tp6 != null) {
                                        C28821tp c28821tp7 = c28821tp6.f111062c;
                                        c28821tp6.f111062c = null;
                                        yt2.mo73045d(c28821tp6);
                                        c28821tp6 = c28821tp7;
                                    }
                                    yt2.mo73028u(i97, i98);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: o */
    public Object m98432o(int i, char[] cArr) {
        boolean z;
        int i2 = this.f20098d[i];
        byte b = this.f20097c[i2 - 1];
        switch (b) {
            case 3:
                return Integer.valueOf(m98427t(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(m98427t(i2)));
            case 5:
                return Long.valueOf(m98425v(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(m98425v(i2)));
            case 7:
                return C31628Ab6.m115474j(m98451H(i2, cArr));
            case 8:
                return m98451H(i2, cArr);
            default:
                switch (b) {
                    case 15:
                        int m98435l = m98435l(i2);
                        int i3 = this.f20098d[m98450I(i2 + 1)];
                        int i4 = this.f20098d[m98450I(i3 + 2)];
                        String m98434m = m98434m(i3, cArr);
                        String m98451H = m98451H(i4, cArr);
                        String m98451H2 = m98451H(i4 + 2, cArr);
                        if (this.f20097c[i3 - 1] == 11) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return new GE1(m98435l, m98434m, m98451H, m98451H2, z);
                    case 16:
                        return C31628Ab6.m115475i(m98451H(i2, cArr));
                    case 17:
                        return m98431p(i, cArr);
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    /* renamed from: p */
    public final C35105Oy0 m98431p(int i, char[] cArr) {
        C35105Oy0 c35105Oy0 = this.f20100f[i];
        if (c35105Oy0 != null) {
            return c35105Oy0;
        }
        int[] iArr = this.f20098d;
        int i2 = iArr[i];
        int i3 = iArr[m98450I(i2 + 2)];
        String m98451H = m98451H(i3, cArr);
        String m98451H2 = m98451H(i3 + 2, cArr);
        int i4 = this.f20101g[m98450I(i2)];
        GE1 ge1 = (GE1) m98432o(m98450I(i4), cArr);
        int m98450I = m98450I(i4 + 2);
        Object[] objArr = new Object[m98450I];
        int i5 = i4 + 4;
        for (int i6 = 0; i6 < m98450I; i6++) {
            objArr[i6] = m98432o(m98450I(i5), cArr);
            i5 += 2;
        }
        C35105Oy0[] c35105Oy0Arr = this.f20100f;
        C35105Oy0 c35105Oy02 = new C35105Oy0(m98451H, m98451H2, ge1, objArr);
        c35105Oy0Arr[i] = c35105Oy02;
        return c35105Oy02;
    }

    /* renamed from: q */
    public final int m98430q(AbstractC3201Hf abstractC3201Hf, int i, String str, char[] cArr) {
        Object obj;
        boolean z;
        int i2 = 0;
        if (abstractC3201Hf == null) {
            int i3 = this.f20097c[i] & UByte.MAX_VALUE;
            if (i3 != 64) {
                if (i3 != 91) {
                    if (i3 != 101) {
                        return i + 3;
                    }
                    return i + 5;
                }
                return m98429r(null, i + 1, false, cArr);
            }
            return m98429r(null, i + 3, true, cArr);
        }
        int i4 = i + 1;
        int i5 = this.f20097c[i] & UByte.MAX_VALUE;
        if (i5 != 64) {
            if (i5 != 70) {
                if (i5 != 83) {
                    if (i5 != 99) {
                        if (i5 != 101) {
                            if (i5 != 115) {
                                if (i5 != 73 && i5 != 74) {
                                    if (i5 != 90) {
                                        if (i5 != 91) {
                                            switch (i5) {
                                                case 66:
                                                    abstractC3201Hf.mo101842a(str, Byte.valueOf((byte) m98427t(this.f20098d[m98450I(i4)])));
                                                    break;
                                                case 67:
                                                    abstractC3201Hf.mo101842a(str, Character.valueOf((char) m98427t(this.f20098d[m98450I(i4)])));
                                                    break;
                                                case 68:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException();
                                            }
                                        } else {
                                            int m98450I = m98450I(i4);
                                            int i6 = i4 + 2;
                                            if (m98450I == 0) {
                                                return m98429r(abstractC3201Hf.mo101840c(str), i6 - 2, false, cArr);
                                            }
                                            int i7 = this.f20097c[i6] & UByte.MAX_VALUE;
                                            if (i7 != 70) {
                                                if (i7 != 83) {
                                                    if (i7 != 90) {
                                                        if (i7 != 73) {
                                                            if (i7 != 74) {
                                                                switch (i7) {
                                                                    case 66:
                                                                        byte[] bArr = new byte[m98450I];
                                                                        while (i2 < m98450I) {
                                                                            bArr[i2] = (byte) m98427t(this.f20098d[m98450I(i6 + 1)]);
                                                                            i6 += 3;
                                                                            i2++;
                                                                        }
                                                                        abstractC3201Hf.mo101842a(str, bArr);
                                                                        return i6;
                                                                    case 67:
                                                                        char[] cArr2 = new char[m98450I];
                                                                        while (i2 < m98450I) {
                                                                            cArr2[i2] = (char) m98427t(this.f20098d[m98450I(i6 + 1)]);
                                                                            i6 += 3;
                                                                            i2++;
                                                                        }
                                                                        abstractC3201Hf.mo101842a(str, cArr2);
                                                                        return i6;
                                                                    case 68:
                                                                        double[] dArr = new double[m98450I];
                                                                        while (i2 < m98450I) {
                                                                            dArr[i2] = Double.longBitsToDouble(m98425v(this.f20098d[m98450I(i6 + 1)]));
                                                                            i6 += 3;
                                                                            i2++;
                                                                        }
                                                                        abstractC3201Hf.mo101842a(str, dArr);
                                                                        return i6;
                                                                    default:
                                                                        return m98429r(abstractC3201Hf.mo101840c(str), i6 - 2, false, cArr);
                                                                }
                                                            }
                                                            long[] jArr = new long[m98450I];
                                                            while (i2 < m98450I) {
                                                                jArr[i2] = m98425v(this.f20098d[m98450I(i6 + 1)]);
                                                                i6 += 3;
                                                                i2++;
                                                            }
                                                            abstractC3201Hf.mo101842a(str, jArr);
                                                            return i6;
                                                        }
                                                        int[] iArr = new int[m98450I];
                                                        while (i2 < m98450I) {
                                                            iArr[i2] = m98427t(this.f20098d[m98450I(i6 + 1)]);
                                                            i6 += 3;
                                                            i2++;
                                                        }
                                                        abstractC3201Hf.mo101842a(str, iArr);
                                                        return i6;
                                                    }
                                                    boolean[] zArr = new boolean[m98450I];
                                                    for (int i8 = 0; i8 < m98450I; i8++) {
                                                        if (m98427t(this.f20098d[m98450I(i6 + 1)]) != 0) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        zArr[i8] = z;
                                                        i6 += 3;
                                                    }
                                                    abstractC3201Hf.mo101842a(str, zArr);
                                                    return i6;
                                                }
                                                short[] sArr = new short[m98450I];
                                                while (i2 < m98450I) {
                                                    sArr[i2] = (short) m98427t(this.f20098d[m98450I(i6 + 1)]);
                                                    i6 += 3;
                                                    i2++;
                                                }
                                                abstractC3201Hf.mo101842a(str, sArr);
                                                return i6;
                                            }
                                            float[] fArr = new float[m98450I];
                                            while (i2 < m98450I) {
                                                fArr[i2] = Float.intBitsToFloat(m98427t(this.f20098d[m98450I(i6 + 1)]));
                                                i6 += 3;
                                                i2++;
                                            }
                                            abstractC3201Hf.mo101842a(str, fArr);
                                            return i6;
                                        }
                                    } else {
                                        if (m98427t(this.f20098d[m98450I(i4)]) == 0) {
                                            obj = Boolean.FALSE;
                                        } else {
                                            obj = Boolean.TRUE;
                                        }
                                        abstractC3201Hf.mo101842a(str, obj);
                                    }
                                }
                            } else {
                                abstractC3201Hf.mo101842a(str, m98451H(i4, cArr));
                            }
                        } else {
                            abstractC3201Hf.mo101838e(str, m98451H(i4, cArr), m98451H(i4 + 2, cArr));
                            return i4 + 4;
                        }
                    } else {
                        abstractC3201Hf.mo101842a(str, C31628Ab6.m115470n(m98451H(i4, cArr)));
                    }
                } else {
                    abstractC3201Hf.mo101842a(str, Short.valueOf((short) m98427t(this.f20098d[m98450I(i4)])));
                }
                return i4 + 2;
            }
            abstractC3201Hf.mo101842a(str, m98432o(m98450I(i4), cArr));
            return i4 + 2;
        }
        return m98429r(abstractC3201Hf.mo101841b(str, m98451H(i4, cArr)), i4 + 2, true, cArr);
    }

    /* renamed from: r */
    public final int m98429r(AbstractC3201Hf abstractC3201Hf, int i, boolean z, char[] cArr) {
        int m98450I = m98450I(i);
        int i2 = i + 2;
        if (!z) {
            while (true) {
                int i3 = m98450I - 1;
                if (m98450I <= 0) {
                    break;
                }
                i2 = m98430q(abstractC3201Hf, i2, null, cArr);
                m98450I = i3;
            }
        } else {
            while (true) {
                int i4 = m98450I - 1;
                if (m98450I <= 0) {
                    break;
                }
                i2 = m98430q(abstractC3201Hf, i2 + 2, m98451H(i2, cArr), cArr);
                m98450I = i4;
            }
        }
        if (abstractC3201Hf != null) {
            abstractC3201Hf.mo101839d();
        }
        return i2;
    }

    /* renamed from: s */
    public final int m98428s(AbstractC34736Nj0 abstractC34736Nj0, KA0 ka0, int i) {
        int i2;
        int i3;
        KA0 ka02 = ka0;
        char[] cArr = ka02.f19205c;
        int m98450I = m98450I(i);
        String m98451H = m98451H(i + 2, cArr);
        String m98451H2 = m98451H(i + 4, cArr);
        int i4 = i + 6;
        int m98450I2 = m98450I(i4);
        int i5 = i4 + 2;
        int i6 = m98450I;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        C28821tp c28821tp = null;
        String str = null;
        Object obj = null;
        while (true) {
            int i11 = m98450I2 - 1;
            if (m98450I2 <= 0) {
                break;
            }
            String m98451H3 = m98451H(i5, cArr);
            int m98427t = m98427t(i5 + 2);
            int i12 = i5 + 6;
            if ("ConstantValue".equals(m98451H3)) {
                int m98450I3 = m98450I(i12);
                if (m98450I3 == 0) {
                    obj = null;
                } else {
                    obj = m98432o(m98450I3, cArr);
                }
            } else if ("Signature".equals(m98451H3)) {
                str = m98451H(i12, cArr);
            } else {
                if ("Deprecated".equals(m98451H3)) {
                    i3 = 131072 | i6;
                } else if ("Synthetic".equals(m98451H3)) {
                    i3 = i6 | 4096;
                } else {
                    if ("RuntimeVisibleAnnotations".equals(m98451H3)) {
                        i10 = i12;
                        i2 = i10;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(m98451H3)) {
                        i8 = i12;
                        i2 = i8;
                    } else if ("RuntimeInvisibleAnnotations".equals(m98451H3)) {
                        i9 = i12;
                        i2 = i9;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(m98451H3)) {
                        i7 = i12;
                        i2 = i7;
                    } else {
                        i2 = i12;
                        C28821tp c28821tp2 = c28821tp;
                        c28821tp = m98437j(ka02.f19203a, m98451H3, i2, m98427t, cArr, -1, null);
                        c28821tp.f111062c = c28821tp2;
                        i9 = i9;
                        i10 = i10;
                        i7 = i7;
                        i8 = i8;
                    }
                    i5 = i2 + m98427t;
                    ka02 = ka0;
                    m98450I2 = i11;
                }
                i6 = i3;
            }
            i2 = i12;
            i5 = i2 + m98427t;
            ka02 = ka0;
            m98450I2 = i11;
        }
        C28821tp c28821tp3 = c28821tp;
        int i13 = i7;
        int i14 = i8;
        int i15 = i9;
        int i16 = i10;
        AbstractC38735bl1 mo91626e = abstractC34736Nj0.mo91626e(i6, m98451H, m98451H2, str, obj);
        if (mo91626e == null) {
            return i5;
        }
        if (i16 != 0) {
            int m98450I4 = m98450I(i16);
            int i17 = i16 + 2;
            while (true) {
                int i18 = m98450I4 - 1;
                if (m98450I4 <= 0) {
                    break;
                }
                i17 = m98429r(mo91626e.mo60938a(m98451H(i17, cArr), true), i17 + 2, true, cArr);
                m98450I4 = i18;
            }
        }
        if (i15 != 0) {
            int m98450I5 = m98450I(i15);
            int i19 = i15 + 2;
            while (true) {
                int i20 = m98450I5 - 1;
                if (m98450I5 <= 0) {
                    break;
                }
                i19 = m98429r(mo91626e.mo60938a(m98451H(i19, cArr), false), i19 + 2, true, cArr);
                m98450I5 = i20;
            }
        }
        if (i14 != 0) {
            int m98450I6 = m98450I(i14);
            int i21 = i14 + 2;
            while (true) {
                int i22 = m98450I6 - 1;
                if (m98450I6 <= 0) {
                    break;
                }
                int m98453F = m98453F(ka0, i21);
                i21 = m98429r(mo91626e.mo60935d(ka0.f19210h, ka0.f19211i, m98451H(m98453F, cArr), true), m98453F + 2, true, cArr);
                m98450I6 = i22;
            }
        }
        if (i13 != 0) {
            int m98450I7 = m98450I(i13);
            int i23 = i13 + 2;
            while (true) {
                int i24 = m98450I7 - 1;
                if (m98450I7 <= 0) {
                    break;
                }
                int m98453F2 = m98453F(ka0, i23);
                i23 = m98429r(mo91626e.mo60935d(ka0.f19210h, ka0.f19211i, m98451H(m98453F2, cArr), false), m98453F2 + 2, true, cArr);
                m98450I7 = i24;
            }
        }
        while (true) {
            C28821tp c28821tp4 = c28821tp3;
            if (c28821tp4 != null) {
                c28821tp3 = c28821tp4.f111062c;
                c28821tp4.f111062c = null;
                mo91626e.mo60937b(c28821tp4);
            } else {
                mo91626e.mo60936c();
                return i5;
            }
        }
    }

    /* renamed from: t */
    public int m98427t(int i) {
        byte[] bArr = this.f20097c;
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }

    /* renamed from: u */
    public C36160Tl2 m98426u(int i, C36160Tl2[] c36160Tl2Arr) {
        if (c36160Tl2Arr[i] == null) {
            c36160Tl2Arr[i] = new C36160Tl2();
        }
        return c36160Tl2Arr[i];
    }

    /* renamed from: v */
    public long m98425v(int i) {
        return (m98427t(i) << 32) | (m98427t(i + 4) & 4294967295L);
    }

    /* renamed from: w */
    public final int m98424w(AbstractC34736Nj0 abstractC34736Nj0, KA0 ka0, int i) {
        int i2;
        int i3;
        int i4;
        char[] cArr = ka0.f19205c;
        ka0.f19206d = m98450I(i);
        ka0.f19207e = m98451H(i + 2, cArr);
        int i5 = i + 4;
        ka0.f19208f = m98451H(i5, cArr);
        int i6 = i + 6;
        int m98450I = m98450I(i6);
        int i7 = i6 + 2;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        C28821tp c28821tp = null;
        boolean z = false;
        int i14 = 0;
        String[] strArr = null;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int i19 = m98450I - 1;
            if (m98450I <= 0) {
                break;
            }
            String m98451H = m98451H(i7, cArr);
            int m98427t = m98427t(i7 + 2);
            int i20 = i7 + 6;
            int i21 = i8;
            if ("Code".equals(m98451H)) {
                if ((ka0.f19204b & 1) == 0) {
                    i18 = i20;
                    i8 = i21;
                    i4 = i18;
                    i7 = i4 + m98427t;
                    m98450I = i19;
                } else {
                    i2 = i9;
                    i3 = i10;
                    i8 = i21;
                    i9 = i2;
                    i10 = i3;
                }
            } else {
                if ("Exceptions".equals(m98451H)) {
                    int m98450I2 = m98450I(i20);
                    String[] strArr2 = new String[m98450I2];
                    int i22 = i9;
                    int i23 = i10;
                    int i24 = i20 + 2;
                    for (int i25 = 0; i25 < m98450I2; i25++) {
                        strArr2[i25] = m98434m(i24, cArr);
                        i24 += 2;
                    }
                    strArr = strArr2;
                    i14 = i20;
                    i8 = i21;
                    i9 = i22;
                    i10 = i23;
                    i4 = i14;
                } else {
                    i2 = i9;
                    i3 = i10;
                    if ("Signature".equals(m98451H)) {
                        i13 = m98450I(i20);
                    } else if ("Deprecated".equals(m98451H)) {
                        ka0.f19206d |= DateUtils.FORMAT_NUMERIC_DATE;
                    } else if ("RuntimeVisibleAnnotations".equals(m98451H)) {
                        i10 = i20;
                        i8 = i21;
                        i9 = i2;
                        i4 = i10;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(m98451H)) {
                        i8 = i20;
                        i4 = i8;
                        i9 = i2;
                        i10 = i3;
                    } else if ("AnnotationDefault".equals(m98451H)) {
                        i11 = i20;
                        i8 = i21;
                        i9 = i2;
                        i10 = i3;
                        i4 = i11;
                    } else if ("Synthetic".equals(m98451H)) {
                        ka0.f19206d |= 4096;
                        i8 = i21;
                        i9 = i2;
                        i10 = i3;
                        z = true;
                    } else if ("RuntimeInvisibleAnnotations".equals(m98451H)) {
                        i9 = i20;
                        i8 = i21;
                        i10 = i3;
                        i4 = i9;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(m98451H)) {
                        i15 = i20;
                        i8 = i21;
                        i9 = i2;
                        i10 = i3;
                        i4 = i15;
                    } else if ("RuntimeVisibleParameterAnnotations".equals(m98451H)) {
                        i16 = i20;
                        i8 = i21;
                        i9 = i2;
                        i10 = i3;
                        i4 = i16;
                    } else if ("RuntimeInvisibleParameterAnnotations".equals(m98451H)) {
                        i17 = i20;
                        i8 = i21;
                        i9 = i2;
                        i10 = i3;
                        i4 = i17;
                    } else if ("MethodParameters".equals(m98451H)) {
                        i12 = i20;
                        i8 = i21;
                        i9 = i2;
                        i10 = i3;
                        i4 = i12;
                    } else {
                        i4 = i20;
                        C28821tp m98437j = m98437j(ka0.f19203a, m98451H, i20, m98427t, cArr, -1, null);
                        m98437j.f111062c = c28821tp;
                        c28821tp = m98437j;
                        i13 = i13;
                        i9 = i2;
                        i10 = i3;
                        i8 = i21;
                        i11 = i11;
                        i12 = i12;
                    }
                    i8 = i21;
                    i9 = i2;
                    i10 = i3;
                }
                i7 = i4 + m98427t;
                m98450I = i19;
            }
            i4 = i20;
            i7 = i4 + m98427t;
            m98450I = i19;
        }
        int i26 = i8;
        int i27 = i9;
        int i28 = i10;
        int i29 = i11;
        int i30 = i12;
        int i31 = i13;
        YT2 mo91624g = abstractC34736Nj0.mo91624g(ka0.f19206d, ka0.f19207e, ka0.f19208f, i31 == 0 ? null : m98448K(i31, cArr), strArr);
        if (mo91624g == null) {
            return i7;
        }
        if (mo91624g instanceof ZT2) {
            ZT2 zt2 = (ZT2) mo91624g;
            if (zt2.m73065G(this, z, (ka0.f19206d & DateUtils.FORMAT_NUMERIC_DATE) != 0, m98450I(i5), i31, i14)) {
                zt2.m73053S(i, i7 - i);
                return i7;
            }
        }
        if (i30 != 0 && (ka0.f19204b & 2) == 0) {
            int m98435l = m98435l(i30);
            int i32 = i30 + 1;
            while (true) {
                int i33 = m98435l - 1;
                if (m98435l <= 0) {
                    break;
                }
                mo91624g.mo73025x(m98451H(i32, cArr), m98450I(i32 + 2));
                i32 += 4;
                m98435l = i33;
            }
        }
        if (i29 != 0) {
            AbstractC3201Hf mo73046c = mo91624g.mo73046c();
            m98430q(mo73046c, i29, null, cArr);
            if (mo73046c != null) {
                mo73046c.mo101839d();
            }
        }
        if (i28 != 0) {
            int m98450I3 = m98450I(i28);
            int i34 = i28 + 2;
            while (true) {
                int i35 = m98450I3 - 1;
                if (m98450I3 <= 0) {
                    break;
                }
                i34 = m98429r(mo91624g.mo73047b(m98451H(i34, cArr), true), i34 + 2, true, cArr);
                m98450I3 = i35;
            }
        }
        if (i27 != 0) {
            int m98450I4 = m98450I(i27);
            int i36 = i27 + 2;
            while (true) {
                int i37 = m98450I4 - 1;
                if (m98450I4 <= 0) {
                    break;
                }
                i36 = m98429r(mo91624g.mo73047b(m98451H(i36, cArr), false), i36 + 2, true, cArr);
                m98450I4 = i37;
            }
        }
        if (i26 != 0) {
            int m98450I5 = m98450I(i26);
            int i38 = i26 + 2;
            while (true) {
                int i39 = m98450I5 - 1;
                if (m98450I5 <= 0) {
                    break;
                }
                int m98453F = m98453F(ka0, i38);
                i38 = m98429r(mo91624g.mo73069C(ka0.f19210h, ka0.f19211i, m98451H(m98453F, cArr), true), m98453F + 2, true, cArr);
                m98450I5 = i39;
            }
        }
        int i40 = i15;
        if (i40 != 0) {
            int m98450I6 = m98450I(i40);
            int i41 = i40 + 2;
            while (true) {
                int i42 = m98450I6 - 1;
                if (m98450I6 <= 0) {
                    break;
                }
                int m98453F2 = m98453F(ka0, i41);
                i41 = m98429r(mo91624g.mo73069C(ka0.f19210h, ka0.f19211i, m98451H(m98453F2, cArr), false), m98453F2 + 2, true, cArr);
                m98450I6 = i42;
            }
        }
        int i43 = i16;
        if (i43 != 0) {
            m98458A(mo91624g, ka0, i43, true);
        }
        int i44 = i17;
        if (i44 != 0) {
            m98458A(mo91624g, ka0, i44, false);
        }
        while (c28821tp != null) {
            C28821tp c28821tp2 = c28821tp.f111062c;
            c28821tp.f111062c = null;
            mo91624g.mo73045d(c28821tp);
            c28821tp = c28821tp2;
        }
        int i45 = i18;
        if (i45 != 0) {
            mo91624g.mo73044e();
            m98433n(mo91624g, ka0, i45);
        }
        mo91624g.mo73043f();
        return i7;
    }

    /* renamed from: x */
    public String m98423x(int i, char[] cArr) {
        return m98454E(i, cArr);
    }

    /* renamed from: y */
    public final void m98422y(AbstractC34736Nj0 abstractC34736Nj0, KA0 ka0, int i, int i2, String str) {
        String[] strArr;
        char[] cArr = ka0.f19205c;
        int i3 = i + 6;
        AbstractC49271tV2 mo91623h = abstractC34736Nj0.mo91623h(m98423x(i, cArr), m98450I(i + 2), m98451H(i + 4, cArr));
        if (mo91623h == null) {
            return;
        }
        if (str != null) {
            mo91623h.mo10219c(str);
        }
        if (i2 != 0) {
            int m98450I = m98450I(i2);
            int i4 = i2 + 2;
            while (true) {
                int i5 = m98450I - 1;
                if (m98450I <= 0) {
                    break;
                }
                mo91623h.mo10217e(m98421z(i4, cArr));
                i4 += 2;
                m98450I = i5;
            }
        }
        int m98450I2 = m98450I(i3);
        int i6 = i3 + 2;
        while (true) {
            int i7 = m98450I2 - 1;
            if (m98450I2 <= 0) {
                break;
            }
            i6 += 6;
            mo91623h.mo10215g(m98423x(i6, cArr), m98450I(i6 + 2), m98451H(i6 + 4, cArr));
            m98450I2 = i7;
        }
        int m98450I3 = m98450I(i6);
        int i8 = i6 + 2;
        while (true) {
            int i9 = m98450I3 - 1;
            String[] strArr2 = null;
            if (m98450I3 <= 0) {
                break;
            }
            String m98421z = m98421z(i8, cArr);
            int m98450I4 = m98450I(i8 + 2);
            int m98450I5 = m98450I(i8 + 4);
            i8 += 6;
            if (m98450I5 != 0) {
                strArr2 = new String[m98450I5];
                for (int i10 = 0; i10 < m98450I5; i10++) {
                    strArr2[i10] = m98423x(i8, cArr);
                    i8 += 2;
                }
            }
            mo91623h.mo10220b(m98421z, m98450I4, strArr2);
            m98450I3 = i9;
        }
        int m98450I6 = m98450I(i8);
        int i11 = i8 + 2;
        while (true) {
            int i12 = m98450I6 - 1;
            if (m98450I6 <= 0) {
                break;
            }
            String m98421z2 = m98421z(i11, cArr);
            int m98450I7 = m98450I(i11 + 2);
            int m98450I8 = m98450I(i11 + 4);
            i11 += 6;
            if (m98450I8 != 0) {
                strArr = new String[m98450I8];
                for (int i13 = 0; i13 < m98450I8; i13++) {
                    strArr[i13] = m98423x(i11, cArr);
                    i11 += 2;
                }
            } else {
                strArr = null;
            }
            mo91623h.mo10218d(m98421z2, m98450I7, strArr);
            m98450I6 = i12;
        }
        int m98450I9 = m98450I(i11);
        int i14 = i11 + 2;
        while (true) {
            int i15 = m98450I9 - 1;
            if (m98450I9 <= 0) {
                break;
            }
            mo91623h.mo10214h(m98434m(i14, cArr));
            i14 += 2;
            m98450I9 = i15;
        }
        int m98450I10 = m98450I(i14);
        int i16 = i14 + 2;
        while (true) {
            int i17 = m98450I10 - 1;
            if (m98450I10 > 0) {
                String m98434m = m98434m(i16, cArr);
                int m98450I11 = m98450I(i16 + 2);
                i16 += 4;
                String[] strArr3 = new String[m98450I11];
                for (int i18 = 0; i18 < m98450I11; i18++) {
                    strArr3[i18] = m98434m(i16, cArr);
                    i16 += 2;
                }
                mo91623h.mo10216f(m98434m, strArr3);
                m98450I10 = i17;
            } else {
                mo91623h.mo10221a();
                return;
            }
        }
    }

    /* renamed from: z */
    public String m98421z(int i, char[] cArr) {
        return m98454E(i, cArr);
    }
}
