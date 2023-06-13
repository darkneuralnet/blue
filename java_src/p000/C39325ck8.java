package p000;

import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzft;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
/* renamed from: ck8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39325ck8 {

    /* renamed from: a */
    public final ByteBuffer f61169a;

    /* renamed from: b */
    public zzbn f61170b;

    /* renamed from: c */
    public int f61171c;

    public C39325ck8(ByteBuffer byteBuffer) {
        this.f61169a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: A */
    public static int m60969A(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: a */
    public static int m60968a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: g */
    public static int m60962g(int i, String str) {
        return m60944y(i) + m60951r(str);
    }

    /* renamed from: h */
    public static int m60961h(int i, C35464Ql8 c35464Ql8) {
        int m60944y = m60944y(i);
        int m88004f = c35464Ql8.m88004f();
        return m60944y + m60969A(m88004f) + m88004f;
    }

    /* renamed from: i */
    public static int m60960i(int i, byte[] bArr) {
        return m60944y(i) + m60950s(bArr);
    }

    /* renamed from: m */
    public static int m60956m(int i, long j) {
        return m60944y(i) + m60945x(j);
    }

    /* renamed from: n */
    public static void m60955n(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        char charAt;
        int i3;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        int i4 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                char c = charAt2;
                if (charAt2 >= 128) {
                    if (charAt2 < 2048) {
                        i3 = (charAt2 >>> 6) | 960;
                    } else if (charAt2 >= 55296 && 57343 >= charAt2) {
                        int i5 = i4 + 1;
                        if (i5 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint & 63) | 128));
                                i4 = i5;
                                i4++;
                            } else {
                                i4 = i5;
                            }
                        }
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("Unpaired surrogate at index ");
                        sb.append(i4 - 1);
                        throw new IllegalArgumentException(sb.toString());
                    } else {
                        byteBuffer.put((byte) ((charAt2 >>> '\f') | 480));
                        i3 = ((charAt2 >>> 6) & 63) | 128;
                    }
                    byteBuffer.put((byte) i3);
                    c = (charAt2 & '?') | 128;
                }
                byteBuffer.put((byte) c);
                i4++;
            }
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int remaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i6 = remaining + arrayOffset;
            while (i4 < length2) {
                int i7 = i4 + arrayOffset;
                if (i7 >= i6 || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                array[i7] = (byte) charAt;
                i4++;
            }
            if (i4 == length2) {
                i = arrayOffset + length2;
            } else {
                i = arrayOffset + i4;
                while (i4 < length2) {
                    char charAt4 = charSequence.charAt(i4);
                    if (charAt4 >= 128 || i >= i6) {
                        if (charAt4 < 2048 && i <= i6 - 2) {
                            int i8 = i + 1;
                            array[i] = (byte) ((charAt4 >>> 6) | 960);
                            i = i8 + 1;
                            array[i8] = (byte) ((charAt4 & '?') | 128);
                        } else if ((charAt4 >= 55296 && 57343 >= charAt4) || i > i6 - 3) {
                            if (i > i6 - 4) {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt4);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            int i9 = i4 + 1;
                            if (i9 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i9);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    int i10 = i + 1;
                                    array[i] = (byte) ((codePoint2 >>> 18) | 240);
                                    int i11 = i10 + 1;
                                    array[i10] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i12 = i11 + 1;
                                    array[i11] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i = i12 + 1;
                                    array[i12] = (byte) ((codePoint2 & 63) | 128);
                                    i4 = i9;
                                } else {
                                    i4 = i9;
                                }
                            }
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unpaired surrogate at index ");
                            sb3.append(i4 - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        } else {
                            int i13 = i + 1;
                            array[i] = (byte) ((charAt4 >>> '\f') | 480);
                            int i14 = i13 + 1;
                            array[i13] = (byte) (((charAt4 >>> 6) & 63) | 128);
                            i2 = i14 + 1;
                            array[i14] = (byte) ((charAt4 & '?') | 128);
                        }
                        i4++;
                    } else {
                        i2 = i + 1;
                        array[i] = (byte) charAt4;
                    }
                    i = i2;
                    i4++;
                }
            }
            byteBuffer.position(i - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    /* renamed from: q */
    public static C39325ck8 m60952q(byte[] bArr) {
        return m60949t(bArr, 0, bArr.length);
    }

    /* renamed from: r */
    public static int m60951r(String str) {
        int m60968a = m60968a(str);
        return m60969A(m60968a) + m60968a;
    }

    /* renamed from: s */
    public static int m60950s(byte[] bArr) {
        return m60969A(bArr.length) + bArr.length;
    }

    /* renamed from: t */
    public static C39325ck8 m60949t(byte[] bArr, int i, int i2) {
        return new C39325ck8(bArr, 0, i2);
    }

    /* renamed from: v */
    public static long m60947v(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: x */
    public static int m60945x(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: y */
    public static int m60944y(int i) {
        return m60969A(i << 3);
    }

    /* renamed from: z */
    public static int m60943z(int i) {
        if (i >= 0) {
            return m60969A(i);
        }
        return 10;
    }

    /* renamed from: b */
    public final void m60967b(int i, String str) throws IOException {
        m60959j(i, 2);
        try {
            int m60969A = m60969A(str.length());
            if (m60969A != m60969A(str.length() * 3)) {
                m60963f(m60968a(str));
                m60955n(str, this.f61169a);
                return;
            }
            int position = this.f61169a.position();
            if (this.f61169a.remaining() < m60969A) {
                throw new zzft(position + m60969A, this.f61169a.limit());
            }
            this.f61169a.position(position + m60969A);
            m60955n(str, this.f61169a);
            int position2 = this.f61169a.position();
            this.f61169a.position(position);
            m60963f((position2 - position) - m60969A);
            this.f61169a.position(position2);
        } catch (BufferOverflowException e) {
            zzft zzftVar = new zzft(this.f61169a.position(), this.f61169a.limit());
            zzftVar.initCause(e);
            throw zzftVar;
        }
    }

    /* renamed from: c */
    public final void m60966c(int i, C35464Ql8 c35464Ql8) throws IOException {
        m60959j(i, 2);
        if (c35464Ql8.f30878b < 0) {
            c35464Ql8.m88004f();
        }
        m60963f(c35464Ql8.f30878b);
        c35464Ql8.mo40568d(this);
    }

    /* renamed from: d */
    public final void m60965d(int i, byte[] bArr) throws IOException {
        m60959j(i, 2);
        m60963f(bArr.length);
        int length = bArr.length;
        if (this.f61169a.remaining() < length) {
            throw new zzft(this.f61169a.position(), this.f61169a.limit());
        }
        this.f61169a.put(bArr, 0, length);
    }

    /* renamed from: e */
    public final void m60964e(int i) throws IOException {
        byte b = (byte) i;
        if (!this.f61169a.hasRemaining()) {
            throw new zzft(this.f61169a.position(), this.f61169a.limit());
        }
        this.f61169a.put(b);
    }

    /* renamed from: f */
    public final void m60963f(int i) throws IOException {
        while ((i & (-128)) != 0) {
            m60964e((i & 127) | 128);
            i >>>= 7;
        }
        m60964e(i);
    }

    /* renamed from: j */
    public final void m60959j(int i, int i2) throws IOException {
        m60963f((i << 3) | i2);
    }

    /* renamed from: k */
    public final void m60958k(int i, boolean z) throws IOException {
        m60959j(25, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        if (!this.f61169a.hasRemaining()) {
            throw new zzft(this.f61169a.position(), this.f61169a.limit());
        }
        this.f61169a.put(b);
    }

    /* renamed from: l */
    public final void m60957l(int i, int i2) throws IOException {
        m60959j(i, 0);
        if (i2 >= 0) {
            m60963f(i2);
        } else {
            m60946w(i2);
        }
    }

    /* renamed from: o */
    public final void m60954o(int i, H28 h28) throws IOException {
        if (this.f61170b != null) {
            if (this.f61171c != this.f61169a.position()) {
                this.f61170b.mo51372c(this.f61169a.array(), this.f61171c, this.f61169a.position() - this.f61171c);
            }
            zzbn zzbnVar = this.f61170b;
            zzbnVar.mo51364o(i, h28);
            zzbnVar.mo51374b();
            this.f61171c = this.f61169a.position();
        }
        this.f61170b = zzbn.m51416f(this.f61169a);
        this.f61171c = this.f61169a.position();
        zzbn zzbnVar2 = this.f61170b;
        zzbnVar2.mo51364o(i, h28);
        zzbnVar2.mo51374b();
        this.f61171c = this.f61169a.position();
    }

    /* renamed from: p */
    public final void m60953p() {
        if (this.f61169a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.f61169a.remaining())));
        }
    }

    /* renamed from: u */
    public final void m60948u(int i, long j) throws IOException {
        m60959j(i, 0);
        m60946w(j);
    }

    /* renamed from: w */
    public final void m60946w(long j) throws IOException {
        while (((-128) & j) != 0) {
            m60964e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m60964e((int) j);
    }

    public C39325ck8(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }
}
