package p000;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* renamed from: mW1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45129mW1 implements InterfaceC44546lX2, Serializable {

    /* renamed from: b */
    public static final C45129mW1 f98125b = new C45129mW1();
    private static final long serialVersionUID = 1;

    private C45129mW1() {
    }

    @Override // p000.InterfaceC38077ae6
    /* renamed from: a */
    public List<? extends InterfaceC38077ae6> mo22031a() {
        return Collections.emptyList();
    }

    @Override // p000.InterfaceC38077ae6
    /* renamed from: b */
    public InterfaceC38077ae6 mo22025b() {
        return this;
    }

    @Override // p000.InterfaceC38077ae6
    /* renamed from: c */
    public InterfaceC38077ae6 mo22030c(InterfaceC38077ae6 interfaceC38077ae6) {
        return interfaceC38077ae6;
    }

    @Override // p000.InterfaceC38077ae6
    /* renamed from: d */
    public boolean mo18701d() {
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(InterfaceC38077ae6 interfaceC38077ae6) {
        return AbstractC26779o0.f101189c.compareTo(interfaceC38077ae6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45129mW1) {
            C45129mW1 c45129mW1 = (C45129mW1) obj;
            if (mo18701d() && c45129mW1.mo18701d()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // p000.InterfaceC34742Nj6
    /* renamed from: f */
    public Number getValue() {
        return 1;
    }

    public int hashCode() {
        return Objects.hashCode(getValue());
    }
}
