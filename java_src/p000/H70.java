package p000;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import kotlin.KotlinVersion;
/* renamed from: H70 */
/* loaded from: classes.dex */
public class H70 extends FilterOutputStream {

    /* renamed from: b */
    public final OutputStream f12865b;

    /* renamed from: c */
    public ByteOrder f12866c;

    public H70(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f12865b = outputStream;
        this.f12866c = byteOrder;
    }

    /* renamed from: a */
    public void m104393a(ByteOrder byteOrder) {
        this.f12866c = byteOrder;
    }

    /* renamed from: b */
    public void m104392b(int i) throws IOException {
        this.f12865b.write(i);
    }

    /* renamed from: c */
    public void m104391c(int i) throws IOException {
        ByteOrder byteOrder = this.f12866c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f12865b.write((i >>> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f12865b.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f12865b.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f12865b.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f12865b.write((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f12865b.write((i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f12865b.write((i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f12865b.write((i >>> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    /* renamed from: d */
    public void m104390d(short s) throws IOException {
        ByteOrder byteOrder = this.f12866c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f12865b.write((s >>> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f12865b.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f12865b.write((s >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f12865b.write((s >>> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    /* renamed from: f */
    public void m104389f(long j) throws IOException {
        m104391c((int) j);
    }

    /* renamed from: g */
    public void m104388g(int i) throws IOException {
        m104390d((short) i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f12865b.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f12865b.write(bArr, i, i2);
    }
}
