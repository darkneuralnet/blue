package p000;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collection;
/* renamed from: t00  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C48980t00 {
    /* renamed from: a */
    public static <T> T m13276a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C48980t00.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: b */
    public static boolean m13275b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (m13274c()) {
                if (collection.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m13274c() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
