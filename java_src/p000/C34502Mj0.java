package p000;

import java.security.AccessController;
import java.security.PrivilegedAction;
/* renamed from: Mj0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C34502Mj0 {

    /* renamed from: Mj0$a */
    /* loaded from: classes8.dex */
    public static class C5348a implements PrivilegedAction {

        /* renamed from: a */
        public final /* synthetic */ String f23433a;

        public C5348a(String str) {
            this.f23433a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.f23433a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Class m94998a(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new C5348a(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
