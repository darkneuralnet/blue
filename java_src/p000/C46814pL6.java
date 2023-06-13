package p000;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.recyclerview.widget.C11925l;
import com.google.android.play.core.internal.C17963bi;
import com.google.android.play.core.internal.C17964bq;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.KotlinVersion;
/* renamed from: pL6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46814pL6 {
    /* renamed from: a */
    public static <R, P0> R m19458a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0) {
        try {
            return cls.cast(m19446m(obj, str, cls2).invoke(obj, p0));
        } catch (Exception e) {
            throw new C17963bi(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e);
        }
    }

    /* renamed from: b */
    public static <R, P0, P1, P2> R m19457b(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0, Class<P1> cls3, P1 p1, Class<P2> cls4, P2 p2) {
        try {
            return cls.cast(m19446m(obj, str, cls2, cls3, cls4).invoke(obj, p0, p1, p2));
        } catch (Exception e) {
            throw new C17963bi(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e);
        }
    }

    /* renamed from: c */
    public static <R> R m19456c(Class<R> cls) {
        try {
            Constructor<R> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(new Object[0]);
        } catch (Exception e) {
            throw new C17963bi(String.format("Failed to invoke default constructor on class %s", cls.getName()), e);
        }
    }

    /* renamed from: d */
    public static <T> C45628nL6<T> m19455d(Object obj, String str, Class<T> cls) {
        return new C45628nL6<>(obj, m19444o(obj, str), cls);
    }

    /* renamed from: e */
    public static <T> C45628nL6 m19454e(Object obj, String str, Class<T> cls) {
        return new C45628nL6(obj, m19444o(obj, str), cls, null);
    }

    /* renamed from: f */
    public static <R, P0> R m19453f(Class cls, Class<R> cls2, Class<P0> cls3, P0 p0) {
        try {
            return cls2.cast(m19445n(cls, "isDexOptNeeded", cls3).invoke(null, p0));
        } catch (Exception e) {
            throw new C17963bi(String.format("Failed to invoke static method %s on type %s", "isDexOptNeeded", cls), e);
        }
    }

    /* renamed from: g */
    public static <R, P0, P1> R m19452g(Class cls, Class<R> cls2, Class<P0> cls3, P0 p0, Class<P1> cls4, P1 p1) {
        try {
            return cls2.cast(m19445n(cls, "optimizedPathFor", cls3, cls4).invoke(null, p0, p1));
        } catch (Exception e) {
            throw new C17963bi(String.format("Failed to invoke static method %s on type %s", "optimizedPathFor", cls), e);
        }
    }

    /* renamed from: h */
    public static void m19451h(PackageManager packageManager, ComponentName componentName, int i) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i | 512);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i2 = 0;
                    loop0: while (true) {
                        if (i2 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i2];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                componentInfo = componentInfoArr2[i3];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                            continue;
                        }
                        i2++;
                    }
                    if (componentInfo != null) {
                        if (componentInfo.isEnabled()) {
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    /* renamed from: i */
    public static <T> void m19450i(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    /* renamed from: j */
    public static <T> void m19449j(T t) {
        t.getClass();
    }

    /* renamed from: k */
    public static <T> void m19448k(T t) {
        if (t == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: l */
    public static void m19447l(BL6 bl6, InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", Integer.valueOf(readInt)));
            throw new C17964bq(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read != 4) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unexpected version=");
            sb.append(read);
            throw new C17964bq(sb.toString());
        }
        long j2 = 0;
        while (true) {
            long j3 = j - j2;
            try {
                int read2 = dataInputStream.read();
                if (read2 == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (read2 == 0) {
                    return;
                }
                switch (read2) {
                    case 247:
                        read2 = dataInputStream.readUnsignedShort();
                        m19443p(bArr, dataInputStream, outputStream, read2, j3);
                        break;
                    case 248:
                        read2 = dataInputStream.readInt();
                        m19443p(bArr, dataInputStream, outputStream, read2, j3);
                        break;
                    case 249:
                        long readUnsignedShort = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.read();
                        if (read2 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        m19442q(bArr, bl6, outputStream, readUnsignedShort, read2, j3);
                        break;
                    case C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                        read2 = dataInputStream.readUnsignedShort();
                        m19442q(bArr, bl6, outputStream, dataInputStream.readUnsignedShort(), read2, j3);
                        break;
                    case 251:
                        read2 = dataInputStream.readInt();
                        m19442q(bArr, bl6, outputStream, dataInputStream.readUnsignedShort(), read2, j3);
                        break;
                    case 252:
                        long readInt2 = dataInputStream.readInt();
                        read2 = dataInputStream.read();
                        if (read2 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        m19442q(bArr, bl6, outputStream, readInt2, read2, j3);
                        break;
                    case 253:
                        read2 = dataInputStream.readUnsignedShort();
                        m19442q(bArr, bl6, outputStream, dataInputStream.readInt(), read2, j3);
                        break;
                    case 254:
                        read2 = dataInputStream.readInt();
                        m19442q(bArr, bl6, outputStream, dataInputStream.readInt(), read2, j3);
                        break;
                    case KotlinVersion.MAX_COMPONENT_VALUE /* 255 */:
                        long readLong = dataInputStream.readLong();
                        read2 = dataInputStream.readInt();
                        m19442q(bArr, bl6, outputStream, readLong, read2, j3);
                        break;
                    default:
                        m19443p(bArr, dataInputStream, outputStream, read2, j3);
                        break;
                }
                j2 += read2;
            } finally {
                outputStream.flush();
            }
        }
    }

    /* renamed from: m */
    public static Method m19446m(Object obj, String str, Class<?>... clsArr) {
        return m19445n(obj.getClass(), str, clsArr);
    }

    /* renamed from: n */
    public static Method m19445n(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new C17963bi(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }

    /* renamed from: o */
    public static Field m19444o(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new C17963bi(String.format("Failed to find a field named %s on an object of instance %s", str, obj.getClass().getName()));
    }

    /* renamed from: p */
    public static void m19443p(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (i > j) {
            throw new IOException("Output length overrun");
        }
        while (i > 0) {
            try {
                int min = Math.min(i, 16384);
                dataInputStream.readFully(bArr, 0, min);
                outputStream.write(bArr, 0, min);
                i -= min;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }

    /* renamed from: q */
    public static void m19442q(byte[] bArr, BL6 bl6, OutputStream outputStream, long j, int i, long j2) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (j < 0) {
            throw new IOException("inputOffset negative");
        }
        long j3 = i;
        if (j3 > j2) {
            throw new IOException("Output length overrun");
        }
        try {
            InputStream m114086c = new DL6(bl6, j, j3).m114086c();
            while (i > 0) {
                int min = Math.min(i, 16384);
                int i2 = 0;
                while (i2 < min) {
                    int read = m114086c.read(bArr, i2, min - i2);
                    if (read == -1) {
                        throw new IOException("truncated input stream");
                    }
                    i2 += read;
                }
                outputStream.write(bArr, 0, min);
                i -= min;
            }
            m114086c.close();
        } catch (EOFException e) {
            throw new IOException("patch underrun", e);
        }
    }
}
