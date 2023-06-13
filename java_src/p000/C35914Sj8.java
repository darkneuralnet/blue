package p000;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
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
/* renamed from: Sj8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35914Sj8<T> implements InterfaceC32449Do8<T> {

    /* renamed from: p */
    public static final int[] f34163p = new int[0];

    /* renamed from: q */
    public static final Unsafe f34164q = C37192Xv8.m76067l();

    /* renamed from: a */
    public final int[] f34165a;

    /* renamed from: b */
    public final Object[] f34166b;

    /* renamed from: c */
    public final int f34167c;

    /* renamed from: d */
    public final int f34168d;

    /* renamed from: e */
    public final InterfaceC39926dj8 f34169e;

    /* renamed from: f */
    public final boolean f34170f;

    /* renamed from: g */
    public final boolean f34171g;

    /* renamed from: h */
    public final int[] f34172h;

    /* renamed from: i */
    public final int f34173i;

    /* renamed from: j */
    public final int f34174j;

    /* renamed from: k */
    public final AbstractC33772Jf8 f34175k;

    /* renamed from: l */
    public final AbstractC32953Fs8 f34176l;

    /* renamed from: m */
    public final W28 f34177m;

    /* renamed from: n */
    public final C32881Fk8 f34178n;

    /* renamed from: o */
    public final C34492Mh8 f34179o;

    public C35914Sj8(int[] iArr, Object[] objArr, int i, int i2, InterfaceC39926dj8 interfaceC39926dj8, boolean z, boolean z2, int[] iArr2, int i3, int i4, C32881Fk8 c32881Fk8, AbstractC33772Jf8 abstractC33772Jf8, AbstractC32953Fs8 abstractC32953Fs8, W28 w28, C34492Mh8 c34492Mh8) {
        this.f34165a = iArr;
        this.f34166b = objArr;
        this.f34167c = i;
        this.f34168d = i2;
        this.f34171g = z;
        boolean z3 = false;
        if (w28 != null && w28.mo24508g(interfaceC39926dj8)) {
            z3 = true;
        }
        this.f34170f = z3;
        this.f34172h = iArr2;
        this.f34173i = i3;
        this.f34174j = i4;
        this.f34178n = c32881Fk8;
        this.f34175k = abstractC33772Jf8;
        this.f34176l = abstractC32953Fs8;
        this.f34177m = w28;
        this.f34169e = interfaceC39926dj8;
        this.f34179o = c34492Mh8;
    }

    /* renamed from: A */
    public static final void m84976A(int i, Object obj, InterfaceC36040Sx8 interfaceC36040Sx8) throws IOException {
        if (obj instanceof String) {
            interfaceC36040Sx8.mo84541r(i, (String) obj);
        } else {
            interfaceC36040Sx8.mo84559J(i, (AbstractC41604gZ7) obj);
        }
    }

    /* renamed from: C */
    public static C36463Us8 m84974C(Object obj) {
        V78 v78 = (V78) obj;
        C36463Us8 c36463Us8 = v78.zzc;
        if (c36463Us8 == C36463Us8.m80680c()) {
            C36463Us8 m80677f = C36463Us8.m80677f();
            v78.zzc = m80677f;
            return m80677f;
        }
        return c36463Us8;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C35914Sj8 m84973D(Class cls, InterfaceC46438oi8 interfaceC46438oi8, C32881Fk8 c32881Fk8, AbstractC33772Jf8 abstractC33772Jf8, AbstractC32953Fs8 abstractC32953Fs8, W28 w28, C34492Mh8 c34492Mh8) {
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
        Field m84953k;
        char charAt11;
        int i20;
        Object[] objArr2;
        int i21;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field m84953k2;
        Object obj2;
        Field m84953k3;
        int i25;
        char charAt12;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        if (interfaceC46438oi8 instanceof C36166Tl8) {
            C36166Tl8 c36166Tl8 = (C36166Tl8) interfaceC46438oi8;
            int zzc = c36166Tl8.zzc();
            String m82994a = c36166Tl8.m82994a();
            int length = m82994a.length();
            int i29 = 0;
            char charAt16 = m82994a.charAt(0);
            int i30 = GeneratorBase.SURR1_FIRST;
            if (charAt16 >= 55296) {
                int i31 = 1;
                while (true) {
                    i = i31 + 1;
                    if (m82994a.charAt(i31) < 55296) {
                        break;
                    }
                    i31 = i;
                }
            } else {
                i = 1;
            }
            int i32 = i + 1;
            int charAt17 = m82994a.charAt(i);
            if (charAt17 >= 55296) {
                int i33 = charAt17 & 8191;
                int i34 = 13;
                while (true) {
                    i28 = i32 + 1;
                    charAt15 = m82994a.charAt(i32);
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
                iArr = f34163p;
                i2 = 0;
            } else {
                int i35 = i32 + 1;
                int charAt18 = m82994a.charAt(i32);
                if (charAt18 >= 55296) {
                    int i36 = charAt18 & 8191;
                    int i37 = 13;
                    while (true) {
                        i13 = i35 + 1;
                        charAt10 = m82994a.charAt(i35);
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
                int charAt19 = m82994a.charAt(i35);
                if (charAt19 >= 55296) {
                    int i39 = charAt19 & 8191;
                    int i40 = 13;
                    while (true) {
                        i12 = i38 + 1;
                        charAt9 = m82994a.charAt(i38);
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
                int charAt20 = m82994a.charAt(i38);
                if (charAt20 >= 55296) {
                    int i42 = charAt20 & 8191;
                    int i43 = 13;
                    while (true) {
                        i11 = i41 + 1;
                        charAt8 = m82994a.charAt(i41);
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
                int charAt21 = m82994a.charAt(i41);
                if (charAt21 >= 55296) {
                    int i45 = charAt21 & 8191;
                    int i46 = 13;
                    while (true) {
                        i10 = i44 + 1;
                        charAt7 = m82994a.charAt(i44);
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
                charAt = m82994a.charAt(i44);
                if (charAt >= 55296) {
                    int i48 = charAt & 8191;
                    int i49 = 13;
                    while (true) {
                        i9 = i47 + 1;
                        charAt6 = m82994a.charAt(i47);
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
                charAt2 = m82994a.charAt(i47);
                if (charAt2 >= 55296) {
                    int i51 = charAt2 & 8191;
                    int i52 = 13;
                    while (true) {
                        i8 = i50 + 1;
                        charAt5 = m82994a.charAt(i50);
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
                int charAt22 = m82994a.charAt(i50);
                if (charAt22 >= 55296) {
                    int i54 = charAt22 & 8191;
                    int i55 = 13;
                    while (true) {
                        i7 = i53 + 1;
                        charAt4 = m82994a.charAt(i53);
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
                int charAt23 = m82994a.charAt(i53);
                if (charAt23 >= 55296) {
                    int i57 = charAt23 & 8191;
                    int i58 = i56;
                    int i59 = 13;
                    while (true) {
                        i6 = i58 + 1;
                        charAt3 = m82994a.charAt(i58);
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
            Unsafe unsafe = f34164q;
            Object[] m82993b = c36166Tl8.m82993b();
            Class<?> cls2 = c36166Tl8.zza().getClass();
            int i62 = i4 + charAt2;
            int i63 = charAt + charAt;
            int[] iArr3 = new int[charAt * 3];
            Object[] objArr3 = new Object[i63];
            int i64 = i4;
            int i65 = i62;
            int i66 = 0;
            int i67 = 0;
            while (true) {
                if (zzc == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (i32 < length) {
                    int i68 = i32 + 1;
                    int charAt24 = m82994a.charAt(i32);
                    if (charAt24 >= i30) {
                        int i69 = charAt24 & 8191;
                        int i70 = i68;
                        int i71 = 13;
                        while (true) {
                            i27 = i70 + 1;
                            charAt14 = m82994a.charAt(i70);
                            i14 = zzc;
                            if (charAt14 < 55296) {
                                break;
                            }
                            i69 |= (charAt14 & 8191) << i71;
                            i71 += 13;
                            i70 = i27;
                            zzc = i14;
                        }
                        charAt24 = i69 | (charAt14 << i71);
                        i15 = i27;
                    } else {
                        i14 = zzc;
                        i15 = i68;
                    }
                    int i72 = i15 + 1;
                    int charAt25 = m82994a.charAt(i15);
                    int i73 = length;
                    char c = 55296;
                    if (charAt25 >= 55296) {
                        int i74 = charAt25 & 8191;
                        int i75 = 13;
                        while (true) {
                            i26 = i72 + 1;
                            charAt13 = m82994a.charAt(i72);
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
                        int charAt26 = m82994a.charAt(i72);
                        if (charAt26 >= 55296) {
                            int i79 = charAt26 & 8191;
                            int i80 = i78;
                            int i81 = 13;
                            while (true) {
                                i25 = i80 + 1;
                                charAt12 = m82994a.charAt(i80);
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
                                objArr3[i84 + i84 + 1] = m82993b[i3];
                            }
                            int i85 = charAt26 + charAt26;
                            obj = m82993b[i85];
                            if (!(obj instanceof Field)) {
                                m84953k2 = (Field) obj;
                            } else {
                                m84953k2 = m84953k(cls2, (String) obj);
                                m82993b[i85] = m84953k2;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m84953k2);
                            int i86 = i85 + 1;
                            obj2 = m82993b[i86];
                            if (!(obj2 instanceof Field)) {
                                m84953k3 = (Field) obj2;
                            } else {
                                m84953k3 = m84953k(cls2, (String) obj2);
                                m82993b[i86] = m84953k3;
                            }
                            objectFieldOffset = objectFieldOffset2;
                            objArr2 = m82993b;
                            i18 = i83;
                            i17 = (int) unsafe.objectFieldOffset(m84953k3);
                            i19 = 0;
                        } else {
                            int i87 = i67 / 3;
                            i24 = i3 + 1;
                            objArr3[i87 + i87 + 1] = m82993b[i3];
                        }
                        i3 = i24;
                        int i852 = charAt26 + charAt26;
                        obj = m82993b[i852];
                        if (!(obj instanceof Field)) {
                        }
                        int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m84953k2);
                        int i862 = i852 + 1;
                        obj2 = m82993b[i862];
                        if (!(obj2 instanceof Field)) {
                        }
                        objectFieldOffset = objectFieldOffset22;
                        objArr2 = m82993b;
                        i18 = i83;
                        i17 = (int) unsafe.objectFieldOffset(m84953k3);
                        i19 = 0;
                    } else {
                        i16 = i2;
                        int i88 = i3 + 1;
                        Field m84953k4 = m84953k(cls2, (String) m82993b[i3]);
                        if (i76 != 9 && i76 != 17) {
                            if (i76 != 27 && i76 != 49) {
                                if (i76 != 12 && i76 != 30 && i76 != 44) {
                                    if (i76 == 50) {
                                        int i89 = i64 + 1;
                                        iArr[i64] = i67;
                                        int i90 = i67 / 3;
                                        int i91 = i88 + 1;
                                        int i92 = i90 + i90;
                                        objArr3[i92] = m82993b[i88];
                                        if ((charAt25 & 2048) != 0) {
                                            i88 = i91 + 1;
                                            objArr3[i92 + 1] = m82993b[i91];
                                            i64 = i89;
                                        } else {
                                            objArr = m82993b;
                                            i88 = i91;
                                            i64 = i89;
                                            objectFieldOffset = (int) unsafe.objectFieldOffset(m84953k4);
                                            i17 = 1048575;
                                            if ((charAt25 & 4096) != 4096 && i76 <= 17) {
                                                int i93 = i72 + 1;
                                                int charAt27 = m82994a.charAt(i72);
                                                if (charAt27 >= 55296) {
                                                    int i94 = charAt27 & 8191;
                                                    int i95 = 13;
                                                    while (true) {
                                                        i18 = i93 + 1;
                                                        charAt11 = m82994a.charAt(i93);
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
                                                    m84953k = (Field) obj3;
                                                } else {
                                                    m84953k = m84953k(cls2, (String) obj3);
                                                    objArr[i96] = m84953k;
                                                }
                                                i19 = charAt27 % 32;
                                                i17 = (int) unsafe.objectFieldOffset(m84953k);
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
                                    objArr3[i97 + i97 + 1] = m82993b[i88];
                                }
                            } else {
                                int i98 = i67 / 3;
                                i20 = i88 + 1;
                                objArr3[i98 + i98 + 1] = m82993b[i88];
                            }
                            i88 = i20;
                        } else {
                            int i99 = i67 / 3;
                            objArr3[i99 + i99 + 1] = m84953k4.getType();
                        }
                        objArr = m82993b;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(m84953k4);
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
                    m82993b = objArr2;
                    length = i73;
                    i32 = i18;
                    i5 = i77;
                    zzc = i14;
                    i2 = i16;
                    i30 = GeneratorBase.SURR1_FIRST;
                } else {
                    return new C35914Sj8(iArr3, objArr3, i2, i5, c36166Tl8.zza(), z, false, iArr, i4, i62, c32881Fk8, abstractC33772Jf8, abstractC32953Fs8, w28, c34492Mh8);
                }
            }
        } else {
            C36220Tr8 c36220Tr8 = (C36220Tr8) interfaceC46438oi8;
            throw null;
        }
    }

    /* renamed from: E */
    public static double m84972E(Object obj, long j) {
        return ((Double) C37192Xv8.m76068k(obj, j)).doubleValue();
    }

    /* renamed from: F */
    public static float m84971F(Object obj, long j) {
        return ((Float) C37192Xv8.m76068k(obj, j)).floatValue();
    }

    /* renamed from: H */
    public static int m84969H(Object obj, long j) {
        return ((Integer) C37192Xv8.m76068k(obj, j)).intValue();
    }

    /* renamed from: P */
    public static int m84961P(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: R */
    public static long m84959R(Object obj, long j) {
        return ((Long) C37192Xv8.m76068k(obj, j)).longValue();
    }

    /* renamed from: k */
    public static Field m84953k(Class cls, String str) {
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

    /* renamed from: l */
    public static void m84952l(Object obj) {
        if (m84940x(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* renamed from: w */
    public static boolean m84941w(Object obj, int i, InterfaceC32449Do8 interfaceC32449Do8) {
        return interfaceC32449Do8.mo40918b(C37192Xv8.m76068k(obj, i & 1048575));
    }

    /* renamed from: x */
    public static boolean m84940x(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof V78) {
            return ((V78) obj).m80356D();
        }
        return true;
    }

    /* renamed from: z */
    public static boolean m84938z(Object obj, long j) {
        return ((Boolean) C37192Xv8.m76068k(obj, j)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x054d, code lost:
        if (r6 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x054f, code lost:
        r32.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0555, code lost:
        r2 = r9.f34173i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0559, code lost:
        if (r2 >= r9.f34174j) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x055b, code lost:
        r4 = r9.f34172h[r2];
        r5 = r9.f34165a[r4];
        r5 = p000.C37192Xv8.m76068k(r12, r9.m84960Q(r4) & r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x056d, code lost:
        if (r5 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0574, code lost:
        if (r9.m84958f(r4) != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0576, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0579, code lost:
        r5 = (p000.C51763xh8) r5;
        r0 = (p000.C43463jh8) r9.m84956h(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0581, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0582, code lost:
        if (r7 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0586, code lost:
        if (r0 != r38) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x058d, code lost:
        throw com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo.m51317e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0590, code lost:
        if (r0 > r38) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0592, code lost:
        if (r3 != r7) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0594, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0599, code lost:
        throw com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo.m51317e();
     */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m84975B(Object obj, byte[] bArr, int i, int i2, int i3, FU7 fu7) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        C35914Sj8<T> c35914Sj8;
        int i5;
        byte b;
        int m84965L;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        Object obj3;
        byte[] bArr2;
        FU7 fu72;
        int i12;
        Object obj4;
        int i13;
        int i14;
        int i15;
        boolean z2;
        int i16;
        int i17;
        int i18;
        int i19;
        int m83561a;
        Object obj5;
        int i20;
        C35914Sj8<T> c35914Sj82 = this;
        Object obj6 = obj;
        byte[] bArr3 = bArr;
        int i21 = i2;
        int i22 = i3;
        FU7 fu73 = fu7;
        m84952l(obj);
        Unsafe unsafe2 = f34164q;
        int i23 = -1;
        int i24 = i;
        int i25 = -1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 1048575;
        while (true) {
            Object obj7 = null;
            if (i24 < i21) {
                int i30 = i24 + 1;
                byte b2 = bArr3[i24];
                if (b2 < 0) {
                    int m83551k = TU7.m83551k(b2, bArr3, i30, fu73);
                    b = fu73.f9512a;
                    i30 = m83551k;
                } else {
                    b = b2;
                }
                int i31 = b >>> 3;
                if (i31 > i25) {
                    m84965L = c35914Sj82.m84964M(i31, i26 / 3);
                } else {
                    m84965L = c35914Sj82.m84965L(i31);
                }
                int i32 = m84965L;
                if (i32 == i23) {
                    i6 = i31;
                    i7 = i28;
                    i8 = i29;
                    i9 = i23;
                    unsafe = unsafe2;
                    i4 = i22;
                    i10 = 0;
                    z = true;
                    i11 = b;
                } else {
                    int i33 = b & 7;
                    int[] iArr = c35914Sj82.f34165a;
                    int i34 = iArr[i32 + 1];
                    int m84961P = m84961P(i34);
                    long j = i34 & 1048575;
                    int i35 = b;
                    if (m84961P <= 17) {
                        int i36 = iArr[i32 + 2];
                        int i37 = 1 << (i36 >>> 20);
                        int i38 = i36 & 1048575;
                        if (i38 != i29) {
                            if (i29 != 1048575) {
                                long j2 = i29;
                                obj5 = obj;
                                unsafe2.putInt(obj5, j2, i28);
                            } else {
                                obj5 = obj;
                            }
                            i8 = i38;
                            i13 = unsafe2.getInt(obj5, i38);
                            obj6 = obj5;
                        } else {
                            obj6 = obj;
                            i13 = i28;
                            i8 = i29;
                        }
                        switch (m84961P) {
                            case 0:
                                i14 = i32;
                                i15 = i31;
                                z2 = true;
                                if (i33 != 1) {
                                    i16 = i14;
                                    i19 = i35;
                                    i11 = i19;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i16;
                                    i7 = i13;
                                    i9 = -1;
                                    break;
                                } else {
                                    C37192Xv8.m76059t(obj6, j, Double.longBitsToDouble(TU7.m83545q(bArr3, i30)));
                                    i24 = i30 + 8;
                                    i28 = i13 | i37;
                                    i21 = i2;
                                    i26 = i14;
                                    i25 = i15;
                                    i27 = i35;
                                    i29 = i8;
                                    i23 = -1;
                                    i22 = i3;
                                    break;
                                }
                            case 1:
                                i14 = i32;
                                i15 = i31;
                                if (i33 != 5) {
                                    i16 = i14;
                                    i19 = i35;
                                    z2 = true;
                                    i11 = i19;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i16;
                                    i7 = i13;
                                    i9 = -1;
                                    break;
                                } else {
                                    C37192Xv8.m76058u(obj6, j, Float.intBitsToFloat(TU7.m83560b(bArr3, i30)));
                                    i24 = i30 + 4;
                                    i28 = i13 | i37;
                                    i21 = i2;
                                    i26 = i14;
                                    i25 = i15;
                                    i27 = i35;
                                    i29 = i8;
                                    i23 = -1;
                                    i22 = i3;
                                    break;
                                }
                            case 2:
                            case 3:
                                i14 = i32;
                                i15 = i31;
                                if (i33 != 0) {
                                    i16 = i14;
                                    i19 = i35;
                                    z2 = true;
                                    i11 = i19;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i16;
                                    i7 = i13;
                                    i9 = -1;
                                    break;
                                } else {
                                    int m83549m = TU7.m83549m(bArr3, i30, fu73);
                                    unsafe2.putLong(obj, j, fu73.f9513b);
                                    i28 = i13 | i37;
                                    i21 = i2;
                                    i26 = i14;
                                    i24 = m83549m;
                                    i25 = i15;
                                    i27 = i35;
                                    i29 = i8;
                                    i23 = -1;
                                    i22 = i3;
                                    break;
                                }
                            case 4:
                            case 11:
                                i14 = i32;
                                i15 = i31;
                                if (i33 != 0) {
                                    i16 = i14;
                                    i19 = i35;
                                    z2 = true;
                                    i11 = i19;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i16;
                                    i7 = i13;
                                    i9 = -1;
                                    break;
                                } else {
                                    i24 = TU7.m83552j(bArr3, i30, fu73);
                                    unsafe2.putInt(obj6, j, fu73.f9512a);
                                    i28 = i13 | i37;
                                    i21 = i2;
                                    i26 = i14;
                                    i25 = i15;
                                    i27 = i35;
                                    i29 = i8;
                                    i23 = -1;
                                    i22 = i3;
                                    break;
                                }
                            case 5:
                            case 14:
                                i14 = i32;
                                i15 = i31;
                                if (i33 != 1) {
                                    z2 = true;
                                    i16 = i14;
                                    i19 = i35;
                                    i11 = i19;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i16;
                                    i7 = i13;
                                    i9 = -1;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, j, TU7.m83545q(bArr3, i30));
                                    i24 = i30 + 8;
                                    i28 = i13 | i37;
                                    i21 = i2;
                                    i26 = i14;
                                    i25 = i15;
                                    i27 = i35;
                                    i29 = i8;
                                    i23 = -1;
                                    i22 = i3;
                                    break;
                                }
                            case 6:
                            case 13:
                                i14 = i32;
                                i15 = i31;
                                if (i33 != 5) {
                                    i16 = i14;
                                    i19 = i35;
                                    z2 = true;
                                    i11 = i19;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i16;
                                    i7 = i13;
                                    i9 = -1;
                                    break;
                                } else {
                                    unsafe2.putInt(obj6, j, TU7.m83560b(bArr3, i30));
                                    i24 = i30 + 4;
                                    i28 = i13 | i37;
                                    i21 = i2;
                                    i26 = i14;
                                    i25 = i15;
                                    i27 = i35;
                                    i29 = i8;
                                    i23 = -1;
                                    i22 = i3;
                                    break;
                                }
                            case 7:
                                i14 = i32;
                                i15 = i31;
                                if (i33 != 0) {
                                    i16 = i14;
                                    i19 = i35;
                                    z2 = true;
                                    i11 = i19;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i16;
                                    i7 = i13;
                                    i9 = -1;
                                    break;
                                } else {
                                    i24 = TU7.m83549m(bArr3, i30, fu73);
                                    C37192Xv8.m76061r(obj6, j, fu73.f9513b != 0);
                                    i28 = i13 | i37;
                                    i21 = i2;
                                    i26 = i14;
                                    i25 = i15;
                                    i27 = i35;
                                    i29 = i8;
                                    i23 = -1;
                                    i22 = i3;
                                    break;
                                }
                            case 8:
                                i14 = i32;
                                i15 = i31;
                                if (i33 != 2) {
                                    i16 = i14;
                                    i19 = i35;
                                    z2 = true;
                                    i11 = i19;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i16;
                                    i7 = i13;
                                    i9 = -1;
                                    break;
                                } else {
                                    if ((536870912 & i34) == 0) {
                                        i24 = TU7.m83555g(bArr3, i30, fu73);
                                    } else {
                                        i24 = TU7.m83554h(bArr3, i30, fu73);
                                    }
                                    unsafe2.putObject(obj6, j, fu73.f9514c);
                                    i28 = i13 | i37;
                                    i21 = i2;
                                    i26 = i14;
                                    i25 = i15;
                                    i27 = i35;
                                    i29 = i8;
                                    i23 = -1;
                                    i22 = i3;
                                    break;
                                }
                            case 9:
                                i15 = i31;
                                if (i33 != 2) {
                                    i35 = i35;
                                    i16 = i32;
                                    i19 = i35;
                                    z2 = true;
                                    i11 = i19;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i16;
                                    i7 = i13;
                                    i9 = -1;
                                    break;
                                } else {
                                    Object m84955i = c35914Sj82.m84955i(obj6, i32);
                                    i35 = i35;
                                    i14 = i32;
                                    i24 = TU7.m83547o(m84955i, c35914Sj82.m84957g(i32), bArr, i30, i2, fu7);
                                    c35914Sj82.m84947q(obj6, i14, m84955i);
                                    i28 = i13 | i37;
                                    i21 = i2;
                                    i26 = i14;
                                    i25 = i15;
                                    i27 = i35;
                                    i29 = i8;
                                    i23 = -1;
                                    i22 = i3;
                                    break;
                                }
                            case 10:
                                i17 = i32;
                                i15 = i31;
                                i18 = i35;
                                if (i33 != 2) {
                                    i16 = i17;
                                    i19 = i18;
                                    z2 = true;
                                    i11 = i19;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i16;
                                    i7 = i13;
                                    i9 = -1;
                                    break;
                                } else {
                                    m83561a = TU7.m83561a(bArr3, i30, fu73);
                                    unsafe2.putObject(obj6, j, fu73.f9514c);
                                    int i39 = i13 | i37;
                                    i21 = i2;
                                    i27 = i18;
                                    i25 = i15;
                                    i29 = i8;
                                    i23 = -1;
                                    i22 = i3;
                                    int i40 = i17;
                                    i28 = i39;
                                    i24 = m83561a;
                                    i26 = i40;
                                    break;
                                }
                            case 12:
                                i17 = i32;
                                i15 = i31;
                                i18 = i35;
                                if (i33 != 0) {
                                    i16 = i17;
                                    i19 = i18;
                                    z2 = true;
                                    i11 = i19;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i16;
                                    i7 = i13;
                                    i9 = -1;
                                    break;
                                } else {
                                    m83561a = TU7.m83552j(bArr3, i30, fu73);
                                    int i41 = fu73.f9512a;
                                    InterfaceC40777f98 m84958f = c35914Sj82.m84958f(i17);
                                    if (m84958f != null && !m84958f.zza(i41)) {
                                        m84974C(obj).m80673j(i18, Long.valueOf(i41));
                                        i24 = m83561a;
                                        i26 = i17;
                                        i27 = i18;
                                        i25 = i15;
                                        i28 = i13;
                                        i29 = i8;
                                        i23 = -1;
                                        i21 = i2;
                                        i22 = i3;
                                        break;
                                    } else {
                                        unsafe2.putInt(obj6, j, i41);
                                        int i392 = i13 | i37;
                                        i21 = i2;
                                        i27 = i18;
                                        i25 = i15;
                                        i29 = i8;
                                        i23 = -1;
                                        i22 = i3;
                                        int i402 = i17;
                                        i28 = i392;
                                        i24 = m83561a;
                                        i26 = i402;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                i17 = i32;
                                i15 = i31;
                                i18 = i35;
                                if (i33 != 0) {
                                    i16 = i17;
                                    i19 = i18;
                                    z2 = true;
                                    i11 = i19;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i16;
                                    i7 = i13;
                                    i9 = -1;
                                    break;
                                } else {
                                    i24 = TU7.m83552j(bArr3, i30, fu73);
                                    unsafe2.putInt(obj6, j, C44245l08.m28023a(fu73.f9512a));
                                    int i42 = i13 | i37;
                                    i21 = i2;
                                    i26 = i17;
                                    i27 = i18;
                                    i29 = i8;
                                    i23 = -1;
                                    i28 = i42;
                                    i25 = i15;
                                    i22 = i3;
                                    break;
                                }
                            case 16:
                                if (i33 != 0) {
                                    i15 = i31;
                                    i16 = i32;
                                    i19 = i35;
                                    z2 = true;
                                    i11 = i19;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i16;
                                    i7 = i13;
                                    i9 = -1;
                                    break;
                                } else {
                                    int m83549m2 = TU7.m83549m(bArr3, i30, fu73);
                                    unsafe2.putLong(obj, j, C44245l08.m28022b(fu73.f9513b));
                                    i28 = i13 | i37;
                                    i24 = m83549m2;
                                    i21 = i2;
                                    i27 = i35;
                                    i26 = i32;
                                    i25 = i31;
                                    i29 = i8;
                                    i23 = -1;
                                    i22 = i3;
                                    break;
                                }
                            default:
                                i14 = i32;
                                i15 = i31;
                                z2 = true;
                                if (i33 != 3) {
                                    i16 = i14;
                                    i19 = i35;
                                    i11 = i19;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i16;
                                    i7 = i13;
                                    i9 = -1;
                                    break;
                                } else {
                                    Object m84955i2 = c35914Sj82.m84955i(obj6, i14);
                                    i24 = TU7.m83548n(m84955i2, c35914Sj82.m84957g(i14), bArr, i30, i2, (i15 << 3) | 4, fu7);
                                    c35914Sj82.m84947q(obj6, i14, m84955i2);
                                    i28 = i13 | i37;
                                    i27 = i35;
                                    i21 = i2;
                                    i25 = i15;
                                    i26 = i14;
                                    i29 = i8;
                                    i23 = -1;
                                    bArr3 = bArr;
                                    i22 = i3;
                                    break;
                                }
                        }
                    } else {
                        obj6 = obj;
                        if (m84961P != 27) {
                            i7 = i28;
                            i8 = i29;
                            if (m84961P <= 49) {
                                z = true;
                                int i43 = i30;
                                i9 = -1;
                                unsafe = unsafe2;
                                i10 = i32;
                                i6 = i31;
                                i24 = m84966K(obj, bArr, i30, i2, i35, i31, i33, i32, i34, m84961P, j, fu7);
                                if (i24 != i43) {
                                    c35914Sj82 = this;
                                    obj6 = obj;
                                    bArr3 = bArr;
                                    i27 = i35;
                                    i21 = i2;
                                    i22 = i3;
                                    fu73 = fu7;
                                    i28 = i7;
                                    i23 = i9;
                                    i25 = i6;
                                    i26 = i10;
                                    i29 = i8;
                                    unsafe2 = unsafe;
                                } else {
                                    i11 = i35;
                                    i4 = i3;
                                    i30 = i24;
                                }
                            } else {
                                z = true;
                                i20 = i30;
                                unsafe = unsafe2;
                                i10 = i32;
                                i6 = i31;
                                i9 = -1;
                                if (m84961P != 50) {
                                    i24 = m84967J(obj, bArr, i20, i2, i35, i6, i33, i34, m84961P, j, i10, fu7);
                                    if (i24 != i20) {
                                        c35914Sj82 = this;
                                        obj6 = obj;
                                        bArr3 = bArr;
                                        i27 = i35;
                                        i21 = i2;
                                        i22 = i3;
                                        fu73 = fu7;
                                        i28 = i7;
                                        i23 = i9;
                                        i25 = i6;
                                        i26 = i10;
                                        i29 = i8;
                                        unsafe2 = unsafe;
                                    } else {
                                        i11 = i35;
                                        i4 = i3;
                                        i30 = i24;
                                    }
                                } else if (i33 == 2) {
                                    i24 = m84968I(obj, bArr, i20, i2, i10, j, fu7);
                                    if (i24 != i20) {
                                        c35914Sj82 = this;
                                        obj6 = obj;
                                        bArr3 = bArr;
                                        i27 = i35;
                                        i21 = i2;
                                        i22 = i3;
                                        fu73 = fu7;
                                        i28 = i7;
                                        i23 = i9;
                                        i25 = i6;
                                        i26 = i10;
                                        i29 = i8;
                                        unsafe2 = unsafe;
                                    } else {
                                        i11 = i35;
                                        i4 = i3;
                                        i30 = i24;
                                    }
                                } else {
                                    i11 = i35;
                                    i4 = i3;
                                    i30 = i20;
                                }
                            }
                        } else if (i33 == 2) {
                            InterfaceC47544qa8 interfaceC47544qa8 = (InterfaceC47544qa8) unsafe2.getObject(obj6, j);
                            if (!interfaceC47544qa8.zzc()) {
                                int size = interfaceC47544qa8.size();
                                interfaceC47544qa8 = interfaceC47544qa8.mo17376d(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj6, j, interfaceC47544qa8);
                            }
                            i24 = TU7.m83557e(c35914Sj82.m84957g(i32), i35, bArr, i30, i2, interfaceC47544qa8, fu7);
                            i27 = i35;
                            i22 = i3;
                            i26 = i32;
                            i25 = i31;
                            i28 = i28;
                            i29 = i29;
                            i23 = -1;
                            bArr3 = bArr;
                            i21 = i2;
                        } else {
                            i7 = i28;
                            i8 = i29;
                            z = true;
                            i20 = i30;
                            unsafe = unsafe2;
                            i10 = i32;
                            i6 = i31;
                            i9 = -1;
                            i11 = i35;
                            i4 = i3;
                            i30 = i20;
                        }
                    }
                }
                if (i11 != i4 || i4 == 0) {
                    if (this.f34170f) {
                        fu72 = fu7;
                        J28 j28 = fu72.f9515d;
                        if (j28 != J28.f16697b) {
                            i12 = i6;
                            C47280q78 m101255b = j28.m101255b(this.f34169e, i12);
                            if (m101255b == null) {
                                i24 = TU7.m83553i(i11, bArr, i30, i2, m84974C(obj), fu7);
                                obj3 = obj;
                                bArr2 = bArr;
                            } else {
                                obj3 = obj;
                                Q58 q58 = (Q58) obj3;
                                q58.m88922H();
                                C39542d48 c39542d48 = q58.zza;
                                EnumC50737vx8 enumC50737vx8 = m101255b.f104761d.f56957c;
                                if (enumC50737vx8 != EnumC50737vx8.f114990p) {
                                    switch (enumC50737vx8.ordinal()) {
                                        case 0:
                                            bArr2 = bArr;
                                            obj7 = Double.valueOf(Double.longBitsToDouble(TU7.m83545q(bArr2, i30)));
                                            i30 += 8;
                                            obj4 = obj7;
                                            c39542d48.m44633i(m101255b.f104761d, obj4);
                                            i24 = i30;
                                            break;
                                        case 1:
                                            bArr2 = bArr;
                                            obj7 = Float.valueOf(Float.intBitsToFloat(TU7.m83560b(bArr2, i30)));
                                            i30 += 4;
                                            obj4 = obj7;
                                            c39542d48.m44633i(m101255b.f104761d, obj4);
                                            i24 = i30;
                                            break;
                                        case 2:
                                        case 3:
                                            bArr2 = bArr;
                                            i30 = TU7.m83549m(bArr2, i30, fu72);
                                            obj7 = Long.valueOf(fu72.f9513b);
                                            obj4 = obj7;
                                            c39542d48.m44633i(m101255b.f104761d, obj4);
                                            i24 = i30;
                                            break;
                                        case 4:
                                        case 12:
                                            bArr2 = bArr;
                                            i30 = TU7.m83552j(bArr2, i30, fu72);
                                            obj7 = Integer.valueOf(fu72.f9512a);
                                            obj4 = obj7;
                                            c39542d48.m44633i(m101255b.f104761d, obj4);
                                            i24 = i30;
                                            break;
                                        case 5:
                                        case 15:
                                            bArr2 = bArr;
                                            obj7 = Long.valueOf(TU7.m83545q(bArr2, i30));
                                            i30 += 8;
                                            obj4 = obj7;
                                            c39542d48.m44633i(m101255b.f104761d, obj4);
                                            i24 = i30;
                                            break;
                                        case 6:
                                        case 14:
                                            bArr2 = bArr;
                                            obj7 = Integer.valueOf(TU7.m83560b(bArr2, i30));
                                            i30 += 4;
                                            obj4 = obj7;
                                            c39542d48.m44633i(m101255b.f104761d, obj4);
                                            i24 = i30;
                                            break;
                                        case 7:
                                            bArr2 = bArr;
                                            i30 = TU7.m83549m(bArr2, i30, fu72);
                                            if (fu72.f9513b == 0) {
                                                z = false;
                                            }
                                            obj7 = Boolean.valueOf(z);
                                            obj4 = obj7;
                                            c39542d48.m44633i(m101255b.f104761d, obj4);
                                            i24 = i30;
                                            break;
                                        case 8:
                                            bArr2 = bArr;
                                            i30 = TU7.m83555g(bArr2, i30, fu72);
                                            obj4 = fu72.f9514c;
                                            c39542d48.m44633i(m101255b.f104761d, obj4);
                                            i24 = i30;
                                            break;
                                        case 9:
                                            bArr2 = bArr;
                                            int i44 = (i12 << 3) | 4;
                                            InterfaceC32449Do8 m15450b = C48247rl8.m15451a().m15450b(m101255b.f104760c.getClass());
                                            Object m44637e = c39542d48.m44637e(m101255b.f104761d);
                                            if (m44637e == null) {
                                                m44637e = m15450b.zze();
                                                c39542d48.m44633i(m101255b.f104761d, m44637e);
                                            }
                                            i24 = TU7.m83548n(m44637e, m15450b, bArr, i30, i2, i44, fu7);
                                            break;
                                        case 10:
                                            bArr2 = bArr;
                                            InterfaceC32449Do8 m15450b2 = C48247rl8.m15451a().m15450b(m101255b.f104760c.getClass());
                                            Object m44637e2 = c39542d48.m44637e(m101255b.f104761d);
                                            if (m44637e2 == null) {
                                                m44637e2 = m15450b2.zze();
                                                c39542d48.m44633i(m101255b.f104761d, m44637e2);
                                            }
                                            i24 = TU7.m83547o(m44637e2, m15450b2, bArr, i30, i2, fu7);
                                            break;
                                        case 11:
                                            bArr2 = bArr;
                                            i30 = TU7.m83561a(bArr2, i30, fu72);
                                            obj4 = fu72.f9514c;
                                            c39542d48.m44633i(m101255b.f104761d, obj4);
                                            i24 = i30;
                                            break;
                                        case 13:
                                            throw new IllegalStateException("Shouldn't reach here.");
                                        case 16:
                                            bArr2 = bArr;
                                            i30 = TU7.m83552j(bArr2, i30, fu72);
                                            obj7 = Integer.valueOf(C44245l08.m28023a(fu72.f9512a));
                                            obj4 = obj7;
                                            c39542d48.m44633i(m101255b.f104761d, obj4);
                                            i24 = i30;
                                            break;
                                        case 17:
                                            bArr2 = bArr;
                                            i30 = TU7.m83549m(bArr2, i30, fu72);
                                            obj7 = Long.valueOf(C44245l08.m28022b(fu72.f9513b));
                                            obj4 = obj7;
                                            c39542d48.m44633i(m101255b.f104761d, obj4);
                                            i24 = i30;
                                            break;
                                        default:
                                            bArr2 = bArr;
                                            obj4 = obj7;
                                            c39542d48.m44633i(m101255b.f104761d, obj4);
                                            i24 = i30;
                                            break;
                                    }
                                } else {
                                    TU7.m83552j(bArr, i30, fu72);
                                    throw null;
                                }
                            }
                            i27 = i11;
                            c35914Sj82 = this;
                            fu73 = fu72;
                            i25 = i12;
                            obj6 = obj3;
                            bArr3 = bArr2;
                            i28 = i7;
                            i23 = i9;
                            i26 = i10;
                            i29 = i8;
                            unsafe2 = unsafe;
                            i21 = i2;
                            i22 = i4;
                        } else {
                            obj3 = obj;
                            bArr2 = bArr;
                        }
                    } else {
                        obj3 = obj;
                        bArr2 = bArr;
                        fu72 = fu7;
                    }
                    i12 = i6;
                    i24 = TU7.m83553i(i11, bArr, i30, i2, m84974C(obj), fu7);
                    i27 = i11;
                    c35914Sj82 = this;
                    fu73 = fu72;
                    i25 = i12;
                    obj6 = obj3;
                    bArr3 = bArr2;
                    i28 = i7;
                    i23 = i9;
                    i26 = i10;
                    i29 = i8;
                    unsafe2 = unsafe;
                    i21 = i2;
                    i22 = i4;
                } else {
                    i5 = 1048575;
                    c35914Sj8 = this;
                    obj2 = obj;
                    i24 = i30;
                    i27 = i11;
                    i28 = i7;
                    i29 = i8;
                }
            } else {
                unsafe = unsafe2;
                i4 = i22;
                obj2 = obj6;
                c35914Sj8 = c35914Sj82;
                i5 = 1048575;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: G */
    public final int m84970G(Object obj) {
        int i;
        int m16656A;
        int m16656A2;
        int m16655B;
        int m16656A3;
        int m16656A4;
        int m16656A5;
        int m16656A6;
        int m45034S;
        boolean z;
        int m45051B;
        int m45046G;
        int m16656A7;
        int m16656A8;
        int i2;
        int m16656A9;
        int m16656A10;
        int m16656A11;
        int m16656A12;
        Unsafe unsafe = f34164q;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.f34165a.length) {
            int m84960Q = m84960Q(i5);
            int[] iArr = this.f34165a;
            int i8 = iArr[i5];
            int m84961P = m84961P(m84960Q);
            if (m84961P <= 17) {
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
            long j = m84960Q & i3;
            switch (m84961P) {
                case 0:
                    if ((i7 & i) != 0) {
                        m16656A = AbstractC47813r18.m16656A(i8 << 3);
                        m16656A4 = m16656A + 8;
                        i6 += m16656A4;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i7 & i) != 0) {
                        m16656A2 = AbstractC47813r18.m16656A(i8 << 3);
                        m16656A4 = m16656A2 + 4;
                        i6 += m16656A4;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i7 & i) != 0) {
                        m16655B = AbstractC47813r18.m16655B(unsafe.getLong(obj, j));
                        m16656A3 = AbstractC47813r18.m16656A(i8 << 3);
                        i6 += m16656A3 + m16655B;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i7 & i) != 0) {
                        m16655B = AbstractC47813r18.m16655B(unsafe.getLong(obj, j));
                        m16656A3 = AbstractC47813r18.m16656A(i8 << 3);
                        i6 += m16656A3 + m16655B;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i7 & i) != 0) {
                        m16655B = AbstractC47813r18.m16632w(unsafe.getInt(obj, j));
                        m16656A3 = AbstractC47813r18.m16656A(i8 << 3);
                        i6 += m16656A3 + m16655B;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i7 & i) != 0) {
                        m16656A = AbstractC47813r18.m16656A(i8 << 3);
                        m16656A4 = m16656A + 8;
                        i6 += m16656A4;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i7 & i) != 0) {
                        m16656A2 = AbstractC47813r18.m16656A(i8 << 3);
                        m16656A4 = m16656A2 + 4;
                        i6 += m16656A4;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i7 & i) != 0) {
                        m16656A4 = AbstractC47813r18.m16656A(i8 << 3) + 1;
                        i6 += m16656A4;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i7 & i) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof AbstractC41604gZ7) {
                            Logger logger = AbstractC47813r18.f106235b;
                            int mo5074e = ((AbstractC41604gZ7) object).mo5074e();
                            m16656A5 = AbstractC47813r18.m16656A(mo5074e) + mo5074e;
                            m16656A6 = AbstractC47813r18.m16656A(i8 << 3);
                            m16656A4 = m16656A6 + m16656A5;
                            i6 += m16656A4;
                            break;
                        } else {
                            m16655B = AbstractC47813r18.m16629z((String) object);
                            m16656A3 = AbstractC47813r18.m16656A(i8 << 3);
                            i6 += m16656A3 + m16655B;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if ((i7 & i) != 0) {
                        m16656A4 = C39393cp8.m45040M(i8, unsafe.getObject(obj, j), m84957g(i5));
                        i6 += m16656A4;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i7 & i) != 0) {
                        Logger logger2 = AbstractC47813r18.f106235b;
                        int mo5074e2 = ((AbstractC41604gZ7) unsafe.getObject(obj, j)).mo5074e();
                        m16656A5 = AbstractC47813r18.m16656A(mo5074e2) + mo5074e2;
                        m16656A6 = AbstractC47813r18.m16656A(i8 << 3);
                        m16656A4 = m16656A6 + m16656A5;
                        i6 += m16656A4;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i7 & i) != 0) {
                        m16655B = AbstractC47813r18.m16656A(unsafe.getInt(obj, j));
                        m16656A3 = AbstractC47813r18.m16656A(i8 << 3);
                        i6 += m16656A3 + m16655B;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i7 & i) != 0) {
                        m16655B = AbstractC47813r18.m16632w(unsafe.getInt(obj, j));
                        m16656A3 = AbstractC47813r18.m16656A(i8 << 3);
                        i6 += m16656A3 + m16655B;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i7 & i) != 0) {
                        m16656A2 = AbstractC47813r18.m16656A(i8 << 3);
                        m16656A4 = m16656A2 + 4;
                        i6 += m16656A4;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i7 & i) != 0) {
                        m16656A = AbstractC47813r18.m16656A(i8 << 3);
                        m16656A4 = m16656A + 8;
                        i6 += m16656A4;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i7 & i) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        m16656A3 = AbstractC47813r18.m16656A(i8 << 3);
                        m16655B = AbstractC47813r18.m16656A((i12 >> 31) ^ (i12 + i12));
                        i6 += m16656A3 + m16655B;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i & i7) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        i6 += AbstractC47813r18.m16656A(i8 << 3) + AbstractC47813r18.m16655B((j2 >> 63) ^ (j2 + j2));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i7 & i) != 0) {
                        m16656A4 = AbstractC47813r18.m16633v(i8, (InterfaceC39926dj8) unsafe.getObject(obj, j), m84957g(i5));
                        i6 += m16656A4;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m16656A4 = C39393cp8.m45047F(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m16656A4;
                    break;
                case 19:
                    m16656A4 = C39393cp8.m45049D(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m16656A4;
                    break;
                case 20:
                    m16656A4 = C39393cp8.m45042K(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m16656A4;
                    break;
                case 21:
                    m16656A4 = C39393cp8.m45031V(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m16656A4;
                    break;
                case 22:
                    m16656A4 = C39393cp8.m45044I(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m16656A4;
                    break;
                case 23:
                    m16656A4 = C39393cp8.m45047F(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m16656A4;
                    break;
                case 24:
                    m16656A4 = C39393cp8.m45049D(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m16656A4;
                    break;
                case 25:
                    m16656A4 = C39393cp8.m45002z(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m16656A4;
                    break;
                case 26:
                    m45034S = C39393cp8.m45034S(i8, (List) unsafe.getObject(obj, j));
                    i6 += m45034S;
                    break;
                case 27:
                    m45034S = C39393cp8.m45039N(i8, (List) unsafe.getObject(obj, j), m84957g(i5));
                    i6 += m45034S;
                    break;
                case 28:
                    m45034S = C39393cp8.m45052A(i8, (List) unsafe.getObject(obj, j));
                    i6 += m45034S;
                    break;
                case 29:
                    m45034S = C39393cp8.m45033T(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m45034S;
                    break;
                case 30:
                    z = false;
                    m45051B = C39393cp8.m45051B(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m45051B;
                    break;
                case 31:
                    z = false;
                    m45051B = C39393cp8.m45049D(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m45051B;
                    break;
                case 32:
                    z = false;
                    m45051B = C39393cp8.m45047F(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m45051B;
                    break;
                case 33:
                    z = false;
                    m45051B = C39393cp8.m45038O(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m45051B;
                    break;
                case 34:
                    z = false;
                    m45051B = C39393cp8.m45036Q(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m45051B;
                    break;
                case 35:
                    m45046G = C39393cp8.m45046G((List) unsafe.getObject(obj, j));
                    if (m45046G > 0) {
                        m16656A7 = AbstractC47813r18.m16656A(m45046G);
                        m16656A8 = AbstractC47813r18.m16656A(i8 << 3);
                        i2 = m16656A8 + m16656A7;
                        i6 += i2 + m45046G;
                    }
                    break;
                case 36:
                    m45046G = C39393cp8.m45048E((List) unsafe.getObject(obj, j));
                    if (m45046G > 0) {
                        m16656A7 = AbstractC47813r18.m16656A(m45046G);
                        m16656A8 = AbstractC47813r18.m16656A(i8 << 3);
                        i2 = m16656A8 + m16656A7;
                        i6 += i2 + m45046G;
                    }
                    break;
                case 37:
                    m45046G = C39393cp8.m45041L((List) unsafe.getObject(obj, j));
                    if (m45046G > 0) {
                        m16656A7 = AbstractC47813r18.m16656A(m45046G);
                        m16656A8 = AbstractC47813r18.m16656A(i8 << 3);
                        i2 = m16656A8 + m16656A7;
                        i6 += i2 + m45046G;
                    }
                    break;
                case 38:
                    m45046G = C39393cp8.m45030W((List) unsafe.getObject(obj, j));
                    if (m45046G > 0) {
                        m16656A7 = AbstractC47813r18.m16656A(m45046G);
                        m16656A8 = AbstractC47813r18.m16656A(i8 << 3);
                        i2 = m16656A8 + m16656A7;
                        i6 += i2 + m45046G;
                    }
                    break;
                case 39:
                    m45046G = C39393cp8.m45043J((List) unsafe.getObject(obj, j));
                    if (m45046G > 0) {
                        m16656A7 = AbstractC47813r18.m16656A(m45046G);
                        m16656A8 = AbstractC47813r18.m16656A(i8 << 3);
                        i2 = m16656A8 + m16656A7;
                        i6 += i2 + m45046G;
                    }
                    break;
                case 40:
                    m45046G = C39393cp8.m45046G((List) unsafe.getObject(obj, j));
                    if (m45046G > 0) {
                        m16656A7 = AbstractC47813r18.m16656A(m45046G);
                        m16656A8 = AbstractC47813r18.m16656A(i8 << 3);
                        i2 = m16656A8 + m16656A7;
                        i6 += i2 + m45046G;
                    }
                    break;
                case 41:
                    m45046G = C39393cp8.m45048E((List) unsafe.getObject(obj, j));
                    if (m45046G > 0) {
                        m16656A7 = AbstractC47813r18.m16656A(m45046G);
                        m16656A8 = AbstractC47813r18.m16656A(i8 << 3);
                        i2 = m16656A8 + m16656A7;
                        i6 += i2 + m45046G;
                    }
                    break;
                case 42:
                    Class cls = C39393cp8.f75682a;
                    m45046G = ((List) unsafe.getObject(obj, j)).size();
                    if (m45046G > 0) {
                        m16656A7 = AbstractC47813r18.m16656A(m45046G);
                        m16656A8 = AbstractC47813r18.m16656A(i8 << 3);
                        i2 = m16656A8 + m16656A7;
                        i6 += i2 + m45046G;
                    }
                    break;
                case 43:
                    m45046G = C39393cp8.m45032U((List) unsafe.getObject(obj, j));
                    if (m45046G > 0) {
                        m16656A7 = AbstractC47813r18.m16656A(m45046G);
                        m16656A8 = AbstractC47813r18.m16656A(i8 << 3);
                        i2 = m16656A8 + m16656A7;
                        i6 += i2 + m45046G;
                    }
                    break;
                case 44:
                    m45046G = C39393cp8.m45050C((List) unsafe.getObject(obj, j));
                    if (m45046G > 0) {
                        m16656A7 = AbstractC47813r18.m16656A(m45046G);
                        m16656A8 = AbstractC47813r18.m16656A(i8 << 3);
                        i2 = m16656A8 + m16656A7;
                        i6 += i2 + m45046G;
                    }
                    break;
                case 45:
                    m45046G = C39393cp8.m45048E((List) unsafe.getObject(obj, j));
                    if (m45046G > 0) {
                        m16656A7 = AbstractC47813r18.m16656A(m45046G);
                        m16656A8 = AbstractC47813r18.m16656A(i8 << 3);
                        i2 = m16656A8 + m16656A7;
                        i6 += i2 + m45046G;
                    }
                    break;
                case 46:
                    m45046G = C39393cp8.m45046G((List) unsafe.getObject(obj, j));
                    if (m45046G > 0) {
                        m16656A7 = AbstractC47813r18.m16656A(m45046G);
                        m16656A8 = AbstractC47813r18.m16656A(i8 << 3);
                        i2 = m16656A8 + m16656A7;
                        i6 += i2 + m45046G;
                    }
                    break;
                case 47:
                    m45046G = C39393cp8.m45037P((List) unsafe.getObject(obj, j));
                    if (m45046G > 0) {
                        m16656A7 = AbstractC47813r18.m16656A(m45046G);
                        m16656A8 = AbstractC47813r18.m16656A(i8 << 3);
                        i2 = m16656A8 + m16656A7;
                        i6 += i2 + m45046G;
                    }
                    break;
                case 48:
                    m45046G = C39393cp8.m45035R((List) unsafe.getObject(obj, j));
                    if (m45046G > 0) {
                        m16656A7 = AbstractC47813r18.m16656A(m45046G);
                        m16656A8 = AbstractC47813r18.m16656A(i8 << 3);
                        i2 = m16656A8 + m16656A7;
                        i6 += i2 + m45046G;
                    }
                    break;
                case 49:
                    m45034S = C39393cp8.m45045H(i8, (List) unsafe.getObject(obj, j), m84957g(i5));
                    i6 += m45034S;
                    break;
                case 50:
                    C34492Mh8.m95032a(i8, unsafe.getObject(obj, j), m84956h(i5));
                    break;
                case 51:
                    if (m84939y(obj, i8, i5)) {
                        m16656A9 = AbstractC47813r18.m16656A(i8 << 3);
                        m45034S = m16656A9 + 8;
                        i6 += m45034S;
                    }
                    break;
                case 52:
                    if (m84939y(obj, i8, i5)) {
                        m16656A10 = AbstractC47813r18.m16656A(i8 << 3);
                        m45034S = m16656A10 + 4;
                        i6 += m45034S;
                    }
                    break;
                case 53:
                    if (m84939y(obj, i8, i5)) {
                        m45046G = AbstractC47813r18.m16655B(m84959R(obj, j));
                        i2 = AbstractC47813r18.m16656A(i8 << 3);
                        i6 += i2 + m45046G;
                    }
                    break;
                case 54:
                    if (m84939y(obj, i8, i5)) {
                        m45046G = AbstractC47813r18.m16655B(m84959R(obj, j));
                        i2 = AbstractC47813r18.m16656A(i8 << 3);
                        i6 += i2 + m45046G;
                    }
                    break;
                case 55:
                    if (m84939y(obj, i8, i5)) {
                        m45046G = AbstractC47813r18.m16632w(m84969H(obj, j));
                        i2 = AbstractC47813r18.m16656A(i8 << 3);
                        i6 += i2 + m45046G;
                    }
                    break;
                case 56:
                    if (m84939y(obj, i8, i5)) {
                        m16656A9 = AbstractC47813r18.m16656A(i8 << 3);
                        m45034S = m16656A9 + 8;
                        i6 += m45034S;
                    }
                    break;
                case 57:
                    if (m84939y(obj, i8, i5)) {
                        m16656A10 = AbstractC47813r18.m16656A(i8 << 3);
                        m45034S = m16656A10 + 4;
                        i6 += m45034S;
                    }
                    break;
                case 58:
                    if (m84939y(obj, i8, i5)) {
                        m45034S = AbstractC47813r18.m16656A(i8 << 3) + 1;
                        i6 += m45034S;
                    }
                    break;
                case 59:
                    if (m84939y(obj, i8, i5)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof AbstractC41604gZ7) {
                            Logger logger3 = AbstractC47813r18.f106235b;
                            int mo5074e3 = ((AbstractC41604gZ7) object2).mo5074e();
                            m16656A11 = AbstractC47813r18.m16656A(mo5074e3) + mo5074e3;
                            m16656A12 = AbstractC47813r18.m16656A(i8 << 3);
                            m45034S = m16656A12 + m16656A11;
                            i6 += m45034S;
                        } else {
                            m45046G = AbstractC47813r18.m16629z((String) object2);
                            i2 = AbstractC47813r18.m16656A(i8 << 3);
                            i6 += i2 + m45046G;
                        }
                    }
                    break;
                case 60:
                    if (m84939y(obj, i8, i5)) {
                        m45034S = C39393cp8.m45040M(i8, unsafe.getObject(obj, j), m84957g(i5));
                        i6 += m45034S;
                    }
                    break;
                case 61:
                    if (m84939y(obj, i8, i5)) {
                        Logger logger4 = AbstractC47813r18.f106235b;
                        int mo5074e4 = ((AbstractC41604gZ7) unsafe.getObject(obj, j)).mo5074e();
                        m16656A11 = AbstractC47813r18.m16656A(mo5074e4) + mo5074e4;
                        m16656A12 = AbstractC47813r18.m16656A(i8 << 3);
                        m45034S = m16656A12 + m16656A11;
                        i6 += m45034S;
                    }
                    break;
                case 62:
                    if (m84939y(obj, i8, i5)) {
                        m45046G = AbstractC47813r18.m16656A(m84969H(obj, j));
                        i2 = AbstractC47813r18.m16656A(i8 << 3);
                        i6 += i2 + m45046G;
                    }
                    break;
                case 63:
                    if (m84939y(obj, i8, i5)) {
                        m45046G = AbstractC47813r18.m16632w(m84969H(obj, j));
                        i2 = AbstractC47813r18.m16656A(i8 << 3);
                        i6 += i2 + m45046G;
                    }
                    break;
                case 64:
                    if (m84939y(obj, i8, i5)) {
                        m16656A10 = AbstractC47813r18.m16656A(i8 << 3);
                        m45034S = m16656A10 + 4;
                        i6 += m45034S;
                    }
                    break;
                case 65:
                    if (m84939y(obj, i8, i5)) {
                        m16656A9 = AbstractC47813r18.m16656A(i8 << 3);
                        m45034S = m16656A9 + 8;
                        i6 += m45034S;
                    }
                    break;
                case 66:
                    if (m84939y(obj, i8, i5)) {
                        int m84969H = m84969H(obj, j);
                        i2 = AbstractC47813r18.m16656A(i8 << 3);
                        m45046G = AbstractC47813r18.m16656A((m84969H >> 31) ^ (m84969H + m84969H));
                        i6 += i2 + m45046G;
                    }
                    break;
                case 67:
                    if (m84939y(obj, i8, i5)) {
                        long m84959R = m84959R(obj, j);
                        i6 += AbstractC47813r18.m16656A(i8 << 3) + AbstractC47813r18.m16655B((m84959R >> 63) ^ (m84959R + m84959R));
                    }
                    break;
                case 68:
                    if (m84939y(obj, i8, i5)) {
                        m45034S = AbstractC47813r18.m16633v(i8, (InterfaceC39926dj8) unsafe.getObject(obj, j), m84957g(i5));
                        i6 += m45034S;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        int i13 = 0;
        AbstractC32953Fs8 abstractC32953Fs8 = this.f34176l;
        int mo82293a = i6 + abstractC32953Fs8.mo82293a(abstractC32953Fs8.mo82290d(obj));
        if (this.f34170f) {
            C39542d48 mo24513b = this.f34177m.mo24513b(obj);
            for (int i14 = 0; i14 < mo24513b.f76101a.m104668b(); i14++) {
                Map.Entry m104663g = mo24513b.f76101a.m104663g(i14);
                i13 += C39542d48.m44641a((O38) m104663g.getKey(), m104663g.getValue());
            }
            for (Map.Entry entry : mo24513b.f76101a.m104667c()) {
                i13 += C39542d48.m44641a((O38) entry.getKey(), entry.getValue());
            }
            return mo82293a + i13;
        }
        return mo82293a;
    }

    /* renamed from: I */
    public final int m84968I(Object obj, byte[] bArr, int i, int i2, int i3, long j, FU7 fu7) throws IOException {
        Unsafe unsafe = f34164q;
        Object m84956h = m84956h(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((C51763xh8) object).m4870h()) {
            C51763xh8 m4873e = C51763xh8.m4874d().m4873e();
            C34492Mh8.m95031b(m4873e, object);
            unsafe.putObject(obj, j, m4873e);
        }
        C43463jh8 c43463jh8 = (C43463jh8) m84956h;
        throw null;
    }

    /* renamed from: J */
    public final int m84967J(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, FU7 fu7) throws IOException {
        boolean z;
        Unsafe unsafe = f34164q;
        long j2 = this.f34165a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(TU7.m83545q(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(TU7.m83560b(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int m83549m = TU7.m83549m(bArr, i, fu7);
                    unsafe.putObject(obj, j, Long.valueOf(fu7.f9513b));
                    unsafe.putInt(obj, j2, i4);
                    return m83549m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m83552j = TU7.m83552j(bArr, i, fu7);
                    unsafe.putObject(obj, j, Integer.valueOf(fu7.f9512a));
                    unsafe.putInt(obj, j2, i4);
                    return m83552j;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(TU7.m83545q(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(TU7.m83560b(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m83549m2 = TU7.m83549m(bArr, i, fu7);
                    if (fu7.f9513b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z));
                    unsafe.putInt(obj, j2, i4);
                    return m83549m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int m83552j2 = TU7.m83552j(bArr, i, fu7);
                    int i13 = fu7.f9512a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !C43623jx8.m29595h(bArr, m83552j2, m83552j2 + i13)) {
                        throw zzeo.m51319c();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m83552j2, i13, C32791Fa8.f9737b));
                        m83552j2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m83552j2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object m84954j = m84954j(obj, i4, i8);
                    int m83547o = TU7.m83547o(m84954j, m84957g(i8), bArr, i, i2, fu7);
                    m84946r(obj, i4, i8, m84954j);
                    return m83547o;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m83561a = TU7.m83561a(bArr, i, fu7);
                    unsafe.putObject(obj, j, fu7.f9514c);
                    unsafe.putInt(obj, j2, i4);
                    return m83561a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m83552j3 = TU7.m83552j(bArr, i, fu7);
                    int i14 = fu7.f9512a;
                    InterfaceC40777f98 m84958f = m84958f(i8);
                    if (m84958f != null && !m84958f.zza(i14)) {
                        m84974C(obj).m80673j(i3, Long.valueOf(i14));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return m83552j3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int m83552j4 = TU7.m83552j(bArr, i, fu7);
                    unsafe.putObject(obj, j, Integer.valueOf(C44245l08.m28023a(fu7.f9512a)));
                    unsafe.putInt(obj, j2, i4);
                    return m83552j4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int m83549m3 = TU7.m83549m(bArr, i, fu7);
                    unsafe.putObject(obj, j, Long.valueOf(C44245l08.m28022b(fu7.f9513b)));
                    unsafe.putInt(obj, j2, i4);
                    return m83549m3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object m84954j2 = m84954j(obj, i4, i8);
                    int m83548n = TU7.m83548n(m84954j2, m84957g(i8), bArr, i, i2, (i3 & (-8)) | 4, fu7);
                    m84946r(obj, i4, i8, m84954j2);
                    return m83548n;
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
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m84966K(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, FU7 fu7) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        boolean z3;
        int i12;
        int m83550l;
        int i13;
        int i14 = i;
        Unsafe unsafe = f34164q;
        InterfaceC47544qa8 interfaceC47544qa8 = (InterfaceC47544qa8) unsafe.getObject(obj, j2);
        if (!interfaceC47544qa8.zzc()) {
            int size = interfaceC47544qa8.size();
            if (size == 0) {
                i13 = 10;
            } else {
                i13 = size + size;
            }
            interfaceC47544qa8 = interfaceC47544qa8.mo17376d(i13);
            unsafe.putObject(obj, j2, interfaceC47544qa8);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    S18 s18 = (S18) interfaceC47544qa8;
                    int m83552j = TU7.m83552j(bArr, i14, fu7);
                    int i15 = fu7.f9512a + m83552j;
                    while (m83552j < i15) {
                        s18.m86092b(Double.longBitsToDouble(TU7.m83545q(bArr, m83552j)));
                        m83552j += 8;
                    }
                    if (m83552j != i15) {
                        throw zzeo.m51315g();
                    }
                    return m83552j;
                } else if (i5 == 1) {
                    S18 s182 = (S18) interfaceC47544qa8;
                    s182.m86092b(Double.longBitsToDouble(TU7.m83545q(bArr, i)));
                    while (true) {
                        i8 = i14 + 8;
                        if (i8 < i2) {
                            i14 = TU7.m83552j(bArr, i8, fu7);
                            if (i3 == fu7.f9512a) {
                                s182.m86092b(Double.longBitsToDouble(TU7.m83545q(bArr, i14)));
                            }
                        }
                    }
                    return i8;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    F48 f48 = (F48) interfaceC47544qa8;
                    int m83552j2 = TU7.m83552j(bArr, i14, fu7);
                    int i16 = fu7.f9512a + m83552j2;
                    while (m83552j2 < i16) {
                        f48.mo9066u0(Float.intBitsToFloat(TU7.m83560b(bArr, m83552j2)));
                        m83552j2 += 4;
                    }
                    if (m83552j2 != i16) {
                        throw zzeo.m51315g();
                    }
                    return m83552j2;
                } else if (i5 == 5) {
                    F48 f482 = (F48) interfaceC47544qa8;
                    f482.mo9066u0(Float.intBitsToFloat(TU7.m83560b(bArr, i)));
                    while (true) {
                        i9 = i14 + 4;
                        if (i9 < i2) {
                            i14 = TU7.m83552j(bArr, i9, fu7);
                            if (i3 == fu7.f9512a) {
                                f482.mo9066u0(Float.intBitsToFloat(TU7.m83560b(bArr, i14)));
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
                    C37516Zf8 c37516Zf8 = (C37516Zf8) interfaceC47544qa8;
                    int m83552j3 = TU7.m83552j(bArr, i14, fu7);
                    int i17 = fu7.f9512a + m83552j3;
                    while (m83552j3 < i17) {
                        m83552j3 = TU7.m83549m(bArr, m83552j3, fu7);
                        c37516Zf8.m72783c(fu7.f9513b);
                    }
                    if (m83552j3 != i17) {
                        throw zzeo.m51315g();
                    }
                    return m83552j3;
                } else if (i5 == 0) {
                    C37516Zf8 c37516Zf82 = (C37516Zf8) interfaceC47544qa8;
                    int m83549m = TU7.m83549m(bArr, i14, fu7);
                    c37516Zf82.m72783c(fu7.f9513b);
                    while (m83549m < i2) {
                        int m83552j4 = TU7.m83552j(bArr, m83549m, fu7);
                        if (i3 == fu7.f9512a) {
                            m83549m = TU7.m83549m(bArr, m83552j4, fu7);
                            c37516Zf82.m72783c(fu7.f9513b);
                        } else {
                            return m83549m;
                        }
                    }
                    return m83549m;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return TU7.m83556f(bArr, i14, interfaceC47544qa8, fu7);
                }
                if (i5 == 0) {
                    return TU7.m83550l(i3, bArr, i, i2, interfaceC47544qa8, fu7);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    C37516Zf8 c37516Zf83 = (C37516Zf8) interfaceC47544qa8;
                    int m83552j5 = TU7.m83552j(bArr, i14, fu7);
                    int i18 = fu7.f9512a + m83552j5;
                    while (m83552j5 < i18) {
                        c37516Zf83.m72783c(TU7.m83545q(bArr, m83552j5));
                        m83552j5 += 8;
                    }
                    if (m83552j5 != i18) {
                        throw zzeo.m51315g();
                    }
                    return m83552j5;
                } else if (i5 == 1) {
                    C37516Zf8 c37516Zf84 = (C37516Zf8) interfaceC47544qa8;
                    c37516Zf84.m72783c(TU7.m83545q(bArr, i));
                    while (true) {
                        i10 = i14 + 8;
                        if (i10 < i2) {
                            i14 = TU7.m83552j(bArr, i10, fu7);
                            if (i3 == fu7.f9512a) {
                                c37516Zf84.m72783c(TU7.m83545q(bArr, i14));
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
                    C44325l88 c44325l88 = (C44325l88) interfaceC47544qa8;
                    int m83552j6 = TU7.m83552j(bArr, i14, fu7);
                    int i19 = fu7.f9512a + m83552j6;
                    while (m83552j6 < i19) {
                        c44325l88.m27744e(TU7.m83560b(bArr, m83552j6));
                        m83552j6 += 4;
                    }
                    if (m83552j6 != i19) {
                        throw zzeo.m51315g();
                    }
                    return m83552j6;
                } else if (i5 == 5) {
                    C44325l88 c44325l882 = (C44325l88) interfaceC47544qa8;
                    c44325l882.m27744e(TU7.m83560b(bArr, i));
                    while (true) {
                        i11 = i14 + 4;
                        if (i11 < i2) {
                            i14 = TU7.m83552j(bArr, i11, fu7);
                            if (i3 == fu7.f9512a) {
                                c44325l882.m27744e(TU7.m83560b(bArr, i14));
                            }
                        }
                    }
                    return i11;
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    C42161hV7 c42161hV7 = (C42161hV7) interfaceC47544qa8;
                    int m83552j7 = TU7.m83552j(bArr, i14, fu7);
                    int i20 = fu7.f9512a + m83552j7;
                    while (m83552j7 < i20) {
                        m83552j7 = TU7.m83549m(bArr, m83552j7, fu7);
                        if (fu7.f9513b != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c42161hV7.m36323b(z3);
                    }
                    if (m83552j7 != i20) {
                        throw zzeo.m51315g();
                    }
                    return m83552j7;
                } else if (i5 == 0) {
                    C42161hV7 c42161hV72 = (C42161hV7) interfaceC47544qa8;
                    int m83549m2 = TU7.m83549m(bArr, i14, fu7);
                    if (fu7.f9513b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c42161hV72.m36323b(z);
                    while (m83549m2 < i2) {
                        int m83552j8 = TU7.m83552j(bArr, m83549m2, fu7);
                        if (i3 == fu7.f9512a) {
                            m83549m2 = TU7.m83549m(bArr, m83552j8, fu7);
                            if (fu7.f9513b != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c42161hV72.m36323b(z2);
                        } else {
                            return m83549m2;
                        }
                    }
                    return m83549m2;
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int m83552j9 = TU7.m83552j(bArr, i14, fu7);
                        int i21 = fu7.f9512a;
                        if (i21 >= 0) {
                            if (i21 == 0) {
                                interfaceC47544qa8.add("");
                                while (m83552j9 < i2) {
                                    int m83552j10 = TU7.m83552j(bArr, m83552j9, fu7);
                                    if (i3 == fu7.f9512a) {
                                        m83552j9 = TU7.m83552j(bArr, m83552j10, fu7);
                                        i21 = fu7.f9512a;
                                        if (i21 >= 0) {
                                            if (i21 == 0) {
                                                interfaceC47544qa8.add("");
                                            } else {
                                                interfaceC47544qa8.add(new String(bArr, m83552j9, i21, C32791Fa8.f9737b));
                                                m83552j9 += i21;
                                                while (m83552j9 < i2) {
                                                }
                                            }
                                        } else {
                                            throw zzeo.m51318d();
                                        }
                                    } else {
                                        return m83552j9;
                                    }
                                }
                                return m83552j9;
                            }
                            interfaceC47544qa8.add(new String(bArr, m83552j9, i21, C32791Fa8.f9737b));
                            m83552j9 += i21;
                            while (m83552j9 < i2) {
                            }
                            return m83552j9;
                        }
                        throw zzeo.m51318d();
                    }
                    int m83552j11 = TU7.m83552j(bArr, i14, fu7);
                    int i22 = fu7.f9512a;
                    if (i22 >= 0) {
                        if (i22 == 0) {
                            interfaceC47544qa8.add("");
                            while (m83552j11 < i2) {
                                int m83552j12 = TU7.m83552j(bArr, m83552j11, fu7);
                                if (i3 == fu7.f9512a) {
                                    m83552j11 = TU7.m83552j(bArr, m83552j12, fu7);
                                    int i23 = fu7.f9512a;
                                    if (i23 >= 0) {
                                        if (i23 == 0) {
                                            interfaceC47544qa8.add("");
                                        } else {
                                            i12 = m83552j11 + i23;
                                            if (C43623jx8.m29595h(bArr, m83552j11, i12)) {
                                                interfaceC47544qa8.add(new String(bArr, m83552j11, i23, C32791Fa8.f9737b));
                                                m83552j11 = i12;
                                                while (m83552j11 < i2) {
                                                }
                                            } else {
                                                throw zzeo.m51319c();
                                            }
                                        }
                                    } else {
                                        throw zzeo.m51318d();
                                    }
                                } else {
                                    return m83552j11;
                                }
                            }
                            return m83552j11;
                        }
                        i12 = m83552j11 + i22;
                        if (C43623jx8.m29595h(bArr, m83552j11, i12)) {
                            interfaceC47544qa8.add(new String(bArr, m83552j11, i22, C32791Fa8.f9737b));
                            m83552j11 = i12;
                            while (m83552j11 < i2) {
                            }
                            return m83552j11;
                        }
                        throw zzeo.m51319c();
                    }
                    throw zzeo.m51318d();
                }
                break;
            case 27:
                if (i5 == 2) {
                    return TU7.m83557e(m84957g(i6), i3, bArr, i, i2, interfaceC47544qa8, fu7);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int m83552j13 = TU7.m83552j(bArr, i14, fu7);
                    int i24 = fu7.f9512a;
                    if (i24 >= 0) {
                        if (i24 <= bArr.length - m83552j13) {
                            if (i24 == 0) {
                                interfaceC47544qa8.add(AbstractC41604gZ7.f82424c);
                                while (m83552j13 < i2) {
                                    int m83552j14 = TU7.m83552j(bArr, m83552j13, fu7);
                                    if (i3 == fu7.f9512a) {
                                        m83552j13 = TU7.m83552j(bArr, m83552j14, fu7);
                                        i24 = fu7.f9512a;
                                        if (i24 >= 0) {
                                            if (i24 <= bArr.length - m83552j13) {
                                                if (i24 == 0) {
                                                    interfaceC47544qa8.add(AbstractC41604gZ7.f82424c);
                                                } else {
                                                    interfaceC47544qa8.add(AbstractC41604gZ7.m39166C(bArr, m83552j13, i24));
                                                    m83552j13 += i24;
                                                    while (m83552j13 < i2) {
                                                    }
                                                }
                                            } else {
                                                throw zzeo.m51315g();
                                            }
                                        } else {
                                            throw zzeo.m51318d();
                                        }
                                    } else {
                                        return m83552j13;
                                    }
                                }
                                return m83552j13;
                            }
                            interfaceC47544qa8.add(AbstractC41604gZ7.m39166C(bArr, m83552j13, i24));
                            m83552j13 += i24;
                            while (m83552j13 < i2) {
                            }
                            return m83552j13;
                        }
                        throw zzeo.m51315g();
                    }
                    throw zzeo.m51318d();
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    m83550l = TU7.m83556f(bArr, i14, interfaceC47544qa8, fu7);
                } else if (i5 == 0) {
                    m83550l = TU7.m83550l(i3, bArr, i, i2, interfaceC47544qa8, fu7);
                }
                InterfaceC40777f98 m84958f = m84958f(i6);
                AbstractC32953Fs8 abstractC32953Fs8 = this.f34176l;
                Class cls = C39393cp8.f75682a;
                if (m84958f != null) {
                    Object obj2 = null;
                    if (interfaceC47544qa8 instanceof RandomAccess) {
                        int size2 = interfaceC47544qa8.size();
                        int i25 = 0;
                        for (int i26 = 0; i26 < size2; i26++) {
                            int intValue = ((Integer) interfaceC47544qa8.get(i26)).intValue();
                            if (m84958f.zza(intValue)) {
                                if (i26 != i25) {
                                    interfaceC47544qa8.set(i25, Integer.valueOf(intValue));
                                }
                                i25++;
                            } else {
                                obj2 = C39393cp8.m45026b(obj, i4, intValue, obj2, abstractC32953Fs8);
                            }
                        }
                        if (i25 != size2) {
                            interfaceC47544qa8.subList(i25, size2).clear();
                            return m83550l;
                        }
                    } else {
                        Iterator it = interfaceC47544qa8.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!m84958f.zza(intValue2)) {
                                obj2 = C39393cp8.m45026b(obj, i4, intValue2, obj2, abstractC32953Fs8);
                                it.remove();
                            }
                        }
                    }
                }
                return m83550l;
            case 33:
            case 47:
                if (i5 == 2) {
                    C44325l88 c44325l883 = (C44325l88) interfaceC47544qa8;
                    int m83552j15 = TU7.m83552j(bArr, i14, fu7);
                    int i27 = fu7.f9512a + m83552j15;
                    while (m83552j15 < i27) {
                        m83552j15 = TU7.m83552j(bArr, m83552j15, fu7);
                        c44325l883.m27744e(C44245l08.m28023a(fu7.f9512a));
                    }
                    if (m83552j15 != i27) {
                        throw zzeo.m51315g();
                    }
                    return m83552j15;
                } else if (i5 == 0) {
                    C44325l88 c44325l884 = (C44325l88) interfaceC47544qa8;
                    int m83552j16 = TU7.m83552j(bArr, i14, fu7);
                    c44325l884.m27744e(C44245l08.m28023a(fu7.f9512a));
                    while (m83552j16 < i2) {
                        int m83552j17 = TU7.m83552j(bArr, m83552j16, fu7);
                        if (i3 == fu7.f9512a) {
                            m83552j16 = TU7.m83552j(bArr, m83552j17, fu7);
                            c44325l884.m27744e(C44245l08.m28023a(fu7.f9512a));
                        } else {
                            return m83552j16;
                        }
                    }
                    return m83552j16;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    C37516Zf8 c37516Zf85 = (C37516Zf8) interfaceC47544qa8;
                    int m83552j18 = TU7.m83552j(bArr, i14, fu7);
                    int i28 = fu7.f9512a + m83552j18;
                    while (m83552j18 < i28) {
                        m83552j18 = TU7.m83549m(bArr, m83552j18, fu7);
                        c37516Zf85.m72783c(C44245l08.m28022b(fu7.f9513b));
                    }
                    if (m83552j18 != i28) {
                        throw zzeo.m51315g();
                    }
                    return m83552j18;
                } else if (i5 == 0) {
                    C37516Zf8 c37516Zf86 = (C37516Zf8) interfaceC47544qa8;
                    int m83549m3 = TU7.m83549m(bArr, i14, fu7);
                    c37516Zf86.m72783c(C44245l08.m28022b(fu7.f9513b));
                    while (m83549m3 < i2) {
                        int m83552j19 = TU7.m83552j(bArr, m83549m3, fu7);
                        if (i3 == fu7.f9512a) {
                            m83549m3 = TU7.m83549m(bArr, m83552j19, fu7);
                            c37516Zf86.m72783c(C44245l08.m28022b(fu7.f9513b));
                        } else {
                            return m83549m3;
                        }
                    }
                    return m83549m3;
                }
                break;
            default:
                if (i5 == 3) {
                    InterfaceC32449Do8 m84957g = m84957g(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int m83559c = TU7.m83559c(m84957g, bArr, i, i2, i29, fu7);
                    interfaceC47544qa8.add(fu7.f9514c);
                    while (m83559c < i2) {
                        int m83552j20 = TU7.m83552j(bArr, m83559c, fu7);
                        if (i3 == fu7.f9512a) {
                            m83559c = TU7.m83559c(m84957g, bArr, m83552j20, i2, i29, fu7);
                            interfaceC47544qa8.add(fu7.f9514c);
                        } else {
                            return m83559c;
                        }
                    }
                    return m83559c;
                }
                break;
        }
        return i14;
    }

    /* renamed from: L */
    public final int m84965L(int i) {
        if (i < this.f34167c || i > this.f34168d) {
            return -1;
        }
        return m84962O(i, 0);
    }

    /* renamed from: M */
    public final int m84964M(int i, int i2) {
        if (i < this.f34167c || i > this.f34168d) {
            return -1;
        }
        return m84962O(i, i2);
    }

    /* renamed from: N */
    public final int m84963N(int i) {
        return this.f34165a[i + 2];
    }

    /* renamed from: O */
    public final int m84962O(int i, int i2) {
        int length = (this.f34165a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f34165a[i4];
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

    /* renamed from: Q */
    public final int m84960Q(int i) {
        return this.f34165a[i + 1];
    }

    @Override // p000.InterfaceC32449Do8
    /* renamed from: a */
    public final void mo40919a(Object obj, Object obj2) {
        m84952l(obj);
        obj2.getClass();
        for (int i = 0; i < this.f34165a.length; i += 3) {
            int m84960Q = m84960Q(i);
            int i2 = this.f34165a[i];
            long j = 1048575 & m84960Q;
            switch (m84961P(m84960Q)) {
                case 0:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76059t(obj, j, C37192Xv8.m76073f(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76058u(obj, j, C37192Xv8.m76072g(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76056w(obj, j, C37192Xv8.m76070i(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76056w(obj, j, C37192Xv8.m76070i(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76057v(obj, j, C37192Xv8.m76071h(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76056w(obj, j, C37192Xv8.m76070i(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76057v(obj, j, C37192Xv8.m76071h(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76061r(obj, j, C37192Xv8.m76082B(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76055x(obj, j, C37192Xv8.m76068k(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m84951m(obj, obj2, i);
                    break;
                case 10:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76055x(obj, j, C37192Xv8.m76068k(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76057v(obj, j, C37192Xv8.m76071h(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76057v(obj, j, C37192Xv8.m76071h(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76057v(obj, j, C37192Xv8.m76071h(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76056w(obj, j, C37192Xv8.m76070i(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76057v(obj, j, C37192Xv8.m76071h(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m84943u(obj2, i)) {
                        C37192Xv8.m76056w(obj, j, C37192Xv8.m76070i(obj2, j));
                        m84949o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m84951m(obj, obj2, i);
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
                    this.f34175k.mo37919b(obj, obj2, j);
                    break;
                case 50:
                    Class cls = C39393cp8.f75682a;
                    C37192Xv8.m76055x(obj, j, C34492Mh8.m95031b(C37192Xv8.m76068k(obj, j), C37192Xv8.m76068k(obj2, j)));
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
                    if (m84939y(obj2, i2, i)) {
                        C37192Xv8.m76055x(obj, j, C37192Xv8.m76068k(obj2, j));
                        m84948p(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m84950n(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m84939y(obj2, i2, i)) {
                        C37192Xv8.m76055x(obj, j, C37192Xv8.m76068k(obj2, j));
                        m84948p(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m84950n(obj, obj2, i);
                    break;
            }
        }
        C39393cp8.m45024d(this.f34176l, obj, obj2);
        if (this.f34170f) {
            C39393cp8.m45025c(this.f34177m, obj, obj2);
        }
    }

    @Override // p000.InterfaceC32449Do8
    /* renamed from: b */
    public final boolean mo40918b(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.f34173i) {
            int i6 = this.f34172h[i4];
            int i7 = this.f34165a[i6];
            int m84960Q = m84960Q(i6);
            int i8 = this.f34165a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = f34164q.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & m84960Q) != 0 && !m84942v(obj, i6, i, i2, i10)) {
                return false;
            }
            int m84961P = m84961P(m84960Q);
            if (m84961P != 9 && m84961P != 17) {
                if (m84961P != 27) {
                    if (m84961P != 60 && m84961P != 68) {
                        if (m84961P != 49) {
                            if (m84961P == 50 && !((C51763xh8) C37192Xv8.m76068k(obj, m84960Q & 1048575)).isEmpty()) {
                                C43463jh8 c43463jh8 = (C43463jh8) m84956h(i6);
                                throw null;
                            }
                        }
                    } else if (m84939y(obj, i7, i6) && !m84941w(obj, m84960Q, m84957g(i6))) {
                        return false;
                    }
                }
                List list = (List) C37192Xv8.m76068k(obj, m84960Q & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC32449Do8 m84957g = m84957g(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m84957g.mo40918b(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m84942v(obj, i6, i, i2, i10) && !m84941w(obj, m84960Q, m84957g(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        if (this.f34170f && !this.f34177m.mo24513b(obj).m44631k()) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC32449Do8
    /* renamed from: c */
    public final boolean mo40917c(Object obj, Object obj2) {
        boolean m45004x;
        int length = this.f34165a.length;
        for (int i = 0; i < length; i += 3) {
            int m84960Q = m84960Q(i);
            long j = m84960Q & 1048575;
            switch (m84961P(m84960Q)) {
                case 0:
                    if (m84944t(obj, obj2, i) && Double.doubleToLongBits(C37192Xv8.m76073f(obj, j)) == Double.doubleToLongBits(C37192Xv8.m76073f(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m84944t(obj, obj2, i) && Float.floatToIntBits(C37192Xv8.m76072g(obj, j)) == Float.floatToIntBits(C37192Xv8.m76072g(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m84944t(obj, obj2, i) && C37192Xv8.m76070i(obj, j) == C37192Xv8.m76070i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m84944t(obj, obj2, i) && C37192Xv8.m76070i(obj, j) == C37192Xv8.m76070i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m84944t(obj, obj2, i) && C37192Xv8.m76071h(obj, j) == C37192Xv8.m76071h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m84944t(obj, obj2, i) && C37192Xv8.m76070i(obj, j) == C37192Xv8.m76070i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m84944t(obj, obj2, i) && C37192Xv8.m76071h(obj, j) == C37192Xv8.m76071h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m84944t(obj, obj2, i) && C37192Xv8.m76082B(obj, j) == C37192Xv8.m76082B(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m84944t(obj, obj2, i) && C39393cp8.m45004x(C37192Xv8.m76068k(obj, j), C37192Xv8.m76068k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m84944t(obj, obj2, i) && C39393cp8.m45004x(C37192Xv8.m76068k(obj, j), C37192Xv8.m76068k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m84944t(obj, obj2, i) && C39393cp8.m45004x(C37192Xv8.m76068k(obj, j), C37192Xv8.m76068k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m84944t(obj, obj2, i) && C37192Xv8.m76071h(obj, j) == C37192Xv8.m76071h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m84944t(obj, obj2, i) && C37192Xv8.m76071h(obj, j) == C37192Xv8.m76071h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m84944t(obj, obj2, i) && C37192Xv8.m76071h(obj, j) == C37192Xv8.m76071h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m84944t(obj, obj2, i) && C37192Xv8.m76070i(obj, j) == C37192Xv8.m76070i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m84944t(obj, obj2, i) && C37192Xv8.m76071h(obj, j) == C37192Xv8.m76071h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m84944t(obj, obj2, i) && C37192Xv8.m76070i(obj, j) == C37192Xv8.m76070i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m84944t(obj, obj2, i) && C39393cp8.m45004x(C37192Xv8.m76068k(obj, j), C37192Xv8.m76068k(obj2, j))) {
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
                    m45004x = C39393cp8.m45004x(C37192Xv8.m76068k(obj, j), C37192Xv8.m76068k(obj2, j));
                    break;
                case 50:
                    m45004x = C39393cp8.m45004x(C37192Xv8.m76068k(obj, j), C37192Xv8.m76068k(obj2, j));
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
                    long m84963N = m84963N(i) & 1048575;
                    if (C37192Xv8.m76071h(obj, m84963N) == C37192Xv8.m76071h(obj2, m84963N) && C39393cp8.m45004x(C37192Xv8.m76068k(obj, j), C37192Xv8.m76068k(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!m45004x) {
                return false;
            }
        }
        if (!this.f34176l.mo82290d(obj).equals(this.f34176l.mo82290d(obj2))) {
            return false;
        }
        if (this.f34170f) {
            return this.f34177m.mo24513b(obj).equals(this.f34177m.mo24513b(obj2));
        }
        return true;
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
    @Override // p000.InterfaceC32449Do8
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo40916d(Object obj, byte[] bArr, int i, int i2, FU7 fu7) throws IOException {
        byte b;
        int i3;
        int m84965L;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        Unsafe unsafe2;
        int i8;
        Unsafe unsafe3;
        C35914Sj8<T> c35914Sj8;
        int i9;
        Unsafe unsafe4;
        int i10;
        int i11;
        int i12;
        C35914Sj8<T> c35914Sj82 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i13 = i2;
        FU7 fu72 = fu7;
        if (!c35914Sj82.f34171g) {
            m84975B(obj, bArr, i, i2, 0, fu7);
            return;
        }
        m84952l(obj);
        Unsafe unsafe5 = f34164q;
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
                i3 = TU7.m83551k(b2, bArr2, i21, fu72);
                b = fu72.f9512a;
            } else {
                b = b2;
                i3 = i21;
            }
            int i22 = b >>> 3;
            if (i22 > i18) {
                m84965L = c35914Sj82.m84964M(i22, i19 / 3);
            } else {
                m84965L = c35914Sj82.m84965L(i22);
            }
            int i23 = m84965L;
            if (i23 == i14) {
                i4 = i3;
                i5 = i22;
                unsafe = unsafe5;
                i6 = i14;
                i7 = 0;
            } else {
                int i24 = b & 7;
                int[] iArr = c35914Sj82.f34165a;
                int i25 = iArr[i23 + 1];
                int m84961P = m84961P(i25);
                Unsafe unsafe6 = unsafe5;
                long j = i25 & i15;
                if (m84961P <= 17) {
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
                    switch (m84961P) {
                        case 0:
                            c35914Sj8 = this;
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
                                C37192Xv8.m76059t(obj2, j, Double.longBitsToDouble(TU7.m83545q(bArr2, i3)));
                                i16 = i3 + 8;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c35914Sj82 = c35914Sj8;
                                i13 = i2;
                                break;
                            }
                        case 1:
                            c35914Sj8 = this;
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
                                C37192Xv8.m76058u(obj2, j, Float.intBitsToFloat(TU7.m83560b(bArr2, i3)));
                                i16 = i3 + 4;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c35914Sj82 = c35914Sj8;
                                i13 = i2;
                                break;
                            }
                        case 2:
                        case 3:
                            c35914Sj8 = this;
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
                                int m83549m = TU7.m83549m(bArr2, i3, fu72);
                                unsafe3.putLong(obj, j, fu72.f9513b);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i16 = m83549m;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c35914Sj82 = c35914Sj8;
                                i13 = i2;
                                break;
                            }
                        case 4:
                        case 11:
                            c35914Sj8 = this;
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
                                i16 = TU7.m83552j(bArr2, i3, fu72);
                                unsafe3.putInt(obj2, j, fu72.f9512a);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c35914Sj82 = c35914Sj8;
                                i13 = i2;
                                break;
                            }
                        case 5:
                        case 14:
                            c35914Sj8 = this;
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
                                unsafe3.putLong(obj, j, TU7.m83545q(bArr2, i3));
                                i16 = i3 + 8;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c35914Sj82 = c35914Sj8;
                                i13 = i2;
                                break;
                            }
                        case 6:
                        case 13:
                            c35914Sj8 = this;
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
                                unsafe3.putInt(obj2, j, TU7.m83560b(bArr2, i3));
                                i16 = i3 + 4;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c35914Sj82 = c35914Sj8;
                                i13 = i2;
                                break;
                            }
                        case 7:
                            c35914Sj8 = this;
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
                                i16 = TU7.m83549m(bArr2, i3, fu72);
                                C37192Xv8.m76061r(obj2, j, fu72.f9513b != 0);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c35914Sj82 = c35914Sj8;
                                i13 = i2;
                                break;
                            }
                        case 8:
                            c35914Sj8 = this;
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
                                    i16 = TU7.m83555g(bArr2, i3, fu72);
                                } else {
                                    i16 = TU7.m83554h(bArr2, i3, fu72);
                                }
                                unsafe3.putObject(obj2, j, fu72.f9514c);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c35914Sj82 = c35914Sj8;
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
                                c35914Sj8 = this;
                                i9 = 1048575;
                                Object m84955i = c35914Sj8.m84955i(obj2, i7);
                                i16 = TU7.m83547o(m84955i, c35914Sj8.m84957g(i7), bArr, i3, i2, fu7);
                                c35914Sj8.m84947q(obj2, i7, m84955i);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                c35914Sj82 = c35914Sj8;
                                i13 = i2;
                                break;
                            }
                        case 10:
                            i5 = i22;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 == 2) {
                                i16 = TU7.m83561a(bArr2, i3, fu72);
                                unsafe3.putObject(obj2, j, fu72.f9514c);
                                i20 |= i27;
                                i13 = i2;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i17 = i8;
                                i18 = i5;
                                i15 = 1048575;
                                i14 = -1;
                                c35914Sj82 = this;
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
                                i16 = TU7.m83552j(bArr2, i3, fu72);
                                unsafe3.putInt(obj2, j, fu72.f9512a);
                                i20 |= i27;
                                i13 = i2;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i17 = i8;
                                i18 = i5;
                                i15 = 1048575;
                                i14 = -1;
                                c35914Sj82 = this;
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
                                i16 = TU7.m83552j(bArr2, i3, fu72);
                                unsafe3.putInt(obj2, j, C44245l08.m28023a(fu72.f9512a));
                                i20 |= i27;
                                i13 = i2;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i17 = i8;
                                i18 = i5;
                                i15 = 1048575;
                                i14 = -1;
                                c35914Sj82 = this;
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
                                int m83549m2 = TU7.m83549m(bArr2, i3, fu72);
                                unsafe2.putLong(obj, j, C44245l08.m28022b(fu72.f9513b));
                                i20 |= i27;
                                unsafe5 = unsafe2;
                                i16 = m83549m2;
                                i19 = i23;
                                i17 = i17;
                                i18 = i22;
                                i15 = 1048575;
                                i14 = -1;
                                c35914Sj82 = this;
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
                    C35914Sj8<T> c35914Sj83 = c35914Sj82;
                    i7 = i23;
                    if (m84961P != 27) {
                        if (m84961P <= 49) {
                            int i30 = i3;
                            i11 = i20;
                            i12 = i29;
                            unsafe = unsafe6;
                            i6 = -1;
                            i16 = m84966K(obj, bArr, i3, i2, b, i5, i24, i7, i25, m84961P, j, fu7);
                        } else {
                            i10 = i3;
                            i11 = i20;
                            unsafe = unsafe6;
                            i12 = i29;
                            i6 = -1;
                            if (m84961P != 50) {
                                i16 = m84967J(obj, bArr, i10, i2, b, i5, i24, i25, m84961P, j, i7, fu7);
                            } else if (i24 == 2) {
                                i16 = m84968I(obj, bArr, i10, i2, i7, j, fu7);
                            }
                        }
                        c35914Sj82 = this;
                    } else if (i24 == 2) {
                        InterfaceC47544qa8 interfaceC47544qa8 = (InterfaceC47544qa8) unsafe6.getObject(obj2, j);
                        if (!interfaceC47544qa8.zzc()) {
                            int size = interfaceC47544qa8.size();
                            interfaceC47544qa8 = interfaceC47544qa8.mo17376d(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj2, j, interfaceC47544qa8);
                        }
                        i16 = TU7.m83557e(c35914Sj83.m84957g(i7), b, bArr, i3, i2, interfaceC47544qa8, fu7);
                        i13 = i2;
                        unsafe5 = unsafe6;
                        i20 = i20;
                        i19 = i7;
                        i15 = 1048575;
                        i17 = i29;
                        i18 = i5;
                        c35914Sj82 = c35914Sj83;
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
                c35914Sj82 = this;
            }
            i16 = TU7.m83553i(b, bArr, i4, i2, m84974C(obj), fu7);
            obj2 = obj;
            bArr2 = bArr;
            i13 = i2;
            fu72 = fu7;
            i19 = i7;
            i14 = i6;
            i18 = i5;
            unsafe5 = unsafe;
            i15 = 1048575;
            c35914Sj82 = this;
        }
        int i31 = i20;
        Unsafe unsafe7 = unsafe5;
        if (i17 != i15) {
            unsafe7.putInt(obj, i17, i31);
        }
        if (i16 != i2) {
            throw zzeo.m51317e();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x09e5  */
    @Override // p000.InterfaceC32449Do8
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo40915e(Object obj, InterfaceC36040Sx8 interfaceC36040Sx8) throws IOException {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Iterator it2;
        Map.Entry entry2;
        int length2;
        int i3;
        if (this.f34171g) {
            if (this.f34170f) {
                C39542d48 mo24513b = this.f34177m.mo24513b(obj);
                if (!mo24513b.f76101a.isEmpty()) {
                    it2 = mo24513b.m44636f();
                    entry2 = (Map.Entry) it2.next();
                    length2 = this.f34165a.length;
                    for (i3 = 0; i3 < length2; i3 += 3) {
                        int m84960Q = m84960Q(i3);
                        int i4 = this.f34165a[i3];
                        while (entry2 != null && this.f34177m.mo24514a(entry2) <= i4) {
                            this.f34177m.mo24509f(interfaceC36040Sx8, entry2);
                            entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                        }
                        switch (m84961P(m84960Q)) {
                            case 0:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84552g(i4, C37192Xv8.m76073f(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84549j(i4, C37192Xv8.m76072g(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84546m(i4, C37192Xv8.m76070i(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84567B(i4, C37192Xv8.m76070i(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84544o(i4, C37192Xv8.m76071h(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84548k(i4, C37192Xv8.m76070i(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84551h(i4, C37192Xv8.m76071h(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84553f(i4, C37192Xv8.m76082B(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (m84943u(obj, i3)) {
                                    m84976A(i4, C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84562G(i4, C37192Xv8.m76068k(obj, m84960Q & 1048575), m84957g(i3));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84559J(i4, (AbstractC41604gZ7) C37192Xv8.m76068k(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84536w(i4, C37192Xv8.m76071h(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84550i(i4, C37192Xv8.m76071h(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84565D(i4, C37192Xv8.m76071h(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84563F(i4, C37192Xv8.m76070i(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84538u(i4, C37192Xv8.m76071h(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84539t(i4, C37192Xv8.m76070i(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (m84943u(obj, i3)) {
                                    interfaceC36040Sx8.mo84561H(i4, C37192Xv8.m76068k(obj, m84960Q & 1048575), m84957g(i3));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                C39393cp8.m45020h(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, false);
                                break;
                            case 19:
                                C39393cp8.m45016l(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, false);
                                break;
                            case 20:
                                C39393cp8.m45013o(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, false);
                                break;
                            case 21:
                                C39393cp8.m45005w(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, false);
                                break;
                            case 22:
                                C39393cp8.m45014n(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, false);
                                break;
                            case 23:
                                C39393cp8.m45017k(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, false);
                                break;
                            case 24:
                                C39393cp8.m45018j(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, false);
                                break;
                            case 25:
                                C39393cp8.m45022f(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, false);
                                break;
                            case 26:
                                C39393cp8.m45007u(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8);
                                break;
                            case 27:
                                C39393cp8.m45012p(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, m84957g(i3));
                                break;
                            case 28:
                                C39393cp8.m45021g(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8);
                                break;
                            case 29:
                                C39393cp8.m45006v(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, false);
                                break;
                            case 30:
                                C39393cp8.m45019i(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, false);
                                break;
                            case 31:
                                C39393cp8.m45011q(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, false);
                                break;
                            case 32:
                                C39393cp8.m45010r(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, false);
                                break;
                            case 33:
                                C39393cp8.m45009s(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, false);
                                break;
                            case 34:
                                C39393cp8.m45008t(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, false);
                                break;
                            case 35:
                                C39393cp8.m45020h(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, true);
                                break;
                            case 36:
                                C39393cp8.m45016l(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, true);
                                break;
                            case 37:
                                C39393cp8.m45013o(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, true);
                                break;
                            case 38:
                                C39393cp8.m45005w(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, true);
                                break;
                            case 39:
                                C39393cp8.m45014n(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, true);
                                break;
                            case 40:
                                C39393cp8.m45017k(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, true);
                                break;
                            case 41:
                                C39393cp8.m45018j(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, true);
                                break;
                            case 42:
                                C39393cp8.m45022f(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, true);
                                break;
                            case 43:
                                C39393cp8.m45006v(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, true);
                                break;
                            case 44:
                                C39393cp8.m45019i(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, true);
                                break;
                            case 45:
                                C39393cp8.m45011q(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, true);
                                break;
                            case 46:
                                C39393cp8.m45010r(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, true);
                                break;
                            case 47:
                                C39393cp8.m45009s(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, true);
                                break;
                            case 48:
                                C39393cp8.m45008t(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, true);
                                break;
                            case 49:
                                C39393cp8.m45015m(this.f34165a[i3], (List) C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8, m84957g(i3));
                                break;
                            case 50:
                                m84945s(interfaceC36040Sx8, i4, C37192Xv8.m76068k(obj, m84960Q & 1048575), i3);
                                break;
                            case 51:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84552g(i4, m84972E(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84549j(i4, m84971F(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84546m(i4, m84959R(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84567B(i4, m84959R(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84544o(i4, m84969H(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84548k(i4, m84959R(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84551h(i4, m84969H(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84553f(i4, m84938z(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (m84939y(obj, i4, i3)) {
                                    m84976A(i4, C37192Xv8.m76068k(obj, m84960Q & 1048575), interfaceC36040Sx8);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84562G(i4, C37192Xv8.m76068k(obj, m84960Q & 1048575), m84957g(i3));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84559J(i4, (AbstractC41604gZ7) C37192Xv8.m76068k(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84536w(i4, m84969H(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84550i(i4, m84969H(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84565D(i4, m84969H(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84563F(i4, m84959R(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84538u(i4, m84969H(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84539t(i4, m84959R(obj, m84960Q & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (m84939y(obj, i4, i3)) {
                                    interfaceC36040Sx8.mo84561H(i4, C37192Xv8.m76068k(obj, m84960Q & 1048575), m84957g(i3));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry2 != null) {
                        this.f34177m.mo24509f(interfaceC36040Sx8, entry2);
                        entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                    }
                    AbstractC32953Fs8 abstractC32953Fs8 = this.f34176l;
                    abstractC32953Fs8.mo82284j(abstractC32953Fs8.mo82290d(obj), interfaceC36040Sx8);
                    return;
                }
            }
            it2 = null;
            entry2 = null;
            length2 = this.f34165a.length;
            while (i3 < length2) {
            }
            while (entry2 != null) {
            }
            AbstractC32953Fs8 abstractC32953Fs82 = this.f34176l;
            abstractC32953Fs82.mo82284j(abstractC32953Fs82.mo82290d(obj), interfaceC36040Sx8);
            return;
        }
        if (this.f34170f) {
            C39542d48 mo24513b2 = this.f34177m.mo24513b(obj);
            if (!mo24513b2.f76101a.isEmpty()) {
                it = mo24513b2.m44636f();
                entry = (Map.Entry) it.next();
                length = this.f34165a.length;
                Unsafe unsafe = f34164q;
                int i5 = 0;
                int i6 = 1048575;
                for (i = 0; i < length; i += 3) {
                    int m84960Q2 = m84960Q(i);
                    int[] iArr = this.f34165a;
                    int i7 = iArr[i];
                    int m84961P = m84961P(m84960Q2);
                    if (m84961P <= 17) {
                        int i8 = iArr[i + 2];
                        int i9 = i8 & 1048575;
                        if (i9 != i6) {
                            i5 = unsafe.getInt(obj, i9);
                            i6 = i9;
                        }
                        i2 = 1 << (i8 >>> 20);
                    } else {
                        i2 = 0;
                    }
                    while (entry != null && this.f34177m.mo24514a(entry) <= i7) {
                        this.f34177m.mo24509f(interfaceC36040Sx8, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = m84960Q2 & 1048575;
                    switch (m84961P) {
                        case 0:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84552g(i7, C37192Xv8.m76073f(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84549j(i7, C37192Xv8.m76072g(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84546m(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84567B(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84544o(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84548k(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84551h(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84553f(i7, C37192Xv8.m76082B(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                m84976A(i7, unsafe.getObject(obj, j), interfaceC36040Sx8);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84562G(i7, unsafe.getObject(obj, j), m84957g(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84559J(i7, (AbstractC41604gZ7) unsafe.getObject(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84536w(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84550i(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84565D(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84563F(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84538u(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84539t(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            z = true;
                            z2 = false;
                            if ((i2 & i5) != 0) {
                                interfaceC36040Sx8.mo84561H(i7, unsafe.getObject(obj, j), m84957g(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            z3 = false;
                            z = true;
                            C39393cp8.m45020h(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, false);
                            z2 = z3;
                            break;
                        case 19:
                            z3 = false;
                            z = true;
                            C39393cp8.m45016l(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, false);
                            z2 = z3;
                            break;
                        case 20:
                            z3 = false;
                            z = true;
                            C39393cp8.m45013o(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, false);
                            z2 = z3;
                            break;
                        case 21:
                            z3 = false;
                            z = true;
                            C39393cp8.m45005w(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, false);
                            z2 = z3;
                            break;
                        case 22:
                            z3 = false;
                            z = true;
                            C39393cp8.m45014n(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, false);
                            z2 = z3;
                            break;
                        case 23:
                            z3 = false;
                            z = true;
                            C39393cp8.m45017k(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, false);
                            z2 = z3;
                            break;
                        case 24:
                            z3 = false;
                            z = true;
                            C39393cp8.m45018j(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, false);
                            z2 = z3;
                            break;
                        case 25:
                            z = true;
                            z4 = false;
                            C39393cp8.m45022f(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, false);
                            z2 = z4;
                            break;
                        case 26:
                            z = true;
                            C39393cp8.m45007u(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8);
                            z2 = false;
                            break;
                        case 27:
                            z = true;
                            C39393cp8.m45012p(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, m84957g(i));
                            z2 = false;
                            break;
                        case 28:
                            z = true;
                            C39393cp8.m45021g(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8);
                            z2 = false;
                            break;
                        case 29:
                            z3 = false;
                            z = true;
                            C39393cp8.m45006v(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, false);
                            z2 = z3;
                            break;
                        case 30:
                            z3 = false;
                            z = true;
                            C39393cp8.m45019i(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, false);
                            z2 = z3;
                            break;
                        case 31:
                            z3 = false;
                            z = true;
                            C39393cp8.m45011q(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, false);
                            z2 = z3;
                            break;
                        case 32:
                            z3 = false;
                            z = true;
                            C39393cp8.m45010r(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, false);
                            z2 = z3;
                            break;
                        case 33:
                            z3 = false;
                            z = true;
                            C39393cp8.m45009s(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, false);
                            z2 = z3;
                            break;
                        case 34:
                            z = true;
                            z4 = false;
                            C39393cp8.m45008t(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, false);
                            z2 = z4;
                            break;
                        case 35:
                            z = true;
                            C39393cp8.m45020h(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, true);
                            z2 = false;
                            break;
                        case 36:
                            z = true;
                            C39393cp8.m45016l(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, true);
                            z2 = false;
                            break;
                        case 37:
                            z = true;
                            C39393cp8.m45013o(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, true);
                            z2 = false;
                            break;
                        case 38:
                            z = true;
                            C39393cp8.m45005w(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, true);
                            z2 = false;
                            break;
                        case 39:
                            z = true;
                            C39393cp8.m45014n(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, true);
                            z2 = false;
                            break;
                        case 40:
                            z = true;
                            C39393cp8.m45017k(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, true);
                            z2 = false;
                            break;
                        case 41:
                            z = true;
                            C39393cp8.m45018j(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, true);
                            z2 = false;
                            break;
                        case 42:
                            z = true;
                            C39393cp8.m45022f(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, true);
                            z2 = false;
                            break;
                        case 43:
                            z = true;
                            C39393cp8.m45006v(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, true);
                            z2 = false;
                            break;
                        case 44:
                            z = true;
                            C39393cp8.m45019i(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, true);
                            z2 = false;
                            break;
                        case 45:
                            z = true;
                            C39393cp8.m45011q(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, true);
                            z2 = false;
                            break;
                        case 46:
                            z = true;
                            C39393cp8.m45010r(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, true);
                            z2 = false;
                            break;
                        case 47:
                            z = true;
                            C39393cp8.m45009s(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, true);
                            z2 = false;
                            break;
                        case 48:
                            z = true;
                            C39393cp8.m45008t(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, true);
                            z2 = false;
                            break;
                        case 49:
                            C39393cp8.m45015m(this.f34165a[i], (List) unsafe.getObject(obj, j), interfaceC36040Sx8, m84957g(i));
                            z = true;
                            z2 = false;
                            break;
                        case 50:
                            m84945s(interfaceC36040Sx8, i7, unsafe.getObject(obj, j), i);
                            z = true;
                            z2 = false;
                            break;
                        case 51:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84552g(i7, m84972E(obj, j));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 52:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84549j(i7, m84971F(obj, j));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 53:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84546m(i7, m84959R(obj, j));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 54:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84567B(i7, m84959R(obj, j));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 55:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84544o(i7, m84969H(obj, j));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 56:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84548k(i7, m84959R(obj, j));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 57:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84551h(i7, m84969H(obj, j));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 58:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84553f(i7, m84938z(obj, j));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 59:
                            if (m84939y(obj, i7, i)) {
                                m84976A(i7, unsafe.getObject(obj, j), interfaceC36040Sx8);
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 60:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84562G(i7, unsafe.getObject(obj, j), m84957g(i));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 61:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84559J(i7, (AbstractC41604gZ7) unsafe.getObject(obj, j));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 62:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84536w(i7, m84969H(obj, j));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 63:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84550i(i7, m84969H(obj, j));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 64:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84565D(i7, m84969H(obj, j));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 65:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84563F(i7, m84959R(obj, j));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 66:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84538u(i7, m84969H(obj, j));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 67:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84539t(i7, m84959R(obj, j));
                            }
                            z = true;
                            z2 = false;
                            break;
                        case 68:
                            if (m84939y(obj, i7, i)) {
                                interfaceC36040Sx8.mo84561H(i7, unsafe.getObject(obj, j), m84957g(i));
                            }
                            z = true;
                            z2 = false;
                            break;
                        default:
                            z = true;
                            z2 = false;
                            break;
                    }
                }
                while (entry != null) {
                    this.f34177m.mo24509f(interfaceC36040Sx8, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                AbstractC32953Fs8 abstractC32953Fs83 = this.f34176l;
                abstractC32953Fs83.mo82284j(abstractC32953Fs83.mo82290d(obj), interfaceC36040Sx8);
            }
        }
        it = null;
        entry = null;
        length = this.f34165a.length;
        Unsafe unsafe2 = f34164q;
        int i52 = 0;
        int i62 = 1048575;
        while (i < length) {
        }
        while (entry != null) {
        }
        AbstractC32953Fs8 abstractC32953Fs832 = this.f34176l;
        abstractC32953Fs832.mo82284j(abstractC32953Fs832.mo82290d(obj), interfaceC36040Sx8);
    }

    /* renamed from: f */
    public final InterfaceC40777f98 m84958f(int i) {
        int i2 = i / 3;
        return (InterfaceC40777f98) this.f34166b[i2 + i2 + 1];
    }

    /* renamed from: g */
    public final InterfaceC32449Do8 m84957g(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        InterfaceC32449Do8 interfaceC32449Do8 = (InterfaceC32449Do8) this.f34166b[i3];
        if (interfaceC32449Do8 != null) {
            return interfaceC32449Do8;
        }
        InterfaceC32449Do8 m15450b = C48247rl8.m15451a().m15450b((Class) this.f34166b[i3 + 1]);
        this.f34166b[i3] = m15450b;
        return m15450b;
    }

    /* renamed from: h */
    public final Object m84956h(int i) {
        int i2 = i / 3;
        return this.f34166b[i2 + i2];
    }

    /* renamed from: i */
    public final Object m84955i(Object obj, int i) {
        InterfaceC32449Do8 m84957g = m84957g(i);
        int m84960Q = m84960Q(i) & 1048575;
        if (!m84943u(obj, i)) {
            return m84957g.zze();
        }
        Object object = f34164q.getObject(obj, m84960Q);
        if (m84940x(object)) {
            return object;
        }
        Object zze = m84957g.zze();
        if (object != null) {
            m84957g.mo40919a(zze, object);
        }
        return zze;
    }

    /* renamed from: j */
    public final Object m84954j(Object obj, int i, int i2) {
        InterfaceC32449Do8 m84957g = m84957g(i2);
        if (!m84939y(obj, i, i2)) {
            return m84957g.zze();
        }
        Object object = f34164q.getObject(obj, m84960Q(i2) & 1048575);
        if (m84940x(object)) {
            return object;
        }
        Object zze = m84957g.zze();
        if (object != null) {
            m84957g.mo40919a(zze, object);
        }
        return zze;
    }

    /* renamed from: m */
    public final void m84951m(Object obj, Object obj2, int i) {
        if (!m84943u(obj2, i)) {
            return;
        }
        Unsafe unsafe = f34164q;
        long m84960Q = m84960Q(i) & 1048575;
        Object object = unsafe.getObject(obj2, m84960Q);
        if (object != null) {
            InterfaceC32449Do8 m84957g = m84957g(i);
            if (!m84943u(obj, i)) {
                if (!m84940x(object)) {
                    unsafe.putObject(obj, m84960Q, object);
                } else {
                    Object zze = m84957g.zze();
                    m84957g.mo40919a(zze, object);
                    unsafe.putObject(obj, m84960Q, zze);
                }
                m84949o(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, m84960Q);
            if (!m84940x(object2)) {
                Object zze2 = m84957g.zze();
                m84957g.mo40919a(zze2, object2);
                unsafe.putObject(obj, m84960Q, zze2);
                object2 = zze2;
            }
            m84957g.mo40919a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f34165a[i] + " is present but null: " + obj2.toString());
    }

    /* renamed from: n */
    public final void m84950n(Object obj, Object obj2, int i) {
        int i2 = this.f34165a[i];
        if (!m84939y(obj2, i2, i)) {
            return;
        }
        Unsafe unsafe = f34164q;
        long m84960Q = m84960Q(i) & 1048575;
        Object object = unsafe.getObject(obj2, m84960Q);
        if (object != null) {
            InterfaceC32449Do8 m84957g = m84957g(i);
            if (!m84939y(obj, i2, i)) {
                if (!m84940x(object)) {
                    unsafe.putObject(obj, m84960Q, object);
                } else {
                    Object zze = m84957g.zze();
                    m84957g.mo40919a(zze, object);
                    unsafe.putObject(obj, m84960Q, zze);
                }
                m84948p(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, m84960Q);
            if (!m84940x(object2)) {
                Object zze2 = m84957g.zze();
                m84957g.mo40919a(zze2, object2);
                unsafe.putObject(obj, m84960Q, zze2);
                object2 = zze2;
            }
            m84957g.mo40919a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f34165a[i] + " is present but null: " + obj2.toString());
    }

    /* renamed from: o */
    public final void m84949o(Object obj, int i) {
        int m84963N = m84963N(i);
        long j = 1048575 & m84963N;
        if (j == 1048575) {
            return;
        }
        C37192Xv8.m76057v(obj, j, (1 << (m84963N >>> 20)) | C37192Xv8.m76071h(obj, j));
    }

    /* renamed from: p */
    public final void m84948p(Object obj, int i, int i2) {
        C37192Xv8.m76057v(obj, m84963N(i2) & 1048575, i);
    }

    /* renamed from: q */
    public final void m84947q(Object obj, int i, Object obj2) {
        f34164q.putObject(obj, m84960Q(i) & 1048575, obj2);
        m84949o(obj, i);
    }

    /* renamed from: r */
    public final void m84946r(Object obj, int i, int i2, Object obj2) {
        f34164q.putObject(obj, m84960Q(i2) & 1048575, obj2);
        m84948p(obj, i, i2);
    }

    /* renamed from: s */
    public final void m84945s(InterfaceC36040Sx8 interfaceC36040Sx8, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        C43463jh8 c43463jh8 = (C43463jh8) m84956h(i2);
        throw null;
    }

    /* renamed from: t */
    public final boolean m84944t(Object obj, Object obj2, int i) {
        return m84943u(obj, i) == m84943u(obj2, i);
    }

    /* renamed from: u */
    public final boolean m84943u(Object obj, int i) {
        int m84963N = m84963N(i);
        long j = m84963N & 1048575;
        if (j == 1048575) {
            int m84960Q = m84960Q(i);
            long j2 = m84960Q & 1048575;
            switch (m84961P(m84960Q)) {
                case 0:
                    if (Double.doubleToRawLongBits(C37192Xv8.m76073f(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(C37192Xv8.m76072g(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C37192Xv8.m76070i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C37192Xv8.m76070i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C37192Xv8.m76071h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C37192Xv8.m76070i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C37192Xv8.m76071h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C37192Xv8.m76082B(obj, j2);
                case 8:
                    Object m76068k = C37192Xv8.m76068k(obj, j2);
                    if (m76068k instanceof String) {
                        if (((String) m76068k).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m76068k instanceof AbstractC41604gZ7) {
                        if (AbstractC41604gZ7.f82424c.equals(m76068k)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (C37192Xv8.m76068k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC41604gZ7.f82424c.equals(C37192Xv8.m76068k(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (C37192Xv8.m76071h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C37192Xv8.m76071h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (C37192Xv8.m76071h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C37192Xv8.m76070i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C37192Xv8.m76071h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C37192Xv8.m76070i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C37192Xv8.m76068k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((C37192Xv8.m76071h(obj, j) & (1 << (m84963N >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final boolean m84942v(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m84943u(obj, i) : (i3 & i4) != 0;
    }

    /* renamed from: y */
    public final boolean m84939y(Object obj, int i, int i2) {
        if (C37192Xv8.m76071h(obj, m84963N(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC32449Do8
    public final int zza(Object obj) {
        int m16656A;
        int m16656A2;
        int m16655B;
        int m16656A3;
        int m16656A4;
        int m16656A5;
        int m16656A6;
        int m45040M;
        int m16656A7;
        int m16655B2;
        int m16656A8;
        int m16656A9;
        if (this.f34171g) {
            Unsafe unsafe = f34164q;
            int i = 0;
            for (int i2 = 0; i2 < this.f34165a.length; i2 += 3) {
                int m84960Q = m84960Q(i2);
                int m84961P = m84961P(m84960Q);
                int i3 = this.f34165a[i2];
                int i4 = m84960Q & 1048575;
                if (m84961P >= EnumC47843r48.f106392R.zza() && m84961P <= EnumC47843r48.f106422u0.zza()) {
                    int i5 = this.f34165a[i2 + 2];
                }
                long j = i4;
                switch (m84961P) {
                    case 0:
                        if (m84943u(obj, i2)) {
                            m16656A = AbstractC47813r18.m16656A(i3 << 3);
                            m45040M = m16656A + 8;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m84943u(obj, i2)) {
                            m16656A2 = AbstractC47813r18.m16656A(i3 << 3);
                            m45040M = m16656A2 + 4;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m84943u(obj, i2)) {
                            m16655B = AbstractC47813r18.m16655B(C37192Xv8.m76070i(obj, j));
                            m16656A3 = AbstractC47813r18.m16656A(i3 << 3);
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m84943u(obj, i2)) {
                            m16655B = AbstractC47813r18.m16655B(C37192Xv8.m76070i(obj, j));
                            m16656A3 = AbstractC47813r18.m16656A(i3 << 3);
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m84943u(obj, i2)) {
                            m16655B = AbstractC47813r18.m16632w(C37192Xv8.m76071h(obj, j));
                            m16656A3 = AbstractC47813r18.m16656A(i3 << 3);
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m84943u(obj, i2)) {
                            m16656A = AbstractC47813r18.m16656A(i3 << 3);
                            m45040M = m16656A + 8;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m84943u(obj, i2)) {
                            m16656A2 = AbstractC47813r18.m16656A(i3 << 3);
                            m45040M = m16656A2 + 4;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m84943u(obj, i2)) {
                            m16656A4 = AbstractC47813r18.m16656A(i3 << 3);
                            m45040M = m16656A4 + 1;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m84943u(obj, i2)) {
                            Object m76068k = C37192Xv8.m76068k(obj, j);
                            if (m76068k instanceof AbstractC41604gZ7) {
                                int i6 = i3 << 3;
                                Logger logger = AbstractC47813r18.f106235b;
                                int mo5074e = ((AbstractC41604gZ7) m76068k).mo5074e();
                                m16656A5 = AbstractC47813r18.m16656A(mo5074e) + mo5074e;
                                m16656A6 = AbstractC47813r18.m16656A(i6);
                                m45040M = m16656A6 + m16656A5;
                                i += m45040M;
                                break;
                            } else {
                                m16655B = AbstractC47813r18.m16629z((String) m76068k);
                                m16656A3 = AbstractC47813r18.m16656A(i3 << 3);
                                i += m16656A3 + m16655B;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (m84943u(obj, i2)) {
                            m45040M = C39393cp8.m45040M(i3, C37192Xv8.m76068k(obj, j), m84957g(i2));
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m84943u(obj, i2)) {
                            int i7 = i3 << 3;
                            Logger logger2 = AbstractC47813r18.f106235b;
                            int mo5074e2 = ((AbstractC41604gZ7) C37192Xv8.m76068k(obj, j)).mo5074e();
                            m16656A5 = AbstractC47813r18.m16656A(mo5074e2) + mo5074e2;
                            m16656A6 = AbstractC47813r18.m16656A(i7);
                            m45040M = m16656A6 + m16656A5;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m84943u(obj, i2)) {
                            m16655B = AbstractC47813r18.m16656A(C37192Xv8.m76071h(obj, j));
                            m16656A3 = AbstractC47813r18.m16656A(i3 << 3);
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m84943u(obj, i2)) {
                            m16655B = AbstractC47813r18.m16632w(C37192Xv8.m76071h(obj, j));
                            m16656A3 = AbstractC47813r18.m16656A(i3 << 3);
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m84943u(obj, i2)) {
                            m16656A2 = AbstractC47813r18.m16656A(i3 << 3);
                            m45040M = m16656A2 + 4;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m84943u(obj, i2)) {
                            m16656A = AbstractC47813r18.m16656A(i3 << 3);
                            m45040M = m16656A + 8;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m84943u(obj, i2)) {
                            int m76071h = C37192Xv8.m76071h(obj, j);
                            m16656A3 = AbstractC47813r18.m16656A(i3 << 3);
                            m16655B = AbstractC47813r18.m16656A((m76071h >> 31) ^ (m76071h + m76071h));
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m84943u(obj, i2)) {
                            long m76070i = C37192Xv8.m76070i(obj, j);
                            m16656A7 = AbstractC47813r18.m16656A(i3 << 3);
                            m16655B2 = AbstractC47813r18.m16655B((m76070i + m76070i) ^ (m76070i >> 63));
                            m45040M = m16656A7 + m16655B2;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m84943u(obj, i2)) {
                            m45040M = AbstractC47813r18.m16633v(i3, (InterfaceC39926dj8) C37192Xv8.m76068k(obj, j), m84957g(i2));
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        m45040M = C39393cp8.m45047F(i3, (List) C37192Xv8.m76068k(obj, j), false);
                        i += m45040M;
                        break;
                    case 19:
                        m45040M = C39393cp8.m45049D(i3, (List) C37192Xv8.m76068k(obj, j), false);
                        i += m45040M;
                        break;
                    case 20:
                        m45040M = C39393cp8.m45042K(i3, (List) C37192Xv8.m76068k(obj, j), false);
                        i += m45040M;
                        break;
                    case 21:
                        m45040M = C39393cp8.m45031V(i3, (List) C37192Xv8.m76068k(obj, j), false);
                        i += m45040M;
                        break;
                    case 22:
                        m45040M = C39393cp8.m45044I(i3, (List) C37192Xv8.m76068k(obj, j), false);
                        i += m45040M;
                        break;
                    case 23:
                        m45040M = C39393cp8.m45047F(i3, (List) C37192Xv8.m76068k(obj, j), false);
                        i += m45040M;
                        break;
                    case 24:
                        m45040M = C39393cp8.m45049D(i3, (List) C37192Xv8.m76068k(obj, j), false);
                        i += m45040M;
                        break;
                    case 25:
                        m45040M = C39393cp8.m45002z(i3, (List) C37192Xv8.m76068k(obj, j), false);
                        i += m45040M;
                        break;
                    case 26:
                        m45040M = C39393cp8.m45034S(i3, (List) C37192Xv8.m76068k(obj, j));
                        i += m45040M;
                        break;
                    case 27:
                        m45040M = C39393cp8.m45039N(i3, (List) C37192Xv8.m76068k(obj, j), m84957g(i2));
                        i += m45040M;
                        break;
                    case 28:
                        m45040M = C39393cp8.m45052A(i3, (List) C37192Xv8.m76068k(obj, j));
                        i += m45040M;
                        break;
                    case 29:
                        m45040M = C39393cp8.m45033T(i3, (List) C37192Xv8.m76068k(obj, j), false);
                        i += m45040M;
                        break;
                    case 30:
                        m45040M = C39393cp8.m45051B(i3, (List) C37192Xv8.m76068k(obj, j), false);
                        i += m45040M;
                        break;
                    case 31:
                        m45040M = C39393cp8.m45049D(i3, (List) C37192Xv8.m76068k(obj, j), false);
                        i += m45040M;
                        break;
                    case 32:
                        m45040M = C39393cp8.m45047F(i3, (List) C37192Xv8.m76068k(obj, j), false);
                        i += m45040M;
                        break;
                    case 33:
                        m45040M = C39393cp8.m45038O(i3, (List) C37192Xv8.m76068k(obj, j), false);
                        i += m45040M;
                        break;
                    case 34:
                        m45040M = C39393cp8.m45036Q(i3, (List) C37192Xv8.m76068k(obj, j), false);
                        i += m45040M;
                        break;
                    case 35:
                        m16655B = C39393cp8.m45046G((List) unsafe.getObject(obj, j));
                        if (m16655B > 0) {
                            int i8 = i3 << 3;
                            m16656A8 = AbstractC47813r18.m16656A(m16655B);
                            m16656A9 = AbstractC47813r18.m16656A(i8);
                            m16656A3 = m16656A9 + m16656A8;
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        m16655B = C39393cp8.m45048E((List) unsafe.getObject(obj, j));
                        if (m16655B > 0) {
                            int i9 = i3 << 3;
                            m16656A8 = AbstractC47813r18.m16656A(m16655B);
                            m16656A9 = AbstractC47813r18.m16656A(i9);
                            m16656A3 = m16656A9 + m16656A8;
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        m16655B = C39393cp8.m45041L((List) unsafe.getObject(obj, j));
                        if (m16655B > 0) {
                            int i10 = i3 << 3;
                            m16656A8 = AbstractC47813r18.m16656A(m16655B);
                            m16656A9 = AbstractC47813r18.m16656A(i10);
                            m16656A3 = m16656A9 + m16656A8;
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        m16655B = C39393cp8.m45030W((List) unsafe.getObject(obj, j));
                        if (m16655B > 0) {
                            int i11 = i3 << 3;
                            m16656A8 = AbstractC47813r18.m16656A(m16655B);
                            m16656A9 = AbstractC47813r18.m16656A(i11);
                            m16656A3 = m16656A9 + m16656A8;
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        m16655B = C39393cp8.m45043J((List) unsafe.getObject(obj, j));
                        if (m16655B > 0) {
                            int i12 = i3 << 3;
                            m16656A8 = AbstractC47813r18.m16656A(m16655B);
                            m16656A9 = AbstractC47813r18.m16656A(i12);
                            m16656A3 = m16656A9 + m16656A8;
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        m16655B = C39393cp8.m45046G((List) unsafe.getObject(obj, j));
                        if (m16655B > 0) {
                            int i13 = i3 << 3;
                            m16656A8 = AbstractC47813r18.m16656A(m16655B);
                            m16656A9 = AbstractC47813r18.m16656A(i13);
                            m16656A3 = m16656A9 + m16656A8;
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        m16655B = C39393cp8.m45048E((List) unsafe.getObject(obj, j));
                        if (m16655B > 0) {
                            int i14 = i3 << 3;
                            m16656A8 = AbstractC47813r18.m16656A(m16655B);
                            m16656A9 = AbstractC47813r18.m16656A(i14);
                            m16656A3 = m16656A9 + m16656A8;
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        Class cls = C39393cp8.f75682a;
                        m16655B = ((List) unsafe.getObject(obj, j)).size();
                        if (m16655B > 0) {
                            int i15 = i3 << 3;
                            m16656A8 = AbstractC47813r18.m16656A(m16655B);
                            m16656A9 = AbstractC47813r18.m16656A(i15);
                            m16656A3 = m16656A9 + m16656A8;
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        m16655B = C39393cp8.m45032U((List) unsafe.getObject(obj, j));
                        if (m16655B > 0) {
                            int i16 = i3 << 3;
                            m16656A8 = AbstractC47813r18.m16656A(m16655B);
                            m16656A9 = AbstractC47813r18.m16656A(i16);
                            m16656A3 = m16656A9 + m16656A8;
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        m16655B = C39393cp8.m45050C((List) unsafe.getObject(obj, j));
                        if (m16655B > 0) {
                            int i17 = i3 << 3;
                            m16656A8 = AbstractC47813r18.m16656A(m16655B);
                            m16656A9 = AbstractC47813r18.m16656A(i17);
                            m16656A3 = m16656A9 + m16656A8;
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        m16655B = C39393cp8.m45048E((List) unsafe.getObject(obj, j));
                        if (m16655B > 0) {
                            int i18 = i3 << 3;
                            m16656A8 = AbstractC47813r18.m16656A(m16655B);
                            m16656A9 = AbstractC47813r18.m16656A(i18);
                            m16656A3 = m16656A9 + m16656A8;
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        m16655B = C39393cp8.m45046G((List) unsafe.getObject(obj, j));
                        if (m16655B > 0) {
                            int i19 = i3 << 3;
                            m16656A8 = AbstractC47813r18.m16656A(m16655B);
                            m16656A9 = AbstractC47813r18.m16656A(i19);
                            m16656A3 = m16656A9 + m16656A8;
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        m16655B = C39393cp8.m45037P((List) unsafe.getObject(obj, j));
                        if (m16655B > 0) {
                            int i20 = i3 << 3;
                            m16656A8 = AbstractC47813r18.m16656A(m16655B);
                            m16656A9 = AbstractC47813r18.m16656A(i20);
                            m16656A3 = m16656A9 + m16656A8;
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        m16655B = C39393cp8.m45035R((List) unsafe.getObject(obj, j));
                        if (m16655B > 0) {
                            int i21 = i3 << 3;
                            m16656A8 = AbstractC47813r18.m16656A(m16655B);
                            m16656A9 = AbstractC47813r18.m16656A(i21);
                            m16656A3 = m16656A9 + m16656A8;
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        m45040M = C39393cp8.m45045H(i3, (List) C37192Xv8.m76068k(obj, j), m84957g(i2));
                        i += m45040M;
                        break;
                    case 50:
                        C34492Mh8.m95032a(i3, C37192Xv8.m76068k(obj, j), m84956h(i2));
                        break;
                    case 51:
                        if (m84939y(obj, i3, i2)) {
                            m16656A = AbstractC47813r18.m16656A(i3 << 3);
                            m45040M = m16656A + 8;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m84939y(obj, i3, i2)) {
                            m16656A2 = AbstractC47813r18.m16656A(i3 << 3);
                            m45040M = m16656A2 + 4;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m84939y(obj, i3, i2)) {
                            m16655B = AbstractC47813r18.m16655B(m84959R(obj, j));
                            m16656A3 = AbstractC47813r18.m16656A(i3 << 3);
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m84939y(obj, i3, i2)) {
                            m16655B = AbstractC47813r18.m16655B(m84959R(obj, j));
                            m16656A3 = AbstractC47813r18.m16656A(i3 << 3);
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m84939y(obj, i3, i2)) {
                            m16655B = AbstractC47813r18.m16632w(m84969H(obj, j));
                            m16656A3 = AbstractC47813r18.m16656A(i3 << 3);
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m84939y(obj, i3, i2)) {
                            m16656A = AbstractC47813r18.m16656A(i3 << 3);
                            m45040M = m16656A + 8;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m84939y(obj, i3, i2)) {
                            m16656A2 = AbstractC47813r18.m16656A(i3 << 3);
                            m45040M = m16656A2 + 4;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m84939y(obj, i3, i2)) {
                            m16656A4 = AbstractC47813r18.m16656A(i3 << 3);
                            m45040M = m16656A4 + 1;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (m84939y(obj, i3, i2)) {
                            Object m76068k2 = C37192Xv8.m76068k(obj, j);
                            if (m76068k2 instanceof AbstractC41604gZ7) {
                                int i22 = i3 << 3;
                                Logger logger3 = AbstractC47813r18.f106235b;
                                int mo5074e3 = ((AbstractC41604gZ7) m76068k2).mo5074e();
                                m16656A5 = AbstractC47813r18.m16656A(mo5074e3) + mo5074e3;
                                m16656A6 = AbstractC47813r18.m16656A(i22);
                                m45040M = m16656A6 + m16656A5;
                                i += m45040M;
                                break;
                            } else {
                                m16655B = AbstractC47813r18.m16629z((String) m76068k2);
                                m16656A3 = AbstractC47813r18.m16656A(i3 << 3);
                                i += m16656A3 + m16655B;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (m84939y(obj, i3, i2)) {
                            m45040M = C39393cp8.m45040M(i3, C37192Xv8.m76068k(obj, j), m84957g(i2));
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m84939y(obj, i3, i2)) {
                            int i23 = i3 << 3;
                            Logger logger4 = AbstractC47813r18.f106235b;
                            int mo5074e4 = ((AbstractC41604gZ7) C37192Xv8.m76068k(obj, j)).mo5074e();
                            m16656A5 = AbstractC47813r18.m16656A(mo5074e4) + mo5074e4;
                            m16656A6 = AbstractC47813r18.m16656A(i23);
                            m45040M = m16656A6 + m16656A5;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m84939y(obj, i3, i2)) {
                            m16655B = AbstractC47813r18.m16656A(m84969H(obj, j));
                            m16656A3 = AbstractC47813r18.m16656A(i3 << 3);
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m84939y(obj, i3, i2)) {
                            m16655B = AbstractC47813r18.m16632w(m84969H(obj, j));
                            m16656A3 = AbstractC47813r18.m16656A(i3 << 3);
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m84939y(obj, i3, i2)) {
                            m16656A2 = AbstractC47813r18.m16656A(i3 << 3);
                            m45040M = m16656A2 + 4;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m84939y(obj, i3, i2)) {
                            m16656A = AbstractC47813r18.m16656A(i3 << 3);
                            m45040M = m16656A + 8;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m84939y(obj, i3, i2)) {
                            int m84969H = m84969H(obj, j);
                            m16656A3 = AbstractC47813r18.m16656A(i3 << 3);
                            m16655B = AbstractC47813r18.m16656A((m84969H >> 31) ^ (m84969H + m84969H));
                            i += m16656A3 + m16655B;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m84939y(obj, i3, i2)) {
                            long m84959R = m84959R(obj, j);
                            m16656A7 = AbstractC47813r18.m16656A(i3 << 3);
                            m16655B2 = AbstractC47813r18.m16655B((m84959R + m84959R) ^ (m84959R >> 63));
                            m45040M = m16656A7 + m16655B2;
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (m84939y(obj, i3, i2)) {
                            m45040M = AbstractC47813r18.m16633v(i3, (InterfaceC39926dj8) C37192Xv8.m76068k(obj, j), m84957g(i2));
                            i += m45040M;
                            break;
                        } else {
                            break;
                        }
                }
            }
            AbstractC32953Fs8 abstractC32953Fs8 = this.f34176l;
            return i + abstractC32953Fs8.mo82293a(abstractC32953Fs8.mo82290d(obj));
        }
        return m84970G(obj);
    }

    @Override // p000.InterfaceC32449Do8
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int length = this.f34165a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m84960Q = m84960Q(i3);
            int i4 = this.f34165a[i3];
            long j = 1048575 & m84960Q;
            int i5 = 37;
            switch (m84961P(m84960Q)) {
                case 0:
                    i = i2 * 53;
                    doubleToLongBits = Double.doubleToLongBits(C37192Xv8.m76073f(obj, j));
                    Charset charset = C32791Fa8.f9736a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 1:
                    i = i2 * 53;
                    floatToIntBits = Float.floatToIntBits(C37192Xv8.m76072g(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 2:
                    i = i2 * 53;
                    doubleToLongBits = C37192Xv8.m76070i(obj, j);
                    Charset charset2 = C32791Fa8.f9736a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 3:
                    i = i2 * 53;
                    doubleToLongBits = C37192Xv8.m76070i(obj, j);
                    Charset charset3 = C32791Fa8.f9736a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 4:
                    i = i2 * 53;
                    floatToIntBits = C37192Xv8.m76071h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 5:
                    i = i2 * 53;
                    doubleToLongBits = C37192Xv8.m76070i(obj, j);
                    Charset charset4 = C32791Fa8.f9736a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 6:
                    i = i2 * 53;
                    floatToIntBits = C37192Xv8.m76071h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 7:
                    i = i2 * 53;
                    floatToIntBits = C32791Fa8.m106928a(C37192Xv8.m76082B(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 8:
                    i = i2 * 53;
                    floatToIntBits = ((String) C37192Xv8.m76068k(obj, j)).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 9:
                    Object m76068k = C37192Xv8.m76068k(obj, j);
                    if (m76068k != null) {
                        i5 = m76068k.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    floatToIntBits = C37192Xv8.m76068k(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 11:
                    i = i2 * 53;
                    floatToIntBits = C37192Xv8.m76071h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 12:
                    i = i2 * 53;
                    floatToIntBits = C37192Xv8.m76071h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 13:
                    i = i2 * 53;
                    floatToIntBits = C37192Xv8.m76071h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 14:
                    i = i2 * 53;
                    doubleToLongBits = C37192Xv8.m76070i(obj, j);
                    Charset charset5 = C32791Fa8.f9736a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 15:
                    i = i2 * 53;
                    floatToIntBits = C37192Xv8.m76071h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 16:
                    i = i2 * 53;
                    doubleToLongBits = C37192Xv8.m76070i(obj, j);
                    Charset charset6 = C32791Fa8.f9736a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 17:
                    Object m76068k2 = C37192Xv8.m76068k(obj, j);
                    if (m76068k2 != null) {
                        i5 = m76068k2.hashCode();
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
                    floatToIntBits = C37192Xv8.m76068k(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 50:
                    i = i2 * 53;
                    floatToIntBits = C37192Xv8.m76068k(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 51:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = Double.doubleToLongBits(m84972E(obj, j));
                        Charset charset7 = C32791Fa8.f9736a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = Float.floatToIntBits(m84971F(obj, j));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = m84959R(obj, j);
                        Charset charset8 = C32791Fa8.f9736a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = m84959R(obj, j);
                        Charset charset9 = C32791Fa8.f9736a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m84969H(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = m84959R(obj, j);
                        Charset charset10 = C32791Fa8.f9736a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m84969H(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = C32791Fa8.m106928a(m84938z(obj, j));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = ((String) C37192Xv8.m76068k(obj, j)).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = C37192Xv8.m76068k(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = C37192Xv8.m76068k(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m84969H(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m84969H(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m84969H(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = m84959R(obj, j);
                        Charset charset11 = C32791Fa8.f9736a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m84969H(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = m84959R(obj, j);
                        Charset charset12 = C32791Fa8.f9736a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m84939y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = C37192Xv8.m76068k(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f34176l.mo82290d(obj).hashCode();
        if (this.f34170f) {
            return (hashCode * 53) + this.f34177m.mo24513b(obj).f76101a.hashCode();
        }
        return hashCode;
    }

    @Override // p000.InterfaceC32449Do8
    public final Object zze() {
        return ((V78) this.f34169e).m80347j();
    }

    @Override // p000.InterfaceC32449Do8
    public final void zzf(Object obj) {
        if (!m84940x(obj)) {
            return;
        }
        if (obj instanceof V78) {
            V78 v78 = (V78) obj;
            v78.m80335x(Integer.MAX_VALUE);
            v78.zzb = 0;
            v78.m80337v();
        }
        int length = this.f34165a.length;
        for (int i = 0; i < length; i += 3) {
            int m84960Q = m84960Q(i);
            int i2 = 1048575 & m84960Q;
            int m84961P = m84961P(m84960Q);
            long j = i2;
            if (m84961P != 9) {
                if (m84961P != 60 && m84961P != 68) {
                    switch (m84961P) {
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
                            this.f34175k.mo37920a(obj, j);
                            break;
                        case 50:
                            Unsafe unsafe = f34164q;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((C51763xh8) object).m4872f();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (m84939y(obj, this.f34165a[i], i)) {
                    m84957g(i).zzf(f34164q.getObject(obj, j));
                }
            }
            if (m84943u(obj, i)) {
                m84957g(i).zzf(f34164q.getObject(obj, j));
            }
        }
        this.f34176l.mo82287g(obj);
        if (this.f34170f) {
            this.f34177m.mo24510e(obj);
        }
    }
}
