package p000;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.List;
/* renamed from: wb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51102wb0 {

    /* renamed from: wb0$a */
    /* loaded from: classes.dex */
    public static final class C29921a extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final List<CameraDevice.StateCallback> f116237a = new ArrayList();

        public C29921a(List<CameraDevice.StateCallback> list) {
            for (CameraDevice.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof C29922b)) {
                    this.f116237a.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback stateCallback : this.f116237a) {
                stateCallback.onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback stateCallback : this.f116237a) {
                stateCallback.onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            for (CameraDevice.StateCallback stateCallback : this.f116237a) {
                stateCallback.onError(cameraDevice, i);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback stateCallback : this.f116237a) {
                stateCallback.onOpened(cameraDevice);
            }
        }
    }

    /* renamed from: wb0$b */
    /* loaded from: classes.dex */
    public static final class C29922b extends CameraDevice.StateCallback {
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    private C51102wb0() {
    }

    /* renamed from: a */
    public static CameraDevice.StateCallback m6619a(List<CameraDevice.StateCallback> list) {
        if (list.isEmpty()) {
            return m6618b();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new C29921a(list);
    }

    /* renamed from: b */
    public static CameraDevice.StateCallback m6618b() {
        return new C29922b();
    }
}
