package p000;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import p000.C42519i61;
/* renamed from: nR5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C45681nR5 implements InterfaceC38502bM4<InputStream, Bitmap> {

    /* renamed from: a */
    public final C42519i61 f99939a;

    /* renamed from: b */
    public final InterfaceC28820to f99940b;

    /* renamed from: nR5$a */
    /* loaded from: classes5.dex */
    public static class C26511a implements C42519i61.InterfaceC23126b {

        /* renamed from: a */
        public final C38818bt4 f99941a;

        /* renamed from: b */
        public final C37518Zg1 f99942b;

        public C26511a(C38818bt4 c38818bt4, C37518Zg1 c37518Zg1) {
            this.f99941a = c38818bt4;
            this.f99942b = c37518Zg1;
        }

        @Override // p000.C42519i61.InterfaceC23126b
        /* renamed from: a */
        public void mo23750a() {
            this.f99941a.m62199b();
        }

        @Override // p000.C42519i61.InterfaceC23126b
        /* renamed from: b */
        public void mo23749b(InterfaceC20044eU interfaceC20044eU, Bitmap bitmap) throws IOException {
            IOException m72780a = this.f99942b.m72780a();
            if (m72780a != null) {
                if (bitmap != null) {
                    interfaceC20044eU.mo16193c(bitmap);
                }
                throw m72780a;
            }
        }
    }

    public C45681nR5(C42519i61 c42519i61, InterfaceC28820to interfaceC28820to) {
        this.f99939a = c42519i61;
        this.f99940b = interfaceC28820to;
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: c */
    public VL4<Bitmap> mo1781b(InputStream inputStream, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        boolean z;
        C38818bt4 c38818bt4;
        if (inputStream instanceof C38818bt4) {
            c38818bt4 = (C38818bt4) inputStream;
            z = false;
        } else {
            z = true;
            c38818bt4 = new C38818bt4(inputStream, this.f99940b);
        }
        C37518Zg1 m72779b = C37518Zg1.m72779b(c38818bt4);
        try {
            return this.f99939a.m34468f(new C39704dM2(m72779b), i, i2, c48964sy3, new C26511a(c38818bt4, m72779b));
        } finally {
            m72779b.release();
            if (z) {
                c38818bt4.release();
            }
        }
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: d */
    public boolean mo1782a(InputStream inputStream, C48964sy3 c48964sy3) {
        return this.f99939a.m34458p(inputStream);
    }
}
