package p000;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator;
import androidx.camera.core.impl.MetadataHolderService;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import p000.C52891zc0;
import p000.InterfaceC32792Fb0;
import p000.InterfaceC36578Vf6;
import p000.InterfaceC51695xb0;
import p000.O80;
/* renamed from: yc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52298yc0 {

    /* renamed from: o */
    public static final Object f119815o = new Object();

    /* renamed from: p */
    public static final SparseArray<Integer> f119816p = new SparseArray<>();

    /* renamed from: c */
    public final C52891zc0 f119819c;

    /* renamed from: d */
    public final Executor f119820d;

    /* renamed from: e */
    public final Handler f119821e;

    /* renamed from: f */
    public final HandlerThread f119822f;

    /* renamed from: g */
    public InterfaceC32792Fb0 f119823g;

    /* renamed from: h */
    public InterfaceC51695xb0 f119824h;

    /* renamed from: i */
    public InterfaceC36578Vf6 f119825i;

    /* renamed from: j */
    public Context f119826j;

    /* renamed from: k */
    public final ListenableFuture<Void> f119827k;

    /* renamed from: n */
    public final Integer f119830n;

    /* renamed from: a */
    public final C41033fc0 f119817a = new C41033fc0();

    /* renamed from: b */
    public final Object f119818b = new Object();

    /* renamed from: l */
    public EnumC30636a f119828l = EnumC30636a.UNINITIALIZED;

    /* renamed from: m */
    public ListenableFuture<Void> f119829m = IA1.m102836h(null);

    /* renamed from: yc0$a */
    /* loaded from: classes.dex */
    public enum EnumC30636a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public C52298yc0(Context context, C52891zc0.InterfaceC31059b interfaceC31059b) {
        if (interfaceC31059b != null) {
            this.f119819c = interfaceC31059b.getCameraXConfig();
        } else {
            C52891zc0.InterfaceC31059b m3184g = m3184g(context);
            if (m3184g != null) {
                this.f119819c = m3184g.getCameraXConfig();
            } else {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
        }
        Executor m1034S = this.f119819c.m1034S(null);
        Handler m1031V = this.f119819c.m1031V(null);
        this.f119820d = m1034S == null ? new ExecutorC32558Eb0() : m1034S;
        if (m1031V == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f119822f = handlerThread;
            handlerThread.start();
            this.f119821e = PE1.m90563a(handlerThread.getLooper());
        } else {
            this.f119822f = null;
            this.f119821e = m1031V;
        }
        Integer num = (Integer) this.f119819c.mo69360d(C52891zc0.f121619K, null);
        this.f119830n = num;
        m3181j(num);
        this.f119827k = m3179l(context);
    }

    /* renamed from: g */
    public static C52891zc0.InterfaceC31059b m3184g(Context context) {
        String str;
        Application m44548b = C39603dB0.m44548b(context);
        if (m44548b instanceof C52891zc0.InterfaceC31059b) {
            return (C52891zc0.InterfaceC31059b) m44548b;
        }
        try {
            Context m44549a = C39603dB0.m44549a(context);
            Bundle bundle = m44549a.getPackageManager().getServiceInfo(new ComponentName(m44549a, MetadataHolderService.class), 640).metaData;
            if (bundle != null) {
                str = bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER");
            } else {
                str = null;
            }
            if (str == null) {
                C33928Jx2.m99531c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                return null;
            }
            return (C52891zc0.InterfaceC31059b) Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            C33928Jx2.m99530d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    /* renamed from: j */
    public static void m3181j(Integer num) {
        synchronized (f119815o) {
            if (num == null) {
                return;
            }
            HZ3.m103735c(num.intValue(), 3, 6, "minLogLevel");
            SparseArray<Integer> sparseArray = f119816p;
            int i = 1;
            if (sparseArray.get(num.intValue()) != null) {
                i = 1 + sparseArray.get(num.intValue()).intValue();
            }
            sparseArray.put(num.intValue(), Integer.valueOf(i));
            m3174q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m3178m(Executor executor, long j, O80.C5832a c5832a) {
        m3180k(executor, j, this.f119826j, c5832a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m3177n(Context context, final Executor executor, final O80.C5832a c5832a, final long j) {
        try {
            Application m44548b = C39603dB0.m44548b(context);
            this.f119826j = m44548b;
            if (m44548b == null) {
                this.f119826j = C39603dB0.m44549a(context);
            }
            InterfaceC32792Fb0.InterfaceC2361a m1033T = this.f119819c.m1033T(null);
            if (m1033T != null) {
                AbstractC46370oc0 m20797a = AbstractC46370oc0.m20797a(this.f119820d, this.f119821e);
                C42812ic0 m1035R = this.f119819c.m1035R(null);
                this.f119823g = m1033T.mo44117a(this.f119826j, m20797a, m1035R);
                InterfaceC51695xb0.InterfaceC30238a m1032U = this.f119819c.m1032U(null);
                if (m1032U != null) {
                    this.f119824h = m1032U.mo4972a(this.f119826j, this.f119823g.mo10787d(), this.f119823g.mo10789b());
                    InterfaceC36578Vf6.InterfaceC8719c m1030W = this.f119819c.m1030W(null);
                    if (m1030W != null) {
                        this.f119825i = m1030W.mo41163a(this.f119826j);
                        if (executor instanceof ExecutorC32558Eb0) {
                            ((ExecutorC32558Eb0) executor).m108739c(this.f119823g);
                        }
                        this.f119817a.m41119b(this.f119823g);
                        CameraValidator.m69473a(this.f119826j, this.f119817a, m1035R);
                        m3175p();
                        c5832a.m92861c(null);
                        return;
                    }
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
        } catch (InitializationException | CameraValidator.CameraIdListIncorrectException | RuntimeException e) {
            if (SystemClock.elapsedRealtime() - j < 2500) {
                C33928Jx2.m99521m("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                PE1.m90562b(this.f119821e, new Runnable() { // from class: xc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C52298yc0.this.m3178m(executor, j, c5832a);
                    }
                }, "retry_token", 500L);
                return;
            }
            synchronized (this.f119818b) {
                this.f119828l = EnumC30636a.INITIALIZING_ERROR;
            }
            if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                C33928Jx2.m99531c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                c5832a.m92861c(null);
            } else if (e instanceof InitializationException) {
                c5832a.m92858f(e);
            } else {
                c5832a.m92858f(new InitializationException(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m3176o(Context context, O80.C5832a c5832a) throws Exception {
        m3180k(this.f119820d, SystemClock.elapsedRealtime(), context, c5832a);
        return "CameraX initInternal";
    }

    /* renamed from: q */
    public static void m3174q() {
        SparseArray<Integer> sparseArray = f119816p;
        if (sparseArray.size() == 0) {
            C33928Jx2.m99525i();
        } else if (sparseArray.get(3) != null) {
            C33928Jx2.m99524j(3);
        } else if (sparseArray.get(4) != null) {
            C33928Jx2.m99524j(4);
        } else if (sparseArray.get(5) != null) {
            C33928Jx2.m99524j(5);
        } else if (sparseArray.get(6) != null) {
            C33928Jx2.m99524j(6);
        }
    }

    /* renamed from: d */
    public InterfaceC51695xb0 m3187d() {
        InterfaceC51695xb0 interfaceC51695xb0 = this.f119824h;
        if (interfaceC51695xb0 != null) {
            return interfaceC51695xb0;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: e */
    public InterfaceC32792Fb0 m3186e() {
        InterfaceC32792Fb0 interfaceC32792Fb0 = this.f119823g;
        if (interfaceC32792Fb0 != null) {
            return interfaceC32792Fb0;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: f */
    public C41033fc0 m3185f() {
        return this.f119817a;
    }

    /* renamed from: h */
    public InterfaceC36578Vf6 m3183h() {
        InterfaceC36578Vf6 interfaceC36578Vf6 = this.f119825i;
        if (interfaceC36578Vf6 != null) {
            return interfaceC36578Vf6;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: i */
    public ListenableFuture<Void> m3182i() {
        return this.f119827k;
    }

    /* renamed from: k */
    public final void m3180k(final Executor executor, final long j, final Context context, final O80.C5832a<Void> c5832a) {
        executor.execute(new Runnable() { // from class: wc0
            @Override // java.lang.Runnable
            public final void run() {
                C52298yc0.this.m3177n(context, executor, c5832a, j);
            }
        });
    }

    /* renamed from: l */
    public final ListenableFuture<Void> m3179l(final Context context) {
        boolean z;
        ListenableFuture<Void> m92864a;
        synchronized (this.f119818b) {
            if (this.f119828l == EnumC30636a.UNINITIALIZED) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103728j(z, "CameraX.initInternal() should only be called once per instance");
            this.f119828l = EnumC30636a.INITIALIZING;
            m92864a = O80.m92864a(new O80.InterfaceC5834c() { // from class: vc0
                @Override // p000.O80.InterfaceC5834c
                /* renamed from: a */
                public final Object mo3207a(O80.C5832a c5832a) {
                    Object m3176o;
                    m3176o = C52298yc0.this.m3176o(context, c5832a);
                    return m3176o;
                }
            });
        }
        return m92864a;
    }

    /* renamed from: p */
    public final void m3175p() {
        synchronized (this.f119818b) {
            this.f119828l = EnumC30636a.INITIALIZED;
        }
    }
}
