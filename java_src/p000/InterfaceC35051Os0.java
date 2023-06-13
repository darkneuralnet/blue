package p000;

import java.util.Set;
/* renamed from: Os0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC35051Os0 {
    /* renamed from: a */
    <T> X94<Set<T>> mo42454a(C52292yb4<T> c52292yb4);

    /* renamed from: b */
    default <T> Set<T> m91274b(Class<T> cls) {
        return mo85621g(C52292yb4.m3202b(cls));
    }

    /* renamed from: c */
    default <T> T mo85623c(C52292yb4<T> c52292yb4) {
        X94<T> mo42452f = mo42452f(c52292yb4);
        if (mo42452f == null) {
            return null;
        }
        return mo42452f.get();
    }

    /* renamed from: d */
    default <T> X94<T> mo85622d(Class<T> cls) {
        return mo42452f(C52292yb4.m3202b(cls));
    }

    /* renamed from: e */
    <T> InterfaceC41597gZ0<T> mo42453e(C52292yb4<T> c52292yb4);

    /* renamed from: f */
    <T> X94<T> mo42452f(C52292yb4<T> c52292yb4);

    /* renamed from: g */
    default <T> Set<T> mo85621g(C52292yb4<T> c52292yb4) {
        return mo42454a(c52292yb4).get();
    }

    default <T> T get(Class<T> cls) {
        return (T) mo85623c(C52292yb4.m3202b(cls));
    }

    /* renamed from: h */
    default <T> InterfaceC41597gZ0<T> mo85620h(Class<T> cls) {
        return mo42453e(C52292yb4.m3202b(cls));
    }
}
