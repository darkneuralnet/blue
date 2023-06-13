package com.google.p034ar.core;

import android.content.Context;
import android.net.Uri;
import com.google.p034ar.core.Config;
import com.google.p034ar.core.VpsAvailabilityFuture;
import com.google.p034ar.core.annotations.UsedByNative;
import com.google.p034ar.core.exceptions.CameraNotAvailableException;
import com.google.p034ar.core.exceptions.FatalException;
import com.google.p034ar.core.exceptions.PlaybackFailedException;
import com.google.p034ar.core.exceptions.RecordingFailedException;
import com.google.p034ar.core.exceptions.UnavailableApkTooOldException;
import com.google.p034ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.p034ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p034ar.core.exceptions.UnavailableSdkTooOldException;
import com.stripe.android.core.networking.AnalyticsRequestV2Factory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
/* renamed from: com.google.ar.core.Session */
/* loaded from: classes6.dex */
public class Session {
    private static final String TAG = "ARCore-Session";
    final C18005m faceCache;
    final long nativeSymbolTableHandle;
    long nativeWrapperHandle;
    private SharedCamera sharedCamera;

    /* renamed from: com.google.ar.core.Session$Feature */
    /* loaded from: classes6.dex */
    public enum Feature {
        FRONT_CAMERA(1),
        SHARED_CAMERA(1000);
        
        final int nativeCode;

        Feature(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.Session$FeatureMapQuality */
    /* loaded from: classes6.dex */
    public enum FeatureMapQuality {
        INSUFFICIENT(0),
        SUFFICIENT(1),
        GOOD(2);
        
        final int nativeCode;

        FeatureMapQuality(int i) {
            this.nativeCode = i;
        }

        public static FeatureMapQuality forNumber(int i) {
            FeatureMapQuality[] values;
            for (FeatureMapQuality featureMapQuality : values()) {
                if (featureMapQuality.nativeCode == i) {
                    return featureMapQuality;
                }
            }
            throw new FatalException("Unexpected value for native FeatureMapQuality, value=" + i);
        }
    }

    public Session() {
        this.faceCache = new C18005m();
        this.sharedCamera = null;
        this.nativeWrapperHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    @Deprecated
    public static Session createForSharedCamera(Context context) throws UnavailableArcoreNotInstalledException, UnavailableApkTooOldException, UnavailableSdkTooOldException, UnavailableDeviceNotCompatibleException {
        return new Session(context, EnumSet.of(Feature.SHARED_CAMERA));
    }

    public static ByteBuffer directByteBufferOrDefault(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        }
        return byteBuffer.order(ByteOrder.nativeOrder());
    }

    public static void loadDynamicSymbolsAfterSessionCreate() {
        ArImage.nativeLoadSymbols();
        ImageMetadata.nativeLoadSymbols();
    }

    private native long[] nativeAcquireAllAnchors(long j);

    private native long nativeAcquireEarth(long j);

    private native int nativeCheckModuleAvailability(long j, int i);

    private native void nativeCloseSession(long j);

    private native void nativeConfigure(long j, long j2);

    private native long nativeCreateAnchor(long j, Pose pose);

    private static native long nativeCreateSessionAndWrapperWithFeatures(Context context, int[] iArr) throws UnavailableArcoreNotInstalledException, UnavailableApkTooOldException, UnavailableSdkTooOldException, UnavailableDeviceNotCompatibleException;

    public static native long nativeCreateSessionWrapperFromHandle(long j, long j2);

    private native int nativeEstimateFeatureMapQualityForHosting(long j, Pose pose);

    private native long nativeGetCameraConfig(long j);

    private native void nativeGetConfig(long j, long j2);

    private native int nativeGetPlaybackStatus(long j);

    private native void nativeGetRandomAccessStats(long j, long j2);

    private native int nativeGetRecordingStatus(long j);

    private native long[] nativeGetSupportedCameraConfigs(long j);

    private native long[] nativeGetSupportedCameraConfigsWithFilter(long j, long j2);

    private native long nativeGetSymbolTable(long j);

    private native long nativeHostCloudAnchor(long j, long j2);

    private native long nativeHostCloudAnchorWithTtl(long j, long j2, int i);

    private native boolean nativeIsSupported(long j, long j2);

    private native void nativePause(long j);

    private native void nativeRequestModuleInstallDeferred(long j, int[] iArr);

    private native void nativeRequestModuleInstallImmediate(long j, int[] iArr);

    private native long nativeResolveCloudAnchor(long j, String str);

    private native void nativeResume(long j);

    private native int nativeSetCameraConfig(long j, long j2);

    private native void nativeSetCameraTextureName(long j, int i);

    private native void nativeSetCameraTextureNames(long j, int[] iArr);

    private native void nativeSetDisplayGeometry(long j, int i, int i2, int i3);

    private native void nativeSetPlaybackDataset(long j, String str);

    private native void nativeSetPlaybackDatasetUri(long j, String str);

    private native void nativeStartRecording(long j, long j2);

    private native void nativeStopRecording(long j);

    private native void nativeUpdate(long j, long j2);

    private void pauseSharedCameraIfInUse() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            sharedCamera.pause();
        }
    }

    public static void throwExceptionFromArStatus(int i) throws Exception {
        throwExceptionFromArStatus(null, i, null, null);
    }

    public VpsAvailabilityFuture checkVpsAvailabilityAsync(double d, double d2, Consumer<VpsAvailability> consumer) {
        VpsAvailabilityFuture.CallbackWrapper callbackWrapper;
        if (consumer != null) {
            callbackWrapper = new VpsAvailabilityFuture.CallbackWrapper(consumer);
        } else {
            callbackWrapper = null;
        }
        long[] nativeCheckVpsAvailabilityAsync = nativeCheckVpsAvailabilityAsync(this.nativeWrapperHandle, d, d2, callbackWrapper);
        return new VpsAvailabilityFuture(this, nativeCheckVpsAvailabilityAsync[0], nativeCheckVpsAvailabilityAsync[1]);
    }

    public void close() {
        nativeCloseSession(this.nativeWrapperHandle);
    }

    public void configure(Config config) {
        nativeConfigure(this.nativeWrapperHandle, config.nativeHandle);
    }

    public Collection<Anchor> convertNativeAnchorsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new Anchor(j, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public List<CameraConfig> convertNativeCameraConfigsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new CameraConfig(this, j));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Collection<TrackData> convertNativeTrackDataToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new TrackData(j, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public <T extends Trackable> Collection<T> convertNativeTrackablesToCollection(Class<T> cls, long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            Trackable createTrackable = createTrackable(j);
            if (createTrackable != null) {
                arrayList.add(cls.cast(createTrackable));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.nativeWrapperHandle, pose), this);
    }

    public Trackable createTrackable(long j) {
        EnumC17979af enumC17979af;
        int internalGetType = TrackableBase.internalGetType(this.nativeWrapperHandle, j);
        EnumC17979af[] values = EnumC17979af.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC17979af = values[i];
                if (enumC17979af.f73785j == internalGetType) {
                    break;
                }
                i++;
            } else {
                enumC17979af = null;
                break;
            }
        }
        if (enumC17979af != null) {
            switch (enumC17979af.ordinal()) {
                case 0:
                case 1:
                    return null;
                case 2:
                    return new Plane(j, this);
                case 3:
                    return new Point(j, this);
                case 4:
                    return new AugmentedImage(j, this);
                case 5:
                    return this.faceCache.m48404a(j, this);
                case 6:
                    return getEarth();
                case 7:
                    return new DepthPoint(j, this);
                case 8:
                    return new InstantPlacementPoint(j, this);
                default:
                    throw null;
            }
        }
        TrackableBase.internalReleaseNativeHandle(this.nativeSymbolTableHandle, j);
        return null;
    }

    public FeatureMapQuality estimateFeatureMapQualityForHosting(Pose pose) {
        return FeatureMapQuality.forNumber(nativeEstimateFeatureMapQualityForHosting(this.nativeWrapperHandle, pose));
    }

    public void finalize() throws Throwable {
        long j = this.nativeWrapperHandle;
        if (j != 0) {
            nativeDestroySessionWrapper(j);
            this.nativeWrapperHandle = 0L;
        }
        super.finalize();
    }

    public Collection<Anchor> getAllAnchors() {
        return convertNativeAnchorsToCollection(nativeAcquireAllAnchors(this.nativeWrapperHandle));
    }

    public <T extends Trackable> Collection<T> getAllTrackables(Class<T> cls) {
        EnumC17979af m48434a = EnumC17979af.m48434a(cls);
        if (m48434a == EnumC17979af.UNKNOWN_TO_JAVA) {
            return Collections.emptyList();
        }
        return convertNativeTrackablesToCollection(cls, nativeAcquireAllTrackables(this.nativeWrapperHandle, m48434a.f73785j));
    }

    public CameraConfig getCameraConfig() {
        return new CameraConfig(this, nativeGetCameraConfig(this.nativeWrapperHandle));
    }

    public Config getConfig() {
        Config config = new Config(this);
        getConfig(config);
        return config;
    }

    public Earth getEarth() {
        long nativeAcquireEarth = nativeAcquireEarth(this.nativeWrapperHandle);
        if (nativeAcquireEarth != 0) {
            return new Earth(nativeAcquireEarth, this);
        }
        return null;
    }

    public PlaybackStatus getPlaybackStatus() {
        return PlaybackStatus.forNumber(nativeGetPlaybackStatus(this.nativeWrapperHandle));
    }

    public RecordingStatus getRecordingStatus() {
        return RecordingStatus.forNumber(nativeGetRecordingStatus(this.nativeWrapperHandle));
    }

    public SharedCamera getSharedCamera() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            return sharedCamera;
        }
        throw new IllegalStateException("Shared camera is not in use, please create session using new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA)).");
    }

    @Deprecated
    public List<CameraConfig> getSupportedCameraConfigs() {
        return convertNativeCameraConfigsToCollection(nativeGetSupportedCameraConfigs(this.nativeWrapperHandle));
    }

    public Anchor hostCloudAnchor(Anchor anchor) {
        return new Anchor(nativeHostCloudAnchor(this.nativeWrapperHandle, anchor.nativeHandle), this);
    }

    public Anchor hostCloudAnchorWithTtl(Anchor anchor, int i) {
        return new Anchor(nativeHostCloudAnchorWithTtl(this.nativeWrapperHandle, anchor.nativeHandle, i), this);
    }

    public boolean isDepthModeSupported(Config.DepthMode depthMode) {
        return nativeIsDepthModeSupported(this.nativeWrapperHandle, depthMode.nativeCode);
    }

    public boolean isGeospatialModeSupported(Config.GeospatialMode geospatialMode) {
        return nativeIsGeospatialModeSupported(this.nativeWrapperHandle, geospatialMode.nativeCode);
    }

    public boolean isSharedCameraUsed() {
        return this.sharedCamera != null;
    }

    @Deprecated
    public boolean isSupported(Config config) {
        return nativeIsSupported(this.nativeWrapperHandle, config.nativeHandle);
    }

    public native long[] nativeAcquireAllTrackables(long j, int i);

    public native long[] nativeCheckVpsAvailabilityAsync(long j, double d, double d2, VpsAvailabilityFuture.CallbackWrapper callbackWrapper);

    public native void nativeDestroySessionWrapper(long j);

    public native long nativeGetSessionNativeHandle(long j);

    public native boolean nativeIsDepthModeSupported(long j, int i);

    public native boolean nativeIsGeospatialModeSupported(long j, int i);

    public native long nativeReleaseSessionOwnership(long j);

    public void pause() {
        pauseSharedCameraIfInUse();
        nativePause(this.nativeWrapperHandle);
    }

    public Anchor resolveCloudAnchor(String str) {
        return new Anchor(nativeResolveCloudAnchor(this.nativeWrapperHandle, str), this);
    }

    public void resume() throws CameraNotAvailableException {
        nativeResume(this.nativeWrapperHandle);
    }

    public void setCameraConfig(CameraConfig cameraConfig) {
        nativeSetCameraConfig(this.nativeWrapperHandle, cameraConfig.nativeHandle);
    }

    public void setCameraTextureName(int i) {
        nativeSetCameraTextureName(this.nativeWrapperHandle, i);
    }

    public void setCameraTextureNames(int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            nativeSetCameraTextureNames(this.nativeWrapperHandle, iArr);
            return;
        }
        throw new IllegalArgumentException("textureIds must be an array with at least 1 entry.");
    }

    public void setDisplayGeometry(int i, int i2, int i3) {
        nativeSetDisplayGeometry(this.nativeWrapperHandle, i, i2, i3);
    }

    @Deprecated
    public void setPlaybackDataset(String str) throws PlaybackFailedException {
        nativeSetPlaybackDataset(this.nativeWrapperHandle, str);
    }

    public void setPlaybackDatasetUri(Uri uri) throws PlaybackFailedException {
        nativeSetPlaybackDatasetUri(this.nativeWrapperHandle, uri.toString());
    }

    public void startRecording(RecordingConfig recordingConfig) throws RecordingFailedException {
        if (recordingConfig != null) {
            nativeStartRecording(this.nativeWrapperHandle, recordingConfig.nativeHandle);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void stopRecording() throws RecordingFailedException {
        nativeStopRecording(this.nativeWrapperHandle);
    }

    public Frame update() throws CameraNotAvailableException {
        Frame frame = new Frame(this);
        nativeUpdate(this.nativeWrapperHandle, frame.nativeHandle);
        return frame;
    }

    public Session(long j) {
        this.faceCache = new C18005m();
        this.sharedCamera = null;
        this.nativeWrapperHandle = j;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(j);
    }

    @UsedByNative("session_jni.cc")
    public static void throwExceptionFromArStatus(String str, int i, String[] strArr, int[] iArr) throws Exception {
        EnumC17978ae[] values;
        for (EnumC17978ae enumC17978ae : EnumC17978ae.values()) {
            if (enumC17978ae.f73772G == i) {
                Class cls = enumC17978ae.f73773H;
                if (cls == null) {
                    return;
                }
                int i2 = (strArr == null || iArr == null || (i2 = strArr.length) != iArr.length) ? 0 : 0;
                String str2 = enumC17978ae.f73774I;
                if (str2 == null && str == null) {
                    throw ((Exception) cls.getConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (str2 != null) {
                    str = str == null ? str2 : str2.concat(str);
                }
                Exception exc = (Exception) cls.getConstructor(String.class).newInstance(str);
                StackTraceElement[] stackTrace = exc.getStackTrace();
                StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + i2];
                int i3 = 0;
                while (i3 < i2) {
                    stackTraceElementArr[i3] = new StackTraceElement("ARCore", AnalyticsRequestV2Factory.PLUGIN_NATIVE, strArr[i3], iArr[i3]);
                    i3++;
                }
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stackTraceElementArr[i3] = stackTraceElement;
                    i3++;
                }
                exc.setStackTrace(stackTraceElementArr);
                throw exc;
            }
        }
        throw new FatalException("Unexpected error code: " + i);
    }

    public void getConfig(Config config) {
        nativeGetConfig(this.nativeWrapperHandle, config.nativeHandle);
    }

    public List<CameraConfig> getSupportedCameraConfigs(CameraConfigFilter cameraConfigFilter) {
        if (cameraConfigFilter != null) {
            long[] nativeGetSupportedCameraConfigsWithFilter = nativeGetSupportedCameraConfigsWithFilter(this.nativeWrapperHandle, cameraConfigFilter.nativeHandle);
            ArrayList arrayList = new ArrayList(nativeGetSupportedCameraConfigsWithFilter.length);
            for (long j : nativeGetSupportedCameraConfigsWithFilter) {
                arrayList.add(new CameraConfig(this, j));
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public Session(Context context) throws UnavailableArcoreNotInstalledException, UnavailableApkTooOldException, UnavailableSdkTooOldException, UnavailableDeviceNotCompatibleException {
        this(context, EnumSet.noneOf(Feature.class));
    }

    public Session(Context context, Set<Feature> set) throws UnavailableArcoreNotInstalledException, UnavailableApkTooOldException, UnavailableSdkTooOldException, UnavailableDeviceNotCompatibleException, IllegalArgumentException {
        this.faceCache = new C18005m();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        int[] iArr = new int[set.size() + 1];
        int i = 0;
        for (Feature feature : set) {
            iArr[i] = feature.nativeCode;
            i++;
        }
        iArr[i] = 0;
        long nativeCreateSessionAndWrapperWithFeatures = nativeCreateSessionAndWrapperWithFeatures(context, iArr);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithFeatures;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithFeatures);
        if (set.contains(Feature.SHARED_CAMERA)) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }
}
