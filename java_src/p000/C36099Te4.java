package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: Te4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C36099Te4 {

    /* renamed from: a */
    public final List<InterfaceC35865Se4> f35820a;

    public C36099Te4(List<InterfaceC35865Se4> list) {
        this.f35820a = new ArrayList(list);
    }

    /* renamed from: a */
    public boolean m83239a(Class<? extends InterfaceC35865Se4> cls) {
        for (InterfaceC35865Se4 interfaceC35865Se4 : this.f35820a) {
            if (cls.isAssignableFrom(interfaceC35865Se4.getClass())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public <T extends InterfaceC35865Se4> T m83238b(Class<T> cls) {
        Iterator<InterfaceC35865Se4> it = this.f35820a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: c */
    public <T extends InterfaceC35865Se4> List<T> m83237c(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC35865Se4 interfaceC35865Se4 : this.f35820a) {
            if (cls.isAssignableFrom(interfaceC35865Se4.getClass())) {
                arrayList.add(interfaceC35865Se4);
            }
        }
        return arrayList;
    }
}
