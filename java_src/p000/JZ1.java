package p000;

import android.content.Context;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: JZ1 */
/* loaded from: classes5.dex */
public class JZ1 {

    /* renamed from: s */
    public static final AtomicBoolean f17798s = new AtomicBoolean(false);

    /* renamed from: t */
    public static JZ1 f17799t = null;

    /* renamed from: u */
    public static final AtomicBoolean f17800u = new AtomicBoolean(false);

    /* renamed from: v */
    public static final Map<String, JSONObject> f17801v = new ConcurrentHashMap();

    /* renamed from: w */
    public static final Map<String, JSONObject> f17802w = new ConcurrentHashMap();

    /* renamed from: a */
    public final Context f17803a;

    /* renamed from: b */
    public final Object f17804b;

    /* renamed from: c */
    public final NZ1 f17805c;

    /* renamed from: d */
    public final Class<?> f17806d;

    /* renamed from: e */
    public final Class<?> f17807e;

    /* renamed from: f */
    public final Class<?> f17808f;

    /* renamed from: g */
    public final Class<?> f17809g;

    /* renamed from: h */
    public final Class<?> f17810h;

    /* renamed from: i */
    public final Class<?> f17811i;

    /* renamed from: j */
    public final Class<?> f17812j;

    /* renamed from: k */
    public final Method f17813k;

    /* renamed from: l */
    public final Method f17814l;

    /* renamed from: m */
    public final Method f17815m;

    /* renamed from: n */
    public final Method f17816n;

    /* renamed from: o */
    public final Method f17817o;

    /* renamed from: p */
    public final Method f17818p;

    /* renamed from: q */
    public final Method f17819q;

    /* renamed from: r */
    public final Set<String> f17820r = new CopyOnWriteArraySet();

    /* renamed from: JZ1$a */
    /* loaded from: classes5.dex */
    public class RunnableC4145a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Runnable f17821b;

        public RunnableC4145a(Runnable runnable) {
            this.f17821b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                JZ1.m100218b(JZ1.this, "inapp", new ArrayList(JZ1.m100219a(JZ1.this)), this.f17821b);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: JZ1$b */
    /* loaded from: classes5.dex */
    public static class C4146b implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getName().equals("onBillingSetupFinished")) {
                JZ1.f17800u.set(true);
                return null;
            } else if (method.getName().endsWith("onBillingServiceDisconnected")) {
                JZ1.f17800u.set(false);
                return null;
            } else {
                return null;
            }
        }
    }

    /* renamed from: JZ1$c */
    /* loaded from: classes5.dex */
    public class C4147c implements InvocationHandler {

        /* renamed from: a */
        public Runnable f17823a;

        public C4147c(Runnable runnable) {
            this.f17823a = runnable;
        }

        /* renamed from: a */
        public final void m100204a(List<?> list) {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                try {
                    Object m92011c = OZ1.m92011c(JZ1.m100217c(JZ1.this), JZ1.m100216d(JZ1.this), it.next(), new Object[0]);
                    if (m92011c instanceof String) {
                        JSONObject jSONObject = new JSONObject((String) m92011c);
                        jSONObject.put("packageName", JZ1.m100215e(JZ1.this).getPackageName());
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            JZ1.m100219a(JZ1.this).add(string);
                            JZ1.f17801v.put(string, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.f17823a.run();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getName().equals("onPurchaseHistoryResponse")) {
                Object obj2 = objArr[1];
                if (obj2 instanceof List) {
                    m100204a((List) obj2);
                    return null;
                }
                return null;
            }
            return null;
        }
    }

    /* renamed from: JZ1$d */
    /* loaded from: classes5.dex */
    public static class C4148d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    /* renamed from: JZ1$e */
    /* loaded from: classes5.dex */
    public class C4149e implements InvocationHandler {

        /* renamed from: a */
        public Runnable f17825a;

        public C4149e(Runnable runnable) {
            this.f17825a = runnable;
        }

        /* renamed from: a */
        public void m100203a(List<?> list) {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                try {
                    Object m92011c = OZ1.m92011c(JZ1.m100214f(JZ1.this), JZ1.m100213g(JZ1.this), it.next(), new Object[0]);
                    if (m92011c instanceof String) {
                        JSONObject jSONObject = new JSONObject((String) m92011c);
                        if (jSONObject.has("productId")) {
                            JZ1.f17802w.put(jSONObject.getString("productId"), jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.f17825a.run();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getName().equals("onSkuDetailsResponse")) {
                Object obj2 = objArr[1];
                if (obj2 instanceof List) {
                    m100203a((List) obj2);
                    return null;
                }
                return null;
            }
            return null;
        }
    }

    public JZ1(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, NZ1 nz1) {
        this.f17803a = context;
        this.f17804b = obj;
        this.f17806d = cls;
        this.f17807e = cls2;
        this.f17808f = cls3;
        this.f17809g = cls4;
        this.f17810h = cls5;
        this.f17811i = cls6;
        this.f17812j = cls7;
        this.f17813k = method;
        this.f17814l = method2;
        this.f17815m = method3;
        this.f17816n = method4;
        this.f17817o = method5;
        this.f17818p = method6;
        this.f17819q = method7;
        this.f17805c = nz1;
    }

    /* renamed from: a */
    public static /* synthetic */ Set m100219a(JZ1 jz1) {
        if (TD0.m84203d(JZ1.class)) {
            return null;
        }
        try {
            return jz1.f17820r;
        } catch (Throwable th) {
            TD0.m84205b(th, JZ1.class);
            return null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m100218b(JZ1 jz1, String str, List list, Runnable runnable) {
        if (TD0.m84203d(JZ1.class)) {
            return;
        }
        try {
            jz1.m100206n(str, list, runnable);
        } catch (Throwable th) {
            TD0.m84205b(th, JZ1.class);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Class m100217c(JZ1 jz1) {
        if (TD0.m84203d(JZ1.class)) {
            return null;
        }
        try {
            return jz1.f17810h;
        } catch (Throwable th) {
            TD0.m84205b(th, JZ1.class);
            return null;
        }
    }

    /* renamed from: d */
    public static /* synthetic */ Method m100216d(JZ1 jz1) {
        if (TD0.m84203d(JZ1.class)) {
            return null;
        }
        try {
            return jz1.f17817o;
        } catch (Throwable th) {
            TD0.m84205b(th, JZ1.class);
            return null;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ Context m100215e(JZ1 jz1) {
        if (TD0.m84203d(JZ1.class)) {
            return null;
        }
        try {
            return jz1.f17803a;
        } catch (Throwable th) {
            TD0.m84205b(th, JZ1.class);
            return null;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ Class m100214f(JZ1 jz1) {
        if (TD0.m84203d(JZ1.class)) {
            return null;
        }
        try {
            return jz1.f17809g;
        } catch (Throwable th) {
            TD0.m84205b(th, JZ1.class);
            return null;
        }
    }

    /* renamed from: g */
    public static /* synthetic */ Method m100213g(JZ1 jz1) {
        if (TD0.m84203d(JZ1.class)) {
            return null;
        }
        try {
            return jz1.f17816n;
        } catch (Throwable th) {
            TD0.m84205b(th, JZ1.class);
            return null;
        }
    }

    /* renamed from: h */
    public static Object m100212h(Context context, Class<?> cls) {
        Object m92011c;
        Object m92011c2;
        Object m92011c3;
        if (TD0.m84203d(JZ1.class)) {
            return null;
        }
        try {
            Class<?> m92013a = OZ1.m92013a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> m92013a2 = OZ1.m92013a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (m92013a != null && m92013a2 != null) {
                Method m92012b = OZ1.m92012b(cls, "newBuilder", Context.class);
                Method m92012b2 = OZ1.m92012b(m92013a, "enablePendingPurchases", new Class[0]);
                Method m92012b3 = OZ1.m92012b(m92013a, "setListener", m92013a2);
                Method m92012b4 = OZ1.m92012b(m92013a, JsonPOJOBuilder.DEFAULT_BUILD_METHOD, new Class[0]);
                if (m92012b == null || m92012b2 == null || m92012b3 == null || m92012b4 == null || (m92011c = OZ1.m92011c(cls, m92012b, null, context)) == null || (m92011c2 = OZ1.m92011c(m92013a, m92012b3, m92011c, Proxy.newProxyInstance(m92013a2.getClassLoader(), new Class[]{m92013a2}, new C4148d()))) == null || (m92011c3 = OZ1.m92011c(m92013a, m92012b2, m92011c2, new Object[0])) == null) {
                    return null;
                }
                return OZ1.m92011c(m92013a, m92012b4, m92011c3, new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            TD0.m84205b(th, JZ1.class);
            return null;
        }
    }

    /* renamed from: i */
    public static void m100211i(Context context) {
        Object m100212h;
        if (TD0.m84203d(JZ1.class)) {
            return;
        }
        try {
            NZ1 m93762b = NZ1.m93762b();
            if (m93762b == null) {
                return;
            }
            Class<?> m92013a = OZ1.m92013a("com.android.billingclient.api.BillingClient");
            Class<?> m92013a2 = OZ1.m92013a("com.android.billingclient.api.Purchase");
            Class<?> m92013a3 = OZ1.m92013a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class<?> m92013a4 = OZ1.m92013a("com.android.billingclient.api.SkuDetails");
            Class<?> m92013a5 = OZ1.m92013a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> m92013a6 = OZ1.m92013a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class<?> m92013a7 = OZ1.m92013a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (m92013a != null && m92013a3 != null && m92013a2 != null && m92013a4 != null && m92013a6 != null && m92013a5 != null && m92013a7 != null) {
                Method m92012b = OZ1.m92012b(m92013a, "queryPurchases", String.class);
                Method m92012b2 = OZ1.m92012b(m92013a3, "getPurchasesList", new Class[0]);
                Method m92012b3 = OZ1.m92012b(m92013a2, "getOriginalJson", new Class[0]);
                Method m92012b4 = OZ1.m92012b(m92013a4, "getOriginalJson", new Class[0]);
                Method m92012b5 = OZ1.m92012b(m92013a5, "getOriginalJson", new Class[0]);
                Method m92012b6 = OZ1.m92012b(m92013a, "querySkuDetailsAsync", m93762b.m93760d(), m92013a6);
                Method m92012b7 = OZ1.m92012b(m92013a, "queryPurchaseHistoryAsync", String.class, m92013a7);
                if (m92012b == null || m92012b2 == null || m92012b3 == null || m92012b4 == null || m92012b5 == null || m92012b6 == null || m92012b7 == null || (m100212h = m100212h(context, m92013a)) == null) {
                    return;
                }
                JZ1 jz1 = new JZ1(context, m100212h, m92013a, m92013a3, m92013a2, m92013a4, m92013a5, m92013a6, m92013a7, m92012b, m92012b2, m92012b3, m92012b4, m92012b5, m92012b6, m92012b7, m93762b);
                f17799t = jz1;
                jz1.m100205o();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, JZ1.class);
        }
    }

    /* renamed from: j */
    public static synchronized JZ1 m100210j(Context context) {
        synchronized (JZ1.class) {
            if (TD0.m84203d(JZ1.class)) {
                return null;
            }
            AtomicBoolean atomicBoolean = f17798s;
            if (atomicBoolean.get()) {
                return f17799t;
            }
            m100211i(context);
            atomicBoolean.set(true);
            return f17799t;
        }
    }

    /* renamed from: k */
    public void m100209k(String str, Runnable runnable) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            Object m92011c = OZ1.m92011c(this.f17807e, this.f17814l, OZ1.m92011c(this.f17806d, this.f17813k, this.f17804b, "inapp"), new Object[0]);
            if (!(m92011c instanceof List)) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) m92011c) {
                    Object m92011c2 = OZ1.m92011c(this.f17808f, this.f17815m, obj, new Object[0]);
                    if (m92011c2 instanceof String) {
                        JSONObject jSONObject = new JSONObject((String) m92011c2);
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            arrayList.add(string);
                            f17801v.put(string, jSONObject);
                        }
                    }
                }
                m100206n(str, arrayList, runnable);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: l */
    public void m100208l(String str, Runnable runnable) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            m100207m(str, new RunnableC4145a(runnable));
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: m */
    public final void m100207m(String str, Runnable runnable) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            OZ1.m92011c(this.f17806d, this.f17819q, this.f17804b, str, Proxy.newProxyInstance(this.f17812j.getClassLoader(), new Class[]{this.f17812j}, new C4147c(runnable)));
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: n */
    public final void m100206n(String str, List<String> list, Runnable runnable) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.f17811i.getClassLoader(), new Class[]{this.f17811i}, new C4149e(runnable));
            OZ1.m92011c(this.f17806d, this.f17818p, this.f17804b, this.f17805c.m93761c(str, list), newProxyInstance);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: o */
    public final void m100205o() {
        Method m92012b;
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            Class<?> m92013a = OZ1.m92013a("com.android.billingclient.api.BillingClientStateListener");
            if (m92013a == null || (m92012b = OZ1.m92012b(this.f17806d, "startConnection", m92013a)) == null) {
                return;
            }
            OZ1.m92011c(this.f17806d, m92012b, this.f17804b, Proxy.newProxyInstance(m92013a.getClassLoader(), new Class[]{m92013a}, new C4146b()));
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }
}
