package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.InterfaceC17126a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.bumptech.glide.load.data.b */
/* loaded from: classes5.dex */
public class C17128b {

    /* renamed from: b */
    public static final InterfaceC17126a.InterfaceC17127a<?> f69163b = new C17129a();

    /* renamed from: a */
    public final Map<Class<?>, InterfaceC17126a.InterfaceC17127a<?>> f69164a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.b$a */
    /* loaded from: classes5.dex */
    public class C17129a implements InterfaceC17126a.InterfaceC17127a<Object> {
        @Override // com.bumptech.glide.load.data.InterfaceC17126a.InterfaceC17127a
        /* renamed from: a */
        public Class<Object> mo53089a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.InterfaceC17126a.InterfaceC17127a
        /* renamed from: b */
        public InterfaceC17126a<Object> mo53088b(Object obj) {
            return new C17130b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.b$b */
    /* loaded from: classes5.dex */
    public static final class C17130b implements InterfaceC17126a<Object> {

        /* renamed from: a */
        public final Object f69165a;

        public C17130b(Object obj) {
            this.f69165a = obj;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC17126a
        /* renamed from: a */
        public Object mo53092a() {
            return this.f69165a;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC17126a
        public void cleanup() {
        }
    }

    /* renamed from: a */
    public synchronized <T> InterfaceC17126a<T> m53094a(T t) {
        InterfaceC17126a.InterfaceC17127a<?> interfaceC17127a;
        C52865zZ3.m1111d(t);
        interfaceC17127a = this.f69164a.get(t.getClass());
        if (interfaceC17127a == null) {
            Iterator<InterfaceC17126a.InterfaceC17127a<?>> it = this.f69164a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC17126a.InterfaceC17127a<?> next = it.next();
                if (next.mo53089a().isAssignableFrom(t.getClass())) {
                    interfaceC17127a = next;
                    break;
                }
            }
        }
        if (interfaceC17127a == null) {
            interfaceC17127a = f69163b;
        }
        return (InterfaceC17126a<T>) interfaceC17127a.mo53088b(t);
    }

    /* renamed from: b */
    public synchronized void m53093b(InterfaceC17126a.InterfaceC17127a<?> interfaceC17127a) {
        this.f69164a.put(interfaceC17127a.mo53089a(), interfaceC17127a);
    }
}
