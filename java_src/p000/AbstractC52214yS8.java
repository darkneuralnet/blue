package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: yS8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC52214yS8 {

    /* renamed from: a */
    public static final Logger f119583a = Logger.getLogger(QP8.class.getName());

    /* renamed from: b */
    public static final String f119584b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* renamed from: b */
    public static TQ8 m3474b(Class cls) {
        String format;
        ClassLoader classLoader = AbstractC52214yS8.class.getClassLoader();
        if (cls.equals(TQ8.class)) {
            format = f119584b;
        } else if (cls.getPackage().equals(AbstractC52214yS8.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return (TQ8) cls.cast(((AbstractC52214yS8) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).m3475a());
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
            Iterator it = ServiceLoader.load(AbstractC52214yS8.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((TQ8) cls.cast(((AbstractC52214yS8) it.next()).m3475a()));
                } catch (ServiceConfigurationError e5) {
                    f119583a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (TQ8) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (TQ8) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
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
    public abstract TQ8 m3475a();
}
