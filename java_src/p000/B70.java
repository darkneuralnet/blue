package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p000.IS0;
import p000.WU2;
/* renamed from: B70 */
/* loaded from: classes5.dex */
public class B70 implements WU2<File, ByteBuffer> {

    /* renamed from: B70$a */
    /* loaded from: classes5.dex */
    public static final class C0527a implements IS0<ByteBuffer> {

        /* renamed from: b */
        public final File f1848b;

        public C0527a(File file) {
            this.f1848b = file;
        }

        @Override // p000.IS0
        /* renamed from: a */
        public Class<ByteBuffer> mo6834a() {
            return ByteBuffer.class;
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
        public void mo19946e(P24 p24, IS0.InterfaceC3534a<? super ByteBuffer> interfaceC3534a) {
            try {
                interfaceC3534a.mo77098c(E70.m109382a(this.f1848b));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                interfaceC3534a.mo77097d(e);
            }
        }
    }

    /* renamed from: B70$b */
    /* loaded from: classes5.dex */
    public static class C0528b implements XU2<File, ByteBuffer> {
        @Override // p000.XU2
        /* renamed from: b */
        public WU2<File, ByteBuffer> mo19945b(QW2 qw2) {
            return new B70();
        }
    }

    @Override // p000.WU2
    /* renamed from: c */
    public WU2.C9060a<ByteBuffer> mo19951b(File file, int i, int i2, C48964sy3 c48964sy3) {
        return new WU2.C9060a<>(new C35387Qd3(file), new C0527a(file));
    }

    @Override // p000.WU2
    /* renamed from: d */
    public boolean mo19952a(File file) {
        return true;
    }
}
