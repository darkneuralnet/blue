package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import androidx.startup.StartupException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: dj */
/* loaded from: classes.dex */
public final class C19846dj {

    /* renamed from: d */
    public static volatile C19846dj f77098d;

    /* renamed from: e */
    public static final Object f77099e = new Object();

    /* renamed from: c */
    public final Context f77102c;

    /* renamed from: b */
    public final Set<Class<? extends E22<?>>> f77101b = new HashSet();

    /* renamed from: a */
    public final Map<Class<?>, Object> f77100a = new HashMap();

    public C19846dj(Context context) {
        this.f77102c = context.getApplicationContext();
    }

    /* renamed from: e */
    public static C19846dj m43856e(Context context) {
        if (f77098d == null) {
            synchronized (f77099e) {
                if (f77098d == null) {
                    f77098d = new C19846dj(context);
                }
            }
        }
        return f77098d;
    }

    /* renamed from: a */
    public void m43860a() {
        try {
            try {
                C37763a66.m71893a("Startup");
                m43859b(this.f77102c.getPackageManager().getProviderInfo(new ComponentName(this.f77102c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e) {
                throw new StartupException(e);
            }
        } finally {
            C37763a66.m71892b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void m43859b(Bundle bundle) {
        String string = this.f77102c.getString(C44685ll4.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (E22.class.isAssignableFrom(cls)) {
                            this.f77101b.add(cls);
                        }
                    }
                }
                for (Class<? extends E22<?>> cls2 : this.f77101b) {
                    m43857d(cls2, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    /* renamed from: c */
    public <T> T m43858c(Class<? extends E22<?>> cls) {
        T t;
        synchronized (f77099e) {
            t = (T) this.f77100a.get(cls);
            if (t == null) {
                t = (T) m43857d(cls, new HashSet());
            }
        }
        return t;
    }

    /* renamed from: d */
    public final <T> T m43857d(Class<? extends E22<?>> cls, Set<Class<?>> set) {
        T t;
        if (C37763a66.m71890d()) {
            try {
                C37763a66.m71893a(cls.getSimpleName());
            } finally {
                C37763a66.m71892b();
            }
        }
        if (!set.contains(cls)) {
            if (!this.f77100a.containsKey(cls)) {
                set.add(cls);
                E22<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends E22<?>>> dependencies = newInstance.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class<? extends E22<?>> cls2 : dependencies) {
                        if (!this.f77100a.containsKey(cls2)) {
                            m43857d(cls2, set);
                        }
                    }
                }
                t = (T) newInstance.create(this.f77102c);
                set.remove(cls);
                this.f77100a.put(cls, t);
            } else {
                t = (T) this.f77100a.get(cls);
            }
            return t;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    /* renamed from: f */
    public <T> T m43855f(Class<? extends E22<T>> cls) {
        return (T) m43858c(cls);
    }

    /* renamed from: g */
    public boolean m43854g(Class<? extends E22<?>> cls) {
        return this.f77101b.contains(cls);
    }
}
