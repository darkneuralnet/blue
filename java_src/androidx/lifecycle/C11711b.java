package androidx.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Deprecated
/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
public final class C11711b {

    /* renamed from: c */
    public static C11711b f54898c = new C11711b();

    /* renamed from: a */
    public final Map<Class<?>, C11712a> f54899a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, Boolean> f54900b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.b$a */
    /* loaded from: classes.dex */
    public static class C11712a {

        /* renamed from: a */
        public final Map<AbstractC11719f.EnumC11720a, List<C11713b>> f54901a = new HashMap();

        /* renamed from: b */
        public final Map<C11713b, AbstractC11719f.EnumC11720a> f54902b;

        public C11712a(Map<C11713b, AbstractC11719f.EnumC11720a> map) {
            this.f54902b = map;
            for (Map.Entry<C11713b, AbstractC11719f.EnumC11720a> entry : map.entrySet()) {
                AbstractC11719f.EnumC11720a value = entry.getValue();
                List<C11713b> list = this.f54901a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f54901a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: b */
        public static void m67026b(List<C11713b> list, LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m67025a(lifecycleOwner, enumC11720a, obj);
                }
            }
        }

        /* renamed from: a */
        public void m67027a(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a, Object obj) {
            m67026b(this.f54901a.get(enumC11720a), lifecycleOwner, enumC11720a, obj);
            m67026b(this.f54901a.get(AbstractC11719f.EnumC11720a.ON_ANY), lifecycleOwner, enumC11720a, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b */
    /* loaded from: classes.dex */
    public static final class C11713b {

        /* renamed from: a */
        public final int f54903a;

        /* renamed from: b */
        public final Method f54904b;

        public C11713b(int i, Method method) {
            this.f54903a = i;
            this.f54904b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        public void m67025a(LifecycleOwner lifecycleOwner, AbstractC11719f.EnumC11720a enumC11720a, Object obj) {
            try {
                int i = this.f54903a;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            this.f54904b.invoke(obj, lifecycleOwner, enumC11720a);
                            return;
                        }
                        return;
                    }
                    this.f54904b.invoke(obj, lifecycleOwner);
                    return;
                }
                this.f54904b.invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11713b)) {
                return false;
            }
            C11713b c11713b = (C11713b) obj;
            if (this.f54903a == c11713b.f54903a && this.f54904b.getName().equals(c11713b.f54904b.getName())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f54903a * 31) + this.f54904b.getName().hashCode();
        }
    }

    /* renamed from: a */
    public final C11712a m67032a(Class<?> cls, Method[] methodArr) {
        int i;
        C11712a m67030c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m67030c = m67030c(superclass)) != null) {
            hashMap.putAll(m67030c.f54902b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C11713b, AbstractC11719f.EnumC11720a> entry : m67030c(cls2).f54902b.entrySet()) {
                m67028e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m67031b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC11733l interfaceC11733l = (InterfaceC11733l) method.getAnnotation(InterfaceC11733l.class);
            if (interfaceC11733l != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i = 0;
                }
                AbstractC11719f.EnumC11720a value = interfaceC11733l.value();
                if (parameterTypes.length > 1) {
                    if (AbstractC11719f.EnumC11720a.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == AbstractC11719f.EnumC11720a.ON_ANY) {
                            i = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m67028e(hashMap, new C11713b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C11712a c11712a = new C11712a(hashMap);
        this.f54899a.put(cls, c11712a);
        this.f54900b.put(cls, Boolean.valueOf(z));
        return c11712a;
    }

    /* renamed from: b */
    public final Method[] m67031b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: c */
    public C11712a m67030c(Class<?> cls) {
        C11712a c11712a = this.f54899a.get(cls);
        if (c11712a != null) {
            return c11712a;
        }
        return m67032a(cls, null);
    }

    /* renamed from: d */
    public boolean m67029d(Class<?> cls) {
        Boolean bool = this.f54900b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m67031b = m67031b(cls);
        for (Method method : m67031b) {
            if (((InterfaceC11733l) method.getAnnotation(InterfaceC11733l.class)) != null) {
                m67032a(cls, m67031b);
                return true;
            }
        }
        this.f54900b.put(cls, Boolean.FALSE);
        return false;
    }

    /* renamed from: e */
    public final void m67028e(Map<C11713b, AbstractC11719f.EnumC11720a> map, C11713b c11713b, AbstractC11719f.EnumC11720a enumC11720a, Class<?> cls) {
        AbstractC11719f.EnumC11720a enumC11720a2 = map.get(c11713b);
        if (enumC11720a2 != null && enumC11720a != enumC11720a2) {
            Method method = c11713b.f54904b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC11720a2 + ", new value " + enumC11720a);
        } else if (enumC11720a2 == null) {
            map.put(c11713b, enumC11720a);
        }
    }
}
