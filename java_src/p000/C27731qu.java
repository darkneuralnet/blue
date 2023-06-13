package p000;

import java.util.Arrays;
import p000.T96;
/* renamed from: qu */
/* loaded from: classes5.dex */
public final class C27731qu extends T96 {

    /* renamed from: a */
    public final String f106043a;

    /* renamed from: b */
    public final byte[] f106044b;

    /* renamed from: c */
    public final N24 f106045c;

    /* renamed from: qu$b */
    /* loaded from: classes5.dex */
    public static final class C27733b extends T96.AbstractC7673a {

        /* renamed from: a */
        public String f106046a;

        /* renamed from: b */
        public byte[] f106047b;

        /* renamed from: c */
        public N24 f106048c;

        @Override // p000.T96.AbstractC7673a
        /* renamed from: a */
        public T96 mo16801a() {
            String str = "";
            if (this.f106046a == null) {
                str = " backendName";
            }
            if (this.f106048c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C27731qu(this.f106046a, this.f106047b, this.f106048c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.T96.AbstractC7673a
        /* renamed from: b */
        public T96.AbstractC7673a mo16800b(String str) {
            if (str != null) {
                this.f106046a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // p000.T96.AbstractC7673a
        /* renamed from: c */
        public T96.AbstractC7673a mo16799c(byte[] bArr) {
            this.f106047b = bArr;
            return this;
        }

        @Override // p000.T96.AbstractC7673a
        /* renamed from: d */
        public T96.AbstractC7673a mo16798d(N24 n24) {
            if (n24 != null) {
                this.f106048c = n24;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    @Override // p000.T96
    /* renamed from: b */
    public String mo16804b() {
        return this.f106043a;
    }

    @Override // p000.T96
    /* renamed from: c */
    public byte[] mo16803c() {
        return this.f106044b;
    }

    @Override // p000.T96
    /* renamed from: d */
    public N24 mo16802d() {
        return this.f106045c;
    }

    public boolean equals(Object obj) {
        byte[] mo16803c;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof T96)) {
            return false;
        }
        T96 t96 = (T96) obj;
        if (this.f106043a.equals(t96.mo16804b())) {
            byte[] bArr = this.f106044b;
            if (t96 instanceof C27731qu) {
                mo16803c = ((C27731qu) t96).f106044b;
            } else {
                mo16803c = t96.mo16803c();
            }
            if (Arrays.equals(bArr, mo16803c) && this.f106045c.equals(t96.mo16802d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f106043a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f106044b)) * 1000003) ^ this.f106045c.hashCode();
    }

    public C27731qu(String str, byte[] bArr, N24 n24) {
        this.f106043a = str;
        this.f106044b = bArr;
        this.f106045c = n24;
    }
}
