package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;
/* renamed from: NT2 */
/* loaded from: classes.dex */
public class NT2 {

    /* renamed from: NT2$a */
    /* loaded from: classes.dex */
    public static class C5581a implements InterfaceC5583c {

        /* renamed from: a */
        public final ByteBuffer f24622a;

        public C5581a(ByteBuffer byteBuffer) {
            this.f24622a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p000.NT2.InterfaceC5583c
        /* renamed from: a */
        public void mo93867a(int i) throws IOException {
            ByteBuffer byteBuffer = this.f24622a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // p000.NT2.InterfaceC5583c
        /* renamed from: b */
        public int mo93866b() throws IOException {
            return this.f24622a.getInt();
        }

        @Override // p000.NT2.InterfaceC5583c
        /* renamed from: c */
        public long mo93865c() throws IOException {
            return NT2.m93870c(this.f24622a.getInt());
        }

        @Override // p000.NT2.InterfaceC5583c
        public long getPosition() {
            return this.f24622a.position();
        }

        @Override // p000.NT2.InterfaceC5583c
        public int readUnsignedShort() throws IOException {
            return NT2.m93869d(this.f24622a.getShort());
        }
    }

    /* renamed from: NT2$b */
    /* loaded from: classes.dex */
    public static class C5582b {

        /* renamed from: a */
        public final long f24623a;

        /* renamed from: b */
        public final long f24624b;

        public C5582b(long j, long j2) {
            this.f24623a = j;
            this.f24624b = j2;
        }

        /* renamed from: a */
        public long m93868a() {
            return this.f24623a;
        }
    }

    /* renamed from: NT2$c */
    /* loaded from: classes.dex */
    public interface InterfaceC5583c {
        /* renamed from: a */
        void mo93867a(int i) throws IOException;

        /* renamed from: b */
        int mo93866b() throws IOException;

        /* renamed from: c */
        long mo93865c() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    private NT2() {
    }

    /* renamed from: a */
    public static C5582b m93872a(InterfaceC5583c interfaceC5583c) throws IOException {
        long j;
        interfaceC5583c.mo93867a(4);
        int readUnsignedShort = interfaceC5583c.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            interfaceC5583c.mo93867a(6);
            int i = 0;
            while (true) {
                if (i < readUnsignedShort) {
                    int mo93866b = interfaceC5583c.mo93866b();
                    interfaceC5583c.mo93867a(4);
                    j = interfaceC5583c.mo93865c();
                    interfaceC5583c.mo93867a(4);
                    if (1835365473 == mo93866b) {
                        break;
                    }
                    i++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                interfaceC5583c.mo93867a((int) (j - interfaceC5583c.getPosition()));
                interfaceC5583c.mo93867a(12);
                long mo93865c = interfaceC5583c.mo93865c();
                for (int i2 = 0; i2 < mo93865c; i2++) {
                    int mo93866b2 = interfaceC5583c.mo93866b();
                    long mo93865c2 = interfaceC5583c.mo93865c();
                    long mo93865c3 = interfaceC5583c.mo93865c();
                    if (1164798569 == mo93866b2 || 1701669481 == mo93866b2) {
                        return new C5582b(mo93865c2 + j, mo93865c3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: b */
    public static MT2 m93871b(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m93872a(new C5581a(duplicate)).m93868a());
        return MT2.m95289h(duplicate);
    }

    /* renamed from: c */
    public static long m93870c(int i) {
        return i & 4294967295L;
    }

    /* renamed from: d */
    public static int m93869d(short s) {
        return s & UShort.MAX_VALUE;
    }
}
