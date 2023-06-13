package p000;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* renamed from: Cg1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32136Cg1 implements InterfaceC42734iT5, InterfaceC46354oa4 {

    /* renamed from: a */
    public final Map<Class<?>, ConcurrentHashMap<InterfaceC33540Ig1<Object>, Executor>> f4477a = new HashMap();

    /* renamed from: b */
    public Queue<C51746xg1<?>> f4478b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f4479c;

    public C32136Cg1(Executor executor) {
        this.f4479c = executor;
    }

    /* renamed from: g */
    public static /* synthetic */ void m111902g(Map.Entry entry, C51746xg1 c51746xg1) {
        ((InterfaceC33540Ig1) entry.getKey()).mo5677a(c51746xg1);
    }

    @Override // p000.InterfaceC42734iT5
    /* renamed from: a */
    public synchronized <T> void mo33867a(Class<T> cls, Executor executor, InterfaceC33540Ig1<? super T> interfaceC33540Ig1) {
        FZ3.m106946b(cls);
        FZ3.m106946b(interfaceC33540Ig1);
        FZ3.m106946b(executor);
        if (!this.f4477a.containsKey(cls)) {
            this.f4477a.put(cls, new ConcurrentHashMap<>());
        }
        this.f4477a.get(cls).put(interfaceC33540Ig1, executor);
    }

    @Override // p000.InterfaceC42734iT5
    /* renamed from: b */
    public synchronized <T> void mo33866b(Class<T> cls, InterfaceC33540Ig1<? super T> interfaceC33540Ig1) {
        FZ3.m106946b(cls);
        FZ3.m106946b(interfaceC33540Ig1);
        if (!this.f4477a.containsKey(cls)) {
            return;
        }
        ConcurrentHashMap<InterfaceC33540Ig1<Object>, Executor> concurrentHashMap = this.f4477a.get(cls);
        concurrentHashMap.remove(interfaceC33540Ig1);
        if (concurrentHashMap.isEmpty()) {
            this.f4477a.remove(cls);
        }
    }

    @Override // p000.InterfaceC42734iT5
    /* renamed from: c */
    public <T> void mo33865c(Class<T> cls, InterfaceC33540Ig1<? super T> interfaceC33540Ig1) {
        mo33867a(cls, this.f4479c, interfaceC33540Ig1);
    }

    /* renamed from: e */
    public void m111904e() {
        Queue<C51746xg1<?>> queue;
        synchronized (this) {
            queue = this.f4478b;
            if (queue != null) {
                this.f4478b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C51746xg1<?> c51746xg1 : queue) {
                m111901h(c51746xg1);
            }
        }
    }

    /* renamed from: f */
    public final synchronized Set<Map.Entry<InterfaceC33540Ig1<Object>, Executor>> m111903f(C51746xg1<?> c51746xg1) {
        Set<Map.Entry<InterfaceC33540Ig1<Object>, Executor>> entrySet;
        ConcurrentHashMap<InterfaceC33540Ig1<Object>, Executor> concurrentHashMap = this.f4477a.get(c51746xg1.m4892b());
        if (concurrentHashMap == null) {
            entrySet = Collections.emptySet();
        } else {
            entrySet = concurrentHashMap.entrySet();
        }
        return entrySet;
    }

    /* renamed from: h */
    public void m111901h(final C51746xg1<?> c51746xg1) {
        FZ3.m106946b(c51746xg1);
        synchronized (this) {
            Queue<C51746xg1<?>> queue = this.f4478b;
            if (queue != null) {
                queue.add(c51746xg1);
                return;
            }
            for (final Map.Entry<InterfaceC33540Ig1<Object>, Executor> entry : m111903f(c51746xg1)) {
                entry.getValue().execute(new Runnable() { // from class: Ag1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C32136Cg1.m111902g(entry, c51746xg1);
                    }
                });
            }
        }
    }
}
