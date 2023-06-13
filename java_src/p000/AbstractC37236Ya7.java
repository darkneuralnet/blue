package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: Ya7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC37236Ya7 {

    /* renamed from: a */
    public static final Logger f46038a = Logger.getLogger(AbstractC33726Ja7.class.getName());

    /* renamed from: b */
    public static final String f46039b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* renamed from: b */
    public static C34896Oa7 m74887b(Class cls) {
        String format;
        ClassLoader classLoader = AbstractC37236Ya7.class.getClassLoader();
        if (cls.equals(C34896Oa7.class)) {
            format = f46039b;
        } else if (cls.getPackage().equals(AbstractC37236Ya7.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return (C34896Oa7) cls.cast(((AbstractC37236Ya7) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).m74888a());
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
            Iterator it = ServiceLoader.load(AbstractC37236Ya7.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((C34896Oa7) cls.cast(((AbstractC37236Ya7) it.next()).m74888a()));
                } catch (ServiceConfigurationError e5) {
                    f46038a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (C34896Oa7) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C34896Oa7) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
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
    public abstract C34896Oa7 m74888a();
}
