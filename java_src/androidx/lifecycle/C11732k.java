package androidx.lifecycle;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J \u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002J\u001e\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002J\u0014\u0010\u0010\u001a\u00020\u000f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002J\u0014\u0010\u0011\u001a\u00020\u000f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0002J\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fH\u0002R$\u0010\u0016\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\u000f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R2\u0010\u0018\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u00170\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"Landroidx/lifecycle/k;", "", "object", "Landroidx/lifecycle/i;", "f", "", "className", "c", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/d;", "constructor", C17296a.f69688o, "Ljava/lang/Class;", "klass", "b", "", DateTokenConverter.CONVERTER_KEY, "g", "", "e", "", "Ljava/util/Map;", "callbackCache", "", "classToAdapters", "<init>", "()V", "lifecycle-common"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.lifecycle.k */
/* loaded from: classes.dex */
public final class C11732k {

    /* renamed from: a */
    public static final C11732k f54935a = new C11732k();

    /* renamed from: b */
    public static final Map<Class<?>, Integer> f54936b = new HashMap();

    /* renamed from: c */
    public static final Map<Class<?>, List<Constructor<? extends InterfaceC11717d>>> f54937c = new HashMap();

    private C11732k() {
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m66988c(String className) {
        String replace$default;
        Intrinsics.checkNotNullParameter(className, "className");
        StringBuilder sb = new StringBuilder();
        replace$default = StringsKt__StringsJVMKt.replace$default(className, InstructionFileId.DOT, "_", false, 4, (Object) null);
        sb.append(replace$default);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    @JvmStatic
    /* renamed from: f */
    public static final InterfaceC11728i m66985f(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z = object instanceof InterfaceC11728i;
        boolean z2 = object instanceof VX0;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((VX0) object, (InterfaceC11728i) object);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((VX0) object, null);
        }
        if (z) {
            return (InterfaceC11728i) object;
        }
        Class<?> cls = object.getClass();
        C11732k c11732k = f54935a;
        if (c11732k.m66987d(cls) == 2) {
            List<Constructor<? extends InterfaceC11717d>> list = f54937c.get(cls);
            Intrinsics.checkNotNull(list);
            List<Constructor<? extends InterfaceC11717d>> list2 = list;
            if (list2.size() == 1) {
                return new SingleGeneratedAdapterObserver(c11732k.m66990a(list2.get(0), object));
            }
            int size = list2.size();
            InterfaceC11717d[] interfaceC11717dArr = new InterfaceC11717d[size];
            for (int i = 0; i < size; i++) {
                interfaceC11717dArr[i] = f54935a.m66990a(list2.get(i), object);
            }
            return new CompositeGeneratedAdaptersObserver(interfaceC11717dArr);
        }
        return new ReflectiveGenericLifecycleObserver(object);
    }

    /* renamed from: a */
    public final InterfaceC11717d m66990a(Constructor<? extends InterfaceC11717d> constructor, Object obj) {
        try {
            InterfaceC11717d newInstance = constructor.newInstance(obj);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public final Constructor<? extends InterfaceC11717d> m66989b(Class<?> cls) {
        String fullPackage;
        boolean z;
        boolean z2;
        try {
            Package r0 = cls.getPackage();
            String name = cls.getCanonicalName();
            if (r0 != null) {
                fullPackage = r0.getName();
            } else {
                fullPackage = "";
            }
            Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
            if (fullPackage.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Intrinsics.checkNotNullExpressionValue(name, "name");
                name = name.substring(fullPackage.length() + 1);
                Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
            }
            Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String m66988c = m66988c(name);
            if (fullPackage.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                m66988c = fullPackage + CoreConstants.DOT + m66988c;
            }
            Class<?> cls2 = Class.forName(m66988c);
            Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
                return declaredConstructor;
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public final int m66987d(Class<?> cls) {
        Map<Class<?>, Integer> map = f54936b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int m66984g = m66984g(cls);
        map.put(cls, Integer.valueOf(m66984g));
        return m66984g;
    }

    /* renamed from: e */
    public final boolean m66986e(Class<?> cls) {
        return cls != null && InterfaceC32929Fq2.class.isAssignableFrom(cls);
    }

    /* renamed from: g */
    public final int m66984g(Class<?> cls) {
        ArrayList arrayList;
        List<Constructor<? extends InterfaceC11717d>> listOf;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC11717d> m66989b = m66989b(cls);
        if (m66989b != null) {
            Map<Class<?>, List<Constructor<? extends InterfaceC11717d>>> map = f54937c;
            listOf = CollectionsKt__CollectionsJVMKt.listOf(m66989b);
            map.put(cls, listOf);
            return 2;
        } else if (C11711b.f54898c.m67029d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            if (m66986e(superclass)) {
                Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
                if (m66987d(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends InterfaceC11717d>> list = f54937c.get(superclass);
                Intrinsics.checkNotNull(list);
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            Class<?>[] interfaces = cls.getInterfaces();
            Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
            for (Class<?> intrface : interfaces) {
                if (m66986e(intrface)) {
                    Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                    if (m66987d(intrface) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends InterfaceC11717d>> list2 = f54937c.get(intrface);
                    Intrinsics.checkNotNull(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f54937c.put(cls, arrayList);
            return 2;
        }
    }
}
