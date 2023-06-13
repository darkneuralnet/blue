package p000;

import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: Bx0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C32054Bx0 {

    /* renamed from: a */
    public static String f3090a = "ZENDESK_CONFIGURATION";

    /* renamed from: b */
    public static C32054Bx0 f3091b = new C32054Bx0();

    /* renamed from: h */
    public static C32054Bx0 m113273h() {
        return f3091b;
    }

    /* renamed from: a */
    public List<InterfaceC40057dx0> m113280a(List<InterfaceC40057dx0> list, InterfaceC40057dx0 interfaceC40057dx0) {
        ArrayList arrayList = new ArrayList(list);
        if (m113276e(list, interfaceC40057dx0.getClass()) == null) {
            arrayList.add(interfaceC40057dx0);
        }
        return arrayList;
    }

    /* renamed from: b */
    public void m113279b(Bundle bundle, InterfaceC40057dx0 interfaceC40057dx0) {
        bundle.putSerializable(f3090a, interfaceC40057dx0);
    }

    /* renamed from: c */
    public void m113278c(Intent intent, InterfaceC40057dx0 interfaceC40057dx0) {
        intent.putExtra(f3090a, interfaceC40057dx0);
    }

    /* renamed from: d */
    public void m113277d(Map<String, Object> map, InterfaceC40057dx0 interfaceC40057dx0) {
        map.put(f3090a, interfaceC40057dx0);
    }

    /* renamed from: e */
    public <E extends InterfaceC40057dx0> E m113276e(List<InterfaceC40057dx0> list, Class<E> cls) {
        Iterator<InterfaceC40057dx0> it = list.iterator();
        while (it.hasNext()) {
            E e = (E) it.next();
            if (cls.isInstance(e)) {
                return e;
            }
        }
        return null;
    }

    /* renamed from: f */
    public <E extends InterfaceC40057dx0> E m113275f(Bundle bundle, Class<E> cls) {
        if (bundle != null && bundle.containsKey(f3090a)) {
            Serializable serializable = bundle.getSerializable(f3090a);
            if (cls.isInstance(serializable)) {
                return (E) serializable;
            }
            return null;
        }
        return null;
    }

    /* renamed from: g */
    public <E extends InterfaceC40057dx0> E m113274g(Map<String, Object> map, Class<E> cls) {
        if (map != null && map.containsKey(f3090a)) {
            Object obj = map.get(f3090a);
            if (cls.isInstance(obj)) {
                return (E) obj;
            }
            return null;
        }
        return null;
    }
}
