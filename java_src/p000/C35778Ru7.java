package p000;

import java.util.List;
/* renamed from: Ru7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35778Ru7 extends AbstractC36012Su7 {
    public /* synthetic */ C35778Ru7(C35310Pu7 c35310Pu7) {
        super(null);
    }

    @Override // p000.AbstractC36012Su7
    /* renamed from: a */
    public final List mo84657a(Object obj, long j) {
        int i;
        InterfaceC45964nu7 interfaceC45964nu7 = (InterfaceC45964nu7) C32286Cw7.m111242k(obj, j);
        if (!interfaceC45964nu7.zzc()) {
            int size = interfaceC45964nu7.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            InterfaceC45964nu7 mo6153d = interfaceC45964nu7.mo6153d(i);
            C32286Cw7.m111229x(obj, j, mo6153d);
            return mo6153d;
        }
        return interfaceC45964nu7;
    }

    @Override // p000.AbstractC36012Su7
    /* renamed from: b */
    public final void mo84656b(Object obj, long j) {
        ((InterfaceC45964nu7) C32286Cw7.m111242k(obj, j)).zzb();
    }

    @Override // p000.AbstractC36012Su7
    /* renamed from: c */
    public final void mo84655c(Object obj, Object obj2, long j) {
        InterfaceC45964nu7 interfaceC45964nu7 = (InterfaceC45964nu7) C32286Cw7.m111242k(obj, j);
        InterfaceC45964nu7 interfaceC45964nu72 = (InterfaceC45964nu7) C32286Cw7.m111242k(obj2, j);
        int size = interfaceC45964nu7.size();
        int size2 = interfaceC45964nu72.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC45964nu7.zzc()) {
                interfaceC45964nu7 = interfaceC45964nu7.mo6153d(size2 + size);
            }
            interfaceC45964nu7.addAll(interfaceC45964nu72);
        }
        if (size > 0) {
            interfaceC45964nu72 = interfaceC45964nu7;
        }
        C32286Cw7.m111229x(obj, j, interfaceC45964nu72);
    }

    private C35778Ru7() {
        super(null);
    }
}
