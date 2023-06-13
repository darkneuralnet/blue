package p000;

import com.google.android.gms.internal.vision.C17551E;
import com.google.android.gms.internal.vision.zzii;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: yG8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC52106yG8<T extends C17551E> {

    /* renamed from: a */
    public static final Logger f119281a = Logger.getLogger(zzii.class.getName());

    /* renamed from: b */
    public static String f119282b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* renamed from: b */
    public static <T extends C17551E> T m3731b(Class<T> cls) {
        String format;
        String str;
        ClassLoader classLoader = AbstractC52106yG8.class.getClassLoader();
        if (cls.equals(C17551E.class)) {
            format = f119282b;
        } else if (cls.getPackage().equals(AbstractC52106yG8.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((AbstractC52106yG8) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).m3732a());
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (InstantiationException e3) {
                throw new IllegalStateException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC52106yG8.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((AbstractC52106yG8) it.next()).m3732a()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger = f119281a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    if (simpleName.length() != 0) {
                        str = "Unable to load ".concat(simpleName);
                    } else {
                        str = new String("Unable to load ");
                    }
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", str, (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* renamed from: a */
    public abstract T m3732a();
}
