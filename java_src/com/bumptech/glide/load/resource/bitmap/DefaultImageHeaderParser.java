package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.amazonaws.services.p026s3.internal.Constants;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import kotlin.UByte;
/* loaded from: classes5.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f69177a = "Exif\u0000\u0000".getBytes(Charset.forName(Constants.DEFAULT_ENCODING));

    /* renamed from: b */
    public static final int[] f69178b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes5.dex */
    public interface Reader {

        /* loaded from: classes5.dex */
        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo53056a() throws IOException;

        /* renamed from: b */
        int mo53055b(byte[] bArr, int i) throws IOException;

        /* renamed from: c */
        short mo53054c() throws IOException;

        long skip(long j) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    /* loaded from: classes5.dex */
    public static final class C17134a implements Reader {

        /* renamed from: a */
        public final ByteBuffer f69179a;

        public C17134a(ByteBuffer byteBuffer) {
            this.f69179a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo53056a() throws Reader.EndOfFileException {
            return (mo53054c() << 8) | mo53054c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo53055b(byte[] bArr, int i) {
            int min = Math.min(i, this.f69179a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f69179a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo53054c() throws Reader.EndOfFileException {
            if (this.f69179a.remaining() >= 1) {
                return (short) (this.f69179a.get() & UByte.MAX_VALUE);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j) {
            int min = (int) Math.min(this.f69179a.remaining(), j);
            ByteBuffer byteBuffer = this.f69179a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    /* loaded from: classes5.dex */
    public static final class C17135b {

        /* renamed from: a */
        public final ByteBuffer f69180a;

        public C17135b(byte[] bArr, int i) {
            this.f69180a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public short m53061a(int i) {
            if (m53059c(i, 2)) {
                return this.f69180a.getShort(i);
            }
            return (short) -1;
        }

        /* renamed from: b */
        public int m53060b(int i) {
            if (m53059c(i, 4)) {
                return this.f69180a.getInt(i);
            }
            return -1;
        }

        /* renamed from: c */
        public final boolean m53059c(int i, int i2) {
            return this.f69180a.remaining() - i >= i2;
        }

        /* renamed from: d */
        public int m53058d() {
            return this.f69180a.remaining();
        }

        /* renamed from: e */
        public void m53057e(ByteOrder byteOrder) {
            this.f69180a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    /* loaded from: classes5.dex */
    public static final class C17136c implements Reader {

        /* renamed from: a */
        public final InputStream f69181a;

        public C17136c(InputStream inputStream) {
            this.f69181a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo53056a() throws IOException {
            return (mo53054c() << 8) | mo53054c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo53055b(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f69181a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo53054c() throws IOException {
            int read = this.f69181a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f69181a.skip(j2);
                if (skip <= 0) {
                    if (this.f69181a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    /* renamed from: e */
    public static int m53070e(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: h */
    public static boolean m53067h(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: k */
    public static int m53064k(C17135b c17135b) {
        ByteOrder byteOrder;
        short m53061a = c17135b.m53061a(6);
        if (m53061a != 18761) {
            if (m53061a != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) m53061a));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        c17135b.m53057e(byteOrder);
        int m53060b = c17135b.m53060b(10) + 6;
        short m53061a2 = c17135b.m53061a(m53060b);
        for (int i = 0; i < m53061a2; i++) {
            int m53070e = m53070e(m53060b, i);
            short m53061a3 = c17135b.m53061a(m53070e);
            if (m53061a3 == 274) {
                short m53061a4 = c17135b.m53061a(m53070e + 2);
                if (m53061a4 >= 1 && m53061a4 <= 12) {
                    int m53060b2 = c17135b.m53060b(m53070e + 4);
                    if (m53060b2 < 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=" + ((int) m53061a3) + " formatCode=" + ((int) m53061a4) + " componentCount=" + m53060b2);
                        }
                        int i2 = m53060b2 + f69178b[m53061a4];
                        if (i2 > 4) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) m53061a4));
                            }
                        } else {
                            int i3 = m53070e + 8;
                            if (i3 >= 0 && i3 <= c17135b.m53058d()) {
                                if (i2 >= 0 && i2 + i3 <= c17135b.m53058d()) {
                                    return c17135b.m53061a(i3);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) m53061a3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) m53061a3));
                            }
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) m53061a4));
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public int mo53074a(InputStream inputStream, InterfaceC28820to interfaceC28820to) throws IOException {
        return m53069f(new C17136c((InputStream) C52865zZ3.m1111d(inputStream)), (InterfaceC28820to) C52865zZ3.m1111d(interfaceC28820to));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo53073b(InputStream inputStream) throws IOException {
        return m53068g(new C17136c((InputStream) C52865zZ3.m1111d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo53072c(ByteBuffer byteBuffer) throws IOException {
        return m53068g(new C17134a((ByteBuffer) C52865zZ3.m1111d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public int mo53071d(ByteBuffer byteBuffer, InterfaceC28820to interfaceC28820to) throws IOException {
        return m53069f(new C17134a((ByteBuffer) C52865zZ3.m1111d(byteBuffer)), (InterfaceC28820to) C52865zZ3.m1111d(interfaceC28820to));
    }

    /* renamed from: f */
    public final int m53069f(Reader reader, InterfaceC28820to interfaceC28820to) throws IOException {
        try {
            int mo53056a = reader.mo53056a();
            if (!m53067h(mo53056a)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + mo53056a);
                }
                return -1;
            }
            int m53065j = m53065j(reader);
            if (m53065j == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) interfaceC28820to.mo11761c(m53065j, byte[].class);
            int m53063l = m53063l(reader, bArr, m53065j);
            interfaceC28820to.put(bArr);
            return m53063l;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    /* renamed from: g */
    public final ImageHeaderParser.ImageType m53068g(Reader reader) throws IOException {
        try {
            int mo53056a = reader.mo53056a();
            if (mo53056a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int mo53054c = (mo53056a << 8) | reader.mo53054c();
            if (mo53054c == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int mo53054c2 = (mo53054c << 8) | reader.mo53054c();
            if (mo53054c2 == -1991225785) {
                reader.skip(21L);
                try {
                    if (reader.mo53054c() >= 3) {
                        return ImageHeaderParser.ImageType.PNG_A;
                    }
                    return ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (mo53054c2 != 1380533830) {
                if (m53062m(reader, mo53054c2)) {
                    return ImageHeaderParser.ImageType.AVIF;
                }
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                reader.skip(4L);
                if (((reader.mo53056a() << 16) | reader.mo53056a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int mo53056a2 = (reader.mo53056a() << 16) | reader.mo53056a();
                if ((mo53056a2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = mo53056a2 & KotlinVersion.MAX_COMPONENT_VALUE;
                if (i == 88) {
                    reader.skip(4L);
                    short mo53054c3 = reader.mo53054c();
                    if ((mo53054c3 & 2) != 0) {
                        return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                    }
                    if ((mo53054c3 & 16) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else if (i == 76) {
                    reader.skip(4L);
                    if ((reader.mo53054c() & 8) != 0) {
                        return ImageHeaderParser.ImageType.WEBP_A;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: i */
    public final boolean m53066i(byte[] bArr, int i) {
        boolean z;
        if (bArr != null && i > f69177a.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f69177a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: j */
    public final int m53065j(Reader reader) throws IOException {
        short mo53054c;
        short mo53054c2;
        int mo53056a;
        long j;
        long skip;
        do {
            if (reader.mo53054c() != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) mo53054c));
                }
                return -1;
            }
            mo53054c2 = reader.mo53054c();
            if (mo53054c2 == 218) {
                return -1;
            }
            if (mo53054c2 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            mo53056a = reader.mo53056a() - 2;
            if (mo53054c2 != 225) {
                j = mo53056a;
                skip = reader.skip(j);
            } else {
                return mo53056a;
            }
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) mo53054c2) + ", wanted to skip: " + mo53056a + ", but actually skipped: " + skip);
        }
        return -1;
    }

    /* renamed from: l */
    public final int m53063l(Reader reader, byte[] bArr, int i) throws IOException {
        int mo53055b = reader.mo53055b(bArr, i);
        if (mo53055b != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + mo53055b);
            }
            return -1;
        } else if (m53066i(bArr, i)) {
            return m53064k(new C17135b(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    /* renamed from: m */
    public final boolean m53062m(Reader reader, int i) throws IOException {
        if (((reader.mo53056a() << 16) | reader.mo53056a()) != 1718909296) {
            return false;
        }
        int mo53056a = (reader.mo53056a() << 16) | reader.mo53056a();
        if (mo53056a == 1635150182 || mo53056a == 1635150195) {
            return true;
        }
        reader.skip(4L);
        int i2 = i - 16;
        if (i2 % 4 != 0) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && i2 > 0) {
            int mo53056a2 = (reader.mo53056a() << 16) | reader.mo53056a();
            if (mo53056a2 == 1635150182 || mo53056a2 == 1635150195) {
                return true;
            }
            i3++;
            i2 -= 4;
        }
        return false;
    }
}
