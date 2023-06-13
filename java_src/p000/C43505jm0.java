package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: jm0  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C43505jm0 {

    /* renamed from: a */
    public static final long[] f93308a = new long[0];

    /* renamed from: b */
    public static final InterfaceC42043hI6 f93309b = new C25014a();

    /* renamed from: jm0$a */
    /* loaded from: classes7.dex */
    public static class C25014a implements InterfaceC42043hI6 {
        @Override // p000.InterfaceC42043hI6
        public Object apply(Object obj) {
            return obj;
        }
    }

    private C43505jm0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <TypeT> List<TypeT> m29956a(Collection<TypeT> collection, TypeT typet, InterfaceC42636iI6<TypeT, TypeT, Boolean> interfaceC42636iI6) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection);
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((Boolean) interfaceC42636iI6.apply(arrayList.get(i), typet)).booleanValue()) {
                arrayList.set(i, typet);
                z = true;
            }
        }
        if (!z) {
            arrayList.add(typet);
        }
        return arrayList;
    }

    @SafeVarargs
    /* renamed from: b */
    public static <TypeT> List<TypeT> m29955b(List<TypeT>... listArr) {
        if (listArr != null && listArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = new CopyOnWriteArrayList(listArr).iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                if (m29948i(list)) {
                    Iterator it2 = new CopyOnWriteArrayList(list).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    /* renamed from: c */
    public static <TypeT> List<TypeT> m29954c(List<TypeT> list) {
        if (list == null) {
            return new ArrayList();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(list);
        ArrayList arrayList = new ArrayList(copyOnWriteArrayList.size());
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* renamed from: d */
    public static <KeyT, ValueT> Map<KeyT, ValueT> m29953d(Map<KeyT, ValueT> map) {
        if (map == null) {
            return new HashMap();
        }
        Map synchronizedMap = Collections.synchronizedMap(map);
        HashMap hashMap = new HashMap();
        hashMap.putAll(synchronizedMap);
        return hashMap;
    }

    /* renamed from: e */
    public static <TypeT> List<TypeT> m29952e(List<TypeT> list) {
        if (m29950g(list)) {
            return new ArrayList();
        }
        return list;
    }

    /* renamed from: f */
    public static <TypeT> List<TypeT> m29951f(Collection<TypeT> collection, InterfaceC42043hI6<TypeT, Boolean> interfaceC42043hI6) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (TypeT typet : collection) {
            if (interfaceC42043hI6.apply(typet).booleanValue()) {
                arrayList.add(typet);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static <TypeT> boolean m29950g(Collection<TypeT> collection) {
        return collection == null || collection.isEmpty();
    }

    /* renamed from: h */
    public static <TypeT> boolean m29949h(TypeT[] typetArr) {
        return typetArr == null || typetArr.length == 0;
    }

    /* renamed from: i */
    public static <TypeT> boolean m29948i(Collection<TypeT> collection) {
        return !m29950g(collection);
    }

    /* renamed from: j */
    public static <TypeT> boolean m29947j(TypeT[] typetArr) {
        return !m29949h(typetArr);
    }

    /* renamed from: k */
    public static <TypeT, ReturnT> List<ReturnT> m29946k(Collection<TypeT> collection, InterfaceC42043hI6<TypeT, ReturnT> interfaceC42043hI6) {
        if (collection == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (TypeT typet : collection) {
            arrayList.add(interfaceC42043hI6.apply(typet));
        }
        return arrayList;
    }

    /* renamed from: l */
    public static <TypeT> List<TypeT> m29945l(List<TypeT> list) {
        return Collections.unmodifiableList(m29952e(list));
    }
}
