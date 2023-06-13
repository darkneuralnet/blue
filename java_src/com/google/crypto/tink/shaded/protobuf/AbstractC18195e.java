package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C18142B;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* renamed from: com.google.crypto.tink.shaded.protobuf.e */
/* loaded from: classes6.dex */
public abstract class AbstractC18195e implements InterfaceC18156L {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$b */
    /* loaded from: classes6.dex */
    public static final class C18197b extends AbstractC18195e {

        /* renamed from: a */
        public final boolean f74132a;

        /* renamed from: b */
        public final byte[] f74133b;

        /* renamed from: c */
        public int f74134c;

        /* renamed from: d */
        public final int f74135d;

        /* renamed from: e */
        public int f74136e;

        /* renamed from: f */
        public int f74137f;

        /* renamed from: g */
        public int f74138g;

        public C18197b(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f74132a = z;
            this.f74133b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f74134c = arrayOffset;
            this.f74135d = arrayOffset;
            this.f74136e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: A */
        public void mo47635A(List<String> list) throws IOException {
            m47734a0(list, true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: B */
        public int mo47634B() throws IOException {
            m47728g0(0);
            return m47733b0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: C */
        public void mo47633C(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18141A) {
                C18141A c18141a = (C18141A) list;
                int m47802b = C18178U.m47802b(this.f74137f);
                if (m47802b != 1) {
                    if (m47802b == 2) {
                        int m47733b0 = m47733b0();
                        m47722m0(m47733b0);
                        int i3 = this.f74134c + m47733b0;
                        while (this.f74134c < i3) {
                            c18141a.m48221f(m47737X());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.m48007e();
                }
                do {
                    c18141a.m48221f(mo47591u());
                    if (m47743R()) {
                        return;
                    }
                    i2 = this.f74134c;
                } while (m47733b0() == this.f74137f);
                this.f74134c = i2;
                return;
            }
            int m47802b2 = C18178U.m47802b(this.f74137f);
            if (m47802b2 != 1) {
                if (m47802b2 == 2) {
                    int m47733b02 = m47733b0();
                    m47722m0(m47733b02);
                    int i4 = this.f74134c + m47733b02;
                    while (this.f74134c < i4) {
                        list.add(Long.valueOf(m47737X()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                list.add(Long.valueOf(mo47591u()));
                if (m47743R()) {
                    return;
                }
                i = this.f74134c;
            } while (m47733b0() == this.f74137f);
            this.f74134c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: D */
        public void mo47632D(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18237u) {
                C18237u c18237u = (C18237u) list;
                int m47802b = C18178U.m47802b(this.f74137f);
                if (m47802b != 0) {
                    if (m47802b == 2) {
                        int m47733b0 = this.f74134c + m47733b0();
                        while (this.f74134c < m47733b0) {
                            c18237u.m47434L2(m47733b0());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.m48007e();
                }
                do {
                    c18237u.m47434L2(mo47609c());
                    if (m47743R()) {
                        return;
                    }
                    i2 = this.f74134c;
                } while (m47733b0() == this.f74137f);
                this.f74134c = i2;
                return;
            }
            int m47802b2 = C18178U.m47802b(this.f74137f);
            if (m47802b2 != 0) {
                if (m47802b2 == 2) {
                    int m47733b02 = this.f74134c + m47733b0();
                    while (this.f74134c < m47733b02) {
                        list.add(Integer.valueOf(m47733b0()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                list.add(Integer.valueOf(mo47609c()));
                if (m47743R()) {
                    return;
                }
                i = this.f74134c;
            } while (m47733b0() == this.f74137f);
            this.f74134c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: E */
        public int mo47631E() throws IOException {
            m47728g0(5);
            return m47740U();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: F */
        public long mo47630F() throws IOException {
            m47728g0(0);
            return AbstractC18211h.m47676c(m47732c0());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: G */
        public String mo47629G() throws IOException {
            return m47735Z(false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: H */
        public int mo47628H() throws IOException {
            m47728g0(5);
            return m47740U();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: I */
        public String mo47627I() throws IOException {
            return m47735Z(true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: J */
        public <T> T mo47626J(InterfaceC18157M<T> interfaceC18157M, C18219m c18219m) throws IOException {
            m47728g0(3);
            return (T) m47741T(interfaceC18157M, c18219m);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: K */
        public <T> T mo47625K(Class<T> cls, C18219m c18219m) throws IOException {
            m47728g0(3);
            return (T) m47741T(M94.m95655a().m95652d(cls), c18219m);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: L */
        public <K, V> void mo47624L(Map<K, V> map, C18142B.C18143a<K, V> c18143a, C18219m c18219m) throws IOException {
            m47728g0(2);
            int m47733b0 = m47733b0();
            m47730e0(m47733b0);
            int i = this.f74136e;
            this.f74136e = this.f74134c + m47733b0;
            try {
                throw null;
            } catch (Throwable th) {
                this.f74136e = i;
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: M */
        public <T> void mo47623M(List<T> list, InterfaceC18157M<T> interfaceC18157M, C18219m c18219m) throws IOException {
            int i;
            if (C18178U.m47802b(this.f74137f) == 2) {
                int i2 = this.f74137f;
                do {
                    list.add(m47736Y(interfaceC18157M, c18219m));
                    if (m47743R()) {
                        return;
                    }
                    i = this.f74134c;
                } while (m47733b0() == i2);
                this.f74134c = i;
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: N */
        public <T> T mo47622N(InterfaceC18157M<T> interfaceC18157M, C18219m c18219m) throws IOException {
            m47728g0(2);
            return (T) m47736Y(interfaceC18157M, c18219m);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: O */
        public <T> T mo47621O(Class<T> cls, C18219m c18219m) throws IOException {
            m47728g0(2);
            return (T) m47736Y(M94.m95655a().m95652d(cls), c18219m);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: P */
        public <T> void mo47620P(List<T> list, InterfaceC18157M<T> interfaceC18157M, C18219m c18219m) throws IOException {
            int i;
            if (C18178U.m47802b(this.f74137f) == 3) {
                int i2 = this.f74137f;
                do {
                    list.add(m47741T(interfaceC18157M, c18219m));
                    if (m47743R()) {
                        return;
                    }
                    i = this.f74134c;
                } while (m47733b0() == i2);
                this.f74134c = i;
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }

        /* renamed from: R */
        public final boolean m47743R() {
            return this.f74134c == this.f74136e;
        }

        /* renamed from: S */
        public final byte m47742S() throws IOException {
            int i = this.f74134c;
            if (i != this.f74136e) {
                byte[] bArr = this.f74133b;
                this.f74134c = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.m48001k();
        }

        /* renamed from: T */
        public final <T> T m47741T(InterfaceC18157M<T> interfaceC18157M, C18219m c18219m) throws IOException {
            int i = this.f74138g;
            this.f74138g = C18178U.m47801c(C18178U.m47803a(this.f74137f), 4);
            try {
                T mo47991d = interfaceC18157M.mo47991d();
                interfaceC18157M.mo47986i(mo47991d, this, c18219m);
                interfaceC18157M.mo47988g(mo47991d);
                if (this.f74137f == this.f74138g) {
                    return mo47991d;
                }
                throw InvalidProtocolBufferException.m48004h();
            } finally {
                this.f74138g = i;
            }
        }

        /* renamed from: U */
        public final int m47740U() throws IOException {
            m47730e0(4);
            return m47739V();
        }

        /* renamed from: V */
        public final int m47739V() {
            int i = this.f74134c;
            byte[] bArr = this.f74133b;
            this.f74134c = i + 4;
            return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
        }

        /* renamed from: W */
        public final long m47738W() throws IOException {
            m47730e0(8);
            return m47737X();
        }

        /* renamed from: X */
        public final long m47737X() {
            int i = this.f74134c;
            byte[] bArr = this.f74133b;
            this.f74134c = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        /* renamed from: Y */
        public final <T> T m47736Y(InterfaceC18157M<T> interfaceC18157M, C18219m c18219m) throws IOException {
            int m47733b0 = m47733b0();
            m47730e0(m47733b0);
            int i = this.f74136e;
            int i2 = this.f74134c + m47733b0;
            this.f74136e = i2;
            try {
                T mo47991d = interfaceC18157M.mo47991d();
                interfaceC18157M.mo47986i(mo47991d, this, c18219m);
                interfaceC18157M.mo47988g(mo47991d);
                if (this.f74134c == i2) {
                    return mo47991d;
                }
                throw InvalidProtocolBufferException.m48004h();
            } finally {
                this.f74136e = i;
            }
        }

        /* renamed from: Z */
        public String m47735Z(boolean z) throws IOException {
            m47728g0(2);
            int m47733b0 = m47733b0();
            if (m47733b0 == 0) {
                return "";
            }
            m47730e0(m47733b0);
            if (z) {
                byte[] bArr = this.f74133b;
                int i = this.f74134c;
                if (!C18172T.m47832n(bArr, i, i + m47733b0)) {
                    throw InvalidProtocolBufferException.m48008d();
                }
            }
            String str = new String(this.f74133b, this.f74134c, m47733b0, C18238v.f74218b);
            this.f74134c += m47733b0;
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: a */
        public void mo47611a(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18141A) {
                C18141A c18141a = (C18141A) list;
                int m47802b = C18178U.m47802b(this.f74137f);
                if (m47802b != 0) {
                    if (m47802b == 2) {
                        int m47733b0 = this.f74134c + m47733b0();
                        while (this.f74134c < m47733b0) {
                            c18141a.m48221f(AbstractC18211h.m47676c(m47732c0()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.m48007e();
                }
                do {
                    c18141a.m48221f(mo47630F());
                    if (m47743R()) {
                        return;
                    }
                    i2 = this.f74134c;
                } while (m47733b0() == this.f74137f);
                this.f74134c = i2;
                return;
            }
            int m47802b2 = C18178U.m47802b(this.f74137f);
            if (m47802b2 != 0) {
                if (m47802b2 == 2) {
                    int m47733b02 = this.f74134c + m47733b0();
                    while (this.f74134c < m47733b02) {
                        list.add(Long.valueOf(AbstractC18211h.m47676c(m47732c0())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                list.add(Long.valueOf(mo47630F()));
                if (m47743R()) {
                    return;
                }
                i = this.f74134c;
            } while (m47733b0() == this.f74137f);
            this.f74134c = i;
        }

        /* renamed from: a0 */
        public void m47734a0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (C18178U.m47802b(this.f74137f) == 2) {
                if ((list instanceof InterfaceC35251Po2) && !z) {
                    InterfaceC35251Po2 interfaceC35251Po2 = (InterfaceC35251Po2) list;
                    do {
                        interfaceC35251Po2.mo11973q1(mo47604h());
                        if (m47743R()) {
                            return;
                        }
                        i2 = this.f74134c;
                    } while (m47733b0() == this.f74137f);
                    this.f74134c = i2;
                    return;
                }
                do {
                    list.add(m47735Z(z));
                    if (m47743R()) {
                        return;
                    }
                    i = this.f74134c;
                } while (m47733b0() == this.f74137f);
                this.f74134c = i;
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: b */
        public long mo47610b() throws IOException {
            m47728g0(1);
            return m47738W();
        }

        /* renamed from: b0 */
        public final int m47733b0() throws IOException {
            int i;
            int i2 = this.f74134c;
            int i3 = this.f74136e;
            if (i3 != i2) {
                byte[] bArr = this.f74133b;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f74134c = i4;
                    return b;
                } else if (i3 - i4 < 9) {
                    return (int) m47731d0();
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
                                                        throw InvalidProtocolBufferException.m48006f();
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
                    this.f74134c = i5;
                    return i;
                }
            }
            throw InvalidProtocolBufferException.m48001k();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: c */
        public int mo47609c() throws IOException {
            m47728g0(0);
            return m47733b0();
        }

        /* renamed from: c0 */
        public long m47732c0() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            int i2 = this.f74134c;
            int i3 = this.f74136e;
            if (i3 != i2) {
                byte[] bArr = this.f74133b;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f74134c = i4;
                    return b;
                } else if (i3 - i4 < 9) {
                    return m47731d0();
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
                                                        throw InvalidProtocolBufferException.m48006f();
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
                        this.f74134c = i5;
                        return j;
                    }
                    j = i;
                    this.f74134c = i5;
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m48001k();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: d */
        public int mo47608d() {
            return this.f74137f;
        }

        /* renamed from: d0 */
        public final long m47731d0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte m47742S = m47742S();
                j |= (m47742S & ByteCompanionObject.MAX_VALUE) << i;
                if ((m47742S & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.m48006f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: e */
        public int mo47607e() throws IOException {
            m47728g0(0);
            return m47733b0();
        }

        /* renamed from: e0 */
        public final void m47730e0(int i) throws IOException {
            if (i >= 0 && i <= this.f74136e - this.f74134c) {
                return;
            }
            throw InvalidProtocolBufferException.m48001k();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: f */
        public int mo47606f() throws IOException {
            m47728g0(0);
            return AbstractC18211h.m47677b(m47733b0());
        }

        /* renamed from: f0 */
        public final void m47729f0(int i) throws IOException {
            if (this.f74134c == i) {
                return;
            }
            throw InvalidProtocolBufferException.m48001k();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: g */
        public void mo47605g(List<Boolean> list) throws IOException {
            int i;
            boolean z;
            int i2;
            boolean z2;
            if (list instanceof C18198f) {
                C18198f c18198f = (C18198f) list;
                int m47802b = C18178U.m47802b(this.f74137f);
                if (m47802b != 0) {
                    if (m47802b == 2) {
                        int m47733b0 = this.f74134c + m47733b0();
                        while (this.f74134c < m47733b0) {
                            if (m47733b0() != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c18198f.m47718f(z2);
                        }
                        m47729f0(m47733b0);
                        return;
                    }
                    throw InvalidProtocolBufferException.m48007e();
                }
                do {
                    c18198f.m47718f(mo47589w());
                    if (m47743R()) {
                        return;
                    }
                    i2 = this.f74134c;
                } while (m47733b0() == this.f74137f);
                this.f74134c = i2;
                return;
            }
            int m47802b2 = C18178U.m47802b(this.f74137f);
            if (m47802b2 != 0) {
                if (m47802b2 == 2) {
                    int m47733b02 = this.f74134c + m47733b0();
                    while (this.f74134c < m47733b02) {
                        if (m47733b0() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        list.add(Boolean.valueOf(z));
                    }
                    m47729f0(m47733b02);
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                list.add(Boolean.valueOf(mo47589w()));
                if (m47743R()) {
                    return;
                }
                i = this.f74134c;
            } while (m47733b0() == this.f74137f);
            this.f74134c = i;
        }

        /* renamed from: g0 */
        public final void m47728g0(int i) throws IOException {
            if (C18178U.m47802b(this.f74137f) == i) {
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: h */
        public AbstractC18199g mo47604h() throws IOException {
            AbstractC18199g m47698h;
            m47728g0(2);
            int m47733b0 = m47733b0();
            if (m47733b0 == 0) {
                return AbstractC18199g.f74142c;
            }
            m47730e0(m47733b0);
            if (this.f74132a) {
                m47698h = AbstractC18199g.m47703K(this.f74133b, this.f74134c, m47733b0);
            } else {
                m47698h = AbstractC18199g.m47698h(this.f74133b, this.f74134c, m47733b0);
            }
            this.f74134c += m47733b0;
            return m47698h;
        }

        /* renamed from: h0 */
        public final void m47727h0(int i) throws IOException {
            m47730e0(i);
            this.f74134c += i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: i */
        public void mo47603i(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18237u) {
                C18237u c18237u = (C18237u) list;
                int m47802b = C18178U.m47802b(this.f74137f);
                if (m47802b != 0) {
                    if (m47802b == 2) {
                        int m47733b0 = this.f74134c + m47733b0();
                        while (this.f74134c < m47733b0) {
                            c18237u.m47434L2(AbstractC18211h.m47677b(m47733b0()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.m48007e();
                }
                do {
                    c18237u.m47434L2(mo47606f());
                    if (m47743R()) {
                        return;
                    }
                    i2 = this.f74134c;
                } while (m47733b0() == this.f74137f);
                this.f74134c = i2;
                return;
            }
            int m47802b2 = C18178U.m47802b(this.f74137f);
            if (m47802b2 != 0) {
                if (m47802b2 == 2) {
                    int m47733b02 = this.f74134c + m47733b0();
                    while (this.f74134c < m47733b02) {
                        list.add(Integer.valueOf(AbstractC18211h.m47677b(m47733b0())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                list.add(Integer.valueOf(mo47606f()));
                if (m47743R()) {
                    return;
                }
                i = this.f74134c;
            } while (m47733b0() == this.f74137f);
            this.f74134c = i;
        }

        /* renamed from: i0 */
        public final void m47726i0() throws IOException {
            int i = this.f74138g;
            this.f74138g = C18178U.m47801c(C18178U.m47803a(this.f74137f), 4);
            while (mo47598n() != Integer.MAX_VALUE && mo47595q()) {
            }
            if (this.f74137f == this.f74138g) {
                this.f74138g = i;
                return;
            }
            throw InvalidProtocolBufferException.m48004h();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: j */
        public long mo47602j() throws IOException {
            m47728g0(0);
            return m47732c0();
        }

        /* renamed from: j0 */
        public final void m47725j0() throws IOException {
            int i = this.f74136e;
            int i2 = this.f74134c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f74133b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f74134c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            m47724k0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: k */
        public void mo47601k(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18141A) {
                C18141A c18141a = (C18141A) list;
                int m47802b = C18178U.m47802b(this.f74137f);
                if (m47802b != 1) {
                    if (m47802b == 2) {
                        int m47733b0 = m47733b0();
                        m47722m0(m47733b0);
                        int i3 = this.f74134c + m47733b0;
                        while (this.f74134c < i3) {
                            c18141a.m48221f(m47737X());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.m48007e();
                }
                do {
                    c18141a.m48221f(mo47610b());
                    if (m47743R()) {
                        return;
                    }
                    i2 = this.f74134c;
                } while (m47733b0() == this.f74137f);
                this.f74134c = i2;
                return;
            }
            int m47802b2 = C18178U.m47802b(this.f74137f);
            if (m47802b2 != 1) {
                if (m47802b2 == 2) {
                    int m47733b02 = m47733b0();
                    m47722m0(m47733b02);
                    int i4 = this.f74134c + m47733b02;
                    while (this.f74134c < i4) {
                        list.add(Long.valueOf(m47737X()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                list.add(Long.valueOf(mo47610b()));
                if (m47743R()) {
                    return;
                }
                i = this.f74134c;
            } while (m47733b0() == this.f74137f);
            this.f74134c = i;
        }

        /* renamed from: k0 */
        public final void m47724k0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (m47742S() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.m48006f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: l */
        public void mo47600l(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18237u) {
                C18237u c18237u = (C18237u) list;
                int m47802b = C18178U.m47802b(this.f74137f);
                if (m47802b != 0) {
                    if (m47802b == 2) {
                        int m47733b0 = this.f74134c + m47733b0();
                        while (this.f74134c < m47733b0) {
                            c18237u.m47434L2(m47733b0());
                        }
                        m47729f0(m47733b0);
                        return;
                    }
                    throw InvalidProtocolBufferException.m48007e();
                }
                do {
                    c18237u.m47434L2(mo47634B());
                    if (m47743R()) {
                        return;
                    }
                    i2 = this.f74134c;
                } while (m47733b0() == this.f74137f);
                this.f74134c = i2;
                return;
            }
            int m47802b2 = C18178U.m47802b(this.f74137f);
            if (m47802b2 != 0) {
                if (m47802b2 == 2) {
                    int m47733b02 = this.f74134c + m47733b0();
                    while (this.f74134c < m47733b02) {
                        list.add(Integer.valueOf(m47733b0()));
                    }
                    m47729f0(m47733b02);
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                list.add(Integer.valueOf(mo47634B()));
                if (m47743R()) {
                    return;
                }
                i = this.f74134c;
            } while (m47733b0() == this.f74137f);
            this.f74134c = i;
        }

        /* renamed from: l0 */
        public final void m47723l0(int i) throws IOException {
            m47730e0(i);
            if ((i & 3) == 0) {
                return;
            }
            throw InvalidProtocolBufferException.m48004h();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: m */
        public void mo47599m(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18237u) {
                C18237u c18237u = (C18237u) list;
                int m47802b = C18178U.m47802b(this.f74137f);
                if (m47802b != 2) {
                    if (m47802b == 5) {
                        do {
                            c18237u.m47434L2(mo47631E());
                            if (m47743R()) {
                                return;
                            }
                            i2 = this.f74134c;
                        } while (m47733b0() == this.f74137f);
                        this.f74134c = i2;
                        return;
                    }
                    throw InvalidProtocolBufferException.m48007e();
                }
                int m47733b0 = m47733b0();
                m47723l0(m47733b0);
                int i3 = this.f74134c + m47733b0;
                while (this.f74134c < i3) {
                    c18237u.m47434L2(m47739V());
                }
                return;
            }
            int m47802b2 = C18178U.m47802b(this.f74137f);
            if (m47802b2 != 2) {
                if (m47802b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo47631E()));
                        if (m47743R()) {
                            return;
                        }
                        i = this.f74134c;
                    } while (m47733b0() == this.f74137f);
                    this.f74134c = i;
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            int m47733b02 = m47733b0();
            m47723l0(m47733b02);
            int i4 = this.f74134c + m47733b02;
            while (this.f74134c < i4) {
                list.add(Integer.valueOf(m47739V()));
            }
        }

        /* renamed from: m0 */
        public final void m47722m0(int i) throws IOException {
            m47730e0(i);
            if ((i & 7) == 0) {
                return;
            }
            throw InvalidProtocolBufferException.m48004h();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: n */
        public int mo47598n() throws IOException {
            if (m47743R()) {
                return Integer.MAX_VALUE;
            }
            int m47733b0 = m47733b0();
            this.f74137f = m47733b0;
            if (m47733b0 == this.f74138g) {
                return Integer.MAX_VALUE;
            }
            return C18178U.m47803a(m47733b0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: o */
        public void mo47597o(List<String> list) throws IOException {
            m47734a0(list, false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: p */
        public void mo47596p(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18228r) {
                C18228r c18228r = (C18228r) list;
                int m47802b = C18178U.m47802b(this.f74137f);
                if (m47802b != 2) {
                    if (m47802b == 5) {
                        do {
                            c18228r.m47491e(readFloat());
                            if (m47743R()) {
                                return;
                            }
                            i2 = this.f74134c;
                        } while (m47733b0() == this.f74137f);
                        this.f74134c = i2;
                        return;
                    }
                    throw InvalidProtocolBufferException.m48007e();
                }
                int m47733b0 = m47733b0();
                m47723l0(m47733b0);
                int i3 = this.f74134c + m47733b0;
                while (this.f74134c < i3) {
                    c18228r.m47491e(Float.intBitsToFloat(m47739V()));
                }
                return;
            }
            int m47802b2 = C18178U.m47802b(this.f74137f);
            if (m47802b2 != 2) {
                if (m47802b2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (m47743R()) {
                            return;
                        }
                        i = this.f74134c;
                    } while (m47733b0() == this.f74137f);
                    this.f74134c = i;
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            int m47733b02 = m47733b0();
            m47723l0(m47733b02);
            int i4 = this.f74134c + m47733b02;
            while (this.f74134c < i4) {
                list.add(Float.valueOf(Float.intBitsToFloat(m47739V())));
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: q */
        public boolean mo47595q() throws IOException {
            int i;
            if (!m47743R() && (i = this.f74137f) != this.f74138g) {
                int m47802b = C18178U.m47802b(i);
                if (m47802b != 0) {
                    if (m47802b != 1) {
                        if (m47802b != 2) {
                            if (m47802b != 3) {
                                if (m47802b == 5) {
                                    m47727h0(4);
                                    return true;
                                }
                                throw InvalidProtocolBufferException.m48007e();
                            }
                            m47726i0();
                            return true;
                        }
                        m47727h0(m47733b0());
                        return true;
                    }
                    m47727h0(8);
                    return true;
                }
                m47725j0();
                return true;
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: r */
        public void mo47594r(List<AbstractC18199g> list) throws IOException {
            int i;
            if (C18178U.m47802b(this.f74137f) == 2) {
                do {
                    list.add(mo47604h());
                    if (m47743R()) {
                        return;
                    }
                    i = this.f74134c;
                } while (m47733b0() == this.f74137f);
                this.f74134c = i;
                return;
            }
            throw InvalidProtocolBufferException.m48007e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        public double readDouble() throws IOException {
            m47728g0(1);
            return Double.longBitsToDouble(m47738W());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        public float readFloat() throws IOException {
            m47728g0(5);
            return Float.intBitsToFloat(m47740U());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: s */
        public void mo47593s(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18217k) {
                C18217k c18217k = (C18217k) list;
                int m47802b = C18178U.m47802b(this.f74137f);
                if (m47802b != 1) {
                    if (m47802b == 2) {
                        int m47733b0 = m47733b0();
                        m47722m0(m47733b0);
                        int i3 = this.f74134c + m47733b0;
                        while (this.f74134c < i3) {
                            c18217k.m47539e(Double.longBitsToDouble(m47737X()));
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.m48007e();
                }
                do {
                    c18217k.m47539e(readDouble());
                    if (m47743R()) {
                        return;
                    }
                    i2 = this.f74134c;
                } while (m47733b0() == this.f74137f);
                this.f74134c = i2;
                return;
            }
            int m47802b2 = C18178U.m47802b(this.f74137f);
            if (m47802b2 != 1) {
                if (m47802b2 == 2) {
                    int m47733b02 = m47733b0();
                    m47722m0(m47733b02);
                    int i4 = this.f74134c + m47733b02;
                    while (this.f74134c < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(m47737X())));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                list.add(Double.valueOf(readDouble()));
                if (m47743R()) {
                    return;
                }
                i = this.f74134c;
            } while (m47733b0() == this.f74137f);
            this.f74134c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: t */
        public long mo47592t() throws IOException {
            m47728g0(0);
            return m47732c0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: u */
        public long mo47591u() throws IOException {
            m47728g0(1);
            return m47738W();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: v */
        public void mo47590v(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18237u) {
                C18237u c18237u = (C18237u) list;
                int m47802b = C18178U.m47802b(this.f74137f);
                if (m47802b != 2) {
                    if (m47802b == 5) {
                        do {
                            c18237u.m47434L2(mo47628H());
                            if (m47743R()) {
                                return;
                            }
                            i2 = this.f74134c;
                        } while (m47733b0() == this.f74137f);
                        this.f74134c = i2;
                        return;
                    }
                    throw InvalidProtocolBufferException.m48007e();
                }
                int m47733b0 = m47733b0();
                m47723l0(m47733b0);
                int i3 = this.f74134c + m47733b0;
                while (this.f74134c < i3) {
                    c18237u.m47434L2(m47739V());
                }
                return;
            }
            int m47802b2 = C18178U.m47802b(this.f74137f);
            if (m47802b2 != 2) {
                if (m47802b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo47628H()));
                        if (m47743R()) {
                            return;
                        }
                        i = this.f74134c;
                    } while (m47733b0() == this.f74137f);
                    this.f74134c = i;
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            int m47733b02 = m47733b0();
            m47723l0(m47733b02);
            int i4 = this.f74134c + m47733b02;
            while (this.f74134c < i4) {
                list.add(Integer.valueOf(m47739V()));
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: w */
        public boolean mo47589w() throws IOException {
            m47728g0(0);
            if (m47733b0() == 0) {
                return false;
            }
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: x */
        public void mo47588x(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18141A) {
                C18141A c18141a = (C18141A) list;
                int m47802b = C18178U.m47802b(this.f74137f);
                if (m47802b != 0) {
                    if (m47802b == 2) {
                        int m47733b0 = this.f74134c + m47733b0();
                        while (this.f74134c < m47733b0) {
                            c18141a.m48221f(m47732c0());
                        }
                        m47729f0(m47733b0);
                        return;
                    }
                    throw InvalidProtocolBufferException.m48007e();
                }
                do {
                    c18141a.m48221f(mo47602j());
                    if (m47743R()) {
                        return;
                    }
                    i2 = this.f74134c;
                } while (m47733b0() == this.f74137f);
                this.f74134c = i2;
                return;
            }
            int m47802b2 = C18178U.m47802b(this.f74137f);
            if (m47802b2 != 0) {
                if (m47802b2 == 2) {
                    int m47733b02 = this.f74134c + m47733b0();
                    while (this.f74134c < m47733b02) {
                        list.add(Long.valueOf(m47732c0()));
                    }
                    m47729f0(m47733b02);
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                list.add(Long.valueOf(mo47602j()));
                if (m47743R()) {
                    return;
                }
                i = this.f74134c;
            } while (m47733b0() == this.f74137f);
            this.f74134c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: y */
        public void mo47587y(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18141A) {
                C18141A c18141a = (C18141A) list;
                int m47802b = C18178U.m47802b(this.f74137f);
                if (m47802b != 0) {
                    if (m47802b == 2) {
                        int m47733b0 = this.f74134c + m47733b0();
                        while (this.f74134c < m47733b0) {
                            c18141a.m48221f(m47732c0());
                        }
                        m47729f0(m47733b0);
                        return;
                    }
                    throw InvalidProtocolBufferException.m48007e();
                }
                do {
                    c18141a.m48221f(mo47592t());
                    if (m47743R()) {
                        return;
                    }
                    i2 = this.f74134c;
                } while (m47733b0() == this.f74137f);
                this.f74134c = i2;
                return;
            }
            int m47802b2 = C18178U.m47802b(this.f74137f);
            if (m47802b2 != 0) {
                if (m47802b2 == 2) {
                    int m47733b02 = this.f74134c + m47733b0();
                    while (this.f74134c < m47733b02) {
                        list.add(Long.valueOf(m47732c0()));
                    }
                    m47729f0(m47733b02);
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                list.add(Long.valueOf(mo47592t()));
                if (m47743R()) {
                    return;
                }
                i = this.f74134c;
            } while (m47733b0() == this.f74137f);
            this.f74134c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC18156L
        /* renamed from: z */
        public void mo47586z(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C18237u) {
                C18237u c18237u = (C18237u) list;
                int m47802b = C18178U.m47802b(this.f74137f);
                if (m47802b != 0) {
                    if (m47802b == 2) {
                        int m47733b0 = this.f74134c + m47733b0();
                        while (this.f74134c < m47733b0) {
                            c18237u.m47434L2(m47733b0());
                        }
                        return;
                    }
                    throw InvalidProtocolBufferException.m48007e();
                }
                do {
                    c18237u.m47434L2(mo47607e());
                    if (m47743R()) {
                        return;
                    }
                    i2 = this.f74134c;
                } while (m47733b0() == this.f74137f);
                this.f74134c = i2;
                return;
            }
            int m47802b2 = C18178U.m47802b(this.f74137f);
            if (m47802b2 != 0) {
                if (m47802b2 == 2) {
                    int m47733b02 = this.f74134c + m47733b0();
                    while (this.f74134c < m47733b02) {
                        list.add(Integer.valueOf(m47733b0()));
                    }
                    return;
                }
                throw InvalidProtocolBufferException.m48007e();
            }
            do {
                list.add(Integer.valueOf(mo47607e()));
                if (m47743R()) {
                    return;
                }
                i = this.f74134c;
            } while (m47733b0() == this.f74137f);
            this.f74134c = i;
        }
    }

    /* renamed from: Q */
    public static AbstractC18195e m47744Q(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new C18197b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    private AbstractC18195e() {
    }
}
