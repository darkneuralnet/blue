package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;
/* renamed from: Iv */
/* loaded from: classes8.dex */
public class C3812Iv extends AbstractC5803O {

    /* renamed from: c */
    public final int f16453c;

    /* renamed from: d */
    public final AbstractC5803O[] f16454d;

    /* renamed from: Iv$a */
    /* loaded from: classes8.dex */
    public class C3813a implements Enumeration {

        /* renamed from: a */
        public int f16455a = 0;

        public C3813a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f16455a < C3812Iv.this.f25500b.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i = this.f16455a;
            C3812Iv c3812Iv = C3812Iv.this;
            byte[] bArr = c3812Iv.f25500b;
            if (i < bArr.length) {
                int min = Math.min(bArr.length - i, c3812Iv.f16453c);
                byte[] bArr2 = new byte[min];
                System.arraycopy(C3812Iv.this.f25500b, this.f16455a, bArr2, 0, min);
                this.f16455a += min;
                return new VF0(bArr2);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: Iv$b */
    /* loaded from: classes8.dex */
    public class C3814b implements Enumeration {

        /* renamed from: a */
        public int f16457a = 0;

        public C3814b() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f16457a < C3812Iv.this.f16454d.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            if (this.f16457a < C3812Iv.this.f16454d.length) {
                AbstractC5803O[] abstractC5803OArr = C3812Iv.this.f16454d;
                int i = this.f16457a;
                this.f16457a = i + 1;
                return abstractC5803OArr[i];
            }
            throw new NoSuchElementException();
        }
    }

    public C3812Iv(byte[] bArr) {
        this(bArr, 1000);
    }

    /* renamed from: F */
    public static C3812Iv m101483F(AbstractC8166U abstractC8166U) {
        int size = abstractC8166U.size();
        AbstractC5803O[] abstractC5803OArr = new AbstractC5803O[size];
        for (int i = 0; i < size; i++) {
            abstractC5803OArr[i] = AbstractC5803O.m93018A(abstractC8166U.mo35872A(i));
        }
        return new C3812Iv(abstractC5803OArr);
    }

    /* renamed from: H */
    public static byte[] m101481H(AbstractC5803O[] abstractC5803OArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != abstractC5803OArr.length; i++) {
            try {
                byteArrayOutputStream.write(abstractC5803OArr[i].m93017C());
            } catch (IOException e) {
                throw new IllegalArgumentException("exception converting octets " + e.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: G */
    public Enumeration m101482G() {
        return this.f16454d == null ? new C3813a() : new C3814b();
    }

    @Override // p000.AbstractC7305S
    /* renamed from: o */
    public void mo16145o(C6617Q c6617q, boolean z) throws IOException {
        c6617q.m89157p(z, 36, m101482G());
    }

    @Override // p000.AbstractC7305S
    /* renamed from: s */
    public int mo16144s() throws IOException {
        Enumeration m101482G = m101482G();
        int i = 0;
        while (m101482G.hasMoreElements()) {
            i += ((InterfaceC1693E) m101482G.nextElement()).mo13850c().mo16144s();
        }
        return i + 2 + 2;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return true;
    }

    public C3812Iv(byte[] bArr, int i) {
        this(bArr, null, i);
    }

    public C3812Iv(byte[] bArr, AbstractC5803O[] abstractC5803OArr, int i) {
        super(bArr);
        this.f16454d = abstractC5803OArr;
        this.f16453c = i;
    }

    public C3812Iv(AbstractC5803O[] abstractC5803OArr) {
        this(abstractC5803OArr, 1000);
    }

    public C3812Iv(AbstractC5803O[] abstractC5803OArr, int i) {
        this(m101481H(abstractC5803OArr), abstractC5803OArr, i);
    }
}
