package com.google.android.filament;

import com.google.android.filament.proguard.UsedByReflection;
/* loaded from: classes5.dex */
public class Engine {
    private static final Backend[] sBackendValues = Backend.values();
    private static final FeatureLevel[] sFeatureLevelValues = FeatureLevel.values();
    private final EntityManager mEntityManager;
    private final LightManager mLightManager;
    private long mNativeObject;
    private final RenderableManager mRenderableManager;
    private final TransformManager mTransformManager;

    /* loaded from: classes5.dex */
    public enum Backend {
        DEFAULT,
        OPENGL,
        VULKAN,
        METAL,
        NOOP
    }

    /* loaded from: classes5.dex */
    public enum FeatureLevel {
        FEATURE_LEVEL_0,
        FEATURE_LEVEL_1,
        FEATURE_LEVEL_2
    }

    private Engine(long j) {
        this.mNativeObject = j;
        this.mTransformManager = new TransformManager(nGetTransformManager(j));
        this.mLightManager = new LightManager(nGetLightManager(j));
        this.mRenderableManager = new RenderableManager(nGetRenderableManager(j));
        this.mEntityManager = new EntityManager(nGetEntityManager(j));
    }

    private static void assertDestroy(boolean z) {
        if (!z) {
            throw new IllegalStateException("Object couldn't be destroyed (double destroy()?)");
        }
    }

    private void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public static Engine create() {
        long nCreateEngine = nCreateEngine(0L, 0L);
        if (nCreateEngine != 0) {
            return new Engine(nCreateEngine);
        }
        throw new IllegalStateException("Couldn't create Engine");
    }

    private static native long nCreateCamera(long j, int i);

    private static native long nCreateEngine(long j, long j2);

    private static native long nCreateFence(long j);

    private static native long nCreateRenderer(long j);

    private static native long nCreateScene(long j);

    private static native long nCreateSwapChain(long j, Object obj, long j2);

    private static native long nCreateSwapChainFromRawPointer(long j, long j2, long j3);

    private static native long nCreateSwapChainHeadless(long j, int i, int i2, long j2);

    private static native long nCreateView(long j);

    private static native void nDestroyCameraComponent(long j, int i);

    private static native boolean nDestroyColorGrading(long j, long j2);

    private static native void nDestroyEngine(long j);

    private static native void nDestroyEntity(long j, int i);

    private static native boolean nDestroyFence(long j, long j2);

    private static native boolean nDestroyIndexBuffer(long j, long j2);

    private static native boolean nDestroyIndirectLight(long j, long j2);

    private static native boolean nDestroyMaterial(long j, long j2);

    private static native boolean nDestroyMaterialInstance(long j, long j2);

    private static native boolean nDestroyRenderTarget(long j, long j2);

    private static native boolean nDestroyRenderer(long j, long j2);

    private static native boolean nDestroyScene(long j, long j2);

    private static native boolean nDestroySkinningBuffer(long j, long j2);

    private static native boolean nDestroySkybox(long j, long j2);

    private static native boolean nDestroyStream(long j, long j2);

    private static native boolean nDestroySwapChain(long j, long j2);

    private static native boolean nDestroyTexture(long j, long j2);

    private static native boolean nDestroyVertexBuffer(long j, long j2);

    private static native boolean nDestroyView(long j, long j2);

    private static native void nFlushAndWait(long j);

    private static native int nGetActiveFeatureLevel(long j);

    private static native long nGetBackend(long j);

    private static native long nGetCameraComponent(long j, int i);

    private static native long nGetEntityManager(long j);

    private static native long nGetJobSystem(long j);

    private static native long nGetLightManager(long j);

    private static native long nGetRenderableManager(long j);

    private static native int nGetSupportedFeatureLevel(long j);

    private static native long nGetTransformManager(long j);

    private static native boolean nIsAutomaticInstancingEnabled(long j);

    private static native int nSetActiveFeatureLevel(long j, int i);

    private static native void nSetAutomaticInstancingEnabled(long j, boolean z);

    public Camera createCamera(@Entity int i) {
        long nCreateCamera = nCreateCamera(getNativeObject(), i);
        if (nCreateCamera != 0) {
            return new Camera(nCreateCamera, i);
        }
        throw new IllegalStateException("Couldn't create Camera");
    }

    public Fence createFence() {
        long nCreateFence = nCreateFence(getNativeObject());
        if (nCreateFence != 0) {
            return new Fence(nCreateFence);
        }
        throw new IllegalStateException("Couldn't create Fence");
    }

    public Renderer createRenderer() {
        long nCreateRenderer = nCreateRenderer(getNativeObject());
        if (nCreateRenderer != 0) {
            return new Renderer(this, nCreateRenderer);
        }
        throw new IllegalStateException("Couldn't create Renderer");
    }

    public Scene createScene() {
        long nCreateScene = nCreateScene(getNativeObject());
        if (nCreateScene != 0) {
            return new Scene(nCreateScene);
        }
        throw new IllegalStateException("Couldn't create Scene");
    }

    public SwapChain createSwapChain(Object obj) {
        return createSwapChain(obj, 0L);
    }

    public SwapChain createSwapChainFromNativeSurface(NativeSurface nativeSurface, long j) {
        long nCreateSwapChainFromRawPointer = nCreateSwapChainFromRawPointer(getNativeObject(), nativeSurface.getNativeObject(), j);
        if (nCreateSwapChainFromRawPointer != 0) {
            return new SwapChain(nCreateSwapChainFromRawPointer, nativeSurface);
        }
        throw new IllegalStateException("Couldn't create SwapChain");
    }

    public View createView() {
        long nCreateView = nCreateView(getNativeObject());
        if (nCreateView != 0) {
            return new View(nCreateView);
        }
        throw new IllegalStateException("Couldn't create View");
    }

    public void destroy() {
        nDestroyEngine(getNativeObject());
        clearNativeObject();
    }

    public void destroyCameraComponent(@Entity int i) {
        nDestroyCameraComponent(getNativeObject(), i);
    }

    public void destroyColorGrading(ColorGrading colorGrading) {
        assertDestroy(nDestroyColorGrading(getNativeObject(), colorGrading.getNativeObject()));
        colorGrading.clearNativeObject();
    }

    public void destroyEntity(@Entity int i) {
        nDestroyEntity(getNativeObject(), i);
    }

    public void destroyFence(Fence fence) {
        assertDestroy(nDestroyFence(getNativeObject(), fence.getNativeObject()));
        fence.clearNativeObject();
    }

    public void destroyIndexBuffer(IndexBuffer indexBuffer) {
        assertDestroy(nDestroyIndexBuffer(getNativeObject(), indexBuffer.getNativeObject()));
        indexBuffer.clearNativeObject();
    }

    public void destroyIndirectLight(IndirectLight indirectLight) {
        assertDestroy(nDestroyIndirectLight(getNativeObject(), indirectLight.getNativeObject()));
        indirectLight.clearNativeObject();
    }

    public void destroyMaterial(Material material) {
        assertDestroy(nDestroyMaterial(getNativeObject(), material.getNativeObject()));
        material.clearNativeObject();
    }

    public void destroyMaterialInstance(MaterialInstance materialInstance) {
        assertDestroy(nDestroyMaterialInstance(getNativeObject(), materialInstance.getNativeObject()));
        materialInstance.clearNativeObject();
    }

    public void destroyRenderTarget(RenderTarget renderTarget) {
        nDestroyRenderTarget(getNativeObject(), renderTarget.getNativeObject());
        renderTarget.clearNativeObject();
    }

    public void destroyRenderer(Renderer renderer) {
        assertDestroy(nDestroyRenderer(getNativeObject(), renderer.getNativeObject()));
        renderer.clearNativeObject();
    }

    public void destroyScene(Scene scene) {
        assertDestroy(nDestroyScene(getNativeObject(), scene.getNativeObject()));
        scene.clearNativeObject();
    }

    public void destroySkinningBuffer(SkinningBuffer skinningBuffer) {
        assertDestroy(nDestroySkinningBuffer(getNativeObject(), skinningBuffer.getNativeObject()));
        skinningBuffer.clearNativeObject();
    }

    public void destroySkybox(Skybox skybox) {
        assertDestroy(nDestroySkybox(getNativeObject(), skybox.getNativeObject()));
        skybox.clearNativeObject();
    }

    public void destroyStream(Stream stream) {
        assertDestroy(nDestroyStream(getNativeObject(), stream.getNativeObject()));
        stream.clearNativeObject();
    }

    public void destroySwapChain(SwapChain swapChain) {
        assertDestroy(nDestroySwapChain(getNativeObject(), swapChain.getNativeObject()));
        swapChain.clearNativeObject();
    }

    public void destroyTexture(Texture texture) {
        assertDestroy(nDestroyTexture(getNativeObject(), texture.getNativeObject()));
        texture.clearNativeObject();
    }

    public void destroyVertexBuffer(VertexBuffer vertexBuffer) {
        assertDestroy(nDestroyVertexBuffer(getNativeObject(), vertexBuffer.getNativeObject()));
        vertexBuffer.clearNativeObject();
    }

    public void destroyView(View view) {
        assertDestroy(nDestroyView(getNativeObject(), view.getNativeObject()));
        view.clearNativeObject();
    }

    public void enableAccurateTranslations() {
        getTransformManager().setAccurateTranslationsEnabled(true);
    }

    public void flushAndWait() {
        nFlushAndWait(getNativeObject());
    }

    public FeatureLevel getActiveFeatureLevel() {
        return sFeatureLevelValues[nGetActiveFeatureLevel(getNativeObject())];
    }

    public Backend getBackend() {
        return sBackendValues[(int) nGetBackend(getNativeObject())];
    }

    public Camera getCameraComponent(@Entity int i) {
        long nGetCameraComponent = nGetCameraComponent(getNativeObject(), i);
        if (nGetCameraComponent == 0) {
            return null;
        }
        return new Camera(nGetCameraComponent, i);
    }

    public EntityManager getEntityManager() {
        return this.mEntityManager;
    }

    public LightManager getLightManager() {
        return this.mLightManager;
    }

    @UsedByReflection("MaterialBuilder.java")
    public long getNativeJobSystem() {
        if (this.mNativeObject != 0) {
            return nGetJobSystem(getNativeObject());
        }
        throw new IllegalStateException("Calling method on destroyed Engine");
    }

    @UsedByReflection("TextureHelper.java")
    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed Engine");
    }

    public RenderableManager getRenderableManager() {
        return this.mRenderableManager;
    }

    public FeatureLevel getSupportedFeatureLevel() {
        return sFeatureLevelValues[nGetSupportedFeatureLevel(getNativeObject())];
    }

    public TransformManager getTransformManager() {
        return this.mTransformManager;
    }

    public boolean isAutomaticInstancingEnabled() {
        return nIsAutomaticInstancingEnabled(getNativeObject());
    }

    public boolean isValid() {
        return this.mNativeObject != 0;
    }

    public FeatureLevel setActiveFeatureLevel(FeatureLevel featureLevel) {
        return sFeatureLevelValues[nSetActiveFeatureLevel(getNativeObject(), featureLevel.ordinal())];
    }

    public void setAutomaticInstancingEnabled(boolean z) {
        nSetAutomaticInstancingEnabled(getNativeObject(), z);
    }

    public SwapChain createSwapChain(Object obj, long j) {
        if (Platform.get().validateSurface(obj)) {
            long nCreateSwapChain = nCreateSwapChain(getNativeObject(), obj, j);
            if (nCreateSwapChain != 0) {
                return new SwapChain(nCreateSwapChain, obj);
            }
            throw new IllegalStateException("Couldn't create SwapChain");
        }
        throw new IllegalArgumentException("Invalid surface " + obj);
    }

    public static Engine create(Backend backend) {
        long nCreateEngine = nCreateEngine(backend.ordinal(), 0L);
        if (nCreateEngine != 0) {
            return new Engine(nCreateEngine);
        }
        throw new IllegalStateException("Couldn't create Engine");
    }

    public static Engine create(Object obj) {
        if (Platform.get().validateSharedContext(obj)) {
            long nCreateEngine = nCreateEngine(0L, Platform.get().getSharedContextNativeHandle(obj));
            if (nCreateEngine != 0) {
                return new Engine(nCreateEngine);
            }
            throw new IllegalStateException("Couldn't create Engine");
        }
        throw new IllegalArgumentException("Invalid shared context " + obj);
    }

    public SwapChain createSwapChain(int i, int i2, long j) {
        if (i >= 0 && i2 >= 0) {
            long nCreateSwapChainHeadless = nCreateSwapChainHeadless(getNativeObject(), i, i2, j);
            if (nCreateSwapChainHeadless != 0) {
                return new SwapChain(nCreateSwapChainHeadless, null);
            }
            throw new IllegalStateException("Couldn't create SwapChain");
        }
        throw new IllegalArgumentException("Invalid parameters");
    }
}
