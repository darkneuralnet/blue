package p000;

import com.google.android.gms.internal.auth.zzew;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;
/* renamed from: yk8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52386yk8<T> implements InterfaceC45895nn8<T> {

    /* renamed from: o */
    public static final int[] f120102o = new int[0];

    /* renamed from: p */
    public static final Unsafe f120103p = C38229at8.m65315g();

    /* renamed from: a */
    public final int[] f120104a;

    /* renamed from: b */
    public final Object[] f120105b;

    /* renamed from: c */
    public final int f120106c;

    /* renamed from: d */
    public final int f120107d;

    /* renamed from: e */
    public final InterfaceC34042Kj8 f120108e;

    /* renamed from: f */
    public final boolean f120109f;

    /* renamed from: g */
    public final int[] f120110g;

    /* renamed from: h */
    public final int f120111h;

    /* renamed from: i */
    public final int f120112i;

    /* renamed from: j */
    public final AbstractC49975ug8 f120113j;

    /* renamed from: k */
    public final AbstractC32467Dq8<?, ?> f120114k;

    /* renamed from: l */
    public final AbstractC44335l98<?> f120115l;

    /* renamed from: m */
    public final C37327Yk8 f120116m;

    /* renamed from: n */
    public final C49995ui8 f120117n;

    /* JADX WARN: Multi-variable type inference failed */
    public C52386yk8(int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, InterfaceC34042Kj8 interfaceC34042Kj8, boolean z, boolean z2, int[] iArr3, int i3, int i4, C37327Yk8 c37327Yk8, AbstractC49975ug8 abstractC49975ug8, AbstractC32467Dq8<?, ?> abstractC32467Dq8, AbstractC44335l98<?> abstractC44335l98, C49995ui8 c49995ui8) {
        this.f120104a = iArr;
        this.f120105b = iArr2;
        this.f120106c = objArr;
        this.f120107d = i;
        this.f120109f = interfaceC34042Kj8;
        this.f120110g = z2;
        this.f120111h = iArr3;
        this.f120112i = i3;
        this.f120116m = i4;
        this.f120113j = c37327Yk8;
        this.f120114k = abstractC49975ug8;
        this.f120115l = abstractC32467Dq8;
        this.f120108e = i2;
        this.f120117n = abstractC44335l98;
    }

    /* renamed from: C */
    public static int m2701C(int i) {
        return (i >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    /* renamed from: E */
    public static <T> long m2699E(T t, long j) {
        return ((Long) C38229at8.m65316f(t, j)).longValue();
    }

    /* renamed from: a */
    public static Field m2695a(Class<?> cls, String str) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static boolean m2682n(Object obj, int i, InterfaceC45895nn8 interfaceC45895nn8) {
        return interfaceC45895nn8.mo2693c(C38229at8.m65316f(obj, i & 1048575));
    }

    /* renamed from: q */
    public static C35275Pq8 m2679q(Object obj) {
        AbstractC35140Pb8 abstractC35140Pb8 = (AbstractC35140Pb8) obj;
        C35275Pq8 c35275Pq8 = abstractC35140Pb8.zzc;
        if (c35275Pq8 == C35275Pq8.m89701a()) {
            C35275Pq8 m89699c = C35275Pq8.m89699c();
            abstractC35140Pb8.zzc = m89699c;
            return m89699c;
        }
        return c35275Pq8;
    }

    /* renamed from: r */
    public static <T> C52386yk8<T> m2678r(Class<T> cls, InterfaceC36841Wi8 interfaceC36841Wi8, C37327Yk8 c37327Yk8, AbstractC49975ug8 abstractC49975ug8, AbstractC32467Dq8<?, ?> abstractC32467Dq8, AbstractC44335l98<?> abstractC44335l98, C49995ui8 c49995ui8) {
        if (interfaceC36841Wi8 instanceof C38169an8) {
            return m2677s((C38169an8) interfaceC36841Wi8, c37327Yk8, abstractC49975ug8, abstractC32467Dq8, abstractC44335l98, c49995ui8);
        }
        C36202Tp8 c36202Tp8 = (C36202Tp8) interfaceC36841Wi8;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0384  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> C52386yk8<T> m2677s(C38169an8 c38169an8, C37327Yk8 c37327Yk8, AbstractC49975ug8 abstractC49975ug8, AbstractC32467Dq8<?, ?> abstractC32467Dq8, AbstractC44335l98<?> abstractC44335l98, C49995ui8 c49995ui8) {
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
        Field m2695a;
        char charAt12;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field m2695a2;
        Object obj2;
        Field m2695a3;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        int i31;
        char charAt15;
        int i32;
        char charAt16;
        if (c38169an8.zzc() == 2) {
            z = true;
        } else {
            z = false;
        }
        String m70720a = c38169an8.m70720a();
        int length = m70720a.length();
        char c = 55296;
        if (m70720a.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (m70720a.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int charAt17 = m70720a.charAt(i);
        if (charAt17 >= 55296) {
            int i35 = charAt17 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                charAt16 = m70720a.charAt(i34);
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
            iArr = f120102o;
            i3 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt18 = m70720a.charAt(i34);
            if (charAt18 >= 55296) {
                int i38 = charAt18 & 8191;
                int i39 = 13;
                while (true) {
                    i13 = i37 + 1;
                    charAt11 = m70720a.charAt(i37);
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
            int charAt19 = m70720a.charAt(i37);
            if (charAt19 >= 55296) {
                int i41 = charAt19 & 8191;
                int i42 = 13;
                while (true) {
                    i12 = i40 + 1;
                    charAt10 = m70720a.charAt(i40);
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
            charAt = m70720a.charAt(i40);
            if (charAt >= 55296) {
                int i44 = charAt & 8191;
                int i45 = 13;
                while (true) {
                    i11 = i43 + 1;
                    charAt9 = m70720a.charAt(i43);
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
            int charAt20 = m70720a.charAt(i43);
            if (charAt20 >= 55296) {
                int i47 = charAt20 & 8191;
                int i48 = 13;
                while (true) {
                    i10 = i46 + 1;
                    charAt8 = m70720a.charAt(i46);
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
            charAt2 = m70720a.charAt(i46);
            if (charAt2 >= 55296) {
                int i50 = charAt2 & 8191;
                int i51 = 13;
                while (true) {
                    i9 = i49 + 1;
                    charAt7 = m70720a.charAt(i49);
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
            int charAt21 = m70720a.charAt(i49);
            if (charAt21 >= 55296) {
                int i53 = charAt21 & 8191;
                int i54 = 13;
                while (true) {
                    i8 = i52 + 1;
                    charAt6 = m70720a.charAt(i52);
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
            int charAt22 = m70720a.charAt(i52);
            if (charAt22 >= 55296) {
                int i56 = charAt22 & 8191;
                int i57 = 13;
                while (true) {
                    i7 = i55 + 1;
                    charAt5 = m70720a.charAt(i55);
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
            charAt3 = m70720a.charAt(i55);
            if (charAt3 >= 55296) {
                int i59 = charAt3 & 8191;
                int i60 = 13;
                while (true) {
                    i6 = i58 + 1;
                    charAt4 = m70720a.charAt(i58);
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
        Unsafe unsafe = f120103p;
        Object[] m70719b = c38169an8.m70719b();
        Class<?> cls = c38169an8.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i62 = charAt3 + i5;
        int i63 = charAt3;
        int i64 = i62;
        int i65 = 0;
        int i66 = 0;
        while (i34 < length) {
            int i67 = i34 + 1;
            int charAt23 = m70720a.charAt(i34);
            if (charAt23 >= c) {
                int i68 = charAt23 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i31 = i69 + 1;
                    charAt15 = m70720a.charAt(i69);
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
            int charAt24 = m70720a.charAt(i14);
            if (charAt24 >= c) {
                int i72 = charAt24 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i30 = i73 + 1;
                    charAt14 = m70720a.charAt(i73);
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
                int charAt25 = m70720a.charAt(i16);
                if (charAt25 >= 55296) {
                    int i78 = charAt25 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i29 = i79 + 1;
                        charAt13 = m70720a.charAt(i79);
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
                        objArr2[i82 + i82 + 1] = m70719b[i2];
                    }
                    int i83 = charAt25 + charAt25;
                    obj = m70719b[i83];
                    if (!(obj instanceof Field)) {
                        m2695a2 = (Field) obj;
                    } else {
                        m2695a2 = m2695a(cls, (String) obj);
                        m70719b[i83] = m2695a2;
                    }
                    iArr2 = iArr3;
                    i17 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m2695a2);
                    int i84 = i83 + 1;
                    obj2 = m70719b[i84];
                    if (!(obj2 instanceof Field)) {
                        m2695a3 = (Field) obj2;
                    } else {
                        m2695a3 = m2695a(cls, (String) obj2);
                        m70719b[i84] = m2695a3;
                    }
                    str = m70720a;
                    i21 = (int) unsafe.objectFieldOffset(m2695a3);
                    objArr = objArr2;
                    objectFieldOffset = objectFieldOffset2;
                    i23 = 0;
                } else {
                    int i85 = i65 / 3;
                    i28 = i2 + 1;
                    objArr2[i85 + i85 + 1] = m70719b[i2];
                }
                i2 = i28;
                int i832 = charAt25 + charAt25;
                obj = m70719b[i832];
                if (!(obj instanceof Field)) {
                }
                iArr2 = iArr3;
                i17 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m2695a2);
                int i842 = i832 + 1;
                obj2 = m70719b[i842];
                if (!(obj2 instanceof Field)) {
                }
                str = m70720a;
                i21 = (int) unsafe.objectFieldOffset(m2695a3);
                objArr = objArr2;
                objectFieldOffset = objectFieldOffset22;
                i23 = 0;
            } else {
                iArr2 = iArr3;
                i17 = charAt;
                i18 = i4;
                int i86 = i2 + 1;
                Field m2695a4 = m2695a(cls, (String) m70719b[i2]);
                if (i75 != 9 && i75 != 17) {
                    if (i75 != 27 && i75 != 49) {
                        if (i75 != 12 && i75 != 30 && i75 != 44) {
                            if (i75 == 50) {
                                int i87 = i63 + 1;
                                iArr[i63] = i65;
                                int i88 = i65 / 3;
                                int i89 = i88 + i88;
                                int i90 = i86 + 1;
                                objArr2[i89] = m70719b[i86];
                                if ((charAt24 & 2048) != 0) {
                                    i86 = i90 + 1;
                                    objArr2[i89 + 1] = m70719b[i90];
                                    i63 = i87;
                                } else {
                                    i63 = i87;
                                    i19 = i90;
                                    objectFieldOffset = (int) unsafe.objectFieldOffset(m2695a4);
                                    objArr = objArr2;
                                    if ((charAt24 & 4096) != 4096 && i75 <= 17) {
                                        int i91 = i16 + 1;
                                        int charAt26 = m70720a.charAt(i16);
                                        if (charAt26 >= 55296) {
                                            int i92 = charAt26 & 8191;
                                            int i93 = 13;
                                            while (true) {
                                                i22 = i91 + 1;
                                                charAt12 = m70720a.charAt(i91);
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
                                        Object obj3 = m70719b[i94];
                                        str = m70720a;
                                        if (obj3 instanceof Field) {
                                            m2695a = (Field) obj3;
                                        } else {
                                            m2695a = m2695a(cls, (String) obj3);
                                            m70719b[i94] = m2695a;
                                        }
                                        i20 = i19;
                                        i21 = (int) unsafe.objectFieldOffset(m2695a);
                                        i23 = charAt26 % 32;
                                    } else {
                                        str = m70720a;
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
                            objArr2[i95 + i95 + 1] = m70719b[i86];
                        }
                    } else {
                        int i96 = i65 / 3;
                        i24 = i86 + 1;
                        objArr2[i96 + i96 + 1] = m70719b[i86];
                    }
                    i19 = i24;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m2695a4);
                    objArr = objArr2;
                    if ((charAt24 & 4096) != 4096) {
                    }
                    str = m70720a;
                    i20 = i19;
                    i21 = 1048575;
                    i22 = i16;
                    i23 = 0;
                    if (i75 < 18) {
                    }
                    i2 = i20;
                } else {
                    int i97 = i65 / 3;
                    objArr2[i97 + i97 + 1] = m2695a4.getType();
                }
                i19 = i86;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m2695a4);
                objArr = objArr2;
                if ((charAt24 & 4096) != 4096) {
                }
                str = m70720a;
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
            m70720a = str;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new C52386yk8<>(iArr3, objArr2, charAt, i4, c38169an8.zza(), z, false, iArr, charAt3, i62, c37327Yk8, abstractC49975ug8, abstractC32467Dq8, abstractC44335l98, c49995ui8, null);
    }

    /* renamed from: t */
    public static <T> int m2676t(T t, long j) {
        return ((Integer) C38229at8.m65316f(t, j)).intValue();
    }

    /* renamed from: A */
    public final int m2703A(int i) {
        return this.f120104a[i + 2];
    }

    /* renamed from: B */
    public final int m2702B(int i, int i2) {
        int length = (this.f120104a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f120104a[i4];
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
    public final int m2700D(int i) {
        return this.f120104a[i + 1];
    }

    /* renamed from: F */
    public final InterfaceC32341Dc8 m2698F(int i) {
        int i2 = i / 3;
        return (InterfaceC32341Dc8) this.f120105b[i2 + i2 + 1];
    }

    /* renamed from: G */
    public final InterfaceC45895nn8 m2697G(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        InterfaceC45895nn8 interfaceC45895nn8 = (InterfaceC45895nn8) this.f120105b[i3];
        if (interfaceC45895nn8 != null) {
            return interfaceC45895nn8;
        }
        InterfaceC45895nn8<T> m94914b = C34528Ml8.m94915a().m94914b((Class) this.f120105b[i3 + 1]);
        this.f120105b[i3] = m94914b;
        return m94914b;
    }

    /* renamed from: H */
    public final Object m2696H(int i) {
        int i2 = i / 3;
        return this.f120105b[i2 + i2];
    }

    @Override // p000.InterfaceC45895nn8
    /* renamed from: b */
    public final void mo2694b(T t) {
        int i;
        int i2 = this.f120111h;
        while (true) {
            i = this.f120112i;
            if (i2 >= i) {
                break;
            }
            long m2700D = m2700D(this.f120110g[i2]) & 1048575;
            Object m65316f = C38229at8.m65316f(t, m2700D);
            if (m65316f != null) {
                ((C41101fi8) m65316f).m41004f();
                C38229at8.m65306p(t, m2700D, m65316f);
            }
            i2++;
        }
        int length = this.f120110g.length;
        while (i < length) {
            this.f120113j.mo9882a(t, this.f120110g[i]);
            i++;
        }
        this.f120114k.mo43585e(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC45895nn8
    /* renamed from: c */
    public final boolean mo2693c(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f120111h) {
            int i6 = this.f120110g[i5];
            int i7 = this.f120104a[i6];
            int m2700D = m2700D(i6);
            int i8 = this.f120104a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f120103p.getInt(t, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & m2700D) != 0 && !m2683m(t, i6, i, i2, i10)) {
                return false;
            }
            int m2701C = m2701C(m2700D);
            if (m2701C != 9 && m2701C != 17) {
                if (m2701C != 27) {
                    if (m2701C != 60 && m2701C != 68) {
                        if (m2701C != 49) {
                            if (m2701C == 50 && !((C41101fi8) C38229at8.m65316f(t, m2700D & 1048575)).isEmpty()) {
                                C35896Sh8 c35896Sh8 = (C35896Sh8) m2696H(i6);
                                throw null;
                            }
                        }
                    } else if (m2681o(t, i7, i6) && !m2682n(t, m2700D, m2697G(i6))) {
                        return false;
                    }
                }
                List list = (List) C38229at8.m65316f(t, m2700D & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC45895nn8 m2697G = m2697G(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m2697G.mo2693c(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m2683m(t, i6, i, i2, i10) && !m2682n(t, m2700D, m2697G(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return true;
    }

    @Override // p000.InterfaceC45895nn8
    /* renamed from: d */
    public final boolean mo2692d(T t, T t2) {
        boolean m96338h;
        int length = this.f120104a.length;
        for (int i = 0; i < length; i += 3) {
            int m2700D = m2700D(i);
            long j = m2700D & 1048575;
            switch (m2701C(m2700D)) {
                case 0:
                    if (m2685k(t, t2, i) && Double.doubleToLongBits(C38229at8.m65321a(t, j)) == Double.doubleToLongBits(C38229at8.m65321a(t2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m2685k(t, t2, i) && Float.floatToIntBits(C38229at8.m65320b(t, j)) == Float.floatToIntBits(C38229at8.m65320b(t2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m2685k(t, t2, i) && C38229at8.m65318d(t, j) == C38229at8.m65318d(t2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m2685k(t, t2, i) && C38229at8.m65318d(t, j) == C38229at8.m65318d(t2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m2685k(t, t2, i) && C38229at8.m65319c(t, j) == C38229at8.m65319c(t2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m2685k(t, t2, i) && C38229at8.m65318d(t, j) == C38229at8.m65318d(t2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m2685k(t, t2, i) && C38229at8.m65319c(t, j) == C38229at8.m65319c(t2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m2685k(t, t2, i) && C38229at8.m65302t(t, j) == C38229at8.m65302t(t2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m2685k(t, t2, i) && C34312Ln8.m96338h(C38229at8.m65316f(t, j), C38229at8.m65316f(t2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m2685k(t, t2, i) && C34312Ln8.m96338h(C38229at8.m65316f(t, j), C38229at8.m65316f(t2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m2685k(t, t2, i) && C34312Ln8.m96338h(C38229at8.m65316f(t, j), C38229at8.m65316f(t2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m2685k(t, t2, i) && C38229at8.m65319c(t, j) == C38229at8.m65319c(t2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m2685k(t, t2, i) && C38229at8.m65319c(t, j) == C38229at8.m65319c(t2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m2685k(t, t2, i) && C38229at8.m65319c(t, j) == C38229at8.m65319c(t2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m2685k(t, t2, i) && C38229at8.m65318d(t, j) == C38229at8.m65318d(t2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m2685k(t, t2, i) && C38229at8.m65319c(t, j) == C38229at8.m65319c(t2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m2685k(t, t2, i) && C38229at8.m65318d(t, j) == C38229at8.m65318d(t2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m2685k(t, t2, i) && C34312Ln8.m96338h(C38229at8.m65316f(t, j), C38229at8.m65316f(t2, j))) {
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
                    m96338h = C34312Ln8.m96338h(C38229at8.m65316f(t, j), C38229at8.m65316f(t2, j));
                    break;
                case 50:
                    m96338h = C34312Ln8.m96338h(C38229at8.m65316f(t, j), C38229at8.m65316f(t2, j));
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
                    long m2703A = m2703A(i) & 1048575;
                    if (C38229at8.m65319c(t, m2703A) == C38229at8.m65319c(t2, m2703A) && C34312Ln8.m96338h(C38229at8.m65316f(t, j), C38229at8.m65316f(t2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!m96338h) {
                return false;
            }
        }
        if (!this.f120114k.mo43589a(t).equals(this.f120114k.mo43589a(t2))) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC45895nn8
    /* renamed from: e */
    public final void mo2691e(T t, byte[] bArr, int i, int i2, C39532d38 c39532d38) throws IOException {
        if (this.f120109f) {
            m2673w(t, bArr, i, i2, c39532d38);
        } else {
            m2680p(t, bArr, i, i2, 0, c39532d38);
        }
    }

    @Override // p000.InterfaceC45895nn8
    /* renamed from: f */
    public final void mo2690f(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f120104a.length; i += 3) {
            int m2700D = m2700D(i);
            long j = 1048575 & m2700D;
            int i2 = this.f120104a[i];
            switch (m2701C(m2700D)) {
                case 0:
                    if (m2684l(t2, i)) {
                        C38229at8.m65310l(t, j, C38229at8.m65321a(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m2684l(t2, i)) {
                        C38229at8.m65309m(t, j, C38229at8.m65320b(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m2684l(t2, i)) {
                        C38229at8.m65307o(t, j, C38229at8.m65318d(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m2684l(t2, i)) {
                        C38229at8.m65307o(t, j, C38229at8.m65318d(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m2684l(t2, i)) {
                        C38229at8.m65308n(t, j, C38229at8.m65319c(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m2684l(t2, i)) {
                        C38229at8.m65307o(t, j, C38229at8.m65318d(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m2684l(t2, i)) {
                        C38229at8.m65308n(t, j, C38229at8.m65319c(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m2684l(t2, i)) {
                        C38229at8.m65311k(t, j, C38229at8.m65302t(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m2684l(t2, i)) {
                        C38229at8.m65306p(t, j, C38229at8.m65316f(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m2689g(t, t2, i);
                    break;
                case 10:
                    if (m2684l(t2, i)) {
                        C38229at8.m65306p(t, j, C38229at8.m65316f(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m2684l(t2, i)) {
                        C38229at8.m65308n(t, j, C38229at8.m65319c(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m2684l(t2, i)) {
                        C38229at8.m65308n(t, j, C38229at8.m65319c(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m2684l(t2, i)) {
                        C38229at8.m65308n(t, j, C38229at8.m65319c(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m2684l(t2, i)) {
                        C38229at8.m65307o(t, j, C38229at8.m65318d(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m2684l(t2, i)) {
                        C38229at8.m65308n(t, j, C38229at8.m65319c(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m2684l(t2, i)) {
                        C38229at8.m65307o(t, j, C38229at8.m65318d(t2, j));
                        m2687i(t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m2689g(t, t2, i);
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
                    this.f120113j.mo9881b(t, t2, j);
                    break;
                case 50:
                    C34312Ln8.m96337i(this.f120117n, t, t2, j);
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
                    if (m2681o(t2, i2, i)) {
                        C38229at8.m65306p(t, j, C38229at8.m65316f(t2, j));
                        m2686j(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m2688h(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m2681o(t2, i2, i)) {
                        C38229at8.m65306p(t, j, C38229at8.m65316f(t2, j));
                        m2686j(t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m2688h(t, t2, i);
                    break;
            }
        }
        C34312Ln8.m96340f(this.f120114k, t, t2);
    }

    /* renamed from: g */
    public final void m2689g(T t, T t2, int i) {
        long m2700D = m2700D(i) & 1048575;
        if (!m2684l(t2, i)) {
            return;
        }
        Object m65316f = C38229at8.m65316f(t, m2700D);
        Object m65316f2 = C38229at8.m65316f(t2, m2700D);
        if (m65316f != null && m65316f2 != null) {
            C38229at8.m65306p(t, m2700D, C41051fd8.m41088g(m65316f, m65316f2));
            m2687i(t, i);
        } else if (m65316f2 != null) {
            C38229at8.m65306p(t, m2700D, m65316f2);
            m2687i(t, i);
        }
    }

    /* renamed from: h */
    public final void m2688h(T t, T t2, int i) {
        Object obj;
        int m2700D = m2700D(i);
        int i2 = this.f120104a[i];
        long j = m2700D & 1048575;
        if (!m2681o(t2, i2, i)) {
            return;
        }
        if (m2681o(t, i2, i)) {
            obj = C38229at8.m65316f(t, j);
        } else {
            obj = null;
        }
        Object m65316f = C38229at8.m65316f(t2, j);
        if (obj != null && m65316f != null) {
            C38229at8.m65306p(t, j, C41051fd8.m41088g(obj, m65316f));
            m2686j(t, i2, i);
        } else if (m65316f != null) {
            C38229at8.m65306p(t, j, m65316f);
            m2686j(t, i2, i);
        }
    }

    /* renamed from: i */
    public final void m2687i(T t, int i) {
        int m2703A = m2703A(i);
        long j = 1048575 & m2703A;
        if (j == 1048575) {
            return;
        }
        C38229at8.m65308n(t, j, (1 << (m2703A >>> 20)) | C38229at8.m65319c(t, j));
    }

    /* renamed from: j */
    public final void m2686j(T t, int i, int i2) {
        C38229at8.m65308n(t, m2703A(i2) & 1048575, i);
    }

    /* renamed from: k */
    public final boolean m2685k(T t, T t2, int i) {
        return m2684l(t, i) == m2684l(t2, i);
    }

    /* renamed from: l */
    public final boolean m2684l(T t, int i) {
        int m2703A = m2703A(i);
        long j = m2703A & 1048575;
        if (j == 1048575) {
            int m2700D = m2700D(i);
            long j2 = m2700D & 1048575;
            switch (m2701C(m2700D)) {
                case 0:
                    if (C38229at8.m65321a(t, j2) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (C38229at8.m65320b(t, j2) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C38229at8.m65318d(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C38229at8.m65318d(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C38229at8.m65319c(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C38229at8.m65318d(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C38229at8.m65319c(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C38229at8.m65302t(t, j2);
                case 8:
                    Object m65316f = C38229at8.m65316f(t, j2);
                    if (m65316f instanceof String) {
                        if (((String) m65316f).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m65316f instanceof AbstractC50836w78) {
                        if (AbstractC50836w78.f115390c.equals(m65316f)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (C38229at8.m65316f(t, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC50836w78.f115390c.equals(C38229at8.m65316f(t, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (C38229at8.m65319c(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C38229at8.m65319c(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (C38229at8.m65319c(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C38229at8.m65318d(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C38229at8.m65319c(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C38229at8.m65318d(t, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C38229at8.m65316f(t, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((C38229at8.m65319c(t, j) & (1 << (m2703A >>> 20))) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: m */
    public final boolean m2683m(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m2684l(t, i) : (i3 & i4) != 0;
    }

    /* renamed from: o */
    public final boolean m2681o(T t, int i, int i2) {
        if (C38229at8.m65319c(t, m2703A(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0326, code lost:
        if (r0 != r2) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0328, code lost:
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r13 = r32;
        r11 = r33;
        r9 = r34;
        r1 = r17;
        r2 = r19;
        r3 = r20;
        r5 = r22;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0340, code lost:
        r7 = r33;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0368, code lost:
        if (r0 != r15) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x038c, code lost:
        if (r0 != r15) goto L178;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2680p(T t, byte[] bArr, int i, int i2, int i3, C39532d38 c39532d38) throws IOException {
        Unsafe unsafe;
        int i4;
        T t2;
        byte b;
        int m2671y;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z;
        C52386yk8<T> c52386yk8 = this;
        T t3 = t;
        byte[] bArr2 = bArr;
        int i18 = i2;
        int i19 = i3;
        C39532d38 c39532d382 = c39532d38;
        Unsafe unsafe2 = f120103p;
        int i20 = i;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = -1;
        int i25 = 1048575;
        while (true) {
            if (i20 < i18) {
                int i26 = i20 + 1;
                byte b2 = bArr2[i20];
                if (b2 < 0) {
                    int m13173k = C49018t38.m13173k(b2, bArr2, i26, c39532d382);
                    b = c39532d382.f76082a;
                    i26 = m13173k;
                } else {
                    b = b2;
                }
                int i27 = b >>> 3;
                int i28 = b & 7;
                if (i27 > i24) {
                    m2671y = c52386yk8.m2670z(i27, i22 / 3);
                } else {
                    m2671y = c52386yk8.m2671y(i27);
                }
                if (m2671y == -1) {
                    i5 = i27;
                    i6 = i26;
                    i7 = b;
                    i8 = i23;
                    unsafe = unsafe2;
                    i4 = i19;
                    i9 = 0;
                } else {
                    int i29 = c52386yk8.f120104a[m2671y + 1];
                    int m2701C = m2701C(i29);
                    i5 = i27;
                    int i30 = b;
                    long j = i29 & 1048575;
                    if (m2701C <= 17) {
                        int i31 = c52386yk8.f120104a[m2671y + 2];
                        int i32 = 1 << (i31 >>> 20);
                        int i33 = i31 & 1048575;
                        if (i33 != i25) {
                            if (i25 != 1048575) {
                                unsafe2.putInt(t3, i25, i23);
                            }
                            i23 = unsafe2.getInt(t3, i33);
                            i14 = i33;
                        } else {
                            i14 = i25;
                        }
                        int i34 = i23;
                        switch (m2701C) {
                            case 0:
                                bArr2 = bArr;
                                i15 = m2671y;
                                i16 = i14;
                                i17 = i30;
                                i6 = i26;
                                if (i28 == 1) {
                                    C38229at8.m65310l(t3, j, Double.longBitsToDouble(C49018t38.m13170n(bArr2, i6)));
                                    i20 = i6 + 8;
                                    i23 = i34 | i32;
                                    i25 = i16;
                                    i22 = i15;
                                    i21 = i17;
                                    i24 = i5;
                                    break;
                                } else {
                                    i8 = i34;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i25 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i15 = m2671y;
                                i16 = i14;
                                i17 = i30;
                                i6 = i26;
                                if (i28 == 5) {
                                    C38229at8.m65309m(t3, j, Float.intBitsToFloat(C49018t38.m13182b(bArr2, i6)));
                                    i20 = i6 + 4;
                                    i23 = i34 | i32;
                                    i25 = i16;
                                    i22 = i15;
                                    i21 = i17;
                                    i24 = i5;
                                    break;
                                } else {
                                    i8 = i34;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i25 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i15 = m2671y;
                                i16 = i14;
                                i17 = i30;
                                i6 = i26;
                                if (i28 == 0) {
                                    int m13171m = C49018t38.m13171m(bArr2, i6, c39532d382);
                                    unsafe2.putLong(t, j, c39532d382.f76083b);
                                    i23 = i34 | i32;
                                    i25 = i16;
                                    i22 = i15;
                                    i20 = m13171m;
                                    i21 = i17;
                                    i24 = i5;
                                    break;
                                } else {
                                    i8 = i34;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i25 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i15 = m2671y;
                                i16 = i14;
                                i17 = i30;
                                i6 = i26;
                                if (i28 == 0) {
                                    i20 = C49018t38.m13174j(bArr2, i6, c39532d382);
                                    unsafe2.putInt(t3, j, c39532d382.f76082a);
                                    i23 = i34 | i32;
                                    i25 = i16;
                                    i22 = i15;
                                    i21 = i17;
                                    i24 = i5;
                                    break;
                                } else {
                                    i8 = i34;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i25 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i15 = m2671y;
                                i16 = i14;
                                i17 = i30;
                                if (i28 == 1) {
                                    unsafe2.putLong(t, j, C49018t38.m13170n(bArr2, i26));
                                    i20 = i26 + 8;
                                    i23 = i34 | i32;
                                    i25 = i16;
                                    i22 = i15;
                                    i21 = i17;
                                    i24 = i5;
                                    break;
                                } else {
                                    i6 = i26;
                                    i8 = i34;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i25 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i15 = m2671y;
                                i16 = i14;
                                i17 = i30;
                                if (i28 == 5) {
                                    unsafe2.putInt(t3, j, C49018t38.m13182b(bArr2, i26));
                                    i20 = i26 + 4;
                                    i23 = i34 | i32;
                                    i25 = i16;
                                    i22 = i15;
                                    i21 = i17;
                                    i24 = i5;
                                    break;
                                } else {
                                    i6 = i26;
                                    i8 = i34;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i25 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                i15 = m2671y;
                                i16 = i14;
                                i17 = i30;
                                if (i28 == 0) {
                                    i20 = C49018t38.m13171m(bArr2, i26, c39532d382);
                                    if (c39532d382.f76083b != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    C38229at8.m65311k(t3, j, z);
                                    i23 = i34 | i32;
                                    i25 = i16;
                                    i22 = i15;
                                    i21 = i17;
                                    i24 = i5;
                                    break;
                                } else {
                                    i6 = i26;
                                    i8 = i34;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i25 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i15 = m2671y;
                                i16 = i14;
                                i17 = i30;
                                if (i28 == 2) {
                                    if ((i29 & 536870912) == 0) {
                                        i20 = C49018t38.m13177g(bArr2, i26, c39532d382);
                                    } else {
                                        i20 = C49018t38.m13176h(bArr2, i26, c39532d382);
                                    }
                                    unsafe2.putObject(t3, j, c39532d382.f76084c);
                                    i23 = i34 | i32;
                                    i25 = i16;
                                    i22 = i15;
                                    i21 = i17;
                                    i24 = i5;
                                    break;
                                } else {
                                    i6 = i26;
                                    i8 = i34;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i25 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 9:
                                bArr2 = bArr;
                                i15 = m2671y;
                                i16 = i14;
                                i17 = i30;
                                if (i28 == 2) {
                                    i20 = C49018t38.m13180d(c52386yk8.m2697G(i15), bArr2, i26, i18, c39532d382);
                                    if ((i34 & i32) == 0) {
                                        unsafe2.putObject(t3, j, c39532d382.f76084c);
                                    } else {
                                        unsafe2.putObject(t3, j, C41051fd8.m41088g(unsafe2.getObject(t3, j), c39532d382.f76084c));
                                    }
                                    i23 = i34 | i32;
                                    i25 = i16;
                                    i22 = i15;
                                    i21 = i17;
                                    i24 = i5;
                                    break;
                                } else {
                                    i6 = i26;
                                    i8 = i34;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i25 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 10:
                                bArr2 = bArr;
                                i15 = m2671y;
                                i16 = i14;
                                i17 = i30;
                                if (i28 == 2) {
                                    i20 = C49018t38.m13183a(bArr2, i26, c39532d382);
                                    unsafe2.putObject(t3, j, c39532d382.f76084c);
                                    i23 = i34 | i32;
                                    i25 = i16;
                                    i22 = i15;
                                    i21 = i17;
                                    i24 = i5;
                                    break;
                                } else {
                                    i6 = i26;
                                    i8 = i34;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i25 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 12:
                                bArr2 = bArr;
                                i15 = m2671y;
                                i16 = i14;
                                i17 = i30;
                                if (i28 == 0) {
                                    i20 = C49018t38.m13174j(bArr2, i26, c39532d382);
                                    int i35 = c39532d382.f76082a;
                                    InterfaceC32341Dc8 m2698F = c52386yk8.m2698F(i15);
                                    if (m2698F != null && !m2698F.zza()) {
                                        m2679q(t).m89696f(i17, Long.valueOf(i35));
                                        i23 = i34;
                                        i22 = i15;
                                        i21 = i17;
                                        i24 = i5;
                                        i25 = i16;
                                        break;
                                    } else {
                                        unsafe2.putInt(t3, j, i35);
                                        i23 = i34 | i32;
                                        i25 = i16;
                                        i22 = i15;
                                        i21 = i17;
                                        i24 = i5;
                                        break;
                                    }
                                } else {
                                    i6 = i26;
                                    i8 = i34;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i25 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 15:
                                bArr2 = bArr;
                                i15 = m2671y;
                                i16 = i14;
                                i17 = i30;
                                if (i28 == 0) {
                                    i20 = C49018t38.m13174j(bArr2, i26, c39532d382);
                                    unsafe2.putInt(t3, j, C47883r88.m16436a(c39532d382.f76082a));
                                    i23 = i34 | i32;
                                    i25 = i16;
                                    i22 = i15;
                                    i21 = i17;
                                    i24 = i5;
                                    break;
                                } else {
                                    i6 = i26;
                                    i8 = i34;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i25 = i16;
                                    i4 = i3;
                                    break;
                                }
                            case 16:
                                if (i28 == 0) {
                                    bArr2 = bArr;
                                    int m13171m2 = C49018t38.m13171m(bArr2, i26, c39532d382);
                                    int i36 = i14;
                                    i17 = i30;
                                    unsafe2.putLong(t, j, C47883r88.m16435b(c39532d382.f76083b));
                                    i23 = i34 | i32;
                                    i25 = i36;
                                    i20 = m13171m2;
                                    i22 = m2671y;
                                    i21 = i17;
                                    i24 = i5;
                                    break;
                                } else {
                                    i16 = i14;
                                    i17 = i30;
                                    i15 = m2671y;
                                    i6 = i26;
                                    i8 = i34;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i25 = i16;
                                    i4 = i3;
                                    break;
                                }
                            default:
                                i15 = m2671y;
                                i16 = i14;
                                i17 = i30;
                                i6 = i26;
                                if (i28 == 3) {
                                    i20 = C49018t38.m13181c(c52386yk8.m2697G(i15), bArr, i6, i2, (i5 << 3) | 4, c39532d38);
                                    if ((i34 & i32) == 0) {
                                        unsafe2.putObject(t3, j, c39532d382.f76084c);
                                    } else {
                                        unsafe2.putObject(t3, j, C41051fd8.m41088g(unsafe2.getObject(t3, j), c39532d382.f76084c));
                                    }
                                    i23 = i34 | i32;
                                    bArr2 = bArr;
                                    i25 = i16;
                                    i18 = i2;
                                    i22 = i15;
                                    i21 = i17;
                                    i24 = i5;
                                    break;
                                } else {
                                    i8 = i34;
                                    i9 = i15;
                                    unsafe = unsafe2;
                                    i7 = i17;
                                    i25 = i16;
                                    i4 = i3;
                                    break;
                                }
                        }
                        i19 = i3;
                    } else {
                        int i37 = m2671y;
                        int i38 = i26;
                        if (m2701C == 27) {
                            if (i28 == 2) {
                                InterfaceC35383Qc8 interfaceC35383Qc8 = (InterfaceC35383Qc8) unsafe2.getObject(t3, j);
                                if (!interfaceC35383Qc8.zzc()) {
                                    int size = interfaceC35383Qc8.size();
                                    if (size == 0) {
                                        i13 = 10;
                                    } else {
                                        i13 = size + size;
                                    }
                                    interfaceC35383Qc8 = interfaceC35383Qc8.mo41068d(i13);
                                    unsafe2.putObject(t3, j, interfaceC35383Qc8);
                                }
                                i21 = i30;
                                i20 = C49018t38.m13179e(c52386yk8.m2697G(i37), i21, bArr, i38, i2, interfaceC35383Qc8, c39532d38);
                                bArr2 = bArr;
                                i18 = i2;
                                i24 = i5;
                                i22 = i37;
                                i23 = i23;
                                i25 = i25;
                                i19 = i3;
                            } else {
                                i9 = i37;
                                i8 = i23;
                                i10 = i25;
                                i11 = i38;
                                unsafe = unsafe2;
                                i12 = i30;
                            }
                        } else {
                            i9 = i37;
                            i8 = i23;
                            i10 = i25;
                            if (m2701C <= 49) {
                                unsafe = unsafe2;
                                i12 = i30;
                                i20 = m2672x(t, bArr, i38, i2, i30, i5, i28, i9, i29, m2701C, j, c39532d38);
                            } else {
                                i11 = i38;
                                unsafe = unsafe2;
                                i12 = i30;
                                if (m2701C == 50) {
                                    if (i28 == 2) {
                                        i20 = m2675u(t, bArr, i11, i2, i9, j, c39532d38);
                                    }
                                } else {
                                    i20 = m2674v(t, bArr, i11, i2, i12, i5, i28, i29, m2701C, j, i9, c39532d38);
                                }
                            }
                        }
                        i4 = i3;
                        i6 = i11;
                        i7 = i12;
                        i25 = i10;
                    }
                }
                if (i7 == i4 && i4 != 0) {
                    i20 = i6;
                    i21 = i7;
                    i23 = i8;
                } else {
                    i20 = C49018t38.m13175i(i7, bArr, i6, i2, m2679q(t), c39532d38);
                    c52386yk8 = this;
                    t3 = t;
                    bArr2 = bArr;
                    i18 = i2;
                    c39532d382 = c39532d38;
                    i19 = i4;
                    i21 = i7;
                    i24 = i5;
                    i22 = i9;
                    i23 = i8;
                    unsafe2 = unsafe;
                }
            } else {
                unsafe = unsafe2;
                i4 = i19;
            }
        }
        if (i25 != 1048575) {
            long j2 = i25;
            t2 = t;
            unsafe.putInt(t2, j2, i23);
        } else {
            t2 = t;
        }
        for (int i39 = this.f120111h; i39 < this.f120112i; i39++) {
            int i40 = this.f120110g[i39];
            int i41 = this.f120104a[i40];
            Object m65316f = C38229at8.m65316f(t2, m2700D(i40) & 1048575);
            if (m65316f != null && m2698F(i40) != null) {
                C41101fi8 c41101fi8 = (C41101fi8) m65316f;
                C35896Sh8 c35896Sh8 = (C35896Sh8) m2696H(i40);
                throw null;
            }
        }
        if (i4 == 0) {
            if (i20 != i2) {
                throw zzew.m51576d();
            }
        } else if (i20 > i2 || i21 != i4) {
            throw zzew.m51576d();
        }
        return i20;
    }

    /* renamed from: u */
    public final <K, V> int m2675u(T t, byte[] bArr, int i, int i2, int i3, long j, C39532d38 c39532d38) throws IOException {
        Unsafe unsafe = f120103p;
        Object m2696H = m2696H(i3);
        Object object = unsafe.getObject(t, j);
        if (!((C41101fi8) object).m41002h()) {
            C41101fi8<K, V> m41005e = C41101fi8.m41006d().m41005e();
            C49995ui8.m9847a(m41005e, object);
            unsafe.putObject(t, j, m41005e);
        }
        C35896Sh8 c35896Sh8 = (C35896Sh8) m2696H;
        throw null;
    }

    /* renamed from: v */
    public final int m2674v(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C39532d38 c39532d38) throws IOException {
        boolean z;
        Object obj;
        Object obj2;
        Unsafe unsafe = f120103p;
        long j2 = this.f120104a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(C49018t38.m13170n(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(C49018t38.m13182b(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int m13171m = C49018t38.m13171m(bArr, i, c39532d38);
                    unsafe.putObject(t, j, Long.valueOf(c39532d38.f76083b));
                    unsafe.putInt(t, j2, i4);
                    return m13171m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m13174j = C49018t38.m13174j(bArr, i, c39532d38);
                    unsafe.putObject(t, j, Integer.valueOf(c39532d38.f76082a));
                    unsafe.putInt(t, j2, i4);
                    return m13174j;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(C49018t38.m13170n(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(C49018t38.m13182b(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m13171m2 = C49018t38.m13171m(bArr, i, c39532d38);
                    if (c39532d38.f76083b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(t, j, Boolean.valueOf(z));
                    unsafe.putInt(t, j2, i4);
                    return m13171m2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int m13174j2 = C49018t38.m13174j(bArr, i, c39532d38);
                    int i9 = c39532d38.f76082a;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !C35311Pu8.m89443d(bArr, m13174j2, m13174j2 + i9)) {
                        throw zzew.m51578b();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, m13174j2, i9, C41051fd8.f80380a));
                        m13174j2 += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return m13174j2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int m13180d = C49018t38.m13180d(m2697G(i8), bArr, i, i2, c39532d38);
                    if (unsafe.getInt(t, j2) == i4) {
                        obj = unsafe.getObject(t, j);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        unsafe.putObject(t, j, c39532d38.f76084c);
                    } else {
                        unsafe.putObject(t, j, C41051fd8.m41088g(obj, c39532d38.f76084c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return m13180d;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m13183a = C49018t38.m13183a(bArr, i, c39532d38);
                    unsafe.putObject(t, j, c39532d38.f76084c);
                    unsafe.putInt(t, j2, i4);
                    return m13183a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m13174j3 = C49018t38.m13174j(bArr, i, c39532d38);
                    int i10 = c39532d38.f76082a;
                    InterfaceC32341Dc8 m2698F = m2698F(i8);
                    if (m2698F != null && !m2698F.zza()) {
                        m2679q(t).m89696f(i3, Long.valueOf(i10));
                    } else {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        unsafe.putInt(t, j2, i4);
                    }
                    return m13174j3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int m13174j4 = C49018t38.m13174j(bArr, i, c39532d38);
                    unsafe.putObject(t, j, Integer.valueOf(C47883r88.m16436a(c39532d38.f76082a)));
                    unsafe.putInt(t, j2, i4);
                    return m13174j4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int m13171m3 = C49018t38.m13171m(bArr, i, c39532d38);
                    unsafe.putObject(t, j, Long.valueOf(C47883r88.m16435b(c39532d38.f76083b)));
                    unsafe.putInt(t, j2, i4);
                    return m13171m3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int m13181c = C49018t38.m13181c(m2697G(i8), bArr, i, i2, (i3 & (-8)) | 4, c39532d38);
                    if (unsafe.getInt(t, j2) == i4) {
                        obj2 = unsafe.getObject(t, j);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(t, j, c39532d38.f76084c);
                    } else {
                        unsafe.putObject(t, j, C41051fd8.m41088g(obj2, c39532d38.f76084c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return m13181c;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02a1, code lost:
        if (r0 != r15) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02a3, code lost:
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r2 = r18;
        r1 = r19;
        r6 = r23;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02b7, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02e8, code lost:
        if (r0 != r15) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x030b, code lost:
        if (r0 != r15) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2673w(T t, byte[] bArr, int i, int i2, C39532d38 c39532d38) throws IOException {
        byte b;
        int i3;
        int m2671y;
        int i4;
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int m13171m;
        int m13180d;
        int i10;
        int i11;
        int i12;
        C52386yk8<T> c52386yk8 = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i13 = i2;
        C39532d38 c39532d382 = c39532d38;
        Unsafe unsafe2 = f120103p;
        int i14 = 1048575;
        int i15 = -1;
        int i16 = i;
        int i17 = -1;
        int i18 = 1048575;
        int i19 = 0;
        int i20 = 0;
        while (i16 < i13) {
            int i21 = i16 + 1;
            byte b2 = bArr2[i16];
            if (b2 < 0) {
                i3 = C49018t38.m13173k(b2, bArr2, i21, c39532d382);
                b = c39532d382.f76082a;
            } else {
                b = b2;
                i3 = i21;
            }
            int i22 = b >>> 3;
            int i23 = b & 7;
            if (i22 > i17) {
                m2671y = c52386yk8.m2670z(i22, i19 / 3);
            } else {
                m2671y = c52386yk8.m2671y(i22);
            }
            int i24 = m2671y;
            if (i24 == i15) {
                i4 = i3;
                i5 = i22;
                i6 = i15;
                unsafe = unsafe2;
                i7 = 0;
            } else {
                int i25 = c52386yk8.f120104a[i24 + 1];
                int m2701C = m2701C(i25);
                long j = i25 & i14;
                if (m2701C <= 17) {
                    int i26 = c52386yk8.f120104a[i24 + 2];
                    int i27 = 1 << (i26 >>> 20);
                    i14 = 1048575;
                    int i28 = i26 & 1048575;
                    if (i28 != i18) {
                        if (i18 != 1048575) {
                            unsafe2.putInt(t2, i18, i20);
                            i14 = 1048575;
                        }
                        if (i28 != i14) {
                            i20 = unsafe2.getInt(t2, i28);
                        }
                        i18 = i28;
                    }
                    switch (m2701C) {
                        case 0:
                            i5 = i22;
                            c39532d382 = c39532d38;
                            i8 = i24;
                            i9 = i20;
                            if (i23 != 1) {
                                i20 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                C38229at8.m65310l(t2, j, Double.longBitsToDouble(C49018t38.m13170n(bArr2, i3)));
                                i16 = i3 + 8;
                                i20 = i9 | i27;
                                i19 = i8;
                                i17 = i5;
                                i15 = -1;
                                break;
                            }
                        case 1:
                            i5 = i22;
                            c39532d382 = c39532d38;
                            i9 = i20;
                            i8 = i24;
                            if (i23 != 5) {
                                i20 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                C38229at8.m65309m(t2, j, Float.intBitsToFloat(C49018t38.m13182b(bArr2, i3)));
                                i16 = i3 + 4;
                                i20 = i9 | i27;
                                i19 = i8;
                                i17 = i5;
                                i15 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i5 = i22;
                            c39532d382 = c39532d38;
                            i8 = i24;
                            i9 = i20;
                            if (i23 != 0) {
                                i20 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                m13171m = C49018t38.m13171m(bArr2, i3, c39532d382);
                                unsafe2.putLong(t, j, c39532d382.f76083b);
                                i20 = i9 | i27;
                                i19 = i8;
                                i16 = m13171m;
                                i17 = i5;
                                i15 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            i5 = i22;
                            c39532d382 = c39532d38;
                            i8 = i24;
                            i9 = i20;
                            if (i23 != 0) {
                                i20 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                i16 = C49018t38.m13174j(bArr2, i3, c39532d382);
                                unsafe2.putInt(t2, j, c39532d382.f76082a);
                                i20 = i9 | i27;
                                i19 = i8;
                                i17 = i5;
                                i15 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i5 = i22;
                            c39532d382 = c39532d38;
                            i8 = i24;
                            i9 = i20;
                            if (i23 != 1) {
                                i20 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                unsafe2.putLong(t, j, C49018t38.m13170n(bArr2, i3));
                                i16 = i3 + 8;
                                i20 = i9 | i27;
                                i19 = i8;
                                i17 = i5;
                                i15 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i5 = i22;
                            c39532d382 = c39532d38;
                            i9 = i20;
                            i8 = i24;
                            if (i23 != 5) {
                                i20 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                unsafe2.putInt(t2, j, C49018t38.m13182b(bArr2, i3));
                                i16 = i3 + 4;
                                i20 = i9 | i27;
                                i19 = i8;
                                i17 = i5;
                                i15 = -1;
                                break;
                            }
                        case 7:
                            i5 = i22;
                            c39532d382 = c39532d38;
                            i8 = i24;
                            boolean z = true;
                            i9 = i20;
                            if (i23 != 0) {
                                i20 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                int m13171m2 = C49018t38.m13171m(bArr2, i3, c39532d382);
                                if (c39532d382.f76083b == 0) {
                                    z = false;
                                }
                                C38229at8.m65311k(t2, j, z);
                                i20 = i9 | i27;
                                i16 = m13171m2;
                                i19 = i8;
                                i17 = i5;
                                i15 = -1;
                                break;
                            }
                        case 8:
                            i5 = i22;
                            c39532d382 = c39532d38;
                            i8 = i24;
                            i9 = i20;
                            if (i23 != 2) {
                                i20 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                if ((536870912 & i25) == 0) {
                                    i16 = C49018t38.m13177g(bArr2, i3, c39532d382);
                                } else {
                                    i16 = C49018t38.m13176h(bArr2, i3, c39532d382);
                                }
                                unsafe2.putObject(t2, j, c39532d382.f76084c);
                                i20 = i9 | i27;
                                i19 = i8;
                                i17 = i5;
                                i15 = -1;
                                break;
                            }
                        case 9:
                            i5 = i22;
                            c39532d382 = c39532d38;
                            i8 = i24;
                            if (i23 != 2) {
                                i9 = i20;
                                i20 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                m13180d = C49018t38.m13180d(c52386yk8.m2697G(i8), bArr2, i3, i13, c39532d382);
                                Object object = unsafe2.getObject(t2, j);
                                if (object == null) {
                                    unsafe2.putObject(t2, j, c39532d382.f76084c);
                                } else {
                                    unsafe2.putObject(t2, j, C41051fd8.m41088g(object, c39532d382.f76084c));
                                }
                                i20 |= i27;
                                i16 = m13180d;
                                i19 = i8;
                                i17 = i5;
                                i15 = -1;
                                break;
                            }
                        case 10:
                            i5 = i22;
                            c39532d382 = c39532d38;
                            i8 = i24;
                            if (i23 != 2) {
                                i9 = i20;
                                i20 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                m13180d = C49018t38.m13183a(bArr2, i3, c39532d382);
                                unsafe2.putObject(t2, j, c39532d382.f76084c);
                                i20 |= i27;
                                i16 = m13180d;
                                i19 = i8;
                                i17 = i5;
                                i15 = -1;
                                break;
                            }
                        case 12:
                            i5 = i22;
                            c39532d382 = c39532d38;
                            i8 = i24;
                            if (i23 != 0) {
                                i9 = i20;
                                i20 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                m13180d = C49018t38.m13174j(bArr2, i3, c39532d382);
                                unsafe2.putInt(t2, j, c39532d382.f76082a);
                                i20 |= i27;
                                i16 = m13180d;
                                i19 = i8;
                                i17 = i5;
                                i15 = -1;
                                break;
                            }
                        case 15:
                            i5 = i22;
                            c39532d382 = c39532d38;
                            i8 = i24;
                            if (i23 != 0) {
                                i9 = i20;
                                i20 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                i16 = C49018t38.m13174j(bArr2, i3, c39532d382);
                                unsafe2.putInt(t2, j, C47883r88.m16436a(c39532d382.f76082a));
                                i20 |= i27;
                                i19 = i8;
                                i17 = i5;
                                i15 = -1;
                                break;
                            }
                        case 16:
                            if (i23 != 0) {
                                i5 = i22;
                                i8 = i24;
                                i9 = i20;
                                i20 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                c39532d382 = c39532d38;
                                m13171m = C49018t38.m13171m(bArr2, i3, c39532d382);
                                i8 = i24;
                                i5 = i22;
                                unsafe2.putLong(t, j, C47883r88.m16435b(c39532d382.f76083b));
                                i20 |= i27;
                                i19 = i8;
                                i16 = m13171m;
                                i17 = i5;
                                i15 = -1;
                                break;
                            }
                        default:
                            i5 = i22;
                            i8 = i24;
                            i9 = i20;
                            i20 = i9;
                            i4 = i3;
                            i7 = i8;
                            unsafe = unsafe2;
                            i6 = -1;
                            break;
                    }
                } else {
                    i5 = i22;
                    int i29 = i20;
                    i14 = 1048575;
                    c39532d382 = c39532d38;
                    if (m2701C == 27) {
                        if (i23 == 2) {
                            InterfaceC35383Qc8 interfaceC35383Qc8 = (InterfaceC35383Qc8) unsafe2.getObject(t2, j);
                            if (!interfaceC35383Qc8.zzc()) {
                                int size = interfaceC35383Qc8.size();
                                interfaceC35383Qc8 = interfaceC35383Qc8.mo41068d(size == 0 ? 10 : size + size);
                                unsafe2.putObject(t2, j, interfaceC35383Qc8);
                            }
                            i16 = C49018t38.m13179e(c52386yk8.m2697G(i24), b, bArr, i3, i2, interfaceC35383Qc8, c39532d38);
                            i19 = i24;
                            i20 = i29;
                            i17 = i5;
                            i15 = -1;
                            c52386yk8 = this;
                        } else {
                            i12 = i3;
                            i10 = i18;
                            i7 = i24;
                            unsafe = unsafe2;
                            i11 = i29;
                            i6 = -1;
                        }
                    } else if (m2701C <= 49) {
                        i11 = i29;
                        int i30 = i3;
                        i10 = i18;
                        i7 = i24;
                        i6 = -1;
                        unsafe = unsafe2;
                        i16 = m2672x(t, bArr, i3, i2, b, i5, i23, i24, i25, m2701C, j, c39532d38);
                    } else {
                        i10 = i18;
                        i7 = i24;
                        unsafe = unsafe2;
                        i11 = i29;
                        i6 = -1;
                        i12 = i3;
                        if (m2701C != 50) {
                            i16 = m2674v(t, bArr, i12, i2, b, i5, i23, i25, m2701C, j, i7, c39532d38);
                        } else if (i23 == 2) {
                            i16 = m2675u(t, bArr, i12, i2, i7, j, c39532d38);
                        }
                    }
                    i4 = i12;
                    i20 = i11;
                    i18 = i10;
                }
                i15 = i6;
                unsafe2 = unsafe;
                i14 = 1048575;
            }
            i16 = C49018t38.m13175i(b, bArr, i4, i2, m2679q(t), c39532d38);
            c52386yk8 = this;
            t2 = t;
            bArr2 = bArr;
            i13 = i2;
            c39532d382 = c39532d38;
            i19 = i7;
            i17 = i5;
            i15 = i6;
            unsafe2 = unsafe;
            i14 = 1048575;
        }
        int i31 = i20;
        Unsafe unsafe3 = unsafe2;
        if (i18 != i14) {
            unsafe3.putInt(t, i18, i31);
        }
        if (i16 == i2) {
            return i16;
        }
        throw zzew.m51576d();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021a -> B:120:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:67:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cc -> B:100:0x01cd). Please submit an issue!!! */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2672x(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C39532d38 c39532d38) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        int m13174j;
        boolean z3;
        int i12;
        int i13;
        int i14 = i;
        Unsafe unsafe = f120103p;
        InterfaceC35383Qc8 interfaceC35383Qc8 = (InterfaceC35383Qc8) unsafe.getObject(t, j2);
        if (!interfaceC35383Qc8.zzc()) {
            int size = interfaceC35383Qc8.size();
            if (size == 0) {
                i13 = 10;
            } else {
                i13 = size + size;
            }
            interfaceC35383Qc8 = interfaceC35383Qc8.mo41068d(i13);
            unsafe.putObject(t, j2, interfaceC35383Qc8);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    G88 g88 = (G88) interfaceC35383Qc8;
                    int m13174j2 = C49018t38.m13174j(bArr, i14, c39532d38);
                    int i15 = c39532d38.f76082a + m13174j2;
                    while (m13174j2 < i15) {
                        g88.m105704b(Double.longBitsToDouble(C49018t38.m13170n(bArr, m13174j2)));
                        m13174j2 += 8;
                    }
                    if (m13174j2 != i15) {
                        throw zzew.m51574f();
                    }
                    return m13174j2;
                }
                if (i5 == 1) {
                    G88 g882 = (G88) interfaceC35383Qc8;
                    g882.m105704b(Double.longBitsToDouble(C49018t38.m13170n(bArr, i)));
                    while (true) {
                        i8 = i14 + 8;
                        if (i8 < i2) {
                            i14 = C49018t38.m13174j(bArr, i8, c39532d38);
                            if (i3 == c39532d38.f76082a) {
                                g882.m105704b(Double.longBitsToDouble(C49018t38.m13170n(bArr, i14)));
                            }
                        }
                    }
                    return i8;
                }
                return i14;
            case 19:
            case 36:
                if (i5 == 2) {
                    C34195La8 c34195La8 = (C34195La8) interfaceC35383Qc8;
                    int m13174j3 = C49018t38.m13174j(bArr, i14, c39532d38);
                    int i16 = c39532d38.f76082a + m13174j3;
                    while (m13174j3 < i16) {
                        c34195La8.m96614b(Float.intBitsToFloat(C49018t38.m13182b(bArr, m13174j3)));
                        m13174j3 += 4;
                    }
                    if (m13174j3 != i16) {
                        throw zzew.m51574f();
                    }
                    return m13174j3;
                }
                if (i5 == 5) {
                    C34195La8 c34195La82 = (C34195La8) interfaceC35383Qc8;
                    c34195La82.m96614b(Float.intBitsToFloat(C49018t38.m13182b(bArr, i)));
                    while (true) {
                        i9 = i14 + 4;
                        if (i9 < i2) {
                            i14 = C49018t38.m13174j(bArr, i9, c39532d38);
                            if (i3 == c39532d38.f76082a) {
                                c34195La82.m96614b(Float.intBitsToFloat(C49018t38.m13182b(bArr, i14)));
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
                    C34015Kg8 c34015Kg8 = (C34015Kg8) interfaceC35383Qc8;
                    int m13174j4 = C49018t38.m13174j(bArr, i14, c39532d38);
                    int i17 = c39532d38.f76082a + m13174j4;
                    while (m13174j4 < i17) {
                        m13174j4 = C49018t38.m13171m(bArr, m13174j4, c39532d38);
                        c34015Kg8.m98519b(c39532d38.f76083b);
                    }
                    if (m13174j4 != i17) {
                        throw zzew.m51574f();
                    }
                    return m13174j4;
                }
                if (i5 == 0) {
                    C34015Kg8 c34015Kg82 = (C34015Kg8) interfaceC35383Qc8;
                    int m13171m = C49018t38.m13171m(bArr, i14, c39532d38);
                    c34015Kg82.m98519b(c39532d38.f76083b);
                    while (m13171m < i2) {
                        int m13174j5 = C49018t38.m13174j(bArr, m13171m, c39532d38);
                        if (i3 == c39532d38.f76082a) {
                            m13171m = C49018t38.m13171m(bArr, m13174j5, c39532d38);
                            c34015Kg82.m98519b(c39532d38.f76083b);
                        } else {
                            return m13171m;
                        }
                    }
                    return m13171m;
                }
                return i14;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C49018t38.m13178f(bArr, i14, interfaceC35383Qc8, c39532d38);
                }
                if (i5 == 0) {
                    return C49018t38.m13172l(i3, bArr, i, i2, interfaceC35383Qc8, c39532d38);
                }
                return i14;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    C34015Kg8 c34015Kg83 = (C34015Kg8) interfaceC35383Qc8;
                    int m13174j6 = C49018t38.m13174j(bArr, i14, c39532d38);
                    int i18 = c39532d38.f76082a + m13174j6;
                    while (m13174j6 < i18) {
                        c34015Kg83.m98519b(C49018t38.m13170n(bArr, m13174j6));
                        m13174j6 += 8;
                    }
                    if (m13174j6 != i18) {
                        throw zzew.m51574f();
                    }
                    return m13174j6;
                }
                if (i5 == 1) {
                    C34015Kg8 c34015Kg84 = (C34015Kg8) interfaceC35383Qc8;
                    c34015Kg84.m98519b(C49018t38.m13170n(bArr, i));
                    while (true) {
                        i10 = i14 + 8;
                        if (i10 < i2) {
                            i14 = C49018t38.m13174j(bArr, i10, c39532d38);
                            if (i3 == c39532d38.f76082a) {
                                c34015Kg84.m98519b(C49018t38.m13170n(bArr, i14));
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
                    C39856dc8 c39856dc8 = (C39856dc8) interfaceC35383Qc8;
                    int m13174j7 = C49018t38.m13174j(bArr, i14, c39532d38);
                    int i19 = c39532d38.f76082a + m13174j7;
                    while (m13174j7 < i19) {
                        c39856dc8.m44016b(C49018t38.m13182b(bArr, m13174j7));
                        m13174j7 += 4;
                    }
                    if (m13174j7 != i19) {
                        throw zzew.m51574f();
                    }
                    return m13174j7;
                }
                if (i5 == 5) {
                    C39856dc8 c39856dc82 = (C39856dc8) interfaceC35383Qc8;
                    c39856dc82.m44016b(C49018t38.m13182b(bArr, i));
                    while (true) {
                        i11 = i14 + 4;
                        if (i11 < i2) {
                            i14 = C49018t38.m13174j(bArr, i11, c39532d38);
                            if (i3 == c39532d38.f76082a) {
                                c39856dc82.m44016b(C49018t38.m13182b(bArr, i14));
                            }
                        }
                    }
                    return i11;
                }
                return i14;
            case 25:
            case 42:
                if (i5 == 2) {
                    H38 h38 = (H38) interfaceC35383Qc8;
                    m13174j = C49018t38.m13174j(bArr, i14, c39532d38);
                    int i20 = c39532d38.f76082a + m13174j;
                    while (m13174j < i20) {
                        m13174j = C49018t38.m13171m(bArr, m13174j, c39532d38);
                        if (c39532d38.f76083b != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        h38.m104459b(z3);
                    }
                    if (m13174j != i20) {
                        throw zzew.m51574f();
                    }
                    return m13174j;
                }
                if (i5 == 0) {
                    H38 h382 = (H38) interfaceC35383Qc8;
                    int m13171m2 = C49018t38.m13171m(bArr, i14, c39532d38);
                    if (c39532d38.f76083b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    h382.m104459b(z);
                    while (m13171m2 < i2) {
                        int m13174j8 = C49018t38.m13174j(bArr, m13171m2, c39532d38);
                        if (i3 == c39532d38.f76082a) {
                            m13171m2 = C49018t38.m13171m(bArr, m13174j8, c39532d38);
                            if (c39532d38.f76083b != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            h382.m104459b(z2);
                        } else {
                            return m13171m2;
                        }
                    }
                    return m13171m2;
                }
                return i14;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int m13174j9 = C49018t38.m13174j(bArr, i14, c39532d38);
                        int i21 = c39532d38.f76082a;
                        if (i21 >= 0) {
                            if (i21 == 0) {
                                interfaceC35383Qc8.add("");
                                while (m13174j9 < i2) {
                                    int m13174j10 = C49018t38.m13174j(bArr, m13174j9, c39532d38);
                                    if (i3 == c39532d38.f76082a) {
                                        m13174j9 = C49018t38.m13174j(bArr, m13174j10, c39532d38);
                                        i21 = c39532d38.f76082a;
                                        if (i21 >= 0) {
                                            if (i21 == 0) {
                                                interfaceC35383Qc8.add("");
                                            } else {
                                                interfaceC35383Qc8.add(new String(bArr, m13174j9, i21, C41051fd8.f80380a));
                                                m13174j9 += i21;
                                                while (m13174j9 < i2) {
                                                }
                                            }
                                        } else {
                                            throw zzew.m51577c();
                                        }
                                    } else {
                                        return m13174j9;
                                    }
                                }
                                return m13174j9;
                            }
                            interfaceC35383Qc8.add(new String(bArr, m13174j9, i21, C41051fd8.f80380a));
                            m13174j9 += i21;
                            while (m13174j9 < i2) {
                            }
                            return m13174j9;
                        }
                        throw zzew.m51577c();
                    }
                    int m13174j11 = C49018t38.m13174j(bArr, i14, c39532d38);
                    int i22 = c39532d38.f76082a;
                    if (i22 >= 0) {
                        if (i22 == 0) {
                            interfaceC35383Qc8.add("");
                            while (m13174j11 < i2) {
                                int m13174j12 = C49018t38.m13174j(bArr, m13174j11, c39532d38);
                                if (i3 == c39532d38.f76082a) {
                                    m13174j11 = C49018t38.m13174j(bArr, m13174j12, c39532d38);
                                    int i23 = c39532d38.f76082a;
                                    if (i23 >= 0) {
                                        if (i23 == 0) {
                                            interfaceC35383Qc8.add("");
                                        } else {
                                            i12 = m13174j11 + i23;
                                            if (C35311Pu8.m89443d(bArr, m13174j11, i12)) {
                                                interfaceC35383Qc8.add(new String(bArr, m13174j11, i23, C41051fd8.f80380a));
                                                m13174j11 = i12;
                                                while (m13174j11 < i2) {
                                                }
                                            } else {
                                                throw zzew.m51578b();
                                            }
                                        }
                                    } else {
                                        throw zzew.m51577c();
                                    }
                                } else {
                                    return m13174j11;
                                }
                            }
                            return m13174j11;
                        }
                        i12 = m13174j11 + i22;
                        if (C35311Pu8.m89443d(bArr, m13174j11, i12)) {
                            interfaceC35383Qc8.add(new String(bArr, m13174j11, i22, C41051fd8.f80380a));
                            m13174j11 = i12;
                            while (m13174j11 < i2) {
                            }
                            return m13174j11;
                        }
                        throw zzew.m51578b();
                    }
                    throw zzew.m51577c();
                }
                return i14;
            case 27:
                if (i5 == 2) {
                    return C49018t38.m13179e(m2697G(i6), i3, bArr, i, i2, interfaceC35383Qc8, c39532d38);
                }
                return i14;
            case 28:
                if (i5 == 2) {
                    int m13174j13 = C49018t38.m13174j(bArr, i14, c39532d38);
                    int i24 = c39532d38.f76082a;
                    if (i24 >= 0) {
                        if (i24 <= bArr.length - m13174j13) {
                            if (i24 == 0) {
                                interfaceC35383Qc8.add(AbstractC50836w78.f115390c);
                                while (m13174j13 < i2) {
                                    int m13174j14 = C49018t38.m13174j(bArr, m13174j13, c39532d38);
                                    if (i3 == c39532d38.f76082a) {
                                        m13174j13 = C49018t38.m13174j(bArr, m13174j14, c39532d38);
                                        i24 = c39532d38.f76082a;
                                        if (i24 >= 0) {
                                            if (i24 <= bArr.length - m13174j13) {
                                                if (i24 == 0) {
                                                    interfaceC35383Qc8.add(AbstractC50836w78.f115390c);
                                                } else {
                                                    interfaceC35383Qc8.add(AbstractC50836w78.m7377u(bArr, m13174j13, i24));
                                                    m13174j13 += i24;
                                                    while (m13174j13 < i2) {
                                                    }
                                                }
                                            } else {
                                                throw zzew.m51574f();
                                            }
                                        } else {
                                            throw zzew.m51577c();
                                        }
                                    } else {
                                        return m13174j13;
                                    }
                                }
                                return m13174j13;
                            }
                            interfaceC35383Qc8.add(AbstractC50836w78.m7377u(bArr, m13174j13, i24));
                            m13174j13 += i24;
                            while (m13174j13 < i2) {
                            }
                            return m13174j13;
                        }
                        throw zzew.m51574f();
                    }
                    throw zzew.m51577c();
                }
                return i14;
            case 30:
            case 44:
                if (i5 == 2) {
                    m13174j = C49018t38.m13178f(bArr, i14, interfaceC35383Qc8, c39532d38);
                } else {
                    if (i5 == 0) {
                        m13174j = C49018t38.m13172l(i3, bArr, i, i2, interfaceC35383Qc8, c39532d38);
                    }
                    return i14;
                }
                AbstractC35140Pb8 abstractC35140Pb8 = (AbstractC35140Pb8) t;
                C35275Pq8 c35275Pq8 = abstractC35140Pb8.zzc;
                if (c35275Pq8 == C35275Pq8.m89701a()) {
                    c35275Pq8 = null;
                }
                Object m96342d = C34312Ln8.m96342d(i4, interfaceC35383Qc8, m2698F(i6), c35275Pq8, this.f120114k);
                if (m96342d != null) {
                    abstractC35140Pb8.zzc = (C35275Pq8) m96342d;
                    return m13174j;
                }
                return m13174j;
            case 33:
            case 47:
                if (i5 == 2) {
                    C39856dc8 c39856dc83 = (C39856dc8) interfaceC35383Qc8;
                    int m13174j15 = C49018t38.m13174j(bArr, i14, c39532d38);
                    int i25 = c39532d38.f76082a + m13174j15;
                    while (m13174j15 < i25) {
                        m13174j15 = C49018t38.m13174j(bArr, m13174j15, c39532d38);
                        c39856dc83.m44016b(C47883r88.m16436a(c39532d38.f76082a));
                    }
                    if (m13174j15 != i25) {
                        throw zzew.m51574f();
                    }
                    return m13174j15;
                }
                if (i5 == 0) {
                    C39856dc8 c39856dc84 = (C39856dc8) interfaceC35383Qc8;
                    int m13174j16 = C49018t38.m13174j(bArr, i14, c39532d38);
                    c39856dc84.m44016b(C47883r88.m16436a(c39532d38.f76082a));
                    while (m13174j16 < i2) {
                        int m13174j17 = C49018t38.m13174j(bArr, m13174j16, c39532d38);
                        if (i3 == c39532d38.f76082a) {
                            m13174j16 = C49018t38.m13174j(bArr, m13174j17, c39532d38);
                            c39856dc84.m44016b(C47883r88.m16436a(c39532d38.f76082a));
                        } else {
                            return m13174j16;
                        }
                    }
                    return m13174j16;
                }
                return i14;
            case 34:
            case 48:
                if (i5 == 2) {
                    C34015Kg8 c34015Kg85 = (C34015Kg8) interfaceC35383Qc8;
                    int m13174j18 = C49018t38.m13174j(bArr, i14, c39532d38);
                    int i26 = c39532d38.f76082a + m13174j18;
                    while (m13174j18 < i26) {
                        m13174j18 = C49018t38.m13171m(bArr, m13174j18, c39532d38);
                        c34015Kg85.m98519b(C47883r88.m16435b(c39532d38.f76083b));
                    }
                    if (m13174j18 != i26) {
                        throw zzew.m51574f();
                    }
                    return m13174j18;
                }
                if (i5 == 0) {
                    C34015Kg8 c34015Kg86 = (C34015Kg8) interfaceC35383Qc8;
                    int m13171m3 = C49018t38.m13171m(bArr, i14, c39532d38);
                    c34015Kg86.m98519b(C47883r88.m16435b(c39532d38.f76083b));
                    while (m13171m3 < i2) {
                        int m13174j19 = C49018t38.m13174j(bArr, m13171m3, c39532d38);
                        if (i3 == c39532d38.f76082a) {
                            m13171m3 = C49018t38.m13171m(bArr, m13174j19, c39532d38);
                            c34015Kg86.m98519b(C47883r88.m16435b(c39532d38.f76083b));
                        } else {
                            return m13171m3;
                        }
                    }
                    return m13171m3;
                }
                return i14;
            default:
                if (i5 == 3) {
                    InterfaceC45895nn8 m2697G = m2697G(i6);
                    int i27 = (i3 & (-8)) | 4;
                    int m13181c = C49018t38.m13181c(m2697G, bArr, i, i2, i27, c39532d38);
                    interfaceC35383Qc8.add(c39532d38.f76084c);
                    while (m13181c < i2) {
                        int m13174j20 = C49018t38.m13174j(bArr, m13181c, c39532d38);
                        if (i3 == c39532d38.f76082a) {
                            m13181c = C49018t38.m13181c(m2697G, bArr, m13174j20, i2, i27, c39532d38);
                            interfaceC35383Qc8.add(c39532d38.f76084c);
                        } else {
                            return m13181c;
                        }
                    }
                    return m13181c;
                }
                return i14;
        }
    }

    /* renamed from: y */
    public final int m2671y(int i) {
        if (i >= this.f120106c && i <= this.f120107d) {
            return m2702B(i, 0);
        }
        return -1;
    }

    /* renamed from: z */
    public final int m2670z(int i, int i2) {
        if (i >= this.f120106c && i <= this.f120107d) {
            return m2702B(i, i2);
        }
        return -1;
    }

    @Override // p000.InterfaceC45895nn8
    public final int zza(T t) {
        int i;
        int m41092c;
        int length = this.f120104a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m2700D = m2700D(i3);
            int i4 = this.f120104a[i3];
            long j = 1048575 & m2700D;
            int i5 = 37;
            switch (m2701C(m2700D)) {
                case 0:
                    i = i2 * 53;
                    m41092c = C41051fd8.m41092c(Double.doubleToLongBits(C38229at8.m65321a(t, j)));
                    i2 = i + m41092c;
                    break;
                case 1:
                    i = i2 * 53;
                    m41092c = Float.floatToIntBits(C38229at8.m65320b(t, j));
                    i2 = i + m41092c;
                    break;
                case 2:
                    i = i2 * 53;
                    m41092c = C41051fd8.m41092c(C38229at8.m65318d(t, j));
                    i2 = i + m41092c;
                    break;
                case 3:
                    i = i2 * 53;
                    m41092c = C41051fd8.m41092c(C38229at8.m65318d(t, j));
                    i2 = i + m41092c;
                    break;
                case 4:
                    i = i2 * 53;
                    m41092c = C38229at8.m65319c(t, j);
                    i2 = i + m41092c;
                    break;
                case 5:
                    i = i2 * 53;
                    m41092c = C41051fd8.m41092c(C38229at8.m65318d(t, j));
                    i2 = i + m41092c;
                    break;
                case 6:
                    i = i2 * 53;
                    m41092c = C38229at8.m65319c(t, j);
                    i2 = i + m41092c;
                    break;
                case 7:
                    i = i2 * 53;
                    m41092c = C41051fd8.m41094a(C38229at8.m65302t(t, j));
                    i2 = i + m41092c;
                    break;
                case 8:
                    i = i2 * 53;
                    m41092c = ((String) C38229at8.m65316f(t, j)).hashCode();
                    i2 = i + m41092c;
                    break;
                case 9:
                    Object m65316f = C38229at8.m65316f(t, j);
                    if (m65316f != null) {
                        i5 = m65316f.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    m41092c = C38229at8.m65316f(t, j).hashCode();
                    i2 = i + m41092c;
                    break;
                case 11:
                    i = i2 * 53;
                    m41092c = C38229at8.m65319c(t, j);
                    i2 = i + m41092c;
                    break;
                case 12:
                    i = i2 * 53;
                    m41092c = C38229at8.m65319c(t, j);
                    i2 = i + m41092c;
                    break;
                case 13:
                    i = i2 * 53;
                    m41092c = C38229at8.m65319c(t, j);
                    i2 = i + m41092c;
                    break;
                case 14:
                    i = i2 * 53;
                    m41092c = C41051fd8.m41092c(C38229at8.m65318d(t, j));
                    i2 = i + m41092c;
                    break;
                case 15:
                    i = i2 * 53;
                    m41092c = C38229at8.m65319c(t, j);
                    i2 = i + m41092c;
                    break;
                case 16:
                    i = i2 * 53;
                    m41092c = C41051fd8.m41092c(C38229at8.m65318d(t, j));
                    i2 = i + m41092c;
                    break;
                case 17:
                    Object m65316f2 = C38229at8.m65316f(t, j);
                    if (m65316f2 != null) {
                        i5 = m65316f2.hashCode();
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
                    m41092c = C38229at8.m65316f(t, j).hashCode();
                    i2 = i + m41092c;
                    break;
                case 50:
                    i = i2 * 53;
                    m41092c = C38229at8.m65316f(t, j).hashCode();
                    i2 = i + m41092c;
                    break;
                case 51:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = C41051fd8.m41092c(Double.doubleToLongBits(((Double) C38229at8.m65316f(t, j)).doubleValue()));
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = Float.floatToIntBits(((Float) C38229at8.m65316f(t, j)).floatValue());
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = C41051fd8.m41092c(m2699E(t, j));
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = C41051fd8.m41092c(m2699E(t, j));
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = m2676t(t, j);
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = C41051fd8.m41092c(m2699E(t, j));
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = m2676t(t, j);
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = C41051fd8.m41094a(((Boolean) C38229at8.m65316f(t, j)).booleanValue());
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = ((String) C38229at8.m65316f(t, j)).hashCode();
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = C38229at8.m65316f(t, j).hashCode();
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = C38229at8.m65316f(t, j).hashCode();
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = m2676t(t, j);
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = m2676t(t, j);
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = m2676t(t, j);
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = C41051fd8.m41092c(m2699E(t, j));
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = m2676t(t, j);
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = C41051fd8.m41092c(m2699E(t, j));
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m2681o(t, i4, i3)) {
                        i = i2 * 53;
                        m41092c = C38229at8.m65316f(t, j).hashCode();
                        i2 = i + m41092c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i2 * 53) + this.f120114k.mo43589a(t).hashCode();
    }

    @Override // p000.InterfaceC45895nn8
    public final T zzd() {
        return (T) ((AbstractC35140Pb8) this.f120108e).mo42375h(4, null, null);
    }
}
