package p000;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
/* renamed from: mv */
/* loaded from: classes8.dex */
public class C26289mv implements PrivateKey {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public short[][] f99019b;

    /* renamed from: c */
    public short[] f99020c;

    /* renamed from: d */
    public short[][] f99021d;

    /* renamed from: e */
    public short[] f99022e;

    /* renamed from: f */
    public C41728gm2[] f99023f;

    /* renamed from: g */
    public int[] f99024g;

    public C26289mv(C37575Zm4 c37575Zm4) {
        this(c37575Zm4.m72537c(), c37575Zm4.m72539a(), c37575Zm4.m72536d(), c37575Zm4.m72538b(), c37575Zm4.m72534f(), c37575Zm4.m72535e());
    }

    /* renamed from: a */
    public short[] m24714a() {
        return this.f99020c;
    }

    /* renamed from: b */
    public short[] m24713b() {
        return this.f99022e;
    }

    /* renamed from: c */
    public short[][] m24712c() {
        return this.f99019b;
    }

    /* renamed from: d */
    public short[][] m24711d() {
        return this.f99021d;
    }

    /* renamed from: e */
    public C41728gm2[] m24710e() {
        return this.f99023f;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C26289mv)) {
            return false;
        }
        C26289mv c26289mv = (C26289mv) obj;
        boolean z = ((((C39351cn4.m60870j(this.f99019b, c26289mv.m24712c())) && C39351cn4.m60870j(this.f99021d, c26289mv.m24711d())) && C39351cn4.m60871i(this.f99020c, c26289mv.m24714a())) && C39351cn4.m60871i(this.f99022e, c26289mv.m24713b())) && Arrays.equals(this.f99024g, c26289mv.m24709f());
        if (this.f99023f.length != c26289mv.m24710e().length) {
            return false;
        }
        for (int length = this.f99023f.length - 1; length >= 0; length--) {
            z &= this.f99023f[length].equals(c26289mv.m24710e()[length]);
        }
        return z;
    }

    /* renamed from: f */
    public int[] m24709f() {
        return this.f99024g;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new C44301l64(new C2675G9(BD3.f2070a, TF0.f35039b), new C37341Ym4(this.f99019b, this.f99020c, this.f99021d, this.f99022e, this.f99024g, this.f99023f)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        int length = (((((((((this.f99023f.length * 37) + C0210Ao.m115239p(this.f99019b)) * 37) + C0210Ao.m115240o(this.f99020c)) * 37) + C0210Ao.m115239p(this.f99021d)) * 37) + C0210Ao.m115240o(this.f99022e)) * 37) + C0210Ao.m115241n(this.f99024g);
        for (int length2 = this.f99023f.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.f99023f[length2].hashCode();
        }
        return length;
    }

    public C26289mv(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C41728gm2[] c41728gm2Arr) {
        this.f99019b = sArr;
        this.f99020c = sArr2;
        this.f99021d = sArr3;
        this.f99022e = sArr4;
        this.f99024g = iArr;
        this.f99023f = c41728gm2Arr;
    }
}
