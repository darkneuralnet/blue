package p000;

import java.io.Serializable;
import java.math.BigInteger;
/* renamed from: Gy */
/* loaded from: classes6.dex */
public class C2990Gy implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final String f12669b;

    public C2990Gy(String str) {
        if (str != null) {
            this.f12669b = str;
            return;
        }
        throw new IllegalArgumentException("The Base64 value must not be null");
    }

    /* renamed from: a */
    public byte[] m104549a() {
        return C3291Hy.m103160c(this.f12669b);
    }

    /* renamed from: b */
    public BigInteger m104548b() {
        return new BigInteger(1, m104549a());
    }

    /* renamed from: c */
    public String m104547c() {
        return new String(m104549a(), C48618sO5.f108725a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2990Gy) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.f12669b.hashCode();
    }

    public String toString() {
        return this.f12669b;
    }
}
