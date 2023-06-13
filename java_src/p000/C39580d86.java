package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: d86  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C39580d86 {

    /* renamed from: a */
    public final List<C19681a<?, ?>> f76166a = new ArrayList();

    /* renamed from: d86$a */
    /* loaded from: classes5.dex */
    public static final class C19681a<Z, R> {

        /* renamed from: a */
        public final Class<Z> f76167a;

        /* renamed from: b */
        public final Class<R> f76168b;

        /* renamed from: c */
        public final InterfaceC49192tM4<Z, R> f76169c;

        public C19681a(Class<Z> cls, Class<R> cls2, InterfaceC49192tM4<Z, R> interfaceC49192tM4) {
            this.f76167a = cls;
            this.f76168b = cls2;
            this.f76169c = interfaceC49192tM4;
        }

        /* renamed from: a */
        public boolean m44577a(Class<?> cls, Class<?> cls2) {
            return this.f76167a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f76168b);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> InterfaceC49192tM4<Z, R> m44580a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C41652ge6.m37937b();
        }
        for (C19681a<?, ?> c19681a : this.f76166a) {
            if (c19681a.m44577a(cls, cls2)) {
                return (InterfaceC49192tM4<Z, R>) c19681a.f76169c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> m44579b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C19681a<?, ?> c19681a : this.f76166a) {
            if (c19681a.m44577a(cls, cls2) && !arrayList.contains(c19681a.f76168b)) {
                arrayList.add(c19681a.f76168b);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void m44578c(Class<Z> cls, Class<R> cls2, InterfaceC49192tM4<Z, R> interfaceC49192tM4) {
        this.f76166a.add(new C19681a<>(cls, cls2, interfaceC49192tM4));
    }
}
