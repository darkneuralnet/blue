package p000;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;
/* renamed from: Zb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37479Zb7<T> implements InterfaceC42819ic7<T> {

    /* renamed from: p */
    public static final int[] f48811p = new int[0];

    /* renamed from: q */
    public static final Unsafe f48812q = C34212Lc7.m96566l();

    /* renamed from: a */
    public final int[] f48813a;

    /* renamed from: b */
    public final Object[] f48814b;

    /* renamed from: c */
    public final int f48815c;

    /* renamed from: d */
    public final int f48816d;

    /* renamed from: e */
    public final InterfaceC36075Tb7 f48817e;

    /* renamed from: f */
    public final boolean f48818f;

    /* renamed from: g */
    public final boolean f48819g;

    /* renamed from: h */
    public final int[] f48820h;

    /* renamed from: i */
    public final int f48821i;

    /* renamed from: j */
    public final int f48822j;

    /* renamed from: k */
    public final AbstractC33033Gb7 f48823k;

    /* renamed from: l */
    public final AbstractC31872Bc7 f48824l;

    /* renamed from: m */
    public final AbstractC35130Pa7 f48825m;

    /* renamed from: n */
    public final C39244cc7 f48826n;

    /* renamed from: o */
    public final C34905Ob7 f48827o;

    public C37479Zb7(int[] iArr, Object[] objArr, int i, int i2, InterfaceC36075Tb7 interfaceC36075Tb7, boolean z, boolean z2, int[] iArr2, int i3, int i4, C39244cc7 c39244cc7, AbstractC33033Gb7 abstractC33033Gb7, AbstractC31872Bc7 abstractC31872Bc7, AbstractC35130Pa7 abstractC35130Pa7, C34905Ob7 c34905Ob7) {
        this.f48813a = iArr;
        this.f48814b = objArr;
        this.f48815c = i;
        this.f48816d = i2;
        this.f48819g = z;
        boolean z3 = false;
        if (abstractC35130Pa7 != null && abstractC35130Pa7.mo88383g(interfaceC36075Tb7)) {
            z3 = true;
        }
        this.f48818f = z3;
        this.f48820h = iArr2;
        this.f48821i = i3;
        this.f48822j = i4;
        this.f48826n = c39244cc7;
        this.f48823k = abstractC33033Gb7;
        this.f48824l = abstractC31872Bc7;
        this.f48825m = abstractC35130Pa7;
        this.f48817e = interfaceC36075Tb7;
        this.f48827o = c34905Ob7;
    }

    /* renamed from: A */
    public static boolean m72897A(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC41030fb7) {
            return ((AbstractC41030fb7) obj).m41132o();
        }
        return true;
    }

    /* renamed from: D */
    public static boolean m72895D(Object obj, long j) {
        return ((Boolean) C34212Lc7.m96567k(obj, j)).booleanValue();
    }

    /* renamed from: E */
    public static final int m72894E(byte[] bArr, int i, int i2, EnumC35616Rc7 enumC35616Rc7, Class cls, C44578la7 c44578la7) throws IOException {
        boolean z;
        EnumC35616Rc7 enumC35616Rc72 = EnumC35616Rc7.f32319d;
        switch (enumC35616Rc7.ordinal()) {
            case 0:
                c44578la7.f96361c = Double.valueOf(Double.longBitsToDouble(C45171ma7.m25388q(bArr, i)));
                return i + 8;
            case 1:
                c44578la7.f96361c = Float.valueOf(Float.intBitsToFloat(C45171ma7.m25403b(bArr, i)));
                return i + 4;
            case 2:
            case 3:
                int m25392m = C45171ma7.m25392m(bArr, i, c44578la7);
                c44578la7.f96361c = Long.valueOf(c44578la7.f96360b);
                return m25392m;
            case 4:
            case 12:
            case 13:
                int m25395j = C45171ma7.m25395j(bArr, i, c44578la7);
                c44578la7.f96361c = Integer.valueOf(c44578la7.f96359a);
                return m25395j;
            case 5:
            case 15:
                c44578la7.f96361c = Long.valueOf(C45171ma7.m25388q(bArr, i));
                return i + 8;
            case 6:
            case 14:
                c44578la7.f96361c = Integer.valueOf(C45171ma7.m25403b(bArr, i));
                return i + 4;
            case 7:
                int m25392m2 = C45171ma7.m25392m(bArr, i, c44578la7);
                if (c44578la7.f96360b != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c44578la7.f96361c = Boolean.valueOf(z);
                return m25392m2;
            case 8:
                return C45171ma7.m25397h(bArr, i, c44578la7);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return C45171ma7.m25401d(C41040fc7.m41106a().m41105b(cls), bArr, i, i2, c44578la7);
            case 11:
                return C45171ma7.m25404a(bArr, i, c44578la7);
            case 16:
                int m25395j2 = C45171ma7.m25395j(bArr, i, c44578la7);
                c44578la7.f96361c = Integer.valueOf(C33024Ga7.m104994a(c44578la7.f96359a));
                return m25395j2;
            case 17:
                int m25392m3 = C45171ma7.m25392m(bArr, i, c44578la7);
                c44578la7.f96361c = Long.valueOf(C33024Ga7.m104993b(c44578la7.f96360b));
                return m25392m3;
        }
    }

    /* renamed from: F */
    public static final void m72893F(int i, Object obj, InterfaceC36084Tc7 interfaceC36084Tc7) throws IOException {
        if (obj instanceof String) {
            interfaceC36084Tc7.mo83303E(i, (String) obj);
        } else {
            interfaceC36084Tc7.mo83290f(i, (AbstractC32088Ca7) obj);
        }
    }

    /* renamed from: H */
    public static C32106Cc7 m72891H(Object obj) {
        AbstractC41030fb7 abstractC41030fb7 = (AbstractC41030fb7) obj;
        C32106Cc7 c32106Cc7 = abstractC41030fb7.zbc;
        if (c32106Cc7 == C32106Cc7.m111980c()) {
            C32106Cc7 m111977f = C32106Cc7.m111977f();
            abstractC41030fb7.zbc = m111977f;
            return m111977f;
        }
        return c32106Cc7;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C37479Zb7 m72890I(Class cls, InterfaceC35373Qb7 interfaceC35373Qb7, C39244cc7 c39244cc7, AbstractC33033Gb7 abstractC33033Gb7, AbstractC31872Bc7 abstractC31872Bc7, AbstractC35130Pa7 abstractC35130Pa7, C34905Ob7 c34905Ob7) {
        int i;
        int charAt;
        int charAt2;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt3;
        int i7;
        char charAt4;
        int i8;
        char charAt5;
        int i9;
        char charAt6;
        int i10;
        char charAt7;
        int i11;
        char charAt8;
        int i12;
        char charAt9;
        int i13;
        char charAt10;
        boolean z;
        int i14;
        int i15;
        int i16;
        Object[] objArr;
        int objectFieldOffset;
        int i17;
        int i18;
        int i19;
        Field m72870n;
        char charAt11;
        int i20;
        Object[] objArr2;
        int i21;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field m72870n2;
        Object obj2;
        Field m72870n3;
        int i25;
        char charAt12;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        if (interfaceC35373Qb7 instanceof C42226hc7) {
            C42226hc7 c42226hc7 = (C42226hc7) interfaceC35373Qb7;
            int zbc = c42226hc7.zbc();
            String m36158a = c42226hc7.m36158a();
            int length = m36158a.length();
            int i29 = 0;
            char charAt16 = m36158a.charAt(0);
            int i30 = GeneratorBase.SURR1_FIRST;
            if (charAt16 >= 55296) {
                int i31 = 1;
                while (true) {
                    i = i31 + 1;
                    if (m36158a.charAt(i31) < 55296) {
                        break;
                    }
                    i31 = i;
                }
            } else {
                i = 1;
            }
            int i32 = i + 1;
            int charAt17 = m36158a.charAt(i);
            if (charAt17 >= 55296) {
                int i33 = charAt17 & 8191;
                int i34 = 13;
                while (true) {
                    i28 = i32 + 1;
                    charAt15 = m36158a.charAt(i32);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i33 |= (charAt15 & 8191) << i34;
                    i34 += 13;
                    i32 = i28;
                }
                charAt17 = i33 | (charAt15 << i34);
                i32 = i28;
            }
            if (charAt17 == 0) {
                i3 = 0;
                charAt = 0;
                charAt2 = 0;
                i5 = 0;
                i4 = 0;
                iArr = f48811p;
                i2 = 0;
            } else {
                int i35 = i32 + 1;
                int charAt18 = m36158a.charAt(i32);
                if (charAt18 >= 55296) {
                    int i36 = charAt18 & 8191;
                    int i37 = 13;
                    while (true) {
                        i13 = i35 + 1;
                        charAt10 = m36158a.charAt(i35);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i36 |= (charAt10 & 8191) << i37;
                        i37 += 13;
                        i35 = i13;
                    }
                    charAt18 = i36 | (charAt10 << i37);
                    i35 = i13;
                }
                int i38 = i35 + 1;
                int charAt19 = m36158a.charAt(i35);
                if (charAt19 >= 55296) {
                    int i39 = charAt19 & 8191;
                    int i40 = 13;
                    while (true) {
                        i12 = i38 + 1;
                        charAt9 = m36158a.charAt(i38);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i39 |= (charAt9 & 8191) << i40;
                        i40 += 13;
                        i38 = i12;
                    }
                    charAt19 = i39 | (charAt9 << i40);
                    i38 = i12;
                }
                int i41 = i38 + 1;
                int charAt20 = m36158a.charAt(i38);
                if (charAt20 >= 55296) {
                    int i42 = charAt20 & 8191;
                    int i43 = 13;
                    while (true) {
                        i11 = i41 + 1;
                        charAt8 = m36158a.charAt(i41);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i42 |= (charAt8 & 8191) << i43;
                        i43 += 13;
                        i41 = i11;
                    }
                    charAt20 = i42 | (charAt8 << i43);
                    i41 = i11;
                }
                int i44 = i41 + 1;
                int charAt21 = m36158a.charAt(i41);
                if (charAt21 >= 55296) {
                    int i45 = charAt21 & 8191;
                    int i46 = 13;
                    while (true) {
                        i10 = i44 + 1;
                        charAt7 = m36158a.charAt(i44);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i45 |= (charAt7 & 8191) << i46;
                        i46 += 13;
                        i44 = i10;
                    }
                    charAt21 = i45 | (charAt7 << i46);
                    i44 = i10;
                }
                int i47 = i44 + 1;
                charAt = m36158a.charAt(i44);
                if (charAt >= 55296) {
                    int i48 = charAt & 8191;
                    int i49 = 13;
                    while (true) {
                        i9 = i47 + 1;
                        charAt6 = m36158a.charAt(i47);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i48 |= (charAt6 & 8191) << i49;
                        i49 += 13;
                        i47 = i9;
                    }
                    charAt = i48 | (charAt6 << i49);
                    i47 = i9;
                }
                int i50 = i47 + 1;
                charAt2 = m36158a.charAt(i47);
                if (charAt2 >= 55296) {
                    int i51 = charAt2 & 8191;
                    int i52 = 13;
                    while (true) {
                        i8 = i50 + 1;
                        charAt5 = m36158a.charAt(i50);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i51 |= (charAt5 & 8191) << i52;
                        i52 += 13;
                        i50 = i8;
                    }
                    charAt2 = i51 | (charAt5 << i52);
                    i50 = i8;
                }
                int i53 = i50 + 1;
                int charAt22 = m36158a.charAt(i50);
                if (charAt22 >= 55296) {
                    int i54 = charAt22 & 8191;
                    int i55 = 13;
                    while (true) {
                        i7 = i53 + 1;
                        charAt4 = m36158a.charAt(i53);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i54 |= (charAt4 & 8191) << i55;
                        i55 += 13;
                        i53 = i7;
                    }
                    charAt22 = i54 | (charAt4 << i55);
                    i53 = i7;
                }
                int i56 = i53 + 1;
                int charAt23 = m36158a.charAt(i53);
                if (charAt23 >= 55296) {
                    int i57 = charAt23 & 8191;
                    int i58 = i56;
                    int i59 = 13;
                    while (true) {
                        i6 = i58 + 1;
                        charAt3 = m36158a.charAt(i58);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i57 |= (charAt3 & 8191) << i59;
                        i59 += 13;
                        i58 = i6;
                    }
                    charAt23 = i57 | (charAt3 << i59);
                    i56 = i6;
                }
                int i60 = charAt23 + charAt2 + charAt22;
                int i61 = charAt18 + charAt18 + charAt19;
                int[] iArr2 = new int[i60];
                i29 = charAt18;
                iArr = iArr2;
                i2 = charAt20;
                i3 = i61;
                i4 = charAt23;
                i32 = i56;
                i5 = charAt21;
            }
            Unsafe unsafe = f48812q;
            Object[] m36157b = c42226hc7.m36157b();
            Class<?> cls2 = c42226hc7.mo6590y().getClass();
            int i62 = i4 + charAt2;
            int i63 = charAt + charAt;
            int[] iArr3 = new int[charAt * 3];
            Object[] objArr3 = new Object[i63];
            int i64 = i4;
            int i65 = i62;
            int i66 = 0;
            int i67 = 0;
            while (true) {
                if (zbc == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (i32 < length) {
                    int i68 = i32 + 1;
                    int charAt24 = m36158a.charAt(i32);
                    if (charAt24 >= i30) {
                        int i69 = charAt24 & 8191;
                        int i70 = i68;
                        int i71 = 13;
                        while (true) {
                            i27 = i70 + 1;
                            charAt14 = m36158a.charAt(i70);
                            i14 = zbc;
                            if (charAt14 < 55296) {
                                break;
                            }
                            i69 |= (charAt14 & 8191) << i71;
                            i71 += 13;
                            i70 = i27;
                            zbc = i14;
                        }
                        charAt24 = i69 | (charAt14 << i71);
                        i15 = i27;
                    } else {
                        i14 = zbc;
                        i15 = i68;
                    }
                    int i72 = i15 + 1;
                    int charAt25 = m36158a.charAt(i15);
                    int i73 = length;
                    char c = 55296;
                    if (charAt25 >= 55296) {
                        int i74 = charAt25 & 8191;
                        int i75 = 13;
                        while (true) {
                            i26 = i72 + 1;
                            charAt13 = m36158a.charAt(i72);
                            if (charAt13 < c) {
                                break;
                            }
                            i74 |= (charAt13 & 8191) << i75;
                            i75 += 13;
                            i72 = i26;
                            c = 55296;
                        }
                        charAt25 = i74 | (charAt13 << i75);
                        i72 = i26;
                    }
                    if ((charAt25 & 1024) != 0) {
                        iArr[i66] = i67;
                        i66++;
                    }
                    int i76 = charAt25 & KotlinVersion.MAX_COMPONENT_VALUE;
                    int i77 = i5;
                    if (i76 >= 51) {
                        int i78 = i72 + 1;
                        int charAt26 = m36158a.charAt(i72);
                        if (charAt26 >= 55296) {
                            int i79 = charAt26 & 8191;
                            int i80 = i78;
                            int i81 = 13;
                            while (true) {
                                i25 = i80 + 1;
                                charAt12 = m36158a.charAt(i80);
                                i16 = i2;
                                if (charAt12 < 55296) {
                                    break;
                                }
                                i79 |= (charAt12 & 8191) << i81;
                                i81 += 13;
                                i80 = i25;
                                i2 = i16;
                            }
                            charAt26 = i79 | (charAt12 << i81);
                            i23 = i25;
                        } else {
                            i16 = i2;
                            i23 = i78;
                        }
                        int i82 = i76 - 51;
                        int i83 = i23;
                        if (i82 != 9 && i82 != 17) {
                            if (i82 == 12 && !z) {
                                int i84 = i67 / 3;
                                i24 = i3 + 1;
                                objArr3[i84 + i84 + 1] = m36157b[i3];
                            }
                            int i85 = charAt26 + charAt26;
                            obj = m36157b[i85];
                            if (!(obj instanceof Field)) {
                                m72870n2 = (Field) obj;
                            } else {
                                m72870n2 = m72870n(cls2, (String) obj);
                                m36157b[i85] = m72870n2;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m72870n2);
                            int i86 = i85 + 1;
                            obj2 = m36157b[i86];
                            if (!(obj2 instanceof Field)) {
                                m72870n3 = (Field) obj2;
                            } else {
                                m72870n3 = m72870n(cls2, (String) obj2);
                                m36157b[i86] = m72870n3;
                            }
                            objectFieldOffset = objectFieldOffset2;
                            objArr2 = m36157b;
                            i18 = i83;
                            i17 = (int) unsafe.objectFieldOffset(m72870n3);
                            i19 = 0;
                        } else {
                            int i87 = i67 / 3;
                            i24 = i3 + 1;
                            objArr3[i87 + i87 + 1] = m36157b[i3];
                        }
                        i3 = i24;
                        int i852 = charAt26 + charAt26;
                        obj = m36157b[i852];
                        if (!(obj instanceof Field)) {
                        }
                        int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m72870n2);
                        int i862 = i852 + 1;
                        obj2 = m36157b[i862];
                        if (!(obj2 instanceof Field)) {
                        }
                        objectFieldOffset = objectFieldOffset22;
                        objArr2 = m36157b;
                        i18 = i83;
                        i17 = (int) unsafe.objectFieldOffset(m72870n3);
                        i19 = 0;
                    } else {
                        i16 = i2;
                        int i88 = i3 + 1;
                        Field m72870n4 = m72870n(cls2, (String) m36157b[i3]);
                        if (i76 != 9 && i76 != 17) {
                            if (i76 != 27 && i76 != 49) {
                                if (i76 != 12 && i76 != 30 && i76 != 44) {
                                    if (i76 == 50) {
                                        int i89 = i64 + 1;
                                        iArr[i64] = i67;
                                        int i90 = i67 / 3;
                                        int i91 = i88 + 1;
                                        int i92 = i90 + i90;
                                        objArr3[i92] = m36157b[i88];
                                        if ((charAt25 & 2048) != 0) {
                                            i88 = i91 + 1;
                                            objArr3[i92 + 1] = m36157b[i91];
                                            i64 = i89;
                                        } else {
                                            objArr = m36157b;
                                            i88 = i91;
                                            i64 = i89;
                                            objectFieldOffset = (int) unsafe.objectFieldOffset(m72870n4);
                                            i17 = 1048575;
                                            if ((charAt25 & 4096) != 4096 && i76 <= 17) {
                                                int i93 = i72 + 1;
                                                int charAt27 = m36158a.charAt(i72);
                                                if (charAt27 >= 55296) {
                                                    int i94 = charAt27 & 8191;
                                                    int i95 = 13;
                                                    while (true) {
                                                        i18 = i93 + 1;
                                                        charAt11 = m36158a.charAt(i93);
                                                        if (charAt11 < 55296) {
                                                            break;
                                                        }
                                                        i94 |= (charAt11 & 8191) << i95;
                                                        i95 += 13;
                                                        i93 = i18;
                                                    }
                                                    charAt27 = i94 | (charAt11 << i95);
                                                } else {
                                                    i18 = i93;
                                                }
                                                int i96 = i29 + i29 + (charAt27 / 32);
                                                Object obj3 = objArr[i96];
                                                if (obj3 instanceof Field) {
                                                    m72870n = (Field) obj3;
                                                } else {
                                                    m72870n = m72870n(cls2, (String) obj3);
                                                    objArr[i96] = m72870n;
                                                }
                                                i19 = charAt27 % 32;
                                                i17 = (int) unsafe.objectFieldOffset(m72870n);
                                            } else {
                                                i18 = i72;
                                                i19 = 0;
                                            }
                                            if (i76 >= 18 && i76 <= 49) {
                                                iArr[i65] = objectFieldOffset;
                                                i65++;
                                            }
                                            i3 = i88;
                                            objArr2 = objArr;
                                        }
                                    }
                                } else if (!z) {
                                    int i97 = i67 / 3;
                                    i20 = i88 + 1;
                                    objArr3[i97 + i97 + 1] = m36157b[i88];
                                }
                            } else {
                                int i98 = i67 / 3;
                                i20 = i88 + 1;
                                objArr3[i98 + i98 + 1] = m36157b[i88];
                            }
                            i88 = i20;
                        } else {
                            int i99 = i67 / 3;
                            objArr3[i99 + i99 + 1] = m72870n4.getType();
                        }
                        objArr = m36157b;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(m72870n4);
                        i17 = 1048575;
                        if ((charAt25 & 4096) != 4096) {
                        }
                        i18 = i72;
                        i19 = 0;
                        if (i76 >= 18) {
                            iArr[i65] = objectFieldOffset;
                            i65++;
                        }
                        i3 = i88;
                        objArr2 = objArr;
                    }
                    int i100 = i67 + 1;
                    iArr3[i67] = charAt24;
                    int i101 = i100 + 1;
                    if ((charAt25 & 512) != 0) {
                        i21 = 536870912;
                    } else {
                        i21 = 0;
                    }
                    if ((charAt25 & 256) != 0) {
                        i22 = 268435456;
                    } else {
                        i22 = 0;
                    }
                    iArr3[i100] = i22 | i21 | (i76 << 20) | objectFieldOffset;
                    i67 = i101 + 1;
                    iArr3[i101] = (i19 << 20) | i17;
                    m36157b = objArr2;
                    length = i73;
                    i32 = i18;
                    i5 = i77;
                    zbc = i14;
                    i2 = i16;
                    i30 = GeneratorBase.SURR1_FIRST;
                } else {
                    return new C37479Zb7(iArr3, objArr3, i2, i5, c42226hc7.mo6590y(), z, false, iArr, i4, i62, c39244cc7, abstractC33033Gb7, abstractC31872Bc7, abstractC35130Pa7, c34905Ob7);
                }
            }
        } else {
            C51119wc7 c51119wc7 = (C51119wc7) interfaceC35373Qb7;
            throw null;
        }
    }

    /* renamed from: J */
    public static double m72889J(Object obj, long j) {
        return ((Double) C34212Lc7.m96567k(obj, j)).doubleValue();
    }

    /* renamed from: K */
    public static float m72888K(Object obj, long j) {
        return ((Float) C34212Lc7.m96567k(obj, j)).floatValue();
    }

    /* renamed from: M */
    public static int m72886M(Object obj, long j) {
        return ((Integer) C34212Lc7.m96567k(obj, j)).intValue();
    }

    /* renamed from: U */
    public static int m72878U(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: W */
    public static long m72876W(Object obj, long j) {
        return ((Long) C34212Lc7.m96567k(obj, j)).longValue();
    }

    /* renamed from: n */
    public static Field m72870n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: o */
    public static void m72869o(Object obj) {
        if (m72897A(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* renamed from: z */
    public static boolean m72858z(Object obj, int i, InterfaceC42819ic7 interfaceC42819ic7) {
        return interfaceC42819ic7.mo33743e(C34212Lc7.m96567k(obj, i & 1048575));
    }

    @Override // p000.InterfaceC42819ic7
    /* renamed from: B */
    public final Object mo33748B() {
        return ((AbstractC41030fb7) this.f48817e).m41125x();
    }

    /* renamed from: C */
    public final boolean m72896C(Object obj, int i, int i2) {
        if (C34212Lc7.m96570h(obj, m72880S(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x0547, code lost:
        r0 = 1048575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x054a, code lost:
        if (r6 == 1048575) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x054c, code lost:
        r29.putInt(r13, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0552, code lost:
        r2 = r10.f48821i;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0558, code lost:
        if (r2 >= r10.f48822j) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x055a, code lost:
        r5 = r10.f48820h[r2];
        r6 = r10.f48824l;
        r7 = r10.f48813a[r5];
        r9 = p000.C34212Lc7.m96567k(r13, r10.m72877V(r5) & r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x056e, code lost:
        if (r9 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0570, code lost:
        r11 = r10.m72875i(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0574, code lost:
        if (r11 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0576, code lost:
        r5 = ((p000.C34437Mb7) r10.m72873k(r5)).m95140c();
        r9 = ((p000.C34671Nb7) r9).entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x058e, code lost:
        if (r9.hasNext() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0590, code lost:
        r12 = (java.util.Map.Entry) r9.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x05a4, code lost:
        if (r11.mo953a(((java.lang.Integer) r12.getValue()).intValue()) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x05a6, code lost:
        if (r3 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x05a8, code lost:
        r3 = r6.mo110103c(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x05ac, code lost:
        r14 = p000.C34437Mb7.m95141b(r5, r12.getKey(), r12.getValue());
        r15 = p000.AbstractC32088Ca7.f4281c;
        r15 = new byte[r14];
        r14 = p000.AbstractC33726Ja7.m100164c(r15, 0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x05c1, code lost:
        p000.C34437Mb7.m95138e(r14, r5, r12.getKey(), r12.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x05cc, code lost:
        r6.mo110100f(r3, r7, p000.C51692xa7.m4983a(r14, r15));
        r9.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x05da, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x05e0, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x05e1, code lost:
        r2 = r2 + 1;
        r0 = 1048575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x05e8, code lost:
        if (r3 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x05ea, code lost:
        r10.f48824l.mo110097i(r13, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x05ef, code lost:
        if (r8 != 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x05f3, code lost:
        if (r1 != r36) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x05fa, code lost:
        throw com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw.m51258e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x05fd, code lost:
        if (r1 > r36) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x05ff, code lost:
        if (r4 != r8) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0601, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0606, code lost:
        throw com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw.m51258e();
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m72892G(Object obj, byte[] bArr, int i, int i2, int i3, C44578la7 c44578la7) throws IOException {
        Object obj2;
        Unsafe unsafe;
        int i4;
        C37479Zb7<T> c37479Zb7;
        int i5;
        int i6;
        int m72882Q;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z;
        Object obj3;
        byte[] bArr2;
        int i14;
        C44578la7 c44578la72;
        Object obj4;
        int i15;
        boolean z2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        C37479Zb7<T> c37479Zb72 = this;
        Object obj5 = obj;
        byte[] bArr3 = bArr;
        int i22 = i2;
        int i23 = i3;
        C44578la7 c44578la73 = c44578la7;
        m72869o(obj);
        Unsafe unsafe2 = f48812q;
        int i24 = -1;
        int i25 = i;
        int i26 = -1;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 1048575;
        while (true) {
            Object obj6 = null;
            if (i25 < i22) {
                int i31 = i25 + 1;
                byte b = bArr3[i25];
                if (b < 0) {
                    i6 = C45171ma7.m25394k(b, bArr3, i31, c44578la73);
                    i5 = c44578la73.f96359a;
                } else {
                    i5 = b;
                    i6 = i31;
                }
                int i32 = i5 >>> 3;
                if (i32 > i26) {
                    m72882Q = c37479Zb72.m72881R(i32, i27 / 3);
                } else {
                    m72882Q = c37479Zb72.m72882Q(i32);
                }
                int i33 = m72882Q;
                if (i33 == i24) {
                    i7 = i6;
                    i8 = i5;
                    i9 = i29;
                    i10 = i30;
                    i11 = i32;
                    i12 = i24;
                    unsafe = unsafe2;
                    i4 = i23;
                    i13 = 0;
                    z = true;
                } else {
                    int i34 = i5 & 7;
                    int[] iArr = c37479Zb72.f48813a;
                    int i35 = iArr[i33 + 1];
                    int m72878U = m72878U(i35);
                    int i36 = i5;
                    long j = i35 & 1048575;
                    if (m72878U <= 17) {
                        int i37 = iArr[i33 + 2];
                        int i38 = 1 << (i37 >>> 20);
                        int i39 = i37 & 1048575;
                        if (i39 != i30) {
                            if (i30 != 1048575) {
                                unsafe2.putInt(obj5, i30, i29);
                            }
                            i10 = i39;
                            i15 = unsafe2.getInt(obj5, i39);
                        } else {
                            i15 = i29;
                            i10 = i30;
                        }
                        switch (m72878U) {
                            case 0:
                                z2 = true;
                                i16 = i33;
                                i17 = i36;
                                c37479Zb72 = this;
                                i18 = i6;
                                if (i34 != 1) {
                                    i20 = i18;
                                    i36 = i17;
                                    i11 = i32;
                                    z = z2;
                                    i7 = i20;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i13 = i16;
                                    i8 = i36;
                                    i12 = -1;
                                    i4 = i3;
                                    break;
                                } else {
                                    C34212Lc7.m96558t(obj5, j, Double.longBitsToDouble(C45171ma7.m25388q(bArr3, i18)));
                                    i25 = i18 + 8;
                                    i29 = i15 | i38;
                                    i22 = i2;
                                    i28 = i17;
                                    i27 = i16;
                                    i26 = i32;
                                    i30 = i10;
                                    i24 = -1;
                                    i23 = i3;
                                    break;
                                }
                            case 1:
                                i16 = i33;
                                i17 = i36;
                                c37479Zb72 = this;
                                i19 = i6;
                                if (i34 != 5) {
                                    i20 = i19;
                                    i36 = i17;
                                    i11 = i32;
                                    z2 = true;
                                    z = z2;
                                    i7 = i20;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i13 = i16;
                                    i8 = i36;
                                    i12 = -1;
                                    i4 = i3;
                                    break;
                                } else {
                                    C34212Lc7.m96557u(obj5, j, Float.intBitsToFloat(C45171ma7.m25403b(bArr3, i19)));
                                    i25 = i19 + 4;
                                    i29 = i15 | i38;
                                    i22 = i2;
                                    i28 = i17;
                                    i27 = i16;
                                    i26 = i32;
                                    i30 = i10;
                                    i24 = -1;
                                    i23 = i3;
                                    break;
                                }
                            case 2:
                            case 3:
                                i16 = i33;
                                i17 = i36;
                                c37479Zb72 = this;
                                i19 = i6;
                                if (i34 != 0) {
                                    i20 = i19;
                                    i36 = i17;
                                    i11 = i32;
                                    z2 = true;
                                    z = z2;
                                    i7 = i20;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i13 = i16;
                                    i8 = i36;
                                    i12 = -1;
                                    i4 = i3;
                                    break;
                                } else {
                                    int m25392m = C45171ma7.m25392m(bArr3, i19, c44578la73);
                                    unsafe2.putLong(obj, j, c44578la73.f96360b);
                                    i29 = i15 | i38;
                                    i28 = i17;
                                    i27 = i16;
                                    i25 = m25392m;
                                    i26 = i32;
                                    i30 = i10;
                                    i24 = -1;
                                    i22 = i2;
                                    i23 = i3;
                                    break;
                                }
                            case 4:
                            case 11:
                                i16 = i33;
                                i17 = i36;
                                c37479Zb72 = this;
                                i19 = i6;
                                if (i34 != 0) {
                                    i20 = i19;
                                    i36 = i17;
                                    i11 = i32;
                                    z2 = true;
                                    z = z2;
                                    i7 = i20;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i13 = i16;
                                    i8 = i36;
                                    i12 = -1;
                                    i4 = i3;
                                    break;
                                } else {
                                    i25 = C45171ma7.m25395j(bArr3, i19, c44578la73);
                                    unsafe2.putInt(obj5, j, c44578la73.f96359a);
                                    i29 = i15 | i38;
                                    i22 = i2;
                                    i28 = i17;
                                    i27 = i16;
                                    i26 = i32;
                                    i30 = i10;
                                    i24 = -1;
                                    i23 = i3;
                                    break;
                                }
                            case 5:
                            case 14:
                                i16 = i33;
                                i17 = i36;
                                c37479Zb72 = this;
                                i18 = i6;
                                if (i34 != 1) {
                                    z2 = true;
                                    i20 = i18;
                                    i36 = i17;
                                    i11 = i32;
                                    z = z2;
                                    i7 = i20;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i13 = i16;
                                    i8 = i36;
                                    i12 = -1;
                                    i4 = i3;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, j, C45171ma7.m25388q(bArr3, i18));
                                    i25 = i18 + 8;
                                    i29 = i15 | i38;
                                    i22 = i2;
                                    i28 = i17;
                                    i27 = i16;
                                    i26 = i32;
                                    i30 = i10;
                                    i24 = -1;
                                    i23 = i3;
                                    break;
                                }
                            case 6:
                            case 13:
                                i16 = i33;
                                i17 = i36;
                                c37479Zb72 = this;
                                i19 = i6;
                                if (i34 != 5) {
                                    i20 = i19;
                                    i36 = i17;
                                    i11 = i32;
                                    z2 = true;
                                    z = z2;
                                    i7 = i20;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i13 = i16;
                                    i8 = i36;
                                    i12 = -1;
                                    i4 = i3;
                                    break;
                                } else {
                                    unsafe2.putInt(obj5, j, C45171ma7.m25403b(bArr3, i19));
                                    i25 = i19 + 4;
                                    i29 = i15 | i38;
                                    i22 = i2;
                                    i28 = i17;
                                    i27 = i16;
                                    i26 = i32;
                                    i30 = i10;
                                    i24 = -1;
                                    i23 = i3;
                                    break;
                                }
                            case 7:
                                i21 = i6;
                                i16 = i33;
                                i17 = i36;
                                c37479Zb72 = this;
                                if (i34 != 0) {
                                    i20 = i21;
                                    i36 = i17;
                                    i11 = i32;
                                    z2 = true;
                                    z = z2;
                                    i7 = i20;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i13 = i16;
                                    i8 = i36;
                                    i12 = -1;
                                    i4 = i3;
                                    break;
                                } else {
                                    i25 = C45171ma7.m25392m(bArr3, i21, c44578la73);
                                    C34212Lc7.m96560r(obj5, j, c44578la73.f96360b != 0);
                                    i29 = i15 | i38;
                                    i22 = i2;
                                    i28 = i17;
                                    i27 = i16;
                                    i26 = i32;
                                    i30 = i10;
                                    i24 = -1;
                                    i23 = i3;
                                    break;
                                }
                            case 8:
                                i21 = i6;
                                i16 = i33;
                                i17 = i36;
                                c37479Zb72 = this;
                                if (i34 != 2) {
                                    i20 = i21;
                                    i36 = i17;
                                    i11 = i32;
                                    z2 = true;
                                    z = z2;
                                    i7 = i20;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i13 = i16;
                                    i8 = i36;
                                    i12 = -1;
                                    i4 = i3;
                                    break;
                                } else {
                                    if ((536870912 & i35) == 0) {
                                        i25 = C45171ma7.m25398g(bArr3, i21, c44578la73);
                                    } else {
                                        i25 = C45171ma7.m25397h(bArr3, i21, c44578la73);
                                    }
                                    unsafe2.putObject(obj5, j, c44578la73.f96361c);
                                    i29 = i15 | i38;
                                    i22 = i2;
                                    i28 = i17;
                                    i27 = i16;
                                    i26 = i32;
                                    i30 = i10;
                                    i24 = -1;
                                    i23 = i3;
                                    break;
                                }
                            case 9:
                                c37479Zb72 = this;
                                i16 = i33;
                                i17 = i36;
                                if (i34 != 2) {
                                    i20 = i6;
                                    i36 = i17;
                                    i11 = i32;
                                    z2 = true;
                                    z = z2;
                                    i7 = i20;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i13 = i16;
                                    i8 = i36;
                                    i12 = -1;
                                    i4 = i3;
                                    break;
                                } else {
                                    Object m72872l = c37479Zb72.m72872l(obj5, i16);
                                    i25 = C45171ma7.m25390o(m72872l, c37479Zb72.m72874j(i16), bArr, i6, i2, c44578la7);
                                    c37479Zb72.m72864t(obj5, i16, m72872l);
                                    i29 = i15 | i38;
                                    i22 = i2;
                                    i28 = i17;
                                    i27 = i16;
                                    i26 = i32;
                                    i30 = i10;
                                    i24 = -1;
                                    i23 = i3;
                                    break;
                                }
                            case 10:
                                i16 = i33;
                                i17 = i36;
                                c37479Zb72 = this;
                                if (i34 != 2) {
                                    i20 = i6;
                                    i36 = i17;
                                    i11 = i32;
                                    z2 = true;
                                    z = z2;
                                    i7 = i20;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i13 = i16;
                                    i8 = i36;
                                    i12 = -1;
                                    i4 = i3;
                                    break;
                                } else {
                                    i25 = C45171ma7.m25404a(bArr3, i6, c44578la73);
                                    unsafe2.putObject(obj5, j, c44578la73.f96361c);
                                    i29 = i15 | i38;
                                    i22 = i2;
                                    i28 = i17;
                                    i27 = i16;
                                    i26 = i32;
                                    i30 = i10;
                                    i24 = -1;
                                    i23 = i3;
                                    break;
                                }
                            case 12:
                                i16 = i33;
                                i17 = i36;
                                if (i34 != 0) {
                                    i20 = i6;
                                    i36 = i17;
                                    i11 = i32;
                                    z2 = true;
                                    z = z2;
                                    i7 = i20;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i13 = i16;
                                    i8 = i36;
                                    i12 = -1;
                                    i4 = i3;
                                    break;
                                } else {
                                    i25 = C45171ma7.m25395j(bArr3, i6, c44578la73);
                                    int i40 = c44578la73.f96359a;
                                    c37479Zb72 = this;
                                    InterfaceC43402jb7 m72875i = c37479Zb72.m72875i(i16);
                                    if (m72875i != null && !m72875i.mo953a(i40)) {
                                        m72891H(obj).m111973j(i17, Long.valueOf(i40));
                                        i22 = i2;
                                        i28 = i17;
                                        i29 = i15;
                                        i27 = i16;
                                        i26 = i32;
                                        i30 = i10;
                                        i24 = -1;
                                        i23 = i3;
                                    } else {
                                        unsafe2.putInt(obj5, j, i40);
                                        i29 = i15 | i38;
                                        i22 = i2;
                                        i28 = i17;
                                        i27 = i16;
                                        i26 = i32;
                                        i30 = i10;
                                        i24 = -1;
                                        i23 = i3;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                i16 = i33;
                                i17 = i36;
                                if (i34 != 0) {
                                    i20 = i6;
                                    i36 = i17;
                                    i11 = i32;
                                    z2 = true;
                                    z = z2;
                                    i7 = i20;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i13 = i16;
                                    i8 = i36;
                                    i12 = -1;
                                    i4 = i3;
                                    break;
                                } else {
                                    i25 = C45171ma7.m25395j(bArr3, i6, c44578la73);
                                    unsafe2.putInt(obj5, j, C33024Ga7.m104994a(c44578la73.f96359a));
                                    i29 = i15 | i38;
                                    c37479Zb72 = this;
                                    i22 = i2;
                                    i28 = i17;
                                    i27 = i16;
                                    i26 = i32;
                                    i30 = i10;
                                    i24 = -1;
                                    i23 = i3;
                                    break;
                                }
                            case 16:
                                if (i34 != 0) {
                                    i16 = i33;
                                    z2 = true;
                                    i20 = i6;
                                    i11 = i32;
                                    z = z2;
                                    i7 = i20;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i13 = i16;
                                    i8 = i36;
                                    i12 = -1;
                                    i4 = i3;
                                    break;
                                } else {
                                    int m25392m2 = C45171ma7.m25392m(bArr3, i6, c44578la73);
                                    i16 = i33;
                                    i17 = i36;
                                    unsafe2.putLong(obj, j, C33024Ga7.m104993b(c44578la73.f96360b));
                                    i29 = i15 | i38;
                                    c37479Zb72 = this;
                                    i25 = m25392m2;
                                    i22 = i2;
                                    i28 = i17;
                                    i27 = i16;
                                    i26 = i32;
                                    i30 = i10;
                                    i24 = -1;
                                    i23 = i3;
                                    break;
                                }
                            default:
                                z2 = true;
                                c37479Zb72 = this;
                                i16 = i33;
                                i17 = i36;
                                i18 = i6;
                                if (i34 != 3) {
                                    i20 = i18;
                                    i36 = i17;
                                    i11 = i32;
                                    z = z2;
                                    i7 = i20;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i13 = i16;
                                    i8 = i36;
                                    i12 = -1;
                                    i4 = i3;
                                    break;
                                } else {
                                    Object m72872l2 = c37479Zb72.m72872l(obj5, i16);
                                    i25 = C45171ma7.m25391n(m72872l2, c37479Zb72.m72874j(i16), bArr, i18, i2, (i32 << 3) | 4, c44578la7);
                                    c37479Zb72.m72864t(obj5, i16, m72872l2);
                                    i29 = i15 | i38;
                                    i26 = i32;
                                    i22 = i2;
                                    i27 = i16;
                                    i28 = i17;
                                    i30 = i10;
                                    i24 = -1;
                                    i23 = i3;
                                    break;
                                }
                        }
                    } else {
                        i11 = i32;
                        int i41 = i6;
                        c37479Zb72 = this;
                        if (m72878U != 27) {
                            i9 = i29;
                            i10 = i30;
                            if (m72878U <= 49) {
                                z = true;
                                i12 = -1;
                                i13 = i33;
                                unsafe = unsafe2;
                                i25 = m72883P(obj, bArr, i41, i2, i36, i11, i34, i33, i35, m72878U, j, c44578la7);
                                if (i25 != i41) {
                                    c37479Zb72 = this;
                                    obj5 = obj;
                                    bArr3 = bArr;
                                    i26 = i11;
                                    i22 = i2;
                                    i23 = i3;
                                    c44578la73 = c44578la7;
                                    i28 = i36;
                                    i27 = i13;
                                    i24 = i12;
                                    i29 = i9;
                                    i30 = i10;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i7 = i25;
                                }
                            } else {
                                z = true;
                                i7 = i41;
                                i13 = i33;
                                unsafe = unsafe2;
                                i12 = -1;
                                if (m72878U != 50) {
                                    i25 = m72884O(obj, bArr, i7, i2, i36, i11, i34, i35, m72878U, j, i13, c44578la7);
                                    if (i25 != i7) {
                                        c37479Zb72 = this;
                                        obj5 = obj;
                                        bArr3 = bArr;
                                        i26 = i11;
                                        i22 = i2;
                                        i23 = i3;
                                        c44578la73 = c44578la7;
                                        i28 = i36;
                                        i27 = i13;
                                        i24 = i12;
                                        i29 = i9;
                                        i30 = i10;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i7 = i25;
                                    }
                                } else if (i34 == 2) {
                                    i25 = m72885N(obj, bArr, i7, i2, i13, j, c44578la7);
                                    if (i25 != i7) {
                                        c37479Zb72 = this;
                                        obj5 = obj;
                                        bArr3 = bArr;
                                        i26 = i11;
                                        i22 = i2;
                                        i23 = i3;
                                        c44578la73 = c44578la7;
                                        i28 = i36;
                                        i27 = i13;
                                        i24 = i12;
                                        i29 = i9;
                                        i30 = i10;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i7 = i25;
                                    }
                                } else {
                                    i4 = i3;
                                }
                            }
                        } else if (i34 == 2) {
                            InterfaceC46367ob7 interfaceC46367ob7 = (InterfaceC46367ob7) unsafe2.getObject(obj5, j);
                            if (!interfaceC46367ob7.zbc()) {
                                int size = interfaceC46367ob7.size();
                                interfaceC46367ob7 = interfaceC46367ob7.mo1043r0(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj5, j, interfaceC46367ob7);
                            }
                            i25 = C45171ma7.m25400e(c37479Zb72.m72874j(i33), i36, bArr, i41, i2, interfaceC46367ob7, c44578la7);
                            i26 = i11;
                            i22 = i2;
                            i23 = i3;
                            i27 = i33;
                            i28 = i36;
                            i29 = i29;
                            i30 = i30;
                            i24 = -1;
                        } else {
                            i9 = i29;
                            i10 = i30;
                            i7 = i41;
                            z = true;
                            i13 = i33;
                            unsafe = unsafe2;
                            i12 = -1;
                            i4 = i3;
                        }
                        i8 = i36;
                    }
                }
                if (i8 != i4 || i4 == 0) {
                    if (this.f48818f) {
                        c44578la72 = c44578la7;
                        C34896Oa7 c34896Oa7 = c44578la72.f96362d;
                        if (c34896Oa7 != C34896Oa7.f26796c) {
                            i14 = i11;
                            C40437eb7 m92003c = c34896Oa7.m92003c(this.f48817e, i14);
                            if (m92003c == null) {
                                i7 = C45171ma7.m25396i(i8, bArr, i7, i2, m72891H(obj), c44578la7);
                                obj3 = obj;
                                bArr2 = bArr;
                            } else {
                                obj3 = obj;
                                AbstractC39234cb7 abstractC39234cb7 = (AbstractC39234cb7) obj3;
                                abstractC39234cb7.m61182E();
                                C36066Ta7 c36066Ta7 = abstractC39234cb7.zbb;
                                EnumC35616Rc7 enumC35616Rc7 = m92003c.f78600d.f76867c;
                                if (enumC35616Rc7 != EnumC35616Rc7.f32332q) {
                                    switch (enumC35616Rc7.ordinal()) {
                                        case 0:
                                            bArr2 = bArr;
                                            obj6 = Double.valueOf(Double.longBitsToDouble(C45171ma7.m25388q(bArr2, i7)));
                                            i7 += 8;
                                            obj4 = obj6;
                                            c36066Ta7.m83373j(m92003c.f78600d, obj4);
                                            break;
                                        case 1:
                                            bArr2 = bArr;
                                            obj6 = Float.valueOf(Float.intBitsToFloat(C45171ma7.m25403b(bArr2, i7)));
                                            i7 += 4;
                                            obj4 = obj6;
                                            c36066Ta7.m83373j(m92003c.f78600d, obj4);
                                            break;
                                        case 2:
                                        case 3:
                                            bArr2 = bArr;
                                            i7 = C45171ma7.m25392m(bArr2, i7, c44578la72);
                                            obj6 = Long.valueOf(c44578la72.f96360b);
                                            obj4 = obj6;
                                            c36066Ta7.m83373j(m92003c.f78600d, obj4);
                                            break;
                                        case 4:
                                        case 12:
                                            bArr2 = bArr;
                                            i7 = C45171ma7.m25395j(bArr2, i7, c44578la72);
                                            obj6 = Integer.valueOf(c44578la72.f96359a);
                                            obj4 = obj6;
                                            c36066Ta7.m83373j(m92003c.f78600d, obj4);
                                            break;
                                        case 5:
                                        case 15:
                                            bArr2 = bArr;
                                            obj6 = Long.valueOf(C45171ma7.m25388q(bArr2, i7));
                                            i7 += 8;
                                            obj4 = obj6;
                                            c36066Ta7.m83373j(m92003c.f78600d, obj4);
                                            break;
                                        case 6:
                                        case 14:
                                            bArr2 = bArr;
                                            obj6 = Integer.valueOf(C45171ma7.m25403b(bArr2, i7));
                                            i7 += 4;
                                            obj4 = obj6;
                                            c36066Ta7.m83373j(m92003c.f78600d, obj4);
                                            break;
                                        case 7:
                                            bArr2 = bArr;
                                            i7 = C45171ma7.m25392m(bArr2, i7, c44578la72);
                                            if (c44578la72.f96360b == 0) {
                                                z = false;
                                            }
                                            obj6 = Boolean.valueOf(z);
                                            obj4 = obj6;
                                            c36066Ta7.m83373j(m92003c.f78600d, obj4);
                                            break;
                                        case 8:
                                            bArr2 = bArr;
                                            i7 = C45171ma7.m25398g(bArr2, i7, c44578la72);
                                            obj4 = c44578la72.f96361c;
                                            c36066Ta7.m83373j(m92003c.f78600d, obj4);
                                            break;
                                        case 9:
                                            bArr2 = bArr;
                                            int i42 = (i14 << 3) | 4;
                                            InterfaceC42819ic7 m41105b = C41040fc7.m41106a().m41105b(m92003c.f78599c.getClass());
                                            Object m83377f = c36066Ta7.m83377f(m92003c.f78600d);
                                            if (m83377f == null) {
                                                m83377f = m41105b.mo33748B();
                                                c36066Ta7.m83373j(m92003c.f78600d, m83377f);
                                            }
                                            i7 = C45171ma7.m25391n(m83377f, m41105b, bArr, i7, i2, i42, c44578la7);
                                            break;
                                        case 10:
                                            bArr2 = bArr;
                                            InterfaceC42819ic7 m41105b2 = C41040fc7.m41106a().m41105b(m92003c.f78599c.getClass());
                                            Object m83377f2 = c36066Ta7.m83377f(m92003c.f78600d);
                                            if (m83377f2 == null) {
                                                m83377f2 = m41105b2.mo33748B();
                                                c36066Ta7.m83373j(m92003c.f78600d, m83377f2);
                                            }
                                            i7 = C45171ma7.m25390o(m83377f2, m41105b2, bArr, i7, i2, c44578la7);
                                            break;
                                        case 11:
                                            bArr2 = bArr;
                                            i7 = C45171ma7.m25404a(bArr2, i7, c44578la72);
                                            obj4 = c44578la72.f96361c;
                                            c36066Ta7.m83373j(m92003c.f78600d, obj4);
                                            break;
                                        case 13:
                                            throw new IllegalStateException("Shouldn't reach here.");
                                        case 16:
                                            bArr2 = bArr;
                                            i7 = C45171ma7.m25395j(bArr2, i7, c44578la72);
                                            obj6 = Integer.valueOf(C33024Ga7.m104994a(c44578la72.f96359a));
                                            obj4 = obj6;
                                            c36066Ta7.m83373j(m92003c.f78600d, obj4);
                                            break;
                                        case 17:
                                            bArr2 = bArr;
                                            i7 = C45171ma7.m25392m(bArr2, i7, c44578la72);
                                            obj6 = Long.valueOf(C33024Ga7.m104993b(c44578la72.f96360b));
                                            obj4 = obj6;
                                            c36066Ta7.m83373j(m92003c.f78600d, obj4);
                                            break;
                                        default:
                                            bArr2 = bArr;
                                            obj4 = obj6;
                                            c36066Ta7.m83373j(m92003c.f78600d, obj4);
                                            break;
                                    }
                                } else {
                                    C45171ma7.m25395j(bArr, i7, c44578la72);
                                    throw null;
                                }
                            }
                            i25 = i7;
                            i28 = i8;
                            c37479Zb72 = this;
                            c44578la73 = c44578la72;
                            i26 = i14;
                            obj5 = obj3;
                            bArr3 = bArr2;
                            i27 = i13;
                            i29 = i9;
                            i30 = i10;
                            unsafe2 = unsafe;
                            i22 = i2;
                            i23 = i4;
                            i24 = i12;
                        } else {
                            obj3 = obj;
                            bArr2 = bArr;
                            i14 = i11;
                        }
                    } else {
                        obj3 = obj;
                        bArr2 = bArr;
                        i14 = i11;
                        c44578la72 = c44578la7;
                    }
                    i7 = C45171ma7.m25396i(i8, bArr, i7, i2, m72891H(obj), c44578la7);
                    i25 = i7;
                    i28 = i8;
                    c37479Zb72 = this;
                    c44578la73 = c44578la72;
                    i26 = i14;
                    obj5 = obj3;
                    bArr3 = bArr2;
                    i27 = i13;
                    i29 = i9;
                    i30 = i10;
                    unsafe2 = unsafe;
                    i22 = i2;
                    i23 = i4;
                    i24 = i12;
                } else {
                    c37479Zb7 = this;
                    obj2 = obj;
                    i25 = i7;
                    i28 = i8;
                    i29 = i9;
                    i30 = i10;
                }
            } else {
                obj2 = obj5;
                unsafe = unsafe2;
                i4 = i23;
                c37479Zb7 = c37479Zb72;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: L */
    public final int m72887L(Object obj) {
        int i;
        int m100166a;
        int m100166a2;
        int m100165b;
        int m100166a3;
        int m100166a4;
        int m100166a5;
        int m100166a6;
        int m28772S;
        boolean z;
        int m28789B;
        int m28784G;
        int m100166a7;
        int m100166a8;
        int i2;
        int m100166a9;
        int m100166a10;
        int m100166a11;
        int m100166a12;
        Unsafe unsafe = f48812q;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.f48813a.length) {
            int m72877V = m72877V(i5);
            int[] iArr = this.f48813a;
            int i8 = iArr[i5];
            int m72878U = m72878U(m72877V);
            if (m72878U <= 17) {
                int i9 = iArr[i5 + 2];
                int i10 = i9 & i3;
                int i11 = i9 >>> 20;
                if (i10 != i4) {
                    i7 = unsafe.getInt(obj, i10);
                    i4 = i10;
                }
                i = 1 << i11;
            } else {
                i = 0;
            }
            long j = m72877V & i3;
            switch (m72878U) {
                case 0:
                    if ((i7 & i) != 0) {
                        m100166a = AbstractC33726Ja7.m100166a(i8 << 3);
                        m100166a4 = m100166a + 8;
                        i6 += m100166a4;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i7 & i) != 0) {
                        m100166a2 = AbstractC33726Ja7.m100166a(i8 << 3);
                        m100166a4 = m100166a2 + 4;
                        i6 += m100166a4;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i7 & i) != 0) {
                        m100165b = AbstractC33726Ja7.m100165b(unsafe.getLong(obj, j));
                        m100166a3 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i6 += m100166a3 + m100165b;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i7 & i) != 0) {
                        m100165b = AbstractC33726Ja7.m100165b(unsafe.getLong(obj, j));
                        m100166a3 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i6 += m100166a3 + m100165b;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i7 & i) != 0) {
                        m100165b = AbstractC33726Ja7.m100170B(unsafe.getInt(obj, j));
                        m100166a3 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i6 += m100166a3 + m100165b;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i7 & i) != 0) {
                        m100166a = AbstractC33726Ja7.m100166a(i8 << 3);
                        m100166a4 = m100166a + 8;
                        i6 += m100166a4;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i7 & i) != 0) {
                        m100166a2 = AbstractC33726Ja7.m100166a(i8 << 3);
                        m100166a4 = m100166a2 + 4;
                        i6 += m100166a4;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i7 & i) != 0) {
                        m100166a4 = AbstractC33726Ja7.m100166a(i8 << 3) + 1;
                        i6 += m100166a4;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i7 & i) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof AbstractC32088Ca7) {
                            Logger logger = AbstractC33726Ja7.f17883b;
                            int mo1072c = ((AbstractC32088Ca7) object).mo1072c();
                            m100166a5 = AbstractC33726Ja7.m100166a(mo1072c) + mo1072c;
                            m100166a6 = AbstractC33726Ja7.m100166a(i8 << 3);
                            m100166a4 = m100166a6 + m100166a5;
                            i6 += m100166a4;
                            break;
                        } else {
                            m100165b = AbstractC33726Ja7.m100167E((String) object);
                            m100166a3 = AbstractC33726Ja7.m100166a(i8 << 3);
                            i6 += m100166a3 + m100165b;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if ((i7 & i) != 0) {
                        m100166a4 = C44005kc7.m28778M(i8, unsafe.getObject(obj, j), m72874j(i5));
                        i6 += m100166a4;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i7 & i) != 0) {
                        Logger logger2 = AbstractC33726Ja7.f17883b;
                        int mo1072c2 = ((AbstractC32088Ca7) unsafe.getObject(obj, j)).mo1072c();
                        m100166a5 = AbstractC33726Ja7.m100166a(mo1072c2) + mo1072c2;
                        m100166a6 = AbstractC33726Ja7.m100166a(i8 << 3);
                        m100166a4 = m100166a6 + m100166a5;
                        i6 += m100166a4;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i7 & i) != 0) {
                        m100165b = AbstractC33726Ja7.m100166a(unsafe.getInt(obj, j));
                        m100166a3 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i6 += m100166a3 + m100165b;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i7 & i) != 0) {
                        m100165b = AbstractC33726Ja7.m100170B(unsafe.getInt(obj, j));
                        m100166a3 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i6 += m100166a3 + m100165b;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i7 & i) != 0) {
                        m100166a2 = AbstractC33726Ja7.m100166a(i8 << 3);
                        m100166a4 = m100166a2 + 4;
                        i6 += m100166a4;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i7 & i) != 0) {
                        m100166a = AbstractC33726Ja7.m100166a(i8 << 3);
                        m100166a4 = m100166a + 8;
                        i6 += m100166a4;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i7 & i) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        m100166a3 = AbstractC33726Ja7.m100166a(i8 << 3);
                        m100165b = AbstractC33726Ja7.m100166a((i12 >> 31) ^ (i12 + i12));
                        i6 += m100166a3 + m100165b;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i & i7) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        i6 += AbstractC33726Ja7.m100166a(i8 << 3) + AbstractC33726Ja7.m100165b((j2 >> 63) ^ (j2 + j2));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i7 & i) != 0) {
                        m100166a4 = AbstractC33726Ja7.m100171A(i8, (InterfaceC36075Tb7) unsafe.getObject(obj, j), m72874j(i5));
                        i6 += m100166a4;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m100166a4 = C44005kc7.m28785F(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m100166a4;
                    break;
                case 19:
                    m100166a4 = C44005kc7.m28787D(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m100166a4;
                    break;
                case 20:
                    m100166a4 = C44005kc7.m28780K(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m100166a4;
                    break;
                case 21:
                    m100166a4 = C44005kc7.m28769V(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m100166a4;
                    break;
                case 22:
                    m100166a4 = C44005kc7.m28782I(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m100166a4;
                    break;
                case 23:
                    m100166a4 = C44005kc7.m28785F(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m100166a4;
                    break;
                case 24:
                    m100166a4 = C44005kc7.m28787D(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m100166a4;
                    break;
                case 25:
                    m100166a4 = C44005kc7.m28740z(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m100166a4;
                    break;
                case 26:
                    m28772S = C44005kc7.m28772S(i8, (List) unsafe.getObject(obj, j));
                    i6 += m28772S;
                    break;
                case 27:
                    m28772S = C44005kc7.m28777N(i8, (List) unsafe.getObject(obj, j), m72874j(i5));
                    i6 += m28772S;
                    break;
                case 28:
                    m28772S = C44005kc7.m28790A(i8, (List) unsafe.getObject(obj, j));
                    i6 += m28772S;
                    break;
                case 29:
                    m28772S = C44005kc7.m28771T(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m28772S;
                    break;
                case 30:
                    z = false;
                    m28789B = C44005kc7.m28789B(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m28789B;
                    break;
                case 31:
                    z = false;
                    m28789B = C44005kc7.m28787D(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m28789B;
                    break;
                case 32:
                    z = false;
                    m28789B = C44005kc7.m28785F(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m28789B;
                    break;
                case 33:
                    z = false;
                    m28789B = C44005kc7.m28776O(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m28789B;
                    break;
                case 34:
                    z = false;
                    m28789B = C44005kc7.m28774Q(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m28789B;
                    break;
                case 35:
                    m28784G = C44005kc7.m28784G((List) unsafe.getObject(obj, j));
                    if (m28784G > 0) {
                        m100166a7 = AbstractC33726Ja7.m100166a(m28784G);
                        m100166a8 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i2 = m100166a8 + m100166a7;
                        i6 += i2 + m28784G;
                    }
                    break;
                case 36:
                    m28784G = C44005kc7.m28786E((List) unsafe.getObject(obj, j));
                    if (m28784G > 0) {
                        m100166a7 = AbstractC33726Ja7.m100166a(m28784G);
                        m100166a8 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i2 = m100166a8 + m100166a7;
                        i6 += i2 + m28784G;
                    }
                    break;
                case 37:
                    m28784G = C44005kc7.m28779L((List) unsafe.getObject(obj, j));
                    if (m28784G > 0) {
                        m100166a7 = AbstractC33726Ja7.m100166a(m28784G);
                        m100166a8 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i2 = m100166a8 + m100166a7;
                        i6 += i2 + m28784G;
                    }
                    break;
                case 38:
                    m28784G = C44005kc7.m28768W((List) unsafe.getObject(obj, j));
                    if (m28784G > 0) {
                        m100166a7 = AbstractC33726Ja7.m100166a(m28784G);
                        m100166a8 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i2 = m100166a8 + m100166a7;
                        i6 += i2 + m28784G;
                    }
                    break;
                case 39:
                    m28784G = C44005kc7.m28781J((List) unsafe.getObject(obj, j));
                    if (m28784G > 0) {
                        m100166a7 = AbstractC33726Ja7.m100166a(m28784G);
                        m100166a8 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i2 = m100166a8 + m100166a7;
                        i6 += i2 + m28784G;
                    }
                    break;
                case 40:
                    m28784G = C44005kc7.m28784G((List) unsafe.getObject(obj, j));
                    if (m28784G > 0) {
                        m100166a7 = AbstractC33726Ja7.m100166a(m28784G);
                        m100166a8 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i2 = m100166a8 + m100166a7;
                        i6 += i2 + m28784G;
                    }
                    break;
                case 41:
                    m28784G = C44005kc7.m28786E((List) unsafe.getObject(obj, j));
                    if (m28784G > 0) {
                        m100166a7 = AbstractC33726Ja7.m100166a(m28784G);
                        m100166a8 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i2 = m100166a8 + m100166a7;
                        i6 += i2 + m28784G;
                    }
                    break;
                case 42:
                    Class cls = C44005kc7.f94645a;
                    m28784G = ((List) unsafe.getObject(obj, j)).size();
                    if (m28784G > 0) {
                        m100166a7 = AbstractC33726Ja7.m100166a(m28784G);
                        m100166a8 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i2 = m100166a8 + m100166a7;
                        i6 += i2 + m28784G;
                    }
                    break;
                case 43:
                    m28784G = C44005kc7.m28770U((List) unsafe.getObject(obj, j));
                    if (m28784G > 0) {
                        m100166a7 = AbstractC33726Ja7.m100166a(m28784G);
                        m100166a8 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i2 = m100166a8 + m100166a7;
                        i6 += i2 + m28784G;
                    }
                    break;
                case 44:
                    m28784G = C44005kc7.m28788C((List) unsafe.getObject(obj, j));
                    if (m28784G > 0) {
                        m100166a7 = AbstractC33726Ja7.m100166a(m28784G);
                        m100166a8 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i2 = m100166a8 + m100166a7;
                        i6 += i2 + m28784G;
                    }
                    break;
                case 45:
                    m28784G = C44005kc7.m28786E((List) unsafe.getObject(obj, j));
                    if (m28784G > 0) {
                        m100166a7 = AbstractC33726Ja7.m100166a(m28784G);
                        m100166a8 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i2 = m100166a8 + m100166a7;
                        i6 += i2 + m28784G;
                    }
                    break;
                case 46:
                    m28784G = C44005kc7.m28784G((List) unsafe.getObject(obj, j));
                    if (m28784G > 0) {
                        m100166a7 = AbstractC33726Ja7.m100166a(m28784G);
                        m100166a8 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i2 = m100166a8 + m100166a7;
                        i6 += i2 + m28784G;
                    }
                    break;
                case 47:
                    m28784G = C44005kc7.m28775P((List) unsafe.getObject(obj, j));
                    if (m28784G > 0) {
                        m100166a7 = AbstractC33726Ja7.m100166a(m28784G);
                        m100166a8 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i2 = m100166a8 + m100166a7;
                        i6 += i2 + m28784G;
                    }
                    break;
                case 48:
                    m28784G = C44005kc7.m28773R((List) unsafe.getObject(obj, j));
                    if (m28784G > 0) {
                        m100166a7 = AbstractC33726Ja7.m100166a(m28784G);
                        m100166a8 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i2 = m100166a8 + m100166a7;
                        i6 += i2 + m28784G;
                    }
                    break;
                case 49:
                    m28772S = C44005kc7.m28783H(i8, (List) unsafe.getObject(obj, j), m72874j(i5));
                    i6 += m28772S;
                    break;
                case 50:
                    m28772S = C34905Ob7.m91860a(i8, unsafe.getObject(obj, j), m72873k(i5));
                    i6 += m28772S;
                    break;
                case 51:
                    if (m72896C(obj, i8, i5)) {
                        m100166a9 = AbstractC33726Ja7.m100166a(i8 << 3);
                        m28772S = m100166a9 + 8;
                        i6 += m28772S;
                    }
                    break;
                case 52:
                    if (m72896C(obj, i8, i5)) {
                        m100166a10 = AbstractC33726Ja7.m100166a(i8 << 3);
                        m28772S = m100166a10 + 4;
                        i6 += m28772S;
                    }
                    break;
                case 53:
                    if (m72896C(obj, i8, i5)) {
                        m28784G = AbstractC33726Ja7.m100165b(m72876W(obj, j));
                        i2 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i6 += i2 + m28784G;
                    }
                    break;
                case 54:
                    if (m72896C(obj, i8, i5)) {
                        m28784G = AbstractC33726Ja7.m100165b(m72876W(obj, j));
                        i2 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i6 += i2 + m28784G;
                    }
                    break;
                case 55:
                    if (m72896C(obj, i8, i5)) {
                        m28784G = AbstractC33726Ja7.m100170B(m72886M(obj, j));
                        i2 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i6 += i2 + m28784G;
                    }
                    break;
                case 56:
                    if (m72896C(obj, i8, i5)) {
                        m100166a9 = AbstractC33726Ja7.m100166a(i8 << 3);
                        m28772S = m100166a9 + 8;
                        i6 += m28772S;
                    }
                    break;
                case 57:
                    if (m72896C(obj, i8, i5)) {
                        m100166a10 = AbstractC33726Ja7.m100166a(i8 << 3);
                        m28772S = m100166a10 + 4;
                        i6 += m28772S;
                    }
                    break;
                case 58:
                    if (m72896C(obj, i8, i5)) {
                        m28772S = AbstractC33726Ja7.m100166a(i8 << 3) + 1;
                        i6 += m28772S;
                    }
                    break;
                case 59:
                    if (m72896C(obj, i8, i5)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof AbstractC32088Ca7) {
                            Logger logger3 = AbstractC33726Ja7.f17883b;
                            int mo1072c3 = ((AbstractC32088Ca7) object2).mo1072c();
                            m100166a11 = AbstractC33726Ja7.m100166a(mo1072c3) + mo1072c3;
                            m100166a12 = AbstractC33726Ja7.m100166a(i8 << 3);
                            m28772S = m100166a12 + m100166a11;
                            i6 += m28772S;
                        } else {
                            m28784G = AbstractC33726Ja7.m100167E((String) object2);
                            i2 = AbstractC33726Ja7.m100166a(i8 << 3);
                            i6 += i2 + m28784G;
                        }
                    }
                    break;
                case 60:
                    if (m72896C(obj, i8, i5)) {
                        m28772S = C44005kc7.m28778M(i8, unsafe.getObject(obj, j), m72874j(i5));
                        i6 += m28772S;
                    }
                    break;
                case 61:
                    if (m72896C(obj, i8, i5)) {
                        Logger logger4 = AbstractC33726Ja7.f17883b;
                        int mo1072c4 = ((AbstractC32088Ca7) unsafe.getObject(obj, j)).mo1072c();
                        m100166a11 = AbstractC33726Ja7.m100166a(mo1072c4) + mo1072c4;
                        m100166a12 = AbstractC33726Ja7.m100166a(i8 << 3);
                        m28772S = m100166a12 + m100166a11;
                        i6 += m28772S;
                    }
                    break;
                case 62:
                    if (m72896C(obj, i8, i5)) {
                        m28784G = AbstractC33726Ja7.m100166a(m72886M(obj, j));
                        i2 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i6 += i2 + m28784G;
                    }
                    break;
                case 63:
                    if (m72896C(obj, i8, i5)) {
                        m28784G = AbstractC33726Ja7.m100170B(m72886M(obj, j));
                        i2 = AbstractC33726Ja7.m100166a(i8 << 3);
                        i6 += i2 + m28784G;
                    }
                    break;
                case 64:
                    if (m72896C(obj, i8, i5)) {
                        m100166a10 = AbstractC33726Ja7.m100166a(i8 << 3);
                        m28772S = m100166a10 + 4;
                        i6 += m28772S;
                    }
                    break;
                case 65:
                    if (m72896C(obj, i8, i5)) {
                        m100166a9 = AbstractC33726Ja7.m100166a(i8 << 3);
                        m28772S = m100166a9 + 8;
                        i6 += m28772S;
                    }
                    break;
                case 66:
                    if (m72896C(obj, i8, i5)) {
                        int m72886M = m72886M(obj, j);
                        i2 = AbstractC33726Ja7.m100166a(i8 << 3);
                        m28784G = AbstractC33726Ja7.m100166a((m72886M >> 31) ^ (m72886M + m72886M));
                        i6 += i2 + m28784G;
                    }
                    break;
                case 67:
                    if (m72896C(obj, i8, i5)) {
                        long m72876W = m72876W(obj, j);
                        i6 += AbstractC33726Ja7.m100166a(i8 << 3) + AbstractC33726Ja7.m100165b((m72876W >> 63) ^ (m72876W + m72876W));
                    }
                    break;
                case 68:
                    if (m72896C(obj, i8, i5)) {
                        m28772S = AbstractC33726Ja7.m100171A(i8, (InterfaceC36075Tb7) unsafe.getObject(obj, j), m72874j(i5));
                        i6 += m28772S;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        int i13 = 0;
        AbstractC31872Bc7 abstractC31872Bc7 = this.f48824l;
        int mo110105a = i6 + abstractC31872Bc7.mo110105a(abstractC31872Bc7.mo110102d(obj));
        if (this.f48818f) {
            C36066Ta7 mo88388b = this.f48825m.mo88388b(obj);
            for (int i14 = 0; i14 < mo88388b.f35709a.m8363b(); i14++) {
                Map.Entry m8358g = mo88388b.f35709a.m8358g(i14);
                i13 += C36066Ta7.m83381b((InterfaceC35832Sa7) m8358g.getKey(), m8358g.getValue());
            }
            for (Map.Entry entry : mo88388b.f35709a.m8362c()) {
                i13 += C36066Ta7.m83381b((InterfaceC35832Sa7) entry.getKey(), entry.getValue());
            }
            return mo110105a + i13;
        }
        return mo110105a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* renamed from: N */
    public final int m72885N(Object obj, byte[] bArr, int i, int i2, int i3, long j, C44578la7 c44578la7) throws IOException {
        Unsafe unsafe = f48812q;
        Object m72873k = m72873k(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((C34671Nb7) object).m93717h()) {
            C34671Nb7 m93720e = C34671Nb7.m93721d().m93720e();
            C34905Ob7.m91859b(m93720e, object);
            unsafe.putObject(obj, j, m93720e);
            object = m93720e;
        }
        C34203Lb7 m95140c = ((C34437Mb7) m72873k).m95140c();
        C34671Nb7 c34671Nb7 = (C34671Nb7) object;
        int m25395j = C45171ma7.m25395j(bArr, i, c44578la7);
        int i4 = c44578la7.f96359a;
        if (i4 >= 0 && i4 <= i2 - m25395j) {
            int i5 = m25395j + i4;
            Object obj2 = m95140c.f21752b;
            Object obj3 = m95140c.f21754d;
            while (m25395j < i5) {
                int i6 = m25395j + 1;
                byte b = bArr[m25395j];
                if (b < 0) {
                    i6 = C45171ma7.m25394k(b, bArr, i6, c44578la7);
                    b = c44578la7.f96359a;
                }
                int i7 = b & 7;
                int i8 = b >>> 3;
                if (i8 != 1) {
                    if (i8 == 2 && i7 == m95140c.f21753c.m86543y()) {
                        m25395j = m72894E(bArr, i6, i2, m95140c.f21753c, m95140c.f21754d.getClass(), c44578la7);
                        obj3 = c44578la7.f96361c;
                    }
                    m25395j = C45171ma7.m25389p(b, bArr, i6, i2, c44578la7);
                } else if (i7 == m95140c.f21751a.m86543y()) {
                    m25395j = m72894E(bArr, i6, i2, m95140c.f21751a, null, c44578la7);
                    obj2 = c44578la7.f96361c;
                } else {
                    m25395j = C45171ma7.m25389p(b, bArr, i6, i2, c44578la7);
                }
            }
            if (m25395j == i5) {
                c34671Nb7.put(obj2, obj3);
                return i5;
            }
            throw zbuw.m51258e();
        }
        throw zbuw.m51256g();
    }

    /* renamed from: O */
    public final int m72884O(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C44578la7 c44578la7) throws IOException {
        boolean z;
        Unsafe unsafe = f48812q;
        long j2 = this.f48813a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(C45171ma7.m25388q(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(C45171ma7.m25403b(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int m25392m = C45171ma7.m25392m(bArr, i, c44578la7);
                    unsafe.putObject(obj, j, Long.valueOf(c44578la7.f96360b));
                    unsafe.putInt(obj, j2, i4);
                    return m25392m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m25395j = C45171ma7.m25395j(bArr, i, c44578la7);
                    unsafe.putObject(obj, j, Integer.valueOf(c44578la7.f96359a));
                    unsafe.putInt(obj, j2, i4);
                    return m25395j;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(C45171ma7.m25388q(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(C45171ma7.m25403b(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m25392m2 = C45171ma7.m25392m(bArr, i, c44578la7);
                    if (c44578la7.f96360b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z));
                    unsafe.putInt(obj, j2, i4);
                    return m25392m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int m25395j2 = C45171ma7.m25395j(bArr, i, c44578la7);
                    int i13 = c44578la7.f96359a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !C35382Qc7.m88314e(bArr, m25395j2, m25395j2 + i13)) {
                        throw zbuw.m51260c();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m25395j2, i13, C46960pb7.f103840b));
                        m25395j2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m25395j2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object m72871m = m72871m(obj, i4, i8);
                    int m25390o = C45171ma7.m25390o(m72871m, m72874j(i8), bArr, i, i2, c44578la7);
                    m72863u(obj, i4, i8, m72871m);
                    return m25390o;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m25404a = C45171ma7.m25404a(bArr, i, c44578la7);
                    unsafe.putObject(obj, j, c44578la7.f96361c);
                    unsafe.putInt(obj, j2, i4);
                    return m25404a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m25395j3 = C45171ma7.m25395j(bArr, i, c44578la7);
                    int i14 = c44578la7.f96359a;
                    InterfaceC43402jb7 m72875i = m72875i(i8);
                    if (m72875i != null && !m72875i.mo953a(i14)) {
                        m72891H(obj).m111973j(i3, Long.valueOf(i14));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return m25395j3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int m25395j4 = C45171ma7.m25395j(bArr, i, c44578la7);
                    unsafe.putObject(obj, j, Integer.valueOf(C33024Ga7.m104994a(c44578la7.f96359a)));
                    unsafe.putInt(obj, j2, i4);
                    return m25395j4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int m25392m3 = C45171ma7.m25392m(bArr, i, c44578la7);
                    unsafe.putObject(obj, j, Long.valueOf(C33024Ga7.m104993b(c44578la7.f96360b)));
                    unsafe.putInt(obj, j2, i4);
                    return m25392m3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object m72871m2 = m72871m(obj, i4, i8);
                    int m25391n = C45171ma7.m25391n(m72871m2, m72874j(i8), bArr, i, i2, (i3 & (-8)) | 4, c44578la7);
                    m72863u(obj, i4, i8, m72871m2);
                    return m25391n;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0216 -> B:114:0x0217). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x0264 -> B:134:0x0265). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x019b -> B:82:0x019c). Please submit an issue!!! */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m72883P(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C44578la7 c44578la7) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        boolean z3;
        int i12;
        int m25393l;
        int i13;
        int i14 = i;
        Unsafe unsafe = f48812q;
        InterfaceC46367ob7 interfaceC46367ob7 = (InterfaceC46367ob7) unsafe.getObject(obj, j2);
        if (!interfaceC46367ob7.zbc()) {
            int size = interfaceC46367ob7.size();
            if (size == 0) {
                i13 = 10;
            } else {
                i13 = size + size;
            }
            interfaceC46367ob7 = interfaceC46367ob7.mo1043r0(i13);
            unsafe.putObject(obj, j2, interfaceC46367ob7);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    C34194La7 c34194La7 = (C34194La7) interfaceC46367ob7;
                    int m25395j = C45171ma7.m25395j(bArr, i14, c44578la7);
                    int i15 = c44578la7.f96359a + m25395j;
                    while (m25395j < i15) {
                        c34194La7.m96617b(Double.longBitsToDouble(C45171ma7.m25388q(bArr, m25395j)));
                        m25395j += 8;
                    }
                    if (m25395j != i15) {
                        throw zbuw.m51256g();
                    }
                    return m25395j;
                } else if (i5 == 1) {
                    C34194La7 c34194La72 = (C34194La7) interfaceC46367ob7;
                    c34194La72.m96617b(Double.longBitsToDouble(C45171ma7.m25388q(bArr, i)));
                    while (true) {
                        i8 = i14 + 8;
                        if (i8 < i2) {
                            i14 = C45171ma7.m25395j(bArr, i8, c44578la7);
                            if (i3 == c44578la7.f96359a) {
                                c34194La72.m96617b(Double.longBitsToDouble(C45171ma7.m25388q(bArr, i14)));
                            }
                        }
                    }
                    return i8;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    C37002Xa7 c37002Xa7 = (C37002Xa7) interfaceC46367ob7;
                    int m25395j2 = C45171ma7.m25395j(bArr, i14, c44578la7);
                    int i16 = c44578la7.f96359a + m25395j2;
                    while (m25395j2 < i16) {
                        c37002Xa7.m76841c(Float.intBitsToFloat(C45171ma7.m25403b(bArr, m25395j2)));
                        m25395j2 += 4;
                    }
                    if (m25395j2 != i16) {
                        throw zbuw.m51256g();
                    }
                    return m25395j2;
                } else if (i5 == 5) {
                    C37002Xa7 c37002Xa72 = (C37002Xa7) interfaceC46367ob7;
                    c37002Xa72.m76841c(Float.intBitsToFloat(C45171ma7.m25403b(bArr, i)));
                    while (true) {
                        i9 = i14 + 4;
                        if (i9 < i2) {
                            i14 = C45171ma7.m25395j(bArr, i9, c44578la7);
                            if (i3 == c44578la7.f96359a) {
                                c37002Xa72.m76841c(Float.intBitsToFloat(C45171ma7.m25403b(bArr, i14)));
                            }
                        }
                    }
                    return i9;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    C33267Hb7 c33267Hb7 = (C33267Hb7) interfaceC46367ob7;
                    int m25395j3 = C45171ma7.m25395j(bArr, i14, c44578la7);
                    int i17 = c44578la7.f96359a + m25395j3;
                    while (m25395j3 < i17) {
                        m25395j3 = C45171ma7.m25392m(bArr, m25395j3, c44578la7);
                        c33267Hb7.m103662e(c44578la7.f96360b);
                    }
                    if (m25395j3 != i17) {
                        throw zbuw.m51256g();
                    }
                    return m25395j3;
                } else if (i5 == 0) {
                    C33267Hb7 c33267Hb72 = (C33267Hb7) interfaceC46367ob7;
                    int m25392m = C45171ma7.m25392m(bArr, i14, c44578la7);
                    c33267Hb72.m103662e(c44578la7.f96360b);
                    while (m25392m < i2) {
                        int m25395j4 = C45171ma7.m25395j(bArr, m25392m, c44578la7);
                        if (i3 == c44578la7.f96359a) {
                            m25392m = C45171ma7.m25392m(bArr, m25395j4, c44578la7);
                            c33267Hb72.m103662e(c44578la7.f96360b);
                        } else {
                            return m25392m;
                        }
                    }
                    return m25392m;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C45171ma7.m25399f(bArr, i14, interfaceC46367ob7, c44578la7);
                }
                if (i5 == 0) {
                    return C45171ma7.m25393l(i3, bArr, i, i2, interfaceC46367ob7, c44578la7);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    C33267Hb7 c33267Hb73 = (C33267Hb7) interfaceC46367ob7;
                    int m25395j5 = C45171ma7.m25395j(bArr, i14, c44578la7);
                    int i18 = c44578la7.f96359a + m25395j5;
                    while (m25395j5 < i18) {
                        c33267Hb73.m103662e(C45171ma7.m25388q(bArr, m25395j5));
                        m25395j5 += 8;
                    }
                    if (m25395j5 != i18) {
                        throw zbuw.m51256g();
                    }
                    return m25395j5;
                } else if (i5 == 1) {
                    C33267Hb7 c33267Hb74 = (C33267Hb7) interfaceC46367ob7;
                    c33267Hb74.m103662e(C45171ma7.m25388q(bArr, i));
                    while (true) {
                        i10 = i14 + 8;
                        if (i10 < i2) {
                            i14 = C45171ma7.m25395j(bArr, i10, c44578la7);
                            if (i3 == c44578la7.f96359a) {
                                c33267Hb74.m103662e(C45171ma7.m25388q(bArr, i14));
                            }
                        }
                    }
                    return i10;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    C41623gb7 c41623gb7 = (C41623gb7) interfaceC46367ob7;
                    int m25395j6 = C45171ma7.m25395j(bArr, i14, c44578la7);
                    int i19 = c44578la7.f96359a + m25395j6;
                    while (m25395j6 < i19) {
                        c41623gb7.m37986e(C45171ma7.m25403b(bArr, m25395j6));
                        m25395j6 += 4;
                    }
                    if (m25395j6 != i19) {
                        throw zbuw.m51256g();
                    }
                    return m25395j6;
                } else if (i5 == 5) {
                    C41623gb7 c41623gb72 = (C41623gb7) interfaceC46367ob7;
                    c41623gb72.m37986e(C45171ma7.m25403b(bArr, i));
                    while (true) {
                        i11 = i14 + 4;
                        if (i11 < i2) {
                            i14 = C45171ma7.m25395j(bArr, i11, c44578la7);
                            if (i3 == c44578la7.f96359a) {
                                c41623gb72.m37986e(C45171ma7.m25403b(bArr, i14));
                            }
                        }
                    }
                    return i11;
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    C45764na7 c45764na7 = (C45764na7) interfaceC46367ob7;
                    int m25395j7 = C45171ma7.m25395j(bArr, i14, c44578la7);
                    int i20 = c44578la7.f96359a + m25395j7;
                    while (m25395j7 < i20) {
                        m25395j7 = C45171ma7.m25392m(bArr, m25395j7, c44578la7);
                        if (c44578la7.f96360b != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c45764na7.m23492b(z3);
                    }
                    if (m25395j7 != i20) {
                        throw zbuw.m51256g();
                    }
                    return m25395j7;
                } else if (i5 == 0) {
                    C45764na7 c45764na72 = (C45764na7) interfaceC46367ob7;
                    int m25392m2 = C45171ma7.m25392m(bArr, i14, c44578la7);
                    if (c44578la7.f96360b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c45764na72.m23492b(z);
                    while (m25392m2 < i2) {
                        int m25395j8 = C45171ma7.m25395j(bArr, m25392m2, c44578la7);
                        if (i3 == c44578la7.f96359a) {
                            m25392m2 = C45171ma7.m25392m(bArr, m25395j8, c44578la7);
                            if (c44578la7.f96360b != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c45764na72.m23492b(z2);
                        } else {
                            return m25392m2;
                        }
                    }
                    return m25392m2;
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int m25395j9 = C45171ma7.m25395j(bArr, i14, c44578la7);
                        int i21 = c44578la7.f96359a;
                        if (i21 >= 0) {
                            if (i21 == 0) {
                                interfaceC46367ob7.add("");
                                while (m25395j9 < i2) {
                                    int m25395j10 = C45171ma7.m25395j(bArr, m25395j9, c44578la7);
                                    if (i3 == c44578la7.f96359a) {
                                        m25395j9 = C45171ma7.m25395j(bArr, m25395j10, c44578la7);
                                        i21 = c44578la7.f96359a;
                                        if (i21 >= 0) {
                                            if (i21 == 0) {
                                                interfaceC46367ob7.add("");
                                            } else {
                                                interfaceC46367ob7.add(new String(bArr, m25395j9, i21, C46960pb7.f103840b));
                                                m25395j9 += i21;
                                                while (m25395j9 < i2) {
                                                }
                                            }
                                        } else {
                                            throw zbuw.m51259d();
                                        }
                                    } else {
                                        return m25395j9;
                                    }
                                }
                                return m25395j9;
                            }
                            interfaceC46367ob7.add(new String(bArr, m25395j9, i21, C46960pb7.f103840b));
                            m25395j9 += i21;
                            while (m25395j9 < i2) {
                            }
                            return m25395j9;
                        }
                        throw zbuw.m51259d();
                    }
                    int m25395j11 = C45171ma7.m25395j(bArr, i14, c44578la7);
                    int i22 = c44578la7.f96359a;
                    if (i22 >= 0) {
                        if (i22 == 0) {
                            interfaceC46367ob7.add("");
                            while (m25395j11 < i2) {
                                int m25395j12 = C45171ma7.m25395j(bArr, m25395j11, c44578la7);
                                if (i3 == c44578la7.f96359a) {
                                    m25395j11 = C45171ma7.m25395j(bArr, m25395j12, c44578la7);
                                    int i23 = c44578la7.f96359a;
                                    if (i23 >= 0) {
                                        if (i23 == 0) {
                                            interfaceC46367ob7.add("");
                                        } else {
                                            i12 = m25395j11 + i23;
                                            if (C35382Qc7.m88314e(bArr, m25395j11, i12)) {
                                                interfaceC46367ob7.add(new String(bArr, m25395j11, i23, C46960pb7.f103840b));
                                                m25395j11 = i12;
                                                while (m25395j11 < i2) {
                                                }
                                            } else {
                                                throw zbuw.m51260c();
                                            }
                                        }
                                    } else {
                                        throw zbuw.m51259d();
                                    }
                                } else {
                                    return m25395j11;
                                }
                            }
                            return m25395j11;
                        }
                        i12 = m25395j11 + i22;
                        if (C35382Qc7.m88314e(bArr, m25395j11, i12)) {
                            interfaceC46367ob7.add(new String(bArr, m25395j11, i22, C46960pb7.f103840b));
                            m25395j11 = i12;
                            while (m25395j11 < i2) {
                            }
                            return m25395j11;
                        }
                        throw zbuw.m51260c();
                    }
                    throw zbuw.m51259d();
                }
                break;
            case 27:
                if (i5 == 2) {
                    return C45171ma7.m25400e(m72874j(i6), i3, bArr, i, i2, interfaceC46367ob7, c44578la7);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int m25395j13 = C45171ma7.m25395j(bArr, i14, c44578la7);
                    int i24 = c44578la7.f96359a;
                    if (i24 >= 0) {
                        if (i24 <= bArr.length - m25395j13) {
                            if (i24 == 0) {
                                interfaceC46367ob7.add(AbstractC32088Ca7.f4281c);
                                while (m25395j13 < i2) {
                                    int m25395j14 = C45171ma7.m25395j(bArr, m25395j13, c44578la7);
                                    if (i3 == c44578la7.f96359a) {
                                        m25395j13 = C45171ma7.m25395j(bArr, m25395j14, c44578la7);
                                        i24 = c44578la7.f96359a;
                                        if (i24 >= 0) {
                                            if (i24 <= bArr.length - m25395j13) {
                                                if (i24 == 0) {
                                                    interfaceC46367ob7.add(AbstractC32088Ca7.f4281c);
                                                } else {
                                                    interfaceC46367ob7.add(AbstractC32088Ca7.m112096v(bArr, m25395j13, i24));
                                                    m25395j13 += i24;
                                                    while (m25395j13 < i2) {
                                                    }
                                                }
                                            } else {
                                                throw zbuw.m51256g();
                                            }
                                        } else {
                                            throw zbuw.m51259d();
                                        }
                                    } else {
                                        return m25395j13;
                                    }
                                }
                                return m25395j13;
                            }
                            interfaceC46367ob7.add(AbstractC32088Ca7.m112096v(bArr, m25395j13, i24));
                            m25395j13 += i24;
                            while (m25395j13 < i2) {
                            }
                            return m25395j13;
                        }
                        throw zbuw.m51256g();
                    }
                    throw zbuw.m51259d();
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    m25393l = C45171ma7.m25399f(bArr, i14, interfaceC46367ob7, c44578la7);
                } else if (i5 == 0) {
                    m25393l = C45171ma7.m25393l(i3, bArr, i, i2, interfaceC46367ob7, c44578la7);
                }
                InterfaceC43402jb7 m72875i = m72875i(i6);
                AbstractC31872Bc7 abstractC31872Bc7 = this.f48824l;
                Class cls = C44005kc7.f94645a;
                if (m72875i != null) {
                    Object obj2 = null;
                    if (interfaceC46367ob7 instanceof RandomAccess) {
                        int size2 = interfaceC46367ob7.size();
                        int i25 = 0;
                        for (int i26 = 0; i26 < size2; i26++) {
                            int intValue = ((Integer) interfaceC46367ob7.get(i26)).intValue();
                            if (m72875i.mo953a(intValue)) {
                                if (i26 != i25) {
                                    interfaceC46367ob7.set(i25, Integer.valueOf(intValue));
                                }
                                i25++;
                            } else {
                                obj2 = C44005kc7.m28764b(obj, i4, intValue, obj2, abstractC31872Bc7);
                            }
                        }
                        if (i25 != size2) {
                            interfaceC46367ob7.subList(i25, size2).clear();
                            return m25393l;
                        }
                    } else {
                        Iterator it = interfaceC46367ob7.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!m72875i.mo953a(intValue2)) {
                                obj2 = C44005kc7.m28764b(obj, i4, intValue2, obj2, abstractC31872Bc7);
                                it.remove();
                            }
                        }
                    }
                }
                return m25393l;
            case 33:
            case 47:
                if (i5 == 2) {
                    C41623gb7 c41623gb73 = (C41623gb7) interfaceC46367ob7;
                    int m25395j15 = C45171ma7.m25395j(bArr, i14, c44578la7);
                    int i27 = c44578la7.f96359a + m25395j15;
                    while (m25395j15 < i27) {
                        m25395j15 = C45171ma7.m25395j(bArr, m25395j15, c44578la7);
                        c41623gb73.m37986e(C33024Ga7.m104994a(c44578la7.f96359a));
                    }
                    if (m25395j15 != i27) {
                        throw zbuw.m51256g();
                    }
                    return m25395j15;
                } else if (i5 == 0) {
                    C41623gb7 c41623gb74 = (C41623gb7) interfaceC46367ob7;
                    int m25395j16 = C45171ma7.m25395j(bArr, i14, c44578la7);
                    c41623gb74.m37986e(C33024Ga7.m104994a(c44578la7.f96359a));
                    while (m25395j16 < i2) {
                        int m25395j17 = C45171ma7.m25395j(bArr, m25395j16, c44578la7);
                        if (i3 == c44578la7.f96359a) {
                            m25395j16 = C45171ma7.m25395j(bArr, m25395j17, c44578la7);
                            c41623gb74.m37986e(C33024Ga7.m104994a(c44578la7.f96359a));
                        } else {
                            return m25395j16;
                        }
                    }
                    return m25395j16;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    C33267Hb7 c33267Hb75 = (C33267Hb7) interfaceC46367ob7;
                    int m25395j18 = C45171ma7.m25395j(bArr, i14, c44578la7);
                    int i28 = c44578la7.f96359a + m25395j18;
                    while (m25395j18 < i28) {
                        m25395j18 = C45171ma7.m25392m(bArr, m25395j18, c44578la7);
                        c33267Hb75.m103662e(C33024Ga7.m104993b(c44578la7.f96360b));
                    }
                    if (m25395j18 != i28) {
                        throw zbuw.m51256g();
                    }
                    return m25395j18;
                } else if (i5 == 0) {
                    C33267Hb7 c33267Hb76 = (C33267Hb7) interfaceC46367ob7;
                    int m25392m3 = C45171ma7.m25392m(bArr, i14, c44578la7);
                    c33267Hb76.m103662e(C33024Ga7.m104993b(c44578la7.f96360b));
                    while (m25392m3 < i2) {
                        int m25395j19 = C45171ma7.m25395j(bArr, m25392m3, c44578la7);
                        if (i3 == c44578la7.f96359a) {
                            m25392m3 = C45171ma7.m25392m(bArr, m25395j19, c44578la7);
                            c33267Hb76.m103662e(C33024Ga7.m104993b(c44578la7.f96360b));
                        } else {
                            return m25392m3;
                        }
                    }
                    return m25392m3;
                }
                break;
            default:
                if (i5 == 3) {
                    InterfaceC42819ic7 m72874j = m72874j(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int m25402c = C45171ma7.m25402c(m72874j, bArr, i, i2, i29, c44578la7);
                    interfaceC46367ob7.add(c44578la7.f96361c);
                    while (m25402c < i2) {
                        int m25395j20 = C45171ma7.m25395j(bArr, m25402c, c44578la7);
                        if (i3 == c44578la7.f96359a) {
                            m25402c = C45171ma7.m25402c(m72874j, bArr, m25395j20, i2, i29, c44578la7);
                            interfaceC46367ob7.add(c44578la7.f96361c);
                        } else {
                            return m25402c;
                        }
                    }
                    return m25402c;
                }
                break;
        }
        return i14;
    }

    /* renamed from: Q */
    public final int m72882Q(int i) {
        if (i < this.f48815c || i > this.f48816d) {
            return -1;
        }
        return m72879T(i, 0);
    }

    /* renamed from: R */
    public final int m72881R(int i, int i2) {
        if (i < this.f48815c || i > this.f48816d) {
            return -1;
        }
        return m72879T(i, i2);
    }

    /* renamed from: S */
    public final int m72880S(int i) {
        return this.f48813a[i + 2];
    }

    /* renamed from: T */
    public final int m72879T(int i, int i2) {
        int length = (this.f48813a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f48813a[i4];
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

    /* renamed from: V */
    public final int m72877V(int i) {
        return this.f48813a[i + 1];
    }

    @Override // p000.InterfaceC42819ic7
    /* renamed from: a */
    public final int mo33747a(Object obj) {
        int m100166a;
        int m100166a2;
        int m100165b;
        int m100166a3;
        int m100166a4;
        int m100166a5;
        int m100166a6;
        int m28778M;
        int m100166a7;
        int m100165b2;
        int m100166a8;
        int m100166a9;
        if (this.f48819g) {
            Unsafe unsafe = f48812q;
            int i = 0;
            for (int i2 = 0; i2 < this.f48813a.length; i2 += 3) {
                int m72877V = m72877V(i2);
                int m72878U = m72878U(m72877V);
                int i3 = this.f48813a[i2];
                int i4 = m72877V & 1048575;
                if (m72878U >= EnumC36768Wa7.f41333R.m78166y() && m72878U <= EnumC36768Wa7.f41363u0.m78166y()) {
                    int i5 = this.f48813a[i2 + 2];
                }
                long j = i4;
                switch (m72878U) {
                    case 0:
                        if (m72860x(obj, i2)) {
                            m100166a = AbstractC33726Ja7.m100166a(i3 << 3);
                            m28778M = m100166a + 8;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m72860x(obj, i2)) {
                            m100166a2 = AbstractC33726Ja7.m100166a(i3 << 3);
                            m28778M = m100166a2 + 4;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m72860x(obj, i2)) {
                            m100165b = AbstractC33726Ja7.m100165b(C34212Lc7.m96569i(obj, j));
                            m100166a3 = AbstractC33726Ja7.m100166a(i3 << 3);
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m72860x(obj, i2)) {
                            m100165b = AbstractC33726Ja7.m100165b(C34212Lc7.m96569i(obj, j));
                            m100166a3 = AbstractC33726Ja7.m100166a(i3 << 3);
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m72860x(obj, i2)) {
                            m100165b = AbstractC33726Ja7.m100170B(C34212Lc7.m96570h(obj, j));
                            m100166a3 = AbstractC33726Ja7.m100166a(i3 << 3);
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m72860x(obj, i2)) {
                            m100166a = AbstractC33726Ja7.m100166a(i3 << 3);
                            m28778M = m100166a + 8;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m72860x(obj, i2)) {
                            m100166a2 = AbstractC33726Ja7.m100166a(i3 << 3);
                            m28778M = m100166a2 + 4;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m72860x(obj, i2)) {
                            m100166a4 = AbstractC33726Ja7.m100166a(i3 << 3);
                            m28778M = m100166a4 + 1;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m72860x(obj, i2)) {
                            Object m96567k = C34212Lc7.m96567k(obj, j);
                            if (m96567k instanceof AbstractC32088Ca7) {
                                int i6 = i3 << 3;
                                Logger logger = AbstractC33726Ja7.f17883b;
                                int mo1072c = ((AbstractC32088Ca7) m96567k).mo1072c();
                                m100166a5 = AbstractC33726Ja7.m100166a(mo1072c) + mo1072c;
                                m100166a6 = AbstractC33726Ja7.m100166a(i6);
                                m28778M = m100166a6 + m100166a5;
                                i += m28778M;
                                break;
                            } else {
                                m100165b = AbstractC33726Ja7.m100167E((String) m96567k);
                                m100166a3 = AbstractC33726Ja7.m100166a(i3 << 3);
                                i += m100166a3 + m100165b;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (m72860x(obj, i2)) {
                            m28778M = C44005kc7.m28778M(i3, C34212Lc7.m96567k(obj, j), m72874j(i2));
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m72860x(obj, i2)) {
                            int i7 = i3 << 3;
                            Logger logger2 = AbstractC33726Ja7.f17883b;
                            int mo1072c2 = ((AbstractC32088Ca7) C34212Lc7.m96567k(obj, j)).mo1072c();
                            m100166a5 = AbstractC33726Ja7.m100166a(mo1072c2) + mo1072c2;
                            m100166a6 = AbstractC33726Ja7.m100166a(i7);
                            m28778M = m100166a6 + m100166a5;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m72860x(obj, i2)) {
                            m100165b = AbstractC33726Ja7.m100166a(C34212Lc7.m96570h(obj, j));
                            m100166a3 = AbstractC33726Ja7.m100166a(i3 << 3);
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m72860x(obj, i2)) {
                            m100165b = AbstractC33726Ja7.m100170B(C34212Lc7.m96570h(obj, j));
                            m100166a3 = AbstractC33726Ja7.m100166a(i3 << 3);
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m72860x(obj, i2)) {
                            m100166a2 = AbstractC33726Ja7.m100166a(i3 << 3);
                            m28778M = m100166a2 + 4;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m72860x(obj, i2)) {
                            m100166a = AbstractC33726Ja7.m100166a(i3 << 3);
                            m28778M = m100166a + 8;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m72860x(obj, i2)) {
                            int m96570h = C34212Lc7.m96570h(obj, j);
                            m100166a3 = AbstractC33726Ja7.m100166a(i3 << 3);
                            m100165b = AbstractC33726Ja7.m100166a((m96570h >> 31) ^ (m96570h + m96570h));
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m72860x(obj, i2)) {
                            long m96569i = C34212Lc7.m96569i(obj, j);
                            m100166a7 = AbstractC33726Ja7.m100166a(i3 << 3);
                            m100165b2 = AbstractC33726Ja7.m100165b((m96569i + m96569i) ^ (m96569i >> 63));
                            m28778M = m100166a7 + m100165b2;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m72860x(obj, i2)) {
                            m28778M = AbstractC33726Ja7.m100171A(i3, (InterfaceC36075Tb7) C34212Lc7.m96567k(obj, j), m72874j(i2));
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        m28778M = C44005kc7.m28785F(i3, (List) C34212Lc7.m96567k(obj, j), false);
                        i += m28778M;
                        break;
                    case 19:
                        m28778M = C44005kc7.m28787D(i3, (List) C34212Lc7.m96567k(obj, j), false);
                        i += m28778M;
                        break;
                    case 20:
                        m28778M = C44005kc7.m28780K(i3, (List) C34212Lc7.m96567k(obj, j), false);
                        i += m28778M;
                        break;
                    case 21:
                        m28778M = C44005kc7.m28769V(i3, (List) C34212Lc7.m96567k(obj, j), false);
                        i += m28778M;
                        break;
                    case 22:
                        m28778M = C44005kc7.m28782I(i3, (List) C34212Lc7.m96567k(obj, j), false);
                        i += m28778M;
                        break;
                    case 23:
                        m28778M = C44005kc7.m28785F(i3, (List) C34212Lc7.m96567k(obj, j), false);
                        i += m28778M;
                        break;
                    case 24:
                        m28778M = C44005kc7.m28787D(i3, (List) C34212Lc7.m96567k(obj, j), false);
                        i += m28778M;
                        break;
                    case 25:
                        m28778M = C44005kc7.m28740z(i3, (List) C34212Lc7.m96567k(obj, j), false);
                        i += m28778M;
                        break;
                    case 26:
                        m28778M = C44005kc7.m28772S(i3, (List) C34212Lc7.m96567k(obj, j));
                        i += m28778M;
                        break;
                    case 27:
                        m28778M = C44005kc7.m28777N(i3, (List) C34212Lc7.m96567k(obj, j), m72874j(i2));
                        i += m28778M;
                        break;
                    case 28:
                        m28778M = C44005kc7.m28790A(i3, (List) C34212Lc7.m96567k(obj, j));
                        i += m28778M;
                        break;
                    case 29:
                        m28778M = C44005kc7.m28771T(i3, (List) C34212Lc7.m96567k(obj, j), false);
                        i += m28778M;
                        break;
                    case 30:
                        m28778M = C44005kc7.m28789B(i3, (List) C34212Lc7.m96567k(obj, j), false);
                        i += m28778M;
                        break;
                    case 31:
                        m28778M = C44005kc7.m28787D(i3, (List) C34212Lc7.m96567k(obj, j), false);
                        i += m28778M;
                        break;
                    case 32:
                        m28778M = C44005kc7.m28785F(i3, (List) C34212Lc7.m96567k(obj, j), false);
                        i += m28778M;
                        break;
                    case 33:
                        m28778M = C44005kc7.m28776O(i3, (List) C34212Lc7.m96567k(obj, j), false);
                        i += m28778M;
                        break;
                    case 34:
                        m28778M = C44005kc7.m28774Q(i3, (List) C34212Lc7.m96567k(obj, j), false);
                        i += m28778M;
                        break;
                    case 35:
                        m100165b = C44005kc7.m28784G((List) unsafe.getObject(obj, j));
                        if (m100165b > 0) {
                            int i8 = i3 << 3;
                            m100166a8 = AbstractC33726Ja7.m100166a(m100165b);
                            m100166a9 = AbstractC33726Ja7.m100166a(i8);
                            m100166a3 = m100166a9 + m100166a8;
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        m100165b = C44005kc7.m28786E((List) unsafe.getObject(obj, j));
                        if (m100165b > 0) {
                            int i9 = i3 << 3;
                            m100166a8 = AbstractC33726Ja7.m100166a(m100165b);
                            m100166a9 = AbstractC33726Ja7.m100166a(i9);
                            m100166a3 = m100166a9 + m100166a8;
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        m100165b = C44005kc7.m28779L((List) unsafe.getObject(obj, j));
                        if (m100165b > 0) {
                            int i10 = i3 << 3;
                            m100166a8 = AbstractC33726Ja7.m100166a(m100165b);
                            m100166a9 = AbstractC33726Ja7.m100166a(i10);
                            m100166a3 = m100166a9 + m100166a8;
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        m100165b = C44005kc7.m28768W((List) unsafe.getObject(obj, j));
                        if (m100165b > 0) {
                            int i11 = i3 << 3;
                            m100166a8 = AbstractC33726Ja7.m100166a(m100165b);
                            m100166a9 = AbstractC33726Ja7.m100166a(i11);
                            m100166a3 = m100166a9 + m100166a8;
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        m100165b = C44005kc7.m28781J((List) unsafe.getObject(obj, j));
                        if (m100165b > 0) {
                            int i12 = i3 << 3;
                            m100166a8 = AbstractC33726Ja7.m100166a(m100165b);
                            m100166a9 = AbstractC33726Ja7.m100166a(i12);
                            m100166a3 = m100166a9 + m100166a8;
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        m100165b = C44005kc7.m28784G((List) unsafe.getObject(obj, j));
                        if (m100165b > 0) {
                            int i13 = i3 << 3;
                            m100166a8 = AbstractC33726Ja7.m100166a(m100165b);
                            m100166a9 = AbstractC33726Ja7.m100166a(i13);
                            m100166a3 = m100166a9 + m100166a8;
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        m100165b = C44005kc7.m28786E((List) unsafe.getObject(obj, j));
                        if (m100165b > 0) {
                            int i14 = i3 << 3;
                            m100166a8 = AbstractC33726Ja7.m100166a(m100165b);
                            m100166a9 = AbstractC33726Ja7.m100166a(i14);
                            m100166a3 = m100166a9 + m100166a8;
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        Class cls = C44005kc7.f94645a;
                        m100165b = ((List) unsafe.getObject(obj, j)).size();
                        if (m100165b > 0) {
                            int i15 = i3 << 3;
                            m100166a8 = AbstractC33726Ja7.m100166a(m100165b);
                            m100166a9 = AbstractC33726Ja7.m100166a(i15);
                            m100166a3 = m100166a9 + m100166a8;
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        m100165b = C44005kc7.m28770U((List) unsafe.getObject(obj, j));
                        if (m100165b > 0) {
                            int i16 = i3 << 3;
                            m100166a8 = AbstractC33726Ja7.m100166a(m100165b);
                            m100166a9 = AbstractC33726Ja7.m100166a(i16);
                            m100166a3 = m100166a9 + m100166a8;
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        m100165b = C44005kc7.m28788C((List) unsafe.getObject(obj, j));
                        if (m100165b > 0) {
                            int i17 = i3 << 3;
                            m100166a8 = AbstractC33726Ja7.m100166a(m100165b);
                            m100166a9 = AbstractC33726Ja7.m100166a(i17);
                            m100166a3 = m100166a9 + m100166a8;
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        m100165b = C44005kc7.m28786E((List) unsafe.getObject(obj, j));
                        if (m100165b > 0) {
                            int i18 = i3 << 3;
                            m100166a8 = AbstractC33726Ja7.m100166a(m100165b);
                            m100166a9 = AbstractC33726Ja7.m100166a(i18);
                            m100166a3 = m100166a9 + m100166a8;
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        m100165b = C44005kc7.m28784G((List) unsafe.getObject(obj, j));
                        if (m100165b > 0) {
                            int i19 = i3 << 3;
                            m100166a8 = AbstractC33726Ja7.m100166a(m100165b);
                            m100166a9 = AbstractC33726Ja7.m100166a(i19);
                            m100166a3 = m100166a9 + m100166a8;
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        m100165b = C44005kc7.m28775P((List) unsafe.getObject(obj, j));
                        if (m100165b > 0) {
                            int i20 = i3 << 3;
                            m100166a8 = AbstractC33726Ja7.m100166a(m100165b);
                            m100166a9 = AbstractC33726Ja7.m100166a(i20);
                            m100166a3 = m100166a9 + m100166a8;
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        m100165b = C44005kc7.m28773R((List) unsafe.getObject(obj, j));
                        if (m100165b > 0) {
                            int i21 = i3 << 3;
                            m100166a8 = AbstractC33726Ja7.m100166a(m100165b);
                            m100166a9 = AbstractC33726Ja7.m100166a(i21);
                            m100166a3 = m100166a9 + m100166a8;
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        m28778M = C44005kc7.m28783H(i3, (List) C34212Lc7.m96567k(obj, j), m72874j(i2));
                        i += m28778M;
                        break;
                    case 50:
                        m28778M = C34905Ob7.m91860a(i3, C34212Lc7.m96567k(obj, j), m72873k(i2));
                        i += m28778M;
                        break;
                    case 51:
                        if (m72896C(obj, i3, i2)) {
                            m100166a = AbstractC33726Ja7.m100166a(i3 << 3);
                            m28778M = m100166a + 8;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m72896C(obj, i3, i2)) {
                            m100166a2 = AbstractC33726Ja7.m100166a(i3 << 3);
                            m28778M = m100166a2 + 4;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m72896C(obj, i3, i2)) {
                            m100165b = AbstractC33726Ja7.m100165b(m72876W(obj, j));
                            m100166a3 = AbstractC33726Ja7.m100166a(i3 << 3);
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m72896C(obj, i3, i2)) {
                            m100165b = AbstractC33726Ja7.m100165b(m72876W(obj, j));
                            m100166a3 = AbstractC33726Ja7.m100166a(i3 << 3);
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m72896C(obj, i3, i2)) {
                            m100165b = AbstractC33726Ja7.m100170B(m72886M(obj, j));
                            m100166a3 = AbstractC33726Ja7.m100166a(i3 << 3);
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m72896C(obj, i3, i2)) {
                            m100166a = AbstractC33726Ja7.m100166a(i3 << 3);
                            m28778M = m100166a + 8;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m72896C(obj, i3, i2)) {
                            m100166a2 = AbstractC33726Ja7.m100166a(i3 << 3);
                            m28778M = m100166a2 + 4;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m72896C(obj, i3, i2)) {
                            m100166a4 = AbstractC33726Ja7.m100166a(i3 << 3);
                            m28778M = m100166a4 + 1;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (m72896C(obj, i3, i2)) {
                            Object m96567k2 = C34212Lc7.m96567k(obj, j);
                            if (m96567k2 instanceof AbstractC32088Ca7) {
                                int i22 = i3 << 3;
                                Logger logger3 = AbstractC33726Ja7.f17883b;
                                int mo1072c3 = ((AbstractC32088Ca7) m96567k2).mo1072c();
                                m100166a5 = AbstractC33726Ja7.m100166a(mo1072c3) + mo1072c3;
                                m100166a6 = AbstractC33726Ja7.m100166a(i22);
                                m28778M = m100166a6 + m100166a5;
                                i += m28778M;
                                break;
                            } else {
                                m100165b = AbstractC33726Ja7.m100167E((String) m96567k2);
                                m100166a3 = AbstractC33726Ja7.m100166a(i3 << 3);
                                i += m100166a3 + m100165b;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (m72896C(obj, i3, i2)) {
                            m28778M = C44005kc7.m28778M(i3, C34212Lc7.m96567k(obj, j), m72874j(i2));
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m72896C(obj, i3, i2)) {
                            int i23 = i3 << 3;
                            Logger logger4 = AbstractC33726Ja7.f17883b;
                            int mo1072c4 = ((AbstractC32088Ca7) C34212Lc7.m96567k(obj, j)).mo1072c();
                            m100166a5 = AbstractC33726Ja7.m100166a(mo1072c4) + mo1072c4;
                            m100166a6 = AbstractC33726Ja7.m100166a(i23);
                            m28778M = m100166a6 + m100166a5;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m72896C(obj, i3, i2)) {
                            m100165b = AbstractC33726Ja7.m100166a(m72886M(obj, j));
                            m100166a3 = AbstractC33726Ja7.m100166a(i3 << 3);
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m72896C(obj, i3, i2)) {
                            m100165b = AbstractC33726Ja7.m100170B(m72886M(obj, j));
                            m100166a3 = AbstractC33726Ja7.m100166a(i3 << 3);
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m72896C(obj, i3, i2)) {
                            m100166a2 = AbstractC33726Ja7.m100166a(i3 << 3);
                            m28778M = m100166a2 + 4;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m72896C(obj, i3, i2)) {
                            m100166a = AbstractC33726Ja7.m100166a(i3 << 3);
                            m28778M = m100166a + 8;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m72896C(obj, i3, i2)) {
                            int m72886M = m72886M(obj, j);
                            m100166a3 = AbstractC33726Ja7.m100166a(i3 << 3);
                            m100165b = AbstractC33726Ja7.m100166a((m72886M >> 31) ^ (m72886M + m72886M));
                            i += m100166a3 + m100165b;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m72896C(obj, i3, i2)) {
                            long m72876W = m72876W(obj, j);
                            m100166a7 = AbstractC33726Ja7.m100166a(i3 << 3);
                            m100165b2 = AbstractC33726Ja7.m100165b((m72876W + m72876W) ^ (m72876W >> 63));
                            m28778M = m100166a7 + m100165b2;
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (m72896C(obj, i3, i2)) {
                            m28778M = AbstractC33726Ja7.m100171A(i3, (InterfaceC36075Tb7) C34212Lc7.m96567k(obj, j), m72874j(i2));
                            i += m28778M;
                            break;
                        } else {
                            break;
                        }
                }
            }
            AbstractC31872Bc7 abstractC31872Bc7 = this.f48824l;
            return i + abstractC31872Bc7.mo110105a(abstractC31872Bc7.mo110102d(obj));
        }
        return m72887L(obj);
    }

    @Override // p000.InterfaceC42819ic7
    /* renamed from: b */
    public final boolean mo33746b(Object obj, Object obj2) {
        boolean m28742x;
        int length = this.f48813a.length;
        for (int i = 0; i < length; i += 3) {
            int m72877V = m72877V(i);
            long j = m72877V & 1048575;
            switch (m72878U(m72877V)) {
                case 0:
                    if (m72861w(obj, obj2, i) && Double.doubleToLongBits(C34212Lc7.m96572f(obj, j)) == Double.doubleToLongBits(C34212Lc7.m96572f(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m72861w(obj, obj2, i) && Float.floatToIntBits(C34212Lc7.m96571g(obj, j)) == Float.floatToIntBits(C34212Lc7.m96571g(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m72861w(obj, obj2, i) && C34212Lc7.m96569i(obj, j) == C34212Lc7.m96569i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m72861w(obj, obj2, i) && C34212Lc7.m96569i(obj, j) == C34212Lc7.m96569i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m72861w(obj, obj2, i) && C34212Lc7.m96570h(obj, j) == C34212Lc7.m96570h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m72861w(obj, obj2, i) && C34212Lc7.m96569i(obj, j) == C34212Lc7.m96569i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m72861w(obj, obj2, i) && C34212Lc7.m96570h(obj, j) == C34212Lc7.m96570h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m72861w(obj, obj2, i) && C34212Lc7.m96581B(obj, j) == C34212Lc7.m96581B(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m72861w(obj, obj2, i) && C44005kc7.m28742x(C34212Lc7.m96567k(obj, j), C34212Lc7.m96567k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m72861w(obj, obj2, i) && C44005kc7.m28742x(C34212Lc7.m96567k(obj, j), C34212Lc7.m96567k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m72861w(obj, obj2, i) && C44005kc7.m28742x(C34212Lc7.m96567k(obj, j), C34212Lc7.m96567k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m72861w(obj, obj2, i) && C34212Lc7.m96570h(obj, j) == C34212Lc7.m96570h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m72861w(obj, obj2, i) && C34212Lc7.m96570h(obj, j) == C34212Lc7.m96570h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m72861w(obj, obj2, i) && C34212Lc7.m96570h(obj, j) == C34212Lc7.m96570h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m72861w(obj, obj2, i) && C34212Lc7.m96569i(obj, j) == C34212Lc7.m96569i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m72861w(obj, obj2, i) && C34212Lc7.m96570h(obj, j) == C34212Lc7.m96570h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m72861w(obj, obj2, i) && C34212Lc7.m96569i(obj, j) == C34212Lc7.m96569i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m72861w(obj, obj2, i) && C44005kc7.m28742x(C34212Lc7.m96567k(obj, j), C34212Lc7.m96567k(obj2, j))) {
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
                    m28742x = C44005kc7.m28742x(C34212Lc7.m96567k(obj, j), C34212Lc7.m96567k(obj2, j));
                    break;
                case 50:
                    m28742x = C44005kc7.m28742x(C34212Lc7.m96567k(obj, j), C34212Lc7.m96567k(obj2, j));
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
                    long m72880S = m72880S(i) & 1048575;
                    if (C34212Lc7.m96570h(obj, m72880S) == C34212Lc7.m96570h(obj2, m72880S) && C44005kc7.m28742x(C34212Lc7.m96567k(obj, j), C34212Lc7.m96567k(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!m28742x) {
                return false;
            }
        }
        if (!this.f48824l.mo110102d(obj).equals(this.f48824l.mo110102d(obj2))) {
            return false;
        }
        if (this.f48818f) {
            return this.f48825m.mo88388b(obj).equals(this.f48825m.mo88388b(obj2));
        }
        return true;
    }

    @Override // p000.InterfaceC42819ic7
    /* renamed from: c */
    public final void mo33745c(Object obj, Object obj2) {
        m72869o(obj);
        obj2.getClass();
        for (int i = 0; i < this.f48813a.length; i += 3) {
            int m72877V = m72877V(i);
            int i2 = this.f48813a[i];
            long j = 1048575 & m72877V;
            switch (m72878U(m72877V)) {
                case 0:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96558t(obj, j, C34212Lc7.m96572f(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96557u(obj, j, C34212Lc7.m96571g(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96555w(obj, j, C34212Lc7.m96569i(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96555w(obj, j, C34212Lc7.m96569i(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96556v(obj, j, C34212Lc7.m96570h(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96555w(obj, j, C34212Lc7.m96569i(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96556v(obj, j, C34212Lc7.m96570h(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96560r(obj, j, C34212Lc7.m96581B(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96554x(obj, j, C34212Lc7.m96567k(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m72868p(obj, obj2, i);
                    break;
                case 10:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96554x(obj, j, C34212Lc7.m96567k(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96556v(obj, j, C34212Lc7.m96570h(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96556v(obj, j, C34212Lc7.m96570h(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96556v(obj, j, C34212Lc7.m96570h(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96555w(obj, j, C34212Lc7.m96569i(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96556v(obj, j, C34212Lc7.m96570h(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m72860x(obj2, i)) {
                        C34212Lc7.m96555w(obj, j, C34212Lc7.m96569i(obj2, j));
                        m72866r(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m72868p(obj, obj2, i);
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
                    this.f48823k.mo104977b(obj, obj2, j);
                    break;
                case 50:
                    Class cls = C44005kc7.f94645a;
                    C34212Lc7.m96554x(obj, j, C34905Ob7.m91859b(C34212Lc7.m96567k(obj, j), C34212Lc7.m96567k(obj2, j)));
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
                    if (m72896C(obj2, i2, i)) {
                        C34212Lc7.m96554x(obj, j, C34212Lc7.m96567k(obj2, j));
                        m72865s(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m72867q(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m72896C(obj2, i2, i)) {
                        C34212Lc7.m96554x(obj, j, C34212Lc7.m96567k(obj2, j));
                        m72865s(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m72867q(obj, obj2, i);
                    break;
            }
        }
        C44005kc7.m28762d(this.f48824l, obj, obj2);
        if (this.f48818f) {
            C44005kc7.m28763c(this.f48825m, obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02e8, code lost:
        if (r0 != r24) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ea, code lost:
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r10 = r18;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0329, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x034c, code lost:
        if (r0 != r14) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // p000.InterfaceC42819ic7
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo33744d(Object obj, byte[] bArr, int i, int i2, C44578la7 c44578la7) throws IOException {
        byte b;
        int i3;
        int m72882Q;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        Unsafe unsafe2;
        int i8;
        Unsafe unsafe3;
        C37479Zb7<T> c37479Zb7;
        int i9;
        Unsafe unsafe4;
        int i10;
        int i11;
        int i12;
        C37479Zb7<T> c37479Zb72 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i13 = i2;
        C44578la7 c44578la72 = c44578la7;
        if (!c37479Zb72.f48819g) {
            m72892G(obj, bArr, i, i2, 0, c44578la7);
            return;
        }
        m72869o(obj);
        Unsafe unsafe5 = f48812q;
        int i14 = -1;
        int i15 = 1048575;
        int i16 = i;
        int i17 = 1048575;
        int i18 = -1;
        int i19 = 0;
        int i20 = 0;
        while (i16 < i13) {
            int i21 = i16 + 1;
            byte b2 = bArr2[i16];
            if (b2 < 0) {
                i3 = C45171ma7.m25394k(b2, bArr2, i21, c44578la72);
                b = c44578la72.f96359a;
            } else {
                b = b2;
                i3 = i21;
            }
            int i22 = b >>> 3;
            if (i22 > i18) {
                m72882Q = c37479Zb72.m72881R(i22, i19 / 3);
            } else {
                m72882Q = c37479Zb72.m72882Q(i22);
            }
            int i23 = m72882Q;
            if (i23 == i14) {
                i4 = i3;
                i5 = i22;
                unsafe = unsafe5;
                i6 = i14;
                i7 = 0;
            } else {
                int i24 = b & 7;
                int[] iArr = c37479Zb72.f48813a;
                int i25 = iArr[i23 + 1];
                int m72878U = m72878U(i25);
                Unsafe unsafe6 = unsafe5;
                long j = i25 & i15;
                if (m72878U <= 17) {
                    int i26 = iArr[i23 + 2];
                    int i27 = 1 << (i26 >>> 20);
                    int i28 = i26 & 1048575;
                    if (i28 != i17) {
                        if (i17 != 1048575) {
                            long j2 = i17;
                            unsafe4 = unsafe6;
                            unsafe4.putInt(obj2, j2, i20);
                        } else {
                            unsafe4 = unsafe6;
                        }
                        if (i28 != 1048575) {
                            i20 = unsafe4.getInt(obj2, i28);
                        }
                        unsafe2 = unsafe4;
                        i17 = i28;
                    } else {
                        unsafe2 = unsafe6;
                    }
                    switch (m72878U) {
                        case 0:
                            c37479Zb7 = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 1) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                C34212Lc7.m96558t(obj2, j, Double.longBitsToDouble(C45171ma7.m25388q(bArr2, i3)));
                                i16 = i3 + 8;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c37479Zb72 = c37479Zb7;
                                i13 = i2;
                                break;
                            }
                        case 1:
                            c37479Zb7 = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 5) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                C34212Lc7.m96557u(obj2, j, Float.intBitsToFloat(C45171ma7.m25403b(bArr2, i3)));
                                i16 = i3 + 4;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c37479Zb72 = c37479Zb7;
                                i13 = i2;
                                break;
                            }
                        case 2:
                        case 3:
                            c37479Zb7 = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 0) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                int m25392m = C45171ma7.m25392m(bArr2, i3, c44578la72);
                                unsafe3.putLong(obj, j, c44578la72.f96360b);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i16 = m25392m;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c37479Zb72 = c37479Zb7;
                                i13 = i2;
                                break;
                            }
                        case 4:
                        case 11:
                            c37479Zb7 = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 0) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i16 = C45171ma7.m25395j(bArr2, i3, c44578la72);
                                unsafe3.putInt(obj2, j, c44578la72.f96359a);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c37479Zb72 = c37479Zb7;
                                i13 = i2;
                                break;
                            }
                        case 5:
                        case 14:
                            c37479Zb7 = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 1) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                unsafe3.putLong(obj, j, C45171ma7.m25388q(bArr2, i3));
                                i16 = i3 + 8;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c37479Zb72 = c37479Zb7;
                                i13 = i2;
                                break;
                            }
                        case 6:
                        case 13:
                            c37479Zb7 = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 5) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                unsafe3.putInt(obj2, j, C45171ma7.m25403b(bArr2, i3));
                                i16 = i3 + 4;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c37479Zb72 = c37479Zb7;
                                i13 = i2;
                                break;
                            }
                        case 7:
                            c37479Zb7 = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 0) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                i16 = C45171ma7.m25392m(bArr2, i3, c44578la72);
                                C34212Lc7.m96560r(obj2, j, c44578la72.f96360b != 0);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c37479Zb72 = c37479Zb7;
                                i13 = i2;
                                break;
                            }
                        case 8:
                            c37479Zb7 = this;
                            i5 = i22;
                            i9 = 1048575;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 2) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                if ((i25 & 536870912) == 0) {
                                    i16 = C45171ma7.m25398g(bArr2, i3, c44578la72);
                                } else {
                                    i16 = C45171ma7.m25397h(bArr2, i3, c44578la72);
                                }
                                unsafe3.putObject(obj2, j, c44578la72.f96361c);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c37479Zb72 = c37479Zb7;
                                i13 = i2;
                                break;
                            }
                        case 9:
                            i5 = i22;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 != 2) {
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                c37479Zb7 = this;
                                i9 = 1048575;
                                Object m72872l = c37479Zb7.m72872l(obj2, i7);
                                i16 = C45171ma7.m25390o(m72872l, c37479Zb7.m72874j(i7), bArr, i3, i2, c44578la7);
                                c37479Zb7.m72864t(obj2, i7, m72872l);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c37479Zb72 = c37479Zb7;
                                i13 = i2;
                                break;
                            }
                        case 10:
                            i5 = i22;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 == 2) {
                                i16 = C45171ma7.m25404a(bArr2, i3, c44578la72);
                                unsafe3.putObject(obj2, j, c44578la72.f96361c);
                                i20 |= i27;
                                i13 = i2;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i17 = i8;
                                i18 = i5;
                                i15 = 1048575;
                                i14 = -1;
                                c37479Zb72 = this;
                                break;
                            }
                            i4 = i3;
                            unsafe = unsafe3;
                            i17 = i8;
                            i6 = -1;
                            break;
                        case 12:
                            i5 = i22;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 == 0) {
                                i16 = C45171ma7.m25395j(bArr2, i3, c44578la72);
                                unsafe3.putInt(obj2, j, c44578la72.f96359a);
                                i20 |= i27;
                                i13 = i2;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i17 = i8;
                                i18 = i5;
                                i15 = 1048575;
                                i14 = -1;
                                c37479Zb72 = this;
                                break;
                            }
                            i4 = i3;
                            unsafe = unsafe3;
                            i17 = i8;
                            i6 = -1;
                            break;
                        case 15:
                            i5 = i22;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 == 0) {
                                i16 = C45171ma7.m25395j(bArr2, i3, c44578la72);
                                unsafe3.putInt(obj2, j, C33024Ga7.m104994a(c44578la72.f96359a));
                                i20 |= i27;
                                i13 = i2;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i17 = i8;
                                i18 = i5;
                                i15 = 1048575;
                                i14 = -1;
                                c37479Zb72 = this;
                                break;
                            }
                            i4 = i3;
                            unsafe = unsafe3;
                            i17 = i8;
                            i6 = -1;
                            break;
                        case 16:
                            if (i24 != 0) {
                                i5 = i22;
                                i7 = i23;
                                i8 = i17;
                                unsafe3 = unsafe2;
                                i4 = i3;
                                unsafe = unsafe3;
                                i17 = i8;
                                i6 = -1;
                                break;
                            } else {
                                int m25392m2 = C45171ma7.m25392m(bArr2, i3, c44578la72);
                                unsafe2.putLong(obj, j, C33024Ga7.m104993b(c44578la72.f96360b));
                                i20 |= i27;
                                unsafe5 = unsafe2;
                                i16 = m25392m2;
                                i19 = i23;
                                i17 = i17;
                                i18 = i22;
                                i15 = 1048575;
                                i14 = -1;
                                c37479Zb72 = this;
                                i13 = i2;
                                break;
                            }
                        default:
                            i5 = i22;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            i4 = i3;
                            unsafe = unsafe3;
                            i17 = i8;
                            i6 = -1;
                            break;
                    }
                } else {
                    i5 = i22;
                    int i29 = i17;
                    C37479Zb7<T> c37479Zb73 = c37479Zb72;
                    i7 = i23;
                    if (m72878U != 27) {
                        if (m72878U <= 49) {
                            int i30 = i3;
                            i11 = i20;
                            i12 = i29;
                            unsafe = unsafe6;
                            i6 = -1;
                            i16 = m72883P(obj, bArr, i3, i2, b, i5, i24, i7, i25, m72878U, j, c44578la7);
                        } else {
                            i10 = i3;
                            i11 = i20;
                            unsafe = unsafe6;
                            i12 = i29;
                            i6 = -1;
                            if (m72878U != 50) {
                                i16 = m72884O(obj, bArr, i10, i2, b, i5, i24, i25, m72878U, j, i7, c44578la7);
                            } else if (i24 == 2) {
                                i16 = m72885N(obj, bArr, i10, i2, i7, j, c44578la7);
                            }
                        }
                        c37479Zb72 = this;
                    } else if (i24 == 2) {
                        InterfaceC46367ob7 interfaceC46367ob7 = (InterfaceC46367ob7) unsafe6.getObject(obj2, j);
                        if (!interfaceC46367ob7.zbc()) {
                            int size = interfaceC46367ob7.size();
                            interfaceC46367ob7 = interfaceC46367ob7.mo1043r0(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj2, j, interfaceC46367ob7);
                        }
                        i16 = C45171ma7.m25400e(c37479Zb73.m72874j(i7), b, bArr, i3, i2, interfaceC46367ob7, c44578la7);
                        i13 = i2;
                        unsafe5 = unsafe6;
                        i20 = i20;
                        i19 = i7;
                        i15 = 1048575;
                        i17 = i29;
                        i18 = i5;
                        c37479Zb72 = c37479Zb73;
                        i14 = -1;
                    } else {
                        i10 = i3;
                        i11 = i20;
                        unsafe = unsafe6;
                        i12 = i29;
                        i6 = -1;
                    }
                    i4 = i10;
                    i20 = i11;
                    i17 = i12;
                }
                unsafe5 = unsafe;
                i15 = 1048575;
                c37479Zb72 = this;
            }
            i16 = C45171ma7.m25396i(b, bArr, i4, i2, m72891H(obj), c44578la7);
            obj2 = obj;
            bArr2 = bArr;
            i13 = i2;
            c44578la72 = c44578la7;
            i19 = i7;
            i14 = i6;
            i18 = i5;
            unsafe5 = unsafe;
            i15 = 1048575;
            c37479Zb72 = this;
        }
        int i31 = i20;
        Unsafe unsafe7 = unsafe5;
        if (i17 != i15) {
            unsafe7.putInt(obj, i17, i31);
        }
        if (i16 != i2) {
            throw zbuw.m51258e();
        }
    }

    @Override // p000.InterfaceC42819ic7
    /* renamed from: e */
    public final boolean mo33743e(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.f48821i) {
            int i6 = this.f48820h[i4];
            int i7 = this.f48813a[i6];
            int m72877V = m72877V(i6);
            int i8 = this.f48813a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = f48812q.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & m72877V) != 0 && !m72859y(obj, i6, i, i2, i10)) {
                return false;
            }
            int m72878U = m72878U(m72877V);
            if (m72878U != 9 && m72878U != 17) {
                if (m72878U != 27) {
                    if (m72878U != 60 && m72878U != 68) {
                        if (m72878U != 49) {
                            if (m72878U != 50) {
                                continue;
                            } else {
                                C34671Nb7 c34671Nb7 = (C34671Nb7) C34212Lc7.m96567k(obj, m72877V & 1048575);
                                if (!c34671Nb7.isEmpty() && ((C34437Mb7) m72873k(i6)).m95140c().f21753c.m86544a() == EnumC35850Sc7.MESSAGE) {
                                    InterfaceC42819ic7 interfaceC42819ic7 = null;
                                    for (Object obj2 : c34671Nb7.values()) {
                                        if (interfaceC42819ic7 == null) {
                                            interfaceC42819ic7 = C41040fc7.m41106a().m41105b(obj2.getClass());
                                        }
                                        if (!interfaceC42819ic7.mo33743e(obj2)) {
                                            return false;
                                        }
                                    }
                                    continue;
                                }
                            }
                        }
                    } else if (m72896C(obj, i7, i6) && !m72858z(obj, m72877V, m72874j(i6))) {
                        return false;
                    }
                }
                List list = (List) C34212Lc7.m96567k(obj, m72877V & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC42819ic7 m72874j = m72874j(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m72874j.mo33743e(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m72859y(obj, i6, i, i2, i10) && !m72858z(obj, m72877V, m72874j(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        if (this.f48818f && !this.f48825m.mo88388b(obj).m83370m()) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC42819ic7
    /* renamed from: f */
    public final void mo33742f(Object obj) {
        if (!m72897A(obj)) {
            return;
        }
        if (obj instanceof AbstractC41030fb7) {
            AbstractC41030fb7 abstractC41030fb7 = (AbstractC41030fb7) obj;
            abstractC41030fb7.m41134m(Integer.MAX_VALUE);
            abstractC41030fb7.zba = 0;
            abstractC41030fb7.m41136k();
        }
        int length = this.f48813a.length;
        for (int i = 0; i < length; i += 3) {
            int m72877V = m72877V(i);
            int i2 = 1048575 & m72877V;
            int m72878U = m72878U(m72877V);
            long j = i2;
            if (m72878U != 9) {
                if (m72878U != 60 && m72878U != 68) {
                    switch (m72878U) {
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
                            this.f48823k.mo104978a(obj, j);
                            break;
                        case 50:
                            Unsafe unsafe = f48812q;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((C34671Nb7) object).m93719f();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (m72896C(obj, this.f48813a[i], i)) {
                    m72874j(i).mo33742f(f48812q.getObject(obj, j));
                }
            }
            if (m72860x(obj, i)) {
                m72874j(i).mo33742f(f48812q.getObject(obj, j));
            }
        }
        this.f48824l.mo110098h(obj);
        if (this.f48818f) {
            this.f48825m.mo88385e(obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0927  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0508 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0315  */
    @Override // p000.InterfaceC42819ic7
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo33741g(Object obj, InterfaceC36084Tc7 interfaceC36084Tc7) throws IOException {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        int i2;
        boolean z;
        boolean z2;
        Iterator it2;
        Map.Entry entry2;
        int length2;
        int i3;
        int i4 = 1048575;
        if (this.f48819g) {
            if (this.f48818f) {
                C36066Ta7 mo88388b = this.f48825m.mo88388b(obj);
                if (!mo88388b.f35709a.isEmpty()) {
                    it2 = mo88388b.m83376g();
                    entry2 = (Map.Entry) it2.next();
                    length2 = this.f48813a.length;
                    for (i3 = 0; i3 < length2; i3 += 3) {
                        int m72877V = m72877V(i3);
                        int i5 = this.f48813a[i3];
                        while (entry2 != null) {
                            this.f48825m.mo88389a(entry2);
                            if (i5 >= 32149011) {
                                this.f48825m.mo88384f(interfaceC36084Tc7, entry2);
                                entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                            } else {
                                switch (m72878U(m72877V)) {
                                    case 0:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83282n(i5, C34212Lc7.m96572f(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83305C(i5, C34212Lc7.m96571g(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83300H(i5, C34212Lc7.m96569i(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83306B(i5, C34212Lc7.m96569i(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 4:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83307A(i5, C34212Lc7.m96570h(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 5:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83276t(i5, C34212Lc7.m96569i(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 6:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83274v(i5, C34212Lc7.m96570h(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 7:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83286j(i5, C34212Lc7.m96581B(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 8:
                                        if (m72860x(obj, i3)) {
                                            m72893F(i5, C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 9:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83292d(i5, C34212Lc7.m96567k(obj, m72877V & 1048575), m72874j(i3));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 10:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83290f(i5, (AbstractC32088Ca7) C34212Lc7.m96567k(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 11:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83278r(i5, C34212Lc7.m96570h(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 12:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83283m(i5, C34212Lc7.m96570h(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 13:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83299I(i5, C34212Lc7.m96570h(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 14:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83284l(i5, C34212Lc7.m96569i(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 15:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83287i(i5, C34212Lc7.m96570h(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 16:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83279q(i5, C34212Lc7.m96569i(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 17:
                                        if (m72860x(obj, i3)) {
                                            interfaceC36084Tc7.mo83295a(i5, C34212Lc7.m96567k(obj, m72877V & 1048575), m72874j(i3));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 18:
                                        C44005kc7.m28758h(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, false);
                                        break;
                                    case 19:
                                        C44005kc7.m28754l(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, false);
                                        break;
                                    case 20:
                                        C44005kc7.m28751o(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, false);
                                        break;
                                    case 21:
                                        C44005kc7.m28743w(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, false);
                                        break;
                                    case 22:
                                        C44005kc7.m28752n(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, false);
                                        break;
                                    case 23:
                                        C44005kc7.m28755k(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, false);
                                        break;
                                    case 24:
                                        C44005kc7.m28756j(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, false);
                                        break;
                                    case 25:
                                        C44005kc7.m28760f(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, false);
                                        break;
                                    case 26:
                                        C44005kc7.m28745u(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7);
                                        break;
                                    case 27:
                                        C44005kc7.m28750p(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, m72874j(i3));
                                        break;
                                    case 28:
                                        C44005kc7.m28759g(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7);
                                        break;
                                    case 29:
                                        C44005kc7.m28744v(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, false);
                                        break;
                                    case 30:
                                        C44005kc7.m28757i(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, false);
                                        break;
                                    case 31:
                                        C44005kc7.m28749q(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, false);
                                        break;
                                    case 32:
                                        C44005kc7.m28748r(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, false);
                                        break;
                                    case 33:
                                        C44005kc7.m28747s(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, false);
                                        break;
                                    case 34:
                                        C44005kc7.m28746t(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, false);
                                        break;
                                    case 35:
                                        C44005kc7.m28758h(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, true);
                                        break;
                                    case 36:
                                        C44005kc7.m28754l(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, true);
                                        break;
                                    case 37:
                                        C44005kc7.m28751o(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, true);
                                        break;
                                    case 38:
                                        C44005kc7.m28743w(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, true);
                                        break;
                                    case 39:
                                        C44005kc7.m28752n(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, true);
                                        break;
                                    case 40:
                                        C44005kc7.m28755k(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, true);
                                        break;
                                    case 41:
                                        C44005kc7.m28756j(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, true);
                                        break;
                                    case 42:
                                        C44005kc7.m28760f(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, true);
                                        break;
                                    case 43:
                                        C44005kc7.m28744v(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, true);
                                        break;
                                    case 44:
                                        C44005kc7.m28757i(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, true);
                                        break;
                                    case 45:
                                        C44005kc7.m28749q(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, true);
                                        break;
                                    case 46:
                                        C44005kc7.m28748r(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, true);
                                        break;
                                    case 47:
                                        C44005kc7.m28747s(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, true);
                                        break;
                                    case 48:
                                        C44005kc7.m28746t(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, true);
                                        break;
                                    case 49:
                                        C44005kc7.m28753m(this.f48813a[i3], (List) C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7, m72874j(i3));
                                        break;
                                    case 50:
                                        m72862v(interfaceC36084Tc7, i5, C34212Lc7.m96567k(obj, m72877V & 1048575), i3);
                                        break;
                                    case 51:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83282n(i5, m72889J(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 52:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83305C(i5, m72888K(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 53:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83300H(i5, m72876W(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 54:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83306B(i5, m72876W(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 55:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83307A(i5, m72886M(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 56:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83276t(i5, m72876W(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 57:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83274v(i5, m72886M(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 58:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83286j(i5, m72895D(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 59:
                                        if (m72896C(obj, i5, i3)) {
                                            m72893F(i5, C34212Lc7.m96567k(obj, m72877V & 1048575), interfaceC36084Tc7);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 60:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83292d(i5, C34212Lc7.m96567k(obj, m72877V & 1048575), m72874j(i3));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 61:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83290f(i5, (AbstractC32088Ca7) C34212Lc7.m96567k(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 62:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83278r(i5, m72886M(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 63:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83283m(i5, m72886M(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 64:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83299I(i5, m72886M(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 65:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83284l(i5, m72876W(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 66:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83287i(i5, m72886M(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 67:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83279q(i5, m72876W(obj, m72877V & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 68:
                                        if (m72896C(obj, i5, i3)) {
                                            interfaceC36084Tc7.mo83295a(i5, C34212Lc7.m96567k(obj, m72877V & 1048575), m72874j(i3));
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            }
                        }
                        switch (m72878U(m72877V)) {
                        }
                    }
                    while (entry2 != null) {
                        this.f48825m.mo88384f(interfaceC36084Tc7, entry2);
                        entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                    }
                    AbstractC31872Bc7 abstractC31872Bc7 = this.f48824l;
                    abstractC31872Bc7.mo110094l(abstractC31872Bc7.mo110102d(obj), interfaceC36084Tc7);
                    return;
                }
            }
            it2 = null;
            entry2 = null;
            length2 = this.f48813a.length;
            while (i3 < length2) {
            }
            while (entry2 != null) {
            }
            AbstractC31872Bc7 abstractC31872Bc72 = this.f48824l;
            abstractC31872Bc72.mo110094l(abstractC31872Bc72.mo110102d(obj), interfaceC36084Tc7);
            return;
        }
        if (this.f48818f) {
            C36066Ta7 mo88388b2 = this.f48825m.mo88388b(obj);
            if (!mo88388b2.f35709a.isEmpty()) {
                it = mo88388b2.m83376g();
                entry = (Map.Entry) it.next();
                length = this.f48813a.length;
                Unsafe unsafe = f48812q;
                i = 0;
                int i6 = 0;
                int i7 = 1048575;
                while (i < length) {
                    int m72877V2 = m72877V(i);
                    int[] iArr = this.f48813a;
                    int i8 = iArr[i];
                    int m72878U = m72878U(m72877V2);
                    if (m72878U <= 17) {
                        int i9 = iArr[i + 2];
                        int i10 = i9 & i4;
                        if (i10 != i7) {
                            i6 = unsafe.getInt(obj, i10);
                            i7 = i10;
                        }
                        i2 = 1 << (i9 >>> 20);
                    } else {
                        i2 = 0;
                    }
                    while (entry != null) {
                        this.f48825m.mo88389a(entry);
                        if (i8 >= 32149011) {
                            this.f48825m.mo88384f(interfaceC36084Tc7, entry);
                            entry = it.hasNext() ? (Map.Entry) it.next() : null;
                        } else {
                            Map.Entry entry3 = entry;
                            long j = m72877V2 & i4;
                            switch (m72878U) {
                                case 0:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83282n(i8, C34212Lc7.m96572f(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83305C(i8, C34212Lc7.m96571g(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 2:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83300H(i8, unsafe.getLong(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 3:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83306B(i8, unsafe.getLong(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 4:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83307A(i8, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 5:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83276t(i8, unsafe.getLong(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 6:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83274v(i8, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 7:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83286j(i8, C34212Lc7.m96581B(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 8:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        m72893F(i8, unsafe.getObject(obj, j), interfaceC36084Tc7);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 9:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83292d(i8, unsafe.getObject(obj, j), m72874j(i));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 10:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83290f(i8, (AbstractC32088Ca7) unsafe.getObject(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 11:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83278r(i8, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 12:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83283m(i8, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 13:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83299I(i8, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 14:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83284l(i8, unsafe.getLong(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 15:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83287i(i8, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 16:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83279q(i8, unsafe.getLong(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 17:
                                    z = false;
                                    if ((i2 & i6) != 0) {
                                        interfaceC36084Tc7.mo83295a(i8, unsafe.getObject(obj, j), m72874j(i));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 18:
                                    z2 = false;
                                    C44005kc7.m28758h(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, false);
                                    z = z2;
                                    break;
                                case 19:
                                    z2 = false;
                                    C44005kc7.m28754l(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, false);
                                    z = z2;
                                    break;
                                case 20:
                                    z2 = false;
                                    C44005kc7.m28751o(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, false);
                                    z = z2;
                                    break;
                                case 21:
                                    z2 = false;
                                    C44005kc7.m28743w(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, false);
                                    z = z2;
                                    break;
                                case 22:
                                    z2 = false;
                                    C44005kc7.m28752n(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, false);
                                    z = z2;
                                    break;
                                case 23:
                                    z2 = false;
                                    C44005kc7.m28755k(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, false);
                                    z = z2;
                                    break;
                                case 24:
                                    z2 = false;
                                    C44005kc7.m28756j(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, false);
                                    z = z2;
                                    break;
                                case 25:
                                    z2 = false;
                                    C44005kc7.m28760f(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, false);
                                    z = z2;
                                    break;
                                case 26:
                                    C44005kc7.m28745u(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7);
                                    z = false;
                                    break;
                                case 27:
                                    C44005kc7.m28750p(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, m72874j(i));
                                    z = false;
                                    break;
                                case 28:
                                    C44005kc7.m28759g(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7);
                                    z = false;
                                    break;
                                case 29:
                                    z2 = false;
                                    C44005kc7.m28744v(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, false);
                                    z = z2;
                                    break;
                                case 30:
                                    z2 = false;
                                    C44005kc7.m28757i(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, false);
                                    z = z2;
                                    break;
                                case 31:
                                    z2 = false;
                                    C44005kc7.m28749q(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, false);
                                    z = z2;
                                    break;
                                case 32:
                                    z2 = false;
                                    C44005kc7.m28748r(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, false);
                                    z = z2;
                                    break;
                                case 33:
                                    z2 = false;
                                    C44005kc7.m28747s(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, false);
                                    z = z2;
                                    break;
                                case 34:
                                    z2 = false;
                                    C44005kc7.m28746t(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, false);
                                    z = z2;
                                    break;
                                case 35:
                                    C44005kc7.m28758h(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, true);
                                    z = false;
                                    break;
                                case 36:
                                    C44005kc7.m28754l(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, true);
                                    z = false;
                                    break;
                                case 37:
                                    C44005kc7.m28751o(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, true);
                                    z = false;
                                    break;
                                case 38:
                                    C44005kc7.m28743w(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, true);
                                    z = false;
                                    break;
                                case 39:
                                    C44005kc7.m28752n(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, true);
                                    z = false;
                                    break;
                                case 40:
                                    C44005kc7.m28755k(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, true);
                                    z = false;
                                    break;
                                case 41:
                                    C44005kc7.m28756j(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, true);
                                    z = false;
                                    break;
                                case 42:
                                    C44005kc7.m28760f(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, true);
                                    z = false;
                                    break;
                                case 43:
                                    C44005kc7.m28744v(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, true);
                                    z = false;
                                    break;
                                case 44:
                                    C44005kc7.m28757i(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, true);
                                    z = false;
                                    break;
                                case 45:
                                    C44005kc7.m28749q(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, true);
                                    z = false;
                                    break;
                                case 46:
                                    C44005kc7.m28748r(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, true);
                                    z = false;
                                    break;
                                case 47:
                                    C44005kc7.m28747s(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, true);
                                    z = false;
                                    break;
                                case 48:
                                    C44005kc7.m28746t(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, true);
                                    z = false;
                                    break;
                                case 49:
                                    C44005kc7.m28753m(this.f48813a[i], (List) unsafe.getObject(obj, j), interfaceC36084Tc7, m72874j(i));
                                    z = false;
                                    break;
                                case 50:
                                    m72862v(interfaceC36084Tc7, i8, unsafe.getObject(obj, j), i);
                                    z = false;
                                    break;
                                case 51:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83282n(i8, m72889J(obj, j));
                                    }
                                    z = false;
                                    break;
                                case 52:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83305C(i8, m72888K(obj, j));
                                    }
                                    z = false;
                                    break;
                                case 53:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83300H(i8, m72876W(obj, j));
                                    }
                                    z = false;
                                    break;
                                case 54:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83306B(i8, m72876W(obj, j));
                                    }
                                    z = false;
                                    break;
                                case 55:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83307A(i8, m72886M(obj, j));
                                    }
                                    z = false;
                                    break;
                                case 56:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83276t(i8, m72876W(obj, j));
                                    }
                                    z = false;
                                    break;
                                case 57:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83274v(i8, m72886M(obj, j));
                                    }
                                    z = false;
                                    break;
                                case 58:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83286j(i8, m72895D(obj, j));
                                    }
                                    z = false;
                                    break;
                                case 59:
                                    if (m72896C(obj, i8, i)) {
                                        m72893F(i8, unsafe.getObject(obj, j), interfaceC36084Tc7);
                                    }
                                    z = false;
                                    break;
                                case 60:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83292d(i8, unsafe.getObject(obj, j), m72874j(i));
                                    }
                                    z = false;
                                    break;
                                case 61:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83290f(i8, (AbstractC32088Ca7) unsafe.getObject(obj, j));
                                    }
                                    z = false;
                                    break;
                                case 62:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83278r(i8, m72886M(obj, j));
                                    }
                                    z = false;
                                    break;
                                case 63:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83283m(i8, m72886M(obj, j));
                                    }
                                    z = false;
                                    break;
                                case 64:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83299I(i8, m72886M(obj, j));
                                    }
                                    z = false;
                                    break;
                                case 65:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83284l(i8, m72876W(obj, j));
                                    }
                                    z = false;
                                    break;
                                case 66:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83287i(i8, m72886M(obj, j));
                                    }
                                    z = false;
                                    break;
                                case 67:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83279q(i8, m72876W(obj, j));
                                    }
                                    z = false;
                                    break;
                                case 68:
                                    if (m72896C(obj, i8, i)) {
                                        interfaceC36084Tc7.mo83295a(i8, unsafe.getObject(obj, j), m72874j(i));
                                    }
                                    z = false;
                                    break;
                                default:
                                    z = false;
                                    break;
                            }
                            i += 3;
                            entry = entry3;
                            i4 = 1048575;
                        }
                    }
                    Map.Entry entry32 = entry;
                    long j2 = m72877V2 & i4;
                    switch (m72878U) {
                    }
                    i += 3;
                    entry = entry32;
                    i4 = 1048575;
                }
                while (entry != null) {
                    this.f48825m.mo88384f(interfaceC36084Tc7, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                AbstractC31872Bc7 abstractC31872Bc73 = this.f48824l;
                abstractC31872Bc73.mo110094l(abstractC31872Bc73.mo110102d(obj), interfaceC36084Tc7);
            }
        }
        it = null;
        entry = null;
        length = this.f48813a.length;
        Unsafe unsafe2 = f48812q;
        i = 0;
        int i62 = 0;
        int i72 = 1048575;
        while (i < length) {
        }
        while (entry != null) {
        }
        AbstractC31872Bc7 abstractC31872Bc732 = this.f48824l;
        abstractC31872Bc732.mo110094l(abstractC31872Bc732.mo110102d(obj), interfaceC36084Tc7);
    }

    @Override // p000.InterfaceC42819ic7
    /* renamed from: h */
    public final int mo33740h(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int length = this.f48813a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m72877V = m72877V(i3);
            int i4 = this.f48813a[i3];
            long j = 1048575 & m72877V;
            int i5 = 37;
            switch (m72878U(m72877V)) {
                case 0:
                    i = i2 * 53;
                    doubleToLongBits = Double.doubleToLongBits(C34212Lc7.m96572f(obj, j));
                    Charset charset = C46960pb7.f103839a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 1:
                    i = i2 * 53;
                    floatToIntBits = Float.floatToIntBits(C34212Lc7.m96571g(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 2:
                    i = i2 * 53;
                    doubleToLongBits = C34212Lc7.m96569i(obj, j);
                    Charset charset2 = C46960pb7.f103839a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 3:
                    i = i2 * 53;
                    doubleToLongBits = C34212Lc7.m96569i(obj, j);
                    Charset charset3 = C46960pb7.f103839a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 4:
                    i = i2 * 53;
                    floatToIntBits = C34212Lc7.m96570h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 5:
                    i = i2 * 53;
                    doubleToLongBits = C34212Lc7.m96569i(obj, j);
                    Charset charset4 = C46960pb7.f103839a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 6:
                    i = i2 * 53;
                    floatToIntBits = C34212Lc7.m96570h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 7:
                    i = i2 * 53;
                    floatToIntBits = C46960pb7.m19081a(C34212Lc7.m96581B(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 8:
                    i = i2 * 53;
                    floatToIntBits = ((String) C34212Lc7.m96567k(obj, j)).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 9:
                    Object m96567k = C34212Lc7.m96567k(obj, j);
                    if (m96567k != null) {
                        i5 = m96567k.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    floatToIntBits = C34212Lc7.m96567k(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 11:
                    i = i2 * 53;
                    floatToIntBits = C34212Lc7.m96570h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 12:
                    i = i2 * 53;
                    floatToIntBits = C34212Lc7.m96570h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 13:
                    i = i2 * 53;
                    floatToIntBits = C34212Lc7.m96570h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 14:
                    i = i2 * 53;
                    doubleToLongBits = C34212Lc7.m96569i(obj, j);
                    Charset charset5 = C46960pb7.f103839a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 15:
                    i = i2 * 53;
                    floatToIntBits = C34212Lc7.m96570h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 16:
                    i = i2 * 53;
                    doubleToLongBits = C34212Lc7.m96569i(obj, j);
                    Charset charset6 = C46960pb7.f103839a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 17:
                    Object m96567k2 = C34212Lc7.m96567k(obj, j);
                    if (m96567k2 != null) {
                        i5 = m96567k2.hashCode();
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
                    floatToIntBits = C34212Lc7.m96567k(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 50:
                    i = i2 * 53;
                    floatToIntBits = C34212Lc7.m96567k(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 51:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = Double.doubleToLongBits(m72889J(obj, j));
                        Charset charset7 = C46960pb7.f103839a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = Float.floatToIntBits(m72888K(obj, j));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = m72876W(obj, j);
                        Charset charset8 = C46960pb7.f103839a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = m72876W(obj, j);
                        Charset charset9 = C46960pb7.f103839a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m72886M(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = m72876W(obj, j);
                        Charset charset10 = C46960pb7.f103839a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m72886M(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = C46960pb7.m19081a(m72895D(obj, j));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = ((String) C34212Lc7.m96567k(obj, j)).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = C34212Lc7.m96567k(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = C34212Lc7.m96567k(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m72886M(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m72886M(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m72886M(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = m72876W(obj, j);
                        Charset charset11 = C46960pb7.f103839a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m72886M(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = m72876W(obj, j);
                        Charset charset12 = C46960pb7.f103839a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m72896C(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = C34212Lc7.m96567k(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f48824l.mo110102d(obj).hashCode();
        if (this.f48818f) {
            return (hashCode * 53) + this.f48825m.mo88388b(obj).f35709a.hashCode();
        }
        return hashCode;
    }

    /* renamed from: i */
    public final InterfaceC43402jb7 m72875i(int i) {
        int i2 = i / 3;
        return (InterfaceC43402jb7) this.f48814b[i2 + i2 + 1];
    }

    /* renamed from: j */
    public final InterfaceC42819ic7 m72874j(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        InterfaceC42819ic7 interfaceC42819ic7 = (InterfaceC42819ic7) this.f48814b[i3];
        if (interfaceC42819ic7 != null) {
            return interfaceC42819ic7;
        }
        InterfaceC42819ic7 m41105b = C41040fc7.m41106a().m41105b((Class) this.f48814b[i3 + 1]);
        this.f48814b[i3] = m41105b;
        return m41105b;
    }

    /* renamed from: k */
    public final Object m72873k(int i) {
        int i2 = i / 3;
        return this.f48814b[i2 + i2];
    }

    /* renamed from: l */
    public final Object m72872l(Object obj, int i) {
        InterfaceC42819ic7 m72874j = m72874j(i);
        int m72877V = m72877V(i) & 1048575;
        if (!m72860x(obj, i)) {
            return m72874j.mo33748B();
        }
        Object object = f48812q.getObject(obj, m72877V);
        if (m72897A(object)) {
            return object;
        }
        Object mo33748B = m72874j.mo33748B();
        if (object != null) {
            m72874j.mo33745c(mo33748B, object);
        }
        return mo33748B;
    }

    /* renamed from: m */
    public final Object m72871m(Object obj, int i, int i2) {
        InterfaceC42819ic7 m72874j = m72874j(i2);
        if (!m72896C(obj, i, i2)) {
            return m72874j.mo33748B();
        }
        Object object = f48812q.getObject(obj, m72877V(i2) & 1048575);
        if (m72897A(object)) {
            return object;
        }
        Object mo33748B = m72874j.mo33748B();
        if (object != null) {
            m72874j.mo33745c(mo33748B, object);
        }
        return mo33748B;
    }

    /* renamed from: p */
    public final void m72868p(Object obj, Object obj2, int i) {
        if (!m72860x(obj2, i)) {
            return;
        }
        Unsafe unsafe = f48812q;
        long m72877V = m72877V(i) & 1048575;
        Object object = unsafe.getObject(obj2, m72877V);
        if (object != null) {
            InterfaceC42819ic7 m72874j = m72874j(i);
            if (!m72860x(obj, i)) {
                if (!m72897A(object)) {
                    unsafe.putObject(obj, m72877V, object);
                } else {
                    Object mo33748B = m72874j.mo33748B();
                    m72874j.mo33745c(mo33748B, object);
                    unsafe.putObject(obj, m72877V, mo33748B);
                }
                m72866r(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, m72877V);
            if (!m72897A(object2)) {
                Object mo33748B2 = m72874j.mo33748B();
                m72874j.mo33745c(mo33748B2, object2);
                unsafe.putObject(obj, m72877V, mo33748B2);
                object2 = mo33748B2;
            }
            m72874j.mo33745c(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f48813a[i] + " is present but null: " + obj2.toString());
    }

    /* renamed from: q */
    public final void m72867q(Object obj, Object obj2, int i) {
        int i2 = this.f48813a[i];
        if (!m72896C(obj2, i2, i)) {
            return;
        }
        Unsafe unsafe = f48812q;
        long m72877V = m72877V(i) & 1048575;
        Object object = unsafe.getObject(obj2, m72877V);
        if (object != null) {
            InterfaceC42819ic7 m72874j = m72874j(i);
            if (!m72896C(obj, i2, i)) {
                if (!m72897A(object)) {
                    unsafe.putObject(obj, m72877V, object);
                } else {
                    Object mo33748B = m72874j.mo33748B();
                    m72874j.mo33745c(mo33748B, object);
                    unsafe.putObject(obj, m72877V, mo33748B);
                }
                m72865s(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, m72877V);
            if (!m72897A(object2)) {
                Object mo33748B2 = m72874j.mo33748B();
                m72874j.mo33745c(mo33748B2, object2);
                unsafe.putObject(obj, m72877V, mo33748B2);
                object2 = mo33748B2;
            }
            m72874j.mo33745c(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f48813a[i] + " is present but null: " + obj2.toString());
    }

    /* renamed from: r */
    public final void m72866r(Object obj, int i) {
        int m72880S = m72880S(i);
        long j = 1048575 & m72880S;
        if (j == 1048575) {
            return;
        }
        C34212Lc7.m96556v(obj, j, (1 << (m72880S >>> 20)) | C34212Lc7.m96570h(obj, j));
    }

    /* renamed from: s */
    public final void m72865s(Object obj, int i, int i2) {
        C34212Lc7.m96556v(obj, m72880S(i2) & 1048575, i);
    }

    /* renamed from: t */
    public final void m72864t(Object obj, int i, Object obj2) {
        f48812q.putObject(obj, m72877V(i) & 1048575, obj2);
        m72866r(obj, i);
    }

    /* renamed from: u */
    public final void m72863u(Object obj, int i, int i2, Object obj2) {
        f48812q.putObject(obj, m72877V(i2) & 1048575, obj2);
        m72865s(obj, i, i2);
    }

    /* renamed from: v */
    public final void m72862v(InterfaceC36084Tc7 interfaceC36084Tc7, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            interfaceC36084Tc7.mo83296L(i, ((C34437Mb7) m72873k(i2)).m95140c(), (C34671Nb7) obj);
        }
    }

    /* renamed from: w */
    public final boolean m72861w(Object obj, Object obj2, int i) {
        return m72860x(obj, i) == m72860x(obj2, i);
    }

    /* renamed from: x */
    public final boolean m72860x(Object obj, int i) {
        int m72880S = m72880S(i);
        long j = m72880S & 1048575;
        if (j == 1048575) {
            int m72877V = m72877V(i);
            long j2 = m72877V & 1048575;
            switch (m72878U(m72877V)) {
                case 0:
                    if (Double.doubleToRawLongBits(C34212Lc7.m96572f(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(C34212Lc7.m96571g(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C34212Lc7.m96569i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C34212Lc7.m96569i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C34212Lc7.m96570h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C34212Lc7.m96569i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C34212Lc7.m96570h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C34212Lc7.m96581B(obj, j2);
                case 8:
                    Object m96567k = C34212Lc7.m96567k(obj, j2);
                    if (m96567k instanceof String) {
                        if (((String) m96567k).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m96567k instanceof AbstractC32088Ca7) {
                        if (AbstractC32088Ca7.f4281c.equals(m96567k)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (C34212Lc7.m96567k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC32088Ca7.f4281c.equals(C34212Lc7.m96567k(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (C34212Lc7.m96570h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C34212Lc7.m96570h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (C34212Lc7.m96570h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C34212Lc7.m96569i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C34212Lc7.m96570h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C34212Lc7.m96569i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C34212Lc7.m96567k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((C34212Lc7.m96570h(obj, j) & (1 << (m72880S >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final boolean m72859y(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m72860x(obj, i) : (i3 & i4) != 0;
    }
}
