package p000;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.UByte;
import okhttp3.HttpUrl;
import p000.C0210Ao;
/* renamed from: W */
/* loaded from: classes8.dex */
public abstract class AbstractC8888W extends AbstractC7305S implements Iterable {

    /* renamed from: b */
    public final InterfaceC1693E[] f40179b;

    /* renamed from: c */
    public final boolean f40180c;

    /* renamed from: W$a */
    /* loaded from: classes8.dex */
    public class C8889a implements Enumeration {

        /* renamed from: a */
        public int f40181a = 0;

        public C8889a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f40181a < AbstractC8888W.this.f40179b.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i = this.f40181a;
            InterfaceC1693E[] interfaceC1693EArr = AbstractC8888W.this.f40179b;
            if (i < interfaceC1693EArr.length) {
                this.f40181a = i + 1;
                return interfaceC1693EArr[i];
            }
            throw new NoSuchElementException();
        }
    }

    public AbstractC8888W() {
        this.f40179b = C2042F.f8407d;
        this.f40180c = true;
    }

    /* renamed from: A */
    public static AbstractC8888W m79015A(AbstractC10088Z abstractC10088Z, boolean z) {
        if (z) {
            if (abstractC10088Z.m73927D()) {
                return m79014C(abstractC10088Z.m73929A());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        AbstractC7305S m73929A = abstractC10088Z.m73929A();
        if (abstractC10088Z.m73927D()) {
            return abstractC10088Z instanceof C7001Qv ? new C6205Ov(m73929A) : new C46763pG0(m73929A);
        } else if (m73929A instanceof AbstractC8888W) {
            AbstractC8888W abstractC8888W = (AbstractC8888W) m73929A;
            return abstractC10088Z instanceof C7001Qv ? abstractC8888W : (AbstractC8888W) abstractC8888W.mo16142y();
        } else if (m73929A instanceof AbstractC8166U) {
            InterfaceC1693E[] mo35870D = ((AbstractC8166U) m73929A).mo35870D();
            return abstractC10088Z instanceof C7001Qv ? new C6205Ov(false, mo35870D) : new C46763pG0(false, mo35870D);
        } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + abstractC10088Z.getClass().getName());
        }
    }

    /* renamed from: C */
    public static AbstractC8888W m79014C(Object obj) {
        if (obj == null || (obj instanceof AbstractC8888W)) {
            return (AbstractC8888W) obj;
        }
        if (obj instanceof InterfaceC9262X) {
            return m79014C(((InterfaceC9262X) obj).mo13850c());
        }
        if (obj instanceof byte[]) {
            try {
                return m79014C(AbstractC7305S.m86134v((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct set from byte[]: " + e.getMessage());
            }
        }
        if (obj instanceof InterfaceC1693E) {
            AbstractC7305S mo13850c = ((InterfaceC1693E) obj).mo13850c();
            if (mo13850c instanceof AbstractC8888W) {
                return (AbstractC8888W) mo13850c;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    /* renamed from: E */
    public static boolean m79012E(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & (-33);
        int i2 = bArr2[0] & (-33);
        if (i != i2) {
            return i < i2;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < min; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & UByte.MAX_VALUE) < (b2 & UByte.MAX_VALUE);
            }
        }
        return (bArr[min] & UByte.MAX_VALUE) <= (bArr2[min] & UByte.MAX_VALUE);
    }

    /* renamed from: F */
    public static void m79011F(InterfaceC1693E[] interfaceC1693EArr) {
        int length = interfaceC1693EArr.length;
        if (length < 2) {
            return;
        }
        InterfaceC1693E interfaceC1693E = interfaceC1693EArr[0];
        InterfaceC1693E interfaceC1693E2 = interfaceC1693EArr[1];
        byte[] m79009z = m79009z(interfaceC1693E);
        byte[] m79009z2 = m79009z(interfaceC1693E2);
        if (m79012E(m79009z2, m79009z)) {
            interfaceC1693E2 = interfaceC1693E;
            interfaceC1693E = interfaceC1693E2;
            m79009z2 = m79009z;
            m79009z = m79009z2;
        }
        for (int i = 2; i < length; i++) {
            InterfaceC1693E interfaceC1693E3 = interfaceC1693EArr[i];
            byte[] m79009z3 = m79009z(interfaceC1693E3);
            if (m79012E(m79009z2, m79009z3)) {
                interfaceC1693EArr[i - 2] = interfaceC1693E;
                interfaceC1693E = interfaceC1693E2;
                m79009z = m79009z2;
                interfaceC1693E2 = interfaceC1693E3;
                m79009z2 = m79009z3;
            } else if (m79012E(m79009z, m79009z3)) {
                interfaceC1693EArr[i - 2] = interfaceC1693E;
                interfaceC1693E = interfaceC1693E3;
                m79009z = m79009z3;
            } else {
                int i2 = i - 1;
                while (true) {
                    i2--;
                    if (i2 <= 0) {
                        break;
                    }
                    InterfaceC1693E interfaceC1693E4 = interfaceC1693EArr[i2 - 1];
                    if (m79012E(m79009z(interfaceC1693E4), m79009z3)) {
                        break;
                    }
                    interfaceC1693EArr[i2] = interfaceC1693E4;
                }
                interfaceC1693EArr[i2] = interfaceC1693E3;
            }
        }
        interfaceC1693EArr[length - 2] = interfaceC1693E;
        interfaceC1693EArr[length - 1] = interfaceC1693E2;
    }

    /* renamed from: z */
    public static byte[] m79009z(InterfaceC1693E interfaceC1693E) {
        try {
            return interfaceC1693E.mo13850c().m96022h("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    /* renamed from: D */
    public Enumeration m79013D() {
        return new C8889a();
    }

    /* renamed from: G */
    public InterfaceC1693E[] m79010G() {
        return C2042F.m108150b(this.f40179b);
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        int length = this.f40179b.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += this.f40179b[length].mo13850c().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC1693E> iterator() {
        return new C0210Ao.C0211a(m79010G());
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof AbstractC8888W) {
            AbstractC8888W abstractC8888W = (AbstractC8888W) abstractC7305S;
            int size = size();
            if (abstractC8888W.size() != size) {
                return false;
            }
            C37851aG0 c37851aG0 = (C37851aG0) mo35868x();
            C37851aG0 c37851aG02 = (C37851aG0) abstractC8888W.mo35868x();
            for (int i = 0; i < size; i++) {
                AbstractC7305S mo13850c = c37851aG0.f40179b[i].mo13850c();
                AbstractC7305S mo13850c2 = c37851aG02.f40179b[i].mo13850c();
                if (mo13850c != mo13850c2 && !mo13850c.mo39779j(mo13850c2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int size() {
        return this.f40179b.length;
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.f40179b[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    @Override // p000.AbstractC7305S
    /* renamed from: w */
    public boolean mo16143w() {
        return true;
    }

    @Override // p000.AbstractC7305S
    /* renamed from: x */
    public AbstractC7305S mo35868x() {
        InterfaceC1693E[] interfaceC1693EArr;
        if (this.f40180c) {
            interfaceC1693EArr = this.f40179b;
        } else {
            interfaceC1693EArr = (InterfaceC1693E[]) this.f40179b.clone();
            m79011F(interfaceC1693EArr);
        }
        return new C37851aG0(true, interfaceC1693EArr);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return new C46763pG0(this.f40180c, this.f40179b);
    }

    public AbstractC8888W(InterfaceC1693E interfaceC1693E) {
        if (interfaceC1693E == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.f40179b = new InterfaceC1693E[]{interfaceC1693E};
        this.f40180c = true;
    }

    public AbstractC8888W(C2042F c2042f, boolean z) {
        InterfaceC1693E[] m108145g;
        if (c2042f == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z || c2042f.m108146f() < 2) {
            m108145g = c2042f.m108145g();
        } else {
            m108145g = c2042f.m108149c();
            m79011F(m108145g);
        }
        this.f40179b = m108145g;
        this.f40180c = z || m108145g.length < 2;
    }

    public AbstractC8888W(boolean z, InterfaceC1693E[] interfaceC1693EArr) {
        this.f40179b = interfaceC1693EArr;
        this.f40180c = z || interfaceC1693EArr.length < 2;
    }
}
