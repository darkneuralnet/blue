package p000;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: Ss0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35987Ss0<T> {

    /* renamed from: a */
    public final T f34361a;

    /* renamed from: b */
    public final InterfaceC7558c<T> f34362b;

    /* renamed from: Ss0$b */
    /* loaded from: classes6.dex */
    public static class C7557b implements InterfaceC7558c<Context> {

        /* renamed from: a */
        public final Class<? extends Service> f34363a;

        /* renamed from: b */
        public final Bundle m84727b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f34363a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", this.f34363a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // p000.C35987Ss0.InterfaceC7558c
        /* renamed from: c */
        public List<String> mo84725a(Context context) {
            Bundle m84727b = m84727b(context);
            if (m84727b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m84727b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m84727b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public C7557b(Class<? extends Service> cls) {
            this.f34363a = cls;
        }
    }

    /* renamed from: Ss0$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC7558c<T> {
        /* renamed from: a */
        List<String> mo84725a(T t);
    }

    public C35987Ss0(T t, InterfaceC7558c<T> interfaceC7558c) {
        this.f34361a = t;
        this.f34362b = interfaceC7558c;
    }

    /* renamed from: c */
    public static C35987Ss0<Context> m84730c(Context context, Class<? extends Service> cls) {
        return new C35987Ss0<>(context, new C7557b(cls));
    }

    /* renamed from: d */
    public static ComponentRegistrar m84729d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        }
    }

    /* renamed from: b */
    public List<X94<ComponentRegistrar>> m84731b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f34362b.mo84725a(this.f34361a)) {
            arrayList.add(new X94() { // from class: Rs0
                @Override // p000.X94
                public final Object get() {
                    ComponentRegistrar m84729d;
                    m84729d = C35987Ss0.m84729d(str);
                    return m84729d;
                }
            });
        }
        return arrayList;
    }
}
