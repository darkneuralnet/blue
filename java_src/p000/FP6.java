package p000;

import java.util.Iterator;
import java.util.LinkedList;
/* renamed from: FP6 */
/* loaded from: classes5.dex */
public final class FP6 implements InterfaceC46403of3 {

    /* renamed from: a */
    public final /* synthetic */ AbstractC43376jZ0 f9338a;

    public FP6(AbstractC43376jZ0 abstractC43376jZ0) {
        this.f9338a = abstractC43376jZ0;
    }

    @Override // p000.InterfaceC46403of3
    /* renamed from: a */
    public final void mo20683a(InterfaceC31759Aq2 interfaceC31759Aq2) {
        LinkedList linkedList;
        LinkedList linkedList2;
        InterfaceC31759Aq2 interfaceC31759Aq22;
        this.f9338a.f92922a = interfaceC31759Aq2;
        linkedList = this.f9338a.f92924c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            interfaceC31759Aq22 = this.f9338a.f92922a;
            ((InterfaceC39133cQ6) it.next()).mo61415a(interfaceC31759Aq22);
        }
        linkedList2 = this.f9338a.f92924c;
        linkedList2.clear();
        this.f9338a.f92923b = null;
    }
}
