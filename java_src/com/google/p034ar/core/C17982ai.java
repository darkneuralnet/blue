package com.google.p034ar.core;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
/* renamed from: com.google.ar.core.ai */
/* loaded from: classes6.dex */
final class C17982ai extends CameraCaptureSession.StateCallback {

    /* renamed from: d */
    public static final /* synthetic */ int f73791d = 0;

    /* renamed from: a */
    final /* synthetic */ Handler f73792a;

    /* renamed from: b */
    final /* synthetic */ CameraCaptureSession.StateCallback f73793b;

    /* renamed from: c */
    final /* synthetic */ SharedCamera f73794c;

    public C17982ai(SharedCamera sharedCamera, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        this.f73794c = sharedCamera;
        this.f73792a = handler;
        this.f73793b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(final CameraCaptureSession cameraCaptureSession) {
        Handler handler = this.f73792a;
        final CameraCaptureSession.StateCallback stateCallback = this.f73793b;
        handler.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSession.StateCallback stateCallback2 = stateCallback;
                CameraCaptureSession cameraCaptureSession2 = cameraCaptureSession;
                int i = C17982ai.f73791d;
                stateCallback2.onActive(cameraCaptureSession2);
            }
        });
        this.f73794c.onCaptureSessionActive(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(final CameraCaptureSession cameraCaptureSession) {
        Handler handler = this.f73792a;
        final CameraCaptureSession.StateCallback stateCallback = this.f73793b;
        handler.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSession.StateCallback stateCallback2 = stateCallback;
                CameraCaptureSession cameraCaptureSession2 = cameraCaptureSession;
                int i = C17982ai.f73791d;
                stateCallback2.onClosed(cameraCaptureSession2);
            }
        });
        this.f73794c.onCaptureSessionClosed(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
        Handler handler = this.f73792a;
        final CameraCaptureSession.StateCallback stateCallback = this.f73793b;
        handler.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSession.StateCallback stateCallback2 = stateCallback;
                CameraCaptureSession cameraCaptureSession2 = cameraCaptureSession;
                int i = C17982ai.f73791d;
                stateCallback2.onConfigureFailed(cameraCaptureSession2);
            }
        });
        this.f73794c.onCaptureSessionConfigureFailed(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(final CameraCaptureSession cameraCaptureSession) {
        C17983aj c17983aj;
        C17983aj unused;
        unused = this.f73794c.sharedCameraInfo;
        Handler handler = this.f73792a;
        final CameraCaptureSession.StateCallback stateCallback = this.f73793b;
        handler.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$2$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSession.StateCallback stateCallback2 = stateCallback;
                CameraCaptureSession cameraCaptureSession2 = cameraCaptureSession;
                int i = C17982ai.f73791d;
                stateCallback2.onConfigured(cameraCaptureSession2);
            }
        });
        this.f73794c.onCaptureSessionConfigured(cameraCaptureSession);
        c17983aj = this.f73794c.sharedCameraInfo;
        if (c17983aj.m48431b() != null) {
            this.f73794c.setDummyListenerToAvoidImageBufferStarvation();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(final CameraCaptureSession cameraCaptureSession) {
        Handler handler = this.f73792a;
        final CameraCaptureSession.StateCallback stateCallback = this.f73793b;
        handler.post(new Runnable() { // from class: com.google.ar.core.SharedCamera$2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CameraCaptureSession.StateCallback stateCallback2 = stateCallback;
                CameraCaptureSession cameraCaptureSession2 = cameraCaptureSession;
                int i = C17982ai.f73791d;
                stateCallback2.onReady(cameraCaptureSession2);
            }
        });
        this.f73794c.onCaptureSessionReady(cameraCaptureSession);
    }
}
