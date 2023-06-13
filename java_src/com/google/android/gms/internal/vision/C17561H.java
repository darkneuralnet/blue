package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.AbstractC17554G;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;
/* renamed from: com.google.android.gms.internal.vision.H */
/* loaded from: classes6.dex */
public final class C17561H<T> implements InterfaceC52825zU8<T> {

    /* renamed from: r */
    public static final int[] f71239r = new int[0];

    /* renamed from: s */
    public static final Unsafe f71240s = SZ8.m85244t();

    /* renamed from: a */
    public final int[] f71241a;

    /* renamed from: b */
    public final Object[] f71242b;

    /* renamed from: c */
    public final int f71243c;

    /* renamed from: d */
    public final int f71244d;

    /* renamed from: e */
    public final InterfaceC44489lQ8 f71245e;

    /* renamed from: f */
    public final boolean f71246f;

    /* renamed from: g */
    public final boolean f71247g;

    /* renamed from: h */
    public final boolean f71248h;

    /* renamed from: i */
    public final boolean f71249i;

    /* renamed from: j */
    public final int[] f71250j;

    /* renamed from: k */
    public final int f71251k;

    /* renamed from: l */
    public final int f71252l;

    /* renamed from: m */
    public final RR8 f71253m;

    /* renamed from: n */
    public final UL8 f71254n;

    /* renamed from: o */
    public final AbstractC41003fY8<?, ?> f71255o;

    /* renamed from: p */
    public final AbstractC50309vE8<?> f71256p;

    /* renamed from: q */
    public final EP8 f71257q;

    public C17561H(int[] iArr, Object[] objArr, int i, int i2, InterfaceC44489lQ8 interfaceC44489lQ8, boolean z, boolean z2, int[] iArr2, int i3, int i4, RR8 rr8, UL8 ul8, AbstractC41003fY8<?, ?> abstractC41003fY8, AbstractC50309vE8<?> abstractC50309vE8, EP8 ep8) {
        boolean z3;
        this.f71241a = iArr;
        this.f71242b = objArr;
        this.f71243c = i;
        this.f71244d = i2;
        this.f71247g = interfaceC44489lQ8 instanceof AbstractC17554G;
        this.f71248h = z;
        if (abstractC50309vE8 != null && abstractC50309vE8.mo8963h(interfaceC44489lQ8)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f71246f = z3;
        this.f71249i = false;
        this.f71250j = iArr2;
        this.f71251k = i3;
        this.f71252l = i4;
        this.f71253m = rr8;
        this.f71254n = ul8;
        this.f71255o = abstractC41003fY8;
        this.f71256p = abstractC50309vE8;
        this.f71245e = interfaceC44489lQ8;
        this.f71257q = ep8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static boolean m50966A(Object obj, int i, InterfaceC52825zU8 interfaceC52825zU8) {
        return interfaceC52825zU8.mo1314a(SZ8.m85273F(obj, i & 1048575));
    }

    /* renamed from: B */
    public static <T> double m50965B(T t, long j) {
        return ((Double) SZ8.m85273F(t, j)).doubleValue();
    }

    /* renamed from: I */
    public static <T> float m50958I(T t, long j) {
        return ((Float) SZ8.m85273F(t, j)).floatValue();
    }

    /* renamed from: M */
    public static <T> int m50954M(T t, long j) {
        return ((Integer) SZ8.m85273F(t, j)).intValue();
    }

    /* renamed from: O */
    public static <T> long m50952O(T t, long j) {
        return ((Long) SZ8.m85273F(t, j)).longValue();
    }

    /* renamed from: P */
    public static HY8 m50951P(Object obj) {
        AbstractC17554G abstractC17554G = (AbstractC17554G) obj;
        HY8 hy8 = abstractC17554G.zzb;
        if (hy8 == HY8.m103758a()) {
            HY8 m103752g = HY8.m103752g();
            abstractC17554G.zzb = m103752g;
            return m103752g;
        }
        return hy8;
    }

    /* renamed from: Q */
    public static boolean m50950Q(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: R */
    public static <T> boolean m50949R(T t, long j) {
        return ((Boolean) SZ8.m85273F(t, j)).booleanValue();
    }

    /* renamed from: l */
    public static <UT, UB> int m50942l(AbstractC41003fY8<UT, UB> abstractC41003fY8, T t) {
        return abstractC41003fY8.mo41179s(abstractC41003fY8.mo41187k(t));
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0397  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> C17561H<T> m50941m(Class<T> cls, PP8 pp8, RR8 rr8, UL8 ul8, AbstractC41003fY8<?, ?> abstractC41003fY8, AbstractC50309vE8<?> abstractC50309vE8, EP8 ep8) {
        boolean z;
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int charAt5;
        int i2;
        int[] iArr;
        int i3;
        char charAt6;
        int i4;
        char charAt7;
        int i5;
        char charAt8;
        int i6;
        char charAt9;
        int i7;
        char charAt10;
        int i8;
        char charAt11;
        int i9;
        char charAt12;
        int i10;
        char charAt13;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int objectFieldOffset;
        String str;
        boolean z2;
        boolean z3;
        int i16;
        int i17;
        int i18;
        Field m50938p;
        int i19;
        char charAt14;
        int i20;
        int i21;
        int i22;
        int i23;
        Field m50938p2;
        Field m50938p3;
        int i24;
        char charAt15;
        int i25;
        char charAt16;
        int i26;
        char charAt17;
        int i27;
        char charAt18;
        if (pp8 instanceof C39171cU8) {
            C39171cU8 c39171cU8 = (C39171cU8) pp8;
            int i28 = 0;
            if (c39171cU8.zza() == C46888pT8.f103739b) {
                z = true;
            } else {
                z = false;
            }
            String m61280a = c39171cU8.m61280a();
            int length = m61280a.length();
            if (m61280a.charAt(0) >= 55296) {
                int i29 = 1;
                while (true) {
                    i = i29 + 1;
                    if (m61280a.charAt(i29) < 55296) {
                        break;
                    }
                    i29 = i;
                }
            } else {
                i = 1;
            }
            int i30 = i + 1;
            int charAt19 = m61280a.charAt(i);
            if (charAt19 >= 55296) {
                int i31 = charAt19 & 8191;
                int i32 = 13;
                while (true) {
                    i27 = i30 + 1;
                    charAt18 = m61280a.charAt(i30);
                    if (charAt18 < 55296) {
                        break;
                    }
                    i31 |= (charAt18 & 8191) << i32;
                    i32 += 13;
                    i30 = i27;
                }
                charAt19 = i31 | (charAt18 << i32);
                i30 = i27;
            }
            if (charAt19 == 0) {
                charAt = 0;
                charAt2 = 0;
                charAt3 = 0;
                charAt4 = 0;
                charAt5 = 0;
                iArr = f71239r;
                i2 = 0;
            } else {
                int i33 = i30 + 1;
                int charAt20 = m61280a.charAt(i30);
                if (charAt20 >= 55296) {
                    int i34 = charAt20 & 8191;
                    int i35 = 13;
                    while (true) {
                        i10 = i33 + 1;
                        charAt13 = m61280a.charAt(i33);
                        if (charAt13 < 55296) {
                            break;
                        }
                        i34 |= (charAt13 & 8191) << i35;
                        i35 += 13;
                        i33 = i10;
                    }
                    charAt20 = i34 | (charAt13 << i35);
                    i33 = i10;
                }
                int i36 = i33 + 1;
                int charAt21 = m61280a.charAt(i33);
                if (charAt21 >= 55296) {
                    int i37 = charAt21 & 8191;
                    int i38 = 13;
                    while (true) {
                        i9 = i36 + 1;
                        charAt12 = m61280a.charAt(i36);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i37 |= (charAt12 & 8191) << i38;
                        i38 += 13;
                        i36 = i9;
                    }
                    charAt21 = i37 | (charAt12 << i38);
                    i36 = i9;
                }
                int i39 = i36 + 1;
                charAt = m61280a.charAt(i36);
                if (charAt >= 55296) {
                    int i40 = charAt & 8191;
                    int i41 = 13;
                    while (true) {
                        i8 = i39 + 1;
                        charAt11 = m61280a.charAt(i39);
                        if (charAt11 < 55296) {
                            break;
                        }
                        i40 |= (charAt11 & 8191) << i41;
                        i41 += 13;
                        i39 = i8;
                    }
                    charAt = i40 | (charAt11 << i41);
                    i39 = i8;
                }
                int i42 = i39 + 1;
                charAt2 = m61280a.charAt(i39);
                if (charAt2 >= 55296) {
                    int i43 = charAt2 & 8191;
                    int i44 = 13;
                    while (true) {
                        i7 = i42 + 1;
                        charAt10 = m61280a.charAt(i42);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i43 |= (charAt10 & 8191) << i44;
                        i44 += 13;
                        i42 = i7;
                    }
                    charAt2 = i43 | (charAt10 << i44);
                    i42 = i7;
                }
                int i45 = i42 + 1;
                charAt3 = m61280a.charAt(i42);
                if (charAt3 >= 55296) {
                    int i46 = charAt3 & 8191;
                    int i47 = 13;
                    while (true) {
                        i6 = i45 + 1;
                        charAt9 = m61280a.charAt(i45);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i46 |= (charAt9 & 8191) << i47;
                        i47 += 13;
                        i45 = i6;
                    }
                    charAt3 = i46 | (charAt9 << i47);
                    i45 = i6;
                }
                int i48 = i45 + 1;
                charAt4 = m61280a.charAt(i45);
                if (charAt4 >= 55296) {
                    int i49 = charAt4 & 8191;
                    int i50 = 13;
                    while (true) {
                        i5 = i48 + 1;
                        charAt8 = m61280a.charAt(i48);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i49 |= (charAt8 & 8191) << i50;
                        i50 += 13;
                        i48 = i5;
                    }
                    charAt4 = i49 | (charAt8 << i50);
                    i48 = i5;
                }
                int i51 = i48 + 1;
                int charAt22 = m61280a.charAt(i48);
                if (charAt22 >= 55296) {
                    int i52 = charAt22 & 8191;
                    int i53 = 13;
                    while (true) {
                        i4 = i51 + 1;
                        charAt7 = m61280a.charAt(i51);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i52 |= (charAt7 & 8191) << i53;
                        i53 += 13;
                        i51 = i4;
                    }
                    charAt22 = i52 | (charAt7 << i53);
                    i51 = i4;
                }
                int i54 = i51 + 1;
                charAt5 = m61280a.charAt(i51);
                if (charAt5 >= 55296) {
                    int i55 = charAt5 & 8191;
                    int i56 = i54;
                    int i57 = 13;
                    while (true) {
                        i3 = i56 + 1;
                        charAt6 = m61280a.charAt(i56);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i55 |= (charAt6 & 8191) << i57;
                        i57 += 13;
                        i56 = i3;
                    }
                    charAt5 = i55 | (charAt6 << i57);
                    i54 = i3;
                }
                i2 = (charAt20 << 1) + charAt21;
                iArr = new int[charAt5 + charAt4 + charAt22];
                i28 = charAt20;
                i30 = i54;
            }
            Unsafe unsafe = f71240s;
            Object[] m61279b = c39171cU8.m61279b();
            Class<?> cls2 = c39171cU8.zzc().getClass();
            int i58 = i30;
            int[] iArr2 = new int[charAt3 * 3];
            Object[] objArr = new Object[charAt3 << 1];
            int i59 = charAt5 + charAt4;
            int i60 = i2;
            int i61 = charAt5;
            int i62 = i58;
            int i63 = i59;
            int i64 = 0;
            int i65 = 0;
            while (i62 < length) {
                int i66 = i62 + 1;
                int charAt23 = m61280a.charAt(i62);
                if (charAt23 >= 55296) {
                    int i67 = charAt23 & 8191;
                    int i68 = i66;
                    int i69 = 13;
                    while (true) {
                        i26 = i68 + 1;
                        charAt17 = m61280a.charAt(i68);
                        i11 = length;
                        if (charAt17 < 55296) {
                            break;
                        }
                        i67 |= (charAt17 & 8191) << i69;
                        i69 += 13;
                        i68 = i26;
                        length = i11;
                    }
                    charAt23 = i67 | (charAt17 << i69);
                    i12 = i26;
                } else {
                    i11 = length;
                    i12 = i66;
                }
                int i70 = i12 + 1;
                int charAt24 = m61280a.charAt(i12);
                if (charAt24 >= 55296) {
                    int i71 = charAt24 & 8191;
                    int i72 = i70;
                    int i73 = 13;
                    while (true) {
                        i25 = i72 + 1;
                        charAt16 = m61280a.charAt(i72);
                        i13 = charAt5;
                        if (charAt16 < 55296) {
                            break;
                        }
                        i71 |= (charAt16 & 8191) << i73;
                        i73 += 13;
                        i72 = i25;
                        charAt5 = i13;
                    }
                    charAt24 = i71 | (charAt16 << i73);
                    i14 = i25;
                } else {
                    i13 = charAt5;
                    i14 = i70;
                }
                int i74 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
                int i75 = charAt2;
                if ((charAt24 & 1024) != 0) {
                    iArr[i64] = i65;
                    i64++;
                }
                int i76 = charAt;
                if (i74 >= 51) {
                    int i77 = i14 + 1;
                    int charAt25 = m61280a.charAt(i14);
                    char c = 55296;
                    if (charAt25 >= 55296) {
                        int i78 = charAt25 & 8191;
                        int i79 = 13;
                        while (true) {
                            i24 = i77 + 1;
                            charAt15 = m61280a.charAt(i77);
                            if (charAt15 < c) {
                                break;
                            }
                            i78 |= (charAt15 & 8191) << i79;
                            i79 += 13;
                            i77 = i24;
                            c = 55296;
                        }
                        charAt25 = i78 | (charAt15 << i79);
                        i77 = i24;
                    }
                    int i80 = i74 - 51;
                    int i81 = i77;
                    if (i80 != 9 && i80 != 17) {
                        if (i80 == 12 && !z) {
                            objArr[((i65 / 3) << 1) + 1] = m61279b[i60];
                            i60++;
                        }
                        i23 = 1;
                    } else {
                        i23 = 1;
                        objArr[((i65 / 3) << 1) + 1] = m61279b[i60];
                        i60++;
                    }
                    int i82 = charAt25 << i23;
                    Object obj = m61279b[i82];
                    if (obj instanceof Field) {
                        m50938p2 = (Field) obj;
                    } else {
                        m50938p2 = m50938p(cls2, (String) obj);
                        m61279b[i82] = m50938p2;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m50938p2);
                    int i83 = i82 + 1;
                    Object obj2 = m61279b[i83];
                    if (obj2 instanceof Field) {
                        m50938p3 = (Field) obj2;
                    } else {
                        m50938p3 = m50938p(cls2, (String) obj2);
                        m61279b[i83] = m50938p3;
                    }
                    str = m61280a;
                    i16 = (int) unsafe.objectFieldOffset(m50938p3);
                    z2 = z;
                    objectFieldOffset = objectFieldOffset2;
                    i17 = i81;
                    i18 = 0;
                    z3 = true;
                } else {
                    int i84 = i60 + 1;
                    Field m50938p4 = m50938p(cls2, (String) m61279b[i60]);
                    if (i74 != 9 && i74 != 17) {
                        if (i74 != 27 && i74 != 49) {
                            if (i74 != 12 && i74 != 30 && i74 != 44) {
                                if (i74 == 50) {
                                    int i85 = i61 + 1;
                                    iArr[i61] = i65;
                                    int i86 = (i65 / 3) << 1;
                                    i20 = i84 + 1;
                                    objArr[i86] = m61279b[i84];
                                    if ((charAt24 & 2048) != 0) {
                                        i84 = i20 + 1;
                                        objArr[i86 + 1] = m61279b[i20];
                                        i61 = i85;
                                    } else {
                                        i61 = i85;
                                    }
                                }
                            } else if (!z) {
                                i20 = i84 + 1;
                                objArr[((i65 / 3) << 1) + 1] = m61279b[i84];
                            }
                            objectFieldOffset = (int) unsafe.objectFieldOffset(m50938p4);
                            int i87 = i15;
                            if ((charAt24 & 4096) != 4096 && i74 <= 17) {
                                int i88 = i14 + 1;
                                int charAt26 = m61280a.charAt(i14);
                                if (charAt26 >= 55296) {
                                    int i89 = charAt26 & 8191;
                                    int i90 = 13;
                                    while (true) {
                                        i19 = i88 + 1;
                                        charAt14 = m61280a.charAt(i88);
                                        if (charAt14 < 55296) {
                                            break;
                                        }
                                        i89 |= (charAt14 & 8191) << i90;
                                        i90 += 13;
                                        i88 = i19;
                                    }
                                    charAt26 = i89 | (charAt14 << i90);
                                    i88 = i19;
                                }
                                z3 = true;
                                int i91 = (i28 << 1) + (charAt26 / 32);
                                Object obj3 = m61279b[i91];
                                str = m61280a;
                                if (obj3 instanceof Field) {
                                    m50938p = (Field) obj3;
                                } else {
                                    m50938p = m50938p(cls2, (String) obj3);
                                    m61279b[i91] = m50938p;
                                }
                                i17 = i88;
                                z2 = z;
                                i16 = (int) unsafe.objectFieldOffset(m50938p);
                                i18 = charAt26 % 32;
                            } else {
                                str = m61280a;
                                z2 = z;
                                z3 = true;
                                i16 = 1048575;
                                i17 = i14;
                                i18 = 0;
                            }
                            if (i74 >= 18 && i74 <= 49) {
                                iArr[i63] = objectFieldOffset;
                                i63++;
                            }
                            i60 = i87;
                        } else {
                            i20 = i84 + 1;
                            objArr[((i65 / 3) << 1) + 1] = m61279b[i84];
                        }
                        i15 = i20;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(m50938p4);
                        int i872 = i15;
                        if ((charAt24 & 4096) != 4096) {
                        }
                        str = m61280a;
                        z2 = z;
                        z3 = true;
                        i16 = 1048575;
                        i17 = i14;
                        i18 = 0;
                        if (i74 >= 18) {
                            iArr[i63] = objectFieldOffset;
                            i63++;
                        }
                        i60 = i872;
                    } else {
                        objArr[((i65 / 3) << 1) + 1] = m50938p4.getType();
                    }
                    i15 = i84;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m50938p4);
                    int i8722 = i15;
                    if ((charAt24 & 4096) != 4096) {
                    }
                    str = m61280a;
                    z2 = z;
                    z3 = true;
                    i16 = 1048575;
                    i17 = i14;
                    i18 = 0;
                    if (i74 >= 18) {
                    }
                    i60 = i8722;
                }
                int i92 = i65 + 1;
                iArr2[i65] = charAt23;
                int i93 = i92 + 1;
                int i94 = i28;
                if ((charAt24 & 512) != 0) {
                    i21 = 536870912;
                } else {
                    i21 = 0;
                }
                if ((charAt24 & 256) != 0) {
                    i22 = 268435456;
                } else {
                    i22 = 0;
                }
                iArr2[i92] = i22 | i21 | (i74 << 20) | objectFieldOffset;
                int i95 = i93 + 1;
                iArr2[i93] = (i18 << 20) | i16;
                z = z2;
                i28 = i94;
                charAt2 = i75;
                i62 = i17;
                charAt5 = i13;
                charAt = i76;
                m61280a = str;
                i65 = i95;
                length = i11;
            }
            return new C17561H<>(iArr2, objArr, charAt, charAt2, c39171cU8.zzc(), z, false, iArr, charAt5, i59, rr8, ul8, abstractC41003fY8, abstractC50309vE8, ep8);
        }
        ((BX8) pp8).zza();
        int i96 = C46888pT8.f103738a;
        throw new NoSuchMethodError();
    }

    /* renamed from: p */
    public static Field m50938p(Class<?> cls, String str) {
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

    /* renamed from: q */
    public static List<?> m50937q(Object obj, long j) {
        return (List) SZ8.m85273F(obj, j);
    }

    /* renamed from: s */
    public static void m50935s(int i, Object obj, InterfaceC37736a39 interfaceC37736a39) throws IOException {
        if (obj instanceof String) {
            interfaceC37736a39.mo21611D(i, (String) obj);
        } else {
            interfaceC37736a39.mo21602M(i, (AbstractC53119zy8) obj);
        }
    }

    /* renamed from: v */
    public static <UT, UB> void m50932v(AbstractC41003fY8<UT, UB> abstractC41003fY8, T t, InterfaceC37736a39 interfaceC37736a39) throws IOException {
        abstractC41003fY8.mo41190h(abstractC41003fY8.mo41187k(t), interfaceC37736a39);
    }

    /* renamed from: C */
    public final int m50964C(int i, int i2) {
        int length = (this.f71241a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f71241a[i4];
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

    /* renamed from: D */
    public final Object m50963D(int i) {
        return this.f71242b[(i / 3) << 1];
    }

    /* renamed from: E */
    public final void m50962E(T t, int i) {
        int m50953N = m50953N(i);
        long j = 1048575 & m50953N;
        if (j == 1048575) {
            return;
        }
        SZ8.m85256h(t, j, (1 << (m50953N >>> 20)) | SZ8.m85262b(t, j));
    }

    /* renamed from: F */
    public final void m50961F(T t, int i, int i2) {
        SZ8.m85256h(t, m50953N(i2) & 1048575, i);
    }

    /* renamed from: G */
    public final void m50960G(T t, T t2, int i) {
        Object obj;
        int m50955L = m50955L(i);
        int i2 = this.f71241a[i];
        long j = m50955L & 1048575;
        if (!m50929y(t2, i2, i)) {
            return;
        }
        if (m50929y(t, i2, i)) {
            obj = SZ8.m85273F(t, j);
        } else {
            obj = null;
        }
        Object m85273F = SZ8.m85273F(t2, j);
        if (obj != null && m85273F != null) {
            SZ8.m85254j(t, j, C52124yI8.m3690e(obj, m85273F));
            m50961F(t, i2, i);
        } else if (m85273F != null) {
            SZ8.m85254j(t, j, m85273F);
            m50961F(t, i2, i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x048b  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m50959H(T t, InterfaceC37736a39 interfaceC37736a39) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        int i2;
        boolean z;
        if (this.f71246f) {
            C47355qF8<?> mo8967d = this.f71256p.mo8967d(t);
            if (!mo8967d.f104998a.isEmpty()) {
                it = mo8967d.m17717o();
                entry = it.next();
                length = this.f71241a.length;
                Unsafe unsafe = f71240s;
                int i3 = 1048575;
                int i4 = 0;
                for (i = 0; i < length; i += 3) {
                    int m50955L = m50955L(i);
                    int[] iArr = this.f71241a;
                    int i5 = iArr[i];
                    int i6 = (m50955L & 267386880) >>> 20;
                    if (i6 <= 17) {
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
                    while (entry != null && this.f71256p.mo8970a(entry) <= i5) {
                        this.f71256p.mo8964g(interfaceC37736a39, entry);
                        if (it.hasNext()) {
                            entry = it.next();
                        } else {
                            entry = null;
                        }
                    }
                    long j = m50955L & 1048575;
                    switch (i6) {
                        case 0:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21575z(i5, SZ8.m85276C(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21614A(i5, SZ8.m85240x(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21576y(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21592i(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21578w(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21613B(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21589l(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21610E(i5, SZ8.m85241w(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if ((i2 & i4) != 0) {
                                m50935s(i5, unsafe.getObject(t, j), interfaceC37736a39);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21606I(i5, unsafe.getObject(t, j), m50936r(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21602M(i5, (AbstractC53119zy8) unsafe.getObject(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21588m(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21609F(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21595f(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21593h(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21590k(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21604K(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if ((i2 & i4) != 0) {
                                interfaceC37736a39.mo21605J(i5, unsafe.getObject(t, j), m50936r(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            z = false;
                            UU8.m81419l(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, false);
                            break;
                        case 19:
                            z = false;
                            UU8.m81406y(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, false);
                            break;
                        case 20:
                            z = false;
                            UU8.m81458C(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, false);
                            break;
                        case 21:
                            z = false;
                            UU8.m81454G(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, false);
                            break;
                        case 22:
                            z = false;
                            UU8.m81441T(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, false);
                            break;
                        case 23:
                            z = false;
                            UU8.m81447N(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, false);
                            break;
                        case 24:
                            z = false;
                            UU8.m81433a0(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, false);
                            break;
                        case 25:
                            z = false;
                            UU8.m81427d0(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, false);
                            break;
                        case 26:
                            UU8.m81421j(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39);
                            break;
                        case 27:
                            UU8.m81420k(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, m50936r(i));
                            break;
                        case 28:
                            UU8.m81408w(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39);
                            break;
                        case 29:
                            z = false;
                            UU8.m81438W(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, false);
                            break;
                        case 30:
                            z = false;
                            UU8.m81429c0(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, false);
                            break;
                        case 31:
                            z = false;
                            UU8.m81431b0(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, false);
                            break;
                        case 32:
                            z = false;
                            UU8.m81444Q(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, false);
                            break;
                        case 33:
                            z = false;
                            UU8.m81435Z(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, false);
                            break;
                        case 34:
                            z = false;
                            UU8.m81450K(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, false);
                            break;
                        case 35:
                            UU8.m81419l(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, true);
                            break;
                        case 36:
                            UU8.m81406y(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, true);
                            break;
                        case 37:
                            UU8.m81458C(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, true);
                            break;
                        case 38:
                            UU8.m81454G(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, true);
                            break;
                        case 39:
                            UU8.m81441T(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, true);
                            break;
                        case 40:
                            UU8.m81447N(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, true);
                            break;
                        case 41:
                            UU8.m81433a0(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, true);
                            break;
                        case 42:
                            UU8.m81427d0(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, true);
                            break;
                        case 43:
                            UU8.m81438W(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, true);
                            break;
                        case 44:
                            UU8.m81429c0(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, true);
                            break;
                        case 45:
                            UU8.m81431b0(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, true);
                            break;
                        case 46:
                            UU8.m81444Q(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, true);
                            break;
                        case 47:
                            UU8.m81435Z(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, true);
                            break;
                        case 48:
                            UU8.m81450K(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, true);
                            break;
                        case 49:
                            UU8.m81407x(this.f71241a[i], (List) unsafe.getObject(t, j), interfaceC37736a39, m50936r(i));
                            break;
                        case 50:
                            m50931w(interfaceC37736a39, i5, unsafe.getObject(t, j), i);
                            break;
                        case 51:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21575z(i5, m50965B(t, j));
                            }
                            break;
                        case 52:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21614A(i5, m50958I(t, j));
                            }
                            break;
                        case 53:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21576y(i5, m50952O(t, j));
                            }
                            break;
                        case 54:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21592i(i5, m50952O(t, j));
                            }
                            break;
                        case 55:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21578w(i5, m50954M(t, j));
                            }
                            break;
                        case 56:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21613B(i5, m50952O(t, j));
                            }
                            break;
                        case 57:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21589l(i5, m50954M(t, j));
                            }
                            break;
                        case 58:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21610E(i5, m50949R(t, j));
                            }
                            break;
                        case 59:
                            if (m50929y(t, i5, i)) {
                                m50935s(i5, unsafe.getObject(t, j), interfaceC37736a39);
                            }
                            break;
                        case 60:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21606I(i5, unsafe.getObject(t, j), m50936r(i));
                            }
                            break;
                        case 61:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21602M(i5, (AbstractC53119zy8) unsafe.getObject(t, j));
                            }
                            break;
                        case 62:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21588m(i5, m50954M(t, j));
                            }
                            break;
                        case 63:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21609F(i5, m50954M(t, j));
                            }
                            break;
                        case 64:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21595f(i5, m50954M(t, j));
                            }
                            break;
                        case 65:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21593h(i5, m50952O(t, j));
                            }
                            break;
                        case 66:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21590k(i5, m50954M(t, j));
                            }
                            break;
                        case 67:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21604K(i5, m50952O(t, j));
                            }
                            break;
                        case 68:
                            if (m50929y(t, i5, i)) {
                                interfaceC37736a39.mo21605J(i5, unsafe.getObject(t, j), m50936r(i));
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.f71256p.mo8964g(interfaceC37736a39, entry);
                    if (it.hasNext()) {
                        entry = it.next();
                    } else {
                        entry = null;
                    }
                }
                m50932v(this.f71255o, t, interfaceC37736a39);
            }
        }
        it = null;
        entry = null;
        length = this.f71241a.length;
        Unsafe unsafe2 = f71240s;
        int i32 = 1048575;
        int i42 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        m50932v(this.f71255o, t, interfaceC37736a39);
    }

    /* renamed from: J */
    public final KI8 m50957J(int i) {
        return (KI8) this.f71242b[((i / 3) << 1) + 1];
    }

    /* renamed from: K */
    public final boolean m50956K(T t, T t2, int i) {
        return m50930x(t, i) == m50930x(t2, i);
    }

    /* renamed from: L */
    public final int m50955L(int i) {
        return this.f71241a[i + 1];
    }

    /* renamed from: N */
    public final int m50953N(int i) {
        return this.f71241a[i + 2];
    }

    /* renamed from: S */
    public final int m50948S(int i) {
        if (i >= this.f71243c && i <= this.f71244d) {
            return m50964C(i, 0);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC52825zU8
    /* renamed from: a */
    public final boolean mo1314a(T t) {
        int i;
        int i2;
        boolean z;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z2 = true;
            if (i5 < this.f71251k) {
                int i6 = this.f71250j[i5];
                int i7 = this.f71241a[i6];
                int m50955L = m50955L(i6);
                int i8 = this.f71241a[i6 + 2];
                int i9 = i8 & 1048575;
                int i10 = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    if (i9 != 1048575) {
                        i4 = f71240s.getInt(t, i9);
                    }
                    i2 = i4;
                    i = i9;
                } else {
                    i = i3;
                    i2 = i4;
                }
                if ((268435456 & m50955L) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !m50928z(t, i6, i, i2, i10)) {
                    return false;
                }
                int i11 = (267386880 & m50955L) >>> 20;
                if (i11 != 9 && i11 != 17) {
                    if (i11 != 27) {
                        if (i11 != 60 && i11 != 68) {
                            if (i11 != 49) {
                                if (i11 == 50 && !this.f71257q.zzc(SZ8.m85273F(t, m50955L & 1048575)).isEmpty()) {
                                    this.f71257q.zzb(m50963D(i6));
                                    throw null;
                                }
                            }
                        } else if (m50929y(t, i7, i6) && !m50966A(t, m50955L, m50936r(i6))) {
                            return false;
                        }
                    }
                    List list = (List) SZ8.m85273F(t, m50955L & 1048575);
                    if (!list.isEmpty()) {
                        InterfaceC52825zU8 m50936r = m50936r(i6);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= list.size()) {
                                break;
                            } else if (!m50936r.mo1314a(list.get(i12))) {
                                z2 = false;
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (!z2) {
                        return false;
                    }
                } else if (m50928z(t, i6, i, i2, i10) && !m50966A(t, m50955L, m50936r(i6))) {
                    return false;
                }
                i5++;
                i3 = i;
                i4 = i2;
            } else if (this.f71246f && !this.f71256p.mo8967d(t).m17714r()) {
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
    @Override // p000.InterfaceC52825zU8
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1313b(T t, InterfaceC37736a39 interfaceC37736a39) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        Iterator<Map.Entry<?, Object>> it2;
        Map.Entry<?, Object> entry2;
        int length2;
        if (interfaceC37736a39.zza() == Q29.f29742b) {
            m50932v(this.f71255o, t, interfaceC37736a39);
            if (this.f71246f) {
                C47355qF8<?> mo8967d = this.f71256p.mo8967d(t);
                if (!mo8967d.f104998a.isEmpty()) {
                    it2 = mo8967d.m17715q();
                    entry2 = it2.next();
                    for (length2 = this.f71241a.length - 3; length2 >= 0; length2 -= 3) {
                        int m50955L = m50955L(length2);
                        int i2 = this.f71241a[length2];
                        while (entry2 != null && this.f71256p.mo8970a(entry2) > i2) {
                            this.f71256p.mo8964g(interfaceC37736a39, entry2);
                            entry2 = it2.hasNext() ? it2.next() : null;
                        }
                        switch ((m50955L & 267386880) >>> 20) {
                            case 0:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21575z(i2, SZ8.m85276C(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21614A(i2, SZ8.m85240x(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21576y(i2, SZ8.m85249o(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21592i(i2, SZ8.m85249o(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21578w(i2, SZ8.m85262b(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21613B(i2, SZ8.m85249o(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21589l(i2, SZ8.m85262b(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21610E(i2, SZ8.m85241w(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (m50930x(t, length2)) {
                                    m50935s(i2, SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21606I(i2, SZ8.m85273F(t, m50955L & 1048575), m50936r(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21602M(i2, (AbstractC53119zy8) SZ8.m85273F(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21588m(i2, SZ8.m85262b(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21609F(i2, SZ8.m85262b(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21595f(i2, SZ8.m85262b(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21593h(i2, SZ8.m85249o(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21590k(i2, SZ8.m85262b(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21604K(i2, SZ8.m85249o(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (m50930x(t, length2)) {
                                    interfaceC37736a39.mo21605J(i2, SZ8.m85273F(t, m50955L & 1048575), m50936r(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                UU8.m81419l(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, false);
                                break;
                            case 19:
                                UU8.m81406y(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, false);
                                break;
                            case 20:
                                UU8.m81458C(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, false);
                                break;
                            case 21:
                                UU8.m81454G(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, false);
                                break;
                            case 22:
                                UU8.m81441T(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, false);
                                break;
                            case 23:
                                UU8.m81447N(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, false);
                                break;
                            case 24:
                                UU8.m81433a0(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, false);
                                break;
                            case 25:
                                UU8.m81427d0(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, false);
                                break;
                            case 26:
                                UU8.m81421j(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39);
                                break;
                            case 27:
                                UU8.m81420k(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, m50936r(length2));
                                break;
                            case 28:
                                UU8.m81408w(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39);
                                break;
                            case 29:
                                UU8.m81438W(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, false);
                                break;
                            case 30:
                                UU8.m81429c0(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, false);
                                break;
                            case 31:
                                UU8.m81431b0(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, false);
                                break;
                            case 32:
                                UU8.m81444Q(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, false);
                                break;
                            case 33:
                                UU8.m81435Z(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, false);
                                break;
                            case 34:
                                UU8.m81450K(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, false);
                                break;
                            case 35:
                                UU8.m81419l(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, true);
                                break;
                            case 36:
                                UU8.m81406y(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, true);
                                break;
                            case 37:
                                UU8.m81458C(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, true);
                                break;
                            case 38:
                                UU8.m81454G(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, true);
                                break;
                            case 39:
                                UU8.m81441T(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, true);
                                break;
                            case 40:
                                UU8.m81447N(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, true);
                                break;
                            case 41:
                                UU8.m81433a0(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, true);
                                break;
                            case 42:
                                UU8.m81427d0(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, true);
                                break;
                            case 43:
                                UU8.m81438W(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, true);
                                break;
                            case 44:
                                UU8.m81429c0(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, true);
                                break;
                            case 45:
                                UU8.m81431b0(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, true);
                                break;
                            case 46:
                                UU8.m81444Q(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, true);
                                break;
                            case 47:
                                UU8.m81435Z(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, true);
                                break;
                            case 48:
                                UU8.m81450K(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, true);
                                break;
                            case 49:
                                UU8.m81407x(this.f71241a[length2], (List) SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39, m50936r(length2));
                                break;
                            case 50:
                                m50931w(interfaceC37736a39, i2, SZ8.m85273F(t, m50955L & 1048575), length2);
                                break;
                            case 51:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21575z(i2, m50965B(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21614A(i2, m50958I(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21576y(i2, m50952O(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21592i(i2, m50952O(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21578w(i2, m50954M(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21613B(i2, m50952O(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21589l(i2, m50954M(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21610E(i2, m50949R(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (m50929y(t, i2, length2)) {
                                    m50935s(i2, SZ8.m85273F(t, m50955L & 1048575), interfaceC37736a39);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21606I(i2, SZ8.m85273F(t, m50955L & 1048575), m50936r(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21602M(i2, (AbstractC53119zy8) SZ8.m85273F(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21588m(i2, m50954M(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21609F(i2, m50954M(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21595f(i2, m50954M(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21593h(i2, m50952O(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21590k(i2, m50954M(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21604K(i2, m50952O(t, m50955L & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (m50929y(t, i2, length2)) {
                                    interfaceC37736a39.mo21605J(i2, SZ8.m85273F(t, m50955L & 1048575), m50936r(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry2 != null) {
                        this.f71256p.mo8964g(interfaceC37736a39, entry2);
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
        } else if (this.f71248h) {
            if (this.f71246f) {
                C47355qF8<?> mo8967d2 = this.f71256p.mo8967d(t);
                if (!mo8967d2.f104998a.isEmpty()) {
                    it = mo8967d2.m17717o();
                    entry = it.next();
                    length = this.f71241a.length;
                    for (i = 0; i < length; i += 3) {
                        int m50955L2 = m50955L(i);
                        int i3 = this.f71241a[i];
                        while (entry != null && this.f71256p.mo8970a(entry) <= i3) {
                            this.f71256p.mo8964g(interfaceC37736a39, entry);
                            entry = it.hasNext() ? it.next() : null;
                        }
                        switch ((m50955L2 & 267386880) >>> 20) {
                            case 0:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21575z(i3, SZ8.m85276C(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21614A(i3, SZ8.m85240x(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21576y(i3, SZ8.m85249o(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21592i(i3, SZ8.m85249o(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21578w(i3, SZ8.m85262b(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21613B(i3, SZ8.m85249o(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21589l(i3, SZ8.m85262b(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21610E(i3, SZ8.m85241w(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (m50930x(t, i)) {
                                    m50935s(i3, SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21606I(i3, SZ8.m85273F(t, m50955L2 & 1048575), m50936r(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21602M(i3, (AbstractC53119zy8) SZ8.m85273F(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21588m(i3, SZ8.m85262b(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21609F(i3, SZ8.m85262b(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21595f(i3, SZ8.m85262b(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21593h(i3, SZ8.m85249o(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21590k(i3, SZ8.m85262b(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21604K(i3, SZ8.m85249o(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (m50930x(t, i)) {
                                    interfaceC37736a39.mo21605J(i3, SZ8.m85273F(t, m50955L2 & 1048575), m50936r(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                UU8.m81419l(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, false);
                                break;
                            case 19:
                                UU8.m81406y(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, false);
                                break;
                            case 20:
                                UU8.m81458C(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, false);
                                break;
                            case 21:
                                UU8.m81454G(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, false);
                                break;
                            case 22:
                                UU8.m81441T(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, false);
                                break;
                            case 23:
                                UU8.m81447N(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, false);
                                break;
                            case 24:
                                UU8.m81433a0(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, false);
                                break;
                            case 25:
                                UU8.m81427d0(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, false);
                                break;
                            case 26:
                                UU8.m81421j(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39);
                                break;
                            case 27:
                                UU8.m81420k(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, m50936r(i));
                                break;
                            case 28:
                                UU8.m81408w(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39);
                                break;
                            case 29:
                                UU8.m81438W(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, false);
                                break;
                            case 30:
                                UU8.m81429c0(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, false);
                                break;
                            case 31:
                                UU8.m81431b0(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, false);
                                break;
                            case 32:
                                UU8.m81444Q(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, false);
                                break;
                            case 33:
                                UU8.m81435Z(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, false);
                                break;
                            case 34:
                                UU8.m81450K(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, false);
                                break;
                            case 35:
                                UU8.m81419l(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, true);
                                break;
                            case 36:
                                UU8.m81406y(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, true);
                                break;
                            case 37:
                                UU8.m81458C(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, true);
                                break;
                            case 38:
                                UU8.m81454G(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, true);
                                break;
                            case 39:
                                UU8.m81441T(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, true);
                                break;
                            case 40:
                                UU8.m81447N(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, true);
                                break;
                            case 41:
                                UU8.m81433a0(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, true);
                                break;
                            case 42:
                                UU8.m81427d0(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, true);
                                break;
                            case 43:
                                UU8.m81438W(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, true);
                                break;
                            case 44:
                                UU8.m81429c0(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, true);
                                break;
                            case 45:
                                UU8.m81431b0(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, true);
                                break;
                            case 46:
                                UU8.m81444Q(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, true);
                                break;
                            case 47:
                                UU8.m81435Z(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, true);
                                break;
                            case 48:
                                UU8.m81450K(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, true);
                                break;
                            case 49:
                                UU8.m81407x(this.f71241a[i], (List) SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39, m50936r(i));
                                break;
                            case 50:
                                m50931w(interfaceC37736a39, i3, SZ8.m85273F(t, m50955L2 & 1048575), i);
                                break;
                            case 51:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21575z(i3, m50965B(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21614A(i3, m50958I(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21576y(i3, m50952O(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21592i(i3, m50952O(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21578w(i3, m50954M(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21613B(i3, m50952O(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21589l(i3, m50954M(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21610E(i3, m50949R(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (m50929y(t, i3, i)) {
                                    m50935s(i3, SZ8.m85273F(t, m50955L2 & 1048575), interfaceC37736a39);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21606I(i3, SZ8.m85273F(t, m50955L2 & 1048575), m50936r(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21602M(i3, (AbstractC53119zy8) SZ8.m85273F(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21588m(i3, m50954M(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21609F(i3, m50954M(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21595f(i3, m50954M(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21593h(i3, m50952O(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21590k(i3, m50954M(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21604K(i3, m50952O(t, m50955L2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (m50929y(t, i3, i)) {
                                    interfaceC37736a39.mo21605J(i3, SZ8.m85273F(t, m50955L2 & 1048575), m50936r(i));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry != null) {
                        this.f71256p.mo8964g(interfaceC37736a39, entry);
                        entry = it.hasNext() ? it.next() : null;
                    }
                    m50932v(this.f71255o, t, interfaceC37736a39);
                }
            }
            it = null;
            entry = null;
            length = this.f71241a.length;
            while (i < length) {
            }
            while (entry != null) {
            }
            m50932v(this.f71255o, t, interfaceC37736a39);
        } else {
            m50959H(t, interfaceC37736a39);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(p000.SZ8.m85276C(r10, r6)) == java.lang.Double.doubleToLongBits(p000.SZ8.m85276C(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (p000.UU8.m81414q(p000.SZ8.m85273F(r10, r6), p000.SZ8.m85273F(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (p000.UU8.m81414q(p000.SZ8.m85273F(r10, r6), p000.SZ8.m85273F(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (p000.SZ8.m85249o(r10, r6) == p000.SZ8.m85249o(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (p000.SZ8.m85262b(r10, r6) == p000.SZ8.m85262b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (p000.SZ8.m85249o(r10, r6) == p000.SZ8.m85249o(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (p000.SZ8.m85262b(r10, r6) == p000.SZ8.m85262b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        if (p000.SZ8.m85262b(r10, r6) == p000.SZ8.m85262b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (p000.SZ8.m85262b(r10, r6) == p000.SZ8.m85262b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (p000.UU8.m81414q(p000.SZ8.m85273F(r10, r6), p000.SZ8.m85273F(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
        if (p000.UU8.m81414q(p000.SZ8.m85273F(r10, r6), p000.SZ8.m85273F(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (p000.UU8.m81414q(p000.SZ8.m85273F(r10, r6), p000.SZ8.m85273F(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012e, code lost:
        if (p000.SZ8.m85241w(r10, r6) == p000.SZ8.m85241w(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (p000.SZ8.m85262b(r10, r6) == p000.SZ8.m85262b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (p000.SZ8.m85249o(r10, r6) == p000.SZ8.m85249o(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0165, code lost:
        if (p000.SZ8.m85262b(r10, r6) == p000.SZ8.m85262b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
        if (p000.SZ8.m85249o(r10, r6) == p000.SZ8.m85249o(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
        if (p000.SZ8.m85249o(r10, r6) == p000.SZ8.m85249o(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(p000.SZ8.m85240x(r10, r6)) == java.lang.Float.floatToIntBits(p000.SZ8.m85240x(r11, r6))) goto L85;
     */
    @Override // p000.InterfaceC52825zU8
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo1312c(T t, T t2) {
        int length = this.f71241a.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int m50955L = m50955L(i);
                long j = m50955L & 1048575;
                switch ((m50955L & 267386880) >>> 20) {
                    case 0:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (m50956K(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (m50956K(t, t2, i)) {
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
                        z = UU8.m81414q(SZ8.m85273F(t, j), SZ8.m85273F(t2, j));
                        break;
                    case 50:
                        z = UU8.m81414q(SZ8.m85273F(t, j), SZ8.m85273F(t2, j));
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
                        long m50953N = m50953N(i) & 1048575;
                        if (SZ8.m85262b(t, m50953N) == SZ8.m85262b(t2, m50953N)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (!z) {
                    return false;
                }
                i += 3;
            } else if (!this.f71255o.mo41187k(t).equals(this.f71255o.mo41187k(t2))) {
                return false;
            } else {
                if (!this.f71246f) {
                    return true;
                }
                return this.f71256p.mo8967d(t).equals(this.f71256p.mo8967d(t2));
            }
        }
    }

    @Override // p000.InterfaceC52825zU8
    /* renamed from: d */
    public final void mo1311d(T t, IU8 iu8, C17551E c17551e) throws IOException {
        c17551e.getClass();
        AbstractC41003fY8 abstractC41003fY8 = this.f71255o;
        AbstractC50309vE8<?> abstractC50309vE8 = this.f71256p;
        C47355qF8<?> c47355qF8 = null;
        Object obj = null;
        while (true) {
            try {
                int zza = iu8.zza();
                int m50948S = m50948S(zza);
                if (m50948S >= 0) {
                    int m50955L = m50955L(m50948S);
                    switch ((267386880 & m50955L) >>> 20) {
                        case 0:
                            SZ8.m85258f(t, m50955L & 1048575, iu8.zzd());
                            m50962E(t, m50948S);
                            continue;
                        case 1:
                            SZ8.m85257g(t, m50955L & 1048575, iu8.zze());
                            m50962E(t, m50948S);
                            continue;
                        case 2:
                            SZ8.m85255i(t, m50955L & 1048575, iu8.zzg());
                            m50962E(t, m50948S);
                            continue;
                        case 3:
                            SZ8.m85255i(t, m50955L & 1048575, iu8.mo13311x());
                            m50962E(t, m50948S);
                            continue;
                        case 4:
                            SZ8.m85256h(t, m50955L & 1048575, iu8.zzh());
                            m50962E(t, m50948S);
                            continue;
                        case 5:
                            SZ8.m85255i(t, m50955L & 1048575, iu8.zzi());
                            m50962E(t, m50948S);
                            continue;
                        case 6:
                            SZ8.m85256h(t, m50955L & 1048575, iu8.mo13332c());
                            m50962E(t, m50948S);
                            continue;
                        case 7:
                            SZ8.m85253k(t, m50955L & 1048575, iu8.mo13335a());
                            m50962E(t, m50948S);
                            continue;
                        case 8:
                            m50934t(t, m50955L, iu8);
                            m50962E(t, m50948S);
                            continue;
                        case 9:
                            if (m50930x(t, m50948S)) {
                                long j = m50955L & 1048575;
                                SZ8.m85254j(t, j, C52124yI8.m3690e(SZ8.m85273F(t, j), iu8.mo13354H(m50936r(m50948S), c17551e)));
                                break;
                            } else {
                                SZ8.m85254j(t, m50955L & 1048575, iu8.mo13354H(m50936r(m50948S), c17551e));
                                m50962E(t, m50948S);
                                continue;
                            }
                        case 10:
                            SZ8.m85254j(t, m50955L & 1048575, iu8.mo13330e());
                            m50962E(t, m50948S);
                            continue;
                        case 11:
                            SZ8.m85256h(t, m50955L & 1048575, iu8.mo13329f());
                            m50962E(t, m50948S);
                            continue;
                        case 12:
                            int mo13331d = iu8.mo13331d();
                            KI8 m50957J = m50957J(m50948S);
                            if (m50957J != null && !m50957J.zza(mo13331d)) {
                                obj = UU8.m81425f(zza, mo13331d, obj, abstractC41003fY8);
                                break;
                            }
                            SZ8.m85256h(t, m50955L & 1048575, mo13331d);
                            m50962E(t, m50948S);
                            continue;
                        case 13:
                            SZ8.m85256h(t, m50955L & 1048575, iu8.mo13327h());
                            m50962E(t, m50948S);
                            continue;
                        case 14:
                            SZ8.m85255i(t, m50955L & 1048575, iu8.mo13324k());
                            m50962E(t, m50948S);
                            continue;
                        case 15:
                            SZ8.m85256h(t, m50955L & 1048575, iu8.zzs());
                            m50962E(t, m50948S);
                            continue;
                        case 16:
                            SZ8.m85255i(t, m50955L & 1048575, iu8.mo13328g());
                            m50962E(t, m50948S);
                            continue;
                        case 17:
                            if (m50930x(t, m50948S)) {
                                long j2 = m50955L & 1048575;
                                SZ8.m85254j(t, j2, C52124yI8.m3690e(SZ8.m85273F(t, j2), iu8.mo13355G(m50936r(m50948S), c17551e)));
                                break;
                            } else {
                                SZ8.m85254j(t, m50955L & 1048575, iu8.mo13355G(m50936r(m50948S), c17551e));
                                m50962E(t, m50948S);
                                continue;
                            }
                        case 18:
                            iu8.zza(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 19:
                            iu8.mo13361A(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 20:
                            iu8.mo13357E(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 21:
                            iu8.mo13309z(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 22:
                            iu8.mo13359C(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 23:
                            iu8.mo13314u(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 24:
                            iu8.mo13315t(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 25:
                            iu8.mo13316s(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 26:
                            if (m50950Q(m50955L)) {
                                iu8.mo13313v(this.f71254n.mo14267a(t, m50955L & 1048575));
                                break;
                            } else {
                                iu8.mo13310y(this.f71254n.mo14267a(t, m50955L & 1048575));
                                continue;
                            }
                        case 27:
                            iu8.mo13312w(this.f71254n.mo14267a(t, m50955L & 1048575), m50936r(m50948S), c17551e);
                            continue;
                        case 28:
                            iu8.mo13320o(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 29:
                            iu8.mo13321n(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 30:
                            List<Integer> mo14267a = this.f71254n.mo14267a(t, m50955L & 1048575);
                            iu8.mo13318q(mo14267a);
                            obj = UU8.m81424g(zza, mo14267a, m50957J(m50948S), obj, abstractC41003fY8);
                            continue;
                        case 31:
                            iu8.mo13319p(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 32:
                            iu8.mo13323l(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 33:
                            iu8.mo13326i(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 34:
                            iu8.mo13322m(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 35:
                            iu8.zza(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 36:
                            iu8.mo13361A(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 37:
                            iu8.mo13357E(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 38:
                            iu8.mo13309z(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 39:
                            iu8.mo13359C(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 40:
                            iu8.mo13314u(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 41:
                            iu8.mo13315t(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 42:
                            iu8.mo13316s(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 43:
                            iu8.mo13321n(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 44:
                            List<Integer> mo14267a2 = this.f71254n.mo14267a(t, m50955L & 1048575);
                            iu8.mo13318q(mo14267a2);
                            obj = UU8.m81424g(zza, mo14267a2, m50957J(m50948S), obj, abstractC41003fY8);
                            continue;
                        case 45:
                            iu8.mo13319p(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 46:
                            iu8.mo13323l(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 47:
                            iu8.mo13326i(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 48:
                            iu8.mo13322m(this.f71254n.mo14267a(t, m50955L & 1048575));
                            continue;
                        case 49:
                            iu8.mo13317r(this.f71254n.mo14267a(t, m50955L & 1048575), m50936r(m50948S), c17551e);
                            continue;
                        case 50:
                            Object m50963D = m50963D(m50948S);
                            long m50955L2 = m50955L(m50948S) & 1048575;
                            Object m85273F = SZ8.m85273F(t, m50955L2);
                            if (m85273F == null) {
                                m85273F = this.f71257q.zzf(m50963D);
                                SZ8.m85254j(t, m50955L2, m85273F);
                            } else if (this.f71257q.mo14231a(m85273F)) {
                                Object zzf = this.f71257q.zzf(m50963D);
                                this.f71257q.mo14229c(zzf, m85273F);
                                SZ8.m85254j(t, m50955L2, zzf);
                                m85273F = zzf;
                            }
                            Map<?, ?> zza2 = this.f71257q.zza(m85273F);
                            this.f71257q.zzb(m50963D);
                            iu8.mo13356F(zza2, null, c17551e);
                            continue;
                        case 51:
                            SZ8.m85254j(t, m50955L & 1048575, Double.valueOf(iu8.zzd()));
                            m50961F(t, zza, m50948S);
                            continue;
                        case 52:
                            SZ8.m85254j(t, m50955L & 1048575, Float.valueOf(iu8.zze()));
                            m50961F(t, zza, m50948S);
                            continue;
                        case 53:
                            SZ8.m85254j(t, m50955L & 1048575, Long.valueOf(iu8.zzg()));
                            m50961F(t, zza, m50948S);
                            continue;
                        case 54:
                            SZ8.m85254j(t, m50955L & 1048575, Long.valueOf(iu8.mo13311x()));
                            m50961F(t, zza, m50948S);
                            continue;
                        case 55:
                            SZ8.m85254j(t, m50955L & 1048575, Integer.valueOf(iu8.zzh()));
                            m50961F(t, zza, m50948S);
                            continue;
                        case 56:
                            SZ8.m85254j(t, m50955L & 1048575, Long.valueOf(iu8.zzi()));
                            m50961F(t, zza, m50948S);
                            continue;
                        case 57:
                            SZ8.m85254j(t, m50955L & 1048575, Integer.valueOf(iu8.mo13332c()));
                            m50961F(t, zza, m50948S);
                            continue;
                        case 58:
                            SZ8.m85254j(t, m50955L & 1048575, Boolean.valueOf(iu8.mo13335a()));
                            m50961F(t, zza, m50948S);
                            continue;
                        case 59:
                            m50934t(t, m50955L, iu8);
                            m50961F(t, zza, m50948S);
                            continue;
                        case 60:
                            if (m50929y(t, zza, m50948S)) {
                                long j3 = m50955L & 1048575;
                                SZ8.m85254j(t, j3, C52124yI8.m3690e(SZ8.m85273F(t, j3), iu8.mo13354H(m50936r(m50948S), c17551e)));
                            } else {
                                SZ8.m85254j(t, m50955L & 1048575, iu8.mo13354H(m50936r(m50948S), c17551e));
                                m50962E(t, m50948S);
                            }
                            m50961F(t, zza, m50948S);
                            continue;
                        case 61:
                            SZ8.m85254j(t, m50955L & 1048575, iu8.mo13330e());
                            m50961F(t, zza, m50948S);
                            continue;
                        case 62:
                            SZ8.m85254j(t, m50955L & 1048575, Integer.valueOf(iu8.mo13329f()));
                            m50961F(t, zza, m50948S);
                            continue;
                        case 63:
                            int mo13331d2 = iu8.mo13331d();
                            KI8 m50957J2 = m50957J(m50948S);
                            if (m50957J2 != null && !m50957J2.zza(mo13331d2)) {
                                obj = UU8.m81425f(zza, mo13331d2, obj, abstractC41003fY8);
                                break;
                            }
                            SZ8.m85254j(t, m50955L & 1048575, Integer.valueOf(mo13331d2));
                            m50961F(t, zza, m50948S);
                            continue;
                        case 64:
                            SZ8.m85254j(t, m50955L & 1048575, Integer.valueOf(iu8.mo13327h()));
                            m50961F(t, zza, m50948S);
                            continue;
                        case 65:
                            SZ8.m85254j(t, m50955L & 1048575, Long.valueOf(iu8.mo13324k()));
                            m50961F(t, zza, m50948S);
                            continue;
                        case 66:
                            SZ8.m85254j(t, m50955L & 1048575, Integer.valueOf(iu8.zzs()));
                            m50961F(t, zza, m50948S);
                            continue;
                        case 67:
                            SZ8.m85254j(t, m50955L & 1048575, Long.valueOf(iu8.mo13328g()));
                            m50961F(t, zza, m50948S);
                            continue;
                        case 68:
                            SZ8.m85254j(t, m50955L & 1048575, iu8.mo13355G(m50936r(m50948S), c17551e));
                            m50961F(t, zza, m50948S);
                            continue;
                        default:
                            if (obj == null) {
                                try {
                                    obj = abstractC41003fY8.mo41197a();
                                } catch (zzjn unused) {
                                    abstractC41003fY8.mo41188j(iu8);
                                    if (obj == null) {
                                        obj = abstractC41003fY8.mo41183o(t);
                                    }
                                    if (!abstractC41003fY8.m41189i(obj, iu8)) {
                                        for (int i = this.f71251k; i < this.f71252l; i++) {
                                            obj = m50939o(t, this.f71250j[i], obj, abstractC41003fY8);
                                        }
                                        if (obj != null) {
                                            abstractC41003fY8.mo41185m(t, obj);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!abstractC41003fY8.m41189i(obj, iu8)) {
                                for (int i2 = this.f71251k; i2 < this.f71252l; i2++) {
                                    obj = m50939o(t, this.f71250j[i2], obj, abstractC41003fY8);
                                }
                                if (obj != null) {
                                    abstractC41003fY8.mo41185m(t, obj);
                                    return;
                                }
                                return;
                            }
                            continue;
                    }
                } else if (zza == Integer.MAX_VALUE) {
                    for (int i3 = this.f71251k; i3 < this.f71252l; i3++) {
                        obj = m50939o(t, this.f71250j[i3], obj, abstractC41003fY8);
                    }
                    if (obj != null) {
                        abstractC41003fY8.mo41185m(t, obj);
                        return;
                    }
                    return;
                } else {
                    Object mo8969b = !this.f71246f ? null : abstractC50309vE8.mo8969b(c17551e, this.f71245e, zza);
                    if (mo8969b != null) {
                        if (c47355qF8 == null) {
                            c47355qF8 = abstractC50309vE8.mo8962i(t);
                        }
                        C47355qF8<?> c47355qF82 = c47355qF8;
                        obj = abstractC50309vE8.mo8968c(iu8, mo8969b, c17551e, c47355qF82, obj, abstractC41003fY8);
                        c47355qF8 = c47355qF82;
                    } else {
                        abstractC41003fY8.mo41188j(iu8);
                        if (obj == null) {
                            obj = abstractC41003fY8.mo41183o(t);
                        }
                        if (!abstractC41003fY8.m41189i(obj, iu8)) {
                            for (int i4 = this.f71251k; i4 < this.f71252l; i4++) {
                                obj = m50939o(t, this.f71250j[i4], obj, abstractC41003fY8);
                            }
                            if (obj != null) {
                                abstractC41003fY8.mo41185m(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.f71251k; i5 < this.f71252l; i5++) {
                    obj = m50939o(t, this.f71250j[i5], obj, abstractC41003fY8);
                }
                if (obj != null) {
                    abstractC41003fY8.mo41185m(t, obj);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02d1, code lost:
        if (r0 == r5) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d5, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r18;
        r10 = r20;
        r1 = r25;
        r6 = r27;
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x031a, code lost:
        if (r0 == r15) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x033d, code lost:
        if (r0 == r15) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x033f, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    @Override // p000.InterfaceC52825zU8
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1310e(T t, byte[] bArr, int i, int i2, C41844gx8 c41844gx8) throws IOException {
        byte b;
        int i3;
        int m50948S;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Unsafe unsafe2;
        int i13;
        int i14;
        Unsafe unsafe3;
        Unsafe unsafe4;
        C17561H<T> c17561h = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i15 = i2;
        C41844gx8 c41844gx82 = c41844gx8;
        if (c17561h.f71248h) {
            Unsafe unsafe5 = f71240s;
            int i16 = -1;
            int i17 = 1048575;
            int i18 = i;
            int i19 = 1048575;
            int i20 = -1;
            int i21 = 0;
            int i22 = 0;
            while (i18 < i15) {
                int i23 = i18 + 1;
                byte b2 = bArr2[i18];
                if (b2 < 0) {
                    i3 = C17550D.m51012d(b2, bArr2, i23, c41844gx82);
                    b = c41844gx82.f84540a;
                } else {
                    b = b2;
                    i3 = i23;
                }
                int i24 = b >>> 3;
                int i25 = b & 7;
                if (i24 > i20) {
                    m50948S = c17561h.m50947g(i24, i21 / 3);
                } else {
                    m50948S = c17561h.m50948S(i24);
                }
                int i26 = m50948S;
                if (i26 == i16) {
                    i4 = i3;
                    i5 = i24;
                    unsafe = unsafe5;
                    i6 = i16;
                    i7 = 0;
                } else {
                    int[] iArr = c17561h.f71241a;
                    int i27 = iArr[i26 + 1];
                    int i28 = (i27 & 267386880) >>> 20;
                    Unsafe unsafe6 = unsafe5;
                    long j = i27 & i17;
                    if (i28 <= 17) {
                        int i29 = iArr[i26 + 2];
                        int i30 = 1 << (i29 >>> 20);
                        int i31 = i29 & 1048575;
                        if (i31 != i19) {
                            if (i19 != 1048575) {
                                long j2 = i19;
                                unsafe4 = unsafe6;
                                unsafe4.putInt(t2, j2, i22);
                            } else {
                                unsafe4 = unsafe6;
                            }
                            if (i31 != 1048575) {
                                i22 = unsafe4.getInt(t2, i31);
                            }
                            unsafe2 = unsafe4;
                            i19 = i31;
                        } else {
                            unsafe2 = unsafe6;
                        }
                        switch (i28) {
                            case 0:
                                i5 = i24;
                                i9 = 1048575;
                                i13 = i26;
                                i14 = i3;
                                i8 = i19;
                                unsafe3 = unsafe2;
                                if (i25 != 1) {
                                    i4 = i14;
                                    unsafe = unsafe3;
                                    i7 = i13;
                                    i19 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    SZ8.m85258f(t2, j, C17550D.m51003m(bArr2, i14));
                                    i18 = i14 + 8;
                                    i22 |= i30;
                                    unsafe5 = unsafe3;
                                    i21 = i13;
                                    break;
                                }
                            case 1:
                                i5 = i24;
                                i9 = 1048575;
                                i13 = i26;
                                i14 = i3;
                                i8 = i19;
                                unsafe3 = unsafe2;
                                if (i25 != 5) {
                                    i4 = i14;
                                    unsafe = unsafe3;
                                    i7 = i13;
                                    i19 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    SZ8.m85257g(t2, j, C17550D.m51001o(bArr2, i14));
                                    i18 = i14 + 4;
                                    i22 |= i30;
                                    unsafe5 = unsafe3;
                                    i21 = i13;
                                    break;
                                }
                            case 2:
                            case 3:
                                i5 = i24;
                                i9 = 1048575;
                                i13 = i26;
                                i14 = i3;
                                i8 = i19;
                                unsafe3 = unsafe2;
                                if (i25 != 0) {
                                    i4 = i14;
                                    unsafe = unsafe3;
                                    i7 = i13;
                                    i19 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    int m51005k = C17550D.m51005k(bArr2, i14, c41844gx82);
                                    unsafe3.putLong(t, j, c41844gx82.f84541b);
                                    i22 |= i30;
                                    unsafe5 = unsafe3;
                                    i21 = i13;
                                    i18 = m51005k;
                                    break;
                                }
                            case 4:
                            case 11:
                                i5 = i24;
                                i9 = 1048575;
                                i13 = i26;
                                i14 = i3;
                                i8 = i19;
                                unsafe3 = unsafe2;
                                if (i25 != 0) {
                                    i4 = i14;
                                    unsafe = unsafe3;
                                    i7 = i13;
                                    i19 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    i18 = C17550D.m51007i(bArr2, i14, c41844gx82);
                                    unsafe3.putInt(t2, j, c41844gx82.f84540a);
                                    i22 |= i30;
                                    unsafe5 = unsafe3;
                                    i21 = i13;
                                    break;
                                }
                            case 5:
                            case 14:
                                i5 = i24;
                                i9 = 1048575;
                                i13 = i26;
                                i8 = i19;
                                unsafe3 = unsafe2;
                                if (i25 != 1) {
                                    i14 = i3;
                                    i4 = i14;
                                    unsafe = unsafe3;
                                    i7 = i13;
                                    i19 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    unsafe3.putLong(t, j, C17550D.m51004l(bArr2, i3));
                                    i18 = i3 + 8;
                                    i22 |= i30;
                                    unsafe5 = unsafe3;
                                    i21 = i13;
                                    break;
                                }
                            case 6:
                            case 13:
                                i5 = i24;
                                i9 = 1048575;
                                i13 = i26;
                                i8 = i19;
                                unsafe3 = unsafe2;
                                if (i25 != 5) {
                                    i14 = i3;
                                    i4 = i14;
                                    unsafe = unsafe3;
                                    i7 = i13;
                                    i19 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    unsafe3.putInt(t2, j, C17550D.m51008h(bArr2, i3));
                                    i18 = i3 + 4;
                                    i22 |= i30;
                                    unsafe5 = unsafe3;
                                    i21 = i13;
                                    break;
                                }
                            case 7:
                                i5 = i24;
                                i9 = 1048575;
                                i13 = i26;
                                i8 = i19;
                                unsafe3 = unsafe2;
                                if (i25 != 0) {
                                    i14 = i3;
                                    i4 = i14;
                                    unsafe = unsafe3;
                                    i7 = i13;
                                    i19 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    i18 = C17550D.m51005k(bArr2, i3, c41844gx82);
                                    SZ8.m85253k(t2, j, c41844gx82.f84541b != 0);
                                    i22 |= i30;
                                    unsafe5 = unsafe3;
                                    i21 = i13;
                                    break;
                                }
                            case 8:
                                i5 = i24;
                                i9 = 1048575;
                                i13 = i26;
                                i8 = i19;
                                unsafe3 = unsafe2;
                                if (i25 != 2) {
                                    i14 = i3;
                                    i4 = i14;
                                    unsafe = unsafe3;
                                    i7 = i13;
                                    i19 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    if ((i27 & 536870912) == 0) {
                                        i18 = C17550D.m51002n(bArr2, i3, c41844gx82);
                                    } else {
                                        i18 = C17550D.m51000p(bArr2, i3, c41844gx82);
                                    }
                                    unsafe3.putObject(t2, j, c41844gx82.f84542c);
                                    i22 |= i30;
                                    unsafe5 = unsafe3;
                                    i21 = i13;
                                    break;
                                }
                            case 9:
                                i5 = i24;
                                i9 = 1048575;
                                i13 = i26;
                                i8 = i19;
                                unsafe3 = unsafe2;
                                if (i25 != 2) {
                                    i14 = i3;
                                    i4 = i14;
                                    unsafe = unsafe3;
                                    i7 = i13;
                                    i19 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    i18 = C17550D.m51009g(c17561h.m50936r(i13), bArr2, i3, i15, c41844gx82);
                                    Object object = unsafe3.getObject(t2, j);
                                    if (object == null) {
                                        unsafe3.putObject(t2, j, c41844gx82.f84542c);
                                    } else {
                                        unsafe3.putObject(t2, j, C52124yI8.m3690e(object, c41844gx82.f84542c));
                                    }
                                    i22 |= i30;
                                    unsafe5 = unsafe3;
                                    i21 = i13;
                                    break;
                                }
                            case 10:
                                i5 = i24;
                                i9 = 1048575;
                                i13 = i26;
                                i8 = i19;
                                unsafe3 = unsafe2;
                                if (i25 != 2) {
                                    i14 = i3;
                                    i4 = i14;
                                    unsafe = unsafe3;
                                    i7 = i13;
                                    i19 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    i18 = C17550D.m50999q(bArr2, i3, c41844gx82);
                                    unsafe3.putObject(t2, j, c41844gx82.f84542c);
                                    i22 |= i30;
                                    unsafe5 = unsafe3;
                                    i21 = i13;
                                    break;
                                }
                            case 12:
                                i5 = i24;
                                i9 = 1048575;
                                i13 = i26;
                                i8 = i19;
                                unsafe3 = unsafe2;
                                if (i25 != 0) {
                                    i14 = i3;
                                    i4 = i14;
                                    unsafe = unsafe3;
                                    i7 = i13;
                                    i19 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    i18 = C17550D.m51007i(bArr2, i3, c41844gx82);
                                    unsafe3.putInt(t2, j, c41844gx82.f84540a);
                                    i22 |= i30;
                                    unsafe5 = unsafe3;
                                    i21 = i13;
                                    break;
                                }
                            case 15:
                                i5 = i24;
                                i9 = 1048575;
                                i13 = i26;
                                i8 = i19;
                                unsafe3 = unsafe2;
                                if (i25 != 0) {
                                    i14 = i3;
                                    i4 = i14;
                                    unsafe = unsafe3;
                                    i7 = i13;
                                    i19 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    i18 = C17550D.m51007i(bArr2, i3, c41844gx82);
                                    unsafe3.putInt(t2, j, WB8.m78738k(c41844gx82.f84540a));
                                    i22 |= i30;
                                    unsafe5 = unsafe3;
                                    i21 = i13;
                                    break;
                                }
                            case 16:
                                if (i25 != 0) {
                                    i5 = i24;
                                    i8 = i19;
                                    unsafe3 = unsafe2;
                                    i14 = i3;
                                    i13 = i26;
                                    i4 = i14;
                                    unsafe = unsafe3;
                                    i7 = i13;
                                    i19 = i8;
                                    i6 = -1;
                                    break;
                                } else {
                                    int m51005k2 = C17550D.m51005k(bArr2, i3, c41844gx82);
                                    i8 = i19;
                                    i5 = i24;
                                    i9 = 1048575;
                                    unsafe2.putLong(t, j, WB8.m78740b(c41844gx82.f84541b));
                                    i22 |= i30;
                                    unsafe5 = unsafe2;
                                    i21 = i26;
                                    i18 = m51005k2;
                                    break;
                                }
                            default:
                                i5 = i24;
                                i13 = i26;
                                i14 = i3;
                                i8 = i19;
                                unsafe3 = unsafe2;
                                i4 = i14;
                                unsafe = unsafe3;
                                i7 = i13;
                                i19 = i8;
                                i6 = -1;
                                break;
                        }
                        i19 = i8;
                        i20 = i5;
                        i17 = i9;
                        i16 = -1;
                    } else {
                        i5 = i24;
                        int i32 = i3;
                        i8 = i19;
                        i9 = 1048575;
                        if (i28 != 27) {
                            i7 = i26;
                            if (i28 <= 49) {
                                i11 = i22;
                                i12 = i8;
                                unsafe = unsafe6;
                                i6 = -1;
                                i18 = m50945i(t, bArr, i32, i2, b, i5, i25, i7, i27, i28, j, c41844gx8);
                            } else {
                                i10 = i32;
                                i11 = i22;
                                unsafe = unsafe6;
                                i12 = i8;
                                i6 = -1;
                                if (i28 != 50) {
                                    i18 = m50946h(t, bArr, i10, i2, b, i5, i25, i27, i28, j, i7, c41844gx8);
                                } else if (i25 == 2) {
                                    i18 = m50944j(t, bArr, i10, i2, i7, j, c41844gx8);
                                }
                            }
                            unsafe5 = unsafe;
                            i17 = 1048575;
                        } else if (i25 == 2) {
                            RJ8 rj8 = (RJ8) unsafe6.getObject(t2, j);
                            if (!rj8.zza()) {
                                int size = rj8.size();
                                rj8 = rj8.zza(size == 0 ? 10 : size << 1);
                                unsafe6.putObject(t2, j, rj8);
                            }
                            i18 = C17550D.m51011e(c17561h.m50936r(i26), b, bArr, i32, i2, rj8, c41844gx8);
                            unsafe5 = unsafe6;
                            i22 = i22;
                            i21 = i26;
                            i19 = i8;
                            i20 = i5;
                            i17 = i9;
                            i16 = -1;
                        } else {
                            i7 = i26;
                            i10 = i32;
                            i11 = i22;
                            unsafe = unsafe6;
                            i12 = i8;
                            i6 = -1;
                        }
                        i4 = i10;
                        i22 = i11;
                        i19 = i12;
                    }
                }
                i18 = C17550D.m51013c(b, bArr, i4, i2, m50951P(t), c41844gx8);
                c17561h = this;
                t2 = t;
                bArr2 = bArr;
                i15 = i2;
                c41844gx82 = c41844gx8;
                i21 = i7;
                i16 = i6;
                i20 = i5;
                unsafe5 = unsafe;
                i17 = 1048575;
            }
            int i33 = i22;
            Unsafe unsafe7 = unsafe5;
            if (i19 != i17) {
                unsafe7.putInt(t, i19, i33);
            }
            if (i18 != i2) {
                throw zzjk.m50758g();
            }
            return;
        }
        m50943k(t, bArr, i, i2, 0, c41844gx8);
    }

    @Override // p000.InterfaceC52825zU8
    /* renamed from: f */
    public final void mo1309f(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f71241a.length; i += 3) {
            int m50955L = m50955L(i);
            long j = 1048575 & m50955L;
            int i2 = this.f71241a[i];
            switch ((m50955L & 267386880) >>> 20) {
                case 0:
                    if (m50930x(t2, i)) {
                        SZ8.m85258f(t, j, SZ8.m85276C(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m50930x(t2, i)) {
                        SZ8.m85257g(t, j, SZ8.m85240x(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m50930x(t2, i)) {
                        SZ8.m85255i(t, j, SZ8.m85249o(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m50930x(t2, i)) {
                        SZ8.m85255i(t, j, SZ8.m85249o(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m50930x(t2, i)) {
                        SZ8.m85256h(t, j, SZ8.m85262b(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m50930x(t2, i)) {
                        SZ8.m85255i(t, j, SZ8.m85249o(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m50930x(t2, i)) {
                        SZ8.m85256h(t, j, SZ8.m85262b(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m50930x(t2, i)) {
                        SZ8.m85253k(t, j, SZ8.m85241w(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m50930x(t2, i)) {
                        SZ8.m85254j(t, j, SZ8.m85273F(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m50933u(t, t2, i);
                    break;
                case 10:
                    if (m50930x(t2, i)) {
                        SZ8.m85254j(t, j, SZ8.m85273F(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m50930x(t2, i)) {
                        SZ8.m85256h(t, j, SZ8.m85262b(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m50930x(t2, i)) {
                        SZ8.m85256h(t, j, SZ8.m85262b(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m50930x(t2, i)) {
                        SZ8.m85256h(t, j, SZ8.m85262b(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m50930x(t2, i)) {
                        SZ8.m85255i(t, j, SZ8.m85249o(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m50930x(t2, i)) {
                        SZ8.m85256h(t, j, SZ8.m85262b(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m50930x(t2, i)) {
                        SZ8.m85255i(t, j, SZ8.m85249o(t2, j));
                        m50962E(t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m50933u(t, t2, i);
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
                    this.f71254n.mo14266c(t, t2, j);
                    break;
                case 50:
                    UU8.m81416o(this.f71257q, t, t2, j);
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
                    if (m50929y(t2, i2, i)) {
                        SZ8.m85254j(t, j, SZ8.m85273F(t2, j));
                        m50961F(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m50960G(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m50929y(t2, i2, i)) {
                        SZ8.m85254j(t, j, SZ8.m85273F(t2, j));
                        m50961F(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m50960G(t, t2, i);
                    break;
            }
        }
        UU8.m81415p(this.f71255o, t, t2);
        if (this.f71246f) {
            UU8.m81417n(this.f71256p, t, t2);
        }
    }

    /* renamed from: g */
    public final int m50947g(int i, int i2) {
        if (i >= this.f71243c && i <= this.f71244d) {
            return m50964C(i, i2);
        }
        return -1;
    }

    /* renamed from: h */
    public final int m50946h(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C41844gx8 c41844gx8) throws IOException {
        int m51005k;
        Unsafe unsafe = f71240s;
        long j2 = this.f71241a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(C17550D.m51003m(bArr, i)));
                    m51005k = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return m51005k;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(C17550D.m51001o(bArr, i)));
                    m51005k = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return m51005k;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    m51005k = C17550D.m51005k(bArr, i, c41844gx8);
                    unsafe.putObject(t, j, Long.valueOf(c41844gx8.f84541b));
                    unsafe.putInt(t, j2, i4);
                    return m51005k;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    m51005k = C17550D.m51007i(bArr, i, c41844gx8);
                    unsafe.putObject(t, j, Integer.valueOf(c41844gx8.f84540a));
                    unsafe.putInt(t, j2, i4);
                    return m51005k;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(C17550D.m51004l(bArr, i)));
                    m51005k = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return m51005k;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(C17550D.m51008h(bArr, i)));
                    m51005k = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return m51005k;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    m51005k = C17550D.m51005k(bArr, i, c41844gx8);
                    unsafe.putObject(t, j, Boolean.valueOf(c41844gx8.f84541b != 0));
                    unsafe.putInt(t, j2, i4);
                    return m51005k;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int m51007i = C17550D.m51007i(bArr, i, c41844gx8);
                    int i9 = c41844gx8.f84540a;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !C49582u09.m11097g(bArr, m51007i, m51007i + i9)) {
                        throw zzjk.m50757h();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, m51007i, i9, C52124yI8.f119325a));
                        m51007i += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return m51007i;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int m51009g = C17550D.m51009g(m50936r(i8), bArr, i, i2, c41844gx8);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, c41844gx8.f84542c);
                    } else {
                        unsafe.putObject(t, j, C52124yI8.m3690e(object, c41844gx8.f84542c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return m51009g;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    m51005k = C17550D.m50999q(bArr, i, c41844gx8);
                    unsafe.putObject(t, j, c41844gx8.f84542c);
                    unsafe.putInt(t, j2, i4);
                    return m51005k;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int m51007i2 = C17550D.m51007i(bArr, i, c41844gx8);
                    int i10 = c41844gx8.f84540a;
                    KI8 m50957J = m50957J(i8);
                    if (m50957J != null && !m50957J.zza(i10)) {
                        m50951P(t).m103756c(i3, Long.valueOf(i10));
                        return m51007i2;
                    }
                    unsafe.putObject(t, j, Integer.valueOf(i10));
                    m51005k = m51007i2;
                    unsafe.putInt(t, j2, i4);
                    return m51005k;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    m51005k = C17550D.m51007i(bArr, i, c41844gx8);
                    unsafe.putObject(t, j, Integer.valueOf(WB8.m78738k(c41844gx8.f84540a)));
                    unsafe.putInt(t, j2, i4);
                    return m51005k;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    m51005k = C17550D.m51005k(bArr, i, c41844gx8);
                    unsafe.putObject(t, j, Long.valueOf(WB8.m78740b(c41844gx8.f84541b)));
                    unsafe.putInt(t, j2, i4);
                    return m51005k;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    m51005k = C17550D.m51010f(m50936r(i8), bArr, i, i2, (i3 & (-8)) | 4, c41844gx8);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, c41844gx8.f84542c);
                    } else {
                        unsafe.putObject(t, j, C52124yI8.m3690e(object2, c41844gx8.f84542c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return m51005k;
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
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m50945i(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C41844gx8 c41844gx8) throws IOException {
        int m51007i;
        int i8;
        int i9 = i;
        Unsafe unsafe = f71240s;
        RJ8 rj8 = (RJ8) unsafe.getObject(t, j2);
        if (!rj8.zza()) {
            int size = rj8.size();
            rj8 = rj8.zza(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j2, rj8);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    MD8 md8 = (MD8) rj8;
                    int m51007i2 = C17550D.m51007i(bArr, i9, c41844gx8);
                    int i10 = c41844gx8.f84540a + m51007i2;
                    while (m51007i2 < i10) {
                        md8.m95488b(C17550D.m51003m(bArr, m51007i2));
                        m51007i2 += 8;
                    }
                    if (m51007i2 == i10) {
                        return m51007i2;
                    }
                    throw zzjk.m50764a();
                }
                if (i5 == 1) {
                    MD8 md82 = (MD8) rj8;
                    md82.m95488b(C17550D.m51003m(bArr, i));
                    while (true) {
                        int i11 = i9 + 8;
                        if (i11 >= i2) {
                            return i11;
                        }
                        i9 = C17550D.m51007i(bArr, i11, c41844gx8);
                        if (i3 != c41844gx8.f84540a) {
                            return i11;
                        }
                        md82.m95488b(C17550D.m51003m(bArr, i9));
                    }
                }
                return i9;
            case 19:
            case 36:
                if (i5 == 2) {
                    C48558sH8 c48558sH8 = (C48558sH8) rj8;
                    int m51007i3 = C17550D.m51007i(bArr, i9, c41844gx8);
                    int i12 = c41844gx8.f84540a + m51007i3;
                    while (m51007i3 < i12) {
                        c48558sH8.m14482b(C17550D.m51001o(bArr, m51007i3));
                        m51007i3 += 4;
                    }
                    if (m51007i3 == i12) {
                        return m51007i3;
                    }
                    throw zzjk.m50764a();
                }
                if (i5 == 5) {
                    C48558sH8 c48558sH82 = (C48558sH8) rj8;
                    c48558sH82.m14482b(C17550D.m51001o(bArr, i));
                    while (true) {
                        int i13 = i9 + 4;
                        if (i13 >= i2) {
                            return i13;
                        }
                        i9 = C17550D.m51007i(bArr, i13, c41844gx8);
                        if (i3 != c41844gx8.f84540a) {
                            return i13;
                        }
                        c48558sH82.m14482b(C17550D.m51001o(bArr, i9));
                    }
                }
                return i9;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    PM8 pm8 = (PM8) rj8;
                    int m51007i4 = C17550D.m51007i(bArr, i9, c41844gx8);
                    int i14 = c41844gx8.f84540a + m51007i4;
                    while (m51007i4 < i14) {
                        m51007i4 = C17550D.m51005k(bArr, m51007i4, c41844gx8);
                        pm8.m90369b(c41844gx8.f84541b);
                    }
                    if (m51007i4 == i14) {
                        return m51007i4;
                    }
                    throw zzjk.m50764a();
                }
                if (i5 == 0) {
                    PM8 pm82 = (PM8) rj8;
                    int m51005k = C17550D.m51005k(bArr, i9, c41844gx8);
                    pm82.m90369b(c41844gx8.f84541b);
                    while (m51005k < i2) {
                        int m51007i5 = C17550D.m51007i(bArr, m51005k, c41844gx8);
                        if (i3 != c41844gx8.f84540a) {
                            return m51005k;
                        }
                        m51005k = C17550D.m51005k(bArr, m51007i5, c41844gx8);
                        pm82.m90369b(c41844gx8.f84541b);
                    }
                    return m51005k;
                }
                return i9;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C17550D.m51006j(bArr, i9, rj8, c41844gx8);
                }
                if (i5 == 0) {
                    return C17550D.m51014b(i3, bArr, i, i2, rj8, c41844gx8);
                }
                return i9;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    PM8 pm83 = (PM8) rj8;
                    int m51007i6 = C17550D.m51007i(bArr, i9, c41844gx8);
                    int i15 = c41844gx8.f84540a + m51007i6;
                    while (m51007i6 < i15) {
                        pm83.m90369b(C17550D.m51004l(bArr, m51007i6));
                        m51007i6 += 8;
                    }
                    if (m51007i6 == i15) {
                        return m51007i6;
                    }
                    throw zzjk.m50764a();
                }
                if (i5 == 1) {
                    PM8 pm84 = (PM8) rj8;
                    pm84.m90369b(C17550D.m51004l(bArr, i));
                    while (true) {
                        int i16 = i9 + 8;
                        if (i16 >= i2) {
                            return i16;
                        }
                        i9 = C17550D.m51007i(bArr, i16, c41844gx8);
                        if (i3 != c41844gx8.f84540a) {
                            return i16;
                        }
                        pm84.m90369b(C17550D.m51004l(bArr, i9));
                    }
                }
                return i9;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    C37877aI8 c37877aI8 = (C37877aI8) rj8;
                    int m51007i7 = C17550D.m51007i(bArr, i9, c41844gx8);
                    int i17 = c41844gx8.f84540a + m51007i7;
                    while (m51007i7 < i17) {
                        c37877aI8.m71672c(C17550D.m51008h(bArr, m51007i7));
                        m51007i7 += 4;
                    }
                    if (m51007i7 == i17) {
                        return m51007i7;
                    }
                    throw zzjk.m50764a();
                }
                if (i5 == 5) {
                    C37877aI8 c37877aI82 = (C37877aI8) rj8;
                    c37877aI82.m71672c(C17550D.m51008h(bArr, i));
                    while (true) {
                        int i18 = i9 + 4;
                        if (i18 >= i2) {
                            return i18;
                        }
                        i9 = C17550D.m51007i(bArr, i18, c41844gx8);
                        if (i3 != c41844gx8.f84540a) {
                            return i18;
                        }
                        c37877aI82.m71672c(C17550D.m51008h(bArr, i9));
                    }
                }
                return i9;
            case 25:
            case 42:
                if (i5 == 2) {
                    C38872by8 c38872by8 = (C38872by8) rj8;
                    m51007i = C17550D.m51007i(bArr, i9, c41844gx8);
                    int i19 = c41844gx8.f84540a + m51007i;
                    while (m51007i < i19) {
                        m51007i = C17550D.m51005k(bArr, m51007i, c41844gx8);
                        c38872by8.m62062b(c41844gx8.f84541b != 0);
                    }
                    if (m51007i != i19) {
                        throw zzjk.m50764a();
                    }
                    return m51007i;
                }
                if (i5 == 0) {
                    C38872by8 c38872by82 = (C38872by8) rj8;
                    i9 = C17550D.m51005k(bArr, i9, c41844gx8);
                    c38872by82.m62062b(c41844gx8.f84541b != 0);
                    while (i9 < i2) {
                        int m51007i8 = C17550D.m51007i(bArr, i9, c41844gx8);
                        if (i3 == c41844gx8.f84540a) {
                            i9 = C17550D.m51005k(bArr, m51007i8, c41844gx8);
                            c38872by82.m62062b(c41844gx8.f84541b != 0);
                        }
                    }
                }
                return i9;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int m51007i9 = C17550D.m51007i(bArr, i9, c41844gx8);
                        int i20 = c41844gx8.f84540a;
                        if (i20 >= 0) {
                            if (i20 == 0) {
                                rj8.add("");
                                while (m51007i9 < i2) {
                                    int m51007i10 = C17550D.m51007i(bArr, m51007i9, c41844gx8);
                                    if (i3 != c41844gx8.f84540a) {
                                        return m51007i9;
                                    }
                                    m51007i9 = C17550D.m51007i(bArr, m51007i10, c41844gx8);
                                    i20 = c41844gx8.f84540a;
                                    if (i20 < 0) {
                                        throw zzjk.m50763b();
                                    }
                                    if (i20 == 0) {
                                        rj8.add("");
                                    } else {
                                        rj8.add(new String(bArr, m51007i9, i20, C52124yI8.f119325a));
                                        m51007i9 += i20;
                                        while (m51007i9 < i2) {
                                        }
                                    }
                                }
                                return m51007i9;
                            }
                            rj8.add(new String(bArr, m51007i9, i20, C52124yI8.f119325a));
                            m51007i9 += i20;
                            while (m51007i9 < i2) {
                            }
                            return m51007i9;
                        }
                        throw zzjk.m50763b();
                    }
                    int m51007i11 = C17550D.m51007i(bArr, i9, c41844gx8);
                    int i21 = c41844gx8.f84540a;
                    if (i21 >= 0) {
                        if (i21 == 0) {
                            rj8.add("");
                            while (m51007i11 < i2) {
                                int m51007i12 = C17550D.m51007i(bArr, m51007i11, c41844gx8);
                                if (i3 != c41844gx8.f84540a) {
                                    return m51007i11;
                                }
                                m51007i11 = C17550D.m51007i(bArr, m51007i12, c41844gx8);
                                int i22 = c41844gx8.f84540a;
                                if (i22 < 0) {
                                    throw zzjk.m50763b();
                                }
                                if (i22 == 0) {
                                    rj8.add("");
                                } else {
                                    i8 = m51007i11 + i22;
                                    if (C49582u09.m11097g(bArr, m51007i11, i8)) {
                                        rj8.add(new String(bArr, m51007i11, i22, C52124yI8.f119325a));
                                        m51007i11 = i8;
                                        while (m51007i11 < i2) {
                                        }
                                    } else {
                                        throw zzjk.m50757h();
                                    }
                                }
                            }
                            return m51007i11;
                        }
                        i8 = m51007i11 + i21;
                        if (C49582u09.m11097g(bArr, m51007i11, i8)) {
                            rj8.add(new String(bArr, m51007i11, i21, C52124yI8.f119325a));
                            m51007i11 = i8;
                            while (m51007i11 < i2) {
                            }
                            return m51007i11;
                        }
                        throw zzjk.m50757h();
                    }
                    throw zzjk.m50763b();
                }
                return i9;
            case 27:
                if (i5 == 2) {
                    return C17550D.m51011e(m50936r(i6), i3, bArr, i, i2, rj8, c41844gx8);
                }
                return i9;
            case 28:
                if (i5 == 2) {
                    int m51007i13 = C17550D.m51007i(bArr, i9, c41844gx8);
                    int i23 = c41844gx8.f84540a;
                    if (i23 >= 0) {
                        if (i23 <= bArr.length - m51007i13) {
                            if (i23 == 0) {
                                rj8.add(AbstractC53119zy8.f122544c);
                                while (m51007i13 < i2) {
                                    int m51007i14 = C17550D.m51007i(bArr, m51007i13, c41844gx8);
                                    if (i3 != c41844gx8.f84540a) {
                                        return m51007i13;
                                    }
                                    m51007i13 = C17550D.m51007i(bArr, m51007i14, c41844gx8);
                                    i23 = c41844gx8.f84540a;
                                    if (i23 >= 0) {
                                        if (i23 > bArr.length - m51007i13) {
                                            throw zzjk.m50764a();
                                        }
                                        if (i23 == 0) {
                                            rj8.add(AbstractC53119zy8.f122544c);
                                        } else {
                                            rj8.add(AbstractC53119zy8.m37s(bArr, m51007i13, i23));
                                            m51007i13 += i23;
                                            while (m51007i13 < i2) {
                                            }
                                        }
                                    } else {
                                        throw zzjk.m50763b();
                                    }
                                }
                                return m51007i13;
                            }
                            rj8.add(AbstractC53119zy8.m37s(bArr, m51007i13, i23));
                            m51007i13 += i23;
                            while (m51007i13 < i2) {
                            }
                            return m51007i13;
                        }
                        throw zzjk.m50764a();
                    }
                    throw zzjk.m50763b();
                }
                return i9;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        m51007i = C17550D.m51014b(i3, bArr, i, i2, rj8, c41844gx8);
                    }
                    return i9;
                }
                m51007i = C17550D.m51006j(bArr, i9, rj8, c41844gx8);
                AbstractC17554G abstractC17554G = (AbstractC17554G) t;
                HY8 hy8 = abstractC17554G.zzb;
                if (hy8 == HY8.m103758a()) {
                    hy8 = null;
                }
                HY8 hy82 = (HY8) UU8.m81424g(i4, rj8, m50957J(i6), hy8, this.f71255o);
                if (hy82 != null) {
                    abstractC17554G.zzb = hy82;
                }
                return m51007i;
            case 33:
            case 47:
                if (i5 == 2) {
                    C37877aI8 c37877aI83 = (C37877aI8) rj8;
                    int m51007i15 = C17550D.m51007i(bArr, i9, c41844gx8);
                    int i24 = c41844gx8.f84540a + m51007i15;
                    while (m51007i15 < i24) {
                        m51007i15 = C17550D.m51007i(bArr, m51007i15, c41844gx8);
                        c37877aI83.m71672c(WB8.m78738k(c41844gx8.f84540a));
                    }
                    if (m51007i15 == i24) {
                        return m51007i15;
                    }
                    throw zzjk.m50764a();
                }
                if (i5 == 0) {
                    C37877aI8 c37877aI84 = (C37877aI8) rj8;
                    int m51007i16 = C17550D.m51007i(bArr, i9, c41844gx8);
                    c37877aI84.m71672c(WB8.m78738k(c41844gx8.f84540a));
                    while (m51007i16 < i2) {
                        int m51007i17 = C17550D.m51007i(bArr, m51007i16, c41844gx8);
                        if (i3 != c41844gx8.f84540a) {
                            return m51007i16;
                        }
                        m51007i16 = C17550D.m51007i(bArr, m51007i17, c41844gx8);
                        c37877aI84.m71672c(WB8.m78738k(c41844gx8.f84540a));
                    }
                    return m51007i16;
                }
                return i9;
            case 34:
            case 48:
                if (i5 == 2) {
                    PM8 pm85 = (PM8) rj8;
                    int m51007i18 = C17550D.m51007i(bArr, i9, c41844gx8);
                    int i25 = c41844gx8.f84540a + m51007i18;
                    while (m51007i18 < i25) {
                        m51007i18 = C17550D.m51005k(bArr, m51007i18, c41844gx8);
                        pm85.m90369b(WB8.m78740b(c41844gx8.f84541b));
                    }
                    if (m51007i18 == i25) {
                        return m51007i18;
                    }
                    throw zzjk.m50764a();
                }
                if (i5 == 0) {
                    PM8 pm86 = (PM8) rj8;
                    int m51005k2 = C17550D.m51005k(bArr, i9, c41844gx8);
                    pm86.m90369b(WB8.m78740b(c41844gx8.f84541b));
                    while (m51005k2 < i2) {
                        int m51007i19 = C17550D.m51007i(bArr, m51005k2, c41844gx8);
                        if (i3 != c41844gx8.f84540a) {
                            return m51005k2;
                        }
                        m51005k2 = C17550D.m51005k(bArr, m51007i19, c41844gx8);
                        pm86.m90369b(WB8.m78740b(c41844gx8.f84541b));
                    }
                    return m51005k2;
                }
                return i9;
            case 49:
                if (i5 == 3) {
                    InterfaceC52825zU8 m50936r = m50936r(i6);
                    int i26 = (i3 & (-8)) | 4;
                    i9 = C17550D.m51010f(m50936r, bArr, i, i2, i26, c41844gx8);
                    rj8.add(c41844gx8.f84542c);
                    while (i9 < i2) {
                        int m51007i20 = C17550D.m51007i(bArr, i9, c41844gx8);
                        if (i3 == c41844gx8.f84540a) {
                            i9 = C17550D.m51010f(m50936r, bArr, m51007i20, i2, i26, c41844gx8);
                            rj8.add(c41844gx8.f84542c);
                        }
                    }
                }
                return i9;
            default:
                return i9;
        }
    }

    /* renamed from: j */
    public final <K, V> int m50944j(T t, byte[] bArr, int i, int i2, int i3, long j, C41844gx8 c41844gx8) throws IOException {
        Unsafe unsafe = f71240s;
        Object m50963D = m50963D(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f71257q.mo14231a(object)) {
            Object zzf = this.f71257q.zzf(m50963D);
            this.f71257q.mo14229c(zzf, object);
            unsafe.putObject(t, j, zzf);
            object = zzf;
        }
        this.f71257q.zzb(m50963D);
        this.f71257q.zza(object);
        int m51007i = C17550D.m51007i(bArr, i, c41844gx8);
        int i4 = c41844gx8.f84540a;
        if (i4 >= 0 && i4 <= i2 - m51007i) {
            throw null;
        }
        throw zzjk.m50764a();
    }

    /* renamed from: k */
    public final int m50943k(T t, byte[] bArr, int i, int i2, int i3, C41844gx8 c41844gx8) throws IOException {
        Unsafe unsafe;
        int i4;
        int i5;
        T t2;
        C17561H<T> c17561h;
        int i6;
        int i7;
        byte b;
        int m50948S;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        int i13;
        T t3;
        byte[] bArr2;
        C41844gx8 c41844gx82;
        int i14;
        int i15;
        Object obj;
        Object m17728d;
        long j;
        int i16;
        int i17;
        int i18;
        boolean z2;
        int m51005k;
        int m50999q;
        T t4;
        int i19;
        int i20;
        C17561H<T> c17561h2 = this;
        T t5 = t;
        byte[] bArr3 = bArr;
        int i21 = i2;
        int i22 = i3;
        C41844gx8 c41844gx83 = c41844gx8;
        Unsafe unsafe2 = f71240s;
        int i23 = i;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = -1;
        int i28 = 1048575;
        while (true) {
            Object obj2 = null;
            if (i23 < i21) {
                int i29 = i23 + 1;
                byte b2 = bArr3[i23];
                if (b2 < 0) {
                    int m51012d = C17550D.m51012d(b2, bArr3, i29, c41844gx83);
                    b = c41844gx83.f84540a;
                    i29 = m51012d;
                } else {
                    b = b2;
                }
                int i30 = b >>> 3;
                int i31 = b & 7;
                if (i30 > i27) {
                    m50948S = c17561h2.m50947g(i30, i24 / 3);
                } else {
                    m50948S = c17561h2.m50948S(i30);
                }
                int i32 = m50948S;
                if (i32 == -1) {
                    i8 = i30;
                    i9 = i29;
                    i10 = i26;
                    unsafe = unsafe2;
                    i11 = i22;
                    i12 = 0;
                    z = true;
                    i13 = b;
                } else {
                    int[] iArr = c17561h2.f71241a;
                    int i33 = iArr[i32 + 1];
                    int i34 = (i33 & 267386880) >>> 20;
                    int i35 = b;
                    long j2 = i33 & 1048575;
                    if (i34 <= 17) {
                        int i36 = iArr[i32 + 2];
                        int i37 = 1 << (i36 >>> 20);
                        int i38 = i36 & 1048575;
                        if (i38 != i28) {
                            if (i28 != 1048575) {
                                long j3 = i28;
                                t4 = t;
                                j = j2;
                                unsafe2.putInt(t4, j3, i26);
                            } else {
                                t4 = t;
                                j = j2;
                            }
                            i26 = unsafe2.getInt(t4, i38);
                            t5 = t4;
                        } else {
                            t5 = t;
                            j = j2;
                            i38 = i28;
                        }
                        int i39 = i26;
                        switch (i34) {
                            case 0:
                                i16 = i30;
                                i17 = i32;
                                i10 = i39;
                                i18 = i38;
                                i13 = i35;
                                long j4 = j;
                                z2 = true;
                                if (i31 == 1) {
                                    SZ8.m85258f(t5, j4, C17550D.m51003m(bArr3, i29));
                                    i23 = i29 + 8;
                                    i26 = i10 | i37;
                                    i28 = i18;
                                    i25 = i13;
                                    i24 = i17;
                                    i27 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i28 = i18;
                                    i11 = i3;
                                    z = z2;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i8 = i16;
                                    break;
                                }
                            case 1:
                                i16 = i30;
                                i17 = i32;
                                i10 = i39;
                                i18 = i38;
                                i13 = i35;
                                long j5 = j;
                                if (i31 == 5) {
                                    SZ8.m85257g(t5, j5, C17550D.m51001o(bArr3, i29));
                                    i23 = i29 + 4;
                                    i26 = i10 | i37;
                                    i28 = i18;
                                    i25 = i13;
                                    i24 = i17;
                                    i27 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    z2 = true;
                                    i28 = i18;
                                    i11 = i3;
                                    z = z2;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i8 = i16;
                                    break;
                                }
                            case 2:
                            case 3:
                                i16 = i30;
                                i17 = i32;
                                i10 = i39;
                                i18 = i38;
                                i13 = i35;
                                long j6 = j;
                                if (i31 == 0) {
                                    m51005k = C17550D.m51005k(bArr3, i29, c41844gx83);
                                    unsafe2.putLong(t, j6, c41844gx83.f84541b);
                                    i26 = i10 | i37;
                                    i28 = i18;
                                    i25 = i13;
                                    i23 = m51005k;
                                    i24 = i17;
                                    i27 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    z2 = true;
                                    i28 = i18;
                                    i11 = i3;
                                    z = z2;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i8 = i16;
                                    break;
                                }
                            case 4:
                            case 11:
                                i16 = i30;
                                i17 = i32;
                                i10 = i39;
                                i18 = i38;
                                i13 = i35;
                                long j7 = j;
                                if (i31 == 0) {
                                    i23 = C17550D.m51007i(bArr3, i29, c41844gx83);
                                    unsafe2.putInt(t5, j7, c41844gx83.f84540a);
                                    i26 = i10 | i37;
                                    i28 = i18;
                                    i25 = i13;
                                    i24 = i17;
                                    i27 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    z2 = true;
                                    i28 = i18;
                                    i11 = i3;
                                    z = z2;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i8 = i16;
                                    break;
                                }
                            case 5:
                            case 14:
                                i16 = i30;
                                i17 = i32;
                                i10 = i39;
                                i18 = i38;
                                i13 = i35;
                                long j8 = j;
                                if (i31 == 1) {
                                    unsafe2.putLong(t, j8, C17550D.m51004l(bArr3, i29));
                                    i23 = i29 + 8;
                                    i26 = i10 | i37;
                                    i28 = i18;
                                    i25 = i13;
                                    i24 = i17;
                                    i27 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    z2 = true;
                                    i28 = i18;
                                    i11 = i3;
                                    z = z2;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i8 = i16;
                                    break;
                                }
                            case 6:
                            case 13:
                                i16 = i30;
                                i17 = i32;
                                i10 = i39;
                                i18 = i38;
                                i13 = i35;
                                long j9 = j;
                                if (i31 == 5) {
                                    unsafe2.putInt(t5, j9, C17550D.m51008h(bArr3, i29));
                                    i23 = i29 + 4;
                                    i26 = i10 | i37;
                                    i28 = i18;
                                    i25 = i13;
                                    i24 = i17;
                                    i27 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    z2 = true;
                                    i28 = i18;
                                    i11 = i3;
                                    z = z2;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i8 = i16;
                                    break;
                                }
                            case 7:
                                i16 = i30;
                                i17 = i32;
                                i10 = i39;
                                i18 = i38;
                                i13 = i35;
                                long j10 = j;
                                if (i31 == 0) {
                                    i23 = C17550D.m51005k(bArr3, i29, c41844gx83);
                                    SZ8.m85253k(t5, j10, c41844gx83.f84541b != 0);
                                    i26 = i10 | i37;
                                    i28 = i18;
                                    i25 = i13;
                                    i24 = i17;
                                    i27 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    z2 = true;
                                    i28 = i18;
                                    i11 = i3;
                                    z = z2;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i8 = i16;
                                    break;
                                }
                            case 8:
                                i16 = i30;
                                i17 = i32;
                                i10 = i39;
                                i18 = i38;
                                i13 = i35;
                                long j11 = j;
                                if (i31 == 2) {
                                    if ((536870912 & i33) == 0) {
                                        i23 = C17550D.m51002n(bArr3, i29, c41844gx83);
                                    } else {
                                        i23 = C17550D.m51000p(bArr3, i29, c41844gx83);
                                    }
                                    unsafe2.putObject(t5, j11, c41844gx83.f84542c);
                                    i26 = i10 | i37;
                                    i28 = i18;
                                    i25 = i13;
                                    i24 = i17;
                                    i27 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    z2 = true;
                                    i28 = i18;
                                    i11 = i3;
                                    z = z2;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i8 = i16;
                                    break;
                                }
                            case 9:
                                i16 = i30;
                                i17 = i32;
                                i18 = i38;
                                i13 = i35;
                                long j12 = j;
                                if (i31 == 2) {
                                    int m51009g = C17550D.m51009g(c17561h2.m50936r(i17), bArr3, i29, i2, c41844gx83);
                                    if ((i39 & i37) == 0) {
                                        unsafe2.putObject(t5, j12, c41844gx83.f84542c);
                                    } else {
                                        unsafe2.putObject(t5, j12, C52124yI8.m3690e(unsafe2.getObject(t5, j12), c41844gx83.f84542c));
                                    }
                                    int i40 = i39 | i37;
                                    i28 = i18;
                                    i25 = i13;
                                    i27 = i16;
                                    i21 = i2;
                                    i26 = i40;
                                    i23 = m51009g;
                                    i24 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i10 = i39;
                                    z2 = true;
                                    i28 = i18;
                                    i11 = i3;
                                    z = z2;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i8 = i16;
                                    break;
                                }
                            case 10:
                                i16 = i30;
                                i17 = i32;
                                i18 = i38;
                                i13 = i35;
                                long j13 = j;
                                if (i31 == 2) {
                                    m50999q = C17550D.m50999q(bArr3, i29, c41844gx83);
                                    unsafe2.putObject(t5, j13, c41844gx83.f84542c);
                                    i26 = i39 | i37;
                                    i28 = i18;
                                    i23 = m50999q;
                                    i25 = i13;
                                    i24 = i17;
                                    i27 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i10 = i39;
                                    z2 = true;
                                    i28 = i18;
                                    i11 = i3;
                                    z = z2;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i8 = i16;
                                    break;
                                }
                            case 12:
                                i16 = i30;
                                i17 = i32;
                                i18 = i38;
                                i13 = i35;
                                long j14 = j;
                                if (i31 == 0) {
                                    m50999q = C17550D.m51007i(bArr3, i29, c41844gx83);
                                    int i41 = c41844gx83.f84540a;
                                    KI8 m50957J = c17561h2.m50957J(i17);
                                    if (m50957J != null && !m50957J.zza(i41)) {
                                        m50951P(t).m103756c(i13, Long.valueOf(i41));
                                        i23 = m50999q;
                                        i26 = i39;
                                        i25 = i13;
                                        i24 = i17;
                                        i27 = i16;
                                        i28 = i18;
                                        i21 = i2;
                                        i22 = i3;
                                    } else {
                                        unsafe2.putInt(t5, j14, i41);
                                        i26 = i39 | i37;
                                        i28 = i18;
                                        i23 = m50999q;
                                        i25 = i13;
                                        i24 = i17;
                                        i27 = i16;
                                        i21 = i2;
                                        i22 = i3;
                                        break;
                                    }
                                } else {
                                    i10 = i39;
                                    z2 = true;
                                    i28 = i18;
                                    i11 = i3;
                                    z = z2;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i8 = i16;
                                    break;
                                }
                                break;
                            case 15:
                                i16 = i30;
                                i17 = i32;
                                i18 = i38;
                                i13 = i35;
                                long j15 = j;
                                if (i31 == 0) {
                                    m50999q = C17550D.m51007i(bArr3, i29, c41844gx83);
                                    unsafe2.putInt(t5, j15, WB8.m78738k(c41844gx83.f84540a));
                                    i26 = i39 | i37;
                                    i28 = i18;
                                    i23 = m50999q;
                                    i25 = i13;
                                    i24 = i17;
                                    i27 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i10 = i39;
                                    z2 = true;
                                    i28 = i18;
                                    i11 = i3;
                                    z = z2;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i8 = i16;
                                    break;
                                }
                            case 16:
                                i16 = i30;
                                i17 = i32;
                                long j16 = j;
                                if (i31 == 0) {
                                    m51005k = C17550D.m51005k(bArr3, i29, c41844gx83);
                                    i18 = i38;
                                    i13 = i35;
                                    unsafe2.putLong(t, j16, WB8.m78740b(c41844gx83.f84541b));
                                    i26 = i39 | i37;
                                    i28 = i18;
                                    i25 = i13;
                                    i23 = m51005k;
                                    i24 = i17;
                                    i27 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i18 = i38;
                                    i13 = i35;
                                    i10 = i39;
                                    z2 = true;
                                    i28 = i18;
                                    i11 = i3;
                                    z = z2;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i8 = i16;
                                    break;
                                }
                            case 17:
                                if (i31 == 3) {
                                    i16 = i30;
                                    i17 = i32;
                                    i23 = C17550D.m51010f(c17561h2.m50936r(i32), bArr, i29, i2, (i30 << 3) | 4, c41844gx8);
                                    if ((i39 & i37) == 0) {
                                        unsafe2.putObject(t5, j, c41844gx83.f84542c);
                                    } else {
                                        long j17 = j;
                                        unsafe2.putObject(t5, j17, C52124yI8.m3690e(unsafe2.getObject(t5, j17), c41844gx83.f84542c));
                                    }
                                    i26 = i39 | i37;
                                    i28 = i38;
                                    i25 = i35;
                                    i24 = i17;
                                    i27 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i16 = i30;
                                    i17 = i32;
                                    i10 = i39;
                                    i18 = i38;
                                    i13 = i35;
                                    z2 = true;
                                    i28 = i18;
                                    i11 = i3;
                                    z = z2;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i12 = i17;
                                    i8 = i16;
                                    break;
                                }
                            default:
                                i16 = i30;
                                i17 = i32;
                                i10 = i39;
                                i18 = i38;
                                i13 = i35;
                                z2 = true;
                                i28 = i18;
                                i11 = i3;
                                z = z2;
                                i9 = i29;
                                unsafe = unsafe2;
                                i12 = i17;
                                i8 = i16;
                                break;
                        }
                    } else {
                        i10 = i26;
                        int i42 = i28;
                        t5 = t;
                        if (i34 != 27) {
                            i12 = i32;
                            if (i34 <= 49) {
                                int i43 = i29;
                                z = true;
                                i20 = i35;
                                unsafe = unsafe2;
                                i11 = i3;
                                i8 = i30;
                                i23 = m50945i(t, bArr, i29, i2, i35, i30, i31, i12, i33, i34, j2, c41844gx8);
                                if (i23 == i43) {
                                    i9 = i23;
                                } else {
                                    t5 = t;
                                    bArr3 = bArr;
                                    i21 = i2;
                                    c41844gx83 = c41844gx8;
                                    i22 = i11;
                                    i27 = i8;
                                    i28 = i42;
                                    i26 = i10;
                                    i25 = i20;
                                    i24 = i12;
                                    unsafe2 = unsafe;
                                    c17561h2 = this;
                                }
                            } else {
                                i11 = i3;
                                i19 = i29;
                                i20 = i35;
                                unsafe = unsafe2;
                                i8 = i30;
                                z = true;
                                if (i34 != 50) {
                                    i23 = m50946h(t, bArr, i19, i2, i20, i8, i31, i33, i34, j2, i12, c41844gx8);
                                    if (i23 != i19) {
                                        t5 = t;
                                        bArr3 = bArr;
                                        i21 = i2;
                                        c41844gx83 = c41844gx8;
                                        i25 = i20;
                                        i22 = i11;
                                        i27 = i8;
                                        i28 = i42;
                                        i26 = i10;
                                        i24 = i12;
                                        unsafe2 = unsafe;
                                        c17561h2 = this;
                                    }
                                } else if (i31 == 2) {
                                    i23 = m50944j(t, bArr, i19, i2, i12, j2, c41844gx8);
                                    if (i23 != i19) {
                                        t5 = t;
                                        bArr3 = bArr;
                                        i21 = i2;
                                        c41844gx83 = c41844gx8;
                                        i22 = i11;
                                        i27 = i8;
                                        i28 = i42;
                                        i26 = i10;
                                        i25 = i20;
                                        i24 = i12;
                                        unsafe2 = unsafe;
                                        c17561h2 = this;
                                    }
                                } else {
                                    i9 = i19;
                                }
                                i9 = i23;
                            }
                        } else if (i31 == 2) {
                            RJ8 rj8 = (RJ8) unsafe2.getObject(t5, j2);
                            if (!rj8.zza()) {
                                int size = rj8.size();
                                rj8 = rj8.zza(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t5, j2, rj8);
                            }
                            i23 = C17550D.m51011e(c17561h2.m50936r(i32), i35, bArr, i29, i2, rj8, c41844gx8);
                            i22 = i3;
                            i25 = i35;
                            i27 = i30;
                            i28 = i42;
                            i26 = i10;
                            i24 = i32;
                            i21 = i2;
                        } else {
                            i12 = i32;
                            i11 = i3;
                            i19 = i29;
                            i20 = i35;
                            unsafe = unsafe2;
                            i8 = i30;
                            z = true;
                            i9 = i19;
                        }
                        i28 = i42;
                        i13 = i20;
                    }
                }
                if (i13 != i11 || i11 == 0) {
                    int i44 = i11;
                    if (this.f71246f) {
                        c41844gx82 = c41844gx8;
                        if (c41844gx82.f84543d != C17551E.m50997b()) {
                            int i45 = i8;
                            AbstractC17554G.C17558d m50998a = c41844gx82.f84543d.m50998a(this.f71245e, i45);
                            if (m50998a == null) {
                                i23 = C17550D.m51013c(i13, bArr, i9, i2, m50951P(t), c41844gx8);
                                t3 = t;
                                i14 = i28;
                                i8 = i45;
                                bArr2 = bArr;
                                i15 = i2;
                            } else {
                                t3 = t;
                                AbstractC17554G.AbstractC17557c abstractC17557c = (AbstractC17554G.AbstractC17557c) t3;
                                abstractC17557c.m50970u();
                                C47355qF8<AbstractC17554G.C17559e> c47355qF8 = abstractC17557c.zzc;
                                AbstractC17554G.C17559e c17559e = m50998a.f71227b;
                                boolean z3 = c17559e.f71230d;
                                T19 t19 = c17559e.f71229c;
                                if (t19 != T19.f34666q) {
                                    int[] iArr2 = C50135uw8.f113227a;
                                    switch (iArr2[t19.ordinal()]) {
                                        case 1:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            obj2 = Double.valueOf(C17550D.m51003m(bArr2, i9));
                                            i9 += 8;
                                            obj = obj2;
                                            break;
                                        case 2:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            obj2 = Float.valueOf(C17550D.m51001o(bArr2, i9));
                                            i9 += 4;
                                            obj = obj2;
                                            break;
                                        case 3:
                                        case 4:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = C17550D.m51005k(bArr2, i9, c41844gx82);
                                            obj2 = Long.valueOf(c41844gx82.f84541b);
                                            obj = obj2;
                                            break;
                                        case 5:
                                        case 6:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = C17550D.m51007i(bArr2, i9, c41844gx82);
                                            obj2 = Integer.valueOf(c41844gx82.f84540a);
                                            obj = obj2;
                                            break;
                                        case 7:
                                        case 8:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            obj2 = Long.valueOf(C17550D.m51004l(bArr2, i9));
                                            i9 += 8;
                                            obj = obj2;
                                            break;
                                        case 9:
                                        case 10:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            obj2 = Integer.valueOf(C17550D.m51008h(bArr2, i9));
                                            i9 += 4;
                                            obj = obj2;
                                            break;
                                        case 11:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = C17550D.m51005k(bArr2, i9, c41844gx82);
                                            if (c41844gx82.f84541b == 0) {
                                                z = false;
                                            }
                                            obj2 = Boolean.valueOf(z);
                                            obj = obj2;
                                            break;
                                        case 12:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = C17550D.m51007i(bArr2, i9, c41844gx82);
                                            obj2 = Integer.valueOf(WB8.m78738k(c41844gx82.f84540a));
                                            obj = obj2;
                                            break;
                                        case 13:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = C17550D.m51005k(bArr2, i9, c41844gx82);
                                            obj2 = Long.valueOf(WB8.m78740b(c41844gx82.f84541b));
                                            obj = obj2;
                                            break;
                                        case 14:
                                            throw new IllegalStateException("Shouldn't reach here.");
                                        case 15:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = C17550D.m50999q(bArr2, i9, c41844gx82);
                                            obj = c41844gx82.f84542c;
                                            break;
                                        case 16:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = C17550D.m51002n(bArr2, i9, c41844gx82);
                                            obj = c41844gx82.f84542c;
                                            break;
                                        case 17:
                                            int i46 = (i45 << 3) | 4;
                                            i14 = i28;
                                            i15 = i2;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i9 = C17550D.m51010f(C40365eT8.m42854a().m42853b(m50998a.f71226a.getClass()), bArr, i9, i2, i46, c41844gx8);
                                            obj = c41844gx82.f84542c;
                                            break;
                                        case 18:
                                            i9 = C17550D.m51009g(C40365eT8.m42854a().m42853b(m50998a.f71226a.getClass()), bArr, i9, i2, c41844gx82);
                                            obj = c41844gx82.f84542c;
                                            i14 = i28;
                                            i8 = i45;
                                            i15 = i2;
                                            bArr2 = bArr;
                                            break;
                                        default:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            obj = obj2;
                                            break;
                                    }
                                    AbstractC17554G.C17559e c17559e2 = m50998a.f71227b;
                                    if (c17559e2.f71230d) {
                                        c47355qF8.m17721k(c17559e2, obj);
                                    } else {
                                        int i47 = iArr2[c17559e2.f71229c.ordinal()];
                                        if ((i47 == 17 || i47 == 18) && (m17728d = c47355qF8.m17728d(m50998a.f71227b)) != null) {
                                            obj = C52124yI8.m3690e(m17728d, obj);
                                        }
                                        c47355qF8.m17725g(m50998a.f71227b, obj);
                                    }
                                    i23 = i9;
                                } else {
                                    C17550D.m51007i(bArr, i9, c41844gx82);
                                    throw null;
                                }
                            }
                            i25 = i13;
                            c17561h2 = this;
                            bArr3 = bArr2;
                            t5 = t3;
                            i27 = i8;
                            i26 = i10;
                            i24 = i12;
                            i21 = i15;
                            i22 = i44;
                            c41844gx83 = c41844gx82;
                            unsafe2 = unsafe;
                            i28 = i14;
                        } else {
                            t3 = t;
                            bArr2 = bArr;
                        }
                    } else {
                        t3 = t;
                        bArr2 = bArr;
                        c41844gx82 = c41844gx8;
                    }
                    i14 = i28;
                    i15 = i2;
                    i23 = C17550D.m51013c(i13, bArr, i9, i2, m50951P(t), c41844gx8);
                    i25 = i13;
                    c17561h2 = this;
                    bArr3 = bArr2;
                    t5 = t3;
                    i27 = i8;
                    i26 = i10;
                    i24 = i12;
                    i21 = i15;
                    i22 = i44;
                    c41844gx83 = c41844gx82;
                    unsafe2 = unsafe;
                    i28 = i14;
                } else {
                    c17561h = this;
                    t2 = t;
                    i23 = i9;
                    i6 = i28;
                    i25 = i13;
                    i4 = i11;
                    i26 = i10;
                    i7 = 1048575;
                    i5 = i2;
                }
            } else {
                int i48 = i28;
                unsafe = unsafe2;
                i4 = i22;
                i5 = i21;
                t2 = t5;
                c17561h = c17561h2;
                i6 = i48;
                i7 = 1048575;
            }
        }
        if (i6 != i7) {
            unsafe.putInt(t2, i6, i26);
        }
        HY8 hy8 = null;
        for (int i49 = c17561h.f71251k; i49 < c17561h.f71252l; i49++) {
            hy8 = (HY8) c17561h.m50939o(t2, c17561h.f71250j[i49], hy8, c17561h.f71255o);
        }
        if (hy8 != null) {
            c17561h.f71255o.mo41185m(t2, hy8);
        }
        if (i4 == 0) {
            if (i23 != i5) {
                throw zzjk.m50758g();
            }
        } else if (i23 > i5 || i25 != i4) {
            throw zzjk.m50758g();
        }
        return i23;
    }

    /* renamed from: n */
    public final <K, V, UT, UB> UB m50940n(int i, int i2, Map<K, V> map, KI8 ki8, UB ub, AbstractC41003fY8<UT, UB> abstractC41003fY8) {
        this.f71257q.zzb(m50963D(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!ki8.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = abstractC41003fY8.mo41197a();
                }
                C37814aB8 m47C = AbstractC53119zy8.m47C(C48621sO8.m14241a(null, next.getKey(), next.getValue()));
                try {
                    C48621sO8.m14240b(m47C.m71793b(), null, next.getKey(), next.getValue());
                    abstractC41003fY8.mo41192f(ub, i2, m47C.m71794a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: o */
    public final <UT, UB> UB m50939o(Object obj, int i, UB ub, AbstractC41003fY8<UT, UB> abstractC41003fY8) {
        int i2 = this.f71241a[i];
        Object m85273F = SZ8.m85273F(obj, m50955L(i) & 1048575);
        if (m85273F == null) {
            return ub;
        }
        KI8 m50957J = m50957J(i);
        if (m50957J == null) {
            return ub;
        }
        return (UB) m50940n(i, i2, this.f71257q.zza(m85273F), m50957J, ub, abstractC41003fY8);
    }

    /* renamed from: r */
    public final InterfaceC52825zU8 m50936r(int i) {
        int i2 = (i / 3) << 1;
        InterfaceC52825zU8 interfaceC52825zU8 = (InterfaceC52825zU8) this.f71242b[i2];
        if (interfaceC52825zU8 != null) {
            return interfaceC52825zU8;
        }
        InterfaceC52825zU8<T> m42853b = C40365eT8.m42854a().m42853b((Class) this.f71242b[i2 + 1]);
        this.f71242b[i2] = m42853b;
        return m42853b;
    }

    /* renamed from: t */
    public final void m50934t(Object obj, int i, IU8 iu8) throws IOException {
        if (m50950Q(i)) {
            SZ8.m85254j(obj, i & 1048575, iu8.mo13333b());
        } else if (this.f71247g) {
            SZ8.m85254j(obj, i & 1048575, iu8.mo13325j());
        } else {
            SZ8.m85254j(obj, i & 1048575, iu8.mo13330e());
        }
    }

    /* renamed from: u */
    public final void m50933u(T t, T t2, int i) {
        long m50955L = m50955L(i) & 1048575;
        if (!m50930x(t2, i)) {
            return;
        }
        Object m85273F = SZ8.m85273F(t, m50955L);
        Object m85273F2 = SZ8.m85273F(t2, m50955L);
        if (m85273F != null && m85273F2 != null) {
            SZ8.m85254j(t, m50955L, C52124yI8.m3690e(m85273F, m85273F2));
            m50962E(t, i);
        } else if (m85273F2 != null) {
            SZ8.m85254j(t, m50955L, m85273F2);
            m50962E(t, i);
        }
    }

    /* renamed from: w */
    public final <K, V> void m50931w(InterfaceC37736a39 interfaceC37736a39, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.f71257q.zzb(m50963D(i2));
            interfaceC37736a39.mo21603L(i, null, this.f71257q.zzc(obj));
        }
    }

    /* renamed from: x */
    public final boolean m50930x(T t, int i) {
        int m50953N = m50953N(i);
        long j = m50953N & 1048575;
        if (j == 1048575) {
            int m50955L = m50955L(i);
            long j2 = m50955L & 1048575;
            switch ((m50955L & 267386880) >>> 20) {
                case 0:
                    if (SZ8.m85276C(t, j2) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (SZ8.m85240x(t, j2) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (SZ8.m85249o(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (SZ8.m85249o(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (SZ8.m85262b(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (SZ8.m85249o(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (SZ8.m85262b(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return SZ8.m85241w(t, j2);
                case 8:
                    Object m85273F = SZ8.m85273F(t, j2);
                    if (m85273F instanceof String) {
                        if (((String) m85273F).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m85273F instanceof AbstractC53119zy8) {
                        if (AbstractC53119zy8.f122544c.equals(m85273F)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (SZ8.m85273F(t, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC53119zy8.f122544c.equals(SZ8.m85273F(t, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (SZ8.m85262b(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (SZ8.m85262b(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (SZ8.m85262b(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (SZ8.m85249o(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (SZ8.m85262b(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (SZ8.m85249o(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (SZ8.m85273F(t, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((SZ8.m85262b(t, j) & (1 << (m50953N >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final boolean m50929y(T t, int i, int i2) {
        if (SZ8.m85262b(t, m50953N(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public final boolean m50928z(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m50930x(t, i) : (i3 & i4) != 0;
    }

    @Override // p000.InterfaceC52825zU8
    public final T zza() {
        return (T) this.f71253m.zza(this.f71245e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.InterfaceC52825zU8
    public final int zzb(T t) {
        int i;
        int i2;
        int i3;
        long j;
        int m50822b0;
        int m50842D;
        int m50847A0;
        int m81443R;
        int m81439V;
        int m50814g0;
        int m50803o0;
        int m50846B;
        int m81439V2;
        int m50814g02;
        int m50803o02;
        int i4 = 267386880;
        int i5 = 1048575;
        int i6 = 1;
        int i7 = 0;
        if (this.f71248h) {
            Unsafe unsafe = f71240s;
            int i8 = 0;
            int i9 = 0;
            while (i8 < this.f71241a.length) {
                int m50955L = m50955L(i8);
                int i10 = (m50955L & i4) >>> 20;
                int i11 = this.f71241a[i8];
                long j2 = m50955L & 1048575;
                if (i10 >= CF8.f3743T.zza() && i10 <= CF8.f3773w0.zza()) {
                    int i12 = this.f71241a[i8 + 2];
                }
                switch (i10) {
                    case 0:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50846B(i11, 0.0d);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 1:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50844C(i11, 0.0f);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 2:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50822b0(i11, SZ8.m85249o(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 3:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50812h0(i11, SZ8.m85249o(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 4:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50806l0(i11, SZ8.m85262b(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 5:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50801q0(i11, 0L);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 6:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50793x0(i11, 0);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 7:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50836H(i11, true);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 8:
                        if (m50930x(t, i8)) {
                            Object m85273F = SZ8.m85273F(t, j2);
                            if (m85273F instanceof AbstractC53119zy8) {
                                m50846B = zzii.m50827T(i11, (AbstractC53119zy8) m85273F);
                                break;
                            } else {
                                m50846B = zzii.m50842D(i11, (String) m85273F);
                                break;
                            }
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 9:
                        if (m50930x(t, i8)) {
                            m50846B = UU8.m81434a(i11, SZ8.m85273F(t, j2), m50936r(i8));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 10:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50827T(i11, (AbstractC53119zy8) SZ8.m85273F(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 11:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50802p0(i11, SZ8.m85262b(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 12:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50843C0(i11, SZ8.m85262b(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 13:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50847A0(i11, 0);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 14:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50797u0(i11, 0L);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 15:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50798t0(i11, SZ8.m85262b(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 16:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50805m0(i11, SZ8.m85249o(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 17:
                        if (m50930x(t, i8)) {
                            m50846B = zzii.m50826U(i11, (InterfaceC44489lQ8) SZ8.m85273F(t, j2), m50936r(i8));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 18:
                        m50846B = UU8.m81440U(i11, m50937q(t, j2), false);
                        break;
                    case 19:
                        m50846B = UU8.m81443R(i11, m50937q(t, j2), false);
                        break;
                    case 20:
                        m50846B = UU8.m81428d(i11, m50937q(t, j2), false);
                        break;
                    case 21:
                        m50846B = UU8.m81411t(i11, m50937q(t, j2), false);
                        break;
                    case 22:
                        m50846B = UU8.m81453H(i11, m50937q(t, j2), false);
                        break;
                    case 23:
                        m50846B = UU8.m81440U(i11, m50937q(t, j2), false);
                        break;
                    case 24:
                        m50846B = UU8.m81443R(i11, m50937q(t, j2), false);
                        break;
                    case 25:
                        m50846B = UU8.m81437X(i11, m50937q(t, j2), false);
                        break;
                    case 26:
                        m50846B = UU8.m81432b(i11, m50937q(t, j2));
                        break;
                    case 27:
                        m50846B = UU8.m81430c(i11, m50937q(t, j2), m50936r(i8));
                        break;
                    case 28:
                        m50846B = UU8.m81413r(i11, m50937q(t, j2));
                        break;
                    case 29:
                        m50846B = UU8.m81449L(i11, m50937q(t, j2), false);
                        break;
                    case 30:
                        m50846B = UU8.m81457D(i11, m50937q(t, j2), false);
                        break;
                    case 31:
                        m50846B = UU8.m81443R(i11, m50937q(t, j2), false);
                        break;
                    case 32:
                        m50846B = UU8.m81440U(i11, m50937q(t, j2), false);
                        break;
                    case 33:
                        m50846B = UU8.m81446O(i11, m50937q(t, j2), false);
                        break;
                    case 34:
                        m50846B = UU8.m81405z(i11, m50937q(t, j2), false);
                        break;
                    case 35:
                        m81439V2 = UU8.m81439V((List) unsafe.getObject(t, j2));
                        if (m81439V2 > 0) {
                            m50814g02 = zzii.m50814g0(i11);
                            m50803o02 = zzii.m50803o0(m81439V2);
                            m50846B = m50814g02 + m50803o02 + m81439V2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 36:
                        m81439V2 = UU8.m81442S((List) unsafe.getObject(t, j2));
                        if (m81439V2 > 0) {
                            m50814g02 = zzii.m50814g0(i11);
                            m50803o02 = zzii.m50803o0(m81439V2);
                            m50846B = m50814g02 + m50803o02 + m81439V2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 37:
                        m81439V2 = UU8.m81426e((List) unsafe.getObject(t, j2));
                        if (m81439V2 > 0) {
                            m50814g02 = zzii.m50814g0(i11);
                            m50803o02 = zzii.m50803o0(m81439V2);
                            m50846B = m50814g02 + m50803o02 + m81439V2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 38:
                        m81439V2 = UU8.m81410u((List) unsafe.getObject(t, j2));
                        if (m81439V2 > 0) {
                            m50814g02 = zzii.m50814g0(i11);
                            m50803o02 = zzii.m50803o0(m81439V2);
                            m50846B = m50814g02 + m50803o02 + m81439V2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 39:
                        m81439V2 = UU8.m81452I((List) unsafe.getObject(t, j2));
                        if (m81439V2 > 0) {
                            m50814g02 = zzii.m50814g0(i11);
                            m50803o02 = zzii.m50803o0(m81439V2);
                            m50846B = m50814g02 + m50803o02 + m81439V2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 40:
                        m81439V2 = UU8.m81439V((List) unsafe.getObject(t, j2));
                        if (m81439V2 > 0) {
                            m50814g02 = zzii.m50814g0(i11);
                            m50803o02 = zzii.m50803o0(m81439V2);
                            m50846B = m50814g02 + m50803o02 + m81439V2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 41:
                        m81439V2 = UU8.m81442S((List) unsafe.getObject(t, j2));
                        if (m81439V2 > 0) {
                            m50814g02 = zzii.m50814g0(i11);
                            m50803o02 = zzii.m50803o0(m81439V2);
                            m50846B = m50814g02 + m50803o02 + m81439V2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 42:
                        m81439V2 = UU8.m81436Y((List) unsafe.getObject(t, j2));
                        if (m81439V2 > 0) {
                            m50814g02 = zzii.m50814g0(i11);
                            m50803o02 = zzii.m50803o0(m81439V2);
                            m50846B = m50814g02 + m50803o02 + m81439V2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 43:
                        m81439V2 = UU8.m81448M((List) unsafe.getObject(t, j2));
                        if (m81439V2 > 0) {
                            m50814g02 = zzii.m50814g0(i11);
                            m50803o02 = zzii.m50803o0(m81439V2);
                            m50846B = m50814g02 + m50803o02 + m81439V2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 44:
                        m81439V2 = UU8.m81456E((List) unsafe.getObject(t, j2));
                        if (m81439V2 > 0) {
                            m50814g02 = zzii.m50814g0(i11);
                            m50803o02 = zzii.m50803o0(m81439V2);
                            m50846B = m50814g02 + m50803o02 + m81439V2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 45:
                        m81439V2 = UU8.m81442S((List) unsafe.getObject(t, j2));
                        if (m81439V2 > 0) {
                            m50814g02 = zzii.m50814g0(i11);
                            m50803o02 = zzii.m50803o0(m81439V2);
                            m50846B = m50814g02 + m50803o02 + m81439V2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 46:
                        m81439V2 = UU8.m81439V((List) unsafe.getObject(t, j2));
                        if (m81439V2 > 0) {
                            m50814g02 = zzii.m50814g0(i11);
                            m50803o02 = zzii.m50803o0(m81439V2);
                            m50846B = m50814g02 + m50803o02 + m81439V2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 47:
                        m81439V2 = UU8.m81445P((List) unsafe.getObject(t, j2));
                        if (m81439V2 > 0) {
                            m50814g02 = zzii.m50814g0(i11);
                            m50803o02 = zzii.m50803o0(m81439V2);
                            m50846B = m50814g02 + m50803o02 + m81439V2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 48:
                        m81439V2 = UU8.m81460A((List) unsafe.getObject(t, j2));
                        if (m81439V2 > 0) {
                            m50814g02 = zzii.m50814g0(i11);
                            m50803o02 = zzii.m50803o0(m81439V2);
                            m50846B = m50814g02 + m50803o02 + m81439V2;
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 49:
                        m50846B = UU8.m81412s(i11, m50937q(t, j2), m50936r(i8));
                        break;
                    case 50:
                        m50846B = this.f71257q.mo14228d(i11, SZ8.m85273F(t, j2), m50963D(i8));
                        break;
                    case 51:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50846B(i11, 0.0d);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 52:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50844C(i11, 0.0f);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 53:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50822b0(i11, m50952O(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 54:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50812h0(i11, m50952O(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 55:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50806l0(i11, m50954M(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 56:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50801q0(i11, 0L);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 57:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50793x0(i11, 0);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 58:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50836H(i11, true);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 59:
                        if (m50929y(t, i11, i8)) {
                            Object m85273F2 = SZ8.m85273F(t, j2);
                            if (m85273F2 instanceof AbstractC53119zy8) {
                                m50846B = zzii.m50827T(i11, (AbstractC53119zy8) m85273F2);
                                break;
                            } else {
                                m50846B = zzii.m50842D(i11, (String) m85273F2);
                                break;
                            }
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 60:
                        if (m50929y(t, i11, i8)) {
                            m50846B = UU8.m81434a(i11, SZ8.m85273F(t, j2), m50936r(i8));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 61:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50827T(i11, (AbstractC53119zy8) SZ8.m85273F(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 62:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50802p0(i11, m50954M(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 63:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50843C0(i11, m50954M(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 64:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50847A0(i11, 0);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 65:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50797u0(i11, 0L);
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 66:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50798t0(i11, m50954M(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 67:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50805m0(i11, m50952O(t, j2));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    case 68:
                        if (m50929y(t, i11, i8)) {
                            m50846B = zzii.m50826U(i11, (InterfaceC44489lQ8) SZ8.m85273F(t, j2), m50936r(i8));
                            break;
                        } else {
                            continue;
                            i8 += 3;
                            i4 = 267386880;
                        }
                    default:
                        i8 += 3;
                        i4 = 267386880;
                }
                i9 += m50846B;
                i8 += 3;
                i4 = 267386880;
            }
            return i9 + m50942l(this.f71255o, t);
        }
        Unsafe unsafe2 = f71240s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < this.f71241a.length) {
            int m50955L2 = m50955L(i14);
            int[] iArr = this.f71241a;
            int i17 = iArr[i14];
            int i18 = (m50955L2 & 267386880) >>> 20;
            if (i18 <= 17) {
                int i19 = iArr[i14 + 2];
                int i20 = i19 & i5;
                i = i6 << (i19 >>> 20);
                if (i20 != i13) {
                    i16 = unsafe2.getInt(t, i20);
                    i13 = i20;
                }
            } else {
                i = 0;
            }
            long j3 = m50955L2 & i5;
            switch (i18) {
                case 0:
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    if ((i16 & i) != 0) {
                        i15 += zzii.m50846B(i17, 0.0d);
                        continue;
                        i14 += 3;
                        i6 = i2;
                        i7 = i3;
                        i5 = 1048575;
                    }
                    break;
                case 1:
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    if ((i16 & i) != 0) {
                        i15 += zzii.m50844C(i17, 0.0f);
                        break;
                    }
                    break;
                case 2:
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    if ((i & i16) != 0) {
                        m50822b0 = zzii.m50822b0(i17, unsafe2.getLong(t, j3));
                        i15 += m50822b0;
                        break;
                    }
                    break;
                case 3:
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    if ((i & i16) != 0) {
                        m50822b0 = zzii.m50812h0(i17, unsafe2.getLong(t, j3));
                        i15 += m50822b0;
                        break;
                    }
                    break;
                case 4:
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    if ((i & i16) != 0) {
                        m50822b0 = zzii.m50806l0(i17, unsafe2.getInt(t, j3));
                        i15 += m50822b0;
                        break;
                    }
                    break;
                case 5:
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    if ((i16 & i) != 0) {
                        m50822b0 = zzii.m50801q0(i17, 0L);
                        i15 += m50822b0;
                        break;
                    }
                    break;
                case 6:
                    i2 = 1;
                    i3 = 0;
                    if ((i16 & i) != 0) {
                        i15 += zzii.m50793x0(i17, 0);
                    }
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 7:
                    if ((i16 & i) != 0) {
                        i2 = 1;
                        i15 += zzii.m50836H(i17, true);
                        i3 = 0;
                        j = 0;
                        i14 += 3;
                        i6 = i2;
                        i7 = i3;
                        i5 = 1048575;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 8:
                    if ((i16 & i) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof AbstractC53119zy8) {
                            m50842D = zzii.m50827T(i17, (AbstractC53119zy8) object);
                        } else {
                            m50842D = zzii.m50842D(i17, (String) object);
                        }
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 9:
                    if ((i16 & i) != 0) {
                        m50842D = UU8.m81434a(i17, unsafe2.getObject(t, j3), m50936r(i14));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 10:
                    if ((i16 & i) != 0) {
                        m50842D = zzii.m50827T(i17, (AbstractC53119zy8) unsafe2.getObject(t, j3));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 11:
                    if ((i16 & i) != 0) {
                        m50842D = zzii.m50802p0(i17, unsafe2.getInt(t, j3));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 12:
                    if ((i16 & i) != 0) {
                        m50842D = zzii.m50843C0(i17, unsafe2.getInt(t, j3));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 13:
                    if ((i16 & i) != 0) {
                        m50847A0 = zzii.m50847A0(i17, 0);
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 14:
                    if ((i16 & i) != 0) {
                        m50842D = zzii.m50797u0(i17, 0L);
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 15:
                    if ((i16 & i) != 0) {
                        m50842D = zzii.m50798t0(i17, unsafe2.getInt(t, j3));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 16:
                    if ((i16 & i) != 0) {
                        m50842D = zzii.m50805m0(i17, unsafe2.getLong(t, j3));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 17:
                    if ((i16 & i) != 0) {
                        m50842D = zzii.m50826U(i17, (InterfaceC44489lQ8) unsafe2.getObject(t, j3), m50936r(i14));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 18:
                    m50842D = UU8.m81440U(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m50842D;
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 19:
                    i3 = 0;
                    m81443R = UU8.m81443R(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m81443R;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 20:
                    i3 = 0;
                    m81443R = UU8.m81428d(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m81443R;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 21:
                    i3 = 0;
                    m81443R = UU8.m81411t(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m81443R;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 22:
                    i3 = 0;
                    m81443R = UU8.m81453H(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m81443R;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 23:
                    i3 = 0;
                    m81443R = UU8.m81440U(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m81443R;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 24:
                    i3 = 0;
                    m81443R = UU8.m81443R(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m81443R;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 25:
                    i3 = 0;
                    m81443R = UU8.m81437X(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m81443R;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 26:
                    m50842D = UU8.m81432b(i17, (List) unsafe2.getObject(t, j3));
                    i15 += m50842D;
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 27:
                    m50842D = UU8.m81430c(i17, (List) unsafe2.getObject(t, j3), m50936r(i14));
                    i15 += m50842D;
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 28:
                    m50842D = UU8.m81413r(i17, (List) unsafe2.getObject(t, j3));
                    i15 += m50842D;
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 29:
                    m50842D = UU8.m81449L(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m50842D;
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 30:
                    i3 = 0;
                    m81443R = UU8.m81457D(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m81443R;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 31:
                    i3 = 0;
                    m81443R = UU8.m81443R(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m81443R;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 32:
                    i3 = 0;
                    m81443R = UU8.m81440U(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m81443R;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 33:
                    i3 = 0;
                    m81443R = UU8.m81446O(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m81443R;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 34:
                    i3 = 0;
                    m81443R = UU8.m81405z(i17, (List) unsafe2.getObject(t, j3), false);
                    i15 += m81443R;
                    i2 = 1;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 35:
                    m81439V = UU8.m81439V((List) unsafe2.getObject(t, j3));
                    if (m81439V > 0) {
                        m50814g0 = zzii.m50814g0(i17);
                        m50803o0 = zzii.m50803o0(m81439V);
                        m50847A0 = m50814g0 + m50803o0 + m81439V;
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 36:
                    m81439V = UU8.m81442S((List) unsafe2.getObject(t, j3));
                    if (m81439V > 0) {
                        m50814g0 = zzii.m50814g0(i17);
                        m50803o0 = zzii.m50803o0(m81439V);
                        m50847A0 = m50814g0 + m50803o0 + m81439V;
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 37:
                    m81439V = UU8.m81426e((List) unsafe2.getObject(t, j3));
                    if (m81439V > 0) {
                        m50814g0 = zzii.m50814g0(i17);
                        m50803o0 = zzii.m50803o0(m81439V);
                        m50847A0 = m50814g0 + m50803o0 + m81439V;
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 38:
                    m81439V = UU8.m81410u((List) unsafe2.getObject(t, j3));
                    if (m81439V > 0) {
                        m50814g0 = zzii.m50814g0(i17);
                        m50803o0 = zzii.m50803o0(m81439V);
                        m50847A0 = m50814g0 + m50803o0 + m81439V;
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 39:
                    m81439V = UU8.m81452I((List) unsafe2.getObject(t, j3));
                    if (m81439V > 0) {
                        m50814g0 = zzii.m50814g0(i17);
                        m50803o0 = zzii.m50803o0(m81439V);
                        m50847A0 = m50814g0 + m50803o0 + m81439V;
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 40:
                    m81439V = UU8.m81439V((List) unsafe2.getObject(t, j3));
                    if (m81439V > 0) {
                        m50814g0 = zzii.m50814g0(i17);
                        m50803o0 = zzii.m50803o0(m81439V);
                        m50847A0 = m50814g0 + m50803o0 + m81439V;
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 41:
                    m81439V = UU8.m81442S((List) unsafe2.getObject(t, j3));
                    if (m81439V > 0) {
                        m50814g0 = zzii.m50814g0(i17);
                        m50803o0 = zzii.m50803o0(m81439V);
                        m50847A0 = m50814g0 + m50803o0 + m81439V;
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 42:
                    m81439V = UU8.m81436Y((List) unsafe2.getObject(t, j3));
                    if (m81439V > 0) {
                        m50814g0 = zzii.m50814g0(i17);
                        m50803o0 = zzii.m50803o0(m81439V);
                        m50847A0 = m50814g0 + m50803o0 + m81439V;
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 43:
                    m81439V = UU8.m81448M((List) unsafe2.getObject(t, j3));
                    if (m81439V > 0) {
                        m50814g0 = zzii.m50814g0(i17);
                        m50803o0 = zzii.m50803o0(m81439V);
                        m50847A0 = m50814g0 + m50803o0 + m81439V;
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 44:
                    m81439V = UU8.m81456E((List) unsafe2.getObject(t, j3));
                    if (m81439V > 0) {
                        m50814g0 = zzii.m50814g0(i17);
                        m50803o0 = zzii.m50803o0(m81439V);
                        m50847A0 = m50814g0 + m50803o0 + m81439V;
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 45:
                    m81439V = UU8.m81442S((List) unsafe2.getObject(t, j3));
                    if (m81439V > 0) {
                        m50814g0 = zzii.m50814g0(i17);
                        m50803o0 = zzii.m50803o0(m81439V);
                        m50847A0 = m50814g0 + m50803o0 + m81439V;
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 46:
                    m81439V = UU8.m81439V((List) unsafe2.getObject(t, j3));
                    if (m81439V > 0) {
                        m50814g0 = zzii.m50814g0(i17);
                        m50803o0 = zzii.m50803o0(m81439V);
                        m50847A0 = m50814g0 + m50803o0 + m81439V;
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 47:
                    m81439V = UU8.m81445P((List) unsafe2.getObject(t, j3));
                    if (m81439V > 0) {
                        m50814g0 = zzii.m50814g0(i17);
                        m50803o0 = zzii.m50803o0(m81439V);
                        m50847A0 = m50814g0 + m50803o0 + m81439V;
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 48:
                    m81439V = UU8.m81460A((List) unsafe2.getObject(t, j3));
                    if (m81439V > 0) {
                        m50814g0 = zzii.m50814g0(i17);
                        m50803o0 = zzii.m50803o0(m81439V);
                        m50847A0 = m50814g0 + m50803o0 + m81439V;
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 49:
                    m50842D = UU8.m81412s(i17, (List) unsafe2.getObject(t, j3), m50936r(i14));
                    i15 += m50842D;
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 50:
                    m50842D = this.f71257q.mo14228d(i17, unsafe2.getObject(t, j3), m50963D(i14));
                    i15 += m50842D;
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 51:
                    if (m50929y(t, i17, i14)) {
                        m50842D = zzii.m50846B(i17, 0.0d);
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 52:
                    if (m50929y(t, i17, i14)) {
                        m50847A0 = zzii.m50844C(i17, 0.0f);
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 53:
                    if (m50929y(t, i17, i14)) {
                        m50842D = zzii.m50822b0(i17, m50952O(t, j3));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 54:
                    if (m50929y(t, i17, i14)) {
                        m50842D = zzii.m50812h0(i17, m50952O(t, j3));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 55:
                    if (m50929y(t, i17, i14)) {
                        m50842D = zzii.m50806l0(i17, m50954M(t, j3));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 56:
                    if (m50929y(t, i17, i14)) {
                        m50842D = zzii.m50801q0(i17, 0L);
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 57:
                    if (m50929y(t, i17, i14)) {
                        m50847A0 = zzii.m50793x0(i17, 0);
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 58:
                    if (m50929y(t, i17, i14)) {
                        m50847A0 = zzii.m50836H(i17, true);
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 59:
                    if (m50929y(t, i17, i14)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof AbstractC53119zy8) {
                            m50842D = zzii.m50827T(i17, (AbstractC53119zy8) object2);
                        } else {
                            m50842D = zzii.m50842D(i17, (String) object2);
                        }
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 60:
                    if (m50929y(t, i17, i14)) {
                        m50842D = UU8.m81434a(i17, unsafe2.getObject(t, j3), m50936r(i14));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 61:
                    if (m50929y(t, i17, i14)) {
                        m50842D = zzii.m50827T(i17, (AbstractC53119zy8) unsafe2.getObject(t, j3));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 62:
                    if (m50929y(t, i17, i14)) {
                        m50842D = zzii.m50802p0(i17, m50954M(t, j3));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 63:
                    if (m50929y(t, i17, i14)) {
                        m50842D = zzii.m50843C0(i17, m50954M(t, j3));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 64:
                    if (m50929y(t, i17, i14)) {
                        m50847A0 = zzii.m50847A0(i17, 0);
                        i15 += m50847A0;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 65:
                    if (m50929y(t, i17, i14)) {
                        m50842D = zzii.m50797u0(i17, 0L);
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 66:
                    if (m50929y(t, i17, i14)) {
                        m50842D = zzii.m50798t0(i17, m50954M(t, j3));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 67:
                    if (m50929y(t, i17, i14)) {
                        m50842D = zzii.m50805m0(i17, m50952O(t, j3));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 68:
                    if (m50929y(t, i17, i14)) {
                        m50842D = zzii.m50826U(i17, (InterfaceC44489lQ8) unsafe2.getObject(t, j3), m50936r(i14));
                        i15 += m50842D;
                    }
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                default:
                    i2 = 1;
                    i3 = 0;
                    j = 0;
                    i14 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
            }
            i14 += 3;
            i6 = i2;
            i7 = i3;
            i5 = 1048575;
        }
        int i21 = i7;
        int m50942l = i15 + m50942l(this.f71255o, t);
        if (this.f71246f) {
            C47355qF8<?> mo8967d = this.f71256p.mo8967d(t);
            for (int i22 = i21; i22 < mo8967d.f104998a.m113933j(); i22++) {
                Map.Entry<?, Object> m113935h = mo8967d.f104998a.m113935h(i22);
                i21 += C47355qF8.m17719m((OF8) m113935h.getKey(), m113935h.getValue());
            }
            for (Map.Entry<?, Object> entry : mo8967d.f104998a.m113930m()) {
                i21 += C47355qF8.m17719m((OF8) entry.getKey(), entry.getValue());
            }
            return m50942l + i21;
        }
        return m50942l;
    }

    @Override // p000.InterfaceC52825zU8
    public final void zzc(T t) {
        int i;
        int i2 = this.f71251k;
        while (true) {
            i = this.f71252l;
            if (i2 >= i) {
                break;
            }
            long m50955L = m50955L(this.f71250j[i2]) & 1048575;
            Object m85273F = SZ8.m85273F(t, m50955L);
            if (m85273F != null) {
                SZ8.m85254j(t, m50955L, this.f71257q.mo14230b(m85273F));
            }
            i2++;
        }
        int length = this.f71250j.length;
        while (i < length) {
            this.f71254n.mo14265e(t, this.f71250j[i]);
            i++;
        }
        this.f71255o.mo41181q(t);
        if (this.f71246f) {
            this.f71256p.mo8961j(t);
        }
    }

    @Override // p000.InterfaceC52825zU8
    public final int zza(T t) {
        int i;
        int m3693b;
        int length = this.f71241a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m50955L = m50955L(i3);
            int i4 = this.f71241a[i3];
            long j = 1048575 & m50955L;
            int i5 = 37;
            switch ((m50955L & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    m3693b = C52124yI8.m3693b(Double.doubleToLongBits(SZ8.m85276C(t, j)));
                    i2 = i + m3693b;
                    break;
                case 1:
                    i = i2 * 53;
                    m3693b = Float.floatToIntBits(SZ8.m85240x(t, j));
                    i2 = i + m3693b;
                    break;
                case 2:
                    i = i2 * 53;
                    m3693b = C52124yI8.m3693b(SZ8.m85249o(t, j));
                    i2 = i + m3693b;
                    break;
                case 3:
                    i = i2 * 53;
                    m3693b = C52124yI8.m3693b(SZ8.m85249o(t, j));
                    i2 = i + m3693b;
                    break;
                case 4:
                    i = i2 * 53;
                    m3693b = SZ8.m85262b(t, j);
                    i2 = i + m3693b;
                    break;
                case 5:
                    i = i2 * 53;
                    m3693b = C52124yI8.m3693b(SZ8.m85249o(t, j));
                    i2 = i + m3693b;
                    break;
                case 6:
                    i = i2 * 53;
                    m3693b = SZ8.m85262b(t, j);
                    i2 = i + m3693b;
                    break;
                case 7:
                    i = i2 * 53;
                    m3693b = C52124yI8.m3692c(SZ8.m85241w(t, j));
                    i2 = i + m3693b;
                    break;
                case 8:
                    i = i2 * 53;
                    m3693b = ((String) SZ8.m85273F(t, j)).hashCode();
                    i2 = i + m3693b;
                    break;
                case 9:
                    Object m85273F = SZ8.m85273F(t, j);
                    if (m85273F != null) {
                        i5 = m85273F.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    m3693b = SZ8.m85273F(t, j).hashCode();
                    i2 = i + m3693b;
                    break;
                case 11:
                    i = i2 * 53;
                    m3693b = SZ8.m85262b(t, j);
                    i2 = i + m3693b;
                    break;
                case 12:
                    i = i2 * 53;
                    m3693b = SZ8.m85262b(t, j);
                    i2 = i + m3693b;
                    break;
                case 13:
                    i = i2 * 53;
                    m3693b = SZ8.m85262b(t, j);
                    i2 = i + m3693b;
                    break;
                case 14:
                    i = i2 * 53;
                    m3693b = C52124yI8.m3693b(SZ8.m85249o(t, j));
                    i2 = i + m3693b;
                    break;
                case 15:
                    i = i2 * 53;
                    m3693b = SZ8.m85262b(t, j);
                    i2 = i + m3693b;
                    break;
                case 16:
                    i = i2 * 53;
                    m3693b = C52124yI8.m3693b(SZ8.m85249o(t, j));
                    i2 = i + m3693b;
                    break;
                case 17:
                    Object m85273F2 = SZ8.m85273F(t, j);
                    if (m85273F2 != null) {
                        i5 = m85273F2.hashCode();
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
                    m3693b = SZ8.m85273F(t, j).hashCode();
                    i2 = i + m3693b;
                    break;
                case 50:
                    i = i2 * 53;
                    m3693b = SZ8.m85273F(t, j).hashCode();
                    i2 = i + m3693b;
                    break;
                case 51:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = C52124yI8.m3693b(Double.doubleToLongBits(m50965B(t, j)));
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = Float.floatToIntBits(m50958I(t, j));
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = C52124yI8.m3693b(m50952O(t, j));
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = C52124yI8.m3693b(m50952O(t, j));
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = m50954M(t, j);
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = C52124yI8.m3693b(m50952O(t, j));
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = m50954M(t, j);
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = C52124yI8.m3692c(m50949R(t, j));
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = ((String) SZ8.m85273F(t, j)).hashCode();
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = SZ8.m85273F(t, j).hashCode();
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = SZ8.m85273F(t, j).hashCode();
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = m50954M(t, j);
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = m50954M(t, j);
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = m50954M(t, j);
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = C52124yI8.m3693b(m50952O(t, j));
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = m50954M(t, j);
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = C52124yI8.m3693b(m50952O(t, j));
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m50929y(t, i4, i3)) {
                        i = i2 * 53;
                        m3693b = SZ8.m85273F(t, j).hashCode();
                        i2 = i + m3693b;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f71255o.mo41187k(t).hashCode();
        return this.f71246f ? (hashCode * 53) + this.f71256p.mo8967d(t).hashCode() : hashCode;
    }
}
