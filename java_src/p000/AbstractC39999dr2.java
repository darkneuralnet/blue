package p000;

import java.io.InputStream;
/* renamed from: dr2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC39999dr2 extends InputStream {

    /* renamed from: b */
    public final InputStream f77308b;

    /* renamed from: c */
    public int f77309c;

    public AbstractC39999dr2(InputStream inputStream, int i) {
        this.f77308b = inputStream;
        this.f77309c = i;
    }

    /* renamed from: a */
    public int m43634a() {
        return this.f77309c;
    }

    /* renamed from: b */
    public void m43633b(boolean z) {
        InputStream inputStream = this.f77308b;
        if (inputStream instanceof C44249l12) {
            ((C44249l12) inputStream).m28020d(z);
        }
    }
}
