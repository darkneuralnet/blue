package p000;

import dalvik.system.PathClassLoader;
/* renamed from: ZP7 */
/* loaded from: classes5.dex */
public final class ZP7 extends PathClassLoader {
    public ZP7(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
