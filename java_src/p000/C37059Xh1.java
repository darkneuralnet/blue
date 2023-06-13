package p000;

import android.content.res.AssetManager;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import co.bird.android.model.Detail;
import com.amazonaws.services.p026s3.internal.Constants;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.KotlinVersion;
import kotlin.UByte;
import okhttp3.internal.p056ws.WebSocketProtocol;
import p000.C37527Zh1;
/* renamed from: Xh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37059Xh1 {

    /* renamed from: U */
    public static SimpleDateFormat f43606U;

    /* renamed from: V */
    public static SimpleDateFormat f43607V;

    /* renamed from: Z */
    public static final C9444e[] f43611Z;

    /* renamed from: a0 */
    public static final C9444e[] f43612a0;

    /* renamed from: b0 */
    public static final C9444e[] f43613b0;

    /* renamed from: c0 */
    public static final C9444e[] f43614c0;

    /* renamed from: d0 */
    public static final C9444e[] f43615d0;

    /* renamed from: e0 */
    public static final C9444e f43616e0;

    /* renamed from: f0 */
    public static final C9444e[] f43617f0;

    /* renamed from: g0 */
    public static final C9444e[] f43618g0;

    /* renamed from: h0 */
    public static final C9444e[] f43619h0;

    /* renamed from: i0 */
    public static final C9444e[] f43620i0;

    /* renamed from: j0 */
    public static final C9444e[][] f43621j0;

    /* renamed from: k0 */
    public static final C9444e[] f43622k0;

    /* renamed from: l0 */
    public static final HashMap<Integer, C9444e>[] f43623l0;

    /* renamed from: m0 */
    public static final HashMap<String, C9444e>[] f43624m0;

    /* renamed from: n0 */
    public static final HashSet<String> f43625n0;

    /* renamed from: o0 */
    public static final HashMap<Integer, Integer> f43626o0;

    /* renamed from: p0 */
    public static final Charset f43627p0;

    /* renamed from: q0 */
    public static final byte[] f43628q0;

    /* renamed from: r0 */
    public static final byte[] f43629r0;

    /* renamed from: s0 */
    public static final Pattern f43630s0;

    /* renamed from: t0 */
    public static final Pattern f43631t0;

    /* renamed from: u0 */
    public static final Pattern f43632u0;

    /* renamed from: v0 */
    public static final Pattern f43634v0;

    /* renamed from: a */
    public String f43639a;

    /* renamed from: b */
    public FileDescriptor f43640b;

    /* renamed from: c */
    public AssetManager.AssetInputStream f43641c;

    /* renamed from: d */
    public int f43642d;

    /* renamed from: e */
    public boolean f43643e;

    /* renamed from: f */
    public final HashMap<String, C9443d>[] f43644f;

    /* renamed from: g */
    public Set<Integer> f43645g;

    /* renamed from: h */
    public ByteOrder f43646h;

    /* renamed from: i */
    public boolean f43647i;

    /* renamed from: j */
    public boolean f43648j;

    /* renamed from: k */
    public boolean f43649k;

    /* renamed from: l */
    public int f43650l;

    /* renamed from: m */
    public int f43651m;

    /* renamed from: n */
    public byte[] f43652n;

    /* renamed from: o */
    public int f43653o;

    /* renamed from: p */
    public int f43654p;

    /* renamed from: q */
    public int f43655q;

    /* renamed from: r */
    public int f43656r;

    /* renamed from: s */
    public int f43657s;

    /* renamed from: t */
    public boolean f43658t;

    /* renamed from: u */
    public boolean f43659u;

    /* renamed from: v */
    public static final boolean f43633v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w */
    public static final List<Integer> f43635w = Arrays.asList(1, 6, 3, 8);

    /* renamed from: x */
    public static final List<Integer> f43636x = Arrays.asList(2, 7, 4, 5);

    /* renamed from: y */
    public static final int[] f43637y = {8, 8, 8};

    /* renamed from: z */
    public static final int[] f43638z = {4};

    /* renamed from: A */
    public static final int[] f43586A = {8};

    /* renamed from: B */
    public static final byte[] f43587B = {-1, -40, -1};

    /* renamed from: C */
    public static final byte[] f43588C = {102, 116, 121, 112};

    /* renamed from: D */
    public static final byte[] f43589D = {109, 105, 102, 49};

    /* renamed from: E */
    public static final byte[] f43590E = {104, 101, 105, 99};

    /* renamed from: F */
    public static final byte[] f43591F = {79, 76, 89, 77, 80, 0};

    /* renamed from: G */
    public static final byte[] f43592G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: H */
    public static final byte[] f43593H = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: I */
    public static final byte[] f43594I = {101, 88, 73, 102};

    /* renamed from: J */
    public static final byte[] f43595J = {73, 72, 68, 82};

    /* renamed from: K */
    public static final byte[] f43596K = {73, 69, 78, 68};

    /* renamed from: L */
    public static final byte[] f43597L = {82, 73, 70, 70};

    /* renamed from: M */
    public static final byte[] f43598M = {87, 69, 66, 80};

    /* renamed from: N */
    public static final byte[] f43599N = {69, 88, 73, 70};

    /* renamed from: O */
    public static final byte[] f43600O = {-99, 1, 42};

    /* renamed from: P */
    public static final byte[] f43601P = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: Q */
    public static final byte[] f43602Q = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: R */
    public static final byte[] f43603R = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: S */
    public static final byte[] f43604S = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: T */
    public static final byte[] f43605T = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: W */
    public static final String[] f43608W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: X */
    public static final int[] f43609X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: Y */
    public static final byte[] f43610Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: Xh1$a */
    /* loaded from: classes.dex */
    public class C9440a extends MediaDataSource {

        /* renamed from: b */
        public long f43660b;

        /* renamed from: c */
        public final /* synthetic */ C9446g f43661c;

        public C9440a(C9446g c9446g) {
            this.f43661c = c9446g;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f43660b;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + this.f43661c.available()) {
                        return -1;
                    }
                    this.f43661c.m76603f(j);
                    this.f43660b = j;
                }
                if (i2 > this.f43661c.available()) {
                    i2 = this.f43661c.available();
                }
                int read = this.f43661c.read(bArr, i, i2);
                if (read >= 0) {
                    this.f43660b += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f43660b = -1L;
            return -1;
        }
    }

    /* renamed from: Xh1$b */
    /* loaded from: classes.dex */
    public static class C9441b extends InputStream implements DataInput {

        /* renamed from: f */
        public static final ByteOrder f43663f = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: g */
        public static final ByteOrder f43664g = ByteOrder.BIG_ENDIAN;

        /* renamed from: b */
        public final DataInputStream f43665b;

        /* renamed from: c */
        public ByteOrder f43666c;

        /* renamed from: d */
        public int f43667d;

        /* renamed from: e */
        public byte[] f43668e;

        public C9441b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int m76631a() {
            return this.f43667d;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f43665b.available();
        }

        /* renamed from: b */
        public long m76630b() throws IOException {
            return readInt() & 4294967295L;
        }

        /* renamed from: c */
        public void m76629c(ByteOrder byteOrder) {
            this.f43666c = byteOrder;
        }

        /* renamed from: d */
        public void m76628d(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int skip = (int) this.f43665b.skip(i3);
                if (skip <= 0) {
                    if (this.f43668e == null) {
                        this.f43668e = new byte[8192];
                    }
                    skip = this.f43665b.read(this.f43668e, 0, Math.min(8192, i3));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += skip;
            }
            this.f43667d += i2;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f43667d++;
            return this.f43665b.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f43667d++;
            return this.f43665b.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f43667d++;
            int read = this.f43665b.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f43667d += 2;
            return this.f43665b.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.f43667d += i2;
            this.f43665b.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f43667d += 4;
            int read = this.f43665b.read();
            int read2 = this.f43665b.read();
            int read3 = this.f43665b.read();
            int read4 = this.f43665b.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f43666c;
                if (byteOrder == f43663f) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f43664g) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f43666c);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f43667d += 8;
            int read = this.f43665b.read();
            int read2 = this.f43665b.read();
            int read3 = this.f43665b.read();
            int read4 = this.f43665b.read();
            int read5 = this.f43665b.read();
            int read6 = this.f43665b.read();
            int read7 = this.f43665b.read();
            int read8 = this.f43665b.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f43666c;
                if (byteOrder == f43663f) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f43664g) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.f43666c);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f43667d += 2;
            int read = this.f43665b.read();
            int read2 = this.f43665b.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f43666c;
                if (byteOrder == f43663f) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f43664g) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f43666c);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f43667d += 2;
            return this.f43665b.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f43667d++;
            return this.f43665b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f43667d += 2;
            int read = this.f43665b.read();
            int read2 = this.f43665b.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f43666c;
                if (byteOrder == f43663f) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f43664g) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f43666c);
            }
            throw new EOFException();
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public C9441b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public C9441b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f43666c = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f43665b = dataInputStream;
            dataInputStream.mark(0);
            this.f43667d = 0;
            this.f43666c = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f43665b.read(bArr, i, i2);
            this.f43667d += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f43667d += bArr.length;
            this.f43665b.readFully(bArr);
        }
    }

    /* renamed from: Xh1$c */
    /* loaded from: classes.dex */
    public static class C9442c extends FilterOutputStream {

        /* renamed from: b */
        public final OutputStream f43669b;

        /* renamed from: c */
        public ByteOrder f43670c;

        public C9442c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f43669b = outputStream;
            this.f43670c = byteOrder;
        }

        /* renamed from: a */
        public void m76627a(ByteOrder byteOrder) {
            this.f43670c = byteOrder;
        }

        /* renamed from: b */
        public void m76626b(int i) throws IOException {
            this.f43669b.write(i);
        }

        /* renamed from: c */
        public void m76625c(int i) throws IOException {
            ByteOrder byteOrder = this.f43670c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f43669b.write((i >>> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f43669b.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f43669b.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f43669b.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f43669b.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f43669b.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f43669b.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f43669b.write((i >>> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }

        /* renamed from: d */
        public void m76624d(short s) throws IOException {
            ByteOrder byteOrder = this.f43670c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f43669b.write((s >>> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f43669b.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f43669b.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f43669b.write((s >>> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }

        /* renamed from: f */
        public void m76623f(long j) throws IOException {
            m76625c((int) j);
        }

        /* renamed from: g */
        public void m76622g(int i) throws IOException {
            m76624d((short) i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f43669b.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f43669b.write(bArr, i, i2);
        }
    }

    /* renamed from: Xh1$d */
    /* loaded from: classes.dex */
    public static class C9443d {

        /* renamed from: a */
        public final int f43671a;

        /* renamed from: b */
        public final int f43672b;

        /* renamed from: c */
        public final long f43673c;

        /* renamed from: d */
        public final byte[] f43674d;

        public C9443d(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        /* renamed from: a */
        public static C9443d m76621a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new C9443d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(C37059Xh1.f43627p0);
            return new C9443d(1, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C9443d m76620b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C37059Xh1.f43609X[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d : dArr) {
                wrap.putDouble(d);
            }
            return new C9443d(12, dArr.length, wrap.array());
        }

        /* renamed from: c */
        public static C9443d m76619c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C37059Xh1.f43609X[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putInt(i);
            }
            return new C9443d(9, iArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C9443d m76618d(C9445f[] c9445fArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C37059Xh1.f43609X[10] * c9445fArr.length]);
            wrap.order(byteOrder);
            for (C9445f c9445f : c9445fArr) {
                wrap.putInt((int) c9445f.f43679a);
                wrap.putInt((int) c9445f.f43680b);
            }
            return new C9443d(10, c9445fArr.length, wrap.array());
        }

        /* renamed from: e */
        public static C9443d m76617e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C37059Xh1.f43627p0);
            return new C9443d(2, bytes.length, bytes);
        }

        /* renamed from: f */
        public static C9443d m76616f(long j, ByteOrder byteOrder) {
            return m76615g(new long[]{j}, byteOrder);
        }

        /* renamed from: g */
        public static C9443d m76615g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C37059Xh1.f43609X[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C9443d(4, jArr.length, wrap.array());
        }

        /* renamed from: h */
        public static C9443d m76614h(C9445f c9445f, ByteOrder byteOrder) {
            return m76613i(new C9445f[]{c9445f}, byteOrder);
        }

        /* renamed from: i */
        public static C9443d m76613i(C9445f[] c9445fArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C37059Xh1.f43609X[5] * c9445fArr.length]);
            wrap.order(byteOrder);
            for (C9445f c9445f : c9445fArr) {
                wrap.putInt((int) c9445f.f43679a);
                wrap.putInt((int) c9445f.f43680b);
            }
            return new C9443d(5, c9445fArr.length, wrap.array());
        }

        /* renamed from: j */
        public static C9443d m76612j(int i, ByteOrder byteOrder) {
            return m76611k(new int[]{i}, byteOrder);
        }

        /* renamed from: k */
        public static C9443d m76611k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C37059Xh1.f43609X[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C9443d(3, iArr.length, wrap.array());
        }

        /* renamed from: l */
        public double m76610l(ByteOrder byteOrder) {
            Object m76607o = m76607o(byteOrder);
            if (m76607o != null) {
                if (m76607o instanceof String) {
                    return Double.parseDouble((String) m76607o);
                }
                if (m76607o instanceof long[]) {
                    long[] jArr = (long[]) m76607o;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m76607o instanceof int[]) {
                    int[] iArr = (int[]) m76607o;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m76607o instanceof double[]) {
                    double[] dArr = (double[]) m76607o;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m76607o instanceof C9445f[]) {
                    C9445f[] c9445fArr = (C9445f[]) m76607o;
                    if (c9445fArr.length == 1) {
                        return c9445fArr[0].m76604a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        /* renamed from: m */
        public int m76609m(ByteOrder byteOrder) {
            Object m76607o = m76607o(byteOrder);
            if (m76607o != null) {
                if (m76607o instanceof String) {
                    return Integer.parseInt((String) m76607o);
                }
                if (m76607o instanceof long[]) {
                    long[] jArr = (long[]) m76607o;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m76607o instanceof int[]) {
                    int[] iArr = (int[]) m76607o;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        /* renamed from: n */
        public String m76608n(ByteOrder byteOrder) {
            Object m76607o = m76607o(byteOrder);
            if (m76607o == null) {
                return null;
            }
            if (m76607o instanceof String) {
                return (String) m76607o;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (m76607o instanceof long[]) {
                long[] jArr = (long[]) m76607o;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (m76607o instanceof int[]) {
                int[] iArr = (int[]) m76607o;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (m76607o instanceof double[]) {
                double[] dArr = (double[]) m76607o;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(m76607o instanceof C9445f[])) {
                return null;
            } else {
                C9445f[] c9445fArr = (C9445f[]) m76607o;
                while (i < c9445fArr.length) {
                    sb.append(c9445fArr[i].f43679a);
                    sb.append(JsonPointer.SEPARATOR);
                    sb.append(c9445fArr[i].f43680b);
                    i++;
                    if (i != c9445fArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0198: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:151:0x0198 */
        /* JADX WARN: Removed duplicated region for block: B:182:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object m76607o(ByteOrder byteOrder) {
            C9441b c9441b;
            InputStream inputStream;
            byte b;
            byte b2;
            byte[] bArr;
            InputStream inputStream2 = null;
            try {
                try {
                    c9441b = new C9441b(this.f43674d);
                    try {
                        c9441b.m76629c(byteOrder);
                        int i = 0;
                        boolean z = true;
                        switch (this.f43671a) {
                            case 1:
                            case 6:
                                byte[] bArr2 = this.f43674d;
                                if (bArr2.length == 1 && (b = bArr2[0]) >= 0 && b <= 1) {
                                    String str = new String(new char[]{(char) (b + 48)});
                                    try {
                                        c9441b.close();
                                    } catch (IOException e) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    }
                                    return str;
                                }
                                String str2 = new String(bArr2, C37059Xh1.f43627p0);
                                try {
                                    c9441b.close();
                                } catch (IOException e2) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                }
                                return str2;
                            case 2:
                            case 7:
                                if (this.f43672b >= C37059Xh1.f43610Y.length) {
                                    int i2 = 0;
                                    while (true) {
                                        bArr = C37059Xh1.f43610Y;
                                        if (i2 < bArr.length) {
                                            if (this.f43674d[i2] != bArr[i2]) {
                                                z = false;
                                            } else {
                                                i2++;
                                            }
                                        }
                                    }
                                    if (z) {
                                        i = bArr.length;
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (i < this.f43672b && (b2 = this.f43674d[i]) != 0) {
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    i++;
                                }
                                String sb2 = sb.toString();
                                try {
                                    c9441b.close();
                                } catch (IOException e3) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                }
                                return sb2;
                            case 3:
                                int[] iArr = new int[this.f43672b];
                                while (i < this.f43672b) {
                                    iArr[i] = c9441b.readUnsignedShort();
                                    i++;
                                }
                                try {
                                    c9441b.close();
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                }
                                return iArr;
                            case 4:
                                long[] jArr = new long[this.f43672b];
                                while (i < this.f43672b) {
                                    jArr[i] = c9441b.m76630b();
                                    i++;
                                }
                                try {
                                    c9441b.close();
                                } catch (IOException e5) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                }
                                return jArr;
                            case 5:
                                C9445f[] c9445fArr = new C9445f[this.f43672b];
                                while (i < this.f43672b) {
                                    c9445fArr[i] = new C9445f(c9441b.m76630b(), c9441b.m76630b());
                                    i++;
                                }
                                try {
                                    c9441b.close();
                                } catch (IOException e6) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                }
                                return c9445fArr;
                            case 8:
                                int[] iArr2 = new int[this.f43672b];
                                while (i < this.f43672b) {
                                    iArr2[i] = c9441b.readShort();
                                    i++;
                                }
                                try {
                                    c9441b.close();
                                } catch (IOException e7) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                }
                                return iArr2;
                            case 9:
                                int[] iArr3 = new int[this.f43672b];
                                while (i < this.f43672b) {
                                    iArr3[i] = c9441b.readInt();
                                    i++;
                                }
                                try {
                                    c9441b.close();
                                } catch (IOException e8) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                }
                                return iArr3;
                            case 10:
                                C9445f[] c9445fArr2 = new C9445f[this.f43672b];
                                while (i < this.f43672b) {
                                    c9445fArr2[i] = new C9445f(c9441b.readInt(), c9441b.readInt());
                                    i++;
                                }
                                try {
                                    c9441b.close();
                                } catch (IOException e9) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                }
                                return c9445fArr2;
                            case 11:
                                double[] dArr = new double[this.f43672b];
                                while (i < this.f43672b) {
                                    dArr[i] = c9441b.readFloat();
                                    i++;
                                }
                                try {
                                    c9441b.close();
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                }
                                return dArr;
                            case 12:
                                double[] dArr2 = new double[this.f43672b];
                                while (i < this.f43672b) {
                                    dArr2[i] = c9441b.readDouble();
                                    i++;
                                }
                                try {
                                    c9441b.close();
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                }
                                return dArr2;
                            default:
                                try {
                                    c9441b.close();
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                }
                                return null;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (c9441b != null) {
                            try {
                                c9441b.close();
                            } catch (IOException e14) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e15) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                        }
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                c9441b = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                }
                throw th;
            }
        }

        /* renamed from: p */
        public int m76606p() {
            return C37059Xh1.f43609X[this.f43671a] * this.f43672b;
        }

        public String toString() {
            return "(" + C37059Xh1.f43608W[this.f43671a] + ", data length:" + this.f43674d.length + ")";
        }

        public C9443d(int i, int i2, long j, byte[] bArr) {
            this.f43671a = i;
            this.f43672b = i2;
            this.f43673c = j;
            this.f43674d = bArr;
        }
    }

    /* renamed from: Xh1$f */
    /* loaded from: classes.dex */
    public static class C9445f {

        /* renamed from: a */
        public final long f43679a;

        /* renamed from: b */
        public final long f43680b;

        public C9445f(double d) {
            this((long) (d * 10000.0d), AbstractComponentTracker.LINGERING_TIMEOUT);
        }

        /* renamed from: a */
        public double m76604a() {
            return this.f43679a / this.f43680b;
        }

        public String toString() {
            return this.f43679a + "/" + this.f43680b;
        }

        public C9445f(long j, long j2) {
            if (j2 == 0) {
                this.f43679a = 0L;
                this.f43680b = 1L;
                return;
            }
            this.f43679a = j;
            this.f43680b = j2;
        }
    }

    static {
        C9444e[] c9444eArr;
        C9444e[] c9444eArr2 = {new C9444e("NewSubfileType", 254, 4), new C9444e("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new C9444e("ImageWidth", 256, 3, 4), new C9444e("ImageLength", 257, 3, 4), new C9444e("BitsPerSample", 258, 3), new C9444e("Compression", 259, 3), new C9444e("PhotometricInterpretation", 262, 3), new C9444e("ImageDescription", 270, 2), new C9444e("Make", 271, 2), new C9444e("Model", 272, 2), new C9444e("StripOffsets", 273, 3, 4), new C9444e("Orientation", 274, 3), new C9444e("SamplesPerPixel", 277, 3), new C9444e("RowsPerStrip", 278, 3, 4), new C9444e("StripByteCounts", 279, 3, 4), new C9444e("XResolution", 282, 5), new C9444e("YResolution", 283, 5), new C9444e("PlanarConfiguration", 284, 3), new C9444e("ResolutionUnit", 296, 3), new C9444e("TransferFunction", Constants.BUCKET_REDIRECT_STATUS_CODE, 3), new C9444e("Software", 305, 2), new C9444e("DateTime", 306, 2), new C9444e("Artist", 315, 2), new C9444e("WhitePoint", 318, 5), new C9444e("PrimaryChromaticities", 319, 5), new C9444e("SubIFDPointer", 330, 4), new C9444e("JPEGInterchangeFormat", 513, 4), new C9444e("JPEGInterchangeFormatLength", SyslogConstants.SYSLOG_PORT, 4), new C9444e("YCbCrCoefficients", 529, 5), new C9444e("YCbCrSubSampling", 530, 3), new C9444e("YCbCrPositioning", 531, 3), new C9444e("ReferenceBlackWhite", 532, 5), new C9444e("Copyright", 33432, 2), new C9444e("ExifIFDPointer", 34665, 4), new C9444e("GPSInfoIFDPointer", 34853, 4), new C9444e("SensorTopBorder", 4, 4), new C9444e("SensorLeftBorder", 5, 4), new C9444e("SensorBottomBorder", 6, 4), new C9444e("SensorRightBorder", 7, 4), new C9444e("ISO", 23, 3), new C9444e("JpgFromRaw", 46, 7), new C9444e("Xmp", 700, 1)};
        f43611Z = c9444eArr2;
        C9444e[] c9444eArr3 = {new C9444e("ExposureTime", 33434, 5), new C9444e("FNumber", 33437, 5), new C9444e("ExposureProgram", 34850, 3), new C9444e("SpectralSensitivity", 34852, 2), new C9444e("PhotographicSensitivity", 34855, 3), new C9444e("OECF", 34856, 7), new C9444e("SensitivityType", 34864, 3), new C9444e("StandardOutputSensitivity", 34865, 4), new C9444e("RecommendedExposureIndex", 34866, 4), new C9444e("ISOSpeed", 34867, 4), new C9444e("ISOSpeedLatitudeyyy", 34868, 4), new C9444e("ISOSpeedLatitudezzz", 34869, 4), new C9444e("ExifVersion", 36864, 2), new C9444e("DateTimeOriginal", 36867, 2), new C9444e("DateTimeDigitized", 36868, 2), new C9444e("OffsetTime", 36880, 2), new C9444e("OffsetTimeOriginal", 36881, 2), new C9444e("OffsetTimeDigitized", 36882, 2), new C9444e("ComponentsConfiguration", 37121, 7), new C9444e("CompressedBitsPerPixel", 37122, 5), new C9444e("ShutterSpeedValue", 37377, 10), new C9444e("ApertureValue", 37378, 5), new C9444e("BrightnessValue", 37379, 10), new C9444e("ExposureBiasValue", 37380, 10), new C9444e("MaxApertureValue", 37381, 5), new C9444e("SubjectDistance", 37382, 5), new C9444e("MeteringMode", 37383, 3), new C9444e("LightSource", 37384, 3), new C9444e("Flash", 37385, 3), new C9444e("FocalLength", 37386, 5), new C9444e("SubjectArea", 37396, 3), new C9444e("MakerNote", 37500, 7), new C9444e("UserComment", 37510, 7), new C9444e("SubSecTime", 37520, 2), new C9444e("SubSecTimeOriginal", 37521, 2), new C9444e("SubSecTimeDigitized", 37522, 2), new C9444e("FlashpixVersion", 40960, 7), new C9444e("ColorSpace", 40961, 3), new C9444e("PixelXDimension", 40962, 3, 4), new C9444e("PixelYDimension", 40963, 3, 4), new C9444e("RelatedSoundFile", 40964, 2), new C9444e("InteroperabilityIFDPointer", 40965, 4), new C9444e("FlashEnergy", 41483, 5), new C9444e("SpatialFrequencyResponse", 41484, 7), new C9444e("FocalPlaneXResolution", 41486, 5), new C9444e("FocalPlaneYResolution", 41487, 5), new C9444e("FocalPlaneResolutionUnit", 41488, 3), new C9444e("SubjectLocation", 41492, 3), new C9444e("ExposureIndex", 41493, 5), new C9444e("SensingMethod", 41495, 3), new C9444e("FileSource", 41728, 7), new C9444e("SceneType", 41729, 7), new C9444e("CFAPattern", 41730, 7), new C9444e("CustomRendered", 41985, 3), new C9444e("ExposureMode", 41986, 3), new C9444e("WhiteBalance", 41987, 3), new C9444e("DigitalZoomRatio", 41988, 5), new C9444e("FocalLengthIn35mmFilm", 41989, 3), new C9444e("SceneCaptureType", 41990, 3), new C9444e("GainControl", 41991, 3), new C9444e("Contrast", 41992, 3), new C9444e("Saturation", 41993, 3), new C9444e("Sharpness", 41994, 3), new C9444e("DeviceSettingDescription", 41995, 7), new C9444e("SubjectDistanceRange", 41996, 3), new C9444e("ImageUniqueID", 42016, 2), new C9444e("CameraOwnerName", 42032, 2), new C9444e("BodySerialNumber", 42033, 2), new C9444e("LensSpecification", 42034, 5), new C9444e("LensMake", 42035, 2), new C9444e("LensModel", 42036, 2), new C9444e("Gamma", 42240, 5), new C9444e("DNGVersion", 50706, 1), new C9444e("DefaultCropSize", 50720, 3, 4)};
        f43612a0 = c9444eArr3;
        C9444e[] c9444eArr4 = {new C9444e("GPSVersionID", 0, 1), new C9444e("GPSLatitudeRef", 1, 2), new C9444e("GPSLatitude", 2, 5, 10), new C9444e("GPSLongitudeRef", 3, 2), new C9444e("GPSLongitude", 4, 5, 10), new C9444e("GPSAltitudeRef", 5, 1), new C9444e("GPSAltitude", 6, 5), new C9444e("GPSTimeStamp", 7, 5), new C9444e("GPSSatellites", 8, 2), new C9444e("GPSStatus", 9, 2), new C9444e("GPSMeasureMode", 10, 2), new C9444e("GPSDOP", 11, 5), new C9444e("GPSSpeedRef", 12, 2), new C9444e("GPSSpeed", 13, 5), new C9444e("GPSTrackRef", 14, 2), new C9444e("GPSTrack", 15, 5), new C9444e("GPSImgDirectionRef", 16, 2), new C9444e("GPSImgDirection", 17, 5), new C9444e("GPSMapDatum", 18, 2), new C9444e("GPSDestLatitudeRef", 19, 2), new C9444e("GPSDestLatitude", 20, 5), new C9444e("GPSDestLongitudeRef", 21, 2), new C9444e("GPSDestLongitude", 22, 5), new C9444e("GPSDestBearingRef", 23, 2), new C9444e("GPSDestBearing", 24, 5), new C9444e("GPSDestDistanceRef", 25, 2), new C9444e("GPSDestDistance", 26, 5), new C9444e("GPSProcessingMethod", 27, 7), new C9444e("GPSAreaInformation", 28, 7), new C9444e("GPSDateStamp", 29, 2), new C9444e("GPSDifferential", 30, 3), new C9444e("GPSHPositioningError", 31, 5)};
        f43613b0 = c9444eArr4;
        C9444e[] c9444eArr5 = {new C9444e("InteroperabilityIndex", 1, 2)};
        f43614c0 = c9444eArr5;
        C9444e[] c9444eArr6 = {new C9444e("NewSubfileType", 254, 4), new C9444e("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new C9444e("ThumbnailImageWidth", 256, 3, 4), new C9444e("ThumbnailImageLength", 257, 3, 4), new C9444e("BitsPerSample", 258, 3), new C9444e("Compression", 259, 3), new C9444e("PhotometricInterpretation", 262, 3), new C9444e("ImageDescription", 270, 2), new C9444e("Make", 271, 2), new C9444e("Model", 272, 2), new C9444e("StripOffsets", 273, 3, 4), new C9444e("ThumbnailOrientation", 274, 3), new C9444e("SamplesPerPixel", 277, 3), new C9444e("RowsPerStrip", 278, 3, 4), new C9444e("StripByteCounts", 279, 3, 4), new C9444e("XResolution", 282, 5), new C9444e("YResolution", 283, 5), new C9444e("PlanarConfiguration", 284, 3), new C9444e("ResolutionUnit", 296, 3), new C9444e("TransferFunction", Constants.BUCKET_REDIRECT_STATUS_CODE, 3), new C9444e("Software", 305, 2), new C9444e("DateTime", 306, 2), new C9444e("Artist", 315, 2), new C9444e("WhitePoint", 318, 5), new C9444e("PrimaryChromaticities", 319, 5), new C9444e("SubIFDPointer", 330, 4), new C9444e("JPEGInterchangeFormat", 513, 4), new C9444e("JPEGInterchangeFormatLength", SyslogConstants.SYSLOG_PORT, 4), new C9444e("YCbCrCoefficients", 529, 5), new C9444e("YCbCrSubSampling", 530, 3), new C9444e("YCbCrPositioning", 531, 3), new C9444e("ReferenceBlackWhite", 532, 5), new C9444e("Copyright", 33432, 2), new C9444e("ExifIFDPointer", 34665, 4), new C9444e("GPSInfoIFDPointer", 34853, 4), new C9444e("DNGVersion", 50706, 1), new C9444e("DefaultCropSize", 50720, 3, 4)};
        f43615d0 = c9444eArr6;
        f43616e0 = new C9444e("StripOffsets", 273, 3);
        C9444e[] c9444eArr7 = {new C9444e("ThumbnailImage", 256, 7), new C9444e("CameraSettingsIFDPointer", 8224, 4), new C9444e("ImageProcessingIFDPointer", 8256, 4)};
        f43617f0 = c9444eArr7;
        C9444e[] c9444eArr8 = {new C9444e("PreviewImageStart", 257, 4), new C9444e("PreviewImageLength", 258, 4)};
        f43618g0 = c9444eArr8;
        C9444e[] c9444eArr9 = {new C9444e("AspectFrame", 4371, 3)};
        f43619h0 = c9444eArr9;
        C9444e[] c9444eArr10 = {new C9444e("ColorSpace", 55, 3)};
        f43620i0 = c9444eArr10;
        C9444e[][] c9444eArr11 = {c9444eArr2, c9444eArr3, c9444eArr4, c9444eArr5, c9444eArr6, c9444eArr2, c9444eArr7, c9444eArr8, c9444eArr9, c9444eArr10};
        f43621j0 = c9444eArr11;
        f43622k0 = new C9444e[]{new C9444e("SubIFDPointer", 330, 4), new C9444e("ExifIFDPointer", 34665, 4), new C9444e("GPSInfoIFDPointer", 34853, 4), new C9444e("InteroperabilityIFDPointer", 40965, 4), new C9444e("CameraSettingsIFDPointer", 8224, 1), new C9444e("ImageProcessingIFDPointer", 8256, 1)};
        f43623l0 = new HashMap[c9444eArr11.length];
        f43624m0 = new HashMap[c9444eArr11.length];
        f43625n0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f43626o0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f43627p0 = forName;
        f43628q0 = "Exif\u0000\u0000".getBytes(forName);
        f43629r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f43606U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f43607V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C9444e[][] c9444eArr12 = f43621j0;
            if (i < c9444eArr12.length) {
                f43623l0[i] = new HashMap<>();
                f43624m0[i] = new HashMap<>();
                for (C9444e c9444e : c9444eArr12[i]) {
                    f43623l0[i].put(Integer.valueOf(c9444e.f43675a), c9444e);
                    f43624m0[i].put(c9444e.f43676b, c9444e);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f43626o0;
                C9444e[] c9444eArr13 = f43622k0;
                hashMap.put(Integer.valueOf(c9444eArr13[0].f43675a), 5);
                hashMap.put(Integer.valueOf(c9444eArr13[1].f43675a), 1);
                hashMap.put(Integer.valueOf(c9444eArr13[2].f43675a), 2);
                hashMap.put(Integer.valueOf(c9444eArr13[3].f43675a), 3);
                hashMap.put(Integer.valueOf(c9444eArr13[4].f43675a), 7);
                hashMap.put(Integer.valueOf(c9444eArr13[5].f43675a), 8);
                f43630s0 = Pattern.compile(".*[1-9].*");
                f43631t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f43632u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f43634v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public C37059Xh1(String str) throws IOException {
        C9444e[][] c9444eArr = f43621j0;
        this.f43644f = new HashMap[c9444eArr.length];
        this.f43645g = new HashSet(c9444eArr.length);
        this.f43646h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            m76693A(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    /* renamed from: B */
    public static boolean m76692B(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f43628q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f43628q0;
            if (i < bArr3.length) {
                if (bArr2[i] != bArr3[i]) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: D */
    public static boolean m76690D(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f43587B;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: I */
    public static boolean m76685I(FileDescriptor fileDescriptor) {
        try {
            C37527Zh1.C10332a.m72669c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (f43633v) {
                Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                return false;
            }
            return false;
        }
    }

    /* renamed from: K */
    public static boolean m76683K(int i) {
        return i == 4 || i == 13 || i == 14;
    }

    /* renamed from: c */
    public static double m76663c(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble;
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: f0 */
    public static boolean m76656f0(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    /* renamed from: x */
    public static Pair<Integer, Integer> m76634x(String str) {
        int intValue;
        int i;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> m76634x = m76634x(split[0]);
            if (((Integer) m76634x.first).intValue() == 2) {
                return m76634x;
            }
            for (int i2 = 1; i2 < split.length; i2++) {
                Pair<Integer, Integer> m76634x2 = m76634x(split[i2]);
                if (!((Integer) m76634x2.first).equals(m76634x.first) && !((Integer) m76634x2.second).equals(m76634x.first)) {
                    intValue = -1;
                } else {
                    intValue = ((Integer) m76634x.first).intValue();
                }
                if (((Integer) m76634x.second).intValue() != -1 && (((Integer) m76634x2.first).equals(m76634x.second) || ((Integer) m76634x2.second).equals(m76634x.second))) {
                    i = ((Integer) m76634x.second).intValue();
                } else {
                    i = -1;
                }
                if (intValue == -1 && i == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    m76634x = new Pair<>(Integer.valueOf(i), -1);
                } else if (i == -1) {
                    m76634x = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return m76634x;
        } else if (str.contains("/")) {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair<>(2, -1);
        } else {
            try {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    if (valueOf.longValue() >= 0 && valueOf.longValue() <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return new Pair<>(3, 4);
                    }
                    if (valueOf.longValue() < 0) {
                        return new Pair<>(9, -1);
                    }
                    return new Pair<>(4, -1);
                } catch (NumberFormatException unused2) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused3) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
    }

    /* renamed from: A */
    public final void m76693A(String str) throws IOException {
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f43641c = null;
            this.f43639a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (m76685I(fileInputStream2.getFD())) {
                        this.f43640b = fileInputStream2.getFD();
                    } else {
                        this.f43640b = null;
                    }
                    m76680N(fileInputStream2);
                    C37527Zh1.m72676c(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    C37527Zh1.m72676c(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    /* renamed from: C */
    public final boolean m76691C(byte[] bArr) throws IOException {
        C9441b c9441b;
        long readInt;
        byte[] bArr2;
        long j;
        C9441b c9441b2 = null;
        try {
            try {
                c9441b = new C9441b(bArr);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = c9441b.readInt();
            bArr2 = new byte[4];
            c9441b.read(bArr2);
        } catch (Exception e2) {
            e = e2;
            c9441b2 = c9441b;
            if (f43633v) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (c9441b2 != null) {
                c9441b2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            c9441b2 = c9441b;
            if (c9441b2 != null) {
                c9441b2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, f43588C)) {
            c9441b.close();
            return false;
        }
        if (readInt == 1) {
            readInt = c9441b.readLong();
            j = 16;
            if (readInt < 16) {
                c9441b.close();
                return false;
            }
        } else {
            j = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j2 = readInt - j;
        if (j2 < 8) {
            c9441b.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z = false;
        boolean z2 = false;
        for (long j3 = 0; j3 < j2 / 4; j3++) {
            if (c9441b.read(bArr3) != 4) {
                c9441b.close();
                return false;
            }
            if (j3 != 1) {
                if (Arrays.equals(bArr3, f43589D)) {
                    z = true;
                } else if (Arrays.equals(bArr3, f43590E)) {
                    z2 = true;
                }
                if (z && z2) {
                    c9441b.close();
                    return true;
                }
            }
        }
        c9441b.close();
        return false;
    }

    /* renamed from: E */
    public final boolean m76689E(byte[] bArr) throws IOException {
        boolean z = false;
        C9441b c9441b = null;
        try {
            C9441b c9441b2 = new C9441b(bArr);
            try {
                ByteOrder m76677Q = m76677Q(c9441b2);
                this.f43646h = m76677Q;
                c9441b2.m76629c(m76677Q);
                short readShort = c9441b2.readShort();
                z = (readShort == 20306 || readShort == 21330) ? true : true;
                c9441b2.close();
                return z;
            } catch (Exception unused) {
                c9441b = c9441b2;
                if (c9441b != null) {
                    c9441b.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                c9441b = c9441b2;
                if (c9441b != null) {
                    c9441b.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: F */
    public final boolean m76688F(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f43593H;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    /* renamed from: G */
    public final boolean m76687G(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public final boolean m76686H(byte[] bArr) throws IOException {
        boolean z = false;
        C9441b c9441b = null;
        try {
            C9441b c9441b2 = new C9441b(bArr);
            try {
                ByteOrder m76677Q = m76677Q(c9441b2);
                this.f43646h = m76677Q;
                c9441b2.m76629c(m76677Q);
                if (c9441b2.readShort() == 85) {
                    z = true;
                }
                c9441b2.close();
                return z;
            } catch (Exception unused) {
                c9441b = c9441b2;
                if (c9441b != null) {
                    c9441b.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                c9441b = c9441b2;
                if (c9441b != null) {
                    c9441b.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: J */
    public final boolean m76684J(HashMap hashMap) throws IOException {
        C9443d c9443d;
        int m76609m;
        C9443d c9443d2 = (C9443d) hashMap.get("BitsPerSample");
        if (c9443d2 != null) {
            int[] iArr = (int[]) c9443d2.m76607o(this.f43646h);
            int[] iArr2 = f43637y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f43642d == 3 && (c9443d = (C9443d) hashMap.get("PhotometricInterpretation")) != null && (((m76609m = c9443d.m76609m(this.f43646h)) == 1 && Arrays.equals(iArr, f43586A)) || (m76609m == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (f43633v) {
            Log.d("ExifInterface", "Unsupported data type value");
            return false;
        }
        return false;
    }

    /* renamed from: L */
    public final boolean m76682L(HashMap hashMap) throws IOException {
        C9443d c9443d = (C9443d) hashMap.get("ImageLength");
        C9443d c9443d2 = (C9443d) hashMap.get("ImageWidth");
        if (c9443d != null && c9443d2 != null) {
            int m76609m = c9443d.m76609m(this.f43646h);
            int m76609m2 = c9443d2.m76609m(this.f43646h);
            if (m76609m <= 512 && m76609m2 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: M */
    public final boolean m76681M(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f43597L;
            if (i < bArr2.length) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            } else {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f43598M;
                    if (i2 < bArr3.length) {
                        if (bArr[f43597L.length + i2 + 4] != bArr3[i2]) {
                            return false;
                        }
                        i2++;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    /* renamed from: N */
    public final void m76680N(InputStream inputStream) {
        boolean z;
        if (inputStream != null) {
            for (int i = 0; i < f43621j0.length; i++) {
                try {
                    try {
                        this.f43644f[i] = new HashMap<>();
                    } finally {
                        m76667a();
                        if (f43633v) {
                            m76678P();
                        }
                    }
                } catch (IOException | UnsupportedOperationException e) {
                    boolean z2 = f43633v;
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    m76667a();
                    if (!z2) {
                        return;
                    }
                }
            }
            if (!this.f43643e) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                this.f43642d = m76644n(bufferedInputStream);
                inputStream = bufferedInputStream;
            }
            if (m76656f0(this.f43642d)) {
                C9446g c9446g = new C9446g(inputStream);
                if (this.f43643e) {
                    m76638t(c9446g);
                } else {
                    int i2 = this.f43642d;
                    if (i2 == 12) {
                        m76647k(c9446g);
                    } else if (i2 == 7) {
                        m76643o(c9446g);
                    } else if (i2 == 10) {
                        m76639s(c9446g);
                    } else {
                        m76640r(c9446g);
                    }
                }
                c9446g.m76603f(this.f43654p);
                m76658e0(c9446g);
            } else {
                C9441b c9441b = new C9441b(inputStream);
                int i3 = this.f43642d;
                if (i3 == 4) {
                    m76646l(c9441b, 0, 0);
                } else if (i3 == 13) {
                    m76642p(c9441b);
                } else if (i3 == 9) {
                    m76641q(c9441b);
                } else if (i3 == 14) {
                    m76635w(c9441b);
                }
            }
            if (!z) {
                return;
            }
            return;
        }
        throw new NullPointerException("inputstream shouldn't be null");
    }

    /* renamed from: O */
    public final void m76679O(C9441b c9441b) throws IOException {
        ByteOrder m76677Q = m76677Q(c9441b);
        this.f43646h = m76677Q;
        c9441b.m76629c(m76677Q);
        int readUnsignedShort = c9441b.readUnsignedShort();
        int i = this.f43642d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c9441b.readInt();
        if (readInt >= 8) {
            int i2 = readInt - 8;
            if (i2 > 0) {
                c9441b.m76628d(i2);
                return;
            }
            return;
        }
        throw new IOException("Invalid first Ifd offset: " + readInt);
    }

    /* renamed from: P */
    public final void m76678P() {
        for (int i = 0; i < this.f43644f.length; i++) {
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + this.f43644f[i].size());
            for (Map.Entry<String, C9443d> entry : this.f43644f[i].entrySet()) {
                C9443d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.m76608n(this.f43646h) + "'");
            }
        }
    }

    /* renamed from: Q */
    public final ByteOrder m76677Q(C9441b c9441b) throws IOException {
        short readShort = c9441b.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (f43633v) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (f43633v) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    /* renamed from: R */
    public final void m76676R(byte[] bArr, int i) throws IOException {
        C9446g c9446g = new C9446g(bArr);
        m76679O(c9446g);
        m76675S(c9446g, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0282  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m76675S(C9446g c9446g, int i) throws IOException {
        String str;
        short s;
        int[] iArr;
        long j;
        boolean z;
        short s2;
        long j2;
        String str2;
        int i2;
        String str3;
        int readUnsignedShort;
        long j3;
        String str4;
        this.f43645g.add(Integer.valueOf(c9446g.f43667d));
        short readShort = c9446g.readShort();
        String str5 = "ExifInterface";
        if (f43633v) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        char c = 0;
        short s3 = 0;
        while (s3 < readShort) {
            int readUnsignedShort2 = c9446g.readUnsignedShort();
            int readUnsignedShort3 = c9446g.readUnsignedShort();
            int readInt = c9446g.readInt();
            long m76631a = c9446g.m76631a() + 4;
            C9444e c9444e = f43623l0[i].get(Integer.valueOf(readUnsignedShort2));
            boolean z2 = f43633v;
            if (z2) {
                Object[] objArr = new Object[5];
                objArr[c] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(readUnsignedShort2);
                if (c9444e != null) {
                    str4 = c9444e.f43676b;
                } else {
                    str4 = null;
                }
                objArr[2] = str4;
                objArr[3] = Integer.valueOf(readUnsignedShort3);
                objArr[4] = Integer.valueOf(readInt);
                Log.d(str5, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr));
            }
            if (c9444e == null) {
                if (z2) {
                    Log.d(str5, "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
                }
            } else {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f43609X.length) {
                        if (!c9444e.m76605a(readUnsignedShort3)) {
                            if (z2) {
                                Log.d(str5, "Skip the tag entry since data format (" + f43608W[readUnsignedShort3] + ") is unexpected for tag: " + c9444e.f43676b);
                            }
                        } else {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = c9444e.f43677c;
                            }
                            str = str5;
                            s = s3;
                            j = readInt * iArr[readUnsignedShort3];
                            if (j >= 0 && j <= 2147483647L) {
                                z = true;
                                if (z) {
                                }
                                s3 = (short) (s + 1);
                                str5 = str3;
                                readShort = s2;
                                c = 0;
                            } else {
                                if (z2) {
                                    Log.d(str, "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z = false;
                                if (z) {
                                    c9446g.m76603f(m76631a);
                                    s2 = readShort;
                                    str3 = str;
                                } else {
                                    if (j > 4) {
                                        int readInt2 = c9446g.readInt();
                                        s2 = readShort;
                                        if (z2) {
                                            StringBuilder sb = new StringBuilder();
                                            j2 = m76631a;
                                            sb.append("seek to data offset: ");
                                            sb.append(readInt2);
                                            Log.d(str, sb.toString());
                                        } else {
                                            j2 = m76631a;
                                        }
                                        if (this.f43642d == 7) {
                                            if ("MakerNote".equals(c9444e.f43676b)) {
                                                this.f43655q = readInt2;
                                            } else if (i == 6 && "ThumbnailImage".equals(c9444e.f43676b)) {
                                                this.f43656r = readInt2;
                                                this.f43657s = readInt;
                                                C9443d m76612j = C9443d.m76612j(6, this.f43646h);
                                                i2 = readInt;
                                                C9443d m76616f = C9443d.m76616f(this.f43656r, this.f43646h);
                                                str2 = str;
                                                C9443d m76616f2 = C9443d.m76616f(this.f43657s, this.f43646h);
                                                this.f43644f[4].put("Compression", m76612j);
                                                this.f43644f[4].put("JPEGInterchangeFormat", m76616f);
                                                this.f43644f[4].put("JPEGInterchangeFormatLength", m76616f2);
                                                c9446g.m76603f(readInt2);
                                            }
                                        }
                                        str2 = str;
                                        i2 = readInt;
                                        c9446g.m76603f(readInt2);
                                    } else {
                                        s2 = readShort;
                                        j2 = m76631a;
                                        str2 = str;
                                        i2 = readInt;
                                    }
                                    Integer num = f43626o0.get(Integer.valueOf(readUnsignedShort2));
                                    if (z2) {
                                        str3 = str2;
                                        Log.d(str3, "nextIfdType: " + num + " byteCount: " + j);
                                    } else {
                                        str3 = str2;
                                    }
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 != 4) {
                                                if (readUnsignedShort3 != 8) {
                                                    if (readUnsignedShort3 != 9 && readUnsignedShort3 != 13) {
                                                        j3 = -1;
                                                    } else {
                                                        readUnsignedShort = c9446g.readInt();
                                                    }
                                                } else {
                                                    readUnsignedShort = c9446g.readShort();
                                                }
                                            } else {
                                                j3 = c9446g.m76630b();
                                            }
                                            if (z2) {
                                                Log.d(str3, String.format("Offset: %d, tagName: %s", Long.valueOf(j3), c9444e.f43676b));
                                            }
                                            if (j3 <= 0) {
                                                if (!this.f43645g.contains(Integer.valueOf((int) j3))) {
                                                    c9446g.m76603f(j3);
                                                    m76675S(c9446g, num.intValue());
                                                } else if (z2) {
                                                    Log.d(str3, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j3 + ")");
                                                }
                                            } else if (z2) {
                                                Log.d(str3, "Skip jump into the IFD since its offset is invalid: " + j3);
                                            }
                                            c9446g.m76603f(j2);
                                        } else {
                                            readUnsignedShort = c9446g.readUnsignedShort();
                                        }
                                        j3 = readUnsignedShort;
                                        if (z2) {
                                        }
                                        if (j3 <= 0) {
                                        }
                                        c9446g.m76603f(j2);
                                    } else {
                                        long j4 = j2;
                                        byte[] bArr = new byte[(int) j];
                                        c9446g.readFully(bArr);
                                        C9443d c9443d = new C9443d(readUnsignedShort3, i2, c9446g.m76631a() + this.f43654p, bArr);
                                        this.f43644f[i].put(c9444e.f43676b, c9443d);
                                        if ("DNGVersion".equals(c9444e.f43676b)) {
                                            this.f43642d = 3;
                                        }
                                        if ((("Make".equals(c9444e.f43676b) || "Model".equals(c9444e.f43676b)) && c9443d.m76608n(this.f43646h).contains("PENTAX")) || ("Compression".equals(c9444e.f43676b) && c9443d.m76609m(this.f43646h) == 65535)) {
                                            this.f43642d = 8;
                                        }
                                        if (c9446g.m76631a() != j4) {
                                            c9446g.m76603f(j4);
                                        }
                                    }
                                }
                                s3 = (short) (s + 1);
                                str5 = str3;
                                readShort = s2;
                                c = 0;
                            }
                        }
                    }
                }
                str = str5;
                s = s3;
                if (z2) {
                    Log.d(str, "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j = 0;
                z = false;
                if (z) {
                }
                s3 = (short) (s + 1);
                str5 = str3;
                readShort = s2;
                c = 0;
            }
            str = str5;
            s = s3;
            j = 0;
            z = false;
            if (z) {
            }
            s3 = (short) (s + 1);
            str5 = str3;
            readShort = s2;
            c = 0;
        }
        String str6 = str5;
        int readInt3 = c9446g.readInt();
        boolean z3 = f43633v;
        if (z3) {
            Log.d(str6, String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j5 = readInt3;
        if (j5 > 0) {
            if (!this.f43645g.contains(Integer.valueOf(readInt3))) {
                c9446g.m76603f(j5);
                if (this.f43644f[4].isEmpty()) {
                    m76675S(c9446g, 4);
                } else if (this.f43644f[5].isEmpty()) {
                    m76675S(c9446g, 5);
                }
            } else if (z3) {
                Log.d(str6, "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
            }
        } else if (z3) {
            Log.d(str6, "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
        }
    }

    /* renamed from: T */
    public final void m76674T(String str) {
        for (int i = 0; i < f43621j0.length; i++) {
            this.f43644f[i].remove(str);
        }
    }

    /* renamed from: U */
    public final void m76673U(int i, String str, String str2) {
        if (!this.f43644f[i].isEmpty() && this.f43644f[i].get(str) != null) {
            HashMap<String, C9443d> hashMap = this.f43644f[i];
            hashMap.put(str2, hashMap.get(str));
            this.f43644f[i].remove(str);
        }
    }

    /* renamed from: V */
    public final void m76672V(C9446g c9446g, int i) throws IOException {
        C9443d c9443d = this.f43644f[i].get("ImageLength");
        C9443d c9443d2 = this.f43644f[i].get("ImageWidth");
        if (c9443d == null || c9443d2 == null) {
            C9443d c9443d3 = this.f43644f[i].get("JPEGInterchangeFormat");
            C9443d c9443d4 = this.f43644f[i].get("JPEGInterchangeFormatLength");
            if (c9443d3 != null && c9443d4 != null) {
                int m76609m = c9443d3.m76609m(this.f43646h);
                int m76609m2 = c9443d3.m76609m(this.f43646h);
                c9446g.m76603f(m76609m);
                byte[] bArr = new byte[m76609m2];
                c9446g.read(bArr);
                m76646l(new C9441b(bArr), m76609m, i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4 A[Catch: all -> 0x010c, Exception -> 0x010e, TryCatch #20 {Exception -> 0x010e, all -> 0x010c, blocks: (B:62:0x00e0, B:64:0x00e4, B:66:0x00fa, B:65:0x00f3), top: B:122:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3 A[Catch: all -> 0x010c, Exception -> 0x010e, TryCatch #20 {Exception -> 0x010e, all -> 0x010c, blocks: (B:62:0x00e0, B:64:0x00e4, B:66:0x00fa, B:65:0x00f3), top: B:122:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0145  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m76671W() throws IOException {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        Closeable closeable;
        FileOutputStream fileOutputStream2;
        Exception exc;
        FileOutputStream fileOutputStream3;
        FileInputStream fileInputStream2;
        Exception e;
        FileOutputStream fileOutputStream4;
        FileInputStream fileInputStream3;
        BufferedInputStream bufferedInputStream;
        if (m76683K(this.f43642d)) {
            if (this.f43640b == null && this.f43639a == null) {
                throw new IOException("ExifInterface does not support saving attributes for the current input.");
            }
            if (this.f43647i && this.f43648j && !this.f43649k) {
                throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
            }
            this.f43658t = true;
            this.f43652n = m76637u();
            BufferedInputStream bufferedInputStream2 = null;
            try {
                File createTempFile = File.createTempFile("temp", "tmp");
                if (this.f43639a != null) {
                    fileInputStream = new FileInputStream(this.f43639a);
                } else {
                    C37527Zh1.C10332a.m72669c(this.f43640b, 0L, OsConstants.SEEK_SET);
                    fileInputStream = new FileInputStream(this.f43640b);
                }
                try {
                    fileOutputStream = new FileOutputStream(createTempFile);
                    try {
                        C37527Zh1.m72674e(fileInputStream, fileOutputStream);
                        C37527Zh1.m72676c(fileInputStream);
                        C37527Zh1.m72676c(fileOutputStream);
                        try {
                            try {
                                try {
                                    fileInputStream3 = new FileInputStream(createTempFile);
                                    try {
                                        if (this.f43639a != null) {
                                            fileOutputStream3 = new FileOutputStream(this.f43639a);
                                        } else {
                                            C37527Zh1.C10332a.m72669c(this.f43640b, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream3 = new FileOutputStream(this.f43640b);
                                        }
                                        try {
                                            bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        } catch (Exception e2) {
                                            bufferedInputStream2 = fileInputStream3;
                                            exc = e2;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        fileOutputStream2 = null;
                                        bufferedInputStream2 = fileInputStream3;
                                        exc = e;
                                        fileOutputStream3 = fileOutputStream2;
                                        try {
                                            fileInputStream2 = new FileInputStream(createTempFile);
                                            try {
                                                if (this.f43639a != null) {
                                                    C37527Zh1.C10332a.m72669c(this.f43640b, 0L, OsConstants.SEEK_SET);
                                                    fileOutputStream4 = new FileOutputStream(this.f43640b);
                                                } else {
                                                    fileOutputStream4 = new FileOutputStream(this.f43639a);
                                                }
                                                fileOutputStream3 = fileOutputStream4;
                                                C37527Zh1.m72674e(fileInputStream2, fileOutputStream3);
                                                C37527Zh1.m72676c(fileInputStream2);
                                                C37527Zh1.m72676c(fileOutputStream3);
                                                throw new IOException("Failed to save new file", exc);
                                            } catch (Exception e4) {
                                                e = e4;
                                                try {
                                                    throw new IOException("Failed to save new file. Original file is stored in " + createTempFile.getAbsolutePath(), e);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    bufferedInputStream2 = fileInputStream2;
                                                    C37527Zh1.m72676c(bufferedInputStream2);
                                                    C37527Zh1.m72676c(fileOutputStream3);
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                bufferedInputStream2 = fileInputStream2;
                                                C37527Zh1.m72676c(bufferedInputStream2);
                                                C37527Zh1.m72676c(fileOutputStream3);
                                                throw th;
                                            }
                                        } catch (Exception e5) {
                                            fileInputStream2 = bufferedInputStream2;
                                            e = e5;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            C37527Zh1.m72676c(bufferedInputStream2);
                                            C37527Zh1.m72676c(fileOutputStream3);
                                            throw th;
                                        }
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    fileOutputStream2 = null;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                closeable = null;
                                C37527Zh1.m72676c(bufferedInputStream2);
                                C37527Zh1.m72676c(closeable);
                                if (0 == 0) {
                                    createTempFile.delete();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        try {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream3);
                            try {
                                int i = this.f43642d;
                                if (i == 4) {
                                    m76670X(bufferedInputStream, bufferedOutputStream);
                                } else if (i == 13) {
                                    m76669Y(bufferedInputStream, bufferedOutputStream);
                                } else if (i == 14) {
                                    m76668Z(bufferedInputStream, bufferedOutputStream);
                                }
                                C37527Zh1.m72676c(bufferedInputStream);
                                C37527Zh1.m72676c(bufferedOutputStream);
                                createTempFile.delete();
                                this.f43652n = null;
                            } catch (Exception e7) {
                                exc = e7;
                                bufferedInputStream2 = fileInputStream3;
                                fileInputStream2 = new FileInputStream(createTempFile);
                                if (this.f43639a != null) {
                                }
                                fileOutputStream3 = fileOutputStream4;
                                C37527Zh1.m72674e(fileInputStream2, fileOutputStream3);
                                C37527Zh1.m72676c(fileInputStream2);
                                C37527Zh1.m72676c(fileOutputStream3);
                                throw new IOException("Failed to save new file", exc);
                            }
                        } catch (Exception e8) {
                            bufferedInputStream2 = fileInputStream3;
                            exc = e8;
                        } catch (Throwable th6) {
                            th = th6;
                            closeable = null;
                            bufferedInputStream2 = bufferedInputStream;
                            C37527Zh1.m72676c(bufferedInputStream2);
                            C37527Zh1.m72676c(closeable);
                            if (0 == 0) {
                            }
                            throw th;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        bufferedInputStream2 = fileInputStream;
                        try {
                            throw new IOException("Failed to copy original file to temp file", e);
                        } catch (Throwable th7) {
                            th = th7;
                            C37527Zh1.m72676c(bufferedInputStream2);
                            C37527Zh1.m72676c(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        bufferedInputStream2 = fileInputStream;
                        C37527Zh1.m72676c(bufferedInputStream2);
                        C37527Zh1.m72676c(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    fileOutputStream = null;
                } catch (Throwable th9) {
                    th = th9;
                    fileOutputStream = null;
                }
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = null;
            } catch (Throwable th10) {
                th = th10;
                fileOutputStream = null;
            }
        } else {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
    }

    /* renamed from: X */
    public final void m76670X(InputStream inputStream, OutputStream outputStream) throws IOException {
        C9443d c9443d;
        if (f43633v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        C9441b c9441b = new C9441b(inputStream);
        C9442c c9442c = new C9442c(outputStream, ByteOrder.BIG_ENDIAN);
        if (c9441b.readByte() == -1) {
            c9442c.m76626b(-1);
            if (c9441b.readByte() == -40) {
                c9442c.m76626b(-40);
                if (m76655g("Xmp") != null && this.f43659u) {
                    c9443d = this.f43644f[0].remove("Xmp");
                } else {
                    c9443d = null;
                }
                c9442c.m76626b(-1);
                c9442c.m76626b(-31);
                m76648j0(c9442c);
                if (c9443d != null) {
                    this.f43644f[0].put("Xmp", c9443d);
                }
                byte[] bArr = new byte[4096];
                while (c9441b.readByte() == -1) {
                    byte readByte = c9441b.readByte();
                    if (readByte != -39 && readByte != -38) {
                        if (readByte != -31) {
                            c9442c.m76626b(-1);
                            c9442c.m76626b(readByte);
                            int readUnsignedShort = c9441b.readUnsignedShort();
                            c9442c.m76622g(readUnsignedShort);
                            int i = readUnsignedShort - 2;
                            if (i >= 0) {
                                while (i > 0) {
                                    int read = c9441b.read(bArr, 0, Math.min(i, 4096));
                                    if (read >= 0) {
                                        c9442c.write(bArr, 0, read);
                                        i -= read;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        } else {
                            int readUnsignedShort2 = c9441b.readUnsignedShort() - 2;
                            if (readUnsignedShort2 >= 0) {
                                byte[] bArr2 = new byte[6];
                                if (readUnsignedShort2 >= 6) {
                                    if (c9441b.read(bArr2) == 6) {
                                        if (Arrays.equals(bArr2, f43628q0)) {
                                            c9441b.m76628d(readUnsignedShort2 - 6);
                                        }
                                    } else {
                                        throw new IOException("Invalid exif");
                                    }
                                }
                                c9442c.m76626b(-1);
                                c9442c.m76626b(readByte);
                                c9442c.m76622g(readUnsignedShort2 + 2);
                                if (readUnsignedShort2 >= 6) {
                                    readUnsignedShort2 -= 6;
                                    c9442c.write(bArr2);
                                }
                                while (readUnsignedShort2 > 0) {
                                    int read2 = c9441b.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                    if (read2 >= 0) {
                                        c9442c.write(bArr, 0, read2);
                                        readUnsignedShort2 -= read2;
                                    }
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        c9442c.m76626b(-1);
                        c9442c.m76626b(readByte);
                        C37527Zh1.m72674e(c9441b, c9442c);
                        return;
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    /* renamed from: Y */
    public final void m76669Y(InputStream inputStream, OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f43633v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        C9441b c9441b = new C9441b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C9442c c9442c = new C9442c(outputStream, byteOrder);
        byte[] bArr = f43593H;
        C37527Zh1.m72673f(c9441b, c9442c, bArr.length);
        int i = this.f43654p;
        if (i == 0) {
            int readInt = c9441b.readInt();
            c9442c.m76625c(readInt);
            C37527Zh1.m72673f(c9441b, c9442c, readInt + 4 + 4);
        } else {
            C37527Zh1.m72673f(c9441b, c9442c, ((i - bArr.length) - 4) - 4);
            c9441b.m76628d(c9441b.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            C9442c c9442c2 = new C9442c(byteArrayOutputStream, byteOrder);
            m76648j0(c9442c2);
            byte[] byteArray = ((ByteArrayOutputStream) c9442c2.f43669b).toByteArray();
            c9442c.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            c9442c.m76625c((int) crc32.getValue());
            C37527Zh1.m72676c(byteArrayOutputStream);
            C37527Zh1.m72674e(c9441b, c9442c);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            C37527Zh1.m72676c(byteArrayOutputStream2);
            throw th;
        }
    }

    /* renamed from: Z */
    public final void m76668Z(InputStream inputStream, OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (f43633v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C9441b c9441b = new C9441b(inputStream, byteOrder);
        C9442c c9442c = new C9442c(outputStream, byteOrder);
        byte[] bArr = f43597L;
        C37527Zh1.m72673f(c9441b, c9442c, bArr.length);
        byte[] bArr2 = f43598M;
        c9441b.m76628d(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            C9442c c9442c2 = new C9442c(byteArrayOutputStream, byteOrder);
            int i6 = this.f43654p;
            if (i6 != 0) {
                C37527Zh1.m72673f(c9441b, c9442c2, ((i6 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                c9441b.m76628d(4);
                int readInt = c9441b.readInt();
                if (readInt % 2 != 0) {
                    readInt++;
                }
                c9441b.m76628d(readInt);
                m76648j0(c9442c2);
            } else {
                byte[] bArr3 = new byte[4];
                if (c9441b.read(bArr3) == 4) {
                    byte[] bArr4 = f43601P;
                    boolean z = false;
                    boolean z2 = true;
                    if (Arrays.equals(bArr3, bArr4)) {
                        int readInt2 = c9441b.readInt();
                        if (readInt2 % 2 == 1) {
                            i5 = readInt2 + 1;
                        } else {
                            i5 = readInt2;
                        }
                        byte[] bArr5 = new byte[i5];
                        c9441b.read(bArr5);
                        byte b = (byte) (8 | bArr5[0]);
                        bArr5[0] = b;
                        if (((b >> 1) & 1) == 1) {
                            z = true;
                        }
                        c9442c2.write(bArr4);
                        c9442c2.m76625c(readInt2);
                        c9442c2.write(bArr5);
                        if (z) {
                            m76661d(c9441b, c9442c2, f43604S, null);
                            while (true) {
                                byte[] bArr6 = new byte[4];
                                inputStream.read(bArr6);
                                if (!Arrays.equals(bArr6, f43605T)) {
                                    break;
                                }
                                m76659e(c9441b, c9442c2, bArr6);
                            }
                            m76648j0(c9442c2);
                        } else {
                            m76661d(c9441b, c9442c2, f43603R, f43602Q);
                            m76648j0(c9442c2);
                        }
                    } else {
                        byte[] bArr7 = f43603R;
                        if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f43602Q)) {
                            int readInt3 = c9441b.readInt();
                            if (readInt3 % 2 == 1) {
                                i = readInt3 + 1;
                            } else {
                                i = readInt3;
                            }
                            byte[] bArr8 = new byte[3];
                            if (Arrays.equals(bArr3, bArr7)) {
                                c9441b.read(bArr8);
                                byte[] bArr9 = new byte[3];
                                if (c9441b.read(bArr9) == 3 && Arrays.equals(f43600O, bArr9)) {
                                    i2 = c9441b.readInt();
                                    i -= 10;
                                    i4 = (i2 << 2) >> 18;
                                    i3 = (i2 << 18) >> 18;
                                    z2 = false;
                                } else {
                                    throw new IOException("Encountered error while checking VP8 signature");
                                }
                            } else if (Arrays.equals(bArr3, f43602Q)) {
                                if (c9441b.readByte() == 47) {
                                    i2 = c9441b.readInt();
                                    i3 = (i2 & 16383) + 1;
                                    i4 = ((i2 & 268419072) >>> 14) + 1;
                                    if ((i2 & 268435456) == 0) {
                                        z2 = false;
                                    }
                                    i -= 5;
                                } else {
                                    throw new IOException("Encountered error while checking VP8L signature");
                                }
                            } else {
                                i2 = 0;
                                z2 = false;
                                i3 = 0;
                                i4 = 0;
                            }
                            c9442c2.write(bArr4);
                            c9442c2.m76625c(10);
                            byte[] bArr10 = new byte[10];
                            if (z2) {
                                bArr10[0] = (byte) (bArr10[0] | 16);
                            }
                            bArr10[0] = (byte) (bArr10[0] | 8);
                            int i7 = i3 - 1;
                            int i8 = i4 - 1;
                            bArr10[4] = (byte) i7;
                            bArr10[5] = (byte) (i7 >> 8);
                            bArr10[6] = (byte) (i7 >> 16);
                            bArr10[7] = (byte) i8;
                            bArr10[8] = (byte) (i8 >> 8);
                            bArr10[9] = (byte) (i8 >> 16);
                            c9442c2.write(bArr10);
                            c9442c2.write(bArr3);
                            c9442c2.m76625c(readInt3);
                            if (Arrays.equals(bArr3, bArr7)) {
                                c9442c2.write(bArr8);
                                c9442c2.write(f43600O);
                                c9442c2.m76625c(i2);
                            } else if (Arrays.equals(bArr3, f43602Q)) {
                                c9442c2.write(47);
                                c9442c2.m76625c(i2);
                            }
                            C37527Zh1.m72673f(c9441b, c9442c2, i);
                            m76648j0(c9442c2);
                        }
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                }
            }
            C37527Zh1.m72674e(c9441b, c9442c2);
            int size = byteArrayOutputStream.size();
            byte[] bArr11 = f43598M;
            c9442c.m76625c(size + bArr11.length);
            c9442c.write(bArr11);
            byteArrayOutputStream.writeTo(c9442c);
            C37527Zh1.m72676c(byteArrayOutputStream);
        } catch (Exception e2) {
            e = e2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            C37527Zh1.m72676c(byteArrayOutputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public final void m76667a() {
        String m76655g = m76655g("DateTimeOriginal");
        if (m76655g != null && m76655g("DateTime") == null) {
            this.f43644f[0].put("DateTime", C9443d.m76617e(m76655g));
        }
        if (m76655g("ImageWidth") == null) {
            this.f43644f[0].put("ImageWidth", C9443d.m76616f(0L, this.f43646h));
        }
        if (m76655g("ImageLength") == null) {
            this.f43644f[0].put("ImageLength", C9443d.m76616f(0L, this.f43646h));
        }
        if (m76655g("Orientation") == null) {
            this.f43644f[0].put("Orientation", C9443d.m76616f(0L, this.f43646h));
        }
        if (m76655g("LightSource") == null) {
            this.f43644f[1].put("LightSource", C9443d.m76616f(0L, this.f43646h));
        }
    }

    /* renamed from: a0 */
    public void m76666a0(double d) {
        String str;
        if (d >= 0.0d) {
            str = "0";
        } else {
            str = "1";
        }
        m76664b0("GPSAltitude", new C9445f(Math.abs(d)).toString());
        m76664b0("GPSAltitudeRef", str);
    }

    /* renamed from: b */
    public final String m76665b(double d) {
        long j = (long) d;
        double d2 = d - j;
        long j2 = (long) (d2 * 60.0d);
        long round = Math.round((d2 - (j2 / 60.0d)) * 3600.0d * 1.0E7d);
        return j + "/1," + j2 + "/1," + round + "/10000000";
    }

    /* renamed from: b0 */
    public void m76664b0(String str, String str2) {
        C9444e c9444e;
        int i;
        int i2;
        String str3;
        Matcher matcher;
        String str4 = str;
        String str5 = str2;
        if (str4 != null) {
            if (("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) && str5 != null) {
                boolean find = f43632u0.matcher(str5).find();
                boolean find2 = f43634v0.matcher(str5).find();
                if (str2.length() == 19 && (find || find2)) {
                    if (find2) {
                        str5 = str5.replaceAll(Detail.EMPTY_CHAR, ":");
                    }
                } else {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                    return;
                }
            }
            if ("ISOSpeedRatings".equals(str4)) {
                if (f43633v) {
                    Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str4 = "PhotographicSensitivity";
            }
            int i3 = 2;
            int i4 = 1;
            if (str5 != null && f43625n0.contains(str4)) {
                if (str4.equals("GPSTimeStamp")) {
                    if (!f43631t0.matcher(str5).find()) {
                        Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                        return;
                    }
                    str5 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
                } else {
                    try {
                        str5 = new C9445f(Double.parseDouble(str5)).toString();
                    } catch (NumberFormatException unused) {
                        Log.w("ExifInterface", "Invalid value for " + str4 + " : " + str5);
                        return;
                    }
                }
            }
            int i5 = 0;
            int i6 = 0;
            while (i6 < f43621j0.length) {
                if ((i6 != 4 || this.f43647i) && (c9444e = f43624m0[i6].get(str4)) != null) {
                    if (str5 == null) {
                        this.f43644f[i6].remove(str4);
                    } else {
                        Pair<Integer, Integer> m76634x = m76634x(str5);
                        int i7 = -1;
                        if (c9444e.f43677c != ((Integer) m76634x.first).intValue() && c9444e.f43677c != ((Integer) m76634x.second).intValue()) {
                            int i8 = c9444e.f43678d;
                            if (i8 != -1 && (i8 == ((Integer) m76634x.first).intValue() || c9444e.f43678d == ((Integer) m76634x.second).intValue())) {
                                i = c9444e.f43678d;
                            } else {
                                int i9 = c9444e.f43677c;
                                if (i9 != i4 && i9 != 7 && i9 != i3) {
                                    if (f43633v) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Given tag (");
                                        sb.append(str4);
                                        sb.append(") value didn't match with one of expected formats: ");
                                        String[] strArr = f43608W;
                                        sb.append(strArr[c9444e.f43677c]);
                                        String str6 = "";
                                        if (c9444e.f43678d == -1) {
                                            str3 = "";
                                        } else {
                                            str3 = ", " + strArr[c9444e.f43678d];
                                        }
                                        sb.append(str3);
                                        sb.append(" (guess: ");
                                        sb.append(strArr[((Integer) m76634x.first).intValue()]);
                                        if (((Integer) m76634x.second).intValue() != -1) {
                                            str6 = ", " + strArr[((Integer) m76634x.second).intValue()];
                                        }
                                        sb.append(str6);
                                        sb.append(")");
                                        Log.d("ExifInterface", sb.toString());
                                    }
                                } else {
                                    i = i9;
                                }
                            }
                        } else {
                            i = c9444e.f43677c;
                        }
                        switch (i) {
                            case 1:
                                i2 = i4;
                                this.f43644f[i6].put(str4, C9443d.m76621a(str5));
                                break;
                            case 2:
                            case 7:
                                i2 = i4;
                                this.f43644f[i6].put(str4, C9443d.m76617e(str5));
                                break;
                            case 3:
                                i2 = i4;
                                String[] split = str5.split(",", -1);
                                int[] iArr = new int[split.length];
                                for (int i10 = 0; i10 < split.length; i10++) {
                                    iArr[i10] = Integer.parseInt(split[i10]);
                                }
                                this.f43644f[i6].put(str4, C9443d.m76611k(iArr, this.f43646h));
                                break;
                            case 4:
                                i2 = i4;
                                String[] split2 = str5.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i11 = 0; i11 < split2.length; i11++) {
                                    jArr[i11] = Long.parseLong(split2[i11]);
                                }
                                this.f43644f[i6].put(str4, C9443d.m76615g(jArr, this.f43646h));
                                break;
                            case 5:
                                String[] split3 = str5.split(",", -1);
                                C9445f[] c9445fArr = new C9445f[split3.length];
                                int i12 = 0;
                                while (i12 < split3.length) {
                                    String[] split4 = split3[i12].split("/", i7);
                                    c9445fArr[i12] = new C9445f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                    i12++;
                                    i7 = -1;
                                }
                                i2 = 1;
                                this.f43644f[i6].put(str4, C9443d.m76613i(c9445fArr, this.f43646h));
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                i2 = i4;
                                if (f43633v) {
                                    Log.d("ExifInterface", "Data format isn't one of expected formats: " + i);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                String[] split5 = str5.split(",", -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i13 = 0; i13 < split5.length; i13++) {
                                    iArr2[i13] = Integer.parseInt(split5[i13]);
                                }
                                this.f43644f[i6].put(str4, C9443d.m76619c(iArr2, this.f43646h));
                                i2 = 1;
                                break;
                            case 10:
                                String[] split6 = str5.split(",", -1);
                                C9445f[] c9445fArr2 = new C9445f[split6.length];
                                int i14 = i5;
                                while (i14 < split6.length) {
                                    String[] split7 = split6[i14].split("/", -1);
                                    c9445fArr2[i14] = new C9445f((long) Double.parseDouble(split7[i5]), (long) Double.parseDouble(split7[i4]));
                                    i14++;
                                    split6 = split6;
                                    i5 = 0;
                                    i4 = 1;
                                }
                                this.f43644f[i6].put(str4, C9443d.m76618d(c9445fArr2, this.f43646h));
                                i2 = 1;
                                break;
                            case 12:
                                String[] split8 = str5.split(",", -1);
                                double[] dArr = new double[split8.length];
                                for (int i15 = i5; i15 < split8.length; i15++) {
                                    dArr[i15] = Double.parseDouble(split8[i15]);
                                }
                                this.f43644f[i6].put(str4, C9443d.m76620b(dArr, this.f43646h));
                                break;
                        }
                        i6++;
                        i4 = i2;
                        i3 = 2;
                        i5 = 0;
                    }
                }
                i2 = i4;
                i6++;
                i4 = i2;
                i3 = 2;
                i5 = 0;
            }
            return;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: c0 */
    public void m76662c0(Location location) {
        if (location == null) {
            return;
        }
        m76664b0("GPSProcessingMethod", location.getProvider());
        m76660d0(location.getLatitude(), location.getLongitude());
        m76666a0(location.getAltitude());
        m76664b0("GPSSpeedRef", "K");
        m76664b0("GPSSpeed", new C9445f((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1L))) / 1000.0f).toString());
        String[] split = f43606U.format(new Date(location.getTime())).split("\\s+", -1);
        m76664b0("GPSDateStamp", split[0]);
        m76664b0("GPSTimeStamp", split[1]);
    }

    /* renamed from: d */
    public final void m76661d(C9441b c9441b, C9442c c9442c, byte[] bArr, byte[] bArr2) throws IOException {
        Charset charset;
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (c9441b.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                sb.append(new String(bArr, f43627p0));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            m76659e(c9441b, c9442c, bArr3);
            if (!Arrays.equals(bArr3, bArr)) {
                if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d0 */
    public void m76660d0(double d, double d2) {
        String str;
        String str2;
        if (d >= -90.0d && d <= 90.0d && !Double.isNaN(d)) {
            if (d2 >= -180.0d && d2 <= 180.0d && !Double.isNaN(d2)) {
                if (d >= 0.0d) {
                    str = "N";
                } else {
                    str = "S";
                }
                m76664b0("GPSLatitudeRef", str);
                m76664b0("GPSLatitude", m76665b(Math.abs(d)));
                if (d2 >= 0.0d) {
                    str2 = "E";
                } else {
                    str2 = "W";
                }
                m76664b0("GPSLongitudeRef", str2);
                m76664b0("GPSLongitude", m76665b(Math.abs(d2)));
                return;
            }
            throw new IllegalArgumentException("Longitude value " + d2 + " is not valid.");
        }
        throw new IllegalArgumentException("Latitude value " + d + " is not valid.");
    }

    /* renamed from: e */
    public final void m76659e(C9441b c9441b, C9442c c9442c, byte[] bArr) throws IOException {
        int readInt = c9441b.readInt();
        c9442c.write(bArr);
        c9442c.m76625c(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        C37527Zh1.m72673f(c9441b, c9442c, readInt);
    }

    /* renamed from: e0 */
    public final void m76658e0(C9441b c9441b) throws IOException {
        HashMap<String, C9443d> hashMap = this.f43644f[4];
        C9443d c9443d = hashMap.get("Compression");
        if (c9443d != null) {
            int m76609m = c9443d.m76609m(this.f43646h);
            this.f43653o = m76609m;
            if (m76609m != 1) {
                if (m76609m != 6) {
                    if (m76609m != 7) {
                        return;
                    }
                } else {
                    m76633y(c9441b, hashMap);
                    return;
                }
            }
            if (m76684J(hashMap)) {
                m76632z(c9441b, hashMap);
                return;
            }
            return;
        }
        this.f43653o = 6;
        m76633y(c9441b, hashMap);
    }

    /* renamed from: f */
    public double m76657f(double d) {
        double m76653h = m76653h("GPSAltitude", -1.0d);
        int i = -1;
        int m76651i = m76651i("GPSAltitudeRef", -1);
        if (m76653h >= 0.0d && m76651i >= 0) {
            if (m76651i != 1) {
                i = 1;
            }
            return m76653h * i;
        }
        return d;
    }

    /* renamed from: g */
    public String m76655g(String str) {
        if (str != null) {
            C9443d m76649j = m76649j(str);
            if (m76649j != null) {
                if (!f43625n0.contains(str)) {
                    return m76649j.m76608n(this.f43646h);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i = m76649j.f43671a;
                    if (i != 5 && i != 10) {
                        Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + m76649j.f43671a);
                        return null;
                    }
                    C9445f[] c9445fArr = (C9445f[]) m76649j.m76607o(this.f43646h);
                    if (c9445fArr != null && c9445fArr.length == 3) {
                        C9445f c9445f = c9445fArr[0];
                        C9445f c9445f2 = c9445fArr[1];
                        C9445f c9445f3 = c9445fArr[2];
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) c9445f.f43679a) / ((float) c9445f.f43680b))), Integer.valueOf((int) (((float) c9445f2.f43679a) / ((float) c9445f2.f43680b))), Integer.valueOf((int) (((float) c9445f3.f43679a) / ((float) c9445f3.f43680b))));
                    }
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c9445fArr));
                    return null;
                }
                try {
                    return Double.toString(m76649j.m76610l(this.f43646h));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: g0 */
    public final void m76654g0(int i, int i2) throws IOException {
        if (!this.f43644f[i].isEmpty() && !this.f43644f[i2].isEmpty()) {
            C9443d c9443d = this.f43644f[i].get("ImageLength");
            C9443d c9443d2 = this.f43644f[i].get("ImageWidth");
            C9443d c9443d3 = this.f43644f[i2].get("ImageLength");
            C9443d c9443d4 = this.f43644f[i2].get("ImageWidth");
            if (c9443d != null && c9443d2 != null) {
                if (c9443d3 != null && c9443d4 != null) {
                    int m76609m = c9443d.m76609m(this.f43646h);
                    int m76609m2 = c9443d2.m76609m(this.f43646h);
                    int m76609m3 = c9443d3.m76609m(this.f43646h);
                    int m76609m4 = c9443d4.m76609m(this.f43646h);
                    if (m76609m < m76609m3 && m76609m2 < m76609m4) {
                        HashMap<String, C9443d>[] hashMapArr = this.f43644f;
                        HashMap<String, C9443d> hashMap = hashMapArr[i];
                        hashMapArr[i] = hashMapArr[i2];
                        hashMapArr[i2] = hashMap;
                    }
                } else if (f43633v) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                }
            } else if (f43633v) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
        } else if (f43633v) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    /* renamed from: h */
    public double m76653h(String str, double d) {
        if (str != null) {
            C9443d m76649j = m76649j(str);
            if (m76649j == null) {
                return d;
            }
            try {
                return m76649j.m76610l(this.f43646h);
            } catch (NumberFormatException unused) {
                return d;
            }
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: h0 */
    public final void m76652h0(C9446g c9446g, int i) throws IOException {
        C9443d m76612j;
        C9443d m76612j2;
        C9443d c9443d = this.f43644f[i].get("DefaultCropSize");
        C9443d c9443d2 = this.f43644f[i].get("SensorTopBorder");
        C9443d c9443d3 = this.f43644f[i].get("SensorLeftBorder");
        C9443d c9443d4 = this.f43644f[i].get("SensorBottomBorder");
        C9443d c9443d5 = this.f43644f[i].get("SensorRightBorder");
        if (c9443d != null) {
            if (c9443d.f43671a == 5) {
                C9445f[] c9445fArr = (C9445f[]) c9443d.m76607o(this.f43646h);
                if (c9445fArr != null && c9445fArr.length == 2) {
                    m76612j = C9443d.m76614h(c9445fArr[0], this.f43646h);
                    m76612j2 = C9443d.m76614h(c9445fArr[1], this.f43646h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c9445fArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) c9443d.m76607o(this.f43646h);
                if (iArr != null && iArr.length == 2) {
                    m76612j = C9443d.m76612j(iArr[0], this.f43646h);
                    m76612j2 = C9443d.m76612j(iArr[1], this.f43646h);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            this.f43644f[i].put("ImageWidth", m76612j);
            this.f43644f[i].put("ImageLength", m76612j2);
        } else if (c9443d2 != null && c9443d3 != null && c9443d4 != null && c9443d5 != null) {
            int m76609m = c9443d2.m76609m(this.f43646h);
            int m76609m2 = c9443d4.m76609m(this.f43646h);
            int m76609m3 = c9443d5.m76609m(this.f43646h);
            int m76609m4 = c9443d3.m76609m(this.f43646h);
            if (m76609m2 > m76609m && m76609m3 > m76609m4) {
                C9443d m76612j3 = C9443d.m76612j(m76609m2 - m76609m, this.f43646h);
                C9443d m76612j4 = C9443d.m76612j(m76609m3 - m76609m4, this.f43646h);
                this.f43644f[i].put("ImageLength", m76612j3);
                this.f43644f[i].put("ImageWidth", m76612j4);
            }
        } else {
            m76672V(c9446g, i);
        }
    }

    /* renamed from: i */
    public int m76651i(String str, int i) {
        if (str != null) {
            C9443d m76649j = m76649j(str);
            if (m76649j == null) {
                return i;
            }
            try {
                return m76649j.m76609m(this.f43646h);
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: i0 */
    public final void m76650i0() throws IOException {
        m76654g0(0, 5);
        m76654g0(0, 4);
        m76654g0(5, 4);
        C9443d c9443d = this.f43644f[1].get("PixelXDimension");
        C9443d c9443d2 = this.f43644f[1].get("PixelYDimension");
        if (c9443d != null && c9443d2 != null) {
            this.f43644f[0].put("ImageWidth", c9443d);
            this.f43644f[0].put("ImageLength", c9443d2);
        }
        if (this.f43644f[4].isEmpty() && m76682L(this.f43644f[5])) {
            HashMap<String, C9443d>[] hashMapArr = this.f43644f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m76682L(this.f43644f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m76673U(0, "ThumbnailOrientation", "Orientation");
        m76673U(0, "ThumbnailImageLength", "ImageLength");
        m76673U(0, "ThumbnailImageWidth", "ImageWidth");
        m76673U(5, "ThumbnailOrientation", "Orientation");
        m76673U(5, "ThumbnailImageLength", "ImageLength");
        m76673U(5, "ThumbnailImageWidth", "ImageWidth");
        m76673U(4, "Orientation", "ThumbnailOrientation");
        m76673U(4, "ImageLength", "ThumbnailImageLength");
        m76673U(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: j */
    public final C9443d m76649j(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (f43633v) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            for (int i = 0; i < f43621j0.length; i++) {
                C9443d c9443d = this.f43644f[i].get(str);
                if (c9443d != null) {
                    return c9443d;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: j0 */
    public final int m76648j0(C9442c c9442c) throws IOException {
        short s;
        C9444e[][] c9444eArr = f43621j0;
        int[] iArr = new int[c9444eArr.length];
        int[] iArr2 = new int[c9444eArr.length];
        for (C9444e c9444e : f43622k0) {
            m76674T(c9444e.f43676b);
        }
        if (this.f43647i) {
            if (this.f43648j) {
                m76674T("StripOffsets");
                m76674T("StripByteCounts");
            } else {
                m76674T("JPEGInterchangeFormat");
                m76674T("JPEGInterchangeFormatLength");
            }
        }
        for (int i = 0; i < f43621j0.length; i++) {
            for (Object obj : this.f43644f[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f43644f[i].remove(entry.getKey());
                }
            }
        }
        if (!this.f43644f[1].isEmpty()) {
            this.f43644f[0].put(f43622k0[1].f43676b, C9443d.m76616f(0L, this.f43646h));
        }
        if (!this.f43644f[2].isEmpty()) {
            this.f43644f[0].put(f43622k0[2].f43676b, C9443d.m76616f(0L, this.f43646h));
        }
        if (!this.f43644f[3].isEmpty()) {
            this.f43644f[1].put(f43622k0[3].f43676b, C9443d.m76616f(0L, this.f43646h));
        }
        if (this.f43647i) {
            if (this.f43648j) {
                this.f43644f[4].put("StripOffsets", C9443d.m76612j(0, this.f43646h));
                this.f43644f[4].put("StripByteCounts", C9443d.m76612j(this.f43651m, this.f43646h));
            } else {
                this.f43644f[4].put("JPEGInterchangeFormat", C9443d.m76616f(0L, this.f43646h));
                this.f43644f[4].put("JPEGInterchangeFormatLength", C9443d.m76616f(this.f43651m, this.f43646h));
            }
        }
        for (int i2 = 0; i2 < f43621j0.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, C9443d> entry2 : this.f43644f[i2].entrySet()) {
                int m76606p = entry2.getValue().m76606p();
                if (m76606p > 4) {
                    i3 += m76606p;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < f43621j0.length; i5++) {
            if (!this.f43644f[i5].isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.f43644f[i5].size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        if (this.f43647i) {
            if (this.f43648j) {
                this.f43644f[4].put("StripOffsets", C9443d.m76612j(i4, this.f43646h));
            } else {
                this.f43644f[4].put("JPEGInterchangeFormat", C9443d.m76616f(i4, this.f43646h));
            }
            this.f43650l = i4;
            i4 += this.f43651m;
        }
        if (this.f43642d == 4) {
            i4 += 8;
        }
        if (f43633v) {
            for (int i6 = 0; i6 < f43621j0.length; i6++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i6), Integer.valueOf(iArr[i6]), Integer.valueOf(this.f43644f[i6].size()), Integer.valueOf(iArr2[i6]), Integer.valueOf(i4)));
            }
        }
        if (!this.f43644f[1].isEmpty()) {
            this.f43644f[0].put(f43622k0[1].f43676b, C9443d.m76616f(iArr[1], this.f43646h));
        }
        if (!this.f43644f[2].isEmpty()) {
            this.f43644f[0].put(f43622k0[2].f43676b, C9443d.m76616f(iArr[2], this.f43646h));
        }
        if (!this.f43644f[3].isEmpty()) {
            this.f43644f[1].put(f43622k0[3].f43676b, C9443d.m76616f(iArr[3], this.f43646h));
        }
        int i7 = this.f43642d;
        if (i7 != 4) {
            if (i7 != 13) {
                if (i7 == 14) {
                    c9442c.write(f43599N);
                    c9442c.m76625c(i4);
                }
            } else {
                c9442c.m76625c(i4);
                c9442c.write(f43594I);
            }
        } else {
            c9442c.m76622g(i4);
            c9442c.write(f43628q0);
        }
        if (this.f43646h == ByteOrder.BIG_ENDIAN) {
            s = 19789;
        } else {
            s = 18761;
        }
        c9442c.m76624d(s);
        c9442c.m76627a(this.f43646h);
        c9442c.m76622g(42);
        c9442c.m76623f(8L);
        for (int i8 = 0; i8 < f43621j0.length; i8++) {
            if (!this.f43644f[i8].isEmpty()) {
                c9442c.m76622g(this.f43644f[i8].size());
                int size = iArr[i8] + 2 + (this.f43644f[i8].size() * 12) + 4;
                for (Map.Entry<String, C9443d> entry3 : this.f43644f[i8].entrySet()) {
                    int i9 = f43624m0[i8].get(entry3.getKey()).f43675a;
                    C9443d value = entry3.getValue();
                    int m76606p2 = value.m76606p();
                    c9442c.m76622g(i9);
                    c9442c.m76622g(value.f43671a);
                    c9442c.m76625c(value.f43672b);
                    if (m76606p2 > 4) {
                        c9442c.m76623f(size);
                        size += m76606p2;
                    } else {
                        c9442c.write(value.f43674d);
                        if (m76606p2 < 4) {
                            while (m76606p2 < 4) {
                                c9442c.m76626b(0);
                                m76606p2++;
                            }
                        }
                    }
                }
                if (i8 == 0 && !this.f43644f[4].isEmpty()) {
                    c9442c.m76623f(iArr[4]);
                } else {
                    c9442c.m76623f(0L);
                }
                for (Map.Entry<String, C9443d> entry4 : this.f43644f[i8].entrySet()) {
                    byte[] bArr = entry4.getValue().f43674d;
                    if (bArr.length > 4) {
                        c9442c.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f43647i) {
            c9442c.write(m76636v());
        }
        if (this.f43642d == 14 && i4 % 2 == 1) {
            c9442c.m76626b(0);
        }
        c9442c.m76627a(ByteOrder.BIG_ENDIAN);
        return i4;
    }

    /* renamed from: k */
    public final void m76647k(C9446g c9446g) throws IOException {
        String str;
        String str2;
        String str3;
        int i;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    C37527Zh1.C10333b.m72668a(mediaMetadataRetriever, new C9440a(c9446g));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    if (str != null) {
                        this.f43644f[0].put("ImageWidth", C9443d.m76612j(Integer.parseInt(str), this.f43646h));
                    }
                    if (str2 != null) {
                        this.f43644f[0].put("ImageLength", C9443d.m76612j(Integer.parseInt(str2), this.f43646h));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i = 1;
                                } else {
                                    i = 8;
                                }
                            } else {
                                i = 3;
                            }
                        } else {
                            i = 6;
                        }
                        this.f43644f[0].put("Orientation", C9443d.m76612j(i, this.f43646h));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            c9446g.m76603f(parseInt2);
                            byte[] bArr = new byte[6];
                            if (c9446g.read(bArr) == 6) {
                                int i2 = parseInt2 + 6;
                                int i3 = parseInt3 - 6;
                                if (Arrays.equals(bArr, f43628q0)) {
                                    byte[] bArr2 = new byte[i3];
                                    if (c9446g.read(bArr2) == i3) {
                                        this.f43654p = i2;
                                        m76676R(bArr2, 0);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f43633v) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x019a, code lost:
        r22.m76629c(r21.f43646h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019f, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184 A[LOOP:0: B:10:0x0038->B:63:0x0184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e A[SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m76646l(C9441b c9441b, int i, int i2) throws IOException {
        byte readByte;
        byte readByte2;
        String str;
        String str2;
        String str3;
        String str4 = "ExifInterface";
        if (f43633v) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + c9441b);
        }
        c9441b.m76629c(ByteOrder.BIG_ENDIAN);
        byte b = -1;
        if (c9441b.readByte() == -1) {
            if (c9441b.readByte() == -40) {
                int i3 = 2;
                int i4 = 2;
                while (true) {
                    if (c9441b.readByte() == b) {
                        int i5 = i4 + 1;
                        byte readByte3 = c9441b.readByte();
                        boolean z = f43633v;
                        if (z) {
                            Log.d(str4, "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & UByte.MAX_VALUE));
                        }
                        int i6 = i5 + 1;
                        if (readByte3 != -39 && readByte3 != -38) {
                            int readUnsignedShort = c9441b.readUnsignedShort() - i3;
                            int i7 = i6 + i3;
                            if (z) {
                                Log.d(str4, "JPEG segment: " + Integer.toHexString(readByte3 & UByte.MAX_VALUE) + " (length: " + (readUnsignedShort + 2) + ")");
                            }
                            if (readUnsignedShort >= 0) {
                                if (readByte3 != -31) {
                                    if (readByte3 != -2) {
                                        switch (readByte3) {
                                            default:
                                                switch (readByte3) {
                                                    default:
                                                        switch (readByte3) {
                                                            default:
                                                                switch (readByte3) {
                                                                }
                                                            case -55:
                                                            case -54:
                                                            case -53:
                                                                c9441b.m76628d(1);
                                                                HashMap<String, C9443d> hashMap = this.f43644f[i2];
                                                                if (i2 != 4) {
                                                                    str2 = "ImageLength";
                                                                } else {
                                                                    str2 = "ThumbnailImageLength";
                                                                }
                                                                hashMap.put(str2, C9443d.m76616f(c9441b.readUnsignedShort(), this.f43646h));
                                                                HashMap<String, C9443d> hashMap2 = this.f43644f[i2];
                                                                if (i2 != 4) {
                                                                    str3 = "ImageWidth";
                                                                } else {
                                                                    str3 = "ThumbnailImageWidth";
                                                                }
                                                                hashMap2.put(str3, C9443d.m76616f(c9441b.readUnsignedShort(), this.f43646h));
                                                                readUnsignedShort -= 5;
                                                                break;
                                                        }
                                                    case -59:
                                                    case -58:
                                                    case -57:
                                                        break;
                                                }
                                            case -64:
                                            case -63:
                                            case -62:
                                            case -61:
                                                break;
                                        }
                                        str = str4;
                                        if (readUnsignedShort < 0) {
                                            c9441b.m76628d(readUnsignedShort);
                                            i4 = i7 + readUnsignedShort;
                                            str4 = str;
                                            i3 = 2;
                                            b = -1;
                                        } else {
                                            throw new IOException("Invalid length");
                                        }
                                    } else {
                                        byte[] bArr = new byte[readUnsignedShort];
                                        if (c9441b.read(bArr) == readUnsignedShort) {
                                            if (m76655g("UserComment") == null) {
                                                this.f43644f[1].put("UserComment", C9443d.m76617e(new String(bArr, f43627p0)));
                                            }
                                            str = str4;
                                        } else {
                                            throw new IOException("Invalid exif");
                                        }
                                    }
                                } else {
                                    byte[] bArr2 = new byte[readUnsignedShort];
                                    c9441b.readFully(bArr2);
                                    int i8 = i7 + readUnsignedShort;
                                    byte[] bArr3 = f43628q0;
                                    if (C37527Zh1.m72672g(bArr2, bArr3)) {
                                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, bArr3.length, readUnsignedShort);
                                        this.f43654p = i + i7 + bArr3.length;
                                        m76676R(copyOfRange, i2);
                                        m76658e0(new C9441b(copyOfRange));
                                    } else {
                                        byte[] bArr4 = f43629r0;
                                        if (C37527Zh1.m72672g(bArr2, bArr4)) {
                                            int length = i7 + bArr4.length;
                                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr2, bArr4.length, readUnsignedShort);
                                            if (m76655g("Xmp") == null) {
                                                str = str4;
                                                this.f43644f[0].put("Xmp", new C9443d(1, copyOfRange2.length, length, copyOfRange2));
                                                this.f43659u = true;
                                                i7 = i8;
                                            }
                                        }
                                    }
                                    str = str4;
                                    i7 = i8;
                                }
                                readUnsignedShort = 0;
                                if (readUnsignedShort < 0) {
                                }
                            } else {
                                throw new IOException("Invalid length");
                            }
                        }
                    } else {
                        throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & UByte.MAX_VALUE));
                    }
                }
            } else {
                throw new IOException("Invalid marker: " + Integer.toHexString(readByte & UByte.MAX_VALUE));
            }
        } else {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & UByte.MAX_VALUE));
        }
    }

    /* renamed from: m */
    public double[] m76645m() {
        String m76655g = m76655g("GPSLatitude");
        String m76655g2 = m76655g("GPSLatitudeRef");
        String m76655g3 = m76655g("GPSLongitude");
        String m76655g4 = m76655g("GPSLongitudeRef");
        if (m76655g != null && m76655g2 != null && m76655g3 != null && m76655g4 != null) {
            try {
                return new double[]{m76663c(m76655g, m76655g2), m76663c(m76655g3, m76655g4)};
            } catch (IllegalArgumentException unused) {
                Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", m76655g, m76655g2, m76655g3, m76655g4));
                return null;
            }
        }
        return null;
    }

    /* renamed from: n */
    public final int m76644n(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m76690D(bArr)) {
            return 4;
        }
        if (m76687G(bArr)) {
            return 9;
        }
        if (m76691C(bArr)) {
            return 12;
        }
        if (m76689E(bArr)) {
            return 7;
        }
        if (m76686H(bArr)) {
            return 10;
        }
        if (m76688F(bArr)) {
            return 13;
        }
        if (m76681M(bArr)) {
            return 14;
        }
        return 0;
    }

    /* renamed from: o */
    public final void m76643o(C9446g c9446g) throws IOException {
        int i;
        int i2;
        m76640r(c9446g);
        C9443d c9443d = this.f43644f[1].get("MakerNote");
        if (c9443d != null) {
            C9446g c9446g2 = new C9446g(c9443d.f43674d);
            c9446g2.m76629c(this.f43646h);
            byte[] bArr = f43591F;
            byte[] bArr2 = new byte[bArr.length];
            c9446g2.readFully(bArr2);
            c9446g2.m76603f(0L);
            byte[] bArr3 = f43592G;
            byte[] bArr4 = new byte[bArr3.length];
            c9446g2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c9446g2.m76603f(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c9446g2.m76603f(12L);
            }
            m76675S(c9446g2, 6);
            C9443d c9443d2 = this.f43644f[7].get("PreviewImageStart");
            C9443d c9443d3 = this.f43644f[7].get("PreviewImageLength");
            if (c9443d2 != null && c9443d3 != null) {
                this.f43644f[5].put("JPEGInterchangeFormat", c9443d2);
                this.f43644f[5].put("JPEGInterchangeFormatLength", c9443d3);
            }
            C9443d c9443d4 = this.f43644f[8].get("AspectFrame");
            if (c9443d4 != null) {
                int[] iArr = (int[]) c9443d4.m76607o(this.f43646h);
                if (iArr != null && iArr.length == 4) {
                    int i3 = iArr[2];
                    int i4 = iArr[0];
                    if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                        int i5 = (i3 - i4) + 1;
                        int i6 = (i - i2) + 1;
                        if (i5 < i6) {
                            int i7 = i5 + i6;
                            i6 = i7 - i6;
                            i5 = i7 - i6;
                        }
                        C9443d m76612j = C9443d.m76612j(i5, this.f43646h);
                        C9443d m76612j2 = C9443d.m76612j(i6, this.f43646h);
                        this.f43644f[0].put("ImageWidth", m76612j);
                        this.f43644f[0].put("ImageLength", m76612j2);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    /* renamed from: p */
    public final void m76642p(C9441b c9441b) throws IOException {
        if (f43633v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c9441b);
        }
        c9441b.m76629c(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f43593H;
        c9441b.m76628d(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = c9441b.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (c9441b.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16 && !Arrays.equals(bArr2, f43595J)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, f43596K)) {
                        if (Arrays.equals(bArr2, f43594I)) {
                            byte[] bArr3 = new byte[readInt];
                            if (c9441b.read(bArr3) == readInt) {
                                int readInt2 = c9441b.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f43654p = i2;
                                    m76676R(bArr3, 0);
                                    m76650i0();
                                    m76658e0(new C9441b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + C37527Zh1.m72678a(bArr2));
                        }
                        int i3 = readInt + 4;
                        c9441b.m76628d(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: q */
    public final void m76641q(C9441b c9441b) throws IOException {
        boolean z = f43633v;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c9441b);
        }
        c9441b.m76628d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c9441b.read(bArr);
        c9441b.read(bArr2);
        c9441b.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c9441b.m76628d(i - c9441b.m76631a());
        c9441b.read(bArr4);
        m76646l(new C9441b(bArr4), i, 5);
        c9441b.m76628d(i3 - c9441b.m76631a());
        c9441b.m76629c(ByteOrder.BIG_ENDIAN);
        int readInt = c9441b.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = c9441b.readUnsignedShort();
            int readUnsignedShort2 = c9441b.readUnsignedShort();
            if (readUnsignedShort == f43616e0.f43675a) {
                short readShort = c9441b.readShort();
                short readShort2 = c9441b.readShort();
                C9443d m76612j = C9443d.m76612j(readShort, this.f43646h);
                C9443d m76612j2 = C9443d.m76612j(readShort2, this.f43646h);
                this.f43644f[0].put("ImageLength", m76612j);
                this.f43644f[0].put("ImageWidth", m76612j2);
                if (f43633v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c9441b.m76628d(readUnsignedShort2);
        }
    }

    /* renamed from: r */
    public final void m76640r(C9446g c9446g) throws IOException {
        C9443d c9443d;
        m76679O(c9446g);
        m76675S(c9446g, 0);
        m76652h0(c9446g, 0);
        m76652h0(c9446g, 5);
        m76652h0(c9446g, 4);
        m76650i0();
        if (this.f43642d == 8 && (c9443d = this.f43644f[1].get("MakerNote")) != null) {
            C9446g c9446g2 = new C9446g(c9443d.f43674d);
            c9446g2.m76629c(this.f43646h);
            c9446g2.m76628d(6);
            m76675S(c9446g2, 9);
            C9443d c9443d2 = this.f43644f[9].get("ColorSpace");
            if (c9443d2 != null) {
                this.f43644f[1].put("ColorSpace", c9443d2);
            }
        }
    }

    /* renamed from: s */
    public final void m76639s(C9446g c9446g) throws IOException {
        if (f43633v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c9446g);
        }
        m76640r(c9446g);
        C9443d c9443d = this.f43644f[0].get("JpgFromRaw");
        if (c9443d != null) {
            m76646l(new C9441b(c9443d.f43674d), (int) c9443d.f43673c, 5);
        }
        C9443d c9443d2 = this.f43644f[0].get("ISO");
        C9443d c9443d3 = this.f43644f[1].get("PhotographicSensitivity");
        if (c9443d2 != null && c9443d3 == null) {
            this.f43644f[1].put("PhotographicSensitivity", c9443d2);
        }
    }

    /* renamed from: t */
    public final void m76638t(C9446g c9446g) throws IOException {
        byte[] bArr = f43628q0;
        c9446g.m76628d(bArr.length);
        byte[] bArr2 = new byte[c9446g.available()];
        c9446g.readFully(bArr2);
        this.f43654p = bArr.length;
        m76676R(bArr2, 0);
    }

    /* renamed from: u */
    public byte[] m76637u() {
        int i = this.f43653o;
        if (i != 6 && i != 7) {
            return null;
        }
        return m76636v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[Catch: Exception -> 0x0088, all -> 0x00a7, TRY_ENTER, TryCatch #3 {all -> 0x00a7, blocks: (B:27:0x004f, B:30:0x0065, B:32:0x0071, B:37:0x007c, B:38:0x0081, B:39:0x0082, B:40:0x0087, B:51:0x0099), top: B:62:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[Catch: Exception -> 0x0088, all -> 0x00a7, TryCatch #3 {all -> 0x00a7, blocks: (B:27:0x004f, B:30:0x0065, B:32:0x0071, B:37:0x007c, B:38:0x0081, B:39:0x0082, B:40:0x0087, B:51:0x0099), top: B:62:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m76636v() {
        FileDescriptor fileDescriptor;
        Exception e;
        FileDescriptor fileDescriptor2;
        FileInputStream fileInputStream;
        Closeable closeable = null;
        if (!this.f43647i) {
            return null;
        }
        ?? r1 = this.f43652n;
        try {
            if (r1 != 0) {
                return r1;
            }
            try {
                r1 = this.f43641c;
                try {
                    if (r1 != 0) {
                        try {
                            if (r1.markSupported()) {
                                r1.reset();
                                fileInputStream = r1;
                            } else {
                                Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                                C37527Zh1.m72676c(r1);
                                return null;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            fileDescriptor2 = null;
                            Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                            C37527Zh1.m72676c(r1);
                            if (fileDescriptor2 != null) {
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            fileDescriptor = null;
                            closeable = r1;
                            C37527Zh1.m72676c(closeable);
                            if (fileDescriptor != null) {
                            }
                            throw th;
                        }
                    } else if (this.f43639a != null) {
                        fileInputStream = new FileInputStream(this.f43639a);
                    } else {
                        FileDescriptor m72670b = C37527Zh1.C10332a.m72670b(this.f43640b);
                        try {
                            C37527Zh1.C10332a.m72669c(m72670b, 0L, OsConstants.SEEK_SET);
                            fileDescriptor2 = m72670b;
                            r1 = new FileInputStream(m72670b);
                            if (r1.skip(this.f43650l + this.f43654p) != this.f43650l + this.f43654p) {
                                byte[] bArr = new byte[this.f43651m];
                                if (r1.read(bArr) == this.f43651m) {
                                    this.f43652n = bArr;
                                    C37527Zh1.m72676c(r1);
                                    if (fileDescriptor2 != null) {
                                        C37527Zh1.m72677b(fileDescriptor2);
                                    }
                                    return bArr;
                                }
                                throw new IOException("Corrupted image");
                            }
                            throw new IOException("Corrupted image");
                        } catch (Exception e3) {
                            e = e3;
                            fileDescriptor2 = m72670b;
                            r1 = 0;
                            Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                            C37527Zh1.m72676c(r1);
                            if (fileDescriptor2 != null) {
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            fileDescriptor = m72670b;
                            C37527Zh1.m72676c(closeable);
                            if (fileDescriptor != null) {
                                C37527Zh1.m72677b(fileDescriptor);
                            }
                            throw th;
                        }
                    }
                    if (r1.skip(this.f43650l + this.f43654p) != this.f43650l + this.f43654p) {
                    }
                } catch (Exception e4) {
                    e = e4;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                    C37527Zh1.m72676c(r1);
                    if (fileDescriptor2 != null) {
                        C37527Zh1.m72677b(fileDescriptor2);
                    }
                    return null;
                }
                fileDescriptor2 = null;
                r1 = fileInputStream;
            } catch (Exception e5) {
                r1 = 0;
                e = e5;
                fileDescriptor2 = null;
            } catch (Throwable th3) {
                th = th3;
                fileDescriptor = null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* renamed from: w */
    public final void m76635w(C9441b c9441b) throws IOException {
        if (f43633v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c9441b);
        }
        c9441b.m76629c(ByteOrder.LITTLE_ENDIAN);
        c9441b.m76628d(f43597L.length);
        int readInt = c9441b.readInt() + 8;
        byte[] bArr = f43598M;
        c9441b.m76628d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c9441b.read(bArr2) == 4) {
                    int readInt2 = c9441b.readInt();
                    int i = length + 4 + 4;
                    if (Arrays.equals(f43599N, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (c9441b.read(bArr3) == readInt2) {
                            this.f43654p = i;
                            m76676R(bArr3, 0);
                            m76658e0(new C9441b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C37527Zh1.m72678a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        c9441b.m76628d(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: y */
    public final void m76633y(C9441b c9441b, HashMap hashMap) throws IOException {
        C9443d c9443d = (C9443d) hashMap.get("JPEGInterchangeFormat");
        C9443d c9443d2 = (C9443d) hashMap.get("JPEGInterchangeFormatLength");
        if (c9443d != null && c9443d2 != null) {
            int m76609m = c9443d.m76609m(this.f43646h);
            int m76609m2 = c9443d2.m76609m(this.f43646h);
            if (this.f43642d == 7) {
                m76609m += this.f43655q;
            }
            if (m76609m > 0 && m76609m2 > 0) {
                this.f43647i = true;
                if (this.f43639a == null && this.f43641c == null && this.f43640b == null) {
                    byte[] bArr = new byte[m76609m2];
                    c9441b.skip(m76609m);
                    c9441b.read(bArr);
                    this.f43652n = bArr;
                }
                this.f43650l = m76609m;
                this.f43651m = m76609m2;
            }
            if (f43633v) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m76609m + ", length: " + m76609m2);
            }
        }
    }

    /* renamed from: z */
    public final void m76632z(C9441b c9441b, HashMap hashMap) throws IOException {
        C9443d c9443d = (C9443d) hashMap.get("StripOffsets");
        C9443d c9443d2 = (C9443d) hashMap.get("StripByteCounts");
        if (c9443d != null && c9443d2 != null) {
            long[] m72675d = C37527Zh1.m72675d(c9443d.m76607o(this.f43646h));
            long[] m72675d2 = C37527Zh1.m72675d(c9443d2.m76607o(this.f43646h));
            if (m72675d != null && m72675d.length != 0) {
                if (m72675d2 != null && m72675d2.length != 0) {
                    if (m72675d.length != m72675d2.length) {
                        Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                        return;
                    }
                    long j = 0;
                    for (long j2 : m72675d2) {
                        j += j2;
                    }
                    int i = (int) j;
                    byte[] bArr = new byte[i];
                    this.f43649k = true;
                    this.f43648j = true;
                    this.f43647i = true;
                    int i2 = 0;
                    int i3 = 0;
                    for (int i4 = 0; i4 < m72675d.length; i4++) {
                        int i5 = (int) m72675d[i4];
                        int i6 = (int) m72675d2[i4];
                        if (i4 < m72675d.length - 1 && i5 + i6 != m72675d[i4 + 1]) {
                            this.f43649k = false;
                        }
                        int i7 = i5 - i2;
                        if (i7 < 0) {
                            Log.d("ExifInterface", "Invalid strip offset value");
                            return;
                        }
                        long j3 = i7;
                        if (c9441b.skip(j3) != j3) {
                            Log.d("ExifInterface", "Failed to skip " + i7 + " bytes.");
                            return;
                        }
                        int i8 = i2 + i7;
                        byte[] bArr2 = new byte[i6];
                        if (c9441b.read(bArr2) != i6) {
                            Log.d("ExifInterface", "Failed to read " + i6 + " bytes.");
                            return;
                        }
                        i2 = i8 + i6;
                        System.arraycopy(bArr2, 0, bArr, i3, i6);
                        i3 += i6;
                    }
                    this.f43652n = bArr;
                    if (this.f43649k) {
                        this.f43650l = (int) m72675d[0];
                        this.f43651m = i;
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
        }
    }

    /* renamed from: Xh1$g */
    /* loaded from: classes.dex */
    public static class C9446g extends C9441b {
        public C9446g(byte[] bArr) throws IOException {
            super(bArr);
            this.f43665b.mark(Integer.MAX_VALUE);
        }

        /* renamed from: f */
        public void m76603f(long j) throws IOException {
            int i = this.f43667d;
            if (i > j) {
                this.f43667d = 0;
                this.f43665b.reset();
            } else {
                j -= i;
            }
            m76628d((int) j);
        }

        public C9446g(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f43665b.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* renamed from: Xh1$e */
    /* loaded from: classes.dex */
    public static class C9444e {

        /* renamed from: a */
        public final int f43675a;

        /* renamed from: b */
        public final String f43676b;

        /* renamed from: c */
        public final int f43677c;

        /* renamed from: d */
        public final int f43678d;

        public C9444e(String str, int i, int i2) {
            this.f43676b = str;
            this.f43675a = i;
            this.f43677c = i2;
            this.f43678d = -1;
        }

        /* renamed from: a */
        public boolean m76605a(int i) {
            int i2;
            int i3 = this.f43677c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f43678d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            if ((i3 == 12 || i2 == 12) && i == 11) {
                return true;
            }
            return false;
        }

        public C9444e(String str, int i, int i2, int i3) {
            this.f43676b = str;
            this.f43675a = i;
            this.f43677c = i2;
            this.f43678d = i3;
        }
    }

    public C37059Xh1(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public C37059Xh1(InputStream inputStream, int i) throws IOException {
        C9444e[][] c9444eArr = f43621j0;
        this.f43644f = new HashMap[c9444eArr.length];
        this.f43645g = new HashSet(c9444eArr.length);
        this.f43646h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f43639a = null;
            if (i == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f43628q0.length);
                if (!m76692B(bufferedInputStream)) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f43643e = true;
                this.f43641c = null;
                this.f43640b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f43641c = (AssetManager.AssetInputStream) inputStream;
                this.f43640b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (m76685I(fileInputStream.getFD())) {
                        this.f43641c = null;
                        this.f43640b = fileInputStream.getFD();
                    }
                }
                this.f43641c = null;
                this.f43640b = null;
            }
            m76680N(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
