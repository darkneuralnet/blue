package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: Xt7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC37173Xt7 {

    /* renamed from: a */
    public static final Logger f44160a = Logger.getLogger(AbstractC50104ut7.class.getName());

    /* renamed from: b */
    public static final String f44161b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* renamed from: b */
    public static C53068zt7 m76155b(Class cls) {
        String format;
        String str;
        ClassLoader classLoader = AbstractC37173Xt7.class.getClassLoader();
        if (cls.equals(C53068zt7.class)) {
            format = f44161b;
        } else if (cls.getPackage().equals(AbstractC37173Xt7.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return (C53068zt7) cls.cast(((AbstractC37173Xt7) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).m76156a());
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
            Iterator it = ServiceLoader.load(AbstractC37173Xt7.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((AbstractC37173Xt7) it.next()).m76156a()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger = f44160a;
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
                return (C53068zt7) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C53068zt7) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
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
    public abstract C53068zt7 m76156a();
}
