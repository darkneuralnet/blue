package p000;

import android.os.Handler;
import androidx.camera.core.impl.C11209m;
import androidx.camera.core.impl.C11210n;
import androidx.camera.core.impl.InterfaceC11197f;
import androidx.camera.core.impl.InterfaceC11208l;
import co.bird.android.model.Detail;
import java.util.UUID;
import java.util.concurrent.Executor;
import p000.InterfaceC32792Fb0;
import p000.InterfaceC36578Vf6;
import p000.InterfaceC51695xb0;
/* renamed from: zc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52891zc0 implements RY5<C52298yc0> {

    /* renamed from: F */
    public static final InterfaceC11197f.AbstractC11198a<InterfaceC32792Fb0.InterfaceC2361a> f121614F = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.appConfig.cameraFactoryProvider", InterfaceC32792Fb0.InterfaceC2361a.class);

    /* renamed from: G */
    public static final InterfaceC11197f.AbstractC11198a<InterfaceC51695xb0.InterfaceC30238a> f121615G = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.appConfig.deviceSurfaceManagerProvider", InterfaceC51695xb0.InterfaceC30238a.class);

    /* renamed from: H */
    public static final InterfaceC11197f.AbstractC11198a<InterfaceC36578Vf6.InterfaceC8719c> f121616H = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.appConfig.useCaseConfigFactoryProvider", InterfaceC36578Vf6.InterfaceC8719c.class);

    /* renamed from: I */
    public static final InterfaceC11197f.AbstractC11198a<Executor> f121617I = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.appConfig.cameraExecutor", Executor.class);

    /* renamed from: J */
    public static final InterfaceC11197f.AbstractC11198a<Handler> f121618J = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.appConfig.schedulerHandler", Handler.class);

    /* renamed from: K */
    public static final InterfaceC11197f.AbstractC11198a<Integer> f121619K = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE);

    /* renamed from: L */
    public static final InterfaceC11197f.AbstractC11198a<C42812ic0> f121620L = InterfaceC11197f.AbstractC11198a.m69420a("camerax.core.appConfig.availableCamerasLimiter", C42812ic0.class);

    /* renamed from: E */
    public final C11210n f121621E;

    /* renamed from: zc0$a */
    /* loaded from: classes.dex */
    public static final class C31058a {

        /* renamed from: a */
        public final C11209m f121622a;

        public C31058a() {
            this(C11209m.m69372V());
        }

        /* renamed from: a */
        public C52891zc0 m1029a() {
            return new C52891zc0(C11210n.m69366T(this.f121622a));
        }

        /* renamed from: b */
        public final InterfaceC11208l m1028b() {
            return this.f121622a;
        }

        /* renamed from: c */
        public C31058a m1027c(InterfaceC32792Fb0.InterfaceC2361a interfaceC2361a) {
            m1028b().mo69373C(C52891zc0.f121614F, interfaceC2361a);
            return this;
        }

        /* renamed from: d */
        public C31058a m1026d(InterfaceC51695xb0.InterfaceC30238a interfaceC30238a) {
            m1028b().mo69373C(C52891zc0.f121615G, interfaceC30238a);
            return this;
        }

        /* renamed from: e */
        public C31058a m1025e(Class<C52298yc0> cls) {
            m1028b().mo69373C(RY5.f32204c, cls);
            if (m1028b().mo69360d(RY5.f32203b, null) == null) {
                m1024f(cls.getCanonicalName() + Detail.EMPTY_CHAR + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: f */
        public C31058a m1024f(String str) {
            m1028b().mo69373C(RY5.f32203b, str);
            return this;
        }

        /* renamed from: g */
        public C31058a m1023g(InterfaceC36578Vf6.InterfaceC8719c interfaceC8719c) {
            m1028b().mo69373C(C52891zc0.f121616H, interfaceC8719c);
            return this;
        }

        public C31058a(C11209m c11209m) {
            this.f121622a = c11209m;
            Class cls = (Class) c11209m.mo69360d(RY5.f32204c, null);
            if (cls != null && !cls.equals(C52298yc0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            m1025e(C52298yc0.class);
        }
    }

    /* renamed from: zc0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC31059b {
        C52891zc0 getCameraXConfig();
    }

    public C52891zc0(C11210n c11210n) {
        this.f121621E = c11210n;
    }

    @Override // androidx.camera.core.impl.InterfaceC11212p
    /* renamed from: B */
    public InterfaceC11197f mo1036B() {
        return this.f121621E;
    }

    /* renamed from: R */
    public C42812ic0 m1035R(C42812ic0 c42812ic0) {
        return (C42812ic0) this.f121621E.mo69360d(f121620L, c42812ic0);
    }

    /* renamed from: S */
    public Executor m1034S(Executor executor) {
        return (Executor) this.f121621E.mo69360d(f121617I, executor);
    }

    /* renamed from: T */
    public InterfaceC32792Fb0.InterfaceC2361a m1033T(InterfaceC32792Fb0.InterfaceC2361a interfaceC2361a) {
        return (InterfaceC32792Fb0.InterfaceC2361a) this.f121621E.mo69360d(f121614F, interfaceC2361a);
    }

    /* renamed from: U */
    public InterfaceC51695xb0.InterfaceC30238a m1032U(InterfaceC51695xb0.InterfaceC30238a interfaceC30238a) {
        return (InterfaceC51695xb0.InterfaceC30238a) this.f121621E.mo69360d(f121615G, interfaceC30238a);
    }

    /* renamed from: V */
    public Handler m1031V(Handler handler) {
        return (Handler) this.f121621E.mo69360d(f121618J, handler);
    }

    /* renamed from: W */
    public InterfaceC36578Vf6.InterfaceC8719c m1030W(InterfaceC36578Vf6.InterfaceC8719c interfaceC8719c) {
        return (InterfaceC36578Vf6.InterfaceC8719c) this.f121621E.mo69360d(f121616H, interfaceC8719c);
    }
}
