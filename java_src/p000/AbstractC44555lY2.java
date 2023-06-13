package p000;

import java.io.ObjectStreamException;
import java.io.Serializable;
/* renamed from: lY2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44555lY2 implements InterfaceC53103zx2, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    /* renamed from: b */
    public String f96310b;

    @Override // p000.InterfaceC53103zx2
    public String getName() {
        return this.f96310b;
    }

    public Object readResolve() throws ObjectStreamException {
        return C34162Kx2.m98061j(getName());
    }
}
