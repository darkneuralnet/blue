package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: eG */
/* loaded from: classes6.dex */
public abstract class AbstractC19998eG<T> {

    /* renamed from: c */
    public static ConcurrentHashMap<Class<?>, AbstractC19998eG<?>> f78171c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public HashMap<String, C29358v2> f78172a;

    /* renamed from: b */
    public C29358v2[] f78173b;

    /* renamed from: a */
    public static void m43069a(AbstractC19998eG<?> abstractC19998eG, HashMap<String, String> hashMap) {
        if (hashMap == null) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            C29358v2 c29358v2 = abstractC19998eG.f78172a.get(entry.getValue());
            if (c29358v2 != null) {
                hashMap2.put(entry.getValue(), c29358v2);
            }
        }
        abstractC19998eG.f78172a.putAll(hashMap2);
    }

    /* renamed from: b */
    public static <P> AbstractC19998eG<P> m43068b(Class<P> cls, InterfaceC36150Tk1 interfaceC36150Tk1) {
        String concat;
        Class<?> cls2;
        AbstractC19998eG<P> abstractC19998eG = (AbstractC19998eG<P>) f78171c.get(cls);
        if (abstractC19998eG != null) {
            return abstractC19998eG;
        }
        C29358v2[] m116217b = C0000A.m116217b(cls, interfaceC36150Tk1);
        String name = cls.getName();
        if (name.startsWith("java.util.")) {
            concat = "com.nimbusds.jose.shaded.asm." + name + "AccAccess";
        } else {
            concat = name.concat("AccAccess");
        }
        C47283q81 c47283q81 = new C47283q81(cls.getClassLoader());
        try {
            cls2 = c47283q81.loadClass(concat);
        } catch (ClassNotFoundException unused) {
            cls2 = null;
        }
        LinkedList<Class<?>> m43065e = m43065e(cls);
        if (cls2 == null) {
            C20342fG c20342fG = new C20342fG(cls, m116217b, c47283q81);
            Iterator<Class<?>> it = m43065e.iterator();
            while (it.hasNext()) {
                c20342fG.m41642b(C20791gG.f81859a.get(it.next()));
            }
            cls2 = c20342fG.m41641c();
        }
        try {
            AbstractC19998eG<P> abstractC19998eG2 = (AbstractC19998eG) cls2.newInstance();
            abstractC19998eG2.m43064f(m116217b);
            f78171c.putIfAbsent(cls, abstractC19998eG2);
            Iterator<Class<?>> it2 = m43065e.iterator();
            while (it2.hasNext()) {
                m43069a(abstractC19998eG2, C20791gG.f81860b.get(it2.next()));
            }
            return abstractC19998eG2;
        } catch (Exception e) {
            throw new RuntimeException("Error constructing accessor class: " + concat, e);
        }
    }

    /* renamed from: e */
    public static LinkedList<Class<?>> m43065e(Class<?> cls) {
        LinkedList<Class<?>> linkedList = new LinkedList<>();
        while (cls != null && !cls.equals(Object.class)) {
            linkedList.addLast(cls);
            for (Class<?> cls2 : cls.getInterfaces()) {
                linkedList.addLast(cls2);
            }
            cls = cls.getSuperclass();
        }
        linkedList.addLast(Object.class);
        return linkedList;
    }

    /* renamed from: c */
    public abstract Object m43067c(T t, int i);

    /* renamed from: d */
    public C29358v2[] m43066d() {
        return this.f78173b;
    }

    /* renamed from: f */
    public void m43064f(C29358v2[] c29358v2Arr) {
        this.f78173b = c29358v2Arr;
        this.f78172a = new HashMap<>();
        int length = c29358v2Arr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C29358v2 c29358v2 = c29358v2Arr[i];
            c29358v2.f113361d = i2;
            this.f78172a.put(c29358v2.m9359b(), c29358v2);
            i++;
            i2++;
        }
    }
}
