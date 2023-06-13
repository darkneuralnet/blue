package p000;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p000.InterfaceC48496sB0;
import p000.InterfaceC52024y80;
/* renamed from: vV3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50457vV3 {

    /* renamed from: c */
    public static final C50457vV3 f114175c = m8579f();

    /* renamed from: a */
    public final boolean f114176a;

    /* renamed from: b */
    public final Constructor<MethodHandles.Lookup> f114177b;

    /* renamed from: vV3$a */
    /* loaded from: classes8.dex */
    public static final class C29563a extends C50457vV3 {

        /* renamed from: vV3$a$a */
        /* loaded from: classes8.dex */
        public static final class ExecutorC29564a implements Executor {

            /* renamed from: b */
            public final Handler f114178b = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f114178b.post(runnable);
            }
        }

        public C29563a() {
            super(true);
        }

        @Override // p000.C50457vV3
        /* renamed from: c */
        public Executor mo8576c() {
            return new ExecutorC29564a();
        }

        @Override // p000.C50457vV3
        /* renamed from: h */
        public Object mo8575h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.mo8575h(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    public C50457vV3(boolean z) {
        this.f114176a = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            try {
                constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f114177b = constructor;
    }

    /* renamed from: f */
    public static C50457vV3 m8579f() {
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            return new C29563a();
        }
        return new C50457vV3(true);
    }

    /* renamed from: g */
    public static C50457vV3 m8578g() {
        return f114175c;
    }

    /* renamed from: a */
    public List<? extends InterfaceC52024y80.AbstractC30429a> m8583a(Executor executor) {
        C52835zW0 c52835zW0 = new C52835zW0(executor);
        if (this.f114176a) {
            return Arrays.asList(C44751ls0.f96832a, c52835zW0);
        }
        return Collections.singletonList(c52835zW0);
    }

    /* renamed from: b */
    public int m8582b() {
        return this.f114176a ? 2 : 1;
    }

    /* renamed from: c */
    public Executor mo8576c() {
        return null;
    }

    /* renamed from: d */
    public List<? extends InterfaceC48496sB0.AbstractC28229a> m8581d() {
        return this.f114176a ? Collections.singletonList(C44814ly3.f97021a) : Collections.emptyList();
    }

    /* renamed from: e */
    public int m8580e() {
        return this.f114176a ? 1 : 0;
    }

    @IgnoreJRERequirement
    /* renamed from: h */
    public Object mo8575h(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        MethodHandles.Lookup lookup;
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor<MethodHandles.Lookup> constructor = this.f114177b;
        if (constructor != null) {
            lookup = C46308oV3.m20959a(constructor.newInstance(cls, -1));
        } else {
            lookup = MethodHandles.lookup();
        }
        unreflectSpecial = lookup.unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }

    @IgnoreJRERequirement
    /* renamed from: i */
    public boolean m8577i(Method method) {
        return this.f114176a && method.isDefault();
    }
}
