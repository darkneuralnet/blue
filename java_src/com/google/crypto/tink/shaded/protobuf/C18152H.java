package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.C18142B;
import com.google.crypto.tink.shaded.protobuf.C18192d;
import com.google.crypto.tink.shaded.protobuf.C18225q;
import com.google.crypto.tink.shaded.protobuf.C18238v;
import com.google.crypto.tink.shaded.protobuf.InterfaceC18186V;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;
/* renamed from: com.google.crypto.tink.shaded.protobuf.H */
/* loaded from: classes6.dex */
public final class C18152H<T> implements InterfaceC18157M<T> {

    /* renamed from: r */
    public static final int[] f74025r = new int[0];

    /* renamed from: s */
    public static final Unsafe f74026s = C52917ze6.m931D();

    /* renamed from: a */
    public final int[] f74027a;

    /* renamed from: b */
    public final Object[] f74028b;

    /* renamed from: c */
    public final int f74029c;

    /* renamed from: d */
    public final int f74030d;

    /* renamed from: e */
    public final InterfaceC18149F f74031e;

    /* renamed from: f */
    public final boolean f74032f;

    /* renamed from: g */
    public final boolean f74033g;

    /* renamed from: h */
    public final boolean f74034h;

    /* renamed from: i */
    public final boolean f74035i;

    /* renamed from: j */
    public final int[] f74036j;

    /* renamed from: k */
    public final int f74037k;

    /* renamed from: l */
    public final int f74038l;

    /* renamed from: m */
    public final Z73 f74039m;

    /* renamed from: n */
    public final AbstractC18254z f74040n;

    /* renamed from: o */
    public final AbstractC18169P<?, ?> f74041o;

    /* renamed from: p */
    public final AbstractC18221n<?> f74042p;

    /* renamed from: q */
    public final InterfaceC18147D f74043q;

    public C18152H(int[] iArr, Object[] objArr, int i, int i2, InterfaceC18149F interfaceC18149F, boolean z, boolean z2, int[] iArr2, int i3, int i4, Z73 z73, AbstractC18254z abstractC18254z, AbstractC18169P<?, ?> abstractC18169P, AbstractC18221n<?> abstractC18221n, InterfaceC18147D interfaceC18147D) {
        boolean z3;
        this.f74027a = iArr;
        this.f74028b = objArr;
        this.f74029c = i;
        this.f74030d = i2;
        this.f74033g = interfaceC18149F instanceof AbstractC18230t;
        this.f74034h = z;
        if (abstractC18221n != null && abstractC18221n.mo47523e(interfaceC18149F)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f74032f = z3;
        this.f74035i = z2;
        this.f74036j = iArr2;
        this.f74037k = i3;
        this.f74038l = i4;
        this.f74039m = z73;
        this.f74040n = abstractC18254z;
        this.f74041o = abstractC18169P;
        this.f74042p = abstractC18221n;
        this.f74031e = interfaceC18149F;
        this.f74043q = interfaceC18147D;
    }

    /* renamed from: A */
    public static boolean m48082A(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public static boolean m48079D(Object obj, int i, InterfaceC18157M interfaceC18157M) {
        return interfaceC18157M.mo47989f(C52917ze6.m932C(obj, m48062U(i)));
    }

    /* renamed from: I */
    public static boolean m48074I(int i) {
        return (i & 268435456) != 0;
    }

    /* renamed from: J */
    public static List<?> m48073J(Object obj, long j) {
        return (List) C52917ze6.m932C(obj, j);
    }

    /* renamed from: K */
    public static <T> long m48072K(T t, long j) {
        return C52917ze6.m934A(t, j);
    }

    /* renamed from: Q */
    public static <T> C18152H<T> m48066Q(Class<T> cls, InterfaceC48068rT2 interfaceC48068rT2, Z73 z73, AbstractC18254z abstractC18254z, AbstractC18169P<?, ?> abstractC18169P, AbstractC18221n<?> abstractC18221n, InterfaceC18147D interfaceC18147D) {
        if (interfaceC48068rT2 instanceof C48855sn4) {
            return m48064S((C48855sn4) interfaceC48068rT2, z73, abstractC18254z, abstractC18169P, abstractC18221n, interfaceC18147D);
        }
        return m48065R((QS5) interfaceC48068rT2, z73, abstractC18254z, abstractC18169P, abstractC18221n, interfaceC18147D);
    }

    /* renamed from: R */
    public static <T> C18152H<T> m48065R(QS5 qs5, Z73 z73, AbstractC18254z abstractC18254z, AbstractC18169P<?, ?> abstractC18169P, AbstractC18221n<?> abstractC18221n, InterfaceC18147D interfaceC18147D) {
        boolean z;
        if (qs5.mo13674c() == J94.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        C18224p[] m88497e = qs5.m88497e();
        if (m88497e.length == 0) {
            int length = m88497e.length;
            int[] iArr = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            if (m88497e.length <= 0) {
                int[] m88498d = qs5.m88498d();
                if (m88498d == null) {
                    m88498d = f74025r;
                }
                if (m88497e.length <= 0) {
                    int[] iArr2 = f74025r;
                    int[] iArr3 = f74025r;
                    int[] iArr4 = new int[m88498d.length + iArr2.length + iArr3.length];
                    System.arraycopy(m88498d, 0, iArr4, 0, m88498d.length);
                    System.arraycopy(iArr2, 0, iArr4, m88498d.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, m88498d.length + iArr2.length, iArr3.length);
                    return new C18152H<>(iArr, objArr, 0, 0, qs5.mo13675b(), z, true, iArr4, m88498d.length, m88498d.length + iArr2.length, z73, abstractC18254z, abstractC18169P, abstractC18221n, interfaceC18147D);
                }
                C18224p c18224p = m88497e[0];
                throw null;
            }
            C18224p c18224p2 = m88497e[0];
            throw null;
        }
        C18224p c18224p3 = m88497e[0];
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
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> C18152H<T> m48064S(C48855sn4 c48855sn4, Z73 z73, AbstractC18254z abstractC18254z, AbstractC18169P<?, ?> abstractC18169P, AbstractC18221n<?> abstractC18221n, InterfaceC18147D interfaceC18147D) {
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
        Field m48041m0;
        char charAt14;
        int i21;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field m48041m02;
        Object obj2;
        Field m48041m03;
        int i25;
        char charAt15;
        int i26;
        char charAt16;
        int i27;
        char charAt17;
        int i28;
        char charAt18;
        if (c48855sn4.mo13674c() == J94.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        String m13672e = c48855sn4.m13672e();
        int length = m13672e.length();
        char c = 55296;
        if (m13672e.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i = i29 + 1;
                if (m13672e.charAt(i29) < 55296) {
                    break;
                }
                i29 = i;
            }
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int charAt19 = m13672e.charAt(i);
        if (charAt19 >= 55296) {
            int i31 = charAt19 & 8191;
            int i32 = 13;
            while (true) {
                i28 = i30 + 1;
                charAt18 = m13672e.charAt(i30);
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
            iArr = f74025r;
            i3 = 0;
        } else {
            int i33 = i30 + 1;
            int charAt20 = m13672e.charAt(i30);
            if (charAt20 >= 55296) {
                int i34 = charAt20 & 8191;
                int i35 = 13;
                while (true) {
                    i11 = i33 + 1;
                    charAt13 = m13672e.charAt(i33);
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
            int charAt21 = m13672e.charAt(i33);
            if (charAt21 >= 55296) {
                int i37 = charAt21 & 8191;
                int i38 = 13;
                while (true) {
                    i10 = i36 + 1;
                    charAt12 = m13672e.charAt(i36);
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
            charAt = m13672e.charAt(i36);
            if (charAt >= 55296) {
                int i40 = charAt & 8191;
                int i41 = 13;
                while (true) {
                    i9 = i39 + 1;
                    charAt11 = m13672e.charAt(i39);
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
            charAt2 = m13672e.charAt(i39);
            if (charAt2 >= 55296) {
                int i43 = charAt2 & 8191;
                int i44 = 13;
                while (true) {
                    i8 = i42 + 1;
                    charAt10 = m13672e.charAt(i42);
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
            charAt3 = m13672e.charAt(i42);
            if (charAt3 >= 55296) {
                int i46 = charAt3 & 8191;
                int i47 = 13;
                while (true) {
                    i7 = i45 + 1;
                    charAt9 = m13672e.charAt(i45);
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
            charAt4 = m13672e.charAt(i45);
            if (charAt4 >= 55296) {
                int i49 = charAt4 & 8191;
                int i50 = 13;
                while (true) {
                    i6 = i48 + 1;
                    charAt8 = m13672e.charAt(i48);
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
            int charAt22 = m13672e.charAt(i48);
            if (charAt22 >= 55296) {
                int i52 = charAt22 & 8191;
                int i53 = 13;
                while (true) {
                    i5 = i51 + 1;
                    charAt7 = m13672e.charAt(i51);
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
            charAt5 = m13672e.charAt(i51);
            if (charAt5 >= 55296) {
                int i55 = charAt5 & 8191;
                int i56 = 13;
                while (true) {
                    i4 = i54 + 1;
                    charAt6 = m13672e.charAt(i54);
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
        Unsafe unsafe = f74026s;
        Object[] m13673d = c48855sn4.m13673d();
        Class<?> cls = c48855sn4.mo13675b().getClass();
        int[] iArr2 = new int[charAt3 * 3];
        Object[] objArr = new Object[charAt3 * 2];
        int i57 = charAt5 + charAt4;
        int i58 = charAt5;
        int i59 = i57;
        int i60 = 0;
        int i61 = 0;
        while (i30 < length) {
            int i62 = i30 + 1;
            int charAt23 = m13672e.charAt(i30);
            if (charAt23 >= c) {
                int i63 = charAt23 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i27 = i64 + 1;
                    charAt17 = m13672e.charAt(i64);
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
            int charAt24 = m13672e.charAt(i12);
            if (charAt24 >= c) {
                int i67 = charAt24 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i26 = i68 + 1;
                    charAt16 = m13672e.charAt(i68);
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
                int charAt25 = m13672e.charAt(i14);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i74 = charAt25 & 8191;
                    int i75 = 13;
                    while (true) {
                        i25 = i73 + 1;
                        charAt15 = m13672e.charAt(i73);
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
                        objArr[((i61 / 3) * 2) + 1] = m13673d[i2];
                    }
                    int i78 = charAt25 * 2;
                    obj = m13673d[i78];
                    if (!(obj instanceof Field)) {
                        m48041m02 = (Field) obj;
                    } else {
                        m48041m02 = m48041m0(cls, (String) obj);
                        m13673d[i78] = m48041m02;
                    }
                    i15 = charAt;
                    i16 = charAt2;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m48041m02);
                    int i79 = i78 + 1;
                    obj2 = m13673d[i79];
                    if (!(obj2 instanceof Field)) {
                        m48041m03 = (Field) obj2;
                    } else {
                        m48041m03 = m48041m0(cls, (String) obj2);
                        m13673d[i79] = m48041m03;
                    }
                    str = m13672e;
                    i18 = (int) unsafe.objectFieldOffset(m48041m03);
                    z4 = z;
                    i19 = i77;
                    objectFieldOffset = objectFieldOffset2;
                    i20 = 0;
                } else {
                    i24 = i2 + 1;
                    objArr[((i61 / 3) * 2) + 1] = m13673d[i2];
                }
                i2 = i24;
                int i782 = charAt25 * 2;
                obj = m13673d[i782];
                if (!(obj instanceof Field)) {
                }
                i15 = charAt;
                i16 = charAt2;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(m48041m02);
                int i792 = i782 + 1;
                obj2 = m13673d[i792];
                if (!(obj2 instanceof Field)) {
                }
                str = m13672e;
                i18 = (int) unsafe.objectFieldOffset(m48041m03);
                z4 = z;
                i19 = i77;
                objectFieldOffset = objectFieldOffset22;
                i20 = 0;
            } else {
                i15 = charAt;
                i16 = charAt2;
                int i80 = i2 + 1;
                Field m48041m04 = m48041m0(cls, (String) m13673d[i2]);
                if (i70 != 9 && i70 != 17) {
                    if (i70 != 27 && i70 != 49) {
                        if (i70 != 12 && i70 != 30 && i70 != 44) {
                            if (i70 == 50) {
                                int i81 = i58 + 1;
                                iArr[i58] = i61;
                                int i82 = (i61 / 3) * 2;
                                int i83 = i80 + 1;
                                objArr[i82] = m13673d[i80];
                                if ((charAt24 & 2048) != 0) {
                                    i80 = i83 + 1;
                                    objArr[i82 + 1] = m13673d[i83];
                                    i58 = i81;
                                } else {
                                    i58 = i81;
                                    i17 = i83;
                                    z2 = true;
                                    objectFieldOffset = (int) unsafe.objectFieldOffset(m48041m04);
                                    int i84 = i17;
                                    if ((charAt24 & 4096) == 4096) {
                                        z3 = z2;
                                    } else {
                                        z3 = false;
                                    }
                                    if (!z3 && i70 <= 17) {
                                        int i85 = i14 + 1;
                                        int charAt26 = m13672e.charAt(i14);
                                        if (charAt26 >= 55296) {
                                            int i86 = charAt26 & 8191;
                                            int i87 = 13;
                                            while (true) {
                                                i19 = i85 + 1;
                                                charAt14 = m13672e.charAt(i85);
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
                                        Object obj3 = m13673d[i88];
                                        str = m13672e;
                                        if (obj3 instanceof Field) {
                                            m48041m0 = (Field) obj3;
                                        } else {
                                            m48041m0 = m48041m0(cls, (String) obj3);
                                            m13673d[i88] = m48041m0;
                                        }
                                        z4 = z;
                                        i18 = (int) unsafe.objectFieldOffset(m48041m0);
                                        i20 = charAt26 % 32;
                                    } else {
                                        str = m13672e;
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
                            objArr[((i61 / 3) * 2) + 1] = m13673d[i80];
                        }
                        z2 = true;
                    } else {
                        z2 = true;
                        i21 = i80 + 1;
                        objArr[((i61 / 3) * 2) + 1] = m13673d[i80];
                    }
                    i17 = i21;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m48041m04);
                    int i842 = i17;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    if (!z3) {
                    }
                    str = m13672e;
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
                    objArr[((i61 / 3) * 2) + 1] = m48041m04.getType();
                }
                i17 = i80;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m48041m04);
                int i8422 = i17;
                if ((charAt24 & 4096) == 4096) {
                }
                if (!z3) {
                }
                str = m13672e;
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
            m13672e = str;
            charAt2 = i16;
            c = 55296;
        }
        return new C18152H<>(iArr2, objArr, charAt, charAt2, c48855sn4.mo13675b(), z, false, iArr, charAt5, i57, z73, abstractC18254z, abstractC18169P, abstractC18221n, interfaceC18147D);
    }

    /* renamed from: U */
    public static long m48062U(int i) {
        return i & 1048575;
    }

    /* renamed from: V */
    public static <T> boolean m48061V(T t, long j) {
        return ((Boolean) C52917ze6.m932C(t, j)).booleanValue();
    }

    /* renamed from: W */
    public static <T> double m48060W(T t, long j) {
        return ((Double) C52917ze6.m932C(t, j)).doubleValue();
    }

    /* renamed from: X */
    public static <T> float m48059X(T t, long j) {
        return ((Float) C52917ze6.m932C(t, j)).floatValue();
    }

    /* renamed from: Y */
    public static <T> int m48058Y(T t, long j) {
        return ((Integer) C52917ze6.m932C(t, j)).intValue();
    }

    /* renamed from: Z */
    public static <T> long m48057Z(T t, long j) {
        return ((Long) C52917ze6.m932C(t, j)).longValue();
    }

    /* renamed from: l */
    public static <T> boolean m48044l(T t, long j) {
        return C52917ze6.m897r(t, j);
    }

    /* renamed from: m0 */
    public static Field m48041m0(Class<?> cls, String str) {
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

    /* renamed from: n */
    public static <T> double m48040n(T t, long j) {
        return C52917ze6.m891x(t, j);
    }

    /* renamed from: q0 */
    public static int m48033q0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: r */
    public static <T> float m48032r(T t, long j) {
        return C52917ze6.m890y(t, j);
    }

    /* renamed from: v */
    public static C18170Q m48024v(Object obj) {
        AbstractC18230t abstractC18230t = (AbstractC18230t) obj;
        C18170Q c18170q = abstractC18230t.unknownFields;
        if (c18170q == C18170Q.m47894c()) {
            C18170Q m47887j = C18170Q.m47887j();
            abstractC18230t.unknownFields = m47887j;
            return m47887j;
        }
        return c18170q;
    }

    /* renamed from: z */
    public static <T> int m48017z(T t, long j) {
        return C52917ze6.m889z(t, j);
    }

    /* renamed from: B */
    public final boolean m48081B(T t, int i) {
        int m48049h0 = m48049h0(i);
        long j = 1048575 & m48049h0;
        if (j == 1048575) {
            int m48031r0 = m48031r0(i);
            long m48062U = m48062U(m48031r0);
            switch (m48033q0(m48031r0)) {
                case 0:
                    if (Double.doubleToRawLongBits(C52917ze6.m891x(t, m48062U)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(C52917ze6.m890y(t, m48062U)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C52917ze6.m934A(t, m48062U) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C52917ze6.m934A(t, m48062U) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C52917ze6.m889z(t, m48062U) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C52917ze6.m934A(t, m48062U) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C52917ze6.m889z(t, m48062U) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C52917ze6.m897r(t, m48062U);
                case 8:
                    Object m932C = C52917ze6.m932C(t, m48062U);
                    if (m932C instanceof String) {
                        return !((String) m932C).isEmpty();
                    }
                    if (m932C instanceof AbstractC18199g) {
                        return !AbstractC18199g.f74142c.equals(m932C);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C52917ze6.m932C(t, m48062U) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !AbstractC18199g.f74142c.equals(C52917ze6.m932C(t, m48062U));
                case 11:
                    if (C52917ze6.m889z(t, m48062U) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C52917ze6.m889z(t, m48062U) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (C52917ze6.m889z(t, m48062U) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C52917ze6.m934A(t, m48062U) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C52917ze6.m889z(t, m48062U) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C52917ze6.m934A(t, m48062U) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C52917ze6.m932C(t, m48062U) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((C52917ze6.m889z(t, j) & (1 << (m48049h0 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final boolean m48080C(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m48081B(t, i) : (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public final <N> boolean m48078E(Object obj, int i, int i2) {
        List list = (List) C52917ze6.m932C(obj, m48062U(i));
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC18157M m48026u = m48026u(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!m48026u.mo47989f(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    public final boolean m48077F(T t, int i, int i2) {
        if (this.f74043q.mo48091g(C52917ze6.m932C(t, m48062U(i))).isEmpty()) {
            return true;
        }
        this.f74043q.mo48097a(m48028t(i2));
        throw null;
    }

    /* renamed from: G */
    public final boolean m48076G(T t, T t2, int i) {
        long m48049h0 = m48049h0(i) & 1048575;
        if (C52917ze6.m889z(t, m48049h0) == C52917ze6.m889z(t2, m48049h0)) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final boolean m48075H(T t, int i, int i2) {
        if (C52917ze6.m889z(t, m48049h0(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        r0 = r16.f74037k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r0 >= r16.f74038l) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
        r13 = m48036p(r19, r16.f74036j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r13 == null) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        r17.mo47857o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <UT, UB, ET extends C18225q.InterfaceC18227b<ET>> void m48071L(AbstractC18169P<UT, UB> abstractC18169P, AbstractC18221n<ET> abstractC18221n, T t, InterfaceC18156L interfaceC18156L, C18219m c18219m) throws IOException {
        Object obj = null;
        C18225q<ET> c18225q = null;
        while (true) {
            try {
                int mo47598n = interfaceC18156L.mo47598n();
                int m48051f0 = m48051f0(mo47598n);
                if (m48051f0 >= 0) {
                    int m48031r0 = m48031r0(m48051f0);
                    try {
                        switch (m48033q0(m48031r0)) {
                            case 0:
                                C52917ze6.m921N(t, m48062U(m48031r0), interfaceC18156L.readDouble());
                                m48039n0(t, m48051f0);
                                break;
                            case 1:
                                C52917ze6.m920O(t, m48062U(m48031r0), interfaceC18156L.readFloat());
                                m48039n0(t, m48051f0);
                                break;
                            case 2:
                                C52917ze6.m918Q(t, m48062U(m48031r0), interfaceC18156L.mo47592t());
                                m48039n0(t, m48051f0);
                                break;
                            case 3:
                                C52917ze6.m918Q(t, m48062U(m48031r0), interfaceC18156L.mo47602j());
                                m48039n0(t, m48051f0);
                                break;
                            case 4:
                                C52917ze6.m919P(t, m48062U(m48031r0), interfaceC18156L.mo47634B());
                                m48039n0(t, m48051f0);
                                break;
                            case 5:
                                C52917ze6.m918Q(t, m48062U(m48031r0), interfaceC18156L.mo47591u());
                                m48039n0(t, m48051f0);
                                break;
                            case 6:
                                C52917ze6.m919P(t, m48062U(m48031r0), interfaceC18156L.mo47631E());
                                m48039n0(t, m48051f0);
                                break;
                            case 7:
                                C52917ze6.m927H(t, m48062U(m48031r0), interfaceC18156L.mo47589w());
                                m48039n0(t, m48051f0);
                                break;
                            case 8:
                                m48045k0(t, m48031r0, interfaceC18156L);
                                m48039n0(t, m48051f0);
                                break;
                            case 9:
                                if (m48081B(t, m48051f0)) {
                                    C52917ze6.m917R(t, m48062U(m48031r0), C18238v.m47416h(C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18156L.mo47622N(m48026u(m48051f0), c18219m)));
                                    break;
                                } else {
                                    C52917ze6.m917R(t, m48062U(m48031r0), interfaceC18156L.mo47622N(m48026u(m48051f0), c18219m));
                                    m48039n0(t, m48051f0);
                                    break;
                                }
                            case 10:
                                C52917ze6.m917R(t, m48062U(m48031r0), interfaceC18156L.mo47604h());
                                m48039n0(t, m48051f0);
                                break;
                            case 11:
                                C52917ze6.m919P(t, m48062U(m48031r0), interfaceC18156L.mo47609c());
                                m48039n0(t, m48051f0);
                                break;
                            case 12:
                                int mo47607e = interfaceC18156L.mo47607e();
                                C18238v.InterfaceC18243e m48030s = m48030s(m48051f0);
                                if (m48030s != null && !m48030s.m47413a(mo47607e)) {
                                    obj = C18158N.m47973L(mo47598n, mo47607e, obj, abstractC18169P);
                                    break;
                                }
                                C52917ze6.m919P(t, m48062U(m48031r0), mo47607e);
                                m48039n0(t, m48051f0);
                                break;
                            case 13:
                                C52917ze6.m919P(t, m48062U(m48031r0), interfaceC18156L.mo47628H());
                                m48039n0(t, m48051f0);
                                break;
                            case 14:
                                C52917ze6.m918Q(t, m48062U(m48031r0), interfaceC18156L.mo47610b());
                                m48039n0(t, m48051f0);
                                break;
                            case 15:
                                C52917ze6.m919P(t, m48062U(m48031r0), interfaceC18156L.mo47606f());
                                m48039n0(t, m48051f0);
                                break;
                            case 16:
                                C52917ze6.m918Q(t, m48062U(m48031r0), interfaceC18156L.mo47630F());
                                m48039n0(t, m48051f0);
                                break;
                            case 17:
                                if (m48081B(t, m48051f0)) {
                                    C52917ze6.m917R(t, m48062U(m48031r0), C18238v.m47416h(C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18156L.mo47626J(m48026u(m48051f0), c18219m)));
                                    break;
                                } else {
                                    C52917ze6.m917R(t, m48062U(m48031r0), interfaceC18156L.mo47626J(m48026u(m48051f0), c18219m));
                                    m48039n0(t, m48051f0);
                                    break;
                                }
                            case 18:
                                interfaceC18156L.mo47593s(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 19:
                                interfaceC18156L.mo47596p(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 20:
                                interfaceC18156L.mo47587y(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 21:
                                interfaceC18156L.mo47588x(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 22:
                                interfaceC18156L.mo47600l(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 23:
                                interfaceC18156L.mo47633C(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 24:
                                interfaceC18156L.mo47599m(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 25:
                                interfaceC18156L.mo47605g(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 26:
                                m48043l0(t, m48031r0, interfaceC18156L);
                                break;
                            case 27:
                                m48047j0(t, m48031r0, interfaceC18156L, m48026u(m48051f0), c18219m);
                                break;
                            case 28:
                                interfaceC18156L.mo47594r(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 29:
                                interfaceC18156L.mo47632D(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 30:
                                List<Integer> mo47389e = this.f74040n.mo47389e(t, m48062U(m48031r0));
                                interfaceC18156L.mo47586z(mo47389e);
                                obj = C18158N.m47984A(mo47598n, mo47389e, m48030s(m48051f0), obj, abstractC18169P);
                                break;
                            case 31:
                                interfaceC18156L.mo47590v(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 32:
                                interfaceC18156L.mo47601k(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 33:
                                interfaceC18156L.mo47603i(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 34:
                                interfaceC18156L.mo47611a(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 35:
                                interfaceC18156L.mo47593s(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 36:
                                interfaceC18156L.mo47596p(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 37:
                                interfaceC18156L.mo47587y(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 38:
                                interfaceC18156L.mo47588x(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 39:
                                interfaceC18156L.mo47600l(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 40:
                                interfaceC18156L.mo47633C(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 41:
                                interfaceC18156L.mo47599m(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 42:
                                interfaceC18156L.mo47605g(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 43:
                                interfaceC18156L.mo47632D(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 44:
                                List<Integer> mo47389e2 = this.f74040n.mo47389e(t, m48062U(m48031r0));
                                interfaceC18156L.mo47586z(mo47389e2);
                                obj = C18158N.m47984A(mo47598n, mo47389e2, m48030s(m48051f0), obj, abstractC18169P);
                                break;
                            case 45:
                                interfaceC18156L.mo47590v(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 46:
                                interfaceC18156L.mo47601k(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 47:
                                interfaceC18156L.mo47603i(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 48:
                                interfaceC18156L.mo47611a(this.f74040n.mo47389e(t, m48062U(m48031r0)));
                                break;
                            case 49:
                                m48048i0(t, m48062U(m48031r0), interfaceC18156L, m48026u(m48051f0), c18219m);
                                break;
                            case 50:
                                m48070M(t, m48051f0, m48028t(m48051f0), c18219m, interfaceC18156L);
                                break;
                            case 51:
                                C52917ze6.m917R(t, m48062U(m48031r0), Double.valueOf(interfaceC18156L.readDouble()));
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 52:
                                C52917ze6.m917R(t, m48062U(m48031r0), Float.valueOf(interfaceC18156L.readFloat()));
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 53:
                                C52917ze6.m917R(t, m48062U(m48031r0), Long.valueOf(interfaceC18156L.mo47592t()));
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 54:
                                C52917ze6.m917R(t, m48062U(m48031r0), Long.valueOf(interfaceC18156L.mo47602j()));
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 55:
                                C52917ze6.m917R(t, m48062U(m48031r0), Integer.valueOf(interfaceC18156L.mo47634B()));
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 56:
                                C52917ze6.m917R(t, m48062U(m48031r0), Long.valueOf(interfaceC18156L.mo47591u()));
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 57:
                                C52917ze6.m917R(t, m48062U(m48031r0), Integer.valueOf(interfaceC18156L.mo47631E()));
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 58:
                                C52917ze6.m917R(t, m48062U(m48031r0), Boolean.valueOf(interfaceC18156L.mo47589w()));
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 59:
                                m48045k0(t, m48031r0, interfaceC18156L);
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 60:
                                if (m48075H(t, mo47598n, m48051f0)) {
                                    C52917ze6.m917R(t, m48062U(m48031r0), C18238v.m47416h(C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18156L.mo47622N(m48026u(m48051f0), c18219m)));
                                } else {
                                    C52917ze6.m917R(t, m48062U(m48031r0), interfaceC18156L.mo47622N(m48026u(m48051f0), c18219m));
                                    m48039n0(t, m48051f0);
                                }
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 61:
                                C52917ze6.m917R(t, m48062U(m48031r0), interfaceC18156L.mo47604h());
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 62:
                                C52917ze6.m917R(t, m48062U(m48031r0), Integer.valueOf(interfaceC18156L.mo47609c()));
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 63:
                                int mo47607e2 = interfaceC18156L.mo47607e();
                                C18238v.InterfaceC18243e m48030s2 = m48030s(m48051f0);
                                if (m48030s2 != null && !m48030s2.m47413a(mo47607e2)) {
                                    obj = C18158N.m47973L(mo47598n, mo47607e2, obj, abstractC18169P);
                                    break;
                                }
                                C52917ze6.m917R(t, m48062U(m48031r0), Integer.valueOf(mo47607e2));
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 64:
                                C52917ze6.m917R(t, m48062U(m48031r0), Integer.valueOf(interfaceC18156L.mo47628H()));
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 65:
                                C52917ze6.m917R(t, m48062U(m48031r0), Long.valueOf(interfaceC18156L.mo47610b()));
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 66:
                                C52917ze6.m917R(t, m48062U(m48031r0), Integer.valueOf(interfaceC18156L.mo47606f()));
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 67:
                                C52917ze6.m917R(t, m48062U(m48031r0), Long.valueOf(interfaceC18156L.mo47630F()));
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            case 68:
                                C52917ze6.m917R(t, m48062U(m48031r0), interfaceC18156L.mo47626J(m48026u(m48051f0), c18219m));
                                m48037o0(t, mo47598n, m48051f0);
                                break;
                            default:
                                if (obj == null) {
                                    obj = abstractC18169P.mo47858n();
                                }
                                if (!abstractC18169P.m47897m(obj, interfaceC18156L)) {
                                    for (int i = this.f74037k; i < this.f74038l; i++) {
                                        obj = m48036p(t, this.f74036j[i], obj, abstractC18169P);
                                    }
                                    if (obj != null) {
                                        abstractC18169P.mo47857o(t, obj);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (abstractC18169P.mo47855q(interfaceC18156L)) {
                            if (!interfaceC18156L.mo47595q()) {
                                for (int i2 = this.f74037k; i2 < this.f74038l; i2++) {
                                    obj = m48036p(t, this.f74036j[i2], obj, abstractC18169P);
                                }
                                if (obj != null) {
                                    abstractC18169P.mo47857o(t, obj);
                                    return;
                                }
                                return;
                            }
                        } else {
                            if (obj == null) {
                                obj = abstractC18169P.mo47864f(t);
                            }
                            if (!abstractC18169P.m47897m(obj, interfaceC18156L)) {
                                for (int i3 = this.f74037k; i3 < this.f74038l; i3++) {
                                    obj = m48036p(t, this.f74036j[i3], obj, abstractC18169P);
                                }
                                if (obj != null) {
                                    abstractC18169P.mo47857o(t, obj);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                } else if (mo47598n == Integer.MAX_VALUE) {
                    for (int i4 = this.f74037k; i4 < this.f74038l; i4++) {
                        obj = m48036p(t, this.f74036j[i4], obj, abstractC18169P);
                    }
                    if (obj != null) {
                        abstractC18169P.mo47857o(t, obj);
                        return;
                    }
                    return;
                } else {
                    Object mo47526b = !this.f74032f ? null : abstractC18221n.mo47526b(c18219m, this.f74031e, mo47598n);
                    if (mo47526b != null) {
                        if (c18225q == null) {
                            c18225q = abstractC18221n.mo47524d(t);
                        }
                        obj = abstractC18221n.mo47521g(interfaceC18156L, mo47526b, c18219m, c18225q, obj, abstractC18169P);
                    } else if (abstractC18169P.mo47855q(interfaceC18156L)) {
                        if (interfaceC18156L.mo47595q()) {
                        }
                    } else {
                        if (obj == null) {
                            obj = abstractC18169P.mo47864f(t);
                        }
                        if (abstractC18169P.m47897m(obj, interfaceC18156L)) {
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.f74037k; i5 < this.f74038l; i5++) {
                    obj = m48036p(t, this.f74036j[i5], obj, abstractC18169P);
                }
                if (obj != null) {
                    abstractC18169P.mo47857o(t, obj);
                }
                throw th;
            }
        }
    }

    /* renamed from: M */
    public final <K, V> void m48070M(Object obj, int i, Object obj2, C18219m c18219m, InterfaceC18156L interfaceC18156L) throws IOException {
        long m48062U = m48062U(m48031r0(i));
        Object m932C = C52917ze6.m932C(obj, m48062U);
        if (m932C == null) {
            m932C = this.f74043q.mo48092f(obj2);
            C52917ze6.m917R(obj, m48062U, m932C);
        } else if (this.f74043q.mo48090h(m932C)) {
            Object mo48092f = this.f74043q.mo48092f(obj2);
            this.f74043q.mo48095c(mo48092f, m932C);
            C52917ze6.m917R(obj, m48062U, mo48092f);
            m932C = mo48092f;
        }
        Map<?, ?> mo48093e = this.f74043q.mo48093e(m932C);
        this.f74043q.mo48097a(obj2);
        interfaceC18156L.mo47624L(mo48093e, null, c18219m);
    }

    /* renamed from: N */
    public final void m48069N(T t, T t2, int i) {
        long m48062U = m48062U(m48031r0(i));
        if (!m48081B(t2, i)) {
            return;
        }
        Object m932C = C52917ze6.m932C(t, m48062U);
        Object m932C2 = C52917ze6.m932C(t2, m48062U);
        if (m932C != null && m932C2 != null) {
            C52917ze6.m917R(t, m48062U, C18238v.m47416h(m932C, m932C2));
            m48039n0(t, i);
        } else if (m932C2 != null) {
            C52917ze6.m917R(t, m48062U, m932C2);
            m48039n0(t, i);
        }
    }

    /* renamed from: O */
    public final void m48068O(T t, T t2, int i) {
        Object obj;
        int m48031r0 = m48031r0(i);
        int m48063T = m48063T(i);
        long m48062U = m48062U(m48031r0);
        if (!m48075H(t2, m48063T, i)) {
            return;
        }
        if (m48075H(t, m48063T, i)) {
            obj = C52917ze6.m932C(t, m48062U);
        } else {
            obj = null;
        }
        Object m932C = C52917ze6.m932C(t2, m48062U);
        if (obj != null && m932C != null) {
            C52917ze6.m917R(t, m48062U, C18238v.m47416h(obj, m932C));
            m48037o0(t, m48063T, i);
        } else if (m932C != null) {
            C52917ze6.m917R(t, m48062U, m932C);
            m48037o0(t, m48063T, i);
        }
    }

    /* renamed from: P */
    public final void m48067P(T t, T t2, int i) {
        int m48031r0 = m48031r0(i);
        long m48062U = m48062U(m48031r0);
        int m48063T = m48063T(i);
        switch (m48033q0(m48031r0)) {
            case 0:
                if (m48081B(t2, i)) {
                    C52917ze6.m921N(t, m48062U, C52917ze6.m891x(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 1:
                if (m48081B(t2, i)) {
                    C52917ze6.m920O(t, m48062U, C52917ze6.m890y(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 2:
                if (m48081B(t2, i)) {
                    C52917ze6.m918Q(t, m48062U, C52917ze6.m934A(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 3:
                if (m48081B(t2, i)) {
                    C52917ze6.m918Q(t, m48062U, C52917ze6.m934A(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 4:
                if (m48081B(t2, i)) {
                    C52917ze6.m919P(t, m48062U, C52917ze6.m889z(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 5:
                if (m48081B(t2, i)) {
                    C52917ze6.m918Q(t, m48062U, C52917ze6.m934A(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 6:
                if (m48081B(t2, i)) {
                    C52917ze6.m919P(t, m48062U, C52917ze6.m889z(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 7:
                if (m48081B(t2, i)) {
                    C52917ze6.m927H(t, m48062U, C52917ze6.m897r(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 8:
                if (m48081B(t2, i)) {
                    C52917ze6.m917R(t, m48062U, C52917ze6.m932C(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 9:
                m48069N(t, t2, i);
                return;
            case 10:
                if (m48081B(t2, i)) {
                    C52917ze6.m917R(t, m48062U, C52917ze6.m932C(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 11:
                if (m48081B(t2, i)) {
                    C52917ze6.m919P(t, m48062U, C52917ze6.m889z(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 12:
                if (m48081B(t2, i)) {
                    C52917ze6.m919P(t, m48062U, C52917ze6.m889z(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 13:
                if (m48081B(t2, i)) {
                    C52917ze6.m919P(t, m48062U, C52917ze6.m889z(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 14:
                if (m48081B(t2, i)) {
                    C52917ze6.m918Q(t, m48062U, C52917ze6.m934A(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 15:
                if (m48081B(t2, i)) {
                    C52917ze6.m919P(t, m48062U, C52917ze6.m889z(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 16:
                if (m48081B(t2, i)) {
                    C52917ze6.m918Q(t, m48062U, C52917ze6.m934A(t2, m48062U));
                    m48039n0(t, i);
                    return;
                }
                return;
            case 17:
                m48069N(t, t2, i);
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
                this.f74040n.mo47390d(t, t2, m48062U);
                return;
            case 50:
                C18158N.m47979F(this.f74043q, t, t2, m48062U);
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
                if (m48075H(t2, m48063T, i)) {
                    C52917ze6.m917R(t, m48062U, C52917ze6.m932C(t2, m48062U));
                    m48037o0(t, m48063T, i);
                    return;
                }
                return;
            case 60:
                m48068O(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (m48075H(t2, m48063T, i)) {
                    C52917ze6.m917R(t, m48062U, C52917ze6.m932C(t2, m48062U));
                    m48037o0(t, m48063T, i);
                    return;
                }
                return;
            case 68:
                m48068O(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* renamed from: T */
    public final int m48063T(int i) {
        return this.f74027a[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: a */
    public void mo47994a(T t, byte[] bArr, int i, int i2, C18192d.C18194b c18194b) throws IOException {
        if (this.f74034h) {
            m48053d0(t, bArr, i, i2, c18194b);
        } else {
            m48054c0(t, bArr, i, i2, 0, c18194b);
        }
    }

    /* renamed from: a0 */
    public final <K, V> int m48056a0(T t, byte[] bArr, int i, int i2, int i3, long j, C18192d.C18194b c18194b) throws IOException {
        Unsafe unsafe = f74026s;
        Object m48028t = m48028t(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f74043q.mo48090h(object)) {
            Object mo48092f = this.f74043q.mo48092f(m48028t);
            this.f74043q.mo48095c(mo48092f, object);
            unsafe.putObject(t, j, mo48092f);
            object = mo48092f;
        }
        this.f74043q.mo48097a(m48028t);
        return m48042m(bArr, i, i2, null, this.f74043q.mo48093e(object), c18194b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: b */
    public boolean mo47993b(T t, T t2) {
        int length = this.f74027a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m48038o(t, t2, i)) {
                return false;
            }
        }
        if (!this.f74041o.mo47863g(t).equals(this.f74041o.mo47863g(t2))) {
            return false;
        }
        if (this.f74032f) {
            return this.f74042p.mo47525c(t).equals(this.f74042p.mo47525c(t2));
        }
        return true;
    }

    /* renamed from: b0 */
    public final int m48055b0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C18192d.C18194b c18194b) throws IOException {
        Unsafe unsafe = f74026s;
        long j2 = this.f74027a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(C18192d.m47767d(bArr, i)));
                    int i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(C18192d.m47759l(bArr, i)));
                    int i10 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i10;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int m47773L = C18192d.m47773L(bArr, i, c18194b);
                    unsafe.putObject(t, j, Long.valueOf(c18194b.f74129b));
                    unsafe.putInt(t, j2, i4);
                    return m47773L;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m47776I = C18192d.m47776I(bArr, i, c18194b);
                    unsafe.putObject(t, j, Integer.valueOf(c18194b.f74128a));
                    unsafe.putInt(t, j2, i4);
                    return m47776I;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(C18192d.m47761j(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(C18192d.m47763h(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return i12;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int m47773L2 = C18192d.m47773L(bArr, i, c18194b);
                    unsafe.putObject(t, j, Boolean.valueOf(c18194b.f74129b != 0));
                    unsafe.putInt(t, j2, i4);
                    return m47773L2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int m47776I2 = C18192d.m47776I(bArr, i, c18194b);
                    int i13 = c18194b.f74128a;
                    if (i13 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !C18172T.m47832n(bArr, m47776I2, m47776I2 + i13)) {
                        throw InvalidProtocolBufferException.m48008d();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, m47776I2, i13, C18238v.f74218b));
                        m47776I2 += i13;
                    }
                    unsafe.putInt(t, j2, i4);
                    return m47776I2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int m47755p = C18192d.m47755p(m48026u(i8), bArr, i, i2, c18194b);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, c18194b.f74130c);
                    } else {
                        unsafe.putObject(t, j, C18238v.m47416h(object, c18194b.f74130c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return m47755p;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m47769b = C18192d.m47769b(bArr, i, c18194b);
                    unsafe.putObject(t, j, c18194b.f74130c);
                    unsafe.putInt(t, j2, i4);
                    return m47769b;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m47776I3 = C18192d.m47776I(bArr, i, c18194b);
                    int i14 = c18194b.f74128a;
                    C18238v.InterfaceC18243e m48030s = m48030s(i8);
                    if (m48030s != null && !m48030s.m47413a(i14)) {
                        m48024v(t).m47884m(i3, Long.valueOf(i14));
                    } else {
                        unsafe.putObject(t, j, Integer.valueOf(i14));
                        unsafe.putInt(t, j2, i4);
                    }
                    return m47776I3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int m47776I4 = C18192d.m47776I(bArr, i, c18194b);
                    unsafe.putObject(t, j, Integer.valueOf(AbstractC18211h.m47677b(c18194b.f74128a)));
                    unsafe.putInt(t, j2, i4);
                    return m47776I4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int m47773L3 = C18192d.m47773L(bArr, i, c18194b);
                    unsafe.putObject(t, j, Long.valueOf(AbstractC18211h.m47676c(c18194b.f74129b)));
                    unsafe.putInt(t, j2, i4);
                    return m47773L3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int m47757n = C18192d.m47757n(m48026u(i8), bArr, i, i2, (i3 & (-8)) | 4, c18194b);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, c18194b.f74130c);
                    } else {
                        unsafe.putObject(t, j, C18238v.m47416h(object2, c18194b.f74130c));
                    }
                    unsafe.putInt(t, j2, i4);
                    return m47757n;
                }
                break;
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: c */
    public void mo47992c(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f74027a.length; i += 3) {
            m48067P(t, t2, i);
        }
        C18158N.m47978G(this.f74041o, t, t2);
        if (this.f74032f) {
            C18158N.m47980E(this.f74042p, t, t2);
        }
    }

    /* renamed from: c0 */
    public int m48054c0(T t, byte[] bArr, int i, int i2, int i3, C18192d.C18194b c18194b) throws IOException {
        Unsafe unsafe;
        int i4;
        C18152H<T> c18152h;
        int i5;
        T t2;
        byte b;
        int m48051f0;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        T t3;
        T t4;
        int i14;
        T t5;
        int i15;
        int i16;
        C18152H<T> c18152h2 = this;
        T t6 = t;
        byte[] bArr2 = bArr;
        int i17 = i2;
        int i18 = i3;
        C18192d.C18194b c18194b2 = c18194b;
        Unsafe unsafe2 = f74026s;
        int i19 = i;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        int i24 = 1048575;
        while (true) {
            if (i19 < i17) {
                int i25 = i19 + 1;
                byte b2 = bArr2[i19];
                if (b2 < 0) {
                    int m47777H = C18192d.m47777H(b2, bArr2, i25, c18194b2);
                    b = c18194b2.f74128a;
                    i25 = m47777H;
                } else {
                    b = b2;
                }
                int i26 = b >>> 3;
                int i27 = b & 7;
                if (i26 > i23) {
                    m48051f0 = c18152h2.m48050g0(i26, i20 / 3);
                } else {
                    m48051f0 = c18152h2.m48051f0(i26);
                }
                int i28 = m48051f0;
                if (i28 == -1) {
                    i6 = i26;
                    i7 = i25;
                    i8 = b;
                    i9 = i22;
                    i10 = i24;
                    unsafe = unsafe2;
                    i4 = i18;
                    i11 = 0;
                } else {
                    int i29 = c18152h2.f74027a[i28 + 1];
                    int m48033q0 = m48033q0(i29);
                    long m48062U = m48062U(i29);
                    int i30 = b;
                    if (m48033q0 <= 17) {
                        int i31 = c18152h2.f74027a[i28 + 2];
                        int i32 = 1 << (i31 >>> 20);
                        int i33 = i31 & 1048575;
                        if (i33 != i24) {
                            if (i24 != 1048575) {
                                unsafe2.putInt(t6, i24, i22);
                            }
                            i22 = unsafe2.getInt(t6, i33);
                            i10 = i33;
                        } else {
                            i10 = i24;
                        }
                        int i34 = i22;
                        switch (m48033q0) {
                            case 0:
                                t3 = t6;
                                i12 = i28;
                                i6 = i26;
                                bArr2 = bArr;
                                i13 = i30;
                                if (i27 == 1) {
                                    C52917ze6.m921N(t3, m48062U, C18192d.m47767d(bArr2, i25));
                                    i19 = i25 + 8;
                                    i22 = i34 | i32;
                                    i17 = i2;
                                    t6 = t3;
                                    i20 = i12;
                                    i21 = i13;
                                    i23 = i6;
                                    i24 = i10;
                                    i18 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    break;
                                }
                            case 1:
                                t3 = t6;
                                i12 = i28;
                                i6 = i26;
                                bArr2 = bArr;
                                i13 = i30;
                                if (i27 == 5) {
                                    C52917ze6.m920O(t3, m48062U, C18192d.m47759l(bArr2, i25));
                                    i19 = i25 + 4;
                                    i22 = i34 | i32;
                                    i17 = i2;
                                    t6 = t3;
                                    i20 = i12;
                                    i21 = i13;
                                    i23 = i6;
                                    i24 = i10;
                                    i18 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    break;
                                }
                            case 2:
                            case 3:
                                T t7 = t6;
                                i12 = i28;
                                i6 = i26;
                                bArr2 = bArr;
                                i13 = i30;
                                if (i27 == 0) {
                                    int m47773L = C18192d.m47773L(bArr2, i25, c18194b2);
                                    t4 = t7;
                                    unsafe2.putLong(t, m48062U, c18194b2.f74129b);
                                    i22 = i34 | i32;
                                    i20 = i12;
                                    i19 = m47773L;
                                    i21 = i13;
                                    t6 = t4;
                                    i23 = i6;
                                    i24 = i10;
                                    i17 = i2;
                                    i18 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    break;
                                }
                            case 4:
                            case 11:
                                t3 = t6;
                                i12 = i28;
                                i6 = i26;
                                bArr2 = bArr;
                                i13 = i30;
                                if (i27 == 0) {
                                    i19 = C18192d.m47776I(bArr2, i25, c18194b2);
                                    unsafe2.putInt(t3, m48062U, c18194b2.f74128a);
                                    i22 = i34 | i32;
                                    i17 = i2;
                                    t6 = t3;
                                    i20 = i12;
                                    i21 = i13;
                                    i23 = i6;
                                    i24 = i10;
                                    i18 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    break;
                                }
                            case 5:
                            case 14:
                                T t8 = t6;
                                i12 = i28;
                                i6 = i26;
                                bArr2 = bArr;
                                i13 = i30;
                                if (i27 == 1) {
                                    t4 = t8;
                                    unsafe2.putLong(t, m48062U, C18192d.m47761j(bArr2, i25));
                                    i19 = i25 + 8;
                                    i22 = i34 | i32;
                                    i20 = i12;
                                    i21 = i13;
                                    t6 = t4;
                                    i23 = i6;
                                    i24 = i10;
                                    i17 = i2;
                                    i18 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    break;
                                }
                            case 6:
                            case 13:
                                i14 = i2;
                                t5 = t6;
                                i12 = i28;
                                i6 = i26;
                                bArr2 = bArr;
                                i13 = i30;
                                if (i27 == 5) {
                                    unsafe2.putInt(t5, m48062U, C18192d.m47763h(bArr2, i25));
                                    i19 = i25 + 4;
                                    int i35 = i34 | i32;
                                    t6 = t5;
                                    i17 = i14;
                                    i20 = i12;
                                    i21 = i13;
                                    i24 = i10;
                                    i18 = i3;
                                    i22 = i35;
                                    i23 = i6;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    break;
                                }
                            case 7:
                                i14 = i2;
                                t5 = t6;
                                i12 = i28;
                                i6 = i26;
                                bArr2 = bArr;
                                i13 = i30;
                                if (i27 == 0) {
                                    i19 = C18192d.m47773L(bArr2, i25, c18194b2);
                                    C52917ze6.m927H(t5, m48062U, c18194b2.f74129b != 0);
                                    int i352 = i34 | i32;
                                    t6 = t5;
                                    i17 = i14;
                                    i20 = i12;
                                    i21 = i13;
                                    i24 = i10;
                                    i18 = i3;
                                    i22 = i352;
                                    i23 = i6;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    break;
                                }
                            case 8:
                                i14 = i2;
                                t5 = t6;
                                i12 = i28;
                                i6 = i26;
                                bArr2 = bArr;
                                i13 = i30;
                                if (i27 == 2) {
                                    if ((i29 & 536870912) == 0) {
                                        i19 = C18192d.m47782C(bArr2, i25, c18194b2);
                                    } else {
                                        i19 = C18192d.m47779F(bArr2, i25, c18194b2);
                                    }
                                    unsafe2.putObject(t5, m48062U, c18194b2.f74130c);
                                    int i3522 = i34 | i32;
                                    t6 = t5;
                                    i17 = i14;
                                    i20 = i12;
                                    i21 = i13;
                                    i24 = i10;
                                    i18 = i3;
                                    i22 = i3522;
                                    i23 = i6;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    break;
                                }
                            case 9:
                                t5 = t6;
                                i12 = i28;
                                i6 = i26;
                                i13 = i30;
                                bArr2 = bArr;
                                if (i27 == 2) {
                                    i14 = i2;
                                    i19 = C18192d.m47755p(c18152h2.m48026u(i12), bArr2, i25, i14, c18194b2);
                                    if ((i34 & i32) == 0) {
                                        unsafe2.putObject(t5, m48062U, c18194b2.f74130c);
                                    } else {
                                        unsafe2.putObject(t5, m48062U, C18238v.m47416h(unsafe2.getObject(t5, m48062U), c18194b2.f74130c));
                                    }
                                    int i35222 = i34 | i32;
                                    t6 = t5;
                                    i17 = i14;
                                    i20 = i12;
                                    i21 = i13;
                                    i24 = i10;
                                    i18 = i3;
                                    i22 = i35222;
                                    i23 = i6;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    break;
                                }
                            case 10:
                                t3 = t6;
                                i12 = i28;
                                i6 = i26;
                                i13 = i30;
                                bArr2 = bArr;
                                if (i27 == 2) {
                                    i19 = C18192d.m47769b(bArr2, i25, c18194b2);
                                    unsafe2.putObject(t3, m48062U, c18194b2.f74130c);
                                    i22 = i34 | i32;
                                    i17 = i2;
                                    t6 = t3;
                                    i20 = i12;
                                    i21 = i13;
                                    i23 = i6;
                                    i24 = i10;
                                    i18 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    break;
                                }
                            case 12:
                                t3 = t6;
                                i12 = i28;
                                i6 = i26;
                                i13 = i30;
                                bArr2 = bArr;
                                if (i27 == 0) {
                                    i19 = C18192d.m47776I(bArr2, i25, c18194b2);
                                    int i36 = c18194b2.f74128a;
                                    C18238v.InterfaceC18243e m48030s = c18152h2.m48030s(i12);
                                    if (m48030s != null && !m48030s.m47413a(i36)) {
                                        m48024v(t).m47884m(i13, Long.valueOf(i36));
                                        i17 = i2;
                                        t6 = t3;
                                        i22 = i34;
                                        i20 = i12;
                                        i21 = i13;
                                        i23 = i6;
                                        i24 = i10;
                                        i18 = i3;
                                    } else {
                                        unsafe2.putInt(t3, m48062U, i36);
                                        i22 = i34 | i32;
                                        i17 = i2;
                                        t6 = t3;
                                        i20 = i12;
                                        i21 = i13;
                                        i23 = i6;
                                        i24 = i10;
                                        i18 = i3;
                                        break;
                                    }
                                } else {
                                    i4 = i3;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    break;
                                }
                                break;
                            case 15:
                                i12 = i28;
                                i13 = i30;
                                bArr2 = bArr;
                                i6 = i26;
                                if (i27 == 0) {
                                    i19 = C18192d.m47776I(bArr2, i25, c18194b2);
                                    t3 = t;
                                    unsafe2.putInt(t3, m48062U, AbstractC18211h.m47677b(c18194b2.f74128a));
                                    i22 = i34 | i32;
                                    i17 = i2;
                                    t6 = t3;
                                    i20 = i12;
                                    i21 = i13;
                                    i23 = i6;
                                    i24 = i10;
                                    i18 = i3;
                                    break;
                                } else {
                                    i4 = i3;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    break;
                                }
                            case 16:
                                i12 = i28;
                                i6 = i26;
                                if (i27 == 0) {
                                    bArr2 = bArr;
                                    int m47773L2 = C18192d.m47773L(bArr2, i25, c18194b2);
                                    i13 = i30;
                                    unsafe2.putLong(t, m48062U, AbstractC18211h.m47676c(c18194b2.f74129b));
                                    i22 = i34 | i32;
                                    t6 = t;
                                    i17 = i2;
                                    i20 = i12;
                                    i19 = m47773L2;
                                    i21 = i13;
                                    i23 = i6;
                                    i24 = i10;
                                    i18 = i3;
                                    break;
                                } else {
                                    i13 = i30;
                                    i4 = i3;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    break;
                                }
                            case 17:
                                if (i27 == 3) {
                                    i19 = C18192d.m47757n(c18152h2.m48026u(i28), bArr, i25, i2, (i26 << 3) | 4, c18194b);
                                    if ((i34 & i32) == 0) {
                                        unsafe2.putObject(t6, m48062U, c18194b2.f74130c);
                                    } else {
                                        unsafe2.putObject(t6, m48062U, C18238v.m47416h(unsafe2.getObject(t6, m48062U), c18194b2.f74130c));
                                    }
                                    i22 = i34 | i32;
                                    bArr2 = bArr;
                                    i17 = i2;
                                    i18 = i3;
                                    i20 = i28;
                                    i21 = i30;
                                    i23 = i26;
                                    i24 = i10;
                                    break;
                                } else {
                                    i12 = i28;
                                    i6 = i26;
                                    i13 = i30;
                                    i4 = i3;
                                    i7 = i25;
                                    i9 = i34;
                                    i11 = i12;
                                    unsafe = unsafe2;
                                    i8 = i13;
                                    break;
                                }
                            default:
                                i12 = i28;
                                i13 = i30;
                                i6 = i26;
                                i4 = i3;
                                i7 = i25;
                                i9 = i34;
                                i11 = i12;
                                unsafe = unsafe2;
                                i8 = i13;
                                break;
                        }
                    } else {
                        i6 = i26;
                        T t9 = t6;
                        bArr2 = bArr;
                        if (m48033q0 != 27) {
                            i11 = i28;
                            i9 = i22;
                            i10 = i24;
                            if (m48033q0 <= 49) {
                                int i37 = i25;
                                unsafe = unsafe2;
                                i16 = i30;
                                i19 = m48052e0(t, bArr, i25, i2, i30, i6, i27, i11, i29, m48033q0, m48062U, c18194b);
                                if (i19 != i37) {
                                    c18152h2 = this;
                                    t6 = t;
                                    bArr2 = bArr;
                                    i17 = i2;
                                    i18 = i3;
                                    c18194b2 = c18194b;
                                    i23 = i6;
                                    i21 = i16;
                                    i20 = i11;
                                    i22 = i9;
                                    i24 = i10;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i7 = i19;
                                    i8 = i16;
                                }
                            } else {
                                i15 = i25;
                                unsafe = unsafe2;
                                i16 = i30;
                                if (m48033q0 != 50) {
                                    i19 = m48055b0(t, bArr, i15, i2, i16, i6, i27, i29, m48033q0, m48062U, i11, c18194b);
                                    if (i19 != i15) {
                                        c18152h2 = this;
                                        t6 = t;
                                        bArr2 = bArr;
                                        i17 = i2;
                                        i18 = i3;
                                        c18194b2 = c18194b;
                                        i23 = i6;
                                        i21 = i16;
                                        i20 = i11;
                                        i22 = i9;
                                        i24 = i10;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i7 = i19;
                                        i8 = i16;
                                    }
                                } else if (i27 == 2) {
                                    i19 = m48056a0(t, bArr, i15, i2, i11, m48062U, c18194b);
                                    if (i19 != i15) {
                                        c18152h2 = this;
                                        t6 = t;
                                        bArr2 = bArr;
                                        i17 = i2;
                                        i18 = i3;
                                        c18194b2 = c18194b;
                                        i23 = i6;
                                        i21 = i16;
                                        i20 = i11;
                                        i22 = i9;
                                        i24 = i10;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i7 = i19;
                                        i8 = i16;
                                    }
                                }
                            }
                        } else if (i27 == 2) {
                            C18238v.InterfaceC18247i interfaceC18247i = (C18238v.InterfaceC18247i) unsafe2.getObject(t9, m48062U);
                            if (!interfaceC18247i.mo47396t()) {
                                int size = interfaceC18247i.size();
                                interfaceC18247i = interfaceC18247i.mo47397k(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t9, m48062U, interfaceC18247i);
                            }
                            i10 = i24;
                            i19 = C18192d.m47754q(c18152h2.m48026u(i28), i30, bArr, i25, i2, interfaceC18247i, c18194b);
                            t6 = t;
                            i17 = i2;
                            i21 = i30;
                            i23 = i6;
                            i20 = i28;
                            i22 = i22;
                            i24 = i10;
                            i18 = i3;
                        } else {
                            i11 = i28;
                            i9 = i22;
                            i10 = i24;
                            i15 = i25;
                            unsafe = unsafe2;
                            i16 = i30;
                        }
                        i4 = i3;
                        i7 = i15;
                        i8 = i16;
                    }
                }
                if (i8 != i4 || i4 == 0) {
                    if (this.f74032f && c18194b.f74131d != C18219m.m47528b()) {
                        i19 = C18192d.m47764g(i8, bArr, i7, i2, t, this.f74031e, this.f74041o, c18194b);
                    } else {
                        i19 = C18192d.m47778G(i8, bArr, i7, i2, m48024v(t), c18194b);
                    }
                    t6 = t;
                    bArr2 = bArr;
                    i17 = i2;
                    i21 = i8;
                    c18152h2 = this;
                    c18194b2 = c18194b;
                    i23 = i6;
                    i20 = i11;
                    i22 = i9;
                    i24 = i10;
                    unsafe2 = unsafe;
                    i18 = i4;
                } else {
                    i5 = 1048575;
                    c18152h = this;
                    i19 = i7;
                    i21 = i8;
                    i22 = i9;
                    i24 = i10;
                }
            } else {
                unsafe = unsafe2;
                i4 = i18;
                c18152h = c18152h2;
                i5 = 1048575;
            }
        }
        if (i24 != i5) {
            t2 = t;
            unsafe.putInt(t2, i24, i22);
        } else {
            t2 = t;
        }
        C18170Q c18170q = null;
        for (int i38 = c18152h.f74037k; i38 < c18152h.f74038l; i38++) {
            c18170q = (C18170Q) c18152h.m48036p(t2, c18152h.f74036j[i38], c18170q, c18152h.f74041o);
        }
        if (c18170q != null) {
            c18152h.f74041o.mo47857o(t2, c18170q);
        }
        if (i4 == 0) {
            if (i19 != i2) {
                throw InvalidProtocolBufferException.m48004h();
            }
        } else if (i19 > i2 || i21 != i4) {
            throw InvalidProtocolBufferException.m48004h();
        }
        return i19;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: d */
    public T mo47991d() {
        return (T) this.f74039m.mo48000a(this.f74031e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x029a, code lost:
        if (r0 != r15) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x029c, code lost:
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r1 = r18;
        r2 = r19;
        r6 = r23;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02df, code lost:
        if (r0 != r15) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0302, code lost:
        if (r0 != r15) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0305, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m48053d0(T t, byte[] bArr, int i, int i2, C18192d.C18194b c18194b) throws IOException {
        byte b;
        int i3;
        int m48051f0;
        int i4;
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int m47773L;
        int m47755p;
        int i10;
        int i11;
        int i12;
        C18152H<T> c18152h = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i13 = i2;
        C18192d.C18194b c18194b2 = c18194b;
        Unsafe unsafe2 = f74026s;
        int i14 = -1;
        int i15 = i;
        int i16 = -1;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1048575;
        while (i15 < i13) {
            int i20 = i15 + 1;
            byte b2 = bArr2[i15];
            if (b2 < 0) {
                i3 = C18192d.m47777H(b2, bArr2, i20, c18194b2);
                b = c18194b2.f74128a;
            } else {
                b = b2;
                i3 = i20;
            }
            int i21 = b >>> 3;
            int i22 = b & 7;
            if (i21 > i16) {
                m48051f0 = c18152h.m48050g0(i21, i17 / 3);
            } else {
                m48051f0 = c18152h.m48051f0(i21);
            }
            int i23 = m48051f0;
            if (i23 == i14) {
                i4 = i3;
                i5 = i21;
                i6 = i14;
                unsafe = unsafe2;
                i7 = 0;
            } else {
                int i24 = c18152h.f74027a[i23 + 1];
                int m48033q0 = m48033q0(i24);
                long m48062U = m48062U(i24);
                if (m48033q0 <= 17) {
                    int i25 = c18152h.f74027a[i23 + 2];
                    int i26 = 1 << (i25 >>> 20);
                    int i27 = 1048575;
                    int i28 = i25 & 1048575;
                    if (i28 != i19) {
                        if (i19 != 1048575) {
                            unsafe2.putInt(t2, i19, i18);
                            i27 = 1048575;
                        }
                        if (i28 != i27) {
                            i18 = unsafe2.getInt(t2, i28);
                        }
                        i19 = i28;
                    }
                    switch (m48033q0) {
                        case 0:
                            i5 = i21;
                            c18194b2 = c18194b;
                            i8 = i23;
                            i9 = i18;
                            if (i22 != 1) {
                                i18 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                C52917ze6.m921N(t2, m48062U, C18192d.m47767d(bArr2, i3));
                                i15 = i3 + 8;
                                i18 = i9 | i26;
                                i17 = i8;
                                i16 = i5;
                                i14 = -1;
                                break;
                            }
                        case 1:
                            i5 = i21;
                            c18194b2 = c18194b;
                            i9 = i18;
                            i8 = i23;
                            if (i22 != 5) {
                                i18 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                C52917ze6.m920O(t2, m48062U, C18192d.m47759l(bArr2, i3));
                                i15 = i3 + 4;
                                i18 = i9 | i26;
                                i17 = i8;
                                i16 = i5;
                                i14 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i5 = i21;
                            c18194b2 = c18194b;
                            i8 = i23;
                            i9 = i18;
                            if (i22 != 0) {
                                i18 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                m47773L = C18192d.m47773L(bArr2, i3, c18194b2);
                                unsafe2.putLong(t, m48062U, c18194b2.f74129b);
                                i18 = i9 | i26;
                                i17 = i8;
                                i15 = m47773L;
                                i16 = i5;
                                i14 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            i5 = i21;
                            c18194b2 = c18194b;
                            i8 = i23;
                            i9 = i18;
                            if (i22 != 0) {
                                i18 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                i15 = C18192d.m47776I(bArr2, i3, c18194b2);
                                unsafe2.putInt(t2, m48062U, c18194b2.f74128a);
                                i18 = i9 | i26;
                                i17 = i8;
                                i16 = i5;
                                i14 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i5 = i21;
                            c18194b2 = c18194b;
                            i8 = i23;
                            i9 = i18;
                            if (i22 != 1) {
                                i18 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                unsafe2.putLong(t, m48062U, C18192d.m47761j(bArr2, i3));
                                i15 = i3 + 8;
                                i18 = i9 | i26;
                                i17 = i8;
                                i16 = i5;
                                i14 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i5 = i21;
                            c18194b2 = c18194b;
                            i9 = i18;
                            i8 = i23;
                            if (i22 != 5) {
                                i18 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                unsafe2.putInt(t2, m48062U, C18192d.m47763h(bArr2, i3));
                                i15 = i3 + 4;
                                i18 = i9 | i26;
                                i17 = i8;
                                i16 = i5;
                                i14 = -1;
                                break;
                            }
                        case 7:
                            i5 = i21;
                            c18194b2 = c18194b;
                            i8 = i23;
                            boolean z = true;
                            i9 = i18;
                            if (i22 != 0) {
                                i18 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                int m47773L2 = C18192d.m47773L(bArr2, i3, c18194b2);
                                if (c18194b2.f74129b == 0) {
                                    z = false;
                                }
                                C52917ze6.m927H(t2, m48062U, z);
                                i18 = i9 | i26;
                                i15 = m47773L2;
                                i17 = i8;
                                i16 = i5;
                                i14 = -1;
                                break;
                            }
                        case 8:
                            i5 = i21;
                            c18194b2 = c18194b;
                            i8 = i23;
                            i9 = i18;
                            if (i22 != 2) {
                                i18 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                if ((536870912 & i24) == 0) {
                                    i15 = C18192d.m47782C(bArr2, i3, c18194b2);
                                } else {
                                    i15 = C18192d.m47779F(bArr2, i3, c18194b2);
                                }
                                unsafe2.putObject(t2, m48062U, c18194b2.f74130c);
                                i18 = i9 | i26;
                                i17 = i8;
                                i16 = i5;
                                i14 = -1;
                                break;
                            }
                        case 9:
                            i5 = i21;
                            c18194b2 = c18194b;
                            i8 = i23;
                            if (i22 != 2) {
                                i9 = i18;
                                i18 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                m47755p = C18192d.m47755p(c18152h.m48026u(i8), bArr2, i3, i13, c18194b2);
                                Object object = unsafe2.getObject(t2, m48062U);
                                if (object == null) {
                                    unsafe2.putObject(t2, m48062U, c18194b2.f74130c);
                                } else {
                                    unsafe2.putObject(t2, m48062U, C18238v.m47416h(object, c18194b2.f74130c));
                                }
                                i18 |= i26;
                                i15 = m47755p;
                                i17 = i8;
                                i16 = i5;
                                i14 = -1;
                                break;
                            }
                        case 10:
                            i5 = i21;
                            c18194b2 = c18194b;
                            i8 = i23;
                            if (i22 != 2) {
                                i9 = i18;
                                i18 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                m47755p = C18192d.m47769b(bArr2, i3, c18194b2);
                                unsafe2.putObject(t2, m48062U, c18194b2.f74130c);
                                i18 |= i26;
                                i15 = m47755p;
                                i17 = i8;
                                i16 = i5;
                                i14 = -1;
                                break;
                            }
                        case 12:
                            i5 = i21;
                            c18194b2 = c18194b;
                            i8 = i23;
                            if (i22 != 0) {
                                i9 = i18;
                                i18 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                m47755p = C18192d.m47776I(bArr2, i3, c18194b2);
                                unsafe2.putInt(t2, m48062U, c18194b2.f74128a);
                                i18 |= i26;
                                i15 = m47755p;
                                i17 = i8;
                                i16 = i5;
                                i14 = -1;
                                break;
                            }
                        case 15:
                            i5 = i21;
                            c18194b2 = c18194b;
                            i8 = i23;
                            if (i22 != 0) {
                                i9 = i18;
                                i18 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                i15 = C18192d.m47776I(bArr2, i3, c18194b2);
                                unsafe2.putInt(t2, m48062U, AbstractC18211h.m47677b(c18194b2.f74128a));
                                i18 |= i26;
                                i17 = i8;
                                i16 = i5;
                                i14 = -1;
                                break;
                            }
                        case 16:
                            if (i22 != 0) {
                                i5 = i21;
                                i8 = i23;
                                i9 = i18;
                                i18 = i9;
                                i4 = i3;
                                i7 = i8;
                                unsafe = unsafe2;
                                i6 = -1;
                                break;
                            } else {
                                c18194b2 = c18194b;
                                m47773L = C18192d.m47773L(bArr2, i3, c18194b2);
                                i8 = i23;
                                i5 = i21;
                                unsafe2.putLong(t, m48062U, AbstractC18211h.m47676c(c18194b2.f74129b));
                                i18 |= i26;
                                i17 = i8;
                                i15 = m47773L;
                                i16 = i5;
                                i14 = -1;
                                break;
                            }
                        default:
                            i5 = i21;
                            i8 = i23;
                            i9 = i18;
                            i18 = i9;
                            i4 = i3;
                            i7 = i8;
                            unsafe = unsafe2;
                            i6 = -1;
                            break;
                    }
                } else {
                    i5 = i21;
                    int i29 = i18;
                    c18194b2 = c18194b;
                    if (m48033q0 == 27) {
                        if (i22 == 2) {
                            C18238v.InterfaceC18247i interfaceC18247i = (C18238v.InterfaceC18247i) unsafe2.getObject(t2, m48062U);
                            if (!interfaceC18247i.mo47396t()) {
                                int size = interfaceC18247i.size();
                                interfaceC18247i = interfaceC18247i.mo47397k(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t2, m48062U, interfaceC18247i);
                            }
                            i15 = C18192d.m47754q(c18152h.m48026u(i23), b, bArr, i3, i2, interfaceC18247i, c18194b);
                            i17 = i23;
                            i18 = i29;
                            i16 = i5;
                            i14 = -1;
                            c18152h = this;
                        } else {
                            i12 = i3;
                            i10 = i19;
                            i7 = i23;
                            unsafe = unsafe2;
                            i11 = i29;
                            i6 = -1;
                        }
                    } else if (m48033q0 <= 49) {
                        i11 = i29;
                        int i30 = i3;
                        i10 = i19;
                        i7 = i23;
                        i6 = -1;
                        unsafe = unsafe2;
                        i15 = m48052e0(t, bArr, i3, i2, b, i5, i22, i23, i24, m48033q0, m48062U, c18194b);
                    } else {
                        i10 = i19;
                        i7 = i23;
                        unsafe = unsafe2;
                        i11 = i29;
                        i6 = -1;
                        i12 = i3;
                        if (m48033q0 != 50) {
                            i15 = m48055b0(t, bArr, i12, i2, b, i5, i22, i24, m48033q0, m48062U, i7, c18194b);
                        } else if (i22 == 2) {
                            i15 = m48056a0(t, bArr, i12, i2, i7, m48062U, c18194b);
                        }
                    }
                    i4 = i12;
                    i18 = i11;
                    i19 = i10;
                }
                i14 = i6;
                unsafe2 = unsafe;
            }
            i15 = C18192d.m47778G(b, bArr, i4, i2, m48024v(t), c18194b);
            c18152h = this;
            t2 = t;
            bArr2 = bArr;
            i13 = i2;
            c18194b2 = c18194b;
            i16 = i5;
            i17 = i7;
            i14 = i6;
            unsafe2 = unsafe;
        }
        int i31 = i18;
        Unsafe unsafe3 = unsafe2;
        if (i19 != 1048575) {
            unsafe3.putInt(t, i19, i31);
        }
        if (i15 == i2) {
            return i15;
        }
        throw InvalidProtocolBufferException.m48004h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: e */
    public int mo47990e(T t) {
        int i;
        int m47418f;
        int length = this.f74027a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m48031r0 = m48031r0(i3);
            int m48063T = m48063T(i3);
            long m48062U = m48062U(m48031r0);
            int i4 = 37;
            switch (m48033q0(m48031r0)) {
                case 0:
                    i = i2 * 53;
                    m47418f = C18238v.m47418f(Double.doubleToLongBits(C52917ze6.m891x(t, m48062U)));
                    i2 = i + m47418f;
                    break;
                case 1:
                    i = i2 * 53;
                    m47418f = Float.floatToIntBits(C52917ze6.m890y(t, m48062U));
                    i2 = i + m47418f;
                    break;
                case 2:
                    i = i2 * 53;
                    m47418f = C18238v.m47418f(C52917ze6.m934A(t, m48062U));
                    i2 = i + m47418f;
                    break;
                case 3:
                    i = i2 * 53;
                    m47418f = C18238v.m47418f(C52917ze6.m934A(t, m48062U));
                    i2 = i + m47418f;
                    break;
                case 4:
                    i = i2 * 53;
                    m47418f = C52917ze6.m889z(t, m48062U);
                    i2 = i + m47418f;
                    break;
                case 5:
                    i = i2 * 53;
                    m47418f = C18238v.m47418f(C52917ze6.m934A(t, m48062U));
                    i2 = i + m47418f;
                    break;
                case 6:
                    i = i2 * 53;
                    m47418f = C52917ze6.m889z(t, m48062U);
                    i2 = i + m47418f;
                    break;
                case 7:
                    i = i2 * 53;
                    m47418f = C18238v.m47421c(C52917ze6.m897r(t, m48062U));
                    i2 = i + m47418f;
                    break;
                case 8:
                    i = i2 * 53;
                    m47418f = ((String) C52917ze6.m932C(t, m48062U)).hashCode();
                    i2 = i + m47418f;
                    break;
                case 9:
                    Object m932C = C52917ze6.m932C(t, m48062U);
                    if (m932C != null) {
                        i4 = m932C.hashCode();
                    }
                    i2 = (i2 * 53) + i4;
                    break;
                case 10:
                    i = i2 * 53;
                    m47418f = C52917ze6.m932C(t, m48062U).hashCode();
                    i2 = i + m47418f;
                    break;
                case 11:
                    i = i2 * 53;
                    m47418f = C52917ze6.m889z(t, m48062U);
                    i2 = i + m47418f;
                    break;
                case 12:
                    i = i2 * 53;
                    m47418f = C52917ze6.m889z(t, m48062U);
                    i2 = i + m47418f;
                    break;
                case 13:
                    i = i2 * 53;
                    m47418f = C52917ze6.m889z(t, m48062U);
                    i2 = i + m47418f;
                    break;
                case 14:
                    i = i2 * 53;
                    m47418f = C18238v.m47418f(C52917ze6.m934A(t, m48062U));
                    i2 = i + m47418f;
                    break;
                case 15:
                    i = i2 * 53;
                    m47418f = C52917ze6.m889z(t, m48062U);
                    i2 = i + m47418f;
                    break;
                case 16:
                    i = i2 * 53;
                    m47418f = C18238v.m47418f(C52917ze6.m934A(t, m48062U));
                    i2 = i + m47418f;
                    break;
                case 17:
                    Object m932C2 = C52917ze6.m932C(t, m48062U);
                    if (m932C2 != null) {
                        i4 = m932C2.hashCode();
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
                    m47418f = C52917ze6.m932C(t, m48062U).hashCode();
                    i2 = i + m47418f;
                    break;
                case 50:
                    i = i2 * 53;
                    m47418f = C52917ze6.m932C(t, m48062U).hashCode();
                    i2 = i + m47418f;
                    break;
                case 51:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = C18238v.m47418f(Double.doubleToLongBits(m48060W(t, m48062U)));
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = Float.floatToIntBits(m48059X(t, m48062U));
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = C18238v.m47418f(m48057Z(t, m48062U));
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = C18238v.m47418f(m48057Z(t, m48062U));
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = m48058Y(t, m48062U);
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = C18238v.m47418f(m48057Z(t, m48062U));
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = m48058Y(t, m48062U);
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = C18238v.m47421c(m48061V(t, m48062U));
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = ((String) C52917ze6.m932C(t, m48062U)).hashCode();
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = C52917ze6.m932C(t, m48062U).hashCode();
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = C52917ze6.m932C(t, m48062U).hashCode();
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = m48058Y(t, m48062U);
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = m48058Y(t, m48062U);
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = m48058Y(t, m48062U);
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = C18238v.m47418f(m48057Z(t, m48062U));
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = m48058Y(t, m48062U);
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = C18238v.m47418f(m48057Z(t, m48062U));
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m48075H(t, m48063T, i3)) {
                        i = i2 * 53;
                        m47418f = C52917ze6.m932C(t, m48062U).hashCode();
                        i2 = i + m47418f;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f74041o.mo47863g(t).hashCode();
        if (this.f74032f) {
            return (hashCode * 53) + this.f74042p.mo47525c(t).hashCode();
        }
        return hashCode;
    }

    /* renamed from: e0 */
    public final int m48052e0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C18192d.C18194b c18194b) throws IOException {
        int m47775J;
        Unsafe unsafe = f74026s;
        C18238v.InterfaceC18247i interfaceC18247i = (C18238v.InterfaceC18247i) unsafe.getObject(t, j2);
        if (!interfaceC18247i.mo47396t()) {
            int size = interfaceC18247i.size();
            interfaceC18247i = interfaceC18247i.mo47397k(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, interfaceC18247i);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return C18192d.m47752s(bArr, i, interfaceC18247i, c18194b);
                }
                if (i5 == 1) {
                    return C18192d.m47766e(i3, bArr, i, i2, interfaceC18247i, c18194b);
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    return C18192d.m47749v(bArr, i, interfaceC18247i, c18194b);
                }
                if (i5 == 5) {
                    return C18192d.m47758m(i3, bArr, i, i2, interfaceC18247i, c18194b);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return C18192d.m47745z(bArr, i, interfaceC18247i, c18194b);
                }
                if (i5 == 0) {
                    return C18192d.m47772M(i3, bArr, i, i2, interfaceC18247i, c18194b);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C18192d.m47746y(bArr, i, interfaceC18247i, c18194b);
                }
                if (i5 == 0) {
                    return C18192d.m47775J(i3, bArr, i, i2, interfaceC18247i, c18194b);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return C18192d.m47750u(bArr, i, interfaceC18247i, c18194b);
                }
                if (i5 == 1) {
                    return C18192d.m47760k(i3, bArr, i, i2, interfaceC18247i, c18194b);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return C18192d.m47751t(bArr, i, interfaceC18247i, c18194b);
                }
                if (i5 == 5) {
                    return C18192d.m47762i(i3, bArr, i, i2, interfaceC18247i, c18194b);
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    return C18192d.m47753r(bArr, i, interfaceC18247i, c18194b);
                }
                if (i5 == 0) {
                    return C18192d.m47770a(i3, bArr, i, i2, interfaceC18247i, c18194b);
                }
                break;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        return C18192d.m47781D(i3, bArr, i, i2, interfaceC18247i, c18194b);
                    }
                    return C18192d.m47780E(i3, bArr, i, i2, interfaceC18247i, c18194b);
                }
                break;
            case 27:
                if (i5 == 2) {
                    return C18192d.m47754q(m48026u(i6), i3, bArr, i, i2, interfaceC18247i, c18194b);
                }
                break;
            case 28:
                if (i5 == 2) {
                    return C18192d.m47768c(i3, bArr, i, i2, interfaceC18247i, c18194b);
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    m47775J = C18192d.m47746y(bArr, i, interfaceC18247i, c18194b);
                } else if (i5 == 0) {
                    m47775J = C18192d.m47775J(i3, bArr, i, i2, interfaceC18247i, c18194b);
                }
                AbstractC18230t abstractC18230t = (AbstractC18230t) t;
                C18170Q c18170q = abstractC18230t.unknownFields;
                if (c18170q == C18170Q.m47894c()) {
                    c18170q = null;
                }
                C18170Q c18170q2 = (C18170Q) C18158N.m47984A(i4, interfaceC18247i, m48030s(i6), c18170q, this.f74041o);
                if (c18170q2 != null) {
                    abstractC18230t.unknownFields = c18170q2;
                }
                return m47775J;
            case 33:
            case 47:
                if (i5 == 2) {
                    return C18192d.m47748w(bArr, i, interfaceC18247i, c18194b);
                }
                if (i5 == 0) {
                    return C18192d.m47784A(i3, bArr, i, i2, interfaceC18247i, c18194b);
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    return C18192d.m47747x(bArr, i, interfaceC18247i, c18194b);
                }
                if (i5 == 0) {
                    return C18192d.m47783B(i3, bArr, i, i2, interfaceC18247i, c18194b);
                }
                break;
            case 49:
                if (i5 == 3) {
                    return C18192d.m47756o(m48026u(i6), i3, bArr, i, i2, interfaceC18247i, c18194b);
                }
                break;
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: f */
    public final boolean mo47989f(T t) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f74037k) {
            int i6 = this.f74036j[i5];
            int m48063T = m48063T(i6);
            int m48031r0 = m48031r0(i6);
            int i7 = this.f74027a[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = f74026s.getInt(t, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i3;
                i2 = i4;
            }
            if (m48074I(m48031r0) && !m48080C(t, i6, i, i2, i9)) {
                return false;
            }
            int m48033q0 = m48033q0(m48031r0);
            if (m48033q0 != 9 && m48033q0 != 17) {
                if (m48033q0 != 27) {
                    if (m48033q0 != 60 && m48033q0 != 68) {
                        if (m48033q0 != 49) {
                            if (m48033q0 == 50 && !m48077F(t, m48031r0, i6)) {
                                return false;
                            }
                        }
                    } else if (m48075H(t, m48063T, i6) && !m48079D(t, m48031r0, m48026u(i6))) {
                        return false;
                    }
                }
                if (!m48078E(t, m48031r0, i6)) {
                    return false;
                }
            } else if (m48080C(t, i6, i, i2, i9) && !m48079D(t, m48031r0, m48026u(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f74032f && !this.f74042p.mo47525c(t).m47503o()) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public final int m48051f0(int i) {
        if (i >= this.f74029c && i <= this.f74030d) {
            return m48035p0(i, 0);
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: g */
    public void mo47988g(T t) {
        int i;
        int i2 = this.f74037k;
        while (true) {
            i = this.f74038l;
            if (i2 >= i) {
                break;
            }
            long m48062U = m48062U(m48031r0(this.f74036j[i2]));
            Object m932C = C52917ze6.m932C(t, m48062U);
            if (m932C != null) {
                C52917ze6.m917R(t, m48062U, this.f74043q.mo48096b(m932C));
            }
            i2++;
        }
        int length = this.f74036j.length;
        while (i < length) {
            this.f74040n.mo47391c(t, this.f74036j[i]);
            i++;
        }
        this.f74041o.mo47860j(t);
        if (this.f74032f) {
            this.f74042p.mo47522f(t);
        }
    }

    /* renamed from: g0 */
    public final int m48050g0(int i, int i2) {
        if (i >= this.f74029c && i <= this.f74030d) {
            return m48035p0(i, i2);
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: h */
    public int mo47987h(T t) {
        return this.f74034h ? m48020x(t) : m48022w(t);
    }

    /* renamed from: h0 */
    public final int m48049h0(int i) {
        return this.f74027a[i + 2];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: i */
    public void mo47986i(T t, InterfaceC18156L interfaceC18156L, C18219m c18219m) throws IOException {
        c18219m.getClass();
        m48071L(this.f74041o, this.f74042p, t, interfaceC18156L, c18219m);
    }

    /* renamed from: i0 */
    public final <E> void m48048i0(Object obj, long j, InterfaceC18156L interfaceC18156L, InterfaceC18157M<E> interfaceC18157M, C18219m c18219m) throws IOException {
        interfaceC18156L.mo47620P(this.f74040n.mo47389e(obj, j), interfaceC18157M, c18219m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18157M
    /* renamed from: j */
    public void mo47985j(T t, InterfaceC18186V interfaceC18186V) throws IOException {
        if (interfaceC18186V.mo47584B() == InterfaceC18186V.EnumC18187a.DESCENDING) {
            m48025u0(t, interfaceC18186V);
        } else if (this.f74034h) {
            m48027t0(t, interfaceC18186V);
        } else {
            m48029s0(t, interfaceC18186V);
        }
    }

    /* renamed from: j0 */
    public final <E> void m48047j0(Object obj, int i, InterfaceC18156L interfaceC18156L, InterfaceC18157M<E> interfaceC18157M, C18219m c18219m) throws IOException {
        interfaceC18156L.mo47623M(this.f74040n.mo47389e(obj, m48062U(i)), interfaceC18157M, c18219m);
    }

    /* renamed from: k */
    public final boolean m48046k(T t, T t2, int i) {
        return m48081B(t, i) == m48081B(t2, i);
    }

    /* renamed from: k0 */
    public final void m48045k0(Object obj, int i, InterfaceC18156L interfaceC18156L) throws IOException {
        if (m48082A(i)) {
            C52917ze6.m917R(obj, m48062U(i), interfaceC18156L.mo47627I());
        } else if (this.f74033g) {
            C52917ze6.m917R(obj, m48062U(i), interfaceC18156L.mo47629G());
        } else {
            C52917ze6.m917R(obj, m48062U(i), interfaceC18156L.mo47604h());
        }
    }

    /* renamed from: l0 */
    public final void m48043l0(Object obj, int i, InterfaceC18156L interfaceC18156L) throws IOException {
        if (m48082A(i)) {
            interfaceC18156L.mo47635A(this.f74040n.mo47389e(obj, m48062U(i)));
        } else {
            interfaceC18156L.mo47597o(this.f74040n.mo47389e(obj, m48062U(i)));
        }
    }

    /* renamed from: m */
    public final <K, V> int m48042m(byte[] bArr, int i, int i2, C18142B.C18143a<K, V> c18143a, Map<K, V> map, C18192d.C18194b c18194b) throws IOException {
        int m47776I = C18192d.m47776I(bArr, i, c18194b);
        int i3 = c18194b.f74128a;
        if (i3 >= 0 && i3 <= i2 - m47776I) {
            throw null;
        }
        throw InvalidProtocolBufferException.m48001k();
    }

    /* renamed from: n0 */
    public final void m48039n0(T t, int i) {
        int m48049h0 = m48049h0(i);
        long j = 1048575 & m48049h0;
        if (j == 1048575) {
            return;
        }
        C52917ze6.m919P(t, j, (1 << (m48049h0 >>> 20)) | C52917ze6.m889z(t, j));
    }

    /* renamed from: o */
    public final boolean m48038o(T t, T t2, int i) {
        int m48031r0 = m48031r0(i);
        long m48062U = m48062U(m48031r0);
        switch (m48033q0(m48031r0)) {
            case 0:
                if (!m48046k(t, t2, i) || Double.doubleToLongBits(C52917ze6.m891x(t, m48062U)) != Double.doubleToLongBits(C52917ze6.m891x(t2, m48062U))) {
                    return false;
                }
                return true;
            case 1:
                if (!m48046k(t, t2, i) || Float.floatToIntBits(C52917ze6.m890y(t, m48062U)) != Float.floatToIntBits(C52917ze6.m890y(t2, m48062U))) {
                    return false;
                }
                return true;
            case 2:
                if (!m48046k(t, t2, i) || C52917ze6.m934A(t, m48062U) != C52917ze6.m934A(t2, m48062U)) {
                    return false;
                }
                return true;
            case 3:
                if (!m48046k(t, t2, i) || C52917ze6.m934A(t, m48062U) != C52917ze6.m934A(t2, m48062U)) {
                    return false;
                }
                return true;
            case 4:
                if (!m48046k(t, t2, i) || C52917ze6.m889z(t, m48062U) != C52917ze6.m889z(t2, m48062U)) {
                    return false;
                }
                return true;
            case 5:
                if (!m48046k(t, t2, i) || C52917ze6.m934A(t, m48062U) != C52917ze6.m934A(t2, m48062U)) {
                    return false;
                }
                return true;
            case 6:
                if (!m48046k(t, t2, i) || C52917ze6.m889z(t, m48062U) != C52917ze6.m889z(t2, m48062U)) {
                    return false;
                }
                return true;
            case 7:
                if (!m48046k(t, t2, i) || C52917ze6.m897r(t, m48062U) != C52917ze6.m897r(t2, m48062U)) {
                    return false;
                }
                return true;
            case 8:
                if (!m48046k(t, t2, i) || !C18158N.m47974K(C52917ze6.m932C(t, m48062U), C52917ze6.m932C(t2, m48062U))) {
                    return false;
                }
                return true;
            case 9:
                if (!m48046k(t, t2, i) || !C18158N.m47974K(C52917ze6.m932C(t, m48062U), C52917ze6.m932C(t2, m48062U))) {
                    return false;
                }
                return true;
            case 10:
                if (!m48046k(t, t2, i) || !C18158N.m47974K(C52917ze6.m932C(t, m48062U), C52917ze6.m932C(t2, m48062U))) {
                    return false;
                }
                return true;
            case 11:
                if (!m48046k(t, t2, i) || C52917ze6.m889z(t, m48062U) != C52917ze6.m889z(t2, m48062U)) {
                    return false;
                }
                return true;
            case 12:
                if (!m48046k(t, t2, i) || C52917ze6.m889z(t, m48062U) != C52917ze6.m889z(t2, m48062U)) {
                    return false;
                }
                return true;
            case 13:
                if (!m48046k(t, t2, i) || C52917ze6.m889z(t, m48062U) != C52917ze6.m889z(t2, m48062U)) {
                    return false;
                }
                return true;
            case 14:
                if (!m48046k(t, t2, i) || C52917ze6.m934A(t, m48062U) != C52917ze6.m934A(t2, m48062U)) {
                    return false;
                }
                return true;
            case 15:
                if (!m48046k(t, t2, i) || C52917ze6.m889z(t, m48062U) != C52917ze6.m889z(t2, m48062U)) {
                    return false;
                }
                return true;
            case 16:
                if (!m48046k(t, t2, i) || C52917ze6.m934A(t, m48062U) != C52917ze6.m934A(t2, m48062U)) {
                    return false;
                }
                return true;
            case 17:
                if (!m48046k(t, t2, i) || !C18158N.m47974K(C52917ze6.m932C(t, m48062U), C52917ze6.m932C(t2, m48062U))) {
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
                return C18158N.m47974K(C52917ze6.m932C(t, m48062U), C52917ze6.m932C(t2, m48062U));
            case 50:
                return C18158N.m47974K(C52917ze6.m932C(t, m48062U), C52917ze6.m932C(t2, m48062U));
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
                if (!m48076G(t, t2, i) || !C18158N.m47974K(C52917ze6.m932C(t, m48062U), C52917ze6.m932C(t2, m48062U))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: o0 */
    public final void m48037o0(T t, int i, int i2) {
        C52917ze6.m919P(t, m48049h0(i2) & 1048575, i);
    }

    /* renamed from: p */
    public final <UT, UB> UB m48036p(Object obj, int i, UB ub, AbstractC18169P<UT, UB> abstractC18169P) {
        int m48063T = m48063T(i);
        Object m932C = C52917ze6.m932C(obj, m48062U(m48031r0(i)));
        if (m932C == null) {
            return ub;
        }
        C18238v.InterfaceC18243e m48030s = m48030s(i);
        if (m48030s == null) {
            return ub;
        }
        return (UB) m48034q(i, m48063T, this.f74043q.mo48093e(m932C), m48030s, ub, abstractC18169P);
    }

    /* renamed from: p0 */
    public final int m48035p0(int i, int i2) {
        int length = (this.f74027a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int m48063T = m48063T(i4);
            if (i == m48063T) {
                return i4;
            }
            if (i < m48063T) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final <K, V, UT, UB> UB m48034q(int i, int i2, Map<K, V> map, C18238v.InterfaceC18243e interfaceC18243e, UB ub, AbstractC18169P<UT, UB> abstractC18169P) {
        this.f74043q.mo48097a(m48028t(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!interfaceC18243e.m47413a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = abstractC18169P.mo47858n();
                }
                AbstractC18199g.C18207h m47695w = AbstractC18199g.m47695w(C18142B.m48211b(null, next.getKey(), next.getValue()));
                try {
                    C18142B.m48209d(m47695w.m47690b(), null, next.getKey(), next.getValue());
                    abstractC18169P.mo47866d(ub, i2, m47695w.m47691a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: r0 */
    public final int m48031r0(int i) {
        return this.f74027a[i + 1];
    }

    /* renamed from: s */
    public final C18238v.InterfaceC18243e m48030s(int i) {
        return (C18238v.InterfaceC18243e) this.f74028b[((i / 3) * 2) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x048f  */
    /* renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m48029s0(T t, InterfaceC18186V interfaceC18186V) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        int i2;
        if (this.f74032f) {
            C18225q<?> mo47525c = this.f74042p.mo47525c(t);
            if (!mo47525c.m47505m()) {
                it = mo47525c.m47500r();
                entry = it.next();
                length = this.f74027a.length;
                Unsafe unsafe = f74026s;
                int i3 = 1048575;
                int i4 = 1048575;
                i = 0;
                int i5 = 0;
                while (i < length) {
                    int m48031r0 = m48031r0(i);
                    int m48063T = m48063T(i);
                    int m48033q0 = m48033q0(m48031r0);
                    if (m48033q0 <= 17) {
                        int i6 = this.f74027a[i + 2];
                        int i7 = i6 & i3;
                        if (i7 != i4) {
                            i5 = unsafe.getInt(t, i7);
                            i4 = i7;
                        }
                        i2 = 1 << (i6 >>> 20);
                    } else {
                        i2 = 0;
                    }
                    while (entry != null && this.f74042p.mo47527a(entry) <= m48063T) {
                        this.f74042p.mo47518j(interfaceC18186V, entry);
                        if (it.hasNext()) {
                            entry = it.next();
                        } else {
                            entry = null;
                        }
                    }
                    long m48062U = m48062U(m48031r0);
                    switch (m48033q0) {
                        case 0:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47542z(m48063T, m48040n(t, m48062U));
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 1:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47580F(m48063T, m48032r(t, m48062U));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 2:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47583C(m48063T, unsafe.getLong(t, m48062U));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 3:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47563e(m48063T, unsafe.getLong(t, m48062U));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 4:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47561g(m48063T, unsafe.getInt(t, m48062U));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 5:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47555m(m48063T, unsafe.getLong(t, m48062U));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 6:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47565c(m48063T, unsafe.getInt(t, m48062U));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 7:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47554n(m48063T, m48044l(t, m48062U));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 8:
                            if ((i2 & i5) != 0) {
                                m48021w0(m48063T, unsafe.getObject(t, m48062U), interfaceC18186V);
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 9:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47573M(m48063T, unsafe.getObject(t, m48062U), m48026u(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 10:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47571O(m48063T, (AbstractC18199g) unsafe.getObject(t, m48062U));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 11:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47557k(m48063T, unsafe.getInt(t, m48062U));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 12:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47579G(m48063T, unsafe.getInt(t, m48062U));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 13:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47553o(m48063T, unsafe.getInt(t, m48062U));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 14:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47545w(m48063T, unsafe.getLong(t, m48062U));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 15:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47577I(m48063T, unsafe.getInt(t, m48062U));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 16:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47558j(m48063T, unsafe.getLong(t, m48062U));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 17:
                            if ((i2 & i5) != 0) {
                                interfaceC18186V.mo47575K(m48063T, unsafe.getObject(t, m48062U), m48026u(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            i3 = 1048575;
                        case 18:
                            C18158N.m47969P(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 19:
                            C18158N.m47965T(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 20:
                            C18158N.m47962W(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 21:
                            C18158N.m47949e0(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 22:
                            C18158N.m47963V(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 23:
                            C18158N.m47966S(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 24:
                            C18158N.m47967R(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 25:
                            C18158N.m47971N(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 26:
                            C18158N.m47953c0(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V);
                            break;
                        case 27:
                            C18158N.m47961X(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, m48026u(i));
                            break;
                        case 28:
                            C18158N.m47970O(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V);
                            break;
                        case 29:
                            C18158N.m47951d0(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 30:
                            C18158N.m47968Q(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 31:
                            C18158N.m47960Y(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 32:
                            C18158N.m47959Z(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 33:
                            C18158N.m47957a0(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 34:
                            C18158N.m47955b0(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, false);
                            continue;
                            i += 3;
                            i3 = 1048575;
                        case 35:
                            C18158N.m47969P(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, true);
                            break;
                        case 36:
                            C18158N.m47965T(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, true);
                            break;
                        case 37:
                            C18158N.m47962W(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, true);
                            break;
                        case 38:
                            C18158N.m47949e0(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, true);
                            break;
                        case 39:
                            C18158N.m47963V(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, true);
                            break;
                        case 40:
                            C18158N.m47966S(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, true);
                            break;
                        case 41:
                            C18158N.m47967R(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, true);
                            break;
                        case 42:
                            C18158N.m47971N(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, true);
                            break;
                        case 43:
                            C18158N.m47951d0(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, true);
                            break;
                        case 44:
                            C18158N.m47968Q(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, true);
                            break;
                        case 45:
                            C18158N.m47960Y(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, true);
                            break;
                        case 46:
                            C18158N.m47959Z(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, true);
                            break;
                        case 47:
                            C18158N.m47957a0(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, true);
                            break;
                        case 48:
                            C18158N.m47955b0(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, true);
                            break;
                        case 49:
                            C18158N.m47964U(m48063T(i), (List) unsafe.getObject(t, m48062U), interfaceC18186V, m48026u(i));
                            break;
                        case 50:
                            m48023v0(interfaceC18186V, m48063T, unsafe.getObject(t, m48062U), i);
                            break;
                        case 51:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47542z(m48063T, m48060W(t, m48062U));
                                break;
                            }
                            break;
                        case 52:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47580F(m48063T, m48059X(t, m48062U));
                                break;
                            }
                            break;
                        case 53:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47583C(m48063T, m48057Z(t, m48062U));
                                break;
                            }
                            break;
                        case 54:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47563e(m48063T, m48057Z(t, m48062U));
                                break;
                            }
                            break;
                        case 55:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47561g(m48063T, m48058Y(t, m48062U));
                                break;
                            }
                            break;
                        case 56:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47555m(m48063T, m48057Z(t, m48062U));
                                break;
                            }
                            break;
                        case 57:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47565c(m48063T, m48058Y(t, m48062U));
                                break;
                            }
                            break;
                        case 58:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47554n(m48063T, m48061V(t, m48062U));
                                break;
                            }
                            break;
                        case 59:
                            if (m48075H(t, m48063T, i)) {
                                m48021w0(m48063T, unsafe.getObject(t, m48062U), interfaceC18186V);
                                break;
                            }
                            break;
                        case 60:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47573M(m48063T, unsafe.getObject(t, m48062U), m48026u(i));
                                break;
                            }
                            break;
                        case 61:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47571O(m48063T, (AbstractC18199g) unsafe.getObject(t, m48062U));
                                break;
                            }
                            break;
                        case 62:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47557k(m48063T, m48058Y(t, m48062U));
                                break;
                            }
                            break;
                        case 63:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47579G(m48063T, m48058Y(t, m48062U));
                                break;
                            }
                            break;
                        case 64:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47553o(m48063T, m48058Y(t, m48062U));
                                break;
                            }
                            break;
                        case 65:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47545w(m48063T, m48057Z(t, m48062U));
                                break;
                            }
                            break;
                        case 66:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47577I(m48063T, m48058Y(t, m48062U));
                                break;
                            }
                            break;
                        case 67:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47558j(m48063T, m48057Z(t, m48062U));
                                break;
                            }
                            break;
                        case 68:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47575K(m48063T, unsafe.getObject(t, m48062U), m48026u(i));
                                break;
                            }
                            break;
                    }
                    i += 3;
                    i3 = 1048575;
                }
                while (entry != null) {
                    this.f74042p.mo47518j(interfaceC18186V, entry);
                    if (it.hasNext()) {
                        entry = it.next();
                    } else {
                        entry = null;
                    }
                }
                m48019x0(this.f74041o, t, interfaceC18186V);
            }
        }
        it = null;
        entry = null;
        length = this.f74027a.length;
        Unsafe unsafe2 = f74026s;
        int i32 = 1048575;
        int i42 = 1048575;
        i = 0;
        int i52 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        m48019x0(this.f74041o, t, interfaceC18186V);
    }

    /* renamed from: t */
    public final Object m48028t(int i) {
        return this.f74028b[(i / 3) * 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m48027t0(T t, InterfaceC18186V interfaceC18186V) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        int i;
        if (this.f74032f) {
            C18225q<?> mo47525c = this.f74042p.mo47525c(t);
            if (!mo47525c.m47505m()) {
                it = mo47525c.m47500r();
                entry = it.next();
                length = this.f74027a.length;
                for (i = 0; i < length; i += 3) {
                    int m48031r0 = m48031r0(i);
                    int m48063T = m48063T(i);
                    while (entry != null && this.f74042p.mo47527a(entry) <= m48063T) {
                        this.f74042p.mo47518j(interfaceC18186V, entry);
                        if (it.hasNext()) {
                            entry = it.next();
                        } else {
                            entry = null;
                        }
                    }
                    switch (m48033q0(m48031r0)) {
                        case 0:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47542z(m48063T, m48040n(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47580F(m48063T, m48032r(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47583C(m48063T, m48072K(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47563e(m48063T, m48072K(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47561g(m48063T, m48017z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47555m(m48063T, m48072K(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47565c(m48063T, m48017z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47554n(m48063T, m48044l(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (m48081B(t, i)) {
                                m48021w0(m48063T, C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47573M(m48063T, C52917ze6.m932C(t, m48062U(m48031r0)), m48026u(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47571O(m48063T, (AbstractC18199g) C52917ze6.m932C(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47557k(m48063T, m48017z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47579G(m48063T, m48017z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47553o(m48063T, m48017z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47545w(m48063T, m48072K(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47577I(m48063T, m48017z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47558j(m48063T, m48072K(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (m48081B(t, i)) {
                                interfaceC18186V.mo47575K(m48063T, C52917ze6.m932C(t, m48062U(m48031r0)), m48026u(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            C18158N.m47969P(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 19:
                            C18158N.m47965T(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 20:
                            C18158N.m47962W(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 21:
                            C18158N.m47949e0(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 22:
                            C18158N.m47963V(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 23:
                            C18158N.m47966S(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 24:
                            C18158N.m47967R(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 25:
                            C18158N.m47971N(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 26:
                            C18158N.m47953c0(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V);
                            break;
                        case 27:
                            C18158N.m47961X(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, m48026u(i));
                            break;
                        case 28:
                            C18158N.m47970O(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V);
                            break;
                        case 29:
                            C18158N.m47951d0(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 30:
                            C18158N.m47968Q(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 31:
                            C18158N.m47960Y(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 32:
                            C18158N.m47959Z(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 33:
                            C18158N.m47957a0(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 34:
                            C18158N.m47955b0(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 35:
                            C18158N.m47969P(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 36:
                            C18158N.m47965T(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 37:
                            C18158N.m47962W(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 38:
                            C18158N.m47949e0(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 39:
                            C18158N.m47963V(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 40:
                            C18158N.m47966S(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 41:
                            C18158N.m47967R(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 42:
                            C18158N.m47971N(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 43:
                            C18158N.m47951d0(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 44:
                            C18158N.m47968Q(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 45:
                            C18158N.m47960Y(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 46:
                            C18158N.m47959Z(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 47:
                            C18158N.m47957a0(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 48:
                            C18158N.m47955b0(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 49:
                            C18158N.m47964U(m48063T(i), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, m48026u(i));
                            break;
                        case 50:
                            m48023v0(interfaceC18186V, m48063T, C52917ze6.m932C(t, m48062U(m48031r0)), i);
                            break;
                        case 51:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47542z(m48063T, m48060W(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47580F(m48063T, m48059X(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47583C(m48063T, m48057Z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47563e(m48063T, m48057Z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47561g(m48063T, m48058Y(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47555m(m48063T, m48057Z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47565c(m48063T, m48058Y(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47554n(m48063T, m48061V(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (m48075H(t, m48063T, i)) {
                                m48021w0(m48063T, C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47573M(m48063T, C52917ze6.m932C(t, m48062U(m48031r0)), m48026u(i));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47571O(m48063T, (AbstractC18199g) C52917ze6.m932C(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47557k(m48063T, m48058Y(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47579G(m48063T, m48058Y(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47553o(m48063T, m48058Y(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47545w(m48063T, m48057Z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47577I(m48063T, m48058Y(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47558j(m48063T, m48057Z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (m48075H(t, m48063T, i)) {
                                interfaceC18186V.mo47575K(m48063T, C52917ze6.m932C(t, m48062U(m48031r0)), m48026u(i));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.f74042p.mo47518j(interfaceC18186V, entry);
                    if (it.hasNext()) {
                        entry = it.next();
                    } else {
                        entry = null;
                    }
                }
                m48019x0(this.f74041o, t, interfaceC18186V);
            }
        }
        it = null;
        entry = null;
        length = this.f74027a.length;
        while (i < length) {
        }
        while (entry != null) {
        }
        m48019x0(this.f74041o, t, interfaceC18186V);
    }

    /* renamed from: u */
    public final InterfaceC18157M m48026u(int i) {
        int i2 = (i / 3) * 2;
        InterfaceC18157M interfaceC18157M = (InterfaceC18157M) this.f74028b[i2];
        if (interfaceC18157M != null) {
            return interfaceC18157M;
        }
        InterfaceC18157M<T> m95652d = M94.m95655a().m95652d((Class) this.f74028b[i2 + 1]);
        this.f74028b[i2] = m95652d;
        return m95652d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m48025u0(T t, InterfaceC18186V interfaceC18186V) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, Object> entry;
        int length;
        m48019x0(this.f74041o, t, interfaceC18186V);
        if (this.f74032f) {
            C18225q<?> mo47525c = this.f74042p.mo47525c(t);
            if (!mo47525c.m47505m()) {
                it = mo47525c.m47511g();
                entry = it.next();
                for (length = this.f74027a.length - 3; length >= 0; length -= 3) {
                    int m48031r0 = m48031r0(length);
                    int m48063T = m48063T(length);
                    while (entry != null && this.f74042p.mo47527a(entry) > m48063T) {
                        this.f74042p.mo47518j(interfaceC18186V, entry);
                        if (it.hasNext()) {
                            entry = it.next();
                        } else {
                            entry = null;
                        }
                    }
                    switch (m48033q0(m48031r0)) {
                        case 0:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47542z(m48063T, m48040n(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47580F(m48063T, m48032r(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47583C(m48063T, m48072K(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47563e(m48063T, m48072K(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47561g(m48063T, m48017z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47555m(m48063T, m48072K(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47565c(m48063T, m48017z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47554n(m48063T, m48044l(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (m48081B(t, length)) {
                                m48021w0(m48063T, C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47573M(m48063T, C52917ze6.m932C(t, m48062U(m48031r0)), m48026u(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47571O(m48063T, (AbstractC18199g) C52917ze6.m932C(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47557k(m48063T, m48017z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47579G(m48063T, m48017z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47553o(m48063T, m48017z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47545w(m48063T, m48072K(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47577I(m48063T, m48017z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47558j(m48063T, m48072K(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (m48081B(t, length)) {
                                interfaceC18186V.mo47575K(m48063T, C52917ze6.m932C(t, m48062U(m48031r0)), m48026u(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            C18158N.m47969P(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 19:
                            C18158N.m47965T(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 20:
                            C18158N.m47962W(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 21:
                            C18158N.m47949e0(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 22:
                            C18158N.m47963V(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 23:
                            C18158N.m47966S(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 24:
                            C18158N.m47967R(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 25:
                            C18158N.m47971N(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 26:
                            C18158N.m47953c0(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V);
                            break;
                        case 27:
                            C18158N.m47961X(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, m48026u(length));
                            break;
                        case 28:
                            C18158N.m47970O(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V);
                            break;
                        case 29:
                            C18158N.m47951d0(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 30:
                            C18158N.m47968Q(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 31:
                            C18158N.m47960Y(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 32:
                            C18158N.m47959Z(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 33:
                            C18158N.m47957a0(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 34:
                            C18158N.m47955b0(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, false);
                            break;
                        case 35:
                            C18158N.m47969P(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 36:
                            C18158N.m47965T(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 37:
                            C18158N.m47962W(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 38:
                            C18158N.m47949e0(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 39:
                            C18158N.m47963V(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 40:
                            C18158N.m47966S(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 41:
                            C18158N.m47967R(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 42:
                            C18158N.m47971N(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 43:
                            C18158N.m47951d0(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 44:
                            C18158N.m47968Q(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 45:
                            C18158N.m47960Y(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 46:
                            C18158N.m47959Z(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 47:
                            C18158N.m47957a0(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 48:
                            C18158N.m47955b0(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, true);
                            break;
                        case 49:
                            C18158N.m47964U(m48063T(length), (List) C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V, m48026u(length));
                            break;
                        case 50:
                            m48023v0(interfaceC18186V, m48063T, C52917ze6.m932C(t, m48062U(m48031r0)), length);
                            break;
                        case 51:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47542z(m48063T, m48060W(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47580F(m48063T, m48059X(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47583C(m48063T, m48057Z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47563e(m48063T, m48057Z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47561g(m48063T, m48058Y(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47555m(m48063T, m48057Z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47565c(m48063T, m48058Y(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47554n(m48063T, m48061V(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (m48075H(t, m48063T, length)) {
                                m48021w0(m48063T, C52917ze6.m932C(t, m48062U(m48031r0)), interfaceC18186V);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47573M(m48063T, C52917ze6.m932C(t, m48062U(m48031r0)), m48026u(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47571O(m48063T, (AbstractC18199g) C52917ze6.m932C(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47557k(m48063T, m48058Y(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47579G(m48063T, m48058Y(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47553o(m48063T, m48058Y(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47545w(m48063T, m48057Z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47577I(m48063T, m48058Y(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47558j(m48063T, m48057Z(t, m48062U(m48031r0)));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (m48075H(t, m48063T, length)) {
                                interfaceC18186V.mo47575K(m48063T, C52917ze6.m932C(t, m48062U(m48031r0)), m48026u(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.f74042p.mo47518j(interfaceC18186V, entry);
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

    /* renamed from: v0 */
    public final <K, V> void m48023v0(InterfaceC18186V interfaceC18186V, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.f74043q.mo48097a(m48028t(i2));
            interfaceC18186V.mo47576J(i, null, this.f74043q.mo48091g(obj));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: w */
    public final int m48022w(T t) {
        int i;
        int i2;
        int m48151i;
        int m48158d;
        int m48180K;
        boolean z;
        int m47948f;
        int m47945i;
        int m48169U;
        int m48167W;
        Unsafe unsafe = f74026s;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < this.f74027a.length) {
            int m48031r0 = m48031r0(i5);
            int m48063T = m48063T(i5);
            int m48033q0 = m48033q0(m48031r0);
            if (m48033q0 <= 17) {
                i = this.f74027a[i5 + 2];
                int i8 = i & i3;
                i2 = 1 << (i >>> 20);
                if (i8 != i4) {
                    i7 = unsafe.getInt(t, i8);
                    i4 = i8;
                }
            } else {
                if (this.f74035i && m48033q0 >= EnumC37554Zk1.f49100T.m72595a() && m48033q0 <= EnumC37554Zk1.f49130w0.m72595a()) {
                    i = this.f74027a[i5 + 2] & i3;
                } else {
                    i = 0;
                }
                i2 = 0;
            }
            long m48062U = m48062U(m48031r0);
            switch (m48033q0) {
                case 0:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m48151i = CodedOutputStream.m48151i(m48063T, 0.0d);
                        i6 += m48151i;
                        break;
                    }
                case 1:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m48151i = CodedOutputStream.m48138q(m48063T, 0.0f);
                        i6 += m48151i;
                        break;
                    }
                case 2:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m48151i = CodedOutputStream.m48127x(m48063T, unsafe.getLong(t, m48062U));
                        i6 += m48151i;
                        break;
                    }
                case 3:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m48151i = CodedOutputStream.m48166X(m48063T, unsafe.getLong(t, m48062U));
                        i6 += m48151i;
                        break;
                    }
                case 4:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m48151i = CodedOutputStream.m48130v(m48063T, unsafe.getInt(t, m48062U));
                        i6 += m48151i;
                        break;
                    }
                case 5:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        m48151i = CodedOutputStream.m48140o(m48063T, 0L);
                        i6 += m48151i;
                        break;
                    }
                case 6:
                    if ((i7 & i2) != 0) {
                        m48151i = CodedOutputStream.m48144m(m48063T, 0);
                        i6 += m48151i;
                        break;
                    }
                    break;
                case 7:
                    if ((i7 & i2) != 0) {
                        m48158d = CodedOutputStream.m48158d(m48063T, true);
                        i6 += m48158d;
                    }
                    break;
                case 8:
                    if ((i7 & i2) != 0) {
                        Object object = unsafe.getObject(t, m48062U);
                        if (object instanceof AbstractC18199g) {
                            m48158d = CodedOutputStream.m48153g(m48063T, (AbstractC18199g) object);
                        } else {
                            m48158d = CodedOutputStream.m48171S(m48063T, (String) object);
                        }
                        i6 += m48158d;
                    }
                    break;
                case 9:
                    if ((i7 & i2) != 0) {
                        m48158d = C18158N.m47939o(m48063T, unsafe.getObject(t, m48062U), m48026u(i5));
                        i6 += m48158d;
                    }
                    break;
                case 10:
                    if ((i7 & i2) != 0) {
                        m48158d = CodedOutputStream.m48153g(m48063T, (AbstractC18199g) unsafe.getObject(t, m48062U));
                        i6 += m48158d;
                    }
                    break;
                case 11:
                    if ((i7 & i2) != 0) {
                        m48158d = CodedOutputStream.m48168V(m48063T, unsafe.getInt(t, m48062U));
                        i6 += m48158d;
                    }
                    break;
                case 12:
                    if ((i7 & i2) != 0) {
                        m48158d = CodedOutputStream.m48148k(m48063T, unsafe.getInt(t, m48062U));
                        i6 += m48158d;
                    }
                    break;
                case 13:
                    if ((i7 & i2) != 0) {
                        m48180K = CodedOutputStream.m48180K(m48063T, 0);
                        i6 += m48180K;
                    }
                    break;
                case 14:
                    if ((i7 & i2) != 0) {
                        m48158d = CodedOutputStream.m48177M(m48063T, 0L);
                        i6 += m48158d;
                    }
                    break;
                case 15:
                    if ((i7 & i2) != 0) {
                        m48158d = CodedOutputStream.m48175O(m48063T, unsafe.getInt(t, m48062U));
                        i6 += m48158d;
                    }
                    break;
                case 16:
                    if ((i7 & i2) != 0) {
                        m48158d = CodedOutputStream.m48173Q(m48063T, unsafe.getLong(t, m48062U));
                        i6 += m48158d;
                    }
                    break;
                case 17:
                    if ((i7 & i2) != 0) {
                        m48158d = CodedOutputStream.m48136s(m48063T, (InterfaceC18149F) unsafe.getObject(t, m48062U), m48026u(i5));
                        i6 += m48158d;
                    }
                    break;
                case 18:
                    m48158d = C18158N.m47946h(m48063T, (List) unsafe.getObject(t, m48062U), false);
                    i6 += m48158d;
                    break;
                case 19:
                    z = false;
                    m47948f = C18158N.m47948f(m48063T, (List) unsafe.getObject(t, m48062U), false);
                    i6 += m47948f;
                    break;
                case 20:
                    z = false;
                    m47948f = C18158N.m47941m(m48063T, (List) unsafe.getObject(t, m48062U), false);
                    i6 += m47948f;
                    break;
                case 21:
                    z = false;
                    m47948f = C18158N.m47930x(m48063T, (List) unsafe.getObject(t, m48062U), false);
                    i6 += m47948f;
                    break;
                case 22:
                    z = false;
                    m47948f = C18158N.m47943k(m48063T, (List) unsafe.getObject(t, m48062U), false);
                    i6 += m47948f;
                    break;
                case 23:
                    z = false;
                    m47948f = C18158N.m47946h(m48063T, (List) unsafe.getObject(t, m48062U), false);
                    i6 += m47948f;
                    break;
                case 24:
                    z = false;
                    m47948f = C18158N.m47948f(m48063T, (List) unsafe.getObject(t, m48062U), false);
                    i6 += m47948f;
                    break;
                case 25:
                    z = false;
                    m47948f = C18158N.m47958a(m48063T, (List) unsafe.getObject(t, m48062U), false);
                    i6 += m47948f;
                    break;
                case 26:
                    m48158d = C18158N.m47933u(m48063T, (List) unsafe.getObject(t, m48062U));
                    i6 += m48158d;
                    break;
                case 27:
                    m48158d = C18158N.m47938p(m48063T, (List) unsafe.getObject(t, m48062U), m48026u(i5));
                    i6 += m48158d;
                    break;
                case 28:
                    m48158d = C18158N.m47954c(m48063T, (List) unsafe.getObject(t, m48062U));
                    i6 += m48158d;
                    break;
                case 29:
                    m48158d = C18158N.m47932v(m48063T, (List) unsafe.getObject(t, m48062U), false);
                    i6 += m48158d;
                    break;
                case 30:
                    z = false;
                    m47948f = C18158N.m47952d(m48063T, (List) unsafe.getObject(t, m48062U), false);
                    i6 += m47948f;
                    break;
                case 31:
                    z = false;
                    m47948f = C18158N.m47948f(m48063T, (List) unsafe.getObject(t, m48062U), false);
                    i6 += m47948f;
                    break;
                case 32:
                    z = false;
                    m47948f = C18158N.m47946h(m48063T, (List) unsafe.getObject(t, m48062U), false);
                    i6 += m47948f;
                    break;
                case 33:
                    z = false;
                    m47948f = C18158N.m47937q(m48063T, (List) unsafe.getObject(t, m48062U), false);
                    i6 += m47948f;
                    break;
                case 34:
                    z = false;
                    m47948f = C18158N.m47935s(m48063T, (List) unsafe.getObject(t, m48062U), false);
                    i6 += m47948f;
                    break;
                case 35:
                    m47945i = C18158N.m47945i((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48180K = m48169U + m48167W + m47945i;
                        i6 += m48180K;
                    }
                    break;
                case 36:
                    m47945i = C18158N.m47947g((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48180K = m48169U + m48167W + m47945i;
                        i6 += m48180K;
                    }
                    break;
                case 37:
                    m47945i = C18158N.m47940n((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48180K = m48169U + m48167W + m47945i;
                        i6 += m48180K;
                    }
                    break;
                case 38:
                    m47945i = C18158N.m47929y((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48180K = m48169U + m48167W + m47945i;
                        i6 += m48180K;
                    }
                    break;
                case 39:
                    m47945i = C18158N.m47942l((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48180K = m48169U + m48167W + m47945i;
                        i6 += m48180K;
                    }
                    break;
                case 40:
                    m47945i = C18158N.m47945i((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48180K = m48169U + m48167W + m47945i;
                        i6 += m48180K;
                    }
                    break;
                case 41:
                    m47945i = C18158N.m47947g((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48180K = m48169U + m48167W + m47945i;
                        i6 += m48180K;
                    }
                    break;
                case 42:
                    m47945i = C18158N.m47956b((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48180K = m48169U + m48167W + m47945i;
                        i6 += m48180K;
                    }
                    break;
                case 43:
                    m47945i = C18158N.m47931w((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48180K = m48169U + m48167W + m47945i;
                        i6 += m48180K;
                    }
                    break;
                case 44:
                    m47945i = C18158N.m47950e((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48180K = m48169U + m48167W + m47945i;
                        i6 += m48180K;
                    }
                    break;
                case 45:
                    m47945i = C18158N.m47947g((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48180K = m48169U + m48167W + m47945i;
                        i6 += m48180K;
                    }
                    break;
                case 46:
                    m47945i = C18158N.m47945i((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48180K = m48169U + m48167W + m47945i;
                        i6 += m48180K;
                    }
                    break;
                case 47:
                    m47945i = C18158N.m47936r((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48180K = m48169U + m48167W + m47945i;
                        i6 += m48180K;
                    }
                    break;
                case 48:
                    m47945i = C18158N.m47934t((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48180K = m48169U + m48167W + m47945i;
                        i6 += m48180K;
                    }
                    break;
                case 49:
                    m48158d = C18158N.m47944j(m48063T, (List) unsafe.getObject(t, m48062U), m48026u(i5));
                    i6 += m48158d;
                    break;
                case 50:
                    m48158d = this.f74043q.mo48094d(m48063T, unsafe.getObject(t, m48062U), m48028t(i5));
                    i6 += m48158d;
                    break;
                case 51:
                    if (m48075H(t, m48063T, i5)) {
                        m48158d = CodedOutputStream.m48151i(m48063T, 0.0d);
                        i6 += m48158d;
                    }
                    break;
                case 52:
                    if (m48075H(t, m48063T, i5)) {
                        m48158d = CodedOutputStream.m48138q(m48063T, 0.0f);
                        i6 += m48158d;
                    }
                    break;
                case 53:
                    if (m48075H(t, m48063T, i5)) {
                        m48158d = CodedOutputStream.m48127x(m48063T, m48057Z(t, m48062U));
                        i6 += m48158d;
                    }
                    break;
                case 54:
                    if (m48075H(t, m48063T, i5)) {
                        m48158d = CodedOutputStream.m48166X(m48063T, m48057Z(t, m48062U));
                        i6 += m48158d;
                    }
                    break;
                case 55:
                    if (m48075H(t, m48063T, i5)) {
                        m48158d = CodedOutputStream.m48130v(m48063T, m48058Y(t, m48062U));
                        i6 += m48158d;
                    }
                    break;
                case 56:
                    if (m48075H(t, m48063T, i5)) {
                        m48158d = CodedOutputStream.m48140o(m48063T, 0L);
                        i6 += m48158d;
                    }
                    break;
                case 57:
                    if (m48075H(t, m48063T, i5)) {
                        m48180K = CodedOutputStream.m48144m(m48063T, 0);
                        i6 += m48180K;
                    }
                    break;
                case 58:
                    if (m48075H(t, m48063T, i5)) {
                        m48158d = CodedOutputStream.m48158d(m48063T, true);
                        i6 += m48158d;
                    }
                    break;
                case 59:
                    if (m48075H(t, m48063T, i5)) {
                        Object object2 = unsafe.getObject(t, m48062U);
                        if (object2 instanceof AbstractC18199g) {
                            m48158d = CodedOutputStream.m48153g(m48063T, (AbstractC18199g) object2);
                        } else {
                            m48158d = CodedOutputStream.m48171S(m48063T, (String) object2);
                        }
                        i6 += m48158d;
                    }
                    break;
                case 60:
                    if (m48075H(t, m48063T, i5)) {
                        m48158d = C18158N.m47939o(m48063T, unsafe.getObject(t, m48062U), m48026u(i5));
                        i6 += m48158d;
                    }
                    break;
                case 61:
                    if (m48075H(t, m48063T, i5)) {
                        m48158d = CodedOutputStream.m48153g(m48063T, (AbstractC18199g) unsafe.getObject(t, m48062U));
                        i6 += m48158d;
                    }
                    break;
                case 62:
                    if (m48075H(t, m48063T, i5)) {
                        m48158d = CodedOutputStream.m48168V(m48063T, m48058Y(t, m48062U));
                        i6 += m48158d;
                    }
                    break;
                case 63:
                    if (m48075H(t, m48063T, i5)) {
                        m48158d = CodedOutputStream.m48148k(m48063T, m48058Y(t, m48062U));
                        i6 += m48158d;
                    }
                    break;
                case 64:
                    if (m48075H(t, m48063T, i5)) {
                        m48180K = CodedOutputStream.m48180K(m48063T, 0);
                        i6 += m48180K;
                    }
                    break;
                case 65:
                    if (m48075H(t, m48063T, i5)) {
                        m48158d = CodedOutputStream.m48177M(m48063T, 0L);
                        i6 += m48158d;
                    }
                    break;
                case 66:
                    if (m48075H(t, m48063T, i5)) {
                        m48158d = CodedOutputStream.m48175O(m48063T, m48058Y(t, m48062U));
                        i6 += m48158d;
                    }
                    break;
                case 67:
                    if (m48075H(t, m48063T, i5)) {
                        m48158d = CodedOutputStream.m48173Q(m48063T, m48057Z(t, m48062U));
                        i6 += m48158d;
                    }
                    break;
                case 68:
                    if (m48075H(t, m48063T, i5)) {
                        m48158d = CodedOutputStream.m48136s(m48063T, (InterfaceC18149F) unsafe.getObject(t, m48062U), m48026u(i5));
                        i6 += m48158d;
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
        }
        int m48018y = i6 + m48018y(this.f74041o, t);
        if (this.f74032f) {
            return m48018y + this.f74042p.mo47525c(t).m47506l();
        }
        return m48018y;
    }

    /* renamed from: w0 */
    public final void m48021w0(int i, Object obj, InterfaceC18186V interfaceC18186V) throws IOException {
        if (obj instanceof String) {
            interfaceC18186V.mo47564d(i, (String) obj);
        } else {
            interfaceC18186V.mo47571O(i, (AbstractC18199g) obj);
        }
    }

    /* renamed from: x */
    public final int m48020x(T t) {
        int i;
        int m48151i;
        int m47945i;
        int m48169U;
        int m48167W;
        Unsafe unsafe = f74026s;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f74027a.length; i3 += 3) {
            int m48031r0 = m48031r0(i3);
            int m48033q0 = m48033q0(m48031r0);
            int m48063T = m48063T(i3);
            long m48062U = m48062U(m48031r0);
            if (m48033q0 >= EnumC37554Zk1.f49100T.m72595a() && m48033q0 <= EnumC37554Zk1.f49130w0.m72595a()) {
                i = this.f74027a[i3 + 2] & 1048575;
            } else {
                i = 0;
            }
            switch (m48033q0) {
                case 0:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48151i(m48063T, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48138q(m48063T, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48127x(m48063T, C52917ze6.m934A(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48166X(m48063T, C52917ze6.m934A(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48130v(m48063T, C52917ze6.m889z(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48140o(m48063T, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48144m(m48063T, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48158d(m48063T, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (m48081B(t, i3)) {
                        Object m932C = C52917ze6.m932C(t, m48062U);
                        if (m932C instanceof AbstractC18199g) {
                            m48151i = CodedOutputStream.m48153g(m48063T, (AbstractC18199g) m932C);
                            break;
                        } else {
                            m48151i = CodedOutputStream.m48171S(m48063T, (String) m932C);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (m48081B(t, i3)) {
                        m48151i = C18158N.m47939o(m48063T, C52917ze6.m932C(t, m48062U), m48026u(i3));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48153g(m48063T, (AbstractC18199g) C52917ze6.m932C(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48168V(m48063T, C52917ze6.m889z(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48148k(m48063T, C52917ze6.m889z(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48180K(m48063T, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48177M(m48063T, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48175O(m48063T, C52917ze6.m889z(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48173Q(m48063T, C52917ze6.m934A(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (m48081B(t, i3)) {
                        m48151i = CodedOutputStream.m48136s(m48063T, (InterfaceC18149F) C52917ze6.m932C(t, m48062U), m48026u(i3));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    m48151i = C18158N.m47946h(m48063T, m48073J(t, m48062U), false);
                    break;
                case 19:
                    m48151i = C18158N.m47948f(m48063T, m48073J(t, m48062U), false);
                    break;
                case 20:
                    m48151i = C18158N.m47941m(m48063T, m48073J(t, m48062U), false);
                    break;
                case 21:
                    m48151i = C18158N.m47930x(m48063T, m48073J(t, m48062U), false);
                    break;
                case 22:
                    m48151i = C18158N.m47943k(m48063T, m48073J(t, m48062U), false);
                    break;
                case 23:
                    m48151i = C18158N.m47946h(m48063T, m48073J(t, m48062U), false);
                    break;
                case 24:
                    m48151i = C18158N.m47948f(m48063T, m48073J(t, m48062U), false);
                    break;
                case 25:
                    m48151i = C18158N.m47958a(m48063T, m48073J(t, m48062U), false);
                    break;
                case 26:
                    m48151i = C18158N.m47933u(m48063T, m48073J(t, m48062U));
                    break;
                case 27:
                    m48151i = C18158N.m47938p(m48063T, m48073J(t, m48062U), m48026u(i3));
                    break;
                case 28:
                    m48151i = C18158N.m47954c(m48063T, m48073J(t, m48062U));
                    break;
                case 29:
                    m48151i = C18158N.m47932v(m48063T, m48073J(t, m48062U), false);
                    break;
                case 30:
                    m48151i = C18158N.m47952d(m48063T, m48073J(t, m48062U), false);
                    break;
                case 31:
                    m48151i = C18158N.m47948f(m48063T, m48073J(t, m48062U), false);
                    break;
                case 32:
                    m48151i = C18158N.m47946h(m48063T, m48073J(t, m48062U), false);
                    break;
                case 33:
                    m48151i = C18158N.m47937q(m48063T, m48073J(t, m48062U), false);
                    break;
                case 34:
                    m48151i = C18158N.m47935s(m48063T, m48073J(t, m48062U), false);
                    break;
                case 35:
                    m47945i = C18158N.m47945i((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48151i = m48169U + m48167W + m47945i;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    m47945i = C18158N.m47947g((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48151i = m48169U + m48167W + m47945i;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    m47945i = C18158N.m47940n((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48151i = m48169U + m48167W + m47945i;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    m47945i = C18158N.m47929y((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48151i = m48169U + m48167W + m47945i;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    m47945i = C18158N.m47942l((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48151i = m48169U + m48167W + m47945i;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    m47945i = C18158N.m47945i((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48151i = m48169U + m48167W + m47945i;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    m47945i = C18158N.m47947g((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48151i = m48169U + m48167W + m47945i;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    m47945i = C18158N.m47956b((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48151i = m48169U + m48167W + m47945i;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    m47945i = C18158N.m47931w((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48151i = m48169U + m48167W + m47945i;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    m47945i = C18158N.m47950e((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48151i = m48169U + m48167W + m47945i;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    m47945i = C18158N.m47947g((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48151i = m48169U + m48167W + m47945i;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    m47945i = C18158N.m47945i((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48151i = m48169U + m48167W + m47945i;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    m47945i = C18158N.m47936r((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48151i = m48169U + m48167W + m47945i;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    m47945i = C18158N.m47934t((List) unsafe.getObject(t, m48062U));
                    if (m47945i > 0) {
                        if (this.f74035i) {
                            unsafe.putInt(t, i, m47945i);
                        }
                        m48169U = CodedOutputStream.m48169U(m48063T);
                        m48167W = CodedOutputStream.m48167W(m47945i);
                        m48151i = m48169U + m48167W + m47945i;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    m48151i = C18158N.m47944j(m48063T, m48073J(t, m48062U), m48026u(i3));
                    break;
                case 50:
                    m48151i = this.f74043q.mo48094d(m48063T, C52917ze6.m932C(t, m48062U), m48028t(i3));
                    break;
                case 51:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48151i(m48063T, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48138q(m48063T, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48127x(m48063T, m48057Z(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48166X(m48063T, m48057Z(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48130v(m48063T, m48058Y(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48140o(m48063T, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48144m(m48063T, 0);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48158d(m48063T, true);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (m48075H(t, m48063T, i3)) {
                        Object m932C2 = C52917ze6.m932C(t, m48062U);
                        if (m932C2 instanceof AbstractC18199g) {
                            m48151i = CodedOutputStream.m48153g(m48063T, (AbstractC18199g) m932C2);
                            break;
                        } else {
                            m48151i = CodedOutputStream.m48171S(m48063T, (String) m932C2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = C18158N.m47939o(m48063T, C52917ze6.m932C(t, m48062U), m48026u(i3));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48153g(m48063T, (AbstractC18199g) C52917ze6.m932C(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48168V(m48063T, m48058Y(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48148k(m48063T, m48058Y(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48180K(m48063T, 0);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48177M(m48063T, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48175O(m48063T, m48058Y(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48173Q(m48063T, m48057Z(t, m48062U));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (m48075H(t, m48063T, i3)) {
                        m48151i = CodedOutputStream.m48136s(m48063T, (InterfaceC18149F) C52917ze6.m932C(t, m48062U), m48026u(i3));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i2 += m48151i;
        }
        return i2 + m48018y(this.f74041o, t);
    }

    /* renamed from: x0 */
    public final <UT, UB> void m48019x0(AbstractC18169P<UT, UB> abstractC18169P, T t, InterfaceC18186V interfaceC18186V) throws IOException {
        abstractC18169P.mo47852t(abstractC18169P.mo47863g(t), interfaceC18186V);
    }

    /* renamed from: y */
    public final <UT, UB> int m48018y(AbstractC18169P<UT, UB> abstractC18169P, T t) {
        return abstractC18169P.mo47862h(abstractC18169P.mo47863g(t));
    }
}
