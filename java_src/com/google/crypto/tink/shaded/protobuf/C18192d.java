package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18178U;
import com.google.crypto.tink.shaded.protobuf.C18238v;
import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: com.google.crypto.tink.shaded.protobuf.d */
/* loaded from: classes6.dex */
public final class C18192d {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.d$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C18193a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74127a;

        static {
            int[] iArr = new int[C18178U.EnumC18180b.values().length];
            f74127a = iArr;
            try {
                iArr[C18178U.EnumC18180b.f74089d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74090e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74091f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74092g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74093h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74101p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74094i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74104s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74095j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74103r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74096k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74105t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74106u.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74102q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74100o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74097l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74098m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f74127a[C18178U.EnumC18180b.f74099n.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* renamed from: A */
    public static int m47784A(int i, byte[] bArr, int i2, int i3, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) {
        C18237u c18237u = (C18237u) interfaceC18247i;
        int m47776I = m47776I(bArr, i2, c18194b);
        c18237u.m47434L2(AbstractC18211h.m47677b(c18194b.f74128a));
        while (m47776I < i3) {
            int m47776I2 = m47776I(bArr, m47776I, c18194b);
            if (i != c18194b.f74128a) {
                break;
            }
            m47776I = m47776I(bArr, m47776I2, c18194b);
            c18237u.m47434L2(AbstractC18211h.m47677b(c18194b.f74128a));
        }
        return m47776I;
    }

    /* renamed from: B */
    public static int m47783B(int i, byte[] bArr, int i2, int i3, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) {
        C18141A c18141a = (C18141A) interfaceC18247i;
        int m47773L = m47773L(bArr, i2, c18194b);
        c18141a.m48221f(AbstractC18211h.m47676c(c18194b.f74129b));
        while (m47773L < i3) {
            int m47776I = m47776I(bArr, m47773L, c18194b);
            if (i != c18194b.f74128a) {
                break;
            }
            m47773L = m47773L(bArr, m47776I, c18194b);
            c18141a.m48221f(AbstractC18211h.m47676c(c18194b.f74129b));
        }
        return m47773L;
    }

    /* renamed from: C */
    public static int m47782C(byte[] bArr, int i, C18194b c18194b) throws InvalidProtocolBufferException {
        int m47776I = m47776I(bArr, i, c18194b);
        int i2 = c18194b.f74128a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c18194b.f74130c = "";
                return m47776I;
            }
            c18194b.f74130c = new String(bArr, m47776I, i2, C18238v.f74218b);
            return m47776I + i2;
        }
        throw InvalidProtocolBufferException.m48005g();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x001a -> B:9:0x001b). Please submit an issue!!! */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m47781D(int i, byte[] bArr, int i2, int i3, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) throws InvalidProtocolBufferException {
        int m47776I = m47776I(bArr, i2, c18194b);
        int i4 = c18194b.f74128a;
        if (i4 >= 0) {
            if (i4 == 0) {
                interfaceC18247i.add("");
                while (m47776I < i3) {
                    int m47776I2 = m47776I(bArr, m47776I, c18194b);
                    if (i != c18194b.f74128a) {
                        break;
                    }
                    m47776I = m47776I(bArr, m47776I2, c18194b);
                    i4 = c18194b.f74128a;
                    if (i4 >= 0) {
                        if (i4 == 0) {
                            interfaceC18247i.add("");
                        } else {
                            interfaceC18247i.add(new String(bArr, m47776I, i4, C18238v.f74218b));
                            m47776I += i4;
                            while (m47776I < i3) {
                            }
                        }
                    } else {
                        throw InvalidProtocolBufferException.m48005g();
                    }
                }
                return m47776I;
            }
            interfaceC18247i.add(new String(bArr, m47776I, i4, C18238v.f74218b));
            m47776I += i4;
            while (m47776I < i3) {
            }
            return m47776I;
        }
        throw InvalidProtocolBufferException.m48005g();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0023). Please submit an issue!!! */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m47780E(int i, byte[] bArr, int i2, int i3, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) throws InvalidProtocolBufferException {
        int i4;
        int m47776I = m47776I(bArr, i2, c18194b);
        int i5 = c18194b.f74128a;
        if (i5 >= 0) {
            if (i5 == 0) {
                interfaceC18247i.add("");
                while (m47776I < i3) {
                    int m47776I2 = m47776I(bArr, m47776I, c18194b);
                    if (i != c18194b.f74128a) {
                        break;
                    }
                    m47776I = m47776I(bArr, m47776I2, c18194b);
                    int i6 = c18194b.f74128a;
                    if (i6 >= 0) {
                        if (i6 == 0) {
                            interfaceC18247i.add("");
                        } else {
                            i4 = m47776I + i6;
                            if (C18172T.m47832n(bArr, m47776I, i4)) {
                                interfaceC18247i.add(new String(bArr, m47776I, i6, C18238v.f74218b));
                                m47776I = i4;
                                while (m47776I < i3) {
                                }
                            } else {
                                throw InvalidProtocolBufferException.m48008d();
                            }
                        }
                    } else {
                        throw InvalidProtocolBufferException.m48005g();
                    }
                }
                return m47776I;
            }
            i4 = m47776I + i5;
            if (C18172T.m47832n(bArr, m47776I, i4)) {
                interfaceC18247i.add(new String(bArr, m47776I, i5, C18238v.f74218b));
                m47776I = i4;
                while (m47776I < i3) {
                }
                return m47776I;
            }
            throw InvalidProtocolBufferException.m48008d();
        }
        throw InvalidProtocolBufferException.m48005g();
    }

    /* renamed from: F */
    public static int m47779F(byte[] bArr, int i, C18194b c18194b) throws InvalidProtocolBufferException {
        int m47776I = m47776I(bArr, i, c18194b);
        int i2 = c18194b.f74128a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c18194b.f74130c = "";
                return m47776I;
            }
            c18194b.f74130c = C18172T.m47841e(bArr, m47776I, i2);
            return m47776I + i2;
        }
        throw InvalidProtocolBufferException.m48005g();
    }

    /* renamed from: G */
    public static int m47778G(int i, byte[] bArr, int i2, int i3, C18170Q c18170q, C18194b c18194b) throws InvalidProtocolBufferException {
        if (C18178U.m47803a(i) != 0) {
            int m47802b = C18178U.m47802b(i);
            if (m47802b != 0) {
                if (m47802b != 1) {
                    if (m47802b != 2) {
                        if (m47802b != 3) {
                            if (m47802b == 5) {
                                c18170q.m47884m(i, Integer.valueOf(m47763h(bArr, i2)));
                                return i2 + 4;
                            }
                            throw InvalidProtocolBufferException.m48009c();
                        }
                        C18170Q m47887j = C18170Q.m47887j();
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m47776I = m47776I(bArr, i2, c18194b);
                            int i6 = c18194b.f74128a;
                            if (i6 == i4) {
                                i5 = i6;
                                i2 = m47776I;
                                break;
                            }
                            i5 = i6;
                            i2 = m47778G(i6, bArr, m47776I, i3, m47887j, c18194b);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            c18170q.m47884m(i, m47887j);
                            return i2;
                        }
                        throw InvalidProtocolBufferException.m48004h();
                    }
                    int m47776I2 = m47776I(bArr, i2, c18194b);
                    int i7 = c18194b.f74128a;
                    if (i7 >= 0) {
                        if (i7 <= bArr.length - m47776I2) {
                            if (i7 == 0) {
                                c18170q.m47884m(i, AbstractC18199g.f74142c);
                            } else {
                                c18170q.m47884m(i, AbstractC18199g.m47698h(bArr, m47776I2, i7));
                            }
                            return m47776I2 + i7;
                        }
                        throw InvalidProtocolBufferException.m48001k();
                    }
                    throw InvalidProtocolBufferException.m48005g();
                }
                c18170q.m47884m(i, Long.valueOf(m47761j(bArr, i2)));
                return i2 + 8;
            }
            int m47773L = m47773L(bArr, i2, c18194b);
            c18170q.m47884m(i, Long.valueOf(c18194b.f74129b));
            return m47773L;
        }
        throw InvalidProtocolBufferException.m48009c();
    }

    /* renamed from: H */
    public static int m47777H(int i, byte[] bArr, int i2, C18194b c18194b) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c18194b.f74128a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c18194b.f74128a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c18194b.f74128a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c18194b.f74128a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c18194b.f74128a = i11;
                return i12;
            }
        }
    }

    /* renamed from: I */
    public static int m47776I(byte[] bArr, int i, C18194b c18194b) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c18194b.f74128a = b;
            return i2;
        }
        return m47777H(b, bArr, i2, c18194b);
    }

    /* renamed from: J */
    public static int m47775J(int i, byte[] bArr, int i2, int i3, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) {
        C18237u c18237u = (C18237u) interfaceC18247i;
        int m47776I = m47776I(bArr, i2, c18194b);
        c18237u.m47434L2(c18194b.f74128a);
        while (m47776I < i3) {
            int m47776I2 = m47776I(bArr, m47776I, c18194b);
            if (i != c18194b.f74128a) {
                break;
            }
            m47776I = m47776I(bArr, m47776I2, c18194b);
            c18237u.m47434L2(c18194b.f74128a);
        }
        return m47776I;
    }

    /* renamed from: K */
    public static int m47774K(long j, byte[] bArr, int i, C18194b c18194b) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= (b2 & ByteCompanionObject.MAX_VALUE) << i3;
            i2 = i4;
            b = b2;
        }
        c18194b.f74129b = j2;
        return i2;
    }

    /* renamed from: L */
    public static int m47773L(byte[] bArr, int i, C18194b c18194b) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c18194b.f74129b = j;
            return i2;
        }
        return m47774K(j, bArr, i2, c18194b);
    }

    /* renamed from: M */
    public static int m47772M(int i, byte[] bArr, int i2, int i3, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) {
        C18141A c18141a = (C18141A) interfaceC18247i;
        int m47773L = m47773L(bArr, i2, c18194b);
        c18141a.m48221f(c18194b.f74129b);
        while (m47773L < i3) {
            int m47776I = m47776I(bArr, m47773L, c18194b);
            if (i != c18194b.f74128a) {
                break;
            }
            m47773L = m47773L(bArr, m47776I, c18194b);
            c18141a.m48221f(c18194b.f74129b);
        }
        return m47773L;
    }

    /* renamed from: N */
    public static int m47771N(int i, byte[] bArr, int i2, int i3, C18194b c18194b) throws InvalidProtocolBufferException {
        if (C18178U.m47803a(i) != 0) {
            int m47802b = C18178U.m47802b(i);
            if (m47802b != 0) {
                if (m47802b != 1) {
                    if (m47802b != 2) {
                        if (m47802b != 3) {
                            if (m47802b == 5) {
                                return i2 + 4;
                            }
                            throw InvalidProtocolBufferException.m48009c();
                        }
                        int i4 = (i & (-8)) | 4;
                        int i5 = 0;
                        while (i2 < i3) {
                            i2 = m47776I(bArr, i2, c18194b);
                            i5 = c18194b.f74128a;
                            if (i5 == i4) {
                                break;
                            }
                            i2 = m47771N(i5, bArr, i2, i3, c18194b);
                        }
                        if (i2 <= i3 && i5 == i4) {
                            return i2;
                        }
                        throw InvalidProtocolBufferException.m48004h();
                    }
                    return m47776I(bArr, i2, c18194b) + c18194b.f74128a;
                }
                return i2 + 8;
            }
            return m47773L(bArr, i2, c18194b);
        }
        throw InvalidProtocolBufferException.m48009c();
    }

    /* renamed from: a */
    public static int m47770a(int i, byte[] bArr, int i2, int i3, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) {
        boolean z;
        boolean z2;
        C18198f c18198f = (C18198f) interfaceC18247i;
        int m47773L = m47773L(bArr, i2, c18194b);
        if (c18194b.f74129b != 0) {
            z = true;
        } else {
            z = false;
        }
        c18198f.m47718f(z);
        while (m47773L < i3) {
            int m47776I = m47776I(bArr, m47773L, c18194b);
            if (i != c18194b.f74128a) {
                break;
            }
            m47773L = m47773L(bArr, m47776I, c18194b);
            if (c18194b.f74129b != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            c18198f.m47718f(z2);
        }
        return m47773L;
    }

    /* renamed from: b */
    public static int m47769b(byte[] bArr, int i, C18194b c18194b) throws InvalidProtocolBufferException {
        int m47776I = m47776I(bArr, i, c18194b);
        int i2 = c18194b.f74128a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m47776I) {
                if (i2 == 0) {
                    c18194b.f74130c = AbstractC18199g.f74142c;
                    return m47776I;
                }
                c18194b.f74130c = AbstractC18199g.m47698h(bArr, m47776I, i2);
                return m47776I + i2;
            }
            throw InvalidProtocolBufferException.m48001k();
        }
        throw InvalidProtocolBufferException.m48005g();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x001b -> B:10:0x001c). Please submit an issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m47768c(int i, byte[] bArr, int i2, int i3, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) throws InvalidProtocolBufferException {
        int m47776I = m47776I(bArr, i2, c18194b);
        int i4 = c18194b.f74128a;
        if (i4 >= 0) {
            if (i4 <= bArr.length - m47776I) {
                if (i4 == 0) {
                    interfaceC18247i.add(AbstractC18199g.f74142c);
                    while (m47776I < i3) {
                        int m47776I2 = m47776I(bArr, m47776I, c18194b);
                        if (i != c18194b.f74128a) {
                            break;
                        }
                        m47776I = m47776I(bArr, m47776I2, c18194b);
                        i4 = c18194b.f74128a;
                        if (i4 >= 0) {
                            if (i4 <= bArr.length - m47776I) {
                                if (i4 == 0) {
                                    interfaceC18247i.add(AbstractC18199g.f74142c);
                                } else {
                                    interfaceC18247i.add(AbstractC18199g.m47698h(bArr, m47776I, i4));
                                    m47776I += i4;
                                    while (m47776I < i3) {
                                    }
                                }
                            } else {
                                throw InvalidProtocolBufferException.m48001k();
                            }
                        } else {
                            throw InvalidProtocolBufferException.m48005g();
                        }
                    }
                    return m47776I;
                }
                interfaceC18247i.add(AbstractC18199g.m47698h(bArr, m47776I, i4));
                m47776I += i4;
                while (m47776I < i3) {
                }
                return m47776I;
            }
            throw InvalidProtocolBufferException.m48001k();
        }
        throw InvalidProtocolBufferException.m48005g();
    }

    /* renamed from: d */
    public static double m47767d(byte[] bArr, int i) {
        return Double.longBitsToDouble(m47761j(bArr, i));
    }

    /* renamed from: e */
    public static int m47766e(int i, byte[] bArr, int i2, int i3, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) {
        C18217k c18217k = (C18217k) interfaceC18247i;
        c18217k.m47539e(m47767d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int m47776I = m47776I(bArr, i4, c18194b);
            if (i != c18194b.f74128a) {
                break;
            }
            c18217k.m47539e(m47767d(bArr, m47776I));
            i4 = m47776I + 8;
        }
        return i4;
    }

    /* renamed from: f */
    public static int m47765f(int i, byte[] bArr, int i2, int i3, AbstractC18230t.AbstractC18233c<?, ?> abstractC18233c, AbstractC18230t.C18235e<?, ?> c18235e, AbstractC18169P<C18170Q, C18170Q> abstractC18169P, C18194b c18194b) throws IOException {
        boolean z;
        Object m47509i;
        C18225q<AbstractC18230t.C18234d> c18225q = abstractC18233c.extensions;
        int i4 = i >>> 3;
        Object obj = null;
        if (c18235e.f74205b.isRepeated() && c18235e.f74205b.isPacked()) {
            switch (C18193a.f74127a[c18235e.m47438a().ordinal()]) {
                case 1:
                    C18217k c18217k = new C18217k();
                    int m47752s = m47752s(bArr, i2, c18217k, c18194b);
                    c18225q.m47495w(c18235e.f74205b, c18217k);
                    return m47752s;
                case 2:
                    C18228r c18228r = new C18228r();
                    int m47749v = m47749v(bArr, i2, c18228r, c18194b);
                    c18225q.m47495w(c18235e.f74205b, c18228r);
                    return m47749v;
                case 3:
                case 4:
                    C18141A c18141a = new C18141A();
                    int m47745z = m47745z(bArr, i2, c18141a, c18194b);
                    c18225q.m47495w(c18235e.f74205b, c18141a);
                    return m47745z;
                case 5:
                case 6:
                    C18237u c18237u = new C18237u();
                    int m47746y = m47746y(bArr, i2, c18237u, c18194b);
                    c18225q.m47495w(c18235e.f74205b, c18237u);
                    return m47746y;
                case 7:
                case 8:
                    C18141A c18141a2 = new C18141A();
                    int m47750u = m47750u(bArr, i2, c18141a2, c18194b);
                    c18225q.m47495w(c18235e.f74205b, c18141a2);
                    return m47750u;
                case 9:
                case 10:
                    C18237u c18237u2 = new C18237u();
                    int m47751t = m47751t(bArr, i2, c18237u2, c18194b);
                    c18225q.m47495w(c18235e.f74205b, c18237u2);
                    return m47751t;
                case 11:
                    C18198f c18198f = new C18198f();
                    int m47753r = m47753r(bArr, i2, c18198f, c18194b);
                    c18225q.m47495w(c18235e.f74205b, c18198f);
                    return m47753r;
                case 12:
                    C18237u c18237u3 = new C18237u();
                    int m47748w = m47748w(bArr, i2, c18237u3, c18194b);
                    c18225q.m47495w(c18235e.f74205b, c18237u3);
                    return m47748w;
                case 13:
                    C18141A c18141a3 = new C18141A();
                    int m47747x = m47747x(bArr, i2, c18141a3, c18194b);
                    c18225q.m47495w(c18235e.f74205b, c18141a3);
                    return m47747x;
                case 14:
                    C18237u c18237u4 = new C18237u();
                    int m47746y2 = m47746y(bArr, i2, c18237u4, c18194b);
                    C18170Q c18170q = abstractC18233c.unknownFields;
                    if (c18170q != C18170Q.m47894c()) {
                        obj = c18170q;
                    }
                    C18170Q c18170q2 = (C18170Q) C18158N.m47928z(i4, c18237u4, c18235e.f74205b.m47439b(), obj, abstractC18169P);
                    if (c18170q2 != null) {
                        abstractC18233c.unknownFields = c18170q2;
                    }
                    c18225q.m47495w(c18235e.f74205b, c18237u4);
                    return m47746y2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + c18235e.f74205b.getLiteType());
            }
        }
        if (c18235e.m47438a() == C18178U.EnumC18180b.f74102q) {
            i2 = m47776I(bArr, i2, c18194b);
            if (c18235e.f74205b.m47439b().findValueByNumber(c18194b.f74128a) == null) {
                C18170Q c18170q3 = abstractC18233c.unknownFields;
                if (c18170q3 == C18170Q.m47894c()) {
                    c18170q3 = C18170Q.m47887j();
                    abstractC18233c.unknownFields = c18170q3;
                }
                C18158N.m47973L(i4, c18194b.f74128a, c18170q3, abstractC18169P);
                return i2;
            }
            obj = Integer.valueOf(c18194b.f74128a);
        } else {
            switch (C18193a.f74127a[c18235e.m47438a().ordinal()]) {
                case 1:
                    obj = Double.valueOf(m47767d(bArr, i2));
                    i2 += 8;
                    break;
                case 2:
                    obj = Float.valueOf(m47759l(bArr, i2));
                    i2 += 4;
                    break;
                case 3:
                case 4:
                    i2 = m47773L(bArr, i2, c18194b);
                    obj = Long.valueOf(c18194b.f74129b);
                    break;
                case 5:
                case 6:
                    i2 = m47776I(bArr, i2, c18194b);
                    obj = Integer.valueOf(c18194b.f74128a);
                    break;
                case 7:
                case 8:
                    obj = Long.valueOf(m47761j(bArr, i2));
                    i2 += 8;
                    break;
                case 9:
                case 10:
                    obj = Integer.valueOf(m47763h(bArr, i2));
                    i2 += 4;
                    break;
                case 11:
                    i2 = m47773L(bArr, i2, c18194b);
                    if (c18194b.f74129b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    obj = Boolean.valueOf(z);
                    break;
                case 12:
                    i2 = m47776I(bArr, i2, c18194b);
                    obj = Integer.valueOf(AbstractC18211h.m47677b(c18194b.f74128a));
                    break;
                case 13:
                    i2 = m47773L(bArr, i2, c18194b);
                    obj = Long.valueOf(AbstractC18211h.m47676c(c18194b.f74129b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i2 = m47769b(bArr, i2, c18194b);
                    obj = c18194b.f74130c;
                    break;
                case 16:
                    i2 = m47782C(bArr, i2, c18194b);
                    obj = c18194b.f74130c;
                    break;
                case 17:
                    i2 = m47757n(M94.m95655a().m95652d(c18235e.m47437b().getClass()), bArr, i2, i3, (i4 << 3) | 4, c18194b);
                    obj = c18194b.f74130c;
                    break;
                case 18:
                    i2 = m47755p(M94.m95655a().m95652d(c18235e.m47437b().getClass()), bArr, i2, i3, c18194b);
                    obj = c18194b.f74130c;
                    break;
            }
        }
        if (c18235e.m47435d()) {
            c18225q.m47517a(c18235e.f74205b, obj);
        } else {
            int i5 = C18193a.f74127a[c18235e.m47438a().ordinal()];
            if ((i5 == 17 || i5 == 18) && (m47509i = c18225q.m47509i(c18235e.f74205b)) != null) {
                obj = C18238v.m47416h(m47509i, obj);
            }
            c18225q.m47495w(c18235e.f74205b, obj);
        }
        return i2;
    }

    /* renamed from: g */
    public static int m47764g(int i, byte[] bArr, int i2, int i3, Object obj, InterfaceC18149F interfaceC18149F, AbstractC18169P<C18170Q, C18170Q> abstractC18169P, C18194b c18194b) throws IOException {
        AbstractC18230t.C18235e m47529a = c18194b.f74131d.m47529a(interfaceC18149F, i >>> 3);
        if (m47529a == null) {
            return m47778G(i, bArr, i2, i3, C18152H.m48024v(obj), c18194b);
        }
        AbstractC18230t.AbstractC18233c abstractC18233c = (AbstractC18230t.AbstractC18233c) obj;
        abstractC18233c.m47442F();
        return m47765f(i, bArr, i2, i3, abstractC18233c, m47529a, abstractC18169P, c18194b);
    }

    /* renamed from: h */
    public static int m47763h(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    /* renamed from: i */
    public static int m47762i(int i, byte[] bArr, int i2, int i3, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) {
        C18237u c18237u = (C18237u) interfaceC18247i;
        c18237u.m47434L2(m47763h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int m47776I = m47776I(bArr, i4, c18194b);
            if (i != c18194b.f74128a) {
                break;
            }
            c18237u.m47434L2(m47763h(bArr, m47776I));
            i4 = m47776I + 4;
        }
        return i4;
    }

    /* renamed from: j */
    public static long m47761j(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: k */
    public static int m47760k(int i, byte[] bArr, int i2, int i3, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) {
        C18141A c18141a = (C18141A) interfaceC18247i;
        c18141a.m48221f(m47761j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int m47776I = m47776I(bArr, i4, c18194b);
            if (i != c18194b.f74128a) {
                break;
            }
            c18141a.m48221f(m47761j(bArr, m47776I));
            i4 = m47776I + 8;
        }
        return i4;
    }

    /* renamed from: l */
    public static float m47759l(byte[] bArr, int i) {
        return Float.intBitsToFloat(m47763h(bArr, i));
    }

    /* renamed from: m */
    public static int m47758m(int i, byte[] bArr, int i2, int i3, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) {
        C18228r c18228r = (C18228r) interfaceC18247i;
        c18228r.m47491e(m47759l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int m47776I = m47776I(bArr, i4, c18194b);
            if (i != c18194b.f74128a) {
                break;
            }
            c18228r.m47491e(m47759l(bArr, m47776I));
            i4 = m47776I + 4;
        }
        return i4;
    }

    /* renamed from: n */
    public static int m47757n(InterfaceC18157M interfaceC18157M, byte[] bArr, int i, int i2, int i3, C18194b c18194b) throws IOException {
        C18152H c18152h = (C18152H) interfaceC18157M;
        Object mo47991d = c18152h.mo47991d();
        int m48054c0 = c18152h.m48054c0(mo47991d, bArr, i, i2, i3, c18194b);
        c18152h.mo47988g(mo47991d);
        c18194b.f74130c = mo47991d;
        return m48054c0;
    }

    /* renamed from: o */
    public static int m47756o(InterfaceC18157M interfaceC18157M, int i, byte[] bArr, int i2, int i3, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) throws IOException {
        int i4 = (i & (-8)) | 4;
        int m47757n = m47757n(interfaceC18157M, bArr, i2, i3, i4, c18194b);
        interfaceC18247i.add(c18194b.f74130c);
        while (m47757n < i3) {
            int m47776I = m47776I(bArr, m47757n, c18194b);
            if (i != c18194b.f74128a) {
                break;
            }
            m47757n = m47757n(interfaceC18157M, bArr, m47776I, i3, i4, c18194b);
            interfaceC18247i.add(c18194b.f74130c);
        }
        return m47757n;
    }

    /* renamed from: p */
    public static int m47755p(InterfaceC18157M interfaceC18157M, byte[] bArr, int i, int i2, C18194b c18194b) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m47777H(i4, bArr, i3, c18194b);
            i4 = c18194b.f74128a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object mo47991d = interfaceC18157M.mo47991d();
            int i6 = i4 + i5;
            interfaceC18157M.mo47994a(mo47991d, bArr, i5, i6, c18194b);
            interfaceC18157M.mo47988g(mo47991d);
            c18194b.f74130c = mo47991d;
            return i6;
        }
        throw InvalidProtocolBufferException.m48001k();
    }

    /* renamed from: q */
    public static int m47754q(InterfaceC18157M<?> interfaceC18157M, int i, byte[] bArr, int i2, int i3, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) throws IOException {
        int m47755p = m47755p(interfaceC18157M, bArr, i2, i3, c18194b);
        interfaceC18247i.add(c18194b.f74130c);
        while (m47755p < i3) {
            int m47776I = m47776I(bArr, m47755p, c18194b);
            if (i != c18194b.f74128a) {
                break;
            }
            m47755p = m47755p(interfaceC18157M, bArr, m47776I, i3, c18194b);
            interfaceC18247i.add(c18194b.f74130c);
        }
        return m47755p;
    }

    /* renamed from: r */
    public static int m47753r(byte[] bArr, int i, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) throws IOException {
        boolean z;
        C18198f c18198f = (C18198f) interfaceC18247i;
        int m47776I = m47776I(bArr, i, c18194b);
        int i2 = c18194b.f74128a + m47776I;
        while (m47776I < i2) {
            m47776I = m47773L(bArr, m47776I, c18194b);
            if (c18194b.f74129b != 0) {
                z = true;
            } else {
                z = false;
            }
            c18198f.m47718f(z);
        }
        if (m47776I == i2) {
            return m47776I;
        }
        throw InvalidProtocolBufferException.m48001k();
    }

    /* renamed from: s */
    public static int m47752s(byte[] bArr, int i, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) throws IOException {
        C18217k c18217k = (C18217k) interfaceC18247i;
        int m47776I = m47776I(bArr, i, c18194b);
        int i2 = c18194b.f74128a + m47776I;
        while (m47776I < i2) {
            c18217k.m47539e(m47767d(bArr, m47776I));
            m47776I += 8;
        }
        if (m47776I == i2) {
            return m47776I;
        }
        throw InvalidProtocolBufferException.m48001k();
    }

    /* renamed from: t */
    public static int m47751t(byte[] bArr, int i, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) throws IOException {
        C18237u c18237u = (C18237u) interfaceC18247i;
        int m47776I = m47776I(bArr, i, c18194b);
        int i2 = c18194b.f74128a + m47776I;
        while (m47776I < i2) {
            c18237u.m47434L2(m47763h(bArr, m47776I));
            m47776I += 4;
        }
        if (m47776I == i2) {
            return m47776I;
        }
        throw InvalidProtocolBufferException.m48001k();
    }

    /* renamed from: u */
    public static int m47750u(byte[] bArr, int i, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) throws IOException {
        C18141A c18141a = (C18141A) interfaceC18247i;
        int m47776I = m47776I(bArr, i, c18194b);
        int i2 = c18194b.f74128a + m47776I;
        while (m47776I < i2) {
            c18141a.m48221f(m47761j(bArr, m47776I));
            m47776I += 8;
        }
        if (m47776I == i2) {
            return m47776I;
        }
        throw InvalidProtocolBufferException.m48001k();
    }

    /* renamed from: v */
    public static int m47749v(byte[] bArr, int i, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) throws IOException {
        C18228r c18228r = (C18228r) interfaceC18247i;
        int m47776I = m47776I(bArr, i, c18194b);
        int i2 = c18194b.f74128a + m47776I;
        while (m47776I < i2) {
            c18228r.m47491e(m47759l(bArr, m47776I));
            m47776I += 4;
        }
        if (m47776I == i2) {
            return m47776I;
        }
        throw InvalidProtocolBufferException.m48001k();
    }

    /* renamed from: w */
    public static int m47748w(byte[] bArr, int i, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) throws IOException {
        C18237u c18237u = (C18237u) interfaceC18247i;
        int m47776I = m47776I(bArr, i, c18194b);
        int i2 = c18194b.f74128a + m47776I;
        while (m47776I < i2) {
            m47776I = m47776I(bArr, m47776I, c18194b);
            c18237u.m47434L2(AbstractC18211h.m47677b(c18194b.f74128a));
        }
        if (m47776I == i2) {
            return m47776I;
        }
        throw InvalidProtocolBufferException.m48001k();
    }

    /* renamed from: x */
    public static int m47747x(byte[] bArr, int i, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) throws IOException {
        C18141A c18141a = (C18141A) interfaceC18247i;
        int m47776I = m47776I(bArr, i, c18194b);
        int i2 = c18194b.f74128a + m47776I;
        while (m47776I < i2) {
            m47776I = m47773L(bArr, m47776I, c18194b);
            c18141a.m48221f(AbstractC18211h.m47676c(c18194b.f74129b));
        }
        if (m47776I == i2) {
            return m47776I;
        }
        throw InvalidProtocolBufferException.m48001k();
    }

    /* renamed from: y */
    public static int m47746y(byte[] bArr, int i, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) throws IOException {
        C18237u c18237u = (C18237u) interfaceC18247i;
        int m47776I = m47776I(bArr, i, c18194b);
        int i2 = c18194b.f74128a + m47776I;
        while (m47776I < i2) {
            m47776I = m47776I(bArr, m47776I, c18194b);
            c18237u.m47434L2(c18194b.f74128a);
        }
        if (m47776I == i2) {
            return m47776I;
        }
        throw InvalidProtocolBufferException.m48001k();
    }

    /* renamed from: z */
    public static int m47745z(byte[] bArr, int i, C18238v.InterfaceC18247i<?> interfaceC18247i, C18194b c18194b) throws IOException {
        C18141A c18141a = (C18141A) interfaceC18247i;
        int m47776I = m47776I(bArr, i, c18194b);
        int i2 = c18194b.f74128a + m47776I;
        while (m47776I < i2) {
            m47776I = m47773L(bArr, m47776I, c18194b);
            c18141a.m48221f(c18194b.f74129b);
        }
        if (m47776I == i2) {
            return m47776I;
        }
        throw InvalidProtocolBufferException.m48001k();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.d$b */
    /* loaded from: classes6.dex */
    public static final class C18194b {

        /* renamed from: a */
        public int f74128a;

        /* renamed from: b */
        public long f74129b;

        /* renamed from: c */
        public Object f74130c;

        /* renamed from: d */
        public final C18219m f74131d;

        public C18194b() {
            this.f74131d = C18219m.m47528b();
        }

        public C18194b(C18219m c18219m) {
            c18219m.getClass();
            this.f74131d = c18219m;
        }
    }
}
