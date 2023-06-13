package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
/* renamed from: L70 */
/* loaded from: classes6.dex */
public final class L70 {
    private L70() {
    }

    /* renamed from: a */
    public static byte[] m97761a(Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i) {
            return remove;
        }
        int length = i - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static InputStream m97760b(InputStream inputStream, long j) {
        return new C4737a(inputStream, j);
    }

    /* renamed from: c */
    public static int m97759c(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: d */
    public static byte[] m97758d(InputStream inputStream) throws IOException {
        return m97757e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    public static byte[] m97757e(InputStream inputStream, Queue<byte[]> queue, int i) throws IOException {
        int i2;
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = inputStream.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return m97761a(queue, i);
                }
                i3 += read;
                i += read;
            }
            long j = min;
            if (min < 4096) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            min = m97759c(j * i2);
        }
        if (inputStream.read() == -1) {
            return m97761a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: L70$a */
    /* loaded from: classes6.dex */
    public static final class C4737a extends FilterInputStream {

        /* renamed from: b */
        public long f20760b;

        /* renamed from: c */
        public long f20761c;

        public C4737a(InputStream inputStream, long j) {
            super(inputStream);
            this.f20761c = -1L;
            this.f20760b = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f20760b);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i) {
            ((FilterInputStream) this).in.mark(i);
            this.f20761c = this.f20760b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f20760b == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f20760b--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.f20761c != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.f20760b = this.f20761c;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f20760b));
            this.f20760b -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.f20760b;
            if (j == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
            if (read != -1) {
                this.f20760b -= read;
            }
            return read;
        }
    }
}
