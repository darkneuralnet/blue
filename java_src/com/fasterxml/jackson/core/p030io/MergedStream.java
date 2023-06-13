package com.fasterxml.jackson.core.p030io;

import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
/* renamed from: com.fasterxml.jackson.core.io.MergedStream */
/* loaded from: classes5.dex */
public final class MergedStream extends InputStream {

    /* renamed from: _b */
    private byte[] f69949_b;
    private final IOContext _ctxt;
    private final int _end;
    private final InputStream _in;
    private int _ptr;

    public MergedStream(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2) {
        this._ctxt = iOContext;
        this._in = inputStream;
        this.f69949_b = bArr;
        this._ptr = i;
        this._end = i2;
    }

    private void _free() {
        byte[] bArr = this.f69949_b;
        if (bArr != null) {
            this.f69949_b = null;
            IOContext iOContext = this._ctxt;
            if (iOContext != null) {
                iOContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f69949_b != null) {
            return this._end - this._ptr;
        }
        return this._in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        _free();
        this._in.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        if (this.f69949_b == null) {
            this._in.mark(i);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f69949_b == null && this._in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f69949_b;
        if (bArr != null) {
            int i = this._ptr;
            int i2 = i + 1;
            this._ptr = i2;
            int i3 = bArr[i] & UByte.MAX_VALUE;
            if (i2 >= this._end) {
                _free();
            }
            return i3;
        }
        return this._in.read();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f69949_b == null) {
            this._in.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2;
        if (this.f69949_b != null) {
            int i = this._end;
            int i2 = this._ptr;
            long j3 = i - i2;
            if (j3 > j) {
                this._ptr = i2 + ((int) j);
                return j;
            }
            _free();
            j2 = j3 + 0;
            j -= j3;
        } else {
            j2 = 0;
        }
        if (j > 0) {
            return j2 + this._in.skip(j);
        }
        return j2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.f69949_b;
        if (bArr2 != null) {
            int i3 = this._end;
            int i4 = this._ptr;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i4, bArr, i, i2);
            int i6 = this._ptr + i2;
            this._ptr = i6;
            if (i6 >= this._end) {
                _free();
            }
            return i2;
        }
        return this._in.read(bArr, i, i2);
    }
}
