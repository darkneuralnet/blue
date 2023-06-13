package p000;

import java.util.Arrays;
import p000.AbstractC9206Wv;
/* renamed from: ht */
/* loaded from: classes5.dex */
public final class C22780ht extends AbstractC9206Wv {

    /* renamed from: a */
    public final Iterable<AbstractC33774Jg1> f86051a;

    /* renamed from: b */
    public final byte[] f86052b;

    /* renamed from: ht$b */
    /* loaded from: classes5.dex */
    public static final class C22782b extends AbstractC9206Wv.AbstractC9207a {

        /* renamed from: a */
        public Iterable<AbstractC33774Jg1> f86053a;

        /* renamed from: b */
        public byte[] f86054b;

        @Override // p000.AbstractC9206Wv.AbstractC9207a
        /* renamed from: a */
        public AbstractC9206Wv mo35673a() {
            String str = "";
            if (this.f86053a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C22780ht(this.f86053a, this.f86054b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC9206Wv.AbstractC9207a
        /* renamed from: b */
        public AbstractC9206Wv.AbstractC9207a mo35672b(Iterable<AbstractC33774Jg1> iterable) {
            if (iterable != null) {
                this.f86053a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // p000.AbstractC9206Wv.AbstractC9207a
        /* renamed from: c */
        public AbstractC9206Wv.AbstractC9207a mo35671c(byte[] bArr) {
            this.f86054b = bArr;
            return this;
        }
    }

    @Override // p000.AbstractC9206Wv
    /* renamed from: b */
    public Iterable<AbstractC33774Jg1> mo35675b() {
        return this.f86051a;
    }

    @Override // p000.AbstractC9206Wv
    /* renamed from: c */
    public byte[] mo35674c() {
        return this.f86052b;
    }

    public boolean equals(Object obj) {
        byte[] mo35674c;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9206Wv)) {
            return false;
        }
        AbstractC9206Wv abstractC9206Wv = (AbstractC9206Wv) obj;
        if (this.f86051a.equals(abstractC9206Wv.mo35675b())) {
            byte[] bArr = this.f86052b;
            if (abstractC9206Wv instanceof C22780ht) {
                mo35674c = ((C22780ht) abstractC9206Wv).f86052b;
            } else {
                mo35674c = abstractC9206Wv.mo35674c();
            }
            if (Arrays.equals(bArr, mo35674c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f86051a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f86052b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f86051a + ", extras=" + Arrays.toString(this.f86052b) + "}";
    }

    public C22780ht(Iterable<AbstractC33774Jg1> iterable, byte[] bArr) {
        this.f86051a = iterable;
        this.f86052b = bArr;
    }
}
