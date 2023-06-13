package p000;

import com.google.android.gms.internal.mlkit_vision_face_bundled.zzov;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;
/* renamed from: Lg9 */
/* loaded from: classes5.dex */
public final class Lg9<T> implements Ei9<T> {

    /* renamed from: p */
    public static final int[] f21910p = new int[0];

    /* renamed from: q */
    public static final Unsafe f21911q = C51221wm9.m6355l();

    /* renamed from: a */
    public final int[] f21912a;

    /* renamed from: b */
    public final Object[] f21913b;

    /* renamed from: c */
    public final int f21914c;

    /* renamed from: d */
    public final int f21915d;

    /* renamed from: e */
    public final InterfaceC47012pg9 f21916e;

    /* renamed from: f */
    public final boolean f21917f;

    /* renamed from: g */
    public final boolean f21918g;

    /* renamed from: h */
    public final int[] f21919h;

    /* renamed from: i */
    public final int f21920i;

    /* renamed from: j */
    public final int f21921j;

    /* renamed from: k */
    public final Ce9 f21922k;

    /* renamed from: l */
    public final Mk9 f21923l;

    /* renamed from: m */
    public final U89 f21924m;

    /* renamed from: n */
    public final C43464jh9 f21925n;

    /* renamed from: o */
    public final Ef9 f21926o;

    public Lg9(int[] iArr, Object[] objArr, int i, int i2, InterfaceC47012pg9 interfaceC47012pg9, boolean z, boolean z2, int[] iArr2, int i3, int i4, C43464jh9 c43464jh9, Ce9 ce9, Mk9 mk9, U89 u89, Ef9 ef9, byte[] bArr) {
        this.f21912a = iArr;
        this.f21913b = objArr;
        this.f21914c = i;
        this.f21915d = i2;
        this.f21918g = z;
        boolean z3 = false;
        if (u89 != null && u89.mo81911f(interfaceC47012pg9)) {
            z3 = true;
        }
        this.f21917f = z3;
        this.f21919h = iArr2;
        this.f21920i = i3;
        this.f21921j = i4;
        this.f21925n = c43464jh9;
        this.f21922k = ce9;
        this.f21923l = mk9;
        this.f21924m = u89;
        this.f21916e = interfaceC47012pg9;
        this.f21926o = ef9;
    }

    /* renamed from: A */
    public static Sk9 m96474A(Object obj) {
        AbstractC49926ub9 abstractC49926ub9 = (AbstractC49926ub9) obj;
        Sk9 sk9 = abstractC49926ub9.zzc;
        if (sk9 == Sk9.m84915c()) {
            Sk9 m84913e = Sk9.m84913e();
            abstractC49926ub9.zzc = m84913e;
            return m84913e;
        }
        return sk9;
    }

    /* renamed from: B */
    public static Lg9 m96473B(Class cls, Tf9 tf9, C43464jh9 c43464jh9, Ce9 ce9, Mk9 mk9, U89 u89, Ef9 ef9) {
        if (tf9 instanceof C51181wi9) {
            return m96472C((C51181wi9) tf9, c43464jh9, ce9, mk9, u89, ef9);
        }
        C50608vk9 c50608vk9 = (C50608vk9) tf9;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0384  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Lg9 m96472C(C51181wi9 c51181wi9, C43464jh9 c43464jh9, Ce9 ce9, Mk9 mk9, U89 u89, Ef9 ef9) {
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
        Field m96452l;
        char charAt12;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field m96452l2;
        Object obj2;
        Field m96452l3;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        int i31;
        char charAt15;
        int i32;
        char charAt16;
        if (c51181wi9.zzc() == 2) {
            z = true;
        } else {
            z = false;
        }
        String m6450a = c51181wi9.m6450a();
        int length = m6450a.length();
        char c = 55296;
        if (m6450a.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (m6450a.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int charAt17 = m6450a.charAt(i);
        if (charAt17 >= 55296) {
            int i35 = charAt17 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                charAt16 = m6450a.charAt(i34);
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
            iArr = f21910p;
            i3 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt18 = m6450a.charAt(i34);
            if (charAt18 >= 55296) {
                int i38 = charAt18 & 8191;
                int i39 = 13;
                while (true) {
                    i13 = i37 + 1;
                    charAt11 = m6450a.charAt(i37);
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
            int charAt19 = m6450a.charAt(i37);
            if (charAt19 >= 55296) {
                int i41 = charAt19 & 8191;
                int i42 = 13;
                while (true) {
                    i12 = i40 + 1;
                    charAt10 = m6450a.charAt(i40);
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
            charAt = m6450a.charAt(i40);
            if (charAt >= 55296) {
                int i44 = charAt & 8191;
                int i45 = 13;
                while (true) {
                    i11 = i43 + 1;
                    charAt9 = m6450a.charAt(i43);
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
            int charAt20 = m6450a.charAt(i43);
            if (charAt20 >= 55296) {
                int i47 = charAt20 & 8191;
                int i48 = 13;
                while (true) {
                    i10 = i46 + 1;
                    charAt8 = m6450a.charAt(i46);
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
            charAt2 = m6450a.charAt(i46);
            if (charAt2 >= 55296) {
                int i50 = charAt2 & 8191;
                int i51 = 13;
                while (true) {
                    i9 = i49 + 1;
                    charAt7 = m6450a.charAt(i49);
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
            int charAt21 = m6450a.charAt(i49);
            if (charAt21 >= 55296) {
                int i53 = charAt21 & 8191;
                int i54 = 13;
                while (true) {
                    i8 = i52 + 1;
                    charAt6 = m6450a.charAt(i52);
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
            int charAt22 = m6450a.charAt(i52);
            if (charAt22 >= 55296) {
                int i56 = charAt22 & 8191;
                int i57 = 13;
                while (true) {
                    i7 = i55 + 1;
                    charAt5 = m6450a.charAt(i55);
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
            charAt3 = m6450a.charAt(i55);
            if (charAt3 >= 55296) {
                int i59 = charAt3 & 8191;
                int i60 = 13;
                while (true) {
                    i6 = i58 + 1;
                    charAt4 = m6450a.charAt(i58);
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
        Unsafe unsafe = f21911q;
        Object[] m6449b = c51181wi9.m6449b();
        Class<?> cls = c51181wi9.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i62 = charAt3 + i5;
        int i63 = charAt3;
        int i64 = i62;
        int i65 = 0;
        int i66 = 0;
        while (i34 < length) {
            int i67 = i34 + 1;
            int charAt23 = m6450a.charAt(i34);
            if (charAt23 >= c) {
                int i68 = charAt23 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i31 = i69 + 1;
                    charAt15 = m6450a.charAt(i69);
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
            int charAt24 = m6450a.charAt(i14);
            if (charAt24 >= c) {
                int i72 = charAt24 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i30 = i73 + 1;
                    charAt14 = m6450a.charAt(i73);
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
                int charAt25 = m6450a.charAt(i16);
                if (charAt25 >= 55296) {
                    int i78 = charAt25 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i29 = i79 + 1;
                        charAt13 = m6450a.charAt(i79);
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
                        objArr2[i82 + i82 + 1] = m6449b[i2];
                    }
                    int i83 = charAt25 + charAt25;
                    obj = m6449b[i83];
                    if (!(obj instanceof Field)) {
                        m96452l2 = (Field) obj;
                    } else {
                        m96452l2 = m96452l(cls, (String) obj);
                        m6449b[i83] = m96452l2;
                    }
                    iArr2 = iArr3;
                    i17 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m96452l2);
                    int i84 = i83 + 1;
                    obj2 = m6449b[i84];
                    if (!(obj2 instanceof Field)) {
                        m96452l3 = (Field) obj2;
                    } else {
                        m96452l3 = m96452l(cls, (String) obj2);
                        m6449b[i84] = m96452l3;
                    }
                    str = m6450a;
                    i21 = (int) unsafe.objectFieldOffset(m96452l3);
                    objArr = objArr2;
                    objectFieldOffset = objectFieldOffset2;
                    i23 = 0;
                } else {
                    int i85 = i65 / 3;
                    i28 = i2 + 1;
                    objArr2[i85 + i85 + 1] = m6449b[i2];
                }
                i2 = i28;
                int i832 = charAt25 + charAt25;
                obj = m6449b[i832];
                if (!(obj instanceof Field)) {
                }
                iArr2 = iArr3;
                i17 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m96452l2);
                int i842 = i832 + 1;
                obj2 = m6449b[i842];
                if (!(obj2 instanceof Field)) {
                }
                str = m6450a;
                i21 = (int) unsafe.objectFieldOffset(m96452l3);
                objArr = objArr2;
                objectFieldOffset = objectFieldOffset22;
                i23 = 0;
            } else {
                iArr2 = iArr3;
                i17 = charAt;
                i18 = i4;
                int i86 = i2 + 1;
                Field m96452l4 = m96452l(cls, (String) m6449b[i2]);
                if (i75 != 9 && i75 != 17) {
                    if (i75 != 27 && i75 != 49) {
                        if (i75 != 12 && i75 != 30 && i75 != 44) {
                            if (i75 == 50) {
                                int i87 = i63 + 1;
                                iArr[i63] = i65;
                                int i88 = i65 / 3;
                                int i89 = i88 + i88;
                                int i90 = i86 + 1;
                                objArr2[i89] = m6449b[i86];
                                if ((charAt24 & 2048) != 0) {
                                    i86 = i90 + 1;
                                    objArr2[i89 + 1] = m6449b[i90];
                                    i63 = i87;
                                } else {
                                    i63 = i87;
                                    i19 = i90;
                                    objectFieldOffset = (int) unsafe.objectFieldOffset(m96452l4);
                                    objArr = objArr2;
                                    if ((charAt24 & 4096) != 4096 && i75 <= 17) {
                                        int i91 = i16 + 1;
                                        int charAt26 = m6450a.charAt(i16);
                                        if (charAt26 >= 55296) {
                                            int i92 = charAt26 & 8191;
                                            int i93 = 13;
                                            while (true) {
                                                i22 = i91 + 1;
                                                charAt12 = m6450a.charAt(i91);
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
                                        Object obj3 = m6449b[i94];
                                        str = m6450a;
                                        if (obj3 instanceof Field) {
                                            m96452l = (Field) obj3;
                                        } else {
                                            m96452l = m96452l(cls, (String) obj3);
                                            m6449b[i94] = m96452l;
                                        }
                                        i20 = i19;
                                        i21 = (int) unsafe.objectFieldOffset(m96452l);
                                        i23 = charAt26 % 32;
                                    } else {
                                        str = m6450a;
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
                            objArr2[i95 + i95 + 1] = m6449b[i86];
                        }
                    } else {
                        int i96 = i65 / 3;
                        i24 = i86 + 1;
                        objArr2[i96 + i96 + 1] = m6449b[i86];
                    }
                    i19 = i24;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m96452l4);
                    objArr = objArr2;
                    if ((charAt24 & 4096) != 4096) {
                    }
                    str = m6450a;
                    i20 = i19;
                    i21 = 1048575;
                    i22 = i16;
                    i23 = 0;
                    if (i75 < 18) {
                    }
                    i2 = i20;
                } else {
                    int i97 = i65 / 3;
                    objArr2[i97 + i97 + 1] = m96452l4.getType();
                }
                i19 = i86;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m96452l4);
                objArr = objArr2;
                if ((charAt24 & 4096) != 4096) {
                }
                str = m6450a;
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
            m6450a = str;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new Lg9(iArr3, objArr2, charAt, i4, c51181wi9.zza(), z, false, iArr, charAt3, i62, c43464jh9, ce9, mk9, u89, ef9, null);
    }

    /* renamed from: D */
    public static double m96471D(Object obj, long j) {
        return ((Double) C51221wm9.m6356k(obj, j)).doubleValue();
    }

    /* renamed from: E */
    public static float m96470E(Object obj, long j) {
        return ((Float) C51221wm9.m6356k(obj, j)).floatValue();
    }

    /* renamed from: H */
    public static int m96467H(Object obj, long j) {
        return ((Integer) C51221wm9.m6356k(obj, j)).intValue();
    }

    /* renamed from: f */
    public static int m96458f(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: h */
    public static long m96456h(Object obj, long j) {
        return ((Long) C51221wm9.m6356k(obj, j)).longValue();
    }

    /* renamed from: l */
    public static Field m96452l(Class cls, String str) {
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

    /* renamed from: t */
    public static boolean m96444t(Object obj, int i, Ei9 ei9) {
        return ei9.mo83162e(C51221wm9.m6356k(obj, i & 1048575));
    }

    /* renamed from: v */
    public static boolean m96442v(Object obj, long j) {
        return ((Boolean) C51221wm9.m6356k(obj, j)).booleanValue();
    }

    /* renamed from: y */
    public static final void m96439y(int i, Object obj, C41954h89 c41954h89) throws IOException {
        if (obj instanceof String) {
            c41954h89.m36791g(i, (String) obj);
        } else {
            c41954h89.m36782p(i, (T69) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: F */
    public final int m96469F(Object obj) {
        int i;
        int m73702d;
        int m73702d2;
        int m73702d3;
        int m73701e;
        int m73702d4;
        int m73708E;
        int m73702d5;
        int m73702d6;
        int mo7402c;
        int m73702d7;
        int i2;
        int m83109W;
        boolean z;
        int m83126F;
        int m83121K;
        int m73703c;
        int m73702d8;
        int i3;
        int m73702d9;
        int m73702d10;
        int m73702d11;
        int m73701e2;
        int m73702d12;
        int mo7402c2;
        int m73702d13;
        int i4;
        Unsafe unsafe = f21911q;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < this.f21912a.length) {
            int m96457g = m96457g(i7);
            int[] iArr = this.f21912a;
            int i10 = iArr[i7];
            int m96458f = m96458f(m96457g);
            if (m96458f <= 17) {
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
            long j = m96457g & i5;
            switch (m96458f) {
                case 0:
                    if ((i9 & i) != 0) {
                        m73702d = Z79.m73702d(i10 << 3);
                        m73702d5 = m73702d + 8;
                        i8 += m73702d5;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i9 & i) != 0) {
                        m73702d2 = Z79.m73702d(i10 << 3);
                        m73702d5 = m73702d2 + 4;
                        i8 += m73702d5;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i9 & i) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        m73702d3 = Z79.m73702d(i10 << 3);
                        m73701e = Z79.m73701e(j2);
                        i8 += m73702d3 + m73701e;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i9 & i) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        m73702d3 = Z79.m73702d(i10 << 3);
                        m73701e = Z79.m73701e(j3);
                        i8 += m73702d3 + m73701e;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i9 & i) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        m73702d4 = Z79.m73702d(i10 << 3);
                        m73708E = Z79.m73708E(i13);
                        i2 = m73702d4 + m73708E;
                        i8 += i2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i9 & i) != 0) {
                        m73702d = Z79.m73702d(i10 << 3);
                        m73702d5 = m73702d + 8;
                        i8 += m73702d5;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i9 & i) != 0) {
                        m73702d2 = Z79.m73702d(i10 << 3);
                        m73702d5 = m73702d2 + 4;
                        i8 += m73702d5;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i9 & i) != 0) {
                        m73702d5 = Z79.m73702d(i10 << 3) + 1;
                        i8 += m73702d5;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof T69) {
                            m73702d6 = Z79.m73702d(i10 << 3);
                            mo7402c = ((T69) object).mo7402c();
                            m73702d7 = Z79.m73702d(mo7402c);
                            i2 = m73702d6 + m73702d7 + mo7402c;
                            i8 += i2;
                            break;
                        } else {
                            m73702d4 = Z79.m73702d(i10 << 3);
                            m73708E = Z79.m73704b((String) object);
                            i2 = m73702d4 + m73708E;
                            i8 += i2;
                        }
                    }
                case 9:
                    if ((i9 & i) != 0) {
                        m73702d5 = Ti9.m83115Q(i10, unsafe.getObject(obj, j), m96454j(i7));
                        i8 += m73702d5;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i9 & i) != 0) {
                        m73702d6 = Z79.m73702d(i10 << 3);
                        mo7402c = ((T69) unsafe.getObject(obj, j)).mo7402c();
                        m73702d7 = Z79.m73702d(mo7402c);
                        i2 = m73702d6 + m73702d7 + mo7402c;
                        i8 += i2;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i9 & i) != 0) {
                        int i14 = unsafe.getInt(obj, j);
                        m73702d4 = Z79.m73702d(i10 << 3);
                        m73708E = Z79.m73702d(i14);
                        i2 = m73702d4 + m73708E;
                        i8 += i2;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i9 & i) != 0) {
                        int i15 = unsafe.getInt(obj, j);
                        m73702d4 = Z79.m73702d(i10 << 3);
                        m73708E = Z79.m73708E(i15);
                        i2 = m73702d4 + m73708E;
                        i8 += i2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i9 & i) != 0) {
                        m73702d2 = Z79.m73702d(i10 << 3);
                        m73702d5 = m73702d2 + 4;
                        i8 += m73702d5;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i9 & i) != 0) {
                        m73702d = Z79.m73702d(i10 << 3);
                        m73702d5 = m73702d + 8;
                        i8 += m73702d5;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i9 & i) != 0) {
                        int i16 = unsafe.getInt(obj, j);
                        m73702d4 = Z79.m73702d(i10 << 3);
                        m73708E = Z79.m73702d((i16 >> 31) ^ (i16 + i16));
                        i2 = m73702d4 + m73708E;
                        i8 += i2;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i & i9) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        i8 += Z79.m73702d(i10 << 3) + Z79.m73701e((j4 >> 63) ^ (j4 + j4));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i9 & i) != 0) {
                        m73702d5 = Z79.m73710C(i10, (InterfaceC47012pg9) unsafe.getObject(obj, j), m96454j(i7));
                        i8 += m73702d5;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m73702d5 = Ti9.m83122J(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m73702d5;
                    break;
                case 19:
                    m73702d5 = Ti9.m83124H(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m73702d5;
                    break;
                case 20:
                    m73702d5 = Ti9.m83117O(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m73702d5;
                    break;
                case 21:
                    m73702d5 = Ti9.m83106Z(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m73702d5;
                    break;
                case 22:
                    m73702d5 = Ti9.m83119M(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m73702d5;
                    break;
                case 23:
                    m73702d5 = Ti9.m83122J(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m73702d5;
                    break;
                case 24:
                    m73702d5 = Ti9.m83124H(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m73702d5;
                    break;
                case 25:
                    m73702d5 = Ti9.m83131A(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m73702d5;
                    break;
                case 26:
                    m83109W = Ti9.m83109W(i10, (List) unsafe.getObject(obj, j));
                    i8 += m83109W;
                    break;
                case 27:
                    m83109W = Ti9.m83114R(i10, (List) unsafe.getObject(obj, j), m96454j(i7));
                    i8 += m83109W;
                    break;
                case 28:
                    m83109W = Ti9.m83127E(i10, (List) unsafe.getObject(obj, j));
                    i8 += m83109W;
                    break;
                case 29:
                    m83109W = Ti9.m83108X(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m83109W;
                    break;
                case 30:
                    z = false;
                    m83126F = Ti9.m83126F(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m83126F;
                    break;
                case 31:
                    z = false;
                    m83126F = Ti9.m83124H(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m83126F;
                    break;
                case 32:
                    z = false;
                    m83126F = Ti9.m83122J(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m83126F;
                    break;
                case 33:
                    z = false;
                    m83126F = Ti9.m83113S(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m83126F;
                    break;
                case 34:
                    z = false;
                    m83126F = Ti9.m83111U(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += m83126F;
                    break;
                case 35:
                    m83121K = Ti9.m83121K((List) unsafe.getObject(obj, j));
                    if (m83121K > 0) {
                        m73703c = Z79.m73703c(i10);
                        m73702d8 = Z79.m73702d(m83121K);
                        i3 = m73703c + m73702d8;
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 36:
                    m83121K = Ti9.m83123I((List) unsafe.getObject(obj, j));
                    if (m83121K > 0) {
                        m73703c = Z79.m73703c(i10);
                        m73702d8 = Z79.m73702d(m83121K);
                        i3 = m73703c + m73702d8;
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 37:
                    m83121K = Ti9.m83116P((List) unsafe.getObject(obj, j));
                    if (m83121K > 0) {
                        m73703c = Z79.m73703c(i10);
                        m73702d8 = Z79.m73702d(m83121K);
                        i3 = m73703c + m73702d8;
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 38:
                    m83121K = Ti9.m83104a0((List) unsafe.getObject(obj, j));
                    if (m83121K > 0) {
                        m73703c = Z79.m73703c(i10);
                        m73702d8 = Z79.m73702d(m83121K);
                        i3 = m73703c + m73702d8;
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 39:
                    m83121K = Ti9.m83118N((List) unsafe.getObject(obj, j));
                    if (m83121K > 0) {
                        m73703c = Z79.m73703c(i10);
                        m73702d8 = Z79.m73702d(m83121K);
                        i3 = m73703c + m73702d8;
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 40:
                    m83121K = Ti9.m83121K((List) unsafe.getObject(obj, j));
                    if (m83121K > 0) {
                        m73703c = Z79.m73703c(i10);
                        m73702d8 = Z79.m73702d(m83121K);
                        i3 = m73703c + m73702d8;
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 41:
                    m83121K = Ti9.m83123I((List) unsafe.getObject(obj, j));
                    if (m83121K > 0) {
                        m73703c = Z79.m73703c(i10);
                        m73702d8 = Z79.m73702d(m83121K);
                        i3 = m73703c + m73702d8;
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 42:
                    m83121K = Ti9.m83128D((List) unsafe.getObject(obj, j));
                    if (m83121K > 0) {
                        m73703c = Z79.m73703c(i10);
                        m73702d8 = Z79.m73702d(m83121K);
                        i3 = m73703c + m73702d8;
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 43:
                    m83121K = Ti9.m83107Y((List) unsafe.getObject(obj, j));
                    if (m83121K > 0) {
                        m73703c = Z79.m73703c(i10);
                        m73702d8 = Z79.m73702d(m83121K);
                        i3 = m73703c + m73702d8;
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 44:
                    m83121K = Ti9.m83125G((List) unsafe.getObject(obj, j));
                    if (m83121K > 0) {
                        m73703c = Z79.m73703c(i10);
                        m73702d8 = Z79.m73702d(m83121K);
                        i3 = m73703c + m73702d8;
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 45:
                    m83121K = Ti9.m83123I((List) unsafe.getObject(obj, j));
                    if (m83121K > 0) {
                        m73703c = Z79.m73703c(i10);
                        m73702d8 = Z79.m73702d(m83121K);
                        i3 = m73703c + m73702d8;
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 46:
                    m83121K = Ti9.m83121K((List) unsafe.getObject(obj, j));
                    if (m83121K > 0) {
                        m73703c = Z79.m73703c(i10);
                        m73702d8 = Z79.m73702d(m83121K);
                        i3 = m73703c + m73702d8;
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 47:
                    m83121K = Ti9.m83112T((List) unsafe.getObject(obj, j));
                    if (m83121K > 0) {
                        m73703c = Z79.m73703c(i10);
                        m73702d8 = Z79.m73702d(m83121K);
                        i3 = m73703c + m73702d8;
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 48:
                    m83121K = Ti9.m83110V((List) unsafe.getObject(obj, j));
                    if (m83121K > 0) {
                        m73703c = Z79.m73703c(i10);
                        m73702d8 = Z79.m73702d(m83121K);
                        i3 = m73703c + m73702d8;
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 49:
                    m83109W = Ti9.m83120L(i10, (List) unsafe.getObject(obj, j), m96454j(i7));
                    i8 += m83109W;
                    break;
                case 50:
                    Ef9.m108586a(i10, unsafe.getObject(obj, j), m96453k(i7));
                    break;
                case 51:
                    if (m96443u(obj, i10, i7)) {
                        m73702d9 = Z79.m73702d(i10 << 3);
                        m83109W = m73702d9 + 8;
                        i8 += m83109W;
                    }
                    break;
                case 52:
                    if (m96443u(obj, i10, i7)) {
                        m73702d10 = Z79.m73702d(i10 << 3);
                        m83109W = m73702d10 + 4;
                        i8 += m83109W;
                    }
                    break;
                case 53:
                    if (m96443u(obj, i10, i7)) {
                        long m96456h = m96456h(obj, j);
                        m73702d11 = Z79.m73702d(i10 << 3);
                        m73701e2 = Z79.m73701e(m96456h);
                        i8 += m73702d11 + m73701e2;
                    }
                    break;
                case 54:
                    if (m96443u(obj, i10, i7)) {
                        long m96456h2 = m96456h(obj, j);
                        m73702d11 = Z79.m73702d(i10 << 3);
                        m73701e2 = Z79.m73701e(m96456h2);
                        i8 += m73702d11 + m73701e2;
                    }
                    break;
                case 55:
                    if (m96443u(obj, i10, i7)) {
                        int m96467H = m96467H(obj, j);
                        i3 = Z79.m73702d(i10 << 3);
                        m83121K = Z79.m73708E(m96467H);
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 56:
                    if (m96443u(obj, i10, i7)) {
                        m73702d9 = Z79.m73702d(i10 << 3);
                        m83109W = m73702d9 + 8;
                        i8 += m83109W;
                    }
                    break;
                case 57:
                    if (m96443u(obj, i10, i7)) {
                        m73702d10 = Z79.m73702d(i10 << 3);
                        m83109W = m73702d10 + 4;
                        i8 += m83109W;
                    }
                    break;
                case 58:
                    if (m96443u(obj, i10, i7)) {
                        m83109W = Z79.m73702d(i10 << 3) + 1;
                        i8 += m83109W;
                    }
                    break;
                case 59:
                    if (m96443u(obj, i10, i7)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof T69) {
                            m73702d12 = Z79.m73702d(i10 << 3);
                            mo7402c2 = ((T69) object2).mo7402c();
                            m73702d13 = Z79.m73702d(mo7402c2);
                            i4 = m73702d12 + m73702d13 + mo7402c2;
                            i8 += i4;
                        } else {
                            i3 = Z79.m73702d(i10 << 3);
                            m83121K = Z79.m73704b((String) object2);
                            i4 = i3 + m83121K;
                            i8 += i4;
                        }
                    }
                    break;
                case 60:
                    if (m96443u(obj, i10, i7)) {
                        m83109W = Ti9.m83115Q(i10, unsafe.getObject(obj, j), m96454j(i7));
                        i8 += m83109W;
                    }
                    break;
                case 61:
                    if (m96443u(obj, i10, i7)) {
                        m73702d12 = Z79.m73702d(i10 << 3);
                        mo7402c2 = ((T69) unsafe.getObject(obj, j)).mo7402c();
                        m73702d13 = Z79.m73702d(mo7402c2);
                        i4 = m73702d12 + m73702d13 + mo7402c2;
                        i8 += i4;
                    }
                    break;
                case 62:
                    if (m96443u(obj, i10, i7)) {
                        int m96467H2 = m96467H(obj, j);
                        i3 = Z79.m73702d(i10 << 3);
                        m83121K = Z79.m73702d(m96467H2);
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 63:
                    if (m96443u(obj, i10, i7)) {
                        int m96467H3 = m96467H(obj, j);
                        i3 = Z79.m73702d(i10 << 3);
                        m83121K = Z79.m73708E(m96467H3);
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 64:
                    if (m96443u(obj, i10, i7)) {
                        m73702d10 = Z79.m73702d(i10 << 3);
                        m83109W = m73702d10 + 4;
                        i8 += m83109W;
                    }
                    break;
                case 65:
                    if (m96443u(obj, i10, i7)) {
                        m73702d9 = Z79.m73702d(i10 << 3);
                        m83109W = m73702d9 + 8;
                        i8 += m83109W;
                    }
                    break;
                case 66:
                    if (m96443u(obj, i10, i7)) {
                        int m96467H4 = m96467H(obj, j);
                        i3 = Z79.m73702d(i10 << 3);
                        m83121K = Z79.m73702d((m96467H4 >> 31) ^ (m96467H4 + m96467H4));
                        i4 = i3 + m83121K;
                        i8 += i4;
                    }
                    break;
                case 67:
                    if (m96443u(obj, i10, i7)) {
                        long m96456h3 = m96456h(obj, j);
                        i8 += Z79.m73702d(i10 << 3) + Z79.m73701e((m96456h3 >> 63) ^ (m96456h3 + m96456h3));
                    }
                    break;
                case 68:
                    if (m96443u(obj, i10, i7)) {
                        m83109W = Z79.m73710C(i10, (InterfaceC47012pg9) unsafe.getObject(obj, j), m96454j(i7));
                        i8 += m83109W;
                    }
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        int i17 = 0;
        Mk9 mk9 = this.f21923l;
        int mo74331a = i8 + mk9.mo74331a(mk9.mo74329c(obj));
        if (this.f21917f) {
            C39837da9 mo81915b = this.f21924m.mo81915b(obj);
            for (int i18 = 0; i18 < mo81915b.f76816a.m18843b(); i18++) {
                Map.Entry m18838g = mo81915b.f76816a.m18838g(i18);
                i17 += C39837da9.m44111a((W99) m18838g.getKey(), m18838g.getValue());
            }
            for (Map.Entry entry : mo81915b.f76816a.m18842c()) {
                i17 += C39837da9.m44111a((W99) entry.getKey(), entry.getValue());
            }
            return mo74331a + i17;
        }
        return mo74331a;
    }

    /* renamed from: G */
    public final int m96468G(Object obj) {
        int m73702d;
        int m73702d2;
        int m73702d3;
        int m73701e;
        int m73702d4;
        int m73708E;
        int m73702d5;
        int m73702d6;
        int mo7402c;
        int m73702d7;
        int m83115Q;
        int m73703c;
        int m73702d8;
        int i;
        Unsafe unsafe = f21911q;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f21912a.length; i3 += 3) {
            int m96457g = m96457g(i3);
            int m96458f = m96458f(m96457g);
            int i4 = this.f21912a[i3];
            long j = m96457g & 1048575;
            if (m96458f >= EnumC43987ka9.f94563R.zza() && m96458f <= EnumC43987ka9.f94593u0.zza()) {
                int i5 = this.f21912a[i3 + 2];
            }
            switch (m96458f) {
                case 0:
                    if (m96446r(obj, i3)) {
                        m73702d = Z79.m73702d(i4 << 3);
                        m83115Q = m73702d + 8;
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m96446r(obj, i3)) {
                        m73702d2 = Z79.m73702d(i4 << 3);
                        m83115Q = m73702d2 + 4;
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m96446r(obj, i3)) {
                        long m6358i = C51221wm9.m6358i(obj, j);
                        m73702d3 = Z79.m73702d(i4 << 3);
                        m73701e = Z79.m73701e(m6358i);
                        i2 += m73702d3 + m73701e;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m96446r(obj, i3)) {
                        long m6358i2 = C51221wm9.m6358i(obj, j);
                        m73702d3 = Z79.m73702d(i4 << 3);
                        m73701e = Z79.m73701e(m6358i2);
                        i2 += m73702d3 + m73701e;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m96446r(obj, i3)) {
                        int m6359h = C51221wm9.m6359h(obj, j);
                        m73702d4 = Z79.m73702d(i4 << 3);
                        m73708E = Z79.m73708E(m6359h);
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m96446r(obj, i3)) {
                        m73702d = Z79.m73702d(i4 << 3);
                        m83115Q = m73702d + 8;
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m96446r(obj, i3)) {
                        m73702d2 = Z79.m73702d(i4 << 3);
                        m83115Q = m73702d2 + 4;
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m96446r(obj, i3)) {
                        m73702d5 = Z79.m73702d(i4 << 3);
                        m83115Q = m73702d5 + 1;
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m96446r(obj, i3)) {
                        break;
                    } else {
                        Object m6356k = C51221wm9.m6356k(obj, j);
                        if (m6356k instanceof T69) {
                            m73702d6 = Z79.m73702d(i4 << 3);
                            mo7402c = ((T69) m6356k).mo7402c();
                            m73702d7 = Z79.m73702d(mo7402c);
                            i = m73702d6 + m73702d7 + mo7402c;
                            i2 += i;
                            break;
                        } else {
                            m73702d4 = Z79.m73702d(i4 << 3);
                            m73708E = Z79.m73704b((String) m6356k);
                            i = m73702d4 + m73708E;
                            i2 += i;
                        }
                    }
                case 9:
                    if (m96446r(obj, i3)) {
                        m83115Q = Ti9.m83115Q(i4, C51221wm9.m6356k(obj, j), m96454j(i3));
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m96446r(obj, i3)) {
                        m73702d6 = Z79.m73702d(i4 << 3);
                        mo7402c = ((T69) C51221wm9.m6356k(obj, j)).mo7402c();
                        m73702d7 = Z79.m73702d(mo7402c);
                        i = m73702d6 + m73702d7 + mo7402c;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m96446r(obj, i3)) {
                        int m6359h2 = C51221wm9.m6359h(obj, j);
                        m73702d4 = Z79.m73702d(i4 << 3);
                        m73708E = Z79.m73702d(m6359h2);
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m96446r(obj, i3)) {
                        int m6359h3 = C51221wm9.m6359h(obj, j);
                        m73702d4 = Z79.m73702d(i4 << 3);
                        m73708E = Z79.m73708E(m6359h3);
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m96446r(obj, i3)) {
                        m73702d2 = Z79.m73702d(i4 << 3);
                        m83115Q = m73702d2 + 4;
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m96446r(obj, i3)) {
                        m73702d = Z79.m73702d(i4 << 3);
                        m83115Q = m73702d + 8;
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m96446r(obj, i3)) {
                        int m6359h4 = C51221wm9.m6359h(obj, j);
                        m73702d4 = Z79.m73702d(i4 << 3);
                        m73708E = Z79.m73702d((m6359h4 >> 31) ^ (m6359h4 + m6359h4));
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m96446r(obj, i3)) {
                        long m6358i3 = C51221wm9.m6358i(obj, j);
                        m73702d4 = Z79.m73702d(i4 << 3);
                        m73708E = Z79.m73701e((m6358i3 >> 63) ^ (m6358i3 + m6358i3));
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m96446r(obj, i3)) {
                        m83115Q = Z79.m73710C(i4, (InterfaceC47012pg9) C51221wm9.m6356k(obj, j), m96454j(i3));
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m83115Q = Ti9.m83122J(i4, (List) C51221wm9.m6356k(obj, j), false);
                    i2 += m83115Q;
                    break;
                case 19:
                    m83115Q = Ti9.m83124H(i4, (List) C51221wm9.m6356k(obj, j), false);
                    i2 += m83115Q;
                    break;
                case 20:
                    m83115Q = Ti9.m83117O(i4, (List) C51221wm9.m6356k(obj, j), false);
                    i2 += m83115Q;
                    break;
                case 21:
                    m83115Q = Ti9.m83106Z(i4, (List) C51221wm9.m6356k(obj, j), false);
                    i2 += m83115Q;
                    break;
                case 22:
                    m83115Q = Ti9.m83119M(i4, (List) C51221wm9.m6356k(obj, j), false);
                    i2 += m83115Q;
                    break;
                case 23:
                    m83115Q = Ti9.m83122J(i4, (List) C51221wm9.m6356k(obj, j), false);
                    i2 += m83115Q;
                    break;
                case 24:
                    m83115Q = Ti9.m83124H(i4, (List) C51221wm9.m6356k(obj, j), false);
                    i2 += m83115Q;
                    break;
                case 25:
                    m83115Q = Ti9.m83131A(i4, (List) C51221wm9.m6356k(obj, j), false);
                    i2 += m83115Q;
                    break;
                case 26:
                    m83115Q = Ti9.m83109W(i4, (List) C51221wm9.m6356k(obj, j));
                    i2 += m83115Q;
                    break;
                case 27:
                    m83115Q = Ti9.m83114R(i4, (List) C51221wm9.m6356k(obj, j), m96454j(i3));
                    i2 += m83115Q;
                    break;
                case 28:
                    m83115Q = Ti9.m83127E(i4, (List) C51221wm9.m6356k(obj, j));
                    i2 += m83115Q;
                    break;
                case 29:
                    m83115Q = Ti9.m83108X(i4, (List) C51221wm9.m6356k(obj, j), false);
                    i2 += m83115Q;
                    break;
                case 30:
                    m83115Q = Ti9.m83126F(i4, (List) C51221wm9.m6356k(obj, j), false);
                    i2 += m83115Q;
                    break;
                case 31:
                    m83115Q = Ti9.m83124H(i4, (List) C51221wm9.m6356k(obj, j), false);
                    i2 += m83115Q;
                    break;
                case 32:
                    m83115Q = Ti9.m83122J(i4, (List) C51221wm9.m6356k(obj, j), false);
                    i2 += m83115Q;
                    break;
                case 33:
                    m83115Q = Ti9.m83113S(i4, (List) C51221wm9.m6356k(obj, j), false);
                    i2 += m83115Q;
                    break;
                case 34:
                    m83115Q = Ti9.m83111U(i4, (List) C51221wm9.m6356k(obj, j), false);
                    i2 += m83115Q;
                    break;
                case 35:
                    m73708E = Ti9.m83121K((List) unsafe.getObject(obj, j));
                    if (m73708E > 0) {
                        m73703c = Z79.m73703c(i4);
                        m73702d8 = Z79.m73702d(m73708E);
                        m73702d4 = m73703c + m73702d8;
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    m73708E = Ti9.m83123I((List) unsafe.getObject(obj, j));
                    if (m73708E > 0) {
                        m73703c = Z79.m73703c(i4);
                        m73702d8 = Z79.m73702d(m73708E);
                        m73702d4 = m73703c + m73702d8;
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    m73708E = Ti9.m83116P((List) unsafe.getObject(obj, j));
                    if (m73708E > 0) {
                        m73703c = Z79.m73703c(i4);
                        m73702d8 = Z79.m73702d(m73708E);
                        m73702d4 = m73703c + m73702d8;
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    m73708E = Ti9.m83104a0((List) unsafe.getObject(obj, j));
                    if (m73708E > 0) {
                        m73703c = Z79.m73703c(i4);
                        m73702d8 = Z79.m73702d(m73708E);
                        m73702d4 = m73703c + m73702d8;
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    m73708E = Ti9.m83118N((List) unsafe.getObject(obj, j));
                    if (m73708E > 0) {
                        m73703c = Z79.m73703c(i4);
                        m73702d8 = Z79.m73702d(m73708E);
                        m73702d4 = m73703c + m73702d8;
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    m73708E = Ti9.m83121K((List) unsafe.getObject(obj, j));
                    if (m73708E > 0) {
                        m73703c = Z79.m73703c(i4);
                        m73702d8 = Z79.m73702d(m73708E);
                        m73702d4 = m73703c + m73702d8;
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    m73708E = Ti9.m83123I((List) unsafe.getObject(obj, j));
                    if (m73708E > 0) {
                        m73703c = Z79.m73703c(i4);
                        m73702d8 = Z79.m73702d(m73708E);
                        m73702d4 = m73703c + m73702d8;
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    m73708E = Ti9.m83128D((List) unsafe.getObject(obj, j));
                    if (m73708E > 0) {
                        m73703c = Z79.m73703c(i4);
                        m73702d8 = Z79.m73702d(m73708E);
                        m73702d4 = m73703c + m73702d8;
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    m73708E = Ti9.m83107Y((List) unsafe.getObject(obj, j));
                    if (m73708E > 0) {
                        m73703c = Z79.m73703c(i4);
                        m73702d8 = Z79.m73702d(m73708E);
                        m73702d4 = m73703c + m73702d8;
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    m73708E = Ti9.m83125G((List) unsafe.getObject(obj, j));
                    if (m73708E > 0) {
                        m73703c = Z79.m73703c(i4);
                        m73702d8 = Z79.m73702d(m73708E);
                        m73702d4 = m73703c + m73702d8;
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    m73708E = Ti9.m83123I((List) unsafe.getObject(obj, j));
                    if (m73708E > 0) {
                        m73703c = Z79.m73703c(i4);
                        m73702d8 = Z79.m73702d(m73708E);
                        m73702d4 = m73703c + m73702d8;
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    m73708E = Ti9.m83121K((List) unsafe.getObject(obj, j));
                    if (m73708E > 0) {
                        m73703c = Z79.m73703c(i4);
                        m73702d8 = Z79.m73702d(m73708E);
                        m73702d4 = m73703c + m73702d8;
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    m73708E = Ti9.m83112T((List) unsafe.getObject(obj, j));
                    if (m73708E > 0) {
                        m73703c = Z79.m73703c(i4);
                        m73702d8 = Z79.m73702d(m73708E);
                        m73702d4 = m73703c + m73702d8;
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    m73708E = Ti9.m83110V((List) unsafe.getObject(obj, j));
                    if (m73708E > 0) {
                        m73703c = Z79.m73703c(i4);
                        m73702d8 = Z79.m73702d(m73708E);
                        m73702d4 = m73703c + m73702d8;
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    m83115Q = Ti9.m83120L(i4, (List) C51221wm9.m6356k(obj, j), m96454j(i3));
                    i2 += m83115Q;
                    break;
                case 50:
                    Ef9.m108586a(i4, C51221wm9.m6356k(obj, j), m96453k(i3));
                    break;
                case 51:
                    if (m96443u(obj, i4, i3)) {
                        m73702d = Z79.m73702d(i4 << 3);
                        m83115Q = m73702d + 8;
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m96443u(obj, i4, i3)) {
                        m73702d2 = Z79.m73702d(i4 << 3);
                        m83115Q = m73702d2 + 4;
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m96443u(obj, i4, i3)) {
                        long m96456h = m96456h(obj, j);
                        m73702d3 = Z79.m73702d(i4 << 3);
                        m73701e = Z79.m73701e(m96456h);
                        i2 += m73702d3 + m73701e;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m96443u(obj, i4, i3)) {
                        long m96456h2 = m96456h(obj, j);
                        m73702d3 = Z79.m73702d(i4 << 3);
                        m73701e = Z79.m73701e(m96456h2);
                        i2 += m73702d3 + m73701e;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m96443u(obj, i4, i3)) {
                        int m96467H = m96467H(obj, j);
                        m73702d4 = Z79.m73702d(i4 << 3);
                        m73708E = Z79.m73708E(m96467H);
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m96443u(obj, i4, i3)) {
                        m73702d = Z79.m73702d(i4 << 3);
                        m83115Q = m73702d + 8;
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m96443u(obj, i4, i3)) {
                        m73702d2 = Z79.m73702d(i4 << 3);
                        m83115Q = m73702d2 + 4;
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m96443u(obj, i4, i3)) {
                        m73702d5 = Z79.m73702d(i4 << 3);
                        m83115Q = m73702d5 + 1;
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!m96443u(obj, i4, i3)) {
                        break;
                    } else {
                        Object m6356k2 = C51221wm9.m6356k(obj, j);
                        if (m6356k2 instanceof T69) {
                            m73702d6 = Z79.m73702d(i4 << 3);
                            mo7402c = ((T69) m6356k2).mo7402c();
                            m73702d7 = Z79.m73702d(mo7402c);
                            i = m73702d6 + m73702d7 + mo7402c;
                            i2 += i;
                            break;
                        } else {
                            m73702d4 = Z79.m73702d(i4 << 3);
                            m73708E = Z79.m73704b((String) m6356k2);
                            i = m73702d4 + m73708E;
                            i2 += i;
                        }
                    }
                case 60:
                    if (m96443u(obj, i4, i3)) {
                        m83115Q = Ti9.m83115Q(i4, C51221wm9.m6356k(obj, j), m96454j(i3));
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m96443u(obj, i4, i3)) {
                        m73702d6 = Z79.m73702d(i4 << 3);
                        mo7402c = ((T69) C51221wm9.m6356k(obj, j)).mo7402c();
                        m73702d7 = Z79.m73702d(mo7402c);
                        i = m73702d6 + m73702d7 + mo7402c;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m96443u(obj, i4, i3)) {
                        int m96467H2 = m96467H(obj, j);
                        m73702d4 = Z79.m73702d(i4 << 3);
                        m73708E = Z79.m73702d(m96467H2);
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m96443u(obj, i4, i3)) {
                        int m96467H3 = m96467H(obj, j);
                        m73702d4 = Z79.m73702d(i4 << 3);
                        m73708E = Z79.m73708E(m96467H3);
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m96443u(obj, i4, i3)) {
                        m73702d2 = Z79.m73702d(i4 << 3);
                        m83115Q = m73702d2 + 4;
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m96443u(obj, i4, i3)) {
                        m73702d = Z79.m73702d(i4 << 3);
                        m83115Q = m73702d + 8;
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m96443u(obj, i4, i3)) {
                        int m96467H4 = m96467H(obj, j);
                        m73702d4 = Z79.m73702d(i4 << 3);
                        m73708E = Z79.m73702d((m96467H4 >> 31) ^ (m96467H4 + m96467H4));
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m96443u(obj, i4, i3)) {
                        long m96456h3 = m96456h(obj, j);
                        m73702d4 = Z79.m73702d(i4 << 3);
                        m73708E = Z79.m73701e((m96456h3 >> 63) ^ (m96456h3 + m96456h3));
                        i = m73702d4 + m73708E;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m96443u(obj, i4, i3)) {
                        m83115Q = Z79.m73710C(i4, (InterfaceC47012pg9) C51221wm9.m6356k(obj, j), m96454j(i3));
                        i2 += m83115Q;
                        break;
                    } else {
                        break;
                    }
            }
        }
        Mk9 mk9 = this.f21923l;
        return i2 + mk9.mo74331a(mk9.mo74329c(obj));
    }

    /* renamed from: I */
    public final int m96466I(Object obj, byte[] bArr, int i, int i2, int i3, long j, C43100j49 c43100j49) throws IOException {
        Unsafe unsafe = f21911q;
        Object m96453k = m96453k(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((C51151wf9) object).m6530h()) {
            C51151wf9 m6533e = C51151wf9.m6534d().m6533e();
            Ef9.m108585b(m6533e, object);
            unsafe.putObject(obj, j, m6533e);
        }
        C46409of9 c46409of9 = (C46409of9) m96453k;
        throw null;
    }

    /* renamed from: J */
    public final int m96465J(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C43100j49 c43100j49) throws IOException {
        boolean z;
        Object obj2;
        Object obj3;
        Unsafe unsafe = f21911q;
        long j2 = this.f21912a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(C47844r49.m16516o(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(C47844r49.m16529b(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int m16518m = C47844r49.m16518m(bArr, i, c43100j49);
                    unsafe.putObject(obj, j, Long.valueOf(c43100j49.f92112b));
                    unsafe.putInt(obj, j2, i4);
                    return m16518m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m16521j = C47844r49.m16521j(bArr, i, c43100j49);
                    unsafe.putObject(obj, j, Integer.valueOf(c43100j49.f92111a));
                    unsafe.putInt(obj, j2, i4);
                    return m16521j;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(C47844r49.m16516o(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(C47844r49.m16529b(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m16518m2 = C47844r49.m16518m(bArr, i, c43100j49);
                    if (c43100j49.f92112b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z));
                    unsafe.putInt(obj, j2, i4);
                    return m16518m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int m16521j2 = C47844r49.m16521j(bArr, i, c43100j49);
                    int i9 = c43100j49.f92111a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !Zm9.m72526f(bArr, m16521j2, m16521j2 + i9)) {
                        throw zzov.m51293c();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m16521j2, i9, C44007kc9.f94654b));
                        m16521j2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m16521j2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int m16527d = C47844r49.m16527d(m96454j(i8), bArr, i, i2, c43100j49);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(obj, j, c43100j49.f92113c);
                    } else {
                        unsafe.putObject(obj, j, C44007kc9.m28733g(obj2, c43100j49.f92113c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m16527d;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m16530a = C47844r49.m16530a(bArr, i, c43100j49);
                    unsafe.putObject(obj, j, c43100j49.f92113c);
                    unsafe.putInt(obj, j2, i4);
                    return m16530a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m16521j3 = C47844r49.m16521j(bArr, i, c43100j49);
                    int i10 = c43100j49.f92111a;
                    Wb9 m96455i = m96455i(i8);
                    if (m96455i != null && !m96455i.zza(i10)) {
                        m96474A(obj).m84910h(i3, Long.valueOf(i10));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return m16521j3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int m16521j4 = C47844r49.m16521j(bArr, i, c43100j49);
                    unsafe.putObject(obj, j, Integer.valueOf(C50837w79.m7374a(c43100j49.f92111a)));
                    unsafe.putInt(obj, j2, i4);
                    return m16521j4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int m16518m3 = C47844r49.m16518m(bArr, i, c43100j49);
                    unsafe.putObject(obj, j, Long.valueOf(C50837w79.m7373b(c43100j49.f92112b)));
                    unsafe.putInt(obj, j2, i4);
                    return m16518m3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int m16528c = C47844r49.m16528c(m96454j(i8), bArr, i, i2, (i3 & (-8)) | 4, c43100j49);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj3 = unsafe.getObject(obj, j);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 == null) {
                        unsafe.putObject(obj, j, c43100j49.f92113c);
                    } else {
                        unsafe.putObject(obj, j, C44007kc9.m28733g(obj3, c43100j49.f92113c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m16528c;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    /* renamed from: K */
    public final int m96464K(Object obj, byte[] bArr, int i, int i2, C43100j49 c43100j49) throws IOException {
        byte b;
        int i3;
        int m96462M;
        int i4;
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int i10;
        int m16518m;
        int m16527d;
        int i11;
        int i12;
        int i13;
        Lg9<T> lg9 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i14 = i2;
        C43100j49 c43100j492 = c43100j49;
        Unsafe unsafe2 = f21911q;
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
                i3 = C47844r49.m16520k(b2, bArr2, i22, c43100j492);
                b = c43100j492.f92111a;
            } else {
                b = b2;
                i3 = i22;
            }
            int i23 = b >>> 3;
            int i24 = b & 7;
            if (i23 > i18) {
                m96462M = lg9.m96461N(i23, i20 / 3);
            } else {
                m96462M = lg9.m96462M(i23);
            }
            int i25 = m96462M;
            if (i25 == i16) {
                i4 = i3;
                i5 = i23;
                i6 = i16;
                unsafe = unsafe2;
                i7 = 0;
            } else {
                int[] iArr = lg9.f21912a;
                int i26 = iArr[i25 + 1];
                int m96458f = m96458f(i26);
                long j = i26 & i15;
                if (m96458f <= 17) {
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
                    switch (m96458f) {
                        case 0:
                            c43100j492 = c43100j49;
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
                                C51221wm9.m6347t(obj2, j, Double.longBitsToDouble(C47844r49.m16516o(bArr2, i9)));
                                i17 = i9 + 8;
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 1:
                            c43100j492 = c43100j49;
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
                                C51221wm9.m6346u(obj2, j, Float.intBitsToFloat(C47844r49.m16529b(bArr2, i9)));
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
                            c43100j492 = c43100j49;
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
                                m16518m = C47844r49.m16518m(bArr2, i9, c43100j492);
                                unsafe2.putLong(obj, j, c43100j492.f92112b);
                                i21 |= i28;
                                i17 = m16518m;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            c43100j492 = c43100j49;
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
                                i17 = C47844r49.m16521j(bArr2, i9, c43100j492);
                                unsafe2.putInt(obj2, j, c43100j492.f92111a);
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            c43100j492 = c43100j49;
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
                                unsafe2.putLong(obj, j, C47844r49.m16516o(bArr2, i3));
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
                            c43100j492 = c43100j49;
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
                                unsafe2.putInt(obj2, j, C47844r49.m16529b(bArr2, i3));
                                i17 = i3 + 4;
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 7:
                            c43100j492 = c43100j49;
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
                                i17 = C47844r49.m16518m(bArr2, i3, c43100j492);
                                C51221wm9.m6349r(obj2, j, c43100j492.f92112b != 0);
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 8:
                            c43100j492 = c43100j49;
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
                                    i17 = C47844r49.m16524g(bArr2, i3, c43100j492);
                                } else {
                                    i17 = C47844r49.m16523h(bArr2, i3, c43100j492);
                                }
                                unsafe2.putObject(obj2, j, c43100j492.f92113c);
                                i21 |= i28;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 9:
                            c43100j492 = c43100j49;
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
                                m16527d = C47844r49.m16527d(lg9.m96454j(i8), bArr2, i3, i14, c43100j492);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, c43100j492.f92113c);
                                } else {
                                    unsafe2.putObject(obj2, j, C44007kc9.m28733g(object, c43100j492.f92113c));
                                }
                                i21 |= i28;
                                i17 = m16527d;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 10:
                            c43100j492 = c43100j49;
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
                                m16527d = C47844r49.m16530a(bArr2, i3, c43100j492);
                                unsafe2.putObject(obj2, j, c43100j492.f92113c);
                                i21 |= i28;
                                i17 = m16527d;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 12:
                            c43100j492 = c43100j49;
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
                                m16527d = C47844r49.m16521j(bArr2, i3, c43100j492);
                                unsafe2.putInt(obj2, j, c43100j492.f92111a);
                                i21 |= i28;
                                i17 = m16527d;
                                i20 = i8;
                                i18 = i5;
                                i15 = i10;
                                i16 = -1;
                                break;
                            }
                        case 15:
                            c43100j492 = c43100j49;
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
                                m16527d = C47844r49.m16521j(bArr2, i3, c43100j492);
                                unsafe2.putInt(obj2, j, C50837w79.m7374a(c43100j492.f92111a));
                                i21 |= i28;
                                i17 = m16527d;
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
                                c43100j492 = c43100j49;
                                m16518m = C47844r49.m16518m(bArr2, i3, c43100j492);
                                i8 = i25;
                                i5 = i23;
                                i10 = 1048575;
                                unsafe2.putLong(obj, j, C50837w79.m7373b(c43100j492.f92112b));
                                i21 |= i28;
                                i17 = m16518m;
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
                    c43100j492 = c43100j49;
                    i8 = i25;
                    int i30 = i3;
                    i10 = 1048575;
                    i5 = i23;
                    if (m96458f == 27) {
                        if (i24 == 2) {
                            InterfaceC39857dc9 interfaceC39857dc9 = (InterfaceC39857dc9) unsafe2.getObject(obj2, j);
                            if (!interfaceC39857dc9.zzc()) {
                                int size = interfaceC39857dc9.size();
                                interfaceC39857dc9 = interfaceC39857dc9.mo1843d(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, interfaceC39857dc9);
                            }
                            i17 = C47844r49.m16526e(lg9.m96454j(i8), b, bArr, i30, i2, interfaceC39857dc9, c43100j49);
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
                    } else if (m96458f <= 49) {
                        i12 = i21;
                        i13 = i19;
                        i6 = -1;
                        unsafe = unsafe2;
                        i7 = i8;
                        i17 = m96463L(obj, bArr, i30, i2, b, i5, i24, i8, i26, m96458f, j, c43100j49);
                        if (i17 != i30) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i14 = i2;
                            c43100j492 = c43100j49;
                            i19 = i13;
                            i16 = i6;
                            i18 = i5;
                            i21 = i12;
                            i20 = i7;
                            unsafe2 = unsafe;
                            i15 = 1048575;
                            lg9 = this;
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
                        if (m96458f != 50) {
                            i17 = m96465J(obj, bArr, i11, i2, b, i5, i24, i26, m96458f, j, i7, c43100j49);
                            if (i17 != i11) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i14 = i2;
                                c43100j492 = c43100j49;
                                i19 = i13;
                                i16 = i6;
                                i18 = i5;
                                i21 = i12;
                                i20 = i7;
                                unsafe2 = unsafe;
                                i15 = 1048575;
                                lg9 = this;
                            } else {
                                i4 = i17;
                                i19 = i13;
                                i21 = i12;
                            }
                        } else if (i24 == 2) {
                            i17 = m96466I(obj, bArr, i11, i2, i7, j, c43100j49);
                            if (i17 != i11) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i14 = i2;
                                c43100j492 = c43100j49;
                                i19 = i13;
                                i16 = i6;
                                i18 = i5;
                                i21 = i12;
                                i20 = i7;
                                unsafe2 = unsafe;
                                i15 = 1048575;
                                lg9 = this;
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
            i17 = C47844r49.m16522i(b, bArr, i4, i2, m96474A(obj), c43100j49);
            lg9 = this;
            obj2 = obj;
            bArr2 = bArr;
            i14 = i2;
            c43100j492 = c43100j49;
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
        throw zzov.m51291e();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021a -> B:120:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:67:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cc -> B:100:0x01cd). Please submit an issue!!! */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m96463L(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C43100j49 c43100j49) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        int m16521j;
        boolean z3;
        int i12;
        int i13;
        int i14 = i;
        Unsafe unsafe = f21911q;
        InterfaceC39857dc9 interfaceC39857dc9 = (InterfaceC39857dc9) unsafe.getObject(obj, j2);
        if (!interfaceC39857dc9.zzc()) {
            int size = interfaceC39857dc9.size();
            if (size == 0) {
                i13 = 10;
            } else {
                i13 = size + size;
            }
            interfaceC39857dc9 = interfaceC39857dc9.mo1843d(i13);
            unsafe.putObject(obj, j2, interfaceC39857dc9);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    C46698p89 c46698p89 = (C46698p89) interfaceC39857dc9;
                    int m16521j2 = C47844r49.m16521j(bArr, i14, c43100j49);
                    int i15 = c43100j49.f92111a + m16521j2;
                    while (m16521j2 < i15) {
                        c46698p89.m19878b(Double.longBitsToDouble(C47844r49.m16516o(bArr, m16521j2)));
                        m16521j2 += 8;
                    }
                    if (m16521j2 != i15) {
                        throw zzov.m51289g();
                    }
                    return m16521j2;
                }
                if (i5 == 1) {
                    C46698p89 c46698p892 = (C46698p89) interfaceC39857dc9;
                    c46698p892.m19878b(Double.longBitsToDouble(C47844r49.m16516o(bArr, i)));
                    while (true) {
                        i8 = i14 + 8;
                        if (i8 < i2) {
                            i14 = C47844r49.m16521j(bArr, i8, c43100j49);
                            if (i3 == c43100j49.f92111a) {
                                c46698p892.m19878b(Double.longBitsToDouble(C47844r49.m16516o(bArr, i14)));
                            }
                        }
                    }
                    return i8;
                }
                return i14;
            case 19:
            case 36:
                if (i5 == 2) {
                    C48138ra9 c48138ra9 = (C48138ra9) interfaceC39857dc9;
                    int m16521j3 = C47844r49.m16521j(bArr, i14, c43100j49);
                    int i16 = c43100j49.f92111a + m16521j3;
                    while (m16521j3 < i16) {
                        c48138ra9.m15732b(Float.intBitsToFloat(C47844r49.m16529b(bArr, m16521j3)));
                        m16521j3 += 4;
                    }
                    if (m16521j3 != i16) {
                        throw zzov.m51289g();
                    }
                    return m16521j3;
                }
                if (i5 == 5) {
                    C48138ra9 c48138ra92 = (C48138ra9) interfaceC39857dc9;
                    c48138ra92.m15732b(Float.intBitsToFloat(C47844r49.m16529b(bArr, i)));
                    while (true) {
                        i9 = i14 + 4;
                        if (i9 < i2) {
                            i14 = C47844r49.m16521j(bArr, i9, c43100j49);
                            if (i3 == c43100j49.f92111a) {
                                c48138ra92.m15732b(Float.intBitsToFloat(C47844r49.m16529b(bArr, i14)));
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
                    Je9 je9 = (Je9) interfaceC39857dc9;
                    int m16521j4 = C47844r49.m16521j(bArr, i14, c43100j49);
                    int i17 = c43100j49.f92111a + m16521j4;
                    while (m16521j4 < i17) {
                        m16521j4 = C47844r49.m16518m(bArr, m16521j4, c43100j49);
                        je9.m100052c(c43100j49.f92112b);
                    }
                    if (m16521j4 != i17) {
                        throw zzov.m51289g();
                    }
                    return m16521j4;
                }
                if (i5 == 0) {
                    Je9 je92 = (Je9) interfaceC39857dc9;
                    int m16518m = C47844r49.m16518m(bArr, i14, c43100j49);
                    je92.m100052c(c43100j49.f92112b);
                    while (m16518m < i2) {
                        int m16521j5 = C47844r49.m16521j(bArr, m16518m, c43100j49);
                        if (i3 == c43100j49.f92111a) {
                            m16518m = C47844r49.m16518m(bArr, m16521j5, c43100j49);
                            je92.m100052c(c43100j49.f92112b);
                        } else {
                            return m16518m;
                        }
                    }
                    return m16518m;
                }
                return i14;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C47844r49.m16525f(bArr, i14, interfaceC39857dc9, c43100j49);
                }
                if (i5 == 0) {
                    return C47844r49.m16519l(i3, bArr, i, i2, interfaceC39857dc9, c43100j49);
                }
                return i14;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    Je9 je93 = (Je9) interfaceC39857dc9;
                    int m16521j6 = C47844r49.m16521j(bArr, i14, c43100j49);
                    int i18 = c43100j49.f92111a + m16521j6;
                    while (m16521j6 < i18) {
                        je93.m100052c(C47844r49.m16516o(bArr, m16521j6));
                        m16521j6 += 8;
                    }
                    if (m16521j6 != i18) {
                        throw zzov.m51289g();
                    }
                    return m16521j6;
                }
                if (i5 == 1) {
                    Je9 je94 = (Je9) interfaceC39857dc9;
                    je94.m100052c(C47844r49.m16516o(bArr, i));
                    while (true) {
                        i10 = i14 + 8;
                        if (i10 < i2) {
                            i14 = C47844r49.m16521j(bArr, i10, c43100j49);
                            if (i3 == c43100j49.f92111a) {
                                je94.m100052c(C47844r49.m16516o(bArr, i14));
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
                    Bb9 bb9 = (Bb9) interfaceC39857dc9;
                    int m16521j7 = C47844r49.m16521j(bArr, i14, c43100j49);
                    int i19 = c43100j49.f92111a + m16521j7;
                    while (m16521j7 < i19) {
                        bb9.m113809c(C47844r49.m16529b(bArr, m16521j7));
                        m16521j7 += 4;
                    }
                    if (m16521j7 != i19) {
                        throw zzov.m51289g();
                    }
                    return m16521j7;
                }
                if (i5 == 5) {
                    Bb9 bb92 = (Bb9) interfaceC39857dc9;
                    bb92.m113809c(C47844r49.m16529b(bArr, i));
                    while (true) {
                        i11 = i14 + 4;
                        if (i11 < i2) {
                            i14 = C47844r49.m16521j(bArr, i11, c43100j49);
                            if (i3 == c43100j49.f92111a) {
                                bb92.m113809c(C47844r49.m16529b(bArr, i14));
                            }
                        }
                    }
                    return i11;
                }
                return i14;
            case 25:
            case 42:
                if (i5 == 2) {
                    C52586z49 c52586z49 = (C52586z49) interfaceC39857dc9;
                    m16521j = C47844r49.m16521j(bArr, i14, c43100j49);
                    int i20 = c43100j49.f92111a + m16521j;
                    while (m16521j < i20) {
                        m16521j = C47844r49.m16518m(bArr, m16521j, c43100j49);
                        if (c43100j49.f92112b != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c52586z49.m1845b(z3);
                    }
                    if (m16521j != i20) {
                        throw zzov.m51289g();
                    }
                    return m16521j;
                }
                if (i5 == 0) {
                    C52586z49 c52586z492 = (C52586z49) interfaceC39857dc9;
                    int m16518m2 = C47844r49.m16518m(bArr, i14, c43100j49);
                    if (c43100j49.f92112b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c52586z492.m1845b(z);
                    while (m16518m2 < i2) {
                        int m16521j8 = C47844r49.m16521j(bArr, m16518m2, c43100j49);
                        if (i3 == c43100j49.f92111a) {
                            m16518m2 = C47844r49.m16518m(bArr, m16521j8, c43100j49);
                            if (c43100j49.f92112b != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c52586z492.m1845b(z2);
                        } else {
                            return m16518m2;
                        }
                    }
                    return m16518m2;
                }
                return i14;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int m16521j9 = C47844r49.m16521j(bArr, i14, c43100j49);
                        int i21 = c43100j49.f92111a;
                        if (i21 >= 0) {
                            if (i21 == 0) {
                                interfaceC39857dc9.add("");
                                while (m16521j9 < i2) {
                                    int m16521j10 = C47844r49.m16521j(bArr, m16521j9, c43100j49);
                                    if (i3 == c43100j49.f92111a) {
                                        m16521j9 = C47844r49.m16521j(bArr, m16521j10, c43100j49);
                                        i21 = c43100j49.f92111a;
                                        if (i21 >= 0) {
                                            if (i21 == 0) {
                                                interfaceC39857dc9.add("");
                                            } else {
                                                interfaceC39857dc9.add(new String(bArr, m16521j9, i21, C44007kc9.f94654b));
                                                m16521j9 += i21;
                                                while (m16521j9 < i2) {
                                                }
                                            }
                                        } else {
                                            throw zzov.m51292d();
                                        }
                                    } else {
                                        return m16521j9;
                                    }
                                }
                                return m16521j9;
                            }
                            interfaceC39857dc9.add(new String(bArr, m16521j9, i21, C44007kc9.f94654b));
                            m16521j9 += i21;
                            while (m16521j9 < i2) {
                            }
                            return m16521j9;
                        }
                        throw zzov.m51292d();
                    }
                    int m16521j11 = C47844r49.m16521j(bArr, i14, c43100j49);
                    int i22 = c43100j49.f92111a;
                    if (i22 >= 0) {
                        if (i22 == 0) {
                            interfaceC39857dc9.add("");
                            while (m16521j11 < i2) {
                                int m16521j12 = C47844r49.m16521j(bArr, m16521j11, c43100j49);
                                if (i3 == c43100j49.f92111a) {
                                    m16521j11 = C47844r49.m16521j(bArr, m16521j12, c43100j49);
                                    int i23 = c43100j49.f92111a;
                                    if (i23 >= 0) {
                                        if (i23 == 0) {
                                            interfaceC39857dc9.add("");
                                        } else {
                                            i12 = m16521j11 + i23;
                                            if (Zm9.m72526f(bArr, m16521j11, i12)) {
                                                interfaceC39857dc9.add(new String(bArr, m16521j11, i23, C44007kc9.f94654b));
                                                m16521j11 = i12;
                                                while (m16521j11 < i2) {
                                                }
                                            } else {
                                                throw zzov.m51293c();
                                            }
                                        }
                                    } else {
                                        throw zzov.m51292d();
                                    }
                                } else {
                                    return m16521j11;
                                }
                            }
                            return m16521j11;
                        }
                        i12 = m16521j11 + i22;
                        if (Zm9.m72526f(bArr, m16521j11, i12)) {
                            interfaceC39857dc9.add(new String(bArr, m16521j11, i22, C44007kc9.f94654b));
                            m16521j11 = i12;
                            while (m16521j11 < i2) {
                            }
                            return m16521j11;
                        }
                        throw zzov.m51293c();
                    }
                    throw zzov.m51292d();
                }
                return i14;
            case 27:
                if (i5 == 2) {
                    return C47844r49.m16526e(m96454j(i6), i3, bArr, i, i2, interfaceC39857dc9, c43100j49);
                }
                return i14;
            case 28:
                if (i5 == 2) {
                    int m16521j13 = C47844r49.m16521j(bArr, i14, c43100j49);
                    int i24 = c43100j49.f92111a;
                    if (i24 >= 0) {
                        if (i24 <= bArr.length - m16521j13) {
                            if (i24 == 0) {
                                interfaceC39857dc9.add(T69.f34797c);
                                while (m16521j13 < i2) {
                                    int m16521j14 = C47844r49.m16521j(bArr, m16521j13, c43100j49);
                                    if (i3 == c43100j49.f92111a) {
                                        m16521j13 = C47844r49.m16521j(bArr, m16521j14, c43100j49);
                                        i24 = c43100j49.f92111a;
                                        if (i24 >= 0) {
                                            if (i24 <= bArr.length - m16521j13) {
                                                if (i24 == 0) {
                                                    interfaceC39857dc9.add(T69.f34797c);
                                                } else {
                                                    interfaceC39857dc9.add(T69.m84303v(bArr, m16521j13, i24));
                                                    m16521j13 += i24;
                                                    while (m16521j13 < i2) {
                                                    }
                                                }
                                            } else {
                                                throw zzov.m51289g();
                                            }
                                        } else {
                                            throw zzov.m51292d();
                                        }
                                    } else {
                                        return m16521j13;
                                    }
                                }
                                return m16521j13;
                            }
                            interfaceC39857dc9.add(T69.m84303v(bArr, m16521j13, i24));
                            m16521j13 += i24;
                            while (m16521j13 < i2) {
                            }
                            return m16521j13;
                        }
                        throw zzov.m51289g();
                    }
                    throw zzov.m51292d();
                }
                return i14;
            case 30:
            case 44:
                if (i5 == 2) {
                    m16521j = C47844r49.m16525f(bArr, i14, interfaceC39857dc9, c43100j49);
                } else {
                    if (i5 == 0) {
                        m16521j = C47844r49.m16519l(i3, bArr, i, i2, interfaceC39857dc9, c43100j49);
                    }
                    return i14;
                }
                AbstractC49926ub9 abstractC49926ub9 = (AbstractC49926ub9) obj;
                Sk9 sk9 = abstractC49926ub9.zzc;
                if (sk9 == Sk9.m84915c()) {
                    sk9 = null;
                }
                Object m83101c = Ti9.m83101c(i4, interfaceC39857dc9, m96455i(i6), sk9, this.f21923l);
                if (m83101c != null) {
                    abstractC49926ub9.zzc = (Sk9) m83101c;
                    return m16521j;
                }
                return m16521j;
            case 33:
            case 47:
                if (i5 == 2) {
                    Bb9 bb93 = (Bb9) interfaceC39857dc9;
                    int m16521j15 = C47844r49.m16521j(bArr, i14, c43100j49);
                    int i25 = c43100j49.f92111a + m16521j15;
                    while (m16521j15 < i25) {
                        m16521j15 = C47844r49.m16521j(bArr, m16521j15, c43100j49);
                        bb93.m113809c(C50837w79.m7374a(c43100j49.f92111a));
                    }
                    if (m16521j15 != i25) {
                        throw zzov.m51289g();
                    }
                    return m16521j15;
                }
                if (i5 == 0) {
                    Bb9 bb94 = (Bb9) interfaceC39857dc9;
                    int m16521j16 = C47844r49.m16521j(bArr, i14, c43100j49);
                    bb94.m113809c(C50837w79.m7374a(c43100j49.f92111a));
                    while (m16521j16 < i2) {
                        int m16521j17 = C47844r49.m16521j(bArr, m16521j16, c43100j49);
                        if (i3 == c43100j49.f92111a) {
                            m16521j16 = C47844r49.m16521j(bArr, m16521j17, c43100j49);
                            bb94.m113809c(C50837w79.m7374a(c43100j49.f92111a));
                        } else {
                            return m16521j16;
                        }
                    }
                    return m16521j16;
                }
                return i14;
            case 34:
            case 48:
                if (i5 == 2) {
                    Je9 je95 = (Je9) interfaceC39857dc9;
                    int m16521j18 = C47844r49.m16521j(bArr, i14, c43100j49);
                    int i26 = c43100j49.f92111a + m16521j18;
                    while (m16521j18 < i26) {
                        m16521j18 = C47844r49.m16518m(bArr, m16521j18, c43100j49);
                        je95.m100052c(C50837w79.m7373b(c43100j49.f92112b));
                    }
                    if (m16521j18 != i26) {
                        throw zzov.m51289g();
                    }
                    return m16521j18;
                }
                if (i5 == 0) {
                    Je9 je96 = (Je9) interfaceC39857dc9;
                    int m16518m3 = C47844r49.m16518m(bArr, i14, c43100j49);
                    je96.m100052c(C50837w79.m7373b(c43100j49.f92112b));
                    while (m16518m3 < i2) {
                        int m16521j19 = C47844r49.m16521j(bArr, m16518m3, c43100j49);
                        if (i3 == c43100j49.f92111a) {
                            m16518m3 = C47844r49.m16518m(bArr, m16521j19, c43100j49);
                            je96.m100052c(C50837w79.m7373b(c43100j49.f92112b));
                        } else {
                            return m16518m3;
                        }
                    }
                    return m16518m3;
                }
                return i14;
            default:
                if (i5 == 3) {
                    Ei9 m96454j = m96454j(i6);
                    int i27 = (i3 & (-8)) | 4;
                    int m16528c = C47844r49.m16528c(m96454j, bArr, i, i2, i27, c43100j49);
                    interfaceC39857dc9.add(c43100j49.f92113c);
                    while (m16528c < i2) {
                        int m16521j20 = C47844r49.m16521j(bArr, m16528c, c43100j49);
                        if (i3 == c43100j49.f92111a) {
                            m16528c = C47844r49.m16528c(m96454j, bArr, m16521j20, i2, i27, c43100j49);
                            interfaceC39857dc9.add(c43100j49.f92113c);
                        } else {
                            return m16528c;
                        }
                    }
                    return m16528c;
                }
                return i14;
        }
    }

    /* renamed from: M */
    public final int m96462M(int i) {
        if (i < this.f21914c || i > this.f21915d) {
            return -1;
        }
        return m96459P(i, 0);
    }

    /* renamed from: N */
    public final int m96461N(int i, int i2) {
        if (i < this.f21914c || i > this.f21915d) {
            return -1;
        }
        return m96459P(i, i2);
    }

    /* renamed from: O */
    public final int m96460O(int i) {
        return this.f21912a[i + 2];
    }

    /* renamed from: P */
    public final int m96459P(int i, int i2) {
        int length = (this.f21912a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f21912a[i4];
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

    @Override // p000.Ei9
    /* renamed from: a */
    public final void mo83166a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.f21912a.length; i += 3) {
            int m96457g = m96457g(i);
            long j = 1048575 & m96457g;
            int i2 = this.f21912a[i];
            switch (m96458f(m96457g)) {
                case 0:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6347t(obj, j, C51221wm9.m6361f(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6346u(obj, j, C51221wm9.m6360g(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6344w(obj, j, C51221wm9.m6358i(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6344w(obj, j, C51221wm9.m6358i(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6345v(obj, j, C51221wm9.m6359h(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6344w(obj, j, C51221wm9.m6358i(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6345v(obj, j, C51221wm9.m6359h(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6349r(obj, j, C51221wm9.m6370B(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6343x(obj, j, C51221wm9.m6356k(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m96451m(obj, obj2, i);
                    break;
                case 10:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6343x(obj, j, C51221wm9.m6356k(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6345v(obj, j, C51221wm9.m6359h(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6345v(obj, j, C51221wm9.m6359h(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6345v(obj, j, C51221wm9.m6359h(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6344w(obj, j, C51221wm9.m6358i(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6345v(obj, j, C51221wm9.m6359h(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m96446r(obj2, i)) {
                        C51221wm9.m6344w(obj, j, C51221wm9.m6358i(obj2, j));
                        m96449o(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m96451m(obj, obj2, i);
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
                    this.f21922k.mo20700b(obj, obj2, j);
                    break;
                case 50:
                    Ti9.m83095i(this.f21926o, obj, obj2, j);
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
                    if (m96443u(obj2, i2, i)) {
                        C51221wm9.m6343x(obj, j, C51221wm9.m6356k(obj2, j));
                        m96448p(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m96450n(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m96443u(obj2, i2, i)) {
                        C51221wm9.m6343x(obj, j, C51221wm9.m6356k(obj2, j));
                        m96448p(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m96450n(obj, obj2, i);
                    break;
            }
        }
        Ti9.m83098f(this.f21923l, obj, obj2);
        if (this.f21917f) {
            Ti9.m83099e(this.f21924m, obj, obj2);
        }
    }

    @Override // p000.Ei9
    /* renamed from: b */
    public final void mo83165b(Object obj, byte[] bArr, int i, int i2, C43100j49 c43100j49) throws IOException {
        if (this.f21918g) {
            m96464K(obj, bArr, i, i2, c43100j49);
        } else {
            m96438z(obj, bArr, i, i2, 0, c43100j49);
        }
    }

    @Override // p000.Ei9
    /* renamed from: c */
    public final boolean mo83164c(Object obj, Object obj2) {
        boolean m83096h;
        int length = this.f21912a.length;
        for (int i = 0; i < length; i += 3) {
            int m96457g = m96457g(i);
            long j = m96457g & 1048575;
            switch (m96458f(m96457g)) {
                case 0:
                    if (m96447q(obj, obj2, i) && Double.doubleToLongBits(C51221wm9.m6361f(obj, j)) == Double.doubleToLongBits(C51221wm9.m6361f(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m96447q(obj, obj2, i) && Float.floatToIntBits(C51221wm9.m6360g(obj, j)) == Float.floatToIntBits(C51221wm9.m6360g(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m96447q(obj, obj2, i) && C51221wm9.m6358i(obj, j) == C51221wm9.m6358i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m96447q(obj, obj2, i) && C51221wm9.m6358i(obj, j) == C51221wm9.m6358i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m96447q(obj, obj2, i) && C51221wm9.m6359h(obj, j) == C51221wm9.m6359h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m96447q(obj, obj2, i) && C51221wm9.m6358i(obj, j) == C51221wm9.m6358i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m96447q(obj, obj2, i) && C51221wm9.m6359h(obj, j) == C51221wm9.m6359h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m96447q(obj, obj2, i) && C51221wm9.m6370B(obj, j) == C51221wm9.m6370B(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m96447q(obj, obj2, i) && Ti9.m83096h(C51221wm9.m6356k(obj, j), C51221wm9.m6356k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m96447q(obj, obj2, i) && Ti9.m83096h(C51221wm9.m6356k(obj, j), C51221wm9.m6356k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m96447q(obj, obj2, i) && Ti9.m83096h(C51221wm9.m6356k(obj, j), C51221wm9.m6356k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m96447q(obj, obj2, i) && C51221wm9.m6359h(obj, j) == C51221wm9.m6359h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m96447q(obj, obj2, i) && C51221wm9.m6359h(obj, j) == C51221wm9.m6359h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m96447q(obj, obj2, i) && C51221wm9.m6359h(obj, j) == C51221wm9.m6359h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m96447q(obj, obj2, i) && C51221wm9.m6358i(obj, j) == C51221wm9.m6358i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m96447q(obj, obj2, i) && C51221wm9.m6359h(obj, j) == C51221wm9.m6359h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m96447q(obj, obj2, i) && C51221wm9.m6358i(obj, j) == C51221wm9.m6358i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m96447q(obj, obj2, i) && Ti9.m83096h(C51221wm9.m6356k(obj, j), C51221wm9.m6356k(obj2, j))) {
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
                    m83096h = Ti9.m83096h(C51221wm9.m6356k(obj, j), C51221wm9.m6356k(obj2, j));
                    break;
                case 50:
                    m83096h = Ti9.m83096h(C51221wm9.m6356k(obj, j), C51221wm9.m6356k(obj2, j));
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
                    long m96460O = m96460O(i) & 1048575;
                    if (C51221wm9.m6359h(obj, m96460O) == C51221wm9.m6359h(obj2, m96460O) && Ti9.m83096h(C51221wm9.m6356k(obj, j), C51221wm9.m6356k(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!m83096h) {
                return false;
            }
        }
        if (!this.f21923l.mo74329c(obj).equals(this.f21923l.mo74329c(obj2))) {
            return false;
        }
        if (this.f21917f) {
            return this.f21924m.mo81915b(obj).equals(this.f21924m.mo81915b(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0503 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0310  */
    @Override // p000.Ei9
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo83163d(Object obj, C41954h89 c41954h89) throws IOException {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        if (this.f21918g) {
            if (this.f21917f) {
                C39837da9 mo81915b = this.f21924m.mo81915b(obj);
                if (!mo81915b.f76816a.isEmpty()) {
                    it = mo81915b.m44106f();
                    entry = (Map.Entry) it.next();
                    length = this.f21912a.length;
                    for (i = 0; i < length; i += 3) {
                        int m96457g = m96457g(i);
                        int i2 = this.f21912a[i];
                        while (entry != null) {
                            this.f21924m.mo81916a(entry);
                            if (i2 >= 202056002) {
                                this.f21924m.mo81910g(c41954h89, entry);
                                if (it.hasNext()) {
                                    entry = (Map.Entry) it.next();
                                } else {
                                    entry = null;
                                }
                            } else {
                                switch (m96458f(m96457g)) {
                                    case 0:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36780r(i2, C51221wm9.m6361f(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36809A(i2, C51221wm9.m6360g(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 2:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36804F(i2, C51221wm9.m6358i(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36787k(i2, C51221wm9.m6358i(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 4:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36806D(i2, C51221wm9.m6359h(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 5:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36773y(i2, C51221wm9.m6358i(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 6:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36775w(i2, C51221wm9.m6359h(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 7:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36784n(i2, C51221wm9.m6370B(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 8:
                                        if (m96446r(obj, i)) {
                                            m96439y(i2, C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 9:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36802H(i2, C51221wm9.m6356k(obj, m96457g & 1048575), m96454j(i));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 10:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36782p(i2, (T69) C51221wm9.m6356k(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 11:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36789i(i2, C51221wm9.m6359h(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 12:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36777u(i2, C51221wm9.m6359h(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 13:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36800J(i2, C51221wm9.m6359h(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 14:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36798L(i2, C51221wm9.m6358i(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 15:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36796b(i2, C51221wm9.m6359h(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 16:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36794d(i2, C51221wm9.m6358i(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 17:
                                        if (m96446r(obj, i)) {
                                            c41954h89.m36807C(i2, C51221wm9.m6356k(obj, m96457g & 1048575), m96454j(i));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 18:
                                        Ti9.m83092l(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, false);
                                        break;
                                    case 19:
                                        Ti9.m83088p(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, false);
                                        break;
                                    case 20:
                                        Ti9.m83085s(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, false);
                                        break;
                                    case 21:
                                        Ti9.m83130B(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, false);
                                        break;
                                    case 22:
                                        Ti9.m83086r(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, false);
                                        break;
                                    case 23:
                                        Ti9.m83089o(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, false);
                                        break;
                                    case 24:
                                        Ti9.m83090n(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, false);
                                        break;
                                    case 25:
                                        Ti9.m83094j(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, false);
                                        break;
                                    case 26:
                                        Ti9.m83079y(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89);
                                        break;
                                    case 27:
                                        Ti9.m83084t(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, m96454j(i));
                                        break;
                                    case 28:
                                        Ti9.m83093k(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89);
                                        break;
                                    case 29:
                                        Ti9.m83078z(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, false);
                                        break;
                                    case 30:
                                        Ti9.m83091m(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, false);
                                        break;
                                    case 31:
                                        Ti9.m83083u(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, false);
                                        break;
                                    case 32:
                                        Ti9.m83082v(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, false);
                                        break;
                                    case 33:
                                        Ti9.m83081w(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, false);
                                        break;
                                    case 34:
                                        Ti9.m83080x(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, false);
                                        break;
                                    case 35:
                                        Ti9.m83092l(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, true);
                                        break;
                                    case 36:
                                        Ti9.m83088p(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, true);
                                        break;
                                    case 37:
                                        Ti9.m83085s(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, true);
                                        break;
                                    case 38:
                                        Ti9.m83130B(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, true);
                                        break;
                                    case 39:
                                        Ti9.m83086r(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, true);
                                        break;
                                    case 40:
                                        Ti9.m83089o(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, true);
                                        break;
                                    case 41:
                                        Ti9.m83090n(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, true);
                                        break;
                                    case 42:
                                        Ti9.m83094j(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, true);
                                        break;
                                    case 43:
                                        Ti9.m83078z(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, true);
                                        break;
                                    case 44:
                                        Ti9.m83091m(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, true);
                                        break;
                                    case 45:
                                        Ti9.m83083u(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, true);
                                        break;
                                    case 46:
                                        Ti9.m83082v(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, true);
                                        break;
                                    case 47:
                                        Ti9.m83081w(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, true);
                                        break;
                                    case 48:
                                        Ti9.m83080x(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, true);
                                        break;
                                    case 49:
                                        Ti9.m83087q(this.f21912a[i], (List) C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89, m96454j(i));
                                        break;
                                    case 50:
                                        m96440x(c41954h89, i2, C51221wm9.m6356k(obj, m96457g & 1048575), i);
                                        break;
                                    case 51:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36780r(i2, m96471D(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 52:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36809A(i2, m96470E(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 53:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36804F(i2, m96456h(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 54:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36787k(i2, m96456h(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 55:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36806D(i2, m96467H(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 56:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36773y(i2, m96456h(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 57:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36775w(i2, m96467H(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 58:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36784n(i2, m96442v(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 59:
                                        if (m96443u(obj, i2, i)) {
                                            m96439y(i2, C51221wm9.m6356k(obj, m96457g & 1048575), c41954h89);
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 60:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36802H(i2, C51221wm9.m6356k(obj, m96457g & 1048575), m96454j(i));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 61:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36782p(i2, (T69) C51221wm9.m6356k(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 62:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36789i(i2, m96467H(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 63:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36777u(i2, m96467H(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 64:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36800J(i2, m96467H(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 65:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36798L(i2, m96456h(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 66:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36796b(i2, m96467H(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 67:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36794d(i2, m96456h(obj, m96457g & 1048575));
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 68:
                                        if (m96443u(obj, i2, i)) {
                                            c41954h89.m36807C(i2, C51221wm9.m6356k(obj, m96457g & 1048575), m96454j(i));
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            }
                        }
                        switch (m96458f(m96457g)) {
                        }
                    }
                    while (entry != null) {
                        this.f21924m.mo81910g(c41954h89, entry);
                        if (it.hasNext()) {
                            entry = (Map.Entry) it.next();
                        } else {
                            entry = null;
                        }
                    }
                    Mk9 mk9 = this.f21923l;
                    mk9.mo74322j(mk9.mo74329c(obj), c41954h89);
                    return;
                }
            }
            it = null;
            entry = null;
            length = this.f21912a.length;
            while (i < length) {
            }
            while (entry != null) {
            }
            Mk9 mk92 = this.f21923l;
            mk92.mo74322j(mk92.mo74329c(obj), c41954h89);
            return;
        }
        m96441w(obj, c41954h89);
    }

    @Override // p000.Ei9
    /* renamed from: e */
    public final boolean mo83162e(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f21920i) {
            int i6 = this.f21919h[i5];
            int i7 = this.f21912a[i6];
            int m96457g = m96457g(i6);
            int i8 = this.f21912a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f21911q.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & m96457g) != 0 && !m96445s(obj, i6, i, i2, i10)) {
                return false;
            }
            int m96458f = m96458f(m96457g);
            if (m96458f != 9 && m96458f != 17) {
                if (m96458f != 27) {
                    if (m96458f != 60 && m96458f != 68) {
                        if (m96458f != 49) {
                            if (m96458f == 50 && !((C51151wf9) C51221wm9.m6356k(obj, m96457g & 1048575)).isEmpty()) {
                                C46409of9 c46409of9 = (C46409of9) m96453k(i6);
                                throw null;
                            }
                        }
                    } else if (m96443u(obj, i7, i6) && !m96444t(obj, m96457g, m96454j(i6))) {
                        return false;
                    }
                }
                List list = (List) C51221wm9.m6356k(obj, m96457g & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    Ei9 m96454j = m96454j(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m96454j.mo83162e(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m96445s(obj, i6, i, i2, i10) && !m96444t(obj, m96457g, m96454j(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f21917f && !this.f21924m.mo81915b(obj).m44100l()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final int m96457g(int i) {
        return this.f21912a[i + 1];
    }

    /* renamed from: i */
    public final Wb9 m96455i(int i) {
        int i2 = i / 3;
        return (Wb9) this.f21913b[i2 + i2 + 1];
    }

    /* renamed from: j */
    public final Ei9 m96454j(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Ei9 ei9 = (Ei9) this.f21913b[i3];
        if (ei9 != null) {
            return ei9;
        }
        Ei9 m36059b = C42288hi9.m36060a().m36059b((Class) this.f21913b[i3 + 1]);
        this.f21913b[i3] = m36059b;
        return m36059b;
    }

    /* renamed from: k */
    public final Object m96453k(int i) {
        int i2 = i / 3;
        return this.f21913b[i2 + i2];
    }

    /* renamed from: m */
    public final void m96451m(Object obj, Object obj2, int i) {
        long m96457g = m96457g(i) & 1048575;
        if (!m96446r(obj2, i)) {
            return;
        }
        Object m6356k = C51221wm9.m6356k(obj, m96457g);
        Object m6356k2 = C51221wm9.m6356k(obj2, m96457g);
        if (m6356k != null && m6356k2 != null) {
            C51221wm9.m6343x(obj, m96457g, C44007kc9.m28733g(m6356k, m6356k2));
            m96449o(obj, i);
        } else if (m6356k2 != null) {
            C51221wm9.m6343x(obj, m96457g, m6356k2);
            m96449o(obj, i);
        }
    }

    /* renamed from: n */
    public final void m96450n(Object obj, Object obj2, int i) {
        Object obj3;
        int m96457g = m96457g(i);
        int i2 = this.f21912a[i];
        long j = m96457g & 1048575;
        if (!m96443u(obj2, i2, i)) {
            return;
        }
        if (m96443u(obj, i2, i)) {
            obj3 = C51221wm9.m6356k(obj, j);
        } else {
            obj3 = null;
        }
        Object m6356k = C51221wm9.m6356k(obj2, j);
        if (obj3 != null && m6356k != null) {
            C51221wm9.m6343x(obj, j, C44007kc9.m28733g(obj3, m6356k));
            m96448p(obj, i2, i);
        } else if (m6356k != null) {
            C51221wm9.m6343x(obj, j, m6356k);
            m96448p(obj, i2, i);
        }
    }

    /* renamed from: o */
    public final void m96449o(Object obj, int i) {
        int m96460O = m96460O(i);
        long j = 1048575 & m96460O;
        if (j == 1048575) {
            return;
        }
        C51221wm9.m6345v(obj, j, (1 << (m96460O >>> 20)) | C51221wm9.m6359h(obj, j));
    }

    /* renamed from: p */
    public final void m96448p(Object obj, int i, int i2) {
        C51221wm9.m6345v(obj, m96460O(i2) & 1048575, i);
    }

    /* renamed from: q */
    public final boolean m96447q(Object obj, Object obj2, int i) {
        return m96446r(obj, i) == m96446r(obj2, i);
    }

    /* renamed from: r */
    public final boolean m96446r(Object obj, int i) {
        int m96460O = m96460O(i);
        long j = m96460O & 1048575;
        if (j == 1048575) {
            int m96457g = m96457g(i);
            long j2 = m96457g & 1048575;
            switch (m96458f(m96457g)) {
                case 0:
                    if (Double.doubleToRawLongBits(C51221wm9.m6361f(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(C51221wm9.m6360g(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C51221wm9.m6358i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C51221wm9.m6358i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C51221wm9.m6359h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C51221wm9.m6358i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C51221wm9.m6359h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C51221wm9.m6370B(obj, j2);
                case 8:
                    Object m6356k = C51221wm9.m6356k(obj, j2);
                    if (m6356k instanceof String) {
                        if (((String) m6356k).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m6356k instanceof T69) {
                        if (T69.f34797c.equals(m6356k)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (C51221wm9.m6356k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (T69.f34797c.equals(C51221wm9.m6356k(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (C51221wm9.m6359h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C51221wm9.m6359h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (C51221wm9.m6359h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C51221wm9.m6358i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C51221wm9.m6359h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C51221wm9.m6358i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C51221wm9.m6356k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((C51221wm9.m6359h(obj, j) & (1 << (m96460O >>> 20))) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: s */
    public final boolean m96445s(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m96446r(obj, i) : (i3 & i4) != 0;
    }

    /* renamed from: u */
    public final boolean m96443u(Object obj, int i, int i2) {
        if (C51221wm9.m6359h(obj, m96460O(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b0  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m96441w(Object obj, C41954h89 c41954h89) throws IOException {
        Iterator it;
        Map.Entry entry;
        int length;
        int i;
        int i2;
        boolean z;
        if (this.f21917f) {
            C39837da9 mo81915b = this.f21924m.mo81915b(obj);
            if (!mo81915b.f76816a.isEmpty()) {
                it = mo81915b.m44106f();
                entry = (Map.Entry) it.next();
                length = this.f21912a.length;
                Unsafe unsafe = f21911q;
                int i3 = 1048575;
                int i4 = 0;
                for (i = 0; i < length; i += 3) {
                    int m96457g = m96457g(i);
                    int[] iArr = this.f21912a;
                    int i5 = iArr[i];
                    int m96458f = m96458f(m96457g);
                    if (m96458f <= 17) {
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
                    while (entry != null) {
                        this.f21924m.mo81916a(entry);
                        if (i5 >= 202056002) {
                            this.f21924m.mo81910g(c41954h89, entry);
                            if (it.hasNext()) {
                                entry = (Map.Entry) it.next();
                            } else {
                                entry = null;
                            }
                        } else {
                            long j = m96457g & 1048575;
                            switch (m96458f) {
                                case 0:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36780r(i5, C51221wm9.m6361f(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36809A(i5, C51221wm9.m6360g(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 2:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36804F(i5, unsafe.getLong(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 3:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36787k(i5, unsafe.getLong(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 4:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36806D(i5, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 5:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36773y(i5, unsafe.getLong(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 6:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36775w(i5, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 7:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36784n(i5, C51221wm9.m6370B(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 8:
                                    if ((i2 & i4) != 0) {
                                        m96439y(i5, unsafe.getObject(obj, j), c41954h89);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 9:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36802H(i5, unsafe.getObject(obj, j), m96454j(i));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 10:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36782p(i5, (T69) unsafe.getObject(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 11:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36789i(i5, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 12:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36777u(i5, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 13:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36800J(i5, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 14:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36798L(i5, unsafe.getLong(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 15:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36796b(i5, unsafe.getInt(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 16:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36794d(i5, unsafe.getLong(obj, j));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 17:
                                    if ((i2 & i4) != 0) {
                                        c41954h89.m36807C(i5, unsafe.getObject(obj, j), m96454j(i));
                                        break;
                                    } else {
                                        break;
                                    }
                                case 18:
                                    z = false;
                                    Ti9.m83092l(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, false);
                                    break;
                                case 19:
                                    z = false;
                                    Ti9.m83088p(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, false);
                                    break;
                                case 20:
                                    z = false;
                                    Ti9.m83085s(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, false);
                                    break;
                                case 21:
                                    z = false;
                                    Ti9.m83130B(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, false);
                                    break;
                                case 22:
                                    z = false;
                                    Ti9.m83086r(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, false);
                                    break;
                                case 23:
                                    z = false;
                                    Ti9.m83089o(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, false);
                                    break;
                                case 24:
                                    z = false;
                                    Ti9.m83090n(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, false);
                                    break;
                                case 25:
                                    z = false;
                                    Ti9.m83094j(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, false);
                                    break;
                                case 26:
                                    Ti9.m83079y(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89);
                                    break;
                                case 27:
                                    Ti9.m83084t(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, m96454j(i));
                                    break;
                                case 28:
                                    Ti9.m83093k(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89);
                                    break;
                                case 29:
                                    z = false;
                                    Ti9.m83078z(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, false);
                                    break;
                                case 30:
                                    z = false;
                                    Ti9.m83091m(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, false);
                                    break;
                                case 31:
                                    z = false;
                                    Ti9.m83083u(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, false);
                                    break;
                                case 32:
                                    z = false;
                                    Ti9.m83082v(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, false);
                                    break;
                                case 33:
                                    z = false;
                                    Ti9.m83081w(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, false);
                                    break;
                                case 34:
                                    z = false;
                                    Ti9.m83080x(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, false);
                                    break;
                                case 35:
                                    Ti9.m83092l(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, true);
                                    break;
                                case 36:
                                    Ti9.m83088p(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, true);
                                    break;
                                case 37:
                                    Ti9.m83085s(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, true);
                                    break;
                                case 38:
                                    Ti9.m83130B(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, true);
                                    break;
                                case 39:
                                    Ti9.m83086r(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, true);
                                    break;
                                case 40:
                                    Ti9.m83089o(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, true);
                                    break;
                                case 41:
                                    Ti9.m83090n(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, true);
                                    break;
                                case 42:
                                    Ti9.m83094j(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, true);
                                    break;
                                case 43:
                                    Ti9.m83078z(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, true);
                                    break;
                                case 44:
                                    Ti9.m83091m(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, true);
                                    break;
                                case 45:
                                    Ti9.m83083u(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, true);
                                    break;
                                case 46:
                                    Ti9.m83082v(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, true);
                                    break;
                                case 47:
                                    Ti9.m83081w(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, true);
                                    break;
                                case 48:
                                    Ti9.m83080x(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, true);
                                    break;
                                case 49:
                                    Ti9.m83087q(this.f21912a[i], (List) unsafe.getObject(obj, j), c41954h89, m96454j(i));
                                    break;
                                case 50:
                                    m96440x(c41954h89, i5, unsafe.getObject(obj, j), i);
                                    break;
                                case 51:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36780r(i5, m96471D(obj, j));
                                    }
                                    break;
                                case 52:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36809A(i5, m96470E(obj, j));
                                    }
                                    break;
                                case 53:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36804F(i5, m96456h(obj, j));
                                    }
                                    break;
                                case 54:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36787k(i5, m96456h(obj, j));
                                    }
                                    break;
                                case 55:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36806D(i5, m96467H(obj, j));
                                    }
                                    break;
                                case 56:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36773y(i5, m96456h(obj, j));
                                    }
                                    break;
                                case 57:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36775w(i5, m96467H(obj, j));
                                    }
                                    break;
                                case 58:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36784n(i5, m96442v(obj, j));
                                    }
                                    break;
                                case 59:
                                    if (m96443u(obj, i5, i)) {
                                        m96439y(i5, unsafe.getObject(obj, j), c41954h89);
                                    }
                                    break;
                                case 60:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36802H(i5, unsafe.getObject(obj, j), m96454j(i));
                                    }
                                    break;
                                case 61:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36782p(i5, (T69) unsafe.getObject(obj, j));
                                    }
                                    break;
                                case 62:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36789i(i5, m96467H(obj, j));
                                    }
                                    break;
                                case 63:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36777u(i5, m96467H(obj, j));
                                    }
                                    break;
                                case 64:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36800J(i5, m96467H(obj, j));
                                    }
                                    break;
                                case 65:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36798L(i5, m96456h(obj, j));
                                    }
                                    break;
                                case 66:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36796b(i5, m96467H(obj, j));
                                    }
                                    break;
                                case 67:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36794d(i5, m96456h(obj, j));
                                    }
                                    break;
                                case 68:
                                    if (m96443u(obj, i5, i)) {
                                        c41954h89.m36807C(i5, unsafe.getObject(obj, j), m96454j(i));
                                    }
                                    break;
                            }
                        }
                    }
                    long j2 = m96457g & 1048575;
                    switch (m96458f) {
                    }
                }
                while (entry != null) {
                    this.f21924m.mo81910g(c41954h89, entry);
                    if (it.hasNext()) {
                        entry = (Map.Entry) it.next();
                    } else {
                        entry = null;
                    }
                }
                Mk9 mk9 = this.f21923l;
                mk9.mo74322j(mk9.mo74329c(obj), c41954h89);
            }
        }
        it = null;
        entry = null;
        length = this.f21912a.length;
        Unsafe unsafe2 = f21911q;
        int i32 = 1048575;
        int i42 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        Mk9 mk92 = this.f21923l;
        mk92.mo74322j(mk92.mo74329c(obj), c41954h89);
    }

    /* renamed from: x */
    public final void m96440x(C41954h89 c41954h89, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        C46409of9 c46409of9 = (C46409of9) m96453k(i2);
        throw null;
    }

    /* renamed from: z */
    public final int m96438z(Object obj, byte[] bArr, int i, int i2, int i3, C43100j49 c43100j49) throws IOException {
        Unsafe unsafe;
        int i4;
        int i5;
        Object obj2;
        Lg9<T> lg9;
        int i6;
        int i7;
        byte b;
        int m96462M;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        Object obj3;
        byte[] bArr2;
        C43100j49 c43100j492;
        int i13;
        int i14;
        int i15;
        Object obj4;
        Object valueOf;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z2;
        int m16518m;
        int i20;
        Object obj5;
        int i21;
        int i22;
        Lg9<T> lg92 = this;
        Object obj6 = obj;
        byte[] bArr3 = bArr;
        int i23 = i2;
        int i24 = i3;
        C43100j49 c43100j493 = c43100j49;
        Unsafe unsafe2 = f21911q;
        int i25 = i;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        int i30 = 1048575;
        while (true) {
            Object obj7 = null;
            if (i25 < i23) {
                int i31 = i25 + 1;
                byte b2 = bArr3[i25];
                if (b2 < 0) {
                    int m16520k = C47844r49.m16520k(b2, bArr3, i31, c43100j493);
                    b = c43100j493.f92111a;
                    i31 = m16520k;
                } else {
                    b = b2;
                }
                int i32 = b >>> 3;
                int i33 = b & 7;
                if (i32 > i29) {
                    m96462M = lg92.m96461N(i32, i27 / 3);
                } else {
                    m96462M = lg92.m96462M(i32);
                }
                if (m96462M == -1) {
                    i8 = i32;
                    i9 = i31;
                    i10 = b;
                    i11 = i28;
                    unsafe = unsafe2;
                    i4 = i24;
                    i12 = 0;
                    z = true;
                } else {
                    int[] iArr = lg92.f21912a;
                    int i34 = iArr[m96462M + 1];
                    int m96458f = m96458f(i34);
                    long j = i34 & 1048575;
                    int i35 = b;
                    if (m96458f <= 17) {
                        int i36 = iArr[m96462M + 2];
                        int i37 = 1 << (i36 >>> 20);
                        int i38 = i36 & 1048575;
                        if (i38 != i30) {
                            if (i30 != 1048575) {
                                long j2 = i30;
                                obj5 = obj;
                                unsafe2.putInt(obj5, j2, i28);
                            } else {
                                obj5 = obj;
                            }
                            i28 = unsafe2.getInt(obj5, i38);
                            i16 = i38;
                            obj6 = obj5;
                        } else {
                            obj6 = obj;
                            i16 = i30;
                        }
                        int i39 = i28;
                        switch (m96458f) {
                            case 0:
                                i17 = i16;
                                i18 = i35;
                                i19 = m96462M;
                                i9 = i31;
                                z2 = true;
                                if (i33 == 1) {
                                    C51221wm9.m6347t(obj6, j, Double.longBitsToDouble(C47844r49.m16516o(bArr3, i9)));
                                    i25 = i9 + 8;
                                    i28 = i39 | i37;
                                    i30 = i17;
                                    i26 = i18;
                                    i27 = i19;
                                    i29 = i32;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i35 = i18;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i12 = i19;
                                    i8 = i32;
                                    i10 = i35;
                                    i11 = i39;
                                    i30 = i17;
                                    break;
                                }
                            case 1:
                                i17 = i16;
                                i18 = i35;
                                i19 = m96462M;
                                i9 = i31;
                                if (i33 == 5) {
                                    C51221wm9.m6346u(obj6, j, Float.intBitsToFloat(C47844r49.m16529b(bArr3, i9)));
                                    i25 = i9 + 4;
                                    i28 = i39 | i37;
                                    i30 = i17;
                                    i26 = i18;
                                    i27 = i19;
                                    i29 = i32;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i35 = i18;
                                    z2 = true;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i12 = i19;
                                    i8 = i32;
                                    i10 = i35;
                                    i11 = i39;
                                    i30 = i17;
                                    break;
                                }
                            case 2:
                            case 3:
                                i17 = i16;
                                i18 = i35;
                                i19 = m96462M;
                                i9 = i31;
                                if (i33 == 0) {
                                    m16518m = C47844r49.m16518m(bArr3, i9, c43100j493);
                                    unsafe2.putLong(obj, j, c43100j493.f92112b);
                                    i28 = i39 | i37;
                                    i30 = i17;
                                    i25 = m16518m;
                                    i26 = i18;
                                    i27 = i19;
                                    i29 = i32;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i35 = i18;
                                    z2 = true;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i12 = i19;
                                    i8 = i32;
                                    i10 = i35;
                                    i11 = i39;
                                    i30 = i17;
                                    break;
                                }
                            case 4:
                            case 11:
                                i17 = i16;
                                i18 = i35;
                                i19 = m96462M;
                                i9 = i31;
                                if (i33 == 0) {
                                    i25 = C47844r49.m16521j(bArr3, i9, c43100j493);
                                    unsafe2.putInt(obj6, j, c43100j493.f92111a);
                                    i28 = i39 | i37;
                                    i30 = i17;
                                    i26 = i18;
                                    i27 = i19;
                                    i29 = i32;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i35 = i18;
                                    z2 = true;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i12 = i19;
                                    i8 = i32;
                                    i10 = i35;
                                    i11 = i39;
                                    i30 = i17;
                                    break;
                                }
                            case 5:
                            case 14:
                                i17 = i16;
                                i18 = i35;
                                i19 = m96462M;
                                if (i33 == 1) {
                                    unsafe2.putLong(obj, j, C47844r49.m16516o(bArr3, i31));
                                    i25 = i31 + 8;
                                    i28 = i39 | i37;
                                    i30 = i17;
                                    i26 = i18;
                                    i27 = i19;
                                    i29 = i32;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i9 = i31;
                                    i35 = i18;
                                    z2 = true;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i12 = i19;
                                    i8 = i32;
                                    i10 = i35;
                                    i11 = i39;
                                    i30 = i17;
                                    break;
                                }
                            case 6:
                            case 13:
                                i20 = i2;
                                i17 = i16;
                                i18 = i35;
                                i19 = m96462M;
                                if (i33 == 5) {
                                    unsafe2.putInt(obj6, j, C47844r49.m16529b(bArr3, i31));
                                    i25 = i31 + 4;
                                    int i40 = i39 | i37;
                                    i30 = i17;
                                    i27 = i19;
                                    i29 = i32;
                                    i23 = i20;
                                    i28 = i40;
                                    i26 = i18;
                                    i24 = i3;
                                    break;
                                } else {
                                    i9 = i31;
                                    i35 = i18;
                                    z2 = true;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i12 = i19;
                                    i8 = i32;
                                    i10 = i35;
                                    i11 = i39;
                                    i30 = i17;
                                    break;
                                }
                            case 7:
                                i20 = i2;
                                i17 = i16;
                                i18 = i35;
                                i19 = m96462M;
                                if (i33 == 0) {
                                    i25 = C47844r49.m16518m(bArr3, i31, c43100j493);
                                    C51221wm9.m6349r(obj6, j, c43100j493.f92112b != 0);
                                    int i402 = i39 | i37;
                                    i30 = i17;
                                    i27 = i19;
                                    i29 = i32;
                                    i23 = i20;
                                    i28 = i402;
                                    i26 = i18;
                                    i24 = i3;
                                    break;
                                } else {
                                    i9 = i31;
                                    i35 = i18;
                                    z2 = true;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i12 = i19;
                                    i8 = i32;
                                    i10 = i35;
                                    i11 = i39;
                                    i30 = i17;
                                    break;
                                }
                            case 8:
                                i20 = i2;
                                i17 = i16;
                                i18 = i35;
                                i19 = m96462M;
                                if (i33 == 2) {
                                    if ((536870912 & i34) == 0) {
                                        i25 = C47844r49.m16524g(bArr3, i31, c43100j493);
                                    } else {
                                        i25 = C47844r49.m16523h(bArr3, i31, c43100j493);
                                    }
                                    unsafe2.putObject(obj6, j, c43100j493.f92113c);
                                    int i4022 = i39 | i37;
                                    i30 = i17;
                                    i27 = i19;
                                    i29 = i32;
                                    i23 = i20;
                                    i28 = i4022;
                                    i26 = i18;
                                    i24 = i3;
                                    break;
                                } else {
                                    i9 = i31;
                                    i35 = i18;
                                    z2 = true;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i12 = i19;
                                    i8 = i32;
                                    i10 = i35;
                                    i11 = i39;
                                    i30 = i17;
                                    break;
                                }
                            case 9:
                                i17 = i16;
                                i18 = i35;
                                i19 = m96462M;
                                if (i33 == 2) {
                                    i20 = i2;
                                    i25 = C47844r49.m16527d(lg92.m96454j(i19), bArr3, i31, i20, c43100j493);
                                    if ((i39 & i37) == 0) {
                                        unsafe2.putObject(obj6, j, c43100j493.f92113c);
                                    } else {
                                        unsafe2.putObject(obj6, j, C44007kc9.m28733g(unsafe2.getObject(obj6, j), c43100j493.f92113c));
                                    }
                                    int i40222 = i39 | i37;
                                    i30 = i17;
                                    i27 = i19;
                                    i29 = i32;
                                    i23 = i20;
                                    i28 = i40222;
                                    i26 = i18;
                                    i24 = i3;
                                    break;
                                } else {
                                    i9 = i31;
                                    i35 = i18;
                                    z2 = true;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i12 = i19;
                                    i8 = i32;
                                    i10 = i35;
                                    i11 = i39;
                                    i30 = i17;
                                    break;
                                }
                            case 10:
                                i17 = i16;
                                i18 = i35;
                                i19 = m96462M;
                                if (i33 == 2) {
                                    i25 = C47844r49.m16530a(bArr3, i31, c43100j493);
                                    unsafe2.putObject(obj6, j, c43100j493.f92113c);
                                    i28 = i39 | i37;
                                    i30 = i17;
                                    i26 = i18;
                                    i27 = i19;
                                    i29 = i32;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i9 = i31;
                                    i35 = i18;
                                    z2 = true;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i12 = i19;
                                    i8 = i32;
                                    i10 = i35;
                                    i11 = i39;
                                    i30 = i17;
                                    break;
                                }
                            case 12:
                                i17 = i16;
                                i18 = i35;
                                i19 = m96462M;
                                if (i33 == 0) {
                                    i25 = C47844r49.m16521j(bArr3, i31, c43100j493);
                                    int i41 = c43100j493.f92111a;
                                    Wb9 m96455i = lg92.m96455i(i19);
                                    if (m96455i != null && !m96455i.zza(i41)) {
                                        m96474A(obj).m84910h(i18, Long.valueOf(i41));
                                        i28 = i39;
                                        i26 = i18;
                                        i27 = i19;
                                        i29 = i32;
                                        i30 = i17;
                                        i23 = i2;
                                        i24 = i3;
                                    } else {
                                        unsafe2.putInt(obj6, j, i41);
                                        i28 = i39 | i37;
                                        i30 = i17;
                                        i26 = i18;
                                        i27 = i19;
                                        i29 = i32;
                                        i23 = i2;
                                        i24 = i3;
                                        break;
                                    }
                                } else {
                                    i9 = i31;
                                    i35 = i18;
                                    z2 = true;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i12 = i19;
                                    i8 = i32;
                                    i10 = i35;
                                    i11 = i39;
                                    i30 = i17;
                                    break;
                                }
                                break;
                            case 15:
                                i17 = i16;
                                i18 = i35;
                                i19 = m96462M;
                                if (i33 == 0) {
                                    i25 = C47844r49.m16521j(bArr3, i31, c43100j493);
                                    unsafe2.putInt(obj6, j, C50837w79.m7374a(c43100j493.f92111a));
                                    i28 = i39 | i37;
                                    i30 = i17;
                                    i26 = i18;
                                    i27 = i19;
                                    i29 = i32;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i9 = i31;
                                    i35 = i18;
                                    z2 = true;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i12 = i19;
                                    i8 = i32;
                                    i10 = i35;
                                    i11 = i39;
                                    i30 = i17;
                                    break;
                                }
                            case 16:
                                if (i33 == 0) {
                                    m16518m = C47844r49.m16518m(bArr3, i31, c43100j493);
                                    i17 = i16;
                                    i19 = m96462M;
                                    i18 = i35;
                                    unsafe2.putLong(obj, j, C50837w79.m7373b(c43100j493.f92112b));
                                    i28 = i39 | i37;
                                    i30 = i17;
                                    i25 = m16518m;
                                    i26 = i18;
                                    i27 = i19;
                                    i29 = i32;
                                    i23 = i2;
                                    i24 = i3;
                                    break;
                                } else {
                                    i17 = i16;
                                    i19 = m96462M;
                                    i9 = i31;
                                    z2 = true;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i12 = i19;
                                    i8 = i32;
                                    i10 = i35;
                                    i11 = i39;
                                    i30 = i17;
                                    break;
                                }
                            default:
                                i17 = i16;
                                i18 = i35;
                                i19 = m96462M;
                                i9 = i31;
                                z2 = true;
                                if (i33 == 3) {
                                    i25 = C47844r49.m16528c(lg92.m96454j(i19), bArr, i9, i2, (i32 << 3) | 4, c43100j49);
                                    if ((i39 & i37) == 0) {
                                        unsafe2.putObject(obj6, j, c43100j493.f92113c);
                                    } else {
                                        unsafe2.putObject(obj6, j, C44007kc9.m28733g(unsafe2.getObject(obj6, j), c43100j493.f92113c));
                                    }
                                    i28 = i39 | i37;
                                    bArr3 = bArr;
                                    i30 = i17;
                                    i24 = i3;
                                    i27 = i19;
                                    i29 = i32;
                                    i26 = i18;
                                    i23 = i2;
                                    break;
                                } else {
                                    i35 = i18;
                                    i4 = i3;
                                    z = z2;
                                    unsafe = unsafe2;
                                    i12 = i19;
                                    i8 = i32;
                                    i10 = i35;
                                    i11 = i39;
                                    i30 = i17;
                                    break;
                                }
                        }
                    } else {
                        obj6 = obj;
                        int i42 = m96462M;
                        int i43 = i31;
                        if (m96458f != 27) {
                            i11 = i28;
                            i21 = i30;
                            if (m96458f <= 49) {
                                z = true;
                                i8 = i32;
                                unsafe = unsafe2;
                                i12 = i42;
                                i25 = m96463L(obj, bArr, i43, i2, i35, i32, i33, i42, i34, m96458f, j, c43100j49);
                                if (i25 != i43) {
                                    lg92 = this;
                                    obj6 = obj;
                                    bArr3 = bArr;
                                    i23 = i2;
                                    i24 = i3;
                                    c43100j493 = c43100j49;
                                    i28 = i11;
                                    i27 = i12;
                                    i26 = i35;
                                    i30 = i21;
                                    i29 = i8;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i9 = i25;
                                    i10 = i35;
                                    i30 = i21;
                                }
                            } else {
                                i22 = i43;
                                i8 = i32;
                                unsafe = unsafe2;
                                i12 = i42;
                                z = true;
                                if (m96458f != 50) {
                                    i25 = m96465J(obj, bArr, i22, i2, i35, i8, i33, i34, m96458f, j, i12, c43100j49);
                                    if (i25 != i22) {
                                        lg92 = this;
                                        obj6 = obj;
                                        bArr3 = bArr;
                                        i23 = i2;
                                        i24 = i3;
                                        c43100j493 = c43100j49;
                                        i28 = i11;
                                        i27 = i12;
                                        i26 = i35;
                                        i30 = i21;
                                        i29 = i8;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i9 = i25;
                                        i10 = i35;
                                        i30 = i21;
                                    }
                                } else if (i33 == 2) {
                                    i25 = m96466I(obj, bArr, i22, i2, i12, j, c43100j49);
                                    if (i25 != i22) {
                                        lg92 = this;
                                        obj6 = obj;
                                        bArr3 = bArr;
                                        i23 = i2;
                                        i24 = i3;
                                        c43100j493 = c43100j49;
                                        i28 = i11;
                                        i27 = i12;
                                        i26 = i35;
                                        i30 = i21;
                                        i29 = i8;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i9 = i25;
                                        i10 = i35;
                                        i30 = i21;
                                    }
                                }
                            }
                        } else if (i33 == 2) {
                            InterfaceC39857dc9 interfaceC39857dc9 = (InterfaceC39857dc9) unsafe2.getObject(obj6, j);
                            if (!interfaceC39857dc9.zzc()) {
                                int size = interfaceC39857dc9.size();
                                interfaceC39857dc9 = interfaceC39857dc9.mo1843d(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj6, j, interfaceC39857dc9);
                            }
                            i26 = i35;
                            i25 = C47844r49.m16526e(lg92.m96454j(i42), i26, bArr, i43, i2, interfaceC39857dc9, c43100j49);
                            bArr3 = bArr;
                            i24 = i3;
                            i29 = i32;
                            i27 = i42;
                            i28 = i28;
                            i30 = i30;
                            i23 = i2;
                        } else {
                            i11 = i28;
                            i21 = i30;
                            i22 = i43;
                            i8 = i32;
                            unsafe = unsafe2;
                            i12 = i42;
                            z = true;
                        }
                        i4 = i3;
                        i9 = i22;
                        i10 = i35;
                        i30 = i21;
                    }
                }
                if (i10 != i4 || i4 == 0) {
                    if (this.f21917f) {
                        c43100j492 = c43100j49;
                        if (c43100j492.f92114d != N89.m94318a()) {
                            i14 = i8;
                            C42218hb9 m94316c = c43100j492.f92114d.m94316c(this.f21916e, i14);
                            if (m94316c == null) {
                                i25 = C47844r49.m16522i(i10, bArr, i9, i2, m96474A(obj), c43100j49);
                                obj3 = obj;
                                bArr2 = bArr;
                                i13 = i30;
                                i15 = i2;
                            } else {
                                obj3 = obj;
                                Ta9 ta9 = (Ta9) obj3;
                                ta9.m83365u();
                                C39837da9 c39837da9 = ta9.zzb;
                                EnumC41152fn9 enumC41152fn9 = m94316c.f85601d.f50706d;
                                if (enumC41152fn9 != EnumC41152fn9.f80698p) {
                                    switch (enumC41152fn9.ordinal()) {
                                        case 0:
                                            bArr2 = bArr;
                                            i13 = i30;
                                            i15 = i2;
                                            obj7 = Double.valueOf(Double.longBitsToDouble(C47844r49.m16516o(bArr2, i9)));
                                            i9 += 8;
                                            obj4 = obj7;
                                            break;
                                        case 1:
                                            bArr2 = bArr;
                                            i13 = i30;
                                            i15 = i2;
                                            obj7 = Float.valueOf(Float.intBitsToFloat(C47844r49.m16529b(bArr2, i9)));
                                            i9 += 4;
                                            obj4 = obj7;
                                            break;
                                        case 2:
                                        case 3:
                                            bArr2 = bArr;
                                            i13 = i30;
                                            i15 = i2;
                                            i9 = C47844r49.m16518m(bArr2, i9, c43100j492);
                                            obj7 = Long.valueOf(c43100j492.f92112b);
                                            obj4 = obj7;
                                            break;
                                        case 4:
                                        case 12:
                                            bArr2 = bArr;
                                            i13 = i30;
                                            i15 = i2;
                                            i9 = C47844r49.m16521j(bArr2, i9, c43100j492);
                                            obj7 = Integer.valueOf(c43100j492.f92111a);
                                            obj4 = obj7;
                                            break;
                                        case 5:
                                        case 15:
                                            bArr2 = bArr;
                                            i13 = i30;
                                            i15 = i2;
                                            obj7 = Long.valueOf(C47844r49.m16516o(bArr2, i9));
                                            i9 += 8;
                                            obj4 = obj7;
                                            break;
                                        case 6:
                                        case 14:
                                            bArr2 = bArr;
                                            i13 = i30;
                                            i15 = i2;
                                            obj7 = Integer.valueOf(C47844r49.m16529b(bArr2, i9));
                                            i9 += 4;
                                            obj4 = obj7;
                                            break;
                                        case 7:
                                            bArr2 = bArr;
                                            i13 = i30;
                                            i15 = i2;
                                            i9 = C47844r49.m16518m(bArr2, i9, c43100j492);
                                            obj7 = Boolean.valueOf(c43100j492.f92112b != 0 ? z : false);
                                            obj4 = obj7;
                                            break;
                                        case 8:
                                            bArr2 = bArr;
                                            i13 = i30;
                                            i15 = i2;
                                            i9 = C47844r49.m16524g(bArr2, i9, c43100j492);
                                            obj4 = c43100j492.f92113c;
                                            break;
                                        case 9:
                                            bArr2 = bArr;
                                            i13 = i30;
                                            i15 = i2;
                                            i9 = C47844r49.m16528c(C42288hi9.m36060a().m36059b(m94316c.f85600c.getClass()), bArr, i9, i2, (i14 << 3) | 4, c43100j49);
                                            obj4 = c43100j492.f92113c;
                                            break;
                                        case 10:
                                            bArr2 = bArr;
                                            i9 = C47844r49.m16527d(C42288hi9.m36060a().m36059b(m94316c.f85600c.getClass()), bArr2, i9, i2, c43100j492);
                                            obj4 = c43100j492.f92113c;
                                            i13 = i30;
                                            i15 = i2;
                                            break;
                                        case 11:
                                            bArr2 = bArr;
                                            i9 = C47844r49.m16530a(bArr2, i9, c43100j492);
                                            obj4 = c43100j492.f92113c;
                                            i13 = i30;
                                            i15 = i2;
                                            break;
                                        case 13:
                                            throw new IllegalStateException("Shouldn't reach here.");
                                        case 16:
                                            bArr2 = bArr;
                                            i9 = C47844r49.m16521j(bArr2, i9, c43100j492);
                                            valueOf = Integer.valueOf(C50837w79.m7374a(c43100j492.f92111a));
                                            i13 = i30;
                                            obj4 = valueOf;
                                            i15 = i2;
                                            break;
                                        case 17:
                                            bArr2 = bArr;
                                            i9 = C47844r49.m16518m(bArr2, i9, c43100j492);
                                            valueOf = Long.valueOf(C50837w79.m7373b(c43100j492.f92112b));
                                            i13 = i30;
                                            obj4 = valueOf;
                                            i15 = i2;
                                            break;
                                        default:
                                            bArr2 = bArr;
                                            i13 = i30;
                                            i15 = i2;
                                            obj4 = obj7;
                                            break;
                                    }
                                    C38050ab9 c38050ab9 = m94316c.f85601d;
                                    boolean z3 = c38050ab9.f50707e;
                                    c39837da9.m44105g(c38050ab9, obj4);
                                    i25 = i9;
                                } else {
                                    C47844r49.m16521j(bArr, i9, c43100j492);
                                    throw null;
                                }
                            }
                            i26 = i10;
                            i29 = i14;
                            obj6 = obj3;
                            bArr3 = bArr2;
                            i28 = i11;
                            i27 = i12;
                            i23 = i15;
                            i24 = i4;
                            lg92 = this;
                            c43100j493 = c43100j492;
                            unsafe2 = unsafe;
                            i30 = i13;
                        } else {
                            obj3 = obj;
                            bArr2 = bArr;
                        }
                    } else {
                        obj3 = obj;
                        bArr2 = bArr;
                        c43100j492 = c43100j49;
                    }
                    i13 = i30;
                    i14 = i8;
                    i15 = i2;
                    i25 = C47844r49.m16522i(i10, bArr, i9, i2, m96474A(obj), c43100j49);
                    i26 = i10;
                    i29 = i14;
                    obj6 = obj3;
                    bArr3 = bArr2;
                    i28 = i11;
                    i27 = i12;
                    i23 = i15;
                    i24 = i4;
                    lg92 = this;
                    c43100j493 = c43100j492;
                    unsafe2 = unsafe;
                    i30 = i13;
                } else {
                    lg9 = this;
                    obj2 = obj;
                    i25 = i9;
                    i6 = i30;
                    i26 = i10;
                    i28 = i11;
                    i7 = 1048575;
                    i5 = i2;
                }
            } else {
                int i44 = i30;
                unsafe = unsafe2;
                i4 = i24;
                i5 = i23;
                obj2 = obj6;
                lg9 = lg92;
                i6 = i44;
                i7 = 1048575;
            }
        }
        if (i6 != i7) {
            unsafe.putInt(obj2, i6, i28);
        }
        for (int i45 = lg9.f21920i; i45 < lg9.f21921j; i45++) {
            int i46 = lg9.f21919h[i45];
            int i47 = lg9.f21912a[i46];
            Object m6356k = C51221wm9.m6356k(obj2, lg9.m96457g(i46) & i7);
            if (m6356k != null && lg9.m96455i(i46) != null) {
                C51151wf9 c51151wf9 = (C51151wf9) m6356k;
                C46409of9 c46409of9 = (C46409of9) lg9.m96453k(i46);
                throw null;
            }
        }
        if (i4 == 0) {
            if (i25 != i5) {
                throw zzov.m51291e();
            }
        } else if (i25 > i5 || i26 != i4) {
            throw zzov.m51291e();
        }
        return i25;
    }

    @Override // p000.Ei9
    public final int zza(Object obj) {
        return this.f21918g ? m96468G(obj) : m96469F(obj);
    }

    @Override // p000.Ei9
    public final int zzb(Object obj) {
        int i;
        int m28737c;
        int length = this.f21912a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m96457g = m96457g(i3);
            int i4 = this.f21912a[i3];
            long j = 1048575 & m96457g;
            int i5 = 37;
            switch (m96458f(m96457g)) {
                case 0:
                    i = i2 * 53;
                    m28737c = C44007kc9.m28737c(Double.doubleToLongBits(C51221wm9.m6361f(obj, j)));
                    i2 = i + m28737c;
                    break;
                case 1:
                    i = i2 * 53;
                    m28737c = Float.floatToIntBits(C51221wm9.m6360g(obj, j));
                    i2 = i + m28737c;
                    break;
                case 2:
                    i = i2 * 53;
                    m28737c = C44007kc9.m28737c(C51221wm9.m6358i(obj, j));
                    i2 = i + m28737c;
                    break;
                case 3:
                    i = i2 * 53;
                    m28737c = C44007kc9.m28737c(C51221wm9.m6358i(obj, j));
                    i2 = i + m28737c;
                    break;
                case 4:
                    i = i2 * 53;
                    m28737c = C51221wm9.m6359h(obj, j);
                    i2 = i + m28737c;
                    break;
                case 5:
                    i = i2 * 53;
                    m28737c = C44007kc9.m28737c(C51221wm9.m6358i(obj, j));
                    i2 = i + m28737c;
                    break;
                case 6:
                    i = i2 * 53;
                    m28737c = C51221wm9.m6359h(obj, j);
                    i2 = i + m28737c;
                    break;
                case 7:
                    i = i2 * 53;
                    m28737c = C44007kc9.m28739a(C51221wm9.m6370B(obj, j));
                    i2 = i + m28737c;
                    break;
                case 8:
                    i = i2 * 53;
                    m28737c = ((String) C51221wm9.m6356k(obj, j)).hashCode();
                    i2 = i + m28737c;
                    break;
                case 9:
                    Object m6356k = C51221wm9.m6356k(obj, j);
                    if (m6356k != null) {
                        i5 = m6356k.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    m28737c = C51221wm9.m6356k(obj, j).hashCode();
                    i2 = i + m28737c;
                    break;
                case 11:
                    i = i2 * 53;
                    m28737c = C51221wm9.m6359h(obj, j);
                    i2 = i + m28737c;
                    break;
                case 12:
                    i = i2 * 53;
                    m28737c = C51221wm9.m6359h(obj, j);
                    i2 = i + m28737c;
                    break;
                case 13:
                    i = i2 * 53;
                    m28737c = C51221wm9.m6359h(obj, j);
                    i2 = i + m28737c;
                    break;
                case 14:
                    i = i2 * 53;
                    m28737c = C44007kc9.m28737c(C51221wm9.m6358i(obj, j));
                    i2 = i + m28737c;
                    break;
                case 15:
                    i = i2 * 53;
                    m28737c = C51221wm9.m6359h(obj, j);
                    i2 = i + m28737c;
                    break;
                case 16:
                    i = i2 * 53;
                    m28737c = C44007kc9.m28737c(C51221wm9.m6358i(obj, j));
                    i2 = i + m28737c;
                    break;
                case 17:
                    Object m6356k2 = C51221wm9.m6356k(obj, j);
                    if (m6356k2 != null) {
                        i5 = m6356k2.hashCode();
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
                    m28737c = C51221wm9.m6356k(obj, j).hashCode();
                    i2 = i + m28737c;
                    break;
                case 50:
                    i = i2 * 53;
                    m28737c = C51221wm9.m6356k(obj, j).hashCode();
                    i2 = i + m28737c;
                    break;
                case 51:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = C44007kc9.m28737c(Double.doubleToLongBits(m96471D(obj, j)));
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = Float.floatToIntBits(m96470E(obj, j));
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = C44007kc9.m28737c(m96456h(obj, j));
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = C44007kc9.m28737c(m96456h(obj, j));
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = m96467H(obj, j);
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = C44007kc9.m28737c(m96456h(obj, j));
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = m96467H(obj, j);
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = C44007kc9.m28739a(m96442v(obj, j));
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = ((String) C51221wm9.m6356k(obj, j)).hashCode();
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = C51221wm9.m6356k(obj, j).hashCode();
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = C51221wm9.m6356k(obj, j).hashCode();
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = m96467H(obj, j);
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = m96467H(obj, j);
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = m96467H(obj, j);
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = C44007kc9.m28737c(m96456h(obj, j));
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = m96467H(obj, j);
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = C44007kc9.m28737c(m96456h(obj, j));
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m96443u(obj, i4, i3)) {
                        i = i2 * 53;
                        m28737c = C51221wm9.m6356k(obj, j).hashCode();
                        i2 = i + m28737c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f21923l.mo74329c(obj).hashCode();
        if (this.f21917f) {
            return (hashCode * 53) + this.f21924m.mo81915b(obj).f76816a.hashCode();
        }
        return hashCode;
    }

    @Override // p000.Ei9
    public final Object zze() {
        return ((AbstractC49926ub9) this.f21916e).mo9690n(4, null, null);
    }

    @Override // p000.Ei9
    public final void zzf(Object obj) {
        int i;
        int i2 = this.f21920i;
        while (true) {
            i = this.f21921j;
            if (i2 >= i) {
                break;
            }
            long m96457g = m96457g(this.f21919h[i2]) & 1048575;
            Object m6356k = C51221wm9.m6356k(obj, m96457g);
            if (m6356k != null) {
                ((C51151wf9) m6356k).m6532f();
                C51221wm9.m6343x(obj, m96457g, m6356k);
            }
            i2++;
        }
        int length = this.f21919h.length;
        while (i < length) {
            this.f21922k.mo20701a(obj, this.f21919h[i]);
            i++;
        }
        this.f21923l.mo74325g(obj);
        if (this.f21917f) {
            this.f21924m.mo81912e(obj);
        }
    }
}
