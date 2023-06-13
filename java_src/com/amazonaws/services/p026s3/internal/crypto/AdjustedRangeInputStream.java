package com.amazonaws.services.p026s3.internal.crypto;

import com.amazonaws.internal.SdkInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.amazonaws.services.s3.internal.crypto.AdjustedRangeInputStream */
/* loaded from: classes3.dex */
public class AdjustedRangeInputStream extends SdkInputStream {
    private boolean closed = false;
    private InputStream decryptedContents;
    private long virtualAvailable;

    public AdjustedRangeInputStream(InputStream inputStream, long j, long j2) throws IOException {
        this.decryptedContents = inputStream;
        initializeForRead(j, j2);
    }

    private void initializeForRead(long j, long j2) throws IOException {
        int i;
        if (j < 16) {
            i = (int) j;
        } else {
            i = ((int) (j % 16)) + 16;
        }
        if (i != 0) {
            while (i > 0) {
                this.decryptedContents.read();
                i--;
            }
        }
        this.virtualAvailable = (j2 - j) + 1;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        abortIfNeeded();
        int available = this.decryptedContents.available();
        long j = this.virtualAvailable;
        if (available < j) {
            return available;
        }
        return (int) j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            this.decryptedContents.close();
        }
        abortIfNeeded();
    }

    @Override // com.amazonaws.internal.SdkInputStream
    public InputStream getWrappedInputStream() {
        return this.decryptedContents;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        abortIfNeeded();
        int read = this.virtualAvailable <= 0 ? -1 : this.decryptedContents.read();
        if (read != -1) {
            this.virtualAvailable--;
        } else {
            close();
            this.virtualAvailable = 0L;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        abortIfNeeded();
        long j = this.virtualAvailable;
        if (j <= 0) {
            read = -1;
        } else {
            if (i2 > j) {
                i2 = j < 2147483647L ? (int) j : Integer.MAX_VALUE;
            }
            read = this.decryptedContents.read(bArr, i, i2);
        }
        if (read != -1) {
            this.virtualAvailable -= read;
        } else {
            close();
            this.virtualAvailable = 0L;
        }
        return read;
    }
}
