package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: cM4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C39095cM4 {

    /* renamed from: a */
    public final List<String> f60442a = new ArrayList();

    /* renamed from: b */
    public final Map<String, List<C13516a<?, ?>>> f60443b = new HashMap();

    /* renamed from: cM4$a */
    /* loaded from: classes5.dex */
    public static class C13516a<T, R> {

        /* renamed from: a */
        public final Class<T> f60444a;

        /* renamed from: b */
        public final Class<R> f60445b;

        /* renamed from: c */
        public final InterfaceC38502bM4<T, R> f60446c;

        public C13516a(Class<T> cls, Class<R> cls2, InterfaceC38502bM4<T, R> interfaceC38502bM4) {
            this.f60444a = cls;
            this.f60445b = cls2;
            this.f60446c = interfaceC38502bM4;
        }

        /* renamed from: a */
        public boolean m61525a(Class<?> cls, Class<?> cls2) {
            if (this.f60444a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f60445b)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public synchronized <T, R> void m61531a(String str, InterfaceC38502bM4<T, R> interfaceC38502bM4, Class<T> cls, Class<R> cls2) {
        m61529c(str).add(new C13516a<>(cls, cls2, interfaceC38502bM4));
    }

    /* renamed from: b */
    public synchronized <T, R> List<InterfaceC38502bM4<T, R>> m61530b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f60442a) {
            List<C13516a<?, ?>> list = this.f60443b.get(str);
            if (list != null) {
                for (C13516a<?, ?> c13516a : list) {
                    if (c13516a.m61525a(cls, cls2)) {
                        arrayList.add(c13516a.f60446c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized List<C13516a<?, ?>> m61529c(String str) {
        List<C13516a<?, ?>> list;
        if (!this.f60442a.contains(str)) {
            this.f60442a.add(str);
        }
        list = this.f60443b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f60443b.put(str, list);
        }
        return list;
    }

    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> m61528d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f60442a) {
            List<C13516a<?, ?>> list = this.f60443b.get(str);
            if (list != null) {
                for (C13516a<?, ?> c13516a : list) {
                    if (c13516a.m61525a(cls, cls2) && !arrayList.contains(c13516a.f60445b)) {
                        arrayList.add(c13516a.f60445b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized <T, R> void m61527e(String str, InterfaceC38502bM4<T, R> interfaceC38502bM4, Class<T> cls, Class<R> cls2) {
        m61529c(str).add(0, new C13516a<>(cls, cls2, interfaceC38502bM4));
    }

    /* renamed from: f */
    public synchronized void m61526f(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f60442a);
        this.f60442a.clear();
        for (String str : list) {
            this.f60442a.add(str);
        }
        for (String str2 : arrayList) {
            if (!list.contains(str2)) {
                this.f60442a.add(str2);
            }
        }
    }
}
