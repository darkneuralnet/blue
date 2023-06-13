package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: Nc1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C34674Nc1 {

    /* renamed from: a */
    public final List<C5613a<?>> f24847a = new ArrayList();

    /* renamed from: Nc1$a */
    /* loaded from: classes5.dex */
    public static final class C5613a<T> {

        /* renamed from: a */
        public final Class<T> f24848a;

        /* renamed from: b */
        public final InterfaceC45175mb1<T> f24849b;

        public C5613a(Class<T> cls, InterfaceC45175mb1<T> interfaceC45175mb1) {
            this.f24848a = cls;
            this.f24849b = interfaceC45175mb1;
        }

        /* renamed from: a */
        public boolean m93704a(Class<?> cls) {
            return this.f24848a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void m93706a(Class<T> cls, InterfaceC45175mb1<T> interfaceC45175mb1) {
        this.f24847a.add(new C5613a<>(cls, interfaceC45175mb1));
    }

    /* renamed from: b */
    public synchronized <T> InterfaceC45175mb1<T> m93705b(Class<T> cls) {
        for (C5613a<?> c5613a : this.f24847a) {
            if (c5613a.m93704a(cls)) {
                return (InterfaceC45175mb1<T>) c5613a.f24849b;
            }
        }
        return null;
    }
}
