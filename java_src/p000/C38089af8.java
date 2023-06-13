package p000;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: af8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38089af8 extends FilterOutputStream {
    public C38089af8(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
