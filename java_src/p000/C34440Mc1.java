package p000;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p000.InterfaceC44592lc1;
/* renamed from: Mc1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34440Mc1 {

    /* renamed from: a */
    public final List<B74> f23283a;

    /* renamed from: b */
    public final Set<Size> f23284b;

    public C34440Mc1(List<B74> list) {
        ArrayList arrayList = new ArrayList();
        this.f23283a = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f23284b = m95133b(list);
    }

    /* renamed from: a */
    public InterfaceC44592lc1 m95134a(InterfaceC44592lc1 interfaceC44592lc1) {
        if (interfaceC44592lc1 == null) {
            return null;
        }
        if (!m95132c()) {
            return interfaceC44592lc1;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC44592lc1.AbstractC25739c abstractC25739c : interfaceC44592lc1.mo6190d()) {
            if (this.f23284b.contains(new Size(abstractC25739c.mo4511k(), abstractC25739c.mo4514h()))) {
                arrayList.add(abstractC25739c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC44592lc1.AbstractC25738b.m27094e(interfaceC44592lc1.mo6191c(), interfaceC44592lc1.mo6193a(), interfaceC44592lc1.mo6192b(), arrayList);
    }

    /* renamed from: b */
    public final Set<Size> m95133b(List<B74> list) {
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet(list.get(0).mo81929c());
            for (int i = 1; i < list.size(); i++) {
                hashSet.retainAll(list.get(i).mo81929c());
            }
            return hashSet;
        }
        return Collections.emptySet();
    }

    /* renamed from: c */
    public boolean m95132c() {
        return !this.f23283a.isEmpty();
    }

    /* renamed from: d */
    public boolean m95131d(InterfaceC44592lc1 interfaceC44592lc1) {
        if (interfaceC44592lc1 == null) {
            return false;
        }
        if (!m95132c()) {
            return !interfaceC44592lc1.mo6190d().isEmpty();
        }
        for (InterfaceC44592lc1.AbstractC25739c abstractC25739c : interfaceC44592lc1.mo6190d()) {
            if (this.f23284b.contains(new Size(abstractC25739c.mo4511k(), abstractC25739c.mo4514h()))) {
                return true;
            }
        }
        return false;
    }
}
