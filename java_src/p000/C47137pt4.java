package p000;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.List;
import p000.InterfaceC46544ot4;
/* renamed from: pt4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47137pt4 {

    /* renamed from: pt4$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC27404b {

        /* renamed from: a */
        public static final AbstractC27404b f104224a;

        /* renamed from: pt4$b$a */
        /* loaded from: classes6.dex */
        public class C27405a extends AbstractC27404b {

            /* renamed from: b */
            public final /* synthetic */ Method f104225b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27405a(Method method) {
                super();
                this.f104225b = method;
            }

            @Override // p000.C47137pt4.AbstractC27404b
            /* renamed from: a */
            public boolean mo18559a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f104225b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e) {
                    throw new RuntimeException("Failed invoking canAccess", e);
                }
            }
        }

        /* renamed from: pt4$b$b */
        /* loaded from: classes6.dex */
        public class C27406b extends AbstractC27404b {
            public C27406b() {
                super();
            }

            @Override // p000.C47137pt4.AbstractC27404b
            /* renamed from: a */
            public boolean mo18559a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        static {
            AbstractC27404b c27405a;
            if (C51164wh2.m6481d()) {
                try {
                    c27405a = new C27405a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                }
                if (c27405a == null) {
                    c27405a = new C27406b();
                }
                f104224a = c27405a;
            }
            c27405a = null;
            if (c27405a == null) {
            }
            f104224a = c27405a;
        }

        private AbstractC27404b() {
        }

        /* renamed from: a */
        public abstract boolean mo18559a(AccessibleObject accessibleObject, Object obj);
    }

    private C47137pt4() {
    }

    /* renamed from: a */
    public static boolean m18561a(AccessibleObject accessibleObject, Object obj) {
        return AbstractC27404b.f104224a.mo18559a(accessibleObject, obj);
    }

    /* renamed from: b */
    public static InterfaceC46544ot4.EnumC27098a m18560b(List<InterfaceC46544ot4> list, Class<?> cls) {
        for (InterfaceC46544ot4 interfaceC46544ot4 : list) {
            InterfaceC46544ot4.EnumC27098a m20359a = interfaceC46544ot4.m20359a(cls);
            if (m20359a != InterfaceC46544ot4.EnumC27098a.INDECISIVE) {
                return m20359a;
            }
        }
        return InterfaceC46544ot4.EnumC27098a.ALLOW;
    }
}
