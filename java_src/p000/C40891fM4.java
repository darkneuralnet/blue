package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: fM4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C40891fM4 {

    /* renamed from: a */
    public final List<C20365a<?>> f79916a = new ArrayList();

    /* renamed from: fM4$a */
    /* loaded from: classes5.dex */
    public static final class C20365a<T> {

        /* renamed from: a */
        public final Class<T> f79917a;

        /* renamed from: b */
        public final InterfaceC40298eM4<T> f79918b;

        public C20365a(Class<T> cls, InterfaceC40298eM4<T> interfaceC40298eM4) {
            this.f79917a = cls;
            this.f79918b = interfaceC40298eM4;
        }

        /* renamed from: a */
        public boolean m41510a(Class<?> cls) {
            return this.f79917a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void m41513a(Class<Z> cls, InterfaceC40298eM4<Z> interfaceC40298eM4) {
        this.f79916a.add(new C20365a<>(cls, interfaceC40298eM4));
    }

    /* renamed from: b */
    public synchronized <Z> InterfaceC40298eM4<Z> m41512b(Class<Z> cls) {
        int size = this.f79916a.size();
        for (int i = 0; i < size; i++) {
            C20365a<?> c20365a = this.f79916a.get(i);
            if (c20365a.m41510a(cls)) {
                return (InterfaceC40298eM4<Z>) c20365a.f79918b;
            }
        }
        return null;
    }

    /* renamed from: c */
    public synchronized <Z> void m41511c(Class<Z> cls, InterfaceC40298eM4<Z> interfaceC40298eM4) {
        this.f79916a.add(0, new C20365a<>(cls, interfaceC40298eM4));
    }
}
