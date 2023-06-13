package com.google.p034ar.core;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
/* renamed from: com.google.ar.core.ah */
/* loaded from: classes6.dex */
final class C17981ah extends CameraDevice.StateCallback {

    /* renamed from: d */
    public static final /* synthetic */ int f73787d = 0;

    /* renamed from: a */
    final /* synthetic */ Handler f73788a;

    /* renamed from: b */
    final /* synthetic */ CameraDevice.StateCallback f73789b;

    /* renamed from: c */
    final /* synthetic */ SharedCamera f73790c;

    public C17981ah(SharedCamera sharedCamera, Handler handler, CameraDevice.StateCallback stateCallback) {
        this.f73790c = sharedCamera;
        this.f73788a = handler;
        this.f73789b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(final CameraDevice cameraDevice) {
        Handler handler = this.f73788a;
        final CameraDevice.StateCallback stateCallback = this.f73789b;
        handler.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CameraDevice.StateCallback stateCallback2 = stateCallback;
                CameraDevice cameraDevice2 = cameraDevice;
                int i = C17981ah.f73787d;
                stateCallback2.onClosed(cameraDevice2);
            }
        });
        this.f73790c.onDeviceClosed(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(final CameraDevice cameraDevice) {
        Handler handler = this.f73788a;
        final CameraDevice.StateCallback stateCallback = this.f73789b;
        handler.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CameraDevice.StateCallback stateCallback2 = stateCallback;
                CameraDevice cameraDevice2 = cameraDevice;
                int i = C17981ah.f73787d;
                stateCallback2.onDisconnected(cameraDevice2);
            }
        });
        this.f73790c.onDeviceDisconnected(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(final CameraDevice cameraDevice, final int i) {
        Handler handler = this.f73788a;
        final CameraDevice.StateCallback stateCallback = this.f73789b;
        handler.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CameraDevice.StateCallback stateCallback2 = stateCallback;
                CameraDevice cameraDevice2 = cameraDevice;
                int i2 = i;
                int i3 = C17981ah.f73787d;
                stateCallback2.onError(cameraDevice2, i2);
            }
        });
        this.f73790c.close();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(final CameraDevice cameraDevice) {
        C17983aj c17983aj;
        C17983aj c17983aj2;
        SurfaceTexture gpuSurfaceTexture;
        C17983aj c17983aj3;
        Surface gpuSurface;
        c17983aj = this.f73790c.sharedCameraInfo;
        c17983aj.m48429d(cameraDevice);
        Handler handler = this.f73788a;
        final CameraDevice.StateCallback stateCallback = this.f73789b;
        handler.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$1$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CameraDevice.StateCallback stateCallback2 = stateCallback;
                CameraDevice cameraDevice2 = cameraDevice;
                int i = C17981ah.f73787d;
                stateCallback2.onOpened(cameraDevice2);
            }
        });
        this.f73790c.onDeviceOpened(cameraDevice);
        c17983aj2 = this.f73790c.sharedCameraInfo;
        gpuSurfaceTexture = this.f73790c.getGpuSurfaceTexture();
        c17983aj2.m48426g(gpuSurfaceTexture);
        c17983aj3 = this.f73790c.sharedCameraInfo;
        gpuSurface = this.f73790c.getGpuSurface();
        c17983aj3.m48427f(gpuSurface);
    }
}
