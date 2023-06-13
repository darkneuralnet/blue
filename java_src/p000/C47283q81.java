package p000;

import java.lang.reflect.Method;
/* renamed from: q81  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47283q81 extends ClassLoader {

    /* renamed from: a */
    public static final String f104773a = AbstractC19998eG.class.getName();

    /* renamed from: b */
    public static final Class<?>[] f104774b;

    static {
        Class<?> cls = Integer.TYPE;
        f104774b = new Class[]{String.class, byte[].class, cls, cls};
    }

    public C47283q81(ClassLoader classLoader) {
        super(classLoader);
    }

    /* renamed from: a */
    public Class<?> m18077a(String str, byte[] bArr) throws ClassFormatError {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("defineClass", f104774b);
            declaredMethod.setAccessible(true);
            return (Class) declaredMethod.invoke(getParent(), str, bArr, 0, Integer.valueOf(bArr.length));
        } catch (Exception unused) {
            return defineClass(str, bArr, 0, bArr.length);
        }
    }

    @Override // java.lang.ClassLoader
    public synchronized Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (str.equals(f104773a)) {
            return AbstractC19998eG.class;
        }
        return super.loadClass(str, z);
    }
}
