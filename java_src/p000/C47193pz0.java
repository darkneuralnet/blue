package p000;

import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p000.InterfaceC46544ot4;
/* renamed from: pz0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47193pz0 {

    /* renamed from: a */
    public final Map<Type, InterfaceC38342b52<?>> f104424a;

    /* renamed from: b */
    public final boolean f104425b;

    /* renamed from: c */
    public final List<InterfaceC46544ot4> f104426c;

    /* renamed from: pz0$a */
    /* loaded from: classes6.dex */
    public class C27427a implements InterfaceC33515Id3<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeSet] */
        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            return new TreeSet();
        }
    }

    /* renamed from: pz0$b */
    /* loaded from: classes6.dex */
    public class C27428b implements InterfaceC33515Id3<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashSet] */
        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: pz0$c */
    /* loaded from: classes6.dex */
    public class C27429c implements InterfaceC33515Id3<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayDeque] */
        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: pz0$d */
    /* loaded from: classes6.dex */
    public class C27430d implements InterfaceC33515Id3<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            return new ArrayList();
        }
    }

    /* renamed from: pz0$e */
    /* loaded from: classes6.dex */
    public class C27431e implements InterfaceC33515Id3<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentSkipListMap, T] */
        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            return new ConcurrentSkipListMap();
        }
    }

    /* renamed from: pz0$f */
    /* loaded from: classes6.dex */
    public class C27432f implements InterfaceC33515Id3<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.concurrent.ConcurrentHashMap] */
        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: pz0$g */
    /* loaded from: classes6.dex */
    public class C27433g implements InterfaceC33515Id3<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, T] */
        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            return new TreeMap();
        }
    }

    /* renamed from: pz0$h */
    /* loaded from: classes6.dex */
    public class C27434h implements InterfaceC33515Id3<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, T] */
        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: pz0$i */
    /* loaded from: classes6.dex */
    public class C27435i implements InterfaceC33515Id3<T> {
        /* JADX WARN: Type inference failed for: r0v0, types: [Ur2, T] */
        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            return new C36448Ur2();
        }
    }

    /* renamed from: pz0$j */
    /* loaded from: classes6.dex */
    public class C27436j implements InterfaceC33515Id3<T> {

        /* renamed from: a */
        public final /* synthetic */ Class f104427a;

        public C27436j(Class cls) {
            this.f104427a = cls;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            try {
                return AbstractC51731xe6.f117933a.mo4901d(this.f104427a);
            } catch (Exception e) {
                throw new RuntimeException("Unable to create instance of " + this.f104427a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
            }
        }
    }

    /* renamed from: pz0$k */
    /* loaded from: classes6.dex */
    public class C27437k implements InterfaceC33515Id3<T> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC38342b52 f104429a;

        /* renamed from: b */
        public final /* synthetic */ Type f104430b;

        public C27437k(InterfaceC38342b52 interfaceC38342b52, Type type) {
            this.f104429a = interfaceC38342b52;
            this.f104430b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            return this.f104429a.m64988a(this.f104430b);
        }
    }

    /* renamed from: pz0$l */
    /* loaded from: classes6.dex */
    public class C27438l implements InterfaceC33515Id3<T> {

        /* renamed from: a */
        public final /* synthetic */ String f104432a;

        public C27438l(String str) {
            this.f104432a = str;
        }

        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            throw new JsonIOException(this.f104432a);
        }
    }

    /* renamed from: pz0$m */
    /* loaded from: classes6.dex */
    public class C27439m implements InterfaceC33515Id3<T> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC38342b52 f104434a;

        /* renamed from: b */
        public final /* synthetic */ Type f104435b;

        public C27439m(InterfaceC38342b52 interfaceC38342b52, Type type) {
            this.f104434a = interfaceC38342b52;
            this.f104435b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            return this.f104434a.m64988a(this.f104435b);
        }
    }

    /* renamed from: pz0$n */
    /* loaded from: classes6.dex */
    public class C27440n implements InterfaceC33515Id3<T> {

        /* renamed from: a */
        public final /* synthetic */ String f104437a;

        public C27440n(String str) {
            this.f104437a = str;
        }

        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            throw new JsonIOException(this.f104437a);
        }
    }

    /* renamed from: pz0$o */
    /* loaded from: classes6.dex */
    public class C27441o implements InterfaceC33515Id3<T> {

        /* renamed from: a */
        public final /* synthetic */ String f104439a;

        public C27441o(String str) {
            this.f104439a = str;
        }

        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            throw new JsonIOException(this.f104439a);
        }
    }

    /* renamed from: pz0$p */
    /* loaded from: classes6.dex */
    public class C27442p implements InterfaceC33515Id3<T> {

        /* renamed from: a */
        public final /* synthetic */ Type f104441a;

        public C27442p(Type type) {
            this.f104441a = type;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.EnumSet] */
        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            Type type = this.f104441a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.f104441a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f104441a.toString());
        }
    }

    /* renamed from: pz0$q */
    /* loaded from: classes6.dex */
    public class C27443q implements InterfaceC33515Id3<T> {

        /* renamed from: a */
        public final /* synthetic */ Type f104442a;

        public C27443q(Type type) {
            this.f104442a = type;
        }

        /* JADX WARN: Type inference failed for: r1v7, types: [T, java.util.EnumMap] */
        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            Type type = this.f104442a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return new EnumMap((Class) type2);
                }
                throw new JsonIOException("Invalid EnumMap type: " + this.f104442a.toString());
            }
            throw new JsonIOException("Invalid EnumMap type: " + this.f104442a.toString());
        }
    }

    /* renamed from: pz0$r */
    /* loaded from: classes6.dex */
    public class C27444r implements InterfaceC33515Id3<T> {

        /* renamed from: a */
        public final /* synthetic */ String f104443a;

        public C27444r(String str) {
            this.f104443a = str;
        }

        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            throw new JsonIOException(this.f104443a);
        }
    }

    /* renamed from: pz0$s */
    /* loaded from: classes6.dex */
    public class C27445s implements InterfaceC33515Id3<T> {

        /* renamed from: a */
        public final /* synthetic */ String f104444a;

        public C27445s(String str) {
            this.f104444a = str;
        }

        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            throw new JsonIOException(this.f104444a);
        }
    }

    /* renamed from: pz0$t */
    /* loaded from: classes6.dex */
    public class C27446t implements InterfaceC33515Id3<T> {

        /* renamed from: a */
        public final /* synthetic */ Constructor f104445a;

        public C27446t(Constructor constructor) {
            this.f104445a = constructor;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
        @Override // p000.InterfaceC33515Id3
        /* renamed from: a */
        public T mo18357a() {
            try {
                return this.f104445a.newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                throw C48323rt4.m15128e(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke constructor '" + C48323rt4.m15130c(this.f104445a) + "' with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke constructor '" + C48323rt4.m15130c(this.f104445a) + "' with no args", e3.getCause());
            }
        }
    }

    public C47193pz0(Map<Type, InterfaceC38342b52<?>> map, boolean z, List<InterfaceC46544ot4> list) {
        this.f104424a = map;
        this.f104425b = z;
        this.f104426c = list;
    }

    /* renamed from: a */
    public static String m18363a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        } else if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName();
        } else {
            return null;
        }
    }

    /* renamed from: c */
    public static <T> InterfaceC33515Id3<T> m18361c(Class<? super T> cls, InterfaceC46544ot4.EnumC27098a enumC27098a) {
        String m15120m;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        boolean z = false;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            InterfaceC46544ot4.EnumC27098a enumC27098a2 = InterfaceC46544ot4.EnumC27098a.ALLOW;
            if (enumC27098a == enumC27098a2 || (C47137pt4.m18561a(declaredConstructor, null) && (enumC27098a != InterfaceC46544ot4.EnumC27098a.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                z = true;
            }
            if (!z) {
                return new C27444r("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
            } else if (enumC27098a == enumC27098a2 && (m15120m = C48323rt4.m15120m(declaredConstructor)) != null) {
                return new C27445s(m15120m);
            } else {
                return new C27446t(declaredConstructor);
            }
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static <T> InterfaceC33515Id3<T> m18360d(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C27427a();
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new C27428b();
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C27429c();
            }
            return new C27430d();
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C27431e();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C27432f();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C27433g();
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(C32798Fb6.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                return new C27434h();
            }
            return new C27435i();
        } else {
            return null;
        }
    }

    /* renamed from: e */
    public static <T> InterfaceC33515Id3<T> m18359e(Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new C27442p(type);
        }
        if (cls == EnumMap.class) {
            return new C27443q(type);
        }
        return null;
    }

    /* renamed from: b */
    public <T> InterfaceC33515Id3<T> m18362b(C32798Fb6<T> c32798Fb6) {
        Type type = c32798Fb6.getType();
        Class<? super T> rawType = c32798Fb6.getRawType();
        InterfaceC38342b52<?> interfaceC38342b52 = this.f104424a.get(type);
        if (interfaceC38342b52 != null) {
            return new C27437k(interfaceC38342b52, type);
        }
        InterfaceC38342b52<?> interfaceC38342b522 = this.f104424a.get(rawType);
        if (interfaceC38342b522 != null) {
            return new C27439m(interfaceC38342b522, type);
        }
        InterfaceC33515Id3<T> m18359e = m18359e(type, rawType);
        if (m18359e != null) {
            return m18359e;
        }
        InterfaceC46544ot4.EnumC27098a m18560b = C47137pt4.m18560b(this.f104426c, rawType);
        InterfaceC33515Id3<T> m18361c = m18361c(rawType, m18560b);
        if (m18361c != null) {
            return m18361c;
        }
        InterfaceC33515Id3<T> m18360d = m18360d(type, rawType);
        if (m18360d != null) {
            return m18360d;
        }
        String m18363a = m18363a(rawType);
        if (m18363a != null) {
            return new C27440n(m18363a);
        }
        if (m18560b == InterfaceC46544ot4.EnumC27098a.ALLOW) {
            return m18358f(rawType);
        }
        return new C27441o("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    /* renamed from: f */
    public final <T> InterfaceC33515Id3<T> m18358f(Class<? super T> cls) {
        if (this.f104425b) {
            return new C27436j(cls);
        }
        return new C27438l("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public String toString() {
        return this.f104424a.toString();
    }
}
