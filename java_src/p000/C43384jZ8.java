package p000;

import java.io.IOException;
import java.net.HttpURLConnection;
/* renamed from: jZ8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43384jZ8 extends AbstractC46398oe8 {

    /* renamed from: b */
    public InterfaceC47418qM8<Integer> f92929b;

    /* renamed from: c */
    public InterfaceC47418qM8<Integer> f92930c;

    /* renamed from: d */
    public InterfaceC49852uT8 f92931d;

    /* renamed from: e */
    public HttpURLConnection f92932e;

    public C43384jZ8() {
        QG8 qg8 = QG8.f30147a;
        C49205tN8 c49205tN8 = C49205tN8.f110385a;
        this.f92929b = qg8;
        this.f92930c = c49205tN8;
        this.f92931d = null;
    }

    /* renamed from: b */
    public final HttpURLConnection m30316b(InterfaceC49852uT8 interfaceC49852uT8, int i, int i2) throws IOException {
        this.f92929b = new InterfaceC47418qM8(21504) { // from class: it8
            @Override // p000.InterfaceC47418qM8
            public final Object zza() {
                return 21504;
            }
        };
        this.f92930c = new InterfaceC47418qM8(-1) { // from class: lA8
            @Override // p000.InterfaceC47418qM8
            public final Object zza() {
                return -1;
            }
        };
        this.f92931d = interfaceC49852uT8;
        C42327hm8.m35874b(this.f92929b.zza().intValue(), this.f92930c.zza().intValue());
        InterfaceC49852uT8 interfaceC49852uT82 = this.f92931d;
        interfaceC49852uT82.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) interfaceC49852uT82.zza();
        this.f92932e = httpURLConnection;
        return httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f92932e;
        C42327hm8.m35875a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
