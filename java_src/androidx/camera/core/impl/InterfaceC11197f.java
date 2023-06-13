package androidx.camera.core.impl;

import java.util.Set;
/* renamed from: androidx.camera.core.impl.f */
/* loaded from: classes.dex */
public interface InterfaceC11197f {

    /* renamed from: androidx.camera.core.impl.f$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC11198a<T> {
        /* renamed from: a */
        public static <T> AbstractC11198a<T> m69420a(String str, Class<?> cls) {
            return m69419b(str, cls, null);
        }

        /* renamed from: b */
        public static <T> AbstractC11198a<T> m69419b(String str, Class<?> cls, Object obj) {
            return new C11187a(str, cls, obj);
        }

        /* renamed from: c */
        public abstract String mo69418c();

        /* renamed from: d */
        public abstract Object mo69417d();

        /* renamed from: e */
        public abstract Class<T> mo69416e();
    }

    /* renamed from: androidx.camera.core.impl.f$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11199b {
        /* renamed from: a */
        boolean mo25218a(AbstractC11198a<?> abstractC11198a);
    }

    /* renamed from: androidx.camera.core.impl.f$c */
    /* loaded from: classes.dex */
    public enum EnumC11200c {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    /* renamed from: H */
    static boolean m69422H(EnumC11200c enumC11200c, EnumC11200c enumC11200c2) {
        EnumC11200c enumC11200c3 = EnumC11200c.ALWAYS_OVERRIDE;
        if (enumC11200c == enumC11200c3 && enumC11200c2 == enumC11200c3) {
            return true;
        }
        EnumC11200c enumC11200c4 = EnumC11200c.REQUIRED;
        if (enumC11200c == enumC11200c4 && enumC11200c2 == enumC11200c4) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    static InterfaceC11197f m69421N(InterfaceC11197f interfaceC11197f, InterfaceC11197f interfaceC11197f2) {
        C11209m m69372V;
        if (interfaceC11197f == null && interfaceC11197f2 == null) {
            return C11210n.m69367S();
        }
        if (interfaceC11197f2 != null) {
            m69372V = C11209m.m69371W(interfaceC11197f2);
        } else {
            m69372V = C11209m.m69372V();
        }
        if (interfaceC11197f != null) {
            for (AbstractC11198a<?> abstractC11198a : interfaceC11197f.mo69357g()) {
                m69372V.mo69369n(abstractC11198a, interfaceC11197f.mo69356h(abstractC11198a), interfaceC11197f.mo69363a(abstractC11198a));
            }
        }
        return C11210n.m69366T(m69372V);
    }

    /* renamed from: a */
    <ValueT> ValueT mo69363a(AbstractC11198a<ValueT> abstractC11198a);

    /* renamed from: b */
    void mo69362b(String str, InterfaceC11199b interfaceC11199b);

    /* renamed from: c */
    Set<EnumC11200c> mo69361c(AbstractC11198a<?> abstractC11198a);

    /* renamed from: d */
    <ValueT> ValueT mo69360d(AbstractC11198a<ValueT> abstractC11198a, ValueT valuet);

    /* renamed from: e */
    boolean mo69359e(AbstractC11198a<?> abstractC11198a);

    /* renamed from: f */
    <ValueT> ValueT mo69358f(AbstractC11198a<ValueT> abstractC11198a, EnumC11200c enumC11200c);

    /* renamed from: g */
    Set<AbstractC11198a<?>> mo69357g();

    /* renamed from: h */
    EnumC11200c mo69356h(AbstractC11198a<?> abstractC11198a);
}
