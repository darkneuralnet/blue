package p000;

import com.google.android.gms.internal.recaptcha.zzrq;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;
/* renamed from: Vp9 */
/* loaded from: classes6.dex */
public final class Vp9<T> implements InterfaceC38803br9<T> {

    /* renamed from: q */
    public static final int[] f39820q = new int[0];

    /* renamed from: r */
    public static final Unsafe f39821r = Fs9.m106344l();

    /* renamed from: a */
    public final int[] f39822a;

    /* renamed from: b */
    public final Object[] f39823b;

    /* renamed from: c */
    public final int f39824c;

    /* renamed from: d */
    public final int f39825d;

    /* renamed from: e */
    public final Np9 f39826e;

    /* renamed from: f */
    public final boolean f39827f;

    /* renamed from: g */
    public final boolean f39828g;

    /* renamed from: h */
    public final boolean f39829h;

    /* renamed from: i */
    public final int[] f39830i;

    /* renamed from: j */
    public final int f39831j;

    /* renamed from: k */
    public final int f39832k;

    /* renamed from: l */
    public final AbstractC38783bp9 f39833l;

    /* renamed from: m */
    public final Nr9<?, ?> f39834m;

    /* renamed from: n */
    public final AbstractC52387yk9<?> f39835n;

    /* renamed from: o */
    public final C38793bq9 f39836o;

    /* renamed from: p */
    public final Ap9 f39837p;

    /* JADX WARN: Multi-variable type inference failed */
    public Vp9(int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, Np9 np9, boolean z, boolean z2, int[] iArr3, int i3, int i4, C38793bq9 c38793bq9, AbstractC38783bp9 abstractC38783bp9, Nr9<?, ?> nr9, AbstractC52387yk9<?> abstractC52387yk9, Ap9 ap9) {
        this.f39822a = iArr;
        this.f39823b = iArr2;
        this.f39824c = objArr;
        this.f39825d = i;
        this.f39828g = i2 instanceof Em9;
        this.f39829h = np9;
        boolean z3 = false;
        if (nr9 != 0 && nr9.mo2662h(i2)) {
            z3 = true;
        }
        this.f39827f = z3;
        this.f39830i = z2;
        this.f39831j = iArr3;
        this.f39832k = i3;
        this.f39836o = i4;
        this.f39833l = c38793bq9;
        this.f39834m = abstractC38783bp9;
        this.f39835n = nr9;
        this.f39826e = i2;
        this.f39837p = abstractC52387yk9;
    }

    /* renamed from: B */
    public static int m79376B(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: D */
    public static <T> long m79374D(T t, long j) {
        return ((Long) Fs9.m106345k(t, j)).longValue();
    }

    /* renamed from: I */
    public static Field m79369I(Class<?> cls, String str) {
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

    /* renamed from: m */
    public static boolean m79360m(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static boolean m79357p(Object obj, int i, InterfaceC38803br9 interfaceC38803br9) {
        return interfaceC38803br9.mo62271c(Fs9.m106345k(obj, i & 1048575));
    }

    /* renamed from: r */
    public static <T> boolean m79355r(T t, long j) {
        return ((Boolean) Fs9.m106345k(t, j)).booleanValue();
    }

    /* renamed from: s */
    public static final void m79354s(int i, Object obj, Vs9 vs9) throws IOException {
        if (obj instanceof String) {
            vs9.mo2724r(i, (String) obj);
        } else {
            vs9.mo2743J(i, (AbstractC45836nh9) obj);
        }
    }

    /* renamed from: t */
    public static <T> Vp9<T> m79353t(Class<T> cls, Fp9 fp9, C38793bq9 c38793bq9, AbstractC38783bp9 abstractC38783bp9, Nr9<?, ?> nr9, AbstractC52387yk9<?> abstractC52387yk9, Ap9 ap9) {
        if (fp9 instanceof C49483tq9) {
            return m79352u((C49483tq9) fp9, c38793bq9, abstractC38783bp9, nr9, abstractC52387yk9, ap9);
        }
        Cr9 cr9 = (Cr9) fp9;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0384  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> Vp9<T> m79352u(C49483tq9 c49483tq9, C38793bq9 c38793bq9, AbstractC38783bp9 abstractC38783bp9, Nr9<?, ?> nr9, AbstractC52387yk9<?> abstractC52387yk9, Ap9 ap9) {
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
        Field m79369I;
        char charAt12;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field m79369I2;
        Object obj2;
        Field m79369I3;
        int i27;
        char charAt13;
        int i28;
        char charAt14;
        int i29;
        char charAt15;
        int i30;
        char charAt16;
        boolean z = c49483tq9.zzc() == 2;
        String m11638a = c49483tq9.m11638a();
        int length = m11638a.length();
        char c = 55296;
        if (m11638a.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (m11638a.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int charAt17 = m11638a.charAt(i);
        if (charAt17 >= 55296) {
            int i33 = charAt17 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                charAt16 = m11638a.charAt(i32);
                if (charAt16 < 55296) {
                    break;
                }
                i33 |= (charAt16 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            charAt17 = i33 | (charAt16 << i34);
            i32 = i30;
        }
        if (charAt17 == 0) {
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i4 = 0;
            charAt3 = 0;
            i2 = 0;
            iArr = f39820q;
            i3 = 0;
        } else {
            int i35 = i32 + 1;
            int charAt18 = m11638a.charAt(i32);
            if (charAt18 >= 55296) {
                int i36 = charAt18 & 8191;
                int i37 = 13;
                while (true) {
                    i13 = i35 + 1;
                    charAt11 = m11638a.charAt(i35);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i36 |= (charAt11 & 8191) << i37;
                    i37 += 13;
                    i35 = i13;
                }
                charAt18 = i36 | (charAt11 << i37);
                i35 = i13;
            }
            int i38 = i35 + 1;
            int charAt19 = m11638a.charAt(i35);
            if (charAt19 >= 55296) {
                int i39 = charAt19 & 8191;
                int i40 = 13;
                while (true) {
                    i12 = i38 + 1;
                    charAt10 = m11638a.charAt(i38);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i39 |= (charAt10 & 8191) << i40;
                    i40 += 13;
                    i38 = i12;
                }
                charAt19 = i39 | (charAt10 << i40);
                i38 = i12;
            }
            int i41 = i38 + 1;
            charAt = m11638a.charAt(i38);
            if (charAt >= 55296) {
                int i42 = charAt & 8191;
                int i43 = 13;
                while (true) {
                    i11 = i41 + 1;
                    charAt9 = m11638a.charAt(i41);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i42 |= (charAt9 & 8191) << i43;
                    i43 += 13;
                    i41 = i11;
                }
                charAt = i42 | (charAt9 << i43);
                i41 = i11;
            }
            int i44 = i41 + 1;
            int charAt20 = m11638a.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i10 = i44 + 1;
                    charAt8 = m11638a.charAt(i44);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i45 |= (charAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i10;
                }
                charAt20 = i45 | (charAt8 << i46);
                i44 = i10;
            }
            int i47 = i44 + 1;
            charAt2 = m11638a.charAt(i44);
            if (charAt2 >= 55296) {
                int i48 = charAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i9 = i47 + 1;
                    charAt7 = m11638a.charAt(i47);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i48 |= (charAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i9;
                }
                charAt2 = i48 | (charAt7 << i49);
                i47 = i9;
            }
            int i50 = i47 + 1;
            int charAt21 = m11638a.charAt(i47);
            if (charAt21 >= 55296) {
                int i51 = charAt21 & 8191;
                int i52 = 13;
                while (true) {
                    i8 = i50 + 1;
                    charAt6 = m11638a.charAt(i50);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i51 |= (charAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i8;
                }
                charAt21 = i51 | (charAt6 << i52);
                i50 = i8;
            }
            int i53 = i50 + 1;
            int charAt22 = m11638a.charAt(i50);
            if (charAt22 >= 55296) {
                int i54 = charAt22 & 8191;
                int i55 = 13;
                while (true) {
                    i7 = i53 + 1;
                    charAt5 = m11638a.charAt(i53);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i7;
                }
                charAt22 = i54 | (charAt5 << i55);
                i53 = i7;
            }
            int i56 = i53 + 1;
            charAt3 = m11638a.charAt(i53);
            if (charAt3 >= 55296) {
                int i57 = charAt3 & 8191;
                int i58 = 13;
                while (true) {
                    i6 = i56 + 1;
                    charAt4 = m11638a.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i57 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i6;
                }
                charAt3 = i57 | (charAt4 << i58);
                i56 = i6;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i2 = charAt18 + charAt18 + charAt19;
            i3 = charAt18;
            i32 = i56;
            int i59 = charAt21;
            i4 = charAt20;
            i5 = i59;
        }
        Unsafe unsafe = f39821r;
        Object[] m11637b = c49483tq9.m11637b();
        Class<?> cls = c49483tq9.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i60 = charAt3 + i5;
        int i61 = charAt3;
        int i62 = i60;
        int i63 = 0;
        int i64 = 0;
        while (i32 < length) {
            int i65 = i32 + 1;
            int charAt23 = m11638a.charAt(i32);
            if (charAt23 >= c) {
                int i66 = charAt23 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i29 = i67 + 1;
                    charAt15 = m11638a.charAt(i67);
                    if (charAt15 < c) {
                        break;
                    }
                    i66 |= (charAt15 & 8191) << i68;
                    i68 += 13;
                    i67 = i29;
                }
                charAt23 = i66 | (charAt15 << i68);
                i14 = i29;
            } else {
                i14 = i65;
            }
            int i69 = i14 + 1;
            int charAt24 = m11638a.charAt(i14);
            if (charAt24 >= c) {
                int i70 = charAt24 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i28 = i71 + 1;
                    charAt14 = m11638a.charAt(i71);
                    i15 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i70 |= (charAt14 & 8191) << i72;
                    i72 += 13;
                    i71 = i28;
                    length = i15;
                }
                charAt24 = i70 | (charAt14 << i72);
                i16 = i28;
            } else {
                i15 = length;
                i16 = i69;
            }
            int i73 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i74 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            if (i73 >= 51) {
                int i75 = i16 + 1;
                int charAt25 = m11638a.charAt(i16);
                if (charAt25 >= 55296) {
                    int i76 = charAt25 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i27 = i77 + 1;
                        charAt13 = m11638a.charAt(i77);
                        i18 = i4;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i76 |= (charAt13 & 8191) << i78;
                        i78 += 13;
                        i77 = i27;
                        i4 = i18;
                    }
                    charAt25 = i76 | (charAt13 << i78);
                    i25 = i27;
                } else {
                    i18 = i4;
                    i25 = i75;
                }
                int i79 = i73 - 51;
                i22 = i25;
                if (i79 == 9 || i79 == 17) {
                    int i80 = i63 / 3;
                    i26 = i2 + 1;
                    objArr2[i80 + i80 + 1] = m11637b[i2];
                } else {
                    if (i79 == 12 && !z) {
                        int i81 = i63 / 3;
                        i26 = i2 + 1;
                        objArr2[i81 + i81 + 1] = m11637b[i2];
                    }
                    int i82 = charAt25 + charAt25;
                    obj = m11637b[i82];
                    if (!(obj instanceof Field)) {
                        m79369I2 = (Field) obj;
                    } else {
                        m79369I2 = m79369I(cls, (String) obj);
                        m11637b[i82] = m79369I2;
                    }
                    iArr2 = iArr3;
                    i17 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m79369I2);
                    int i83 = i82 + 1;
                    obj2 = m11637b[i83];
                    if (!(obj2 instanceof Field)) {
                        m79369I3 = (Field) obj2;
                    } else {
                        m79369I3 = m79369I(cls, (String) obj2);
                        m11637b[i83] = m79369I3;
                    }
                    str = m11638a;
                    i21 = (int) unsafe.objectFieldOffset(m79369I3);
                    objArr = objArr2;
                    objectFieldOffset = objectFieldOffset2;
                    i23 = 0;
                }
                i2 = i26;
                int i822 = charAt25 + charAt25;
                obj = m11637b[i822];
                if (!(obj instanceof Field)) {
                }
                iArr2 = iArr3;
                i17 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m79369I2);
                int i832 = i822 + 1;
                obj2 = m11637b[i832];
                if (!(obj2 instanceof Field)) {
                }
                str = m11638a;
                i21 = (int) unsafe.objectFieldOffset(m79369I3);
                objArr = objArr2;
                objectFieldOffset = objectFieldOffset22;
                i23 = 0;
            } else {
                iArr2 = iArr3;
                i17 = charAt;
                i18 = i4;
                int i84 = i2 + 1;
                Field m79369I4 = m79369I(cls, (String) m11637b[i2]);
                if (i73 == 9 || i73 == 17) {
                    int i85 = i63 / 3;
                    objArr2[i85 + i85 + 1] = m79369I4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        int i86 = i63 / 3;
                        i24 = i84 + 1;
                        objArr2[i86 + i86 + 1] = m11637b[i84];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (!z) {
                            int i87 = i63 / 3;
                            i24 = i84 + 1;
                            objArr2[i87 + i87 + 1] = m11637b[i84];
                        }
                    } else if (i73 == 50) {
                        int i88 = i61 + 1;
                        iArr[i61] = i63;
                        int i89 = i63 / 3;
                        int i90 = i89 + i89;
                        int i91 = i84 + 1;
                        objArr2[i90] = m11637b[i84];
                        if ((charAt24 & 2048) != 0) {
                            i84 = i91 + 1;
                            objArr2[i90 + 1] = m11637b[i91];
                            i61 = i88;
                        } else {
                            i61 = i88;
                            i19 = i91;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(m79369I4);
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i73 > 17) {
                                str = m11638a;
                                i20 = i19;
                                i21 = 1048575;
                                i22 = i16;
                                i23 = 0;
                            } else {
                                int i92 = i16 + 1;
                                int charAt26 = m11638a.charAt(i16);
                                if (charAt26 >= 55296) {
                                    int i93 = charAt26 & 8191;
                                    int i94 = 13;
                                    while (true) {
                                        i22 = i92 + 1;
                                        charAt12 = m11638a.charAt(i92);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i93 |= (charAt12 & 8191) << i94;
                                        i94 += 13;
                                        i92 = i22;
                                    }
                                    charAt26 = i93 | (charAt12 << i94);
                                } else {
                                    i22 = i92;
                                }
                                int i95 = i3 + i3 + (charAt26 / 32);
                                Object obj3 = m11637b[i95];
                                str = m11638a;
                                if (obj3 instanceof Field) {
                                    m79369I = (Field) obj3;
                                } else {
                                    m79369I = m79369I(cls, (String) obj3);
                                    m11637b[i95] = m79369I;
                                }
                                i20 = i19;
                                i21 = (int) unsafe.objectFieldOffset(m79369I);
                                i23 = charAt26 % 32;
                            }
                            if (i73 >= 18 || i73 > 49) {
                                i2 = i20;
                            } else {
                                iArr[i62] = objectFieldOffset;
                                i2 = i20;
                                i62++;
                            }
                        }
                    }
                    i19 = i24;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m79369I4);
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = m11638a;
                    i20 = i19;
                    i21 = 1048575;
                    i22 = i16;
                    i23 = 0;
                    if (i73 >= 18) {
                    }
                    i2 = i20;
                }
                i19 = i84;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m79369I4);
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                str = m11638a;
                i20 = i19;
                i21 = 1048575;
                i22 = i16;
                i23 = 0;
                if (i73 >= 18) {
                }
                i2 = i20;
            }
            int i96 = i63 + 1;
            iArr2[i63] = charAt23;
            int i97 = i96 + 1;
            iArr2[i96] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i73 << 20) | objectFieldOffset;
            i63 = i97 + 1;
            iArr2[i97] = (i23 << 20) | i21;
            charAt = i17;
            charAt3 = i74;
            i32 = i22;
            length = i15;
            objArr2 = objArr;
            m11638a = str;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new Vp9<>(iArr3, objArr2, charAt, i4, c49483tq9.zza(), z, false, iArr, charAt3, i60, c38793bq9, abstractC38783bp9, nr9, abstractC52387yk9, ap9, null);
    }

    /* renamed from: v */
    public static <T> double m79351v(T t, long j) {
        return ((Double) Fs9.m106345k(t, j)).doubleValue();
    }

    /* renamed from: w */
    public static <T> float m79350w(T t, long j) {
        return ((Float) Fs9.m106345k(t, j)).floatValue();
    }

    /* renamed from: z */
    public static <T> int m79347z(T t, long j) {
        return ((Integer) Fs9.m106345k(t, j)).intValue();
    }

    /* renamed from: A */
    public final int m79377A(int i) {
        return this.f39822a[i + 2];
    }

    /* renamed from: C */
    public final int m79375C(int i) {
        return this.f39822a[i + 1];
    }

    /* renamed from: E */
    public final InterfaceC39356cn9 m79373E(int i) {
        int i2 = i / 3;
        return (InterfaceC39356cn9) this.f39823b[i2 + i2 + 1];
    }

    /* renamed from: F */
    public final InterfaceC38803br9 m79372F(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        InterfaceC38803br9 interfaceC38803br9 = (InterfaceC38803br9) this.f39823b[i3];
        if (interfaceC38803br9 != null) {
            return interfaceC38803br9;
        }
        InterfaceC38803br9<T> m22328b = C45926nq9.m22329a().m22328b((Class) this.f39823b[i3 + 1]);
        this.f39823b[i3] = m22328b;
        return m22328b;
    }

    /* renamed from: G */
    public final <UT, UB> UB m79371G(Object obj, int i, UB ub, Nr9<UT, UB> nr9) {
        int i2 = this.f39822a[i];
        Object m106345k = Fs9.m106345k(obj, m79375C(i) & 1048575);
        if (m106345k == null) {
            return ub;
        }
        InterfaceC39356cn9 m79373E = m79373E(i);
        if (m79373E == null) {
            return ub;
        }
        C49473tp9 m7953c = ((C50658vp9) m79370H(i)).m7953c();
        Iterator it = ((C52437yp9) m106345k).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!m79373E.zza(((Integer) entry.getValue()).intValue())) {
                if (ub == null) {
                    ub = nr9.mo86263f();
                }
                int m7954b = C50658vp9.m7954b(m7953c, entry.getKey(), entry.getValue());
                AbstractC45836nh9 abstractC45836nh9 = AbstractC45836nh9.f100361c;
                byte[] bArr = new byte[m7954b];
                AbstractC48228rj9 m15504n = AbstractC48228rj9.m15504n(bArr);
                try {
                    C50658vp9.m7951e(m15504n, m7953c, entry.getKey(), entry.getValue());
                    nr9.mo86258k(ub, i2, Hg9.m103533a(m15504n, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: H */
    public final Object m79370H(int i) {
        int i2 = i / 3;
        return this.f39823b[i2 + i2];
    }

    /* renamed from: J */
    public final void m79368J(T t, T t2, int i) {
        long m79375C = m79375C(i) & 1048575;
        if (!m79359n(t2, i)) {
            return;
        }
        Object m106345k = Fs9.m106345k(t, m79375C);
        Object m106345k2 = Fs9.m106345k(t2, m79375C);
        if (m106345k != null && m106345k2 != null) {
            Fs9.m106332x(t, m79375C, Fn9.m106448g(m106345k, m106345k2));
            m79365h(t, i);
        } else if (m106345k2 != null) {
            Fs9.m106332x(t, m79375C, m106345k2);
            m79365h(t, i);
        }
    }

    @Override // p000.InterfaceC38803br9
    /* renamed from: a */
    public final void mo62273a(T t) {
        int i;
        int i2 = this.f39831j;
        while (true) {
            i = this.f39832k;
            if (i2 >= i) {
                break;
            }
            long m79375C = m79375C(this.f39830i[i2]) & 1048575;
            Object m106345k = Fs9.m106345k(t, m79375C);
            if (m106345k != null) {
                ((C52437yp9) m106345k).m2508f();
                Fs9.m106332x(t, m79375C, m106345k);
            }
            i2++;
        }
        int length = this.f39830i.length;
        while (i < length) {
            this.f39833l.mo2557b(t, this.f39830i[i]);
            i++;
        }
        this.f39834m.mo86256m(t);
        if (this.f39827f) {
            this.f39835n.mo2665e(t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0045 A[SYNTHETIC] */
    @Override // p000.InterfaceC38803br9
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo62272b(T t, InterfaceC51261wq9 interfaceC51261wq9, C48830sk9 c48830sk9) throws IOException {
        int i;
        c48830sk9.getClass();
        Nr9 nr9 = this.f39834m;
        AbstractC52387yk9<?> abstractC52387yk9 = this.f39835n;
        Vk9<?> vk9 = null;
        Object obj = null;
        while (true) {
            try {
                int zzc = interfaceC51261wq9.zzc();
                if (zzc >= this.f39824c && zzc <= this.f39825d) {
                    int length = (this.f39822a.length / 3) - 1;
                    int i2 = 0;
                    while (i2 <= length) {
                        int i3 = (length + i2) >>> 1;
                        int i4 = i3 * 3;
                        int i5 = this.f39822a[i4];
                        if (zzc == i5) {
                            i = i4;
                            if (i < 0) {
                                int m79375C = m79375C(i);
                                try {
                                    switch (m79376B(m79375C)) {
                                        case 0:
                                            Fs9.m106336t(t, m79375C & 1048575, interfaceC51261wq9.zza());
                                            m79365h(t, i);
                                            break;
                                        case 1:
                                            Fs9.m106335u(t, m79375C & 1048575, interfaceC51261wq9.zzb());
                                            m79365h(t, i);
                                            break;
                                        case 2:
                                            Fs9.m106333w(t, m79375C & 1048575, interfaceC51261wq9.mo6254j());
                                            m79365h(t, i);
                                            break;
                                        case 3:
                                            Fs9.m106333w(t, m79375C & 1048575, interfaceC51261wq9.mo6258f());
                                            m79365h(t, i);
                                            break;
                                        case 4:
                                            Fs9.m106334v(t, m79375C & 1048575, interfaceC51261wq9.zzg());
                                            m79365h(t, i);
                                            break;
                                        case 5:
                                            Fs9.m106333w(t, m79375C & 1048575, interfaceC51261wq9.mo6263a());
                                            m79365h(t, i);
                                            break;
                                        case 6:
                                            Fs9.m106334v(t, m79375C & 1048575, interfaceC51261wq9.mo6240x());
                                            m79365h(t, i);
                                            break;
                                        case 7:
                                            Fs9.m106338r(t, m79375C & 1048575, interfaceC51261wq9.mo6256h());
                                            m79365h(t, i);
                                            break;
                                        case 8:
                                            m79366g(t, m79375C, interfaceC51261wq9);
                                            m79365h(t, i);
                                            break;
                                        case 9:
                                            if (m79359n(t, i)) {
                                                long j = m79375C & 1048575;
                                                Fs9.m106332x(t, j, Fn9.m106448g(Fs9.m106345k(t, j), interfaceC51261wq9.mo6266D(m79372F(i), c48830sk9)));
                                                break;
                                            } else {
                                                Fs9.m106332x(t, m79375C & 1048575, interfaceC51261wq9.mo6266D(m79372F(i), c48830sk9));
                                                m79365h(t, i);
                                                break;
                                            }
                                        case 10:
                                            Fs9.m106332x(t, m79375C & 1048575, interfaceC51261wq9.mo6260d());
                                            m79365h(t, i);
                                            break;
                                        case 11:
                                            Fs9.m106334v(t, m79375C & 1048575, interfaceC51261wq9.mo6261c());
                                            m79365h(t, i);
                                            break;
                                        case 12:
                                            int zze = interfaceC51261wq9.zze();
                                            InterfaceC39356cn9 m79373E = m79373E(i);
                                            if (m79373E != null && !m79373E.zza(zze)) {
                                                obj = C42378hr9.m35722d(zzc, zze, obj, nr9);
                                                break;
                                            }
                                            Fs9.m106334v(t, m79375C & 1048575, zze);
                                            m79365h(t, i);
                                            break;
                                        case 13:
                                            Fs9.m106334v(t, m79375C & 1048575, interfaceC51261wq9.zzh());
                                            m79365h(t, i);
                                            break;
                                        case 14:
                                            Fs9.m106333w(t, m79375C & 1048575, interfaceC51261wq9.mo6262b());
                                            m79365h(t, i);
                                            break;
                                        case 15:
                                            Fs9.m106334v(t, m79375C & 1048575, interfaceC51261wq9.zzi());
                                            m79365h(t, i);
                                            break;
                                        case 16:
                                            Fs9.m106333w(t, m79375C & 1048575, interfaceC51261wq9.mo6259e());
                                            m79365h(t, i);
                                            break;
                                        case 17:
                                            if (m79359n(t, i)) {
                                                long j2 = m79375C & 1048575;
                                                Fs9.m106332x(t, j2, Fn9.m106448g(Fs9.m106345k(t, j2), interfaceC51261wq9.mo6267C(m79372F(i), c48830sk9)));
                                                break;
                                            } else {
                                                Fs9.m106332x(t, m79375C & 1048575, interfaceC51261wq9.mo6267C(m79372F(i), c48830sk9));
                                                m79365h(t, i);
                                                break;
                                            }
                                        case 18:
                                            interfaceC51261wq9.mo6251m(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 19:
                                            interfaceC51261wq9.mo6269A(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 20:
                                            interfaceC51261wq9.mo6242v(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 21:
                                            interfaceC51261wq9.mo6247q(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 22:
                                            interfaceC51261wq9.mo6241w(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 23:
                                            interfaceC51261wq9.mo6238z(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 24:
                                            interfaceC51261wq9.mo6249o(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 25:
                                            interfaceC51261wq9.mo6248p(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 26:
                                            if (m79360m(m79375C)) {
                                                ((Ai9) interfaceC51261wq9).m115371G(this.f39833l.mo2558a(t, m79375C & 1048575), true);
                                                break;
                                            } else {
                                                ((Ai9) interfaceC51261wq9).m115371G(this.f39833l.mo2558a(t, m79375C & 1048575), false);
                                                break;
                                            }
                                        case 27:
                                            interfaceC51261wq9.mo6264F(this.f39833l.mo2558a(t, m79375C & 1048575), m79372F(i), c48830sk9);
                                            break;
                                        case 28:
                                            interfaceC51261wq9.mo6250n(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 29:
                                            interfaceC51261wq9.mo6246r(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 30:
                                            List<Integer> mo2558a = this.f39833l.mo2558a(t, m79375C & 1048575);
                                            interfaceC51261wq9.mo6252l(mo2558a);
                                            obj = C42378hr9.m35723c(zzc, mo2558a, m79373E(i), obj, nr9);
                                            break;
                                        case 31:
                                            interfaceC51261wq9.mo6239y(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 32:
                                            interfaceC51261wq9.mo6244t(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 33:
                                            interfaceC51261wq9.mo6245s(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 34:
                                            interfaceC51261wq9.mo6243u(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 35:
                                            interfaceC51261wq9.mo6251m(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 36:
                                            interfaceC51261wq9.mo6269A(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 37:
                                            interfaceC51261wq9.mo6242v(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 38:
                                            interfaceC51261wq9.mo6247q(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 39:
                                            interfaceC51261wq9.mo6241w(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 40:
                                            interfaceC51261wq9.mo6238z(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 41:
                                            interfaceC51261wq9.mo6249o(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 42:
                                            interfaceC51261wq9.mo6248p(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 43:
                                            interfaceC51261wq9.mo6246r(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 44:
                                            List<Integer> mo2558a2 = this.f39833l.mo2558a(t, m79375C & 1048575);
                                            interfaceC51261wq9.mo6252l(mo2558a2);
                                            obj = C42378hr9.m35723c(zzc, mo2558a2, m79373E(i), obj, nr9);
                                            break;
                                        case 45:
                                            interfaceC51261wq9.mo6239y(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 46:
                                            interfaceC51261wq9.mo6244t(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 47:
                                            interfaceC51261wq9.mo6245s(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 48:
                                            interfaceC51261wq9.mo6243u(this.f39833l.mo2558a(t, m79375C & 1048575));
                                            break;
                                        case 49:
                                            interfaceC51261wq9.mo6265E(this.f39833l.mo2558a(t, m79375C & 1048575), m79372F(i), c48830sk9);
                                            break;
                                        case 50:
                                            Object m79370H = m79370H(i);
                                            long m79375C2 = m79375C(i) & 1048575;
                                            Object m106345k = Fs9.m106345k(t, m79375C2);
                                            if (m106345k == null) {
                                                m106345k = C52437yp9.m2510d().m2509e();
                                                Fs9.m106332x(t, m79375C2, m106345k);
                                            } else if (!((C52437yp9) m106345k).m2506h()) {
                                                Object m2509e = C52437yp9.m2510d().m2509e();
                                                Ap9.m115127b(m2509e, m106345k);
                                                Fs9.m106332x(t, m79375C2, m2509e);
                                                m106345k = m2509e;
                                            }
                                            interfaceC51261wq9.mo6268B((C52437yp9) m106345k, ((C50658vp9) m79370H).m7953c(), c48830sk9);
                                            break;
                                        case 51:
                                            Fs9.m106332x(t, m79375C & 1048575, Double.valueOf(interfaceC51261wq9.zza()));
                                            m79364i(t, zzc, i);
                                            break;
                                        case 52:
                                            Fs9.m106332x(t, m79375C & 1048575, Float.valueOf(interfaceC51261wq9.zzb()));
                                            m79364i(t, zzc, i);
                                            break;
                                        case 53:
                                            Fs9.m106332x(t, m79375C & 1048575, Long.valueOf(interfaceC51261wq9.mo6254j()));
                                            m79364i(t, zzc, i);
                                            break;
                                        case 54:
                                            Fs9.m106332x(t, m79375C & 1048575, Long.valueOf(interfaceC51261wq9.mo6258f()));
                                            m79364i(t, zzc, i);
                                            break;
                                        case 55:
                                            Fs9.m106332x(t, m79375C & 1048575, Integer.valueOf(interfaceC51261wq9.zzg()));
                                            m79364i(t, zzc, i);
                                            break;
                                        case 56:
                                            Fs9.m106332x(t, m79375C & 1048575, Long.valueOf(interfaceC51261wq9.mo6263a()));
                                            m79364i(t, zzc, i);
                                            break;
                                        case 57:
                                            Fs9.m106332x(t, m79375C & 1048575, Integer.valueOf(interfaceC51261wq9.mo6240x()));
                                            m79364i(t, zzc, i);
                                            break;
                                        case 58:
                                            Fs9.m106332x(t, m79375C & 1048575, Boolean.valueOf(interfaceC51261wq9.mo6256h()));
                                            m79364i(t, zzc, i);
                                            break;
                                        case 59:
                                            m79366g(t, m79375C, interfaceC51261wq9);
                                            m79364i(t, zzc, i);
                                            break;
                                        case 60:
                                            if (m79356q(t, zzc, i)) {
                                                long j3 = m79375C & 1048575;
                                                Fs9.m106332x(t, j3, Fn9.m106448g(Fs9.m106345k(t, j3), interfaceC51261wq9.mo6266D(m79372F(i), c48830sk9)));
                                            } else {
                                                Fs9.m106332x(t, m79375C & 1048575, interfaceC51261wq9.mo6266D(m79372F(i), c48830sk9));
                                                m79365h(t, i);
                                            }
                                            m79364i(t, zzc, i);
                                            break;
                                        case 61:
                                            Fs9.m106332x(t, m79375C & 1048575, interfaceC51261wq9.mo6260d());
                                            m79364i(t, zzc, i);
                                            break;
                                        case 62:
                                            Fs9.m106332x(t, m79375C & 1048575, Integer.valueOf(interfaceC51261wq9.mo6261c()));
                                            m79364i(t, zzc, i);
                                            break;
                                        case 63:
                                            int zze2 = interfaceC51261wq9.zze();
                                            InterfaceC39356cn9 m79373E2 = m79373E(i);
                                            if (m79373E2 != null && !m79373E2.zza(zze2)) {
                                                obj = C42378hr9.m35722d(zzc, zze2, obj, nr9);
                                                break;
                                            }
                                            Fs9.m106332x(t, m79375C & 1048575, Integer.valueOf(zze2));
                                            m79364i(t, zzc, i);
                                            break;
                                        case 64:
                                            Fs9.m106332x(t, m79375C & 1048575, Integer.valueOf(interfaceC51261wq9.zzh()));
                                            m79364i(t, zzc, i);
                                            break;
                                        case 65:
                                            Fs9.m106332x(t, m79375C & 1048575, Long.valueOf(interfaceC51261wq9.mo6262b()));
                                            m79364i(t, zzc, i);
                                            break;
                                        case 66:
                                            Fs9.m106332x(t, m79375C & 1048575, Integer.valueOf(interfaceC51261wq9.zzi()));
                                            m79364i(t, zzc, i);
                                            break;
                                        case 67:
                                            Fs9.m106332x(t, m79375C & 1048575, Long.valueOf(interfaceC51261wq9.mo6259e()));
                                            m79364i(t, zzc, i);
                                            break;
                                        case 68:
                                            Fs9.m106332x(t, m79375C & 1048575, interfaceC51261wq9.mo6267C(m79372F(i), c48830sk9));
                                            m79364i(t, zzc, i);
                                            break;
                                        default:
                                            if (obj == null) {
                                                obj = nr9.mo86263f();
                                            }
                                            if (!nr9.m93274q(obj, interfaceC51261wq9)) {
                                                for (int i6 = this.f39831j; i6 < this.f39832k; i6++) {
                                                    obj = m79371G(t, this.f39830i[i6], obj, nr9);
                                                }
                                                if (obj != null) {
                                                    nr9.mo86255n(t, obj);
                                                    return;
                                                }
                                                return;
                                            }
                                            break;
                                    }
                                } catch (zzrq unused) {
                                    nr9.mo86252r(interfaceC51261wq9);
                                    if (obj == null) {
                                        obj = nr9.mo86266c(t);
                                    }
                                    if (!nr9.m93274q(obj, interfaceC51261wq9)) {
                                        for (int i7 = this.f39831j; i7 < this.f39832k; i7++) {
                                            obj = m79371G(t, this.f39830i[i7], obj, nr9);
                                        }
                                        if (obj != null) {
                                            nr9.mo86255n(t, obj);
                                            return;
                                        }
                                        return;
                                    }
                                }
                            } else if (zzc == Integer.MAX_VALUE) {
                                for (int i8 = this.f39831j; i8 < this.f39832k; i8++) {
                                    obj = m79371G(t, this.f39830i[i8], obj, nr9);
                                }
                                if (obj != null) {
                                    nr9.mo86255n(t, obj);
                                    return;
                                }
                                return;
                            } else {
                                Object mo2667c = !this.f39827f ? null : abstractC52387yk9.mo2667c(c48830sk9, this.f39826e, zzc);
                                if (mo2667c != null) {
                                    if (vk9 == null) {
                                        vk9 = abstractC52387yk9.mo2668b(t);
                                    }
                                    Vk9<?> vk92 = vk9;
                                    obj = abstractC52387yk9.mo2666d(interfaceC51261wq9, mo2667c, c48830sk9, vk92, obj, nr9);
                                    vk9 = vk92;
                                } else {
                                    nr9.mo86252r(interfaceC51261wq9);
                                    if (obj == null) {
                                        obj = nr9.mo86266c(t);
                                    }
                                    if (!nr9.m93274q(obj, interfaceC51261wq9)) {
                                        for (int i9 = this.f39831j; i9 < this.f39832k; i9++) {
                                            obj = m79371G(t, this.f39830i[i9], obj, nr9);
                                        }
                                        if (obj != null) {
                                            nr9.mo86255n(t, obj);
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                        } else if (zzc < i5) {
                            length = i3 - 1;
                        } else {
                            i2 = i3 + 1;
                        }
                    }
                }
                i = -1;
                if (i < 0) {
                }
            } catch (Throwable th) {
                for (int i10 = this.f39831j; i10 < this.f39832k; i10++) {
                    obj = m79371G(t, this.f39830i[i10], obj, nr9);
                }
                if (obj != null) {
                    nr9.mo86255n(t, obj);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v2, types: [br9] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r1v8, types: [br9] */
    @Override // p000.InterfaceC38803br9
    /* renamed from: c */
    public final boolean mo62271c(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            InterfaceC38803br9<T> interfaceC38803br9 = 0;
            if (i5 < this.f39831j) {
                int i6 = this.f39830i[i5];
                int i7 = this.f39822a[i6];
                int m79375C = m79375C(i6);
                int i8 = this.f39822a[i6 + 2];
                int i9 = i8 & 1048575;
                int i10 = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    if (i9 != 1048575) {
                        i4 = f39821r.getInt(t, i9);
                    }
                    i2 = i4;
                    i = i9;
                } else {
                    i = i3;
                    i2 = i4;
                }
                if ((268435456 & m79375C) != 0 && !m79358o(t, i6, i, i2, i10)) {
                    return false;
                }
                int m79376B = m79376B(m79375C);
                if (m79376B != 9 && m79376B != 17) {
                    if (m79376B != 27) {
                        if (m79376B != 60 && m79376B != 68) {
                            if (m79376B != 49) {
                                if (m79376B != 50) {
                                    continue;
                                } else {
                                    C52437yp9 c52437yp9 = (C52437yp9) Fs9.m106345k(t, m79375C & 1048575);
                                    if (!c52437yp9.isEmpty() && ((C50658vp9) m79370H(i6)).m7953c().f111092c.m86249a() == Ts9.MESSAGE) {
                                        for (Object obj : c52437yp9.values()) {
                                            if (interfaceC38803br9 == null) {
                                                interfaceC38803br9 = C45926nq9.m22329a().m22328b(obj.getClass());
                                            }
                                            boolean mo62271c = interfaceC38803br9.mo62271c(obj);
                                            interfaceC38803br9 = interfaceC38803br9;
                                            if (!mo62271c) {
                                                return false;
                                            }
                                        }
                                        continue;
                                    }
                                }
                            }
                        } else if (m79356q(t, i7, i6) && !m79357p(t, m79375C, m79372F(i6))) {
                            return false;
                        }
                    }
                    List list = (List) Fs9.m106345k(t, m79375C & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ?? m79372F = m79372F(i6);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (!m79372F.mo62271c(list.get(i11))) {
                                return false;
                            }
                        }
                        continue;
                    }
                } else if (m79358o(t, i6, i, i2, i10) && !m79357p(t, m79375C, m79372F(i6))) {
                    return false;
                }
                i5++;
                i3 = i;
                i4 = i2;
            } else if (!this.f39827f) {
                return true;
            } else {
                this.f39835n.mo2669a(t);
                throw null;
            }
        }
    }

    @Override // p000.InterfaceC38803br9
    /* renamed from: d */
    public final boolean mo62270d(T t, T t2) {
        boolean m35700z;
        int length = this.f39822a.length;
        for (int i = 0; i < length; i += 3) {
            int m79375C = m79375C(i);
            long j = m79375C & 1048575;
            switch (m79376B(m79375C)) {
                case 0:
                    if (m79361l(t, t2, i) && Double.doubleToLongBits(Fs9.m106350f(t, j)) == Double.doubleToLongBits(Fs9.m106350f(t2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m79361l(t, t2, i) && Float.floatToIntBits(Fs9.m106349g(t, j)) == Float.floatToIntBits(Fs9.m106349g(t2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m79361l(t, t2, i) && Fs9.m106347i(t, j) == Fs9.m106347i(t2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m79361l(t, t2, i) && Fs9.m106347i(t, j) == Fs9.m106347i(t2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m79361l(t, t2, i) && Fs9.m106348h(t, j) == Fs9.m106348h(t2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m79361l(t, t2, i) && Fs9.m106347i(t, j) == Fs9.m106347i(t2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m79361l(t, t2, i) && Fs9.m106348h(t, j) == Fs9.m106348h(t2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m79361l(t, t2, i) && Fs9.m106359B(t, j) == Fs9.m106359B(t2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m79361l(t, t2, i) && C42378hr9.m35700z(Fs9.m106345k(t, j), Fs9.m106345k(t2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m79361l(t, t2, i) && C42378hr9.m35700z(Fs9.m106345k(t, j), Fs9.m106345k(t2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m79361l(t, t2, i) && C42378hr9.m35700z(Fs9.m106345k(t, j), Fs9.m106345k(t2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m79361l(t, t2, i) && Fs9.m106348h(t, j) == Fs9.m106348h(t2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m79361l(t, t2, i) && Fs9.m106348h(t, j) == Fs9.m106348h(t2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m79361l(t, t2, i) && Fs9.m106348h(t, j) == Fs9.m106348h(t2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m79361l(t, t2, i) && Fs9.m106347i(t, j) == Fs9.m106347i(t2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m79361l(t, t2, i) && Fs9.m106348h(t, j) == Fs9.m106348h(t2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m79361l(t, t2, i) && Fs9.m106347i(t, j) == Fs9.m106347i(t2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m79361l(t, t2, i) && C42378hr9.m35700z(Fs9.m106345k(t, j), Fs9.m106345k(t2, j))) {
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
                    m35700z = C42378hr9.m35700z(Fs9.m106345k(t, j), Fs9.m106345k(t2, j));
                    break;
                case 50:
                    m35700z = C42378hr9.m35700z(Fs9.m106345k(t, j), Fs9.m106345k(t2, j));
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
                    long m79377A = m79377A(i) & 1048575;
                    if (Fs9.m106348h(t, m79377A) == Fs9.m106348h(t2, m79377A) && C42378hr9.m35700z(Fs9.m106345k(t, j), Fs9.m106345k(t2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!m35700z) {
                return false;
            }
        }
        if (!this.f39834m.mo86265d(t).equals(this.f39834m.mo86265d(t2))) {
            return false;
        }
        if (!this.f39827f) {
            return true;
        }
        this.f39835n.mo2669a(t);
        this.f39835n.mo2669a(t2);
        throw null;
    }

    @Override // p000.InterfaceC38803br9
    /* renamed from: e */
    public final void mo62269e(T t, Vs9 vs9) throws IOException {
        if (this.f39829h) {
            if (!this.f39827f) {
                int length = this.f39822a.length;
                for (int i = 0; i < length; i += 3) {
                    int m79375C = m79375C(i);
                    int i2 = this.f39822a[i];
                    switch (m79376B(m79375C)) {
                        case 0:
                            if (m79359n(t, i)) {
                                vs9.mo2735g(i2, Fs9.m106350f(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (m79359n(t, i)) {
                                vs9.mo2732j(i2, Fs9.m106349g(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (m79359n(t, i)) {
                                vs9.mo2729m(i2, Fs9.m106347i(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (m79359n(t, i)) {
                                vs9.mo2751B(i2, Fs9.m106347i(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (m79359n(t, i)) {
                                vs9.mo2727o(i2, Fs9.m106348h(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (m79359n(t, i)) {
                                vs9.mo2731k(i2, Fs9.m106347i(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (m79359n(t, i)) {
                                vs9.mo2734h(i2, Fs9.m106348h(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (m79359n(t, i)) {
                                vs9.mo2736f(i2, Fs9.m106359B(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (m79359n(t, i)) {
                                m79354s(i2, Fs9.m106345k(t, m79375C & 1048575), vs9);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (m79359n(t, i)) {
                                vs9.mo2746G(i2, Fs9.m106345k(t, m79375C & 1048575), m79372F(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (m79359n(t, i)) {
                                vs9.mo2743J(i2, (AbstractC45836nh9) Fs9.m106345k(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (m79359n(t, i)) {
                                vs9.mo2719w(i2, Fs9.m106348h(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (m79359n(t, i)) {
                                vs9.mo2733i(i2, Fs9.m106348h(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (m79359n(t, i)) {
                                vs9.mo2749D(i2, Fs9.m106348h(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (m79359n(t, i)) {
                                vs9.mo2747F(i2, Fs9.m106347i(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (m79359n(t, i)) {
                                vs9.mo2721u(i2, Fs9.m106348h(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (m79359n(t, i)) {
                                vs9.mo2722t(i2, Fs9.m106347i(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (m79359n(t, i)) {
                                vs9.mo2744I(i2, Fs9.m106345k(t, m79375C & 1048575), m79372F(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            C42378hr9.m35716j(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, false);
                            break;
                        case 19:
                            C42378hr9.m35712n(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, false);
                            break;
                        case 20:
                            C42378hr9.m35709q(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, false);
                            break;
                        case 21:
                            C42378hr9.m35701y(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, false);
                            break;
                        case 22:
                            C42378hr9.m35710p(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, false);
                            break;
                        case 23:
                            C42378hr9.m35713m(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, false);
                            break;
                        case 24:
                            C42378hr9.m35714l(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, false);
                            break;
                        case 25:
                            C42378hr9.m35718h(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, false);
                            break;
                        case 26:
                            C42378hr9.m35703w(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9);
                            break;
                        case 27:
                            C42378hr9.m35708r(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, m79372F(i));
                            break;
                        case 28:
                            C42378hr9.m35717i(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9);
                            break;
                        case 29:
                            C42378hr9.m35702x(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, false);
                            break;
                        case 30:
                            C42378hr9.m35715k(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, false);
                            break;
                        case 31:
                            C42378hr9.m35707s(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, false);
                            break;
                        case 32:
                            C42378hr9.m35706t(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, false);
                            break;
                        case 33:
                            C42378hr9.m35705u(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, false);
                            break;
                        case 34:
                            C42378hr9.m35704v(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, false);
                            break;
                        case 35:
                            C42378hr9.m35716j(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, true);
                            break;
                        case 36:
                            C42378hr9.m35712n(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, true);
                            break;
                        case 37:
                            C42378hr9.m35709q(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, true);
                            break;
                        case 38:
                            C42378hr9.m35701y(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, true);
                            break;
                        case 39:
                            C42378hr9.m35710p(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, true);
                            break;
                        case 40:
                            C42378hr9.m35713m(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, true);
                            break;
                        case 41:
                            C42378hr9.m35714l(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, true);
                            break;
                        case 42:
                            C42378hr9.m35718h(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, true);
                            break;
                        case 43:
                            C42378hr9.m35702x(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, true);
                            break;
                        case 44:
                            C42378hr9.m35715k(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, true);
                            break;
                        case 45:
                            C42378hr9.m35707s(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, true);
                            break;
                        case 46:
                            C42378hr9.m35706t(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, true);
                            break;
                        case 47:
                            C42378hr9.m35705u(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, true);
                            break;
                        case 48:
                            C42378hr9.m35704v(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, true);
                            break;
                        case 49:
                            C42378hr9.m35711o(this.f39822a[i], (List) Fs9.m106345k(t, m79375C & 1048575), vs9, m79372F(i));
                            break;
                        case 50:
                            m79362k(vs9, i2, Fs9.m106345k(t, m79375C & 1048575), i);
                            break;
                        case 51:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2735g(i2, m79351v(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2732j(i2, m79350w(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2729m(i2, m79374D(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2751B(i2, m79374D(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2727o(i2, m79347z(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2731k(i2, m79374D(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2734h(i2, m79347z(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2736f(i2, m79355r(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (m79356q(t, i2, i)) {
                                m79354s(i2, Fs9.m106345k(t, m79375C & 1048575), vs9);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2746G(i2, Fs9.m106345k(t, m79375C & 1048575), m79372F(i));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2743J(i2, (AbstractC45836nh9) Fs9.m106345k(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2719w(i2, m79347z(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2733i(i2, m79347z(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2749D(i2, m79347z(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2747F(i2, m79374D(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2721u(i2, m79347z(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2722t(i2, m79374D(t, m79375C & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (m79356q(t, i2, i)) {
                                vs9.mo2744I(i2, Fs9.m106345k(t, m79375C & 1048575), m79372F(i));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                Nr9<?, ?> nr9 = this.f39834m;
                nr9.mo86253p(nr9.mo86265d(t), vs9);
                return;
            }
            this.f39835n.mo2669a(t);
            throw null;
        }
        m79363j(t, vs9);
    }

    /* renamed from: f */
    public final void m79367f(T t, T t2, int i) {
        Object obj;
        int m79375C = m79375C(i);
        int i2 = this.f39822a[i];
        long j = m79375C & 1048575;
        if (!m79356q(t2, i2, i)) {
            return;
        }
        if (m79356q(t, i2, i)) {
            obj = Fs9.m106345k(t, j);
        } else {
            obj = null;
        }
        Object m106345k = Fs9.m106345k(t2, j);
        if (obj != null && m106345k != null) {
            Fs9.m106332x(t, j, Fn9.m106448g(obj, m106345k));
            m79364i(t, i2, i);
        } else if (m106345k != null) {
            Fs9.m106332x(t, j, m106345k);
            m79364i(t, i2, i);
        }
    }

    /* renamed from: g */
    public final void m79366g(Object obj, int i, InterfaceC51261wq9 interfaceC51261wq9) throws IOException {
        if (m79360m(i)) {
            Fs9.m106332x(obj, i & 1048575, interfaceC51261wq9.mo6255i());
        } else if (this.f39828g) {
            Fs9.m106332x(obj, i & 1048575, interfaceC51261wq9.mo6257g());
        } else {
            Fs9.m106332x(obj, i & 1048575, interfaceC51261wq9.mo6260d());
        }
    }

    /* renamed from: h */
    public final void m79365h(T t, int i) {
        int m79377A = m79377A(i);
        long j = 1048575 & m79377A;
        if (j == 1048575) {
            return;
        }
        Fs9.m106334v(t, j, (1 << (m79377A >>> 20)) | Fs9.m106348h(t, j));
    }

    /* renamed from: i */
    public final void m79364i(T t, int i, int i2) {
        Fs9.m106334v(t, m79377A(i2) & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: j */
    public final void m79363j(T t, Vs9 vs9) throws IOException {
        int i;
        boolean z;
        if (!this.f39827f) {
            int length = this.f39822a.length;
            Unsafe unsafe = f39821r;
            int i2 = 1048575;
            int i3 = 1048575;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int m79375C = m79375C(i4);
                int i6 = this.f39822a[i4];
                int m79376B = m79376B(m79375C);
                if (m79376B <= 17) {
                    int i7 = this.f39822a[i4 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i3) {
                        i5 = unsafe.getInt(t, i8);
                        i3 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = m79375C & i2;
                switch (m79376B) {
                    case 0:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2735g(i6, Fs9.m106350f(t, j));
                            break;
                        }
                    case 1:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2732j(i6, Fs9.m106349g(t, j));
                            break;
                        }
                    case 2:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2729m(i6, unsafe.getLong(t, j));
                            break;
                        }
                    case 3:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2751B(i6, unsafe.getLong(t, j));
                            break;
                        }
                    case 4:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2727o(i6, unsafe.getInt(t, j));
                            break;
                        }
                    case 5:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2731k(i6, unsafe.getLong(t, j));
                            break;
                        }
                    case 6:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2734h(i6, unsafe.getInt(t, j));
                            break;
                        }
                    case 7:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2736f(i6, Fs9.m106359B(t, j));
                            break;
                        }
                    case 8:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            m79354s(i6, unsafe.getObject(t, j), vs9);
                            break;
                        }
                    case 9:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2746G(i6, unsafe.getObject(t, j), m79372F(i4));
                            break;
                        }
                    case 10:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2743J(i6, (AbstractC45836nh9) unsafe.getObject(t, j));
                            break;
                        }
                    case 11:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2719w(i6, unsafe.getInt(t, j));
                            break;
                        }
                    case 12:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2733i(i6, unsafe.getInt(t, j));
                            break;
                        }
                    case 13:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2749D(i6, unsafe.getInt(t, j));
                            break;
                        }
                    case 14:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2747F(i6, unsafe.getLong(t, j));
                            break;
                        }
                    case 15:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2721u(i6, unsafe.getInt(t, j));
                            break;
                        }
                    case 16:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2722t(i6, unsafe.getLong(t, j));
                            break;
                        }
                    case 17:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            vs9.mo2744I(i6, unsafe.getObject(t, j), m79372F(i4));
                            break;
                        }
                    case 18:
                        C42378hr9.m35716j(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, false);
                        break;
                    case 19:
                        C42378hr9.m35712n(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, false);
                        break;
                    case 20:
                        C42378hr9.m35709q(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, false);
                        break;
                    case 21:
                        C42378hr9.m35701y(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, false);
                        break;
                    case 22:
                        C42378hr9.m35710p(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, false);
                        break;
                    case 23:
                        C42378hr9.m35713m(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, false);
                        break;
                    case 24:
                        C42378hr9.m35714l(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, false);
                        break;
                    case 25:
                        C42378hr9.m35718h(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, false);
                        break;
                    case 26:
                        C42378hr9.m35703w(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9);
                        break;
                    case 27:
                        C42378hr9.m35708r(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, m79372F(i4));
                        break;
                    case 28:
                        C42378hr9.m35717i(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9);
                        break;
                    case 29:
                        z = false;
                        C42378hr9.m35702x(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, false);
                        break;
                    case 30:
                        z = false;
                        C42378hr9.m35715k(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, false);
                        break;
                    case 31:
                        z = false;
                        C42378hr9.m35707s(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, false);
                        break;
                    case 32:
                        z = false;
                        C42378hr9.m35706t(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, false);
                        break;
                    case 33:
                        z = false;
                        C42378hr9.m35705u(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, false);
                        break;
                    case 34:
                        z = false;
                        C42378hr9.m35704v(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, false);
                        break;
                    case 35:
                        C42378hr9.m35716j(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, true);
                        break;
                    case 36:
                        C42378hr9.m35712n(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, true);
                        break;
                    case 37:
                        C42378hr9.m35709q(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, true);
                        break;
                    case 38:
                        C42378hr9.m35701y(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, true);
                        break;
                    case 39:
                        C42378hr9.m35710p(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, true);
                        break;
                    case 40:
                        C42378hr9.m35713m(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, true);
                        break;
                    case 41:
                        C42378hr9.m35714l(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, true);
                        break;
                    case 42:
                        C42378hr9.m35718h(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, true);
                        break;
                    case 43:
                        C42378hr9.m35702x(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, true);
                        break;
                    case 44:
                        C42378hr9.m35715k(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, true);
                        break;
                    case 45:
                        C42378hr9.m35707s(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, true);
                        break;
                    case 46:
                        C42378hr9.m35706t(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, true);
                        break;
                    case 47:
                        C42378hr9.m35705u(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, true);
                        break;
                    case 48:
                        C42378hr9.m35704v(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, true);
                        break;
                    case 49:
                        C42378hr9.m35711o(this.f39822a[i4], (List) unsafe.getObject(t, j), vs9, m79372F(i4));
                        break;
                    case 50:
                        m79362k(vs9, i6, unsafe.getObject(t, j), i4);
                        break;
                    case 51:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2735g(i6, m79351v(t, j));
                        }
                        break;
                    case 52:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2732j(i6, m79350w(t, j));
                        }
                        break;
                    case 53:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2729m(i6, m79374D(t, j));
                        }
                        break;
                    case 54:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2751B(i6, m79374D(t, j));
                        }
                        break;
                    case 55:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2727o(i6, m79347z(t, j));
                        }
                        break;
                    case 56:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2731k(i6, m79374D(t, j));
                        }
                        break;
                    case 57:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2734h(i6, m79347z(t, j));
                        }
                        break;
                    case 58:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2736f(i6, m79355r(t, j));
                        }
                        break;
                    case 59:
                        if (m79356q(t, i6, i4)) {
                            m79354s(i6, unsafe.getObject(t, j), vs9);
                        }
                        break;
                    case 60:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2746G(i6, unsafe.getObject(t, j), m79372F(i4));
                        }
                        break;
                    case 61:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2743J(i6, (AbstractC45836nh9) unsafe.getObject(t, j));
                        }
                        break;
                    case 62:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2719w(i6, m79347z(t, j));
                        }
                        break;
                    case 63:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2733i(i6, m79347z(t, j));
                        }
                        break;
                    case 64:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2749D(i6, m79347z(t, j));
                        }
                        break;
                    case 65:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2747F(i6, m79374D(t, j));
                        }
                        break;
                    case 66:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2721u(i6, m79347z(t, j));
                        }
                        break;
                    case 67:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2722t(i6, m79374D(t, j));
                        }
                        break;
                    case 68:
                        if (m79356q(t, i6, i4)) {
                            vs9.mo2744I(i6, unsafe.getObject(t, j), m79372F(i4));
                        }
                        break;
                }
                i4 += 3;
                i2 = 1048575;
            }
            Nr9<?, ?> nr9 = this.f39834m;
            nr9.mo86253p(nr9.mo86265d(t), vs9);
            return;
        }
        this.f39835n.mo2669a(t);
        throw null;
    }

    /* renamed from: k */
    public final <K, V> void m79362k(Vs9 vs9, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            vs9.mo2745H(i, ((C50658vp9) m79370H(i2)).m7953c(), (C52437yp9) obj);
        }
    }

    /* renamed from: l */
    public final boolean m79361l(T t, T t2, int i) {
        return m79359n(t, i) == m79359n(t2, i);
    }

    /* renamed from: n */
    public final boolean m79359n(T t, int i) {
        int m79377A = m79377A(i);
        long j = m79377A & 1048575;
        if (j == 1048575) {
            int m79375C = m79375C(i);
            long j2 = m79375C & 1048575;
            switch (m79376B(m79375C)) {
                case 0:
                    if (Fs9.m106350f(t, j2) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Fs9.m106349g(t, j2) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (Fs9.m106347i(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (Fs9.m106347i(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (Fs9.m106348h(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (Fs9.m106347i(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (Fs9.m106348h(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return Fs9.m106359B(t, j2);
                case 8:
                    Object m106345k = Fs9.m106345k(t, j2);
                    if (m106345k instanceof String) {
                        if (((String) m106345k).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m106345k instanceof AbstractC45836nh9) {
                        if (AbstractC45836nh9.f100361c.equals(m106345k)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (Fs9.m106345k(t, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC45836nh9.f100361c.equals(Fs9.m106345k(t, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (Fs9.m106348h(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (Fs9.m106348h(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (Fs9.m106348h(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (Fs9.m106347i(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (Fs9.m106348h(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (Fs9.m106347i(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (Fs9.m106345k(t, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((Fs9.m106348h(t, j) & (1 << (m79377A >>> 20))) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: o */
    public final boolean m79358o(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m79359n(t, i) : (i3 & i4) != 0;
    }

    /* renamed from: q */
    public final boolean m79356q(T t, int i, int i2) {
        if (Fs9.m106348h(t, m79377A(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final int m79349x(T t) {
        int i;
        int m15506l;
        int m15506l2;
        int m15506l3;
        int m15505m;
        int m15506l4;
        int m15513e;
        int m15506l5;
        int m15506l6;
        int mo11924c;
        int m15506l7;
        int m35737Q;
        int m15507k;
        int m15506l8;
        int i2;
        Unsafe unsafe = f39821r;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        for (int i6 = 0; i6 < this.f39822a.length; i6 += 3) {
            int m79375C = m79375C(i6);
            int i7 = this.f39822a[i6];
            int m79376B = m79376B(m79375C);
            if (m79376B <= 17) {
                int i8 = this.f39822a[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i5) {
                    i4 = unsafe.getInt(t, i9);
                    i5 = i9;
                }
            } else {
                i = 0;
            }
            long j = m79375C & 1048575;
            switch (m79376B) {
                case 0:
                    if ((i4 & i) != 0) {
                        m15506l = AbstractC48228rj9.m15506l(i7 << 3);
                        m35737Q = m15506l + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if ((i4 & i) != 0) {
                        m15506l2 = AbstractC48228rj9.m15506l(i7 << 3);
                        m35737Q = m15506l2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i4 & i) != 0) {
                        long j2 = unsafe.getLong(t, j);
                        m15506l3 = AbstractC48228rj9.m15506l(i7 << 3);
                        m15505m = AbstractC48228rj9.m15505m(j2);
                        m35737Q = m15506l3 + m15505m;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i4 & i) != 0) {
                        long j3 = unsafe.getLong(t, j);
                        m15506l3 = AbstractC48228rj9.m15506l(i7 << 3);
                        m15505m = AbstractC48228rj9.m15505m(j3);
                        m35737Q = m15506l3 + m15505m;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i4 & i) != 0) {
                        int i10 = unsafe.getInt(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i7 << 3);
                        m15513e = AbstractC48228rj9.m15513e(i10);
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i4 & i) != 0) {
                        m15506l = AbstractC48228rj9.m15506l(i7 << 3);
                        m35737Q = m15506l + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i4 & i) != 0) {
                        m15506l2 = AbstractC48228rj9.m15506l(i7 << 3);
                        m35737Q = m15506l2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i4 & i) != 0) {
                        m15506l5 = AbstractC48228rj9.m15506l(i7 << 3);
                        m35737Q = m15506l5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i4 & i) != 0) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof AbstractC45836nh9) {
                            m15506l6 = AbstractC48228rj9.m15506l(i7 << 3);
                            mo11924c = ((AbstractC45836nh9) object).mo11924c();
                            m15506l7 = AbstractC48228rj9.m15506l(mo11924c);
                            i2 = m15506l6 + m15506l7 + mo11924c;
                            i3 += i2;
                        } else {
                            m15506l4 = AbstractC48228rj9.m15506l(i7 << 3);
                            m15513e = AbstractC48228rj9.m15508j((String) object);
                            i2 = m15506l4 + m15513e;
                            i3 += i2;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if ((i4 & i) != 0) {
                        m35737Q = C42378hr9.m35737Q(i7, unsafe.getObject(t, j), m79372F(i6));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i4 & i) != 0) {
                        m15506l6 = AbstractC48228rj9.m15506l(i7 << 3);
                        mo11924c = ((AbstractC45836nh9) unsafe.getObject(t, j)).mo11924c();
                        m15506l7 = AbstractC48228rj9.m15506l(mo11924c);
                        i2 = m15506l6 + m15506l7 + mo11924c;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i4 & i) != 0) {
                        int i11 = unsafe.getInt(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i7 << 3);
                        m15513e = AbstractC48228rj9.m15506l(i11);
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i4 & i) != 0) {
                        int i12 = unsafe.getInt(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i7 << 3);
                        m15513e = AbstractC48228rj9.m15513e(i12);
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i4 & i) != 0) {
                        m15506l2 = AbstractC48228rj9.m15506l(i7 << 3);
                        m35737Q = m15506l2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i4 & i) != 0) {
                        m15506l = AbstractC48228rj9.m15506l(i7 << 3);
                        m35737Q = m15506l + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i4 & i) != 0) {
                        int i13 = unsafe.getInt(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i7 << 3);
                        m15513e = AbstractC48228rj9.m15506l((i13 >> 31) ^ (i13 + i13));
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i4 & i) != 0) {
                        long j4 = unsafe.getLong(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i7 << 3);
                        m15513e = AbstractC48228rj9.m15505m((j4 >> 63) ^ (j4 + j4));
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i4 & i) != 0) {
                        m35737Q = AbstractC48228rj9.m15515c(i7, (Np9) unsafe.getObject(t, j), m79372F(i6));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    m35737Q = C42378hr9.m35744J(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 19:
                    m35737Q = C42378hr9.m35746H(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 20:
                    m35737Q = C42378hr9.m35739O(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 21:
                    m35737Q = C42378hr9.m35728Z(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 22:
                    m35737Q = C42378hr9.m35741M(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 23:
                    m35737Q = C42378hr9.m35744J(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 24:
                    m35737Q = C42378hr9.m35746H(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 25:
                    m35737Q = C42378hr9.m35753A(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 26:
                    m35737Q = C42378hr9.m35731W(i7, (List) unsafe.getObject(t, j));
                    break;
                case 27:
                    m35737Q = C42378hr9.m35736R(i7, (List) unsafe.getObject(t, j), m79372F(i6));
                    break;
                case 28:
                    m35737Q = C42378hr9.m35749E(i7, (List) unsafe.getObject(t, j));
                    break;
                case 29:
                    m35737Q = C42378hr9.m35730X(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 30:
                    m35737Q = C42378hr9.m35748F(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 31:
                    m35737Q = C42378hr9.m35746H(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 32:
                    m35737Q = C42378hr9.m35744J(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 33:
                    m35737Q = C42378hr9.m35735S(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 34:
                    m35737Q = C42378hr9.m35733U(i7, (List) unsafe.getObject(t, j), false);
                    break;
                case 35:
                    m15513e = C42378hr9.m35743K((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i7);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 36:
                    m15513e = C42378hr9.m35745I((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i7);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 37:
                    m15513e = C42378hr9.m35738P((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i7);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 38:
                    m15513e = C42378hr9.m35726a0((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i7);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 39:
                    m15513e = C42378hr9.m35740N((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i7);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 40:
                    m15513e = C42378hr9.m35743K((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i7);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 41:
                    m15513e = C42378hr9.m35745I((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i7);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 42:
                    m15513e = C42378hr9.m35750D((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i7);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 43:
                    m15513e = C42378hr9.m35729Y((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i7);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 44:
                    m15513e = C42378hr9.m35747G((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i7);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 45:
                    m15513e = C42378hr9.m35745I((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i7);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 46:
                    m15513e = C42378hr9.m35743K((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i7);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 47:
                    m15513e = C42378hr9.m35734T((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i7);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 48:
                    m15513e = C42378hr9.m35732V((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i7);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 49:
                    m35737Q = C42378hr9.m35742L(i7, (List) unsafe.getObject(t, j), m79372F(i6));
                    break;
                case 50:
                    m35737Q = Ap9.m115128a(i7, unsafe.getObject(t, j), m79370H(i6));
                    break;
                case 51:
                    if (m79356q(t, i7, i6)) {
                        m15506l = AbstractC48228rj9.m15506l(i7 << 3);
                        m35737Q = m15506l + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (m79356q(t, i7, i6)) {
                        m15506l2 = AbstractC48228rj9.m15506l(i7 << 3);
                        m35737Q = m15506l2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (m79356q(t, i7, i6)) {
                        long m79374D = m79374D(t, j);
                        m15506l3 = AbstractC48228rj9.m15506l(i7 << 3);
                        m15505m = AbstractC48228rj9.m15505m(m79374D);
                        m35737Q = m15506l3 + m15505m;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (m79356q(t, i7, i6)) {
                        long m79374D2 = m79374D(t, j);
                        m15506l3 = AbstractC48228rj9.m15506l(i7 << 3);
                        m15505m = AbstractC48228rj9.m15505m(m79374D2);
                        m35737Q = m15506l3 + m15505m;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (m79356q(t, i7, i6)) {
                        int m79347z = m79347z(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i7 << 3);
                        m15513e = AbstractC48228rj9.m15513e(m79347z);
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 56:
                    if (m79356q(t, i7, i6)) {
                        m15506l = AbstractC48228rj9.m15506l(i7 << 3);
                        m35737Q = m15506l + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (m79356q(t, i7, i6)) {
                        m15506l2 = AbstractC48228rj9.m15506l(i7 << 3);
                        m35737Q = m15506l2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (m79356q(t, i7, i6)) {
                        m15506l5 = AbstractC48228rj9.m15506l(i7 << 3);
                        m35737Q = m15506l5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (m79356q(t, i7, i6)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof AbstractC45836nh9) {
                            m15506l6 = AbstractC48228rj9.m15506l(i7 << 3);
                            mo11924c = ((AbstractC45836nh9) object2).mo11924c();
                            m15506l7 = AbstractC48228rj9.m15506l(mo11924c);
                            i2 = m15506l6 + m15506l7 + mo11924c;
                            i3 += i2;
                        } else {
                            m15506l4 = AbstractC48228rj9.m15506l(i7 << 3);
                            m15513e = AbstractC48228rj9.m15508j((String) object2);
                            i2 = m15506l4 + m15513e;
                            i3 += i2;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (m79356q(t, i7, i6)) {
                        m35737Q = C42378hr9.m35737Q(i7, unsafe.getObject(t, j), m79372F(i6));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (m79356q(t, i7, i6)) {
                        m15506l6 = AbstractC48228rj9.m15506l(i7 << 3);
                        mo11924c = ((AbstractC45836nh9) unsafe.getObject(t, j)).mo11924c();
                        m15506l7 = AbstractC48228rj9.m15506l(mo11924c);
                        i2 = m15506l6 + m15506l7 + mo11924c;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 62:
                    if (m79356q(t, i7, i6)) {
                        int m79347z2 = m79347z(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i7 << 3);
                        m15513e = AbstractC48228rj9.m15506l(m79347z2);
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 63:
                    if (m79356q(t, i7, i6)) {
                        int m79347z3 = m79347z(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i7 << 3);
                        m15513e = AbstractC48228rj9.m15513e(m79347z3);
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 64:
                    if (m79356q(t, i7, i6)) {
                        m15506l2 = AbstractC48228rj9.m15506l(i7 << 3);
                        m35737Q = m15506l2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (m79356q(t, i7, i6)) {
                        m15506l = AbstractC48228rj9.m15506l(i7 << 3);
                        m35737Q = m15506l + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (m79356q(t, i7, i6)) {
                        int m79347z4 = m79347z(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i7 << 3);
                        m15513e = AbstractC48228rj9.m15506l((m79347z4 >> 31) ^ (m79347z4 + m79347z4));
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 67:
                    if (m79356q(t, i7, i6)) {
                        long m79374D3 = m79374D(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i7 << 3);
                        m15513e = AbstractC48228rj9.m15505m((m79374D3 >> 63) ^ (m79374D3 + m79374D3));
                        i2 = m15506l4 + m15513e;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 68:
                    if (m79356q(t, i7, i6)) {
                        m35737Q = AbstractC48228rj9.m15515c(i7, (Np9) unsafe.getObject(t, j), m79372F(i6));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i3 += m35737Q;
        }
        Nr9<?, ?> nr9 = this.f39834m;
        int mo86268a = i3 + nr9.mo86268a(nr9.mo86265d(t));
        if (!this.f39827f) {
            return mo86268a;
        }
        this.f39835n.mo2669a(t);
        throw null;
    }

    /* renamed from: y */
    public final int m79348y(T t) {
        int m15506l;
        int m15506l2;
        int m15506l3;
        int m15505m;
        int m15506l4;
        int m15513e;
        int m15506l5;
        int m15506l6;
        int mo11924c;
        int m15506l7;
        int m35737Q;
        int m15507k;
        int m15506l8;
        int i;
        Unsafe unsafe = f39821r;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f39822a.length; i3 += 3) {
            int m79375C = m79375C(i3);
            int m79376B = m79376B(m79375C);
            int i4 = this.f39822a[i3];
            long j = m79375C & 1048575;
            if (m79376B >= EnumC38743bl9.f58060R.zza() && m79376B <= EnumC38743bl9.f58090u0.zza()) {
                int i5 = this.f39822a[i3 + 2];
            }
            switch (m79376B) {
                case 0:
                    if (m79359n(t, i3)) {
                        m15506l = AbstractC48228rj9.m15506l(i4 << 3);
                        m35737Q = m15506l + 8;
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m79359n(t, i3)) {
                        m15506l2 = AbstractC48228rj9.m15506l(i4 << 3);
                        m35737Q = m15506l2 + 4;
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m79359n(t, i3)) {
                        long m106347i = Fs9.m106347i(t, j);
                        m15506l3 = AbstractC48228rj9.m15506l(i4 << 3);
                        m15505m = AbstractC48228rj9.m15505m(m106347i);
                        i2 += m15506l3 + m15505m;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m79359n(t, i3)) {
                        long m106347i2 = Fs9.m106347i(t, j);
                        m15506l3 = AbstractC48228rj9.m15506l(i4 << 3);
                        m15505m = AbstractC48228rj9.m15505m(m106347i2);
                        i2 += m15506l3 + m15505m;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m79359n(t, i3)) {
                        int m106348h = Fs9.m106348h(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i4 << 3);
                        m15513e = AbstractC48228rj9.m15513e(m106348h);
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m79359n(t, i3)) {
                        m15506l = AbstractC48228rj9.m15506l(i4 << 3);
                        m35737Q = m15506l + 8;
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m79359n(t, i3)) {
                        m15506l2 = AbstractC48228rj9.m15506l(i4 << 3);
                        m35737Q = m15506l2 + 4;
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m79359n(t, i3)) {
                        m15506l5 = AbstractC48228rj9.m15506l(i4 << 3);
                        m35737Q = m15506l5 + 1;
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m79359n(t, i3)) {
                        break;
                    } else {
                        Object m106345k = Fs9.m106345k(t, j);
                        if (m106345k instanceof AbstractC45836nh9) {
                            m15506l6 = AbstractC48228rj9.m15506l(i4 << 3);
                            mo11924c = ((AbstractC45836nh9) m106345k).mo11924c();
                            m15506l7 = AbstractC48228rj9.m15506l(mo11924c);
                            i = m15506l6 + m15506l7 + mo11924c;
                            i2 += i;
                            break;
                        } else {
                            m15506l4 = AbstractC48228rj9.m15506l(i4 << 3);
                            m15513e = AbstractC48228rj9.m15508j((String) m106345k);
                            i = m15506l4 + m15513e;
                            i2 += i;
                        }
                    }
                case 9:
                    if (m79359n(t, i3)) {
                        m35737Q = C42378hr9.m35737Q(i4, Fs9.m106345k(t, j), m79372F(i3));
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m79359n(t, i3)) {
                        m15506l6 = AbstractC48228rj9.m15506l(i4 << 3);
                        mo11924c = ((AbstractC45836nh9) Fs9.m106345k(t, j)).mo11924c();
                        m15506l7 = AbstractC48228rj9.m15506l(mo11924c);
                        i = m15506l6 + m15506l7 + mo11924c;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m79359n(t, i3)) {
                        int m106348h2 = Fs9.m106348h(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i4 << 3);
                        m15513e = AbstractC48228rj9.m15506l(m106348h2);
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m79359n(t, i3)) {
                        int m106348h3 = Fs9.m106348h(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i4 << 3);
                        m15513e = AbstractC48228rj9.m15513e(m106348h3);
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m79359n(t, i3)) {
                        m15506l2 = AbstractC48228rj9.m15506l(i4 << 3);
                        m35737Q = m15506l2 + 4;
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m79359n(t, i3)) {
                        m15506l = AbstractC48228rj9.m15506l(i4 << 3);
                        m35737Q = m15506l + 8;
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m79359n(t, i3)) {
                        int m106348h4 = Fs9.m106348h(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i4 << 3);
                        m15513e = AbstractC48228rj9.m15506l((m106348h4 >> 31) ^ (m106348h4 + m106348h4));
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m79359n(t, i3)) {
                        long m106347i3 = Fs9.m106347i(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i4 << 3);
                        m15513e = AbstractC48228rj9.m15505m((m106347i3 >> 63) ^ (m106347i3 + m106347i3));
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m79359n(t, i3)) {
                        m35737Q = AbstractC48228rj9.m15515c(i4, (Np9) Fs9.m106345k(t, j), m79372F(i3));
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m35737Q = C42378hr9.m35744J(i4, (List) Fs9.m106345k(t, j), false);
                    i2 += m35737Q;
                    break;
                case 19:
                    m35737Q = C42378hr9.m35746H(i4, (List) Fs9.m106345k(t, j), false);
                    i2 += m35737Q;
                    break;
                case 20:
                    m35737Q = C42378hr9.m35739O(i4, (List) Fs9.m106345k(t, j), false);
                    i2 += m35737Q;
                    break;
                case 21:
                    m35737Q = C42378hr9.m35728Z(i4, (List) Fs9.m106345k(t, j), false);
                    i2 += m35737Q;
                    break;
                case 22:
                    m35737Q = C42378hr9.m35741M(i4, (List) Fs9.m106345k(t, j), false);
                    i2 += m35737Q;
                    break;
                case 23:
                    m35737Q = C42378hr9.m35744J(i4, (List) Fs9.m106345k(t, j), false);
                    i2 += m35737Q;
                    break;
                case 24:
                    m35737Q = C42378hr9.m35746H(i4, (List) Fs9.m106345k(t, j), false);
                    i2 += m35737Q;
                    break;
                case 25:
                    m35737Q = C42378hr9.m35753A(i4, (List) Fs9.m106345k(t, j), false);
                    i2 += m35737Q;
                    break;
                case 26:
                    m35737Q = C42378hr9.m35731W(i4, (List) Fs9.m106345k(t, j));
                    i2 += m35737Q;
                    break;
                case 27:
                    m35737Q = C42378hr9.m35736R(i4, (List) Fs9.m106345k(t, j), m79372F(i3));
                    i2 += m35737Q;
                    break;
                case 28:
                    m35737Q = C42378hr9.m35749E(i4, (List) Fs9.m106345k(t, j));
                    i2 += m35737Q;
                    break;
                case 29:
                    m35737Q = C42378hr9.m35730X(i4, (List) Fs9.m106345k(t, j), false);
                    i2 += m35737Q;
                    break;
                case 30:
                    m35737Q = C42378hr9.m35748F(i4, (List) Fs9.m106345k(t, j), false);
                    i2 += m35737Q;
                    break;
                case 31:
                    m35737Q = C42378hr9.m35746H(i4, (List) Fs9.m106345k(t, j), false);
                    i2 += m35737Q;
                    break;
                case 32:
                    m35737Q = C42378hr9.m35744J(i4, (List) Fs9.m106345k(t, j), false);
                    i2 += m35737Q;
                    break;
                case 33:
                    m35737Q = C42378hr9.m35735S(i4, (List) Fs9.m106345k(t, j), false);
                    i2 += m35737Q;
                    break;
                case 34:
                    m35737Q = C42378hr9.m35733U(i4, (List) Fs9.m106345k(t, j), false);
                    i2 += m35737Q;
                    break;
                case 35:
                    m15513e = C42378hr9.m35743K((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i4);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    m15513e = C42378hr9.m35745I((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i4);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    m15513e = C42378hr9.m35738P((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i4);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    m15513e = C42378hr9.m35726a0((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i4);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    m15513e = C42378hr9.m35740N((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i4);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    m15513e = C42378hr9.m35743K((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i4);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    m15513e = C42378hr9.m35745I((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i4);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    m15513e = C42378hr9.m35750D((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i4);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    m15513e = C42378hr9.m35729Y((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i4);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    m15513e = C42378hr9.m35747G((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i4);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    m15513e = C42378hr9.m35745I((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i4);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    m15513e = C42378hr9.m35743K((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i4);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    m15513e = C42378hr9.m35734T((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i4);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    m15513e = C42378hr9.m35732V((List) unsafe.getObject(t, j));
                    if (m15513e > 0) {
                        m15507k = AbstractC48228rj9.m15507k(i4);
                        m15506l8 = AbstractC48228rj9.m15506l(m15513e);
                        m15506l4 = m15507k + m15506l8;
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    m35737Q = C42378hr9.m35742L(i4, (List) Fs9.m106345k(t, j), m79372F(i3));
                    i2 += m35737Q;
                    break;
                case 50:
                    m35737Q = Ap9.m115128a(i4, Fs9.m106345k(t, j), m79370H(i3));
                    i2 += m35737Q;
                    break;
                case 51:
                    if (m79356q(t, i4, i3)) {
                        m15506l = AbstractC48228rj9.m15506l(i4 << 3);
                        m35737Q = m15506l + 8;
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m79356q(t, i4, i3)) {
                        m15506l2 = AbstractC48228rj9.m15506l(i4 << 3);
                        m35737Q = m15506l2 + 4;
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m79356q(t, i4, i3)) {
                        long m79374D = m79374D(t, j);
                        m15506l3 = AbstractC48228rj9.m15506l(i4 << 3);
                        m15505m = AbstractC48228rj9.m15505m(m79374D);
                        i2 += m15506l3 + m15505m;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m79356q(t, i4, i3)) {
                        long m79374D2 = m79374D(t, j);
                        m15506l3 = AbstractC48228rj9.m15506l(i4 << 3);
                        m15505m = AbstractC48228rj9.m15505m(m79374D2);
                        i2 += m15506l3 + m15505m;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m79356q(t, i4, i3)) {
                        int m79347z = m79347z(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i4 << 3);
                        m15513e = AbstractC48228rj9.m15513e(m79347z);
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m79356q(t, i4, i3)) {
                        m15506l = AbstractC48228rj9.m15506l(i4 << 3);
                        m35737Q = m15506l + 8;
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m79356q(t, i4, i3)) {
                        m15506l2 = AbstractC48228rj9.m15506l(i4 << 3);
                        m35737Q = m15506l2 + 4;
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m79356q(t, i4, i3)) {
                        m15506l5 = AbstractC48228rj9.m15506l(i4 << 3);
                        m35737Q = m15506l5 + 1;
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!m79356q(t, i4, i3)) {
                        break;
                    } else {
                        Object m106345k2 = Fs9.m106345k(t, j);
                        if (m106345k2 instanceof AbstractC45836nh9) {
                            m15506l6 = AbstractC48228rj9.m15506l(i4 << 3);
                            mo11924c = ((AbstractC45836nh9) m106345k2).mo11924c();
                            m15506l7 = AbstractC48228rj9.m15506l(mo11924c);
                            i = m15506l6 + m15506l7 + mo11924c;
                            i2 += i;
                            break;
                        } else {
                            m15506l4 = AbstractC48228rj9.m15506l(i4 << 3);
                            m15513e = AbstractC48228rj9.m15508j((String) m106345k2);
                            i = m15506l4 + m15513e;
                            i2 += i;
                        }
                    }
                case 60:
                    if (m79356q(t, i4, i3)) {
                        m35737Q = C42378hr9.m35737Q(i4, Fs9.m106345k(t, j), m79372F(i3));
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m79356q(t, i4, i3)) {
                        m15506l6 = AbstractC48228rj9.m15506l(i4 << 3);
                        mo11924c = ((AbstractC45836nh9) Fs9.m106345k(t, j)).mo11924c();
                        m15506l7 = AbstractC48228rj9.m15506l(mo11924c);
                        i = m15506l6 + m15506l7 + mo11924c;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m79356q(t, i4, i3)) {
                        int m79347z2 = m79347z(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i4 << 3);
                        m15513e = AbstractC48228rj9.m15506l(m79347z2);
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m79356q(t, i4, i3)) {
                        int m79347z3 = m79347z(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i4 << 3);
                        m15513e = AbstractC48228rj9.m15513e(m79347z3);
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m79356q(t, i4, i3)) {
                        m15506l2 = AbstractC48228rj9.m15506l(i4 << 3);
                        m35737Q = m15506l2 + 4;
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m79356q(t, i4, i3)) {
                        m15506l = AbstractC48228rj9.m15506l(i4 << 3);
                        m35737Q = m15506l + 8;
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m79356q(t, i4, i3)) {
                        int m79347z4 = m79347z(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i4 << 3);
                        m15513e = AbstractC48228rj9.m15506l((m79347z4 >> 31) ^ (m79347z4 + m79347z4));
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m79356q(t, i4, i3)) {
                        long m79374D3 = m79374D(t, j);
                        m15506l4 = AbstractC48228rj9.m15506l(i4 << 3);
                        m15513e = AbstractC48228rj9.m15505m((m79374D3 >> 63) ^ (m79374D3 + m79374D3));
                        i = m15506l4 + m15513e;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m79356q(t, i4, i3)) {
                        m35737Q = AbstractC48228rj9.m15515c(i4, (Np9) Fs9.m106345k(t, j), m79372F(i3));
                        i2 += m35737Q;
                        break;
                    } else {
                        break;
                    }
            }
        }
        Nr9<?, ?> nr9 = this.f39834m;
        return i2 + nr9.mo86268a(nr9.mo86265d(t));
    }

    @Override // p000.InterfaceC38803br9
    public final int zza(T t) {
        if (this.f39829h) {
            return m79348y(t);
        }
        return m79349x(t);
    }

    @Override // p000.InterfaceC38803br9
    public final int zzb(T t) {
        int i;
        int m106452c;
        int length = this.f39822a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m79375C = m79375C(i3);
            int i4 = this.f39822a[i3];
            long j = 1048575 & m79375C;
            int i5 = 37;
            switch (m79376B(m79375C)) {
                case 0:
                    i = i2 * 53;
                    m106452c = Fn9.m106452c(Double.doubleToLongBits(Fs9.m106350f(t, j)));
                    i2 = i + m106452c;
                    break;
                case 1:
                    i = i2 * 53;
                    m106452c = Float.floatToIntBits(Fs9.m106349g(t, j));
                    i2 = i + m106452c;
                    break;
                case 2:
                    i = i2 * 53;
                    m106452c = Fn9.m106452c(Fs9.m106347i(t, j));
                    i2 = i + m106452c;
                    break;
                case 3:
                    i = i2 * 53;
                    m106452c = Fn9.m106452c(Fs9.m106347i(t, j));
                    i2 = i + m106452c;
                    break;
                case 4:
                    i = i2 * 53;
                    m106452c = Fs9.m106348h(t, j);
                    i2 = i + m106452c;
                    break;
                case 5:
                    i = i2 * 53;
                    m106452c = Fn9.m106452c(Fs9.m106347i(t, j));
                    i2 = i + m106452c;
                    break;
                case 6:
                    i = i2 * 53;
                    m106452c = Fs9.m106348h(t, j);
                    i2 = i + m106452c;
                    break;
                case 7:
                    i = i2 * 53;
                    m106452c = Fn9.m106454a(Fs9.m106359B(t, j));
                    i2 = i + m106452c;
                    break;
                case 8:
                    i = i2 * 53;
                    m106452c = ((String) Fs9.m106345k(t, j)).hashCode();
                    i2 = i + m106452c;
                    break;
                case 9:
                    Object m106345k = Fs9.m106345k(t, j);
                    if (m106345k != null) {
                        i5 = m106345k.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    m106452c = Fs9.m106345k(t, j).hashCode();
                    i2 = i + m106452c;
                    break;
                case 11:
                    i = i2 * 53;
                    m106452c = Fs9.m106348h(t, j);
                    i2 = i + m106452c;
                    break;
                case 12:
                    i = i2 * 53;
                    m106452c = Fs9.m106348h(t, j);
                    i2 = i + m106452c;
                    break;
                case 13:
                    i = i2 * 53;
                    m106452c = Fs9.m106348h(t, j);
                    i2 = i + m106452c;
                    break;
                case 14:
                    i = i2 * 53;
                    m106452c = Fn9.m106452c(Fs9.m106347i(t, j));
                    i2 = i + m106452c;
                    break;
                case 15:
                    i = i2 * 53;
                    m106452c = Fs9.m106348h(t, j);
                    i2 = i + m106452c;
                    break;
                case 16:
                    i = i2 * 53;
                    m106452c = Fn9.m106452c(Fs9.m106347i(t, j));
                    i2 = i + m106452c;
                    break;
                case 17:
                    Object m106345k2 = Fs9.m106345k(t, j);
                    if (m106345k2 != null) {
                        i5 = m106345k2.hashCode();
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
                    m106452c = Fs9.m106345k(t, j).hashCode();
                    i2 = i + m106452c;
                    break;
                case 50:
                    i = i2 * 53;
                    m106452c = Fs9.m106345k(t, j).hashCode();
                    i2 = i + m106452c;
                    break;
                case 51:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = Fn9.m106452c(Double.doubleToLongBits(m79351v(t, j)));
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = Float.floatToIntBits(m79350w(t, j));
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = Fn9.m106452c(m79374D(t, j));
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = Fn9.m106452c(m79374D(t, j));
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = m79347z(t, j);
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = Fn9.m106452c(m79374D(t, j));
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = m79347z(t, j);
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = Fn9.m106454a(m79355r(t, j));
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = ((String) Fs9.m106345k(t, j)).hashCode();
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = Fs9.m106345k(t, j).hashCode();
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = Fs9.m106345k(t, j).hashCode();
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = m79347z(t, j);
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = m79347z(t, j);
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = m79347z(t, j);
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = Fn9.m106452c(m79374D(t, j));
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = m79347z(t, j);
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = Fn9.m106452c(m79374D(t, j));
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m79356q(t, i4, i3)) {
                        i = i2 * 53;
                        m106452c = Fs9.m106345k(t, j).hashCode();
                        i2 = i + m106452c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f39834m.mo86265d(t).hashCode();
        if (!this.f39827f) {
            return hashCode;
        }
        this.f39835n.mo2669a(t);
        throw null;
    }

    @Override // p000.InterfaceC38803br9
    public final T zzc() {
        return (T) ((Em9) this.f39826e).mo1998n(4, null, null);
    }

    @Override // p000.InterfaceC38803br9
    public final void zze(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f39822a.length; i += 3) {
            int m79375C = m79375C(i);
            long j = 1048575 & m79375C;
            int i2 = this.f39822a[i];
            switch (m79376B(m79375C)) {
                case 0:
                    if (m79359n(t2, i)) {
                        Fs9.m106336t(t, j, Fs9.m106350f(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m79359n(t2, i)) {
                        Fs9.m106335u(t, j, Fs9.m106349g(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m79359n(t2, i)) {
                        Fs9.m106333w(t, j, Fs9.m106347i(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m79359n(t2, i)) {
                        Fs9.m106333w(t, j, Fs9.m106347i(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m79359n(t2, i)) {
                        Fs9.m106334v(t, j, Fs9.m106348h(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m79359n(t2, i)) {
                        Fs9.m106333w(t, j, Fs9.m106347i(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m79359n(t2, i)) {
                        Fs9.m106334v(t, j, Fs9.m106348h(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m79359n(t2, i)) {
                        Fs9.m106338r(t, j, Fs9.m106359B(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m79359n(t2, i)) {
                        Fs9.m106332x(t, j, Fs9.m106345k(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m79368J(t, t2, i);
                    break;
                case 10:
                    if (m79359n(t2, i)) {
                        Fs9.m106332x(t, j, Fs9.m106345k(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m79359n(t2, i)) {
                        Fs9.m106334v(t, j, Fs9.m106348h(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m79359n(t2, i)) {
                        Fs9.m106334v(t, j, Fs9.m106348h(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m79359n(t2, i)) {
                        Fs9.m106334v(t, j, Fs9.m106348h(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m79359n(t2, i)) {
                        Fs9.m106333w(t, j, Fs9.m106347i(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m79359n(t2, i)) {
                        Fs9.m106334v(t, j, Fs9.m106348h(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m79359n(t2, i)) {
                        Fs9.m106333w(t, j, Fs9.m106347i(t2, j));
                        m79365h(t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m79368J(t, t2, i);
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
                    this.f39833l.mo2556c(t, t2, j);
                    break;
                case 50:
                    C42378hr9.m35752B(this.f39837p, t, t2, j);
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
                    if (m79356q(t2, i2, i)) {
                        Fs9.m106332x(t, j, Fs9.m106345k(t2, j));
                        m79364i(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m79367f(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m79356q(t2, i2, i)) {
                        Fs9.m106332x(t, j, Fs9.m106345k(t2, j));
                        m79364i(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m79367f(t, t2, i);
                    break;
            }
        }
        C42378hr9.m35720f(this.f39834m, t, t2);
        if (this.f39827f) {
            C42378hr9.m35721e(this.f39835n, t, t2);
        }
    }
}
