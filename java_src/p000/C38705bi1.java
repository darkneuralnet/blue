package p000;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.UShort;
import p000.C36825Wh1;
/* renamed from: bi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38705bi1 extends FilterOutputStream {

    /* renamed from: h */
    public static final byte[] f57962h = "Exif\u0000\u0000".getBytes(C36591Vh1.f39475e);

    /* renamed from: b */
    public final C36825Wh1 f57963b;

    /* renamed from: c */
    public final byte[] f57964c;

    /* renamed from: d */
    public final ByteBuffer f57965d;

    /* renamed from: e */
    public int f57966e;

    /* renamed from: f */
    public int f57967f;

    /* renamed from: g */
    public int f57968g;

    /* renamed from: bi1$a */
    /* loaded from: classes.dex */
    public static final class C12481a {
        private C12481a() {
        }

        /* renamed from: a */
        public static boolean m64107a(short s) {
            return (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) ? false : true;
        }
    }

    public C38705bi1(OutputStream outputStream, C36825Wh1 c36825Wh1) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f57964c = new byte[1];
        this.f57965d = ByteBuffer.allocate(4);
        this.f57966e = 0;
        this.f57963b = c36825Wh1;
    }

    /* renamed from: a */
    public final int m64109a(int i, byte[] bArr, int i2, int i3) {
        int min = Math.min(i3, i - this.f57965d.position());
        this.f57965d.put(bArr, i2, min);
        return min;
    }

    /* renamed from: b */
    public final void m64108b(H70 h70) throws IOException {
        C39909di1[] c39909di1Arr;
        short s;
        C39909di1[][] c39909di1Arr2 = C36825Wh1.f41517i;
        int[] iArr = new int[c39909di1Arr2.length];
        int[] iArr2 = new int[c39909di1Arr2.length];
        for (C39909di1 c39909di1 : C36825Wh1.f41515g) {
            for (int i = 0; i < C36825Wh1.f41517i.length; i++) {
                this.f57963b.m78001c(i).remove(c39909di1.f77075b);
            }
        }
        if (!this.f57963b.m78001c(1).isEmpty()) {
            this.f57963b.m78001c(0).put(C36825Wh1.f41515g[1].f77075b, C36591Vh1.m79561f(0L, this.f57963b.m78000d()));
        }
        if (!this.f57963b.m78001c(2).isEmpty()) {
            this.f57963b.m78001c(0).put(C36825Wh1.f41515g[2].f77075b, C36591Vh1.m79561f(0L, this.f57963b.m78000d()));
        }
        if (!this.f57963b.m78001c(3).isEmpty()) {
            this.f57963b.m78001c(1).put(C36825Wh1.f41515g[3].f77075b, C36591Vh1.m79561f(0L, this.f57963b.m78000d()));
        }
        for (int i2 = 0; i2 < C36825Wh1.f41517i.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, C36591Vh1> entry : this.f57963b.m78001c(i2).entrySet()) {
                int m79557j = entry.getValue().m79557j();
                if (m79557j > 4) {
                    i3 += m79557j;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < C36825Wh1.f41517i.length; i5++) {
            if (!this.f57963b.m78001c(i5).isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.f57963b.m78001c(i5).size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        int i6 = i4 + 8;
        if (!this.f57963b.m78001c(1).isEmpty()) {
            this.f57963b.m78001c(0).put(C36825Wh1.f41515g[1].f77075b, C36591Vh1.m79561f(iArr[1], this.f57963b.m78000d()));
        }
        if (!this.f57963b.m78001c(2).isEmpty()) {
            this.f57963b.m78001c(0).put(C36825Wh1.f41515g[2].f77075b, C36591Vh1.m79561f(iArr[2], this.f57963b.m78000d()));
        }
        if (!this.f57963b.m78001c(3).isEmpty()) {
            this.f57963b.m78001c(1).put(C36825Wh1.f41515g[3].f77075b, C36591Vh1.m79561f(iArr[3], this.f57963b.m78000d()));
        }
        h70.m104388g(i6);
        h70.write(f57962h);
        if (this.f57963b.m78000d() == ByteOrder.BIG_ENDIAN) {
            s = 19789;
        } else {
            s = 18761;
        }
        h70.m104390d(s);
        h70.m104393a(this.f57963b.m78000d());
        h70.m104388g(42);
        h70.m104389f(8L);
        for (int i7 = 0; i7 < C36825Wh1.f41517i.length; i7++) {
            if (!this.f57963b.m78001c(i7).isEmpty()) {
                h70.m104388g(this.f57963b.m78001c(i7).size());
                int size = iArr[i7] + 2 + (this.f57963b.m78001c(i7).size() * 12) + 4;
                for (Map.Entry<String, C36591Vh1> entry2 : this.f57963b.m78001c(i7).entrySet()) {
                    int i8 = ((C39909di1) HZ3.m103730h(C36825Wh1.C9150b.f41526f.get(i7).get(entry2.getKey()), "Tag not supported: " + entry2.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f77074a;
                    C36591Vh1 value = entry2.getValue();
                    int m79557j2 = value.m79557j();
                    h70.m104388g(i8);
                    h70.m104388g(value.f39479a);
                    h70.m104391c(value.f39480b);
                    if (m79557j2 > 4) {
                        h70.m104389f(size);
                        size += m79557j2;
                    } else {
                        h70.write(value.f39482d);
                        if (m79557j2 < 4) {
                            while (m79557j2 < 4) {
                                h70.m104392b(0);
                                m79557j2++;
                            }
                        }
                    }
                }
                h70.m104389f(0L);
                for (Map.Entry<String, C36591Vh1> entry3 : this.f57963b.m78001c(i7).entrySet()) {
                    byte[] bArr = entry3.getValue().f39482d;
                    if (bArr.length > 4) {
                        h70.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        h70.m104393a(ByteOrder.BIG_ENDIAN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
        if (r9 <= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0108, code lost:
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(byte[] bArr, int i, int i2) throws IOException {
        while (true) {
            int i3 = this.f57967f;
            if ((i3 > 0 || this.f57968g > 0 || this.f57966e != 2) && i2 > 0) {
                if (i3 > 0) {
                    int min = Math.min(i2, i3);
                    i2 -= min;
                    this.f57967f -= min;
                    i += min;
                }
                int i4 = this.f57968g;
                if (i4 > 0) {
                    int min2 = Math.min(i2, i4);
                    ((FilterOutputStream) this).out.write(bArr, i, min2);
                    i2 -= min2;
                    this.f57968g -= min2;
                    i += min2;
                }
                if (i2 == 0) {
                    return;
                }
                int i5 = this.f57966e;
                if (i5 == 0) {
                    int m64109a = m64109a(2, bArr, i, i2);
                    i += m64109a;
                    i2 -= m64109a;
                    if (this.f57965d.position() < 2) {
                        return;
                    }
                    this.f57965d.rewind();
                    if (this.f57965d.getShort() == -40) {
                        ((FilterOutputStream) this).out.write(this.f57965d.array(), 0, 2);
                        this.f57966e = 1;
                        this.f57965d.rewind();
                        H70 h70 = new H70(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                        h70.m104390d((short) -31);
                        m64108b(h70);
                    } else {
                        throw new IOException("Not a valid jpeg image, cannot write exif");
                    }
                } else if (i5 != 1) {
                    continue;
                } else {
                    int m64109a2 = m64109a(4, bArr, i, i2);
                    i += m64109a2;
                    i2 -= m64109a2;
                    if (this.f57965d.position() == 2 && this.f57965d.getShort() == -39) {
                        ((FilterOutputStream) this).out.write(this.f57965d.array(), 0, 2);
                        this.f57965d.rewind();
                    }
                    if (this.f57965d.position() < 4) {
                        return;
                    }
                    this.f57965d.rewind();
                    short s = this.f57965d.getShort();
                    if (s == -31) {
                        this.f57967f = (this.f57965d.getShort() & UShort.MAX_VALUE) - 2;
                        this.f57966e = 2;
                    } else if (!C12481a.m64107a(s)) {
                        ((FilterOutputStream) this).out.write(this.f57965d.array(), 0, 4);
                        this.f57968g = (this.f57965d.getShort() & UShort.MAX_VALUE) - 2;
                    } else {
                        ((FilterOutputStream) this).out.write(this.f57965d.array(), 0, 4);
                        this.f57966e = 2;
                    }
                    this.f57965d.rewind();
                }
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f57964c;
        bArr[0] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
