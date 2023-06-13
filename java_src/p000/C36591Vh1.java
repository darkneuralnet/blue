package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
/* renamed from: Vh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36591Vh1 {

    /* renamed from: e */
    public static final Charset f39475e = StandardCharsets.US_ASCII;

    /* renamed from: f */
    public static final String[] f39476f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: g */
    public static final int[] f39477g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: h */
    public static final byte[] f39478h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: a */
    public final int f39479a;

    /* renamed from: b */
    public final int f39480b;

    /* renamed from: c */
    public final long f39481c;

    /* renamed from: d */
    public final byte[] f39482d;

    public C36591Vh1(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    /* renamed from: a */
    public static C36591Vh1 m79566a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new C36591Vh1(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f39475e);
        return new C36591Vh1(1, bytes.length, bytes);
    }

    /* renamed from: b */
    public static C36591Vh1 m79565b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f39477g[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d : dArr) {
            wrap.putDouble(d);
        }
        return new C36591Vh1(12, dArr.length, wrap.array());
    }

    /* renamed from: c */
    public static C36591Vh1 m79564c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f39477g[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putInt(i);
        }
        return new C36591Vh1(9, iArr.length, wrap.array());
    }

    /* renamed from: d */
    public static C36591Vh1 m79563d(C44823lz2[] c44823lz2Arr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f39477g[10] * c44823lz2Arr.length]);
        wrap.order(byteOrder);
        for (C44823lz2 c44823lz2 : c44823lz2Arr) {
            wrap.putInt((int) c44823lz2.m26569b());
            wrap.putInt((int) c44823lz2.m26570a());
        }
        return new C36591Vh1(10, c44823lz2Arr.length, wrap.array());
    }

    /* renamed from: e */
    public static C36591Vh1 m79562e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f39475e);
        return new C36591Vh1(2, bytes.length, bytes);
    }

    /* renamed from: f */
    public static C36591Vh1 m79561f(long j, ByteOrder byteOrder) {
        return m79560g(new long[]{j}, byteOrder);
    }

    /* renamed from: g */
    public static C36591Vh1 m79560g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f39477g[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C36591Vh1(4, jArr.length, wrap.array());
    }

    /* renamed from: h */
    public static C36591Vh1 m79559h(C44823lz2[] c44823lz2Arr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f39477g[5] * c44823lz2Arr.length]);
        wrap.order(byteOrder);
        for (C44823lz2 c44823lz2 : c44823lz2Arr) {
            wrap.putInt((int) c44823lz2.m26569b());
            wrap.putInt((int) c44823lz2.m26570a());
        }
        return new C36591Vh1(5, c44823lz2Arr.length, wrap.array());
    }

    /* renamed from: i */
    public static C36591Vh1 m79558i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f39477g[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new C36591Vh1(3, iArr.length, wrap.array());
    }

    /* renamed from: j */
    public int m79557j() {
        return f39477g[this.f39479a] * this.f39480b;
    }

    public String toString() {
        return "(" + f39476f[this.f39479a] + ", data length:" + this.f39482d.length + ")";
    }

    public C36591Vh1(int i, int i2, long j, byte[] bArr) {
        this.f39479a = i;
        this.f39480b = i2;
        this.f39481c = j;
        this.f39482d = bArr;
    }
}
