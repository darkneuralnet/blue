package p000;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;
import p000.C44581lb0;
/* renamed from: lb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44581lb0 {

    /* renamed from: a */
    public final InterfaceC25731a f96415a;

    /* renamed from: lb0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC25731a {
        /* renamed from: a */
        void mo10004a(C49529tv5 c49529tv5) throws CameraAccessExceptionCompat;
    }

    /* renamed from: lb0$b */
    /* loaded from: classes.dex */
    public static final class C25732b extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final CameraDevice.StateCallback f96416a;

        /* renamed from: b */
        public final Executor f96417b;

        public C25732b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f96417b = executor;
            this.f96416a = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m27113e(CameraDevice cameraDevice) {
            this.f96416a.onClosed(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m27112f(CameraDevice cameraDevice) {
            this.f96416a.onDisconnected(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m27111g(CameraDevice cameraDevice, int i) {
            this.f96416a.onError(cameraDevice, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m27110h(CameraDevice cameraDevice) {
            this.f96416a.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f96417b.execute(new Runnable() { // from class: mb0
                @Override // java.lang.Runnable
                public final void run() {
                    C44581lb0.C25732b.this.m27113e(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f96417b.execute(new Runnable() { // from class: nb0
                @Override // java.lang.Runnable
                public final void run() {
                    C44581lb0.C25732b.this.m27112f(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i) {
            this.f96417b.execute(new Runnable() { // from class: pb0
                @Override // java.lang.Runnable
                public final void run() {
                    C44581lb0.C25732b.this.m27111g(cameraDevice, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f96417b.execute(new Runnable() { // from class: ob0
                @Override // java.lang.Runnable
                public final void run() {
                    C44581lb0.C25732b.this.m27110h(cameraDevice);
                }
            });
        }
    }

    public C44581lb0(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f96415a = new C49917ub0(cameraDevice);
        } else {
            this.f96415a = C48139rb0.m15726e(cameraDevice, handler);
        }
    }

    /* renamed from: b */
    public static C44581lb0 m27118b(CameraDevice cameraDevice, Handler handler) {
        return new C44581lb0(cameraDevice, handler);
    }

    /* renamed from: a */
    public void m27119a(C49529tv5 c49529tv5) throws CameraAccessExceptionCompat {
        this.f96415a.mo10004a(c49529tv5);
    }
}
