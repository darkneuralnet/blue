package com.google.android.filament.utils;

import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.google.android.filament.Camera;
import com.google.android.filament.Colors;
import com.google.android.filament.Engine;
import com.google.android.filament.Entity;
import com.google.android.filament.EntityManager;
import com.google.android.filament.LightManager;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.SwapChain;
import com.google.android.filament.TransformManager;
import com.google.android.filament.Viewport;
import com.google.android.filament.android.DisplayHelper;
import com.google.android.filament.android.UiHelper;
import com.google.android.filament.gltfio.Animator;
import com.google.android.filament.gltfio.AssetLoader;
import com.google.android.filament.gltfio.FilamentAsset;
import com.google.android.filament.gltfio.MaterialProvider;
import com.google.android.filament.gltfio.ResourceLoader;
import com.google.android.filament.gltfio.UbershaderProvider;
import com.google.android.filament.utils.Manipulator;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0010\u0018\u0000 \u0087\u00012\u00020\u0001:\u0004\u0087\u0001\u0088\u0001B\u0019\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001B4\b\u0016\u0012\u0006\u0010b\u001a\u00020a\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010[¢\u0006\u0006\b\u0082\u0001\u0010\u0085\u0001B4\b\u0016\u0012\u0006\u0010e\u001a\u00020d\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010[¢\u0006\u0006\b\u0082\u0001\u0010\u0086\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J/\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bJ$\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tJ\"\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ\u0010\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R(\u0010.\u001a\u0004\u0018\u00010-2\b\u0010)\u001a\u0004\u0018\u00010-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00102\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010:\u001a\u0002082\u0006\u00109\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0017\u0010A\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0007\u001a\u00020E8\u0006¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010J\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010O\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020S8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0016\u0010Y\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010n\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010q\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010t\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010|\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010{R\u0014\u0010}\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010{R\u0019\u0010\u0081\u0001\u001a\u0002088F¢\u0006\r\u0012\u0005\b\u007f\u0010\u0080\u0001\u001a\u0004\b~\u0010=\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0089\u0001"}, m28432d2 = {"Lcom/google/android/filament/utils/ModelViewer;", "Landroid/view/View$OnTouchListener;", "Lcom/google/android/filament/gltfio/FilamentAsset;", "asset", "", "populateScene", "Landroid/view/View;", "view", "addDetachListener", "Lkotlin/Function1;", "", "Ljava/nio/Buffer;", "callback", "fetchResources", "(Lcom/google/android/filament/gltfio/FilamentAsset;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCameraProjection", "buffer", "loadModelGlb", "loadModelGltf", "loadModelGltfAsync", "Lcom/google/android/filament/utils/Float3;", "centerPoint", "transformToUnitCube", "clearRootTransform", "destroyModel", "", "frameTimeNanos", "render", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "", "onTouch", "Lcom/google/android/filament/Engine;", "engine", "Lcom/google/android/filament/Engine;", "getEngine", "()Lcom/google/android/filament/Engine;", "Lcom/google/android/filament/android/UiHelper;", "uiHelper", "Lcom/google/android/filament/android/UiHelper;", "<set-?>", "Lcom/google/android/filament/gltfio/FilamentAsset;", "getAsset", "()Lcom/google/android/filament/gltfio/FilamentAsset;", "Lcom/google/android/filament/gltfio/Animator;", "animator", "Lcom/google/android/filament/gltfio/Animator;", "getAnimator", "()Lcom/google/android/filament/gltfio/Animator;", "normalizeSkinningWeights", "Z", "getNormalizeSkinningWeights", "()Z", "setNormalizeSkinningWeights", "(Z)V", "", "value", "cameraFocalLength", "F", "getCameraFocalLength", "()F", "setCameraFocalLength", "(F)V", "Lcom/google/android/filament/Scene;", "scene", "Lcom/google/android/filament/Scene;", "getScene", "()Lcom/google/android/filament/Scene;", "Lcom/google/android/filament/View;", "Lcom/google/android/filament/View;", "getView", "()Lcom/google/android/filament/View;", "Lcom/google/android/filament/Camera;", "camera", "Lcom/google/android/filament/Camera;", "getCamera", "()Lcom/google/android/filament/Camera;", "Lcom/google/android/filament/Renderer;", "renderer", "Lcom/google/android/filament/Renderer;", "getRenderer", "()Lcom/google/android/filament/Renderer;", "", "light", "I", "getLight", "()I", "Lcom/google/android/filament/android/DisplayHelper;", "displayHelper", "Lcom/google/android/filament/android/DisplayHelper;", "Lcom/google/android/filament/utils/Manipulator;", "cameraManipulator", "Lcom/google/android/filament/utils/Manipulator;", "Lcom/google/android/filament/utils/GestureDetector;", "gestureDetector", "Lcom/google/android/filament/utils/GestureDetector;", "Landroid/view/SurfaceView;", "surfaceView", "Landroid/view/SurfaceView;", "Landroid/view/TextureView;", "textureView", "Landroid/view/TextureView;", "Lzh2;", "fetchResourcesJob", "Lzh2;", "Lcom/google/android/filament/SwapChain;", "swapChain", "Lcom/google/android/filament/SwapChain;", "Lcom/google/android/filament/gltfio/AssetLoader;", "assetLoader", "Lcom/google/android/filament/gltfio/AssetLoader;", "Lcom/google/android/filament/gltfio/MaterialProvider;", "materialProvider", "Lcom/google/android/filament/gltfio/MaterialProvider;", "Lcom/google/android/filament/gltfio/ResourceLoader;", "resourceLoader", "Lcom/google/android/filament/gltfio/ResourceLoader;", "", "readyRenderables", "[I", "", "eyePos", "[D", "target", "upward", "getProgress", "getProgress$annotations", "()V", "progress", "<init>", "(Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;)V", "manipulator", "(Landroid/view/SurfaceView;Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;Lcom/google/android/filament/utils/Manipulator;)V", "(Landroid/view/TextureView;Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;Lcom/google/android/filament/utils/Manipulator;)V", "Companion", "SurfaceCallback", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nModelViewer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelViewer.kt\ncom/google/android/filament/utils/ModelViewer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 4 Vector.kt\ncom/google/android/filament/utils/Float3\n*L\n1#1,401:1\n1#2:402\n712#3:403\n293#4,9:404\n*S KotlinDebug\n*F\n+ 1 ModelViewer.kt\ncom/google/android/filament/utils/ModelViewer\n*L\n233#1:403\n235#1:404,9\n*E\n"})
/* loaded from: classes5.dex */
public final class ModelViewer implements View.OnTouchListener {
    public static final Companion Companion = new Companion(null);
    private static final Float3 kDefaultObjectPosition = new Float3(0.0f, 0.0f, -4.0f);
    private Animator animator;
    private FilamentAsset asset;
    private AssetLoader assetLoader;
    private final Camera camera;
    private float cameraFocalLength;
    private Manipulator cameraManipulator;
    private DisplayHelper displayHelper;
    private final Engine engine;
    private final double[] eyePos;
    private InterfaceC52943zh2 fetchResourcesJob;
    private GestureDetector gestureDetector;
    @Entity
    private final int light;
    private MaterialProvider materialProvider;
    private boolean normalizeSkinningWeights;
    private final int[] readyRenderables;
    private final Renderer renderer;
    private ResourceLoader resourceLoader;
    private final Scene scene;
    private SurfaceView surfaceView;
    private SwapChain swapChain;
    private final double[] target;
    private TextureView textureView;
    private final UiHelper uiHelper;
    private final double[] upward;
    private final com.google.android.filament.View view;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/google/android/filament/utils/ModelViewer$Companion;", "", "()V", "kDefaultObjectPosition", "Lcom/google/android/filament/utils/Float3;", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, m28432d2 = {"Lcom/google/android/filament/utils/ModelViewer$SurfaceCallback;", "Lcom/google/android/filament/android/UiHelper$RendererCallback;", "(Lcom/google/android/filament/utils/ModelViewer;)V", "onDetachedFromSurface", "", "onNativeWindowChanged", "surface", "Landroid/view/Surface;", "onResized", "width", "", "height", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nModelViewer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelViewer.kt\ncom/google/android/filament/utils/ModelViewer$SurfaceCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,401:1\n1#2:402\n*E\n"})
    /* loaded from: classes5.dex */
    public final class SurfaceCallback implements UiHelper.RendererCallback {
        public SurfaceCallback() {
        }

        @Override // com.google.android.filament.android.UiHelper.RendererCallback
        public void onDetachedFromSurface() {
            DisplayHelper displayHelper = ModelViewer.this.displayHelper;
            if (displayHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("displayHelper");
                displayHelper = null;
            }
            displayHelper.detach();
            SwapChain swapChain = ModelViewer.this.swapChain;
            if (swapChain != null) {
                ModelViewer modelViewer = ModelViewer.this;
                modelViewer.getEngine().destroySwapChain(swapChain);
                modelViewer.getEngine().flushAndWait();
                modelViewer.swapChain = null;
            }
        }

        @Override // com.google.android.filament.android.UiHelper.RendererCallback
        public void onNativeWindowChanged(Surface surface) {
            Intrinsics.checkNotNullParameter(surface, "surface");
            SwapChain swapChain = ModelViewer.this.swapChain;
            if (swapChain != null) {
                ModelViewer.this.getEngine().destroySwapChain(swapChain);
            }
            ModelViewer modelViewer = ModelViewer.this;
            modelViewer.swapChain = modelViewer.getEngine().createSwapChain(surface);
            SurfaceView surfaceView = ModelViewer.this.surfaceView;
            DisplayHelper displayHelper = null;
            if (surfaceView != null) {
                ModelViewer modelViewer2 = ModelViewer.this;
                DisplayHelper displayHelper2 = modelViewer2.displayHelper;
                if (displayHelper2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("displayHelper");
                    displayHelper2 = null;
                }
                displayHelper2.attach(modelViewer2.getRenderer(), surfaceView.getDisplay());
            }
            TextureView textureView = ModelViewer.this.textureView;
            if (textureView != null) {
                ModelViewer modelViewer3 = ModelViewer.this;
                DisplayHelper displayHelper3 = modelViewer3.displayHelper;
                if (displayHelper3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("displayHelper");
                } else {
                    displayHelper = displayHelper3;
                }
                displayHelper.attach(modelViewer3.getRenderer(), textureView.getDisplay());
            }
        }

        @Override // com.google.android.filament.android.UiHelper.RendererCallback
        public void onResized(int i, int i2) {
            ModelViewer.this.getView().setViewport(new Viewport(0, 0, i, i2));
            Manipulator manipulator = ModelViewer.this.cameraManipulator;
            if (manipulator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraManipulator");
                manipulator = null;
            }
            manipulator.setViewport(i, i2);
            ModelViewer.this.updateCameraProjection();
        }
    }

    public ModelViewer(Engine engine, UiHelper uiHelper) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(uiHelper, "uiHelper");
        this.engine = engine;
        this.uiHelper = uiHelper;
        this.normalizeSkinningWeights = true;
        this.cameraFocalLength = 28.0f;
        this.readyRenderables = new int[128];
        this.eyePos = new double[3];
        this.target = new double[3];
        this.upward = new double[3];
        Renderer createRenderer = engine.createRenderer();
        Intrinsics.checkNotNullExpressionValue(createRenderer, "engine.createRenderer()");
        this.renderer = createRenderer;
        Scene createScene = engine.createScene();
        Intrinsics.checkNotNullExpressionValue(createScene, "engine.createScene()");
        this.scene = createScene;
        Camera createCamera = engine.createCamera(engine.getEntityManager().create());
        Intrinsics.checkNotNullExpressionValue(createCamera, "engine.createCamera(engine.entityManager.create())");
        createCamera.setExposure(16.0f, 0.008f, 100.0f);
        this.camera = createCamera;
        com.google.android.filament.View createView = engine.createView();
        Intrinsics.checkNotNullExpressionValue(createView, "engine.createView()");
        this.view = createView;
        createView.setScene(createScene);
        createView.setCamera(createCamera);
        UbershaderProvider ubershaderProvider = new UbershaderProvider(engine);
        this.materialProvider = ubershaderProvider;
        this.assetLoader = new AssetLoader(engine, ubershaderProvider, EntityManager.get());
        this.resourceLoader = new ResourceLoader(engine, this.normalizeSkinningWeights);
        int create = EntityManager.get().create();
        this.light = create;
        float[] cct = Colors.cct(6500.0f);
        Intrinsics.checkNotNullExpressionValue(cct, "cct(6_500.0f)");
        new LightManager.Builder(LightManager.Type.DIRECTIONAL).color(cct[0], cct[1], cct[2]).intensity(100000.0f).direction(0.0f, -1.0f, 0.0f).castShadows(true).build(engine, create);
        createScene.addEntity(create);
    }

    private final void addDetachListener(View view) {
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.filament.utils.ModelViewer$addDetachListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                UiHelper uiHelper;
                AssetLoader assetLoader;
                MaterialProvider materialProvider;
                MaterialProvider materialProvider2;
                ResourceLoader resourceLoader;
                Intrinsics.checkNotNullParameter(v, "v");
                uiHelper = ModelViewer.this.uiHelper;
                uiHelper.detach();
                ModelViewer.this.destroyModel();
                assetLoader = ModelViewer.this.assetLoader;
                assetLoader.destroy();
                materialProvider = ModelViewer.this.materialProvider;
                materialProvider.destroyMaterials();
                materialProvider2 = ModelViewer.this.materialProvider;
                materialProvider2.destroy();
                resourceLoader = ModelViewer.this.resourceLoader;
                resourceLoader.destroy();
                ModelViewer.this.getEngine().destroyEntity(ModelViewer.this.getLight());
                ModelViewer.this.getEngine().destroyRenderer(ModelViewer.this.getRenderer());
                ModelViewer.this.getEngine().destroyView(ModelViewer.this.getView());
                ModelViewer.this.getEngine().destroyScene(ModelViewer.this.getScene());
                ModelViewer.this.getEngine().destroyCameraComponent(ModelViewer.this.getCamera().getEntity());
                EntityManager.get().destroy(ModelViewer.this.getCamera().getEntity());
                EntityManager.get().destroy(ModelViewer.this.getLight());
                ModelViewer.this.getEngine().destroy();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchResources(FilamentAsset filamentAsset, Function1<? super String, ? extends Buffer> function1, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        HashMap hashMap = new HashMap();
        String[] resourceUris = filamentAsset.getResourceUris();
        Intrinsics.checkNotNullExpressionValue(resourceUris, "asset.resourceUris");
        for (String resourceUri : resourceUris) {
            Intrinsics.checkNotNullExpressionValue(resourceUri, "resourceUri");
            hashMap.put(resourceUri, function1.invoke(resourceUri));
        }
        Object m77504g = X30.m77504g(T41.m84376c(), new ModelViewer$fetchResources$2(hashMap, this, filamentAsset, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m77504g == coroutine_suspended) {
            return m77504g;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getProgress$annotations() {
    }

    private final void populateScene(FilamentAsset filamentAsset) {
        List take;
        int[] intArray;
        RenderableManager renderableManager = this.engine.getRenderableManager();
        Intrinsics.checkNotNullExpressionValue(renderableManager, "engine.renderableManager");
        Ref.IntRef intRef = new Ref.IntRef();
        ModelViewer$populateScene$popRenderables$1 modelViewer$populateScene$popRenderables$1 = new ModelViewer$populateScene$popRenderables$1(intRef, filamentAsset, this);
        while (modelViewer$populateScene$popRenderables$1.invoke().booleanValue()) {
            int i = intRef.element - 1;
            if (i >= 0) {
                int i2 = 0;
                while (true) {
                    renderableManager.setScreenSpaceContactShadows(renderableManager.getInstance(this.readyRenderables[i2]), true);
                    if (i2 != i) {
                        i2++;
                    }
                }
            }
            Scene scene = this.scene;
            take = ArraysKt___ArraysKt.take(this.readyRenderables, intRef.element);
            intArray = CollectionsKt___CollectionsKt.toIntArray(take);
            scene.addEntities(intArray);
        }
        this.scene.addEntities(filamentAsset.getLightEntities());
    }

    public static /* synthetic */ void transformToUnitCube$default(ModelViewer modelViewer, Float3 float3, int i, Object obj) {
        if ((i & 1) != 0) {
            float3 = kDefaultObjectPosition;
        }
        modelViewer.transformToUnitCube(float3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCameraProjection() {
        this.camera.setLensProjection(this.cameraFocalLength, this.view.getViewport().width / this.view.getViewport().height, 0.05d, 1000.0d);
    }

    public final void clearRootTransform() {
        FilamentAsset filamentAsset = this.asset;
        if (filamentAsset != null) {
            TransformManager transformManager = this.engine.getTransformManager();
            Intrinsics.checkNotNullExpressionValue(transformManager, "engine.transformManager");
            transformManager.setTransform(transformManager.getInstance(filamentAsset.getRoot()), new Mat4((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (DefaultConstructorMarker) null).toFloatArray());
        }
    }

    public final void destroyModel() {
        InterfaceC52943zh2 interfaceC52943zh2 = this.fetchResourcesJob;
        if (interfaceC52943zh2 != null) {
            InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
        }
        this.resourceLoader.asyncCancelLoad();
        this.resourceLoader.evictResourceData();
        FilamentAsset filamentAsset = this.asset;
        if (filamentAsset != null) {
            this.scene.removeEntities(filamentAsset.getEntities());
            this.assetLoader.destroyAsset(filamentAsset);
            this.asset = null;
            this.animator = null;
        }
    }

    public final Animator getAnimator() {
        return this.animator;
    }

    public final FilamentAsset getAsset() {
        return this.asset;
    }

    public final Camera getCamera() {
        return this.camera;
    }

    public final float getCameraFocalLength() {
        return this.cameraFocalLength;
    }

    public final Engine getEngine() {
        return this.engine;
    }

    public final int getLight() {
        return this.light;
    }

    public final boolean getNormalizeSkinningWeights() {
        return this.normalizeSkinningWeights;
    }

    public final float getProgress() {
        return this.resourceLoader.asyncGetLoadProgress();
    }

    public final Renderer getRenderer() {
        return this.renderer;
    }

    public final Scene getScene() {
        return this.scene;
    }

    public final com.google.android.filament.View getView() {
        return this.view;
    }

    public final void loadModelGlb(Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        destroyModel();
        FilamentAsset createAsset = this.assetLoader.createAsset(buffer);
        this.asset = createAsset;
        if (createAsset != null) {
            this.resourceLoader.asyncBeginLoad(createAsset);
            this.animator = createAsset.getInstance().getAnimator();
            createAsset.releaseSourceData();
        }
    }

    public final void loadModelGltf(Buffer buffer, Function1<? super String, ? extends Buffer> callback) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(callback, "callback");
        destroyModel();
        FilamentAsset createAsset = this.assetLoader.createAsset(buffer);
        this.asset = createAsset;
        if (createAsset != null) {
            String[] resourceUris = createAsset.getResourceUris();
            Intrinsics.checkNotNullExpressionValue(resourceUris, "asset.resourceUris");
            for (String uri : resourceUris) {
                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                Buffer invoke = callback.invoke(uri);
                if (invoke == null) {
                    this.asset = null;
                    return;
                }
                this.resourceLoader.addResourceData(uri, invoke);
            }
            this.resourceLoader.asyncBeginLoad(createAsset);
            this.animator = createAsset.getInstance().getAnimator();
            createAsset.releaseSourceData();
        }
    }

    public final void loadModelGltfAsync(Buffer buffer, Function1<? super String, ? extends Buffer> callback) {
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(callback, "callback");
        destroyModel();
        this.asset = this.assetLoader.createAsset(buffer);
        m73800d = Z30.m73800d(C37824aD0.m71790a(T41.m84377b()), null, null, new ModelViewer$loadModelGltfAsync$1(this, callback, null), 3, null);
        this.fetchResourcesJob = m73800d;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        onTouchEvent(event);
        return true;
    }

    public final void onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gestureDetector");
            gestureDetector = null;
        }
        gestureDetector.onTouchEvent(event);
    }

    public final void render(long j) {
        if (!this.uiHelper.isReadyToRender()) {
            return;
        }
        this.resourceLoader.asyncUpdateLoad();
        FilamentAsset filamentAsset = this.asset;
        if (filamentAsset != null) {
            populateScene(filamentAsset);
        }
        Manipulator manipulator = this.cameraManipulator;
        if (manipulator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraManipulator");
            manipulator = null;
        }
        manipulator.getLookAt(this.eyePos, this.target, this.upward);
        Camera camera = this.camera;
        double[] dArr = this.eyePos;
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double[] dArr2 = this.target;
        double d4 = dArr2[0];
        double d5 = dArr2[1];
        double d6 = dArr2[2];
        double[] dArr3 = this.upward;
        camera.lookAt(d, d2, d3, d4, d5, d6, dArr3[0], dArr3[1], dArr3[2]);
        Renderer renderer = this.renderer;
        SwapChain swapChain = this.swapChain;
        Intrinsics.checkNotNull(swapChain);
        if (renderer.beginFrame(swapChain, j)) {
            this.renderer.render(this.view);
            this.renderer.endFrame();
        }
    }

    public final void setCameraFocalLength(float f) {
        this.cameraFocalLength = f;
        updateCameraProjection();
    }

    public final void setNormalizeSkinningWeights(boolean z) {
        this.normalizeSkinningWeights = z;
    }

    public final void transformToUnitCube(Float3 centerPoint) {
        Intrinsics.checkNotNullParameter(centerPoint, "centerPoint");
        FilamentAsset filamentAsset = this.asset;
        if (filamentAsset != null) {
            TransformManager transformManager = this.engine.getTransformManager();
            Intrinsics.checkNotNullExpressionValue(transformManager, "engine.transformManager");
            float[] center = filamentAsset.getBoundingBox().getCenter();
            Float3 float3 = new Float3(center[0], center[1], center[2]);
            float[] halfExtent = filamentAsset.getBoundingBox().getHalfExtent();
            Float3 float32 = new Float3(halfExtent[0], halfExtent[1], halfExtent[2]);
            float max = 2.0f / (Math.max(float32.getX(), Math.max(float32.getY(), float32.getZ())) * 2.0f);
            Float3 float33 = new Float3(centerPoint.getX() / max, centerPoint.getY() / max, centerPoint.getZ() / max);
            transformManager.setTransform(transformManager.getInstance(filamentAsset.getRoot()), MatrixKt.transpose(MatrixKt.scale(new Float3(max)).times(MatrixKt.translation(new Float3(float3.getX() - float33.getX(), float3.getY() - float33.getY(), float3.getZ() - float33.getZ()).unaryMinus()))).toFloatArray());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ModelViewer(SurfaceView surfaceView, Engine engine, UiHelper uiHelper, Manipulator manipulator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(surfaceView, engine, (i & 4) != 0 ? new UiHelper(UiHelper.ContextErrorPolicy.DONT_CHECK) : uiHelper, (i & 8) != 0 ? null : manipulator);
        if ((i & 2) != 0) {
            engine = Engine.create();
            Intrinsics.checkNotNullExpressionValue(engine, "create()");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModelViewer(SurfaceView surfaceView, Engine engine, UiHelper uiHelper, Manipulator manipulator) {
        this(engine, uiHelper);
        Intrinsics.checkNotNullParameter(surfaceView, "surfaceView");
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(uiHelper, "uiHelper");
        if (manipulator == null) {
            Manipulator.Builder builder = new Manipulator.Builder();
            Float3 float3 = kDefaultObjectPosition;
            manipulator = builder.targetPosition(float3.getX(), float3.getY(), float3.getZ()).viewport(surfaceView.getWidth(), surfaceView.getHeight()).build(Manipulator.Mode.ORBIT);
            Intrinsics.checkNotNullExpressionValue(manipulator, "Builder()\n              …d(Manipulator.Mode.ORBIT)");
        }
        this.cameraManipulator = manipulator;
        this.surfaceView = surfaceView;
        if (manipulator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraManipulator");
            manipulator = null;
        }
        this.gestureDetector = new GestureDetector(surfaceView, manipulator);
        this.displayHelper = new DisplayHelper(surfaceView.getContext());
        uiHelper.setRenderCallback(new SurfaceCallback());
        uiHelper.attachTo(surfaceView);
        addDetachListener(surfaceView);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ModelViewer(TextureView textureView, Engine engine, UiHelper uiHelper, Manipulator manipulator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textureView, engine, (i & 4) != 0 ? new UiHelper(UiHelper.ContextErrorPolicy.DONT_CHECK) : uiHelper, (i & 8) != 0 ? null : manipulator);
        if ((i & 2) != 0) {
            engine = Engine.create();
            Intrinsics.checkNotNullExpressionValue(engine, "create()");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModelViewer(TextureView textureView, Engine engine, UiHelper uiHelper, Manipulator manipulator) {
        this(engine, uiHelper);
        Intrinsics.checkNotNullParameter(textureView, "textureView");
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(uiHelper, "uiHelper");
        if (manipulator == null) {
            Manipulator.Builder builder = new Manipulator.Builder();
            Float3 float3 = kDefaultObjectPosition;
            manipulator = builder.targetPosition(float3.getX(), float3.getY(), float3.getZ()).viewport(textureView.getWidth(), textureView.getHeight()).build(Manipulator.Mode.ORBIT);
            Intrinsics.checkNotNullExpressionValue(manipulator, "Builder()\n              …d(Manipulator.Mode.ORBIT)");
        }
        this.cameraManipulator = manipulator;
        this.textureView = textureView;
        if (manipulator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraManipulator");
            manipulator = null;
        }
        this.gestureDetector = new GestureDetector(textureView, manipulator);
        this.displayHelper = new DisplayHelper(textureView.getContext());
        uiHelper.setRenderCallback(new SurfaceCallback());
        uiHelper.attachTo(textureView);
        addDetachListener(textureView);
    }
}
