package p000;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: ME */
/* loaded from: classes8.dex */
public class C5258ME implements InterfaceC41482gM2 {

    /* renamed from: d */
    public static String f22893d = "[ ";

    /* renamed from: e */
    public static String f22894e = " ]";

    /* renamed from: f */
    public static String f22895f = ", ";
    private static final long serialVersionUID = -2849567615646933777L;

    /* renamed from: b */
    public final String f22896b;

    /* renamed from: c */
    public List<InterfaceC41482gM2> f22897c = new CopyOnWriteArrayList();

    public C5258ME(String str) {
        if (str != null) {
            this.f22896b = str;
            return;
        }
        throw new IllegalArgumentException("A marker name cannot be null");
    }

    /* renamed from: a */
    public boolean m95485a() {
        return this.f22897c.size() > 0;
    }

    /* renamed from: b */
    public Iterator<InterfaceC41482gM2> m95484b() {
        return this.f22897c.iterator();
    }

    @Override // p000.InterfaceC41482gM2
    public boolean contains(String str) {
        if (str != null) {
            if (this.f22896b.equals(str)) {
                return true;
            }
            if (m95485a()) {
                for (InterfaceC41482gM2 interfaceC41482gM2 : this.f22897c) {
                    if (interfaceC41482gM2.contains(str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        throw new IllegalArgumentException("Other cannot be null");
    }

    @Override // p000.InterfaceC41482gM2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC41482gM2)) {
            return false;
        }
        return this.f22896b.equals(((InterfaceC41482gM2) obj).getName());
    }

    @Override // p000.InterfaceC41482gM2
    public String getName() {
        return this.f22896b;
    }

    public int hashCode() {
        return this.f22896b.hashCode();
    }

    public String toString() {
        if (!m95485a()) {
            return getName();
        }
        Iterator<InterfaceC41482gM2> m95484b = m95484b();
        StringBuilder sb = new StringBuilder(getName());
        sb.append(' ');
        sb.append(f22893d);
        while (m95484b.hasNext()) {
            sb.append(m95484b.next().getName());
            if (m95484b.hasNext()) {
                sb.append(f22895f);
            }
        }
        sb.append(f22894e);
        return sb.toString();
    }

    @Override // p000.InterfaceC41482gM2
    /* renamed from: z2 */
    public boolean mo39595z2(InterfaceC41482gM2 interfaceC41482gM2) {
        if (interfaceC41482gM2 != null) {
            if (equals(interfaceC41482gM2)) {
                return true;
            }
            if (m95485a()) {
                for (InterfaceC41482gM2 interfaceC41482gM22 : this.f22897c) {
                    if (interfaceC41482gM22.mo39595z2(interfaceC41482gM2)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        throw new IllegalArgumentException("Other cannot be null");
    }
}
