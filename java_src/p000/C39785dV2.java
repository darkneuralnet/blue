package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: dV2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C39785dV2 {

    /* renamed from: a */
    public final AtomicReference<C48687sW2> f76728a = new AtomicReference<>();

    /* renamed from: b */
    public final C28385so<C48687sW2, List<Class<?>>> f76729b = new C28385so<>();

    /* renamed from: a */
    public List<Class<?>> m44213a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        C48687sW2 andSet = this.f76728a.getAndSet(null);
        if (andSet == null) {
            andSet = new C48687sW2(cls, cls2, cls3);
        } else {
            andSet.m14120a(cls, cls2, cls3);
        }
        synchronized (this.f76729b) {
            list = this.f76729b.get(andSet);
        }
        this.f76728a.set(andSet);
        return list;
    }

    /* renamed from: b */
    public void m44212b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f76729b) {
            this.f76729b.put(new C48687sW2(cls, cls2, cls3), list);
        }
    }
}
