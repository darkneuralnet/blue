package com.google.android.filament.utils;

import com.google.android.filament.ColorGrading;
import com.google.android.filament.Engine;
import com.google.android.filament.Entity;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.LightManager;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.View;
/* loaded from: classes5.dex */
public class AutomationEngine {
    private ColorGrading mColorGrading;
    private final long mNativeObject;

    /* loaded from: classes5.dex */
    public static class Options {
        public float sleepDuration = 0.2f;
        public int minFrameCount = 2;
        public boolean verbose = true;
    }

    /* loaded from: classes5.dex */
    public static class ViewerContent {
        @Entity
        public int[] assetLights;
        public IndirectLight indirectLight;
        public LightManager lightManager;
        public MaterialInstance[] materials;
        public Renderer renderer;
        public Scene scene;
        @Entity
        public int sunlight;
        public View view;
    }

    /* loaded from: classes5.dex */
    public static class ViewerOptions {
        public float cameraAperture = 16.0f;
        public float cameraSpeed = 125.0f;
        public float cameraISO = 100.0f;
        public float groundShadowStrength = 0.75f;
        public boolean groundPlaneEnabled = false;
        public boolean skyboxEnabled = true;
        public float cameraFocalLength = 28.0f;
        public float cameraFocusDistance = 0.0f;
        public boolean autoScaleEnabled = true;
        public boolean autoInstancingEnabled = false;
    }

    public AutomationEngine(String str) {
        long nCreateAutomationEngine = nCreateAutomationEngine(str);
        this.mNativeObject = nCreateAutomationEngine;
        if (nCreateAutomationEngine == 0) {
            throw new IllegalStateException("Couldn't create AutomationEngine");
        }
    }

    private static native void nApplySettings(long j, long j2, String str, long j3, long[] jArr, long j4, int i, int[] iArr, long j5, long j6, long j7);

    private static native long nCreateAutomationEngine(String str);

    private static native long nCreateDefaultAutomationEngine();

    private static native void nDestroy(long j);

    private static native long nGetColorGrading(long j, long j2);

    private static native void nGetViewerOptions(long j, Object obj);

    private static native void nSetOptions(long j, float f, int i, boolean z);

    private static native boolean nShouldClose(long j);

    private static native void nSignalBatchMode(long j);

    private static native void nStartBatchMode(long j);

    private static native void nStartRunning(long j);

    private static native void nStopRunning(long j);

    private static native void nTick(long j, long j2, long j3, long[] jArr, long j4, float f);

    public void applySettings(Engine engine, String str, ViewerContent viewerContent) {
        long[] jArr;
        long nativeObject;
        if (viewerContent.view != null && viewerContent.renderer != null) {
            if (viewerContent.lightManager != null && viewerContent.scene != null) {
                MaterialInstance[] materialInstanceArr = viewerContent.materials;
                if (materialInstanceArr != null) {
                    int length = materialInstanceArr.length;
                    jArr = new long[length];
                    for (int i = 0; i < length; i++) {
                        jArr[i] = viewerContent.materials[i].getNativeObject();
                    }
                } else {
                    jArr = null;
                }
                long[] jArr2 = jArr;
                long nativeObject2 = viewerContent.view.getNativeObject();
                IndirectLight indirectLight = viewerContent.indirectLight;
                if (indirectLight == null) {
                    nativeObject = 0;
                } else {
                    nativeObject = indirectLight.getNativeObject();
                }
                nApplySettings(this.mNativeObject, engine.getNativeObject(), str, nativeObject2, jArr2, nativeObject, viewerContent.sunlight, viewerContent.assetLights, viewerContent.lightManager.getNativeObject(), viewerContent.scene.getNativeObject(), viewerContent.renderer.getNativeObject());
                return;
            }
            throw new IllegalStateException("Must provide a LightManager and Scene");
        }
        throw new IllegalStateException("Must provide a View and Renderer");
    }

    public void finalize() throws Throwable {
        nDestroy(this.mNativeObject);
        super.finalize();
    }

    public ColorGrading getColorGrading(Engine engine) {
        ColorGrading colorGrading;
        long nGetColorGrading = nGetColorGrading(this.mNativeObject, engine.getNativeObject());
        ColorGrading colorGrading2 = this.mColorGrading;
        if (colorGrading2 == null || colorGrading2.getNativeObject() != nGetColorGrading) {
            if (nGetColorGrading == 0) {
                colorGrading = null;
            } else {
                colorGrading = new ColorGrading(nGetColorGrading);
            }
            this.mColorGrading = colorGrading;
        }
        return this.mColorGrading;
    }

    public ViewerOptions getViewerOptions() {
        ViewerOptions viewerOptions = new ViewerOptions();
        nGetViewerOptions(this.mNativeObject, viewerOptions);
        return viewerOptions;
    }

    public void setOptions(Options options) {
        nSetOptions(this.mNativeObject, options.sleepDuration, options.minFrameCount, options.verbose);
    }

    public boolean shouldClose() {
        return nShouldClose(this.mNativeObject);
    }

    public void signalBatchMode() {
        nSignalBatchMode(this.mNativeObject);
    }

    public void startBatchMode() {
        nStartBatchMode(this.mNativeObject);
    }

    public void startRunning() {
        nStartRunning(this.mNativeObject);
    }

    public void stopRunning() {
        nStopRunning(this.mNativeObject);
    }

    public void tick(Engine engine, ViewerContent viewerContent, float f) {
        long[] jArr;
        if (viewerContent.view != null && viewerContent.renderer != null) {
            MaterialInstance[] materialInstanceArr = viewerContent.materials;
            if (materialInstanceArr != null) {
                int length = materialInstanceArr.length;
                jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = viewerContent.materials[i].getNativeObject();
                }
            } else {
                jArr = null;
            }
            long nativeObject = viewerContent.view.getNativeObject();
            long nativeObject2 = viewerContent.renderer.getNativeObject();
            nTick(this.mNativeObject, engine.getNativeObject(), nativeObject, jArr, nativeObject2, f);
            return;
        }
        throw new IllegalStateException("Must provide a View and Renderer");
    }

    public AutomationEngine() {
        long nCreateDefaultAutomationEngine = nCreateDefaultAutomationEngine();
        this.mNativeObject = nCreateDefaultAutomationEngine;
        if (nCreateDefaultAutomationEngine == 0) {
            throw new IllegalStateException("Couldn't create AutomationEngine");
        }
    }
}
