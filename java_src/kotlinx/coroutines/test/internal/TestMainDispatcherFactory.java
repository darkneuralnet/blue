package kotlinx.coroutines.test.internal;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p000.InterfaceC47358qG2;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"Lkotlinx/coroutines/test/internal/TestMainDispatcherFactory;", "LqG2;", "", "allFactories", "LpG2;", "c", "", C17296a.f69688o, "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-test"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final class TestMainDispatcherFactory implements InterfaceC47358qG2 {
    @Override // p000.InterfaceC47358qG2
    /* renamed from: a */
    public int mo12289a() {
        return Integer.MAX_VALUE;
    }

    @Override // p000.InterfaceC47358qG2
    /* renamed from: b */
    public String mo12288b() {
        return InterfaceC47358qG2.C27563a.m17711a(this);
    }

    @Override // p000.InterfaceC47358qG2
    /* renamed from: c */
    public AbstractC46765pG2 mo12287c(List<? extends InterfaceC47358qG2> list) {
        Object obj;
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((InterfaceC47358qG2) obj2) != this) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                int mo12289a = ((InterfaceC47358qG2) next).mo12289a();
                do {
                    Object next2 = it.next();
                    int mo12289a2 = ((InterfaceC47358qG2) next2).mo12289a();
                    if (mo12289a < mo12289a2) {
                        next = next2;
                        mo12289a = mo12289a2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        InterfaceC47358qG2 interfaceC47358qG2 = (InterfaceC47358qG2) obj;
        if (interfaceC47358qG2 == null) {
            interfaceC47358qG2 = C49262tU2.f110540a;
        }
        return new C44243l06(C48543sG2.m14486e(interfaceC47358qG2, arrayList));
    }
}
