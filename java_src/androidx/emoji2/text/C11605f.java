package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
/* renamed from: androidx.emoji2.text.f */
/* loaded from: classes.dex */
public final class C11605f {

    /* renamed from: a */
    public final MT2 f54475a;

    /* renamed from: b */
    public final char[] f54476b;

    /* renamed from: c */
    public final C11606a f54477c = new C11606a(1024);

    /* renamed from: d */
    public final Typeface f54478d;

    /* renamed from: androidx.emoji2.text.f$a */
    /* loaded from: classes.dex */
    public static class C11606a {

        /* renamed from: a */
        public final SparseArray<C11606a> f54479a;

        /* renamed from: b */
        public C51711xc6 f54480b;

        private C11606a() {
            this(1);
        }

        /* renamed from: a */
        public C11606a m67448a(int i) {
            SparseArray<C11606a> sparseArray = this.f54479a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* renamed from: b */
        public final C51711xc6 m67447b() {
            return this.f54480b;
        }

        /* renamed from: c */
        public void m67446c(C51711xc6 c51711xc6, int i, int i2) {
            C11606a m67448a = m67448a(c51711xc6.m4945b(i));
            if (m67448a == null) {
                m67448a = new C11606a();
                this.f54479a.put(c51711xc6.m4945b(i), m67448a);
            }
            if (i2 > i) {
                m67448a.m67446c(c51711xc6, i + 1, i2);
            } else {
                m67448a.f54480b = c51711xc6;
            }
        }

        public C11606a(int i) {
            this.f54479a = new SparseArray<>(i);
        }
    }

    public C11605f(Typeface typeface, MT2 mt2) {
        this.f54478d = typeface;
        this.f54475a = mt2;
        this.f54476b = new char[mt2.m95286k() * 2];
        m67456a(mt2);
    }

    /* renamed from: b */
    public static C11605f m67455b(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            C40152e66.m43277a("EmojiCompat.MetadataRepo.create");
            return new C11605f(typeface, NT2.m93871b(byteBuffer));
        } finally {
            C40152e66.m43276b();
        }
    }

    /* renamed from: a */
    public final void m67456a(MT2 mt2) {
        int m95286k = mt2.m95286k();
        for (int i = 0; i < m95286k; i++) {
            C51711xc6 c51711xc6 = new C51711xc6(this, i);
            Character.toChars(c51711xc6.m4941f(), this.f54476b, i * 2);
            m67449h(c51711xc6);
        }
    }

    /* renamed from: c */
    public char[] m67454c() {
        return this.f54476b;
    }

    /* renamed from: d */
    public MT2 m67453d() {
        return this.f54475a;
    }

    /* renamed from: e */
    public int m67452e() {
        return this.f54475a.m95285l();
    }

    /* renamed from: f */
    public C11606a m67451f() {
        return this.f54477c;
    }

    /* renamed from: g */
    public Typeface m67450g() {
        return this.f54478d;
    }

    /* renamed from: h */
    public void m67449h(C51711xc6 c51711xc6) {
        boolean z;
        HZ3.m103730h(c51711xc6, "emoji metadata cannot be null");
        if (c51711xc6.m4944c() > 0) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "invalid metadata codepoint length");
        this.f54477c.m67446c(c51711xc6, 0, c51711xc6.m4944c() - 1);
    }
}
