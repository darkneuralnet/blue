package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import p000.C32813Fd3;
/* renamed from: xv */
/* loaded from: classes8.dex */
public class C30340xv implements Serializable {
    private static final long serialVersionUID = -3464451825208522308L;

    /* renamed from: b */
    public final Map<Integer, C29993wv> f118349b = new TreeMap();

    /* renamed from: c */
    public transient long f118350c;

    public C30340xv(long j) {
        this.f118350c = j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f118350c = objectInputStream.available() != 0 ? objectInputStream.readLong() : 0L;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(this.f118350c);
    }

    /* renamed from: a */
    public C29993wv m4445a(int i) {
        return this.f118349b.get(Q52.m88940a(i));
    }

    /* renamed from: b */
    public long m4444b() {
        return this.f118350c;
    }

    /* renamed from: c */
    public void m4443c(int i, C29993wv c29993wv) {
        this.f118349b.put(Q52.m88940a(i), c29993wv);
    }

    /* renamed from: d */
    public C29993wv m4442d(int i, byte[] bArr, byte[] bArr2, C32813Fd3 c32813Fd3) {
        return this.f118349b.put(Q52.m88940a(i), this.f118349b.get(Q52.m88940a(i)).m6110d(bArr, bArr2, c32813Fd3));
    }

    /* renamed from: e */
    public void m4441e(JH6 jh6, long j, byte[] bArr, byte[] bArr2) {
        RH6 m100732h = jh6.m100732h();
        int m86988b = m100732h.m86988b();
        long m78612j = WH6.m78612j(j, m86988b);
        int m78613i = WH6.m78613i(j, m86988b);
        C32813Fd3 c32813Fd3 = (C32813Fd3) new C32813Fd3.C2372b().m112392h(m78612j).m106839p(m78613i).m106843l();
        int i = (1 << m86988b) - 1;
        if (m78613i < i) {
            if (m4445a(0) == null || m78613i == 0) {
                m4443c(0, new C29993wv(m100732h, bArr, bArr2, c32813Fd3));
            }
            m4442d(0, bArr, bArr2, c32813Fd3);
        }
        for (int i2 = 1; i2 < jh6.m100738b(); i2++) {
            int m78613i2 = WH6.m78613i(m78612j, m86988b);
            m78612j = WH6.m78612j(m78612j, m86988b);
            C32813Fd3 c32813Fd32 = (C32813Fd3) new C32813Fd3.C2372b().m112393g(i2).m112392h(m78612j).m106839p(m78613i2).m106843l();
            if (this.f118349b.get(Integer.valueOf(i2)) == null || WH6.m78608n(j, m86988b, i2)) {
                this.f118349b.put(Integer.valueOf(i2), new C29993wv(m100732h, bArr, bArr2, c32813Fd32));
            }
            if (m78613i2 < i && WH6.m78609m(j, m86988b, i2)) {
                m4442d(i2, bArr, bArr2, c32813Fd32);
            }
        }
    }

    /* renamed from: f */
    public C30340xv m4440f(C5448N c5448n) {
        C30340xv c30340xv = new C30340xv(this.f118350c);
        for (Integer num : this.f118349b.keySet()) {
            c30340xv.f118349b.put(num, this.f118349b.get(num).m6106h(c5448n));
        }
        return c30340xv;
    }

    public C30340xv(C30340xv c30340xv, long j) {
        for (Integer num : c30340xv.f118349b.keySet()) {
            this.f118349b.put(num, new C29993wv(c30340xv.f118349b.get(num)));
        }
        this.f118350c = j;
    }

    public C30340xv(JH6 jh6, long j, byte[] bArr, byte[] bArr2) {
        this.f118350c = (1 << jh6.m100739a()) - 1;
        for (long j2 = 0; j2 < j; j2++) {
            m4441e(jh6, j2, bArr, bArr2);
        }
    }
}
