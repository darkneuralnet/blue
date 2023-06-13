package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: Td8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36094Td8 extends FilterInputStream {
    public C36094Td8(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return ((FilterInputStream) this).in.read(bArr);
    }
}
