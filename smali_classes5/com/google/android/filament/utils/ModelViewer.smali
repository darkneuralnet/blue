.class public final Lcom/google/android/filament/utils/ModelViewer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/filament/utils/ModelViewer$SurfaceCallback;,
        Lcom/google/android/filament/utils/ModelViewer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00f2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u0013\n\u0002\u0008\u0010\u0018\u0000 \u0087\u00012\u00020\u0001:\u0004\u0087\u0001\u0088\u0001B\u0019\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0083\u0001B4\u0008\u0016\u0012\u0006\u0010b\u001a\u00020a\u0012\u0008\u0008\u0002\u0010\"\u001a\u00020!\u0012\u0008\u0008\u0002\u0010\'\u001a\u00020&\u0012\u000b\u0008\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010[\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0085\u0001B4\u0008\u0016\u0012\u0006\u0010e\u001a\u00020d\u0012\u0008\u0008\u0002\u0010\"\u001a\u00020!\u0012\u0008\u0008\u0002\u0010\'\u001a\u00020&\u0012\u000b\u0008\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010[\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0086\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J/\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0008\u0010\u000f\u001a\u00020\u0004H\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bJ$\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tJ\"\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ\u0010\u0010\u0016\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016R\u0017\u0010\"\u001a\u00020!8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010)\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010*\u001a\u0004\u0008+\u0010,R(\u0010.\u001a\u0004\u0018\u00010-2\u0008\u0010)\u001a\u0004\u0018\u00010-8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101R\"\u00102\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105\"\u0004\u00086\u00107R*\u0010:\u001a\u0002082\u0006\u00109\u001a\u0002088\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=\"\u0004\u0008>\u0010?R\u0017\u0010A\u001a\u00020@8\u0006\u00a2\u0006\u000c\n\u0004\u0008A\u0010B\u001a\u0004\u0008C\u0010DR\u0017\u0010\u0007\u001a\u00020E8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010F\u001a\u0004\u0008G\u0010HR\u0017\u0010J\u001a\u00020I8\u0006\u00a2\u0006\u000c\n\u0004\u0008J\u0010K\u001a\u0004\u0008L\u0010MR\u0017\u0010O\u001a\u00020N8\u0006\u00a2\u0006\u000c\n\u0004\u0008O\u0010P\u001a\u0004\u0008Q\u0010RR\u001a\u0010T\u001a\u00020S8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008T\u0010U\u001a\u0004\u0008V\u0010WR\u0016\u0010Y\u001a\u00020X8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008Y\u0010ZR\u0016\u0010\\\u001a\u00020[8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008_\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008b\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008e\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008k\u0010lR\u0016\u0010n\u001a\u00020m8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008n\u0010oR\u0016\u0010q\u001a\u00020p8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008q\u0010rR\u0016\u0010t\u001a\u00020s8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008t\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008z\u0010{R\u0014\u0010|\u001a\u00020y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008|\u0010{R\u0014\u0010}\u001a\u00020y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008}\u0010{R\u0019\u0010\u0081\u0001\u001a\u0002088F\u00a2\u0006\r\u0012\u0005\u0008\u007f\u0010\u0080\u0001\u001a\u0004\u0008~\u0010=\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0089\u0001"
    }
    d2 = {
        "Lcom/google/android/filament/utils/ModelViewer;",
        "Landroid/view/View$OnTouchListener;",
        "Lcom/google/android/filament/gltfio/FilamentAsset;",
        "asset",
        "",
        "populateScene",
        "Landroid/view/View;",
        "view",
        "addDetachListener",
        "Lkotlin/Function1;",
        "",
        "Ljava/nio/Buffer;",
        "callback",
        "fetchResources",
        "(Lcom/google/android/filament/gltfio/FilamentAsset;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updateCameraProjection",
        "buffer",
        "loadModelGlb",
        "loadModelGltf",
        "loadModelGltfAsync",
        "Lcom/google/android/filament/utils/Float3;",
        "centerPoint",
        "transformToUnitCube",
        "clearRootTransform",
        "destroyModel",
        "",
        "frameTimeNanos",
        "render",
        "Landroid/view/MotionEvent;",
        "event",
        "onTouchEvent",
        "",
        "onTouch",
        "Lcom/google/android/filament/Engine;",
        "engine",
        "Lcom/google/android/filament/Engine;",
        "getEngine",
        "()Lcom/google/android/filament/Engine;",
        "Lcom/google/android/filament/android/UiHelper;",
        "uiHelper",
        "Lcom/google/android/filament/android/UiHelper;",
        "<set-?>",
        "Lcom/google/android/filament/gltfio/FilamentAsset;",
        "getAsset",
        "()Lcom/google/android/filament/gltfio/FilamentAsset;",
        "Lcom/google/android/filament/gltfio/Animator;",
        "animator",
        "Lcom/google/android/filament/gltfio/Animator;",
        "getAnimator",
        "()Lcom/google/android/filament/gltfio/Animator;",
        "normalizeSkinningWeights",
        "Z",
        "getNormalizeSkinningWeights",
        "()Z",
        "setNormalizeSkinningWeights",
        "(Z)V",
        "",
        "value",
        "cameraFocalLength",
        "F",
        "getCameraFocalLength",
        "()F",
        "setCameraFocalLength",
        "(F)V",
        "Lcom/google/android/filament/Scene;",
        "scene",
        "Lcom/google/android/filament/Scene;",
        "getScene",
        "()Lcom/google/android/filament/Scene;",
        "Lcom/google/android/filament/View;",
        "Lcom/google/android/filament/View;",
        "getView",
        "()Lcom/google/android/filament/View;",
        "Lcom/google/android/filament/Camera;",
        "camera",
        "Lcom/google/android/filament/Camera;",
        "getCamera",
        "()Lcom/google/android/filament/Camera;",
        "Lcom/google/android/filament/Renderer;",
        "renderer",
        "Lcom/google/android/filament/Renderer;",
        "getRenderer",
        "()Lcom/google/android/filament/Renderer;",
        "",
        "light",
        "I",
        "getLight",
        "()I",
        "Lcom/google/android/filament/android/DisplayHelper;",
        "displayHelper",
        "Lcom/google/android/filament/android/DisplayHelper;",
        "Lcom/google/android/filament/utils/Manipulator;",
        "cameraManipulator",
        "Lcom/google/android/filament/utils/Manipulator;",
        "Lcom/google/android/filament/utils/GestureDetector;",
        "gestureDetector",
        "Lcom/google/android/filament/utils/GestureDetector;",
        "Landroid/view/SurfaceView;",
        "surfaceView",
        "Landroid/view/SurfaceView;",
        "Landroid/view/TextureView;",
        "textureView",
        "Landroid/view/TextureView;",
        "Lzh2;",
        "fetchResourcesJob",
        "Lzh2;",
        "Lcom/google/android/filament/SwapChain;",
        "swapChain",
        "Lcom/google/android/filament/SwapChain;",
        "Lcom/google/android/filament/gltfio/AssetLoader;",
        "assetLoader",
        "Lcom/google/android/filament/gltfio/AssetLoader;",
        "Lcom/google/android/filament/gltfio/MaterialProvider;",
        "materialProvider",
        "Lcom/google/android/filament/gltfio/MaterialProvider;",
        "Lcom/google/android/filament/gltfio/ResourceLoader;",
        "resourceLoader",
        "Lcom/google/android/filament/gltfio/ResourceLoader;",
        "",
        "readyRenderables",
        "[I",
        "",
        "eyePos",
        "[D",
        "target",
        "upward",
        "getProgress",
        "getProgress$annotations",
        "()V",
        "progress",
        "<init>",
        "(Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;)V",
        "manipulator",
        "(Landroid/view/SurfaceView;Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;Lcom/google/android/filament/utils/Manipulator;)V",
        "(Landroid/view/TextureView;Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;Lcom/google/android/filament/utils/Manipulator;)V",
        "Companion",
        "SurfaceCallback",
        "filament-utils-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nModelViewer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelViewer.kt\ncom/google/android/filament/utils/ModelViewer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 4 Vector.kt\ncom/google/android/filament/utils/Float3\n*L\n1#1,401:1\n1#2:402\n712#3:403\n293#4,9:404\n*S KotlinDebug\n*F\n+ 1 ModelViewer.kt\ncom/google/android/filament/utils/ModelViewer\n*L\n233#1:403\n235#1:404,9\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/google/android/filament/utils/ModelViewer$Companion;

.field private static final kDefaultObjectPosition:Lcom/google/android/filament/utils/Float3;


# instance fields
.field private animator:Lcom/google/android/filament/gltfio/Animator;

.field private asset:Lcom/google/android/filament/gltfio/FilamentAsset;

.field private assetLoader:Lcom/google/android/filament/gltfio/AssetLoader;

.field private final camera:Lcom/google/android/filament/Camera;

.field private cameraFocalLength:F

.field private cameraManipulator:Lcom/google/android/filament/utils/Manipulator;

.field private displayHelper:Lcom/google/android/filament/android/DisplayHelper;

.field private final engine:Lcom/google/android/filament/Engine;

.field private final eyePos:[D

.field private fetchResourcesJob:Lzh2;

.field private gestureDetector:Lcom/google/android/filament/utils/GestureDetector;

.field private final light:I
    .annotation build Lcom/google/android/filament/Entity;
    .end annotation
.end field

.field private materialProvider:Lcom/google/android/filament/gltfio/MaterialProvider;

.field private normalizeSkinningWeights:Z

.field private final readyRenderables:[I

.field private final renderer:Lcom/google/android/filament/Renderer;

.field private resourceLoader:Lcom/google/android/filament/gltfio/ResourceLoader;

.field private final scene:Lcom/google/android/filament/Scene;

.field private surfaceView:Landroid/view/SurfaceView;

.field private swapChain:Lcom/google/android/filament/SwapChain;

.field private final target:[D

.field private textureView:Landroid/view/TextureView;

.field private final uiHelper:Lcom/google/android/filament/android/UiHelper;

.field private final upward:[D

.field private final view:Lcom/google/android/filament/View;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/filament/utils/ModelViewer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/filament/utils/ModelViewer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/google/android/filament/utils/ModelViewer;->Companion:Lcom/google/android/filament/utils/ModelViewer$Companion;

    new-instance v0, Lcom/google/android/filament/utils/Float3;

    const/4 v1, 0x0

    const/high16 v2, -0x3f800000    # -4.0f

    invoke-direct {v0, v1, v1, v2}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    sput-object v0, Lcom/google/android/filament/utils/ModelViewer;->kDefaultObjectPosition:Lcom/google/android/filament/utils/Float3;

    return-void
.end method

.method public constructor <init>(Landroid/view/SurfaceView;Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;Lcom/google/android/filament/utils/Manipulator;)V
    .locals 2

    const-string v0, "surfaceView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "engine"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3}, Lcom/google/android/filament/utils/ModelViewer;-><init>(Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;)V

    if-nez p4, :cond_0

    new-instance p2, Lcom/google/android/filament/utils/Manipulator$Builder;

    invoke-direct {p2}, Lcom/google/android/filament/utils/Manipulator$Builder;-><init>()V

    sget-object p4, Lcom/google/android/filament/utils/ModelViewer;->kDefaultObjectPosition:Lcom/google/android/filament/utils/Float3;

    invoke-virtual {p4}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v0

    invoke-virtual {p4}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v1

    invoke-virtual {p4}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p4

    invoke-virtual {p2, v0, v1, p4}, Lcom/google/android/filament/utils/Manipulator$Builder;->targetPosition(FFF)Lcom/google/android/filament/utils/Manipulator$Builder;

    move-result-object p2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p4

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p2, p4, v0}, Lcom/google/android/filament/utils/Manipulator$Builder;->viewport(II)Lcom/google/android/filament/utils/Manipulator$Builder;

    move-result-object p2

    sget-object p4, Lcom/google/android/filament/utils/Manipulator$Mode;->ORBIT:Lcom/google/android/filament/utils/Manipulator$Mode;

    invoke-virtual {p2, p4}, Lcom/google/android/filament/utils/Manipulator$Builder;->build(Lcom/google/android/filament/utils/Manipulator$Mode;)Lcom/google/android/filament/utils/Manipulator;

    move-result-object p4

    const-string p2, "Builder()\n              \u2026d(Manipulator.Mode.ORBIT)"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iput-object p4, p0, Lcom/google/android/filament/utils/ModelViewer;->cameraManipulator:Lcom/google/android/filament/utils/Manipulator;

    iput-object p1, p0, Lcom/google/android/filament/utils/ModelViewer;->surfaceView:Landroid/view/SurfaceView;

    new-instance p2, Lcom/google/android/filament/utils/GestureDetector;

    if-nez p4, :cond_1

    const-string p4, "cameraManipulator"

    invoke-static {p4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p4, 0x0

    :cond_1
    invoke-direct {p2, p1, p4}, Lcom/google/android/filament/utils/GestureDetector;-><init>(Landroid/view/View;Lcom/google/android/filament/utils/Manipulator;)V

    iput-object p2, p0, Lcom/google/android/filament/utils/ModelViewer;->gestureDetector:Lcom/google/android/filament/utils/GestureDetector;

    new-instance p2, Lcom/google/android/filament/android/DisplayHelper;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-direct {p2, p4}, Lcom/google/android/filament/android/DisplayHelper;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/google/android/filament/utils/ModelViewer;->displayHelper:Lcom/google/android/filament/android/DisplayHelper;

    new-instance p2, Lcom/google/android/filament/utils/ModelViewer$SurfaceCallback;

    invoke-direct {p2, p0}, Lcom/google/android/filament/utils/ModelViewer$SurfaceCallback;-><init>(Lcom/google/android/filament/utils/ModelViewer;)V

    invoke-virtual {p3, p2}, Lcom/google/android/filament/android/UiHelper;->setRenderCallback(Lcom/google/android/filament/android/UiHelper$RendererCallback;)V

    invoke-virtual {p3, p1}, Lcom/google/android/filament/android/UiHelper;->attachTo(Landroid/view/SurfaceView;)V

    invoke-direct {p0, p1}, Lcom/google/android/filament/utils/ModelViewer;->addDetachListener(Landroid/view/View;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/SurfaceView;Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;Lcom/google/android/filament/utils/Manipulator;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    invoke-static {}, Lcom/google/android/filament/Engine;->create()Lcom/google/android/filament/Engine;

    move-result-object p2

    const-string p6, "create()"

    invoke-static {p2, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    new-instance p3, Lcom/google/android/filament/android/UiHelper;

    sget-object p6, Lcom/google/android/filament/android/UiHelper$ContextErrorPolicy;->DONT_CHECK:Lcom/google/android/filament/android/UiHelper$ContextErrorPolicy;

    invoke-direct {p3, p6}, Lcom/google/android/filament/android/UiHelper;-><init>(Lcom/google/android/filament/android/UiHelper$ContextErrorPolicy;)V

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/ModelViewer;-><init>(Landroid/view/SurfaceView;Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;Lcom/google/android/filament/utils/Manipulator;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/TextureView;Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;Lcom/google/android/filament/utils/Manipulator;)V
    .locals 2

    const-string v0, "textureView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "engine"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3}, Lcom/google/android/filament/utils/ModelViewer;-><init>(Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;)V

    if-nez p4, :cond_0

    new-instance p2, Lcom/google/android/filament/utils/Manipulator$Builder;

    invoke-direct {p2}, Lcom/google/android/filament/utils/Manipulator$Builder;-><init>()V

    sget-object p4, Lcom/google/android/filament/utils/ModelViewer;->kDefaultObjectPosition:Lcom/google/android/filament/utils/Float3;

    invoke-virtual {p4}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v0

    invoke-virtual {p4}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v1

    invoke-virtual {p4}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p4

    invoke-virtual {p2, v0, v1, p4}, Lcom/google/android/filament/utils/Manipulator$Builder;->targetPosition(FFF)Lcom/google/android/filament/utils/Manipulator$Builder;

    move-result-object p2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p4

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p2, p4, v0}, Lcom/google/android/filament/utils/Manipulator$Builder;->viewport(II)Lcom/google/android/filament/utils/Manipulator$Builder;

    move-result-object p2

    sget-object p4, Lcom/google/android/filament/utils/Manipulator$Mode;->ORBIT:Lcom/google/android/filament/utils/Manipulator$Mode;

    invoke-virtual {p2, p4}, Lcom/google/android/filament/utils/Manipulator$Builder;->build(Lcom/google/android/filament/utils/Manipulator$Mode;)Lcom/google/android/filament/utils/Manipulator;

    move-result-object p4

    const-string p2, "Builder()\n              \u2026d(Manipulator.Mode.ORBIT)"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iput-object p4, p0, Lcom/google/android/filament/utils/ModelViewer;->cameraManipulator:Lcom/google/android/filament/utils/Manipulator;

    iput-object p1, p0, Lcom/google/android/filament/utils/ModelViewer;->textureView:Landroid/view/TextureView;

    new-instance p2, Lcom/google/android/filament/utils/GestureDetector;

    if-nez p4, :cond_1

    const-string p4, "cameraManipulator"

    invoke-static {p4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p4, 0x0

    :cond_1
    invoke-direct {p2, p1, p4}, Lcom/google/android/filament/utils/GestureDetector;-><init>(Landroid/view/View;Lcom/google/android/filament/utils/Manipulator;)V

    iput-object p2, p0, Lcom/google/android/filament/utils/ModelViewer;->gestureDetector:Lcom/google/android/filament/utils/GestureDetector;

    new-instance p2, Lcom/google/android/filament/android/DisplayHelper;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-direct {p2, p4}, Lcom/google/android/filament/android/DisplayHelper;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/google/android/filament/utils/ModelViewer;->displayHelper:Lcom/google/android/filament/android/DisplayHelper;

    new-instance p2, Lcom/google/android/filament/utils/ModelViewer$SurfaceCallback;

    invoke-direct {p2, p0}, Lcom/google/android/filament/utils/ModelViewer$SurfaceCallback;-><init>(Lcom/google/android/filament/utils/ModelViewer;)V

    invoke-virtual {p3, p2}, Lcom/google/android/filament/android/UiHelper;->setRenderCallback(Lcom/google/android/filament/android/UiHelper$RendererCallback;)V

    invoke-virtual {p3, p1}, Lcom/google/android/filament/android/UiHelper;->attachTo(Landroid/view/TextureView;)V

    invoke-direct {p0, p1}, Lcom/google/android/filament/utils/ModelViewer;->addDetachListener(Landroid/view/View;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/TextureView;Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;Lcom/google/android/filament/utils/Manipulator;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    invoke-static {}, Lcom/google/android/filament/Engine;->create()Lcom/google/android/filament/Engine;

    move-result-object p2

    const-string p6, "create()"

    invoke-static {p2, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    new-instance p3, Lcom/google/android/filament/android/UiHelper;

    sget-object p6, Lcom/google/android/filament/android/UiHelper$ContextErrorPolicy;->DONT_CHECK:Lcom/google/android/filament/android/UiHelper$ContextErrorPolicy;

    invoke-direct {p3, p6}, Lcom/google/android/filament/android/UiHelper;-><init>(Lcom/google/android/filament/android/UiHelper$ContextErrorPolicy;)V

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/filament/utils/ModelViewer;-><init>(Landroid/view/TextureView;Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;Lcom/google/android/filament/utils/Manipulator;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/Engine;Lcom/google/android/filament/android/UiHelper;)V
    .locals 7

    const-string v0, "engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/filament/utils/ModelViewer;->engine:Lcom/google/android/filament/Engine;

    iput-object p2, p0, Lcom/google/android/filament/utils/ModelViewer;->uiHelper:Lcom/google/android/filament/android/UiHelper;

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/google/android/filament/utils/ModelViewer;->normalizeSkinningWeights:Z

    const/high16 v0, 0x41e00000    # 28.0f

    iput v0, p0, Lcom/google/android/filament/utils/ModelViewer;->cameraFocalLength:F

    const/16 v0, 0x80

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->readyRenderables:[I

    const/4 v0, 0x3

    new-array v1, v0, [D

    iput-object v1, p0, Lcom/google/android/filament/utils/ModelViewer;->eyePos:[D

    new-array v1, v0, [D

    iput-object v1, p0, Lcom/google/android/filament/utils/ModelViewer;->target:[D

    new-array v0, v0, [D

    iput-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->upward:[D

    invoke-virtual {p1}, Lcom/google/android/filament/Engine;->createRenderer()Lcom/google/android/filament/Renderer;

    move-result-object v0

    const-string v1, "engine.createRenderer()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->renderer:Lcom/google/android/filament/Renderer;

    invoke-virtual {p1}, Lcom/google/android/filament/Engine;->createScene()Lcom/google/android/filament/Scene;

    move-result-object v0

    const-string v1, "engine.createScene()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->scene:Lcom/google/android/filament/Scene;

    invoke-virtual {p1}, Lcom/google/android/filament/Engine;->getEntityManager()Lcom/google/android/filament/EntityManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/filament/EntityManager;->create()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/filament/Engine;->createCamera(I)Lcom/google/android/filament/Camera;

    move-result-object v1

    const-string v2, "engine.createCamera(engine.entityManager.create())"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x3c03126f    # 0.008f

    const/high16 v3, 0x42c80000    # 100.0f

    const/high16 v4, 0x41800000    # 16.0f

    invoke-virtual {v1, v4, v2, v3}, Lcom/google/android/filament/Camera;->setExposure(FFF)V

    iput-object v1, p0, Lcom/google/android/filament/utils/ModelViewer;->camera:Lcom/google/android/filament/Camera;

    invoke-virtual {p1}, Lcom/google/android/filament/Engine;->createView()Lcom/google/android/filament/View;

    move-result-object v2

    const-string v3, "engine.createView()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/google/android/filament/utils/ModelViewer;->view:Lcom/google/android/filament/View;

    invoke-virtual {v2, v0}, Lcom/google/android/filament/View;->setScene(Lcom/google/android/filament/Scene;)V

    invoke-virtual {v2, v1}, Lcom/google/android/filament/View;->setCamera(Lcom/google/android/filament/Camera;)V

    new-instance v1, Lcom/google/android/filament/gltfio/UbershaderProvider;

    invoke-direct {v1, p1}, Lcom/google/android/filament/gltfio/UbershaderProvider;-><init>(Lcom/google/android/filament/Engine;)V

    iput-object v1, p0, Lcom/google/android/filament/utils/ModelViewer;->materialProvider:Lcom/google/android/filament/gltfio/MaterialProvider;

    new-instance v2, Lcom/google/android/filament/gltfio/AssetLoader;

    invoke-static {}, Lcom/google/android/filament/EntityManager;->get()Lcom/google/android/filament/EntityManager;

    move-result-object v3

    invoke-direct {v2, p1, v1, v3}, Lcom/google/android/filament/gltfio/AssetLoader;-><init>(Lcom/google/android/filament/Engine;Lcom/google/android/filament/gltfio/MaterialProvider;Lcom/google/android/filament/EntityManager;)V

    iput-object v2, p0, Lcom/google/android/filament/utils/ModelViewer;->assetLoader:Lcom/google/android/filament/gltfio/AssetLoader;

    new-instance v1, Lcom/google/android/filament/gltfio/ResourceLoader;

    iget-boolean v2, p0, Lcom/google/android/filament/utils/ModelViewer;->normalizeSkinningWeights:Z

    invoke-direct {v1, p1, v2}, Lcom/google/android/filament/gltfio/ResourceLoader;-><init>(Lcom/google/android/filament/Engine;Z)V

    iput-object v1, p0, Lcom/google/android/filament/utils/ModelViewer;->resourceLoader:Lcom/google/android/filament/gltfio/ResourceLoader;

    invoke-static {}, Lcom/google/android/filament/EntityManager;->get()Lcom/google/android/filament/EntityManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/filament/EntityManager;->create()I

    move-result v1

    iput v1, p0, Lcom/google/android/filament/utils/ModelViewer;->light:I

    const v2, 0x45cb2000    # 6500.0f

    invoke-static {v2}, Lcom/google/android/filament/Colors;->cct(F)[F

    move-result-object v2

    const-string v3, "cct(6_500.0f)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    aget v3, v2, v3

    aget v4, v2, p2

    const/4 v5, 0x2

    aget v2, v2, v5

    new-instance v5, Lcom/google/android/filament/LightManager$Builder;

    sget-object v6, Lcom/google/android/filament/LightManager$Type;->DIRECTIONAL:Lcom/google/android/filament/LightManager$Type;

    invoke-direct {v5, v6}, Lcom/google/android/filament/LightManager$Builder;-><init>(Lcom/google/android/filament/LightManager$Type;)V

    invoke-virtual {v5, v3, v4, v2}, Lcom/google/android/filament/LightManager$Builder;->color(FFF)Lcom/google/android/filament/LightManager$Builder;

    move-result-object v2

    const v3, 0x47c35000    # 100000.0f

    invoke-virtual {v2, v3}, Lcom/google/android/filament/LightManager$Builder;->intensity(F)Lcom/google/android/filament/LightManager$Builder;

    move-result-object v2

    const/4 v3, 0x0

    const/high16 v4, -0x40800000    # -1.0f

    invoke-virtual {v2, v3, v4, v3}, Lcom/google/android/filament/LightManager$Builder;->direction(FFF)Lcom/google/android/filament/LightManager$Builder;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/google/android/filament/LightManager$Builder;->castShadows(Z)Lcom/google/android/filament/LightManager$Builder;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Lcom/google/android/filament/LightManager$Builder;->build(Lcom/google/android/filament/Engine;I)V

    invoke-virtual {v0, v1}, Lcom/google/android/filament/Scene;->addEntity(I)V

    return-void
.end method

.method public static final synthetic access$fetchResources(Lcom/google/android/filament/utils/ModelViewer;Lcom/google/android/filament/gltfio/FilamentAsset;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/filament/utils/ModelViewer;->fetchResources(Lcom/google/android/filament/gltfio/FilamentAsset;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAssetLoader$p(Lcom/google/android/filament/utils/ModelViewer;)Lcom/google/android/filament/gltfio/AssetLoader;
    .locals 0

    iget-object p0, p0, Lcom/google/android/filament/utils/ModelViewer;->assetLoader:Lcom/google/android/filament/gltfio/AssetLoader;

    return-object p0
.end method

.method public static final synthetic access$getCameraManipulator$p(Lcom/google/android/filament/utils/ModelViewer;)Lcom/google/android/filament/utils/Manipulator;
    .locals 0

    iget-object p0, p0, Lcom/google/android/filament/utils/ModelViewer;->cameraManipulator:Lcom/google/android/filament/utils/Manipulator;

    return-object p0
.end method

.method public static final synthetic access$getDisplayHelper$p(Lcom/google/android/filament/utils/ModelViewer;)Lcom/google/android/filament/android/DisplayHelper;
    .locals 0

    iget-object p0, p0, Lcom/google/android/filament/utils/ModelViewer;->displayHelper:Lcom/google/android/filament/android/DisplayHelper;

    return-object p0
.end method

.method public static final synthetic access$getMaterialProvider$p(Lcom/google/android/filament/utils/ModelViewer;)Lcom/google/android/filament/gltfio/MaterialProvider;
    .locals 0

    iget-object p0, p0, Lcom/google/android/filament/utils/ModelViewer;->materialProvider:Lcom/google/android/filament/gltfio/MaterialProvider;

    return-object p0
.end method

.method public static final synthetic access$getReadyRenderables$p(Lcom/google/android/filament/utils/ModelViewer;)[I
    .locals 0

    iget-object p0, p0, Lcom/google/android/filament/utils/ModelViewer;->readyRenderables:[I

    return-object p0
.end method

.method public static final synthetic access$getResourceLoader$p(Lcom/google/android/filament/utils/ModelViewer;)Lcom/google/android/filament/gltfio/ResourceLoader;
    .locals 0

    iget-object p0, p0, Lcom/google/android/filament/utils/ModelViewer;->resourceLoader:Lcom/google/android/filament/gltfio/ResourceLoader;

    return-object p0
.end method

.method public static final synthetic access$getSurfaceView$p(Lcom/google/android/filament/utils/ModelViewer;)Landroid/view/SurfaceView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/filament/utils/ModelViewer;->surfaceView:Landroid/view/SurfaceView;

    return-object p0
.end method

.method public static final synthetic access$getSwapChain$p(Lcom/google/android/filament/utils/ModelViewer;)Lcom/google/android/filament/SwapChain;
    .locals 0

    iget-object p0, p0, Lcom/google/android/filament/utils/ModelViewer;->swapChain:Lcom/google/android/filament/SwapChain;

    return-object p0
.end method

.method public static final synthetic access$getTextureView$p(Lcom/google/android/filament/utils/ModelViewer;)Landroid/view/TextureView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/filament/utils/ModelViewer;->textureView:Landroid/view/TextureView;

    return-object p0
.end method

.method public static final synthetic access$getUiHelper$p(Lcom/google/android/filament/utils/ModelViewer;)Lcom/google/android/filament/android/UiHelper;
    .locals 0

    iget-object p0, p0, Lcom/google/android/filament/utils/ModelViewer;->uiHelper:Lcom/google/android/filament/android/UiHelper;

    return-object p0
.end method

.method public static final synthetic access$setAnimator$p(Lcom/google/android/filament/utils/ModelViewer;Lcom/google/android/filament/gltfio/Animator;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/filament/utils/ModelViewer;->animator:Lcom/google/android/filament/gltfio/Animator;

    return-void
.end method

.method public static final synthetic access$setSwapChain$p(Lcom/google/android/filament/utils/ModelViewer;Lcom/google/android/filament/SwapChain;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/filament/utils/ModelViewer;->swapChain:Lcom/google/android/filament/SwapChain;

    return-void
.end method

.method public static final synthetic access$updateCameraProjection(Lcom/google/android/filament/utils/ModelViewer;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/filament/utils/ModelViewer;->updateCameraProjection()V

    return-void
.end method

.method private final addDetachListener(Landroid/view/View;)V
    .locals 1

    new-instance v0, Lcom/google/android/filament/utils/ModelViewer$addDetachListener$1;

    invoke-direct {v0, p0}, Lcom/google/android/filament/utils/ModelViewer$addDetachListener$1;-><init>(Lcom/google/android/filament/utils/ModelViewer;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method

.method private final fetchResources(Lcom/google/android/filament/gltfio/FilamentAsset;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/filament/gltfio/FilamentAsset;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "+",
            "Ljava/nio/Buffer;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getResourceUris()[Ljava/lang/String;

    move-result-object v1

    const-string v2, "asset.resourceUris"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    const-string v5, "resourceUri"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {}, LT41;->c()LpG2;

    move-result-object p2

    new-instance v1, Lcom/google/android/filament/utils/ModelViewer$fetchResources$2;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p0, p1, v2}, Lcom/google/android/filament/utils/ModelViewer$fetchResources$2;-><init>(Ljava/util/HashMap;Lcom/google/android/filament/utils/ModelViewer;Lcom/google/android/filament/gltfio/FilamentAsset;Lkotlin/coroutines/Continuation;)V

    invoke-static {p2, v1, p3}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public static synthetic getProgress$annotations()V
    .locals 0

    return-void
.end method

.method private final populateScene(Lcom/google/android/filament/gltfio/FilamentAsset;)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->engine:Lcom/google/android/filament/Engine;

    invoke-virtual {v0}, Lcom/google/android/filament/Engine;->getRenderableManager()Lcom/google/android/filament/RenderableManager;

    move-result-object v0

    const-string v1, "engine.renderableManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    new-instance v2, Lcom/google/android/filament/utils/ModelViewer$populateScene$popRenderables$1;

    invoke-direct {v2, v1, p1, p0}, Lcom/google/android/filament/utils/ModelViewer$populateScene$popRenderables$1;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lcom/google/android/filament/gltfio/FilamentAsset;Lcom/google/android/filament/utils/ModelViewer;)V

    :goto_0
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1

    iget v3, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    if-ltz v3, :cond_0

    const/4 v5, 0x0

    :goto_1
    iget-object v6, p0, Lcom/google/android/filament/utils/ModelViewer;->readyRenderables:[I

    aget v6, v6, v5

    invoke-virtual {v0, v6}, Lcom/google/android/filament/RenderableManager;->getInstance(I)I

    move-result v6

    invoke-virtual {v0, v6, v4}, Lcom/google/android/filament/RenderableManager;->setScreenSpaceContactShadows(IZ)V

    if-eq v5, v3, :cond_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lcom/google/android/filament/utils/ModelViewer;->scene:Lcom/google/android/filament/Scene;

    iget-object v4, p0, Lcom/google/android/filament/utils/ModelViewer;->readyRenderables:[I

    iget v5, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {v4, v5}, Lkotlin/collections/ArraysKt;->take([II)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toIntArray(Ljava/util/Collection;)[I

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/filament/Scene;->addEntities([I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->scene:Lcom/google/android/filament/Scene;

    invoke-virtual {p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getLightEntities()[I

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/filament/Scene;->addEntities([I)V

    return-void
.end method

.method public static synthetic transformToUnitCube$default(Lcom/google/android/filament/utils/ModelViewer;Lcom/google/android/filament/utils/Float3;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lcom/google/android/filament/utils/ModelViewer;->kDefaultObjectPosition:Lcom/google/android/filament/utils/Float3;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/filament/utils/ModelViewer;->transformToUnitCube(Lcom/google/android/filament/utils/Float3;)V

    return-void
.end method

.method private final updateCameraProjection()V
    .locals 13

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->view:Lcom/google/android/filament/View;

    invoke-virtual {v0}, Lcom/google/android/filament/View;->getViewport()Lcom/google/android/filament/Viewport;

    move-result-object v0

    iget v0, v0, Lcom/google/android/filament/Viewport;->width:I

    iget-object v1, p0, Lcom/google/android/filament/utils/ModelViewer;->view:Lcom/google/android/filament/View;

    invoke-virtual {v1}, Lcom/google/android/filament/View;->getViewport()Lcom/google/android/filament/Viewport;

    move-result-object v1

    iget v1, v1, Lcom/google/android/filament/Viewport;->height:I

    int-to-double v2, v0

    int-to-double v0, v1

    div-double v7, v2, v0

    iget-object v4, p0, Lcom/google/android/filament/utils/ModelViewer;->camera:Lcom/google/android/filament/Camera;

    iget v0, p0, Lcom/google/android/filament/utils/ModelViewer;->cameraFocalLength:F

    float-to-double v5, v0

    const-wide v9, 0x3fa999999999999aL    # 0.05

    const-wide v11, 0x408f400000000000L    # 1000.0

    invoke-virtual/range {v4 .. v12}, Lcom/google/android/filament/Camera;->setLensProjection(DDDD)V

    return-void
.end method


# virtual methods
.method public final clearRootTransform()V
    .locals 10

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->asset:Lcom/google/android/filament/gltfio/FilamentAsset;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/filament/utils/ModelViewer;->engine:Lcom/google/android/filament/Engine;

    invoke-virtual {v1}, Lcom/google/android/filament/Engine;->getTransformManager()Lcom/google/android/filament/TransformManager;

    move-result-object v1

    const-string v2, "engine.transformManager"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->getRoot()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/filament/TransformManager;->getInstance(I)I

    move-result v0

    new-instance v9, Lcom/google/android/filament/utils/Mat4;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xf

    const/4 v8, 0x0

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lcom/google/android/filament/utils/Mat4;-><init>(Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;Lcom/google/android/filament/utils/Float4;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9}, Lcom/google/android/filament/utils/Mat4;->toFloatArray()[F

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/android/filament/TransformManager;->setTransform(I[F)V

    :cond_0
    return-void
.end method

.method public final destroyModel()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->fetchResourcesJob:Lzh2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->resourceLoader:Lcom/google/android/filament/gltfio/ResourceLoader;

    invoke-virtual {v0}, Lcom/google/android/filament/gltfio/ResourceLoader;->asyncCancelLoad()V

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->resourceLoader:Lcom/google/android/filament/gltfio/ResourceLoader;

    invoke-virtual {v0}, Lcom/google/android/filament/gltfio/ResourceLoader;->evictResourceData()V

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->asset:Lcom/google/android/filament/gltfio/FilamentAsset;

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/google/android/filament/utils/ModelViewer;->scene:Lcom/google/android/filament/Scene;

    invoke-virtual {v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->getEntities()[I

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/filament/Scene;->removeEntities([I)V

    iget-object v2, p0, Lcom/google/android/filament/utils/ModelViewer;->assetLoader:Lcom/google/android/filament/gltfio/AssetLoader;

    invoke-virtual {v2, v0}, Lcom/google/android/filament/gltfio/AssetLoader;->destroyAsset(Lcom/google/android/filament/gltfio/FilamentAsset;)V

    iput-object v1, p0, Lcom/google/android/filament/utils/ModelViewer;->asset:Lcom/google/android/filament/gltfio/FilamentAsset;

    iput-object v1, p0, Lcom/google/android/filament/utils/ModelViewer;->animator:Lcom/google/android/filament/gltfio/Animator;

    :cond_1
    return-void
.end method

.method public final getAnimator()Lcom/google/android/filament/gltfio/Animator;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->animator:Lcom/google/android/filament/gltfio/Animator;

    return-object v0
.end method

.method public final getAsset()Lcom/google/android/filament/gltfio/FilamentAsset;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->asset:Lcom/google/android/filament/gltfio/FilamentAsset;

    return-object v0
.end method

.method public final getCamera()Lcom/google/android/filament/Camera;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->camera:Lcom/google/android/filament/Camera;

    return-object v0
.end method

.method public final getCameraFocalLength()F
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/ModelViewer;->cameraFocalLength:F

    return v0
.end method

.method public final getEngine()Lcom/google/android/filament/Engine;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->engine:Lcom/google/android/filament/Engine;

    return-object v0
.end method

.method public final getLight()I
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/ModelViewer;->light:I

    return v0
.end method

.method public final getNormalizeSkinningWeights()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/filament/utils/ModelViewer;->normalizeSkinningWeights:Z

    return v0
.end method

.method public final getProgress()F
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->resourceLoader:Lcom/google/android/filament/gltfio/ResourceLoader;

    invoke-virtual {v0}, Lcom/google/android/filament/gltfio/ResourceLoader;->asyncGetLoadProgress()F

    move-result v0

    return v0
.end method

.method public final getRenderer()Lcom/google/android/filament/Renderer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->renderer:Lcom/google/android/filament/Renderer;

    return-object v0
.end method

.method public final getScene()Lcom/google/android/filament/Scene;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->scene:Lcom/google/android/filament/Scene;

    return-object v0
.end method

.method public final getView()Lcom/google/android/filament/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->view:Lcom/google/android/filament/View;

    return-object v0
.end method

.method public final loadModelGlb(Ljava/nio/Buffer;)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/ModelViewer;->destroyModel()V

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->assetLoader:Lcom/google/android/filament/gltfio/AssetLoader;

    invoke-virtual {v0, p1}, Lcom/google/android/filament/gltfio/AssetLoader;->createAsset(Ljava/nio/Buffer;)Lcom/google/android/filament/gltfio/FilamentAsset;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/filament/utils/ModelViewer;->asset:Lcom/google/android/filament/gltfio/FilamentAsset;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->resourceLoader:Lcom/google/android/filament/gltfio/ResourceLoader;

    invoke-virtual {v0, p1}, Lcom/google/android/filament/gltfio/ResourceLoader;->asyncBeginLoad(Lcom/google/android/filament/gltfio/FilamentAsset;)Z

    invoke-virtual {p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getInstance()Lcom/google/android/filament/gltfio/FilamentInstance;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/gltfio/FilamentInstance;->getAnimator()Lcom/google/android/filament/gltfio/Animator;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->animator:Lcom/google/android/filament/gltfio/Animator;

    invoke-virtual {p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->releaseSourceData()V

    :cond_0
    return-void
.end method

.method public final loadModelGltf(Ljava/nio/Buffer;Lkotlin/jvm/functions/Function1;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/Buffer;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "+",
            "Ljava/nio/Buffer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/ModelViewer;->destroyModel()V

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->assetLoader:Lcom/google/android/filament/gltfio/AssetLoader;

    invoke-virtual {v0, p1}, Lcom/google/android/filament/gltfio/AssetLoader;->createAsset(Ljava/nio/Buffer;)Lcom/google/android/filament/gltfio/FilamentAsset;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/filament/utils/ModelViewer;->asset:Lcom/google/android/filament/gltfio/FilamentAsset;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getResourceUris()[Ljava/lang/String;

    move-result-object v0

    const-string v1, "asset.resourceUris"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    const-string v4, "uri"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/nio/Buffer;

    if-nez v4, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/filament/utils/ModelViewer;->asset:Lcom/google/android/filament/gltfio/FilamentAsset;

    return-void

    :cond_0
    iget-object v5, p0, Lcom/google/android/filament/utils/ModelViewer;->resourceLoader:Lcom/google/android/filament/gltfio/ResourceLoader;

    invoke-virtual {v5, v3, v4}, Lcom/google/android/filament/gltfio/ResourceLoader;->addResourceData(Ljava/lang/String;Ljava/nio/Buffer;)Lcom/google/android/filament/gltfio/ResourceLoader;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/google/android/filament/utils/ModelViewer;->resourceLoader:Lcom/google/android/filament/gltfio/ResourceLoader;

    invoke-virtual {p2, p1}, Lcom/google/android/filament/gltfio/ResourceLoader;->asyncBeginLoad(Lcom/google/android/filament/gltfio/FilamentAsset;)Z

    invoke-virtual {p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->getInstance()Lcom/google/android/filament/gltfio/FilamentInstance;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/filament/gltfio/FilamentInstance;->getAnimator()Lcom/google/android/filament/gltfio/Animator;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/filament/utils/ModelViewer;->animator:Lcom/google/android/filament/gltfio/Animator;

    invoke-virtual {p1}, Lcom/google/android/filament/gltfio/FilamentAsset;->releaseSourceData()V

    :cond_2
    return-void
.end method

.method public final loadModelGltfAsync(Ljava/nio/Buffer;Lkotlin/jvm/functions/Function1;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/Buffer;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "+",
            "Ljava/nio/Buffer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/filament/utils/ModelViewer;->destroyModel()V

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->assetLoader:Lcom/google/android/filament/gltfio/AssetLoader;

    invoke-virtual {v0, p1}, Lcom/google/android/filament/gltfio/AssetLoader;->createAsset(Ljava/nio/Buffer;)Lcom/google/android/filament/gltfio/FilamentAsset;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/filament/utils/ModelViewer;->asset:Lcom/google/android/filament/gltfio/FilamentAsset;

    invoke-static {}, LT41;->b()LSC0;

    move-result-object p1

    invoke-static {p1}, LaD0;->a(Lkotlin/coroutines/CoroutineContext;)LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/google/android/filament/utils/ModelViewer$loadModelGltfAsync$1;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p2, p1}, Lcom/google/android/filament/utils/ModelViewer$loadModelGltfAsync$1;-><init>(Lcom/google/android/filament/utils/ModelViewer;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/filament/utils/ModelViewer;->fetchResourcesJob:Lzh2;

    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/google/android/filament/utils/ModelViewer;->onTouchEvent(Landroid/view/MotionEvent;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->gestureDetector:Lcom/google/android/filament/utils/GestureDetector;

    if-nez v0, :cond_0

    const-string v0, "gestureDetector"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/android/filament/utils/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)V

    return-void
.end method

.method public final render(J)V
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/filament/utils/ModelViewer;->uiHelper:Lcom/google/android/filament/android/UiHelper;

    invoke-virtual {v1}, Lcom/google/android/filament/android/UiHelper;->isReadyToRender()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lcom/google/android/filament/utils/ModelViewer;->resourceLoader:Lcom/google/android/filament/gltfio/ResourceLoader;

    invoke-virtual {v1}, Lcom/google/android/filament/gltfio/ResourceLoader;->asyncUpdateLoad()V

    iget-object v1, v0, Lcom/google/android/filament/utils/ModelViewer;->asset:Lcom/google/android/filament/gltfio/FilamentAsset;

    if-eqz v1, :cond_1

    invoke-direct {v0, v1}, Lcom/google/android/filament/utils/ModelViewer;->populateScene(Lcom/google/android/filament/gltfio/FilamentAsset;)V

    :cond_1
    iget-object v1, v0, Lcom/google/android/filament/utils/ModelViewer;->cameraManipulator:Lcom/google/android/filament/utils/Manipulator;

    if-nez v1, :cond_2

    const-string v1, "cameraManipulator"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_2
    iget-object v2, v0, Lcom/google/android/filament/utils/ModelViewer;->eyePos:[D

    iget-object v3, v0, Lcom/google/android/filament/utils/ModelViewer;->target:[D

    iget-object v4, v0, Lcom/google/android/filament/utils/ModelViewer;->upward:[D

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/filament/utils/Manipulator;->getLookAt([D[D[D)V

    iget-object v5, v0, Lcom/google/android/filament/utils/ModelViewer;->camera:Lcom/google/android/filament/Camera;

    iget-object v1, v0, Lcom/google/android/filament/utils/ModelViewer;->eyePos:[D

    const/4 v2, 0x0

    aget-wide v6, v1, v2

    const/4 v3, 0x1

    aget-wide v8, v1, v3

    const/4 v4, 0x2

    aget-wide v10, v1, v4

    iget-object v1, v0, Lcom/google/android/filament/utils/ModelViewer;->target:[D

    aget-wide v12, v1, v2

    aget-wide v14, v1, v3

    aget-wide v16, v1, v4

    iget-object v1, v0, Lcom/google/android/filament/utils/ModelViewer;->upward:[D

    aget-wide v18, v1, v2

    aget-wide v20, v1, v3

    aget-wide v22, v1, v4

    invoke-virtual/range {v5 .. v23}, Lcom/google/android/filament/Camera;->lookAt(DDDDDDDDD)V

    iget-object v1, v0, Lcom/google/android/filament/utils/ModelViewer;->renderer:Lcom/google/android/filament/Renderer;

    iget-object v2, v0, Lcom/google/android/filament/utils/ModelViewer;->swapChain:Lcom/google/android/filament/SwapChain;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide/from16 v3, p1

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/android/filament/Renderer;->beginFrame(Lcom/google/android/filament/SwapChain;J)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Lcom/google/android/filament/utils/ModelViewer;->renderer:Lcom/google/android/filament/Renderer;

    iget-object v2, v0, Lcom/google/android/filament/utils/ModelViewer;->view:Lcom/google/android/filament/View;

    invoke-virtual {v1, v2}, Lcom/google/android/filament/Renderer;->render(Lcom/google/android/filament/View;)V

    iget-object v1, v0, Lcom/google/android/filament/utils/ModelViewer;->renderer:Lcom/google/android/filament/Renderer;

    invoke-virtual {v1}, Lcom/google/android/filament/Renderer;->endFrame()V

    :cond_3
    return-void
.end method

.method public final setCameraFocalLength(F)V
    .locals 0

    iput p1, p0, Lcom/google/android/filament/utils/ModelViewer;->cameraFocalLength:F

    invoke-direct {p0}, Lcom/google/android/filament/utils/ModelViewer;->updateCameraProjection()V

    return-void
.end method

.method public final setNormalizeSkinningWeights(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/filament/utils/ModelViewer;->normalizeSkinningWeights:Z

    return-void
.end method

.method public final transformToUnitCube(Lcom/google/android/filament/utils/Float3;)V
    .locals 9

    const-string v0, "centerPoint"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/filament/utils/ModelViewer;->asset:Lcom/google/android/filament/gltfio/FilamentAsset;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/filament/utils/ModelViewer;->engine:Lcom/google/android/filament/Engine;

    invoke-virtual {v1}, Lcom/google/android/filament/Engine;->getTransformManager()Lcom/google/android/filament/TransformManager;

    move-result-object v1

    const-string v2, "engine.transformManager"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->getBoundingBox()Lcom/google/android/filament/Box;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/filament/Box;->getCenter()[F

    move-result-object v2

    new-instance v3, Lcom/google/android/filament/utils/Float3;

    const/4 v4, 0x0

    aget v5, v2, v4

    const/4 v6, 0x1

    aget v7, v2, v6

    const/4 v8, 0x2

    aget v2, v2, v8

    invoke-direct {v3, v5, v7, v2}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    invoke-virtual {v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->getBoundingBox()Lcom/google/android/filament/Box;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/filament/Box;->getHalfExtent()[F

    move-result-object v2

    new-instance v5, Lcom/google/android/filament/utils/Float3;

    aget v4, v2, v4

    aget v6, v2, v6

    aget v2, v2, v8

    invoke-direct {v5, v4, v6, v2}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v2

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v4

    invoke-virtual {v5}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(FF)F

    move-result v2

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v2, v4

    div-float/2addr v4, v2

    new-instance v2, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v5

    div-float/2addr v5, v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v6

    div-float/2addr v6, v4

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result p1

    div-float/2addr p1, v4

    invoke-direct {v2, v5, v6, p1}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    new-instance p1, Lcom/google/android/filament/utils/Float3;

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v5

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float3;->getX()F

    move-result v6

    sub-float/2addr v5, v6

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v6

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float3;->getY()F

    move-result v7

    sub-float/2addr v6, v7

    invoke-virtual {v3}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v3

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float3;->getZ()F

    move-result v2

    sub-float/2addr v3, v2

    invoke-direct {p1, v5, v6, v3}, Lcom/google/android/filament/utils/Float3;-><init>(FFF)V

    new-instance v2, Lcom/google/android/filament/utils/Float3;

    invoke-direct {v2, v4}, Lcom/google/android/filament/utils/Float3;-><init>(F)V

    invoke-static {v2}, Lcom/google/android/filament/utils/MatrixKt;->scale(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Mat4;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Float3;->unaryMinus()Lcom/google/android/filament/utils/Float3;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/filament/utils/MatrixKt;->translation(Lcom/google/android/filament/utils/Float3;)Lcom/google/android/filament/utils/Mat4;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/filament/utils/Mat4;->times(Lcom/google/android/filament/utils/Mat4;)Lcom/google/android/filament/utils/Mat4;

    move-result-object p1

    invoke-virtual {v0}, Lcom/google/android/filament/gltfio/FilamentAsset;->getRoot()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/filament/TransformManager;->getInstance(I)I

    move-result v0

    invoke-static {p1}, Lcom/google/android/filament/utils/MatrixKt;->transpose(Lcom/google/android/filament/utils/Mat4;)Lcom/google/android/filament/utils/Mat4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/filament/utils/Mat4;->toFloatArray()[F

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lcom/google/android/filament/TransformManager;->setTransform(I[F)V

    :cond_0
    return-void
.end method
