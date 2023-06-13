package p000;

import com.fasterxml.jackson.core.base.GeneratorBase;
import com.google.android.gms.internal.measurement.zzll;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;
/* renamed from: U19 */
/* loaded from: classes5.dex */
public final class U19<T> implements F39<T> {

    /* renamed from: p */
    public static final int[] f36717p = new int[0];

    /* renamed from: q */
    public static final Unsafe f36718q = C44919m89.m26267l();

    /* renamed from: a */
    public final int[] f36719a;

    /* renamed from: b */
    public final Object[] f36720b;

    /* renamed from: c */
    public final int f36721c;

    /* renamed from: d */
    public final int f36722d;

    /* renamed from: e */
    public final InterfaceC47814r19 f36723e;

    /* renamed from: f */
    public final boolean f36724f;

    /* renamed from: g */
    public final boolean f36725g;

    /* renamed from: h */
    public final int[] f36726h;

    /* renamed from: i */
    public final int f36727i;

    /* renamed from: j */
    public final int f36728j;

    /* renamed from: k */
    public final AbstractC52268yY8 f36729k;

    /* renamed from: l */
    public final Q69 f36730l;

    /* renamed from: m */
    public final AbstractC39755dR8 f36731m;

    /* renamed from: n */
    public final C46045o29 f36732n;

    /* renamed from: o */
    public final C50175v09 f36733o;

    public U19(int[] iArr, Object[] objArr, int i, int i2, InterfaceC47814r19 interfaceC47814r19, boolean z, boolean z2, int[] iArr2, int i3, int i4, C46045o29 c46045o29, AbstractC52268yY8 abstractC52268yY8, Q69 q69, AbstractC39755dR8 abstractC39755dR8, C50175v09 c50175v09) {
        this.f36719a = iArr;
        this.f36720b = objArr;
        this.f36721c = i;
        this.f36722d = i2;
        this.f36725g = z;
        boolean z3 = false;
        if (abstractC39755dR8 != null && abstractC39755dR8.mo23746c(interfaceC47814r19)) {
            z3 = true;
        }
        this.f36724f = z3;
        this.f36726h = iArr2;
        this.f36727i = i3;
        this.f36728j = i4;
        this.f36732n = c46045o29;
        this.f36729k = abstractC52268yY8;
        this.f36730l = q69;
        this.f36731m = abstractC39755dR8;
        this.f36723e = interfaceC47814r19;
        this.f36733o = c50175v09;
    }

    /* renamed from: A */
    public static final void m82096A(int i, Object obj, InterfaceC38633ba9 interfaceC38633ba9) throws IOException {
        if (obj instanceof String) {
            interfaceC38633ba9.mo64307w(i, (String) obj);
        } else {
            interfaceC38633ba9.mo64337B(i, (AbstractC40913fO8) obj);
        }
    }

    /* renamed from: C */
    public static Y69 m82094C(Object obj) {
        AbstractC46897pU8 abstractC46897pU8 = (AbstractC46897pU8) obj;
        Y69 y69 = abstractC46897pU8.zzc;
        if (y69 == Y69.m75687c()) {
            Y69 m75684f = Y69.m75684f();
            abstractC46897pU8.zzc = m75684f;
            return m75684f;
        }
        return y69;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static U19 m82093D(Class cls, O09 o09, C46045o29 c46045o29, AbstractC52268yY8 abstractC52268yY8, Q69 q69, AbstractC39755dR8 abstractC39755dR8, C50175v09 c50175v09) {
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
        Field m82073k;
        char charAt11;
        int i20;
        Object[] objArr2;
        int i21;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field m82073k2;
        Object obj2;
        Field m82073k3;
        int i25;
        char charAt12;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        if (o09 instanceof C50797w39) {
            C50797w39 c50797w39 = (C50797w39) o09;
            int zzc = c50797w39.zzc();
            String m7516a = c50797w39.m7516a();
            int length = m7516a.length();
            int i29 = 0;
            char charAt16 = m7516a.charAt(0);
            int i30 = GeneratorBase.SURR1_FIRST;
            if (charAt16 >= 55296) {
                int i31 = 1;
                while (true) {
                    i = i31 + 1;
                    if (m7516a.charAt(i31) < 55296) {
                        break;
                    }
                    i31 = i;
                }
            } else {
                i = 1;
            }
            int i32 = i + 1;
            int charAt17 = m7516a.charAt(i);
            if (charAt17 >= 55296) {
                int i33 = charAt17 & 8191;
                int i34 = 13;
                while (true) {
                    i28 = i32 + 1;
                    charAt15 = m7516a.charAt(i32);
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
                iArr = f36717p;
                i2 = 0;
            } else {
                int i35 = i32 + 1;
                int charAt18 = m7516a.charAt(i32);
                if (charAt18 >= 55296) {
                    int i36 = charAt18 & 8191;
                    int i37 = 13;
                    while (true) {
                        i13 = i35 + 1;
                        charAt10 = m7516a.charAt(i35);
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
                int charAt19 = m7516a.charAt(i35);
                if (charAt19 >= 55296) {
                    int i39 = charAt19 & 8191;
                    int i40 = 13;
                    while (true) {
                        i12 = i38 + 1;
                        charAt9 = m7516a.charAt(i38);
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
                int charAt20 = m7516a.charAt(i38);
                if (charAt20 >= 55296) {
                    int i42 = charAt20 & 8191;
                    int i43 = 13;
                    while (true) {
                        i11 = i41 + 1;
                        charAt8 = m7516a.charAt(i41);
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
                int charAt21 = m7516a.charAt(i41);
                if (charAt21 >= 55296) {
                    int i45 = charAt21 & 8191;
                    int i46 = 13;
                    while (true) {
                        i10 = i44 + 1;
                        charAt7 = m7516a.charAt(i44);
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
                charAt = m7516a.charAt(i44);
                if (charAt >= 55296) {
                    int i48 = charAt & 8191;
                    int i49 = 13;
                    while (true) {
                        i9 = i47 + 1;
                        charAt6 = m7516a.charAt(i47);
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
                charAt2 = m7516a.charAt(i47);
                if (charAt2 >= 55296) {
                    int i51 = charAt2 & 8191;
                    int i52 = 13;
                    while (true) {
                        i8 = i50 + 1;
                        charAt5 = m7516a.charAt(i50);
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
                int charAt22 = m7516a.charAt(i50);
                if (charAt22 >= 55296) {
                    int i54 = charAt22 & 8191;
                    int i55 = 13;
                    while (true) {
                        i7 = i53 + 1;
                        charAt4 = m7516a.charAt(i53);
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
                int charAt23 = m7516a.charAt(i53);
                if (charAt23 >= 55296) {
                    int i57 = charAt23 & 8191;
                    int i58 = i56;
                    int i59 = 13;
                    while (true) {
                        i6 = i58 + 1;
                        charAt3 = m7516a.charAt(i58);
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
            Unsafe unsafe = f36718q;
            Object[] m7515b = c50797w39.m7515b();
            Class<?> cls2 = c50797w39.zza().getClass();
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
                    int charAt24 = m7516a.charAt(i32);
                    if (charAt24 >= i30) {
                        int i69 = charAt24 & 8191;
                        int i70 = i68;
                        int i71 = 13;
                        while (true) {
                            i27 = i70 + 1;
                            charAt14 = m7516a.charAt(i70);
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
                    int charAt25 = m7516a.charAt(i15);
                    int i73 = length;
                    char c = 55296;
                    if (charAt25 >= 55296) {
                        int i74 = charAt25 & 8191;
                        int i75 = 13;
                        while (true) {
                            i26 = i72 + 1;
                            charAt13 = m7516a.charAt(i72);
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
                        int charAt26 = m7516a.charAt(i72);
                        if (charAt26 >= 55296) {
                            int i79 = charAt26 & 8191;
                            int i80 = i78;
                            int i81 = 13;
                            while (true) {
                                i25 = i80 + 1;
                                charAt12 = m7516a.charAt(i80);
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
                                objArr3[i84 + i84 + 1] = m7515b[i3];
                            }
                            int i85 = charAt26 + charAt26;
                            obj = m7515b[i85];
                            if (!(obj instanceof Field)) {
                                m82073k2 = (Field) obj;
                            } else {
                                m82073k2 = m82073k(cls2, (String) obj);
                                m7515b[i85] = m82073k2;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m82073k2);
                            int i86 = i85 + 1;
                            obj2 = m7515b[i86];
                            if (!(obj2 instanceof Field)) {
                                m82073k3 = (Field) obj2;
                            } else {
                                m82073k3 = m82073k(cls2, (String) obj2);
                                m7515b[i86] = m82073k3;
                            }
                            objectFieldOffset = objectFieldOffset2;
                            objArr2 = m7515b;
                            i18 = i83;
                            i17 = (int) unsafe.objectFieldOffset(m82073k3);
                            i19 = 0;
                        } else {
                            int i87 = i67 / 3;
                            i24 = i3 + 1;
                            objArr3[i87 + i87 + 1] = m7515b[i3];
                        }
                        i3 = i24;
                        int i852 = charAt26 + charAt26;
                        obj = m7515b[i852];
                        if (!(obj instanceof Field)) {
                        }
                        int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m82073k2);
                        int i862 = i852 + 1;
                        obj2 = m7515b[i862];
                        if (!(obj2 instanceof Field)) {
                        }
                        objectFieldOffset = objectFieldOffset22;
                        objArr2 = m7515b;
                        i18 = i83;
                        i17 = (int) unsafe.objectFieldOffset(m82073k3);
                        i19 = 0;
                    } else {
                        i16 = i2;
                        int i88 = i3 + 1;
                        Field m82073k4 = m82073k(cls2, (String) m7515b[i3]);
                        if (i76 != 9 && i76 != 17) {
                            if (i76 != 27 && i76 != 49) {
                                if (i76 != 12 && i76 != 30 && i76 != 44) {
                                    if (i76 == 50) {
                                        int i89 = i64 + 1;
                                        iArr[i64] = i67;
                                        int i90 = i67 / 3;
                                        int i91 = i88 + 1;
                                        int i92 = i90 + i90;
                                        objArr3[i92] = m7515b[i88];
                                        if ((charAt25 & 2048) != 0) {
                                            i88 = i91 + 1;
                                            objArr3[i92 + 1] = m7515b[i91];
                                            i64 = i89;
                                        } else {
                                            objArr = m7515b;
                                            i88 = i91;
                                            i64 = i89;
                                            objectFieldOffset = (int) unsafe.objectFieldOffset(m82073k4);
                                            i17 = 1048575;
                                            if ((charAt25 & 4096) != 4096 && i76 <= 17) {
                                                int i93 = i72 + 1;
                                                int charAt27 = m7516a.charAt(i72);
                                                if (charAt27 >= 55296) {
                                                    int i94 = charAt27 & 8191;
                                                    int i95 = 13;
                                                    while (true) {
                                                        i18 = i93 + 1;
                                                        charAt11 = m7516a.charAt(i93);
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
                                                    m82073k = (Field) obj3;
                                                } else {
                                                    m82073k = m82073k(cls2, (String) obj3);
                                                    objArr[i96] = m82073k;
                                                }
                                                i19 = charAt27 % 32;
                                                i17 = (int) unsafe.objectFieldOffset(m82073k);
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
                                    objArr3[i97 + i97 + 1] = m7515b[i88];
                                }
                            } else {
                                int i98 = i67 / 3;
                                i20 = i88 + 1;
                                objArr3[i98 + i98 + 1] = m7515b[i88];
                            }
                            i88 = i20;
                        } else {
                            int i99 = i67 / 3;
                            objArr3[i99 + i99 + 1] = m82073k4.getType();
                        }
                        objArr = m7515b;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(m82073k4);
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
                    m7515b = objArr2;
                    length = i73;
                    i32 = i18;
                    i5 = i77;
                    zzc = i14;
                    i2 = i16;
                    i30 = GeneratorBase.SURR1_FIRST;
                } else {
                    return new U19(iArr3, objArr3, i2, i5, c50797w39.zza(), z, false, iArr, i4, i62, c46045o29, abstractC52268yY8, q69, abstractC39755dR8, c50175v09);
                }
            }
        } else {
            C49049t69 c49049t69 = (C49049t69) o09;
            throw null;
        }
    }

    /* renamed from: E */
    public static double m82092E(Object obj, long j) {
        return ((Double) C44919m89.m26268k(obj, j)).doubleValue();
    }

    /* renamed from: F */
    public static float m82091F(Object obj, long j) {
        return ((Float) C44919m89.m26268k(obj, j)).floatValue();
    }

    /* renamed from: H */
    public static int m82089H(Object obj, long j) {
        return ((Integer) C44919m89.m26268k(obj, j)).intValue();
    }

    /* renamed from: P */
    public static int m82081P(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: R */
    public static long m82079R(Object obj, long j) {
        return ((Long) C44919m89.m26268k(obj, j)).longValue();
    }

    /* renamed from: k */
    public static Field m82073k(Class cls, String str) {
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
    public static void m82072l(Object obj) {
        if (m82060x(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* renamed from: w */
    public static boolean m82061w(Object obj, int i, F39 f39) {
        return f39.mo43318b(C44919m89.m26268k(obj, i & 1048575));
    }

    /* renamed from: x */
    public static boolean m82060x(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC46897pU8) {
            return ((AbstractC46897pU8) obj).m19194y();
        }
        return true;
    }

    /* renamed from: z */
    public static boolean m82058z(Object obj, long j) {
        return ((Boolean) C44919m89.m26268k(obj, j)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x030e, code lost:
        if (r0 != r22) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0310, code lost:
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r1 = r31;
        r13 = r32;
        r11 = r33;
        r9 = r34;
        r8 = r19;
        r5 = r20;
        r3 = r21;
        r2 = r22;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x032c, code lost:
        r2 = r0;
        r7 = r21;
        r6 = r24;
        r0 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0360, code lost:
        if (r0 != r15) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0388, code lost:
        if (r0 != r15) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0403, code lost:
        if (r6 == 1048575) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0405, code lost:
        r27.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x040b, code lost:
        r2 = r8.f36727i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x040f, code lost:
        if (r2 >= r8.f36728j) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0411, code lost:
        r4 = r8.f36726h[r2];
        r5 = r8.f36719a[r4];
        r5 = p000.C44919m89.m26268k(r12, r8.m82080Q(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0423, code lost:
        if (r5 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x042a, code lost:
        if (r8.m82078f(r4) != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x042c, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x042f, code lost:
        r5 = (p000.C44839m09) r5;
        r0 = (p000.C39503d09) r8.m82076h(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0437, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0438, code lost:
        if (r9 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x043c, code lost:
        if (r0 != r32) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0443, code lost:
        throw com.google.android.gms.internal.measurement.zzll.m51340e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0446, code lost:
        if (r0 > r32) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0448, code lost:
        if (r3 != r9) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x044a, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x044f, code lost:
        throw com.google.android.gms.internal.measurement.zzll.m51340e();
     */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m82095B(Object obj, byte[] bArr, int i, int i2, int i3, C52735zK8 c52735zK8) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        U19<T> u19;
        byte b;
        int m82085L;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Object obj3;
        int i12;
        C52735zK8 c52735zK82;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        U19<T> u192 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i26 = i2;
        int i27 = i3;
        C52735zK8 c52735zK83 = c52735zK8;
        m82072l(obj);
        Unsafe unsafe2 = f36718q;
        int i28 = -1;
        int i29 = i;
        int i30 = -1;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 1048575;
        while (true) {
            if (i29 < i26) {
                int i35 = i29 + 1;
                byte b2 = bArr2[i29];
                if (b2 < 0) {
                    int m97060k = LK8.m97060k(b2, bArr2, i35, c52735zK83);
                    b = c52735zK83.f121110a;
                    i35 = m97060k;
                } else {
                    b = b2;
                }
                int i36 = b >>> 3;
                if (i36 > i30) {
                    m82085L = u192.m82084M(i36, i31 / 3);
                } else {
                    m82085L = u192.m82085L(i36);
                }
                int i37 = m82085L;
                if (i37 == i28) {
                    i5 = i36;
                    i6 = i35;
                    i7 = b;
                    i8 = i33;
                    i9 = i28;
                    unsafe = unsafe2;
                    i10 = i27;
                    i11 = 0;
                } else {
                    int i38 = b & 7;
                    int[] iArr = u192.f36719a;
                    int i39 = iArr[i37 + 1];
                    int m82081P = m82081P(i39);
                    int i40 = i35;
                    int i41 = b;
                    long j = i39 & 1048575;
                    if (m82081P <= 17) {
                        int i42 = iArr[i37 + 2];
                        int i43 = 1 << (i42 >>> 20);
                        int i44 = i42 & 1048575;
                        if (i44 != i34) {
                            if (i34 != 1048575) {
                                unsafe2.putInt(obj4, i34, i33);
                            }
                            i14 = i44;
                            i13 = unsafe2.getInt(obj4, i44);
                        } else {
                            i13 = i33;
                            i14 = i34;
                        }
                        switch (m82081P) {
                            case 0:
                                i15 = i37;
                                i16 = i36;
                                i17 = i40;
                                if (i38 == 1) {
                                    C44919m89.m26259t(obj4, j, Double.longBitsToDouble(LK8.m97055p(bArr2, i17)));
                                    i29 = i17 + 8;
                                    i33 = i13 | i43;
                                    i26 = i2;
                                    i31 = i15;
                                    i30 = i16;
                                    i32 = i41;
                                    i34 = i14;
                                    i28 = -1;
                                    i27 = i3;
                                    break;
                                } else {
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i41;
                                    i34 = i14;
                                    i9 = -1;
                                    break;
                                }
                            case 1:
                                i15 = i37;
                                i16 = i36;
                                i17 = i40;
                                if (i38 == 5) {
                                    C44919m89.m26258u(obj4, j, Float.intBitsToFloat(LK8.m97069b(bArr2, i17)));
                                    i29 = i17 + 4;
                                    i33 = i13 | i43;
                                    i26 = i2;
                                    i31 = i15;
                                    i30 = i16;
                                    i32 = i41;
                                    i34 = i14;
                                    i28 = -1;
                                    i27 = i3;
                                    break;
                                } else {
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i41;
                                    i34 = i14;
                                    i9 = -1;
                                    break;
                                }
                            case 2:
                            case 3:
                                i15 = i37;
                                i16 = i36;
                                i17 = i40;
                                if (i38 == 0) {
                                    int m97058m = LK8.m97058m(bArr2, i17, c52735zK83);
                                    unsafe2.putLong(obj, j, c52735zK83.f121111b);
                                    i33 = i13 | i43;
                                    i31 = i15;
                                    i30 = i16;
                                    i29 = m97058m;
                                    i32 = i41;
                                    i34 = i14;
                                    i28 = -1;
                                    i26 = i2;
                                    i27 = i3;
                                    break;
                                } else {
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i41;
                                    i34 = i14;
                                    i9 = -1;
                                    break;
                                }
                            case 4:
                            case 11:
                                i15 = i37;
                                i16 = i36;
                                i17 = i40;
                                if (i38 == 0) {
                                    i29 = LK8.m97061j(bArr2, i17, c52735zK83);
                                    unsafe2.putInt(obj4, j, c52735zK83.f121110a);
                                    i33 = i13 | i43;
                                    i26 = i2;
                                    i31 = i15;
                                    i30 = i16;
                                    i32 = i41;
                                    i34 = i14;
                                    i28 = -1;
                                    i27 = i3;
                                    break;
                                } else {
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i41;
                                    i34 = i14;
                                    i9 = -1;
                                    break;
                                }
                            case 5:
                            case 14:
                                i15 = i37;
                                i16 = i36;
                                i18 = i40;
                                if (i38 == 1) {
                                    i17 = i18;
                                    unsafe2.putLong(obj, j, LK8.m97055p(bArr2, i18));
                                    i29 = i17 + 8;
                                    i33 = i13 | i43;
                                    i26 = i2;
                                    i31 = i15;
                                    i30 = i16;
                                    i32 = i41;
                                    i34 = i14;
                                    i28 = -1;
                                    i27 = i3;
                                    break;
                                } else {
                                    i17 = i18;
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i41;
                                    i34 = i14;
                                    i9 = -1;
                                    break;
                                }
                            case 6:
                            case 13:
                                i15 = i37;
                                i16 = i36;
                                i18 = i40;
                                if (i38 == 5) {
                                    unsafe2.putInt(obj4, j, LK8.m97069b(bArr2, i18));
                                    i29 = i18 + 4;
                                    i33 = i13 | i43;
                                    i26 = i2;
                                    i31 = i15;
                                    i30 = i16;
                                    i32 = i41;
                                    i34 = i14;
                                    i28 = -1;
                                    i27 = i3;
                                    break;
                                } else {
                                    i17 = i18;
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i41;
                                    i34 = i14;
                                    i9 = -1;
                                    break;
                                }
                            case 7:
                                i15 = i37;
                                i16 = i36;
                                i18 = i40;
                                if (i38 == 0) {
                                    i29 = LK8.m97058m(bArr2, i18, c52735zK83);
                                    if (c52735zK83.f121111b != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    C44919m89.m26261r(obj4, j, z);
                                    i33 = i13 | i43;
                                    i26 = i2;
                                    i31 = i15;
                                    i30 = i16;
                                    i32 = i41;
                                    i34 = i14;
                                    i28 = -1;
                                    i27 = i3;
                                    break;
                                } else {
                                    i17 = i18;
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i41;
                                    i34 = i14;
                                    i9 = -1;
                                    break;
                                }
                            case 8:
                                i15 = i37;
                                i16 = i36;
                                i18 = i40;
                                if (i38 == 2) {
                                    if ((i39 & 536870912) == 0) {
                                        i29 = LK8.m97064g(bArr2, i18, c52735zK83);
                                    } else {
                                        i29 = LK8.m97063h(bArr2, i18, c52735zK83);
                                    }
                                    unsafe2.putObject(obj4, j, c52735zK83.f121112c);
                                    i33 = i13 | i43;
                                    i26 = i2;
                                    i31 = i15;
                                    i30 = i16;
                                    i32 = i41;
                                    i34 = i14;
                                    i28 = -1;
                                    i27 = i3;
                                    break;
                                } else {
                                    i17 = i18;
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i41;
                                    i34 = i14;
                                    i9 = -1;
                                    break;
                                }
                            case 9:
                                i15 = i37;
                                i16 = i36;
                                i18 = i40;
                                if (i38 == 2) {
                                    Object m82075i = u192.m82075i(obj4, i15);
                                    i41 = i41;
                                    i29 = LK8.m97056o(m82075i, u192.m82077g(i15), bArr, i18, i2, c52735zK8);
                                    u192.m82067q(obj4, i15, m82075i);
                                    i33 = i13 | i43;
                                    i26 = i2;
                                    i31 = i15;
                                    i30 = i16;
                                    i32 = i41;
                                    i34 = i14;
                                    i28 = -1;
                                    i27 = i3;
                                    break;
                                } else {
                                    i41 = i41;
                                    i17 = i18;
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i41;
                                    i34 = i14;
                                    i9 = -1;
                                    break;
                                }
                            case 10:
                                i19 = i37;
                                i16 = i36;
                                i20 = i41;
                                i21 = i40;
                                if (i38 == 2) {
                                    i29 = LK8.m97070a(bArr2, i21, c52735zK83);
                                    unsafe2.putObject(obj4, j, c52735zK83.f121112c);
                                    i33 = i13 | i43;
                                    i31 = i19;
                                    i30 = i16;
                                    i32 = i20;
                                    i34 = i14;
                                    i28 = -1;
                                    i26 = i2;
                                    i27 = i3;
                                    break;
                                } else {
                                    i22 = i19;
                                    i41 = i20;
                                    i17 = i21;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i41;
                                    i34 = i14;
                                    i9 = -1;
                                    break;
                                }
                            case 12:
                                i19 = i37;
                                i16 = i36;
                                i20 = i41;
                                i21 = i40;
                                if (i38 == 0) {
                                    i29 = LK8.m97061j(bArr2, i21, c52735zK83);
                                    int i45 = c52735zK83.f121110a;
                                    InterfaceC41569gV8 m82078f = u192.m82078f(i19);
                                    if (m82078f != null && !m82078f.zza(i45)) {
                                        m82094C(obj).m75680j(i20, Long.valueOf(i45));
                                        i31 = i19;
                                        i33 = i13;
                                        i30 = i16;
                                        i32 = i20;
                                        i34 = i14;
                                        i28 = -1;
                                        i26 = i2;
                                        i27 = i3;
                                    } else {
                                        unsafe2.putInt(obj4, j, i45);
                                        i33 = i13 | i43;
                                        i31 = i19;
                                        i30 = i16;
                                        i32 = i20;
                                        i34 = i14;
                                        i28 = -1;
                                        i26 = i2;
                                        i27 = i3;
                                        break;
                                    }
                                } else {
                                    i22 = i19;
                                    i41 = i20;
                                    i17 = i21;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i41;
                                    i34 = i14;
                                    i9 = -1;
                                    break;
                                }
                                break;
                            case 15:
                                i19 = i37;
                                i16 = i36;
                                i20 = i41;
                                i21 = i40;
                                if (i38 == 0) {
                                    i29 = LK8.m97061j(bArr2, i21, c52735zK83);
                                    unsafe2.putInt(obj4, j, ZO8.m73210a(c52735zK83.f121110a));
                                    i33 = i13 | i43;
                                    i31 = i19;
                                    i30 = i16;
                                    i32 = i20;
                                    i34 = i14;
                                    i28 = -1;
                                    i26 = i2;
                                    i27 = i3;
                                    break;
                                } else {
                                    i22 = i19;
                                    i41 = i20;
                                    i17 = i21;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i41;
                                    i34 = i14;
                                    i9 = -1;
                                    break;
                                }
                            case 16:
                                if (i38 == 0) {
                                    int m97058m2 = LK8.m97058m(bArr2, i40, c52735zK83);
                                    unsafe2.putLong(obj, j, ZO8.m73209b(c52735zK83.f121111b));
                                    i33 = i13 | i43;
                                    i31 = i37;
                                    i30 = i36;
                                    i32 = i41;
                                    i29 = m97058m2;
                                    i34 = i14;
                                    i28 = -1;
                                    i26 = i2;
                                    i27 = i3;
                                    break;
                                } else {
                                    i16 = i36;
                                    i22 = i37;
                                    i17 = i40;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i41;
                                    i34 = i14;
                                    i9 = -1;
                                    break;
                                }
                            default:
                                i15 = i37;
                                i16 = i36;
                                i17 = i40;
                                if (i38 == 3) {
                                    Object m82075i2 = u192.m82075i(obj4, i15);
                                    i29 = LK8.m97057n(m82075i2, u192.m82077g(i15), bArr, i17, i2, (i16 << 3) | 4, c52735zK8);
                                    u192.m82067q(obj4, i15, m82075i2);
                                    i33 = i13 | i43;
                                    i26 = i2;
                                    i30 = i16;
                                    i31 = i15;
                                    i32 = i41;
                                    i34 = i14;
                                    i28 = -1;
                                    bArr2 = bArr;
                                    i27 = i3;
                                    break;
                                } else {
                                    i22 = i15;
                                    i10 = i3;
                                    i8 = i13;
                                    unsafe = unsafe2;
                                    i5 = i16;
                                    i11 = i22;
                                    i6 = i17;
                                    i7 = i41;
                                    i34 = i14;
                                    i9 = -1;
                                    break;
                                }
                        }
                    } else {
                        if (m82081P == 27) {
                            if (i38 == 2) {
                                NV8 nv8 = (NV8) unsafe2.getObject(obj4, j);
                                if (!nv8.zzc()) {
                                    int size = nv8.size();
                                    if (size == 0) {
                                        i25 = 10;
                                    } else {
                                        i25 = size + size;
                                    }
                                    nv8 = nv8.mo21037d(i25);
                                    unsafe2.putObject(obj4, j, nv8);
                                }
                                i29 = LK8.m97066e(u192.m82077g(i37), i41, bArr, i40, i2, nv8, c52735zK8);
                                i26 = i2;
                                i27 = i3;
                                i30 = i36;
                                i31 = i37;
                                i33 = i33;
                                i32 = i41;
                                i34 = i34;
                                i28 = -1;
                                bArr2 = bArr;
                            } else {
                                i8 = i33;
                                i23 = i34;
                                i5 = i36;
                                unsafe = unsafe2;
                                i11 = i37;
                                i24 = i40;
                                i9 = -1;
                            }
                        } else {
                            i8 = i33;
                            i23 = i34;
                            if (m82081P <= 49) {
                                i5 = i36;
                                i9 = -1;
                                unsafe = unsafe2;
                                i11 = i37;
                                i29 = m82086K(obj, bArr, i40, i2, i41, i36, i38, i37, i39, m82081P, j, c52735zK8);
                            } else {
                                i5 = i36;
                                unsafe = unsafe2;
                                i11 = i37;
                                i24 = i40;
                                i9 = -1;
                                if (m82081P == 50) {
                                    if (i38 == 2) {
                                        i29 = m82088I(obj, bArr, i24, i2, i11, j, c52735zK8);
                                    }
                                } else {
                                    i29 = m82087J(obj, bArr, i24, i2, i41, i5, i38, i39, m82081P, j, i11, c52735zK8);
                                }
                            }
                        }
                        i10 = i3;
                        i6 = i24;
                        i7 = i41;
                        i34 = i23;
                    }
                }
                if (i7 == i10 && i10 != 0) {
                    u19 = this;
                    obj2 = obj;
                    i4 = i10;
                    i29 = i6;
                    i32 = i7;
                    i33 = i8;
                } else {
                    int i46 = i10;
                    if (this.f36724f) {
                        c52735zK82 = c52735zK8;
                        TQ8 tq8 = c52735zK82.f121113d;
                        if (tq8 != TQ8.f35440c) {
                            i12 = i5;
                            if (tq8.m83662b(this.f36723e, i12) == null) {
                                i29 = LK8.m97062i(i7, bArr, i6, i2, m82094C(obj), c52735zK8);
                                obj3 = obj;
                                i26 = i2;
                                i32 = i7;
                                u192 = this;
                                i30 = i12;
                                obj4 = obj3;
                                i28 = i9;
                                i33 = i8;
                                i31 = i11;
                                bArr2 = bArr;
                                i27 = i46;
                                c52735zK83 = c52735zK82;
                                unsafe2 = unsafe;
                            } else {
                                AbstractC40958fT8 abstractC40958fT8 = (AbstractC40958fT8) obj;
                                throw null;
                            }
                        } else {
                            obj3 = obj;
                            i12 = i5;
                        }
                    } else {
                        obj3 = obj;
                        i12 = i5;
                        c52735zK82 = c52735zK8;
                    }
                    i29 = LK8.m97062i(i7, bArr, i6, i2, m82094C(obj), c52735zK8);
                    i26 = i2;
                    i32 = i7;
                    u192 = this;
                    i30 = i12;
                    obj4 = obj3;
                    i28 = i9;
                    i33 = i8;
                    i31 = i11;
                    bArr2 = bArr;
                    i27 = i46;
                    c52735zK83 = c52735zK82;
                    unsafe2 = unsafe;
                }
            } else {
                unsafe = unsafe2;
                i4 = i27;
                obj2 = obj4;
                u19 = u192;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: G */
    public final int m82090G(Object obj) {
        int i;
        int m88514y;
        int m88514y2;
        int m88513z;
        int m88514y3;
        int m88514y4;
        int m88514y5;
        int m88514y6;
        int m77479R;
        boolean z;
        int m77496A;
        int m77491F;
        int m88514y7;
        int m88514y8;
        int i2;
        int m88514y9;
        int m88514y10;
        int m88514y11;
        int m88514y12;
        Unsafe unsafe = f36718q;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.f36719a.length) {
            int m82080Q = m82080Q(i5);
            int[] iArr = this.f36719a;
            int i8 = iArr[i5];
            int m82081P = m82081P(m82080Q);
            if (m82081P <= 17) {
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
            long j = m82080Q & i3;
            switch (m82081P) {
                case 0:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        m88514y = QP8.m88514y(i8 << 3);
                        m88514y4 = m88514y + 8;
                        i6 += m88514y4;
                        break;
                    }
                case 1:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        m88514y2 = QP8.m88514y(i8 << 3);
                        m88514y4 = m88514y2 + 4;
                        i6 += m88514y4;
                        break;
                    }
                case 2:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        m88513z = QP8.m88513z(unsafe.getLong(obj, j));
                        m88514y3 = QP8.m88514y(i8 << 3);
                        i6 += m88514y3 + m88513z;
                        break;
                    }
                case 3:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        m88513z = QP8.m88513z(unsafe.getLong(obj, j));
                        m88514y3 = QP8.m88514y(i8 << 3);
                        i6 += m88514y3 + m88513z;
                        break;
                    }
                case 4:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        m88513z = QP8.m88517v(unsafe.getInt(obj, j));
                        m88514y3 = QP8.m88514y(i8 << 3);
                        i6 += m88514y3 + m88513z;
                        break;
                    }
                case 5:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        m88514y = QP8.m88514y(i8 << 3);
                        m88514y4 = m88514y + 8;
                        i6 += m88514y4;
                        break;
                    }
                case 6:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        m88514y2 = QP8.m88514y(i8 << 3);
                        m88514y4 = m88514y2 + 4;
                        i6 += m88514y4;
                        break;
                    }
                case 7:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        m88514y4 = QP8.m88514y(i8 << 3) + 1;
                        i6 += m88514y4;
                        break;
                    }
                case 8:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof AbstractC40913fO8) {
                            Logger logger = QP8.f30335b;
                            int mo41437c = ((AbstractC40913fO8) object).mo41437c();
                            m88514y5 = QP8.m88514y(mo41437c) + mo41437c;
                            m88514y6 = QP8.m88514y(i8 << 3);
                            m88514y4 = m88514y6 + m88514y5;
                            i6 += m88514y4;
                            break;
                        } else {
                            m88513z = QP8.m88515x((String) object);
                            m88514y3 = QP8.m88514y(i8 << 3);
                            i6 += m88514y3 + m88513z;
                            break;
                        }
                    }
                case 9:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        m88514y4 = X39.m77485L(i8, unsafe.getObject(obj, j), m82077g(i5));
                        i6 += m88514y4;
                        break;
                    }
                case 10:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        Logger logger2 = QP8.f30335b;
                        int mo41437c2 = ((AbstractC40913fO8) unsafe.getObject(obj, j)).mo41437c();
                        m88514y5 = QP8.m88514y(mo41437c2) + mo41437c2;
                        m88514y6 = QP8.m88514y(i8 << 3);
                        m88514y4 = m88514y6 + m88514y5;
                        i6 += m88514y4;
                        break;
                    }
                case 11:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        m88513z = QP8.m88514y(unsafe.getInt(obj, j));
                        m88514y3 = QP8.m88514y(i8 << 3);
                        i6 += m88514y3 + m88513z;
                        break;
                    }
                case 12:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        m88513z = QP8.m88517v(unsafe.getInt(obj, j));
                        m88514y3 = QP8.m88514y(i8 << 3);
                        i6 += m88514y3 + m88513z;
                        break;
                    }
                case 13:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        m88514y2 = QP8.m88514y(i8 << 3);
                        m88514y4 = m88514y2 + 4;
                        i6 += m88514y4;
                        break;
                    }
                case 14:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        m88514y = QP8.m88514y(i8 << 3);
                        m88514y4 = m88514y + 8;
                        i6 += m88514y4;
                        break;
                    }
                case 15:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        int i12 = unsafe.getInt(obj, j);
                        m88514y3 = QP8.m88514y(i8 << 3);
                        m88513z = QP8.m88514y((i12 >> 31) ^ (i12 + i12));
                        i6 += m88514y3 + m88513z;
                        break;
                    }
                case 16:
                    if ((i & i7) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        i6 += QP8.m88514y(i8 << 3) + QP8.m88513z((j2 >> 63) ^ (j2 + j2));
                        break;
                    }
                case 17:
                    if ((i7 & i) == 0) {
                        break;
                    } else {
                        m88514y4 = QP8.m88518u(i8, (InterfaceC47814r19) unsafe.getObject(obj, j), m82077g(i5));
                        i6 += m88514y4;
                        break;
                    }
                case 18:
                    m88514y4 = X39.m77492E(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m88514y4;
                    break;
                case 19:
                    m88514y4 = X39.m77494C(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m88514y4;
                    break;
                case 20:
                    m88514y4 = X39.m77487J(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m88514y4;
                    break;
                case 21:
                    m88514y4 = X39.m77476U(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m88514y4;
                    break;
                case 22:
                    m88514y4 = X39.m77489H(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m88514y4;
                    break;
                case 23:
                    m88514y4 = X39.m77492E(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m88514y4;
                    break;
                case 24:
                    m88514y4 = X39.m77494C(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m88514y4;
                    break;
                case 25:
                    m88514y4 = X39.m77448y(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m88514y4;
                    break;
                case 26:
                    m77479R = X39.m77479R(i8, (List) unsafe.getObject(obj, j));
                    i6 += m77479R;
                    break;
                case 27:
                    m77479R = X39.m77484M(i8, (List) unsafe.getObject(obj, j), m82077g(i5));
                    i6 += m77479R;
                    break;
                case 28:
                    m77479R = X39.m77447z(i8, (List) unsafe.getObject(obj, j));
                    i6 += m77479R;
                    break;
                case 29:
                    m77479R = X39.m77478S(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m77479R;
                    break;
                case 30:
                    z = false;
                    m77496A = X39.m77496A(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m77496A;
                    break;
                case 31:
                    z = false;
                    m77496A = X39.m77494C(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m77496A;
                    break;
                case 32:
                    z = false;
                    m77496A = X39.m77492E(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m77496A;
                    break;
                case 33:
                    z = false;
                    m77496A = X39.m77483N(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m77496A;
                    break;
                case 34:
                    z = false;
                    m77496A = X39.m77481P(i8, (List) unsafe.getObject(obj, j), false);
                    i6 += m77496A;
                    break;
                case 35:
                    m77491F = X39.m77491F((List) unsafe.getObject(obj, j));
                    if (m77491F > 0) {
                        m88514y7 = QP8.m88514y(m77491F);
                        m88514y8 = QP8.m88514y(i8 << 3);
                        i2 = m88514y8 + m88514y7;
                        i6 += i2 + m77491F;
                    }
                    break;
                case 36:
                    m77491F = X39.m77493D((List) unsafe.getObject(obj, j));
                    if (m77491F > 0) {
                        m88514y7 = QP8.m88514y(m77491F);
                        m88514y8 = QP8.m88514y(i8 << 3);
                        i2 = m88514y8 + m88514y7;
                        i6 += i2 + m77491F;
                    }
                    break;
                case 37:
                    m77491F = X39.m77486K((List) unsafe.getObject(obj, j));
                    if (m77491F > 0) {
                        m88514y7 = QP8.m88514y(m77491F);
                        m88514y8 = QP8.m88514y(i8 << 3);
                        i2 = m88514y8 + m88514y7;
                        i6 += i2 + m77491F;
                    }
                    break;
                case 38:
                    m77491F = X39.m77475V((List) unsafe.getObject(obj, j));
                    if (m77491F > 0) {
                        m88514y7 = QP8.m88514y(m77491F);
                        m88514y8 = QP8.m88514y(i8 << 3);
                        i2 = m88514y8 + m88514y7;
                        i6 += i2 + m77491F;
                    }
                    break;
                case 39:
                    m77491F = X39.m77488I((List) unsafe.getObject(obj, j));
                    if (m77491F > 0) {
                        m88514y7 = QP8.m88514y(m77491F);
                        m88514y8 = QP8.m88514y(i8 << 3);
                        i2 = m88514y8 + m88514y7;
                        i6 += i2 + m77491F;
                    }
                    break;
                case 40:
                    m77491F = X39.m77491F((List) unsafe.getObject(obj, j));
                    if (m77491F > 0) {
                        m88514y7 = QP8.m88514y(m77491F);
                        m88514y8 = QP8.m88514y(i8 << 3);
                        i2 = m88514y8 + m88514y7;
                        i6 += i2 + m77491F;
                    }
                    break;
                case 41:
                    m77491F = X39.m77493D((List) unsafe.getObject(obj, j));
                    if (m77491F > 0) {
                        m88514y7 = QP8.m88514y(m77491F);
                        m88514y8 = QP8.m88514y(i8 << 3);
                        i2 = m88514y8 + m88514y7;
                        i6 += i2 + m77491F;
                    }
                    break;
                case 42:
                    Class cls = X39.f42592a;
                    m77491F = ((List) unsafe.getObject(obj, j)).size();
                    if (m77491F > 0) {
                        m88514y7 = QP8.m88514y(m77491F);
                        m88514y8 = QP8.m88514y(i8 << 3);
                        i2 = m88514y8 + m88514y7;
                        i6 += i2 + m77491F;
                    }
                    break;
                case 43:
                    m77491F = X39.m77477T((List) unsafe.getObject(obj, j));
                    if (m77491F > 0) {
                        m88514y7 = QP8.m88514y(m77491F);
                        m88514y8 = QP8.m88514y(i8 << 3);
                        i2 = m88514y8 + m88514y7;
                        i6 += i2 + m77491F;
                    }
                    break;
                case 44:
                    m77491F = X39.m77495B((List) unsafe.getObject(obj, j));
                    if (m77491F > 0) {
                        m88514y7 = QP8.m88514y(m77491F);
                        m88514y8 = QP8.m88514y(i8 << 3);
                        i2 = m88514y8 + m88514y7;
                        i6 += i2 + m77491F;
                    }
                    break;
                case 45:
                    m77491F = X39.m77493D((List) unsafe.getObject(obj, j));
                    if (m77491F > 0) {
                        m88514y7 = QP8.m88514y(m77491F);
                        m88514y8 = QP8.m88514y(i8 << 3);
                        i2 = m88514y8 + m88514y7;
                        i6 += i2 + m77491F;
                    }
                    break;
                case 46:
                    m77491F = X39.m77491F((List) unsafe.getObject(obj, j));
                    if (m77491F > 0) {
                        m88514y7 = QP8.m88514y(m77491F);
                        m88514y8 = QP8.m88514y(i8 << 3);
                        i2 = m88514y8 + m88514y7;
                        i6 += i2 + m77491F;
                    }
                    break;
                case 47:
                    m77491F = X39.m77482O((List) unsafe.getObject(obj, j));
                    if (m77491F > 0) {
                        m88514y7 = QP8.m88514y(m77491F);
                        m88514y8 = QP8.m88514y(i8 << 3);
                        i2 = m88514y8 + m88514y7;
                        i6 += i2 + m77491F;
                    }
                    break;
                case 48:
                    m77491F = X39.m77480Q((List) unsafe.getObject(obj, j));
                    if (m77491F > 0) {
                        m88514y7 = QP8.m88514y(m77491F);
                        m88514y8 = QP8.m88514y(i8 << 3);
                        i2 = m88514y8 + m88514y7;
                        i6 += i2 + m77491F;
                    }
                    break;
                case 49:
                    m77479R = X39.m77490G(i8, (List) unsafe.getObject(obj, j), m82077g(i5));
                    i6 += m77479R;
                    break;
                case 50:
                    C50175v09.m9387a(i8, unsafe.getObject(obj, j), m82076h(i5));
                    break;
                case 51:
                    if (m82059y(obj, i8, i5)) {
                        m88514y9 = QP8.m88514y(i8 << 3);
                        m77479R = m88514y9 + 8;
                        i6 += m77479R;
                    }
                    break;
                case 52:
                    if (m82059y(obj, i8, i5)) {
                        m88514y10 = QP8.m88514y(i8 << 3);
                        m77479R = m88514y10 + 4;
                        i6 += m77479R;
                    }
                    break;
                case 53:
                    if (m82059y(obj, i8, i5)) {
                        m77491F = QP8.m88513z(m82079R(obj, j));
                        i2 = QP8.m88514y(i8 << 3);
                        i6 += i2 + m77491F;
                    }
                    break;
                case 54:
                    if (m82059y(obj, i8, i5)) {
                        m77491F = QP8.m88513z(m82079R(obj, j));
                        i2 = QP8.m88514y(i8 << 3);
                        i6 += i2 + m77491F;
                    }
                    break;
                case 55:
                    if (m82059y(obj, i8, i5)) {
                        m77491F = QP8.m88517v(m82089H(obj, j));
                        i2 = QP8.m88514y(i8 << 3);
                        i6 += i2 + m77491F;
                    }
                    break;
                case 56:
                    if (m82059y(obj, i8, i5)) {
                        m88514y9 = QP8.m88514y(i8 << 3);
                        m77479R = m88514y9 + 8;
                        i6 += m77479R;
                    }
                    break;
                case 57:
                    if (m82059y(obj, i8, i5)) {
                        m88514y10 = QP8.m88514y(i8 << 3);
                        m77479R = m88514y10 + 4;
                        i6 += m77479R;
                    }
                    break;
                case 58:
                    if (m82059y(obj, i8, i5)) {
                        m77479R = QP8.m88514y(i8 << 3) + 1;
                        i6 += m77479R;
                    }
                    break;
                case 59:
                    if (m82059y(obj, i8, i5)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof AbstractC40913fO8) {
                            Logger logger3 = QP8.f30335b;
                            int mo41437c3 = ((AbstractC40913fO8) object2).mo41437c();
                            m88514y11 = QP8.m88514y(mo41437c3) + mo41437c3;
                            m88514y12 = QP8.m88514y(i8 << 3);
                            m77479R = m88514y12 + m88514y11;
                            i6 += m77479R;
                        } else {
                            m77491F = QP8.m88515x((String) object2);
                            i2 = QP8.m88514y(i8 << 3);
                            i6 += i2 + m77491F;
                        }
                    }
                    break;
                case 60:
                    if (m82059y(obj, i8, i5)) {
                        m77479R = X39.m77485L(i8, unsafe.getObject(obj, j), m82077g(i5));
                        i6 += m77479R;
                    }
                    break;
                case 61:
                    if (m82059y(obj, i8, i5)) {
                        Logger logger4 = QP8.f30335b;
                        int mo41437c4 = ((AbstractC40913fO8) unsafe.getObject(obj, j)).mo41437c();
                        m88514y11 = QP8.m88514y(mo41437c4) + mo41437c4;
                        m88514y12 = QP8.m88514y(i8 << 3);
                        m77479R = m88514y12 + m88514y11;
                        i6 += m77479R;
                    }
                    break;
                case 62:
                    if (m82059y(obj, i8, i5)) {
                        m77491F = QP8.m88514y(m82089H(obj, j));
                        i2 = QP8.m88514y(i8 << 3);
                        i6 += i2 + m77491F;
                    }
                    break;
                case 63:
                    if (m82059y(obj, i8, i5)) {
                        m77491F = QP8.m88517v(m82089H(obj, j));
                        i2 = QP8.m88514y(i8 << 3);
                        i6 += i2 + m77491F;
                    }
                    break;
                case 64:
                    if (m82059y(obj, i8, i5)) {
                        m88514y10 = QP8.m88514y(i8 << 3);
                        m77479R = m88514y10 + 4;
                        i6 += m77479R;
                    }
                    break;
                case 65:
                    if (m82059y(obj, i8, i5)) {
                        m88514y9 = QP8.m88514y(i8 << 3);
                        m77479R = m88514y9 + 8;
                        i6 += m77479R;
                    }
                    break;
                case 66:
                    if (m82059y(obj, i8, i5)) {
                        int m82089H = m82089H(obj, j);
                        i2 = QP8.m88514y(i8 << 3);
                        m77491F = QP8.m88514y((m82089H >> 31) ^ (m82089H + m82089H));
                        i6 += i2 + m77491F;
                    }
                    break;
                case 67:
                    if (m82059y(obj, i8, i5)) {
                        long m82079R = m82079R(obj, j);
                        i6 += QP8.m88514y(i8 << 3) + QP8.m88513z((m82079R >> 63) ^ (m82079R + m82079R));
                    }
                    break;
                case 68:
                    if (m82059y(obj, i8, i5)) {
                        m77479R = QP8.m88518u(i8, (InterfaceC47814r19) unsafe.getObject(obj, j), m82077g(i5));
                        i6 += m77479R;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        Q69 q69 = this.f36730l;
        int mo41976a = i6 + q69.mo41976a(q69.mo41973d(obj));
        if (!this.f36724f) {
            return mo41976a;
        }
        this.f36731m.mo23748a(obj);
        throw null;
    }

    /* renamed from: I */
    public final int m82088I(Object obj, byte[] bArr, int i, int i2, int i3, long j, C52735zK8 c52735zK8) throws IOException {
        Unsafe unsafe = f36718q;
        Object m82076h = m82076h(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((C44839m09) object).m26545h()) {
            C44839m09 m26548e = C44839m09.m26549d().m26548e();
            C50175v09.m9386b(m26548e, object);
            unsafe.putObject(obj, j, m26548e);
        }
        C39503d09 c39503d09 = (C39503d09) m82076h;
        throw null;
    }

    /* renamed from: J */
    public final int m82087J(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C52735zK8 c52735zK8) throws IOException {
        boolean z;
        Unsafe unsafe = f36718q;
        long j2 = this.f36719a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(LK8.m97055p(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(LK8.m97069b(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int m97058m = LK8.m97058m(bArr, i, c52735zK8);
                    unsafe.putObject(obj, j, Long.valueOf(c52735zK8.f121111b));
                    unsafe.putInt(obj, j2, i4);
                    return m97058m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m97061j = LK8.m97061j(bArr, i, c52735zK8);
                    unsafe.putObject(obj, j, Integer.valueOf(c52735zK8.f121110a));
                    unsafe.putInt(obj, j2, i4);
                    return m97061j;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(LK8.m97055p(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(LK8.m97069b(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m97058m2 = LK8.m97058m(bArr, i, c52735zK8);
                    if (c52735zK8.f121111b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z));
                    unsafe.putInt(obj, j2, i4);
                    return m97058m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int m97061j2 = LK8.m97061j(bArr, i, c52735zK8);
                    int i13 = c52735zK8.f121110a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !Z89.m73651e(bArr, m97061j2, m97061j2 + i13)) {
                        throw zzll.m51342c();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m97061j2, i13, XV8.f43342b));
                        m97061j2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m97061j2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object m82074j = m82074j(obj, i4, i8);
                    int m97056o = LK8.m97056o(m82074j, m82077g(i8), bArr, i, i2, c52735zK8);
                    m82066r(obj, i4, i8, m82074j);
                    return m97056o;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m97070a = LK8.m97070a(bArr, i, c52735zK8);
                    unsafe.putObject(obj, j, c52735zK8.f121112c);
                    unsafe.putInt(obj, j2, i4);
                    return m97070a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m97061j3 = LK8.m97061j(bArr, i, c52735zK8);
                    int i14 = c52735zK8.f121110a;
                    InterfaceC41569gV8 m82078f = m82078f(i8);
                    if (m82078f != null && !m82078f.zza(i14)) {
                        m82094C(obj).m75680j(i3, Long.valueOf(i14));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return m97061j3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int m97061j4 = LK8.m97061j(bArr, i, c52735zK8);
                    unsafe.putObject(obj, j, Integer.valueOf(ZO8.m73210a(c52735zK8.f121110a)));
                    unsafe.putInt(obj, j2, i4);
                    return m97061j4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int m97058m3 = LK8.m97058m(bArr, i, c52735zK8);
                    unsafe.putObject(obj, j, Long.valueOf(ZO8.m73209b(c52735zK8.f121111b)));
                    unsafe.putInt(obj, j2, i4);
                    return m97058m3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object m82074j2 = m82074j(obj, i4, i8);
                    int m97057n = LK8.m97057n(m82074j2, m82077g(i8), bArr, i, i2, (i3 & (-8)) | 4, c52735zK8);
                    m82066r(obj, i4, i8, m82074j2);
                    return m97057n;
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
    public final int m82086K(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C52735zK8 c52735zK8) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        boolean z3;
        int i12;
        int m97059l;
        int i13;
        int i14 = i;
        Unsafe unsafe = f36718q;
        NV8 nv8 = (NV8) unsafe.getObject(obj, j2);
        if (!nv8.zzc()) {
            int size = nv8.size();
            if (size == 0) {
                i13 = 10;
            } else {
                i13 = size + size;
            }
            nv8 = nv8.mo21037d(i13);
            unsafe.putObject(obj, j2, nv8);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    C45082mQ8 c45082mQ8 = (C45082mQ8) nv8;
                    int m97061j = LK8.m97061j(bArr, i14, c52735zK8);
                    int i15 = c52735zK8.f121110a + m97061j;
                    while (m97061j < i15) {
                        c45082mQ8.m25650b(Double.longBitsToDouble(LK8.m97055p(bArr, m97061j)));
                        m97061j += 8;
                    }
                    if (m97061j != i15) {
                        throw zzll.m51339f();
                    }
                    return m97061j;
                } else if (i5 == 1) {
                    C45082mQ8 c45082mQ82 = (C45082mQ8) nv8;
                    c45082mQ82.m25650b(Double.longBitsToDouble(LK8.m97055p(bArr, i)));
                    while (true) {
                        i8 = i14 + 8;
                        if (i8 < i2) {
                            i14 = LK8.m97061j(bArr, i8, c52735zK8);
                            if (i3 == c52735zK8.f121110a) {
                                c45082mQ82.m25650b(Double.longBitsToDouble(LK8.m97055p(bArr, i14)));
                            }
                        }
                    }
                    return i8;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    C46286oS8 c46286oS8 = (C46286oS8) nv8;
                    int m97061j2 = LK8.m97061j(bArr, i14, c52735zK8);
                    int i16 = c52735zK8.f121110a + m97061j2;
                    while (m97061j2 < i16) {
                        c46286oS8.m21039b(Float.intBitsToFloat(LK8.m97069b(bArr, m97061j2)));
                        m97061j2 += 4;
                    }
                    if (m97061j2 != i16) {
                        throw zzll.m51339f();
                    }
                    return m97061j2;
                } else if (i5 == 5) {
                    C46286oS8 c46286oS82 = (C46286oS8) nv8;
                    c46286oS82.m21039b(Float.intBitsToFloat(LK8.m97069b(bArr, i)));
                    while (true) {
                        i9 = i14 + 4;
                        if (i9 < i2) {
                            i14 = LK8.m97061j(bArr, i9, c52735zK8);
                            if (i3 == c52735zK8.f121110a) {
                                c46286oS82.m21039b(Float.intBitsToFloat(LK8.m97069b(bArr, i14)));
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
                    IY8 iy8 = (IY8) nv8;
                    int m97061j3 = LK8.m97061j(bArr, i14, c52735zK8);
                    int i17 = c52735zK8.f121110a + m97061j3;
                    while (m97061j3 < i17) {
                        m97061j3 = LK8.m97058m(bArr, m97061j3, c52735zK8);
                        iy8.m101934c(c52735zK8.f121111b);
                    }
                    if (m97061j3 != i17) {
                        throw zzll.m51339f();
                    }
                    return m97061j3;
                } else if (i5 == 0) {
                    IY8 iy82 = (IY8) nv8;
                    int m97058m = LK8.m97058m(bArr, i14, c52735zK8);
                    iy82.m101934c(c52735zK8.f121111b);
                    while (m97058m < i2) {
                        int m97061j4 = LK8.m97061j(bArr, m97058m, c52735zK8);
                        if (i3 == c52735zK8.f121110a) {
                            m97058m = LK8.m97058m(bArr, m97061j4, c52735zK8);
                            iy82.m101934c(c52735zK8.f121111b);
                        } else {
                            return m97058m;
                        }
                    }
                    return m97058m;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return LK8.m97065f(bArr, i14, nv8, c52735zK8);
                }
                if (i5 == 0) {
                    return LK8.m97059l(i3, bArr, i, i2, nv8, c52735zK8);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    IY8 iy83 = (IY8) nv8;
                    int m97061j5 = LK8.m97061j(bArr, i14, c52735zK8);
                    int i18 = c52735zK8.f121110a + m97061j5;
                    while (m97061j5 < i18) {
                        iy83.m101934c(LK8.m97055p(bArr, m97061j5));
                        m97061j5 += 8;
                    }
                    if (m97061j5 != i18) {
                        throw zzll.m51339f();
                    }
                    return m97061j5;
                } else if (i5 == 1) {
                    IY8 iy84 = (IY8) nv8;
                    iy84.m101934c(LK8.m97055p(bArr, i));
                    while (true) {
                        i10 = i14 + 8;
                        if (i10 < i2) {
                            i14 = LK8.m97061j(bArr, i10, c52735zK8);
                            if (i3 == c52735zK8.f121110a) {
                                iy84.m101934c(LK8.m97055p(bArr, i14));
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
                    AU8 au8 = (AU8) nv8;
                    int m97061j6 = LK8.m97061j(bArr, i14, c52735zK8);
                    int i19 = c52735zK8.f121110a + m97061j6;
                    while (m97061j6 < i19) {
                        au8.zzh(LK8.m97069b(bArr, m97061j6));
                        m97061j6 += 4;
                    }
                    if (m97061j6 != i19) {
                        throw zzll.m51339f();
                    }
                    return m97061j6;
                } else if (i5 == 5) {
                    AU8 au82 = (AU8) nv8;
                    au82.zzh(LK8.m97069b(bArr, i));
                    while (true) {
                        i11 = i14 + 4;
                        if (i11 < i2) {
                            i14 = LK8.m97061j(bArr, i11, c52735zK8);
                            if (i3 == c52735zK8.f121110a) {
                                au82.zzh(LK8.m97069b(bArr, i14));
                            }
                        }
                    }
                    return i11;
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    XK8 xk8 = (XK8) nv8;
                    int m97061j7 = LK8.m97061j(bArr, i14, c52735zK8);
                    int i20 = c52735zK8.f121110a + m97061j7;
                    while (m97061j7 < i20) {
                        m97061j7 = LK8.m97058m(bArr, m97061j7, c52735zK8);
                        if (c52735zK8.f121111b != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        xk8.m77111b(z3);
                    }
                    if (m97061j7 != i20) {
                        throw zzll.m51339f();
                    }
                    return m97061j7;
                } else if (i5 == 0) {
                    XK8 xk82 = (XK8) nv8;
                    int m97058m2 = LK8.m97058m(bArr, i14, c52735zK8);
                    if (c52735zK8.f121111b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    xk82.m77111b(z);
                    while (m97058m2 < i2) {
                        int m97061j8 = LK8.m97061j(bArr, m97058m2, c52735zK8);
                        if (i3 == c52735zK8.f121110a) {
                            m97058m2 = LK8.m97058m(bArr, m97061j8, c52735zK8);
                            if (c52735zK8.f121111b != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            xk82.m77111b(z2);
                        } else {
                            return m97058m2;
                        }
                    }
                    return m97058m2;
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int m97061j9 = LK8.m97061j(bArr, i14, c52735zK8);
                        int i21 = c52735zK8.f121110a;
                        if (i21 >= 0) {
                            if (i21 == 0) {
                                nv8.add("");
                                while (m97061j9 < i2) {
                                    int m97061j10 = LK8.m97061j(bArr, m97061j9, c52735zK8);
                                    if (i3 == c52735zK8.f121110a) {
                                        m97061j9 = LK8.m97061j(bArr, m97061j10, c52735zK8);
                                        i21 = c52735zK8.f121110a;
                                        if (i21 >= 0) {
                                            if (i21 == 0) {
                                                nv8.add("");
                                            } else {
                                                nv8.add(new String(bArr, m97061j9, i21, XV8.f43342b));
                                                m97061j9 += i21;
                                                while (m97061j9 < i2) {
                                                }
                                            }
                                        } else {
                                            throw zzll.m51341d();
                                        }
                                    } else {
                                        return m97061j9;
                                    }
                                }
                                return m97061j9;
                            }
                            nv8.add(new String(bArr, m97061j9, i21, XV8.f43342b));
                            m97061j9 += i21;
                            while (m97061j9 < i2) {
                            }
                            return m97061j9;
                        }
                        throw zzll.m51341d();
                    }
                    int m97061j11 = LK8.m97061j(bArr, i14, c52735zK8);
                    int i22 = c52735zK8.f121110a;
                    if (i22 >= 0) {
                        if (i22 == 0) {
                            nv8.add("");
                            while (m97061j11 < i2) {
                                int m97061j12 = LK8.m97061j(bArr, m97061j11, c52735zK8);
                                if (i3 == c52735zK8.f121110a) {
                                    m97061j11 = LK8.m97061j(bArr, m97061j12, c52735zK8);
                                    int i23 = c52735zK8.f121110a;
                                    if (i23 >= 0) {
                                        if (i23 == 0) {
                                            nv8.add("");
                                        } else {
                                            i12 = m97061j11 + i23;
                                            if (Z89.m73651e(bArr, m97061j11, i12)) {
                                                nv8.add(new String(bArr, m97061j11, i23, XV8.f43342b));
                                                m97061j11 = i12;
                                                while (m97061j11 < i2) {
                                                }
                                            } else {
                                                throw zzll.m51342c();
                                            }
                                        }
                                    } else {
                                        throw zzll.m51341d();
                                    }
                                } else {
                                    return m97061j11;
                                }
                            }
                            return m97061j11;
                        }
                        i12 = m97061j11 + i22;
                        if (Z89.m73651e(bArr, m97061j11, i12)) {
                            nv8.add(new String(bArr, m97061j11, i22, XV8.f43342b));
                            m97061j11 = i12;
                            while (m97061j11 < i2) {
                            }
                            return m97061j11;
                        }
                        throw zzll.m51342c();
                    }
                    throw zzll.m51341d();
                }
                break;
            case 27:
                if (i5 == 2) {
                    return LK8.m97066e(m82077g(i6), i3, bArr, i, i2, nv8, c52735zK8);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int m97061j13 = LK8.m97061j(bArr, i14, c52735zK8);
                    int i24 = c52735zK8.f121110a;
                    if (i24 >= 0) {
                        if (i24 <= bArr.length - m97061j13) {
                            if (i24 == 0) {
                                nv8.add(AbstractC40913fO8.f80055c);
                                while (m97061j13 < i2) {
                                    int m97061j14 = LK8.m97061j(bArr, m97061j13, c52735zK8);
                                    if (i3 == c52735zK8.f121110a) {
                                        m97061j13 = LK8.m97061j(bArr, m97061j14, c52735zK8);
                                        i24 = c52735zK8.f121110a;
                                        if (i24 >= 0) {
                                            if (i24 <= bArr.length - m97061j13) {
                                                if (i24 == 0) {
                                                    nv8.add(AbstractC40913fO8.f80055c);
                                                } else {
                                                    nv8.add(AbstractC40913fO8.m41429v(bArr, m97061j13, i24));
                                                    m97061j13 += i24;
                                                    while (m97061j13 < i2) {
                                                    }
                                                }
                                            } else {
                                                throw zzll.m51339f();
                                            }
                                        } else {
                                            throw zzll.m51341d();
                                        }
                                    } else {
                                        return m97061j13;
                                    }
                                }
                                return m97061j13;
                            }
                            nv8.add(AbstractC40913fO8.m41429v(bArr, m97061j13, i24));
                            m97061j13 += i24;
                            while (m97061j13 < i2) {
                            }
                            return m97061j13;
                        }
                        throw zzll.m51339f();
                    }
                    throw zzll.m51341d();
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    m97059l = LK8.m97065f(bArr, i14, nv8, c52735zK8);
                } else if (i5 == 0) {
                    m97059l = LK8.m97059l(i3, bArr, i, i2, nv8, c52735zK8);
                }
                InterfaceC41569gV8 m82078f = m82078f(i6);
                Q69 q69 = this.f36730l;
                Class cls = X39.f42592a;
                if (m82078f != null) {
                    Object obj2 = null;
                    if (nv8 instanceof RandomAccess) {
                        int size2 = nv8.size();
                        int i25 = 0;
                        for (int i26 = 0; i26 < size2; i26++) {
                            int intValue = ((Integer) nv8.get(i26)).intValue();
                            if (m82078f.zza(intValue)) {
                                if (i26 != i25) {
                                    nv8.set(i25, Integer.valueOf(intValue));
                                }
                                i25++;
                            } else {
                                obj2 = X39.m77471b(obj, i4, intValue, obj2, q69);
                            }
                        }
                        if (i25 != size2) {
                            nv8.subList(i25, size2).clear();
                            return m97059l;
                        }
                    } else {
                        Iterator it = nv8.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!m82078f.zza(intValue2)) {
                                obj2 = X39.m77471b(obj, i4, intValue2, obj2, q69);
                                it.remove();
                            }
                        }
                    }
                }
                return m97059l;
            case 33:
            case 47:
                if (i5 == 2) {
                    AU8 au83 = (AU8) nv8;
                    int m97061j15 = LK8.m97061j(bArr, i14, c52735zK8);
                    int i27 = c52735zK8.f121110a + m97061j15;
                    while (m97061j15 < i27) {
                        m97061j15 = LK8.m97061j(bArr, m97061j15, c52735zK8);
                        au83.zzh(ZO8.m73210a(c52735zK8.f121110a));
                    }
                    if (m97061j15 != i27) {
                        throw zzll.m51339f();
                    }
                    return m97061j15;
                } else if (i5 == 0) {
                    AU8 au84 = (AU8) nv8;
                    int m97061j16 = LK8.m97061j(bArr, i14, c52735zK8);
                    au84.zzh(ZO8.m73210a(c52735zK8.f121110a));
                    while (m97061j16 < i2) {
                        int m97061j17 = LK8.m97061j(bArr, m97061j16, c52735zK8);
                        if (i3 == c52735zK8.f121110a) {
                            m97061j16 = LK8.m97061j(bArr, m97061j17, c52735zK8);
                            au84.zzh(ZO8.m73210a(c52735zK8.f121110a));
                        } else {
                            return m97061j16;
                        }
                    }
                    return m97061j16;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    IY8 iy85 = (IY8) nv8;
                    int m97061j18 = LK8.m97061j(bArr, i14, c52735zK8);
                    int i28 = c52735zK8.f121110a + m97061j18;
                    while (m97061j18 < i28) {
                        m97061j18 = LK8.m97058m(bArr, m97061j18, c52735zK8);
                        iy85.m101934c(ZO8.m73209b(c52735zK8.f121111b));
                    }
                    if (m97061j18 != i28) {
                        throw zzll.m51339f();
                    }
                    return m97061j18;
                } else if (i5 == 0) {
                    IY8 iy86 = (IY8) nv8;
                    int m97058m3 = LK8.m97058m(bArr, i14, c52735zK8);
                    iy86.m101934c(ZO8.m73209b(c52735zK8.f121111b));
                    while (m97058m3 < i2) {
                        int m97061j19 = LK8.m97061j(bArr, m97058m3, c52735zK8);
                        if (i3 == c52735zK8.f121110a) {
                            m97058m3 = LK8.m97058m(bArr, m97061j19, c52735zK8);
                            iy86.m101934c(ZO8.m73209b(c52735zK8.f121111b));
                        } else {
                            return m97058m3;
                        }
                    }
                    return m97058m3;
                }
                break;
            default:
                if (i5 == 3) {
                    F39 m82077g = m82077g(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int m97068c = LK8.m97068c(m82077g, bArr, i, i2, i29, c52735zK8);
                    nv8.add(c52735zK8.f121112c);
                    while (m97068c < i2) {
                        int m97061j20 = LK8.m97061j(bArr, m97068c, c52735zK8);
                        if (i3 == c52735zK8.f121110a) {
                            m97068c = LK8.m97068c(m82077g, bArr, m97061j20, i2, i29, c52735zK8);
                            nv8.add(c52735zK8.f121112c);
                        } else {
                            return m97068c;
                        }
                    }
                    return m97068c;
                }
                break;
        }
        return i14;
    }

    /* renamed from: L */
    public final int m82085L(int i) {
        if (i < this.f36721c || i > this.f36722d) {
            return -1;
        }
        return m82082O(i, 0);
    }

    /* renamed from: M */
    public final int m82084M(int i, int i2) {
        if (i < this.f36721c || i > this.f36722d) {
            return -1;
        }
        return m82082O(i, i2);
    }

    /* renamed from: N */
    public final int m82083N(int i) {
        return this.f36719a[i + 2];
    }

    /* renamed from: O */
    public final int m82082O(int i, int i2) {
        int length = (this.f36719a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f36719a[i4];
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
    public final int m82080Q(int i) {
        return this.f36719a[i + 1];
    }

    @Override // p000.F39
    /* renamed from: a */
    public final void mo43319a(Object obj, Object obj2) {
        m82072l(obj);
        obj2.getClass();
        for (int i = 0; i < this.f36719a.length; i += 3) {
            int m82080Q = m82080Q(i);
            int i2 = this.f36719a[i];
            long j = 1048575 & m82080Q;
            switch (m82081P(m82080Q)) {
                case 0:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26259t(obj, j, C44919m89.m26273f(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26258u(obj, j, C44919m89.m26272g(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26256w(obj, j, C44919m89.m26270i(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26256w(obj, j, C44919m89.m26270i(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26257v(obj, j, C44919m89.m26271h(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26256w(obj, j, C44919m89.m26270i(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26257v(obj, j, C44919m89.m26271h(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26261r(obj, j, C44919m89.m26282B(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26255x(obj, j, C44919m89.m26268k(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m82071m(obj, obj2, i);
                    break;
                case 10:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26255x(obj, j, C44919m89.m26268k(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26257v(obj, j, C44919m89.m26271h(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26257v(obj, j, C44919m89.m26271h(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26257v(obj, j, C44919m89.m26271h(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26256w(obj, j, C44919m89.m26270i(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26257v(obj, j, C44919m89.m26271h(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m82063u(obj2, i)) {
                        C44919m89.m26256w(obj, j, C44919m89.m26270i(obj2, j));
                        m82069o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m82071m(obj, obj2, i);
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
                    this.f36729k.mo3269b(obj, obj2, j);
                    break;
                case 50:
                    Class cls = X39.f42592a;
                    C44919m89.m26255x(obj, j, C50175v09.m9386b(C44919m89.m26268k(obj, j), C44919m89.m26268k(obj2, j)));
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
                    if (m82059y(obj2, i2, i)) {
                        C44919m89.m26255x(obj, j, C44919m89.m26268k(obj2, j));
                        m82068p(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m82070n(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m82059y(obj2, i2, i)) {
                        C44919m89.m26255x(obj, j, C44919m89.m26268k(obj2, j));
                        m82068p(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m82070n(obj, obj2, i);
                    break;
            }
        }
        X39.m77470c(this.f36730l, obj, obj2);
        if (!this.f36724f) {
            return;
        }
        this.f36731m.mo23748a(obj2);
        throw null;
    }

    @Override // p000.F39
    /* renamed from: b */
    public final boolean mo43318b(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.f36727i) {
            int i6 = this.f36726h[i4];
            int i7 = this.f36719a[i6];
            int m82080Q = m82080Q(i6);
            int i8 = this.f36719a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = f36718q.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & m82080Q) != 0 && !m82062v(obj, i6, i, i2, i10)) {
                return false;
            }
            int m82081P = m82081P(m82080Q);
            if (m82081P != 9 && m82081P != 17) {
                if (m82081P != 27) {
                    if (m82081P != 60 && m82081P != 68) {
                        if (m82081P != 49) {
                            if (m82081P == 50 && !((C44839m09) C44919m89.m26268k(obj, m82080Q & 1048575)).isEmpty()) {
                                C39503d09 c39503d09 = (C39503d09) m82076h(i6);
                                throw null;
                            }
                        }
                    } else if (m82059y(obj, i7, i6) && !m82061w(obj, m82080Q, m82077g(i6))) {
                        return false;
                    }
                }
                List list = (List) C44919m89.m26268k(obj, m82080Q & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    F39 m82077g = m82077g(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m82077g.mo43318b(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m82062v(obj, i6, i, i2, i10) && !m82061w(obj, m82080Q, m82077g(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        if (!this.f36724f) {
            return true;
        }
        this.f36731m.mo23748a(obj);
        throw null;
    }

    @Override // p000.F39
    /* renamed from: c */
    public final boolean mo43317c(Object obj, Object obj2) {
        boolean m77450w;
        int length = this.f36719a.length;
        for (int i = 0; i < length; i += 3) {
            int m82080Q = m82080Q(i);
            long j = m82080Q & 1048575;
            switch (m82081P(m82080Q)) {
                case 0:
                    if (m82064t(obj, obj2, i) && Double.doubleToLongBits(C44919m89.m26273f(obj, j)) == Double.doubleToLongBits(C44919m89.m26273f(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m82064t(obj, obj2, i) && Float.floatToIntBits(C44919m89.m26272g(obj, j)) == Float.floatToIntBits(C44919m89.m26272g(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m82064t(obj, obj2, i) && C44919m89.m26270i(obj, j) == C44919m89.m26270i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m82064t(obj, obj2, i) && C44919m89.m26270i(obj, j) == C44919m89.m26270i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m82064t(obj, obj2, i) && C44919m89.m26271h(obj, j) == C44919m89.m26271h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m82064t(obj, obj2, i) && C44919m89.m26270i(obj, j) == C44919m89.m26270i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m82064t(obj, obj2, i) && C44919m89.m26271h(obj, j) == C44919m89.m26271h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m82064t(obj, obj2, i) && C44919m89.m26282B(obj, j) == C44919m89.m26282B(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m82064t(obj, obj2, i) && X39.m77450w(C44919m89.m26268k(obj, j), C44919m89.m26268k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m82064t(obj, obj2, i) && X39.m77450w(C44919m89.m26268k(obj, j), C44919m89.m26268k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m82064t(obj, obj2, i) && X39.m77450w(C44919m89.m26268k(obj, j), C44919m89.m26268k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m82064t(obj, obj2, i) && C44919m89.m26271h(obj, j) == C44919m89.m26271h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m82064t(obj, obj2, i) && C44919m89.m26271h(obj, j) == C44919m89.m26271h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m82064t(obj, obj2, i) && C44919m89.m26271h(obj, j) == C44919m89.m26271h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m82064t(obj, obj2, i) && C44919m89.m26270i(obj, j) == C44919m89.m26270i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m82064t(obj, obj2, i) && C44919m89.m26271h(obj, j) == C44919m89.m26271h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m82064t(obj, obj2, i) && C44919m89.m26270i(obj, j) == C44919m89.m26270i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m82064t(obj, obj2, i) && X39.m77450w(C44919m89.m26268k(obj, j), C44919m89.m26268k(obj2, j))) {
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
                    m77450w = X39.m77450w(C44919m89.m26268k(obj, j), C44919m89.m26268k(obj2, j));
                    break;
                case 50:
                    m77450w = X39.m77450w(C44919m89.m26268k(obj, j), C44919m89.m26268k(obj2, j));
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
                    long m82083N = m82083N(i) & 1048575;
                    if (C44919m89.m26271h(obj, m82083N) == C44919m89.m26271h(obj2, m82083N) && X39.m77450w(C44919m89.m26268k(obj, j), C44919m89.m26268k(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!m77450w) {
                return false;
            }
        }
        if (!this.f36730l.mo41973d(obj).equals(this.f36730l.mo41973d(obj2))) {
            return false;
        }
        if (!this.f36724f) {
            return true;
        }
        this.f36731m.mo23748a(obj);
        this.f36731m.mo23748a(obj2);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.F39
    /* renamed from: d */
    public final void mo43316d(Object obj, InterfaceC38633ba9 interfaceC38633ba9) throws IOException {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1048575;
        if (this.f36725g) {
            if (!this.f36724f) {
                int length = this.f36719a.length;
                for (int i6 = 0; i6 < length; i6 += 3) {
                    int m82080Q = m82080Q(i6);
                    int i7 = this.f36719a[i6];
                    switch (m82081P(m82080Q)) {
                        case 0:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64323g(i7, C44919m89.m26273f(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64320j(i7, C44919m89.m26272g(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64317m(i7, C44919m89.m26270i(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64335D(i7, C44919m89.m26270i(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64315o(i7, C44919m89.m26271h(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64319k(i7, C44919m89.m26270i(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64322h(i7, C44919m89.m26271h(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64324f(i7, C44919m89.m26282B(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (m82063u(obj, i6)) {
                                m82096A(i7, C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64334E(i7, C44919m89.m26268k(obj, m82080Q & 1048575), m82077g(i6));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64337B(i7, (AbstractC40913fO8) C44919m89.m26268k(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64304z(i7, C44919m89.m26271h(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64321i(i7, C44919m89.m26271h(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64333F(i7, C44919m89.m26271h(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64332G(i7, C44919m89.m26270i(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64308v(i7, C44919m89.m26271h(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64305y(i7, C44919m89.m26270i(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (m82063u(obj, i6)) {
                                interfaceC38633ba9.mo64330I(i7, C44919m89.m26268k(obj, m82080Q & 1048575), m82077g(i6));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            X39.m77466g(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, false);
                            break;
                        case 19:
                            X39.m77462k(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, false);
                            break;
                        case 20:
                            X39.m77459n(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, false);
                            break;
                        case 21:
                            X39.m77451v(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, false);
                            break;
                        case 22:
                            X39.m77460m(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, false);
                            break;
                        case 23:
                            X39.m77463j(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, false);
                            break;
                        case 24:
                            X39.m77464i(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, false);
                            break;
                        case 25:
                            X39.m77468e(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, false);
                            break;
                        case 26:
                            X39.m77453t(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9);
                            break;
                        case 27:
                            X39.m77458o(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, m82077g(i6));
                            break;
                        case 28:
                            X39.m77467f(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9);
                            break;
                        case 29:
                            X39.m77452u(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, false);
                            break;
                        case 30:
                            X39.m77465h(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, false);
                            break;
                        case 31:
                            X39.m77457p(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, false);
                            break;
                        case 32:
                            X39.m77456q(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, false);
                            break;
                        case 33:
                            X39.m77455r(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, false);
                            break;
                        case 34:
                            X39.m77454s(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, false);
                            break;
                        case 35:
                            X39.m77466g(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, true);
                            break;
                        case 36:
                            X39.m77462k(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, true);
                            break;
                        case 37:
                            X39.m77459n(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, true);
                            break;
                        case 38:
                            X39.m77451v(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, true);
                            break;
                        case 39:
                            X39.m77460m(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, true);
                            break;
                        case 40:
                            X39.m77463j(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, true);
                            break;
                        case 41:
                            X39.m77464i(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, true);
                            break;
                        case 42:
                            X39.m77468e(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, true);
                            break;
                        case 43:
                            X39.m77452u(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, true);
                            break;
                        case 44:
                            X39.m77465h(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, true);
                            break;
                        case 45:
                            X39.m77457p(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, true);
                            break;
                        case 46:
                            X39.m77456q(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, true);
                            break;
                        case 47:
                            X39.m77455r(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, true);
                            break;
                        case 48:
                            X39.m77454s(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, true);
                            break;
                        case 49:
                            X39.m77461l(i7, (List) C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9, m82077g(i6));
                            break;
                        case 50:
                            m82065s(interfaceC38633ba9, i7, C44919m89.m26268k(obj, m82080Q & 1048575), i6);
                            break;
                        case 51:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64323g(i7, m82092E(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64320j(i7, m82091F(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64317m(i7, m82079R(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64335D(i7, m82079R(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64315o(i7, m82089H(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64319k(i7, m82079R(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64322h(i7, m82089H(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64324f(i7, m82058z(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (m82059y(obj, i7, i6)) {
                                m82096A(i7, C44919m89.m26268k(obj, m82080Q & 1048575), interfaceC38633ba9);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64334E(i7, C44919m89.m26268k(obj, m82080Q & 1048575), m82077g(i6));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64337B(i7, (AbstractC40913fO8) C44919m89.m26268k(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64304z(i7, m82089H(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64321i(i7, m82089H(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64333F(i7, m82089H(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64332G(i7, m82079R(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64308v(i7, m82089H(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64305y(i7, m82079R(obj, m82080Q & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (m82059y(obj, i7, i6)) {
                                interfaceC38633ba9.mo64330I(i7, C44919m89.m26268k(obj, m82080Q & 1048575), m82077g(i6));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                Q69 q69 = this.f36730l;
                q69.mo41968i(q69.mo41973d(obj), interfaceC38633ba9);
                return;
            }
            this.f36731m.mo23748a(obj);
            throw null;
        } else if (!this.f36724f) {
            int length2 = this.f36719a.length;
            Unsafe unsafe = f36718q;
            int i8 = 0;
            int i9 = 0;
            int i10 = 1048575;
            while (i8 < length2) {
                int m82080Q2 = m82080Q(i8);
                int[] iArr = this.f36719a;
                int i11 = iArr[i8];
                int m82081P = m82081P(m82080Q2);
                if (m82081P <= 17) {
                    int i12 = iArr[i8 + 2];
                    int i13 = i12 & i5;
                    if (i13 != i10) {
                        i9 = unsafe.getInt(obj, i13);
                        i10 = i13;
                    }
                    i = 1 << (i12 >>> 20);
                } else {
                    i = i4;
                }
                long j = m82080Q2 & i5;
                switch (m82081P) {
                    case 0:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64323g(i11, C44919m89.m26273f(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64320j(i11, C44919m89.m26272g(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64317m(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64335D(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64315o(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64319k(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64322h(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64324f(i11, C44919m89.m26282B(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            m82096A(i11, unsafe.getObject(obj, j), interfaceC38633ba9);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64334E(i11, unsafe.getObject(obj, j), m82077g(i8));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64337B(i11, (AbstractC40913fO8) unsafe.getObject(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64304z(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64321i(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64333F(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64332G(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64308v(i11, unsafe.getInt(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64305y(i11, unsafe.getLong(obj, j));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        i2 = 0;
                        if ((i9 & i) != 0) {
                            interfaceC38633ba9.mo64330I(i11, unsafe.getObject(obj, j), m82077g(i8));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i2 = 0;
                        X39.m77466g(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, false);
                        break;
                    case 19:
                        i2 = 0;
                        X39.m77462k(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, false);
                        break;
                    case 20:
                        i2 = 0;
                        X39.m77459n(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, false);
                        break;
                    case 21:
                        i2 = 0;
                        X39.m77451v(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, false);
                        break;
                    case 22:
                        i2 = 0;
                        X39.m77460m(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, false);
                        break;
                    case 23:
                        i2 = 0;
                        X39.m77463j(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, false);
                        break;
                    case 24:
                        i2 = 0;
                        X39.m77464i(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, false);
                        break;
                    case 25:
                        i2 = 0;
                        X39.m77468e(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, false);
                        break;
                    case 26:
                        X39.m77453t(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9);
                        i2 = 0;
                        break;
                    case 27:
                        X39.m77458o(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, m82077g(i8));
                        i2 = 0;
                        break;
                    case 28:
                        X39.m77467f(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9);
                        i2 = 0;
                        break;
                    case 29:
                        i3 = 0;
                        X39.m77452u(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, false);
                        i2 = i3;
                        break;
                    case 30:
                        i3 = 0;
                        X39.m77465h(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, false);
                        i2 = i3;
                        break;
                    case 31:
                        i3 = 0;
                        X39.m77457p(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, false);
                        i2 = i3;
                        break;
                    case 32:
                        i3 = 0;
                        X39.m77456q(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, false);
                        i2 = i3;
                        break;
                    case 33:
                        i3 = 0;
                        X39.m77455r(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, false);
                        i2 = i3;
                        break;
                    case 34:
                        i3 = 0;
                        X39.m77454s(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, false);
                        i2 = i3;
                        break;
                    case 35:
                        X39.m77466g(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, true);
                        i2 = 0;
                        break;
                    case 36:
                        X39.m77462k(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, true);
                        i2 = 0;
                        break;
                    case 37:
                        X39.m77459n(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, true);
                        i2 = 0;
                        break;
                    case 38:
                        X39.m77451v(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, true);
                        i2 = 0;
                        break;
                    case 39:
                        X39.m77460m(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, true);
                        i2 = 0;
                        break;
                    case 40:
                        X39.m77463j(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, true);
                        i2 = 0;
                        break;
                    case 41:
                        X39.m77464i(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, true);
                        i2 = 0;
                        break;
                    case 42:
                        X39.m77468e(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, true);
                        i2 = 0;
                        break;
                    case 43:
                        X39.m77452u(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, true);
                        i2 = 0;
                        break;
                    case 44:
                        X39.m77465h(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, true);
                        i2 = 0;
                        break;
                    case 45:
                        X39.m77457p(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, true);
                        i2 = 0;
                        break;
                    case 46:
                        X39.m77456q(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, true);
                        i2 = 0;
                        break;
                    case 47:
                        X39.m77455r(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, true);
                        i2 = 0;
                        break;
                    case 48:
                        X39.m77454s(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, true);
                        i2 = 0;
                        break;
                    case 49:
                        X39.m77461l(this.f36719a[i8], (List) unsafe.getObject(obj, j), interfaceC38633ba9, m82077g(i8));
                        i2 = 0;
                        break;
                    case 50:
                        m82065s(interfaceC38633ba9, i11, unsafe.getObject(obj, j), i8);
                        i2 = 0;
                        break;
                    case 51:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64323g(i11, m82092E(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 52:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64320j(i11, m82091F(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 53:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64317m(i11, m82079R(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 54:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64335D(i11, m82079R(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 55:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64315o(i11, m82089H(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 56:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64319k(i11, m82079R(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 57:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64322h(i11, m82089H(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 58:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64324f(i11, m82058z(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 59:
                        if (m82059y(obj, i11, i8)) {
                            m82096A(i11, unsafe.getObject(obj, j), interfaceC38633ba9);
                        }
                        i2 = 0;
                        break;
                    case 60:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64334E(i11, unsafe.getObject(obj, j), m82077g(i8));
                        }
                        i2 = 0;
                        break;
                    case 61:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64337B(i11, (AbstractC40913fO8) unsafe.getObject(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 62:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64304z(i11, m82089H(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 63:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64321i(i11, m82089H(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 64:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64333F(i11, m82089H(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 65:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64332G(i11, m82079R(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 66:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64308v(i11, m82089H(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 67:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64305y(i11, m82079R(obj, j));
                        }
                        i2 = 0;
                        break;
                    case 68:
                        if (m82059y(obj, i11, i8)) {
                            interfaceC38633ba9.mo64330I(i11, unsafe.getObject(obj, j), m82077g(i8));
                        }
                        i2 = 0;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                i8 += 3;
                i4 = i2;
                i5 = 1048575;
            }
            Q69 q692 = this.f36730l;
            q692.mo41968i(q692.mo41973d(obj), interfaceC38633ba9);
        } else {
            this.f36731m.mo23748a(obj);
            throw null;
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
    @Override // p000.F39
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo43315e(Object obj, byte[] bArr, int i, int i2, C52735zK8 c52735zK8) throws IOException {
        byte b;
        int i3;
        int m82085L;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        Unsafe unsafe2;
        int i8;
        Unsafe unsafe3;
        U19<T> u19;
        int i9;
        Unsafe unsafe4;
        int i10;
        int i11;
        int i12;
        U19<T> u192 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i13 = i2;
        C52735zK8 c52735zK82 = c52735zK8;
        if (!u192.f36725g) {
            m82095B(obj, bArr, i, i2, 0, c52735zK8);
            return;
        }
        m82072l(obj);
        Unsafe unsafe5 = f36718q;
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
                i3 = LK8.m97060k(b2, bArr2, i21, c52735zK82);
                b = c52735zK82.f121110a;
            } else {
                b = b2;
                i3 = i21;
            }
            int i22 = b >>> 3;
            if (i22 > i18) {
                m82085L = u192.m82084M(i22, i19 / 3);
            } else {
                m82085L = u192.m82085L(i22);
            }
            int i23 = m82085L;
            if (i23 == i14) {
                i4 = i3;
                i5 = i22;
                unsafe = unsafe5;
                i6 = i14;
                i7 = 0;
            } else {
                int i24 = b & 7;
                int[] iArr = u192.f36719a;
                int i25 = iArr[i23 + 1];
                int m82081P = m82081P(i25);
                Unsafe unsafe6 = unsafe5;
                long j = i25 & i15;
                if (m82081P <= 17) {
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
                    switch (m82081P) {
                        case 0:
                            u19 = this;
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
                                C44919m89.m26259t(obj2, j, Double.longBitsToDouble(LK8.m97055p(bArr2, i3)));
                                i16 = i3 + 8;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                u192 = u19;
                                i13 = i2;
                                break;
                            }
                        case 1:
                            u19 = this;
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
                                C44919m89.m26258u(obj2, j, Float.intBitsToFloat(LK8.m97069b(bArr2, i3)));
                                i16 = i3 + 4;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                u192 = u19;
                                i13 = i2;
                                break;
                            }
                        case 2:
                        case 3:
                            u19 = this;
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
                                int m97058m = LK8.m97058m(bArr2, i3, c52735zK82);
                                unsafe3.putLong(obj, j, c52735zK82.f121111b);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i16 = m97058m;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                u192 = u19;
                                i13 = i2;
                                break;
                            }
                        case 4:
                        case 11:
                            u19 = this;
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
                                i16 = LK8.m97061j(bArr2, i3, c52735zK82);
                                unsafe3.putInt(obj2, j, c52735zK82.f121110a);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                u192 = u19;
                                i13 = i2;
                                break;
                            }
                        case 5:
                        case 14:
                            u19 = this;
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
                                unsafe3.putLong(obj, j, LK8.m97055p(bArr2, i3));
                                i16 = i3 + 8;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                u192 = u19;
                                i13 = i2;
                                break;
                            }
                        case 6:
                        case 13:
                            u19 = this;
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
                                unsafe3.putInt(obj2, j, LK8.m97069b(bArr2, i3));
                                i16 = i3 + 4;
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                u192 = u19;
                                i13 = i2;
                                break;
                            }
                        case 7:
                            u19 = this;
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
                                i16 = LK8.m97058m(bArr2, i3, c52735zK82);
                                C44919m89.m26261r(obj2, j, c52735zK82.f121111b != 0);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                u192 = u19;
                                i13 = i2;
                                break;
                            }
                        case 8:
                            u19 = this;
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
                                    i16 = LK8.m97064g(bArr2, i3, c52735zK82);
                                } else {
                                    i16 = LK8.m97063h(bArr2, i3, c52735zK82);
                                }
                                unsafe3.putObject(obj2, j, c52735zK82.f121112c);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                u192 = u19;
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
                                u19 = this;
                                i9 = 1048575;
                                Object m82075i = u19.m82075i(obj2, i7);
                                i16 = LK8.m97056o(m82075i, u19.m82077g(i7), bArr, i3, i2, c52735zK8);
                                u19.m82067q(obj2, i7, m82075i);
                                i20 |= i27;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i15 = i9;
                                i17 = i8;
                                i18 = i5;
                                i14 = -1;
                                u192 = u19;
                                i13 = i2;
                                break;
                            }
                        case 10:
                            i5 = i22;
                            i7 = i23;
                            i8 = i17;
                            unsafe3 = unsafe2;
                            if (i24 == 2) {
                                i16 = LK8.m97070a(bArr2, i3, c52735zK82);
                                unsafe3.putObject(obj2, j, c52735zK82.f121112c);
                                i20 |= i27;
                                i13 = i2;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i17 = i8;
                                i18 = i5;
                                i15 = 1048575;
                                i14 = -1;
                                u192 = this;
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
                                i16 = LK8.m97061j(bArr2, i3, c52735zK82);
                                unsafe3.putInt(obj2, j, c52735zK82.f121110a);
                                i20 |= i27;
                                i13 = i2;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i17 = i8;
                                i18 = i5;
                                i15 = 1048575;
                                i14 = -1;
                                u192 = this;
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
                                i16 = LK8.m97061j(bArr2, i3, c52735zK82);
                                unsafe3.putInt(obj2, j, ZO8.m73210a(c52735zK82.f121110a));
                                i20 |= i27;
                                i13 = i2;
                                unsafe5 = unsafe3;
                                i19 = i7;
                                i17 = i8;
                                i18 = i5;
                                i15 = 1048575;
                                i14 = -1;
                                u192 = this;
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
                                int m97058m2 = LK8.m97058m(bArr2, i3, c52735zK82);
                                unsafe2.putLong(obj, j, ZO8.m73209b(c52735zK82.f121111b));
                                i20 |= i27;
                                unsafe5 = unsafe2;
                                i16 = m97058m2;
                                i19 = i23;
                                i17 = i17;
                                i18 = i22;
                                i15 = 1048575;
                                i14 = -1;
                                u192 = this;
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
                    U19<T> u193 = u192;
                    i7 = i23;
                    if (m82081P != 27) {
                        if (m82081P <= 49) {
                            int i30 = i3;
                            i11 = i20;
                            i12 = i29;
                            unsafe = unsafe6;
                            i6 = -1;
                            i16 = m82086K(obj, bArr, i3, i2, b, i5, i24, i7, i25, m82081P, j, c52735zK8);
                        } else {
                            i10 = i3;
                            i11 = i20;
                            unsafe = unsafe6;
                            i12 = i29;
                            i6 = -1;
                            if (m82081P != 50) {
                                i16 = m82087J(obj, bArr, i10, i2, b, i5, i24, i25, m82081P, j, i7, c52735zK8);
                            } else if (i24 == 2) {
                                i16 = m82088I(obj, bArr, i10, i2, i7, j, c52735zK8);
                            }
                        }
                        u192 = this;
                    } else if (i24 == 2) {
                        NV8 nv8 = (NV8) unsafe6.getObject(obj2, j);
                        if (!nv8.zzc()) {
                            int size = nv8.size();
                            nv8 = nv8.mo21037d(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj2, j, nv8);
                        }
                        i16 = LK8.m97066e(u193.m82077g(i7), b, bArr, i3, i2, nv8, c52735zK8);
                        i13 = i2;
                        unsafe5 = unsafe6;
                        i20 = i20;
                        i19 = i7;
                        i15 = 1048575;
                        i17 = i29;
                        i18 = i5;
                        u192 = u193;
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
                u192 = this;
            }
            i16 = LK8.m97062i(b, bArr, i4, i2, m82094C(obj), c52735zK8);
            obj2 = obj;
            bArr2 = bArr;
            i13 = i2;
            c52735zK82 = c52735zK8;
            i19 = i7;
            i14 = i6;
            i18 = i5;
            unsafe5 = unsafe;
            i15 = 1048575;
            u192 = this;
        }
        int i31 = i20;
        Unsafe unsafe7 = unsafe5;
        if (i17 != i15) {
            unsafe7.putInt(obj, i17, i31);
        }
        if (i16 != i2) {
            throw zzll.m51340e();
        }
    }

    /* renamed from: f */
    public final InterfaceC41569gV8 m82078f(int i) {
        int i2 = i / 3;
        return (InterfaceC41569gV8) this.f36720b[i2 + i2 + 1];
    }

    /* renamed from: g */
    public final F39 m82077g(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        F39 f39 = (F39) this.f36720b[i3];
        if (f39 != null) {
            return f39;
        }
        F39 m87385b = R29.m87386a().m87385b((Class) this.f36720b[i3 + 1]);
        this.f36720b[i3] = m87385b;
        return m87385b;
    }

    /* renamed from: h */
    public final Object m82076h(int i) {
        int i2 = i / 3;
        return this.f36720b[i2 + i2];
    }

    /* renamed from: i */
    public final Object m82075i(Object obj, int i) {
        F39 m82077g = m82077g(i);
        int m82080Q = m82080Q(i) & 1048575;
        if (!m82063u(obj, i)) {
            return m82077g.zze();
        }
        Object object = f36718q.getObject(obj, m82080Q);
        if (m82060x(object)) {
            return object;
        }
        Object zze = m82077g.zze();
        if (object != null) {
            m82077g.mo43319a(zze, object);
        }
        return zze;
    }

    /* renamed from: j */
    public final Object m82074j(Object obj, int i, int i2) {
        F39 m82077g = m82077g(i2);
        if (!m82059y(obj, i, i2)) {
            return m82077g.zze();
        }
        Object object = f36718q.getObject(obj, m82080Q(i2) & 1048575);
        if (m82060x(object)) {
            return object;
        }
        Object zze = m82077g.zze();
        if (object != null) {
            m82077g.mo43319a(zze, object);
        }
        return zze;
    }

    /* renamed from: m */
    public final void m82071m(Object obj, Object obj2, int i) {
        if (!m82063u(obj2, i)) {
            return;
        }
        Unsafe unsafe = f36718q;
        long m82080Q = m82080Q(i) & 1048575;
        Object object = unsafe.getObject(obj2, m82080Q);
        if (object != null) {
            F39 m82077g = m82077g(i);
            if (!m82063u(obj, i)) {
                if (!m82060x(object)) {
                    unsafe.putObject(obj, m82080Q, object);
                } else {
                    Object zze = m82077g.zze();
                    m82077g.mo43319a(zze, object);
                    unsafe.putObject(obj, m82080Q, zze);
                }
                m82069o(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, m82080Q);
            if (!m82060x(object2)) {
                Object zze2 = m82077g.zze();
                m82077g.mo43319a(zze2, object2);
                unsafe.putObject(obj, m82080Q, zze2);
                object2 = zze2;
            }
            m82077g.mo43319a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f36719a[i] + " is present but null: " + obj2.toString());
    }

    /* renamed from: n */
    public final void m82070n(Object obj, Object obj2, int i) {
        int i2 = this.f36719a[i];
        if (!m82059y(obj2, i2, i)) {
            return;
        }
        Unsafe unsafe = f36718q;
        long m82080Q = m82080Q(i) & 1048575;
        Object object = unsafe.getObject(obj2, m82080Q);
        if (object != null) {
            F39 m82077g = m82077g(i);
            if (!m82059y(obj, i2, i)) {
                if (!m82060x(object)) {
                    unsafe.putObject(obj, m82080Q, object);
                } else {
                    Object zze = m82077g.zze();
                    m82077g.mo43319a(zze, object);
                    unsafe.putObject(obj, m82080Q, zze);
                }
                m82068p(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, m82080Q);
            if (!m82060x(object2)) {
                Object zze2 = m82077g.zze();
                m82077g.mo43319a(zze2, object2);
                unsafe.putObject(obj, m82080Q, zze2);
                object2 = zze2;
            }
            m82077g.mo43319a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f36719a[i] + " is present but null: " + obj2.toString());
    }

    /* renamed from: o */
    public final void m82069o(Object obj, int i) {
        int m82083N = m82083N(i);
        long j = 1048575 & m82083N;
        if (j == 1048575) {
            return;
        }
        C44919m89.m26257v(obj, j, (1 << (m82083N >>> 20)) | C44919m89.m26271h(obj, j));
    }

    /* renamed from: p */
    public final void m82068p(Object obj, int i, int i2) {
        C44919m89.m26257v(obj, m82083N(i2) & 1048575, i);
    }

    /* renamed from: q */
    public final void m82067q(Object obj, int i, Object obj2) {
        f36718q.putObject(obj, m82080Q(i) & 1048575, obj2);
        m82069o(obj, i);
    }

    /* renamed from: r */
    public final void m82066r(Object obj, int i, int i2, Object obj2) {
        f36718q.putObject(obj, m82080Q(i2) & 1048575, obj2);
        m82068p(obj, i, i2);
    }

    /* renamed from: s */
    public final void m82065s(InterfaceC38633ba9 interfaceC38633ba9, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        C39503d09 c39503d09 = (C39503d09) m82076h(i2);
        throw null;
    }

    /* renamed from: t */
    public final boolean m82064t(Object obj, Object obj2, int i) {
        return m82063u(obj, i) == m82063u(obj2, i);
    }

    /* renamed from: u */
    public final boolean m82063u(Object obj, int i) {
        int m82083N = m82083N(i);
        long j = m82083N & 1048575;
        if (j == 1048575) {
            int m82080Q = m82080Q(i);
            long j2 = m82080Q & 1048575;
            switch (m82081P(m82080Q)) {
                case 0:
                    if (Double.doubleToRawLongBits(C44919m89.m26273f(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(C44919m89.m26272g(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C44919m89.m26270i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C44919m89.m26270i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C44919m89.m26271h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C44919m89.m26270i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C44919m89.m26271h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C44919m89.m26282B(obj, j2);
                case 8:
                    Object m26268k = C44919m89.m26268k(obj, j2);
                    if (m26268k instanceof String) {
                        if (((String) m26268k).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m26268k instanceof AbstractC40913fO8) {
                        if (AbstractC40913fO8.f80055c.equals(m26268k)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (C44919m89.m26268k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC40913fO8.f80055c.equals(C44919m89.m26268k(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (C44919m89.m26271h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C44919m89.m26271h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (C44919m89.m26271h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C44919m89.m26270i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C44919m89.m26271h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C44919m89.m26270i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C44919m89.m26268k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((C44919m89.m26271h(obj, j) & (1 << (m82083N >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final boolean m82062v(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m82063u(obj, i) : (i3 & i4) != 0;
    }

    /* renamed from: y */
    public final boolean m82059y(Object obj, int i, int i2) {
        if (C44919m89.m26271h(obj, m82083N(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    @Override // p000.F39
    public final int zza(Object obj) {
        int m88514y;
        int m88514y2;
        int m88513z;
        int m88514y3;
        int m88514y4;
        int m88514y5;
        int m88514y6;
        int m77485L;
        int m88514y7;
        int m88513z2;
        int m88514y8;
        int m88514y9;
        if (this.f36725g) {
            Unsafe unsafe = f36718q;
            int i = 0;
            for (int i2 = 0; i2 < this.f36719a.length; i2 += 3) {
                int m82080Q = m82080Q(i2);
                int m82081P = m82081P(m82080Q);
                int i3 = this.f36719a[i2];
                int i4 = m82080Q & 1048575;
                if (m82081P >= EnumC39764dS8.f76640R.zza() && m82081P <= EnumC39764dS8.f76670u0.zza()) {
                    int i5 = this.f36719a[i2 + 2];
                }
                long j = i4;
                switch (m82081P) {
                    case 0:
                        if (m82063u(obj, i2)) {
                            m88514y = QP8.m88514y(i3 << 3);
                            m77485L = m88514y + 8;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m82063u(obj, i2)) {
                            m88514y2 = QP8.m88514y(i3 << 3);
                            m77485L = m88514y2 + 4;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m82063u(obj, i2)) {
                            m88513z = QP8.m88513z(C44919m89.m26270i(obj, j));
                            m88514y3 = QP8.m88514y(i3 << 3);
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m82063u(obj, i2)) {
                            m88513z = QP8.m88513z(C44919m89.m26270i(obj, j));
                            m88514y3 = QP8.m88514y(i3 << 3);
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m82063u(obj, i2)) {
                            m88513z = QP8.m88517v(C44919m89.m26271h(obj, j));
                            m88514y3 = QP8.m88514y(i3 << 3);
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m82063u(obj, i2)) {
                            m88514y = QP8.m88514y(i3 << 3);
                            m77485L = m88514y + 8;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m82063u(obj, i2)) {
                            m88514y2 = QP8.m88514y(i3 << 3);
                            m77485L = m88514y2 + 4;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m82063u(obj, i2)) {
                            m88514y4 = QP8.m88514y(i3 << 3);
                            m77485L = m88514y4 + 1;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m82063u(obj, i2)) {
                            Object m26268k = C44919m89.m26268k(obj, j);
                            if (m26268k instanceof AbstractC40913fO8) {
                                int i6 = i3 << 3;
                                Logger logger = QP8.f30335b;
                                int mo41437c = ((AbstractC40913fO8) m26268k).mo41437c();
                                m88514y5 = QP8.m88514y(mo41437c) + mo41437c;
                                m88514y6 = QP8.m88514y(i6);
                                m77485L = m88514y6 + m88514y5;
                                i += m77485L;
                                break;
                            } else {
                                m88513z = QP8.m88515x((String) m26268k);
                                m88514y3 = QP8.m88514y(i3 << 3);
                                i += m88514y3 + m88513z;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (m82063u(obj, i2)) {
                            m77485L = X39.m77485L(i3, C44919m89.m26268k(obj, j), m82077g(i2));
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m82063u(obj, i2)) {
                            int i7 = i3 << 3;
                            Logger logger2 = QP8.f30335b;
                            int mo41437c2 = ((AbstractC40913fO8) C44919m89.m26268k(obj, j)).mo41437c();
                            m88514y5 = QP8.m88514y(mo41437c2) + mo41437c2;
                            m88514y6 = QP8.m88514y(i7);
                            m77485L = m88514y6 + m88514y5;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m82063u(obj, i2)) {
                            m88513z = QP8.m88514y(C44919m89.m26271h(obj, j));
                            m88514y3 = QP8.m88514y(i3 << 3);
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m82063u(obj, i2)) {
                            m88513z = QP8.m88517v(C44919m89.m26271h(obj, j));
                            m88514y3 = QP8.m88514y(i3 << 3);
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m82063u(obj, i2)) {
                            m88514y2 = QP8.m88514y(i3 << 3);
                            m77485L = m88514y2 + 4;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m82063u(obj, i2)) {
                            m88514y = QP8.m88514y(i3 << 3);
                            m77485L = m88514y + 8;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m82063u(obj, i2)) {
                            int m26271h = C44919m89.m26271h(obj, j);
                            m88514y3 = QP8.m88514y(i3 << 3);
                            m88513z = QP8.m88514y((m26271h >> 31) ^ (m26271h + m26271h));
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m82063u(obj, i2)) {
                            long m26270i = C44919m89.m26270i(obj, j);
                            m88514y7 = QP8.m88514y(i3 << 3);
                            m88513z2 = QP8.m88513z((m26270i + m26270i) ^ (m26270i >> 63));
                            m77485L = m88514y7 + m88513z2;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m82063u(obj, i2)) {
                            m77485L = QP8.m88518u(i3, (InterfaceC47814r19) C44919m89.m26268k(obj, j), m82077g(i2));
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        m77485L = X39.m77492E(i3, (List) C44919m89.m26268k(obj, j), false);
                        i += m77485L;
                        break;
                    case 19:
                        m77485L = X39.m77494C(i3, (List) C44919m89.m26268k(obj, j), false);
                        i += m77485L;
                        break;
                    case 20:
                        m77485L = X39.m77487J(i3, (List) C44919m89.m26268k(obj, j), false);
                        i += m77485L;
                        break;
                    case 21:
                        m77485L = X39.m77476U(i3, (List) C44919m89.m26268k(obj, j), false);
                        i += m77485L;
                        break;
                    case 22:
                        m77485L = X39.m77489H(i3, (List) C44919m89.m26268k(obj, j), false);
                        i += m77485L;
                        break;
                    case 23:
                        m77485L = X39.m77492E(i3, (List) C44919m89.m26268k(obj, j), false);
                        i += m77485L;
                        break;
                    case 24:
                        m77485L = X39.m77494C(i3, (List) C44919m89.m26268k(obj, j), false);
                        i += m77485L;
                        break;
                    case 25:
                        m77485L = X39.m77448y(i3, (List) C44919m89.m26268k(obj, j), false);
                        i += m77485L;
                        break;
                    case 26:
                        m77485L = X39.m77479R(i3, (List) C44919m89.m26268k(obj, j));
                        i += m77485L;
                        break;
                    case 27:
                        m77485L = X39.m77484M(i3, (List) C44919m89.m26268k(obj, j), m82077g(i2));
                        i += m77485L;
                        break;
                    case 28:
                        m77485L = X39.m77447z(i3, (List) C44919m89.m26268k(obj, j));
                        i += m77485L;
                        break;
                    case 29:
                        m77485L = X39.m77478S(i3, (List) C44919m89.m26268k(obj, j), false);
                        i += m77485L;
                        break;
                    case 30:
                        m77485L = X39.m77496A(i3, (List) C44919m89.m26268k(obj, j), false);
                        i += m77485L;
                        break;
                    case 31:
                        m77485L = X39.m77494C(i3, (List) C44919m89.m26268k(obj, j), false);
                        i += m77485L;
                        break;
                    case 32:
                        m77485L = X39.m77492E(i3, (List) C44919m89.m26268k(obj, j), false);
                        i += m77485L;
                        break;
                    case 33:
                        m77485L = X39.m77483N(i3, (List) C44919m89.m26268k(obj, j), false);
                        i += m77485L;
                        break;
                    case 34:
                        m77485L = X39.m77481P(i3, (List) C44919m89.m26268k(obj, j), false);
                        i += m77485L;
                        break;
                    case 35:
                        m88513z = X39.m77491F((List) unsafe.getObject(obj, j));
                        if (m88513z > 0) {
                            int i8 = i3 << 3;
                            m88514y8 = QP8.m88514y(m88513z);
                            m88514y9 = QP8.m88514y(i8);
                            m88514y3 = m88514y9 + m88514y8;
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        m88513z = X39.m77493D((List) unsafe.getObject(obj, j));
                        if (m88513z > 0) {
                            int i9 = i3 << 3;
                            m88514y8 = QP8.m88514y(m88513z);
                            m88514y9 = QP8.m88514y(i9);
                            m88514y3 = m88514y9 + m88514y8;
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        m88513z = X39.m77486K((List) unsafe.getObject(obj, j));
                        if (m88513z > 0) {
                            int i10 = i3 << 3;
                            m88514y8 = QP8.m88514y(m88513z);
                            m88514y9 = QP8.m88514y(i10);
                            m88514y3 = m88514y9 + m88514y8;
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        m88513z = X39.m77475V((List) unsafe.getObject(obj, j));
                        if (m88513z > 0) {
                            int i11 = i3 << 3;
                            m88514y8 = QP8.m88514y(m88513z);
                            m88514y9 = QP8.m88514y(i11);
                            m88514y3 = m88514y9 + m88514y8;
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        m88513z = X39.m77488I((List) unsafe.getObject(obj, j));
                        if (m88513z > 0) {
                            int i12 = i3 << 3;
                            m88514y8 = QP8.m88514y(m88513z);
                            m88514y9 = QP8.m88514y(i12);
                            m88514y3 = m88514y9 + m88514y8;
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        m88513z = X39.m77491F((List) unsafe.getObject(obj, j));
                        if (m88513z > 0) {
                            int i13 = i3 << 3;
                            m88514y8 = QP8.m88514y(m88513z);
                            m88514y9 = QP8.m88514y(i13);
                            m88514y3 = m88514y9 + m88514y8;
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        m88513z = X39.m77493D((List) unsafe.getObject(obj, j));
                        if (m88513z > 0) {
                            int i14 = i3 << 3;
                            m88514y8 = QP8.m88514y(m88513z);
                            m88514y9 = QP8.m88514y(i14);
                            m88514y3 = m88514y9 + m88514y8;
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        Class cls = X39.f42592a;
                        m88513z = ((List) unsafe.getObject(obj, j)).size();
                        if (m88513z > 0) {
                            int i15 = i3 << 3;
                            m88514y8 = QP8.m88514y(m88513z);
                            m88514y9 = QP8.m88514y(i15);
                            m88514y3 = m88514y9 + m88514y8;
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        m88513z = X39.m77477T((List) unsafe.getObject(obj, j));
                        if (m88513z > 0) {
                            int i16 = i3 << 3;
                            m88514y8 = QP8.m88514y(m88513z);
                            m88514y9 = QP8.m88514y(i16);
                            m88514y3 = m88514y9 + m88514y8;
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        m88513z = X39.m77495B((List) unsafe.getObject(obj, j));
                        if (m88513z > 0) {
                            int i17 = i3 << 3;
                            m88514y8 = QP8.m88514y(m88513z);
                            m88514y9 = QP8.m88514y(i17);
                            m88514y3 = m88514y9 + m88514y8;
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        m88513z = X39.m77493D((List) unsafe.getObject(obj, j));
                        if (m88513z > 0) {
                            int i18 = i3 << 3;
                            m88514y8 = QP8.m88514y(m88513z);
                            m88514y9 = QP8.m88514y(i18);
                            m88514y3 = m88514y9 + m88514y8;
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        m88513z = X39.m77491F((List) unsafe.getObject(obj, j));
                        if (m88513z > 0) {
                            int i19 = i3 << 3;
                            m88514y8 = QP8.m88514y(m88513z);
                            m88514y9 = QP8.m88514y(i19);
                            m88514y3 = m88514y9 + m88514y8;
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        m88513z = X39.m77482O((List) unsafe.getObject(obj, j));
                        if (m88513z > 0) {
                            int i20 = i3 << 3;
                            m88514y8 = QP8.m88514y(m88513z);
                            m88514y9 = QP8.m88514y(i20);
                            m88514y3 = m88514y9 + m88514y8;
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        m88513z = X39.m77480Q((List) unsafe.getObject(obj, j));
                        if (m88513z > 0) {
                            int i21 = i3 << 3;
                            m88514y8 = QP8.m88514y(m88513z);
                            m88514y9 = QP8.m88514y(i21);
                            m88514y3 = m88514y9 + m88514y8;
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        m77485L = X39.m77490G(i3, (List) C44919m89.m26268k(obj, j), m82077g(i2));
                        i += m77485L;
                        break;
                    case 50:
                        C50175v09.m9387a(i3, C44919m89.m26268k(obj, j), m82076h(i2));
                        break;
                    case 51:
                        if (m82059y(obj, i3, i2)) {
                            m88514y = QP8.m88514y(i3 << 3);
                            m77485L = m88514y + 8;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m82059y(obj, i3, i2)) {
                            m88514y2 = QP8.m88514y(i3 << 3);
                            m77485L = m88514y2 + 4;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m82059y(obj, i3, i2)) {
                            m88513z = QP8.m88513z(m82079R(obj, j));
                            m88514y3 = QP8.m88514y(i3 << 3);
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m82059y(obj, i3, i2)) {
                            m88513z = QP8.m88513z(m82079R(obj, j));
                            m88514y3 = QP8.m88514y(i3 << 3);
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m82059y(obj, i3, i2)) {
                            m88513z = QP8.m88517v(m82089H(obj, j));
                            m88514y3 = QP8.m88514y(i3 << 3);
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m82059y(obj, i3, i2)) {
                            m88514y = QP8.m88514y(i3 << 3);
                            m77485L = m88514y + 8;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m82059y(obj, i3, i2)) {
                            m88514y2 = QP8.m88514y(i3 << 3);
                            m77485L = m88514y2 + 4;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m82059y(obj, i3, i2)) {
                            m88514y4 = QP8.m88514y(i3 << 3);
                            m77485L = m88514y4 + 1;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (m82059y(obj, i3, i2)) {
                            Object m26268k2 = C44919m89.m26268k(obj, j);
                            if (m26268k2 instanceof AbstractC40913fO8) {
                                int i22 = i3 << 3;
                                Logger logger3 = QP8.f30335b;
                                int mo41437c3 = ((AbstractC40913fO8) m26268k2).mo41437c();
                                m88514y5 = QP8.m88514y(mo41437c3) + mo41437c3;
                                m88514y6 = QP8.m88514y(i22);
                                m77485L = m88514y6 + m88514y5;
                                i += m77485L;
                                break;
                            } else {
                                m88513z = QP8.m88515x((String) m26268k2);
                                m88514y3 = QP8.m88514y(i3 << 3);
                                i += m88514y3 + m88513z;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (m82059y(obj, i3, i2)) {
                            m77485L = X39.m77485L(i3, C44919m89.m26268k(obj, j), m82077g(i2));
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m82059y(obj, i3, i2)) {
                            int i23 = i3 << 3;
                            Logger logger4 = QP8.f30335b;
                            int mo41437c4 = ((AbstractC40913fO8) C44919m89.m26268k(obj, j)).mo41437c();
                            m88514y5 = QP8.m88514y(mo41437c4) + mo41437c4;
                            m88514y6 = QP8.m88514y(i23);
                            m77485L = m88514y6 + m88514y5;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m82059y(obj, i3, i2)) {
                            m88513z = QP8.m88514y(m82089H(obj, j));
                            m88514y3 = QP8.m88514y(i3 << 3);
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m82059y(obj, i3, i2)) {
                            m88513z = QP8.m88517v(m82089H(obj, j));
                            m88514y3 = QP8.m88514y(i3 << 3);
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m82059y(obj, i3, i2)) {
                            m88514y2 = QP8.m88514y(i3 << 3);
                            m77485L = m88514y2 + 4;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m82059y(obj, i3, i2)) {
                            m88514y = QP8.m88514y(i3 << 3);
                            m77485L = m88514y + 8;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m82059y(obj, i3, i2)) {
                            int m82089H = m82089H(obj, j);
                            m88514y3 = QP8.m88514y(i3 << 3);
                            m88513z = QP8.m88514y((m82089H >> 31) ^ (m82089H + m82089H));
                            i += m88514y3 + m88513z;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m82059y(obj, i3, i2)) {
                            long m82079R = m82079R(obj, j);
                            m88514y7 = QP8.m88514y(i3 << 3);
                            m88513z2 = QP8.m88513z((m82079R + m82079R) ^ (m82079R >> 63));
                            m77485L = m88514y7 + m88513z2;
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (m82059y(obj, i3, i2)) {
                            m77485L = QP8.m88518u(i3, (InterfaceC47814r19) C44919m89.m26268k(obj, j), m82077g(i2));
                            i += m77485L;
                            break;
                        } else {
                            break;
                        }
                }
            }
            Q69 q69 = this.f36730l;
            return i + q69.mo41976a(q69.mo41973d(obj));
        }
        return m82090G(obj);
    }

    @Override // p000.F39
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int length = this.f36719a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m82080Q = m82080Q(i3);
            int i4 = this.f36719a[i3];
            long j = 1048575 & m82080Q;
            int i5 = 37;
            switch (m82081P(m82080Q)) {
                case 0:
                    i = i2 * 53;
                    doubleToLongBits = Double.doubleToLongBits(C44919m89.m26273f(obj, j));
                    Charset charset = XV8.f43341a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 1:
                    i = i2 * 53;
                    floatToIntBits = Float.floatToIntBits(C44919m89.m26272g(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 2:
                    i = i2 * 53;
                    doubleToLongBits = C44919m89.m26270i(obj, j);
                    Charset charset2 = XV8.f43341a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 3:
                    i = i2 * 53;
                    doubleToLongBits = C44919m89.m26270i(obj, j);
                    Charset charset3 = XV8.f43341a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 4:
                    i = i2 * 53;
                    floatToIntBits = C44919m89.m26271h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 5:
                    i = i2 * 53;
                    doubleToLongBits = C44919m89.m26270i(obj, j);
                    Charset charset4 = XV8.f43341a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 6:
                    i = i2 * 53;
                    floatToIntBits = C44919m89.m26271h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 7:
                    i = i2 * 53;
                    floatToIntBits = XV8.m76919a(C44919m89.m26282B(obj, j));
                    i2 = i + floatToIntBits;
                    break;
                case 8:
                    i = i2 * 53;
                    floatToIntBits = ((String) C44919m89.m26268k(obj, j)).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 9:
                    Object m26268k = C44919m89.m26268k(obj, j);
                    if (m26268k != null) {
                        i5 = m26268k.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    floatToIntBits = C44919m89.m26268k(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 11:
                    i = i2 * 53;
                    floatToIntBits = C44919m89.m26271h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 12:
                    i = i2 * 53;
                    floatToIntBits = C44919m89.m26271h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 13:
                    i = i2 * 53;
                    floatToIntBits = C44919m89.m26271h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 14:
                    i = i2 * 53;
                    doubleToLongBits = C44919m89.m26270i(obj, j);
                    Charset charset5 = XV8.f43341a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 15:
                    i = i2 * 53;
                    floatToIntBits = C44919m89.m26271h(obj, j);
                    i2 = i + floatToIntBits;
                    break;
                case 16:
                    i = i2 * 53;
                    doubleToLongBits = C44919m89.m26270i(obj, j);
                    Charset charset6 = XV8.f43341a;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i2 = i + floatToIntBits;
                    break;
                case 17:
                    Object m26268k2 = C44919m89.m26268k(obj, j);
                    if (m26268k2 != null) {
                        i5 = m26268k2.hashCode();
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
                    floatToIntBits = C44919m89.m26268k(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 50:
                    i = i2 * 53;
                    floatToIntBits = C44919m89.m26268k(obj, j).hashCode();
                    i2 = i + floatToIntBits;
                    break;
                case 51:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = Double.doubleToLongBits(m82092E(obj, j));
                        Charset charset7 = XV8.f43341a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = Float.floatToIntBits(m82091F(obj, j));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = m82079R(obj, j);
                        Charset charset8 = XV8.f43341a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = m82079R(obj, j);
                        Charset charset9 = XV8.f43341a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m82089H(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = m82079R(obj, j);
                        Charset charset10 = XV8.f43341a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m82089H(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = XV8.m76919a(m82058z(obj, j));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = ((String) C44919m89.m26268k(obj, j)).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = C44919m89.m26268k(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = C44919m89.m26268k(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m82089H(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m82089H(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m82089H(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = m82079R(obj, j);
                        Charset charset11 = XV8.f43341a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = m82089H(obj, j);
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        doubleToLongBits = m82079R(obj, j);
                        Charset charset12 = XV8.f43341a;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m82059y(obj, i4, i3)) {
                        i = i2 * 53;
                        floatToIntBits = C44919m89.m26268k(obj, j).hashCode();
                        i2 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f36730l.mo41973d(obj).hashCode();
        if (!this.f36724f) {
            return hashCode;
        }
        this.f36731m.mo23748a(obj);
        throw null;
    }

    @Override // p000.F39
    public final Object zze() {
        return ((AbstractC46897pU8) this.f36723e).m19206l();
    }

    @Override // p000.F39
    public final void zzf(Object obj) {
        if (!m82060x(obj)) {
            return;
        }
        if (obj instanceof AbstractC46897pU8) {
            AbstractC46897pU8 abstractC46897pU8 = (AbstractC46897pU8) obj;
            abstractC46897pU8.m19195x(Integer.MAX_VALUE);
            abstractC46897pU8.zzb = 0;
            abstractC46897pU8.m19197v();
        }
        int length = this.f36719a.length;
        for (int i = 0; i < length; i += 3) {
            int m82080Q = m82080Q(i);
            int i2 = 1048575 & m82080Q;
            int m82081P = m82081P(m82080Q);
            long j = i2;
            if (m82081P != 9) {
                if (m82081P != 60 && m82081P != 68) {
                    switch (m82081P) {
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
                            this.f36729k.mo3270a(obj, j);
                            break;
                        case 50:
                            Unsafe unsafe = f36718q;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((C44839m09) object).m26547f();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (m82059y(obj, this.f36719a[i], i)) {
                    m82077g(i).zzf(f36718q.getObject(obj, j));
                }
            }
            if (m82063u(obj, i)) {
                m82077g(i).zzf(f36718q.getObject(obj, j));
            }
        }
        this.f36730l.mo41970g(obj);
        if (this.f36724f) {
            this.f36731m.mo23747b(obj);
        }
    }
}
