package com.google.protobuf;

import com.google.protobuf.AbstractC18504e;
import com.google.protobuf.C18489P;
import com.google.protobuf.C18531o;
import com.google.protobuf.C18544t;
import com.google.protobuf.C18565z;
import com.google.protobuf.InterfaceC18497Q;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;
/* renamed from: com.google.protobuf.F */
/* loaded from: classes6.dex */
public final class C18465F<T> implements InterfaceC33832Jm5<T> {

    /* renamed from: r */
    public static final int[] f74692r = new int[0];

    /* renamed from: s */
    public static final Unsafe f74693s = C52324ye6.m3104D();

    /* renamed from: a */
    public final int[] f74694a;

    /* renamed from: b */
    public final Object[] f74695b;

    /* renamed from: c */
    public final int f74696c;

    /* renamed from: d */
    public final int f74697d;

    /* renamed from: e */
    public final InterfaceC18462D f74698e;

    /* renamed from: f */
    public final boolean f74699f;

    /* renamed from: g */
    public final boolean f74700g;

    /* renamed from: h */
    public final boolean f74701h;

    /* renamed from: i */
    public final boolean f74702i;

    /* renamed from: j */
    public final int[] f74703j;

    /* renamed from: k */
    public final int f74704k;

    /* renamed from: l */
    public final int f74705l;

    /* renamed from: m */
    public final Y73 f74706m;

    /* renamed from: n */
    public final AbstractC18560x f74707n;

    /* renamed from: o */
    public final AbstractC18480L<?, ?> f74708o;

    /* renamed from: p */
    public final AbstractC18527l<?> f74709p;

    /* renamed from: q */
    public final InterfaceC18458B f74710q;

    public C18465F(int[] iArr, Object[] objArr, int i, int i2, InterfaceC18462D interfaceC18462D, boolean z, boolean z2, int[] iArr2, int i3, int i4, Y73 y73, AbstractC18560x abstractC18560x, AbstractC18480L<?, ?> abstractC18480L, AbstractC18527l<?> abstractC18527l, InterfaceC18458B interfaceC18458B) {
        boolean z3;
        this.f74694a = iArr;
        this.f74695b = objArr;
        this.f74696c = i;
        this.f74697d = i2;
        this.f74700g = interfaceC18462D instanceof AbstractC18536r;
        this.f74701h = z;
        if (abstractC18527l != null && abstractC18527l.mo46116e(interfaceC18462D)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f74699f = z3;
        this.f74702i = z2;
        this.f74703j = iArr2;
        this.f74704k = i3;
        this.f74705l = i4;
        this.f74706m = y73;
        this.f74707n = abstractC18560x;
        this.f74708o = abstractC18480L;
        this.f74709p = abstractC18527l;
        this.f74698e = interfaceC18462D;
        this.f74710q = interfaceC18458B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public static boolean m46620B(Object obj, int i, InterfaceC33832Jm5 interfaceC33832Jm5) {
        return interfaceC33832Jm5.mo46552f(C52324ye6.m3105C(obj, m46600V(i)));
    }

    /* renamed from: E */
    public static boolean m46617E(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC18536r) {
            return ((AbstractC18536r) obj).m46063H();
        }
        return true;
    }

    /* renamed from: H */
    public static boolean m46614H(int i) {
        return (i & 268435456) != 0;
    }

    /* renamed from: I */
    public static List<?> m46613I(Object obj, long j) {
        return (List) C52324ye6.m3105C(obj, j);
    }

    /* renamed from: J */
    public static <T> long m46612J(T t, long j) {
        return C52324ye6.m3107A(t, j);
    }

    /* renamed from: R */
    public static <T> C18465F<T> m46604R(Class<T> cls, InterfaceC47475qT2 interfaceC47475qT2, Y73 y73, AbstractC18560x abstractC18560x, AbstractC18480L<?, ?> abstractC18480L, AbstractC18527l<?> abstractC18527l, InterfaceC18458B interfaceC18458B) {
        if (interfaceC47475qT2 instanceof C48263rn4) {
            return m46602T((C48263rn4) interfaceC47475qT2, y73, abstractC18560x, abstractC18480L, abstractC18527l, interfaceC18458B);
        }
        return m46603S((PS5) interfaceC47475qT2, y73, abstractC18560x, abstractC18480L, abstractC18527l, interfaceC18458B);
    }

    /* renamed from: S */
    public static <T> C18465F<T> m46603S(PS5 ps5, Y73 y73, AbstractC18560x abstractC18560x, AbstractC18480L<?, ?> abstractC18480L, AbstractC18527l<?> abstractC18527l, InterfaceC18458B interfaceC18458B) {
        boolean z;
        if (ps5.mo15389c() == I94.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        C18530n[] m90219e = ps5.m90219e();
        if (m90219e.length == 0) {
            int length = m90219e.length;
            int[] iArr = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            if (m90219e.length <= 0) {
                int[] m90220d = ps5.m90220d();
                if (m90220d == null) {
                    m90220d = f74692r;
                }
                if (m90219e.length <= 0) {
                    int[] iArr2 = f74692r;
                    int[] iArr3 = f74692r;
                    int[] iArr4 = new int[m90220d.length + iArr2.length + iArr3.length];
                    System.arraycopy(m90220d, 0, iArr4, 0, m90220d.length);
                    System.arraycopy(iArr2, 0, iArr4, m90220d.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, m90220d.length + iArr2.length, iArr3.length);
                    return new C18465F<>(iArr, objArr, 0, 0, ps5.mo15390b(), z, true, iArr4, m90220d.length, m90220d.length + iArr2.length, y73, abstractC18560x, abstractC18480L, abstractC18527l, interfaceC18458B);
                }
                C18530n c18530n = m90219e[0];
                throw null;
            }
            C18530n c18530n2 = m90219e[0];
            throw null;
        }
        C18530n c18530n3 = m90219e[0];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x037a  */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> C18465F<T> m46602T(C48263rn4 c48263rn4, Y73 y73, AbstractC18560x abstractC18560x, AbstractC18480L<?, ?> abstractC18480L, AbstractC18527l<?> abstractC18527l, InterfaceC18458B interfaceC18458B) {
        boolean z;
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int charAt5;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        char charAt6;
        int i5;
        char charAt7;
        int i6;
        char charAt8;
        int i7;
        char charAt9;
        int i8;
        char charAt10;
        int i9;
        char charAt11;
        int i10;
        char charAt12;
        int i11;
        char charAt13;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z2;
        int i17;
        int objectFieldOffset;
        boolean z3;
        String str;
        boolean z4;
        int i18;
        int i19;
        int i20;
        Field m46587h0;
        char charAt14;
        int i21;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field m46587h02;
        Object obj2;
        Field m46587h03;
        int i25;
        char charAt15;
        int i26;
        char charAt16;
        int i27;
        char charAt17;
        int i28;
        char charAt18;
        if (c48263rn4.mo15389c() == I94.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        String m15387e = c48263rn4.m15387e();
        int length = m15387e.length();
        char c = 55296;
        if (m15387e.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i = i29 + 1;
                if (m15387e.charAt(i29) < 55296) {
                    break;
                }
                i29 = i;
            }
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int charAt19 = m15387e.charAt(i);
        if (charAt19 >= 55296) {
            int i31 = charAt19 & 8191;
            int i32 = 13;
            while (true) {
                i28 = i30 + 1;
                charAt18 = m15387e.charAt(i30);
                if (charAt18 < 55296) {
                    break;
                }
                i31 |= (charAt18 & 8191) << i32;
                i32 += 13;
                i30 = i28;
            }
            charAt19 = i31 | (charAt18 << i32);
            i30 = i28;
        }
        if (charAt19 == 0) {
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            charAt4 = 0;
            charAt5 = 0;
            i2 = 0;
            iArr = f74692r;
            i3 = 0;
        } else {
            int i33 = i30 + 1;
            int charAt20 = m15387e.charAt(i30);
            if (charAt20 >= 55296) {
                int i34 = charAt20 & 8191;
                int i35 = 13;
                while (true) {
                    i11 = i33 + 1;
                    charAt13 = m15387e.charAt(i33);
                    if (charAt13 < 55296) {
                        break;
                    }
                    i34 |= (charAt13 & 8191) << i35;
                    i35 += 13;
                    i33 = i11;
                }
                charAt20 = i34 | (charAt13 << i35);
                i33 = i11;
            }
            int i36 = i33 + 1;
            int charAt21 = m15387e.charAt(i33);
            if (charAt21 >= 55296) {
                int i37 = charAt21 & 8191;
                int i38 = 13;
                while (true) {
                    i10 = i36 + 1;
                    charAt12 = m15387e.charAt(i36);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i37 |= (charAt12 & 8191) << i38;
                    i38 += 13;
                    i36 = i10;
                }
                charAt21 = i37 | (charAt12 << i38);
                i36 = i10;
            }
            int i39 = i36 + 1;
            charAt = m15387e.charAt(i36);
            if (charAt >= 55296) {
                int i40 = charAt & 8191;
                int i41 = 13;
                while (true) {
                    i9 = i39 + 1;
                    charAt11 = m15387e.charAt(i39);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i40 |= (charAt11 & 8191) << i41;
                    i41 += 13;
                    i39 = i9;
                }
                charAt = i40 | (charAt11 << i41);
                i39 = i9;
            }
            int i42 = i39 + 1;
            charAt2 = m15387e.charAt(i39);
            if (charAt2 >= 55296) {
                int i43 = charAt2 & 8191;
                int i44 = 13;
                while (true) {
                    i8 = i42 + 1;
                    charAt10 = m15387e.charAt(i42);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i43 |= (charAt10 & 8191) << i44;
                    i44 += 13;
                    i42 = i8;
                }
                charAt2 = i43 | (charAt10 << i44);
                i42 = i8;
            }
            int i45 = i42 + 1;
            charAt3 = m15387e.charAt(i42);
            if (charAt3 >= 55296) {
                int i46 = charAt3 & 8191;
                int i47 = 13;
                while (true) {
                    i7 = i45 + 1;
                    charAt9 = m15387e.charAt(i45);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i46 |= (charAt9 & 8191) << i47;
                    i47 += 13;
                    i45 = i7;
                }
                charAt3 = i46 | (charAt9 << i47);
                i45 = i7;
            }
            int i48 = i45 + 1;
            charAt4 = m15387e.charAt(i45);
            if (charAt4 >= 55296) {
                int i49 = charAt4 & 8191;
                int i50 = 13;
                while (true) {
                    i6 = i48 + 1;
                    charAt8 = m15387e.charAt(i48);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i49 |= (charAt8 & 8191) << i50;
                    i50 += 13;
                    i48 = i6;
                }
                charAt4 = i49 | (charAt8 << i50);
                i48 = i6;
            }
            int i51 = i48 + 1;
            int charAt22 = m15387e.charAt(i48);
            if (charAt22 >= 55296) {
                int i52 = charAt22 & 8191;
                int i53 = 13;
                while (true) {
                    i5 = i51 + 1;
                    charAt7 = m15387e.charAt(i51);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i52 |= (charAt7 & 8191) << i53;
                    i53 += 13;
                    i51 = i5;
                }
                charAt22 = i52 | (charAt7 << i53);
                i51 = i5;
            }
            int i54 = i51 + 1;
            charAt5 = m15387e.charAt(i51);
            if (charAt5 >= 55296) {
                int i55 = charAt5 & 8191;
                int i56 = 13;
                while (true) {
                    i4 = i54 + 1;
                    charAt6 = m15387e.charAt(i54);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i55 |= (charAt6 & 8191) << i56;
                    i56 += 13;
                    i54 = i4;
                }
                charAt5 = i55 | (charAt6 << i56);
                i54 = i4;
            }
            iArr = new int[charAt5 + charAt4 + charAt22];
            i2 = (charAt20 * 2) + charAt21;
            i3 = charAt20;
            i30 = i54;
        }
        Unsafe unsafe = f74693s;
        Object[] m15388d = c48263rn4.m15388d();
        Class<?> cls = c48263rn4.mo15390b().getClass();
        int[] iArr2 = new int[charAt3 * 3];
        Object[] objArr = new Object[charAt3 * 2];
        int i57 = charAt5 + charAt4;
        int i58 = charAt5;
        int i59 = i57;
        int i60 = 0;
        int i61 = 0;
        while (i30 < length) {
            int i62 = i30 + 1;
            int charAt23 = m15387e.charAt(i30);
            if (charAt23 >= c) {
                int i63 = charAt23 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i27 = i64 + 1;
                    charAt17 = m15387e.charAt(i64);
                    if (charAt17 < c) {
                        break;
                    }
                    i63 |= (charAt17 & 8191) << i65;
                    i65 += 13;
                    i64 = i27;
                }
                charAt23 = i63 | (charAt17 << i65);
                i12 = i27;
            } else {
                i12 = i62;
            }
            int i66 = i12 + 1;
            int charAt24 = m15387e.charAt(i12);
            if (charAt24 >= c) {
                int i67 = charAt24 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i26 = i68 + 1;
                    charAt16 = m15387e.charAt(i68);
                    i13 = length;
                    if (charAt16 < 55296) {
                        break;
                    }
                    i67 |= (charAt16 & 8191) << i69;
                    i69 += 13;
                    i68 = i26;
                    length = i13;
                }
                charAt24 = i67 | (charAt16 << i69);
                i14 = i26;
            } else {
                i13 = length;
                i14 = i66;
            }
            int i70 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i71 = charAt5;
            if ((charAt24 & 1024) != 0) {
                iArr[i60] = i61;
                i60++;
            }
            int i72 = i60;
            if (i70 >= 51) {
                int i73 = i14 + 1;
                int charAt25 = m15387e.charAt(i14);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i74 = charAt25 & 8191;
                    int i75 = 13;
                    while (true) {
                        i25 = i73 + 1;
                        charAt15 = m15387e.charAt(i73);
                        if (charAt15 < c2) {
                            break;
                        }
                        i74 |= (charAt15 & 8191) << i75;
                        i75 += 13;
                        i73 = i25;
                        c2 = 55296;
                    }
                    charAt25 = i74 | (charAt15 << i75);
                    i73 = i25;
                }
                int i76 = i70 - 51;
                int i77 = i73;
                if (i76 != 9 && i76 != 17) {
                    if (i76 == 12 && !z) {
                        i24 = i2 + 1;
                        objArr[((i61 / 3) * 2) + 1] = m15388d[i2];
                    }
                    int i78 = charAt25 * 2;
                    obj = m15388d[i78];
                    if (!(obj instanceof Field)) {
                        m46587h02 = (Field) obj;
                    } else {
                        m46587h02 = m46587h0(cls, (String) obj);
                        m15388d[i78] = m46587h02;
                    }
                    i15 = charAt;
                    i16 = charAt2;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m46587h02);
                    int i79 = i78 + 1;
                    obj2 = m15388d[i79];
                    if (!(obj2 instanceof Field)) {
                        m46587h03 = (Field) obj2;
                    } else {
                        m46587h03 = m46587h0(cls, (String) obj2);
                        m15388d[i79] = m46587h03;
                    }
                    str = m15387e;
                    i18 = (int) unsafe.objectFieldOffset(m46587h03);
                    z4 = z;
                    i19 = i77;
                    objectFieldOffset = objectFieldOffset2;
                    i20 = 0;
                } else {
                    i24 = i2 + 1;
                    objArr[((i61 / 3) * 2) + 1] = m15388d[i2];
                }
                i2 = i24;
                int i782 = charAt25 * 2;
                obj = m15388d[i782];
                if (!(obj instanceof Field)) {
                }
                i15 = charAt;
                i16 = charAt2;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m46587h02);
                int i792 = i782 + 1;
                obj2 = m15388d[i792];
                if (!(obj2 instanceof Field)) {
                }
                str = m15387e;
                i18 = (int) unsafe.objectFieldOffset(m46587h03);
                z4 = z;
                i19 = i77;
                objectFieldOffset = objectFieldOffset22;
                i20 = 0;
            } else {
                i15 = charAt;
                i16 = charAt2;
                int i80 = i2 + 1;
                Field m46587h04 = m46587h0(cls, (String) m15388d[i2]);
                if (i70 != 9 && i70 != 17) {
                    if (i70 != 27 && i70 != 49) {
                        if (i70 != 12 && i70 != 30 && i70 != 44) {
                            if (i70 == 50) {
                                int i81 = i58 + 1;
                                iArr[i58] = i61;
                                int i82 = (i61 / 3) * 2;
                                int i83 = i80 + 1;
                                objArr[i82] = m15388d[i80];
                                if ((charAt24 & 2048) != 0) {
                                    i80 = i83 + 1;
                                    objArr[i82 + 1] = m15388d[i83];
                                    i58 = i81;
                                } else {
                                    i58 = i81;
                                    i17 = i83;
                                    z2 = true;
                                    objectFieldOffset = (int) unsafe.objectFieldOffset(m46587h04);
                                    int i84 = i17;
                                    if ((charAt24 & 4096) == 4096) {
                                        z3 = z2;
                                    } else {
                                        z3 = false;
                                    }
                                    if (!z3 && i70 <= 17) {
                                        int i85 = i14 + 1;
                                        int charAt26 = m15387e.charAt(i14);
                                        if (charAt26 >= 55296) {
                                            int i86 = charAt26 & 8191;
                                            int i87 = 13;
                                            while (true) {
                                                i19 = i85 + 1;
                                                charAt14 = m15387e.charAt(i85);
                                                if (charAt14 < 55296) {
                                                    break;
                                                }
                                                i86 |= (charAt14 & 8191) << i87;
                                                i87 += 13;
                                                i85 = i19;
                                            }
                                            charAt26 = i86 | (charAt14 << i87);
                                        } else {
                                            i19 = i85;
                                        }
                                        int i88 = (i3 * 2) + (charAt26 / 32);
                                        Object obj3 = m15388d[i88];
                                        str = m15387e;
                                        if (obj3 instanceof Field) {
                                            m46587h0 = (Field) obj3;
                                        } else {
                                            m46587h0 = m46587h0(cls, (String) obj3);
                                            m15388d[i88] = m46587h0;
                                        }
                                        z4 = z;
                                        i18 = (int) unsafe.objectFieldOffset(m46587h0);
                                        i20 = charAt26 % 32;
                                    } else {
                                        str = m15387e;
                                        z4 = z;
                                        i18 = 1048575;
                                        i19 = i14;
                                        i20 = 0;
                                    }
                                    if (i70 >= 18 && i70 <= 49) {
                                        iArr[i59] = objectFieldOffset;
                                        i59++;
                                    }
                                    i2 = i84;
                                }
                            }
                        } else if (!z) {
                            z2 = true;
                            i21 = i80 + 1;
                            objArr[((i61 / 3) * 2) + 1] = m15388d[i80];
                        }
                        z2 = true;
                    } else {
                        z2 = true;
                        i21 = i80 + 1;
                        objArr[((i61 / 3) * 2) + 1] = m15388d[i80];
                    }
                    i17 = i21;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m46587h04);
                    int i842 = i17;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    if (!z3) {
                    }
                    str = m15387e;
                    z4 = z;
                    i18 = 1048575;
                    i19 = i14;
                    i20 = 0;
                    if (i70 >= 18) {
                        iArr[i59] = objectFieldOffset;
                        i59++;
                    }
                    i2 = i842;
                } else {
                    z2 = true;
                    objArr[((i61 / 3) * 2) + 1] = m46587h04.getType();
                }
                i17 = i80;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m46587h04);
                int i8422 = i17;
                if ((charAt24 & 4096) == 4096) {
                }
                if (!z3) {
                }
                str = m15387e;
                z4 = z;
                i18 = 1048575;
                i19 = i14;
                i20 = 0;
                if (i70 >= 18) {
                }
                i2 = i8422;
            }
            int i89 = i61 + 1;
            iArr2[i61] = charAt23;
            int i90 = i89 + 1;
            if ((charAt24 & 512) != 0) {
                i22 = 536870912;
            } else {
                i22 = 0;
            }
            if ((charAt24 & 256) != 0) {
                i23 = 268435456;
            } else {
                i23 = 0;
            }
            iArr2[i89] = i23 | i22 | (i70 << 20) | objectFieldOffset;
            i61 = i90 + 1;
            iArr2[i90] = (i20 << 20) | i18;
            z = z4;
            charAt = i15;
            charAt5 = i71;
            length = i13;
            i30 = i19;
            i60 = i72;
            m15387e = str;
            charAt2 = i16;
            c = 55296;
        }
        return new C18465F<>(iArr2, objArr, charAt, charAt2, c48263rn4.mo15390b(), z, false, iArr, charAt5, i57, y73, abstractC18560x, abstractC18480L, abstractC18527l, interfaceC18458B);
    }

    /* renamed from: V */
    public static long m46600V(int i) {
        return i & 1048575;
    }

    /* renamed from: W */
    public static <T> boolean m46599W(T t, long j) {
        return ((Boolean) C52324ye6.m3105C(t, j)).booleanValue();
    }

    /* renamed from: X */
    public static <T> double m46598X(T t, long j) {
        return ((Double) C52324ye6.m3105C(t, j)).doubleValue();
    }

    /* renamed from: Y */
    public static <T> float m46597Y(T t, long j) {
        return ((Float) C52324ye6.m3105C(t, j)).floatValue();
    }

    /* renamed from: Z */
    public static <T> int m46596Z(T t, long j) {
        return ((Integer) C52324ye6.m3105C(t, j)).intValue();
    }

    /* renamed from: a0 */
    public static <T> long m46594a0(T t, long j) {
        return ((Long) C52324ye6.m3105C(t, j)).longValue();
    }

    /* renamed from: h0 */
    public static Field m46587h0(Class<?> cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: k */
    public static <T> boolean m46584k(T t, long j) {
        return C52324ye6.m3070r(t, j);
    }

    /* renamed from: l */
    public static void m46582l(Object obj) {
        if (m46617E(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* renamed from: m */
    public static <T> double m46580m(T t, long j) {
        return C52324ye6.m3064x(t, j);
    }

    /* renamed from: n0 */
    public static int m46577n0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: q */
    public static <T> float m46572q(T t, long j) {
        return C52324ye6.m3063y(t, j);
    }

    /* renamed from: x */
    public static <T> int m46560x(T t, long j) {
        return C52324ye6.m3062z(t, j);
    }

    /* renamed from: y */
    public static boolean m46559y(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: A */
    public final boolean m46621A(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m46558z(t, i) : (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public final <N> boolean m46619C(Object obj, int i, int i2) {
        List list = (List) C52324ye6.m3105C(obj, m46600V(i));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC33832Jm5 m46566t = m46566t(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!m46566t.mo46552f(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [Jm5] */
    /* renamed from: D */
    public final boolean m46618D(T t, int i, int i2) {
        Map<?, ?> mo46734g = this.f74710q.mo46734g(C52324ye6.m3105C(t, m46600V(i)));
        if (mo46734g.isEmpty()) {
            return true;
        }
        if (this.f74710q.mo46740a(m46568s(i2)).f74900c.m46341b() != C18489P.EnumC18496c.MESSAGE) {
            return true;
        }
        InterfaceC33832Jm5<T> interfaceC33832Jm5 = 0;
        for (Object obj : mo46734g.values()) {
            if (interfaceC33832Jm5 == null) {
                interfaceC33832Jm5 = L94.m97649a().m97647c(obj.getClass());
            }
            boolean mo46552f = interfaceC33832Jm5.mo46552f(obj);
            interfaceC33832Jm5 = interfaceC33832Jm5;
            if (!mo46552f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    public final boolean m46616F(T t, T t2, int i) {
        long m46592c0 = m46592c0(i) & 1048575;
        if (C52324ye6.m3062z(t, m46592c0) == C52324ye6.m3062z(t2, m46592c0)) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public final boolean m46615G(T t, int i, int i2) {
        if (C52324ye6.m3062z(t, m46592c0(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0649 A[Catch: all -> 0x06a1, TRY_LEAVE, TryCatch #0 {all -> 0x06a1, blocks: (B:158:0x061a, B:169:0x0643, B:171:0x0649, B:181:0x0671, B:182:0x0676), top: B:210:0x061a }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06b3 A[LOOP:2: B:201:0x06af->B:203:0x06b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06c8  */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.protobuf.L] */
    /* JADX WARN: Type inference failed for: r14v62 */
    /* JADX WARN: Type inference failed for: r1v139, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.google.protobuf.I] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <UT, UB, ET extends C18531o.InterfaceC18533b<ET>> void m46611K(AbstractC18480L<UT, UB> abstractC18480L, AbstractC18527l<ET> abstractC18527l, T t, InterfaceC18468I interfaceC18468I, C18525k c18525k) throws IOException {
        AbstractC18480L abstractC18480L2;
        T t2;
        int i;
        Object obj;
        T t3;
        C18531o<ET> mo46117d;
        C18525k c18525k2;
        AbstractC18480L abstractC18480L3;
        UB ub;
        AbstractC18480L abstractC18480L4;
        AbstractC18480L abstractC18480L5 = abstractC18480L;
        T t4 = t;
        C18525k c18525k3 = c18525k;
        UB ub2 = null;
        C18531o<ET> c18531o = null;
        while (true) {
            try {
                int mo46195n = interfaceC18468I.mo46195n();
                int m46593b0 = m46593b0(mo46195n);
                if (m46593b0 >= 0) {
                    t2 = t4;
                    try {
                        int m46575o0 = m46575o0(m46593b0);
                        try {
                            switch (m46577n0(m46575o0)) {
                                case 0:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    C52324ye6.m3094N(t2, m46600V(m46575o0), interfaceC18468I.readDouble());
                                    m46586i0(t2, m46593b0);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 1:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    C52324ye6.m3093O(t2, m46600V(m46575o0), interfaceC18468I.readFloat());
                                    m46586i0(t2, m46593b0);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 2:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    C52324ye6.m3091Q(t2, m46600V(m46575o0), interfaceC18468I.mo46189t());
                                    m46586i0(t2, m46593b0);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 3:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    C52324ye6.m3091Q(t2, m46600V(m46575o0), interfaceC18468I.mo46199j());
                                    m46586i0(t2, m46593b0);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 4:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    C52324ye6.m3092P(t2, m46600V(m46575o0), interfaceC18468I.mo46234B());
                                    m46586i0(t2, m46593b0);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 5:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    C52324ye6.m3091Q(t2, m46600V(m46575o0), interfaceC18468I.mo46188u());
                                    m46586i0(t2, m46593b0);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 6:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    C52324ye6.m3092P(t2, m46600V(m46575o0), interfaceC18468I.mo46231E());
                                    m46586i0(t2, m46593b0);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 7:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    C52324ye6.m3100H(t2, m46600V(m46575o0), interfaceC18468I.mo46186w());
                                    m46586i0(t2, m46593b0);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 8:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    m46589f0(t2, m46575o0, interfaceC18468I);
                                    m46586i0(t2, m46593b0);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 9:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    InterfaceC18462D interfaceC18462D = (InterfaceC18462D) m46606P(t2, m46593b0);
                                    interfaceC18468I.mo46222N(interfaceC18462D, m46566t(m46593b0), c18525k2);
                                    m46581l0(t2, m46593b0, interfaceC18462D);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 10:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), interfaceC18468I.mo46201h());
                                    m46586i0(t2, m46593b0);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 11:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    C52324ye6.m3092P(t2, m46600V(m46575o0), interfaceC18468I.mo46206c());
                                    m46586i0(t2, m46593b0);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 12:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    AbstractC18480L abstractC18480L6 = abstractC18480L5;
                                    int mo46204e = interfaceC18468I.mo46204e();
                                    C18544t.InterfaceC18549e m46570r = m46570r(m46593b0);
                                    if (m46570r != null && !m46570r.mo33504a(mo46204e)) {
                                        ub2 = (UB) C18469J.m46516L(t2, mo46195n, mo46204e, ub, abstractC18480L6);
                                        abstractC18480L3 = abstractC18480L6;
                                        break;
                                    }
                                    C52324ye6.m3092P(t2, m46600V(m46575o0), mo46204e);
                                    m46586i0(t2, m46593b0);
                                    abstractC18480L4 = abstractC18480L6;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 13:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    C52324ye6.m3092P(t2, m46600V(m46575o0), interfaceC18468I.mo46228H());
                                    m46586i0(t2, m46593b0);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 14:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    C52324ye6.m3091Q(t2, m46600V(m46575o0), interfaceC18468I.mo46207b());
                                    m46586i0(t2, m46593b0);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 15:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    C52324ye6.m3092P(t2, m46600V(m46575o0), interfaceC18468I.mo46203f());
                                    m46586i0(t2, m46593b0);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 16:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    C52324ye6.m3091Q(t2, m46600V(m46575o0), interfaceC18468I.mo46230F());
                                    m46586i0(t2, m46593b0);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 17:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    InterfaceC18462D interfaceC18462D2 = (InterfaceC18462D) m46606P(t2, m46593b0);
                                    interfaceC18468I.mo46223M(interfaceC18462D2, m46566t(m46593b0), c18525k2);
                                    m46581l0(t2, m46593b0, interfaceC18462D2);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 18:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46190s(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 19:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46193p(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 20:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46184y(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 21:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46185x(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 22:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46197l(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 23:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46233C(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 24:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46196m(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 25:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46202g(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 26:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    m46588g0(t2, m46575o0, interfaceC18468I);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 27:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    m46590e0(t, m46575o0, interfaceC18468I, m46566t(m46593b0), c18525k);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 28:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46191r(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 29:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46232D(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 30:
                                    c18525k2 = c18525k3;
                                    abstractC18480L3 = abstractC18480L5;
                                    List mo45967e = this.f74707n.mo45967e(t2, m46600V(m46575o0));
                                    interfaceC18468I.mo46183z(mo45967e);
                                    ub2 = (UB) C18469J.m46527A(t, mo46195n, mo45967e, m46570r(m46593b0), ub2, abstractC18480L);
                                    break;
                                case 31:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46187v(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 32:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46198k(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 33:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46200i(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 34:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46209a(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 35:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46190s(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 36:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46193p(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 37:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46184y(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 38:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46185x(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 39:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46197l(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 40:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46233C(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 41:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46196m(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 42:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46202g(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 43:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46232D(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 44:
                                    c18525k2 = c18525k3;
                                    abstractC18480L3 = abstractC18480L5;
                                    List mo45967e2 = this.f74707n.mo45967e(t2, m46600V(m46575o0));
                                    interfaceC18468I.mo46183z(mo45967e2);
                                    ub2 = (UB) C18469J.m46527A(t, mo46195n, mo45967e2, m46570r(m46593b0), ub2, abstractC18480L);
                                    break;
                                case 45:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46187v(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 46:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46198k(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 47:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46200i(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 48:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    interfaceC18468I.mo46209a(this.f74707n.mo45967e(t2, m46600V(m46575o0)));
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 49:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    m46591d0(t, m46600V(m46575o0), interfaceC18468I, m46566t(m46593b0), c18525k);
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 50:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    try {
                                        m46610L(t, m46593b0, m46568s(m46593b0), c18525k, interfaceC18468I);
                                        abstractC18480L4 = abstractC18480L5;
                                        ub2 = ub;
                                        abstractC18480L3 = abstractC18480L4;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                        abstractC18480L2 = abstractC18480L5;
                                        ub2 = ub;
                                        if (!abstractC18480L2.mo46397q(interfaceC18468I)) {
                                        }
                                        t4 = t2;
                                        c18525k3 = c18525k2;
                                        abstractC18480L5 = abstractC18480L3;
                                    } catch (Throwable th) {
                                        th = th;
                                        abstractC18480L2 = abstractC18480L5;
                                        ub2 = ub;
                                        obj = ub2;
                                        while (i < this.f74705l) {
                                        }
                                        if (obj != null) {
                                        }
                                        throw th;
                                    }
                                    break;
                                case 51:
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), Double.valueOf(interfaceC18468I.readDouble()));
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 52:
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), Float.valueOf(interfaceC18468I.readFloat()));
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 53:
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), Long.valueOf(interfaceC18468I.mo46189t()));
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 54:
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), Long.valueOf(interfaceC18468I.mo46199j()));
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 55:
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), Integer.valueOf(interfaceC18468I.mo46234B()));
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 56:
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), Long.valueOf(interfaceC18468I.mo46188u()));
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 57:
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), Integer.valueOf(interfaceC18468I.mo46231E()));
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 58:
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), Boolean.valueOf(interfaceC18468I.mo46186w()));
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 59:
                                    m46589f0(t2, m46575o0, interfaceC18468I);
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 60:
                                    InterfaceC18462D interfaceC18462D3 = (InterfaceC18462D) m46605Q(t2, mo46195n, m46593b0);
                                    interfaceC18468I.mo46222N(interfaceC18462D3, m46566t(m46593b0), c18525k3);
                                    m46579m0(t2, mo46195n, m46593b0, interfaceC18462D3);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 61:
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), interfaceC18468I.mo46201h());
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 62:
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), Integer.valueOf(interfaceC18468I.mo46206c()));
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 63:
                                    int mo46204e2 = interfaceC18468I.mo46204e();
                                    C18544t.InterfaceC18549e m46570r2 = m46570r(m46593b0);
                                    if (m46570r2 != null && !m46570r2.mo33504a(mo46204e2)) {
                                        ub2 = (UB) C18469J.m46516L(t2, mo46195n, mo46204e2, ub2, abstractC18480L5);
                                        c18525k2 = c18525k3;
                                        abstractC18480L3 = abstractC18480L5;
                                        break;
                                    }
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), Integer.valueOf(mo46204e2));
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 64:
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), Integer.valueOf(interfaceC18468I.mo46228H()));
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 65:
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), Long.valueOf(interfaceC18468I.mo46207b()));
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 66:
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), Integer.valueOf(interfaceC18468I.mo46203f()));
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 67:
                                    C52324ye6.m3090R(t2, m46600V(m46575o0), Long.valueOf(interfaceC18468I.mo46230F()));
                                    m46585j0(t2, mo46195n, m46593b0);
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L4 = abstractC18480L5;
                                    ub2 = ub;
                                    abstractC18480L3 = abstractC18480L4;
                                    break;
                                case 68:
                                    try {
                                        InterfaceC18462D interfaceC18462D4 = (InterfaceC18462D) m46605Q(t2, mo46195n, m46593b0);
                                        interfaceC18468I.mo46223M(interfaceC18462D4, m46566t(m46593b0), c18525k3);
                                        m46579m0(t2, mo46195n, m46593b0, interfaceC18462D4);
                                        ub = ub2;
                                        c18525k2 = c18525k3;
                                        abstractC18480L4 = abstractC18480L5;
                                        ub2 = ub;
                                        abstractC18480L3 = abstractC18480L4;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        c18525k2 = c18525k3;
                                        abstractC18480L2 = abstractC18480L5;
                                        if (!abstractC18480L2.mo46397q(interfaceC18468I)) {
                                        }
                                        t4 = t2;
                                        c18525k3 = c18525k2;
                                        abstractC18480L5 = abstractC18480L3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        abstractC18480L2 = abstractC18480L5;
                                        obj = ub2;
                                        while (i < this.f74705l) {
                                        }
                                        if (obj != null) {
                                        }
                                        throw th;
                                    }
                                    break;
                                default:
                                    ub = ub2;
                                    c18525k2 = c18525k3;
                                    abstractC18480L2 = abstractC18480L5;
                                    if (ub == null) {
                                        try {
                                            ub2 = abstractC18480L2.mo46406f(t2);
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                            ub2 = ub;
                                            if (!abstractC18480L2.mo46397q(interfaceC18468I)) {
                                            }
                                            t4 = t2;
                                            c18525k3 = c18525k2;
                                            abstractC18480L5 = abstractC18480L3;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            ub2 = ub;
                                            obj = ub2;
                                            while (i < this.f74705l) {
                                            }
                                            if (obj != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        ub2 = ub;
                                    }
                                    try {
                                        try {
                                            boolean m46440m = abstractC18480L2.m46440m(ub2, interfaceC18468I);
                                            abstractC18480L3 = abstractC18480L2;
                                            if (!m46440m) {
                                                Object obj2 = ub2;
                                                for (int i2 = this.f74704k; i2 < this.f74705l; i2++) {
                                                    obj2 = m46576o(t, this.f74703j[i2], obj2, abstractC18480L, t);
                                                }
                                                if (obj2 != null) {
                                                    abstractC18480L2.mo46399o(t2, obj2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj = ub2;
                                            for (i = this.f74704k; i < this.f74705l; i++) {
                                                obj = m46576o(t, this.f74703j[i], obj, abstractC18480L, t);
                                            }
                                            if (obj != null) {
                                                abstractC18480L2.mo46399o(t2, obj);
                                            }
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                        if (!abstractC18480L2.mo46397q(interfaceC18468I)) {
                                            abstractC18480L3 = abstractC18480L2;
                                            if (!interfaceC18468I.mo46192q()) {
                                                Object obj3 = ub2;
                                                for (int i3 = this.f74704k; i3 < this.f74705l; i3++) {
                                                    obj3 = m46576o(t, this.f74703j[i3], obj3, abstractC18480L, t);
                                                }
                                                if (obj3 != null) {
                                                    abstractC18480L2.mo46399o(t2, obj3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } else {
                                            if (ub2 == null) {
                                                ub2 = abstractC18480L2.mo46406f(t2);
                                            }
                                            boolean m46440m2 = abstractC18480L2.m46440m(ub2, interfaceC18468I);
                                            abstractC18480L3 = abstractC18480L2;
                                            if (!m46440m2) {
                                                Object obj4 = ub2;
                                                for (int i4 = this.f74704k; i4 < this.f74705l; i4++) {
                                                    obj4 = m46576o(t, this.f74703j[i4], obj4, abstractC18480L, t);
                                                }
                                                if (obj4 != null) {
                                                    abstractC18480L2.mo46399o(t2, obj4);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        t4 = t2;
                                        c18525k3 = c18525k2;
                                        abstractC18480L5 = abstractC18480L3;
                                    }
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                            UB ub3 = ub2;
                        }
                        t4 = t2;
                        c18525k3 = c18525k2;
                        abstractC18480L5 = abstractC18480L3;
                    } catch (Throwable th5) {
                        th = th5;
                        UB ub4 = ub2;
                    }
                } else if (mo46195n == Integer.MAX_VALUE) {
                    UB ub5 = ub2;
                    for (int i5 = this.f74704k; i5 < this.f74705l; i5++) {
                        ub5 = (UB) m46576o(t, this.f74703j[i5], ub5, abstractC18480L, t);
                    }
                    if (ub5 != null) {
                        abstractC18480L5.mo46399o(t4, ub5);
                        return;
                    }
                    return;
                } else {
                    try {
                        Object mo46119b = !this.f74699f ? null : abstractC18527l.mo46119b(c18525k3, this.f74698e, mo46195n);
                        if (mo46119b != null) {
                            if (c18531o == null) {
                                try {
                                    mo46117d = abstractC18527l.mo46117d(t);
                                } catch (Throwable th6) {
                                    th = th6;
                                    abstractC18480L2 = abstractC18480L5;
                                    t2 = t4;
                                    obj = ub2;
                                    while (i < this.f74705l) {
                                    }
                                    if (obj != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                mo46117d = c18531o;
                            }
                            t3 = t4;
                            try {
                                ub2 = (UB) abstractC18527l.mo46114g(t, interfaceC18468I, mo46119b, c18525k, mo46117d, ub2, abstractC18480L);
                                c18531o = mo46117d;
                            } catch (Throwable th7) {
                                th = th7;
                                t2 = t3;
                                abstractC18480L2 = abstractC18480L5;
                                obj = ub2;
                                while (i < this.f74705l) {
                                }
                                if (obj != null) {
                                }
                                throw th;
                            }
                        } else {
                            t3 = t4;
                            if (abstractC18480L5.mo46397q(interfaceC18468I)) {
                                if (!interfaceC18468I.mo46192q()) {
                                }
                            } else {
                                if (ub2 == null) {
                                    ub2 = abstractC18480L5.mo46406f(t3);
                                }
                                if (!abstractC18480L5.m46440m(ub2, interfaceC18468I)) {
                                }
                            }
                        }
                        t4 = t3;
                    } catch (Throwable th8) {
                        th = th8;
                        t2 = t4;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                UB ub6 = ub2;
            }
        }
        int i6 = this.f74704k;
        UB ub7 = ub2;
        while (i6 < this.f74705l) {
            ub7 = (UB) m46576o(t, this.f74703j[i6], ub7, abstractC18480L, t);
            i6++;
            t3 = t3;
        }
        T t5 = t3;
        if (ub7 != null) {
            abstractC18480L5.mo46399o(t5, ub7);
        }
    }

    /* renamed from: L */
    public final <K, V> void m46610L(Object obj, int i, Object obj2, C18525k c18525k, InterfaceC18468I interfaceC18468I) throws IOException {
        long m46600V = m46600V(m46575o0(i));
        Object m3105C = C52324ye6.m3105C(obj, m46600V);
        if (m3105C == null) {
            m3105C = this.f74710q.mo46735f(obj2);
            C52324ye6.m3090R(obj, m46600V, m3105C);
        } else if (this.f74710q.mo46733h(m3105C)) {
            Object mo46735f = this.f74710q.mo46735f(obj2);
            this.f74710q.mo46738c(mo46735f, m3105C);
            C52324ye6.m3090R(obj, m46600V, mo46735f);
            m3105C = mo46735f;
        }
        interfaceC18468I.mo46224L(this.f74710q.mo46736e(m3105C), this.f74710q.mo46740a(obj2), c18525k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    public final void m46609M(T t, T t2, int i) {
        if (!m46558z(t2, i)) {
            return;
        }
        long m46600V = m46600V(m46575o0(i));
        Unsafe unsafe = f74693s;
        Object object = unsafe.getObject(t2, m46600V);
        if (object != null) {
            InterfaceC33832Jm5 m46566t = m46566t(i);
            if (!m46558z(t, i)) {
                if (!m46617E(object)) {
                    unsafe.putObject(t, m46600V, object);
                } else {
                    Object mo46554d = m46566t.mo46554d();
                    m46566t.mo46555c(mo46554d, object);
                    unsafe.putObject(t, m46600V, mo46554d);
                }
                m46586i0(t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, m46600V);
            if (!m46617E(object2)) {
                Object mo46554d2 = m46566t.mo46554d();
                m46566t.mo46555c(mo46554d2, object2);
                unsafe.putObject(t, m46600V, mo46554d2);
                object2 = mo46554d2;
            }
            m46566t.mo46555c(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + m46601U(i) + " is present but null: " + t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    public final void m46608N(T t, T t2, int i) {
        int m46601U = m46601U(i);
        if (!m46615G(t2, m46601U, i)) {
            return;
        }
        long m46600V = m46600V(m46575o0(i));
        Unsafe unsafe = f74693s;
        Object object = unsafe.getObject(t2, m46600V);
        if (object != null) {
            InterfaceC33832Jm5 m46566t = m46566t(i);
            if (!m46615G(t, m46601U, i)) {
                if (!m46617E(object)) {
                    unsafe.putObject(t, m46600V, object);
                } else {
                    Object mo46554d = m46566t.mo46554d();
                    m46566t.mo46555c(mo46554d, object);
                    unsafe.putObject(t, m46600V, mo46554d);
                }
                m46585j0(t, m46601U, i);
                return;
            }
            Object object2 = unsafe.getObject(t, m46600V);
            if (!m46617E(object2)) {
                Object mo46554d2 = m46566t.mo46554d();
                m46566t.mo46555c(mo46554d2, object2);
                unsafe.putObject(t, m46600V, mo46554d2);
                object2 = mo46554d2;
            }
            m46566t.mo46555c(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + m46601U(i) + " is present but null: " + t2);
    }

    /* renamed from: O */
    public final void m46607O(T t, T t2, int i) {
        int m46575o0 = m46575o0(i);
        long m46600V = m46600V(m46575o0);
        int m46601U = m46601U(i);
        switch (m46577n0(m46575o0)) {
            case 0:
                if (m46558z(t2, i)) {
                    C52324ye6.m3094N(t, m46600V, C52324ye6.m3064x(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 1:
                if (m46558z(t2, i)) {
                    C52324ye6.m3093O(t, m46600V, C52324ye6.m3063y(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 2:
                if (m46558z(t2, i)) {
                    C52324ye6.m3091Q(t, m46600V, C52324ye6.m3107A(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 3:
                if (m46558z(t2, i)) {
                    C52324ye6.m3091Q(t, m46600V, C52324ye6.m3107A(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 4:
                if (m46558z(t2, i)) {
                    C52324ye6.m3092P(t, m46600V, C52324ye6.m3062z(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 5:
                if (m46558z(t2, i)) {
                    C52324ye6.m3091Q(t, m46600V, C52324ye6.m3107A(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 6:
                if (m46558z(t2, i)) {
                    C52324ye6.m3092P(t, m46600V, C52324ye6.m3062z(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 7:
                if (m46558z(t2, i)) {
                    C52324ye6.m3100H(t, m46600V, C52324ye6.m3070r(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 8:
                if (m46558z(t2, i)) {
                    C52324ye6.m3090R(t, m46600V, C52324ye6.m3105C(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 9:
                m46609M(t, t2, i);
                return;
            case 10:
                if (m46558z(t2, i)) {
                    C52324ye6.m3090R(t, m46600V, C52324ye6.m3105C(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 11:
                if (m46558z(t2, i)) {
                    C52324ye6.m3092P(t, m46600V, C52324ye6.m3062z(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 12:
                if (m46558z(t2, i)) {
                    C52324ye6.m3092P(t, m46600V, C52324ye6.m3062z(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 13:
                if (m46558z(t2, i)) {
                    C52324ye6.m3092P(t, m46600V, C52324ye6.m3062z(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 14:
                if (m46558z(t2, i)) {
                    C52324ye6.m3091Q(t, m46600V, C52324ye6.m3107A(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 15:
                if (m46558z(t2, i)) {
                    C52324ye6.m3092P(t, m46600V, C52324ye6.m3062z(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 16:
                if (m46558z(t2, i)) {
                    C52324ye6.m3091Q(t, m46600V, C52324ye6.m3107A(t2, m46600V));
                    m46586i0(t, i);
                    return;
                }
                return;
            case 17:
                m46609M(t, t2, i);
                return;
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
                this.f74707n.mo45968d(t, t2, m46600V);
                return;
            case 50:
                C18469J.m46522F(this.f74710q, t, t2, m46600V);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (m46615G(t2, m46601U, i)) {
                    C52324ye6.m3090R(t, m46600V, C52324ye6.m3105C(t2, m46600V));
                    m46585j0(t, m46601U, i);
                    return;
                }
                return;
            case 60:
                m46608N(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (m46615G(t2, m46601U, i)) {
                    C52324ye6.m3090R(t, m46600V, C52324ye6.m3105C(t2, m46600V));
                    m46585j0(t, m46601U, i);
                    return;
                }
                return;
            case 68:
                m46608N(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    public final Object m46606P(T t, int i) {
        InterfaceC33832Jm5 m46566t = m46566t(i);
        long m46600V = m46600V(m46575o0(i));
        if (!m46558z(t, i)) {
            return m46566t.mo46554d();
        }
        Object object = f74693s.getObject(t, m46600V);
        if (m46617E(object)) {
            return object;
        }
        Object mo46554d = m46566t.mo46554d();
        if (object != null) {
            m46566t.mo46555c(mo46554d, object);
        }
        return mo46554d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    public final Object m46605Q(T t, int i, int i2) {
        InterfaceC33832Jm5 m46566t = m46566t(i2);
        if (!m46615G(t, i, i2)) {
            return m46566t.mo46554d();
        }
        Object object = f74693s.getObject(t, m46600V(m46575o0(i2)));
        if (m46617E(object)) {
            return object;
        }
        Object mo46554d = m46566t.mo46554d();
        if (object != null) {
            m46566t.mo46555c(mo46554d, object);
        }
        return mo46554d;
    }

    /* renamed from: U */
    public final int m46601U(int i) {
        return this.f74694a[i];
    }

    /* renamed from: a */
    public final boolean m46595a(T t, T t2, int i) {
        return m46558z(t, i) == m46558z(t2, i);
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: b */
    public boolean mo46556b(T t, T t2) {
        int length = this.f74694a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m46578n(t, t2, i)) {
                return false;
            }
        }
        if (!this.f74708o.mo46405g(t).equals(this.f74708o.mo46405g(t2))) {
            return false;
        }
        if (this.f74699f) {
            return this.f74709p.mo46118c(t).equals(this.f74709p.mo46118c(t2));
        }
        return true;
    }

    /* renamed from: b0 */
    public final int m46593b0(int i) {
        if (i >= this.f74696c && i <= this.f74697d) {
            return m46583k0(i, 0);
        }
        return -1;
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: c */
    public void mo46555c(T t, T t2) {
        m46582l(t);
        t2.getClass();
        for (int i = 0; i < this.f74694a.length; i += 3) {
            m46607O(t, t2, i);
        }
        C18469J.m46521G(this.f74708o, t, t2);
        if (this.f74699f) {
            C18469J.m46523E(this.f74709p, t, t2);
        }
    }

    /* renamed from: c0 */
    public final int m46592c0(int i) {
        return this.f74694a[i + 2];
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: d */
    public T mo46554d() {
        return (T) this.f74706m.mo71862a(this.f74698e);
    }

    /* renamed from: d0 */
    public final <E> void m46591d0(Object obj, long j, InterfaceC18468I interfaceC18468I, InterfaceC33832Jm5<E> interfaceC33832Jm5, C18525k c18525k) throws IOException {
        interfaceC18468I.mo46226J(this.f74707n.mo45967e(obj, j), interfaceC33832Jm5, c18525k);
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: e */
    public int mo46553e(T t) {
        int i;
        int m45995f;
        int length = this.f74694a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m46575o0 = m46575o0(i3);
            int m46601U = m46601U(i3);
            long m46600V = m46600V(m46575o0);
            int i4 = 37;
            switch (m46577n0(m46575o0)) {
                case 0:
                    i = i2 * 53;
                    m45995f = C18544t.m45995f(Double.doubleToLongBits(C52324ye6.m3064x(t, m46600V)));
                    i2 = i + m45995f;
                    break;
                case 1:
                    i = i2 * 53;
                    m45995f = Float.floatToIntBits(C52324ye6.m3063y(t, m46600V));
                    i2 = i + m45995f;
                    break;
                case 2:
                    i = i2 * 53;
                    m45995f = C18544t.m45995f(C52324ye6.m3107A(t, m46600V));
                    i2 = i + m45995f;
                    break;
                case 3:
                    i = i2 * 53;
                    m45995f = C18544t.m45995f(C52324ye6.m3107A(t, m46600V));
                    i2 = i + m45995f;
                    break;
                case 4:
                    i = i2 * 53;
                    m45995f = C52324ye6.m3062z(t, m46600V);
                    i2 = i + m45995f;
                    break;
                case 5:
                    i = i2 * 53;
                    m45995f = C18544t.m45995f(C52324ye6.m3107A(t, m46600V));
                    i2 = i + m45995f;
                    break;
                case 6:
                    i = i2 * 53;
                    m45995f = C52324ye6.m3062z(t, m46600V);
                    i2 = i + m45995f;
                    break;
                case 7:
                    i = i2 * 53;
                    m45995f = C18544t.m45998c(C52324ye6.m3070r(t, m46600V));
                    i2 = i + m45995f;
                    break;
                case 8:
                    i = i2 * 53;
                    m45995f = ((String) C52324ye6.m3105C(t, m46600V)).hashCode();
                    i2 = i + m45995f;
                    break;
                case 9:
                    Object m3105C = C52324ye6.m3105C(t, m46600V);
                    if (m3105C != null) {
                        i4 = m3105C.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    m45995f = C52324ye6.m3105C(t, m46600V).hashCode();
                    i2 = i + m45995f;
                    break;
                case 11:
                    i = i2 * 53;
                    m45995f = C52324ye6.m3062z(t, m46600V);
                    i2 = i + m45995f;
                    break;
                case 12:
                    i = i2 * 53;
                    m45995f = C52324ye6.m3062z(t, m46600V);
                    i2 = i + m45995f;
                    break;
                case 13:
                    i = i2 * 53;
                    m45995f = C52324ye6.m3062z(t, m46600V);
                    i2 = i + m45995f;
                    break;
                case 14:
                    i = i2 * 53;
                    m45995f = C18544t.m45995f(C52324ye6.m3107A(t, m46600V));
                    i2 = i + m45995f;
                    break;
                case 15:
                    i = i2 * 53;
                    m45995f = C52324ye6.m3062z(t, m46600V);
                    i2 = i + m45995f;
                    break;
                case 16:
                    i = i2 * 53;
                    m45995f = C18544t.m45995f(C52324ye6.m3107A(t, m46600V));
                    i2 = i + m45995f;
                    break;
                case 17:
                    Object m3105C2 = C52324ye6.m3105C(t, m46600V);
                    if (m3105C2 != null) {
                        i4 = m3105C2.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
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
                    m45995f = C52324ye6.m3105C(t, m46600V).hashCode();
                    i2 = i + m45995f;
                    break;
                case 50:
                    i = i2 * 53;
                    m45995f = C52324ye6.m3105C(t, m46600V).hashCode();
                    i2 = i + m45995f;
                    break;
                case 51:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = C18544t.m45995f(Double.doubleToLongBits(m46598X(t, m46600V)));
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = Float.floatToIntBits(m46597Y(t, m46600V));
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = C18544t.m45995f(m46594a0(t, m46600V));
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = C18544t.m45995f(m46594a0(t, m46600V));
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = m46596Z(t, m46600V);
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = C18544t.m45995f(m46594a0(t, m46600V));
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = m46596Z(t, m46600V);
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = C18544t.m45998c(m46599W(t, m46600V));
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = ((String) C52324ye6.m3105C(t, m46600V)).hashCode();
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = C52324ye6.m3105C(t, m46600V).hashCode();
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = C52324ye6.m3105C(t, m46600V).hashCode();
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = m46596Z(t, m46600V);
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = m46596Z(t, m46600V);
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = m46596Z(t, m46600V);
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = C18544t.m45995f(m46594a0(t, m46600V));
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = m46596Z(t, m46600V);
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = C18544t.m45995f(m46594a0(t, m46600V));
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m46615G(t, m46601U, i3)) {
                        i = i2 * 53;
                        m45995f = C52324ye6.m3105C(t, m46600V).hashCode();
                        i2 = i + m45995f;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f74708o.mo46405g(t).hashCode();
        if (this.f74699f) {
            return (hashCode * 53) + this.f74709p.mo46118c(t).hashCode();
        }
        return hashCode;
    }

    /* renamed from: e0 */
    public final <E> void m46590e0(Object obj, int i, InterfaceC18468I interfaceC18468I, InterfaceC33832Jm5<E> interfaceC33832Jm5, C18525k c18525k) throws IOException {
        interfaceC18468I.mo46225K(this.f74707n.mo45967e(obj, m46600V(i)), interfaceC33832Jm5, c18525k);
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: f */
    public final boolean mo46552f(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f74704k) {
            int i6 = this.f74703j[i5];
            int m46601U = m46601U(i6);
            int m46575o0 = m46575o0(i6);
            int i7 = this.f74694a[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = f74693s.getInt(t, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (m46614H(m46575o0) && !m46621A(t, i6, i, i2, i9)) {
                return false;
            }
            int m46577n0 = m46577n0(m46575o0);
            if (m46577n0 != 9 && m46577n0 != 17) {
                if (m46577n0 != 27) {
                    if (m46577n0 != 60 && m46577n0 != 68) {
                        if (m46577n0 != 49) {
                            if (m46577n0 == 50 && !m46618D(t, m46575o0, i6)) {
                                return false;
                            }
                        }
                    } else if (m46615G(t, m46601U, i6) && !m46620B(t, m46575o0, m46566t(i6))) {
                        return false;
                    }
                }
                if (!m46619C(t, m46575o0, i6)) {
                    return false;
                }
            } else if (m46621A(t, i6, i, i2, i9) && !m46620B(t, m46575o0, m46566t(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f74699f && !this.f74709p.mo46118c(t).m46093p()) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public final void m46589f0(Object obj, int i, InterfaceC18468I interfaceC18468I) throws IOException {
        if (m46559y(i)) {
            C52324ye6.m3090R(obj, m46600V(i), interfaceC18468I.mo46227I());
        } else if (this.f74700g) {
            C52324ye6.m3090R(obj, m46600V(i), interfaceC18468I.mo46229G());
        } else {
            C52324ye6.m3090R(obj, m46600V(i), interfaceC18468I.mo46201h());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC33832Jm5
    /* renamed from: g */
    public void mo46551g(T t) {
        if (!m46617E(t)) {
            return;
        }
        if (t instanceof AbstractC18536r) {
            AbstractC18536r abstractC18536r = (AbstractC18536r) t;
            abstractC18536r.m46045r();
            abstractC18536r.m46046q();
            abstractC18536r.m46061J();
        }
        int length = this.f74694a.length;
        for (int i = 0; i < length; i += 3) {
            int m46575o0 = m46575o0(i);
            long m46600V = m46600V(m46575o0);
            int m46577n0 = m46577n0(m46575o0);
            if (m46577n0 != 9) {
                switch (m46577n0) {
                    case 17:
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
                        this.f74707n.mo45969c(t, m46600V);
                        continue;
                    case 50:
                        Unsafe unsafe = f74693s;
                        Object object = unsafe.getObject(t, m46600V);
                        if (object != null) {
                            unsafe.putObject(t, m46600V, this.f74710q.mo46739b(object));
                        } else {
                            continue;
                        }
                    default:
                }
            }
            if (m46558z(t, i)) {
                m46566t(i).mo46551g(f74693s.getObject(t, m46600V));
            }
        }
        this.f74708o.mo46402j(t);
        if (this.f74699f) {
            this.f74709p.mo46115f(t);
        }
    }

    /* renamed from: g0 */
    public final void m46588g0(Object obj, int i, InterfaceC18468I interfaceC18468I) throws IOException {
        if (m46559y(i)) {
            interfaceC18468I.mo46235A(this.f74707n.mo45967e(obj, m46600V(i)));
        } else {
            interfaceC18468I.mo46194o(this.f74707n.mo45967e(obj, m46600V(i)));
        }
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: h */
    public int mo46550h(T t) {
        return this.f74701h ? m46562v(t) : m46564u(t);
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: i */
    public void mo46549i(T t, InterfaceC18497Q interfaceC18497Q) throws IOException {
        if (interfaceC18497Q.mo46181B() == InterfaceC18497Q.EnumC18498a.DESCENDING) {
            m46569r0(t, interfaceC18497Q);
        } else if (this.f74701h) {
            m46571q0(t, interfaceC18497Q);
        } else {
            m46573p0(t, interfaceC18497Q);
        }
    }

    /* renamed from: i0 */
    public final void m46586i0(T t, int i) {
        int m46592c0 = m46592c0(i);
        long j = 1048575 & m46592c0;
        if (j == 1048575) {
            return;
        }
        C52324ye6.m3092P(t, j, (1 << (m46592c0 >>> 20)) | C52324ye6.m3062z(t, j));
    }

    @Override // p000.InterfaceC33832Jm5
    /* renamed from: j */
    public void mo46548j(T t, InterfaceC18468I interfaceC18468I, C18525k c18525k) throws IOException {
        c18525k.getClass();
        m46582l(t);
        m46611K(this.f74708o, this.f74709p, t, interfaceC18468I, c18525k);
    }

    /* renamed from: j0 */
    public final void m46585j0(T t, int i, int i2) {
        C52324ye6.m3092P(t, m46592c0(i2) & 1048575, i);
    }

    /* renamed from: k0 */
    public final int m46583k0(int i, int i2) {
        int length = (this.f74694a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int m46601U = m46601U(i4);
            if (i == m46601U) {
                return i4;
            }
            if (i < m46601U) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: l0 */
    public final void m46581l0(T t, int i, Object obj) {
        f74693s.putObject(t, m46600V(m46575o0(i)), obj);
        m46586i0(t, i);
    }

    /* renamed from: m0 */
    public final void m46579m0(T t, int i, int i2, Object obj) {
        f74693s.putObject(t, m46600V(m46575o0(i2)), obj);
        m46585j0(t, i, i2);
    }

    /* renamed from: n */
    public final boolean m46578n(T t, T t2, int i) {
        int m46575o0 = m46575o0(i);
        long m46600V = m46600V(m46575o0);
        switch (m46577n0(m46575o0)) {
            case 0:
                if (!m46595a(t, t2, i) || Double.doubleToLongBits(C52324ye6.m3064x(t, m46600V)) != Double.doubleToLongBits(C52324ye6.m3064x(t2, m46600V))) {
                    return false;
                }
                return true;
            case 1:
                if (!m46595a(t, t2, i) || Float.floatToIntBits(C52324ye6.m3063y(t, m46600V)) != Float.floatToIntBits(C52324ye6.m3063y(t2, m46600V))) {
                    return false;
                }
                return true;
            case 2:
                if (!m46595a(t, t2, i) || C52324ye6.m3107A(t, m46600V) != C52324ye6.m3107A(t2, m46600V)) {
                    return false;
                }
                return true;
            case 3:
                if (!m46595a(t, t2, i) || C52324ye6.m3107A(t, m46600V) != C52324ye6.m3107A(t2, m46600V)) {
                    return false;
                }
                return true;
            case 4:
                if (!m46595a(t, t2, i) || C52324ye6.m3062z(t, m46600V) != C52324ye6.m3062z(t2, m46600V)) {
                    return false;
                }
                return true;
            case 5:
                if (!m46595a(t, t2, i) || C52324ye6.m3107A(t, m46600V) != C52324ye6.m3107A(t2, m46600V)) {
                    return false;
                }
                return true;
            case 6:
                if (!m46595a(t, t2, i) || C52324ye6.m3062z(t, m46600V) != C52324ye6.m3062z(t2, m46600V)) {
                    return false;
                }
                return true;
            case 7:
                if (!m46595a(t, t2, i) || C52324ye6.m3070r(t, m46600V) != C52324ye6.m3070r(t2, m46600V)) {
                    return false;
                }
                return true;
            case 8:
                if (!m46595a(t, t2, i) || !C18469J.m46517K(C52324ye6.m3105C(t, m46600V), C52324ye6.m3105C(t2, m46600V))) {
                    return false;
                }
                return true;
            case 9:
                if (!m46595a(t, t2, i) || !C18469J.m46517K(C52324ye6.m3105C(t, m46600V), C52324ye6.m3105C(t2, m46600V))) {
                    return false;
                }
                return true;
            case 10:
                if (!m46595a(t, t2, i) || !C18469J.m46517K(C52324ye6.m3105C(t, m46600V), C52324ye6.m3105C(t2, m46600V))) {
                    return false;
                }
                return true;
            case 11:
                if (!m46595a(t, t2, i) || C52324ye6.m3062z(t, m46600V) != C52324ye6.m3062z(t2, m46600V)) {
                    return false;
                }
                return true;
            case 12:
                if (!m46595a(t, t2, i) || C52324ye6.m3062z(t, m46600V) != C52324ye6.m3062z(t2, m46600V)) {
                    return false;
                }
                return true;
            case 13:
                if (!m46595a(t, t2, i) || C52324ye6.m3062z(t, m46600V) != C52324ye6.m3062z(t2, m46600V)) {
                    return false;
                }
                return true;
            case 14:
                if (!m46595a(t, t2, i) || C52324ye6.m3107A(t, m46600V) != C52324ye6.m3107A(t2, m46600V)) {
                    return false;
                }
                return true;
            case 15:
                if (!m46595a(t, t2, i) || C52324ye6.m3062z(t, m46600V) != C52324ye6.m3062z(t2, m46600V)) {
                    return false;
                }
                return true;
            case 16:
                if (!m46595a(t, t2, i) || C52324ye6.m3107A(t, m46600V) != C52324ye6.m3107A(t2, m46600V)) {
                    return false;
                }
                return true;
            case 17:
                if (!m46595a(t, t2, i) || !C18469J.m46517K(C52324ye6.m3105C(t, m46600V), C52324ye6.m3105C(t2, m46600V))) {
                    return false;
                }
                return true;
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
                return C18469J.m46517K(C52324ye6.m3105C(t, m46600V), C52324ye6.m3105C(t2, m46600V));
            case 50:
                return C18469J.m46517K(C52324ye6.m3105C(t, m46600V), C52324ye6.m3105C(t2, m46600V));
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
                if (!m46616F(t, t2, i) || !C18469J.m46517K(C52324ye6.m3105C(t, m46600V), C52324ye6.m3105C(t2, m46600V))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: o */
    public final <UT, UB> UB m46576o(Object obj, int i, UB ub, AbstractC18480L<UT, UB> abstractC18480L, Object obj2) {
        int m46601U = m46601U(i);
        Object m3105C = C52324ye6.m3105C(obj, m46600V(m46575o0(i)));
        if (m3105C == null) {
            return ub;
        }
        C18544t.InterfaceC18549e m46570r = m46570r(i);
        if (m46570r == null) {
            return ub;
        }
        return (UB) m46574p(i, m46601U, this.f74710q.mo46736e(m3105C), m46570r, ub, abstractC18480L, obj2);
    }

    /* renamed from: o0 */
    public final int m46575o0(int i) {
        return this.f74694a[i + 1];
    }

    /* renamed from: p */
    public final <K, V, UT, UB> UB m46574p(int i, int i2, Map<K, V> map, C18544t.InterfaceC18549e interfaceC18549e, UB ub, AbstractC18480L<UT, UB> abstractC18480L, Object obj) {
        C18565z.C18566a<?, ?> mo46740a = this.f74710q.mo46740a(m46568s(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!interfaceC18549e.mo33504a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = abstractC18480L.mo46406f(obj);
                }
                AbstractC18504e.C18512h m46295v = AbstractC18504e.m46295v(C18565z.m45951b(mo46740a, next.getKey(), next.getValue()));
                try {
                    C18565z.m45948e(m46295v.m46290b(), mo46740a, next.getKey(), next.getValue());
                    abstractC18480L.mo46408d(ub, i2, m46295v.m46291a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x048f  */
    /* renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m46573p0(T t, InterfaceC18497Q interfaceC18497Q) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        int i2;
        if (this.f74699f) {
            C18531o<?> mo46118c = this.f74709p.mo46118c(t);
            if (!mo46118c.m46095n()) {
                it = mo46118c.m46089t();
                entry = it.next();
                length = this.f74694a.length;
                Unsafe unsafe = f74693s;
                int i3 = 1048575;
                int i4 = 1048575;
                i = 0;
                int i5 = 0;
                while (i < length) {
                    int m46575o0 = m46575o0(i);
                    int m46601U = m46601U(i);
                    int m46577n0 = m46577n0(m46575o0);
                    if (m46577n0 <= 17) {
                        int i6 = this.f74694a[i + 2];
                        int i7 = i6 & i3;
                        if (i7 != i4) {
                            i5 = unsafe.getInt(t, i7);
                            i4 = i7;
                        }
                        i2 = 1 << (i6 >>> 20);
                    } else {
                        i2 = 0;
                    }
                    while (entry != null && this.f74709p.mo46120a(entry) <= m46601U) {
                        this.f74709p.mo46111j(interfaceC18497Q, entry);
                        if (it.hasNext()) {
                            entry = it.next();
                        } else {
                            entry = null;
                        }
                    }
                    long m46600V = m46600V(m46575o0);
                    switch (m46577n0) {
                        case 0:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46135z(m46601U, m46580m(t, m46600V));
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 1:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46177F(m46601U, m46572q(t, m46600V));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 2:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46180C(m46601U, unsafe.getLong(t, m46600V));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 3:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46156e(m46601U, unsafe.getLong(t, m46600V));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 4:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46154g(m46601U, unsafe.getInt(t, m46600V));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 5:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46148m(m46601U, unsafe.getLong(t, m46600V));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 6:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46158c(m46601U, unsafe.getInt(t, m46600V));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 7:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46147n(m46601U, m46584k(t, m46600V));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 8:
                            if ((i2 & i5) != 0) {
                                m46565t0(m46601U, unsafe.getObject(t, m46600V), interfaceC18497Q);
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 9:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46170M(m46601U, unsafe.getObject(t, m46600V), m46566t(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 10:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46172K(m46601U, (AbstractC18504e) unsafe.getObject(t, m46600V));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 11:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46150k(m46601U, unsafe.getInt(t, m46600V));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 12:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46176G(m46601U, unsafe.getInt(t, m46600V));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 13:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46146o(m46601U, unsafe.getInt(t, m46600V));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 14:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46138w(m46601U, unsafe.getLong(t, m46600V));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 15:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46174I(m46601U, unsafe.getInt(t, m46600V));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 16:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46151j(m46601U, unsafe.getLong(t, m46600V));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 17:
                            if ((i2 & i5) != 0) {
                                interfaceC18497Q.mo46173J(m46601U, unsafe.getObject(t, m46600V), m46566t(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 18:
                            C18469J.m46512P(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 19:
                            C18469J.m46508T(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 20:
                            C18469J.m46505W(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 21:
                            C18469J.m46492e0(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 22:
                            C18469J.m46506V(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 23:
                            C18469J.m46509S(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 24:
                            C18469J.m46510R(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 25:
                            C18469J.m46514N(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 26:
                            C18469J.m46496c0(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q);
                            break;
                        case 27:
                            C18469J.m46504X(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, m46566t(i));
                            break;
                        case 28:
                            C18469J.m46513O(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q);
                            break;
                        case 29:
                            C18469J.m46494d0(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 30:
                            C18469J.m46511Q(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 31:
                            C18469J.m46503Y(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 32:
                            C18469J.m46502Z(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 33:
                            C18469J.m46500a0(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 34:
                            C18469J.m46498b0(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 35:
                            C18469J.m46512P(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, true);
                            break;
                        case 36:
                            C18469J.m46508T(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, true);
                            break;
                        case 37:
                            C18469J.m46505W(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, true);
                            break;
                        case 38:
                            C18469J.m46492e0(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, true);
                            break;
                        case 39:
                            C18469J.m46506V(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, true);
                            break;
                        case 40:
                            C18469J.m46509S(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, true);
                            break;
                        case 41:
                            C18469J.m46510R(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, true);
                            break;
                        case 42:
                            C18469J.m46514N(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, true);
                            break;
                        case 43:
                            C18469J.m46494d0(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, true);
                            break;
                        case 44:
                            C18469J.m46511Q(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, true);
                            break;
                        case 45:
                            C18469J.m46503Y(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, true);
                            break;
                        case 46:
                            C18469J.m46502Z(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, true);
                            break;
                        case 47:
                            C18469J.m46500a0(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, true);
                            break;
                        case 48:
                            C18469J.m46498b0(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, true);
                            break;
                        case 49:
                            C18469J.m46507U(m46601U(i), (List) unsafe.getObject(t, m46600V), interfaceC18497Q, m46566t(i));
                            break;
                        case 50:
                            m46567s0(interfaceC18497Q, m46601U, unsafe.getObject(t, m46600V), i);
                            break;
                        case 51:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46135z(m46601U, m46598X(t, m46600V));
                                break;
                            }
                            break;
                        case 52:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46177F(m46601U, m46597Y(t, m46600V));
                                break;
                            }
                            break;
                        case 53:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46180C(m46601U, m46594a0(t, m46600V));
                                break;
                            }
                            break;
                        case 54:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46156e(m46601U, m46594a0(t, m46600V));
                                break;
                            }
                            break;
                        case 55:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46154g(m46601U, m46596Z(t, m46600V));
                                break;
                            }
                            break;
                        case 56:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46148m(m46601U, m46594a0(t, m46600V));
                                break;
                            }
                            break;
                        case 57:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46158c(m46601U, m46596Z(t, m46600V));
                                break;
                            }
                            break;
                        case 58:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46147n(m46601U, m46599W(t, m46600V));
                                break;
                            }
                            break;
                        case 59:
                            if (m46615G(t, m46601U, i)) {
                                m46565t0(m46601U, unsafe.getObject(t, m46600V), interfaceC18497Q);
                                break;
                            }
                            break;
                        case 60:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46170M(m46601U, unsafe.getObject(t, m46600V), m46566t(i));
                                break;
                            }
                            break;
                        case 61:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46172K(m46601U, (AbstractC18504e) unsafe.getObject(t, m46600V));
                                break;
                            }
                            break;
                        case 62:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46150k(m46601U, m46596Z(t, m46600V));
                                break;
                            }
                            break;
                        case 63:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46176G(m46601U, m46596Z(t, m46600V));
                                break;
                            }
                            break;
                        case 64:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46146o(m46601U, m46596Z(t, m46600V));
                                break;
                            }
                            break;
                        case 65:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46138w(m46601U, m46594a0(t, m46600V));
                                break;
                            }
                            break;
                        case 66:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46174I(m46601U, m46596Z(t, m46600V));
                                break;
                            }
                            break;
                        case 67:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46151j(m46601U, m46594a0(t, m46600V));
                                break;
                            }
                            break;
                        case 68:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46173J(m46601U, unsafe.getObject(t, m46600V), m46566t(i));
                                break;
                            }
                            break;
                    }
                    i += 3;
                    i3 = 1048575;
                }
                while (entry != null) {
                    this.f74709p.mo46111j(interfaceC18497Q, entry);
                    if (it.hasNext()) {
                        entry = it.next();
                    } else {
                        entry = null;
                    }
                }
                m46563u0(this.f74708o, t, interfaceC18497Q);
            }
        }
        it = null;
        entry = null;
        length = this.f74694a.length;
        Unsafe unsafe2 = f74693s;
        int i32 = 1048575;
        int i42 = 1048575;
        i = 0;
        int i52 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        m46563u0(this.f74708o, t, interfaceC18497Q);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m46571q0(T t, InterfaceC18497Q interfaceC18497Q) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        if (this.f74699f) {
            C18531o<?> mo46118c = this.f74709p.mo46118c(t);
            if (!mo46118c.m46095n()) {
                it = mo46118c.m46089t();
                entry = it.next();
                length = this.f74694a.length;
                for (i = 0; i < length; i += 3) {
                    int m46575o0 = m46575o0(i);
                    int m46601U = m46601U(i);
                    while (entry != null && this.f74709p.mo46120a(entry) <= m46601U) {
                        this.f74709p.mo46111j(interfaceC18497Q, entry);
                        if (it.hasNext()) {
                            entry = it.next();
                        } else {
                            entry = null;
                        }
                    }
                    switch (m46577n0(m46575o0)) {
                        case 0:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46135z(m46601U, m46580m(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46177F(m46601U, m46572q(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46180C(m46601U, m46612J(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46156e(m46601U, m46612J(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46154g(m46601U, m46560x(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46148m(m46601U, m46612J(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46158c(m46601U, m46560x(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46147n(m46601U, m46584k(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (m46558z(t, i)) {
                                m46565t0(m46601U, C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46170M(m46601U, C52324ye6.m3105C(t, m46600V(m46575o0)), m46566t(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46172K(m46601U, (AbstractC18504e) C52324ye6.m3105C(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46150k(m46601U, m46560x(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46176G(m46601U, m46560x(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46146o(m46601U, m46560x(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46138w(m46601U, m46612J(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46174I(m46601U, m46560x(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46151j(m46601U, m46612J(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (m46558z(t, i)) {
                                interfaceC18497Q.mo46173J(m46601U, C52324ye6.m3105C(t, m46600V(m46575o0)), m46566t(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            C18469J.m46512P(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 19:
                            C18469J.m46508T(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 20:
                            C18469J.m46505W(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 21:
                            C18469J.m46492e0(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 22:
                            C18469J.m46506V(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 23:
                            C18469J.m46509S(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 24:
                            C18469J.m46510R(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 25:
                            C18469J.m46514N(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 26:
                            C18469J.m46496c0(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q);
                            break;
                        case 27:
                            C18469J.m46504X(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, m46566t(i));
                            break;
                        case 28:
                            C18469J.m46513O(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q);
                            break;
                        case 29:
                            C18469J.m46494d0(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 30:
                            C18469J.m46511Q(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 31:
                            C18469J.m46503Y(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 32:
                            C18469J.m46502Z(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 33:
                            C18469J.m46500a0(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 34:
                            C18469J.m46498b0(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 35:
                            C18469J.m46512P(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 36:
                            C18469J.m46508T(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 37:
                            C18469J.m46505W(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 38:
                            C18469J.m46492e0(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 39:
                            C18469J.m46506V(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 40:
                            C18469J.m46509S(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 41:
                            C18469J.m46510R(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 42:
                            C18469J.m46514N(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 43:
                            C18469J.m46494d0(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 44:
                            C18469J.m46511Q(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 45:
                            C18469J.m46503Y(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 46:
                            C18469J.m46502Z(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 47:
                            C18469J.m46500a0(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 48:
                            C18469J.m46498b0(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 49:
                            C18469J.m46507U(m46601U(i), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, m46566t(i));
                            break;
                        case 50:
                            m46567s0(interfaceC18497Q, m46601U, C52324ye6.m3105C(t, m46600V(m46575o0)), i);
                            break;
                        case 51:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46135z(m46601U, m46598X(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46177F(m46601U, m46597Y(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46180C(m46601U, m46594a0(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46156e(m46601U, m46594a0(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46154g(m46601U, m46596Z(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46148m(m46601U, m46594a0(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46158c(m46601U, m46596Z(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46147n(m46601U, m46599W(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (m46615G(t, m46601U, i)) {
                                m46565t0(m46601U, C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46170M(m46601U, C52324ye6.m3105C(t, m46600V(m46575o0)), m46566t(i));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46172K(m46601U, (AbstractC18504e) C52324ye6.m3105C(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46150k(m46601U, m46596Z(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46176G(m46601U, m46596Z(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46146o(m46601U, m46596Z(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46138w(m46601U, m46594a0(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46174I(m46601U, m46596Z(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46151j(m46601U, m46594a0(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (m46615G(t, m46601U, i)) {
                                interfaceC18497Q.mo46173J(m46601U, C52324ye6.m3105C(t, m46600V(m46575o0)), m46566t(i));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.f74709p.mo46111j(interfaceC18497Q, entry);
                    if (it.hasNext()) {
                        entry = it.next();
                    } else {
                        entry = null;
                    }
                }
                m46563u0(this.f74708o, t, interfaceC18497Q);
            }
        }
        it = null;
        entry = null;
        length = this.f74694a.length;
        while (i < length) {
        }
        while (entry != null) {
        }
        m46563u0(this.f74708o, t, interfaceC18497Q);
    }

    /* renamed from: r */
    public final C18544t.InterfaceC18549e m46570r(int i) {
        return (C18544t.InterfaceC18549e) this.f74695b[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m46569r0(T t, InterfaceC18497Q interfaceC18497Q) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        m46563u0(this.f74708o, t, interfaceC18497Q);
        if (this.f74699f) {
            C18531o<?> mo46118c = this.f74709p.mo46118c(t);
            if (!mo46118c.m46095n()) {
                it = mo46118c.m46102g();
                entry = it.next();
                for (length = this.f74694a.length - 3; length >= 0; length -= 3) {
                    int m46575o0 = m46575o0(length);
                    int m46601U = m46601U(length);
                    while (entry != null && this.f74709p.mo46120a(entry) > m46601U) {
                        this.f74709p.mo46111j(interfaceC18497Q, entry);
                        if (it.hasNext()) {
                            entry = it.next();
                        } else {
                            entry = null;
                        }
                    }
                    switch (m46577n0(m46575o0)) {
                        case 0:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46135z(m46601U, m46580m(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46177F(m46601U, m46572q(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46180C(m46601U, m46612J(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46156e(m46601U, m46612J(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46154g(m46601U, m46560x(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46148m(m46601U, m46612J(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46158c(m46601U, m46560x(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46147n(m46601U, m46584k(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (m46558z(t, length)) {
                                m46565t0(m46601U, C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46170M(m46601U, C52324ye6.m3105C(t, m46600V(m46575o0)), m46566t(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46172K(m46601U, (AbstractC18504e) C52324ye6.m3105C(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46150k(m46601U, m46560x(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46176G(m46601U, m46560x(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46146o(m46601U, m46560x(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46138w(m46601U, m46612J(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46174I(m46601U, m46560x(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46151j(m46601U, m46612J(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (m46558z(t, length)) {
                                interfaceC18497Q.mo46173J(m46601U, C52324ye6.m3105C(t, m46600V(m46575o0)), m46566t(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            C18469J.m46512P(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 19:
                            C18469J.m46508T(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 20:
                            C18469J.m46505W(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 21:
                            C18469J.m46492e0(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 22:
                            C18469J.m46506V(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 23:
                            C18469J.m46509S(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 24:
                            C18469J.m46510R(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 25:
                            C18469J.m46514N(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 26:
                            C18469J.m46496c0(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q);
                            break;
                        case 27:
                            C18469J.m46504X(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, m46566t(length));
                            break;
                        case 28:
                            C18469J.m46513O(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q);
                            break;
                        case 29:
                            C18469J.m46494d0(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 30:
                            C18469J.m46511Q(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 31:
                            C18469J.m46503Y(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 32:
                            C18469J.m46502Z(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 33:
                            C18469J.m46500a0(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 34:
                            C18469J.m46498b0(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, false);
                            break;
                        case 35:
                            C18469J.m46512P(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 36:
                            C18469J.m46508T(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 37:
                            C18469J.m46505W(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 38:
                            C18469J.m46492e0(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 39:
                            C18469J.m46506V(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 40:
                            C18469J.m46509S(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 41:
                            C18469J.m46510R(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 42:
                            C18469J.m46514N(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 43:
                            C18469J.m46494d0(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 44:
                            C18469J.m46511Q(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 45:
                            C18469J.m46503Y(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 46:
                            C18469J.m46502Z(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 47:
                            C18469J.m46500a0(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 48:
                            C18469J.m46498b0(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, true);
                            break;
                        case 49:
                            C18469J.m46507U(m46601U(length), (List) C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q, m46566t(length));
                            break;
                        case 50:
                            m46567s0(interfaceC18497Q, m46601U, C52324ye6.m3105C(t, m46600V(m46575o0)), length);
                            break;
                        case 51:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46135z(m46601U, m46598X(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46177F(m46601U, m46597Y(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46180C(m46601U, m46594a0(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46156e(m46601U, m46594a0(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46154g(m46601U, m46596Z(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46148m(m46601U, m46594a0(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46158c(m46601U, m46596Z(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46147n(m46601U, m46599W(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (m46615G(t, m46601U, length)) {
                                m46565t0(m46601U, C52324ye6.m3105C(t, m46600V(m46575o0)), interfaceC18497Q);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46170M(m46601U, C52324ye6.m3105C(t, m46600V(m46575o0)), m46566t(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46172K(m46601U, (AbstractC18504e) C52324ye6.m3105C(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46150k(m46601U, m46596Z(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46176G(m46601U, m46596Z(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46146o(m46601U, m46596Z(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46138w(m46601U, m46594a0(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46174I(m46601U, m46596Z(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46151j(m46601U, m46594a0(t, m46600V(m46575o0)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (m46615G(t, m46601U, length)) {
                                interfaceC18497Q.mo46173J(m46601U, C52324ye6.m3105C(t, m46600V(m46575o0)), m46566t(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.f74709p.mo46111j(interfaceC18497Q, entry);
                    if (it.hasNext()) {
                        entry = it.next();
                    } else {
                        entry = null;
                    }
                }
            }
        }
        it = null;
        entry = null;
        while (length >= 0) {
        }
        while (entry != null) {
        }
    }

    /* renamed from: s */
    public final Object m46568s(int i) {
        return this.f74695b[(i / 3) * 2];
    }

    /* renamed from: s0 */
    public final <K, V> void m46567s0(InterfaceC18497Q interfaceC18497Q, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            interfaceC18497Q.mo46169N(i, this.f74710q.mo46740a(m46568s(i2)), this.f74710q.mo46734g(obj));
        }
    }

    /* renamed from: t */
    public final InterfaceC33832Jm5 m46566t(int i) {
        int i2 = (i / 3) * 2;
        InterfaceC33832Jm5 interfaceC33832Jm5 = (InterfaceC33832Jm5) this.f74695b[i2];
        if (interfaceC33832Jm5 != null) {
            return interfaceC33832Jm5;
        }
        InterfaceC33832Jm5<T> m97647c = L94.m97649a().m97647c((Class) this.f74695b[i2 + 1]);
        this.f74695b[i2] = m97647c;
        return m97647c;
    }

    /* renamed from: t0 */
    public final void m46565t0(int i, Object obj, InterfaceC18497Q interfaceC18497Q) throws IOException {
        if (obj instanceof String) {
            interfaceC18497Q.mo46157d(i, (String) obj);
        } else {
            interfaceC18497Q.mo46172K(i, (AbstractC18504e) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: u */
    public final int m46564u(T t) {
        int i;
        int i2;
        int m46682i;
        int m46689d;
        int m46718J;
        boolean z;
        int m46491f;
        int m46488i;
        int m46701T;
        int m46699V;
        Unsafe unsafe = f74693s;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.f74694a.length) {
            int m46575o0 = m46575o0(i5);
            int m46601U = m46601U(i5);
            int m46577n0 = m46577n0(m46575o0);
            if (m46577n0 <= 17) {
                i = this.f74694a[i5 + 2];
                int i8 = i & i3;
                i2 = 1 << (i >>> 20);
                if (i8 != i4) {
                    i7 = unsafe.getInt(t, i8);
                    i4 = i8;
                }
            } else {
                if (this.f74702i && m46577n0 >= EnumC38142al1.f51137T.m70794b() && m46577n0 <= EnumC38142al1.f51167w0.m70794b()) {
                    i = this.f74694a[i5 + 2] & i3;
                } else {
                    i = 0;
                }
                i2 = 0;
            }
            long m46600V = m46600V(m46575o0);
            switch (m46577n0) {
                case 0:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m46682i = CodedOutputStream.m46682i(m46601U, 0.0d);
                        i6 += m46682i;
                        break;
                    }
                case 1:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m46682i = CodedOutputStream.m46669q(m46601U, 0.0f);
                        i6 += m46682i;
                        break;
                    }
                case 2:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m46682i = CodedOutputStream.m46659x(m46601U, unsafe.getLong(t, m46600V));
                        i6 += m46682i;
                        break;
                    }
                case 3:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m46682i = CodedOutputStream.m46698W(m46601U, unsafe.getLong(t, m46600V));
                        i6 += m46682i;
                        break;
                    }
                case 4:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m46682i = CodedOutputStream.m46663v(m46601U, unsafe.getInt(t, m46600V));
                        i6 += m46682i;
                        break;
                    }
                case 5:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m46682i = CodedOutputStream.m46673o(m46601U, 0L);
                        i6 += m46682i;
                        break;
                    }
                case 6:
                    if ((i7 & i2) != 0) {
                        m46682i = CodedOutputStream.m46677m(m46601U, 0);
                        i6 += m46682i;
                        break;
                    }
                    break;
                case 7:
                    if ((i7 & i2) != 0) {
                        m46689d = CodedOutputStream.m46689d(m46601U, true);
                        i6 += m46689d;
                    }
                    break;
                case 8:
                    if ((i7 & i2) != 0) {
                        Object object = unsafe.getObject(t, m46600V);
                        if (object instanceof AbstractC18504e) {
                            m46689d = CodedOutputStream.m46685g(m46601U, (AbstractC18504e) object);
                        } else {
                            m46689d = CodedOutputStream.m46703R(m46601U, (String) object);
                        }
                        i6 += m46689d;
                    }
                    break;
                case 9:
                    if ((i7 & i2) != 0) {
                        m46689d = C18469J.m46482o(m46601U, unsafe.getObject(t, m46600V), m46566t(i5));
                        i6 += m46689d;
                    }
                    break;
                case 10:
                    if ((i7 & i2) != 0) {
                        m46689d = CodedOutputStream.m46685g(m46601U, (AbstractC18504e) unsafe.getObject(t, m46600V));
                        i6 += m46689d;
                    }
                    break;
                case 11:
                    if ((i7 & i2) != 0) {
                        m46689d = CodedOutputStream.m46700U(m46601U, unsafe.getInt(t, m46600V));
                        i6 += m46689d;
                    }
                    break;
                case 12:
                    if ((i7 & i2) != 0) {
                        m46689d = CodedOutputStream.m46679k(m46601U, unsafe.getInt(t, m46600V));
                        i6 += m46689d;
                    }
                    break;
                case 13:
                    if ((i7 & i2) != 0) {
                        m46718J = CodedOutputStream.m46718J(m46601U, 0);
                        i6 += m46718J;
                    }
                    break;
                case 14:
                    if ((i7 & i2) != 0) {
                        m46689d = CodedOutputStream.m46714L(m46601U, 0L);
                        i6 += m46689d;
                    }
                    break;
                case 15:
                    if ((i7 & i2) != 0) {
                        m46689d = CodedOutputStream.m46710N(m46601U, unsafe.getInt(t, m46600V));
                        i6 += m46689d;
                    }
                    break;
                case 16:
                    if ((i7 & i2) != 0) {
                        m46689d = CodedOutputStream.m46706P(m46601U, unsafe.getLong(t, m46600V));
                        i6 += m46689d;
                    }
                    break;
                case 17:
                    if ((i7 & i2) != 0) {
                        m46689d = CodedOutputStream.m46667s(m46601U, (InterfaceC18462D) unsafe.getObject(t, m46600V), m46566t(i5));
                        i6 += m46689d;
                    }
                    break;
                case 18:
                    m46689d = C18469J.m46489h(m46601U, (List) unsafe.getObject(t, m46600V), false);
                    i6 += m46689d;
                    break;
                case 19:
                    z = false;
                    m46491f = C18469J.m46491f(m46601U, (List) unsafe.getObject(t, m46600V), false);
                    i6 += m46491f;
                    break;
                case 20:
                    z = false;
                    m46491f = C18469J.m46484m(m46601U, (List) unsafe.getObject(t, m46600V), false);
                    i6 += m46491f;
                    break;
                case 21:
                    z = false;
                    m46491f = C18469J.m46473x(m46601U, (List) unsafe.getObject(t, m46600V), false);
                    i6 += m46491f;
                    break;
                case 22:
                    z = false;
                    m46491f = C18469J.m46486k(m46601U, (List) unsafe.getObject(t, m46600V), false);
                    i6 += m46491f;
                    break;
                case 23:
                    z = false;
                    m46491f = C18469J.m46489h(m46601U, (List) unsafe.getObject(t, m46600V), false);
                    i6 += m46491f;
                    break;
                case 24:
                    z = false;
                    m46491f = C18469J.m46491f(m46601U, (List) unsafe.getObject(t, m46600V), false);
                    i6 += m46491f;
                    break;
                case 25:
                    z = false;
                    m46491f = C18469J.m46501a(m46601U, (List) unsafe.getObject(t, m46600V), false);
                    i6 += m46491f;
                    break;
                case 26:
                    m46689d = C18469J.m46476u(m46601U, (List) unsafe.getObject(t, m46600V));
                    i6 += m46689d;
                    break;
                case 27:
                    m46689d = C18469J.m46481p(m46601U, (List) unsafe.getObject(t, m46600V), m46566t(i5));
                    i6 += m46689d;
                    break;
                case 28:
                    m46689d = C18469J.m46497c(m46601U, (List) unsafe.getObject(t, m46600V));
                    i6 += m46689d;
                    break;
                case 29:
                    m46689d = C18469J.m46475v(m46601U, (List) unsafe.getObject(t, m46600V), false);
                    i6 += m46689d;
                    break;
                case 30:
                    z = false;
                    m46491f = C18469J.m46495d(m46601U, (List) unsafe.getObject(t, m46600V), false);
                    i6 += m46491f;
                    break;
                case 31:
                    z = false;
                    m46491f = C18469J.m46491f(m46601U, (List) unsafe.getObject(t, m46600V), false);
                    i6 += m46491f;
                    break;
                case 32:
                    z = false;
                    m46491f = C18469J.m46489h(m46601U, (List) unsafe.getObject(t, m46600V), false);
                    i6 += m46491f;
                    break;
                case 33:
                    z = false;
                    m46491f = C18469J.m46480q(m46601U, (List) unsafe.getObject(t, m46600V), false);
                    i6 += m46491f;
                    break;
                case 34:
                    z = false;
                    m46491f = C18469J.m46478s(m46601U, (List) unsafe.getObject(t, m46600V), false);
                    i6 += m46491f;
                    break;
                case 35:
                    m46488i = C18469J.m46488i((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46718J = m46701T + m46699V + m46488i;
                        i6 += m46718J;
                    }
                    break;
                case 36:
                    m46488i = C18469J.m46490g((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46718J = m46701T + m46699V + m46488i;
                        i6 += m46718J;
                    }
                    break;
                case 37:
                    m46488i = C18469J.m46483n((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46718J = m46701T + m46699V + m46488i;
                        i6 += m46718J;
                    }
                    break;
                case 38:
                    m46488i = C18469J.m46472y((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46718J = m46701T + m46699V + m46488i;
                        i6 += m46718J;
                    }
                    break;
                case 39:
                    m46488i = C18469J.m46485l((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46718J = m46701T + m46699V + m46488i;
                        i6 += m46718J;
                    }
                    break;
                case 40:
                    m46488i = C18469J.m46488i((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46718J = m46701T + m46699V + m46488i;
                        i6 += m46718J;
                    }
                    break;
                case 41:
                    m46488i = C18469J.m46490g((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46718J = m46701T + m46699V + m46488i;
                        i6 += m46718J;
                    }
                    break;
                case 42:
                    m46488i = C18469J.m46499b((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46718J = m46701T + m46699V + m46488i;
                        i6 += m46718J;
                    }
                    break;
                case 43:
                    m46488i = C18469J.m46474w((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46718J = m46701T + m46699V + m46488i;
                        i6 += m46718J;
                    }
                    break;
                case 44:
                    m46488i = C18469J.m46493e((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46718J = m46701T + m46699V + m46488i;
                        i6 += m46718J;
                    }
                    break;
                case 45:
                    m46488i = C18469J.m46490g((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46718J = m46701T + m46699V + m46488i;
                        i6 += m46718J;
                    }
                    break;
                case 46:
                    m46488i = C18469J.m46488i((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46718J = m46701T + m46699V + m46488i;
                        i6 += m46718J;
                    }
                    break;
                case 47:
                    m46488i = C18469J.m46479r((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46718J = m46701T + m46699V + m46488i;
                        i6 += m46718J;
                    }
                    break;
                case 48:
                    m46488i = C18469J.m46477t((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46718J = m46701T + m46699V + m46488i;
                        i6 += m46718J;
                    }
                    break;
                case 49:
                    m46689d = C18469J.m46487j(m46601U, (List) unsafe.getObject(t, m46600V), m46566t(i5));
                    i6 += m46689d;
                    break;
                case 50:
                    m46689d = this.f74710q.mo46737d(m46601U, unsafe.getObject(t, m46600V), m46568s(i5));
                    i6 += m46689d;
                    break;
                case 51:
                    if (m46615G(t, m46601U, i5)) {
                        m46689d = CodedOutputStream.m46682i(m46601U, 0.0d);
                        i6 += m46689d;
                    }
                    break;
                case 52:
                    if (m46615G(t, m46601U, i5)) {
                        m46689d = CodedOutputStream.m46669q(m46601U, 0.0f);
                        i6 += m46689d;
                    }
                    break;
                case 53:
                    if (m46615G(t, m46601U, i5)) {
                        m46689d = CodedOutputStream.m46659x(m46601U, m46594a0(t, m46600V));
                        i6 += m46689d;
                    }
                    break;
                case 54:
                    if (m46615G(t, m46601U, i5)) {
                        m46689d = CodedOutputStream.m46698W(m46601U, m46594a0(t, m46600V));
                        i6 += m46689d;
                    }
                    break;
                case 55:
                    if (m46615G(t, m46601U, i5)) {
                        m46689d = CodedOutputStream.m46663v(m46601U, m46596Z(t, m46600V));
                        i6 += m46689d;
                    }
                    break;
                case 56:
                    if (m46615G(t, m46601U, i5)) {
                        m46689d = CodedOutputStream.m46673o(m46601U, 0L);
                        i6 += m46689d;
                    }
                    break;
                case 57:
                    if (m46615G(t, m46601U, i5)) {
                        m46718J = CodedOutputStream.m46677m(m46601U, 0);
                        i6 += m46718J;
                    }
                    break;
                case 58:
                    if (m46615G(t, m46601U, i5)) {
                        m46689d = CodedOutputStream.m46689d(m46601U, true);
                        i6 += m46689d;
                    }
                    break;
                case 59:
                    if (m46615G(t, m46601U, i5)) {
                        Object object2 = unsafe.getObject(t, m46600V);
                        if (object2 instanceof AbstractC18504e) {
                            m46689d = CodedOutputStream.m46685g(m46601U, (AbstractC18504e) object2);
                        } else {
                            m46689d = CodedOutputStream.m46703R(m46601U, (String) object2);
                        }
                        i6 += m46689d;
                    }
                    break;
                case 60:
                    if (m46615G(t, m46601U, i5)) {
                        m46689d = C18469J.m46482o(m46601U, unsafe.getObject(t, m46600V), m46566t(i5));
                        i6 += m46689d;
                    }
                    break;
                case 61:
                    if (m46615G(t, m46601U, i5)) {
                        m46689d = CodedOutputStream.m46685g(m46601U, (AbstractC18504e) unsafe.getObject(t, m46600V));
                        i6 += m46689d;
                    }
                    break;
                case 62:
                    if (m46615G(t, m46601U, i5)) {
                        m46689d = CodedOutputStream.m46700U(m46601U, m46596Z(t, m46600V));
                        i6 += m46689d;
                    }
                    break;
                case 63:
                    if (m46615G(t, m46601U, i5)) {
                        m46689d = CodedOutputStream.m46679k(m46601U, m46596Z(t, m46600V));
                        i6 += m46689d;
                    }
                    break;
                case 64:
                    if (m46615G(t, m46601U, i5)) {
                        m46718J = CodedOutputStream.m46718J(m46601U, 0);
                        i6 += m46718J;
                    }
                    break;
                case 65:
                    if (m46615G(t, m46601U, i5)) {
                        m46689d = CodedOutputStream.m46714L(m46601U, 0L);
                        i6 += m46689d;
                    }
                    break;
                case 66:
                    if (m46615G(t, m46601U, i5)) {
                        m46689d = CodedOutputStream.m46710N(m46601U, m46596Z(t, m46600V));
                        i6 += m46689d;
                    }
                    break;
                case 67:
                    if (m46615G(t, m46601U, i5)) {
                        m46689d = CodedOutputStream.m46706P(m46601U, m46594a0(t, m46600V));
                        i6 += m46689d;
                    }
                    break;
                case 68:
                    if (m46615G(t, m46601U, i5)) {
                        m46689d = CodedOutputStream.m46667s(m46601U, (InterfaceC18462D) unsafe.getObject(t, m46600V), m46566t(i5));
                        i6 += m46689d;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        int m46561w = i6 + m46561w(this.f74708o, t);
        if (this.f74699f) {
            return m46561w + this.f74709p.mo46118c(t).m46097l();
        }
        return m46561w;
    }

    /* renamed from: u0 */
    public final <UT, UB> void m46563u0(AbstractC18480L<UT, UB> abstractC18480L, T t, InterfaceC18497Q interfaceC18497Q) throws IOException {
        abstractC18480L.mo46394t(abstractC18480L.mo46405g(t), interfaceC18497Q);
    }

    /* renamed from: v */
    public final int m46562v(T t) {
        int i;
        int m46682i;
        int m46488i;
        int m46701T;
        int m46699V;
        Unsafe unsafe = f74693s;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f74694a.length; i3 += 3) {
            int m46575o0 = m46575o0(i3);
            int m46577n0 = m46577n0(m46575o0);
            int m46601U = m46601U(i3);
            long m46600V = m46600V(m46575o0);
            if (m46577n0 >= EnumC38142al1.f51137T.m70794b() && m46577n0 <= EnumC38142al1.f51167w0.m70794b()) {
                i = this.f74694a[i3 + 2] & 1048575;
            } else {
                i = 0;
            }
            switch (m46577n0) {
                case 0:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46682i(m46601U, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46669q(m46601U, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46659x(m46601U, C52324ye6.m3107A(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46698W(m46601U, C52324ye6.m3107A(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46663v(m46601U, C52324ye6.m3062z(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46673o(m46601U, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46677m(m46601U, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46689d(m46601U, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (m46558z(t, i3)) {
                        Object m3105C = C52324ye6.m3105C(t, m46600V);
                        if (m3105C instanceof AbstractC18504e) {
                            m46682i = CodedOutputStream.m46685g(m46601U, (AbstractC18504e) m3105C);
                            break;
                        } else {
                            m46682i = CodedOutputStream.m46703R(m46601U, (String) m3105C);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (m46558z(t, i3)) {
                        m46682i = C18469J.m46482o(m46601U, C52324ye6.m3105C(t, m46600V), m46566t(i3));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46685g(m46601U, (AbstractC18504e) C52324ye6.m3105C(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46700U(m46601U, C52324ye6.m3062z(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46679k(m46601U, C52324ye6.m3062z(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46718J(m46601U, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46714L(m46601U, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46710N(m46601U, C52324ye6.m3062z(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46706P(m46601U, C52324ye6.m3107A(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (m46558z(t, i3)) {
                        m46682i = CodedOutputStream.m46667s(m46601U, (InterfaceC18462D) C52324ye6.m3105C(t, m46600V), m46566t(i3));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    m46682i = C18469J.m46489h(m46601U, m46613I(t, m46600V), false);
                    break;
                case 19:
                    m46682i = C18469J.m46491f(m46601U, m46613I(t, m46600V), false);
                    break;
                case 20:
                    m46682i = C18469J.m46484m(m46601U, m46613I(t, m46600V), false);
                    break;
                case 21:
                    m46682i = C18469J.m46473x(m46601U, m46613I(t, m46600V), false);
                    break;
                case 22:
                    m46682i = C18469J.m46486k(m46601U, m46613I(t, m46600V), false);
                    break;
                case 23:
                    m46682i = C18469J.m46489h(m46601U, m46613I(t, m46600V), false);
                    break;
                case 24:
                    m46682i = C18469J.m46491f(m46601U, m46613I(t, m46600V), false);
                    break;
                case 25:
                    m46682i = C18469J.m46501a(m46601U, m46613I(t, m46600V), false);
                    break;
                case 26:
                    m46682i = C18469J.m46476u(m46601U, m46613I(t, m46600V));
                    break;
                case 27:
                    m46682i = C18469J.m46481p(m46601U, m46613I(t, m46600V), m46566t(i3));
                    break;
                case 28:
                    m46682i = C18469J.m46497c(m46601U, m46613I(t, m46600V));
                    break;
                case 29:
                    m46682i = C18469J.m46475v(m46601U, m46613I(t, m46600V), false);
                    break;
                case 30:
                    m46682i = C18469J.m46495d(m46601U, m46613I(t, m46600V), false);
                    break;
                case 31:
                    m46682i = C18469J.m46491f(m46601U, m46613I(t, m46600V), false);
                    break;
                case 32:
                    m46682i = C18469J.m46489h(m46601U, m46613I(t, m46600V), false);
                    break;
                case 33:
                    m46682i = C18469J.m46480q(m46601U, m46613I(t, m46600V), false);
                    break;
                case 34:
                    m46682i = C18469J.m46478s(m46601U, m46613I(t, m46600V), false);
                    break;
                case 35:
                    m46488i = C18469J.m46488i((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46682i = m46701T + m46699V + m46488i;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    m46488i = C18469J.m46490g((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46682i = m46701T + m46699V + m46488i;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    m46488i = C18469J.m46483n((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46682i = m46701T + m46699V + m46488i;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    m46488i = C18469J.m46472y((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46682i = m46701T + m46699V + m46488i;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    m46488i = C18469J.m46485l((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46682i = m46701T + m46699V + m46488i;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    m46488i = C18469J.m46488i((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46682i = m46701T + m46699V + m46488i;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    m46488i = C18469J.m46490g((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46682i = m46701T + m46699V + m46488i;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    m46488i = C18469J.m46499b((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46682i = m46701T + m46699V + m46488i;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    m46488i = C18469J.m46474w((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46682i = m46701T + m46699V + m46488i;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    m46488i = C18469J.m46493e((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46682i = m46701T + m46699V + m46488i;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    m46488i = C18469J.m46490g((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46682i = m46701T + m46699V + m46488i;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    m46488i = C18469J.m46488i((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46682i = m46701T + m46699V + m46488i;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    m46488i = C18469J.m46479r((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46682i = m46701T + m46699V + m46488i;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    m46488i = C18469J.m46477t((List) unsafe.getObject(t, m46600V));
                    if (m46488i > 0) {
                        if (this.f74702i) {
                            unsafe.putInt(t, i, m46488i);
                        }
                        m46701T = CodedOutputStream.m46701T(m46601U);
                        m46699V = CodedOutputStream.m46699V(m46488i);
                        m46682i = m46701T + m46699V + m46488i;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    m46682i = C18469J.m46487j(m46601U, m46613I(t, m46600V), m46566t(i3));
                    break;
                case 50:
                    m46682i = this.f74710q.mo46737d(m46601U, C52324ye6.m3105C(t, m46600V), m46568s(i3));
                    break;
                case 51:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46682i(m46601U, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46669q(m46601U, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46659x(m46601U, m46594a0(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46698W(m46601U, m46594a0(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46663v(m46601U, m46596Z(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46673o(m46601U, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46677m(m46601U, 0);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46689d(m46601U, true);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (m46615G(t, m46601U, i3)) {
                        Object m3105C2 = C52324ye6.m3105C(t, m46600V);
                        if (m3105C2 instanceof AbstractC18504e) {
                            m46682i = CodedOutputStream.m46685g(m46601U, (AbstractC18504e) m3105C2);
                            break;
                        } else {
                            m46682i = CodedOutputStream.m46703R(m46601U, (String) m3105C2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = C18469J.m46482o(m46601U, C52324ye6.m3105C(t, m46600V), m46566t(i3));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46685g(m46601U, (AbstractC18504e) C52324ye6.m3105C(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46700U(m46601U, m46596Z(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46679k(m46601U, m46596Z(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46718J(m46601U, 0);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46714L(m46601U, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46710N(m46601U, m46596Z(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46706P(m46601U, m46594a0(t, m46600V));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (m46615G(t, m46601U, i3)) {
                        m46682i = CodedOutputStream.m46667s(m46601U, (InterfaceC18462D) C52324ye6.m3105C(t, m46600V), m46566t(i3));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i2 += m46682i;
        }
        return i2 + m46561w(this.f74708o, t);
    }

    /* renamed from: w */
    public final <UT, UB> int m46561w(AbstractC18480L<UT, UB> abstractC18480L, T t) {
        return abstractC18480L.mo46404h(abstractC18480L.mo46405g(t));
    }

    /* renamed from: z */
    public final boolean m46558z(T t, int i) {
        int m46592c0 = m46592c0(i);
        long j = 1048575 & m46592c0;
        if (j == 1048575) {
            int m46575o0 = m46575o0(i);
            long m46600V = m46600V(m46575o0);
            switch (m46577n0(m46575o0)) {
                case 0:
                    if (Double.doubleToRawLongBits(C52324ye6.m3064x(t, m46600V)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(C52324ye6.m3063y(t, m46600V)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C52324ye6.m3107A(t, m46600V) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C52324ye6.m3107A(t, m46600V) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C52324ye6.m3062z(t, m46600V) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C52324ye6.m3107A(t, m46600V) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C52324ye6.m3062z(t, m46600V) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C52324ye6.m3070r(t, m46600V);
                case 8:
                    Object m3105C = C52324ye6.m3105C(t, m46600V);
                    if (m3105C instanceof String) {
                        return !((String) m3105C).isEmpty();
                    }
                    if (m3105C instanceof AbstractC18504e) {
                        return !AbstractC18504e.f74797c.equals(m3105C);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C52324ye6.m3105C(t, m46600V) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !AbstractC18504e.f74797c.equals(C52324ye6.m3105C(t, m46600V));
                case 11:
                    if (C52324ye6.m3062z(t, m46600V) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C52324ye6.m3062z(t, m46600V) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (C52324ye6.m3062z(t, m46600V) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C52324ye6.m3107A(t, m46600V) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C52324ye6.m3062z(t, m46600V) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C52324ye6.m3107A(t, m46600V) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C52324ye6.m3105C(t, m46600V) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((C52324ye6.m3062z(t, j) & (1 << (m46592c0 >>> 20))) == 0) {
            return false;
        }
        return true;
    }
}
