package p000;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000.IS0;
import p000.WU2;
/* renamed from: p70  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C46679p70<Data> implements WU2<byte[], Data> {

    /* renamed from: a */
    public final InterfaceC27148b<Data> f103140a;

    /* renamed from: p70$a */
    /* loaded from: classes5.dex */
    public static class C27146a implements XU2<byte[], ByteBuffer> {

        /* renamed from: p70$a$a */
        /* loaded from: classes5.dex */
        public class C27147a implements InterfaceC27148b<ByteBuffer> {
            public C27147a() {
            }

            @Override // p000.C46679p70.InterfaceC27148b
            /* renamed from: a */
            public Class<ByteBuffer> mo19944a() {
                return ByteBuffer.class;
            }

            @Override // p000.C46679p70.InterfaceC27148b
            /* renamed from: c */
            public ByteBuffer mo19943b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<byte[], ByteBuffer> mo19945b(QW2 qw2) {
            return new C46679p70(new C27147a());
        }
    }

    /* renamed from: p70$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC27148b<Data> {
        /* renamed from: a */
        Class<Data> mo19944a();

        /* renamed from: b */
        Data mo19943b(byte[] bArr);
    }

    /* renamed from: p70$c */
    /* loaded from: classes5.dex */
    public static class C27149c<Data> implements IS0<Data> {

        /* renamed from: b */
        public final byte[] f103142b;

        /* renamed from: c */
        public final InterfaceC27148b<Data> f103143c;

        public C27149c(byte[] bArr, InterfaceC27148b<Data> interfaceC27148b) {
            this.f103142b = bArr;
            this.f103143c = interfaceC27148b;
        }

        @Override // p000.IS0
        /* renamed from: a */
        public Class<Data> mo6834a() {
            return this.f103143c.mo19944a();
        }

        @Override // p000.IS0
        /* renamed from: b */
        public ZS0 mo19947b() {
            return ZS0.LOCAL;
        }

        @Override // p000.IS0
        public void cancel() {
        }

        @Override // p000.IS0
        public void cleanup() {
        }

        @Override // p000.IS0
        /* renamed from: e */
        public void mo19946e(P24 p24, IS0.InterfaceC3534a<? super Data> interfaceC3534a) {
            interfaceC3534a.mo77098c((Data) this.f103143c.mo19943b(this.f103142b));
        }
    }

    /* renamed from: p70$d */
    /* loaded from: classes5.dex */
    public static class C27150d implements XU2<byte[], InputStream> {

        /* renamed from: p70$d$a */
        /* loaded from: classes5.dex */
        public class C27151a implements InterfaceC27148b<InputStream> {
            public C27151a() {
            }

            @Override // p000.C46679p70.InterfaceC27148b
            /* renamed from: a */
            public Class<InputStream> mo19944a() {
                return InputStream.class;
            }

            @Override // p000.C46679p70.InterfaceC27148b
            /* renamed from: c */
            public InputStream mo19943b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<byte[], InputStream> mo19945b(QW2 qw2) {
            return new C46679p70(new C27151a());
        }
    }

    public C46679p70(InterfaceC27148b<Data> interfaceC27148b) {
        this.f103140a = interfaceC27148b;
    }

    @Override // p000.WU2
    /* renamed from: c */
    public WU2.C9060a<Data> mo19951b(byte[] bArr, int i, int i2, C48964sy3 c48964sy3) {
        return new WU2.C9060a<>(new C35387Qd3(bArr), new C27149c(bArr, this.f103140a));
    }

    @Override // p000.WU2
    /* renamed from: d */
    public boolean mo19952a(byte[] bArr) {
        return true;
    }
}
