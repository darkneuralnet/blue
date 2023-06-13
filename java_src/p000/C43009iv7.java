package p000;

import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqv;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;
/* renamed from: iv7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43009iv7<T> implements InterfaceC34851Nv7<T> {

    /* renamed from: q */
    public static final int[] f91716q = new int[0];

    /* renamed from: r */
    public static final Unsafe f91717r = C32286Cw7.m111241l();

    /* renamed from: a */
    public final int[] f91718a;

    /* renamed from: b */
    public final Object[] f91719b;

    /* renamed from: c */
    public final int f91720c;

    /* renamed from: d */
    public final int f91721d;

    /* renamed from: e */
    public final InterfaceC41230fv7 f91722e;

    /* renamed from: f */
    public final boolean f91723f;

    /* renamed from: g */
    public final boolean f91724g;

    /* renamed from: h */
    public final boolean f91725h;

    /* renamed from: i */
    public final int[] f91726i;

    /* renamed from: j */
    public final int f91727j;

    /* renamed from: k */
    public final int f91728k;

    /* renamed from: l */
    public final AbstractC36012Su7 f91729l;

    /* renamed from: m */
    public final AbstractC48948sw7 f91730m;

    /* renamed from: n */
    public final AbstractC31791At7 f91731n;

    /* renamed from: o */
    public final C32277Cv7 f91732o;

    /* renamed from: p */
    public final C38248av7 f91733p;

    public C43009iv7(int[] iArr, Object[] objArr, int i, int i2, InterfaceC41230fv7 interfaceC41230fv7, boolean z, boolean z2, int[] iArr2, int i3, int i4, C32277Cv7 c32277Cv7, AbstractC36012Su7 abstractC36012Su7, AbstractC48948sw7 abstractC48948sw7, AbstractC31791At7 abstractC31791At7, C38248av7 c38248av7, byte[] bArr) {
        this.f91718a = iArr;
        this.f91719b = objArr;
        this.f91720c = i;
        this.f91721d = i2;
        this.f91724g = interfaceC41230fv7 instanceof AbstractC40627eu7;
        this.f91725h = z;
        boolean z3 = false;
        if (abstractC31791At7 != null && abstractC31791At7.mo113387j(interfaceC41230fv7)) {
            z3 = true;
        }
        this.f91723f = z3;
        this.f91726i = iArr2;
        this.f91727j = i3;
        this.f91728k = i4;
        this.f91732o = c32277Cv7;
        this.f91729l = abstractC36012Su7;
        this.f91730m = abstractC48948sw7;
        this.f91731n = abstractC31791At7;
        this.f91722e = interfaceC41230fv7;
        this.f91733p = c38248av7;
    }

    /* renamed from: A */
    public static boolean m31642A(Object obj, int i, InterfaceC34851Nv7 interfaceC34851Nv7) {
        return interfaceC34851Nv7.mo29760d(C32286Cw7.m111242k(obj, i & 1048575));
    }

    /* renamed from: C */
    public static boolean m31640C(Object obj, long j) {
        return ((Boolean) C32286Cw7.m111242k(obj, j)).booleanValue();
    }

    /* renamed from: D */
    public static final int m31639D(byte[] bArr, int i, int i2, EnumC33690Iw7 enumC33690Iw7, Class cls, C32952Fs7 c32952Fs7) throws IOException {
        boolean z;
        EnumC33690Iw7 enumC33690Iw72 = EnumC33690Iw7.f16483d;
        switch (enumC33690Iw7.ordinal()) {
            case 0:
                c32952Fs7.f10392c = Double.valueOf(Double.longBitsToDouble(C33186Gs7.m104626o(bArr, i)));
                return i + 8;
            case 1:
                c32952Fs7.f10392c = Float.valueOf(Float.intBitsToFloat(C33186Gs7.m104639b(bArr, i)));
                return i + 4;
            case 2:
            case 3:
                int m104628m = C33186Gs7.m104628m(bArr, i, c32952Fs7);
                c32952Fs7.f10392c = Long.valueOf(c32952Fs7.f10391b);
                return m104628m;
            case 4:
            case 12:
            case 13:
                int m104631j = C33186Gs7.m104631j(bArr, i, c32952Fs7);
                c32952Fs7.f10392c = Integer.valueOf(c32952Fs7.f10390a);
                return m104631j;
            case 5:
            case 15:
                c32952Fs7.f10392c = Long.valueOf(C33186Gs7.m104626o(bArr, i));
                return i + 8;
            case 6:
            case 14:
                c32952Fs7.f10392c = Integer.valueOf(C33186Gs7.m104639b(bArr, i));
                return i + 4;
            case 7:
                int m104628m2 = C33186Gs7.m104628m(bArr, i, c32952Fs7);
                if (c32952Fs7.f10391b != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c32952Fs7.f10392c = Boolean.valueOf(z);
                return m104628m2;
            case 8:
                return C33186Gs7.m104633h(bArr, i, c32952Fs7);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return C33186Gs7.m104637d(C32979Fv7.m106247a().m106246b(cls), bArr, i, i2, c32952Fs7);
            case 11:
                return C33186Gs7.m104640a(bArr, i, c32952Fs7);
            case 16:
                int m104631j2 = C33186Gs7.m104631j(bArr, i, c32952Fs7);
                c32952Fs7.f10392c = Integer.valueOf(AbstractC46547ot7.m20347e(c32952Fs7.f10390a));
                return m104631j2;
            case 17:
                int m104628m3 = C33186Gs7.m104628m(bArr, i, c32952Fs7);
                c32952Fs7.f10392c = Long.valueOf(AbstractC46547ot7.m20346f(c32952Fs7.f10391b));
                return m104628m3;
        }
    }

    /* renamed from: E */
    public static final void m31638E(int i, Object obj, InterfaceC34158Kw7 interfaceC34158Kw7) throws IOException {
        if (obj instanceof String) {
            interfaceC34158Kw7.mo7813w(i, (String) obj);
        } else {
            interfaceC34158Kw7.mo7837K(i, (AbstractC44175kt7) obj);
        }
    }

    /* renamed from: G */
    public static C49541tw7 m31636G(Object obj) {
        AbstractC40627eu7 abstractC40627eu7 = (AbstractC40627eu7) obj;
        C49541tw7 c49541tw7 = abstractC40627eu7.zzc;
        if (c49541tw7 == C49541tw7.m11184c()) {
            C49541tw7 m11182e = C49541tw7.m11182e();
            abstractC40627eu7.zzc = m11182e;
            return m11182e;
        }
        return c49541tw7;
    }

    /* renamed from: H */
    public static C43009iv7 m31635H(Class cls, InterfaceC39452cv7 interfaceC39452cv7, C32277Cv7 c32277Cv7, AbstractC36012Su7 abstractC36012Su7, AbstractC48948sw7 abstractC48948sw7, AbstractC31791At7 abstractC31791At7, C38248av7 c38248av7) {
        if (interfaceC39452cv7 instanceof C33447Hv7) {
            return m31634I((C33447Hv7) interfaceC39452cv7, c32277Cv7, abstractC36012Su7, abstractC48948sw7, abstractC31791At7, c38248av7);
        }
        C37425Yv7 c37425Yv7 = (C37425Yv7) interfaceC39452cv7;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0384  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C43009iv7 m31634I(C33447Hv7 c33447Hv7, C32277Cv7 c32277Cv7, AbstractC36012Su7 abstractC36012Su7, AbstractC48948sw7 abstractC48948sw7, AbstractC31791At7 abstractC31791At7, C38248av7 c38248av7) {
        boolean z;
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int i8;
        char charAt6;
        int i9;
        char charAt7;
        int i10;
        char charAt8;
        int i11;
        char charAt9;
        int i12;
        char charAt10;
        int i13;
        char charAt11;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        int objectFieldOffset;
        Object[] objArr;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        Field m31613o;
        char charAt12;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field m31613o2;
        Object obj2;
        Field m31613o3;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        int i31;
        char charAt15;
        int i32;
        char charAt16;
        if (c33447Hv7.zzc() == 2) {
            z = true;
        } else {
            z = false;
        }
        String m103224a = c33447Hv7.m103224a();
        int length = m103224a.length();
        char c = 55296;
        if (m103224a.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (m103224a.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int charAt17 = m103224a.charAt(i);
        if (charAt17 >= 55296) {
            int i35 = charAt17 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                charAt16 = m103224a.charAt(i34);
                if (charAt16 < 55296) {
                    break;
                }
                i35 |= (charAt16 & 8191) << i36;
                i36 += 13;
                i34 = i32;
            }
            charAt17 = i35 | (charAt16 << i36);
            i34 = i32;
        }
        if (charAt17 == 0) {
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i4 = 0;
            charAt3 = 0;
            i2 = 0;
            iArr = f91716q;
            i3 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt18 = m103224a.charAt(i34);
            if (charAt18 >= 55296) {
                int i38 = charAt18 & 8191;
                int i39 = 13;
                while (true) {
                    i13 = i37 + 1;
                    charAt11 = m103224a.charAt(i37);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i38 |= (charAt11 & 8191) << i39;
                    i39 += 13;
                    i37 = i13;
                }
                charAt18 = i38 | (charAt11 << i39);
                i37 = i13;
            }
            int i40 = i37 + 1;
            int charAt19 = m103224a.charAt(i37);
            if (charAt19 >= 55296) {
                int i41 = charAt19 & 8191;
                int i42 = 13;
                while (true) {
                    i12 = i40 + 1;
                    charAt10 = m103224a.charAt(i40);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i41 |= (charAt10 & 8191) << i42;
                    i42 += 13;
                    i40 = i12;
                }
                charAt19 = i41 | (charAt10 << i42);
                i40 = i12;
            }
            int i43 = i40 + 1;
            charAt = m103224a.charAt(i40);
            if (charAt >= 55296) {
                int i44 = charAt & 8191;
                int i45 = 13;
                while (true) {
                    i11 = i43 + 1;
                    charAt9 = m103224a.charAt(i43);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i44 |= (charAt9 & 8191) << i45;
                    i45 += 13;
                    i43 = i11;
                }
                charAt = i44 | (charAt9 << i45);
                i43 = i11;
            }
            int i46 = i43 + 1;
            int charAt20 = m103224a.charAt(i43);
            if (charAt20 >= 55296) {
                int i47 = charAt20 & 8191;
                int i48 = 13;
                while (true) {
                    i10 = i46 + 1;
                    charAt8 = m103224a.charAt(i46);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i47 |= (charAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i10;
                }
                charAt20 = i47 | (charAt8 << i48);
                i46 = i10;
            }
            int i49 = i46 + 1;
            charAt2 = m103224a.charAt(i46);
            if (charAt2 >= 55296) {
                int i50 = charAt2 & 8191;
                int i51 = 13;
                while (true) {
                    i9 = i49 + 1;
                    charAt7 = m103224a.charAt(i49);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i50 |= (charAt7 & 8191) << i51;
                    i51 += 13;
                    i49 = i9;
                }
                charAt2 = i50 | (charAt7 << i51);
                i49 = i9;
            }
            int i52 = i49 + 1;
            int charAt21 = m103224a.charAt(i49);
            if (charAt21 >= 55296) {
                int i53 = charAt21 & 8191;
                int i54 = 13;
                while (true) {
                    i8 = i52 + 1;
                    charAt6 = m103224a.charAt(i52);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i53 |= (charAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i8;
                }
                charAt21 = i53 | (charAt6 << i54);
                i52 = i8;
            }
            int i55 = i52 + 1;
            int charAt22 = m103224a.charAt(i52);
            if (charAt22 >= 55296) {
                int i56 = charAt22 & 8191;
                int i57 = 13;
                while (true) {
                    i7 = i55 + 1;
                    charAt5 = m103224a.charAt(i55);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i56 |= (charAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i7;
                }
                charAt22 = i56 | (charAt5 << i57);
                i55 = i7;
            }
            int i58 = i55 + 1;
            charAt3 = m103224a.charAt(i55);
            if (charAt3 >= 55296) {
                int i59 = charAt3 & 8191;
                int i60 = 13;
                while (true) {
                    i6 = i58 + 1;
                    charAt4 = m103224a.charAt(i58);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i59 |= (charAt4 & 8191) << i60;
                    i60 += 13;
                    i58 = i6;
                }
                charAt3 = i59 | (charAt4 << i60);
                i58 = i6;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i2 = charAt18 + charAt18 + charAt19;
            i3 = charAt18;
            i34 = i58;
            int i61 = charAt21;
            i4 = charAt20;
            i5 = i61;
        }
        Unsafe unsafe = f91717r;
        Object[] m103223b = c33447Hv7.m103223b();
        Class<?> cls = c33447Hv7.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i62 = charAt3 + i5;
        int i63 = charAt3;
        int i64 = i62;
        int i65 = 0;
        int i66 = 0;
        while (i34 < length) {
            int i67 = i34 + 1;
            int charAt23 = m103224a.charAt(i34);
            if (charAt23 >= c) {
                int i68 = charAt23 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i31 = i69 + 1;
                    charAt15 = m103224a.charAt(i69);
                    if (charAt15 < c) {
                        break;
                    }
                    i68 |= (charAt15 & 8191) << i70;
                    i70 += 13;
                    i69 = i31;
                }
                charAt23 = i68 | (charAt15 << i70);
                i14 = i31;
            } else {
                i14 = i67;
            }
            int i71 = i14 + 1;
            int charAt24 = m103224a.charAt(i14);
            if (charAt24 >= c) {
                int i72 = charAt24 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i30 = i73 + 1;
                    charAt14 = m103224a.charAt(i73);
                    i15 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i72 |= (charAt14 & 8191) << i74;
                    i74 += 13;
                    i73 = i30;
                    length = i15;
                }
                charAt24 = i72 | (charAt14 << i74);
                i16 = i30;
            } else {
                i15 = length;
                i16 = i71;
            }
            int i75 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i76 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i66] = i65;
                i66++;
            }
            if (i75 >= 51) {
                int i77 = i16 + 1;
                int charAt25 = m103224a.charAt(i16);
                if (charAt25 >= 55296) {
                    int i78 = charAt25 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i29 = i79 + 1;
                        charAt13 = m103224a.charAt(i79);
                        i18 = i4;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i78 |= (charAt13 & 8191) << i80;
                        i80 += 13;
                        i79 = i29;
                        i4 = i18;
                    }
                    charAt25 = i78 | (charAt13 << i80);
                    i27 = i29;
                } else {
                    i18 = i4;
                    i27 = i77;
                }
                int i81 = i75 - 51;
                i22 = i27;
                if (i81 != 9 && i81 != 17) {
                    if (i81 == 12 && !z) {
                        int i82 = i65 / 3;
                        i28 = i2 + 1;
                        objArr2[i82 + i82 + 1] = m103223b[i2];
                    }
                    int i83 = charAt25 + charAt25;
                    obj = m103223b[i83];
                    if (!(obj instanceof Field)) {
                        m31613o2 = (Field) obj;
                    } else {
                        m31613o2 = m31613o(cls, (String) obj);
                        m103223b[i83] = m31613o2;
                    }
                    iArr2 = iArr3;
                    i17 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m31613o2);
                    int i84 = i83 + 1;
                    obj2 = m103223b[i84];
                    if (!(obj2 instanceof Field)) {
                        m31613o3 = (Field) obj2;
                    } else {
                        m31613o3 = m31613o(cls, (String) obj2);
                        m103223b[i84] = m31613o3;
                    }
                    str = m103224a;
                    i21 = (int) unsafe.objectFieldOffset(m31613o3);
                    objArr = objArr2;
                    objectFieldOffset = objectFieldOffset2;
                    i23 = 0;
                } else {
                    int i85 = i65 / 3;
                    i28 = i2 + 1;
                    objArr2[i85 + i85 + 1] = m103223b[i2];
                }
                i2 = i28;
                int i832 = charAt25 + charAt25;
                obj = m103223b[i832];
                if (!(obj instanceof Field)) {
                }
                iArr2 = iArr3;
                i17 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m31613o2);
                int i842 = i832 + 1;
                obj2 = m103223b[i842];
                if (!(obj2 instanceof Field)) {
                }
                str = m103224a;
                i21 = (int) unsafe.objectFieldOffset(m31613o3);
                objArr = objArr2;
                objectFieldOffset = objectFieldOffset22;
                i23 = 0;
            } else {
                iArr2 = iArr3;
                i17 = charAt;
                i18 = i4;
                int i86 = i2 + 1;
                Field m31613o4 = m31613o(cls, (String) m103223b[i2]);
                if (i75 != 9 && i75 != 17) {
                    if (i75 != 27 && i75 != 49) {
                        if (i75 != 12 && i75 != 30 && i75 != 44) {
                            if (i75 == 50) {
                                int i87 = i63 + 1;
                                iArr[i63] = i65;
                                int i88 = i65 / 3;
                                int i89 = i88 + i88;
                                int i90 = i86 + 1;
                                objArr2[i89] = m103223b[i86];
                                if ((charAt24 & 2048) != 0) {
                                    i86 = i90 + 1;
                                    objArr2[i89 + 1] = m103223b[i90];
                                    i63 = i87;
                                } else {
                                    i63 = i87;
                                    i19 = i90;
                                    objectFieldOffset = (int) unsafe.objectFieldOffset(m31613o4);
                                    objArr = objArr2;
                                    if ((charAt24 & 4096) != 4096 && i75 <= 17) {
                                        int i91 = i16 + 1;
                                        int charAt26 = m103224a.charAt(i16);
                                        if (charAt26 >= 55296) {
                                            int i92 = charAt26 & 8191;
                                            int i93 = 13;
                                            while (true) {
                                                i22 = i91 + 1;
                                                charAt12 = m103224a.charAt(i91);
                                                if (charAt12 < 55296) {
                                                    break;
                                                }
                                                i92 |= (charAt12 & 8191) << i93;
                                                i93 += 13;
                                                i91 = i22;
                                            }
                                            charAt26 = i92 | (charAt12 << i93);
                                        } else {
                                            i22 = i91;
                                        }
                                        int i94 = i3 + i3 + (charAt26 / 32);
                                        Object obj3 = m103223b[i94];
                                        str = m103224a;
                                        if (obj3 instanceof Field) {
                                            m31613o = (Field) obj3;
                                        } else {
                                            m31613o = m31613o(cls, (String) obj3);
                                            m103223b[i94] = m31613o;
                                        }
                                        i20 = i19;
                                        i21 = (int) unsafe.objectFieldOffset(m31613o);
                                        i23 = charAt26 % 32;
                                    } else {
                                        str = m103224a;
                                        i20 = i19;
                                        i21 = 1048575;
                                        i22 = i16;
                                        i23 = 0;
                                    }
                                    if (i75 < 18 && i75 <= 49) {
                                        iArr[i64] = objectFieldOffset;
                                        i2 = i20;
                                        i64++;
                                    } else {
                                        i2 = i20;
                                    }
                                }
                            }
                        } else if (!z) {
                            int i95 = i65 / 3;
                            i24 = i86 + 1;
                            objArr2[i95 + i95 + 1] = m103223b[i86];
                        }
                    } else {
                        int i96 = i65 / 3;
                        i24 = i86 + 1;
                        objArr2[i96 + i96 + 1] = m103223b[i86];
                    }
                    i19 = i24;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m31613o4);
                    objArr = objArr2;
                    if ((charAt24 & 4096) != 4096) {
                    }
                    str = m103224a;
                    i20 = i19;
                    i21 = 1048575;
                    i22 = i16;
                    i23 = 0;
                    if (i75 < 18) {
                    }
                    i2 = i20;
                } else {
                    int i97 = i65 / 3;
                    objArr2[i97 + i97 + 1] = m31613o4.getType();
                }
                i19 = i86;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m31613o4);
                objArr = objArr2;
                if ((charAt24 & 4096) != 4096) {
                }
                str = m103224a;
                i20 = i19;
                i21 = 1048575;
                i22 = i16;
                i23 = 0;
                if (i75 < 18) {
                }
                i2 = i20;
            }
            int i98 = i65 + 1;
            iArr2[i65] = charAt23;
            int i99 = i98 + 1;
            if ((charAt24 & 512) != 0) {
                i25 = 536870912;
            } else {
                i25 = 0;
            }
            if ((charAt24 & 256) != 0) {
                i26 = 268435456;
            } else {
                i26 = 0;
            }
            iArr2[i98] = i26 | i25 | (i75 << 20) | objectFieldOffset;
            i65 = i99 + 1;
            iArr2[i99] = (i23 << 20) | i21;
            charAt = i17;
            charAt3 = i76;
            i34 = i22;
            length = i15;
            objArr2 = objArr;
            m103224a = str;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new C43009iv7(iArr3, objArr2, charAt, i4, c33447Hv7.zza(), z, false, iArr, charAt3, i62, c32277Cv7, abstractC36012Su7, abstractC48948sw7, abstractC31791At7, c38248av7, null);
    }

    /* renamed from: J */
    public static double m31633J(Object obj, long j) {
        return ((Double) C32286Cw7.m111242k(obj, j)).doubleValue();
    }

    /* renamed from: K */
    public static float m31632K(Object obj, long j) {
        return ((Float) C32286Cw7.m111242k(obj, j)).floatValue();
    }

    /* renamed from: N */
    public static int m31629N(Object obj, long j) {
        return ((Integer) C32286Cw7.m111242k(obj, j)).intValue();
    }

    /* renamed from: c */
    public static int m31620c(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: j */
    public static long m31618j(Object obj, long j) {
        return ((Long) C32286Cw7.m111242k(obj, j)).longValue();
    }

    /* renamed from: o */
    public static Field m31613o(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: x */
    public static boolean m31604x(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: B */
    public final boolean m31641B(Object obj, int i, int i2) {
        if (C32286Cw7.m111245h(obj, m31622U(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x036a, code lost:
        if (r0 != r21) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x036c, code lost:
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r9 = r35;
        r1 = r18;
        r3 = r19;
        r5 = r21;
        r2 = r24;
        r6 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0386, code lost:
        r2 = r0;
        r7 = r18;
        r6 = r25;
        r0 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03b6, code lost:
        if (r0 != r15) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03db, code lost:
        if (r0 != r15) goto L205;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m31637F(Object obj, byte[] bArr, int i, int i2, int i3, C32952Fs7 c32952Fs7) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        C43009iv7<T> c43009iv7;
        byte b;
        int m31624S;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj3;
        C32952Fs7 c32952Fs72;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z;
        int m104633h;
        C43009iv7<T> c43009iv72 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i22 = i2;
        int i23 = i3;
        C32952Fs7 c32952Fs73 = c32952Fs7;
        Unsafe unsafe2 = f91717r;
        int i24 = i;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = -1;
        int i29 = 1048575;
        while (true) {
            if (i24 < i22) {
                int i30 = i24 + 1;
                byte b2 = bArr2[i24];
                if (b2 < 0) {
                    int m104630k = C33186Gs7.m104630k(b2, bArr2, i30, c32952Fs73);
                    b = c32952Fs73.f10390a;
                    i30 = m104630k;
                } else {
                    b = b2;
                }
                int i31 = b >>> 3;
                int i32 = b & 7;
                if (i31 > i28) {
                    m31624S = c43009iv72.m31623T(i31, i26 / 3);
                } else {
                    m31624S = c43009iv72.m31624S(i31);
                }
                if (m31624S == -1) {
                    i5 = i31;
                    i6 = i30;
                    i7 = b;
                    i8 = i27;
                    unsafe = unsafe2;
                    i9 = i23;
                    i10 = 0;
                } else {
                    int[] iArr = c43009iv72.f91718a;
                    int i33 = iArr[m31624S + 1];
                    int m31620c = m31620c(i33);
                    int i34 = i30;
                    long j = i33 & 1048575;
                    if (m31620c <= 17) {
                        int i35 = iArr[m31624S + 2];
                        int i36 = 1 << (i35 >>> 20);
                        int i37 = i35 & 1048575;
                        if (i37 != i29) {
                            i12 = b;
                            if (i29 != 1048575) {
                                unsafe2.putInt(obj4, i29, i27);
                            }
                            i27 = unsafe2.getInt(obj4, i37);
                            i13 = i37;
                        } else {
                            i12 = b;
                            i13 = i29;
                        }
                        int i38 = i27;
                        switch (m31620c) {
                            case 0:
                                i16 = m31624S;
                                i17 = i31;
                                i18 = i34;
                                if (i32 == 1) {
                                    C32286Cw7.m111233t(obj4, j, Double.longBitsToDouble(C33186Gs7.m104626o(bArr2, i18)));
                                    i24 = i18 + 8;
                                    i27 = i38 | i36;
                                    i28 = i17;
                                    i23 = i3;
                                    i26 = i16;
                                    i25 = i12;
                                    break;
                                } else {
                                    i5 = i17;
                                    i9 = i3;
                                    i8 = i38;
                                    unsafe = unsafe2;
                                    i6 = i18;
                                    i10 = i16;
                                    i7 = i12;
                                    i29 = i13;
                                    break;
                                }
                            case 1:
                                i16 = m31624S;
                                i17 = i31;
                                i18 = i34;
                                if (i32 == 5) {
                                    C32286Cw7.m111232u(obj4, j, Float.intBitsToFloat(C33186Gs7.m104639b(bArr2, i18)));
                                    i24 = i18 + 4;
                                    i27 = i38 | i36;
                                    i28 = i17;
                                    i23 = i3;
                                    i26 = i16;
                                    i25 = i12;
                                    break;
                                } else {
                                    i5 = i17;
                                    i9 = i3;
                                    i8 = i38;
                                    unsafe = unsafe2;
                                    i6 = i18;
                                    i10 = i16;
                                    i7 = i12;
                                    i29 = i13;
                                    break;
                                }
                            case 2:
                            case 3:
                                i16 = m31624S;
                                i17 = i31;
                                i18 = i34;
                                if (i32 == 0) {
                                    int m104628m = C33186Gs7.m104628m(bArr2, i18, c32952Fs73);
                                    unsafe2.putLong(obj, j, c32952Fs73.f10391b);
                                    i27 = i38 | i36;
                                    i28 = i17;
                                    i23 = i3;
                                    i24 = m104628m;
                                    i26 = i16;
                                    i25 = i12;
                                    break;
                                } else {
                                    i5 = i17;
                                    i9 = i3;
                                    i8 = i38;
                                    unsafe = unsafe2;
                                    i6 = i18;
                                    i10 = i16;
                                    i7 = i12;
                                    i29 = i13;
                                    break;
                                }
                            case 4:
                            case 11:
                                i16 = m31624S;
                                i17 = i31;
                                i18 = i34;
                                if (i32 == 0) {
                                    i24 = C33186Gs7.m104631j(bArr2, i18, c32952Fs73);
                                    unsafe2.putInt(obj4, j, c32952Fs73.f10390a);
                                    i27 = i38 | i36;
                                    i28 = i17;
                                    i23 = i3;
                                    i26 = i16;
                                    i25 = i12;
                                    break;
                                } else {
                                    i5 = i17;
                                    i9 = i3;
                                    i8 = i38;
                                    unsafe = unsafe2;
                                    i6 = i18;
                                    i10 = i16;
                                    i7 = i12;
                                    i29 = i13;
                                    break;
                                }
                            case 5:
                            case 14:
                                i19 = m31624S;
                                i20 = i12;
                                i17 = i31;
                                i21 = i34;
                                if (i32 == 1) {
                                    i16 = i19;
                                    i12 = i20;
                                    i18 = i21;
                                    unsafe2.putLong(obj, j, C33186Gs7.m104626o(bArr2, i21));
                                    i24 = i18 + 8;
                                    i27 = i38 | i36;
                                    i28 = i17;
                                    i23 = i3;
                                    i26 = i16;
                                    i25 = i12;
                                    break;
                                } else {
                                    i16 = i19;
                                    i12 = i20;
                                    i18 = i21;
                                    i5 = i17;
                                    i9 = i3;
                                    i8 = i38;
                                    unsafe = unsafe2;
                                    i6 = i18;
                                    i10 = i16;
                                    i7 = i12;
                                    i29 = i13;
                                    break;
                                }
                            case 6:
                            case 13:
                                i19 = m31624S;
                                i20 = i12;
                                i17 = i31;
                                i21 = i34;
                                if (i32 == 5) {
                                    unsafe2.putInt(obj4, j, C33186Gs7.m104639b(bArr2, i21));
                                    i24 = i21 + 4;
                                    i27 = i38 | i36;
                                    i28 = i17;
                                    i26 = i19;
                                    i25 = i20;
                                    i29 = i13;
                                    i23 = i3;
                                    break;
                                } else {
                                    i16 = i19;
                                    i12 = i20;
                                    i18 = i21;
                                    i5 = i17;
                                    i9 = i3;
                                    i8 = i38;
                                    unsafe = unsafe2;
                                    i6 = i18;
                                    i10 = i16;
                                    i7 = i12;
                                    i29 = i13;
                                    break;
                                }
                            case 7:
                                i19 = m31624S;
                                i20 = i12;
                                i17 = i31;
                                i21 = i34;
                                if (i32 == 0) {
                                    i24 = C33186Gs7.m104628m(bArr2, i21, c32952Fs73);
                                    if (c32952Fs73.f10391b != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    C32286Cw7.m111235r(obj4, j, z);
                                    i27 = i38 | i36;
                                    i28 = i17;
                                    i26 = i19;
                                    i25 = i20;
                                    i29 = i13;
                                    i23 = i3;
                                    break;
                                } else {
                                    i16 = i19;
                                    i12 = i20;
                                    i18 = i21;
                                    i5 = i17;
                                    i9 = i3;
                                    i8 = i38;
                                    unsafe = unsafe2;
                                    i6 = i18;
                                    i10 = i16;
                                    i7 = i12;
                                    i29 = i13;
                                    break;
                                }
                            case 8:
                                i19 = m31624S;
                                i20 = i12;
                                i17 = i31;
                                i21 = i34;
                                if (i32 == 2) {
                                    if ((536870912 & i33) == 0) {
                                        m104633h = C33186Gs7.m104634g(bArr2, i21, c32952Fs73);
                                    } else {
                                        m104633h = C33186Gs7.m104633h(bArr2, i21, c32952Fs73);
                                    }
                                    unsafe2.putObject(obj4, j, c32952Fs73.f10392c);
                                    i27 = i38 | i36;
                                    i24 = m104633h;
                                    i26 = i19;
                                    i25 = i20;
                                    i29 = i13;
                                    i28 = i17;
                                    i23 = i3;
                                    break;
                                } else {
                                    i16 = i19;
                                    i12 = i20;
                                    i18 = i21;
                                    i5 = i17;
                                    i9 = i3;
                                    i8 = i38;
                                    unsafe = unsafe2;
                                    i6 = i18;
                                    i10 = i16;
                                    i7 = i12;
                                    i29 = i13;
                                    break;
                                }
                            case 9:
                                i19 = m31624S;
                                i20 = i12;
                                i17 = i31;
                                i21 = i34;
                                if (i32 == 2) {
                                    m104633h = C33186Gs7.m104637d(c43009iv72.m31616l(i19), bArr2, i21, i22, c32952Fs73);
                                    if ((i38 & i36) == 0) {
                                        unsafe2.putObject(obj4, j, c32952Fs73.f10392c);
                                    } else {
                                        unsafe2.putObject(obj4, j, C46557ou7.m20291g(unsafe2.getObject(obj4, j), c32952Fs73.f10392c));
                                    }
                                    i27 = i38 | i36;
                                    i24 = m104633h;
                                    i26 = i19;
                                    i25 = i20;
                                    i29 = i13;
                                    i28 = i17;
                                    i23 = i3;
                                    break;
                                } else {
                                    i16 = i19;
                                    i12 = i20;
                                    i18 = i21;
                                    i5 = i17;
                                    i9 = i3;
                                    i8 = i38;
                                    unsafe = unsafe2;
                                    i6 = i18;
                                    i10 = i16;
                                    i7 = i12;
                                    i29 = i13;
                                    break;
                                }
                            case 10:
                                i19 = m31624S;
                                i20 = i12;
                                i17 = i31;
                                i21 = i34;
                                if (i32 == 2) {
                                    m104633h = C33186Gs7.m104640a(bArr2, i21, c32952Fs73);
                                    unsafe2.putObject(obj4, j, c32952Fs73.f10392c);
                                    i27 = i38 | i36;
                                    i24 = m104633h;
                                    i26 = i19;
                                    i25 = i20;
                                    i29 = i13;
                                    i28 = i17;
                                    i23 = i3;
                                    break;
                                } else {
                                    i16 = i19;
                                    i12 = i20;
                                    i18 = i21;
                                    i5 = i17;
                                    i9 = i3;
                                    i8 = i38;
                                    unsafe = unsafe2;
                                    i6 = i18;
                                    i10 = i16;
                                    i7 = i12;
                                    i29 = i13;
                                    break;
                                }
                            case 12:
                                i19 = m31624S;
                                i20 = i12;
                                i17 = i31;
                                i21 = i34;
                                if (i32 == 0) {
                                    m104633h = C33186Gs7.m104631j(bArr2, i21, c32952Fs73);
                                    int i39 = c32952Fs73.f10390a;
                                    InterfaceC42999iu7 m31617k = c43009iv72.m31617k(i19);
                                    if (m31617k != null && !m31617k.zza(i39)) {
                                        m31636G(obj).m11179h(i20, Long.valueOf(i39));
                                        i24 = m104633h;
                                        i26 = i19;
                                        i27 = i38;
                                        i25 = i20;
                                        i29 = i13;
                                        i28 = i17;
                                        i23 = i3;
                                    } else {
                                        unsafe2.putInt(obj4, j, i39);
                                        i27 = i38 | i36;
                                        i24 = m104633h;
                                        i26 = i19;
                                        i25 = i20;
                                        i29 = i13;
                                        i28 = i17;
                                        i23 = i3;
                                        break;
                                    }
                                } else {
                                    i16 = i19;
                                    i12 = i20;
                                    i18 = i21;
                                    i5 = i17;
                                    i9 = i3;
                                    i8 = i38;
                                    unsafe = unsafe2;
                                    i6 = i18;
                                    i10 = i16;
                                    i7 = i12;
                                    i29 = i13;
                                    break;
                                }
                                break;
                            case 15:
                                i19 = m31624S;
                                i20 = i12;
                                i17 = i31;
                                i21 = i34;
                                if (i32 == 0) {
                                    i24 = C33186Gs7.m104631j(bArr2, i21, c32952Fs73);
                                    unsafe2.putInt(obj4, j, AbstractC46547ot7.m20347e(c32952Fs73.f10390a));
                                    i27 = i38 | i36;
                                    i28 = i17;
                                    i26 = i19;
                                    i25 = i20;
                                    i29 = i13;
                                    i23 = i3;
                                    break;
                                } else {
                                    i16 = i19;
                                    i12 = i20;
                                    i18 = i21;
                                    i5 = i17;
                                    i9 = i3;
                                    i8 = i38;
                                    unsafe = unsafe2;
                                    i6 = i18;
                                    i10 = i16;
                                    i7 = i12;
                                    i29 = i13;
                                    break;
                                }
                            case 16:
                                if (i32 == 0) {
                                    int m104628m2 = C33186Gs7.m104628m(bArr2, i34, c32952Fs73);
                                    int i40 = m31624S;
                                    i20 = i12;
                                    unsafe2.putLong(obj, j, AbstractC46547ot7.m20346f(c32952Fs73.f10391b));
                                    i27 = i38 | i36;
                                    i28 = i31;
                                    i24 = m104628m2;
                                    i26 = i40;
                                    i25 = i20;
                                    i29 = i13;
                                    i23 = i3;
                                    break;
                                } else {
                                    i17 = i31;
                                    i16 = m31624S;
                                    i18 = i34;
                                    i5 = i17;
                                    i9 = i3;
                                    i8 = i38;
                                    unsafe = unsafe2;
                                    i6 = i18;
                                    i10 = i16;
                                    i7 = i12;
                                    i29 = i13;
                                    break;
                                }
                            default:
                                i16 = m31624S;
                                i17 = i31;
                                i18 = i34;
                                if (i32 == 3) {
                                    i24 = C33186Gs7.m104638c(c43009iv72.m31616l(i16), bArr, i18, i2, (i17 << 3) | 4, c32952Fs7);
                                    if ((i38 & i36) == 0) {
                                        unsafe2.putObject(obj4, j, c32952Fs73.f10392c);
                                    } else {
                                        unsafe2.putObject(obj4, j, C46557ou7.m20291g(unsafe2.getObject(obj4, j), c32952Fs73.f10392c));
                                    }
                                    i27 = i38 | i36;
                                    i28 = i17;
                                    i23 = i3;
                                    i26 = i16;
                                    i25 = i12;
                                    break;
                                } else {
                                    i5 = i17;
                                    i9 = i3;
                                    i8 = i38;
                                    unsafe = unsafe2;
                                    i6 = i18;
                                    i10 = i16;
                                    i7 = i12;
                                    i29 = i13;
                                    break;
                                }
                        }
                        i29 = i13;
                        i22 = i2;
                    } else {
                        int i41 = m31624S;
                        i12 = b;
                        if (m31620c == 27) {
                            if (i32 == 2) {
                                InterfaceC45964nu7 interfaceC45964nu7 = (InterfaceC45964nu7) unsafe2.getObject(obj4, j);
                                if (!interfaceC45964nu7.zzc()) {
                                    int size = interfaceC45964nu7.size();
                                    if (size == 0) {
                                        i15 = 10;
                                    } else {
                                        i15 = size + size;
                                    }
                                    interfaceC45964nu7 = interfaceC45964nu7.mo6153d(i15);
                                    unsafe2.putObject(obj4, j, interfaceC45964nu7);
                                }
                                i25 = i12;
                                i13 = i29;
                                i24 = C33186Gs7.m104636e(c43009iv72.m31616l(i41), i25, bArr, i34, i2, interfaceC45964nu7, c32952Fs7);
                                i23 = i3;
                                i28 = i31;
                                i26 = i41;
                                i27 = i27;
                                i29 = i13;
                                i22 = i2;
                            } else {
                                i8 = i27;
                                i13 = i29;
                                i5 = i31;
                                unsafe = unsafe2;
                                i14 = i34;
                                i10 = i41;
                            }
                        } else {
                            i8 = i27;
                            i13 = i29;
                            if (m31620c <= 49) {
                                i5 = i31;
                                unsafe = unsafe2;
                                i10 = i41;
                                i24 = m31625R(obj, bArr, i34, i2, i12, i5, i32, i41, i33, m31620c, j, c32952Fs7);
                            } else {
                                i5 = i31;
                                unsafe = unsafe2;
                                i14 = i34;
                                i10 = i41;
                                if (m31620c == 50) {
                                    if (i32 == 2) {
                                        i24 = m31628O(obj, bArr, i14, i2, i10, j, c32952Fs7);
                                    }
                                } else {
                                    i24 = m31627P(obj, bArr, i14, i2, i12, i5, i32, i33, m31620c, j, i10, c32952Fs7);
                                }
                            }
                        }
                        i9 = i3;
                        i6 = i14;
                        i7 = i12;
                        i29 = i13;
                    }
                }
                if (i7 == i9 && i9 != 0) {
                    c43009iv7 = this;
                    obj2 = obj;
                    i4 = i9;
                    i24 = i6;
                    i25 = i7;
                    i27 = i8;
                } else {
                    int i42 = i9;
                    if (this.f91723f) {
                        c32952Fs72 = c32952Fs7;
                        if (c32952Fs72.f10393d != C53068zt7.m154a()) {
                            i11 = i5;
                            if (c32952Fs72.f10393d.m152c(this.f91722e, i11) == null) {
                                i24 = C33186Gs7.m104632i(i7, bArr, i6, i2, m31636G(obj), c32952Fs7);
                                obj3 = obj;
                                i22 = i2;
                                i25 = i7;
                                c43009iv72 = this;
                                i28 = i11;
                                obj4 = obj3;
                                i26 = i10;
                                i27 = i8;
                                bArr2 = bArr;
                                i23 = i42;
                                c32952Fs73 = c32952Fs72;
                                unsafe2 = unsafe;
                            } else {
                                ((AbstractC38831bu7) obj).m62161D();
                                throw null;
                            }
                        } else {
                            obj3 = obj;
                        }
                    } else {
                        obj3 = obj;
                        c32952Fs72 = c32952Fs7;
                    }
                    i11 = i5;
                    i24 = C33186Gs7.m104632i(i7, bArr, i6, i2, m31636G(obj), c32952Fs7);
                    i22 = i2;
                    i25 = i7;
                    c43009iv72 = this;
                    i28 = i11;
                    obj4 = obj3;
                    i26 = i10;
                    i27 = i8;
                    bArr2 = bArr;
                    i23 = i42;
                    c32952Fs73 = c32952Fs72;
                    unsafe2 = unsafe;
                }
            } else {
                unsafe = unsafe2;
                i4 = i23;
                obj2 = obj4;
                c43009iv7 = c43009iv72;
            }
        }
        if (i29 != 1048575) {
            unsafe.putInt(obj2, i29, i27);
        }
        Object obj5 = null;
        for (int i43 = c43009iv7.f91727j; i43 < c43009iv7.f91728k; i43++) {
            obj5 = c43009iv7.m31615m(obj2, c43009iv7.f91726i[i43], obj5, c43009iv7.f91730m);
        }
        if (obj5 != null) {
            c43009iv7.f91730m.mo9459n(obj2, obj5);
        }
        if (i4 == 0) {
            if (i24 != i2) {
                throw zzaqw.m51281g();
            }
        } else if (i24 > i2 || i25 != i4) {
            throw zzaqw.m51281g();
        }
        return i24;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: L */
    public final int m31631L(Object obj) {
        int i;
        int m9558m;
        int m9558m2;
        int m9558m3;
        int m9557n;
        int m9558m4;
        int m9565f;
        int m9558m5;
        int m9558m6;
        int mo28217e;
        int m9558m7;
        int i2;
        int m89399W;
        boolean z;
        int m89416F;
        int m89411K;
        int m9559l;
        int m9558m8;
        int i3;
        int m9558m9;
        int m9558m10;
        int m9558m11;
        int m9557n2;
        int m9558m12;
        int mo28217e2;
        int m9558m13;
        int i4;
        Unsafe unsafe = f91717r;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < this.f91718a.length) {
            int m31619i = m31619i(i7);
            int[] iArr = this.f91718a;
            int i10 = iArr[i7];
            int m31620c = m31620c(m31619i);
            if (m31620c <= 17) {
                int i11 = iArr[i7 + 2];
                int i12 = i11 & i5;
                i = 1 << (i11 >>> 20);
                if (i12 != i6) {
                    i9 = unsafe.getInt(obj, i12);
                    i6 = i12;
                }
            } else {
                i = 0;
            }
            long j = m31619i & i5;
            switch (m31620c) {
                case 0:
                    if ((i9 & i) != 0) {
                        m9558m = AbstractC50104ut7.m9558m(i10 << 3);
                        m9558m5 = m9558m + 8;
                        i8 += m9558m5;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i9 & i) != 0) {
                        m9558m2 = AbstractC50104ut7.m9558m(i10 << 3);
                        m9558m5 = m9558m2 + 4;
                        i8 += m9558m5;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i9 & i) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        m9558m3 = AbstractC50104ut7.m9558m(i10 << 3);
                        m9557n = AbstractC50104ut7.m9557n(j2);
                        i8 += m9558m3 + m9557n;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i9 & i) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        m9558m3 = AbstractC50104ut7.m9558m(i10 << 3);
                        m9557n = AbstractC50104ut7.m9557n(j3);
                        i8 += m9558m3 + m9557n;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i9 & i) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        m9558m4 = AbstractC50104ut7.m9558m(i10 << 3);
                        m9565f = AbstractC50104ut7.m9565f(i13);
                        i2 = m9558m4 + m9565f;
                        i8 += i2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i9 & i) != 0) {
                        m9558m = AbstractC50104ut7.m9558m(i10 << 3);
                        m9558m5 = m9558m + 8;
                        i8 += m9558m5;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i9 & i) != 0) {
                        m9558m2 = AbstractC50104ut7.m9558m(i10 << 3);
                        m9558m5 = m9558m2 + 4;
                        i8 += m9558m5;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i9 & i) != 0) {
                        m9558m5 = AbstractC50104ut7.m9558m(i10 << 3) + 1;
                        i8 += m9558m5;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof AbstractC44175kt7) {
                            m9558m6 = AbstractC50104ut7.m9558m(i10 << 3);
                            mo28217e = ((AbstractC44175kt7) object).mo28217e();
                            m9558m7 = AbstractC50104ut7.m9558m(mo28217e);
                            i2 = m9558m6 + m9558m7 + mo28217e;
                            i8 += i2;
                            break;
                        } else {
                            m9558m4 = AbstractC50104ut7.m9558m(i10 << 3);
                            m9565f = AbstractC50104ut7.m9560k((String) object);
                            i2 = m9558m4 + m9565f;
                            i8 += i2;
                        }
                    }
                case 9:
                    if ((i9 & i) != 0) {
                        m9558m5 = C35319Pv7.m89405Q(i10, unsafe.getObject(obj, j), m31616l(i7));
                        i8 += m9558m5;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i9 & i) != 0) {
                        m9558m6 = AbstractC50104ut7.m9558m(i10 << 3);
                        mo28217e = ((AbstractC44175kt7) unsafe.getObject(obj, j)).mo28217e();
                        m9558m7 = AbstractC50104ut7.m9558m(mo28217e);
                        i2 = m9558m6 + m9558m7 + mo28217e;
                        i8 += i2;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i9 & i) != 0) {
                        int i14 = unsafe.getInt(obj, j);
                        m9558m4 = AbstractC50104ut7.m9558m(i10 << 3);
                        m9565f = AbstractC50104ut7.m9558m(i14);
                        i2 = m9558m4 + m9565f;
                        i8 += i2;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i9 & i) != 0) {
                        int i15 = unsafe.getInt(obj, j);
                        m9558m4 = AbstractC50104ut7.m9558m(i10 << 3);
                        m9565f = AbstractC50104ut7.m9565f(i15);
                        i2 = m9558m4 + m9565f;
                        i8 += i2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i9 & i) != 0) {
                        m9558m2 = AbstractC50104ut7.m9558m(i10 << 3);
                        m9558m5 = m9558m2 + 4;
                        i8 += m9558m5;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i9 & i) != 0) {
                        m9558m = AbstractC50104ut7.m9558m(i10 << 3);
                        m9558m5 = m9558m + 8;
                        i8 += m9558m5;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i9 & i) != 0) {
                        int i16 = unsafe.getInt(obj, j);
                        m9558m4 = AbstractC50104ut7.m9558m(i10 << 3);
                        m9565f = AbstractC50104ut7.m9558m((i16 >> 31) ^ (i16 + i16));
                        i2 = m9558m4 + m9565f;
                        i8 += i2;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i & i9) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        i8 += AbstractC50104ut7.m9558m(i10 << 3) + AbstractC50104ut7.m9557n((j4 >> 63) ^ (j4 + j4));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i9 & i) != 0) {
                        m9558m5 = AbstractC50104ut7.m9567d(i10, (InterfaceC41230fv7) unsafe.getObject(obj, j), m31616l(i7));
                        i8 += m9558m5;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m9558m5 = C35319Pv7.m89412J(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m9558m5;
                    break;
                case 19:
                    m9558m5 = C35319Pv7.m89414H(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m9558m5;
                    break;
                case 20:
                    m9558m5 = C35319Pv7.m89407O(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m9558m5;
                    break;
                case 21:
                    m9558m5 = C35319Pv7.m89396Z(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m9558m5;
                    break;
                case 22:
                    m9558m5 = C35319Pv7.m89409M(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m9558m5;
                    break;
                case 23:
                    m9558m5 = C35319Pv7.m89412J(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m9558m5;
                    break;
                case 24:
                    m9558m5 = C35319Pv7.m89414H(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m9558m5;
                    break;
                case 25:
                    m9558m5 = C35319Pv7.m89421A(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m9558m5;
                    break;
                case 26:
                    m89399W = C35319Pv7.m89399W(i10, (List) unsafe.getObject(obj, j));
                    i8 += m89399W;
                    break;
                case 27:
                    m89399W = C35319Pv7.m89404R(i10, (List) unsafe.getObject(obj, j), m31616l(i7));
                    i8 += m89399W;
                    break;
                case 28:
                    m89399W = C35319Pv7.m89417E(i10, (List) unsafe.getObject(obj, j));
                    i8 += m89399W;
                    break;
                case 29:
                    m89399W = C35319Pv7.m89398X(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m89399W;
                    break;
                case 30:
                    z = false;
                    m89416F = C35319Pv7.m89416F(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m89416F;
                    break;
                case 31:
                    z = false;
                    m89416F = C35319Pv7.m89414H(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m89416F;
                    break;
                case 32:
                    z = false;
                    m89416F = C35319Pv7.m89412J(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m89416F;
                    break;
                case 33:
                    z = false;
                    m89416F = C35319Pv7.m89403S(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m89416F;
                    break;
                case 34:
                    z = false;
                    m89416F = C35319Pv7.m89401U(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m89416F;
                    break;
                case 35:
                    m89411K = C35319Pv7.m89411K((List) unsafe.getObject(obj, j));
                    if (m89411K > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i10);
                        m9558m8 = AbstractC50104ut7.m9558m(m89411K);
                        i3 = m9559l + m9558m8;
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 36:
                    m89411K = C35319Pv7.m89413I((List) unsafe.getObject(obj, j));
                    if (m89411K > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i10);
                        m9558m8 = AbstractC50104ut7.m9558m(m89411K);
                        i3 = m9559l + m9558m8;
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 37:
                    m89411K = C35319Pv7.m89406P((List) unsafe.getObject(obj, j));
                    if (m89411K > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i10);
                        m9558m8 = AbstractC50104ut7.m9558m(m89411K);
                        i3 = m9559l + m9558m8;
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 38:
                    m89411K = C35319Pv7.m89394a0((List) unsafe.getObject(obj, j));
                    if (m89411K > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i10);
                        m9558m8 = AbstractC50104ut7.m9558m(m89411K);
                        i3 = m9559l + m9558m8;
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 39:
                    m89411K = C35319Pv7.m89408N((List) unsafe.getObject(obj, j));
                    if (m89411K > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i10);
                        m9558m8 = AbstractC50104ut7.m9558m(m89411K);
                        i3 = m9559l + m9558m8;
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 40:
                    m89411K = C35319Pv7.m89411K((List) unsafe.getObject(obj, j));
                    if (m89411K > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i10);
                        m9558m8 = AbstractC50104ut7.m9558m(m89411K);
                        i3 = m9559l + m9558m8;
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 41:
                    m89411K = C35319Pv7.m89413I((List) unsafe.getObject(obj, j));
                    if (m89411K > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i10);
                        m9558m8 = AbstractC50104ut7.m9558m(m89411K);
                        i3 = m9559l + m9558m8;
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 42:
                    m89411K = C35319Pv7.m89418D((List) unsafe.getObject(obj, j));
                    if (m89411K > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i10);
                        m9558m8 = AbstractC50104ut7.m9558m(m89411K);
                        i3 = m9559l + m9558m8;
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 43:
                    m89411K = C35319Pv7.m89397Y((List) unsafe.getObject(obj, j));
                    if (m89411K > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i10);
                        m9558m8 = AbstractC50104ut7.m9558m(m89411K);
                        i3 = m9559l + m9558m8;
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 44:
                    m89411K = C35319Pv7.m89415G((List) unsafe.getObject(obj, j));
                    if (m89411K > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i10);
                        m9558m8 = AbstractC50104ut7.m9558m(m89411K);
                        i3 = m9559l + m9558m8;
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 45:
                    m89411K = C35319Pv7.m89413I((List) unsafe.getObject(obj, j));
                    if (m89411K > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i10);
                        m9558m8 = AbstractC50104ut7.m9558m(m89411K);
                        i3 = m9559l + m9558m8;
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 46:
                    m89411K = C35319Pv7.m89411K((List) unsafe.getObject(obj, j));
                    if (m89411K > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i10);
                        m9558m8 = AbstractC50104ut7.m9558m(m89411K);
                        i3 = m9559l + m9558m8;
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 47:
                    m89411K = C35319Pv7.m89402T((List) unsafe.getObject(obj, j));
                    if (m89411K > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i10);
                        m9558m8 = AbstractC50104ut7.m9558m(m89411K);
                        i3 = m9559l + m9558m8;
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 48:
                    m89411K = C35319Pv7.m89400V((List) unsafe.getObject(obj, j));
                    if (m89411K > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i10);
                        m9558m8 = AbstractC50104ut7.m9558m(m89411K);
                        i3 = m9559l + m9558m8;
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 49:
                    m89399W = C35319Pv7.m89410L(i10, (List) unsafe.getObject(obj, j), m31616l(i7));
                    i8 += m89399W;
                    break;
                case 50:
                    m89399W = C38248av7.m65250a(i10, unsafe.getObject(obj, j), m31614n(i7));
                    i8 += m89399W;
                    break;
                case 51:
                    if (m31641B(obj, i10, i7)) {
                        m9558m9 = AbstractC50104ut7.m9558m(i10 << 3);
                        m89399W = m9558m9 + 8;
                        i8 += m89399W;
                    }
                    break;
                case 52:
                    if (m31641B(obj, i10, i7)) {
                        m9558m10 = AbstractC50104ut7.m9558m(i10 << 3);
                        m89399W = m9558m10 + 4;
                        i8 += m89399W;
                    }
                    break;
                case 53:
                    if (m31641B(obj, i10, i7)) {
                        long m31618j = m31618j(obj, j);
                        m9558m11 = AbstractC50104ut7.m9558m(i10 << 3);
                        m9557n2 = AbstractC50104ut7.m9557n(m31618j);
                        i8 += m9558m11 + m9557n2;
                    }
                    break;
                case 54:
                    if (m31641B(obj, i10, i7)) {
                        long m31618j2 = m31618j(obj, j);
                        m9558m11 = AbstractC50104ut7.m9558m(i10 << 3);
                        m9557n2 = AbstractC50104ut7.m9557n(m31618j2);
                        i8 += m9558m11 + m9557n2;
                    }
                    break;
                case 55:
                    if (m31641B(obj, i10, i7)) {
                        int m31629N = m31629N(obj, j);
                        i3 = AbstractC50104ut7.m9558m(i10 << 3);
                        m89411K = AbstractC50104ut7.m9565f(m31629N);
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 56:
                    if (m31641B(obj, i10, i7)) {
                        m9558m9 = AbstractC50104ut7.m9558m(i10 << 3);
                        m89399W = m9558m9 + 8;
                        i8 += m89399W;
                    }
                    break;
                case 57:
                    if (m31641B(obj, i10, i7)) {
                        m9558m10 = AbstractC50104ut7.m9558m(i10 << 3);
                        m89399W = m9558m10 + 4;
                        i8 += m89399W;
                    }
                    break;
                case 58:
                    if (m31641B(obj, i10, i7)) {
                        m89399W = AbstractC50104ut7.m9558m(i10 << 3) + 1;
                        i8 += m89399W;
                    }
                    break;
                case 59:
                    if (m31641B(obj, i10, i7)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof AbstractC44175kt7) {
                            m9558m12 = AbstractC50104ut7.m9558m(i10 << 3);
                            mo28217e2 = ((AbstractC44175kt7) object2).mo28217e();
                            m9558m13 = AbstractC50104ut7.m9558m(mo28217e2);
                            i4 = m9558m12 + m9558m13 + mo28217e2;
                            i8 += i4;
                        } else {
                            i3 = AbstractC50104ut7.m9558m(i10 << 3);
                            m89411K = AbstractC50104ut7.m9560k((String) object2);
                            i4 = i3 + m89411K;
                            i8 += i4;
                        }
                    }
                    break;
                case 60:
                    if (m31641B(obj, i10, i7)) {
                        m89399W = C35319Pv7.m89405Q(i10, unsafe.getObject(obj, j), m31616l(i7));
                        i8 += m89399W;
                    }
                    break;
                case 61:
                    if (m31641B(obj, i10, i7)) {
                        m9558m12 = AbstractC50104ut7.m9558m(i10 << 3);
                        mo28217e2 = ((AbstractC44175kt7) unsafe.getObject(obj, j)).mo28217e();
                        m9558m13 = AbstractC50104ut7.m9558m(mo28217e2);
                        i4 = m9558m12 + m9558m13 + mo28217e2;
                        i8 += i4;
                    }
                    break;
                case 62:
                    if (m31641B(obj, i10, i7)) {
                        int m31629N2 = m31629N(obj, j);
                        i3 = AbstractC50104ut7.m9558m(i10 << 3);
                        m89411K = AbstractC50104ut7.m9558m(m31629N2);
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 63:
                    if (m31641B(obj, i10, i7)) {
                        int m31629N3 = m31629N(obj, j);
                        i3 = AbstractC50104ut7.m9558m(i10 << 3);
                        m89411K = AbstractC50104ut7.m9565f(m31629N3);
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 64:
                    if (m31641B(obj, i10, i7)) {
                        m9558m10 = AbstractC50104ut7.m9558m(i10 << 3);
                        m89399W = m9558m10 + 4;
                        i8 += m89399W;
                    }
                    break;
                case 65:
                    if (m31641B(obj, i10, i7)) {
                        m9558m9 = AbstractC50104ut7.m9558m(i10 << 3);
                        m89399W = m9558m9 + 8;
                        i8 += m89399W;
                    }
                    break;
                case 66:
                    if (m31641B(obj, i10, i7)) {
                        int m31629N4 = m31629N(obj, j);
                        i3 = AbstractC50104ut7.m9558m(i10 << 3);
                        m89411K = AbstractC50104ut7.m9558m((m31629N4 >> 31) ^ (m31629N4 + m31629N4));
                        i4 = i3 + m89411K;
                        i8 += i4;
                    }
                    break;
                case 67:
                    if (m31641B(obj, i10, i7)) {
                        long m31618j3 = m31618j(obj, j);
                        i8 += AbstractC50104ut7.m9558m(i10 << 3) + AbstractC50104ut7.m9557n((m31618j3 >> 63) ^ (m31618j3 + m31618j3));
                    }
                    break;
                case 68:
                    if (m31641B(obj, i10, i7)) {
                        m89399W = AbstractC50104ut7.m9567d(i10, (InterfaceC41230fv7) unsafe.getObject(obj, j), m31616l(i7));
                        i8 += m89399W;
                    }
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        int i17 = 0;
        AbstractC48948sw7 abstractC48948sw7 = this.f91730m;
        int mo9472a = i8 + abstractC48948sw7.mo9472a(abstractC48948sw7.mo9469d(obj));
        if (this.f91723f) {
            C32727Et7 mo113395b = this.f91731n.mo113395b(obj);
            for (int i18 = 0; i18 < mo113395b.f8278a.m76096b(); i18++) {
                Map.Entry m76091g = mo113395b.f8278a.m76091g(i18);
                i17 += C32727Et7.m108247c((InterfaceC32493Dt7) m76091g.getKey(), m76091g.getValue());
            }
            for (Map.Entry entry : mo113395b.f8278a.m76095c()) {
                i17 += C32727Et7.m108247c((InterfaceC32493Dt7) entry.getKey(), entry.getValue());
            }
            return mo9472a + i17;
        }
        return mo9472a;
    }

    /* renamed from: M */
    public final int m31630M(Object obj) {
        int m9558m;
        int m9558m2;
        int m9558m3;
        int m9557n;
        int m9558m4;
        int m9565f;
        int m9558m5;
        int m9558m6;
        int mo28217e;
        int m9558m7;
        int m89405Q;
        int m9559l;
        int m9558m8;
        int i;
        Unsafe unsafe = f91717r;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f91718a.length; i3 += 3) {
            int m31619i = m31619i(i3);
            int m31620c = m31620c(m31619i);
            int i4 = this.f91718a[i3];
            long j = m31619i & 1048575;
            if (m31620c >= EnumC36705Vt7.f39909R.zza() && m31620c <= EnumC36705Vt7.f39939u0.zza()) {
                int i5 = this.f91718a[i3 + 2];
            }
            switch (m31620c) {
                case 0:
                    if (m31603y(obj, i3)) {
                        m9558m = AbstractC50104ut7.m9558m(i4 << 3);
                        m89405Q = m9558m + 8;
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m31603y(obj, i3)) {
                        m9558m2 = AbstractC50104ut7.m9558m(i4 << 3);
                        m89405Q = m9558m2 + 4;
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m31603y(obj, i3)) {
                        long m111244i = C32286Cw7.m111244i(obj, j);
                        m9558m3 = AbstractC50104ut7.m9558m(i4 << 3);
                        m9557n = AbstractC50104ut7.m9557n(m111244i);
                        i2 += m9558m3 + m9557n;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m31603y(obj, i3)) {
                        long m111244i2 = C32286Cw7.m111244i(obj, j);
                        m9558m3 = AbstractC50104ut7.m9558m(i4 << 3);
                        m9557n = AbstractC50104ut7.m9557n(m111244i2);
                        i2 += m9558m3 + m9557n;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m31603y(obj, i3)) {
                        int m111245h = C32286Cw7.m111245h(obj, j);
                        m9558m4 = AbstractC50104ut7.m9558m(i4 << 3);
                        m9565f = AbstractC50104ut7.m9565f(m111245h);
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m31603y(obj, i3)) {
                        m9558m = AbstractC50104ut7.m9558m(i4 << 3);
                        m89405Q = m9558m + 8;
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m31603y(obj, i3)) {
                        m9558m2 = AbstractC50104ut7.m9558m(i4 << 3);
                        m89405Q = m9558m2 + 4;
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m31603y(obj, i3)) {
                        m9558m5 = AbstractC50104ut7.m9558m(i4 << 3);
                        m89405Q = m9558m5 + 1;
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m31603y(obj, i3)) {
                        break;
                    } else {
                        Object m111242k = C32286Cw7.m111242k(obj, j);
                        if (m111242k instanceof AbstractC44175kt7) {
                            m9558m6 = AbstractC50104ut7.m9558m(i4 << 3);
                            mo28217e = ((AbstractC44175kt7) m111242k).mo28217e();
                            m9558m7 = AbstractC50104ut7.m9558m(mo28217e);
                            i = m9558m6 + m9558m7 + mo28217e;
                            i2 += i;
                            break;
                        } else {
                            m9558m4 = AbstractC50104ut7.m9558m(i4 << 3);
                            m9565f = AbstractC50104ut7.m9560k((String) m111242k);
                            i = m9558m4 + m9565f;
                            i2 += i;
                        }
                    }
                case 9:
                    if (m31603y(obj, i3)) {
                        m89405Q = C35319Pv7.m89405Q(i4, C32286Cw7.m111242k(obj, j), m31616l(i3));
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m31603y(obj, i3)) {
                        m9558m6 = AbstractC50104ut7.m9558m(i4 << 3);
                        mo28217e = ((AbstractC44175kt7) C32286Cw7.m111242k(obj, j)).mo28217e();
                        m9558m7 = AbstractC50104ut7.m9558m(mo28217e);
                        i = m9558m6 + m9558m7 + mo28217e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m31603y(obj, i3)) {
                        int m111245h2 = C32286Cw7.m111245h(obj, j);
                        m9558m4 = AbstractC50104ut7.m9558m(i4 << 3);
                        m9565f = AbstractC50104ut7.m9558m(m111245h2);
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m31603y(obj, i3)) {
                        int m111245h3 = C32286Cw7.m111245h(obj, j);
                        m9558m4 = AbstractC50104ut7.m9558m(i4 << 3);
                        m9565f = AbstractC50104ut7.m9565f(m111245h3);
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m31603y(obj, i3)) {
                        m9558m2 = AbstractC50104ut7.m9558m(i4 << 3);
                        m89405Q = m9558m2 + 4;
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m31603y(obj, i3)) {
                        m9558m = AbstractC50104ut7.m9558m(i4 << 3);
                        m89405Q = m9558m + 8;
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m31603y(obj, i3)) {
                        int m111245h4 = C32286Cw7.m111245h(obj, j);
                        m9558m4 = AbstractC50104ut7.m9558m(i4 << 3);
                        m9565f = AbstractC50104ut7.m9558m((m111245h4 >> 31) ^ (m111245h4 + m111245h4));
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m31603y(obj, i3)) {
                        long m111244i3 = C32286Cw7.m111244i(obj, j);
                        m9558m4 = AbstractC50104ut7.m9558m(i4 << 3);
                        m9565f = AbstractC50104ut7.m9557n((m111244i3 >> 63) ^ (m111244i3 + m111244i3));
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m31603y(obj, i3)) {
                        m89405Q = AbstractC50104ut7.m9567d(i4, (InterfaceC41230fv7) C32286Cw7.m111242k(obj, j), m31616l(i3));
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m89405Q = C35319Pv7.m89412J(i4, (List) C32286Cw7.m111242k(obj, j), false);
                    i2 += m89405Q;
                    break;
                case 19:
                    m89405Q = C35319Pv7.m89414H(i4, (List) C32286Cw7.m111242k(obj, j), false);
                    i2 += m89405Q;
                    break;
                case 20:
                    m89405Q = C35319Pv7.m89407O(i4, (List) C32286Cw7.m111242k(obj, j), false);
                    i2 += m89405Q;
                    break;
                case 21:
                    m89405Q = C35319Pv7.m89396Z(i4, (List) C32286Cw7.m111242k(obj, j), false);
                    i2 += m89405Q;
                    break;
                case 22:
                    m89405Q = C35319Pv7.m89409M(i4, (List) C32286Cw7.m111242k(obj, j), false);
                    i2 += m89405Q;
                    break;
                case 23:
                    m89405Q = C35319Pv7.m89412J(i4, (List) C32286Cw7.m111242k(obj, j), false);
                    i2 += m89405Q;
                    break;
                case 24:
                    m89405Q = C35319Pv7.m89414H(i4, (List) C32286Cw7.m111242k(obj, j), false);
                    i2 += m89405Q;
                    break;
                case 25:
                    m89405Q = C35319Pv7.m89421A(i4, (List) C32286Cw7.m111242k(obj, j), false);
                    i2 += m89405Q;
                    break;
                case 26:
                    m89405Q = C35319Pv7.m89399W(i4, (List) C32286Cw7.m111242k(obj, j));
                    i2 += m89405Q;
                    break;
                case 27:
                    m89405Q = C35319Pv7.m89404R(i4, (List) C32286Cw7.m111242k(obj, j), m31616l(i3));
                    i2 += m89405Q;
                    break;
                case 28:
                    m89405Q = C35319Pv7.m89417E(i4, (List) C32286Cw7.m111242k(obj, j));
                    i2 += m89405Q;
                    break;
                case 29:
                    m89405Q = C35319Pv7.m89398X(i4, (List) C32286Cw7.m111242k(obj, j), false);
                    i2 += m89405Q;
                    break;
                case 30:
                    m89405Q = C35319Pv7.m89416F(i4, (List) C32286Cw7.m111242k(obj, j), false);
                    i2 += m89405Q;
                    break;
                case 31:
                    m89405Q = C35319Pv7.m89414H(i4, (List) C32286Cw7.m111242k(obj, j), false);
                    i2 += m89405Q;
                    break;
                case 32:
                    m89405Q = C35319Pv7.m89412J(i4, (List) C32286Cw7.m111242k(obj, j), false);
                    i2 += m89405Q;
                    break;
                case 33:
                    m89405Q = C35319Pv7.m89403S(i4, (List) C32286Cw7.m111242k(obj, j), false);
                    i2 += m89405Q;
                    break;
                case 34:
                    m89405Q = C35319Pv7.m89401U(i4, (List) C32286Cw7.m111242k(obj, j), false);
                    i2 += m89405Q;
                    break;
                case 35:
                    m9565f = C35319Pv7.m89411K((List) unsafe.getObject(obj, j));
                    if (m9565f > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i4);
                        m9558m8 = AbstractC50104ut7.m9558m(m9565f);
                        m9558m4 = m9559l + m9558m8;
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    m9565f = C35319Pv7.m89413I((List) unsafe.getObject(obj, j));
                    if (m9565f > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i4);
                        m9558m8 = AbstractC50104ut7.m9558m(m9565f);
                        m9558m4 = m9559l + m9558m8;
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    m9565f = C35319Pv7.m89406P((List) unsafe.getObject(obj, j));
                    if (m9565f > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i4);
                        m9558m8 = AbstractC50104ut7.m9558m(m9565f);
                        m9558m4 = m9559l + m9558m8;
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    m9565f = C35319Pv7.m89394a0((List) unsafe.getObject(obj, j));
                    if (m9565f > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i4);
                        m9558m8 = AbstractC50104ut7.m9558m(m9565f);
                        m9558m4 = m9559l + m9558m8;
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    m9565f = C35319Pv7.m89408N((List) unsafe.getObject(obj, j));
                    if (m9565f > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i4);
                        m9558m8 = AbstractC50104ut7.m9558m(m9565f);
                        m9558m4 = m9559l + m9558m8;
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    m9565f = C35319Pv7.m89411K((List) unsafe.getObject(obj, j));
                    if (m9565f > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i4);
                        m9558m8 = AbstractC50104ut7.m9558m(m9565f);
                        m9558m4 = m9559l + m9558m8;
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    m9565f = C35319Pv7.m89413I((List) unsafe.getObject(obj, j));
                    if (m9565f > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i4);
                        m9558m8 = AbstractC50104ut7.m9558m(m9565f);
                        m9558m4 = m9559l + m9558m8;
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    m9565f = C35319Pv7.m89418D((List) unsafe.getObject(obj, j));
                    if (m9565f > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i4);
                        m9558m8 = AbstractC50104ut7.m9558m(m9565f);
                        m9558m4 = m9559l + m9558m8;
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    m9565f = C35319Pv7.m89397Y((List) unsafe.getObject(obj, j));
                    if (m9565f > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i4);
                        m9558m8 = AbstractC50104ut7.m9558m(m9565f);
                        m9558m4 = m9559l + m9558m8;
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    m9565f = C35319Pv7.m89415G((List) unsafe.getObject(obj, j));
                    if (m9565f > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i4);
                        m9558m8 = AbstractC50104ut7.m9558m(m9565f);
                        m9558m4 = m9559l + m9558m8;
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    m9565f = C35319Pv7.m89413I((List) unsafe.getObject(obj, j));
                    if (m9565f > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i4);
                        m9558m8 = AbstractC50104ut7.m9558m(m9565f);
                        m9558m4 = m9559l + m9558m8;
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    m9565f = C35319Pv7.m89411K((List) unsafe.getObject(obj, j));
                    if (m9565f > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i4);
                        m9558m8 = AbstractC50104ut7.m9558m(m9565f);
                        m9558m4 = m9559l + m9558m8;
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    m9565f = C35319Pv7.m89402T((List) unsafe.getObject(obj, j));
                    if (m9565f > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i4);
                        m9558m8 = AbstractC50104ut7.m9558m(m9565f);
                        m9558m4 = m9559l + m9558m8;
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    m9565f = C35319Pv7.m89400V((List) unsafe.getObject(obj, j));
                    if (m9565f > 0) {
                        m9559l = AbstractC50104ut7.m9559l(i4);
                        m9558m8 = AbstractC50104ut7.m9558m(m9565f);
                        m9558m4 = m9559l + m9558m8;
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    m89405Q = C35319Pv7.m89410L(i4, (List) C32286Cw7.m111242k(obj, j), m31616l(i3));
                    i2 += m89405Q;
                    break;
                case 50:
                    m89405Q = C38248av7.m65250a(i4, C32286Cw7.m111242k(obj, j), m31614n(i3));
                    i2 += m89405Q;
                    break;
                case 51:
                    if (m31641B(obj, i4, i3)) {
                        m9558m = AbstractC50104ut7.m9558m(i4 << 3);
                        m89405Q = m9558m + 8;
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m31641B(obj, i4, i3)) {
                        m9558m2 = AbstractC50104ut7.m9558m(i4 << 3);
                        m89405Q = m9558m2 + 4;
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m31641B(obj, i4, i3)) {
                        long m31618j = m31618j(obj, j);
                        m9558m3 = AbstractC50104ut7.m9558m(i4 << 3);
                        m9557n = AbstractC50104ut7.m9557n(m31618j);
                        i2 += m9558m3 + m9557n;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m31641B(obj, i4, i3)) {
                        long m31618j2 = m31618j(obj, j);
                        m9558m3 = AbstractC50104ut7.m9558m(i4 << 3);
                        m9557n = AbstractC50104ut7.m9557n(m31618j2);
                        i2 += m9558m3 + m9557n;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m31641B(obj, i4, i3)) {
                        int m31629N = m31629N(obj, j);
                        m9558m4 = AbstractC50104ut7.m9558m(i4 << 3);
                        m9565f = AbstractC50104ut7.m9565f(m31629N);
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m31641B(obj, i4, i3)) {
                        m9558m = AbstractC50104ut7.m9558m(i4 << 3);
                        m89405Q = m9558m + 8;
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m31641B(obj, i4, i3)) {
                        m9558m2 = AbstractC50104ut7.m9558m(i4 << 3);
                        m89405Q = m9558m2 + 4;
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m31641B(obj, i4, i3)) {
                        m9558m5 = AbstractC50104ut7.m9558m(i4 << 3);
                        m89405Q = m9558m5 + 1;
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!m31641B(obj, i4, i3)) {
                        break;
                    } else {
                        Object m111242k2 = C32286Cw7.m111242k(obj, j);
                        if (m111242k2 instanceof AbstractC44175kt7) {
                            m9558m6 = AbstractC50104ut7.m9558m(i4 << 3);
                            mo28217e = ((AbstractC44175kt7) m111242k2).mo28217e();
                            m9558m7 = AbstractC50104ut7.m9558m(mo28217e);
                            i = m9558m6 + m9558m7 + mo28217e;
                            i2 += i;
                            break;
                        } else {
                            m9558m4 = AbstractC50104ut7.m9558m(i4 << 3);
                            m9565f = AbstractC50104ut7.m9560k((String) m111242k2);
                            i = m9558m4 + m9565f;
                            i2 += i;
                        }
                    }
                case 60:
                    if (m31641B(obj, i4, i3)) {
                        m89405Q = C35319Pv7.m89405Q(i4, C32286Cw7.m111242k(obj, j), m31616l(i3));
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m31641B(obj, i4, i3)) {
                        m9558m6 = AbstractC50104ut7.m9558m(i4 << 3);
                        mo28217e = ((AbstractC44175kt7) C32286Cw7.m111242k(obj, j)).mo28217e();
                        m9558m7 = AbstractC50104ut7.m9558m(mo28217e);
                        i = m9558m6 + m9558m7 + mo28217e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m31641B(obj, i4, i3)) {
                        int m31629N2 = m31629N(obj, j);
                        m9558m4 = AbstractC50104ut7.m9558m(i4 << 3);
                        m9565f = AbstractC50104ut7.m9558m(m31629N2);
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m31641B(obj, i4, i3)) {
                        int m31629N3 = m31629N(obj, j);
                        m9558m4 = AbstractC50104ut7.m9558m(i4 << 3);
                        m9565f = AbstractC50104ut7.m9565f(m31629N3);
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m31641B(obj, i4, i3)) {
                        m9558m2 = AbstractC50104ut7.m9558m(i4 << 3);
                        m89405Q = m9558m2 + 4;
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m31641B(obj, i4, i3)) {
                        m9558m = AbstractC50104ut7.m9558m(i4 << 3);
                        m89405Q = m9558m + 8;
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m31641B(obj, i4, i3)) {
                        int m31629N4 = m31629N(obj, j);
                        m9558m4 = AbstractC50104ut7.m9558m(i4 << 3);
                        m9565f = AbstractC50104ut7.m9558m((m31629N4 >> 31) ^ (m31629N4 + m31629N4));
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m31641B(obj, i4, i3)) {
                        long m31618j3 = m31618j(obj, j);
                        m9558m4 = AbstractC50104ut7.m9558m(i4 << 3);
                        m9565f = AbstractC50104ut7.m9557n((m31618j3 >> 63) ^ (m31618j3 + m31618j3));
                        i = m9558m4 + m9565f;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m31641B(obj, i4, i3)) {
                        m89405Q = AbstractC50104ut7.m9567d(i4, (InterfaceC41230fv7) C32286Cw7.m111242k(obj, j), m31616l(i3));
                        i2 += m89405Q;
                        break;
                    } else {
                        break;
                    }
            }
        }
        AbstractC48948sw7 abstractC48948sw7 = this.f91730m;
        return i2 + abstractC48948sw7.mo9472a(abstractC48948sw7.mo9469d(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* renamed from: O */
    public final int m31628O(Object obj, byte[] bArr, int i, int i2, int i3, long j, C32952Fs7 c32952Fs7) throws IOException {
        Unsafe unsafe = f91717r;
        Object m31614n = m31614n(i3);
        Object object = unsafe.getObject(obj, j);
        if (C38248av7.m65249b(object)) {
            C37650Zu7 m72313e = C37650Zu7.m72314d().m72313e();
            C38248av7.m65248c(m72313e, object);
            unsafe.putObject(obj, j, m72313e);
            object = m72313e;
        }
        C37182Xu7 m74015c = ((C37416Yu7) m31614n).m74015c();
        C37650Zu7 c37650Zu7 = (C37650Zu7) object;
        int m104631j = C33186Gs7.m104631j(bArr, i, c32952Fs7);
        int i4 = c32952Fs7.f10390a;
        if (i4 >= 0 && i4 <= i2 - m104631j) {
            int i5 = m104631j + i4;
            Object obj2 = m74015c.f44207b;
            Object obj3 = m74015c.f44209d;
            while (m104631j < i5) {
                int i6 = m104631j + 1;
                byte b = bArr[m104631j];
                if (b < 0) {
                    i6 = C33186Gs7.m104630k(b, bArr, i6, c32952Fs7);
                    b = c32952Fs7.f10390a;
                }
                int i7 = b & 7;
                int i8 = b >>> 3;
                if (i8 != 1) {
                    if (i8 == 2 && i7 == m74015c.f44208c.zza()) {
                        m104631j = m31639D(bArr, i6, i2, m74015c.f44208c, m74015c.f44209d.getClass(), c32952Fs7);
                        obj3 = c32952Fs7.f10392c;
                    }
                    m104631j = C33186Gs7.m104627n(b, bArr, i6, i2, c32952Fs7);
                } else if (i7 == m74015c.f44206a.zza()) {
                    m104631j = m31639D(bArr, i6, i2, m74015c.f44206a, null, c32952Fs7);
                    obj2 = c32952Fs7.f10392c;
                } else {
                    m104631j = C33186Gs7.m104627n(b, bArr, i6, i2, c32952Fs7);
                }
            }
            if (m104631j == i5) {
                c37650Zu7.put(obj2, obj3);
                return i5;
            }
            throw zzaqw.m51281g();
        }
        throw zzaqw.m51278j();
    }

    /* renamed from: P */
    public final int m31627P(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C32952Fs7 c32952Fs7) throws IOException {
        boolean z;
        Object obj2;
        Object obj3;
        Unsafe unsafe = f91717r;
        long j2 = this.f91718a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(C33186Gs7.m104626o(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(C33186Gs7.m104639b(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int m104628m = C33186Gs7.m104628m(bArr, i, c32952Fs7);
                    unsafe.putObject(obj, j, Long.valueOf(c32952Fs7.f10391b));
                    unsafe.putInt(obj, j2, i4);
                    return m104628m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m104631j = C33186Gs7.m104631j(bArr, i, c32952Fs7);
                    unsafe.putObject(obj, j, Integer.valueOf(c32952Fs7.f10390a));
                    unsafe.putInt(obj, j2, i4);
                    return m104631j;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(C33186Gs7.m104626o(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(C33186Gs7.m104639b(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m104628m2 = C33186Gs7.m104628m(bArr, i, c32952Fs7);
                    if (c32952Fs7.f10391b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z));
                    unsafe.putInt(obj, j2, i4);
                    return m104628m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int m104631j2 = C33186Gs7.m104631j(bArr, i, c32952Fs7);
                    int i9 = c32952Fs7.f10390a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !C33456Hw7.m103206i(bArr, m104631j2, m104631j2 + i9)) {
                        throw zzaqw.m51284d();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m104631j2, i9, C46557ou7.f102752b));
                        m104631j2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m104631j2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int m104637d = C33186Gs7.m104637d(m31616l(i8), bArr, i, i2, c32952Fs7);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(obj, j, c32952Fs7.f10392c);
                    } else {
                        unsafe.putObject(obj, j, C46557ou7.m20291g(obj2, c32952Fs7.f10392c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m104637d;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m104640a = C33186Gs7.m104640a(bArr, i, c32952Fs7);
                    unsafe.putObject(obj, j, c32952Fs7.f10392c);
                    unsafe.putInt(obj, j2, i4);
                    return m104640a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m104631j3 = C33186Gs7.m104631j(bArr, i, c32952Fs7);
                    int i10 = c32952Fs7.f10390a;
                    InterfaceC42999iu7 m31617k = m31617k(i8);
                    if (m31617k != null && !m31617k.zza(i10)) {
                        m31636G(obj).m11179h(i3, Long.valueOf(i10));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return m104631j3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int m104631j4 = C33186Gs7.m104631j(bArr, i, c32952Fs7);
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC46547ot7.m20347e(c32952Fs7.f10390a)));
                    unsafe.putInt(obj, j2, i4);
                    return m104631j4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int m104628m3 = C33186Gs7.m104628m(bArr, i, c32952Fs7);
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC46547ot7.m20346f(c32952Fs7.f10391b)));
                    unsafe.putInt(obj, j2, i4);
                    return m104628m3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int m104638c = C33186Gs7.m104638c(m31616l(i8), bArr, i, i2, (i3 & (-8)) | 4, c32952Fs7);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj3 = unsafe.getObject(obj, j);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 == null) {
                        unsafe.putObject(obj, j, c32952Fs7.f10392c);
                    } else {
                        unsafe.putObject(obj, j, C46557ou7.m20291g(obj3, c32952Fs7.f10392c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m104638c;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    /* renamed from: Q */
    public final int m31626Q(Object obj, byte[] bArr, int i, int i2, C32952Fs7 c32952Fs7) throws IOException {
        byte b;
        int i3;
        int m31624S;
        int i4;
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int i10;
        int m104628m;
        int m104637d;
        int i11;
        int i12;
        int i13;
        C43009iv7<T> c43009iv7 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i14 = i2;
        C32952Fs7 c32952Fs72 = c32952Fs7;
        Unsafe unsafe2 = f91717r;
        int i15 = 1048575;
        int i16 = -1;
        int i17 = i;
        int i18 = -1;
        int i19 = 1048575;
        int i20 = 0;
        int i21 = 0;
        while (i17 < i14) {
            int i22 = i17 + 1;
            byte b2 = bArr2[i17];
            if (b2 < 0) {
                i3 = C33186Gs7.m104630k(b2, bArr2, i22, c32952Fs72);
                b = c32952Fs72.f10390a;
            } else {
                b = b2;
                i3 = i22;
            }
            int i23 = b >>> 3;
            int i24 = b & 7;
            if (i23 > i18) {
                m31624S = c43009iv7.m31623T(i23, i20 / 3);
            } else {
                m31624S = c43009iv7.m31624S(i23);
            }
            int i25 = m31624S;
            if (i25 == i16) {
                i4 = i3;
                i5 = i23;
                i6 = i16;
                unsafe = unsafe2;
                i7 = 0;
            } else {
                int[] iArr = c43009iv7.f91718a;
                int i26 = iArr[i25 + 1];
                int m31620c = m31620c(i26);
                long j = i26 & i15;
                if (m31620c <= 17) {
                    int i27 = iArr[i25 + 2];
                    int i28 = 1 << (i27 >>> 20);
                    int i29 = i27 & 1048575;
                    if (i29 != i19) {
                        if (i19 != 1048575) {
                            unsafe2.putInt(obj2, i19, i21);
                        }
                        if (i29 != 1048575) {
                            i21 = unsafe2.getInt(obj2, i29);
                        }
                        i19 = i29;
                    }
                    switch (m31620c) {
                        case 0:
                            c32952Fs72 = c32952Fs7;
                            i8 = i25;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 1) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                C32286Cw7.m111233t(obj2, j, Double.longBitsToDouble(C33186Gs7.m104626o(bArr2, i9)));
                                i17 = i9 + 8;
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 1:
                            c32952Fs72 = c32952Fs7;
                            i8 = i25;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 5) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                C32286Cw7.m111232u(obj2, j, Float.intBitsToFloat(C33186Gs7.m104639b(bArr2, i9)));
                                i17 = i9 + 4;
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            c32952Fs72 = c32952Fs7;
                            i8 = i25;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                m104628m = C33186Gs7.m104628m(bArr2, i9, c32952Fs72);
                                unsafe2.putLong(obj, j, c32952Fs72.f10391b);
                                i21 |= i28;
                                i17 = m104628m;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            c32952Fs72 = c32952Fs7;
                            i8 = i25;
                            i9 = i3;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i17 = C33186Gs7.m104631j(bArr2, i9, c32952Fs72);
                                unsafe2.putInt(obj2, j, c32952Fs72.f10390a);
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            c32952Fs72 = c32952Fs7;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 1) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i9 = i3;
                                unsafe2.putLong(obj, j, C33186Gs7.m104626o(bArr2, i3));
                                i17 = i9 + 8;
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            c32952Fs72 = c32952Fs7;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 5) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, j, C33186Gs7.m104639b(bArr2, i3));
                                i17 = i3 + 4;
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 7:
                            c32952Fs72 = c32952Fs7;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i17 = C33186Gs7.m104628m(bArr2, i3, c32952Fs72);
                                C32286Cw7.m111235r(obj2, j, c32952Fs72.f10391b != 0);
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 8:
                            c32952Fs72 = c32952Fs7;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 2) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                if ((536870912 & i26) == 0) {
                                    i17 = C33186Gs7.m104634g(bArr2, i3, c32952Fs72);
                                } else {
                                    i17 = C33186Gs7.m104633h(bArr2, i3, c32952Fs72);
                                }
                                unsafe2.putObject(obj2, j, c32952Fs72.f10392c);
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 9:
                            c32952Fs72 = c32952Fs7;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 2) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                m104637d = C33186Gs7.m104637d(c43009iv7.m31616l(i8), bArr2, i3, i14, c32952Fs72);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, c32952Fs72.f10392c);
                                } else {
                                    unsafe2.putObject(obj2, j, C46557ou7.m20291g(object, c32952Fs72.f10392c));
                                }
                                i21 |= i28;
                                i17 = m104637d;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 10:
                            c32952Fs72 = c32952Fs7;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 2) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                m104637d = C33186Gs7.m104640a(bArr2, i3, c32952Fs72);
                                unsafe2.putObject(obj2, j, c32952Fs72.f10392c);
                                i21 |= i28;
                                i17 = m104637d;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 12:
                            c32952Fs72 = c32952Fs7;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                m104637d = C33186Gs7.m104631j(bArr2, i3, c32952Fs72);
                                unsafe2.putInt(obj2, j, c32952Fs72.f10390a);
                                i21 |= i28;
                                i17 = m104637d;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 15:
                            c32952Fs72 = c32952Fs7;
                            i8 = i25;
                            i10 = 1048575;
                            i5 = i23;
                            if (i24 != 0) {
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                m104637d = C33186Gs7.m104631j(bArr2, i3, c32952Fs72);
                                unsafe2.putInt(obj2, j, AbstractC46547ot7.m20347e(c32952Fs72.f10390a));
                                i21 |= i28;
                                i17 = m104637d;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 16:
                            if (i24 != 0) {
                                i5 = i23;
                                i8 = i25;
                                i9 = i3;
                                i4 = i9;
                                unsafe = unsafe2;
                                i7 = i8;
                                i6 = -1;
                                break;
                            } else {
                                c32952Fs72 = c32952Fs7;
                                m104628m = C33186Gs7.m104628m(bArr2, i3, c32952Fs72);
                                i8 = i25;
                                i5 = i23;
                                i10 = 1048575;
                                unsafe2.putLong(obj, j, AbstractC46547ot7.m20346f(c32952Fs72.f10391b));
                                i21 |= i28;
                                i17 = m104628m;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        default:
                            i5 = i23;
                            i8 = i25;
                            i9 = i3;
                            i4 = i9;
                            unsafe = unsafe2;
                            i7 = i8;
                            i6 = -1;
                            break;
                    }
                } else {
                    c32952Fs72 = c32952Fs7;
                    i8 = i25;
                    int i30 = i3;
                    i10 = 1048575;
                    i5 = i23;
                    if (m31620c == 27) {
                        if (i24 == 2) {
                            InterfaceC45964nu7 interfaceC45964nu7 = (InterfaceC45964nu7) unsafe2.getObject(obj2, j);
                            if (!interfaceC45964nu7.zzc()) {
                                int size = interfaceC45964nu7.size();
                                interfaceC45964nu7 = interfaceC45964nu7.mo6153d(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, interfaceC45964nu7);
                            }
                            i17 = C33186Gs7.m104636e(c43009iv7.m31616l(i8), b, bArr, i30, i2, interfaceC45964nu7, c32952Fs7);
                            i21 = i21;
                            i20 = i8;
                            i18 = i5;
                            i15 = i10;
                            i16 = -1;
                        } else {
                            i11 = i30;
                            i12 = i21;
                            i13 = i19;
                            unsafe = unsafe2;
                            i7 = i8;
                            i6 = -1;
                        }
                    } else if (m31620c <= 49) {
                        i12 = i21;
                        i13 = i19;
                        i6 = -1;
                        unsafe = unsafe2;
                        i7 = i8;
                        i17 = m31625R(obj, bArr, i30, i2, b, i5, i24, i8, i26, m31620c, j, c32952Fs7);
                        if (i17 != i30) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i14 = i2;
                            c32952Fs72 = c32952Fs7;
                            i19 = i13;
                            i16 = i6;
                            i18 = i5;
                            i21 = i12;
                            i20 = i7;
                            unsafe2 = unsafe;
                            i15 = 1048575;
                            c43009iv7 = this;
                        } else {
                            i4 = i17;
                            i19 = i13;
                            i21 = i12;
                        }
                    } else {
                        i11 = i30;
                        i12 = i21;
                        i13 = i19;
                        unsafe = unsafe2;
                        i7 = i8;
                        i6 = -1;
                        if (m31620c != 50) {
                            i17 = m31627P(obj, bArr, i11, i2, b, i5, i24, i26, m31620c, j, i7, c32952Fs7);
                            if (i17 != i11) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i14 = i2;
                                c32952Fs72 = c32952Fs7;
                                i19 = i13;
                                i16 = i6;
                                i18 = i5;
                                i21 = i12;
                                i20 = i7;
                                unsafe2 = unsafe;
                                i15 = 1048575;
                                c43009iv7 = this;
                            } else {
                                i4 = i17;
                                i19 = i13;
                                i21 = i12;
                            }
                        } else if (i24 == 2) {
                            i17 = m31628O(obj, bArr, i11, i2, i7, j, c32952Fs7);
                            if (i17 != i11) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i14 = i2;
                                c32952Fs72 = c32952Fs7;
                                i19 = i13;
                                i16 = i6;
                                i18 = i5;
                                i21 = i12;
                                i20 = i7;
                                unsafe2 = unsafe;
                                i15 = 1048575;
                                c43009iv7 = this;
                            } else {
                                i4 = i17;
                                i19 = i13;
                                i21 = i12;
                            }
                        }
                    }
                    i4 = i11;
                    i19 = i13;
                    i21 = i12;
                }
            }
            i17 = C33186Gs7.m104632i(b, bArr, i4, i2, m31636G(obj), c32952Fs7);
            c43009iv7 = this;
            obj2 = obj;
            bArr2 = bArr;
            i14 = i2;
            c32952Fs72 = c32952Fs7;
            i16 = i6;
            i18 = i5;
            i20 = i7;
            unsafe2 = unsafe;
            i15 = 1048575;
        }
        int i31 = i21;
        int i32 = i19;
        Unsafe unsafe3 = unsafe2;
        if (i32 != i15) {
            unsafe3.putInt(obj, i32, i31);
        }
        if (i17 == i2) {
            return i17;
        }
        throw zzaqw.m51281g();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021a -> B:120:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:67:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cc -> B:100:0x01cd). Please submit an issue!!! */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m31625R(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C32952Fs7 c32952Fs7) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        int m104631j;
        boolean z3;
        int i12;
        int i13;
        int i14 = i;
        Unsafe unsafe = f91717r;
        InterfaceC45964nu7 interfaceC45964nu7 = (InterfaceC45964nu7) unsafe.getObject(obj, j2);
        if (!interfaceC45964nu7.zzc()) {
            int size = interfaceC45964nu7.size();
            if (size == 0) {
                i13 = 10;
            } else {
                i13 = size + size;
            }
            interfaceC45964nu7 = interfaceC45964nu7.mo6153d(i13);
            unsafe.putObject(obj, j2, interfaceC45964nu7);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    C51289wt7 c51289wt7 = (C51289wt7) interfaceC45964nu7;
                    int m104631j2 = C33186Gs7.m104631j(bArr, i14, c32952Fs7);
                    int i15 = c32952Fs7.f10390a + m104631j2;
                    while (m104631j2 < i15) {
                        c51289wt7.m6155b(Double.longBitsToDouble(C33186Gs7.m104626o(bArr, m104631j2)));
                        m104631j2 += 8;
                    }
                    if (m104631j2 != i15) {
                        throw zzaqw.m51278j();
                    }
                    return m104631j2;
                }
                if (i5 == 1) {
                    C51289wt7 c51289wt72 = (C51289wt7) interfaceC45964nu7;
                    c51289wt72.m6155b(Double.longBitsToDouble(C33186Gs7.m104626o(bArr, i)));
                    while (true) {
                        i8 = i14 + 8;
                        if (i8 < i2) {
                            i14 = C33186Gs7.m104631j(bArr, i8, c32952Fs7);
                            if (i3 == c32952Fs7.f10390a) {
                                c51289wt72.m6155b(Double.longBitsToDouble(C33186Gs7.m104626o(bArr, i14)));
                            }
                        }
                    }
                    return i8;
                }
                return i14;
            case 19:
            case 36:
                if (i5 == 2) {
                    C36939Wt7 c36939Wt7 = (C36939Wt7) interfaceC45964nu7;
                    int m104631j3 = C33186Gs7.m104631j(bArr, i14, c32952Fs7);
                    int i16 = c32952Fs7.f10390a + m104631j3;
                    while (m104631j3 < i16) {
                        c36939Wt7.m77729c(Float.intBitsToFloat(C33186Gs7.m104639b(bArr, m104631j3)));
                        m104631j3 += 4;
                    }
                    if (m104631j3 != i16) {
                        throw zzaqw.m51278j();
                    }
                    return m104631j3;
                }
                if (i5 == 5) {
                    C36939Wt7 c36939Wt72 = (C36939Wt7) interfaceC45964nu7;
                    c36939Wt72.m77729c(Float.intBitsToFloat(C33186Gs7.m104639b(bArr, i)));
                    while (true) {
                        i9 = i14 + 4;
                        if (i9 < i2) {
                            i14 = C33186Gs7.m104631j(bArr, i9, c32952Fs7);
                            if (i3 == c32952Fs7.f10390a) {
                                c36939Wt72.m77729c(Float.intBitsToFloat(C33186Gs7.m104639b(bArr, i14)));
                            }
                        }
                    }
                    return i9;
                }
                return i14;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    C36246Tu7 c36246Tu7 = (C36246Tu7) interfaceC45964nu7;
                    int m104631j4 = C33186Gs7.m104631j(bArr, i14, c32952Fs7);
                    int i17 = c32952Fs7.f10390a + m104631j4;
                    while (m104631j4 < i17) {
                        m104631j4 = C33186Gs7.m104628m(bArr, m104631j4, c32952Fs7);
                        c36246Tu7.m82270e(c32952Fs7.f10391b);
                    }
                    if (m104631j4 != i17) {
                        throw zzaqw.m51278j();
                    }
                    return m104631j4;
                }
                if (i5 == 0) {
                    C36246Tu7 c36246Tu72 = (C36246Tu7) interfaceC45964nu7;
                    int m104628m = C33186Gs7.m104628m(bArr, i14, c32952Fs7);
                    c36246Tu72.m82270e(c32952Fs7.f10391b);
                    while (m104628m < i2) {
                        int m104631j5 = C33186Gs7.m104631j(bArr, m104628m, c32952Fs7);
                        if (i3 == c32952Fs7.f10390a) {
                            m104628m = C33186Gs7.m104628m(bArr, m104631j5, c32952Fs7);
                            c36246Tu72.m82270e(c32952Fs7.f10391b);
                        } else {
                            return m104628m;
                        }
                    }
                    return m104628m;
                }
                return i14;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C33186Gs7.m104635f(bArr, i14, interfaceC45964nu7, c32952Fs7);
                }
                if (i5 == 0) {
                    return C33186Gs7.m104629l(i3, bArr, i, i2, interfaceC45964nu7, c32952Fs7);
                }
                return i14;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    C36246Tu7 c36246Tu73 = (C36246Tu7) interfaceC45964nu7;
                    int m104631j6 = C33186Gs7.m104631j(bArr, i14, c32952Fs7);
                    int i18 = c32952Fs7.f10390a + m104631j6;
                    while (m104631j6 < i18) {
                        c36246Tu73.m82270e(C33186Gs7.m104626o(bArr, m104631j6));
                        m104631j6 += 8;
                    }
                    if (m104631j6 != i18) {
                        throw zzaqw.m51278j();
                    }
                    return m104631j6;
                }
                if (i5 == 1) {
                    C36246Tu7 c36246Tu74 = (C36246Tu7) interfaceC45964nu7;
                    c36246Tu74.m82270e(C33186Gs7.m104626o(bArr, i));
                    while (true) {
                        i10 = i14 + 8;
                        if (i10 < i2) {
                            i14 = C33186Gs7.m104631j(bArr, i10, c32952Fs7);
                            if (i3 == c32952Fs7.f10390a) {
                                c36246Tu74.m82270e(C33186Gs7.m104626o(bArr, i14));
                            }
                        }
                    }
                    return i10;
                }
                return i14;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    C41220fu7 c41220fu7 = (C41220fu7) interfaceC45964nu7;
                    int m104631j7 = C33186Gs7.m104631j(bArr, i14, c32952Fs7);
                    int i19 = c32952Fs7.f10390a + m104631j7;
                    while (m104631j7 < i19) {
                        c41220fu7.m40571e(C33186Gs7.m104639b(bArr, m104631j7));
                        m104631j7 += 4;
                    }
                    if (m104631j7 != i19) {
                        throw zzaqw.m51278j();
                    }
                    return m104631j7;
                }
                if (i5 == 5) {
                    C41220fu7 c41220fu72 = (C41220fu7) interfaceC45964nu7;
                    c41220fu72.m40571e(C33186Gs7.m104639b(bArr, i));
                    while (true) {
                        i11 = i14 + 4;
                        if (i11 < i2) {
                            i14 = C33186Gs7.m104631j(bArr, i11, c32952Fs7);
                            if (i3 == c32952Fs7.f10390a) {
                                c41220fu72.m40571e(C33186Gs7.m104639b(bArr, i14));
                            }
                        }
                    }
                    return i11;
                }
                return i14;
            case 25:
            case 42:
                if (i5 == 2) {
                    C33420Hs7 c33420Hs7 = (C33420Hs7) interfaceC45964nu7;
                    m104631j = C33186Gs7.m104631j(bArr, i14, c32952Fs7);
                    int i20 = c32952Fs7.f10390a + m104631j;
                    while (m104631j < i20) {
                        m104631j = C33186Gs7.m104628m(bArr, m104631j, c32952Fs7);
                        if (c32952Fs7.f10391b != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c33420Hs7.m103252b(z3);
                    }
                    if (m104631j != i20) {
                        throw zzaqw.m51278j();
                    }
                    return m104631j;
                }
                if (i5 == 0) {
                    C33420Hs7 c33420Hs72 = (C33420Hs7) interfaceC45964nu7;
                    int m104628m2 = C33186Gs7.m104628m(bArr, i14, c32952Fs7);
                    if (c32952Fs7.f10391b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c33420Hs72.m103252b(z);
                    while (m104628m2 < i2) {
                        int m104631j8 = C33186Gs7.m104631j(bArr, m104628m2, c32952Fs7);
                        if (i3 == c32952Fs7.f10390a) {
                            m104628m2 = C33186Gs7.m104628m(bArr, m104631j8, c32952Fs7);
                            if (c32952Fs7.f10391b != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c33420Hs72.m103252b(z2);
                        } else {
                            return m104628m2;
                        }
                    }
                    return m104628m2;
                }
                return i14;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int m104631j9 = C33186Gs7.m104631j(bArr, i14, c32952Fs7);
                        int i21 = c32952Fs7.f10390a;
                        if (i21 >= 0) {
                            if (i21 == 0) {
                                interfaceC45964nu7.add("");
                                while (m104631j9 < i2) {
                                    int m104631j10 = C33186Gs7.m104631j(bArr, m104631j9, c32952Fs7);
                                    if (i3 == c32952Fs7.f10390a) {
                                        m104631j9 = C33186Gs7.m104631j(bArr, m104631j10, c32952Fs7);
                                        i21 = c32952Fs7.f10390a;
                                        if (i21 >= 0) {
                                            if (i21 == 0) {
                                                interfaceC45964nu7.add("");
                                            } else {
                                                interfaceC45964nu7.add(new String(bArr, m104631j9, i21, C46557ou7.f102752b));
                                                m104631j9 += i21;
                                                while (m104631j9 < i2) {
                                                }
                                            }
                                        } else {
                                            throw zzaqw.m51282f();
                                        }
                                    } else {
                                        return m104631j9;
                                    }
                                }
                                return m104631j9;
                            }
                            interfaceC45964nu7.add(new String(bArr, m104631j9, i21, C46557ou7.f102752b));
                            m104631j9 += i21;
                            while (m104631j9 < i2) {
                            }
                            return m104631j9;
                        }
                        throw zzaqw.m51282f();
                    }
                    int m104631j11 = C33186Gs7.m104631j(bArr, i14, c32952Fs7);
                    int i22 = c32952Fs7.f10390a;
                    if (i22 >= 0) {
                        if (i22 == 0) {
                            interfaceC45964nu7.add("");
                            while (m104631j11 < i2) {
                                int m104631j12 = C33186Gs7.m104631j(bArr, m104631j11, c32952Fs7);
                                if (i3 == c32952Fs7.f10390a) {
                                    m104631j11 = C33186Gs7.m104631j(bArr, m104631j12, c32952Fs7);
                                    int i23 = c32952Fs7.f10390a;
                                    if (i23 >= 0) {
                                        if (i23 == 0) {
                                            interfaceC45964nu7.add("");
                                        } else {
                                            i12 = m104631j11 + i23;
                                            if (C33456Hw7.m103206i(bArr, m104631j11, i12)) {
                                                interfaceC45964nu7.add(new String(bArr, m104631j11, i23, C46557ou7.f102752b));
                                                m104631j11 = i12;
                                                while (m104631j11 < i2) {
                                                }
                                            } else {
                                                throw zzaqw.m51284d();
                                            }
                                        }
                                    } else {
                                        throw zzaqw.m51282f();
                                    }
                                } else {
                                    return m104631j11;
                                }
                            }
                            return m104631j11;
                        }
                        i12 = m104631j11 + i22;
                        if (C33456Hw7.m103206i(bArr, m104631j11, i12)) {
                            interfaceC45964nu7.add(new String(bArr, m104631j11, i22, C46557ou7.f102752b));
                            m104631j11 = i12;
                            while (m104631j11 < i2) {
                            }
                            return m104631j11;
                        }
                        throw zzaqw.m51284d();
                    }
                    throw zzaqw.m51282f();
                }
                return i14;
            case 27:
                if (i5 == 2) {
                    return C33186Gs7.m104636e(m31616l(i6), i3, bArr, i, i2, interfaceC45964nu7, c32952Fs7);
                }
                return i14;
            case 28:
                if (i5 == 2) {
                    int m104631j13 = C33186Gs7.m104631j(bArr, i14, c32952Fs7);
                    int i24 = c32952Fs7.f10390a;
                    if (i24 >= 0) {
                        if (i24 <= bArr.length - m104631j13) {
                            if (i24 == 0) {
                                interfaceC45964nu7.add(AbstractC44175kt7.f95165c);
                                while (m104631j13 < i2) {
                                    int m104631j14 = C33186Gs7.m104631j(bArr, m104631j13, c32952Fs7);
                                    if (i3 == c32952Fs7.f10390a) {
                                        m104631j13 = C33186Gs7.m104631j(bArr, m104631j14, c32952Fs7);
                                        i24 = c32952Fs7.f10390a;
                                        if (i24 >= 0) {
                                            if (i24 <= bArr.length - m104631j13) {
                                                if (i24 == 0) {
                                                    interfaceC45964nu7.add(AbstractC44175kt7.f95165c);
                                                } else {
                                                    interfaceC45964nu7.add(AbstractC44175kt7.m28227D(bArr, m104631j13, i24));
                                                    m104631j13 += i24;
                                                    while (m104631j13 < i2) {
                                                    }
                                                }
                                            } else {
                                                throw zzaqw.m51278j();
                                            }
                                        } else {
                                            throw zzaqw.m51282f();
                                        }
                                    } else {
                                        return m104631j13;
                                    }
                                }
                                return m104631j13;
                            }
                            interfaceC45964nu7.add(AbstractC44175kt7.m28227D(bArr, m104631j13, i24));
                            m104631j13 += i24;
                            while (m104631j13 < i2) {
                            }
                            return m104631j13;
                        }
                        throw zzaqw.m51278j();
                    }
                    throw zzaqw.m51282f();
                }
                return i14;
            case 30:
            case 44:
                if (i5 == 2) {
                    m104631j = C33186Gs7.m104635f(bArr, i14, interfaceC45964nu7, c32952Fs7);
                } else {
                    if (i5 == 0) {
                        m104631j = C33186Gs7.m104629l(i3, bArr, i, i2, interfaceC45964nu7, c32952Fs7);
                    }
                    return i14;
                }
                AbstractC40627eu7 abstractC40627eu7 = (AbstractC40627eu7) obj;
                C49541tw7 c49541tw7 = abstractC40627eu7.zzc;
                if (c49541tw7 == C49541tw7.m11184c()) {
                    c49541tw7 = null;
                }
                Object m89391c = C35319Pv7.m89391c(i4, interfaceC45964nu7, m31617k(i6), c49541tw7, this.f91730m);
                if (m89391c != null) {
                    abstractC40627eu7.zzc = (C49541tw7) m89391c;
                    return m104631j;
                }
                return m104631j;
            case 33:
            case 47:
                if (i5 == 2) {
                    C41220fu7 c41220fu73 = (C41220fu7) interfaceC45964nu7;
                    int m104631j15 = C33186Gs7.m104631j(bArr, i14, c32952Fs7);
                    int i25 = c32952Fs7.f10390a + m104631j15;
                    while (m104631j15 < i25) {
                        m104631j15 = C33186Gs7.m104631j(bArr, m104631j15, c32952Fs7);
                        c41220fu73.m40571e(AbstractC46547ot7.m20347e(c32952Fs7.f10390a));
                    }
                    if (m104631j15 != i25) {
                        throw zzaqw.m51278j();
                    }
                    return m104631j15;
                }
                if (i5 == 0) {
                    C41220fu7 c41220fu74 = (C41220fu7) interfaceC45964nu7;
                    int m104631j16 = C33186Gs7.m104631j(bArr, i14, c32952Fs7);
                    c41220fu74.m40571e(AbstractC46547ot7.m20347e(c32952Fs7.f10390a));
                    while (m104631j16 < i2) {
                        int m104631j17 = C33186Gs7.m104631j(bArr, m104631j16, c32952Fs7);
                        if (i3 == c32952Fs7.f10390a) {
                            m104631j16 = C33186Gs7.m104631j(bArr, m104631j17, c32952Fs7);
                            c41220fu74.m40571e(AbstractC46547ot7.m20347e(c32952Fs7.f10390a));
                        } else {
                            return m104631j16;
                        }
                    }
                    return m104631j16;
                }
                return i14;
            case 34:
            case 48:
                if (i5 == 2) {
                    C36246Tu7 c36246Tu75 = (C36246Tu7) interfaceC45964nu7;
                    int m104631j18 = C33186Gs7.m104631j(bArr, i14, c32952Fs7);
                    int i26 = c32952Fs7.f10390a + m104631j18;
                    while (m104631j18 < i26) {
                        m104631j18 = C33186Gs7.m104628m(bArr, m104631j18, c32952Fs7);
                        c36246Tu75.m82270e(AbstractC46547ot7.m20346f(c32952Fs7.f10391b));
                    }
                    if (m104631j18 != i26) {
                        throw zzaqw.m51278j();
                    }
                    return m104631j18;
                }
                if (i5 == 0) {
                    C36246Tu7 c36246Tu76 = (C36246Tu7) interfaceC45964nu7;
                    int m104628m3 = C33186Gs7.m104628m(bArr, i14, c32952Fs7);
                    c36246Tu76.m82270e(AbstractC46547ot7.m20346f(c32952Fs7.f10391b));
                    while (m104628m3 < i2) {
                        int m104631j19 = C33186Gs7.m104631j(bArr, m104628m3, c32952Fs7);
                        if (i3 == c32952Fs7.f10390a) {
                            m104628m3 = C33186Gs7.m104628m(bArr, m104631j19, c32952Fs7);
                            c36246Tu76.m82270e(AbstractC46547ot7.m20346f(c32952Fs7.f10391b));
                        } else {
                            return m104628m3;
                        }
                    }
                    return m104628m3;
                }
                return i14;
            default:
                if (i5 == 3) {
                    InterfaceC34851Nv7 m31616l = m31616l(i6);
                    int i27 = (i3 & (-8)) | 4;
                    int m104638c = C33186Gs7.m104638c(m31616l, bArr, i, i2, i27, c32952Fs7);
                    interfaceC45964nu7.add(c32952Fs7.f10392c);
                    while (m104638c < i2) {
                        int m104631j20 = C33186Gs7.m104631j(bArr, m104638c, c32952Fs7);
                        if (i3 == c32952Fs7.f10390a) {
                            m104638c = C33186Gs7.m104638c(m31616l, bArr, m104631j20, i2, i27, c32952Fs7);
                            interfaceC45964nu7.add(c32952Fs7.f10392c);
                        } else {
                            return m104638c;
                        }
                    }
                    return m104638c;
                }
                return i14;
        }
    }

    /* renamed from: S */
    public final int m31624S(int i) {
        if (i < this.f91720c || i > this.f91721d) {
            return -1;
        }
        return m31621b(i, 0);
    }

    /* renamed from: T */
    public final int m31623T(int i, int i2) {
        if (i < this.f91720c || i > this.f91721d) {
            return -1;
        }
        return m31621b(i, i2);
    }

    /* renamed from: U */
    public final int m31622U(int i) {
        return this.f91718a[i + 2];
    }

    @Override // p000.InterfaceC34851Nv7
    /* renamed from: a */
    public final void mo29762a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.f91718a.length; i += 3) {
            int m31619i = m31619i(i);
            long j = 1048575 & m31619i;
            int i2 = this.f91718a[i];
            switch (m31620c(m31619i)) {
                case 0:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111233t(obj, j, C32286Cw7.m111247f(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111232u(obj, j, C32286Cw7.m111246g(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111230w(obj, j, C32286Cw7.m111244i(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111230w(obj, j, C32286Cw7.m111244i(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111231v(obj, j, C32286Cw7.m111245h(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111230w(obj, j, C32286Cw7.m111244i(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111231v(obj, j, C32286Cw7.m111245h(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111235r(obj, j, C32286Cw7.m111256B(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111229x(obj, j, C32286Cw7.m111242k(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m31612p(obj, obj2, i);
                    break;
                case 10:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111229x(obj, j, C32286Cw7.m111242k(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111231v(obj, j, C32286Cw7.m111245h(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111231v(obj, j, C32286Cw7.m111245h(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111231v(obj, j, C32286Cw7.m111245h(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111230w(obj, j, C32286Cw7.m111244i(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111231v(obj, j, C32286Cw7.m111245h(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m31603y(obj2, i)) {
                        C32286Cw7.m111230w(obj, j, C32286Cw7.m111244i(obj2, j));
                        m31609s(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m31612p(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
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
                    this.f91729l.mo84655c(obj, obj2, j);
                    break;
                case 50:
                    C35319Pv7.m89420B(this.f91733p, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m31641B(obj2, i2, i)) {
                        C32286Cw7.m111229x(obj, j, C32286Cw7.m111242k(obj2, j));
                        m31608t(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m31611q(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m31641B(obj2, i2, i)) {
                        C32286Cw7.m111229x(obj, j, C32286Cw7.m111242k(obj2, j));
                        m31608t(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m31611q(obj, obj2, i);
                    break;
            }
        }
        C35319Pv7.m89388f(this.f91730m, obj, obj2);
        if (this.f91723f) {
            C35319Pv7.m89389e(this.f91731n, obj, obj2);
        }
    }

    /* renamed from: b */
    public final int m31621b(int i, int i2) {
        int length = (this.f91718a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f91718a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    @Override // p000.InterfaceC34851Nv7
    /* renamed from: d */
    public final boolean mo29760d(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f91727j) {
            int i6 = this.f91726i[i5];
            int i7 = this.f91718a[i6];
            int m31619i = m31619i(i6);
            int i8 = this.f91718a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f91717r.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & m31619i) != 0 && !m31602z(obj, i6, i, i2, i10)) {
                return false;
            }
            int m31620c = m31620c(m31619i);
            if (m31620c != 9 && m31620c != 17) {
                if (m31620c != 27) {
                    if (m31620c != 60 && m31620c != 68) {
                        if (m31620c != 49) {
                            if (m31620c != 50) {
                                continue;
                            } else {
                                C37650Zu7 c37650Zu7 = (C37650Zu7) C32286Cw7.m111242k(obj, m31619i & 1048575);
                                if (!c37650Zu7.isEmpty() && ((C37416Yu7) m31614n(i6)).m74015c().f44208c.m101461a() == EnumC33924Jw7.MESSAGE) {
                                    InterfaceC34851Nv7 interfaceC34851Nv7 = null;
                                    for (Object obj2 : c37650Zu7.values()) {
                                        if (interfaceC34851Nv7 == null) {
                                            interfaceC34851Nv7 = C32979Fv7.m106247a().m106246b(obj2.getClass());
                                        }
                                        if (!interfaceC34851Nv7.mo29760d(obj2)) {
                                            return false;
                                        }
                                    }
                                    continue;
                                }
                            }
                        }
                    } else if (m31641B(obj, i7, i6) && !m31642A(obj, m31619i, m31616l(i6))) {
                        return false;
                    }
                }
                List list = (List) C32286Cw7.m111242k(obj, m31619i & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC34851Nv7 m31616l = m31616l(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m31616l.mo29760d(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m31602z(obj, i6, i, i2, i10) && !m31642A(obj, m31619i, m31616l(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f91723f && !this.f91731n.mo113395b(obj).m108236n()) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC34851Nv7
    /* renamed from: e */
    public final void mo29759e(Object obj, byte[] bArr, int i, int i2, C32952Fs7 c32952Fs7) throws IOException {
        if (this.f91725h) {
            m31626Q(obj, bArr, i, i2, c32952Fs7);
        } else {
            m31637F(obj, bArr, i, i2, 0, c32952Fs7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0507  */
    @Override // p000.InterfaceC34851Nv7
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo29758f(Object obj, InterfaceC34158Kw7 interfaceC34158Kw7) throws IOException {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        if (this.f91725h) {
            if (this.f91723f) {
                C32727Et7 mo113395b = this.f91731n.mo113395b(obj);
                if (!mo113395b.f8278a.isEmpty()) {
                    it = mo113395b.m108242h();
                    entry = (Map.Entry) it.next();
                    length = this.f91718a.length;
                    for (i = 0; i < length; i += 3) {
                        int m31619i = m31619i(i);
                        int i2 = this.f91718a[i];
                        while (entry != null && this.f91731n.mo113396a(entry) <= i2) {
                            this.f91731n.mo113388i(interfaceC34158Kw7, entry);
                            if (it.hasNext()) {
                                entry = (Map.Entry) it.next();
                            } else {
                                entry = null;
                            }
                        }
                        switch (m31620c(m31619i)) {
                            case 0:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7829g(i2, C32286Cw7.m111247f(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7826j(i2, C32286Cw7.m111246g(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7823m(i2, C32286Cw7.m111244i(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7845C(i2, C32286Cw7.m111244i(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7821o(i2, C32286Cw7.m111245h(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7825k(i2, C32286Cw7.m111244i(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7828h(i2, C32286Cw7.m111245h(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7830f(i2, C32286Cw7.m111256B(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (m31603y(obj, i)) {
                                    m31638E(i2, C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7841G(i2, C32286Cw7.m111242k(obj, m31619i & 1048575), m31616l(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7837K(i2, (AbstractC44175kt7) C32286Cw7.m111242k(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7842F(i2, C32286Cw7.m111245h(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7827i(i2, C32286Cw7.m111245h(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7838J(i2, C32286Cw7.m111245h(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7814v(i2, C32286Cw7.m111244i(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7847A(i2, C32286Cw7.m111245h(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7811y(i2, C32286Cw7.m111244i(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (m31603y(obj, i)) {
                                    interfaceC34158Kw7.mo7840H(i2, C32286Cw7.m111242k(obj, m31619i & 1048575), m31616l(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                C35319Pv7.m89384j(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, false);
                                break;
                            case 19:
                                C35319Pv7.m89380n(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, false);
                                break;
                            case 20:
                                C35319Pv7.m89377q(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, false);
                                break;
                            case 21:
                                C35319Pv7.m89369y(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, false);
                                break;
                            case 22:
                                C35319Pv7.m89378p(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, false);
                                break;
                            case 23:
                                C35319Pv7.m89381m(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, false);
                                break;
                            case 24:
                                C35319Pv7.m89382l(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, false);
                                break;
                            case 25:
                                C35319Pv7.m89386h(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, false);
                                break;
                            case 26:
                                C35319Pv7.m89371w(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7);
                                break;
                            case 27:
                                C35319Pv7.m89376r(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, m31616l(i));
                                break;
                            case 28:
                                C35319Pv7.m89385i(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7);
                                break;
                            case 29:
                                C35319Pv7.m89370x(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, false);
                                break;
                            case 30:
                                C35319Pv7.m89383k(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, false);
                                break;
                            case 31:
                                C35319Pv7.m89375s(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, false);
                                break;
                            case 32:
                                C35319Pv7.m89374t(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, false);
                                break;
                            case 33:
                                C35319Pv7.m89373u(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, false);
                                break;
                            case 34:
                                C35319Pv7.m89372v(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, false);
                                break;
                            case 35:
                                C35319Pv7.m89384j(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, true);
                                break;
                            case 36:
                                C35319Pv7.m89380n(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, true);
                                break;
                            case 37:
                                C35319Pv7.m89377q(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, true);
                                break;
                            case 38:
                                C35319Pv7.m89369y(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, true);
                                break;
                            case 39:
                                C35319Pv7.m89378p(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, true);
                                break;
                            case 40:
                                C35319Pv7.m89381m(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, true);
                                break;
                            case 41:
                                C35319Pv7.m89382l(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, true);
                                break;
                            case 42:
                                C35319Pv7.m89386h(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, true);
                                break;
                            case 43:
                                C35319Pv7.m89370x(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, true);
                                break;
                            case 44:
                                C35319Pv7.m89383k(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, true);
                                break;
                            case 45:
                                C35319Pv7.m89375s(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, true);
                                break;
                            case 46:
                                C35319Pv7.m89374t(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, true);
                                break;
                            case 47:
                                C35319Pv7.m89373u(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, true);
                                break;
                            case 48:
                                C35319Pv7.m89372v(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, true);
                                break;
                            case 49:
                                C35319Pv7.m89379o(this.f91718a[i], (List) C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7, m31616l(i));
                                break;
                            case 50:
                                m31606v(interfaceC34158Kw7, i2, C32286Cw7.m111242k(obj, m31619i & 1048575), i);
                                break;
                            case 51:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7829g(i2, m31633J(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7826j(i2, m31632K(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7823m(i2, m31618j(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7845C(i2, m31618j(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7821o(i2, m31629N(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7825k(i2, m31618j(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7828h(i2, m31629N(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7830f(i2, m31640C(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (m31641B(obj, i2, i)) {
                                    m31638E(i2, C32286Cw7.m111242k(obj, m31619i & 1048575), interfaceC34158Kw7);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7841G(i2, C32286Cw7.m111242k(obj, m31619i & 1048575), m31616l(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7837K(i2, (AbstractC44175kt7) C32286Cw7.m111242k(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7842F(i2, m31629N(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7827i(i2, m31629N(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7838J(i2, m31629N(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7814v(i2, m31618j(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7847A(i2, m31629N(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7811y(i2, m31618j(obj, m31619i & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (m31641B(obj, i2, i)) {
                                    interfaceC34158Kw7.mo7840H(i2, C32286Cw7.m111242k(obj, m31619i & 1048575), m31616l(i));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry != null) {
                        this.f91731n.mo113388i(interfaceC34158Kw7, entry);
                        if (it.hasNext()) {
                            entry = (Map.Entry) it.next();
                        } else {
                            entry = null;
                        }
                    }
                    AbstractC48948sw7 abstractC48948sw7 = this.f91730m;
                    abstractC48948sw7.mo9456q(abstractC48948sw7.mo9469d(obj), interfaceC34158Kw7);
                    return;
                }
            }
            it = null;
            entry = null;
            length = this.f91718a.length;
            while (i < length) {
            }
            while (entry != null) {
            }
            AbstractC48948sw7 abstractC48948sw72 = this.f91730m;
            abstractC48948sw72.mo9456q(abstractC48948sw72.mo9469d(obj), interfaceC34158Kw7);
            return;
        }
        m31607u(obj, interfaceC34158Kw7);
    }

    @Override // p000.InterfaceC34851Nv7
    /* renamed from: g */
    public final boolean mo29757g(Object obj, Object obj2) {
        boolean m89368z;
        int length = this.f91718a.length;
        for (int i = 0; i < length; i += 3) {
            int m31619i = m31619i(i);
            long j = m31619i & 1048575;
            switch (m31620c(m31619i)) {
                case 0:
                    if (m31605w(obj, obj2, i) && Double.doubleToLongBits(C32286Cw7.m111247f(obj, j)) == Double.doubleToLongBits(C32286Cw7.m111247f(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m31605w(obj, obj2, i) && Float.floatToIntBits(C32286Cw7.m111246g(obj, j)) == Float.floatToIntBits(C32286Cw7.m111246g(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m31605w(obj, obj2, i) && C32286Cw7.m111244i(obj, j) == C32286Cw7.m111244i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m31605w(obj, obj2, i) && C32286Cw7.m111244i(obj, j) == C32286Cw7.m111244i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m31605w(obj, obj2, i) && C32286Cw7.m111245h(obj, j) == C32286Cw7.m111245h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m31605w(obj, obj2, i) && C32286Cw7.m111244i(obj, j) == C32286Cw7.m111244i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m31605w(obj, obj2, i) && C32286Cw7.m111245h(obj, j) == C32286Cw7.m111245h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m31605w(obj, obj2, i) && C32286Cw7.m111256B(obj, j) == C32286Cw7.m111256B(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m31605w(obj, obj2, i) && C35319Pv7.m89368z(C32286Cw7.m111242k(obj, j), C32286Cw7.m111242k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m31605w(obj, obj2, i) && C35319Pv7.m89368z(C32286Cw7.m111242k(obj, j), C32286Cw7.m111242k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m31605w(obj, obj2, i) && C35319Pv7.m89368z(C32286Cw7.m111242k(obj, j), C32286Cw7.m111242k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m31605w(obj, obj2, i) && C32286Cw7.m111245h(obj, j) == C32286Cw7.m111245h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m31605w(obj, obj2, i) && C32286Cw7.m111245h(obj, j) == C32286Cw7.m111245h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m31605w(obj, obj2, i) && C32286Cw7.m111245h(obj, j) == C32286Cw7.m111245h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m31605w(obj, obj2, i) && C32286Cw7.m111244i(obj, j) == C32286Cw7.m111244i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m31605w(obj, obj2, i) && C32286Cw7.m111245h(obj, j) == C32286Cw7.m111245h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m31605w(obj, obj2, i) && C32286Cw7.m111244i(obj, j) == C32286Cw7.m111244i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m31605w(obj, obj2, i) && C35319Pv7.m89368z(C32286Cw7.m111242k(obj, j), C32286Cw7.m111242k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
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
                    m89368z = C35319Pv7.m89368z(C32286Cw7.m111242k(obj, j), C32286Cw7.m111242k(obj2, j));
                    break;
                case 50:
                    m89368z = C35319Pv7.m89368z(C32286Cw7.m111242k(obj, j), C32286Cw7.m111242k(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
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
                    long m31622U = m31622U(i) & 1048575;
                    if (C32286Cw7.m111245h(obj, m31622U) == C32286Cw7.m111245h(obj2, m31622U) && C35319Pv7.m89368z(C32286Cw7.m111242k(obj, j), C32286Cw7.m111242k(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!m89368z) {
                return false;
            }
        }
        if (!this.f91730m.mo9469d(obj).equals(this.f91730m.mo9469d(obj2))) {
            return false;
        }
        if (this.f91723f) {
            return this.f91731n.mo113395b(obj).equals(this.f91731n.mo113395b(obj2));
        }
        return true;
    }

    @Override // p000.InterfaceC34851Nv7
    /* renamed from: h */
    public final void mo29756h(Object obj, InterfaceC33681Iv7 interfaceC33681Iv7, C53068zt7 c53068zt7) throws IOException {
        Object mo113393d;
        c53068zt7.getClass();
        AbstractC48948sw7 abstractC48948sw7 = this.f91730m;
        AbstractC31791At7 abstractC31791At7 = this.f91731n;
        C32727Et7 c32727Et7 = null;
        Object obj2 = null;
        while (true) {
            try {
                int zzc = interfaceC33681Iv7.zzc();
                int m31624S = m31624S(zzc);
                if (m31624S < 0) {
                    if (zzc == Integer.MAX_VALUE) {
                        for (int i = this.f91727j; i < this.f91728k; i++) {
                            obj2 = m31615m(obj, this.f91726i[i], obj2, abstractC48948sw7);
                        }
                        if (obj2 != null) {
                            abstractC48948sw7.mo9459n(obj, obj2);
                            return;
                        }
                        return;
                    }
                    if (!this.f91723f) {
                        mo113393d = null;
                    } else {
                        mo113393d = abstractC31791At7.mo113393d(c53068zt7, this.f91722e, zzc);
                    }
                    if (mo113393d != null) {
                        if (c32727Et7 == null) {
                            c32727Et7 = abstractC31791At7.mo113394c(obj);
                        }
                        C32727Et7 c32727Et72 = c32727Et7;
                        obj2 = abstractC31791At7.mo113392e(interfaceC33681Iv7, mo113393d, c53068zt7, c32727Et72, obj2, abstractC48948sw7);
                        c32727Et7 = c32727Et72;
                    } else {
                        abstractC48948sw7.mo9455s(interfaceC33681Iv7);
                        if (obj2 == null) {
                            obj2 = abstractC48948sw7.mo9470c(obj);
                        }
                        if (!abstractC48948sw7.m13374r(obj2, interfaceC33681Iv7)) {
                            for (int i2 = this.f91727j; i2 < this.f91728k; i2++) {
                                obj2 = m31615m(obj, this.f91726i[i2], obj2, abstractC48948sw7);
                            }
                            if (obj2 != null) {
                                abstractC48948sw7.mo9459n(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    int m31619i = m31619i(m31624S);
                    try {
                        switch (m31620c(m31619i)) {
                            case 0:
                                C32286Cw7.m111233t(obj, m31619i & 1048575, interfaceC33681Iv7.zza());
                                m31609s(obj, m31624S);
                                break;
                            case 1:
                                C32286Cw7.m111232u(obj, m31619i & 1048575, interfaceC33681Iv7.zzb());
                                m31609s(obj, m31624S);
                                break;
                            case 2:
                                C32286Cw7.m111230w(obj, m31619i & 1048575, interfaceC33681Iv7.mo18532j());
                                m31609s(obj, m31624S);
                                break;
                            case 3:
                                C32286Cw7.m111230w(obj, m31619i & 1048575, interfaceC33681Iv7.mo18536f());
                                m31609s(obj, m31624S);
                                break;
                            case 4:
                                C32286Cw7.m111231v(obj, m31619i & 1048575, interfaceC33681Iv7.zzg());
                                m31609s(obj, m31624S);
                                break;
                            case 5:
                                C32286Cw7.m111230w(obj, m31619i & 1048575, interfaceC33681Iv7.mo18541a());
                                m31609s(obj, m31624S);
                                break;
                            case 6:
                                C32286Cw7.m111231v(obj, m31619i & 1048575, interfaceC33681Iv7.mo18518x());
                                m31609s(obj, m31624S);
                                break;
                            case 7:
                                C32286Cw7.m111235r(obj, m31619i & 1048575, interfaceC33681Iv7.mo18534h());
                                m31609s(obj, m31624S);
                                break;
                            case 8:
                                m31610r(obj, m31619i, interfaceC33681Iv7);
                                m31609s(obj, m31624S);
                                break;
                            case 9:
                                if (m31603y(obj, m31624S)) {
                                    long j = m31619i & 1048575;
                                    C32286Cw7.m111229x(obj, j, C46557ou7.m20291g(C32286Cw7.m111242k(obj, j), interfaceC33681Iv7.mo18553D(m31616l(m31624S), c53068zt7)));
                                    break;
                                } else {
                                    C32286Cw7.m111229x(obj, m31619i & 1048575, interfaceC33681Iv7.mo18553D(m31616l(m31624S), c53068zt7));
                                    m31609s(obj, m31624S);
                                    break;
                                }
                            case 10:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, interfaceC33681Iv7.mo18538d());
                                m31609s(obj, m31624S);
                                break;
                            case 11:
                                C32286Cw7.m111231v(obj, m31619i & 1048575, interfaceC33681Iv7.mo18539c());
                                m31609s(obj, m31624S);
                                break;
                            case 12:
                                int zze = interfaceC33681Iv7.zze();
                                InterfaceC42999iu7 m31617k = m31617k(m31624S);
                                if (m31617k != null && !m31617k.zza(zze)) {
                                    obj2 = C35319Pv7.m89390d(zzc, zze, obj2, abstractC48948sw7);
                                    break;
                                }
                                C32286Cw7.m111231v(obj, m31619i & 1048575, zze);
                                m31609s(obj, m31624S);
                                break;
                            case 13:
                                C32286Cw7.m111231v(obj, m31619i & 1048575, interfaceC33681Iv7.zzh());
                                m31609s(obj, m31624S);
                                break;
                            case 14:
                                C32286Cw7.m111230w(obj, m31619i & 1048575, interfaceC33681Iv7.mo18540b());
                                m31609s(obj, m31624S);
                                break;
                            case 15:
                                C32286Cw7.m111231v(obj, m31619i & 1048575, interfaceC33681Iv7.zzi());
                                m31609s(obj, m31624S);
                                break;
                            case 16:
                                C32286Cw7.m111230w(obj, m31619i & 1048575, interfaceC33681Iv7.mo18537e());
                                m31609s(obj, m31624S);
                                break;
                            case 17:
                                if (m31603y(obj, m31624S)) {
                                    long j2 = m31619i & 1048575;
                                    C32286Cw7.m111229x(obj, j2, C46557ou7.m20291g(C32286Cw7.m111242k(obj, j2), interfaceC33681Iv7.mo18552E(m31616l(m31624S), c53068zt7)));
                                    break;
                                } else {
                                    C32286Cw7.m111229x(obj, m31619i & 1048575, interfaceC33681Iv7.mo18552E(m31616l(m31624S), c53068zt7));
                                    m31609s(obj, m31624S);
                                    break;
                                }
                            case 18:
                                interfaceC33681Iv7.mo18529m(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 19:
                                interfaceC33681Iv7.mo18556A(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 20:
                                interfaceC33681Iv7.mo18520v(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 21:
                                interfaceC33681Iv7.mo18525q(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 22:
                                interfaceC33681Iv7.mo18519w(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 23:
                                interfaceC33681Iv7.mo18516z(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 24:
                                interfaceC33681Iv7.mo18527o(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 25:
                                interfaceC33681Iv7.mo18526p(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 26:
                                if (m31604x(m31619i)) {
                                    ((C47140pt7) interfaceC33681Iv7).m18550G(this.f91729l.mo84657a(obj, m31619i & 1048575), true);
                                    break;
                                } else {
                                    ((C47140pt7) interfaceC33681Iv7).m18550G(this.f91729l.mo84657a(obj, m31619i & 1048575), false);
                                    break;
                                }
                            case 27:
                                interfaceC33681Iv7.mo18555B(this.f91729l.mo84657a(obj, m31619i & 1048575), m31616l(m31624S), c53068zt7);
                                break;
                            case 28:
                                interfaceC33681Iv7.mo18528n(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 29:
                                interfaceC33681Iv7.mo18524r(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 30:
                                List mo84657a = this.f91729l.mo84657a(obj, m31619i & 1048575);
                                interfaceC33681Iv7.mo18530l(mo84657a);
                                obj2 = C35319Pv7.m89391c(zzc, mo84657a, m31617k(m31624S), obj2, abstractC48948sw7);
                                break;
                            case 31:
                                interfaceC33681Iv7.mo18517y(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 32:
                                interfaceC33681Iv7.mo18522t(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 33:
                                interfaceC33681Iv7.mo18523s(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 34:
                                interfaceC33681Iv7.mo18521u(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 35:
                                interfaceC33681Iv7.mo18529m(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 36:
                                interfaceC33681Iv7.mo18556A(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 37:
                                interfaceC33681Iv7.mo18520v(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 38:
                                interfaceC33681Iv7.mo18525q(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 39:
                                interfaceC33681Iv7.mo18519w(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 40:
                                interfaceC33681Iv7.mo18516z(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 41:
                                interfaceC33681Iv7.mo18527o(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 42:
                                interfaceC33681Iv7.mo18526p(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 43:
                                interfaceC33681Iv7.mo18524r(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 44:
                                List mo84657a2 = this.f91729l.mo84657a(obj, m31619i & 1048575);
                                interfaceC33681Iv7.mo18530l(mo84657a2);
                                obj2 = C35319Pv7.m89391c(zzc, mo84657a2, m31617k(m31624S), obj2, abstractC48948sw7);
                                break;
                            case 45:
                                interfaceC33681Iv7.mo18517y(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 46:
                                interfaceC33681Iv7.mo18522t(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 47:
                                interfaceC33681Iv7.mo18523s(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 48:
                                interfaceC33681Iv7.mo18521u(this.f91729l.mo84657a(obj, m31619i & 1048575));
                                break;
                            case 49:
                                interfaceC33681Iv7.mo18554C(this.f91729l.mo84657a(obj, m31619i & 1048575), m31616l(m31624S), c53068zt7);
                                break;
                            case 50:
                                Object m31614n = m31614n(m31624S);
                                long m31619i2 = m31619i(m31624S) & 1048575;
                                Object m111242k = C32286Cw7.m111242k(obj, m31619i2);
                                if (m111242k == null) {
                                    m111242k = C37650Zu7.m72314d().m72313e();
                                    C32286Cw7.m111229x(obj, m31619i2, m111242k);
                                } else if (C38248av7.m65249b(m111242k)) {
                                    Object m72313e = C37650Zu7.m72314d().m72313e();
                                    C38248av7.m65248c(m72313e, m111242k);
                                    C32286Cw7.m111229x(obj, m31619i2, m72313e);
                                    m111242k = m72313e;
                                }
                                interfaceC33681Iv7.mo18551F((C37650Zu7) m111242k, ((C37416Yu7) m31614n).m74015c(), c53068zt7);
                                break;
                            case 51:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, Double.valueOf(interfaceC33681Iv7.zza()));
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 52:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, Float.valueOf(interfaceC33681Iv7.zzb()));
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 53:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, Long.valueOf(interfaceC33681Iv7.mo18532j()));
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 54:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, Long.valueOf(interfaceC33681Iv7.mo18536f()));
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 55:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, Integer.valueOf(interfaceC33681Iv7.zzg()));
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 56:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, Long.valueOf(interfaceC33681Iv7.mo18541a()));
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 57:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, Integer.valueOf(interfaceC33681Iv7.mo18518x()));
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 58:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, Boolean.valueOf(interfaceC33681Iv7.mo18534h()));
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 59:
                                m31610r(obj, m31619i, interfaceC33681Iv7);
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 60:
                                if (m31641B(obj, zzc, m31624S)) {
                                    long j3 = m31619i & 1048575;
                                    C32286Cw7.m111229x(obj, j3, C46557ou7.m20291g(C32286Cw7.m111242k(obj, j3), interfaceC33681Iv7.mo18553D(m31616l(m31624S), c53068zt7)));
                                } else {
                                    C32286Cw7.m111229x(obj, m31619i & 1048575, interfaceC33681Iv7.mo18553D(m31616l(m31624S), c53068zt7));
                                    m31609s(obj, m31624S);
                                }
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 61:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, interfaceC33681Iv7.mo18538d());
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 62:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, Integer.valueOf(interfaceC33681Iv7.mo18539c()));
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 63:
                                int zze2 = interfaceC33681Iv7.zze();
                                InterfaceC42999iu7 m31617k2 = m31617k(m31624S);
                                if (m31617k2 != null && !m31617k2.zza(zze2)) {
                                    obj2 = C35319Pv7.m89390d(zzc, zze2, obj2, abstractC48948sw7);
                                    break;
                                }
                                C32286Cw7.m111229x(obj, m31619i & 1048575, Integer.valueOf(zze2));
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 64:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, Integer.valueOf(interfaceC33681Iv7.zzh()));
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 65:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, Long.valueOf(interfaceC33681Iv7.mo18540b()));
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 66:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, Integer.valueOf(interfaceC33681Iv7.zzi()));
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 67:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, Long.valueOf(interfaceC33681Iv7.mo18537e()));
                                m31608t(obj, zzc, m31624S);
                                break;
                            case 68:
                                C32286Cw7.m111229x(obj, m31619i & 1048575, interfaceC33681Iv7.mo18552E(m31616l(m31624S), c53068zt7));
                                m31608t(obj, zzc, m31624S);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = abstractC48948sw7.mo9467f();
                                }
                                if (!abstractC48948sw7.m13374r(obj2, interfaceC33681Iv7)) {
                                    for (int i3 = this.f91727j; i3 < this.f91728k; i3++) {
                                        obj2 = m31615m(obj, this.f91726i[i3], obj2, abstractC48948sw7);
                                    }
                                    if (obj2 != null) {
                                        abstractC48948sw7.mo9459n(obj, obj2);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzaqv unused) {
                        abstractC48948sw7.mo9455s(interfaceC33681Iv7);
                        if (obj2 == null) {
                            obj2 = abstractC48948sw7.mo9470c(obj);
                        }
                        if (!abstractC48948sw7.m13374r(obj2, interfaceC33681Iv7)) {
                            for (int i4 = this.f91727j; i4 < this.f91728k; i4++) {
                                obj2 = m31615m(obj, this.f91726i[i4], obj2, abstractC48948sw7);
                            }
                            if (obj2 != null) {
                                abstractC48948sw7.mo9459n(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.f91727j; i5 < this.f91728k; i5++) {
                    obj2 = m31615m(obj, this.f91726i[i5], obj2, abstractC48948sw7);
                }
                if (obj2 != null) {
                    abstractC48948sw7.mo9459n(obj, obj2);
                }
                throw th;
            }
        }
    }

    /* renamed from: i */
    public final int m31619i(int i) {
        return this.f91718a[i + 1];
    }

    /* renamed from: k */
    public final InterfaceC42999iu7 m31617k(int i) {
        int i2 = i / 3;
        return (InterfaceC42999iu7) this.f91719b[i2 + i2 + 1];
    }

    /* renamed from: l */
    public final InterfaceC34851Nv7 m31616l(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        InterfaceC34851Nv7 interfaceC34851Nv7 = (InterfaceC34851Nv7) this.f91719b[i3];
        if (interfaceC34851Nv7 != null) {
            return interfaceC34851Nv7;
        }
        InterfaceC34851Nv7 m106246b = C32979Fv7.m106247a().m106246b((Class) this.f91719b[i3 + 1]);
        this.f91719b[i3] = m106246b;
        return m106246b;
    }

    /* renamed from: m */
    public final Object m31615m(Object obj, int i, Object obj2, AbstractC48948sw7 abstractC48948sw7) {
        int i2 = this.f91718a[i];
        Object m111242k = C32286Cw7.m111242k(obj, m31619i(i) & 1048575);
        if (m111242k == null) {
            return obj2;
        }
        InterfaceC42999iu7 m31617k = m31617k(i);
        if (m31617k == null) {
            return obj2;
        }
        C37182Xu7 m74015c = ((C37416Yu7) m31614n(i)).m74015c();
        Iterator it = ((C37650Zu7) m111242k).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!m31617k.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = abstractC48948sw7.mo9467f();
                }
                int m74016b = C37416Yu7.m74016b(m74015c, entry.getKey(), entry.getValue());
                AbstractC44175kt7 abstractC44175kt7 = AbstractC44175kt7.f95165c;
                byte[] bArr = new byte[m74016b];
                AbstractC50104ut7 m9556o = AbstractC50104ut7.m9556o(bArr);
                try {
                    C37416Yu7.m74013e(m9556o, m74015c, entry.getKey(), entry.getValue());
                    abstractC48948sw7.mo9462k(obj2, i2, C41803gt7.m37360a(m9556o, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    /* renamed from: n */
    public final Object m31614n(int i) {
        int i2 = i / 3;
        return this.f91719b[i2 + i2];
    }

    /* renamed from: p */
    public final void m31612p(Object obj, Object obj2, int i) {
        long m31619i = m31619i(i) & 1048575;
        if (!m31603y(obj2, i)) {
            return;
        }
        Object m111242k = C32286Cw7.m111242k(obj, m31619i);
        Object m111242k2 = C32286Cw7.m111242k(obj2, m31619i);
        if (m111242k != null && m111242k2 != null) {
            C32286Cw7.m111229x(obj, m31619i, C46557ou7.m20291g(m111242k, m111242k2));
            m31609s(obj, i);
        } else if (m111242k2 != null) {
            C32286Cw7.m111229x(obj, m31619i, m111242k2);
            m31609s(obj, i);
        }
    }

    /* renamed from: q */
    public final void m31611q(Object obj, Object obj2, int i) {
        Object obj3;
        int m31619i = m31619i(i);
        int i2 = this.f91718a[i];
        long j = m31619i & 1048575;
        if (!m31641B(obj2, i2, i)) {
            return;
        }
        if (m31641B(obj, i2, i)) {
            obj3 = C32286Cw7.m111242k(obj, j);
        } else {
            obj3 = null;
        }
        Object m111242k = C32286Cw7.m111242k(obj2, j);
        if (obj3 != null && m111242k != null) {
            C32286Cw7.m111229x(obj, j, C46557ou7.m20291g(obj3, m111242k));
            m31608t(obj, i2, i);
        } else if (m111242k != null) {
            C32286Cw7.m111229x(obj, j, m111242k);
            m31608t(obj, i2, i);
        }
    }

    /* renamed from: r */
    public final void m31610r(Object obj, int i, InterfaceC33681Iv7 interfaceC33681Iv7) throws IOException {
        if (m31604x(i)) {
            C32286Cw7.m111229x(obj, i & 1048575, interfaceC33681Iv7.mo18533i());
        } else if (this.f91724g) {
            C32286Cw7.m111229x(obj, i & 1048575, interfaceC33681Iv7.mo18535g());
        } else {
            C32286Cw7.m111229x(obj, i & 1048575, interfaceC33681Iv7.mo18538d());
        }
    }

    /* renamed from: s */
    public final void m31609s(Object obj, int i) {
        int m31622U = m31622U(i);
        long j = 1048575 & m31622U;
        if (j == 1048575) {
            return;
        }
        C32286Cw7.m111231v(obj, j, (1 << (m31622U >>> 20)) | C32286Cw7.m111245h(obj, j));
    }

    /* renamed from: t */
    public final void m31608t(Object obj, int i, int i2) {
        C32286Cw7.m111231v(obj, m31622U(i2) & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0489  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m31607u(Object obj, InterfaceC34158Kw7 interfaceC34158Kw7) throws IOException {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        int i2;
        boolean z;
        if (this.f91723f) {
            C32727Et7 mo113395b = this.f91731n.mo113395b(obj);
            if (!mo113395b.f8278a.isEmpty()) {
                it = mo113395b.m108242h();
                entry = (Map.Entry) it.next();
                length = this.f91718a.length;
                Unsafe unsafe = f91717r;
                int i3 = 1048575;
                int i4 = 0;
                for (i = 0; i < length; i += 3) {
                    int m31619i = m31619i(i);
                    int[] iArr = this.f91718a;
                    int i5 = iArr[i];
                    int m31620c = m31620c(m31619i);
                    if (m31620c <= 17) {
                        int i6 = iArr[i + 2];
                        int i7 = i6 & 1048575;
                        if (i7 != i3) {
                            i4 = unsafe.getInt(obj, i7);
                            i3 = i7;
                        }
                        i2 = 1 << (i6 >>> 20);
                    } else {
                        i2 = 0;
                    }
                    while (entry != null && this.f91731n.mo113396a(entry) <= i5) {
                        this.f91731n.mo113388i(interfaceC34158Kw7, entry);
                        if (it.hasNext()) {
                            entry = (Map.Entry) it.next();
                        } else {
                            entry = null;
                        }
                    }
                    long j = m31619i & 1048575;
                    switch (m31620c) {
                        case 0:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7829g(i5, C32286Cw7.m111247f(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7826j(i5, C32286Cw7.m111246g(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7823m(i5, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7845C(i5, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7821o(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7825k(i5, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7828h(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7830f(i5, C32286Cw7.m111256B(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if ((i2 & i4) != 0) {
                                m31638E(i5, unsafe.getObject(obj, j), interfaceC34158Kw7);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7841G(i5, unsafe.getObject(obj, j), m31616l(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7837K(i5, (AbstractC44175kt7) unsafe.getObject(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7842F(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7827i(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7838J(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7814v(i5, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7847A(i5, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7811y(i5, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if ((i2 & i4) != 0) {
                                interfaceC34158Kw7.mo7840H(i5, unsafe.getObject(obj, j), m31616l(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            z = false;
                            C35319Pv7.m89384j(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, false);
                            break;
                        case 19:
                            z = false;
                            C35319Pv7.m89380n(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, false);
                            break;
                        case 20:
                            z = false;
                            C35319Pv7.m89377q(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, false);
                            break;
                        case 21:
                            z = false;
                            C35319Pv7.m89369y(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, false);
                            break;
                        case 22:
                            z = false;
                            C35319Pv7.m89378p(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, false);
                            break;
                        case 23:
                            z = false;
                            C35319Pv7.m89381m(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, false);
                            break;
                        case 24:
                            z = false;
                            C35319Pv7.m89382l(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, false);
                            break;
                        case 25:
                            z = false;
                            C35319Pv7.m89386h(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, false);
                            break;
                        case 26:
                            C35319Pv7.m89371w(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7);
                            break;
                        case 27:
                            C35319Pv7.m89376r(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, m31616l(i));
                            break;
                        case 28:
                            C35319Pv7.m89385i(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7);
                            break;
                        case 29:
                            z = false;
                            C35319Pv7.m89370x(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, false);
                            break;
                        case 30:
                            z = false;
                            C35319Pv7.m89383k(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, false);
                            break;
                        case 31:
                            z = false;
                            C35319Pv7.m89375s(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, false);
                            break;
                        case 32:
                            z = false;
                            C35319Pv7.m89374t(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, false);
                            break;
                        case 33:
                            z = false;
                            C35319Pv7.m89373u(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, false);
                            break;
                        case 34:
                            z = false;
                            C35319Pv7.m89372v(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, false);
                            break;
                        case 35:
                            C35319Pv7.m89384j(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, true);
                            break;
                        case 36:
                            C35319Pv7.m89380n(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, true);
                            break;
                        case 37:
                            C35319Pv7.m89377q(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, true);
                            break;
                        case 38:
                            C35319Pv7.m89369y(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, true);
                            break;
                        case 39:
                            C35319Pv7.m89378p(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, true);
                            break;
                        case 40:
                            C35319Pv7.m89381m(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, true);
                            break;
                        case 41:
                            C35319Pv7.m89382l(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, true);
                            break;
                        case 42:
                            C35319Pv7.m89386h(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, true);
                            break;
                        case 43:
                            C35319Pv7.m89370x(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, true);
                            break;
                        case 44:
                            C35319Pv7.m89383k(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, true);
                            break;
                        case 45:
                            C35319Pv7.m89375s(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, true);
                            break;
                        case 46:
                            C35319Pv7.m89374t(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, true);
                            break;
                        case 47:
                            C35319Pv7.m89373u(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, true);
                            break;
                        case 48:
                            C35319Pv7.m89372v(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, true);
                            break;
                        case 49:
                            C35319Pv7.m89379o(this.f91718a[i], (List) unsafe.getObject(obj, j), interfaceC34158Kw7, m31616l(i));
                            break;
                        case 50:
                            m31606v(interfaceC34158Kw7, i5, unsafe.getObject(obj, j), i);
                            break;
                        case 51:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7829g(i5, m31633J(obj, j));
                            }
                            break;
                        case 52:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7826j(i5, m31632K(obj, j));
                            }
                            break;
                        case 53:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7823m(i5, m31618j(obj, j));
                            }
                            break;
                        case 54:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7845C(i5, m31618j(obj, j));
                            }
                            break;
                        case 55:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7821o(i5, m31629N(obj, j));
                            }
                            break;
                        case 56:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7825k(i5, m31618j(obj, j));
                            }
                            break;
                        case 57:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7828h(i5, m31629N(obj, j));
                            }
                            break;
                        case 58:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7830f(i5, m31640C(obj, j));
                            }
                            break;
                        case 59:
                            if (m31641B(obj, i5, i)) {
                                m31638E(i5, unsafe.getObject(obj, j), interfaceC34158Kw7);
                            }
                            break;
                        case 60:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7841G(i5, unsafe.getObject(obj, j), m31616l(i));
                            }
                            break;
                        case 61:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7837K(i5, (AbstractC44175kt7) unsafe.getObject(obj, j));
                            }
                            break;
                        case 62:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7842F(i5, m31629N(obj, j));
                            }
                            break;
                        case 63:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7827i(i5, m31629N(obj, j));
                            }
                            break;
                        case 64:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7838J(i5, m31629N(obj, j));
                            }
                            break;
                        case 65:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7814v(i5, m31618j(obj, j));
                            }
                            break;
                        case 66:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7847A(i5, m31629N(obj, j));
                            }
                            break;
                        case 67:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7811y(i5, m31618j(obj, j));
                            }
                            break;
                        case 68:
                            if (m31641B(obj, i5, i)) {
                                interfaceC34158Kw7.mo7840H(i5, unsafe.getObject(obj, j), m31616l(i));
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.f91731n.mo113388i(interfaceC34158Kw7, entry);
                    if (it.hasNext()) {
                        entry = (Map.Entry) it.next();
                    } else {
                        entry = null;
                    }
                }
                AbstractC48948sw7 abstractC48948sw7 = this.f91730m;
                abstractC48948sw7.mo9456q(abstractC48948sw7.mo9469d(obj), interfaceC34158Kw7);
            }
        }
        it = null;
        entry = null;
        length = this.f91718a.length;
        Unsafe unsafe2 = f91717r;
        int i32 = 1048575;
        int i42 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        AbstractC48948sw7 abstractC48948sw72 = this.f91730m;
        abstractC48948sw72.mo9456q(abstractC48948sw72.mo9469d(obj), interfaceC34158Kw7);
    }

    /* renamed from: v */
    public final void m31606v(InterfaceC34158Kw7 interfaceC34158Kw7, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            interfaceC34158Kw7.mo7810z(i, ((C37416Yu7) m31614n(i2)).m74015c(), (C37650Zu7) obj);
        }
    }

    /* renamed from: w */
    public final boolean m31605w(Object obj, Object obj2, int i) {
        return m31603y(obj, i) == m31603y(obj2, i);
    }

    /* renamed from: y */
    public final boolean m31603y(Object obj, int i) {
        int m31622U = m31622U(i);
        long j = m31622U & 1048575;
        if (j == 1048575) {
            int m31619i = m31619i(i);
            long j2 = m31619i & 1048575;
            switch (m31620c(m31619i)) {
                case 0:
                    if (Double.doubleToRawLongBits(C32286Cw7.m111247f(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(C32286Cw7.m111246g(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C32286Cw7.m111244i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C32286Cw7.m111244i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C32286Cw7.m111245h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C32286Cw7.m111244i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C32286Cw7.m111245h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C32286Cw7.m111256B(obj, j2);
                case 8:
                    Object m111242k = C32286Cw7.m111242k(obj, j2);
                    if (m111242k instanceof String) {
                        if (((String) m111242k).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m111242k instanceof AbstractC44175kt7) {
                        if (AbstractC44175kt7.f95165c.equals(m111242k)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (C32286Cw7.m111242k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC44175kt7.f95165c.equals(C32286Cw7.m111242k(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (C32286Cw7.m111245h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C32286Cw7.m111245h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (C32286Cw7.m111245h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C32286Cw7.m111244i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C32286Cw7.m111245h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C32286Cw7.m111244i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C32286Cw7.m111242k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((C32286Cw7.m111245h(obj, j) & (1 << (m31622U >>> 20))) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: z */
    public final boolean m31602z(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m31603y(obj, i) : (i3 & i4) != 0;
    }

    @Override // p000.InterfaceC34851Nv7
    public final int zza(Object obj) {
        return this.f91725h ? m31630M(obj) : m31631L(obj);
    }

    @Override // p000.InterfaceC34851Nv7
    public final int zzb(Object obj) {
        int i;
        int m20295c;
        int length = this.f91718a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m31619i = m31619i(i3);
            int i4 = this.f91718a[i3];
            long j = 1048575 & m31619i;
            int i5 = 37;
            switch (m31620c(m31619i)) {
                case 0:
                    i = i2 * 53;
                    m20295c = C46557ou7.m20295c(Double.doubleToLongBits(C32286Cw7.m111247f(obj, j)));
                    i2 = i + m20295c;
                    break;
                case 1:
                    i = i2 * 53;
                    m20295c = Float.floatToIntBits(C32286Cw7.m111246g(obj, j));
                    i2 = i + m20295c;
                    break;
                case 2:
                    i = i2 * 53;
                    m20295c = C46557ou7.m20295c(C32286Cw7.m111244i(obj, j));
                    i2 = i + m20295c;
                    break;
                case 3:
                    i = i2 * 53;
                    m20295c = C46557ou7.m20295c(C32286Cw7.m111244i(obj, j));
                    i2 = i + m20295c;
                    break;
                case 4:
                    i = i2 * 53;
                    m20295c = C32286Cw7.m111245h(obj, j);
                    i2 = i + m20295c;
                    break;
                case 5:
                    i = i2 * 53;
                    m20295c = C46557ou7.m20295c(C32286Cw7.m111244i(obj, j));
                    i2 = i + m20295c;
                    break;
                case 6:
                    i = i2 * 53;
                    m20295c = C32286Cw7.m111245h(obj, j);
                    i2 = i + m20295c;
                    break;
                case 7:
                    i = i2 * 53;
                    m20295c = C46557ou7.m20297a(C32286Cw7.m111256B(obj, j));
                    i2 = i + m20295c;
                    break;
                case 8:
                    i = i2 * 53;
                    m20295c = ((String) C32286Cw7.m111242k(obj, j)).hashCode();
                    i2 = i + m20295c;
                    break;
                case 9:
                    Object m111242k = C32286Cw7.m111242k(obj, j);
                    if (m111242k != null) {
                        i5 = m111242k.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    m20295c = C32286Cw7.m111242k(obj, j).hashCode();
                    i2 = i + m20295c;
                    break;
                case 11:
                    i = i2 * 53;
                    m20295c = C32286Cw7.m111245h(obj, j);
                    i2 = i + m20295c;
                    break;
                case 12:
                    i = i2 * 53;
                    m20295c = C32286Cw7.m111245h(obj, j);
                    i2 = i + m20295c;
                    break;
                case 13:
                    i = i2 * 53;
                    m20295c = C32286Cw7.m111245h(obj, j);
                    i2 = i + m20295c;
                    break;
                case 14:
                    i = i2 * 53;
                    m20295c = C46557ou7.m20295c(C32286Cw7.m111244i(obj, j));
                    i2 = i + m20295c;
                    break;
                case 15:
                    i = i2 * 53;
                    m20295c = C32286Cw7.m111245h(obj, j);
                    i2 = i + m20295c;
                    break;
                case 16:
                    i = i2 * 53;
                    m20295c = C46557ou7.m20295c(C32286Cw7.m111244i(obj, j));
                    i2 = i + m20295c;
                    break;
                case 17:
                    Object m111242k2 = C32286Cw7.m111242k(obj, j);
                    if (m111242k2 != null) {
                        i5 = m111242k2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
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
                    i = i2 * 53;
                    m20295c = C32286Cw7.m111242k(obj, j).hashCode();
                    i2 = i + m20295c;
                    break;
                case 50:
                    i = i2 * 53;
                    m20295c = C32286Cw7.m111242k(obj, j).hashCode();
                    i2 = i + m20295c;
                    break;
                case 51:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = C46557ou7.m20295c(Double.doubleToLongBits(m31633J(obj, j)));
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = Float.floatToIntBits(m31632K(obj, j));
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = C46557ou7.m20295c(m31618j(obj, j));
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = C46557ou7.m20295c(m31618j(obj, j));
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = m31629N(obj, j);
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = C46557ou7.m20295c(m31618j(obj, j));
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = m31629N(obj, j);
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = C46557ou7.m20297a(m31640C(obj, j));
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = ((String) C32286Cw7.m111242k(obj, j)).hashCode();
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = C32286Cw7.m111242k(obj, j).hashCode();
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = C32286Cw7.m111242k(obj, j).hashCode();
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = m31629N(obj, j);
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = m31629N(obj, j);
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = m31629N(obj, j);
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = C46557ou7.m20295c(m31618j(obj, j));
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = m31629N(obj, j);
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = C46557ou7.m20295c(m31618j(obj, j));
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m31641B(obj, i4, i3)) {
                        i = i2 * 53;
                        m20295c = C32286Cw7.m111242k(obj, j).hashCode();
                        i2 = i + m20295c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f91730m.mo9469d(obj).hashCode();
        if (this.f91723f) {
            return (hashCode * 53) + this.f91731n.mo113395b(obj).f8278a.hashCode();
        }
        return hashCode;
    }

    @Override // p000.InterfaceC34851Nv7
    public final Object zze() {
        return ((AbstractC40627eu7) this.f91722e).mo5B(4, null, null);
    }

    @Override // p000.InterfaceC34851Nv7
    public final void zzf(Object obj) {
        int i;
        int i2 = this.f91727j;
        while (true) {
            i = this.f91728k;
            if (i2 >= i) {
                break;
            }
            long m31619i = m31619i(this.f91726i[i2]) & 1048575;
            Object m111242k = C32286Cw7.m111242k(obj, m31619i);
            if (m111242k != null) {
                ((C37650Zu7) m111242k).m72312f();
                C32286Cw7.m111229x(obj, m31619i, m111242k);
            }
            i2++;
        }
        int length = this.f91726i.length;
        while (i < length) {
            this.f91729l.mo84656b(obj, this.f91726i[i]);
            i++;
        }
        this.f91730m.mo9460m(obj);
        if (this.f91723f) {
            this.f91731n.mo113391f(obj);
        }
    }
}
