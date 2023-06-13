package p000;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.UByte;
/* renamed from: E70 */
/* loaded from: classes5.dex */
public final class E70 {

    /* renamed from: a */
    public static final AtomicReference<byte[]> f6972a = new AtomicReference<>();

    /* renamed from: E70$b */
    /* loaded from: classes5.dex */
    public static final class C1740b {

        /* renamed from: a */
        public final int f6975a;

        /* renamed from: b */
        public final int f6976b;

        /* renamed from: c */
        public final byte[] f6977c;

        public C1740b(byte[] bArr, int i, int i2) {
            this.f6977c = bArr;
            this.f6975a = i;
            this.f6976b = i2;
        }
    }

    private E70() {
    }

    /* renamed from: a */
    public static ByteBuffer m109382a(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                if (length != 0) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        fileChannel = randomAccessFile.getChannel();
                        MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        try {
                            fileChannel.close();
                        } catch (IOException unused) {
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        return load;
                    } catch (Throwable th) {
                        th = th;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                }
                throw new IOException("File unsuitable for memory mapping");
            }
            throw new IOException("File too large to map into memory");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* renamed from: b */
    public static ByteBuffer m109381b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f6972a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                f6972a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return m109379d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
        }
    }

    /* renamed from: c */
    public static C1740b m109380c(ByteBuffer byteBuffer) {
        if (!byteBuffer.isReadOnly() && byteBuffer.hasArray()) {
            return new C1740b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        }
        return null;
    }

    /* renamed from: d */
    public static ByteBuffer m109379d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* renamed from: e */
    public static byte[] m109378e(ByteBuffer byteBuffer) {
        C1740b m109380c = m109380c(byteBuffer);
        if (m109380c != null && m109380c.f6975a == 0 && m109380c.f6976b == m109380c.f6977c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        m109379d(asReadOnlyBuffer);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: f */
    public static void m109377f(ByteBuffer byteBuffer, File file) throws IOException {
        RandomAccessFile randomAccessFile;
        m109379d(byteBuffer);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* renamed from: g */
    public static InputStream m109376g(ByteBuffer byteBuffer) {
        return new C1739a(byteBuffer);
    }

    /* renamed from: E70$a */
    /* loaded from: classes5.dex */
    public static class C1739a extends InputStream {

        /* renamed from: b */
        public final ByteBuffer f6973b;

        /* renamed from: c */
        public int f6974c = -1;

        public C1739a(ByteBuffer byteBuffer) {
            this.f6973b = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f6973b.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.f6974c = this.f6973b.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f6973b.hasRemaining()) {
                return this.f6973b.get() & UByte.MAX_VALUE;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i = this.f6974c;
            if (i != -1) {
                this.f6973b.position(i);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (!this.f6973b.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j, available());
            ByteBuffer byteBuffer = this.f6973b;
            byteBuffer.position((int) (byteBuffer.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (this.f6973b.hasRemaining()) {
                int min = Math.min(i2, available());
                this.f6973b.get(bArr, i, min);
                return min;
            }
            return -1;
        }
    }
}
