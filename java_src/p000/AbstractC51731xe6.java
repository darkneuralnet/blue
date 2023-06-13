package p000;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* renamed from: xe6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC51731xe6 {

    /* renamed from: a */
    public static final AbstractC51731xe6 f117933a = m4902c();

    /* renamed from: xe6$a */
    /* loaded from: classes6.dex */
    public class C30261a extends AbstractC51731xe6 {

        /* renamed from: b */
        public final /* synthetic */ Method f117934b;

        /* renamed from: c */
        public final /* synthetic */ Object f117935c;

        public C30261a(Method method, Object obj) {
            this.f117934b = method;
            this.f117935c = obj;
        }

        @Override // p000.AbstractC51731xe6
        /* renamed from: d */
        public <T> T mo4901d(Class<T> cls) throws Exception {
            AbstractC51731xe6.m4903b(cls);
            return (T) this.f117934b.invoke(this.f117935c, cls);
        }
    }

    /* renamed from: xe6$b */
    /* loaded from: classes6.dex */
    public class C30262b extends AbstractC51731xe6 {

        /* renamed from: b */
        public final /* synthetic */ Method f117936b;

        /* renamed from: c */
        public final /* synthetic */ int f117937c;

        public C30262b(Method method, int i) {
            this.f117936b = method;
            this.f117937c = i;
        }

        @Override // p000.AbstractC51731xe6
        /* renamed from: d */
        public <T> T mo4901d(Class<T> cls) throws Exception {
            AbstractC51731xe6.m4903b(cls);
            return (T) this.f117936b.invoke(null, cls, Integer.valueOf(this.f117937c));
        }
    }

    /* renamed from: xe6$c */
    /* loaded from: classes6.dex */
    public class C30263c extends AbstractC51731xe6 {

        /* renamed from: b */
        public final /* synthetic */ Method f117938b;

        public C30263c(Method method) {
            this.f117938b = method;
        }

        @Override // p000.AbstractC51731xe6
        /* renamed from: d */
        public <T> T mo4901d(Class<T> cls) throws Exception {
            AbstractC51731xe6.m4903b(cls);
            return (T) this.f117938b.invoke(null, cls, Object.class);
        }
    }

    /* renamed from: xe6$d */
    /* loaded from: classes6.dex */
    public class C30264d extends AbstractC51731xe6 {
        @Override // p000.AbstractC51731xe6
        /* renamed from: d */
        public <T> T mo4901d(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* renamed from: b */
    public static void m4903b(Class<?> cls) {
        String m18363a = C47193pz0.m18363a(cls);
        if (m18363a == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + m18363a);
    }

    /* renamed from: c */
    public static AbstractC51731xe6 m4902c() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C30261a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new C30262b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new C30263c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new C30264d();
            }
        }
    }

    /* renamed from: d */
    public abstract <T> T mo4901d(Class<T> cls) throws Exception;
}
