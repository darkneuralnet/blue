package p000;

import com.google.android.gms.internal.vision.C17551E;
import com.google.android.gms.internal.vision.zzjk;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: sx8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48959sx8 extends AbstractC36499Uw8 {

    /* renamed from: a */
    public final boolean f109607a;

    /* renamed from: b */
    public final byte[] f109608b;

    /* renamed from: c */
    public int f109609c;

    /* renamed from: d */
    public final int f109610d;

    /* renamed from: e */
    public int f109611e;

    /* renamed from: f */
    public int f109612f;

    /* renamed from: g */
    public int f109613g;

    public C48959sx8(ByteBuffer byteBuffer, boolean z) {
        super();
        this.f109607a = true;
        this.f109608b = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        this.f109609c = arrayOffset;
        this.f109610d = arrayOffset;
        this.f109611e = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    @Override // p000.IU8
    /* renamed from: A */
    public final void mo13361A(List<Float> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C48558sH8) {
            C48558sH8 c48558sH8 = (C48558sH8) list;
            int i3 = this.f109612f & 7;
            if (i3 != 2) {
                if (i3 == 5) {
                    do {
                        c48558sH8.m14482b(zze());
                        if (m13340V()) {
                            return;
                        }
                        i2 = this.f109609c;
                    } while (m13339W() == this.f109612f);
                    this.f109609c = i2;
                    return;
                }
                throw zzjk.m50759f();
            }
            int m13339W = m13339W();
            m13342T(m13339W);
            int i4 = this.f109609c + m13339W;
            while (this.f109609c < i4) {
                c48558sH8.m14482b(Float.intBitsToFloat(m13349M()));
            }
            return;
        }
        int i5 = this.f109612f & 7;
        if (i5 != 2) {
            if (i5 == 5) {
                do {
                    list.add(Float.valueOf(zze()));
                    if (m13340V()) {
                        return;
                    }
                    i = this.f109609c;
                } while (m13339W() == this.f109612f);
                this.f109609c = i;
                return;
            }
            throw zzjk.m50759f();
        }
        int m13339W2 = m13339W();
        m13342T(m13339W2);
        int i6 = this.f109609c + m13339W2;
        while (this.f109609c < i6) {
            list.add(Float.valueOf(Float.intBitsToFloat(m13349M())));
        }
    }

    @Override // p000.IU8
    /* renamed from: B */
    public final <T> T mo13360B(Class<T> cls, C17551E c17551e) throws IOException {
        m13345Q(3);
        return (T) m13344R(C40365eT8.m42854a().m42853b(cls), c17551e);
    }

    @Override // p000.IU8
    /* renamed from: C */
    public final void mo13359C(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            int i3 = this.f109612f & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int m13339W = this.f109609c + m13339W();
                    while (this.f109609c < m13339W) {
                        c37877aI8.m71672c(m13339W());
                    }
                    m13341U(m13339W);
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                c37877aI8.m71672c(zzh());
                if (m13340V()) {
                    return;
                }
                i2 = this.f109609c;
            } while (m13339W() == this.f109612f);
            this.f109609c = i2;
            return;
        }
        int i4 = this.f109612f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m13339W2 = this.f109609c + m13339W();
                while (this.f109609c < m13339W2) {
                    list.add(Integer.valueOf(m13339W()));
                }
                m13341U(m13339W2);
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Integer.valueOf(zzh()));
            if (m13340V()) {
                return;
            }
            i = this.f109609c;
        } while (m13339W() == this.f109612f);
        this.f109609c = i;
    }

    @Override // p000.IU8
    /* renamed from: D */
    public final <T> T mo13358D(Class<T> cls, C17551E c17551e) throws IOException {
        m13345Q(2);
        return (T) m13346P(C40365eT8.m42854a().m42853b(cls), c17551e);
    }

    @Override // p000.IU8
    /* renamed from: E */
    public final void mo13357E(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof PM8) {
            PM8 pm8 = (PM8) list;
            int i3 = this.f109612f & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int m13339W = this.f109609c + m13339W();
                    while (this.f109609c < m13339W) {
                        pm8.m90369b(m13338X());
                    }
                    m13341U(m13339W);
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                pm8.m90369b(zzg());
                if (m13340V()) {
                    return;
                }
                i2 = this.f109609c;
            } while (m13339W() == this.f109612f);
            this.f109609c = i2;
            return;
        }
        int i4 = this.f109612f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m13339W2 = this.f109609c + m13339W();
                while (this.f109609c < m13339W2) {
                    list.add(Long.valueOf(m13338X()));
                }
                m13341U(m13339W2);
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Long.valueOf(zzg()));
            if (m13340V()) {
                return;
            }
            i = this.f109609c;
        } while (m13339W() == this.f109612f);
        this.f109609c = i;
    }

    @Override // p000.IU8
    /* renamed from: F */
    public final <K, V> void mo13356F(Map<K, V> map, C43294jP8<K, V> c43294jP8, C17551E c17551e) throws IOException {
        m13345Q(2);
        int m13339W = m13339W();
        m13347O(m13339W);
        int i = this.f109611e;
        this.f109611e = this.f109609c + m13339W;
        try {
            throw null;
        } catch (Throwable th) {
            this.f109611e = i;
            throw th;
        }
    }

    @Override // p000.IU8
    /* renamed from: G */
    public final <T> T mo13355G(InterfaceC52825zU8<T> interfaceC52825zU8, C17551E c17551e) throws IOException {
        m13345Q(3);
        return (T) m13344R(interfaceC52825zU8, c17551e);
    }

    @Override // p000.IU8
    /* renamed from: H */
    public final <T> T mo13354H(InterfaceC52825zU8<T> interfaceC52825zU8, C17551E c17551e) throws IOException {
        m13345Q(2);
        return (T) m13346P(interfaceC52825zU8, c17551e);
    }

    /* renamed from: I */
    public final String m13353I(boolean z) throws IOException {
        m13345Q(2);
        int m13339W = m13339W();
        if (m13339W == 0) {
            return "";
        }
        m13347O(m13339W);
        if (z) {
            byte[] bArr = this.f109608b;
            int i = this.f109609c;
            if (!C49582u09.m11097g(bArr, i, i + m13339W)) {
                throw zzjk.m50757h();
            }
        }
        String str = new String(this.f109608b, this.f109609c, m13339W, C52124yI8.f119325a);
        this.f109609c += m13339W;
        return str;
    }

    /* renamed from: J */
    public final void m13352J(int i) throws IOException {
        m13347O(i);
        this.f109609c += i;
    }

    /* renamed from: K */
    public final void m13351K(List<String> list, boolean z) throws IOException {
        int i;
        int i2;
        if ((this.f109612f & 7) == 2) {
            if ((list instanceof InterfaceC41488gM8) && !z) {
                InterfaceC41488gM8 interfaceC41488gM8 = (InterfaceC41488gM8) list;
                do {
                    interfaceC41488gM8.mo6977X2(mo13330e());
                    if (m13340V()) {
                        return;
                    }
                    i2 = this.f109609c;
                } while (m13339W() == this.f109612f);
                this.f109609c = i2;
                return;
            }
            do {
                list.add(m13353I(z));
                if (m13340V()) {
                    return;
                }
                i = this.f109609c;
            } while (m13339W() == this.f109612f);
            this.f109609c = i;
            return;
        }
        throw zzjk.m50759f();
    }

    /* renamed from: L */
    public final long m13350L() throws IOException {
        m13347O(8);
        return m13348N();
    }

    /* renamed from: M */
    public final int m13349M() {
        int i = this.f109609c;
        byte[] bArr = this.f109608b;
        this.f109609c = i + 4;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    /* renamed from: N */
    public final long m13348N() {
        int i = this.f109609c;
        byte[] bArr = this.f109608b;
        this.f109609c = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: O */
    public final void m13347O(int i) throws IOException {
        if (i >= 0 && i <= this.f109611e - this.f109609c) {
            return;
        }
        throw zzjk.m50764a();
    }

    /* renamed from: P */
    public final <T> T m13346P(InterfaceC52825zU8<T> interfaceC52825zU8, C17551E c17551e) throws IOException {
        int m13339W = m13339W();
        m13347O(m13339W);
        int i = this.f109611e;
        int i2 = this.f109609c + m13339W;
        this.f109611e = i2;
        try {
            T zza = interfaceC52825zU8.zza();
            interfaceC52825zU8.mo1311d(zza, this, c17551e);
            interfaceC52825zU8.zzc(zza);
            if (this.f109609c == i2) {
                return zza;
            }
            throw zzjk.m50758g();
        } finally {
            this.f109611e = i;
        }
    }

    /* renamed from: Q */
    public final void m13345Q(int i) throws IOException {
        if ((this.f109612f & 7) == i) {
            return;
        }
        throw zzjk.m50759f();
    }

    /* renamed from: R */
    public final <T> T m13344R(InterfaceC52825zU8<T> interfaceC52825zU8, C17551E c17551e) throws IOException {
        int i = this.f109613g;
        this.f109613g = ((this.f109612f >>> 3) << 3) | 4;
        try {
            T zza = interfaceC52825zU8.zza();
            interfaceC52825zU8.mo1311d(zza, this, c17551e);
            interfaceC52825zU8.zzc(zza);
            if (this.f109612f == this.f109613g) {
                return zza;
            }
            throw zzjk.m50758g();
        } finally {
            this.f109613g = i;
        }
    }

    /* renamed from: S */
    public final void m13343S(int i) throws IOException {
        m13347O(i);
        if ((i & 7) == 0) {
            return;
        }
        throw zzjk.m50758g();
    }

    /* renamed from: T */
    public final void m13342T(int i) throws IOException {
        m13347O(i);
        if ((i & 3) == 0) {
            return;
        }
        throw zzjk.m50758g();
    }

    /* renamed from: U */
    public final void m13341U(int i) throws IOException {
        if (this.f109609c == i) {
            return;
        }
        throw zzjk.m50764a();
    }

    /* renamed from: V */
    public final boolean m13340V() {
        return this.f109609c == this.f109611e;
    }

    /* renamed from: W */
    public final int m13339W() throws IOException {
        int i;
        int i2 = this.f109609c;
        int i3 = this.f109611e;
        if (i3 != i2) {
            byte[] bArr = this.f109608b;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f109609c = i4;
                return b;
            } else if (i3 - i4 < 9) {
                return (int) m13337Y();
            } else {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            i7 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i7 + 1;
                                                if (bArr[i7] < 0) {
                                                    throw zzjk.m50762c();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.f109609c = i5;
                return i;
            }
        }
        throw zzjk.m50764a();
    }

    /* renamed from: X */
    public final long m13338X() throws IOException {
        long j;
        long j2;
        long j3;
        int i;
        int i2 = this.f109609c;
        int i3 = this.f109611e;
        if (i3 != i2) {
            byte[] bArr = this.f109608b;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f109609c = i4;
                return b;
            } else if (i3 - i4 < 9) {
                return m13337Y();
            } else {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i5 = i7;
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            long j4 = i9;
                            int i10 = i5 + 1;
                            long j5 = j4 ^ (bArr[i5] << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i5 = i10 + 1;
                                long j6 = j5 ^ (bArr[i10] << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i10 = i5 + 1;
                                    j5 = j6 ^ (bArr[i5] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i5 = i10 + 1;
                                        j6 = j5 ^ (bArr[i10] << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            int i11 = i5 + 1;
                                            long j7 = (j6 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i5 = i11 + 1;
                                                if (bArr[i11] < 0) {
                                                    throw zzjk.m50762c();
                                                }
                                            } else {
                                                i5 = i11;
                                            }
                                            j = j7;
                                        }
                                    }
                                }
                                j = j6 ^ j2;
                            }
                            j = j5 ^ j3;
                            i5 = i10;
                        }
                    }
                    this.f109609c = i5;
                    return j;
                }
                j = i;
                this.f109609c = i5;
                return j;
            }
        }
        throw zzjk.m50764a();
    }

    /* renamed from: Y */
    public final long m13337Y() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m13336Z = m13336Z();
            j |= (m13336Z & ByteCompanionObject.MAX_VALUE) << i;
            if ((m13336Z & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw zzjk.m50762c();
    }

    /* renamed from: Z */
    public final byte m13336Z() throws IOException {
        int i = this.f109609c;
        if (i != this.f109611e) {
            byte[] bArr = this.f109608b;
            this.f109609c = i + 1;
            return bArr[i];
        }
        throw zzjk.m50764a();
    }

    @Override // p000.IU8
    /* renamed from: a */
    public final boolean mo13335a() throws IOException {
        m13345Q(0);
        if (m13339W() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public final int m13334a0() throws IOException {
        m13347O(4);
        return m13349M();
    }

    @Override // p000.IU8
    /* renamed from: b */
    public final String mo13333b() throws IOException {
        return m13353I(true);
    }

    @Override // p000.IU8
    /* renamed from: c */
    public final int mo13332c() throws IOException {
        m13345Q(5);
        return m13334a0();
    }

    @Override // p000.IU8
    /* renamed from: d */
    public final int mo13331d() throws IOException {
        m13345Q(0);
        return m13339W();
    }

    @Override // p000.IU8
    /* renamed from: e */
    public final AbstractC53119zy8 mo13330e() throws IOException {
        AbstractC53119zy8 m37s;
        m13345Q(2);
        int m13339W = m13339W();
        if (m13339W == 0) {
            return AbstractC53119zy8.f122544c;
        }
        m13347O(m13339W);
        if (this.f109607a) {
            m37s = AbstractC53119zy8.m48A(this.f109608b, this.f109609c, m13339W);
        } else {
            m37s = AbstractC53119zy8.m37s(this.f109608b, this.f109609c, m13339W);
        }
        this.f109609c += m13339W;
        return m37s;
    }

    @Override // p000.IU8
    /* renamed from: f */
    public final int mo13329f() throws IOException {
        m13345Q(0);
        return m13339W();
    }

    @Override // p000.IU8
    /* renamed from: g */
    public final long mo13328g() throws IOException {
        m13345Q(0);
        return WB8.m78740b(m13338X());
    }

    @Override // p000.IU8
    /* renamed from: h */
    public final int mo13327h() throws IOException {
        m13345Q(5);
        return m13334a0();
    }

    @Override // p000.IU8
    /* renamed from: i */
    public final void mo13326i(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            int i3 = this.f109612f & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int m13339W = this.f109609c + m13339W();
                    while (this.f109609c < m13339W) {
                        c37877aI8.m71672c(WB8.m78738k(m13339W()));
                    }
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                c37877aI8.m71672c(zzs());
                if (m13340V()) {
                    return;
                }
                i2 = this.f109609c;
            } while (m13339W() == this.f109612f);
            this.f109609c = i2;
            return;
        }
        int i4 = this.f109612f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m13339W2 = this.f109609c + m13339W();
                while (this.f109609c < m13339W2) {
                    list.add(Integer.valueOf(WB8.m78738k(m13339W())));
                }
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Integer.valueOf(zzs()));
            if (m13340V()) {
                return;
            }
            i = this.f109609c;
        } while (m13339W() == this.f109612f);
        this.f109609c = i;
    }

    @Override // p000.IU8
    /* renamed from: j */
    public final String mo13325j() throws IOException {
        return m13353I(false);
    }

    @Override // p000.IU8
    /* renamed from: k */
    public final long mo13324k() throws IOException {
        m13345Q(1);
        return m13350L();
    }

    @Override // p000.IU8
    /* renamed from: l */
    public final void mo13323l(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof PM8) {
            PM8 pm8 = (PM8) list;
            int i3 = this.f109612f & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int m13339W = m13339W();
                    m13343S(m13339W);
                    int i4 = this.f109609c + m13339W;
                    while (this.f109609c < i4) {
                        pm8.m90369b(m13348N());
                    }
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                pm8.m90369b(mo13324k());
                if (m13340V()) {
                    return;
                }
                i2 = this.f109609c;
            } while (m13339W() == this.f109612f);
            this.f109609c = i2;
            return;
        }
        int i5 = this.f109612f & 7;
        if (i5 != 1) {
            if (i5 == 2) {
                int m13339W2 = m13339W();
                m13343S(m13339W2);
                int i6 = this.f109609c + m13339W2;
                while (this.f109609c < i6) {
                    list.add(Long.valueOf(m13348N()));
                }
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Long.valueOf(mo13324k()));
            if (m13340V()) {
                return;
            }
            i = this.f109609c;
        } while (m13339W() == this.f109612f);
        this.f109609c = i;
    }

    @Override // p000.IU8
    /* renamed from: m */
    public final void mo13322m(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof PM8) {
            PM8 pm8 = (PM8) list;
            int i3 = this.f109612f & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int m13339W = this.f109609c + m13339W();
                    while (this.f109609c < m13339W) {
                        pm8.m90369b(WB8.m78740b(m13338X()));
                    }
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                pm8.m90369b(mo13328g());
                if (m13340V()) {
                    return;
                }
                i2 = this.f109609c;
            } while (m13339W() == this.f109612f);
            this.f109609c = i2;
            return;
        }
        int i4 = this.f109612f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m13339W2 = this.f109609c + m13339W();
                while (this.f109609c < m13339W2) {
                    list.add(Long.valueOf(WB8.m78740b(m13338X())));
                }
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Long.valueOf(mo13328g()));
            if (m13340V()) {
                return;
            }
            i = this.f109609c;
        } while (m13339W() == this.f109612f);
        this.f109609c = i;
    }

    @Override // p000.IU8
    /* renamed from: n */
    public final void mo13321n(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            int i3 = this.f109612f & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int m13339W = this.f109609c + m13339W();
                    while (this.f109609c < m13339W) {
                        c37877aI8.m71672c(m13339W());
                    }
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                c37877aI8.m71672c(mo13329f());
                if (m13340V()) {
                    return;
                }
                i2 = this.f109609c;
            } while (m13339W() == this.f109612f);
            this.f109609c = i2;
            return;
        }
        int i4 = this.f109612f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m13339W2 = this.f109609c + m13339W();
                while (this.f109609c < m13339W2) {
                    list.add(Integer.valueOf(m13339W()));
                }
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Integer.valueOf(mo13329f()));
            if (m13340V()) {
                return;
            }
            i = this.f109609c;
        } while (m13339W() == this.f109612f);
        this.f109609c = i;
    }

    @Override // p000.IU8
    /* renamed from: o */
    public final void mo13320o(List<AbstractC53119zy8> list) throws IOException {
        int i;
        if ((this.f109612f & 7) == 2) {
            do {
                list.add(mo13330e());
                if (m13340V()) {
                    return;
                }
                i = this.f109609c;
            } while (m13339W() == this.f109612f);
            this.f109609c = i;
            return;
        }
        throw zzjk.m50759f();
    }

    @Override // p000.IU8
    /* renamed from: p */
    public final void mo13319p(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            int i3 = this.f109612f & 7;
            if (i3 != 2) {
                if (i3 == 5) {
                    do {
                        c37877aI8.m71672c(mo13327h());
                        if (m13340V()) {
                            return;
                        }
                        i2 = this.f109609c;
                    } while (m13339W() == this.f109612f);
                    this.f109609c = i2;
                    return;
                }
                throw zzjk.m50759f();
            }
            int m13339W = m13339W();
            m13342T(m13339W);
            int i4 = this.f109609c + m13339W;
            while (this.f109609c < i4) {
                c37877aI8.m71672c(m13349M());
            }
            return;
        }
        int i5 = this.f109612f & 7;
        if (i5 != 2) {
            if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(mo13327h()));
                    if (m13340V()) {
                        return;
                    }
                    i = this.f109609c;
                } while (m13339W() == this.f109612f);
                this.f109609c = i;
                return;
            }
            throw zzjk.m50759f();
        }
        int m13339W2 = m13339W();
        m13342T(m13339W2);
        int i6 = this.f109609c + m13339W2;
        while (this.f109609c < i6) {
            list.add(Integer.valueOf(m13349M()));
        }
    }

    @Override // p000.IU8
    /* renamed from: q */
    public final void mo13318q(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            int i3 = this.f109612f & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int m13339W = this.f109609c + m13339W();
                    while (this.f109609c < m13339W) {
                        c37877aI8.m71672c(m13339W());
                    }
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                c37877aI8.m71672c(mo13331d());
                if (m13340V()) {
                    return;
                }
                i2 = this.f109609c;
            } while (m13339W() == this.f109612f);
            this.f109609c = i2;
            return;
        }
        int i4 = this.f109612f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m13339W2 = this.f109609c + m13339W();
                while (this.f109609c < m13339W2) {
                    list.add(Integer.valueOf(m13339W()));
                }
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Integer.valueOf(mo13331d()));
            if (m13340V()) {
                return;
            }
            i = this.f109609c;
        } while (m13339W() == this.f109612f);
        this.f109609c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.IU8
    /* renamed from: r */
    public final <T> void mo13317r(List<T> list, InterfaceC52825zU8<T> interfaceC52825zU8, C17551E c17551e) throws IOException {
        int i;
        int i2 = this.f109612f;
        if ((i2 & 7) == 3) {
            do {
                list.add(m13344R(interfaceC52825zU8, c17551e));
                if (m13340V()) {
                    return;
                }
                i = this.f109609c;
            } while (m13339W() == i2);
            this.f109609c = i;
            return;
        }
        throw zzjk.m50759f();
    }

    @Override // p000.IU8
    /* renamed from: s */
    public final void mo13316s(List<Boolean> list) throws IOException {
        int i;
        boolean z;
        int i2;
        boolean z2;
        if (list instanceof C38872by8) {
            C38872by8 c38872by8 = (C38872by8) list;
            int i3 = this.f109612f & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int m13339W = this.f109609c + m13339W();
                    while (this.f109609c < m13339W) {
                        if (m13339W() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c38872by8.m62062b(z2);
                    }
                    m13341U(m13339W);
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                c38872by8.m62062b(mo13335a());
                if (m13340V()) {
                    return;
                }
                i2 = this.f109609c;
            } while (m13339W() == this.f109612f);
            this.f109609c = i2;
            return;
        }
        int i4 = this.f109612f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m13339W2 = this.f109609c + m13339W();
                while (this.f109609c < m13339W2) {
                    if (m13339W() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    list.add(Boolean.valueOf(z));
                }
                m13341U(m13339W2);
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Boolean.valueOf(mo13335a()));
            if (m13340V()) {
                return;
            }
            i = this.f109609c;
        } while (m13339W() == this.f109612f);
        this.f109609c = i;
    }

    @Override // p000.IU8
    /* renamed from: t */
    public final void mo13315t(List<Integer> list) throws IOException {
        int i;
        int i2;
        if (list instanceof C37877aI8) {
            C37877aI8 c37877aI8 = (C37877aI8) list;
            int i3 = this.f109612f & 7;
            if (i3 != 2) {
                if (i3 == 5) {
                    do {
                        c37877aI8.m71672c(mo13332c());
                        if (m13340V()) {
                            return;
                        }
                        i2 = this.f109609c;
                    } while (m13339W() == this.f109612f);
                    this.f109609c = i2;
                    return;
                }
                throw zzjk.m50759f();
            }
            int m13339W = m13339W();
            m13342T(m13339W);
            int i4 = this.f109609c + m13339W;
            while (this.f109609c < i4) {
                c37877aI8.m71672c(m13349M());
            }
            return;
        }
        int i5 = this.f109612f & 7;
        if (i5 != 2) {
            if (i5 == 5) {
                do {
                    list.add(Integer.valueOf(mo13332c()));
                    if (m13340V()) {
                        return;
                    }
                    i = this.f109609c;
                } while (m13339W() == this.f109612f);
                this.f109609c = i;
                return;
            }
            throw zzjk.m50759f();
        }
        int m13339W2 = m13339W();
        m13342T(m13339W2);
        int i6 = this.f109609c + m13339W2;
        while (this.f109609c < i6) {
            list.add(Integer.valueOf(m13349M()));
        }
    }

    @Override // p000.IU8
    /* renamed from: u */
    public final void mo13314u(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof PM8) {
            PM8 pm8 = (PM8) list;
            int i3 = this.f109612f & 7;
            if (i3 != 1) {
                if (i3 == 2) {
                    int m13339W = m13339W();
                    m13343S(m13339W);
                    int i4 = this.f109609c + m13339W;
                    while (this.f109609c < i4) {
                        pm8.m90369b(m13348N());
                    }
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                pm8.m90369b(zzi());
                if (m13340V()) {
                    return;
                }
                i2 = this.f109609c;
            } while (m13339W() == this.f109612f);
            this.f109609c = i2;
            return;
        }
        int i5 = this.f109612f & 7;
        if (i5 != 1) {
            if (i5 == 2) {
                int m13339W2 = m13339W();
                m13343S(m13339W2);
                int i6 = this.f109609c + m13339W2;
                while (this.f109609c < i6) {
                    list.add(Long.valueOf(m13348N()));
                }
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Long.valueOf(zzi()));
            if (m13340V()) {
                return;
            }
            i = this.f109609c;
        } while (m13339W() == this.f109612f);
        this.f109609c = i;
    }

    @Override // p000.IU8
    /* renamed from: v */
    public final void mo13313v(List<String> list) throws IOException {
        m13351K(list, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.IU8
    /* renamed from: w */
    public final <T> void mo13312w(List<T> list, InterfaceC52825zU8<T> interfaceC52825zU8, C17551E c17551e) throws IOException {
        int i;
        int i2 = this.f109612f;
        if ((i2 & 7) == 2) {
            do {
                list.add(m13346P(interfaceC52825zU8, c17551e));
                if (m13340V()) {
                    return;
                }
                i = this.f109609c;
            } while (m13339W() == i2);
            this.f109609c = i;
            return;
        }
        throw zzjk.m50759f();
    }

    @Override // p000.IU8
    /* renamed from: x */
    public final long mo13311x() throws IOException {
        m13345Q(0);
        return m13338X();
    }

    @Override // p000.IU8
    /* renamed from: y */
    public final void mo13310y(List<String> list) throws IOException {
        m13351K(list, false);
    }

    @Override // p000.IU8
    /* renamed from: z */
    public final void mo13309z(List<Long> list) throws IOException {
        int i;
        int i2;
        if (list instanceof PM8) {
            PM8 pm8 = (PM8) list;
            int i3 = this.f109612f & 7;
            if (i3 != 0) {
                if (i3 == 2) {
                    int m13339W = this.f109609c + m13339W();
                    while (this.f109609c < m13339W) {
                        pm8.m90369b(m13338X());
                    }
                    m13341U(m13339W);
                    return;
                }
                throw zzjk.m50759f();
            }
            do {
                pm8.m90369b(mo13311x());
                if (m13340V()) {
                    return;
                }
                i2 = this.f109609c;
            } while (m13339W() == this.f109612f);
            this.f109609c = i2;
            return;
        }
        int i4 = this.f109612f & 7;
        if (i4 != 0) {
            if (i4 == 2) {
                int m13339W2 = this.f109609c + m13339W();
                while (this.f109609c < m13339W2) {
                    list.add(Long.valueOf(m13338X()));
                }
                m13341U(m13339W2);
                return;
            }
            throw zzjk.m50759f();
        }
        do {
            list.add(Long.valueOf(mo13311x()));
            if (m13340V()) {
                return;
            }
            i = this.f109609c;
        } while (m13339W() == this.f109612f);
        this.f109609c = i;
    }

    @Override // p000.IU8
    public final int zza() throws IOException {
        if (m13340V()) {
            return Integer.MAX_VALUE;
        }
        int m13339W = m13339W();
        this.f109612f = m13339W;
        if (m13339W == this.f109613g) {
            return Integer.MAX_VALUE;
        }
        return m13339W >>> 3;
    }

    @Override // p000.IU8
    public final int zzb() {
        return this.f109612f;
    }

    @Override // p000.IU8
    public final boolean zzc() throws IOException {
        int i;
        int i2;
        if (m13340V() || (i = this.f109612f) == (i2 = this.f109613g)) {
            return false;
        }
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 5) {
                            m13352J(4);
                            return true;
                        }
                        throw zzjk.m50759f();
                    }
                    this.f109613g = ((i >>> 3) << 3) | 4;
                    while (zza() != Integer.MAX_VALUE && zzc()) {
                    }
                    if (this.f109612f == this.f109613g) {
                        this.f109613g = i2;
                        return true;
                    }
                    throw zzjk.m50758g();
                }
                m13352J(m13339W());
                return true;
            }
            m13352J(8);
            return true;
        }
        int i4 = this.f109611e;
        int i5 = this.f109609c;
        if (i4 - i5 >= 10) {
            byte[] bArr = this.f109608b;
            int i6 = 0;
            while (i6 < 10) {
                int i7 = i5 + 1;
                if (bArr[i5] >= 0) {
                    this.f109609c = i7;
                    break;
                }
                i6++;
                i5 = i7;
            }
        }
        for (int i8 = 0; i8 < 10; i8++) {
            if (m13336Z() >= 0) {
                return true;
            }
        }
        throw zzjk.m50762c();
    }

    @Override // p000.IU8
    public final double zzd() throws IOException {
        m13345Q(1);
        return Double.longBitsToDouble(m13350L());
    }

    @Override // p000.IU8
    public final float zze() throws IOException {
        m13345Q(5);
        return Float.intBitsToFloat(m13334a0());
    }

    @Override // p000.IU8
    public final long zzg() throws IOException {
        m13345Q(0);
        return m13338X();
    }

    @Override // p000.IU8
    public final int zzh() throws IOException {
        m13345Q(0);
        return m13339W();
    }

    @Override // p000.IU8
    public final long zzi() throws IOException {
        m13345Q(1);
        return m13350L();
    }

    @Override // p000.IU8
    public final int zzs() throws IOException {
        m13345Q(0);
        return WB8.m78738k(m13339W());
    }

    @Override // p000.IU8
    public final void zza(List<Double> list) throws IOException {
        int i;
        int i2;
        if (list instanceof MD8) {
            MD8 md8 = (MD8) list;
            int i3 = this.f109612f & 7;
            if (i3 == 1) {
                do {
                    md8.m95488b(zzd());
                    if (m13340V()) {
                        return;
                    }
                    i2 = this.f109609c;
                } while (m13339W() == this.f109612f);
                this.f109609c = i2;
                return;
            } else if (i3 == 2) {
                int m13339W = m13339W();
                m13343S(m13339W);
                int i4 = this.f109609c + m13339W;
                while (this.f109609c < i4) {
                    md8.m95488b(Double.longBitsToDouble(m13348N()));
                }
                return;
            } else {
                throw zzjk.m50759f();
            }
        }
        int i5 = this.f109612f & 7;
        if (i5 == 1) {
            do {
                list.add(Double.valueOf(zzd()));
                if (m13340V()) {
                    return;
                }
                i = this.f109609c;
            } while (m13339W() == this.f109612f);
            this.f109609c = i;
        } else if (i5 == 2) {
            int m13339W2 = m13339W();
            m13343S(m13339W2);
            int i6 = this.f109609c + m13339W2;
            while (this.f109609c < i6) {
                list.add(Double.valueOf(Double.longBitsToDouble(m13348N())));
            }
        } else {
            throw zzjk.m50759f();
        }
    }
}
