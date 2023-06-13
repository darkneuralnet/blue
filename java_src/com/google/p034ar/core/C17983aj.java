package com.google.p034ar.core;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.aj */
/* loaded from: classes6.dex */
public final class C17983aj {

    /* renamed from: a */
    private CameraDevice f73795a = null;

    /* renamed from: b */
    private final Map f73796b = new HashMap();

    /* renamed from: c */
    private SurfaceTexture f73797c = null;

    /* renamed from: d */
    private Surface f73798d = null;

    private C17983aj() {
    }

    /* renamed from: a */
    public final SurfaceTexture m48432a() {
        return this.f73797c;
    }

    /* renamed from: b */
    public final CameraDevice m48431b() {
        return this.f73795a;
    }

    /* renamed from: c */
    public final Surface m48430c() {
        return this.f73798d;
    }

    /* renamed from: d */
    public final void m48429d(CameraDevice cameraDevice) {
        this.f73795a = cameraDevice;
    }

    /* renamed from: e */
    public final void m48428e(String str, List list) {
        this.f73796b.put(str, list);
    }

    /* renamed from: f */
    public final void m48427f(Surface surface) {
        this.f73798d = surface;
    }

    /* renamed from: g */
    public final void m48426g(SurfaceTexture surfaceTexture) {
        this.f73797c = surfaceTexture;
    }

    public /* synthetic */ C17983aj(byte[] bArr) {
    }
}
