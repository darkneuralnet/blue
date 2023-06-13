package p000;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: NZ1 */
/* loaded from: classes5.dex */
public class NZ1 {

    /* renamed from: g */
    public static NZ1 f24780g;

    /* renamed from: h */
    public static final AtomicBoolean f24781h = new AtomicBoolean(false);

    /* renamed from: a */
    public final Class<?> f24782a;

    /* renamed from: b */
    public final Class<?> f24783b;

    /* renamed from: c */
    public final Method f24784c;

    /* renamed from: d */
    public final Method f24785d;

    /* renamed from: e */
    public final Method f24786e;

    /* renamed from: f */
    public final Method f24787f;

    public NZ1(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f24782a = cls;
        this.f24783b = cls2;
        this.f24784c = method;
        this.f24785d = method2;
        this.f24786e = method3;
        this.f24787f = method4;
    }

    /* renamed from: a */
    public static void m93763a() {
        if (TD0.m84203d(NZ1.class)) {
            return;
        }
        try {
            Class<?> m92013a = OZ1.m92013a("com.android.billingclient.api.SkuDetailsParams");
            Class<?> m92013a2 = OZ1.m92013a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (m92013a != null && m92013a2 != null) {
                Method m92012b = OZ1.m92012b(m92013a, "newBuilder", new Class[0]);
                Method m92012b2 = OZ1.m92012b(m92013a2, "setType", String.class);
                Method m92012b3 = OZ1.m92012b(m92013a2, "setSkusList", List.class);
                Method m92012b4 = OZ1.m92012b(m92013a2, JsonPOJOBuilder.DEFAULT_BUILD_METHOD, new Class[0]);
                if (m92012b != null && m92012b2 != null && m92012b3 != null && m92012b4 != null) {
                    f24780g = new NZ1(m92013a, m92013a2, m92012b, m92012b2, m92012b3, m92012b4);
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, NZ1.class);
        }
    }

    /* renamed from: b */
    public static NZ1 m93762b() {
        if (TD0.m84203d(NZ1.class)) {
            return null;
        }
        try {
            AtomicBoolean atomicBoolean = f24781h;
            if (atomicBoolean.get()) {
                return f24780g;
            }
            m93763a();
            atomicBoolean.set(true);
            return f24780g;
        } catch (Throwable th) {
            TD0.m84205b(th, NZ1.class);
            return null;
        }
    }

    /* renamed from: c */
    public Object m93761c(String str, List<String> list) {
        Object m92011c;
        Object m92011c2;
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            Object m92011c3 = OZ1.m92011c(this.f24782a, this.f24784c, null, new Object[0]);
            if (m92011c3 == null || (m92011c = OZ1.m92011c(this.f24783b, this.f24785d, m92011c3, str)) == null || (m92011c2 = OZ1.m92011c(this.f24783b, this.f24786e, m92011c, list)) == null) {
                return null;
            }
            return OZ1.m92011c(this.f24783b, this.f24787f, m92011c2, new Object[0]);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public Class<?> m93760d() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            return this.f24782a;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }
}
