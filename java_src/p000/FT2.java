package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: FT2 */
/* loaded from: classes5.dex */
public class FT2 implements InterfaceC8824Vv {

    /* renamed from: a */
    public final C2281a f9406a;

    /* renamed from: b */
    public final DE0 f9407b;

    /* renamed from: c */
    public final Map<String, S96> f9408c;

    /* renamed from: FT2$a */
    /* loaded from: classes5.dex */
    public static class C2281a {

        /* renamed from: a */
        public final Context f9409a;

        /* renamed from: b */
        public Map<String, String> f9410b = null;

        public C2281a(Context context) {
            this.f9409a = context;
        }

        /* renamed from: d */
        public static Bundle m107122d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* renamed from: a */
        public final Map<String, String> m107125a(Context context) {
            Bundle m107122d = m107122d(context);
            if (m107122d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m107122d.keySet()) {
                Object obj = m107122d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: b */
        public InterfaceC8500Uv m107124b(String str) {
            String str2 = m107123c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC8500Uv) Class.forName(str2).asSubclass(InterfaceC8500Uv.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e5);
                return null;
            }
        }

        /* renamed from: c */
        public final Map<String, String> m107123c() {
            if (this.f9410b == null) {
                this.f9410b = m107125a(this.f9409a);
            }
            return this.f9410b;
        }
    }

    public FT2(Context context, DE0 de0) {
        this(new C2281a(context), de0);
    }

    @Override // p000.InterfaceC8824Vv
    public synchronized S96 get(String str) {
        if (this.f9408c.containsKey(str)) {
            return this.f9408c.get(str);
        }
        InterfaceC8500Uv m107124b = this.f9406a.m107124b(str);
        if (m107124b == null) {
            return null;
        }
        S96 create = m107124b.create(this.f9407b.m110665a(str));
        this.f9408c.put(str, create);
        return create;
    }

    public FT2(C2281a c2281a, DE0 de0) {
        this.f9408c = new HashMap();
        this.f9406a = c2281a;
        this.f9407b = de0;
    }
}
