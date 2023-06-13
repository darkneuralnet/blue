package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* renamed from: rt4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48323rt4 {

    /* renamed from: a */
    public static final AbstractC28050b f107836a;

    /* renamed from: rt4$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC28050b {
        private AbstractC28050b() {
        }

        /* renamed from: a */
        public abstract Method mo15119a(Class<?> cls, Field field);

        /* renamed from: b */
        public abstract <T> Constructor<T> mo15118b(Class<T> cls);

        /* renamed from: c */
        public abstract String[] mo15117c(Class<?> cls);

        /* renamed from: d */
        public abstract boolean mo15116d(Class<?> cls);
    }

    /* renamed from: rt4$c */
    /* loaded from: classes6.dex */
    public static class C28051c extends AbstractC28050b {
        private C28051c() {
            super();
        }

        @Override // p000.C48323rt4.AbstractC28050b
        /* renamed from: a */
        public Method mo15119a(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // p000.C48323rt4.AbstractC28050b
        /* renamed from: b */
        public <T> Constructor<T> mo15118b(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // p000.C48323rt4.AbstractC28050b
        /* renamed from: c */
        public String[] mo15117c(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // p000.C48323rt4.AbstractC28050b
        /* renamed from: d */
        public boolean mo15116d(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: rt4$d */
    /* loaded from: classes6.dex */
    public static class C28052d extends AbstractC28050b {

        /* renamed from: a */
        public final Method f107837a;

        /* renamed from: b */
        public final Method f107838b;

        /* renamed from: c */
        public final Method f107839c;

        /* renamed from: d */
        public final Method f107840d;

        @Override // p000.C48323rt4.AbstractC28050b
        /* renamed from: a */
        public Method mo15119a(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), new Class[0]);
            } catch (ReflectiveOperationException e) {
                throw C48323rt4.m15129d(e);
            }
        }

        @Override // p000.C48323rt4.AbstractC28050b
        /* renamed from: b */
        public <T> Constructor<T> mo15118b(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.f107838b.invoke(cls, new Object[0]);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    clsArr[i] = (Class) this.f107840d.invoke(objArr[i], new Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e) {
                throw C48323rt4.m15129d(e);
            }
        }

        @Override // p000.C48323rt4.AbstractC28050b
        /* renamed from: c */
        public String[] mo15117c(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.f107838b.invoke(cls, new Object[0]);
                String[] strArr = new String[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    strArr[i] = (String) this.f107839c.invoke(objArr[i], new Object[0]);
                }
                return strArr;
            } catch (ReflectiveOperationException e) {
                throw C48323rt4.m15129d(e);
            }
        }

        @Override // p000.C48323rt4.AbstractC28050b
        /* renamed from: d */
        public boolean mo15116d(Class<?> cls) {
            try {
                return ((Boolean) this.f107837a.invoke(cls, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e) {
                throw C48323rt4.m15129d(e);
            }
        }

        private C28052d() throws NoSuchMethodException {
            super();
            this.f107837a = Class.class.getMethod("isRecord", new Class[0]);
            Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
            this.f107838b = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.f107839c = componentType.getMethod("getName", new Class[0]);
            this.f107840d = componentType.getMethod("getType", new Class[0]);
        }
    }

    static {
        AbstractC28050b c28051c;
        try {
            c28051c = new C28052d();
        } catch (NoSuchMethodException unused) {
            c28051c = new C28051c();
        }
        f107836a = c28051c;
    }

    private C48323rt4() {
    }

    /* renamed from: b */
    public static void m15131b(AccessibleObject accessibleObject, StringBuilder sb) {
        Class<?>[] parameterTypes;
        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        if (accessibleObject instanceof Method) {
            parameterTypes = ((Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* renamed from: c */
    public static String m15130c(Constructor<?> constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        m15131b(constructor, sb);
        return sb.toString();
    }

    /* renamed from: d */
    public static RuntimeException m15129d(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    /* renamed from: e */
    public static RuntimeException m15128e(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    /* renamed from: f */
    public static String m15127f(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    /* renamed from: g */
    public static String m15126g(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + m15127f((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            m15131b(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + m15130c((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (z && Character.isLowerCase(str.charAt(0))) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    /* renamed from: h */
    public static Method m15125h(Class<?> cls, Field field) {
        return f107836a.mo15119a(cls, field);
    }

    /* renamed from: i */
    public static <T> Constructor<T> m15124i(Class<T> cls) {
        return f107836a.mo15118b(cls);
    }

    /* renamed from: j */
    public static String[] m15123j(Class<?> cls) {
        return f107836a.mo15117c(cls);
    }

    /* renamed from: k */
    public static boolean m15122k(Class<?> cls) {
        return f107836a.mo15116d(cls);
    }

    /* renamed from: l */
    public static void m15121l(AccessibleObject accessibleObject) throws JsonIOException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            String m15126g = m15126g(accessibleObject, false);
            throw new JsonIOException("Failed making " + m15126g + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", e);
        }
    }

    /* renamed from: m */
    public static String m15120m(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e) {
            return "Failed making constructor '" + m15130c(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage();
        }
    }
}
