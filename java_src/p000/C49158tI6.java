package p000;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import okhttp3.internal.http2.Http2Stream;
/* renamed from: tI6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49158tI6 {

    /* renamed from: tI6$a */
    /* loaded from: classes.dex */
    public static class C28674a {

        /* renamed from: a */
        public long f110277a;

        /* renamed from: b */
        public long f110278b;
    }

    /* renamed from: a */
    public static long m12520a(RandomAccessFile randomAccessFile, C28674a c28674a) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = c28674a.f110278b;
        randomAccessFile.seek(c28674a.f110277a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min((long) Http2Stream.EMIT_BUFFER_SIZE, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min((long) Http2Stream.EMIT_BUFFER_SIZE, j));
        }
        return crc32.getValue();
    }

    /* renamed from: b */
    public static C28674a m12519b(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C28674a c28674a = new C28674a();
                    c28674a.f110278b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    c28674a.f110277a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    return c28674a;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    /* renamed from: c */
    public static long m12518c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m12520a(randomAccessFile, m12519b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
