package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.AbstractC17530c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;
/* renamed from: com.google.android.gms.internal.places.e */
/* loaded from: classes5.dex */
public final class C17537e<T> implements LY7<T> {

    /* renamed from: r */
    public static final int[] f71167r = new int[0];

    /* renamed from: s */
    public static final Unsafe f71168s = C49038t58.m13104q();

    /* renamed from: a */
    public final int[] f71169a;

    /* renamed from: b */
    public final Object[] f71170b;

    /* renamed from: c */
    public final int f71171c;

    /* renamed from: d */
    public final int f71172d;

    /* renamed from: e */
    public final InterfaceC52815zT7 f71173e;

    /* renamed from: f */
    public final boolean f71174f;

    /* renamed from: g */
    public final boolean f71175g;

    /* renamed from: h */
    public final boolean f71176h;

    /* renamed from: i */
    public final boolean f71177i;

    /* renamed from: j */
    public final int[] f71178j;

    /* renamed from: k */
    public final int f71179k;

    /* renamed from: l */
    public final int f71180l;

    /* renamed from: m */
    public final CV7 f71181m;

    /* renamed from: n */
    public final HN7 f71182n;

    /* renamed from: o */
    public final I38<?, ?> f71183o;

    /* renamed from: p */
    public final AbstractC49521tu7<?> f71184p;

    /* renamed from: q */
    public final InterfaceC51611xR7 f71185q;

    public C17537e(int[] iArr, Object[] objArr, int i, int i2, InterfaceC52815zT7 interfaceC52815zT7, boolean z, boolean z2, int[] iArr2, int i3, int i4, CV7 cv7, HN7 hn7, I38<?, ?> i38, AbstractC49521tu7<?> abstractC49521tu7, InterfaceC51611xR7 interfaceC51611xR7) {
        boolean z3;
        this.f71169a = iArr;
        this.f71170b = objArr;
        this.f71171c = i;
        this.f71172d = i2;
        this.f71175g = interfaceC52815zT7 instanceof AbstractC17530c;
        this.f71176h = z;
        if (abstractC49521tu7 != null && abstractC49521tu7.mo11223g(interfaceC52815zT7)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f71174f = z3;
        this.f71177i = false;
        this.f71178j = iArr2;
        this.f71179k = i3;
        this.f71180l = i4;
        this.f71181m = cv7;
        this.f71182n = hn7;
        this.f71183o = i38;
        this.f71184p = abstractC49521tu7;
        this.f71173e = interfaceC52815zT7;
        this.f71185q = interfaceC51611xR7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public static boolean m51205D(Object obj, int i, LY7 ly7) {
        return ly7.mo51167f(C49038t58.m13129G(obj, i & 1048575));
    }

    /* renamed from: J */
    public static List<?> m51199J(Object obj, long j) {
        return (List) C49038t58.m13129G(obj, j);
    }

    /* renamed from: K */
    public static <T> double m51198K(T t, long j) {
        return ((Double) C49038t58.m13129G(t, j)).doubleValue();
    }

    /* renamed from: L */
    public static <T> float m51197L(T t, long j) {
        return ((Float) C49038t58.m13129G(t, j)).floatValue();
    }

    /* renamed from: M */
    public static <T> int m51196M(T t, long j) {
        return ((Integer) C49038t58.m13129G(t, j)).intValue();
    }

    /* renamed from: N */
    public static <T> long m51195N(T t, long j) {
        return ((Long) C49038t58.m13129G(t, j)).longValue();
    }

    /* renamed from: O */
    public static <T> boolean m51194O(T t, long j) {
        return ((Boolean) C49038t58.m13129G(t, j)).booleanValue();
    }

    /* renamed from: P */
    public static C49611u38 m51193P(Object obj) {
        AbstractC17530c abstractC17530c = (AbstractC17530c) obj;
        C49611u38 c49611u38 = abstractC17530c.zzih;
        if (c49611u38 == C49611u38.m10923i()) {
            C49611u38 m10922j = C49611u38.m10922j();
            abstractC17530c.zzih = m10922j;
            return m10922j;
        }
        return c49611u38;
    }

    /* renamed from: s */
    public static <UT, UB> int m51180s(I38<UT, UB> i38, T t) {
        return i38.mo51153j(i38.mo51152k(t));
    }

    /* renamed from: t */
    public static <T> C17537e<T> m51179t(Class<T> cls, WS7 ws7, CV7 cv7, HN7 hn7, I38<?, ?> i38, AbstractC49521tu7<?> abstractC49521tu7, InterfaceC51611xR7 interfaceC51611xR7) {
        boolean z;
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        boolean z2;
        int i17;
        TW7 tw7;
        int i18;
        int objectFieldOffset;
        int i19;
        int i20;
        Class<?> cls2;
        String str;
        int i21;
        int i22;
        Field m51177v;
        int i23;
        char charAt11;
        int i24;
        int i25;
        int i26;
        Field m51177v2;
        Field m51177v3;
        int i27;
        char charAt12;
        int i28;
        char charAt13;
        int i29;
        char charAt14;
        int i30;
        char charAt15;
        char charAt16;
        if (ws7 instanceof TW7) {
            TW7 tw72 = (TW7) ws7;
            int i31 = 0;
            if (tw72.mo78373a() == AbstractC17530c.C17534d.f71162j) {
                z = true;
            } else {
                z = false;
            }
            String m83485d = tw72.m83485d();
            int length = m83485d.length();
            int charAt17 = m83485d.charAt(0);
            if (charAt17 >= 55296) {
                int i32 = charAt17 & 8191;
                int i33 = 1;
                int i34 = 13;
                while (true) {
                    i = i33 + 1;
                    charAt16 = m83485d.charAt(i33);
                    if (charAt16 < 55296) {
                        break;
                    }
                    i32 |= (charAt16 & 8191) << i34;
                    i34 += 13;
                    i33 = i;
                }
                charAt17 = i32 | (charAt16 << i34);
            } else {
                i = 1;
            }
            int i35 = i + 1;
            int charAt18 = m83485d.charAt(i);
            if (charAt18 >= 55296) {
                int i36 = charAt18 & 8191;
                int i37 = 13;
                while (true) {
                    i30 = i35 + 1;
                    charAt15 = m83485d.charAt(i35);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i36 |= (charAt15 & 8191) << i37;
                    i37 += 13;
                    i35 = i30;
                }
                charAt18 = i36 | (charAt15 << i37);
                i35 = i30;
            }
            if (charAt18 == 0) {
                i6 = 0;
                charAt = 0;
                i4 = 0;
                charAt2 = 0;
                i5 = 0;
                iArr = f71167r;
                i3 = 0;
            } else {
                int i39 = i35 + 1;
                int charAt19 = m83485d.charAt(i35);
                if (charAt19 >= 55296) {
                    int i40 = charAt19 & 8191;
                    int i41 = 13;
                    while (true) {
                        i14 = i39 + 1;
                        charAt10 = m83485d.charAt(i39);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i40 |= (charAt10 & 8191) << i41;
                        i41 += 13;
                        i39 = i14;
                    }
                    charAt19 = i40 | (charAt10 << i41);
                    i39 = i14;
                }
                int i42 = i39 + 1;
                int charAt20 = m83485d.charAt(i39);
                if (charAt20 >= 55296) {
                    int i43 = charAt20 & 8191;
                    int i44 = 13;
                    while (true) {
                        i13 = i42 + 1;
                        charAt9 = m83485d.charAt(i42);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i43 |= (charAt9 & 8191) << i44;
                        i44 += 13;
                        i42 = i13;
                    }
                    charAt20 = i43 | (charAt9 << i44);
                    i42 = i13;
                }
                int i45 = i42 + 1;
                charAt = m83485d.charAt(i42);
                if (charAt >= 55296) {
                    int i46 = charAt & 8191;
                    int i47 = 13;
                    while (true) {
                        i12 = i45 + 1;
                        charAt8 = m83485d.charAt(i45);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i46 |= (charAt8 & 8191) << i47;
                        i47 += 13;
                        i45 = i12;
                    }
                    charAt = i46 | (charAt8 << i47);
                    i45 = i12;
                }
                int i48 = i45 + 1;
                int charAt21 = m83485d.charAt(i45);
                if (charAt21 >= 55296) {
                    int i49 = charAt21 & 8191;
                    int i50 = 13;
                    while (true) {
                        i11 = i48 + 1;
                        charAt7 = m83485d.charAt(i48);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i49 |= (charAt7 & 8191) << i50;
                        i50 += 13;
                        i48 = i11;
                    }
                    charAt21 = i49 | (charAt7 << i50);
                    i48 = i11;
                }
                int i51 = i48 + 1;
                charAt2 = m83485d.charAt(i48);
                if (charAt2 >= 55296) {
                    int i52 = charAt2 & 8191;
                    int i53 = 13;
                    while (true) {
                        i10 = i51 + 1;
                        charAt6 = m83485d.charAt(i51);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i52 |= (charAt6 & 8191) << i53;
                        i53 += 13;
                        i51 = i10;
                    }
                    charAt2 = i52 | (charAt6 << i53);
                    i51 = i10;
                }
                int i54 = i51 + 1;
                int charAt22 = m83485d.charAt(i51);
                if (charAt22 >= 55296) {
                    int i55 = charAt22 & 8191;
                    int i56 = 13;
                    while (true) {
                        i9 = i54 + 1;
                        charAt5 = m83485d.charAt(i54);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i55 |= (charAt5 & 8191) << i56;
                        i56 += 13;
                        i54 = i9;
                    }
                    charAt22 = i55 | (charAt5 << i56);
                    i54 = i9;
                }
                int i57 = i54 + 1;
                int charAt23 = m83485d.charAt(i54);
                if (charAt23 >= 55296) {
                    int i58 = charAt23 & 8191;
                    int i59 = i57;
                    int i60 = 13;
                    while (true) {
                        i8 = i59 + 1;
                        charAt4 = m83485d.charAt(i59);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i58 |= (charAt4 & 8191) << i60;
                        i60 += 13;
                        i59 = i8;
                    }
                    charAt23 = i58 | (charAt4 << i60);
                    i2 = i8;
                } else {
                    i2 = i57;
                }
                int i61 = i2 + 1;
                int charAt24 = m83485d.charAt(i2);
                if (charAt24 >= 55296) {
                    int i62 = charAt24 & 8191;
                    int i63 = i61;
                    int i64 = 13;
                    while (true) {
                        i7 = i63 + 1;
                        charAt3 = m83485d.charAt(i63);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i62 |= (charAt3 & 8191) << i64;
                        i64 += 13;
                        i63 = i7;
                    }
                    charAt24 = i62 | (charAt3 << i64);
                    i61 = i7;
                }
                int i65 = (charAt19 << 1) + charAt20;
                i3 = charAt21;
                i4 = i65;
                i5 = charAt24;
                i31 = charAt19;
                i35 = i61;
                int i66 = charAt22;
                iArr = new int[charAt24 + charAt22 + charAt23];
                i6 = i66;
            }
            Unsafe unsafe = f71168s;
            Object[] m83484e = tw72.m83484e();
            Class<?> cls3 = tw72.mo78371c().getClass();
            int i67 = i35;
            int[] iArr2 = new int[charAt2 * 3];
            Object[] objArr = new Object[charAt2 << 1];
            int i68 = i5 + i6;
            int i69 = i5;
            int i70 = i67;
            int i71 = i68;
            int i72 = 0;
            int i73 = 0;
            while (i70 < length) {
                int i74 = i70 + 1;
                int charAt25 = m83485d.charAt(i70);
                int i75 = length;
                if (charAt25 >= 55296) {
                    int i76 = charAt25 & 8191;
                    int i77 = i74;
                    int i78 = 13;
                    while (true) {
                        i29 = i77 + 1;
                        charAt14 = m83485d.charAt(i77);
                        i15 = i5;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i76 |= (charAt14 & 8191) << i78;
                        i78 += 13;
                        i77 = i29;
                        i5 = i15;
                    }
                    charAt25 = i76 | (charAt14 << i78);
                    i16 = i29;
                } else {
                    i15 = i5;
                    i16 = i74;
                }
                int i79 = i16 + 1;
                int charAt26 = m83485d.charAt(i16);
                if (charAt26 >= 55296) {
                    int i80 = charAt26 & 8191;
                    int i81 = i79;
                    int i82 = 13;
                    while (true) {
                        i28 = i81 + 1;
                        charAt13 = m83485d.charAt(i81);
                        z2 = z;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i80 |= (charAt13 & 8191) << i82;
                        i82 += 13;
                        i81 = i28;
                        z = z2;
                    }
                    charAt26 = i80 | (charAt13 << i82);
                    i17 = i28;
                } else {
                    z2 = z;
                    i17 = i79;
                }
                int i83 = charAt26 & KotlinVersion.MAX_COMPONENT_VALUE;
                int i84 = i3;
                if ((charAt26 & 1024) != 0) {
                    iArr[i72] = i73;
                    i72++;
                }
                int i85 = charAt;
                if (i83 >= 51) {
                    int i86 = i17 + 1;
                    int charAt27 = m83485d.charAt(i17);
                    char c = 55296;
                    if (charAt27 >= 55296) {
                        int i87 = charAt27 & 8191;
                        int i88 = 13;
                        while (true) {
                            i27 = i86 + 1;
                            charAt12 = m83485d.charAt(i86);
                            if (charAt12 < c) {
                                break;
                            }
                            i87 |= (charAt12 & 8191) << i88;
                            i88 += 13;
                            i86 = i27;
                            c = 55296;
                        }
                        charAt27 = i87 | (charAt12 << i88);
                        i86 = i27;
                    }
                    int i89 = i83 - 51;
                    int i90 = i86;
                    if (i89 != 9 && i89 != 17) {
                        if (i89 == 12 && (charAt17 & 1) == 1) {
                            objArr[((i73 / 3) << 1) + 1] = m83484e[i4];
                            i4++;
                        }
                    } else {
                        objArr[((i73 / 3) << 1) + 1] = m83484e[i4];
                        i4++;
                    }
                    int i91 = charAt27 << 1;
                    Object obj = m83484e[i91];
                    if (obj instanceof Field) {
                        m51177v2 = (Field) obj;
                    } else {
                        m51177v2 = m51177v(cls3, (String) obj);
                        m83484e[i91] = m51177v2;
                    }
                    tw7 = tw72;
                    String str2 = m83485d;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m51177v2);
                    int i92 = i91 + 1;
                    Object obj2 = m83484e[i92];
                    if (obj2 instanceof Field) {
                        m51177v3 = (Field) obj2;
                    } else {
                        m51177v3 = m51177v(cls3, (String) obj2);
                        m83484e[i92] = m51177v3;
                    }
                    cls2 = cls3;
                    i19 = i4;
                    i17 = i90;
                    str = str2;
                    i22 = 0;
                    i21 = (int) unsafe.objectFieldOffset(m51177v3);
                    objectFieldOffset = objectFieldOffset2;
                    i20 = i31;
                } else {
                    tw7 = tw72;
                    String str3 = m83485d;
                    int i93 = i4 + 1;
                    Field m51177v4 = m51177v(cls3, (String) m83484e[i4]);
                    if (i83 != 9 && i83 != 17) {
                        if (i83 != 27 && i83 != 49) {
                            if (i83 != 12 && i83 != 30 && i83 != 44) {
                                if (i83 == 50) {
                                    int i94 = i69 + 1;
                                    iArr[i69] = i73;
                                    int i95 = (i73 / 3) << 1;
                                    int i96 = i93 + 1;
                                    objArr[i95] = m83484e[i93];
                                    if ((charAt26 & 2048) != 0) {
                                        i93 = i96 + 1;
                                        objArr[i95 + 1] = m83484e[i96];
                                        i69 = i94;
                                    } else {
                                        i93 = i96;
                                        i18 = 1;
                                        i69 = i94;
                                    }
                                }
                                i18 = 1;
                            } else {
                                i18 = 1;
                                if ((charAt17 & 1) == 1) {
                                    i24 = i93 + 1;
                                    objArr[((i73 / 3) << 1) + 1] = m83484e[i93];
                                }
                            }
                        } else {
                            i18 = 1;
                            i24 = i93 + 1;
                            objArr[((i73 / 3) << 1) + 1] = m83484e[i93];
                        }
                        i93 = i24;
                    } else {
                        i18 = 1;
                        objArr[((i73 / 3) << 1) + 1] = m51177v4.getType();
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m51177v4);
                    if ((charAt17 & 1) == i18) {
                        if (i83 <= 17) {
                            int i97 = i17 + 1;
                            str = str3;
                            int charAt28 = str.charAt(i17);
                            if (charAt28 >= 55296) {
                                int i98 = charAt28 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i23 = i97 + 1;
                                    charAt11 = str.charAt(i97);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i98 |= (charAt11 & 8191) << i99;
                                    i99 += 13;
                                    i97 = i23;
                                }
                                charAt28 = i98 | (charAt11 << i99);
                                i97 = i23;
                            }
                            int i100 = (i31 << 1) + (charAt28 / 32);
                            Object obj3 = m83484e[i100];
                            i19 = i93;
                            if (obj3 instanceof Field) {
                                m51177v = (Field) obj3;
                            } else {
                                m51177v = m51177v(cls3, (String) obj3);
                                m83484e[i100] = m51177v;
                            }
                            i20 = i31;
                            cls2 = cls3;
                            i22 = charAt28 % 32;
                            i21 = (int) unsafe.objectFieldOffset(m51177v);
                            i17 = i97;
                            if (i83 >= 18 && i83 <= 49) {
                                iArr[i71] = objectFieldOffset;
                                i71++;
                            }
                        } else {
                            i19 = i93;
                            i20 = i31;
                            cls2 = cls3;
                            str = str3;
                        }
                    } else {
                        i19 = i93;
                        i20 = i31;
                        cls2 = cls3;
                        str = str3;
                    }
                    i21 = 0;
                    i22 = 0;
                    if (i83 >= 18) {
                        iArr[i71] = objectFieldOffset;
                        i71++;
                    }
                }
                int i101 = i73 + 1;
                iArr2[i73] = charAt25;
                int i102 = i101 + 1;
                if ((charAt26 & 512) != 0) {
                    i25 = 536870912;
                } else {
                    i25 = 0;
                }
                if ((charAt26 & 256) != 0) {
                    i26 = 268435456;
                } else {
                    i26 = 0;
                }
                iArr2[i101] = objectFieldOffset | i26 | i25 | (i83 << 20);
                i73 = i102 + 1;
                iArr2[i102] = (i22 << 20) | i21;
                i31 = i20;
                m83485d = str;
                i70 = i17;
                cls3 = cls2;
                i3 = i84;
                length = i75;
                i5 = i15;
                z = z2;
                charAt = i85;
                i4 = i19;
                tw72 = tw7;
            }
            return new C17537e<>(iArr2, objArr, charAt, i3, tw72.mo78371c(), z, false, iArr, i5, i68, cv7, hn7, i38, abstractC49521tu7, interfaceC51611xR7);
        }
        ((M18) ws7).mo78373a();
        int i103 = AbstractC17530c.C17534d.f71153a;
        throw new NoSuchMethodError();
    }

    /* renamed from: v */
    public static Field m51177v(Class<?> cls, String str) {
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

    /* renamed from: w */
    public static void m51176w(int i, Object obj, InterfaceC43393ja8 interfaceC43393ja8) throws IOException {
        if (obj instanceof String) {
            interfaceC43393ja8.mo15211P(i, (String) obj);
        } else {
            interfaceC43393ja8.mo15208S(i, (AbstractC43604jv9) obj);
        }
    }

    /* renamed from: y */
    public static <UT, UB> void m51174y(I38<UT, UB> i38, T t, InterfaceC43393ja8 interfaceC43393ja8) throws IOException {
        i38.mo51160c(i38.mo51152k(t), interfaceC43393ja8);
    }

    /* renamed from: A */
    public final boolean m51208A(T t, int i) {
        int m51186m;
        if (this.f71176h) {
            int m51187l = m51187l(i);
            long j = m51187l & 1048575;
            switch ((m51187l & 267386880) >>> 20) {
                case 0:
                    if (C49038t58.m13130F(t, j) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (C49038t58.m13131E(t, j) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C49038t58.m13133C(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C49038t58.m13133C(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C49038t58.m13135A(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C49038t58.m13133C(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C49038t58.m13135A(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C49038t58.m13132D(t, j);
                case 8:
                    Object m13129G = C49038t58.m13129G(t, j);
                    if (m13129G instanceof String) {
                        if (((String) m13129G).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m13129G instanceof AbstractC43604jv9) {
                        if (AbstractC43604jv9.f93538c.equals(m13129G)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (C49038t58.m13129G(t, j) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC43604jv9.f93538c.equals(C49038t58.m13129G(t, j))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (C49038t58.m13135A(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C49038t58.m13135A(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (C49038t58.m13135A(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C49038t58.m13133C(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C49038t58.m13135A(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C49038t58.m13133C(t, j) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C49038t58.m13129G(t, j) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((C49038t58.m13135A(t, m51186m & 1048575) & (1 << (m51186m(i) >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public final boolean m51207B(T t, int i, int i2) {
        if (C49038t58.m13135A(t, m51186m(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public final boolean m51206C(T t, int i, int i2, int i3) {
        if (this.f71176h) {
            return m51208A(t, i);
        }
        if ((i2 & i3) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final void m51204E(T t, int i) {
        if (this.f71176h) {
            return;
        }
        int m51186m = m51186m(i);
        long j = m51186m & 1048575;
        C49038t58.m13116e(t, j, C49038t58.m13135A(t, j) | (1 << (m51186m >>> 20)));
    }

    /* renamed from: F */
    public final void m51203F(T t, int i, int i2) {
        C49038t58.m13116e(t, m51186m(i2) & 1048575, i);
    }

    /* renamed from: G */
    public final void m51202G(T t, T t2, int i) {
        int m51187l = m51187l(i);
        int i2 = this.f71169a[i];
        long j = m51187l & 1048575;
        if (!m51207B(t2, i2, i)) {
            return;
        }
        Object m13129G = C49038t58.m13129G(t, j);
        Object m13129G2 = C49038t58.m13129G(t2, j);
        if (m13129G != null && m13129G2 != null) {
            C49038t58.m13114g(t, j, C44389lF7.m27616d(m13129G, m13129G2));
            m51203F(t, i2, i);
        } else if (m13129G2 != null) {
            C49038t58.m13114g(t, j, m13129G2);
            m51203F(t, i2, i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x048c  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m51201H(T t, InterfaceC43393ja8 interfaceC43393ja8) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        int i2;
        boolean z;
        if (this.f71174f) {
            C33231Gx7<?> mo11227c = this.f71184p.mo11227c(t);
            if (!mo11227c.f12664a.isEmpty()) {
                it = mo11227c.m104565d();
                entry = it.next();
                length = this.f71169a.length;
                Unsafe unsafe = f71168s;
                int i3 = -1;
                int i4 = 0;
                for (i = 0; i < length; i += 3) {
                    int m51187l = m51187l(i);
                    int[] iArr = this.f71169a;
                    int i5 = iArr[i];
                    int i6 = (267386880 & m51187l) >>> 20;
                    if (!this.f71176h && i6 <= 17) {
                        int i7 = iArr[i + 2];
                        int i8 = i7 & 1048575;
                        if (i8 != i3) {
                            i4 = unsafe.getInt(t, i8);
                            i3 = i8;
                        }
                        i2 = 1 << (i7 >>> 20);
                    } else {
                        i2 = 0;
                    }
                    while (entry != null && this.f71184p.mo11229a(entry) <= i5) {
                        this.f71184p.mo11226d(interfaceC43393ja8, entry);
                        if (it.hasNext()) {
                            entry = it.next();
                        } else {
                            entry = null;
                        }
                    }
                    long j = m51187l & 1048575;
                    switch (i6) {
                        case 0:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15219H(i5, C49038t58.m13130F(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15218I(i5, C49038t58.m13131E(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15223C(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15196h(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15192l(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15224B(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15216K(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15215L(i5, C49038t58.m13132D(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if ((i2 & i4) != 0) {
                                m51176w(i5, unsafe.getObject(t, j), interfaceC43393ja8);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15212O(i5, unsafe.getObject(t, j), m51190i(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15208S(i5, (AbstractC43604jv9) unsafe.getObject(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15191m(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15209R(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15222E(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15213N(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15193k(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15195i(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if ((i2 & i4) != 0) {
                                interfaceC43393ja8.mo15214M(i5, unsafe.getObject(t, j), m51190i(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            C46348oZ7.m20859e(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, false);
                            break;
                        case 19:
                            C46348oZ7.m20853k(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, false);
                            break;
                        case 20:
                            C46348oZ7.m20848p(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, false);
                            break;
                        case 21:
                            C46348oZ7.m20840x(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, false);
                            break;
                        case 22:
                            C46348oZ7.m20885I(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, false);
                            break;
                        case 23:
                            C46348oZ7.m20890D(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, false);
                            break;
                        case 24:
                            C46348oZ7.m20879O(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, false);
                            break;
                        case 25:
                            C46348oZ7.m20874T(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, false);
                            break;
                        case 26:
                            C46348oZ7.m20863c(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8);
                            break;
                        case 27:
                            C46348oZ7.m20861d(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, m51190i(i));
                            break;
                        case 28:
                            C46348oZ7.m20855i(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8);
                            break;
                        case 29:
                            z = false;
                            C46348oZ7.m20883K(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, false);
                            break;
                        case 30:
                            z = false;
                            C46348oZ7.m20875S(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, false);
                            break;
                        case 31:
                            z = false;
                            C46348oZ7.m20877Q(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, false);
                            break;
                        case 32:
                            z = false;
                            C46348oZ7.m20887G(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, false);
                            break;
                        case 33:
                            z = false;
                            C46348oZ7.m20881M(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, false);
                            break;
                        case 34:
                            z = false;
                            C46348oZ7.m20892B(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, false);
                            break;
                        case 35:
                            C46348oZ7.m20859e(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, true);
                            break;
                        case 36:
                            C46348oZ7.m20853k(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, true);
                            break;
                        case 37:
                            C46348oZ7.m20848p(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, true);
                            break;
                        case 38:
                            C46348oZ7.m20840x(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, true);
                            break;
                        case 39:
                            C46348oZ7.m20885I(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, true);
                            break;
                        case 40:
                            C46348oZ7.m20890D(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, true);
                            break;
                        case 41:
                            C46348oZ7.m20879O(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, true);
                            break;
                        case 42:
                            C46348oZ7.m20874T(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, true);
                            break;
                        case 43:
                            C46348oZ7.m20883K(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, true);
                            break;
                        case 44:
                            C46348oZ7.m20875S(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, true);
                            break;
                        case 45:
                            C46348oZ7.m20877Q(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, true);
                            break;
                        case 46:
                            C46348oZ7.m20887G(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, true);
                            break;
                        case 47:
                            C46348oZ7.m20881M(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, true);
                            break;
                        case 48:
                            C46348oZ7.m20892B(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, true);
                            break;
                        case 49:
                            C46348oZ7.m20854j(this.f71169a[i], (List) unsafe.getObject(t, j), interfaceC43393ja8, m51190i(i));
                            break;
                        case 50:
                            m51173z(interfaceC43393ja8, i5, unsafe.getObject(t, j), i);
                            break;
                        case 51:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15219H(i5, m51198K(t, j));
                            }
                            break;
                        case 52:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15218I(i5, m51197L(t, j));
                            }
                            break;
                        case 53:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15223C(i5, m51195N(t, j));
                            }
                            break;
                        case 54:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15196h(i5, m51195N(t, j));
                            }
                            break;
                        case 55:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15192l(i5, m51196M(t, j));
                            }
                            break;
                        case 56:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15224B(i5, m51195N(t, j));
                            }
                            break;
                        case 57:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15216K(i5, m51196M(t, j));
                            }
                            break;
                        case 58:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15215L(i5, m51194O(t, j));
                            }
                            break;
                        case 59:
                            if (m51207B(t, i5, i)) {
                                m51176w(i5, unsafe.getObject(t, j), interfaceC43393ja8);
                            }
                            break;
                        case 60:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15212O(i5, unsafe.getObject(t, j), m51190i(i));
                            }
                            break;
                        case 61:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15208S(i5, (AbstractC43604jv9) unsafe.getObject(t, j));
                            }
                            break;
                        case 62:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15191m(i5, m51196M(t, j));
                            }
                            break;
                        case 63:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15209R(i5, m51196M(t, j));
                            }
                            break;
                        case 64:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15222E(i5, m51196M(t, j));
                            }
                            break;
                        case 65:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15213N(i5, m51195N(t, j));
                            }
                            break;
                        case 66:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15193k(i5, m51196M(t, j));
                            }
                            break;
                        case 67:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15195i(i5, m51195N(t, j));
                            }
                            break;
                        case 68:
                            if (m51207B(t, i5, i)) {
                                interfaceC43393ja8.mo15214M(i5, unsafe.getObject(t, j), m51190i(i));
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.f71184p.mo11226d(interfaceC43393ja8, entry);
                    if (it.hasNext()) {
                        entry = it.next();
                    } else {
                        entry = null;
                    }
                }
                m51174y(this.f71183o, t, interfaceC43393ja8);
            }
        }
        it = null;
        entry = null;
        length = this.f71169a.length;
        Unsafe unsafe2 = f71168s;
        int i32 = -1;
        int i42 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        m51174y(this.f71183o, t, interfaceC43393ja8);
    }

    /* renamed from: I */
    public final boolean m51200I(T t, T t2, int i) {
        return m51208A(t, i) == m51208A(t2, i);
    }

    /* renamed from: Q */
    public final int m51192Q(int i, int i2) {
        if (i >= this.f71171c && i <= this.f71172d) {
            return m51191R(i, i2);
        }
        return -1;
    }

    /* renamed from: R */
    public final int m51191R(int i, int i2) {
        int length = (this.f71169a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f71169a[i4];
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

    @Override // p000.LY7
    /* renamed from: a */
    public final void mo51172a(T t) {
        int i;
        int i2 = this.f71179k;
        while (true) {
            i = this.f71180l;
            if (i2 >= i) {
                break;
            }
            long m51187l = m51187l(this.f71178j[i2]) & 1048575;
            Object m13129G = C49038t58.m13129G(t, m51187l);
            if (m13129G != null) {
                C49038t58.m13114g(t, m51187l, this.f71185q.mo5259e(m13129G));
            }
            i2++;
        }
        int length = this.f71178j.length;
        while (i < length) {
            this.f71182n.mo27337a(t, this.f71178j[i]);
            i++;
        }
        this.f71183o.mo51159d(t);
        if (this.f71174f) {
            this.f71184p.mo11224f(t);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(p000.C49038t58.m13130F(r10, r6)) == java.lang.Double.doubleToLongBits(p000.C49038t58.m13130F(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (p000.C46348oZ7.m20839y(p000.C49038t58.m13129G(r10, r6), p000.C49038t58.m13129G(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (p000.C46348oZ7.m20839y(p000.C49038t58.m13129G(r10, r6), p000.C49038t58.m13129G(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (p000.C49038t58.m13133C(r10, r6) == p000.C49038t58.m13133C(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (p000.C49038t58.m13135A(r10, r6) == p000.C49038t58.m13135A(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (p000.C49038t58.m13133C(r10, r6) == p000.C49038t58.m13133C(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (p000.C49038t58.m13135A(r10, r6) == p000.C49038t58.m13135A(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        if (p000.C49038t58.m13135A(r10, r6) == p000.C49038t58.m13135A(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (p000.C49038t58.m13135A(r10, r6) == p000.C49038t58.m13135A(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (p000.C46348oZ7.m20839y(p000.C49038t58.m13129G(r10, r6), p000.C49038t58.m13129G(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
        if (p000.C46348oZ7.m20839y(p000.C49038t58.m13129G(r10, r6), p000.C49038t58.m13129G(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (p000.C46348oZ7.m20839y(p000.C49038t58.m13129G(r10, r6), p000.C49038t58.m13129G(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012e, code lost:
        if (p000.C49038t58.m13132D(r10, r6) == p000.C49038t58.m13132D(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (p000.C49038t58.m13135A(r10, r6) == p000.C49038t58.m13135A(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (p000.C49038t58.m13133C(r10, r6) == p000.C49038t58.m13133C(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0165, code lost:
        if (p000.C49038t58.m13135A(r10, r6) == p000.C49038t58.m13135A(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
        if (p000.C49038t58.m13133C(r10, r6) == p000.C49038t58.m13133C(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
        if (p000.C49038t58.m13133C(r10, r6) == p000.C49038t58.m13133C(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(p000.C49038t58.m13131E(r10, r6)) == java.lang.Float.floatToIntBits(p000.C49038t58.m13131E(r11, r6))) goto L85;
     */
    @Override // p000.LY7
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo51171b(T t, T t2) {
        int length = this.f71169a.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int m51187l = m51187l(i);
                long j = m51187l & 1048575;
                switch ((m51187l & 267386880) >>> 20) {
                    case 0:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (m51200I(t, t2, i)) {
                            break;
                        }
                        z = false;
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
                        z = C46348oZ7.m20839y(C49038t58.m13129G(t, j), C49038t58.m13129G(t2, j));
                        break;
                    case 50:
                        z = C46348oZ7.m20839y(C49038t58.m13129G(t, j), C49038t58.m13129G(t2, j));
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
                        long m51186m = m51186m(i) & 1048575;
                        if (C49038t58.m13135A(t, m51186m) == C49038t58.m13135A(t2, m51186m)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (!z) {
                    return false;
                }
                i += 3;
            } else if (!this.f71183o.mo51152k(t).equals(this.f71183o.mo51152k(t2))) {
                return false;
            } else {
                if (!this.f71174f) {
                    return true;
                }
                return this.f71184p.mo11227c(t).equals(this.f71184p.mo11227c(t2));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0211, code lost:
        if (r0 == r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0230, code lost:
        if (r0 == r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0232, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e4, code lost:
        if (r0 == r15) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // p000.LY7
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo51170c(T t, byte[] bArr, int i, int i2, C49433tl9 c49433tl9) throws IOException {
        byte b;
        int i3;
        int m51185n;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int m51128k;
        C17537e<T> c17537e = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i11 = i2;
        C49433tl9 c49433tl92 = c49433tl9;
        if (c17537e.f71176h) {
            Unsafe unsafe2 = f71168s;
            int i12 = -1;
            int i13 = i;
            int i14 = -1;
            int i15 = 0;
            while (i13 < i11) {
                int i16 = i13 + 1;
                byte b2 = bArr2[i13];
                if (b2 < 0) {
                    i3 = C17545l.m51135d(b2, bArr2, i16, c49433tl92);
                    b = c49433tl92.f110994a;
                } else {
                    b = b2;
                    i3 = i16;
                }
                int i17 = b >>> 3;
                int i18 = b & 7;
                if (i17 > i14) {
                    m51185n = c17537e.m51192Q(i17, i15 / 3);
                } else {
                    m51185n = c17537e.m51185n(i17);
                }
                int i19 = m51185n;
                if (i19 == i12) {
                    i4 = i17;
                    i5 = i3;
                    unsafe = unsafe2;
                    i6 = i12;
                    i7 = 0;
                } else {
                    int i20 = c17537e.f71169a[i19 + 1];
                    int i21 = (267386880 & i20) >>> 20;
                    long j = 1048575 & i20;
                    if (i21 <= 17) {
                        boolean z = true;
                        switch (i21) {
                            case 0:
                                i10 = i19;
                                if (i18 == 1) {
                                    C49038t58.m13118c(t2, j, C17545l.m51126m(bArr2, i3));
                                    i13 = i3 + 8;
                                    i14 = i17;
                                    i15 = i10;
                                    break;
                                } else {
                                    i4 = i17;
                                    i8 = i3;
                                    unsafe = unsafe2;
                                    i7 = i10;
                                    i6 = -1;
                                    break;
                                }
                            case 1:
                                i10 = i19;
                                if (i18 == 5) {
                                    C49038t58.m13117d(t2, j, C17545l.m51124o(bArr2, i3));
                                    i13 = i3 + 4;
                                    i14 = i17;
                                    i15 = i10;
                                    break;
                                } else {
                                    i4 = i17;
                                    i8 = i3;
                                    unsafe = unsafe2;
                                    i7 = i10;
                                    i6 = -1;
                                    break;
                                }
                            case 2:
                            case 3:
                                i10 = i19;
                                if (i18 == 0) {
                                    m51128k = C17545l.m51128k(bArr2, i3, c49433tl92);
                                    unsafe2.putLong(t, j, c49433tl92.f110995b);
                                    i13 = m51128k;
                                    i14 = i17;
                                    i15 = i10;
                                    break;
                                } else {
                                    i4 = i17;
                                    i8 = i3;
                                    unsafe = unsafe2;
                                    i7 = i10;
                                    i6 = -1;
                                    break;
                                }
                            case 4:
                            case 11:
                                i10 = i19;
                                if (i18 == 0) {
                                    i13 = C17545l.m51129j(bArr2, i3, c49433tl92);
                                    unsafe2.putInt(t2, j, c49433tl92.f110994a);
                                    i14 = i17;
                                    i15 = i10;
                                    break;
                                } else {
                                    i4 = i17;
                                    i8 = i3;
                                    unsafe = unsafe2;
                                    i7 = i10;
                                    i6 = -1;
                                    break;
                                }
                            case 5:
                            case 14:
                                if (i18 == 1) {
                                    i10 = i19;
                                    unsafe2.putLong(t, j, C17545l.m51127l(bArr2, i3));
                                    i13 = i3 + 8;
                                    i14 = i17;
                                    i15 = i10;
                                    break;
                                } else {
                                    i7 = i19;
                                    i4 = i17;
                                    i8 = i3;
                                    unsafe = unsafe2;
                                    i6 = -1;
                                    break;
                                }
                            case 6:
                            case 13:
                                if (i18 == 5) {
                                    unsafe2.putInt(t2, j, C17545l.m51131h(bArr2, i3));
                                    i13 = i3 + 4;
                                    i15 = i19;
                                    i14 = i17;
                                    break;
                                } else {
                                    i7 = i19;
                                    i4 = i17;
                                    i8 = i3;
                                    unsafe = unsafe2;
                                    i6 = -1;
                                    break;
                                }
                            case 7:
                                if (i18 == 0) {
                                    int m51128k2 = C17545l.m51128k(bArr2, i3, c49433tl92);
                                    if (c49433tl92.f110995b == 0) {
                                        z = false;
                                    }
                                    C49038t58.m13113h(t2, j, z);
                                    i13 = m51128k2;
                                    i15 = i19;
                                    i14 = i17;
                                    break;
                                } else {
                                    i7 = i19;
                                    i4 = i17;
                                    i8 = i3;
                                    unsafe = unsafe2;
                                    i6 = -1;
                                    break;
                                }
                            case 8:
                                if (i18 == 2) {
                                    if ((536870912 & i20) == 0) {
                                        i13 = C17545l.m51125n(bArr2, i3, c49433tl92);
                                    } else {
                                        i13 = C17545l.m51123p(bArr2, i3, c49433tl92);
                                    }
                                    unsafe2.putObject(t2, j, c49433tl92.f110996c);
                                    i15 = i19;
                                    i14 = i17;
                                    break;
                                } else {
                                    i7 = i19;
                                    i4 = i17;
                                    i8 = i3;
                                    unsafe = unsafe2;
                                    i6 = -1;
                                    break;
                                }
                            case 9:
                                if (i18 == 2) {
                                    i13 = C17545l.m51132g(c17537e.m51190i(i19), bArr2, i3, i11, c49433tl92);
                                    Object object = unsafe2.getObject(t2, j);
                                    if (object == null) {
                                        unsafe2.putObject(t2, j, c49433tl92.f110996c);
                                    } else {
                                        unsafe2.putObject(t2, j, C44389lF7.m27616d(object, c49433tl92.f110996c));
                                    }
                                    i15 = i19;
                                    i14 = i17;
                                    break;
                                } else {
                                    i7 = i19;
                                    i4 = i17;
                                    i8 = i3;
                                    unsafe = unsafe2;
                                    i6 = -1;
                                    break;
                                }
                            case 10:
                                if (i18 == 2) {
                                    i13 = C17545l.m51122q(bArr2, i3, c49433tl92);
                                    unsafe2.putObject(t2, j, c49433tl92.f110996c);
                                    i15 = i19;
                                    i14 = i17;
                                    break;
                                } else {
                                    i7 = i19;
                                    i4 = i17;
                                    i8 = i3;
                                    unsafe = unsafe2;
                                    i6 = -1;
                                    break;
                                }
                            case 12:
                                i10 = i19;
                                if (i18 == 0) {
                                    i13 = C17545l.m51129j(bArr2, i3, c49433tl92);
                                    unsafe2.putInt(t2, j, c49433tl92.f110994a);
                                    i14 = i17;
                                    i15 = i10;
                                    break;
                                } else {
                                    i4 = i17;
                                    i8 = i3;
                                    unsafe = unsafe2;
                                    i7 = i10;
                                    i6 = -1;
                                    break;
                                }
                            case 15:
                                i10 = i19;
                                if (i18 == 0) {
                                    i13 = C17545l.m51129j(bArr2, i3, c49433tl92);
                                    unsafe2.putInt(t2, j, AbstractC36642Vm7.m79422e(c49433tl92.f110994a));
                                    i14 = i17;
                                    i15 = i10;
                                    break;
                                } else {
                                    i4 = i17;
                                    i8 = i3;
                                    unsafe = unsafe2;
                                    i7 = i10;
                                    i6 = -1;
                                    break;
                                }
                            case 16:
                                if (i18 == 0) {
                                    m51128k = C17545l.m51128k(bArr2, i3, c49433tl92);
                                    i10 = i19;
                                    unsafe2.putLong(t, j, AbstractC36642Vm7.m79425b(c49433tl92.f110995b));
                                    i13 = m51128k;
                                    i14 = i17;
                                    i15 = i10;
                                    break;
                                } else {
                                    i7 = i19;
                                    i4 = i17;
                                    i8 = i3;
                                    unsafe = unsafe2;
                                    i6 = -1;
                                    break;
                                }
                            default:
                                i7 = i19;
                                i4 = i17;
                                i8 = i3;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                        }
                        i12 = -1;
                    } else if (i21 == 27) {
                        if (i18 == 2) {
                            BI7 bi7 = (BI7) unsafe2.getObject(t2, j);
                            if (!bi7.mo64608v1()) {
                                int size = bi7.size();
                                if (size == 0) {
                                    i9 = 10;
                                } else {
                                    i9 = size << 1;
                                }
                                bi7 = bi7.zzh(i9);
                                unsafe2.putObject(t2, j, bi7);
                            }
                            i13 = C17545l.m51134e(c17537e.m51190i(i19), b, bArr, i3, i2, bi7, c49433tl9);
                            i14 = i17;
                            i15 = i19;
                            i12 = -1;
                        } else {
                            i7 = i19;
                            i4 = i17;
                            i8 = i3;
                            unsafe = unsafe2;
                            i6 = -1;
                        }
                    } else {
                        i7 = i19;
                        if (i21 <= 49) {
                            i4 = i17;
                            int i22 = i3;
                            unsafe = unsafe2;
                            i6 = -1;
                            i13 = m51183p(t, bArr, i3, i2, b, i17, i18, i7, i20, i21, j, c49433tl9);
                        } else {
                            i4 = i17;
                            i8 = i3;
                            unsafe = unsafe2;
                            i6 = -1;
                            if (i21 == 50) {
                                if (i18 == 2) {
                                    i13 = m51182q(t, bArr, i8, i2, i7, j, c49433tl9);
                                }
                            } else {
                                i13 = m51184o(t, bArr, i8, i2, b, i4, i18, i20, i21, j, i7, c49433tl9);
                            }
                        }
                        c17537e = this;
                        t2 = t;
                        bArr2 = bArr;
                        i11 = i2;
                        c49433tl92 = c49433tl9;
                        unsafe2 = unsafe;
                        i15 = i7;
                        i14 = i4;
                        i12 = i6;
                    }
                    i5 = i8;
                }
                i13 = C17545l.m51137b(b, bArr, i5, i2, m51193P(t), c49433tl9);
                c17537e = this;
                t2 = t;
                bArr2 = bArr;
                i11 = i2;
                c49433tl92 = c49433tl9;
                unsafe2 = unsafe;
                i15 = i7;
                i14 = i4;
                i12 = i6;
            }
            if (i13 == i11) {
                return;
            }
            throw zzbk.m51034e();
        }
        m51181r(t, bArr, i, i2, 0, c49433tl9);
    }

    @Override // p000.LY7
    /* renamed from: d */
    public final T mo51169d() {
        return (T) this.f71181m.mo51163a(this.f71173e);
    }

    @Override // p000.LY7
    /* renamed from: e */
    public final int mo51168e(T t) {
        int i;
        int m27610j;
        int length = this.f71169a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m51187l = m51187l(i3);
            int i4 = this.f71169a[i3];
            long j = 1048575 & m51187l;
            int i5 = 37;
            switch ((m51187l & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    m27610j = C44389lF7.m27610j(Double.doubleToLongBits(C49038t58.m13130F(t, j)));
                    i2 = i + m27610j;
                    break;
                case 1:
                    i = i2 * 53;
                    m27610j = Float.floatToIntBits(C49038t58.m13131E(t, j));
                    i2 = i + m27610j;
                    break;
                case 2:
                    i = i2 * 53;
                    m27610j = C44389lF7.m27610j(C49038t58.m13133C(t, j));
                    i2 = i + m27610j;
                    break;
                case 3:
                    i = i2 * 53;
                    m27610j = C44389lF7.m27610j(C49038t58.m13133C(t, j));
                    i2 = i + m27610j;
                    break;
                case 4:
                    i = i2 * 53;
                    m27610j = C49038t58.m13135A(t, j);
                    i2 = i + m27610j;
                    break;
                case 5:
                    i = i2 * 53;
                    m27610j = C44389lF7.m27610j(C49038t58.m13133C(t, j));
                    i2 = i + m27610j;
                    break;
                case 6:
                    i = i2 * 53;
                    m27610j = C49038t58.m13135A(t, j);
                    i2 = i + m27610j;
                    break;
                case 7:
                    i = i2 * 53;
                    m27610j = C44389lF7.m27614f(C49038t58.m13132D(t, j));
                    i2 = i + m27610j;
                    break;
                case 8:
                    i = i2 * 53;
                    m27610j = ((String) C49038t58.m13129G(t, j)).hashCode();
                    i2 = i + m27610j;
                    break;
                case 9:
                    Object m13129G = C49038t58.m13129G(t, j);
                    if (m13129G != null) {
                        i5 = m13129G.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    m27610j = C49038t58.m13129G(t, j).hashCode();
                    i2 = i + m27610j;
                    break;
                case 11:
                    i = i2 * 53;
                    m27610j = C49038t58.m13135A(t, j);
                    i2 = i + m27610j;
                    break;
                case 12:
                    i = i2 * 53;
                    m27610j = C49038t58.m13135A(t, j);
                    i2 = i + m27610j;
                    break;
                case 13:
                    i = i2 * 53;
                    m27610j = C49038t58.m13135A(t, j);
                    i2 = i + m27610j;
                    break;
                case 14:
                    i = i2 * 53;
                    m27610j = C44389lF7.m27610j(C49038t58.m13133C(t, j));
                    i2 = i + m27610j;
                    break;
                case 15:
                    i = i2 * 53;
                    m27610j = C49038t58.m13135A(t, j);
                    i2 = i + m27610j;
                    break;
                case 16:
                    i = i2 * 53;
                    m27610j = C44389lF7.m27610j(C49038t58.m13133C(t, j));
                    i2 = i + m27610j;
                    break;
                case 17:
                    Object m13129G2 = C49038t58.m13129G(t, j);
                    if (m13129G2 != null) {
                        i5 = m13129G2.hashCode();
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
                    m27610j = C49038t58.m13129G(t, j).hashCode();
                    i2 = i + m27610j;
                    break;
                case 50:
                    i = i2 * 53;
                    m27610j = C49038t58.m13129G(t, j).hashCode();
                    i2 = i + m27610j;
                    break;
                case 51:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = C44389lF7.m27610j(Double.doubleToLongBits(m51198K(t, j)));
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = Float.floatToIntBits(m51197L(t, j));
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = C44389lF7.m27610j(m51195N(t, j));
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = C44389lF7.m27610j(m51195N(t, j));
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = m51196M(t, j);
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = C44389lF7.m27610j(m51195N(t, j));
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = m51196M(t, j);
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = C44389lF7.m27614f(m51194O(t, j));
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = ((String) C49038t58.m13129G(t, j)).hashCode();
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = C49038t58.m13129G(t, j).hashCode();
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = C49038t58.m13129G(t, j).hashCode();
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = m51196M(t, j);
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = m51196M(t, j);
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = m51196M(t, j);
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = C44389lF7.m27610j(m51195N(t, j));
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = m51196M(t, j);
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = C44389lF7.m27610j(m51195N(t, j));
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m51207B(t, i4, i3)) {
                        i = i2 * 53;
                        m27610j = C49038t58.m13129G(t, j).hashCode();
                        i2 = i + m27610j;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f71183o.mo51152k(t).hashCode();
        if (this.f71174f) {
            return (hashCode * 53) + this.f71184p.mo11227c(t).hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.LY7
    /* renamed from: f */
    public final boolean mo51167f(T t) {
        int i;
        boolean z;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            if (i3 < this.f71179k) {
                int i5 = this.f71178j[i3];
                int i6 = this.f71169a[i5];
                int m51187l = m51187l(i5);
                if (!this.f71176h) {
                    int i7 = this.f71169a[i5 + 2];
                    int i8 = i7 & 1048575;
                    i = 1 << (i7 >>> 20);
                    if (i8 != i2) {
                        i4 = f71168s.getInt(t, i8);
                        i2 = i8;
                    }
                } else {
                    i = 0;
                }
                if ((268435456 & m51187l) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !m51206C(t, i5, i4, i)) {
                    return false;
                }
                int i9 = (267386880 & m51187l) >>> 20;
                if (i9 != 9 && i9 != 17) {
                    if (i9 != 27) {
                        if (i9 != 60 && i9 != 68) {
                            if (i9 != 49) {
                                if (i9 == 50 && !this.f71185q.mo5257g(C49038t58.m13129G(t, m51187l & 1048575)).isEmpty()) {
                                    this.f71185q.mo5260d(m51189j(i5));
                                    throw null;
                                }
                            }
                        } else if (m51207B(t, i6, i5) && !m51205D(t, m51187l, m51190i(i5))) {
                            return false;
                        }
                    }
                    List list = (List) C49038t58.m13129G(t, m51187l & 1048575);
                    if (!list.isEmpty()) {
                        LY7 m51190i = m51190i(i5);
                        int i10 = 0;
                        while (true) {
                            if (i10 >= list.size()) {
                                break;
                            } else if (!m51190i.mo51167f(list.get(i10))) {
                                z2 = false;
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!z2) {
                        return false;
                    }
                } else if (m51206C(t, i5, i4, i) && !m51205D(t, m51187l, m51190i(i5))) {
                    return false;
                }
                i3++;
            } else if (this.f71174f && !this.f71184p.mo11227c(t).m104566c()) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a2a  */
    @Override // p000.LY7
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo51166g(T t, InterfaceC43393ja8 interfaceC43393ja8) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        Iterator<Map.Entry<?, Object>> it2;
        Map.Entry<?, Object> entry2;
        int length2;
        if (interfaceC43393ja8.mo15206U() == AbstractC17530c.C17534d.f71165m) {
            m51174y(this.f71183o, t, interfaceC43393ja8);
            if (this.f71174f) {
                C33231Gx7<?> mo11227c = this.f71184p.mo11227c(t);
                if (!mo11227c.f12664a.isEmpty()) {
                    it2 = mo11227c.m104568a();
                    entry2 = it2.next();
                    for (length2 = this.f71169a.length - 3; length2 >= 0; length2 -= 3) {
                        int m51187l = m51187l(length2);
                        int i2 = this.f71169a[length2];
                        while (entry2 != null && this.f71184p.mo11229a(entry2) > i2) {
                            this.f71184p.mo11226d(interfaceC43393ja8, entry2);
                            entry2 = it2.hasNext() ? it2.next() : null;
                        }
                        switch ((m51187l & 267386880) >>> 20) {
                            case 0:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15219H(i2, C49038t58.m13130F(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15218I(i2, C49038t58.m13131E(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15223C(i2, C49038t58.m13133C(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15196h(i2, C49038t58.m13133C(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15192l(i2, C49038t58.m13135A(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15224B(i2, C49038t58.m13133C(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15216K(i2, C49038t58.m13135A(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15215L(i2, C49038t58.m13132D(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (m51208A(t, length2)) {
                                    m51176w(i2, C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15212O(i2, C49038t58.m13129G(t, m51187l & 1048575), m51190i(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15208S(i2, (AbstractC43604jv9) C49038t58.m13129G(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15191m(i2, C49038t58.m13135A(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15209R(i2, C49038t58.m13135A(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15222E(i2, C49038t58.m13135A(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15213N(i2, C49038t58.m13133C(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15193k(i2, C49038t58.m13135A(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15195i(i2, C49038t58.m13133C(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (m51208A(t, length2)) {
                                    interfaceC43393ja8.mo15214M(i2, C49038t58.m13129G(t, m51187l & 1048575), m51190i(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                C46348oZ7.m20859e(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, false);
                                break;
                            case 19:
                                C46348oZ7.m20853k(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, false);
                                break;
                            case 20:
                                C46348oZ7.m20848p(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, false);
                                break;
                            case 21:
                                C46348oZ7.m20840x(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, false);
                                break;
                            case 22:
                                C46348oZ7.m20885I(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, false);
                                break;
                            case 23:
                                C46348oZ7.m20890D(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, false);
                                break;
                            case 24:
                                C46348oZ7.m20879O(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, false);
                                break;
                            case 25:
                                C46348oZ7.m20874T(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, false);
                                break;
                            case 26:
                                C46348oZ7.m20863c(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8);
                                break;
                            case 27:
                                C46348oZ7.m20861d(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, m51190i(length2));
                                break;
                            case 28:
                                C46348oZ7.m20855i(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8);
                                break;
                            case 29:
                                C46348oZ7.m20883K(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, false);
                                break;
                            case 30:
                                C46348oZ7.m20875S(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, false);
                                break;
                            case 31:
                                C46348oZ7.m20877Q(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, false);
                                break;
                            case 32:
                                C46348oZ7.m20887G(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, false);
                                break;
                            case 33:
                                C46348oZ7.m20881M(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, false);
                                break;
                            case 34:
                                C46348oZ7.m20892B(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, false);
                                break;
                            case 35:
                                C46348oZ7.m20859e(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, true);
                                break;
                            case 36:
                                C46348oZ7.m20853k(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, true);
                                break;
                            case 37:
                                C46348oZ7.m20848p(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, true);
                                break;
                            case 38:
                                C46348oZ7.m20840x(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, true);
                                break;
                            case 39:
                                C46348oZ7.m20885I(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, true);
                                break;
                            case 40:
                                C46348oZ7.m20890D(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, true);
                                break;
                            case 41:
                                C46348oZ7.m20879O(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, true);
                                break;
                            case 42:
                                C46348oZ7.m20874T(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, true);
                                break;
                            case 43:
                                C46348oZ7.m20883K(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, true);
                                break;
                            case 44:
                                C46348oZ7.m20875S(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, true);
                                break;
                            case 45:
                                C46348oZ7.m20877Q(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, true);
                                break;
                            case 46:
                                C46348oZ7.m20887G(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, true);
                                break;
                            case 47:
                                C46348oZ7.m20881M(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, true);
                                break;
                            case 48:
                                C46348oZ7.m20892B(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, true);
                                break;
                            case 49:
                                C46348oZ7.m20854j(this.f71169a[length2], (List) C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8, m51190i(length2));
                                break;
                            case 50:
                                m51173z(interfaceC43393ja8, i2, C49038t58.m13129G(t, m51187l & 1048575), length2);
                                break;
                            case 51:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15219H(i2, m51198K(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15218I(i2, m51197L(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15223C(i2, m51195N(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15196h(i2, m51195N(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15192l(i2, m51196M(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15224B(i2, m51195N(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15216K(i2, m51196M(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15215L(i2, m51194O(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (m51207B(t, i2, length2)) {
                                    m51176w(i2, C49038t58.m13129G(t, m51187l & 1048575), interfaceC43393ja8);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15212O(i2, C49038t58.m13129G(t, m51187l & 1048575), m51190i(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15208S(i2, (AbstractC43604jv9) C49038t58.m13129G(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15191m(i2, m51196M(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15209R(i2, m51196M(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15222E(i2, m51196M(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15213N(i2, m51195N(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15193k(i2, m51196M(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15195i(i2, m51195N(t, m51187l & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (m51207B(t, i2, length2)) {
                                    interfaceC43393ja8.mo15214M(i2, C49038t58.m13129G(t, m51187l & 1048575), m51190i(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry2 != null) {
                        this.f71184p.mo11226d(interfaceC43393ja8, entry2);
                        entry2 = it2.hasNext() ? it2.next() : null;
                    }
                }
            }
            it2 = null;
            entry2 = null;
            while (length2 >= 0) {
            }
            while (entry2 != null) {
            }
        } else if (this.f71176h) {
            if (this.f71174f) {
                C33231Gx7<?> mo11227c2 = this.f71184p.mo11227c(t);
                if (!mo11227c2.f12664a.isEmpty()) {
                    it = mo11227c2.m104565d();
                    entry = it.next();
                    length = this.f71169a.length;
                    for (i = 0; i < length; i += 3) {
                        int m51187l2 = m51187l(i);
                        int i3 = this.f71169a[i];
                        while (entry != null && this.f71184p.mo11229a(entry) <= i3) {
                            this.f71184p.mo11226d(interfaceC43393ja8, entry);
                            entry = it.hasNext() ? it.next() : null;
                        }
                        switch ((m51187l2 & 267386880) >>> 20) {
                            case 0:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15219H(i3, C49038t58.m13130F(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15218I(i3, C49038t58.m13131E(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15223C(i3, C49038t58.m13133C(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15196h(i3, C49038t58.m13133C(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15192l(i3, C49038t58.m13135A(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15224B(i3, C49038t58.m13133C(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15216K(i3, C49038t58.m13135A(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15215L(i3, C49038t58.m13132D(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (m51208A(t, i)) {
                                    m51176w(i3, C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15212O(i3, C49038t58.m13129G(t, m51187l2 & 1048575), m51190i(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15208S(i3, (AbstractC43604jv9) C49038t58.m13129G(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15191m(i3, C49038t58.m13135A(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15209R(i3, C49038t58.m13135A(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15222E(i3, C49038t58.m13135A(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15213N(i3, C49038t58.m13133C(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15193k(i3, C49038t58.m13135A(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15195i(i3, C49038t58.m13133C(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (m51208A(t, i)) {
                                    interfaceC43393ja8.mo15214M(i3, C49038t58.m13129G(t, m51187l2 & 1048575), m51190i(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                C46348oZ7.m20859e(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, false);
                                break;
                            case 19:
                                C46348oZ7.m20853k(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, false);
                                break;
                            case 20:
                                C46348oZ7.m20848p(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, false);
                                break;
                            case 21:
                                C46348oZ7.m20840x(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, false);
                                break;
                            case 22:
                                C46348oZ7.m20885I(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, false);
                                break;
                            case 23:
                                C46348oZ7.m20890D(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, false);
                                break;
                            case 24:
                                C46348oZ7.m20879O(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, false);
                                break;
                            case 25:
                                C46348oZ7.m20874T(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, false);
                                break;
                            case 26:
                                C46348oZ7.m20863c(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8);
                                break;
                            case 27:
                                C46348oZ7.m20861d(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, m51190i(i));
                                break;
                            case 28:
                                C46348oZ7.m20855i(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8);
                                break;
                            case 29:
                                C46348oZ7.m20883K(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, false);
                                break;
                            case 30:
                                C46348oZ7.m20875S(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, false);
                                break;
                            case 31:
                                C46348oZ7.m20877Q(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, false);
                                break;
                            case 32:
                                C46348oZ7.m20887G(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, false);
                                break;
                            case 33:
                                C46348oZ7.m20881M(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, false);
                                break;
                            case 34:
                                C46348oZ7.m20892B(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, false);
                                break;
                            case 35:
                                C46348oZ7.m20859e(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, true);
                                break;
                            case 36:
                                C46348oZ7.m20853k(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, true);
                                break;
                            case 37:
                                C46348oZ7.m20848p(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, true);
                                break;
                            case 38:
                                C46348oZ7.m20840x(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, true);
                                break;
                            case 39:
                                C46348oZ7.m20885I(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, true);
                                break;
                            case 40:
                                C46348oZ7.m20890D(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, true);
                                break;
                            case 41:
                                C46348oZ7.m20879O(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, true);
                                break;
                            case 42:
                                C46348oZ7.m20874T(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, true);
                                break;
                            case 43:
                                C46348oZ7.m20883K(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, true);
                                break;
                            case 44:
                                C46348oZ7.m20875S(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, true);
                                break;
                            case 45:
                                C46348oZ7.m20877Q(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, true);
                                break;
                            case 46:
                                C46348oZ7.m20887G(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, true);
                                break;
                            case 47:
                                C46348oZ7.m20881M(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, true);
                                break;
                            case 48:
                                C46348oZ7.m20892B(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, true);
                                break;
                            case 49:
                                C46348oZ7.m20854j(this.f71169a[i], (List) C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8, m51190i(i));
                                break;
                            case 50:
                                m51173z(interfaceC43393ja8, i3, C49038t58.m13129G(t, m51187l2 & 1048575), i);
                                break;
                            case 51:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15219H(i3, m51198K(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15218I(i3, m51197L(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15223C(i3, m51195N(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15196h(i3, m51195N(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15192l(i3, m51196M(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15224B(i3, m51195N(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15216K(i3, m51196M(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15215L(i3, m51194O(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (m51207B(t, i3, i)) {
                                    m51176w(i3, C49038t58.m13129G(t, m51187l2 & 1048575), interfaceC43393ja8);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15212O(i3, C49038t58.m13129G(t, m51187l2 & 1048575), m51190i(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15208S(i3, (AbstractC43604jv9) C49038t58.m13129G(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15191m(i3, m51196M(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15209R(i3, m51196M(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15222E(i3, m51196M(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15213N(i3, m51195N(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15193k(i3, m51196M(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15195i(i3, m51195N(t, m51187l2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (m51207B(t, i3, i)) {
                                    interfaceC43393ja8.mo15214M(i3, C49038t58.m13129G(t, m51187l2 & 1048575), m51190i(i));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry != null) {
                        this.f71184p.mo11226d(interfaceC43393ja8, entry);
                        entry = it.hasNext() ? it.next() : null;
                    }
                    m51174y(this.f71183o, t, interfaceC43393ja8);
                }
            }
            it = null;
            entry = null;
            length = this.f71169a.length;
            while (i < length) {
            }
            while (entry != null) {
            }
            m51174y(this.f71183o, t, interfaceC43393ja8);
        } else {
            m51201H(t, interfaceC43393ja8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.LY7
    /* renamed from: h */
    public final int mo51165h(T t) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        long j;
        int m51106S;
        int m51074t;
        int m51079p0;
        int m20864b0;
        int m20878P;
        int m51070v0;
        int m51066x0;
        int i5;
        int m51076r;
        int m20878P2;
        int m51070v02;
        int m51066x02;
        int i6 = 267386880;
        int i7 = 1;
        int i8 = 0;
        if (this.f71176h) {
            Unsafe unsafe = f71168s;
            int i9 = 0;
            int i10 = 0;
            while (i9 < this.f71169a.length) {
                int m51187l = m51187l(i9);
                int i11 = (m51187l & i6) >>> 20;
                int i12 = this.f71169a[i9];
                long j2 = m51187l & 1048575;
                if (i11 >= EnumC51932xy7.f118446T.m4368a() && i11 <= EnumC51932xy7.f118476w0.m4368a()) {
                    i5 = this.f71169a[i9 + 2] & 1048575;
                } else {
                    i5 = 0;
                }
                switch (i11) {
                    case 0:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51076r(i12, 0.0d);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 1:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51075s(i12, 0.0f);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 2:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51106S(i12, C49038t58.m13133C(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 3:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51103X(i12, C49038t58.m13133C(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 4:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51096d0(i12, C49038t58.m13135A(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 5:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51094e0(i12, 0L);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 6:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51083m0(i12, 0);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 7:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51113I(i12, true);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 8:
                        if (m51208A(t, i9)) {
                            Object m13129G = C49038t58.m13129G(t, j2);
                            if (m13129G instanceof AbstractC43604jv9) {
                                m51076r = zzaj.m51114H(i12, (AbstractC43604jv9) m13129G);
                                break;
                            } else {
                                m51076r = zzaj.m51074t(i12, (String) m13129G);
                                break;
                            }
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 9:
                        if (m51208A(t, i9)) {
                            m51076r = C46348oZ7.m20851m(i12, C49038t58.m13129G(t, j2), m51190i(i9));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 10:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51114H(i12, (AbstractC43604jv9) C49038t58.m13129G(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 11:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51090g0(i12, C49038t58.m13135A(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 12:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51077q0(i12, C49038t58.m13135A(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 13:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51079p0(i12, 0);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 14:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51088h0(i12, 0L);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 15:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51085j0(i12, C49038t58.m13135A(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 16:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51100a0(i12, C49038t58.m13133C(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 17:
                        if (m51208A(t, i9)) {
                            m51076r = zzaj.m51115G(i12, (InterfaceC52815zT7) C49038t58.m13129G(t, j2), m51190i(i9));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 18:
                        m51076r = C46348oZ7.m20862c0(i12, m51199J(t, j2), false);
                        break;
                    case 19:
                        m51076r = C46348oZ7.m20864b0(i12, m51199J(t, j2), false);
                        break;
                    case 20:
                        m51076r = C46348oZ7.m20873U(i12, m51199J(t, j2), false);
                        break;
                    case 21:
                        m51076r = C46348oZ7.m20872V(i12, m51199J(t, j2), false);
                        break;
                    case 22:
                        m51076r = C46348oZ7.m20869Y(i12, m51199J(t, j2), false);
                        break;
                    case 23:
                        m51076r = C46348oZ7.m20862c0(i12, m51199J(t, j2), false);
                        break;
                    case 24:
                        m51076r = C46348oZ7.m20864b0(i12, m51199J(t, j2), false);
                        break;
                    case 25:
                        m51076r = C46348oZ7.m20860d0(i12, m51199J(t, j2), false);
                        break;
                    case 26:
                        m51076r = C46348oZ7.m20850n(i12, m51199J(t, j2));
                        break;
                    case 27:
                        m51076r = C46348oZ7.m20849o(i12, m51199J(t, j2), m51190i(i9));
                        break;
                    case 28:
                        m51076r = C46348oZ7.m20843u(i12, m51199J(t, j2));
                        break;
                    case 29:
                        m51076r = C46348oZ7.m20868Z(i12, m51199J(t, j2), false);
                        break;
                    case 30:
                        m51076r = C46348oZ7.m20870X(i12, m51199J(t, j2), false);
                        break;
                    case 31:
                        m51076r = C46348oZ7.m20864b0(i12, m51199J(t, j2), false);
                        break;
                    case 32:
                        m51076r = C46348oZ7.m20862c0(i12, m51199J(t, j2), false);
                        break;
                    case 33:
                        m51076r = C46348oZ7.m20866a0(i12, m51199J(t, j2), false);
                        break;
                    case 34:
                        m51076r = C46348oZ7.m20871W(i12, m51199J(t, j2), false);
                        break;
                    case 35:
                        m20878P2 = C46348oZ7.m20878P((List) unsafe.getObject(t, j2));
                        if (m20878P2 > 0) {
                            if (this.f71177i) {
                                unsafe.putInt(t, i5, m20878P2);
                            }
                            m51070v02 = zzaj.m51070v0(i12);
                            m51066x02 = zzaj.m51066x0(m20878P2);
                            m51076r = m51070v02 + m51066x02 + m20878P2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 36:
                        m20878P2 = C46348oZ7.m20880N((List) unsafe.getObject(t, j2));
                        if (m20878P2 > 0) {
                            if (this.f71177i) {
                                unsafe.putInt(t, i5, m20878P2);
                            }
                            m51070v02 = zzaj.m51070v0(i12);
                            m51066x02 = zzaj.m51066x0(m20878P2);
                            m51076r = m51070v02 + m51066x02 + m20878P2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 37:
                        m20878P2 = C46348oZ7.m20841w((List) unsafe.getObject(t, j2));
                        if (m20878P2 > 0) {
                            if (this.f71177i) {
                                unsafe.putInt(t, i5, m20878P2);
                            }
                            m51070v02 = zzaj.m51070v0(i12);
                            m51066x02 = zzaj.m51066x0(m20878P2);
                            m51076r = m51070v02 + m51066x02 + m20878P2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 38:
                        m20878P2 = C46348oZ7.m20838z((List) unsafe.getObject(t, j2));
                        if (m20878P2 > 0) {
                            if (this.f71177i) {
                                unsafe.putInt(t, i5, m20878P2);
                            }
                            m51070v02 = zzaj.m51070v0(i12);
                            m51066x02 = zzaj.m51066x0(m20878P2);
                            m51076r = m51070v02 + m51066x02 + m20878P2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 39:
                        m20878P2 = C46348oZ7.m20886H((List) unsafe.getObject(t, j2));
                        if (m20878P2 > 0) {
                            if (this.f71177i) {
                                unsafe.putInt(t, i5, m20878P2);
                            }
                            m51070v02 = zzaj.m51070v0(i12);
                            m51066x02 = zzaj.m51066x0(m20878P2);
                            m51076r = m51070v02 + m51066x02 + m20878P2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 40:
                        m20878P2 = C46348oZ7.m20878P((List) unsafe.getObject(t, j2));
                        if (m20878P2 > 0) {
                            if (this.f71177i) {
                                unsafe.putInt(t, i5, m20878P2);
                            }
                            m51070v02 = zzaj.m51070v0(i12);
                            m51066x02 = zzaj.m51066x0(m20878P2);
                            m51076r = m51070v02 + m51066x02 + m20878P2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 41:
                        m20878P2 = C46348oZ7.m20880N((List) unsafe.getObject(t, j2));
                        if (m20878P2 > 0) {
                            if (this.f71177i) {
                                unsafe.putInt(t, i5, m20878P2);
                            }
                            m51070v02 = zzaj.m51070v0(i12);
                            m51066x02 = zzaj.m51066x0(m20878P2);
                            m51076r = m51070v02 + m51066x02 + m20878P2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 42:
                        m20878P2 = C46348oZ7.m20876R((List) unsafe.getObject(t, j2));
                        if (m20878P2 > 0) {
                            if (this.f71177i) {
                                unsafe.putInt(t, i5, m20878P2);
                            }
                            m51070v02 = zzaj.m51070v0(i12);
                            m51066x02 = zzaj.m51066x0(m20878P2);
                            m51076r = m51070v02 + m51066x02 + m20878P2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 43:
                        m20878P2 = C46348oZ7.m20884J((List) unsafe.getObject(t, j2));
                        if (m20878P2 > 0) {
                            if (this.f71177i) {
                                unsafe.putInt(t, i5, m20878P2);
                            }
                            m51070v02 = zzaj.m51070v0(i12);
                            m51066x02 = zzaj.m51066x0(m20878P2);
                            m51076r = m51070v02 + m51066x02 + m20878P2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 44:
                        m20878P2 = C46348oZ7.m20888F((List) unsafe.getObject(t, j2));
                        if (m20878P2 > 0) {
                            if (this.f71177i) {
                                unsafe.putInt(t, i5, m20878P2);
                            }
                            m51070v02 = zzaj.m51070v0(i12);
                            m51066x02 = zzaj.m51066x0(m20878P2);
                            m51076r = m51070v02 + m51066x02 + m20878P2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 45:
                        m20878P2 = C46348oZ7.m20880N((List) unsafe.getObject(t, j2));
                        if (m20878P2 > 0) {
                            if (this.f71177i) {
                                unsafe.putInt(t, i5, m20878P2);
                            }
                            m51070v02 = zzaj.m51070v0(i12);
                            m51066x02 = zzaj.m51066x0(m20878P2);
                            m51076r = m51070v02 + m51066x02 + m20878P2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 46:
                        m20878P2 = C46348oZ7.m20878P((List) unsafe.getObject(t, j2));
                        if (m20878P2 > 0) {
                            if (this.f71177i) {
                                unsafe.putInt(t, i5, m20878P2);
                            }
                            m51070v02 = zzaj.m51070v0(i12);
                            m51066x02 = zzaj.m51066x0(m20878P2);
                            m51076r = m51070v02 + m51066x02 + m20878P2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 47:
                        m20878P2 = C46348oZ7.m20882L((List) unsafe.getObject(t, j2));
                        if (m20878P2 > 0) {
                            if (this.f71177i) {
                                unsafe.putInt(t, i5, m20878P2);
                            }
                            m51070v02 = zzaj.m51070v0(i12);
                            m51066x02 = zzaj.m51066x0(m20878P2);
                            m51076r = m51070v02 + m51066x02 + m20878P2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 48:
                        m20878P2 = C46348oZ7.m20891C((List) unsafe.getObject(t, j2));
                        if (m20878P2 > 0) {
                            if (this.f71177i) {
                                unsafe.putInt(t, i5, m20878P2);
                            }
                            m51070v02 = zzaj.m51070v0(i12);
                            m51066x02 = zzaj.m51066x0(m20878P2);
                            m51076r = m51070v02 + m51066x02 + m20878P2;
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 49:
                        m51076r = C46348oZ7.m20842v(i12, m51199J(t, j2), m51190i(i9));
                        break;
                    case 50:
                        m51076r = this.f71185q.mo5255i(i12, C49038t58.m13129G(t, j2), m51189j(i9));
                        break;
                    case 51:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51076r(i12, 0.0d);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 52:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51075s(i12, 0.0f);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 53:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51106S(i12, m51195N(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 54:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51103X(i12, m51195N(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 55:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51096d0(i12, m51196M(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 56:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51094e0(i12, 0L);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 57:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51083m0(i12, 0);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 58:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51113I(i12, true);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 59:
                        if (m51207B(t, i12, i9)) {
                            Object m13129G2 = C49038t58.m13129G(t, j2);
                            if (m13129G2 instanceof AbstractC43604jv9) {
                                m51076r = zzaj.m51114H(i12, (AbstractC43604jv9) m13129G2);
                                break;
                            } else {
                                m51076r = zzaj.m51074t(i12, (String) m13129G2);
                                break;
                            }
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 60:
                        if (m51207B(t, i12, i9)) {
                            m51076r = C46348oZ7.m20851m(i12, C49038t58.m13129G(t, j2), m51190i(i9));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 61:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51114H(i12, (AbstractC43604jv9) C49038t58.m13129G(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 62:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51090g0(i12, m51196M(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 63:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51077q0(i12, m51196M(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 64:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51079p0(i12, 0);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 65:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51088h0(i12, 0L);
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 66:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51085j0(i12, m51196M(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 67:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51100a0(i12, m51195N(t, j2));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    case 68:
                        if (m51207B(t, i12, i9)) {
                            m51076r = zzaj.m51115G(i12, (InterfaceC52815zT7) C49038t58.m13129G(t, j2), m51190i(i9));
                            break;
                        } else {
                            continue;
                            i9 += 3;
                            i6 = 267386880;
                        }
                    default:
                        i9 += 3;
                        i6 = 267386880;
                }
                i10 += m51076r;
                i9 += 3;
                i6 = 267386880;
            }
            return i10 + m51180s(this.f71183o, t);
        }
        Unsafe unsafe2 = f71168s;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < this.f71169a.length) {
            int m51187l2 = m51187l(i14);
            int[] iArr = this.f71169a;
            int i17 = iArr[i14];
            int i18 = (m51187l2 & 267386880) >>> 20;
            if (i18 <= 17) {
                int i19 = iArr[i14 + 2];
                int i20 = i19 & 1048575;
                i2 = i7 << (i19 >>> 20);
                if (i20 != i13) {
                    i16 = unsafe2.getInt(t, i20);
                    i13 = i20;
                }
                i = i19;
            } else {
                if (this.f71177i && i18 >= EnumC51932xy7.f118446T.m4368a() && i18 <= EnumC51932xy7.f118476w0.m4368a()) {
                    i = this.f71169a[i14 + 2] & 1048575;
                } else {
                    i = 0;
                }
                i2 = 0;
            }
            long j3 = m51187l2 & 1048575;
            switch (i18) {
                case 0:
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    if ((i16 & i2) != 0) {
                        i15 += zzaj.m51076r(i17, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i16 & i2) != 0) {
                        z = false;
                        i15 += zzaj.m51075s(i17, 0.0f);
                        break;
                    }
                    z = false;
                case 2:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i16 & i2) != 0) {
                        m51106S = zzaj.m51106S(i17, unsafe2.getLong(t, j3));
                        i15 += m51106S;
                    }
                    z = false;
                    break;
                case 3:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i16 & i2) != 0) {
                        m51106S = zzaj.m51103X(i17, unsafe2.getLong(t, j3));
                        i15 += m51106S;
                    }
                    z = false;
                    break;
                case 4:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i16 & i2) != 0) {
                        m51106S = zzaj.m51096d0(i17, unsafe2.getInt(t, j3));
                        i15 += m51106S;
                    }
                    z = false;
                    break;
                case 5:
                    i3 = 1;
                    i4 = 0;
                    j = 0;
                    if ((i16 & i2) != 0) {
                        m51106S = zzaj.m51094e0(i17, 0L);
                        i15 += m51106S;
                    }
                    z = false;
                    break;
                case 6:
                    i3 = 1;
                    if ((i16 & i2) != 0) {
                        i4 = 0;
                        i15 += zzaj.m51083m0(i17, 0);
                        z = false;
                        j = 0;
                        break;
                    }
                    i4 = 0;
                    z = false;
                    j = 0;
                case 7:
                    if ((i16 & i2) != 0) {
                        i3 = 1;
                        i15 += zzaj.m51113I(i17, true);
                        i4 = 0;
                        z = false;
                        j = 0;
                        break;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                case 8:
                    if ((i16 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof AbstractC43604jv9) {
                            m51074t = zzaj.m51114H(i17, (AbstractC43604jv9) object);
                        } else {
                            m51074t = zzaj.m51074t(i17, (String) object);
                        }
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 9:
                    if ((i16 & i2) != 0) {
                        m51074t = C46348oZ7.m20851m(i17, unsafe2.getObject(t, j3), m51190i(i14));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 10:
                    if ((i16 & i2) != 0) {
                        m51074t = zzaj.m51114H(i17, (AbstractC43604jv9) unsafe2.getObject(t, j3));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 11:
                    if ((i16 & i2) != 0) {
                        m51074t = zzaj.m51090g0(i17, unsafe2.getInt(t, j3));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 12:
                    if ((i16 & i2) != 0) {
                        m51074t = zzaj.m51077q0(i17, unsafe2.getInt(t, j3));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 13:
                    if ((i16 & i2) != 0) {
                        m51079p0 = zzaj.m51079p0(i17, 0);
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 14:
                    if ((i16 & i2) != 0) {
                        m51074t = zzaj.m51088h0(i17, 0L);
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 15:
                    if ((i16 & i2) != 0) {
                        m51074t = zzaj.m51085j0(i17, unsafe2.getInt(t, j3));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 16:
                    if ((i16 & i2) != 0) {
                        m51074t = zzaj.m51100a0(i17, unsafe2.getLong(t, j3));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 17:
                    if ((i16 & i2) != 0) {
                        m51074t = zzaj.m51115G(i17, (InterfaceC52815zT7) unsafe2.getObject(t, j3), m51190i(i14));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 18:
                    m51074t = C46348oZ7.m20862c0(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m51074t;
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 19:
                    i4 = 0;
                    m20864b0 = C46348oZ7.m20864b0(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m20864b0;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 20:
                    i4 = 0;
                    m20864b0 = C46348oZ7.m20873U(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m20864b0;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 21:
                    i4 = 0;
                    m20864b0 = C46348oZ7.m20872V(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m20864b0;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 22:
                    i4 = 0;
                    m20864b0 = C46348oZ7.m20869Y(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m20864b0;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 23:
                    i4 = 0;
                    m20864b0 = C46348oZ7.m20862c0(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m20864b0;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 24:
                    i4 = 0;
                    m20864b0 = C46348oZ7.m20864b0(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m20864b0;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 25:
                    i4 = 0;
                    m20864b0 = C46348oZ7.m20860d0(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m20864b0;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 26:
                    m51074t = C46348oZ7.m20850n(i17, (List) unsafe2.getObject(t, j3));
                    i15 += m51074t;
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 27:
                    m51074t = C46348oZ7.m20849o(i17, (List) unsafe2.getObject(t, j3), m51190i(i14));
                    i15 += m51074t;
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 28:
                    m51074t = C46348oZ7.m20843u(i17, (List) unsafe2.getObject(t, j3));
                    i15 += m51074t;
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 29:
                    m51074t = C46348oZ7.m20868Z(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m51074t;
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 30:
                    i4 = 0;
                    m20864b0 = C46348oZ7.m20870X(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m20864b0;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 31:
                    i4 = 0;
                    m20864b0 = C46348oZ7.m20864b0(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m20864b0;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 32:
                    i4 = 0;
                    m20864b0 = C46348oZ7.m20862c0(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m20864b0;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 33:
                    i4 = 0;
                    m20864b0 = C46348oZ7.m20866a0(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m20864b0;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 34:
                    i4 = 0;
                    m20864b0 = C46348oZ7.m20871W(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m20864b0;
                    i3 = 1;
                    z = false;
                    j = 0;
                    break;
                case 35:
                    m20878P = C46348oZ7.m20878P((List) unsafe2.getObject(t, j3));
                    if (m20878P > 0) {
                        if (this.f71177i) {
                            unsafe2.putInt(t, i, m20878P);
                        }
                        m51070v0 = zzaj.m51070v0(i17);
                        m51066x0 = zzaj.m51066x0(m20878P);
                        m51079p0 = m51070v0 + m51066x0 + m20878P;
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 36:
                    m20878P = C46348oZ7.m20880N((List) unsafe2.getObject(t, j3));
                    if (m20878P > 0) {
                        if (this.f71177i) {
                            unsafe2.putInt(t, i, m20878P);
                        }
                        m51070v0 = zzaj.m51070v0(i17);
                        m51066x0 = zzaj.m51066x0(m20878P);
                        m51079p0 = m51070v0 + m51066x0 + m20878P;
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 37:
                    m20878P = C46348oZ7.m20841w((List) unsafe2.getObject(t, j3));
                    if (m20878P > 0) {
                        if (this.f71177i) {
                            unsafe2.putInt(t, i, m20878P);
                        }
                        m51070v0 = zzaj.m51070v0(i17);
                        m51066x0 = zzaj.m51066x0(m20878P);
                        m51079p0 = m51070v0 + m51066x0 + m20878P;
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 38:
                    m20878P = C46348oZ7.m20838z((List) unsafe2.getObject(t, j3));
                    if (m20878P > 0) {
                        if (this.f71177i) {
                            unsafe2.putInt(t, i, m20878P);
                        }
                        m51070v0 = zzaj.m51070v0(i17);
                        m51066x0 = zzaj.m51066x0(m20878P);
                        m51079p0 = m51070v0 + m51066x0 + m20878P;
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 39:
                    m20878P = C46348oZ7.m20886H((List) unsafe2.getObject(t, j3));
                    if (m20878P > 0) {
                        if (this.f71177i) {
                            unsafe2.putInt(t, i, m20878P);
                        }
                        m51070v0 = zzaj.m51070v0(i17);
                        m51066x0 = zzaj.m51066x0(m20878P);
                        m51079p0 = m51070v0 + m51066x0 + m20878P;
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 40:
                    m20878P = C46348oZ7.m20878P((List) unsafe2.getObject(t, j3));
                    if (m20878P > 0) {
                        if (this.f71177i) {
                            unsafe2.putInt(t, i, m20878P);
                        }
                        m51070v0 = zzaj.m51070v0(i17);
                        m51066x0 = zzaj.m51066x0(m20878P);
                        m51079p0 = m51070v0 + m51066x0 + m20878P;
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 41:
                    m20878P = C46348oZ7.m20880N((List) unsafe2.getObject(t, j3));
                    if (m20878P > 0) {
                        if (this.f71177i) {
                            unsafe2.putInt(t, i, m20878P);
                        }
                        m51070v0 = zzaj.m51070v0(i17);
                        m51066x0 = zzaj.m51066x0(m20878P);
                        m51079p0 = m51070v0 + m51066x0 + m20878P;
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 42:
                    m20878P = C46348oZ7.m20876R((List) unsafe2.getObject(t, j3));
                    if (m20878P > 0) {
                        if (this.f71177i) {
                            unsafe2.putInt(t, i, m20878P);
                        }
                        m51070v0 = zzaj.m51070v0(i17);
                        m51066x0 = zzaj.m51066x0(m20878P);
                        m51079p0 = m51070v0 + m51066x0 + m20878P;
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 43:
                    m20878P = C46348oZ7.m20884J((List) unsafe2.getObject(t, j3));
                    if (m20878P > 0) {
                        if (this.f71177i) {
                            unsafe2.putInt(t, i, m20878P);
                        }
                        m51070v0 = zzaj.m51070v0(i17);
                        m51066x0 = zzaj.m51066x0(m20878P);
                        m51079p0 = m51070v0 + m51066x0 + m20878P;
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 44:
                    m20878P = C46348oZ7.m20888F((List) unsafe2.getObject(t, j3));
                    if (m20878P > 0) {
                        if (this.f71177i) {
                            unsafe2.putInt(t, i, m20878P);
                        }
                        m51070v0 = zzaj.m51070v0(i17);
                        m51066x0 = zzaj.m51066x0(m20878P);
                        m51079p0 = m51070v0 + m51066x0 + m20878P;
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 45:
                    m20878P = C46348oZ7.m20880N((List) unsafe2.getObject(t, j3));
                    if (m20878P > 0) {
                        if (this.f71177i) {
                            unsafe2.putInt(t, i, m20878P);
                        }
                        m51070v0 = zzaj.m51070v0(i17);
                        m51066x0 = zzaj.m51066x0(m20878P);
                        m51079p0 = m51070v0 + m51066x0 + m20878P;
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 46:
                    m20878P = C46348oZ7.m20878P((List) unsafe2.getObject(t, j3));
                    if (m20878P > 0) {
                        if (this.f71177i) {
                            unsafe2.putInt(t, i, m20878P);
                        }
                        m51070v0 = zzaj.m51070v0(i17);
                        m51066x0 = zzaj.m51066x0(m20878P);
                        m51079p0 = m51070v0 + m51066x0 + m20878P;
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 47:
                    m20878P = C46348oZ7.m20882L((List) unsafe2.getObject(t, j3));
                    if (m20878P > 0) {
                        if (this.f71177i) {
                            unsafe2.putInt(t, i, m20878P);
                        }
                        m51070v0 = zzaj.m51070v0(i17);
                        m51066x0 = zzaj.m51066x0(m20878P);
                        m51079p0 = m51070v0 + m51066x0 + m20878P;
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 48:
                    m20878P = C46348oZ7.m20891C((List) unsafe2.getObject(t, j3));
                    if (m20878P > 0) {
                        if (this.f71177i) {
                            unsafe2.putInt(t, i, m20878P);
                        }
                        m51070v0 = zzaj.m51070v0(i17);
                        m51066x0 = zzaj.m51066x0(m20878P);
                        m51079p0 = m51070v0 + m51066x0 + m20878P;
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 49:
                    m51074t = C46348oZ7.m20842v(i17, (List) unsafe2.getObject(t, j3), m51190i(i14));
                    i15 += m51074t;
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 50:
                    m51074t = this.f71185q.mo5255i(i17, unsafe2.getObject(t, j3), m51189j(i14));
                    i15 += m51074t;
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 51:
                    if (m51207B(t, i17, i14)) {
                        m51074t = zzaj.m51076r(i17, 0.0d);
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 52:
                    if (m51207B(t, i17, i14)) {
                        m51079p0 = zzaj.m51075s(i17, 0.0f);
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 53:
                    if (m51207B(t, i17, i14)) {
                        m51074t = zzaj.m51106S(i17, m51195N(t, j3));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 54:
                    if (m51207B(t, i17, i14)) {
                        m51074t = zzaj.m51103X(i17, m51195N(t, j3));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 55:
                    if (m51207B(t, i17, i14)) {
                        m51074t = zzaj.m51096d0(i17, m51196M(t, j3));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 56:
                    if (m51207B(t, i17, i14)) {
                        m51074t = zzaj.m51094e0(i17, 0L);
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 57:
                    if (m51207B(t, i17, i14)) {
                        m51079p0 = zzaj.m51083m0(i17, 0);
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 58:
                    if (m51207B(t, i17, i14)) {
                        m51079p0 = zzaj.m51113I(i17, true);
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 59:
                    if (m51207B(t, i17, i14)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof AbstractC43604jv9) {
                            m51074t = zzaj.m51114H(i17, (AbstractC43604jv9) object2);
                        } else {
                            m51074t = zzaj.m51074t(i17, (String) object2);
                        }
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 60:
                    if (m51207B(t, i17, i14)) {
                        m51074t = C46348oZ7.m20851m(i17, unsafe2.getObject(t, j3), m51190i(i14));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 61:
                    if (m51207B(t, i17, i14)) {
                        m51074t = zzaj.m51114H(i17, (AbstractC43604jv9) unsafe2.getObject(t, j3));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 62:
                    if (m51207B(t, i17, i14)) {
                        m51074t = zzaj.m51090g0(i17, m51196M(t, j3));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 63:
                    if (m51207B(t, i17, i14)) {
                        m51074t = zzaj.m51077q0(i17, m51196M(t, j3));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 64:
                    if (m51207B(t, i17, i14)) {
                        m51079p0 = zzaj.m51079p0(i17, 0);
                        i15 += m51079p0;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 65:
                    if (m51207B(t, i17, i14)) {
                        m51074t = zzaj.m51088h0(i17, 0L);
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 66:
                    if (m51207B(t, i17, i14)) {
                        m51074t = zzaj.m51085j0(i17, m51196M(t, j3));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 67:
                    if (m51207B(t, i17, i14)) {
                        m51074t = zzaj.m51100a0(i17, m51195N(t, j3));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                case 68:
                    if (m51207B(t, i17, i14)) {
                        m51074t = zzaj.m51115G(i17, (InterfaceC52815zT7) unsafe2.getObject(t, j3), m51190i(i14));
                        i15 += m51074t;
                    }
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
                default:
                    i3 = 1;
                    i4 = 0;
                    z = false;
                    j = 0;
                    break;
            }
            i14 += 3;
            i8 = i4;
            i7 = i3;
        }
        int i21 = i8;
        int m51180s = i15 + m51180s(this.f71183o, t);
        if (this.f71174f) {
            C33231Gx7<?> mo11227c = this.f71184p.mo11227c(t);
            for (int i22 = i21; i22 < mo11227c.f12664a.m72945k(); i22++) {
                Map.Entry<?, Object> m72952d = mo11227c.f12664a.m72952d(i22);
                i21 += C33231Gx7.m104556m((InterfaceC44828lz7) m72952d.getKey(), m72952d.getValue());
            }
            for (Map.Entry<?, Object> entry : mo11227c.f12664a.m72944l()) {
                i21 += C33231Gx7.m104556m((InterfaceC44828lz7) entry.getKey(), entry.getValue());
            }
            return m51180s + i21;
        }
        return m51180s;
    }

    /* renamed from: i */
    public final LY7 m51190i(int i) {
        int i2 = (i / 3) << 1;
        LY7 ly7 = (LY7) this.f71170b[i2];
        if (ly7 != null) {
            return ly7;
        }
        LY7<T> m14114b = C48692sW7.m14115a().m14114b((Class) this.f71170b[i2 + 1]);
        this.f71170b[i2] = m14114b;
        return m14114b;
    }

    /* renamed from: j */
    public final Object m51189j(int i) {
        return this.f71170b[(i / 3) << 1];
    }

    /* renamed from: k */
    public final SG7 m51188k(int i) {
        return (SG7) this.f71170b[((i / 3) << 1) + 1];
    }

    /* renamed from: l */
    public final int m51187l(int i) {
        return this.f71169a[i + 1];
    }

    /* renamed from: m */
    public final int m51186m(int i) {
        return this.f71169a[i + 2];
    }

    /* renamed from: n */
    public final int m51185n(int i) {
        if (i >= this.f71171c && i <= this.f71172d) {
            return m51191R(i, 0);
        }
        return -1;
    }

    /* renamed from: o */
    public final int m51184o(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C49433tl9 c49433tl9) throws IOException {
        int m51128k;
        boolean z;
        Object obj;
        Object obj2;
        Unsafe unsafe = f71168s;
        long j2 = this.f71169a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(C17545l.m51126m(bArr, i)));
                    m51128k = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return m51128k;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(C17545l.m51124o(bArr, i)));
                    m51128k = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return m51128k;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    m51128k = C17545l.m51128k(bArr, i, c49433tl9);
                    unsafe.putObject(t, j, Long.valueOf(c49433tl9.f110995b));
                    unsafe.putInt(t, j2, i4);
                    return m51128k;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    m51128k = C17545l.m51129j(bArr, i, c49433tl9);
                    unsafe.putObject(t, j, Integer.valueOf(c49433tl9.f110994a));
                    unsafe.putInt(t, j2, i4);
                    return m51128k;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(C17545l.m51127l(bArr, i)));
                    m51128k = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return m51128k;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(C17545l.m51131h(bArr, i)));
                    m51128k = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return m51128k;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    m51128k = C17545l.m51128k(bArr, i, c49433tl9);
                    if (c49433tl9.f110995b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(t, j, Boolean.valueOf(z));
                    unsafe.putInt(t, j2, i4);
                    return m51128k;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int m51129j = C17545l.m51129j(bArr, i, c49433tl9);
                    int i9 = c49433tl9.f110994a;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !U68.m81956h(bArr, m51129j, m51129j + i9)) {
                        throw zzbk.m51033f();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, m51129j, i9, C44389lF7.f95796a));
                        m51129j += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return m51129j;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int m51132g = C17545l.m51132g(m51190i(i8), bArr, i, i2, c49433tl9);
                    if (unsafe.getInt(t, j2) == i4) {
                        obj = unsafe.getObject(t, j);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        unsafe.putObject(t, j, c49433tl9.f110996c);
                    } else {
                        unsafe.putObject(t, j, C44389lF7.m27616d(obj, c49433tl9.f110996c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return m51132g;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    m51128k = C17545l.m51122q(bArr, i, c49433tl9);
                    unsafe.putObject(t, j, c49433tl9.f110996c);
                    unsafe.putInt(t, j2, i4);
                    return m51128k;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int m51129j2 = C17545l.m51129j(bArr, i, c49433tl9);
                    int i10 = c49433tl9.f110994a;
                    SG7 m51188k = m51188k(i8);
                    if (m51188k != null && !m51188k.m85783a(i10)) {
                        m51193P(t).m10926f(i3, Long.valueOf(i10));
                        return m51129j2;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(i10));
                    m51128k = m51129j2;
                    unsafe.putInt(t, j2, i4);
                    return m51128k;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    m51128k = C17545l.m51129j(bArr, i, c49433tl9);
                    unsafe.putObject(t, j, Integer.valueOf(AbstractC36642Vm7.m79422e(c49433tl9.f110994a)));
                    unsafe.putInt(t, j2, i4);
                    return m51128k;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    m51128k = C17545l.m51128k(bArr, i, c49433tl9);
                    unsafe.putObject(t, j, Long.valueOf(AbstractC36642Vm7.m79425b(c49433tl9.f110995b)));
                    unsafe.putInt(t, j2, i4);
                    return m51128k;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    m51128k = C17545l.m51133f(m51190i(i8), bArr, i, i2, (i3 & (-8)) | 4, c49433tl9);
                    if (unsafe.getInt(t, j2) == i4) {
                        obj2 = unsafe.getObject(t, j);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(t, j, c49433tl9.f110996c);
                    } else {
                        unsafe.putObject(t, j, C44389lF7.m27616d(obj2, c49433tl9.f110996c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return m51128k;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0233 -> B:116:0x0234). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x016b -> B:67:0x016c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01e5 -> B:96:0x01e6). Please submit an issue!!! */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m51183p(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C49433tl9 c49433tl9) throws IOException {
        boolean z;
        boolean z2;
        int m51129j;
        boolean z3;
        int i8;
        int i9;
        int i10 = i;
        Unsafe unsafe = f71168s;
        BI7 bi7 = (BI7) unsafe.getObject(t, j2);
        if (!bi7.mo64608v1()) {
            int size = bi7.size();
            if (size == 0) {
                i9 = 10;
            } else {
                i9 = size << 1;
            }
            bi7 = bi7.zzh(i9);
            unsafe.putObject(t, j2, bi7);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    C37623Zr7 c37623Zr7 = (C37623Zr7) bi7;
                    int m51129j2 = C17545l.m51129j(bArr, i10, c49433tl9);
                    int i11 = c49433tl9.f110994a + m51129j2;
                    while (m51129j2 < i11) {
                        c37623Zr7.m72386b(C17545l.m51126m(bArr, m51129j2));
                        m51129j2 += 8;
                    }
                    if (m51129j2 != i11) {
                        throw zzbk.m51038a();
                    }
                    return m51129j2;
                }
                if (i5 == 1) {
                    C37623Zr7 c37623Zr72 = (C37623Zr7) bi7;
                    c37623Zr72.m72386b(C17545l.m51126m(bArr, i));
                    while (true) {
                        int i12 = i10 + 8;
                        if (i12 < i2) {
                            i10 = C17545l.m51129j(bArr, i12, c49433tl9);
                            if (i3 == c49433tl9.f110994a) {
                                c37623Zr72.m72386b(C17545l.m51126m(bArr, i10));
                            } else {
                                return i12;
                            }
                        } else {
                            return i12;
                        }
                    }
                }
                return i10;
            case 19:
            case 36:
                if (i5 == 2) {
                    HD7 hd7 = (HD7) bi7;
                    int m51129j3 = C17545l.m51129j(bArr, i10, c49433tl9);
                    int i13 = c49433tl9.f110994a + m51129j3;
                    while (m51129j3 < i13) {
                        hd7.m104165c(C17545l.m51124o(bArr, m51129j3));
                        m51129j3 += 4;
                    }
                    if (m51129j3 != i13) {
                        throw zzbk.m51038a();
                    }
                    return m51129j3;
                }
                if (i5 == 5) {
                    HD7 hd72 = (HD7) bi7;
                    hd72.m104165c(C17545l.m51124o(bArr, i));
                    while (true) {
                        int i14 = i10 + 4;
                        if (i14 < i2) {
                            i10 = C17545l.m51129j(bArr, i14, c49433tl9);
                            if (i3 == c49433tl9.f110994a) {
                                hd72.m104165c(C17545l.m51124o(bArr, i10));
                            } else {
                                return i14;
                            }
                        } else {
                            return i14;
                        }
                    }
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    PO7 po7 = (PO7) bi7;
                    int m51129j4 = C17545l.m51129j(bArr, i10, c49433tl9);
                    int i15 = c49433tl9.f110994a + m51129j4;
                    while (m51129j4 < i15) {
                        m51129j4 = C17545l.m51128k(bArr, m51129j4, c49433tl9);
                        po7.m90348h(c49433tl9.f110995b);
                    }
                    if (m51129j4 != i15) {
                        throw zzbk.m51038a();
                    }
                    return m51129j4;
                }
                if (i5 == 0) {
                    PO7 po72 = (PO7) bi7;
                    int m51128k = C17545l.m51128k(bArr, i10, c49433tl9);
                    po72.m90348h(c49433tl9.f110995b);
                    while (m51128k < i2) {
                        int m51129j5 = C17545l.m51129j(bArr, m51128k, c49433tl9);
                        if (i3 == c49433tl9.f110994a) {
                            m51128k = C17545l.m51128k(bArr, m51129j5, c49433tl9);
                            po72.m90348h(c49433tl9.f110995b);
                        } else {
                            return m51128k;
                        }
                    }
                    return m51128k;
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C17545l.m51130i(bArr, i10, bi7, c49433tl9);
                }
                if (i5 == 0) {
                    return C17545l.m51138a(i3, bArr, i, i2, bi7, c49433tl9);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    PO7 po73 = (PO7) bi7;
                    int m51129j6 = C17545l.m51129j(bArr, i10, c49433tl9);
                    int i16 = c49433tl9.f110994a + m51129j6;
                    while (m51129j6 < i16) {
                        po73.m90348h(C17545l.m51127l(bArr, m51129j6));
                        m51129j6 += 8;
                    }
                    if (m51129j6 != i16) {
                        throw zzbk.m51038a();
                    }
                    return m51129j6;
                }
                if (i5 == 1) {
                    PO7 po74 = (PO7) bi7;
                    po74.m90348h(C17545l.m51127l(bArr, i));
                    while (true) {
                        int i17 = i10 + 8;
                        if (i17 < i2) {
                            i10 = C17545l.m51129j(bArr, i17, c49433tl9);
                            if (i3 == c49433tl9.f110994a) {
                                po74.m90348h(C17545l.m51127l(bArr, i10));
                            } else {
                                return i17;
                            }
                        } else {
                            return i17;
                        }
                    }
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    C38451bG7 c38451bG7 = (C38451bG7) bi7;
                    int m51129j7 = C17545l.m51129j(bArr, i10, c49433tl9);
                    int i18 = c49433tl9.f110994a + m51129j7;
                    while (m51129j7 < i18) {
                        c38451bG7.m64735b(C17545l.m51131h(bArr, m51129j7));
                        m51129j7 += 4;
                    }
                    if (m51129j7 != i18) {
                        throw zzbk.m51038a();
                    }
                    return m51129j7;
                }
                if (i5 == 5) {
                    C38451bG7 c38451bG72 = (C38451bG7) bi7;
                    c38451bG72.m64735b(C17545l.m51131h(bArr, i));
                    while (true) {
                        int i19 = i10 + 4;
                        if (i19 < i2) {
                            i10 = C17545l.m51129j(bArr, i19, c49433tl9);
                            if (i3 == c49433tl9.f110994a) {
                                c38451bG72.m64735b(C17545l.m51131h(bArr, i10));
                            } else {
                                return i19;
                            }
                        } else {
                            return i19;
                        }
                    }
                }
                return i10;
            case 25:
            case 42:
                if (i5 == 2) {
                    C42981is9 c42981is9 = (C42981is9) bi7;
                    m51129j = C17545l.m51129j(bArr, i10, c49433tl9);
                    int i20 = c49433tl9.f110994a + m51129j;
                    while (m51129j < i20) {
                        m51129j = C17545l.m51128k(bArr, m51129j, c49433tl9);
                        if (c49433tl9.f110995b != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c42981is9.m31710b(z3);
                    }
                    if (m51129j != i20) {
                        throw zzbk.m51038a();
                    }
                    return m51129j;
                }
                if (i5 == 0) {
                    C42981is9 c42981is92 = (C42981is9) bi7;
                    i10 = C17545l.m51128k(bArr, i10, c49433tl9);
                    if (c49433tl9.f110995b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c42981is92.m31710b(z);
                    while (i10 < i2) {
                        int m51129j8 = C17545l.m51129j(bArr, i10, c49433tl9);
                        if (i3 == c49433tl9.f110994a) {
                            i10 = C17545l.m51128k(bArr, m51129j8, c49433tl9);
                            if (c49433tl9.f110995b != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c42981is92.m31710b(z2);
                        }
                    }
                }
                return i10;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int m51129j9 = C17545l.m51129j(bArr, i10, c49433tl9);
                        int i21 = c49433tl9.f110994a;
                        if (i21 >= 0) {
                            if (i21 == 0) {
                                bi7.add("");
                                while (m51129j9 < i2) {
                                    int m51129j10 = C17545l.m51129j(bArr, m51129j9, c49433tl9);
                                    if (i3 == c49433tl9.f110994a) {
                                        m51129j9 = C17545l.m51129j(bArr, m51129j10, c49433tl9);
                                        i21 = c49433tl9.f110994a;
                                        if (i21 >= 0) {
                                            if (i21 == 0) {
                                                bi7.add("");
                                            } else {
                                                bi7.add(new String(bArr, m51129j9, i21, C44389lF7.f95796a));
                                                m51129j9 += i21;
                                                while (m51129j9 < i2) {
                                                }
                                            }
                                        } else {
                                            throw zzbk.m51037b();
                                        }
                                    } else {
                                        return m51129j9;
                                    }
                                }
                                return m51129j9;
                            }
                            bi7.add(new String(bArr, m51129j9, i21, C44389lF7.f95796a));
                            m51129j9 += i21;
                            while (m51129j9 < i2) {
                            }
                            return m51129j9;
                        }
                        throw zzbk.m51037b();
                    }
                    int m51129j11 = C17545l.m51129j(bArr, i10, c49433tl9);
                    int i22 = c49433tl9.f110994a;
                    if (i22 >= 0) {
                        if (i22 == 0) {
                            bi7.add("");
                            while (m51129j11 < i2) {
                                int m51129j12 = C17545l.m51129j(bArr, m51129j11, c49433tl9);
                                if (i3 == c49433tl9.f110994a) {
                                    m51129j11 = C17545l.m51129j(bArr, m51129j12, c49433tl9);
                                    int i23 = c49433tl9.f110994a;
                                    if (i23 >= 0) {
                                        if (i23 == 0) {
                                            bi7.add("");
                                        } else {
                                            i8 = m51129j11 + i23;
                                            if (U68.m81956h(bArr, m51129j11, i8)) {
                                                bi7.add(new String(bArr, m51129j11, i23, C44389lF7.f95796a));
                                                m51129j11 = i8;
                                                while (m51129j11 < i2) {
                                                }
                                            } else {
                                                throw zzbk.m51033f();
                                            }
                                        }
                                    } else {
                                        throw zzbk.m51037b();
                                    }
                                } else {
                                    return m51129j11;
                                }
                            }
                            return m51129j11;
                        }
                        i8 = m51129j11 + i22;
                        if (U68.m81956h(bArr, m51129j11, i8)) {
                            bi7.add(new String(bArr, m51129j11, i22, C44389lF7.f95796a));
                            m51129j11 = i8;
                            while (m51129j11 < i2) {
                            }
                            return m51129j11;
                        }
                        throw zzbk.m51033f();
                    }
                    throw zzbk.m51037b();
                }
                return i10;
            case 27:
                if (i5 == 2) {
                    return C17545l.m51134e(m51190i(i6), i3, bArr, i, i2, bi7, c49433tl9);
                }
                return i10;
            case 28:
                if (i5 == 2) {
                    int m51129j13 = C17545l.m51129j(bArr, i10, c49433tl9);
                    int i24 = c49433tl9.f110994a;
                    if (i24 >= 0) {
                        if (i24 <= bArr.length - m51129j13) {
                            if (i24 == 0) {
                                bi7.add(AbstractC43604jv9.f93538c);
                                while (m51129j13 < i2) {
                                    int m51129j14 = C17545l.m51129j(bArr, m51129j13, c49433tl9);
                                    if (i3 == c49433tl9.f110994a) {
                                        m51129j13 = C17545l.m51129j(bArr, m51129j14, c49433tl9);
                                        i24 = c49433tl9.f110994a;
                                        if (i24 >= 0) {
                                            if (i24 <= bArr.length - m51129j13) {
                                                if (i24 == 0) {
                                                    bi7.add(AbstractC43604jv9.f93538c);
                                                } else {
                                                    bi7.add(AbstractC43604jv9.m29743x(bArr, m51129j13, i24));
                                                    m51129j13 += i24;
                                                    while (m51129j13 < i2) {
                                                    }
                                                }
                                            } else {
                                                throw zzbk.m51038a();
                                            }
                                        } else {
                                            throw zzbk.m51037b();
                                        }
                                    } else {
                                        return m51129j13;
                                    }
                                }
                                return m51129j13;
                            }
                            bi7.add(AbstractC43604jv9.m29743x(bArr, m51129j13, i24));
                            m51129j13 += i24;
                            while (m51129j13 < i2) {
                            }
                            return m51129j13;
                        }
                        throw zzbk.m51038a();
                    }
                    throw zzbk.m51037b();
                }
                return i10;
            case 30:
            case 44:
                if (i5 == 2) {
                    m51129j = C17545l.m51130i(bArr, i10, bi7, c49433tl9);
                } else {
                    if (i5 == 0) {
                        m51129j = C17545l.m51138a(i3, bArr, i, i2, bi7, c49433tl9);
                    }
                    return i10;
                }
                AbstractC17530c abstractC17530c = (AbstractC17530c) t;
                C49611u38 c49611u38 = abstractC17530c.zzih;
                if (c49611u38 == C49611u38.m10923i()) {
                    c49611u38 = null;
                }
                C49611u38 c49611u382 = (C49611u38) C46348oZ7.m20865b(i4, bi7, m51188k(i6), c49611u38, this.f71183o);
                if (c49611u382 != null) {
                    abstractC17530c.zzih = c49611u382;
                }
                return m51129j;
            case 33:
            case 47:
                if (i5 == 2) {
                    C38451bG7 c38451bG73 = (C38451bG7) bi7;
                    int m51129j15 = C17545l.m51129j(bArr, i10, c49433tl9);
                    int i25 = c49433tl9.f110994a + m51129j15;
                    while (m51129j15 < i25) {
                        m51129j15 = C17545l.m51129j(bArr, m51129j15, c49433tl9);
                        c38451bG73.m64735b(AbstractC36642Vm7.m79422e(c49433tl9.f110994a));
                    }
                    if (m51129j15 != i25) {
                        throw zzbk.m51038a();
                    }
                    return m51129j15;
                }
                if (i5 == 0) {
                    C38451bG7 c38451bG74 = (C38451bG7) bi7;
                    int m51129j16 = C17545l.m51129j(bArr, i10, c49433tl9);
                    c38451bG74.m64735b(AbstractC36642Vm7.m79422e(c49433tl9.f110994a));
                    while (m51129j16 < i2) {
                        int m51129j17 = C17545l.m51129j(bArr, m51129j16, c49433tl9);
                        if (i3 == c49433tl9.f110994a) {
                            m51129j16 = C17545l.m51129j(bArr, m51129j17, c49433tl9);
                            c38451bG74.m64735b(AbstractC36642Vm7.m79422e(c49433tl9.f110994a));
                        } else {
                            return m51129j16;
                        }
                    }
                    return m51129j16;
                }
                return i10;
            case 34:
            case 48:
                if (i5 == 2) {
                    PO7 po75 = (PO7) bi7;
                    int m51129j18 = C17545l.m51129j(bArr, i10, c49433tl9);
                    int i26 = c49433tl9.f110994a + m51129j18;
                    while (m51129j18 < i26) {
                        m51129j18 = C17545l.m51128k(bArr, m51129j18, c49433tl9);
                        po75.m90348h(AbstractC36642Vm7.m79425b(c49433tl9.f110995b));
                    }
                    if (m51129j18 != i26) {
                        throw zzbk.m51038a();
                    }
                    return m51129j18;
                }
                if (i5 == 0) {
                    PO7 po76 = (PO7) bi7;
                    int m51128k2 = C17545l.m51128k(bArr, i10, c49433tl9);
                    po76.m90348h(AbstractC36642Vm7.m79425b(c49433tl9.f110995b));
                    while (m51128k2 < i2) {
                        int m51129j19 = C17545l.m51129j(bArr, m51128k2, c49433tl9);
                        if (i3 == c49433tl9.f110994a) {
                            m51128k2 = C17545l.m51128k(bArr, m51129j19, c49433tl9);
                            po76.m90348h(AbstractC36642Vm7.m79425b(c49433tl9.f110995b));
                        } else {
                            return m51128k2;
                        }
                    }
                    return m51128k2;
                }
                return i10;
            case 49:
                if (i5 == 3) {
                    LY7 m51190i = m51190i(i6);
                    int i27 = (i3 & (-8)) | 4;
                    i10 = C17545l.m51133f(m51190i, bArr, i, i2, i27, c49433tl9);
                    bi7.add(c49433tl9.f110996c);
                    while (i10 < i2) {
                        int m51129j20 = C17545l.m51129j(bArr, i10, c49433tl9);
                        if (i3 == c49433tl9.f110994a) {
                            i10 = C17545l.m51133f(m51190i, bArr, m51129j20, i2, i27, c49433tl9);
                            bi7.add(c49433tl9.f110996c);
                        }
                    }
                }
                return i10;
            default:
                return i10;
        }
    }

    /* renamed from: q */
    public final <K, V> int m51182q(T t, byte[] bArr, int i, int i2, int i3, long j, C49433tl9 c49433tl9) throws IOException {
        Unsafe unsafe = f71168s;
        Object m51189j = m51189j(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f71185q.mo5261c(object)) {
            Object mo5262b = this.f71185q.mo5262b(m51189j);
            this.f71185q.mo5258f(mo5262b, object);
            unsafe.putObject(t, j, mo5262b);
            object = mo5262b;
        }
        this.f71185q.mo5260d(m51189j);
        this.f71185q.mo5256h(object);
        int m51129j = C17545l.m51129j(bArr, i, c49433tl9);
        int i4 = c49433tl9.f110994a;
        if (i4 >= 0 && i4 <= i2 - m51129j) {
            throw null;
        }
        throw zzbk.m51038a();
    }

    /* renamed from: r */
    public final int m51181r(T t, byte[] bArr, int i, int i2, int i3, C49433tl9 c49433tl9) throws IOException {
        Unsafe unsafe;
        int i4;
        T t2;
        C17537e<T> c17537e;
        int i5;
        int i6;
        int i7;
        int i8;
        SG7 m51188k;
        byte b;
        int i9;
        int m51185n;
        int i10;
        int i11;
        int i12;
        T t3;
        int i13;
        C49433tl9 c49433tl92;
        int i14;
        int i15;
        int i16;
        C49433tl9 c49433tl93;
        int i17;
        C49433tl9 c49433tl94;
        int i18;
        C49433tl9 c49433tl95;
        int i19;
        boolean z;
        int i20;
        int i21;
        int i22;
        int i23;
        C17537e<T> c17537e2 = this;
        T t4 = t;
        byte[] bArr2 = bArr;
        int i24 = i2;
        int i25 = i3;
        C49433tl9 c49433tl96 = c49433tl9;
        Unsafe unsafe2 = f71168s;
        int i26 = i;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        int i31 = -1;
        while (true) {
            if (i26 < i24) {
                int i32 = i26 + 1;
                byte b2 = bArr2[i26];
                if (b2 < 0) {
                    i9 = C17545l.m51135d(b2, bArr2, i32, c49433tl96);
                    b = c49433tl96.f110994a;
                } else {
                    b = b2;
                    i9 = i32;
                }
                int i33 = b >>> 3;
                int i34 = b & 7;
                if (i33 > i30) {
                    m51185n = c17537e2.m51192Q(i33, i27 / 3);
                } else {
                    m51185n = c17537e2.m51185n(i33);
                }
                int i35 = m51185n;
                if (i35 == -1) {
                    i10 = i33;
                    i11 = i9;
                    i6 = b;
                    unsafe = unsafe2;
                    i4 = i25;
                    i12 = 0;
                } else {
                    int[] iArr = c17537e2.f71169a;
                    int i36 = iArr[i35 + 1];
                    int i37 = (i36 & 267386880) >>> 20;
                    int i38 = b;
                    long j = i36 & 1048575;
                    if (i37 <= 17) {
                        int i39 = iArr[i35 + 2];
                        int i40 = 1 << (i39 >>> 20);
                        int i41 = i39 & 1048575;
                        if (i41 != i31) {
                            if (i31 != -1) {
                                unsafe2.putInt(t4, i31, i29);
                            }
                            i29 = unsafe2.getInt(t4, i41);
                            i31 = i41;
                        }
                        switch (i37) {
                            case 0:
                                i14 = i35;
                                i15 = i33;
                                i17 = i31;
                                i16 = i38;
                                bArr2 = bArr;
                                c49433tl94 = c49433tl9;
                                i18 = i9;
                                if (i34 == 1) {
                                    C49038t58.m13118c(t4, j, C17545l.m51126m(bArr2, i18));
                                    i26 = i18 + 8;
                                    i29 |= i40;
                                    i31 = i17;
                                    i28 = i16;
                                    i27 = i14;
                                    i30 = i15;
                                    c49433tl96 = c49433tl94;
                                    i24 = i2;
                                    i25 = i3;
                                    break;
                                } else {
                                    i11 = i18;
                                    i12 = i14;
                                    unsafe = unsafe2;
                                    i31 = i17;
                                    i6 = i16;
                                    i10 = i15;
                                    i4 = i3;
                                    break;
                                }
                            case 1:
                                i14 = i35;
                                i15 = i33;
                                i17 = i31;
                                i16 = i38;
                                bArr2 = bArr;
                                c49433tl94 = c49433tl9;
                                i18 = i9;
                                if (i34 == 5) {
                                    C49038t58.m13117d(t4, j, C17545l.m51124o(bArr2, i18));
                                    i26 = i18 + 4;
                                    i29 |= i40;
                                    i31 = i17;
                                    i28 = i16;
                                    i27 = i14;
                                    i30 = i15;
                                    c49433tl96 = c49433tl94;
                                    i24 = i2;
                                    i25 = i3;
                                    break;
                                } else {
                                    i11 = i18;
                                    i12 = i14;
                                    unsafe = unsafe2;
                                    i31 = i17;
                                    i6 = i16;
                                    i10 = i15;
                                    i4 = i3;
                                    break;
                                }
                            case 2:
                            case 3:
                                i14 = i35;
                                i15 = i33;
                                i17 = i31;
                                i16 = i38;
                                bArr2 = bArr;
                                i18 = i9;
                                if (i34 == 0) {
                                    int m51128k = C17545l.m51128k(bArr2, i18, c49433tl9);
                                    unsafe2.putLong(t, j, c49433tl9.f110995b);
                                    i29 |= i40;
                                    i26 = m51128k;
                                    i28 = i16;
                                    i27 = i14;
                                    i30 = i15;
                                    c49433tl96 = c49433tl9;
                                    i31 = i17;
                                    i24 = i2;
                                    i25 = i3;
                                    break;
                                } else {
                                    i11 = i18;
                                    i12 = i14;
                                    unsafe = unsafe2;
                                    i31 = i17;
                                    i6 = i16;
                                    i10 = i15;
                                    i4 = i3;
                                    break;
                                }
                            case 4:
                            case 11:
                                i14 = i35;
                                i15 = i33;
                                i17 = i31;
                                i16 = i38;
                                bArr2 = bArr;
                                c49433tl94 = c49433tl9;
                                i18 = i9;
                                if (i34 == 0) {
                                    i26 = C17545l.m51129j(bArr2, i18, c49433tl94);
                                    unsafe2.putInt(t4, j, c49433tl94.f110994a);
                                    i29 |= i40;
                                    i31 = i17;
                                    i28 = i16;
                                    i27 = i14;
                                    i30 = i15;
                                    c49433tl96 = c49433tl94;
                                    i24 = i2;
                                    i25 = i3;
                                    break;
                                } else {
                                    i11 = i18;
                                    i12 = i14;
                                    unsafe = unsafe2;
                                    i31 = i17;
                                    i6 = i16;
                                    i10 = i15;
                                    i4 = i3;
                                    break;
                                }
                            case 5:
                            case 14:
                                i14 = i35;
                                i15 = i33;
                                i16 = i38;
                                bArr2 = bArr;
                                c49433tl94 = c49433tl9;
                                if (i34 == 1) {
                                    i17 = i31;
                                    i18 = i9;
                                    unsafe2.putLong(t, j, C17545l.m51127l(bArr2, i9));
                                    i26 = i18 + 8;
                                    i29 |= i40;
                                    i31 = i17;
                                    i28 = i16;
                                    i27 = i14;
                                    i30 = i15;
                                    c49433tl96 = c49433tl94;
                                    i24 = i2;
                                    i25 = i3;
                                    break;
                                } else {
                                    i17 = i31;
                                    i18 = i9;
                                    i11 = i18;
                                    i12 = i14;
                                    unsafe = unsafe2;
                                    i31 = i17;
                                    i6 = i16;
                                    i10 = i15;
                                    i4 = i3;
                                    break;
                                }
                            case 6:
                            case 13:
                                i14 = i35;
                                i15 = i33;
                                i16 = i38;
                                bArr2 = bArr;
                                c49433tl95 = c49433tl9;
                                i19 = i2;
                                if (i34 == 5) {
                                    unsafe2.putInt(t4, j, C17545l.m51131h(bArr2, i9));
                                    i26 = i9 + 4;
                                    i29 |= i40;
                                    i28 = i16;
                                    i27 = i14;
                                    i30 = i15;
                                    c49433tl96 = c49433tl95;
                                    i25 = i3;
                                    i24 = i19;
                                    break;
                                } else {
                                    i17 = i31;
                                    i18 = i9;
                                    i11 = i18;
                                    i12 = i14;
                                    unsafe = unsafe2;
                                    i31 = i17;
                                    i6 = i16;
                                    i10 = i15;
                                    i4 = i3;
                                    break;
                                }
                            case 7:
                                i14 = i35;
                                i15 = i33;
                                i16 = i38;
                                bArr2 = bArr;
                                c49433tl95 = c49433tl9;
                                i19 = i2;
                                if (i34 == 0) {
                                    int m51128k2 = C17545l.m51128k(bArr2, i9, c49433tl95);
                                    if (c49433tl95.f110995b != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    C49038t58.m13113h(t4, j, z);
                                    i29 |= i40;
                                    i26 = m51128k2;
                                    i28 = i16;
                                    i27 = i14;
                                    i30 = i15;
                                    c49433tl96 = c49433tl95;
                                    i25 = i3;
                                    i24 = i19;
                                    break;
                                } else {
                                    i17 = i31;
                                    i18 = i9;
                                    i11 = i18;
                                    i12 = i14;
                                    unsafe = unsafe2;
                                    i31 = i17;
                                    i6 = i16;
                                    i10 = i15;
                                    i4 = i3;
                                    break;
                                }
                            case 8:
                                i14 = i35;
                                i15 = i33;
                                i16 = i38;
                                bArr2 = bArr;
                                c49433tl95 = c49433tl9;
                                i19 = i2;
                                if (i34 == 2) {
                                    if ((i36 & 536870912) == 0) {
                                        i26 = C17545l.m51125n(bArr2, i9, c49433tl95);
                                    } else {
                                        i26 = C17545l.m51123p(bArr2, i9, c49433tl95);
                                    }
                                    unsafe2.putObject(t4, j, c49433tl95.f110996c);
                                    i29 |= i40;
                                    i28 = i16;
                                    i27 = i14;
                                    i30 = i15;
                                    c49433tl96 = c49433tl95;
                                    i25 = i3;
                                    i24 = i19;
                                    break;
                                } else {
                                    i17 = i31;
                                    i18 = i9;
                                    i11 = i18;
                                    i12 = i14;
                                    unsafe = unsafe2;
                                    i31 = i17;
                                    i6 = i16;
                                    i10 = i15;
                                    i4 = i3;
                                    break;
                                }
                            case 9:
                                i14 = i35;
                                i15 = i33;
                                i16 = i38;
                                bArr2 = bArr;
                                c49433tl95 = c49433tl9;
                                if (i34 == 2) {
                                    i19 = i2;
                                    i26 = C17545l.m51132g(c17537e2.m51190i(i14), bArr2, i9, i19, c49433tl95);
                                    if ((i29 & i40) == 0) {
                                        unsafe2.putObject(t4, j, c49433tl95.f110996c);
                                    } else {
                                        unsafe2.putObject(t4, j, C44389lF7.m27616d(unsafe2.getObject(t4, j), c49433tl95.f110996c));
                                    }
                                    i29 |= i40;
                                    i28 = i16;
                                    i27 = i14;
                                    i30 = i15;
                                    c49433tl96 = c49433tl95;
                                    i25 = i3;
                                    i24 = i19;
                                    break;
                                } else {
                                    i17 = i31;
                                    i18 = i9;
                                    i11 = i18;
                                    i12 = i14;
                                    unsafe = unsafe2;
                                    i31 = i17;
                                    i6 = i16;
                                    i10 = i15;
                                    i4 = i3;
                                    break;
                                }
                            case 10:
                                i14 = i35;
                                i15 = i33;
                                i16 = i38;
                                bArr2 = bArr;
                                c49433tl94 = c49433tl9;
                                if (i34 == 2) {
                                    i26 = C17545l.m51122q(bArr2, i9, c49433tl94);
                                    unsafe2.putObject(t4, j, c49433tl94.f110996c);
                                    i29 |= i40;
                                    i28 = i16;
                                    i27 = i14;
                                    i30 = i15;
                                    c49433tl96 = c49433tl94;
                                    i24 = i2;
                                    i25 = i3;
                                    break;
                                } else {
                                    i17 = i31;
                                    i18 = i9;
                                    i11 = i18;
                                    i12 = i14;
                                    unsafe = unsafe2;
                                    i31 = i17;
                                    i6 = i16;
                                    i10 = i15;
                                    i4 = i3;
                                    break;
                                }
                            case 12:
                                i14 = i35;
                                i15 = i33;
                                i16 = i38;
                                bArr2 = bArr;
                                c49433tl94 = c49433tl9;
                                if (i34 == 0) {
                                    i26 = C17545l.m51129j(bArr2, i9, c49433tl94);
                                    int i42 = c49433tl94.f110994a;
                                    SG7 m51188k2 = c17537e2.m51188k(i14);
                                    if (m51188k2 != null && !m51188k2.m85783a(i42)) {
                                        m51193P(t).m10926f(i16, Long.valueOf(i42));
                                        i28 = i16;
                                        i27 = i14;
                                        i30 = i15;
                                        c49433tl96 = c49433tl94;
                                        i24 = i2;
                                        i25 = i3;
                                    } else {
                                        unsafe2.putInt(t4, j, i42);
                                        i29 |= i40;
                                        i28 = i16;
                                        i27 = i14;
                                        i30 = i15;
                                        c49433tl96 = c49433tl94;
                                        i24 = i2;
                                        i25 = i3;
                                        break;
                                    }
                                } else {
                                    i17 = i31;
                                    i18 = i9;
                                    i11 = i18;
                                    i12 = i14;
                                    unsafe = unsafe2;
                                    i31 = i17;
                                    i6 = i16;
                                    i10 = i15;
                                    i4 = i3;
                                    break;
                                }
                                break;
                            case 15:
                                i14 = i35;
                                i15 = i33;
                                i16 = i38;
                                bArr2 = bArr;
                                c49433tl94 = c49433tl9;
                                if (i34 == 0) {
                                    i26 = C17545l.m51129j(bArr2, i9, c49433tl94);
                                    unsafe2.putInt(t4, j, AbstractC36642Vm7.m79422e(c49433tl94.f110994a));
                                    i29 |= i40;
                                    i28 = i16;
                                    i27 = i14;
                                    i30 = i15;
                                    c49433tl96 = c49433tl94;
                                    i24 = i2;
                                    i25 = i3;
                                    break;
                                } else {
                                    i17 = i31;
                                    i18 = i9;
                                    i11 = i18;
                                    i12 = i14;
                                    unsafe = unsafe2;
                                    i31 = i17;
                                    i6 = i16;
                                    i10 = i15;
                                    i4 = i3;
                                    break;
                                }
                            case 16:
                                i14 = i35;
                                i15 = i33;
                                i16 = i38;
                                if (i34 == 0) {
                                    bArr2 = bArr;
                                    int m51128k3 = C17545l.m51128k(bArr2, i9, c49433tl9);
                                    c49433tl94 = c49433tl9;
                                    unsafe2.putLong(t, j, AbstractC36642Vm7.m79425b(c49433tl9.f110995b));
                                    i29 |= i40;
                                    i26 = m51128k3;
                                    i28 = i16;
                                    i27 = i14;
                                    i30 = i15;
                                    c49433tl96 = c49433tl94;
                                    i24 = i2;
                                    i25 = i3;
                                    break;
                                } else {
                                    i17 = i31;
                                    i18 = i9;
                                    i11 = i18;
                                    i12 = i14;
                                    unsafe = unsafe2;
                                    i31 = i17;
                                    i6 = i16;
                                    i10 = i15;
                                    i4 = i3;
                                    break;
                                }
                            case 17:
                                if (i34 == 3) {
                                    i26 = C17545l.m51133f(c17537e2.m51190i(i35), bArr, i9, i2, (i33 << 3) | 4, c49433tl9);
                                    if ((i29 & i40) == 0) {
                                        c49433tl93 = c49433tl9;
                                        unsafe2.putObject(t4, j, c49433tl93.f110996c);
                                    } else {
                                        c49433tl93 = c49433tl9;
                                        unsafe2.putObject(t4, j, C44389lF7.m27616d(unsafe2.getObject(t4, j), c49433tl93.f110996c));
                                    }
                                    i29 |= i40;
                                    bArr2 = bArr;
                                    i24 = i2;
                                    i28 = i38;
                                    i27 = i35;
                                    i30 = i33;
                                    i25 = i3;
                                    c49433tl96 = c49433tl93;
                                    break;
                                } else {
                                    i14 = i35;
                                    i15 = i33;
                                    i16 = i38;
                                    i17 = i31;
                                    i18 = i9;
                                    i11 = i18;
                                    i12 = i14;
                                    unsafe = unsafe2;
                                    i31 = i17;
                                    i6 = i16;
                                    i10 = i15;
                                    i4 = i3;
                                    break;
                                }
                            default:
                                i14 = i35;
                                i15 = i33;
                                i17 = i31;
                                i16 = i38;
                                i18 = i9;
                                i11 = i18;
                                i12 = i14;
                                unsafe = unsafe2;
                                i31 = i17;
                                i6 = i16;
                                i10 = i15;
                                i4 = i3;
                                break;
                        }
                    } else {
                        int i43 = i31;
                        int i44 = i9;
                        bArr2 = bArr;
                        C49433tl9 c49433tl97 = c49433tl96;
                        if (i37 == 27) {
                            if (i34 == 2) {
                                BI7 bi7 = (BI7) unsafe2.getObject(t4, j);
                                if (!bi7.mo64608v1()) {
                                    int size = bi7.size();
                                    if (size == 0) {
                                        i23 = 10;
                                    } else {
                                        i23 = size << 1;
                                    }
                                    bi7 = bi7.zzh(i23);
                                    unsafe2.putObject(t4, j, bi7);
                                }
                                i26 = C17545l.m51134e(c17537e2.m51190i(i35), i38, bArr, i44, i2, bi7, c49433tl9);
                                i25 = i3;
                                i30 = i33;
                                i28 = i38;
                                i27 = i35;
                                c49433tl96 = c49433tl97;
                                i31 = i43;
                                i29 = i29;
                                i24 = i2;
                            } else {
                                i20 = i29;
                                i10 = i33;
                                i21 = i44;
                                i22 = i38;
                                i12 = i35;
                                unsafe = unsafe2;
                                i4 = i3;
                                i11 = i21;
                            }
                        } else {
                            i20 = i29;
                            if (i37 <= 49) {
                                i10 = i33;
                                i22 = i38;
                                i12 = i35;
                                unsafe = unsafe2;
                                i26 = m51183p(t, bArr, i44, i2, i38, i10, i34, i35, i36, i37, j, c49433tl9);
                                if (i26 != i44) {
                                    c17537e2 = this;
                                    t4 = t;
                                    bArr2 = bArr;
                                    i30 = i10;
                                    i24 = i2;
                                    i25 = i3;
                                    c49433tl96 = c49433tl9;
                                    i31 = i43;
                                    i27 = i12;
                                    i29 = i20;
                                    i28 = i22;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i11 = i26;
                                }
                            } else {
                                i10 = i33;
                                i21 = i44;
                                i22 = i38;
                                i12 = i35;
                                unsafe = unsafe2;
                                if (i37 == 50) {
                                    if (i34 == 2) {
                                        i26 = m51182q(t, bArr, i21, i2, i12, j, c49433tl9);
                                        if (i26 != i21) {
                                            c17537e2 = this;
                                            t4 = t;
                                            bArr2 = bArr;
                                            i30 = i10;
                                            i24 = i2;
                                            i25 = i3;
                                            c49433tl96 = c49433tl9;
                                            i31 = i43;
                                            i27 = i12;
                                            i29 = i20;
                                            i28 = i22;
                                            unsafe2 = unsafe;
                                        }
                                    } else {
                                        i4 = i3;
                                        i11 = i21;
                                    }
                                } else {
                                    i26 = m51184o(t, bArr, i21, i2, i22, i10, i34, i36, i37, j, i12, c49433tl9);
                                    if (i26 != i21) {
                                        c17537e2 = this;
                                        t4 = t;
                                        i24 = i2;
                                        i25 = i3;
                                        i28 = i22;
                                        i30 = i10;
                                        i31 = i43;
                                        i27 = i12;
                                        i29 = i20;
                                        unsafe2 = unsafe;
                                        bArr2 = bArr;
                                        c49433tl96 = c49433tl9;
                                    }
                                }
                                i4 = i3;
                                i11 = i26;
                            }
                        }
                        i31 = i43;
                        i29 = i20;
                        i6 = i22;
                    }
                }
                if (i6 == i4 && i4 != 0) {
                    c17537e = this;
                    t2 = t;
                    i7 = i31;
                    i8 = -1;
                    i5 = i11;
                } else {
                    if (this.f71174f) {
                        c49433tl92 = c49433tl9;
                        if (c49433tl92.f110997d != C17527a.m51231b()) {
                            int i45 = i10;
                            if (c49433tl92.f110997d.m51230c(this.f71173e, i45) == null) {
                                i26 = C17545l.m51137b(i6, bArr, i11, i2, m51193P(t), c49433tl9);
                                t4 = t;
                                i24 = i2;
                                i28 = i6;
                                c17537e2 = this;
                                c49433tl96 = c49433tl92;
                                i30 = i45;
                                i27 = i12;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i25 = i4;
                            } else {
                                AbstractC17530c.AbstractC17532b abstractC17532b = (AbstractC17530c.AbstractC17532b) t;
                                abstractC17532b.m51214s();
                                C33231Gx7<Object> c33231Gx7 = abstractC17532b.zzik;
                                throw new NoSuchMethodError();
                            }
                        } else {
                            t3 = t;
                            i13 = i10;
                        }
                    } else {
                        t3 = t;
                        i13 = i10;
                        c49433tl92 = c49433tl9;
                    }
                    i26 = C17545l.m51137b(i6, bArr, i11, i2, m51193P(t), c49433tl9);
                    i28 = i6;
                    c17537e2 = this;
                    c49433tl96 = c49433tl92;
                    i30 = i13;
                    t4 = t3;
                    i27 = i12;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i24 = i2;
                    i25 = i4;
                }
            } else {
                int i46 = i31;
                unsafe = unsafe2;
                i4 = i25;
                t2 = t4;
                c17537e = c17537e2;
                i5 = i26;
                i6 = i28;
                i7 = i46;
                i8 = -1;
            }
        }
        if (i7 != i8) {
            unsafe.putInt(t2, i7, i29);
        }
        Object obj = null;
        for (int i47 = c17537e.f71179k; i47 < c17537e.f71180l; i47++) {
            int i48 = c17537e.f71178j[i47];
            I38 i382 = c17537e.f71183o;
            int i49 = c17537e.f71169a[i48];
            Object m13129G = C49038t58.m13129G(t2, c17537e.m51187l(i48) & 1048575);
            if (m13129G != null && (m51188k = c17537e.m51188k(i48)) != null) {
                obj = m51178u(i48, i49, c17537e.f71185q.mo5256h(m13129G), m51188k, obj, i382);
            }
            obj = (C49611u38) obj;
        }
        if (obj != null) {
            c17537e.f71183o.mo51155h(t2, obj);
        }
        if (i4 == 0) {
            if (i5 != i2) {
                throw zzbk.m51034e();
            }
        } else if (i5 > i2 || i6 != i4) {
            throw zzbk.m51034e();
        }
        return i5;
    }

    /* renamed from: u */
    public final <K, V, UT, UB> UB m51178u(int i, int i2, Map<K, V> map, SG7 sg7, UB ub, I38<UT, UB> i38) {
        this.f71185q.mo5260d(m51189j(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!sg7.m85783a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = i38.mo51157f();
                }
                C45261mj7 m29755C = AbstractC43604jv9.m29755C(C42718iR7.m33909a(null, next.getKey(), next.getValue()));
                try {
                    C42718iR7.m33908b(m29755C.m25133b(), null, next.getKey(), next.getValue());
                    i38.mo51161b(ub, i2, m29755C.m25134a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: x */
    public final void m51175x(T t, T t2, int i) {
        long m51187l = m51187l(i) & 1048575;
        if (!m51208A(t2, i)) {
            return;
        }
        Object m13129G = C49038t58.m13129G(t, m51187l);
        Object m13129G2 = C49038t58.m13129G(t2, m51187l);
        if (m13129G != null && m13129G2 != null) {
            C49038t58.m13114g(t, m51187l, C44389lF7.m27616d(m13129G, m13129G2));
            m51204E(t, i);
        } else if (m13129G2 != null) {
            C49038t58.m13114g(t, m51187l, m13129G2);
            m51204E(t, i);
        }
    }

    /* renamed from: z */
    public final <K, V> void m51173z(InterfaceC43393ja8 interfaceC43393ja8, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.f71185q.mo5260d(m51189j(i2));
            interfaceC43393ja8.mo15210Q(i, null, this.f71185q.mo5257g(obj));
        }
    }

    @Override // p000.LY7
    public final void zzd(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f71169a.length; i += 3) {
            int m51187l = m51187l(i);
            long j = 1048575 & m51187l;
            int i2 = this.f71169a[i];
            switch ((m51187l & 267386880) >>> 20) {
                case 0:
                    if (m51208A(t2, i)) {
                        C49038t58.m13118c(t, j, C49038t58.m13130F(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m51208A(t2, i)) {
                        C49038t58.m13117d(t, j, C49038t58.m13131E(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m51208A(t2, i)) {
                        C49038t58.m13115f(t, j, C49038t58.m13133C(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m51208A(t2, i)) {
                        C49038t58.m13115f(t, j, C49038t58.m13133C(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m51208A(t2, i)) {
                        C49038t58.m13116e(t, j, C49038t58.m13135A(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m51208A(t2, i)) {
                        C49038t58.m13115f(t, j, C49038t58.m13133C(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m51208A(t2, i)) {
                        C49038t58.m13116e(t, j, C49038t58.m13135A(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m51208A(t2, i)) {
                        C49038t58.m13113h(t, j, C49038t58.m13132D(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m51208A(t2, i)) {
                        C49038t58.m13114g(t, j, C49038t58.m13129G(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m51175x(t, t2, i);
                    break;
                case 10:
                    if (m51208A(t2, i)) {
                        C49038t58.m13114g(t, j, C49038t58.m13129G(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m51208A(t2, i)) {
                        C49038t58.m13116e(t, j, C49038t58.m13135A(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m51208A(t2, i)) {
                        C49038t58.m13116e(t, j, C49038t58.m13135A(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m51208A(t2, i)) {
                        C49038t58.m13116e(t, j, C49038t58.m13135A(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m51208A(t2, i)) {
                        C49038t58.m13115f(t, j, C49038t58.m13133C(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m51208A(t2, i)) {
                        C49038t58.m13116e(t, j, C49038t58.m13135A(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m51208A(t2, i)) {
                        C49038t58.m13115f(t, j, C49038t58.m13133C(t2, j));
                        m51204E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m51175x(t, t2, i);
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
                    this.f71182n.mo27336b(t, t2, j);
                    break;
                case 50:
                    C46348oZ7.m20857g(this.f71185q, t, t2, j);
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
                    if (m51207B(t2, i2, i)) {
                        C49038t58.m13114g(t, j, C49038t58.m13129G(t2, j));
                        m51203F(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m51202G(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m51207B(t2, i2, i)) {
                        C49038t58.m13114g(t, j, C49038t58.m13129G(t2, j));
                        m51203F(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m51202G(t, t2, i);
                    break;
            }
        }
        if (!this.f71176h) {
            C46348oZ7.m20856h(this.f71183o, t, t2);
            if (this.f71174f) {
                C46348oZ7.m20858f(this.f71184p, t, t2);
            }
        }
    }
}
