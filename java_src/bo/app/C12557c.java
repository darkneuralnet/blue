package bo.app;

import java.util.List;
/* renamed from: bo.app.c */
/* loaded from: classes.dex */
public final class C12557c extends AbstractC12743i3 {
    public C12557c(List<InterfaceC12546b2> list) {
        super(list);
    }

    @Override // bo.app.InterfaceC12546b2
    /* renamed from: a */
    public boolean mo62577a(InterfaceC13145t2 interfaceC13145t2) {
        boolean z = false;
        for (InterfaceC12546b2 interfaceC12546b2 : this.f58639b) {
            if (!interfaceC12546b2.mo62577a(interfaceC13145t2)) {
                return false;
            }
            z = true;
        }
        return z;
    }
}
