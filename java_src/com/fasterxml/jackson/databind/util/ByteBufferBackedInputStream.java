package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.UByte;
/* loaded from: classes5.dex */
public class ByteBufferBackedInputStream extends InputStream {

    /* renamed from: _b */
    protected final ByteBuffer f69968_b;

    public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
        this.f69968_b = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f69968_b.remaining();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f69968_b.hasRemaining()) {
            return this.f69968_b.get() & UByte.MAX_VALUE;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f69968_b.hasRemaining()) {
            int min = Math.min(i2, this.f69968_b.remaining());
            this.f69968_b.get(bArr, i, min);
            return min;
        }
        return -1;
    }
}
