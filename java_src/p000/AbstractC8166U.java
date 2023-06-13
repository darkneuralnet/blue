package p000;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;
import p000.C0210Ao;
/* renamed from: U */
/* loaded from: classes8.dex */
public abstract class AbstractC8166U extends AbstractC7305S implements Iterable {

    /* renamed from: b */
    public InterfaceC1693E[] f36590b;

    /* renamed from: U$a */
    /* loaded from: classes8.dex */
    public class C8167a implements Enumeration {

        /* renamed from: a */
        public int f36591a = 0;

        public C8167a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f36591a < AbstractC8166U.this.f36590b.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i = this.f36591a;
            InterfaceC1693E[] interfaceC1693EArr = AbstractC8166U.this.f36590b;
            if (i < interfaceC1693EArr.length) {
                this.f36591a = i + 1;
                return interfaceC1693EArr[i];
            }
            throw new NoSuchElementException();
        }
    }

    public AbstractC8166U() {
        this.f36590b = C2042F.f8407d;
    }

    /* renamed from: z */
    public static AbstractC8166U m82198z(Object obj) {
        if (obj == null || (obj instanceof AbstractC8166U)) {
            return (AbstractC8166U) obj;
        }
        if (obj instanceof InterfaceC8533V) {
            return m82198z(((InterfaceC8533V) obj).mo13850c());
        }
        if (obj instanceof byte[]) {
            try {
                return m82198z(AbstractC7305S.m86134v((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e.getMessage());
            }
        }
        if (obj instanceof InterfaceC1693E) {
            AbstractC7305S mo13850c = ((InterfaceC1693E) obj).mo13850c();
            if (mo13850c instanceof AbstractC8166U) {
                return (AbstractC8166U) mo13850c;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    /* renamed from: A */
    public InterfaceC1693E mo35872A(int i) {
        return this.f36590b[i];
    }

    /* renamed from: C */
    public Enumeration mo35871C() {
        return new C8167a();
    }

    /* renamed from: D */
    public InterfaceC1693E[] mo35870D() {
        return this.f36590b;
    }

    @Override // p000.AbstractC7305S, p000.AbstractC5142M
    public int hashCode() {
        int length = this.f36590b.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ this.f36590b[length].mo13850c().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC1693E> iterator() {
        return new C0210Ao.C0211a(this.f36590b);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: j */
    public boolean mo39779j(AbstractC7305S abstractC7305S) {
        if (abstractC7305S instanceof AbstractC8166U) {
            AbstractC8166U abstractC8166U = (AbstractC8166U) abstractC7305S;
            int size = size();
            if (abstractC8166U.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                AbstractC7305S mo13850c = this.f36590b[i].mo13850c();
                AbstractC7305S mo13850c2 = abstractC8166U.f36590b[i].mo13850c();
                if (mo13850c != mo13850c2 && !mo13850c.mo39779j(mo13850c2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int size() {
        return this.f36590b.length;
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
            stringBuffer.append(this.f36590b[i]);
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
        return new ZF0(this.f36590b, false);
    }

    @Override // p000.AbstractC7305S
    /* renamed from: y */
    public AbstractC7305S mo16142y() {
        return new C45577nG0(this.f36590b, false);
    }

    public AbstractC8166U(C2042F c2042f) {
        if (c2042f == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.f36590b = c2042f.m108145g();
    }

    public AbstractC8166U(InterfaceC1693E[] interfaceC1693EArr, boolean z) {
        this.f36590b = z ? C2042F.m108150b(interfaceC1693EArr) : interfaceC1693EArr;
    }
}
