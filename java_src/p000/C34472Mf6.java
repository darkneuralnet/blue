package p000;

import java.io.InputStream;
import java.net.URL;
import p000.WU2;
/* renamed from: Mf6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C34472Mf6 implements WU2<URL, InputStream> {

    /* renamed from: a */
    public final WU2<OC1, InputStream> f23375a;

    /* renamed from: Mf6$a */
    /* loaded from: classes5.dex */
    public static class C5340a implements XU2<URL, InputStream> {
        @Override // p000.XU2
        /* renamed from: b */
        public WU2<URL, InputStream> mo19945b(QW2 qw2) {
            return new C34472Mf6(qw2.m88449d(OC1.class, InputStream.class));
        }
    }

    public C34472Mf6(WU2<OC1, InputStream> wu2) {
        this.f23375a = wu2;
    }

    @Override // p000.WU2
    /* renamed from: c */
    public WU2.C9060a<InputStream> mo19951b(URL url, int i, int i2, C48964sy3 c48964sy3) {
        return this.f23375a.mo19951b(new OC1(url), i, i2, c48964sy3);
    }

    @Override // p000.WU2
    /* renamed from: d */
    public boolean mo19952a(URL url) {
        return true;
    }
}
