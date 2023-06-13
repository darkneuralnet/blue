package p000;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.AbstractC11253p;
import androidx.camera.core.C11236l;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.C11192d;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.C11222r;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.InterfaceC11191c;
import androidx.camera.core.impl.InterfaceC11225s;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC43405jc0;
import p000.C45777nc0;
import p000.F90;
import p000.InterfaceC34196Lb0;
import p000.O80;
import p000.PX5;
/* renamed from: F90 */
/* loaded from: classes.dex */
public final class F90 implements InterfaceC34196Lb0 {

    /* renamed from: A */
    public InterfaceC11191c f8843A;

    /* renamed from: B */
    public final Object f8844B;

    /* renamed from: C */
    public InterfaceC52493yv5 f8845C;

    /* renamed from: D */
    public boolean f8846D;

    /* renamed from: E */
    public final C42509i51 f8847E;

    /* renamed from: F */
    public final C36761Wa0 f8848F;

    /* renamed from: b */
    public final C11222r f8849b;

    /* renamed from: c */
    public final C35600Rb0 f8850c;

    /* renamed from: d */
    public final Executor f8851d;

    /* renamed from: e */
    public final ScheduledExecutorService f8852e;

    /* renamed from: f */
    public volatile EnumC2182g f8853f = EnumC2182g.INITIALIZED;

    /* renamed from: g */
    public final C36457Us2<InterfaceC34196Lb0.EnumC5034a> f8854g;

    /* renamed from: h */
    public final C43998kc0 f8855h;

    /* renamed from: i */
    public final C47885r90 f8856i;

    /* renamed from: j */
    public final C2183h f8857j;

    /* renamed from: k */
    public final J90 f8858k;

    /* renamed from: l */
    public CameraDevice f8859l;

    /* renamed from: m */
    public int f8860m;

    /* renamed from: n */
    public InterfaceC48771sf0 f8861n;

    /* renamed from: o */
    public final AtomicInteger f8862o;

    /* renamed from: p */
    public O80.C5832a<Void> f8863p;

    /* renamed from: q */
    public final Map<InterfaceC48771sf0, ListenableFuture<Void>> f8864q;

    /* renamed from: r */
    public final C2179d f8865r;

    /* renamed from: s */
    public final C2180e f8866s;

    /* renamed from: t */
    public final InterfaceC43988kb0 f8867t;

    /* renamed from: u */
    public final C45777nc0 f8868u;

    /* renamed from: v */
    public final Set<C48179rf0> f8869v;

    /* renamed from: w */
    public VT2 f8870w;

    /* renamed from: x */
    public final C50549vf0 f8871x;

    /* renamed from: y */
    public final PX5.C6402a f8872y;

    /* renamed from: z */
    public final Set<String> f8873z;

    /* renamed from: F90$a */
    /* loaded from: classes.dex */
    public class C2176a implements CA1<Void> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC48771sf0 f8874a;

        public C2176a(InterfaceC48771sf0 interfaceC48771sf0) {
            this.f8874a = interfaceC48771sf0;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r2) {
            CameraDevice cameraDevice;
            F90.this.f8864q.remove(this.f8874a);
            int i = C2178c.f8877a[F90.this.f8853f.ordinal()];
            if (i != 3) {
                if (i != 7) {
                    if (i != 8) {
                        return;
                    }
                } else if (F90.this.f8860m == 0) {
                    return;
                }
            }
            if (F90.this.m107644O() && (cameraDevice = F90.this.f8859l) != null) {
                C27042oh.m20621a(cameraDevice);
                F90.this.f8859l = null;
            }
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
        }
    }

    /* renamed from: F90$b */
    /* loaded from: classes.dex */
    public class C2177b implements CA1<Void> {
        public C2177b() {
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r2) {
            if (F90.this.f8867t.mo13004c() == 2 && F90.this.f8853f == EnumC2182g.OPENED) {
                F90.this.m107622k0(EnumC2182g.CONFIGURED);
            }
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            if (th instanceof DeferrableSurface.SurfaceClosedException) {
                C11213q m107649J = F90.this.m107649J(((DeferrableSurface.SurfaceClosedException) th).m69457a());
                if (m107649J != null) {
                    F90.this.m107627f0(m107649J);
                }
            } else if (th instanceof CancellationException) {
                F90.this.m107651H("Unable to configure camera cancelled");
            } else {
                EnumC2182g enumC2182g = F90.this.f8853f;
                EnumC2182g enumC2182g2 = EnumC2182g.OPENED;
                if (enumC2182g == enumC2182g2) {
                    F90.this.m107621l0(enumC2182g2, AbstractC43405jc0.AbstractC24956a.m30207b(4, th));
                }
                if (th instanceof CameraAccessException) {
                    F90 f90 = F90.this;
                    f90.m107651H("Unable to configure camera due to " + th.getMessage());
                } else if (th instanceof TimeoutException) {
                    C33928Jx2.m99531c("Camera2CameraImpl", "Unable to configure camera " + F90.this.f8858k.mo98721a() + ", timeout!");
                }
            }
        }
    }

    /* renamed from: F90$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2178c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8877a;

        static {
            int[] iArr = new int[EnumC2182g.values().length];
            f8877a = iArr;
            try {
                iArr[EnumC2182g.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8877a[EnumC2182g.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8877a[EnumC2182g.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8877a[EnumC2182g.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8877a[EnumC2182g.CONFIGURED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8877a[EnumC2182g.OPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8877a[EnumC2182g.REOPENING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8877a[EnumC2182g.RELEASING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8877a[EnumC2182g.RELEASED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: F90$d */
    /* loaded from: classes.dex */
    public final class C2179d extends CameraManager.AvailabilityCallback implements C45777nc0.InterfaceC26554c {

        /* renamed from: a */
        public final String f8878a;

        /* renamed from: b */
        public boolean f8879b = true;

        public C2179d(String str) {
            this.f8878a = str;
        }

        @Override // p000.C45777nc0.InterfaceC26554c
        /* renamed from: a */
        public void mo23437a() {
            if (F90.this.f8853f == EnumC2182g.PENDING_OPEN) {
                F90.this.m107611s0(false);
            }
        }

        /* renamed from: b */
        public boolean m107599b() {
            return this.f8879b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (!this.f8878a.equals(str)) {
                return;
            }
            this.f8879b = true;
            if (F90.this.f8853f == EnumC2182g.PENDING_OPEN) {
                F90.this.m107611s0(false);
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (!this.f8878a.equals(str)) {
                return;
            }
            this.f8879b = false;
        }
    }

    /* renamed from: F90$e */
    /* loaded from: classes.dex */
    public final class C2180e implements C45777nc0.InterfaceC26553b {
        public C2180e() {
        }

        @Override // p000.C45777nc0.InterfaceC26553b
        /* renamed from: a */
        public void mo23438a() {
            if (F90.this.f8853f == EnumC2182g.OPENED) {
                F90.this.m107629d0();
            }
        }
    }

    /* renamed from: F90$f */
    /* loaded from: classes.dex */
    public final class C2181f implements CameraControlInternal.InterfaceC11186b {
        public C2181f() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.InterfaceC11186b
        /* renamed from: a */
        public void mo69475a(List<C11192d> list) {
            F90.this.m107618n0((List) HZ3.m103731g(list));
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.InterfaceC11186b
        /* renamed from: b */
        public void mo69474b() {
            F90.this.m107609t0();
        }
    }

    /* renamed from: F90$g */
    /* loaded from: classes.dex */
    public enum EnumC2182g {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CONFIGURED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    /* renamed from: F90$h */
    /* loaded from: classes.dex */
    public final class C2183h extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final Executor f8893a;

        /* renamed from: b */
        public final ScheduledExecutorService f8894b;

        /* renamed from: c */
        public RunnableC2185b f8895c;

        /* renamed from: d */
        public ScheduledFuture<?> f8896d;

        /* renamed from: e */
        public final C2184a f8897e = new C2184a();

        /* renamed from: F90$h$a */
        /* loaded from: classes.dex */
        public class C2184a {

            /* renamed from: a */
            public long f8899a = -1;

            public C2184a() {
            }

            /* renamed from: a */
            public boolean m107591a() {
                boolean z;
                if (m107590b() >= m107588d()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return true;
                }
                m107587e();
                return false;
            }

            /* renamed from: b */
            public long m107590b() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f8899a == -1) {
                    this.f8899a = uptimeMillis;
                }
                return uptimeMillis - this.f8899a;
            }

            /* renamed from: c */
            public int m107589c() {
                if (!C2183h.this.m107592f()) {
                    return 700;
                }
                long m107590b = m107590b();
                if (m107590b <= 120000) {
                    return 1000;
                }
                if (m107590b <= 300000) {
                    return CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
                }
                return 4000;
            }

            /* renamed from: d */
            public int m107588d() {
                return !C2183h.this.m107592f() ? 10000 : 1800000;
            }

            /* renamed from: e */
            public void m107587e() {
                this.f8899a = -1L;
            }
        }

        /* renamed from: F90$h$b */
        /* loaded from: classes.dex */
        public class RunnableC2185b implements Runnable {

            /* renamed from: b */
            public Executor f8901b;

            /* renamed from: c */
            public boolean f8902c = false;

            public RunnableC2185b(Executor executor) {
                this.f8901b = executor;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m107584c() {
                boolean z;
                if (!this.f8902c) {
                    if (F90.this.f8853f == EnumC2182g.REOPENING) {
                        z = true;
                    } else {
                        z = false;
                    }
                    HZ3.m103729i(z);
                    if (C2183h.this.m107592f()) {
                        F90.this.m107613r0(true);
                    } else {
                        F90.this.m107611s0(true);
                    }
                }
            }

            /* renamed from: b */
            public void m107585b() {
                this.f8902c = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f8901b.execute(new Runnable() { // from class: G90
                    @Override // java.lang.Runnable
                    public final void run() {
                        F90.C2183h.RunnableC2185b.this.m107584c();
                    }
                });
            }
        }

        public C2183h(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f8893a = executor;
            this.f8894b = scheduledExecutorService;
        }

        /* renamed from: a */
        public boolean m107597a() {
            if (this.f8896d == null) {
                return false;
            }
            F90 f90 = F90.this;
            f90.m107651H("Cancelling scheduled re-open: " + this.f8895c);
            this.f8895c.m107585b();
            this.f8895c = null;
            this.f8896d.cancel(false);
            this.f8896d = null;
            return true;
        }

        /* renamed from: b */
        public final void m107596b(CameraDevice cameraDevice, int i) {
            boolean z;
            int i2;
            if (F90.this.f8853f != EnumC2182g.OPENING && F90.this.f8853f != EnumC2182g.OPENED && F90.this.f8853f != EnumC2182g.CONFIGURED && F90.this.f8853f != EnumC2182g.REOPENING) {
                z = false;
            } else {
                z = true;
            }
            HZ3.m103728j(z, "Attempt to handle open error from non open state: " + F90.this.f8853f);
            if (i != 1 && i != 2 && i != 4) {
                C33928Jx2.m99531c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + F90.m107647L(i) + " closing camera.");
                if (i == 3) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
                F90.this.m107621l0(EnumC2182g.CLOSING, AbstractC43405jc0.AbstractC24956a.m30208a(i2));
                F90.this.m107655D(false);
                return;
            }
            C33928Jx2.m99533a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), F90.m107647L(i)));
            m107595c(i);
        }

        /* renamed from: c */
        public final void m107595c(int i) {
            boolean z;
            int i2 = 1;
            if (F90.this.f8860m != 0) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103728j(z, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i != 1) {
                if (i != 2) {
                    i2 = 3;
                }
            } else {
                i2 = 2;
            }
            F90.this.m107621l0(EnumC2182g.REOPENING, AbstractC43405jc0.AbstractC24956a.m30208a(i2));
            F90.this.m107655D(false);
        }

        /* renamed from: d */
        public void m107594d() {
            this.f8897e.m107587e();
        }

        /* renamed from: e */
        public void m107593e() {
            boolean z;
            boolean z2 = true;
            if (this.f8895c == null) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103729i(z);
            if (this.f8896d != null) {
                z2 = false;
            }
            HZ3.m103729i(z2);
            if (this.f8897e.m107591a()) {
                this.f8895c = new RunnableC2185b(this.f8893a);
                F90.this.m107651H("Attempting camera re-open in " + this.f8897e.m107589c() + "ms: " + this.f8895c + " activeResuming = " + F90.this.f8846D);
                this.f8896d = this.f8894b.schedule(this.f8895c, (long) this.f8897e.m107589c(), TimeUnit.MILLISECONDS);
                return;
            }
            C33928Jx2.m99531c("Camera2CameraImpl", "Camera reopening attempted for " + this.f8897e.m107588d() + "ms without success.");
            F90.this.m107619m0(EnumC2182g.PENDING_OPEN, null, false);
        }

        /* renamed from: f */
        public boolean m107592f() {
            int i;
            F90 f90 = F90.this;
            return f90.f8846D && ((i = f90.f8860m) == 1 || i == 2);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            boolean z;
            F90.this.m107651H("CameraDevice.onClosed()");
            if (F90.this.f8859l == null) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103728j(z, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i = C2178c.f8877a[F90.this.f8853f.ordinal()];
            if (i != 3) {
                if (i != 7) {
                    if (i != 8) {
                        throw new IllegalStateException("Camera closed while in state: " + F90.this.f8853f);
                    }
                } else {
                    F90 f90 = F90.this;
                    if (f90.f8860m != 0) {
                        f90.m107651H("Camera closed due to error: " + F90.m107647L(F90.this.f8860m));
                        m107593e();
                        return;
                    }
                    f90.m107611s0(false);
                    return;
                }
            }
            HZ3.m103729i(F90.this.m107644O());
            F90.this.m107648K();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            F90.this.m107651H("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            F90 f90 = F90.this;
            f90.f8859l = cameraDevice;
            f90.f8860m = i;
            switch (C2178c.f8877a[f90.f8853f.ordinal()]) {
                case 3:
                case 8:
                    C33928Jx2.m99531c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), F90.m107647L(i), F90.this.f8853f.name()));
                    F90.this.m107655D(false);
                    return;
                case 4:
                case 5:
                case 6:
                case 7:
                    C33928Jx2.m99533a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), F90.m107647L(i), F90.this.f8853f.name()));
                    m107596b(cameraDevice, i);
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: " + F90.this.f8853f);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            F90.this.m107651H("CameraDevice.onOpened()");
            F90 f90 = F90.this;
            f90.f8859l = cameraDevice;
            f90.f8860m = 0;
            m107594d();
            int i = C2178c.f8877a[F90.this.f8853f.ordinal()];
            if (i != 3) {
                if (i != 6 && i != 7) {
                    if (i != 8) {
                        throw new IllegalStateException("onOpened() should not be possible from state: " + F90.this.f8853f);
                    }
                } else {
                    F90.this.m107622k0(EnumC2182g.OPENED);
                    C45777nc0 c45777nc0 = F90.this.f8868u;
                    String id = cameraDevice.getId();
                    F90 f902 = F90.this;
                    if (c45777nc0.m23445i(id, f902.f8867t.mo13005b(f902.f8859l.getId()))) {
                        F90.this.m107629d0();
                        return;
                    }
                    return;
                }
            }
            HZ3.m103729i(F90.this.m107644O());
            F90.this.f8859l.close();
            F90.this.f8859l = null;
        }
    }

    /* renamed from: F90$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2186i {
        /* renamed from: a */
        public static AbstractC2186i m107583a(String str, Class<?> cls, C11213q c11213q, InterfaceC11225s<?> interfaceC11225s, Size size) {
            return new C26283mt(str, cls, c11213q, interfaceC11225s, size);
        }

        /* renamed from: b */
        public static AbstractC2186i m107582b(AbstractC11253p abstractC11253p) {
            return m107583a(F90.m107646M(abstractC11253p), abstractC11253p.getClass(), abstractC11253p.m69050r(), abstractC11253p.m69058i(), abstractC11253p.m69062e());
        }

        /* renamed from: c */
        public abstract C11213q mo24781c();

        /* renamed from: d */
        public abstract Size mo24780d();

        /* renamed from: e */
        public abstract InterfaceC11225s<?> mo24779e();

        /* renamed from: f */
        public abstract String mo24778f();

        /* renamed from: g */
        public abstract Class<?> mo24777g();
    }

    public F90(C35600Rb0 c35600Rb0, String str, J90 j90, InterfaceC43988kb0 interfaceC43988kb0, C45777nc0 c45777nc0, Executor executor, Handler handler, C42509i51 c42509i51) throws CameraUnavailableException {
        C36457Us2<InterfaceC34196Lb0.EnumC5034a> c36457Us2 = new C36457Us2<>();
        this.f8854g = c36457Us2;
        this.f8860m = 0;
        this.f8862o = new AtomicInteger(0);
        this.f8864q = new LinkedHashMap();
        this.f8869v = new HashSet();
        this.f8873z = new HashSet();
        this.f8843A = C38634bb0.m64299a();
        this.f8844B = new Object();
        this.f8846D = false;
        this.f8850c = c35600Rb0;
        this.f8867t = interfaceC43988kb0;
        this.f8868u = c45777nc0;
        ScheduledExecutorService m115445e = C31631Ac0.m115445e(handler);
        this.f8852e = m115445e;
        Executor m115444f = C31631Ac0.m115444f(executor);
        this.f8851d = m115444f;
        this.f8857j = new C2183h(m115444f, m115445e);
        this.f8849b = new C11222r(str);
        c36457Us2.m80694l(InterfaceC34196Lb0.EnumC5034a.CLOSED);
        C43998kc0 c43998kc0 = new C43998kc0(c45777nc0);
        this.f8855h = c43998kc0;
        C50549vf0 c50549vf0 = new C50549vf0(m115444f);
        this.f8871x = c50549vf0;
        this.f8847E = c42509i51;
        this.f8861n = m107633Z();
        try {
            C36761Wa0 m86590c = c35600Rb0.m86590c(str);
            this.f8848F = m86590c;
            C47885r90 c47885r90 = new C47885r90(m86590c, m115445e, m115444f, new C2181f(), j90.mo98716k());
            this.f8856i = c47885r90;
            this.f8858k = j90;
            j90.m101086u(c47885r90);
            j90.m101083x(c43998kc0.m28800a());
            this.f8872y = new PX5.C6402a(m115444f, m115445e, handler, c50549vf0, j90.mo98716k(), S21.m86078b());
            C2179d c2179d = new C2179d(str);
            this.f8865r = c2179d;
            C2180e c2180e = new C2180e();
            this.f8866s = c2180e;
            c45777nc0.m23447g(this, m115444f, c2180e, c2179d);
            c35600Rb0.m86586g(m115444f, c2179d);
        } catch (CameraAccessExceptionCompat e) {
            throw C46963pc0.m19068a(e);
        }
    }

    /* renamed from: L */
    public static String m107647L(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    /* renamed from: M */
    public static String m107646M(AbstractC11253p abstractC11253p) {
        return abstractC11253p.m69054n() + abstractC11253p.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m107643P(List list) {
        try {
            m107616p0(list);
        } finally {
            this.f8856i.m16370x();
        }
    }

    /* renamed from: Q */
    public static /* synthetic */ void m107642Q(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m107639T(String str, C11213q c11213q, InterfaceC11225s interfaceC11225s) {
        m107651H("Use case " + str + " ACTIVE");
        this.f8849b.m69289q(str, c11213q, interfaceC11225s);
        this.f8849b.m69285u(str, c11213q, interfaceC11225s);
        m107609t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m107638U(String str) {
        m107651H("Use case " + str + " INACTIVE");
        this.f8849b.m69286t(str);
        m107609t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ void m107637V(String str, C11213q c11213q, InterfaceC11225s interfaceC11225s) {
        m107651H("Use case " + str + " RESET");
        this.f8849b.m69285u(str, c11213q, interfaceC11225s);
        m107623j0(false);
        m107609t0();
        if (this.f8853f == EnumC2182g.OPENED) {
            m107629d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m107636W(String str, C11213q c11213q, InterfaceC11225s interfaceC11225s) {
        m107651H("Use case " + str + " UPDATED");
        this.f8849b.m69285u(str, c11213q, interfaceC11225s);
        m107609t0();
    }

    /* renamed from: X */
    public static /* synthetic */ void m107635X(C11213q.InterfaceC11216c interfaceC11216c, C11213q c11213q) {
        interfaceC11216c.mo1277a(c11213q, C11213q.EnumC11220f.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m107634Y(boolean z) {
        this.f8846D = z;
        if (z && this.f8853f == EnumC2182g.PENDING_OPEN) {
            m107613r0(false);
        }
    }

    /* renamed from: A */
    public final void m107658A() {
        if (this.f8870w != null) {
            C11222r c11222r = this.f8849b;
            c11222r.m69288r(this.f8870w.m79865c() + this.f8870w.hashCode(), this.f8870w.m79863e(), this.f8870w.m79862f());
            C11222r c11222r2 = this.f8849b;
            c11222r2.m69289q(this.f8870w.m79865c() + this.f8870w.hashCode(), this.f8870w.m79863e(), this.f8870w.m79862f());
        }
    }

    /* renamed from: B */
    public final void m107657B() {
        C11213q m69311b = this.f8849b.m69300f().m69311b();
        C11192d m69348h = m69311b.m69348h();
        int size = m69348h.m69447f().size();
        int size2 = m69311b.m69345k().size();
        if (!m69311b.m69345k().isEmpty()) {
            if (m69348h.m69447f().isEmpty()) {
                if (this.f8870w == null) {
                    this.f8870w = new VT2(this.f8858k.m101090q(), this.f8847E);
                }
                m107658A();
            } else if (size2 == 1 && size == 1) {
                m107624i0();
            } else if (size >= 2) {
                m107624i0();
            } else {
                C33928Jx2.m99533a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
            }
        }
    }

    /* renamed from: C */
    public final boolean m107656C(C11192d.C11193a c11193a) {
        if (!c11193a.m69431m().isEmpty()) {
            C33928Jx2.m99522l("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        for (C11213q c11213q : this.f8849b.m69301e()) {
            List<DeferrableSurface> m69447f = c11213q.m69348h().m69447f();
            if (!m69447f.isEmpty()) {
                for (DeferrableSurface deferrableSurface : m69447f) {
                    c11193a.m69438f(deferrableSurface);
                }
            }
        }
        if (c11193a.m69431m().isEmpty()) {
            C33928Jx2.m99522l("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public void m107655D(boolean z) {
        boolean z2;
        if (this.f8853f != EnumC2182g.CLOSING && this.f8853f != EnumC2182g.RELEASING && (this.f8853f != EnumC2182g.REOPENING || this.f8860m == 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        HZ3.m103728j(z2, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f8853f + " (error: " + m107647L(this.f8860m) + ")");
        if (Build.VERSION.SDK_INT < 29 && m107645N() && this.f8860m == 0) {
            m107653F(z);
        } else {
            m107623j0(z);
        }
        this.f8861n.mo13894f();
    }

    /* renamed from: E */
    public final void m107654E() {
        m107651H("Closing camera.");
        int i = C2178c.f8877a[this.f8853f.ordinal()];
        boolean z = false;
        if (i != 2) {
            if (i != 4 && i != 5) {
                if (i != 6 && i != 7) {
                    m107651H("close() ignored due to being in state: " + this.f8853f);
                    return;
                }
                boolean m107597a = this.f8857j.m107597a();
                m107622k0(EnumC2182g.CLOSING);
                if (m107597a) {
                    HZ3.m103729i(m107644O());
                    m107648K();
                    return;
                }
                return;
            }
            m107622k0(EnumC2182g.CLOSING);
            m107655D(false);
            return;
        }
        if (this.f8859l == null) {
            z = true;
        }
        HZ3.m103729i(z);
        m107622k0(EnumC2182g.INITIALIZED);
    }

    /* renamed from: F */
    public final void m107653F(boolean z) {
        final C48179rf0 c48179rf0 = new C48179rf0();
        this.f8869v.add(c48179rf0);
        m107623j0(z);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final Runnable runnable = new Runnable() { // from class: C90
            @Override // java.lang.Runnable
            public final void run() {
                F90.m107642Q(surface, surfaceTexture);
            }
        };
        C11213q.C11215b c11215b = new C11213q.C11215b();
        final NY1 ny1 = new NY1(surface);
        c11215b.m69336h(ny1);
        c11215b.m69323u(1);
        m107651H("Start configAndClose.");
        c48179rf0.mo13899a(c11215b.m69331m(), (CameraDevice) HZ3.m103731g(this.f8859l), this.f8872y.m90151a()).addListener(new Runnable() { // from class: D90
            @Override // java.lang.Runnable
            public final void run() {
                F90.this.m107641R(c48179rf0, ny1, runnable);
            }
        }, this.f8851d);
    }

    /* renamed from: G */
    public final CameraDevice.StateCallback m107652G() {
        ArrayList arrayList = new ArrayList(this.f8849b.m69300f().m69311b().m69354b());
        arrayList.add(this.f8871x.m8289c());
        arrayList.add(this.f8857j);
        return C51102wb0.m6619a(arrayList);
    }

    /* renamed from: H */
    public void m107651H(String str) {
        m107650I(str, null);
    }

    /* renamed from: I */
    public final void m107650I(String str, Throwable th) {
        C33928Jx2.m99532b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    /* renamed from: J */
    public C11213q m107649J(DeferrableSurface deferrableSurface) {
        for (C11213q c11213q : this.f8849b.m69299g()) {
            if (c11213q.m69345k().contains(deferrableSurface)) {
                return c11213q;
            }
        }
        return null;
    }

    /* renamed from: K */
    public void m107648K() {
        boolean z;
        if (this.f8853f != EnumC2182g.RELEASING && this.f8853f != EnumC2182g.CLOSING) {
            z = false;
        } else {
            z = true;
        }
        HZ3.m103729i(z);
        HZ3.m103729i(this.f8864q.isEmpty());
        this.f8859l = null;
        if (this.f8853f == EnumC2182g.CLOSING) {
            m107622k0(EnumC2182g.INITIALIZED);
            return;
        }
        this.f8850c.m86585h(this.f8865r);
        m107622k0(EnumC2182g.RELEASED);
        O80.C5832a<Void> c5832a = this.f8863p;
        if (c5832a != null) {
            c5832a.m92861c(null);
            this.f8863p = null;
        }
    }

    /* renamed from: N */
    public final boolean m107645N() {
        if (((J90) mo4467d()).m101088s() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public boolean m107644O() {
        return this.f8864q.isEmpty() && this.f8869v.isEmpty();
    }

    /* renamed from: Z */
    public final InterfaceC48771sf0 m107633Z() {
        synchronized (this.f8844B) {
            if (this.f8845C == null) {
                return new C48179rf0();
            }
            return new X64(this.f8845C, this.f8858k, this.f8851d, this.f8852e);
        }
    }

    /* renamed from: a0 */
    public final void m107632a0(List<AbstractC11253p> list) {
        for (AbstractC11253p abstractC11253p : list) {
            String m107646M = m107646M(abstractC11253p);
            if (!this.f8873z.contains(m107646M)) {
                this.f8873z.add(m107646M);
                abstractC11253p.mo3495I();
                abstractC11253p.mo69075G();
            }
        }
    }

    /* renamed from: b0 */
    public final void m107631b0(List<AbstractC11253p> list) {
        for (AbstractC11253p abstractC11253p : list) {
            String m107646M = m107646M(abstractC11253p);
            if (this.f8873z.contains(m107646M)) {
                abstractC11253p.mo3494J();
                this.f8873z.remove(m107646M);
            }
        }
    }

    @Override // androidx.camera.core.AbstractC11253p.InterfaceC11257d
    /* renamed from: c */
    public void mo4468c(AbstractC11253p abstractC11253p) {
        HZ3.m103731g(abstractC11253p);
        final String m107646M = m107646M(abstractC11253p);
        final C11213q m69050r = abstractC11253p.m69050r();
        final InterfaceC11225s<?> m69058i = abstractC11253p.m69058i();
        this.f8851d.execute(new Runnable() { // from class: z90
            @Override // java.lang.Runnable
            public final void run() {
                F90.this.m107636W(m107646M, m69050r, m69058i);
            }
        });
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c0 */
    public final void m107630c0(boolean z) {
        if (!z) {
            this.f8857j.m107594d();
        }
        this.f8857j.m107597a();
        m107651H("Opening camera.");
        m107622k0(EnumC2182g.OPENING);
        try {
            this.f8850c.m86587f(this.f8858k.mo98721a(), this.f8851d, m107652G());
        } catch (CameraAccessExceptionCompat e) {
            m107651H("Unable to open camera due to " + e.getMessage());
            if (e.m69658d() == 10001) {
                m107621l0(EnumC2182g.INITIALIZED, AbstractC43405jc0.AbstractC24956a.m30207b(7, e));
            }
        } catch (SecurityException e2) {
            m107651H("Unable to open camera due to " + e2.getMessage());
            m107622k0(EnumC2182g.REOPENING);
            this.f8857j.m107593e();
        }
    }

    @Override // p000.InterfaceC34196Lb0
    /* renamed from: d */
    public InterfaceC33962Kb0 mo4467d() {
        return this.f8858k;
    }

    /* renamed from: d0 */
    public void m107629d0() {
        boolean z;
        if (this.f8853f == EnumC2182g.OPENED) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103729i(z);
        C11213q.C11221g m69300f = this.f8849b.m69300f();
        if (!m69300f.m69308e()) {
            m107651H("Unable to create capture session due to conflicting configurations");
        } else if (!this.f8868u.m23445i(this.f8859l.getId(), this.f8867t.mo13005b(this.f8859l.getId()))) {
            m107651H("Unable to create capture session in camera operating mode = " + this.f8867t.mo13004c());
        } else {
            HashMap hashMap = new HashMap();
            DR5.m110450b(this.f8849b.m69299g(), hashMap, this.f8848F, false);
            this.f8861n.mo13892h(hashMap);
            IA1.m102842b(this.f8861n.mo13899a(m69300f.m69311b(), (CameraDevice) HZ3.m103731g(this.f8859l), this.f8872y.m90151a()), new C2177b(), this.f8851d);
        }
    }

    /* renamed from: e0 */
    public final void m107628e0() {
        int i = C2178c.f8877a[this.f8853f.ordinal()];
        boolean z = false;
        if (i != 1 && i != 2) {
            if (i != 3) {
                m107651H("open() ignored due to being in state: " + this.f8853f);
                return;
            }
            m107622k0(EnumC2182g.REOPENING);
            if (!m107644O() && this.f8860m == 0) {
                if (this.f8859l != null) {
                    z = true;
                }
                HZ3.m103728j(z, "Camera Device should be open if session close is not complete");
                m107622k0(EnumC2182g.OPENED);
                m107629d0();
                return;
            }
            return;
        }
        m107613r0(false);
    }

    @Override // p000.InterfaceC34196Lb0
    /* renamed from: f */
    public void mo96609f(InterfaceC11191c interfaceC11191c) {
        if (interfaceC11191c == null) {
            interfaceC11191c = C38634bb0.m64299a();
        }
        InterfaceC52493yv5 m69454Q = interfaceC11191c.m69454Q(null);
        this.f8843A = interfaceC11191c;
        synchronized (this.f8844B) {
            this.f8845C = m69454Q;
        }
    }

    /* renamed from: f0 */
    public void m107627f0(final C11213q c11213q) {
        ScheduledExecutorService m115446d = C31631Ac0.m115446d();
        List<C11213q.InterfaceC11216c> m69353c = c11213q.m69353c();
        if (!m69353c.isEmpty()) {
            final C11213q.InterfaceC11216c interfaceC11216c = m69353c.get(0);
            m107650I("Posting surface closed", new Throwable());
            m115446d.execute(new Runnable() { // from class: y90
                @Override // java.lang.Runnable
                public final void run() {
                    F90.m107635X(C11213q.InterfaceC11216c.this, c11213q);
                }
            });
        }
    }

    @Override // androidx.camera.core.AbstractC11253p.InterfaceC11257d
    /* renamed from: g */
    public void mo4466g(AbstractC11253p abstractC11253p) {
        HZ3.m103731g(abstractC11253p);
        final String m107646M = m107646M(abstractC11253p);
        final C11213q m69050r = abstractC11253p.m69050r();
        final InterfaceC11225s<?> m69058i = abstractC11253p.m69058i();
        this.f8851d.execute(new Runnable() { // from class: x90
            @Override // java.lang.Runnable
            public final void run() {
                F90.this.m107639T(m107646M, m69050r, m69058i);
            }
        });
    }

    /* renamed from: g0 */
    public void m107641R(C48179rf0 c48179rf0, DeferrableSurface deferrableSurface, Runnable runnable) {
        this.f8869v.remove(c48179rf0);
        ListenableFuture<Void> m107625h0 = m107625h0(c48179rf0, false);
        deferrableSurface.m69470c();
        IA1.m102830n(Arrays.asList(m107625h0, deferrableSurface.m69464i())).addListener(runnable, C31631Ac0.m115449a());
    }

    @Override // androidx.camera.core.AbstractC11253p.InterfaceC11257d
    /* renamed from: h */
    public void mo4465h(AbstractC11253p abstractC11253p) {
        HZ3.m103731g(abstractC11253p);
        final String m107646M = m107646M(abstractC11253p);
        final C11213q m69050r = abstractC11253p.m69050r();
        final InterfaceC11225s<?> m69058i = abstractC11253p.m69058i();
        this.f8851d.execute(new Runnable() { // from class: E90
            @Override // java.lang.Runnable
            public final void run() {
                F90.this.m107637V(m107646M, m69050r, m69058i);
            }
        });
    }

    /* renamed from: h0 */
    public ListenableFuture<Void> m107625h0(InterfaceC48771sf0 interfaceC48771sf0, boolean z) {
        interfaceC48771sf0.close();
        ListenableFuture<Void> mo13898b = interfaceC48771sf0.mo13898b(z);
        m107651H("Releasing session in state " + this.f8853f.name());
        this.f8864q.put(interfaceC48771sf0, mo13898b);
        IA1.m102842b(mo13898b, new C2176a(interfaceC48771sf0), C31631Ac0.m115449a());
        return mo13898b;
    }

    @Override // androidx.camera.core.AbstractC11253p.InterfaceC11257d
    /* renamed from: i */
    public void mo4464i(AbstractC11253p abstractC11253p) {
        HZ3.m103731g(abstractC11253p);
        final String m107646M = m107646M(abstractC11253p);
        this.f8851d.execute(new Runnable() { // from class: v90
            @Override // java.lang.Runnable
            public final void run() {
                F90.this.m107638U(m107646M);
            }
        });
    }

    /* renamed from: i0 */
    public final void m107624i0() {
        if (this.f8870w != null) {
            C11222r c11222r = this.f8849b;
            c11222r.m69287s(this.f8870w.m79865c() + this.f8870w.hashCode());
            C11222r c11222r2 = this.f8849b;
            c11222r2.m69286t(this.f8870w.m79865c() + this.f8870w.hashCode());
            this.f8870w.m79866b();
            this.f8870w = null;
        }
    }

    @Override // p000.InterfaceC34196Lb0
    /* renamed from: j */
    public InterfaceC37493Zd3<InterfaceC34196Lb0.EnumC5034a> mo4463j() {
        return this.f8854g;
    }

    /* renamed from: j0 */
    public void m107623j0(boolean z) {
        boolean z2;
        if (this.f8861n != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        HZ3.m103729i(z2);
        m107651H("Resetting Capture Session");
        InterfaceC48771sf0 interfaceC48771sf0 = this.f8861n;
        C11213q mo13897c = interfaceC48771sf0.mo13897c();
        List<C11192d> mo13893g = interfaceC48771sf0.mo13893g();
        InterfaceC48771sf0 m107633Z = m107633Z();
        this.f8861n = m107633Z;
        m107633Z.mo13896d(mo13897c);
        this.f8861n.mo13895e(mo13893g);
        m107625h0(interfaceC48771sf0, z);
    }

    @Override // p000.InterfaceC34196Lb0
    /* renamed from: k */
    public CameraControlInternal mo4462k() {
        return this.f8856i;
    }

    /* renamed from: k0 */
    public void m107622k0(EnumC2182g enumC2182g) {
        m107621l0(enumC2182g, null);
    }

    @Override // p000.InterfaceC34196Lb0
    /* renamed from: l */
    public InterfaceC11191c mo96608l() {
        return this.f8843A;
    }

    /* renamed from: l0 */
    public void m107621l0(EnumC2182g enumC2182g, AbstractC43405jc0.AbstractC24956a abstractC24956a) {
        m107619m0(enumC2182g, abstractC24956a, true);
    }

    /* renamed from: m0 */
    public void m107619m0(EnumC2182g enumC2182g, AbstractC43405jc0.AbstractC24956a abstractC24956a, boolean z) {
        InterfaceC34196Lb0.EnumC5034a enumC5034a;
        m107651H("Transitioning camera internal state: " + this.f8853f + " --> " + enumC2182g);
        this.f8853f = enumC2182g;
        switch (C2178c.f8877a[enumC2182g.ordinal()]) {
            case 1:
                enumC5034a = InterfaceC34196Lb0.EnumC5034a.CLOSED;
                break;
            case 2:
                enumC5034a = InterfaceC34196Lb0.EnumC5034a.PENDING_OPEN;
                break;
            case 3:
                enumC5034a = InterfaceC34196Lb0.EnumC5034a.CLOSING;
                break;
            case 4:
                enumC5034a = InterfaceC34196Lb0.EnumC5034a.OPEN;
                break;
            case 5:
                enumC5034a = InterfaceC34196Lb0.EnumC5034a.CONFIGURED;
                break;
            case 6:
            case 7:
                enumC5034a = InterfaceC34196Lb0.EnumC5034a.OPENING;
                break;
            case 8:
                enumC5034a = InterfaceC34196Lb0.EnumC5034a.RELEASING;
                break;
            case 9:
                enumC5034a = InterfaceC34196Lb0.EnumC5034a.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + enumC2182g);
        }
        this.f8868u.m23449e(this, enumC5034a, z);
        this.f8854g.m80694l(enumC5034a);
        this.f8855h.m28798c(enumC5034a, abstractC24956a);
    }

    @Override // p000.InterfaceC34196Lb0
    /* renamed from: n */
    public void mo96607n(final boolean z) {
        this.f8851d.execute(new Runnable() { // from class: w90
            @Override // java.lang.Runnable
            public final void run() {
                F90.this.m107634Y(z);
            }
        });
    }

    /* renamed from: n0 */
    public void m107618n0(List<C11192d> list) {
        ArrayList arrayList = new ArrayList();
        for (C11192d c11192d : list) {
            C11192d.C11193a m69433k = C11192d.C11193a.m69433k(c11192d);
            if (c11192d.m69445h() == 5 && c11192d.m69450c() != null) {
                m69433k.m69428p(c11192d.m69450c());
            }
            if (!c11192d.m69447f().isEmpty() || !c11192d.m69444i() || m107656C(m69433k)) {
                arrayList.add(m69433k.m69436h());
            }
        }
        m107651H("Issue capture request");
        this.f8861n.mo13895e(arrayList);
    }

    @Override // p000.InterfaceC34196Lb0
    /* renamed from: o */
    public void mo4460o(Collection<AbstractC11253p> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f8856i.m16420O();
        m107632a0(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(m107617o0(arrayList));
        try {
            this.f8851d.execute(new Runnable() { // from class: B90
                @Override // java.lang.Runnable
                public final void run() {
                    F90.this.m107643P(arrayList2);
                }
            });
        } catch (RejectedExecutionException e) {
            m107650I("Unable to attach use cases.", e);
            this.f8856i.m16370x();
        }
    }

    /* renamed from: o0 */
    public final Collection<AbstractC2186i> m107617o0(Collection<AbstractC11253p> collection) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC11253p abstractC11253p : collection) {
            arrayList.add(AbstractC2186i.m107582b(abstractC11253p));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC34196Lb0
    /* renamed from: p */
    public void mo4459p(Collection<AbstractC11253p> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(m107617o0(arrayList));
        m107631b0(new ArrayList(arrayList));
        this.f8851d.execute(new Runnable() { // from class: A90
            @Override // java.lang.Runnable
            public final void run() {
                F90.this.m107640S(arrayList2);
            }
        });
    }

    /* renamed from: p0 */
    public final void m107616p0(Collection<AbstractC2186i> collection) {
        Size mo24780d;
        boolean isEmpty = this.f8849b.m69299g().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (AbstractC2186i abstractC2186i : collection) {
            if (!this.f8849b.m69294l(abstractC2186i.mo24778f())) {
                this.f8849b.m69288r(abstractC2186i.mo24778f(), abstractC2186i.mo24781c(), abstractC2186i.mo24779e());
                arrayList.add(abstractC2186i.mo24778f());
                if (abstractC2186i.mo24777g() == C11236l.class && (mo24780d = abstractC2186i.mo24780d()) != null) {
                    rational = new Rational(mo24780d.getWidth(), mo24780d.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m107651H("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (isEmpty) {
            this.f8856i.m16395g0(true);
            this.f8856i.m16420O();
        }
        m107657B();
        m107607u0();
        m107609t0();
        m107623j0(false);
        if (this.f8853f == EnumC2182g.OPENED) {
            m107629d0();
        } else {
            m107628e0();
        }
        if (rational != null) {
            this.f8856i.m16393h0(rational);
        }
    }

    /* renamed from: q0 */
    public final void m107640S(Collection<AbstractC2186i> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (AbstractC2186i abstractC2186i : collection) {
            if (this.f8849b.m69294l(abstractC2186i.mo24778f())) {
                this.f8849b.m69290p(abstractC2186i.mo24778f());
                arrayList.add(abstractC2186i.mo24778f());
                if (abstractC2186i.mo24777g() == C11236l.class) {
                    z = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        m107651H("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z) {
            this.f8856i.m16393h0(null);
        }
        m107657B();
        if (this.f8849b.m69298h().isEmpty()) {
            this.f8856i.m16389j0(false);
        } else {
            m107607u0();
        }
        if (this.f8849b.m69299g().isEmpty()) {
            this.f8856i.m16370x();
            m107623j0(false);
            this.f8856i.m16395g0(false);
            this.f8861n = m107633Z();
            m107654E();
            return;
        }
        m107609t0();
        m107623j0(false);
        if (this.f8853f == EnumC2182g.OPENED) {
            m107629d0();
        }
    }

    /* renamed from: r0 */
    public void m107613r0(boolean z) {
        m107651H("Attempting to force open the camera.");
        if (!this.f8868u.m23446h(this)) {
            m107651H("No cameras available. Waiting for available camera before opening camera.");
            m107622k0(EnumC2182g.PENDING_OPEN);
            return;
        }
        m107630c0(z);
    }

    /* renamed from: s0 */
    public void m107611s0(boolean z) {
        boolean z2;
        m107651H("Attempting to open the camera.");
        if (this.f8865r.m107599b() && this.f8868u.m23446h(this)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            m107651H("No cameras available. Waiting for available camera before opening camera.");
            m107622k0(EnumC2182g.PENDING_OPEN);
            return;
        }
        m107630c0(z);
    }

    /* renamed from: t0 */
    public void m107609t0() {
        C11213q.C11221g m69302d = this.f8849b.m69302d();
        if (m69302d.m69308e()) {
            this.f8856i.m16391i0(m69302d.m69311b().m69344l());
            m69302d.m69312a(this.f8856i.m16429F());
            this.f8861n.mo13896d(m69302d.m69311b());
            return;
        }
        this.f8856i.m16397f0();
        this.f8861n.mo13896d(this.f8856i.m16429F());
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f8858k.mo98721a());
    }

    /* renamed from: u0 */
    public final void m107607u0() {
        boolean z = false;
        for (InterfaceC11225s<?> interfaceC11225s : this.f8849b.m69298h()) {
            z |= interfaceC11225s.m69276K(false);
        }
        this.f8856i.m16389j0(z);
    }
}
