package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: OZ1 */
/* loaded from: classes5.dex */
public class OZ1 {
    /* renamed from: a */
    public static Class<?> m92013a(String str) {
        if (TD0.m84203d(OZ1.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            TD0.m84205b(th, OZ1.class);
            return null;
        }
    }

    /* renamed from: b */
    public static Method m92012b(Class<?> cls, String str, Class<?>... clsArr) {
        if (TD0.m84203d(OZ1.class)) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Throwable th) {
            TD0.m84205b(th, OZ1.class);
            return null;
        }
    }

    /* renamed from: c */
    public static Object m92011c(Class<?> cls, Method method, Object obj, Object... objArr) {
        if (TD0.m84203d(OZ1.class)) {
            return null;
        }
        if (obj != null) {
            try {
                obj = cls.cast(obj);
            } catch (Throwable th) {
                TD0.m84205b(th, OZ1.class);
                return null;
            }
        }
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
