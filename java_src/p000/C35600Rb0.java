package p000;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p000.C35600Rb0;
/* renamed from: Rb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35600Rb0 {

    /* renamed from: a */
    public final InterfaceC7212b f32256a;

    /* renamed from: b */
    public final Map<String, C36761Wa0> f32257b = new ArrayMap(4);

    /* renamed from: Rb0$a */
    /* loaded from: classes.dex */
    public static final class C7211a extends CameraManager.AvailabilityCallback {

        /* renamed from: a */
        public final Executor f32258a;

        /* renamed from: b */
        public final CameraManager.AvailabilityCallback f32259b;

        /* renamed from: c */
        public final Object f32260c = new Object();

        /* renamed from: d */
        public boolean f32261d = false;

        public C7211a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f32258a = executor;
            this.f32259b = availabilityCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m86581d() {
            C29941wh.m6490a(this.f32259b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m86580e(String str) {
            this.f32259b.onCameraAvailable(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m86579f(String str) {
            this.f32259b.onCameraUnavailable(str);
        }

        /* renamed from: g */
        public void m86578g() {
            synchronized (this.f32260c) {
                this.f32261d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f32260c) {
                if (!this.f32261d) {
                    this.f32258a.execute(new Runnable() { // from class: Ob0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C35600Rb0.C7211a.this.m86581d();
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.f32260c) {
                if (!this.f32261d) {
                    this.f32258a.execute(new Runnable() { // from class: Qb0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C35600Rb0.C7211a.this.m86580e(str);
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.f32260c) {
                if (!this.f32261d) {
                    this.f32258a.execute(new Runnable() { // from class: Pb0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C35600Rb0.C7211a.this.m86579f(str);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: Rb0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC7212b {
        /* renamed from: c */
        static InterfaceC7212b m86577c(Context context, Handler handler) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return new C37004Xb0(context);
            }
            if (i >= 29) {
                return new C36536Vb0(context);
            }
            if (i >= 28) {
                return C36302Ub0.m81300i(context);
            }
            return C37238Yb0.m74832h(context, handler);
        }

        /* renamed from: a */
        void mo74838a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        /* renamed from: b */
        void mo74837b(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat;

        /* renamed from: d */
        CameraCharacteristics mo74836d(String str) throws CameraAccessExceptionCompat;

        /* renamed from: e */
        Set<Set<String>> mo74835e() throws CameraAccessExceptionCompat;

        /* renamed from: f */
        String[] mo74834f() throws CameraAccessExceptionCompat;

        /* renamed from: g */
        void mo74833g(CameraManager.AvailabilityCallback availabilityCallback);
    }

    public C35600Rb0(InterfaceC7212b interfaceC7212b) {
        this.f32256a = interfaceC7212b;
    }

    /* renamed from: a */
    public static C35600Rb0 m86592a(Context context) {
        return m86591b(context, XG2.m77163a());
    }

    /* renamed from: b */
    public static C35600Rb0 m86591b(Context context, Handler handler) {
        return new C35600Rb0(InterfaceC7212b.m86577c(context, handler));
    }

    /* renamed from: c */
    public C36761Wa0 m86590c(String str) throws CameraAccessExceptionCompat {
        C36761Wa0 c36761Wa0;
        synchronized (this.f32257b) {
            c36761Wa0 = this.f32257b.get(str);
            if (c36761Wa0 == null) {
                try {
                    c36761Wa0 = C36761Wa0.m78173d(this.f32256a.mo74836d(str), str);
                    this.f32257b.put(str, c36761Wa0);
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(10002, e.getMessage(), e);
                }
            }
        }
        return c36761Wa0;
    }

    /* renamed from: d */
    public String[] m86589d() throws CameraAccessExceptionCompat {
        return this.f32256a.mo74834f();
    }

    /* renamed from: e */
    public Set<Set<String>> m86588e() throws CameraAccessExceptionCompat {
        return this.f32256a.mo74835e();
    }

    /* renamed from: f */
    public void m86587f(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        this.f32256a.mo74837b(str, executor, stateCallback);
    }

    /* renamed from: g */
    public void m86586g(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f32256a.mo74838a(executor, availabilityCallback);
    }

    /* renamed from: h */
    public void m86585h(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f32256a.mo74833g(availabilityCallback);
    }
}
