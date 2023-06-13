.class public final Lio/github/sceneview/ar/arcore/LightEstimator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxm;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/sceneview/ar/arcore/LightEstimator$a;,
        Lio/github/sceneview/ar/arcore/LightEstimator$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\"\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u0000 \u00052\u00020\u0001:\u0001qB#\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040T\u00a2\u0006\u0004\u0008o\u0010pJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR*\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R\"\u0010&\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008#\u0010\u001d\u001a\u0004\u0008$\u0010\u001f\"\u0004\u0008%\u0010!R\"\u0010*\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\'\u0010\u001d\u001a\u0004\u0008(\u0010\u001f\"\u0004\u0008)\u0010!R\"\u0010.\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008+\u0010\u001d\u001a\u0004\u0008,\u0010\u001f\"\u0004\u0008-\u0010!R\"\u00102\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008/\u0010\u001d\u001a\u0004\u00080\u0010\u001f\"\u0004\u00081\u0010!R\"\u00106\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00083\u0010\u001d\u001a\u0004\u00084\u0010\u001f\"\u0004\u00085\u0010!R$\u0010=\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:\"\u0004\u0008;\u0010<R$\u0010D\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010?\u001a\u0004\u0008@\u0010A\"\u0004\u0008B\u0010CR.\u0010K\u001a\u0004\u0018\u00010E2\u0008\u0010\u000f\u001a\u0004\u0018\u00010E8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008F\u0010G\u001a\u0004\u0008\u0018\u0010H\"\u0004\u0008I\u0010JR:\u0010R\u001a\n\u0018\u00010Lj\u0004\u0018\u0001`M2\u000e\u0010\u000f\u001a\n\u0018\u00010Lj\u0004\u0018\u0001`M8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008I\u0010N\u001a\u0004\u0008\u001c\u0010O\"\u0004\u0008P\u0010QR)\u0010X\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040T0S8\u0006\u00a2\u0006\u000c\n\u0004\u0008P\u0010U\u001a\u0004\u0008V\u0010WR$\u0010_\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010Z\u001a\u0004\u0008[\u0010\\\"\u0004\u0008]\u0010^R$\u0010g\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008a\u0010b\u001a\u0004\u0008c\u0010d\"\u0004\u0008e\u0010fR\u0014\u0010j\u001a\u00020h8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00083\u0010iR$\u0010m\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00178F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008#\u0010k\"\u0004\u0008a\u0010lR\u0011\u0010n\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010k\u00a8\u0006r"
    }
    d2 = {
        "Lio/github/sceneview/ar/arcore/LightEstimator;",
        "Lxm;",
        "Lrm;",
        "arFrame",
        "",
        "r",
        "l",
        "LLifecycleOwner;",
        "owner",
        "onDestroy",
        "Lio/github/sceneview/ar/ArSceneLifecycle;",
        "b",
        "Lio/github/sceneview/ar/ArSceneLifecycle;",
        "lifecycle",
        "LLq2;",
        "value",
        "c",
        "LLq2;",
        "getMode",
        "()LLq2;",
        "p",
        "(LLq2;)V",
        "mode",
        "",
        "d",
        "Ljava/lang/Float;",
        "_precision",
        "",
        "e",
        "Z",
        "getEnvironmentalHdrReflections",
        "()Z",
        "setEnvironmentalHdrReflections",
        "(Z)V",
        "environmentalHdrReflections",
        "f",
        "getDefaultEnvironmentReflections",
        "setDefaultEnvironmentReflections",
        "defaultEnvironmentReflections",
        "g",
        "getEnvironmentalHdrSphericalHarmonics",
        "setEnvironmentalHdrSphericalHarmonics",
        "environmentalHdrSphericalHarmonics",
        "h",
        "getEnvironmentalHdrSpecularFilter",
        "setEnvironmentalHdrSpecularFilter",
        "environmentalHdrSpecularFilter",
        "i",
        "getEnvironmentalHdrMainLightDirection",
        "setEnvironmentalHdrMainLightDirection",
        "environmentalHdrMainLightDirection",
        "j",
        "getEnvironmentalHdrMainLightIntensity",
        "setEnvironmentalHdrMainLightIntensity",
        "environmentalHdrMainLightIntensity",
        "k",
        "Lrm;",
        "getLastArFrame",
        "()Lrm;",
        "setLastArFrame",
        "(Lrm;)V",
        "lastArFrame",
        "",
        "Ljava/lang/Long;",
        "getTimestamp",
        "()Ljava/lang/Long;",
        "setTimestamp",
        "(Ljava/lang/Long;)V",
        "timestamp",
        "Lwf1;",
        "m",
        "Lwf1;",
        "()Lwf1;",
        "n",
        "(Lwf1;)V",
        "environment",
        "",
        "Lio/github/sceneview/light/Light;",
        "Ljava/lang/Integer;",
        "()Ljava/lang/Integer;",
        "o",
        "(Ljava/lang/Integer;)V",
        "mainLight",
        "",
        "Lkotlin/Function1;",
        "Ljava/util/List;",
        "getOnUpdated",
        "()Ljava/util/List;",
        "onUpdated",
        "Ljava/nio/ByteBuffer;",
        "Ljava/nio/ByteBuffer;",
        "getCubeMapBuffer",
        "()Ljava/nio/ByteBuffer;",
        "setCubeMapBuffer",
        "(Ljava/nio/ByteBuffer;)V",
        "cubeMapBuffer",
        "Lcom/google/android/filament/Texture;",
        "q",
        "Lcom/google/android/filament/Texture;",
        "getCubeMapTexture",
        "()Lcom/google/android/filament/Texture;",
        "setCubeMapTexture",
        "(Lcom/google/android/filament/Texture;)V",
        "cubeMapTexture",
        "Lio/github/sceneview/ar/ArSceneView;",
        "()Lio/github/sceneview/ar/ArSceneView;",
        "sceneView",
        "()F",
        "(F)V",
        "precision",
        "cameraExposureFactor",
        "<init>",
        "(Lio/github/sceneview/ar/ArSceneLifecycle;Lkotlin/jvm/functions/Function1;)V",
        "a",
        "arsceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final r:Lio/github/sceneview/ar/arcore/LightEstimator$a;

.field public static final s:I

.field public static final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Lio/github/sceneview/ar/ArSceneLifecycle;

.field public c:LLq2;

.field public d:Ljava/lang/Float;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Lrm;

.field public l:Ljava/lang/Long;

.field public m:Lwf1;

.field public n:Ljava/lang/Integer;

.field public final o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Lio/github/sceneview/ar/arcore/LightEstimator;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field public p:Ljava/nio/ByteBuffer;

.field public q:Lcom/google/android/filament/Texture;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lio/github/sceneview/ar/arcore/LightEstimator$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/sceneview/ar/arcore/LightEstimator$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/github/sceneview/ar/arcore/LightEstimator;->r:Lio/github/sceneview/ar/arcore/LightEstimator$a;

    const/16 v0, 0x8

    sput v0, Lio/github/sceneview/ar/arcore/LightEstimator;->s:I

    const/16 v0, 0x9

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v3, v0, :cond_2

    aget v5, v1, v3

    add-int/lit8 v6, v4, 0x1

    const/4 v7, 0x7

    const/4 v8, 0x6

    if-eq v4, v8, :cond_1

    if-eq v4, v7, :cond_0

    goto :goto_1

    :cond_0
    aget v5, v1, v8

    goto :goto_1

    :cond_1
    aget v5, v1, v7

    :goto_1
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    move v4, v6

    goto :goto_0

    :cond_2
    sput-object v2, Lio/github/sceneview/ar/arcore/LightEstimator;->t:Ljava/util/List;

    return-void

    :array_0
    .array-data 4
        0x3e906ec1
        -0x41593943
        0x3ea6c6bd
        -0x41593943
        0x3e8bd89d
        -0x41742763
        0x3da17b0f
        -0x41742763
        0x3e0bd8be
    .end array-data
.end method

.method public constructor <init>(Lio/github/sceneview/ar/ArSceneLifecycle;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/sceneview/ar/ArSceneLifecycle;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/github/sceneview/ar/arcore/LightEstimator;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onUpdated"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->b:Lio/github/sceneview/ar/ArSceneLifecycle;

    sget-object v0, LLq2;->c:LLq2;

    iput-object v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->c:LLq2;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->e:Z

    iput-boolean v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->f:Z

    iput-boolean v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->g:Z

    iput-boolean v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->i:Z

    iput-boolean v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->j:Z

    new-array v0, v0, [Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->o:Ljava/util/List;

    invoke-virtual {p1, p0}, LTX0;->a(LFq2;)V

    return-void
.end method

.method public static synthetic a([Landroid/media/Image;Ljava/nio/ByteBuffer;)V
    .locals 0

    invoke-static {p0, p1}, Lio/github/sceneview/ar/arcore/LightEstimator;->k([Landroid/media/Image;Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public static final k([Landroid/media/Image;Ljava/nio/ByteBuffer;)V
    .locals 3

    const-string v0, "$arImages"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p0, v1

    invoke-virtual {v2}, Landroid/media/Image;->close()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    return-void
.end method


# virtual methods
.method public F(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lxm$a;->d(Lxm;Ljava/lang/Exception;)V

    return-void
.end method

.method public I(II)V
    .locals 0

    invoke-static {p0, p1, p2}, Lxm$a;->g(Lxm;II)V

    return-void
.end method

.method public final b()F
    .locals 2

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->j()Lio/github/sceneview/ar/ArSceneView;

    move-result-object v0

    invoke-virtual {v0}, Lio/github/sceneview/ar/ArSceneView;->v0()Lcom/google/ar/sceneform/ArCameraNode;

    move-result-object v0

    iget-object v0, v0, Lcom/google/ar/sceneform/CameraNode;->Q:Lcom/google/android/filament/Camera;

    const-string v1, "sceneView.cameraNode.camera"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LNb0;->b(Lcom/google/android/filament/Camera;)F

    move-result v0

    return v0
.end method

.method public c(Lio/github/sceneview/ar/arcore/ArSession;)V
    .locals 0

    invoke-static {p0, p1}, Lxm$a;->e(Lxm;Lio/github/sceneview/ar/arcore/ArSession;)V

    return-void
.end method

.method public final d()Lwf1;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->m:Lwf1;

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->n:Ljava/lang/Integer;

    return-object v0
.end method

.method public final f()F
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->d:Ljava/lang/Float;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->c:LLq2;

    invoke-virtual {v0}, LLq2;->b()F

    move-result v0

    :goto_0
    return v0
.end method

.method public g(LPy1;)V
    .locals 0

    invoke-static {p0, p1}, Lxm$a;->f(Lxm;LPy1;)V

    return-void
.end method

.method public i(Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lxm$a;->b(Lxm;Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V

    return-void
.end method

.method public final j()Lio/github/sceneview/ar/ArSceneView;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->b:Lio/github/sceneview/ar/ArSceneLifecycle;

    invoke-virtual {v0}, Lio/github/sceneview/ar/ArSceneLifecycle;->x()Lio/github/sceneview/ar/ArSceneView;

    move-result-object v0

    return-object v0
.end method

.method public l()V
    .locals 2

    iget-object v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->o:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public m(Lio/github/sceneview/ar/arcore/ArSession;)V
    .locals 0

    invoke-static {p0, p1}, Lxm$a;->c(Lxm;Lio/github/sceneview/ar/arcore/ArSession;)V

    return-void
.end method

.method public final n(Lwf1;)V
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->m:Lwf1;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->m:Lwf1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lwf1;->a()V

    :cond_0
    iput-object p1, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->m:Lwf1;

    :cond_1
    return-void
.end method

.method public final o(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->n:Ljava/lang/Integer;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->n:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, LNq2;->c(I)V

    :cond_0
    iput-object p1, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->n:Ljava/lang/Integer;

    :cond_1
    return-void
.end method

.method public onDestroy(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->m:Lwf1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lwf1;->a()V

    :cond_0
    iget-object v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->n:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, LNq2;->c(I)V

    :cond_1
    invoke-super {p0, p1}, LVX0;->onDestroy(LLifecycleOwner;)V

    return-void
.end method

.method public final p(LLq2;)V
    .locals 6

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->c:LLq2;

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->j()Lio/github/sceneview/ar/ArSceneView;

    move-result-object v0

    sget-object v1, Lio/github/sceneview/ar/arcore/LightEstimator$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v1, v2

    const/4 v3, 0x3

    const/4 v4, 0x1

    if-eq v2, v4, :cond_2

    const/4 v5, 0x2

    if-eq v2, v5, :cond_2

    if-eq v2, v3, :cond_2

    const/4 v5, 0x4

    if-eq v2, v5, :cond_1

    const/4 v5, 0x5

    if-ne v2, v5, :cond_0

    sget-object v2, Lcom/google/ar/core/Config$LightEstimationMode;->DISABLED:Lcom/google/ar/core/Config$LightEstimationMode;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object v2, Lcom/google/ar/core/Config$LightEstimationMode;->AMBIENT_INTENSITY:Lcom/google/ar/core/Config$LightEstimationMode;

    goto :goto_0

    :cond_2
    sget-object v2, Lcom/google/ar/core/Config$LightEstimationMode;->ENVIRONMENTAL_HDR:Lcom/google/ar/core/Config$LightEstimationMode;

    :goto_0
    invoke-virtual {v0, v2}, Lio/github/sceneview/ar/ArSceneView;->setSessionLightEstimationMode(Lcom/google/ar/core/Config$LightEstimationMode;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v2, 0x0

    if-ne v0, v4, :cond_3

    move v0, v4

    goto :goto_1

    :cond_3
    move v0, v2

    :goto_1
    iput-boolean v0, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->e:Z

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-ne v0, v3, :cond_4

    goto :goto_2

    :cond_4
    move v2, v4

    :goto_2
    iput-boolean v2, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->f:Z

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    if-ne p1, v4, :cond_5

    const/high16 p1, 0x3f000000    # 0.5f

    goto :goto_3

    :cond_5
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_3
    invoke-virtual {p0, p1}, Lio/github/sceneview/ar/arcore/LightEstimator;->q(F)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lio/github/sceneview/ar/arcore/LightEstimator;->n(Lwf1;)V

    invoke-virtual {p0, p1}, Lio/github/sceneview/ar/arcore/LightEstimator;->o(Ljava/lang/Integer;)V

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->l()V

    return-void
.end method

.method public final q(F)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lio/github/sceneview/ar/arcore/LightEstimator;->d:Ljava/lang/Float;

    return-void
.end method

.method public r(Lrm;)V
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "arFrame"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p0 .. p1}, Lxm$a;->a(Lxm;Lrm;)V

    iget-object v2, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->k:Lrm;

    invoke-virtual {v0, v2}, Lrm;->p(Lrm;)D

    move-result-wide v2

    invoke-virtual/range {p0 .. p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->f()F

    move-result v4

    float-to-double v4, v4

    cmpg-double v2, v2, v4

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-gtz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    const/4 v5, 0x0

    if-eqz v2, :cond_1

    move-object v2, v0

    goto :goto_1

    :cond_1
    move-object v2, v5

    :goto_1
    if-eqz v2, :cond_2e

    invoke-virtual {v2}, Lrm;->c()Lcom/google/ar/core/Frame;

    move-result-object v2

    if-eqz v2, :cond_2e

    invoke-virtual {v2}, Lcom/google/ar/core/Frame;->getLightEstimate()Lcom/google/ar/core/LightEstimate;

    move-result-object v2

    if-eqz v2, :cond_2e

    invoke-virtual {v2}, Lcom/google/ar/core/LightEstimate;->getState()Lcom/google/ar/core/LightEstimate$State;

    move-result-object v6

    sget-object v7, Lcom/google/ar/core/LightEstimate$State;->VALID:Lcom/google/ar/core/LightEstimate$State;

    if-ne v6, v7, :cond_3

    invoke-virtual {v2}, Lcom/google/ar/core/LightEstimate;->getTimestamp()J

    move-result-wide v6

    iget-object v8, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->l:Ljava/lang/Long;

    if-nez v8, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    cmp-long v6, v6, v8

    if-eqz v6, :cond_3

    :goto_2
    move v6, v3

    goto :goto_3

    :cond_3
    move v6, v4

    :goto_3
    if-eqz v6, :cond_4

    goto :goto_4

    :cond_4
    move-object v2, v5

    :goto_4
    if-eqz v2, :cond_2e

    iput-object v0, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->k:Lrm;

    invoke-virtual {v2}, Lcom/google/ar/core/LightEstimate;->getTimestamp()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iput-object v6, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->l:Ljava/lang/Long;

    invoke-virtual/range {p1 .. p1}, Lrm;->d()Lio/github/sceneview/ar/arcore/ArSession;

    move-result-object v0

    invoke-virtual {v0}, Lio/github/sceneview/ar/arcore/ArSession;->t()Lcom/google/ar/core/Config$LightEstimationMode;

    move-result-object v0

    sget-object v6, Lio/github/sceneview/ar/arcore/LightEstimator$b;->$EnumSwitchMapping$1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v6, v0

    const/4 v6, 0x0

    const/4 v8, 0x2

    if-eq v0, v3, :cond_1f

    if-eq v0, v8, :cond_5

    invoke-virtual {v1, v5}, Lio/github/sceneview/ar/arcore/LightEstimator;->n(Lwf1;)V

    invoke-virtual {v1, v5}, Lio/github/sceneview/ar/arcore/LightEstimator;->o(Ljava/lang/Integer;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_23

    :cond_5
    iget-boolean v0, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->j:Z

    if-eqz v0, :cond_9

    invoke-virtual {v2}, Lcom/google/ar/core/LightEstimate;->getEnvironmentalHdrMainLightIntensity()[F

    move-result-object v0

    const-string v9, "lightEstimate.environmentalHdrMainLightIntensity"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LgN2;->n([F)[F

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->maxOrNull([F)Ljava/lang/Float;

    move-result-object v9

    if-eqz v9, :cond_8

    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    move-result v10

    cmpl-float v6, v10, v6

    if-lez v6, :cond_6

    move v6, v3

    goto :goto_5

    :cond_6
    move v6, v4

    :goto_5
    if-eqz v6, :cond_7

    goto :goto_6

    :cond_7
    move-object v9, v5

    :goto_6
    if-eqz v9, :cond_8

    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    move-result v6

    aget v9, v0, v4

    div-float v10, v9, v6

    aget v9, v0, v3

    div-float v11, v9, v6

    aget v0, v0, v8

    div-float v12, v0, v6

    const/4 v13, 0x0

    const/16 v14, 0x8

    const/4 v15, 0x0

    invoke-static/range {v10 .. v15}, Lum0;->d(FFFFILjava/lang/Object;)Liu1;

    move-result-object v0

    goto :goto_7

    :cond_8
    move-object v0, v5

    :goto_7
    if-nez v0, :cond_a

    const v9, 0x38d1b717    # 1.0E-4f

    const v10, 0x38d1b717    # 1.0E-4f

    const v11, 0x38d1b717    # 1.0E-4f

    const/4 v12, 0x0

    const/16 v13, 0x8

    const/4 v14, 0x0

    invoke-static/range {v9 .. v14}, Lum0;->d(FFFFILjava/lang/Object;)Liu1;

    move-result-object v0

    goto :goto_8

    :cond_9
    const/high16 v9, 0x3f800000    # 1.0f

    const/high16 v10, 0x3f800000    # 1.0f

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v12, 0x0

    const/16 v13, 0x8

    const/4 v14, 0x0

    invoke-static/range {v9 .. v14}, Lum0;->d(FFFFILjava/lang/Object;)Liu1;

    move-result-object v0

    :cond_a
    :goto_8
    move-object v6, v0

    invoke-virtual {v6}, Liu1;->h()[F

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->average([F)D

    move-result-wide v9

    double-to-float v9, v9

    iget-boolean v0, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->e:Z

    if-eqz v0, :cond_15

    invoke-virtual {v2}, Lcom/google/ar/core/LightEstimate;->acquireEnvironmentalHdrCubeMap()[Landroid/media/Image;

    move-result-object v10

    if-eqz v10, :cond_16

    const-string v0, "acquireEnvironmentalHdrCubeMap()"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    aget-object v0, v10, v4

    invoke-virtual {v0}, Landroid/media/Image;->getWidth()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aget-object v11, v10, v4

    invoke-virtual {v11}, Landroid/media/Image;->getHeight()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v0, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    array-length v12, v10

    new-array v12, v12, [I

    mul-int v13, v11, v0

    array-length v14, v10

    mul-int/2addr v13, v14

    const/4 v14, 0x6

    mul-int/2addr v13, v14

    mul-int/2addr v13, v8

    iget-object v15, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->p:Ljava/nio/ByteBuffer;

    if-eqz v15, :cond_d

    invoke-virtual {v15}, Ljava/nio/Buffer;->capacity()I

    move-result v5

    if-ne v5, v13, :cond_b

    move v5, v3

    goto :goto_9

    :cond_b
    move v5, v4

    :goto_9
    if-eqz v5, :cond_c

    goto :goto_a

    :cond_c
    const/4 v15, 0x0

    :goto_a
    if-eqz v15, :cond_d

    invoke-virtual {v15}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    goto :goto_b

    :cond_d
    invoke-static {v13}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v15

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v5

    invoke-virtual {v15, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    iput-object v15, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->p:Ljava/nio/ByteBuffer;

    :goto_b
    new-array v5, v14, [B

    array-length v13, v10

    move v14, v4

    move/from16 v16, v14

    :goto_c
    if-ge v14, v13, :cond_f

    aget-object v17, v10, v14

    add-int/lit8 v18, v16, 0x1

    invoke-virtual {v15}, Ljava/nio/Buffer;->position()I

    move-result v19

    aput v19, v12, v16

    invoke-virtual/range {v17 .. v17}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v16

    aget-object v16, v16, v4

    invoke-virtual/range {v16 .. v16}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v3

    :goto_d
    invoke-virtual {v3}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v16

    if-eqz v16, :cond_e

    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v15, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    move-result v16

    add-int/lit8 v7, v16, 0x2

    invoke-virtual {v3, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_d

    :cond_e
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    add-int/lit8 v14, v14, 0x1

    move/from16 v16, v18

    const/4 v3, 0x1

    goto :goto_c

    :cond_f
    invoke-virtual {v15}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    iget-object v3, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->q:Lcom/google/android/filament/Texture;

    if-eqz v3, :cond_12

    invoke-virtual {v3, v4}, Lcom/google/android/filament/Texture;->getWidth(I)I

    move-result v5

    if-ne v5, v11, :cond_10

    invoke-virtual {v3, v4}, Lcom/google/android/filament/Texture;->getHeight(I)I

    move-result v5

    if-ne v5, v0, :cond_10

    const/4 v5, 0x1

    goto :goto_e

    :cond_10
    move v5, v4

    :goto_e
    if-eqz v5, :cond_11

    goto :goto_f

    :cond_11
    const/4 v3, 0x0

    :goto_f
    if-nez v3, :cond_14

    :cond_12
    new-instance v3, Lcom/google/android/filament/Texture$Builder;

    invoke-direct {v3}, Lcom/google/android/filament/Texture$Builder;-><init>()V

    invoke-virtual {v3, v11}, Lcom/google/android/filament/Texture$Builder;->width(I)Lcom/google/android/filament/Texture$Builder;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/filament/Texture$Builder;->height(I)Lcom/google/android/filament/Texture$Builder;

    move-result-object v0

    const/16 v3, 0xff

    invoke-virtual {v0, v3}, Lcom/google/android/filament/Texture$Builder;->levels(I)Lcom/google/android/filament/Texture$Builder;

    move-result-object v0

    sget-object v3, Lcom/google/android/filament/Texture$Sampler;->SAMPLER_CUBEMAP:Lcom/google/android/filament/Texture$Sampler;

    invoke-virtual {v0, v3}, Lcom/google/android/filament/Texture$Builder;->sampler(Lcom/google/android/filament/Texture$Sampler;)Lcom/google/android/filament/Texture$Builder;

    move-result-object v0

    sget-object v3, Lcom/google/android/filament/Texture$InternalFormat;->R11F_G11F_B10F:Lcom/google/android/filament/Texture$InternalFormat;

    invoke-virtual {v0, v3}, Lcom/google/android/filament/Texture$Builder;->format(Lcom/google/android/filament/Texture$InternalFormat;)Lcom/google/android/filament/Texture$Builder;

    move-result-object v0

    const-string v3, "Builder()\n              \u2026nalFormat.R11F_G11F_B10F)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Le36;->a(Lcom/google/android/filament/Texture$Builder;)Lcom/google/android/filament/Texture;

    move-result-object v3

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->q:Lcom/google/android/filament/Texture;

    if-eqz v0, :cond_13

    invoke-static {v0}, Le36;->b(Lcom/google/android/filament/Texture;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_10

    :cond_13
    const/4 v0, 0x0

    :goto_10
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_11

    :catchall_0
    move-exception v0

    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_11
    iput-object v3, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->q:Lcom/google/android/filament/Texture;

    :cond_14
    new-instance v0, Lcom/google/android/filament/Texture$PixelBufferDescriptor;

    sget-object v18, Lcom/google/android/filament/Texture$Format;->RGB:Lcom/google/android/filament/Texture$Format;

    sget-object v19, Lcom/google/android/filament/Texture$Type;->HALF:Lcom/google/android/filament/Texture$Type;

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    new-instance v5, LMq2;

    invoke-direct {v5, v10, v15}, LMq2;-><init>([Landroid/media/Image;Ljava/nio/ByteBuffer;)V

    move-object/from16 v16, v0

    move-object/from16 v17, v15

    move-object/from16 v25, v5

    invoke-direct/range {v16 .. v25}, Lcom/google/android/filament/Texture$PixelBufferDescriptor;-><init>(Ljava/nio/Buffer;Lcom/google/android/filament/Texture$Format;Lcom/google/android/filament/Texture$Type;IIIILjava/lang/Object;Ljava/lang/Runnable;)V

    invoke-static {v3, v4, v0, v12}, Le36;->e(Lcom/google/android/filament/Texture;ILcom/google/android/filament/Texture$PixelBufferDescriptor;[I)V

    goto :goto_12

    :cond_15
    iget-boolean v0, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->f:Z

    if-eqz v0, :cond_16

    invoke-virtual/range {p0 .. p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->j()Lio/github/sceneview/ar/ArSceneView;

    move-result-object v0

    invoke-virtual {v0}, Lio/github/sceneview/SceneView;->U()Lcom/google/android/filament/IndirectLight;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Lcom/google/android/filament/IndirectLight;->getReflectionsTexture()Lcom/google/android/filament/Texture;

    move-result-object v3

    :goto_12
    move-object/from16 v17, v3

    goto :goto_13

    :cond_16
    const/16 v17, 0x0

    :goto_13
    iget-boolean v0, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->g:Z

    if-eqz v0, :cond_18

    invoke-virtual {v2}, Lcom/google/ar/core/LightEstimate;->getEnvironmentalHdrAmbientSphericalHarmonics()[F

    move-result-object v0

    if-eqz v0, :cond_19

    new-instance v3, Ljava/util/ArrayList;

    array-length v5, v0

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    array-length v5, v0

    move v7, v4

    move v10, v7

    :goto_14
    if-ge v7, v5, :cond_17

    aget v11, v0, v7

    add-int/lit8 v12, v10, 0x1

    sget-object v13, Lio/github/sceneview/ar/arcore/LightEstimator;->t:Ljava/util/List;

    const/4 v14, 0x3

    div-int/2addr v10, v14

    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    move-result v10

    mul-float/2addr v11, v10

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-interface {v3, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    move v10, v12

    goto :goto_14

    :cond_17
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toFloatArray(Ljava/util/Collection;)[F

    move-result-object v0

    goto :goto_15

    :cond_18
    invoke-virtual/range {p0 .. p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->j()Lio/github/sceneview/ar/ArSceneView;

    move-result-object v0

    invoke-virtual {v0}, Lio/github/sceneview/SceneView;->R()Lwf1;

    move-result-object v0

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Lwf1;->d()[F

    move-result-object v0

    :goto_15
    move-object/from16 v18, v0

    goto :goto_16

    :cond_19
    const/16 v18, 0x0

    :goto_16
    iget-boolean v0, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->e:Z

    if-eqz v0, :cond_1a

    iget-boolean v0, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->h:Z

    if-eqz v0, :cond_1a

    const/16 v20, 0x1

    goto :goto_17

    :cond_1a
    move/from16 v20, v4

    :goto_17
    invoke-virtual/range {p0 .. p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->j()Lio/github/sceneview/ar/ArSceneView;

    move-result-object v0

    invoke-virtual {v0}, Lio/github/sceneview/SceneView;->R()Lwf1;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Lwf1;->b()Lcom/google/android/filament/IndirectLight;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Lcom/google/android/filament/IndirectLight;->getIntensity()F

    move-result v0

    mul-float/2addr v0, v9

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object/from16 v19, v0

    goto :goto_18

    :cond_1b
    const/16 v19, 0x0

    :goto_18
    new-instance v0, LzE1;

    const/16 v21, 0x0

    const/16 v22, 0x1

    move-object/from16 v16, v0

    invoke-direct/range {v16 .. v22}, LzE1;-><init>(Lcom/google/android/filament/Texture;[FLjava/lang/Float;ZZZ)V

    invoke-virtual {v1, v0}, Lio/github/sceneview/ar/arcore/LightEstimator;->n(Lwf1;)V

    invoke-virtual/range {p0 .. p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->j()Lio/github/sceneview/ar/ArSceneView;

    move-result-object v0

    invoke-virtual {v0}, Lio/github/sceneview/SceneView;->V()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, LNq2;->b(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-boolean v3, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->i:Z

    if-eqz v3, :cond_1c

    invoke-virtual {v2}, Lcom/google/ar/core/LightEstimate;->getEnvironmentalHdrMainLightDirection()[F

    move-result-object v2

    const-string v3, "(x, y, z)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    aget v3, v2, v4

    const/4 v4, 0x1

    aget v4, v2, v4

    aget v2, v2, v8

    new-instance v7, Lhu1;

    neg-float v3, v3

    neg-float v4, v4

    neg-float v2, v2

    invoke-direct {v7, v3, v4, v2}, Lhu1;-><init>(FFF)V

    invoke-static {v0, v7}, LNq2;->r(ILhu1;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1c
    iget-boolean v2, v1, Lio/github/sceneview/ar/arcore/LightEstimator;->j:Z

    if-eqz v2, :cond_1e

    invoke-static {v0}, LNq2;->d(I)Liu1;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->b()F

    move-result v3

    new-instance v4, Liu1;

    invoke-virtual {v6}, Liu1;->e()F

    move-result v7

    mul-float/2addr v7, v3

    invoke-virtual {v6}, Liu1;->f()F

    move-result v8

    mul-float/2addr v8, v3

    invoke-virtual {v6}, Liu1;->g()F

    move-result v10

    mul-float/2addr v10, v3

    invoke-virtual {v6}, Liu1;->d()F

    move-result v6

    mul-float/2addr v6, v3

    invoke-direct {v4, v7, v8, v10, v6}, Liu1;-><init>(FFFF)V

    new-instance v3, Liu1;

    invoke-virtual {v2}, Liu1;->e()F

    move-result v6

    invoke-virtual {v4}, Liu1;->e()F

    move-result v7

    mul-float/2addr v6, v7

    invoke-virtual {v2}, Liu1;->f()F

    move-result v7

    invoke-virtual {v4}, Liu1;->f()F

    move-result v8

    mul-float/2addr v7, v8

    invoke-virtual {v2}, Liu1;->g()F

    move-result v8

    invoke-virtual {v4}, Liu1;->g()F

    move-result v10

    mul-float/2addr v8, v10

    invoke-virtual {v2}, Liu1;->d()F

    move-result v2

    invoke-virtual {v4}, Liu1;->d()F

    move-result v4

    mul-float/2addr v2, v4

    invoke-direct {v3, v6, v7, v8, v2}, Liu1;-><init>(FFFF)V

    invoke-static {v0, v3}, LNq2;->q(ILiu1;)V

    invoke-static {v0}, LNq2;->i(I)F

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->b()F

    move-result v3

    mul-float/2addr v9, v3

    mul-float/2addr v2, v9

    invoke-static {v0, v2}, LNq2;->s(IF)V

    goto :goto_19

    :cond_1d
    const/4 v5, 0x0

    :cond_1e
    :goto_19
    invoke-virtual {v1, v5}, Lio/github/sceneview/ar/arcore/LightEstimator;->o(Ljava/lang/Integer;)V

    invoke-virtual/range {p0 .. p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->l()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto/16 :goto_23

    :cond_1f
    const/4 v0, 0x4

    new-array v0, v0, [F

    invoke-virtual {v2, v0, v4}, Lcom/google/ar/core/LightEstimate;->getColorCorrection([FI)V

    invoke-static {v0}, LgN2;->n([F)[F

    move-result-object v0

    new-instance v2, Lkotlin/ranges/IntRange;

    invoke-direct {v2, v4, v8}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {v0, v2}, Lkotlin/collections/ArraysKt;->slice([FLkotlin/ranges/IntRange;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->maxOrNull(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_22

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v3

    cmpl-float v3, v3, v6

    if-lez v3, :cond_20

    const/4 v3, 0x1

    goto :goto_1a

    :cond_20
    move v3, v4

    :goto_1a
    if-eqz v3, :cond_21

    goto :goto_1b

    :cond_21
    const/4 v2, 0x0

    :goto_1b
    if-eqz v2, :cond_22

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    new-instance v3, Liu1;

    aget v5, v0, v4

    div-float v10, v5, v2

    const/4 v5, 0x1

    aget v7, v0, v5

    div-float v11, v7, v2

    aget v7, v0, v8

    div-float v12, v7, v2

    const/4 v13, 0x0

    const/16 v14, 0x8

    const/4 v15, 0x0

    move-object v9, v3

    invoke-direct/range {v9 .. v15}, Liu1;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1c

    :cond_22
    const/4 v5, 0x1

    new-instance v3, Liu1;

    const v17, 0x38d1b717    # 1.0E-4f

    const v18, 0x38d1b717    # 1.0E-4f

    const v19, 0x38d1b717    # 1.0E-4f

    const/16 v20, 0x0

    const/16 v21, 0x8

    const/16 v22, 0x0

    move-object/from16 v16, v3

    invoke-direct/range {v16 .. v22}, Liu1;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1c
    const/4 v2, 0x3

    aget v0, v0, v2

    const v2, 0x3fe66666    # 1.8f

    mul-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Liu1;

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    new-instance v3, Lcom/google/android/filament/IndirectLight$Builder;

    invoke-direct {v3}, Lcom/google/android/filament/IndirectLight$Builder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->j()Lio/github/sceneview/ar/ArSceneView;

    move-result-object v7

    invoke-virtual {v7}, Lio/github/sceneview/SceneView;->U()Lcom/google/android/filament/IndirectLight;

    move-result-object v7

    if-eqz v7, :cond_23

    invoke-virtual {v7}, Lcom/google/android/filament/IndirectLight;->getReflectionsTexture()Lcom/google/android/filament/Texture;

    move-result-object v7

    if-eqz v7, :cond_23

    invoke-virtual {v3, v7}, Lcom/google/android/filament/IndirectLight$Builder;->reflections(Lcom/google/android/filament/Texture;)Lcom/google/android/filament/IndirectLight$Builder;

    :cond_23
    invoke-virtual/range {p0 .. p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->j()Lio/github/sceneview/ar/ArSceneView;

    move-result-object v7

    invoke-virtual {v7}, Lio/github/sceneview/SceneView;->R()Lwf1;

    move-result-object v7

    if-eqz v7, :cond_27

    invoke-virtual {v7}, Lwf1;->d()[F

    move-result-object v7

    if-eqz v7, :cond_27

    array-length v8, v7

    new-array v9, v8, [F

    move v10, v4

    :goto_1d
    if-ge v10, v8, :cond_26

    if-ltz v10, :cond_24

    const/4 v11, 0x3

    if-ge v10, v11, :cond_24

    move v11, v5

    goto :goto_1e

    :cond_24
    move v11, v4

    :goto_1e
    if-eqz v11, :cond_25

    aget v11, v7, v10

    invoke-virtual {v2, v10}, Liu1;->c(I)F

    move-result v12

    mul-float/2addr v11, v12

    goto :goto_1f

    :cond_25
    aget v11, v7, v10

    :goto_1f
    aput v11, v9, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_1d

    :cond_26
    const/4 v10, 0x3

    invoke-virtual {v3, v10, v9}, Lcom/google/android/filament/IndirectLight$Builder;->irradiance(I[F)Lcom/google/android/filament/IndirectLight$Builder;

    :cond_27
    invoke-virtual/range {p0 .. p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->j()Lio/github/sceneview/ar/ArSceneView;

    move-result-object v7

    invoke-virtual {v7}, Lio/github/sceneview/SceneView;->U()Lcom/google/android/filament/IndirectLight;

    move-result-object v7

    if-eqz v7, :cond_28

    invoke-virtual {v7}, Lcom/google/android/filament/IndirectLight;->getIntensity()F

    move-result v7

    mul-float/2addr v7, v0

    invoke-virtual {v3, v7}, Lcom/google/android/filament/IndirectLight$Builder;->intensity(F)Lcom/google/android/filament/IndirectLight$Builder;

    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_28
    invoke-static {v3}, LD12;->a(Lcom/google/android/filament/IndirectLight$Builder;)Lcom/google/android/filament/IndirectLight;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual/range {p0 .. p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->j()Lio/github/sceneview/ar/ArSceneView;

    move-result-object v3

    invoke-virtual {v3}, Lio/github/sceneview/SceneView;->R()Lwf1;

    move-result-object v3

    if-eqz v3, :cond_29

    invoke-virtual {v3}, Lwf1;->d()[F

    move-result-object v3

    move-object v11, v3

    goto :goto_20

    :cond_29
    const/4 v11, 0x0

    :goto_20
    const/4 v12, 0x2

    const/4 v13, 0x0

    new-instance v3, Lwf1;

    move-object v8, v3

    invoke-direct/range {v8 .. v13}, Lwf1;-><init>(Lcom/google/android/filament/IndirectLight;Lcom/google/android/filament/Skybox;[FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v3}, Lio/github/sceneview/ar/arcore/LightEstimator;->n(Lwf1;)V

    invoke-virtual/range {p0 .. p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->j()Lio/github/sceneview/ar/ArSceneView;

    move-result-object v3

    invoke-virtual {v3}, Lio/github/sceneview/SceneView;->V()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_2d

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, LNq2;->b(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-virtual {v2}, Liu1;->e()F

    move-result v8

    invoke-virtual {v2}, Liu1;->f()F

    move-result v9

    invoke-virtual {v2}, Liu1;->g()F

    move-result v10

    invoke-virtual {v2}, Liu1;->d()F

    move-result v11

    invoke-static {v10, v11}, Ljava/lang/Math;->max(FF)F

    move-result v10

    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(FF)F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v9

    cmpl-float v6, v9, v6

    if-lez v6, :cond_2a

    move v4, v5

    :cond_2a
    if-eqz v4, :cond_2b

    move-object v5, v8

    goto :goto_21

    :cond_2b
    const/4 v5, 0x0

    :goto_21
    if-eqz v5, :cond_2c

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v4

    new-instance v5, Liu1;

    invoke-virtual {v2}, Liu1;->e()F

    move-result v6

    div-float/2addr v6, v4

    invoke-virtual {v2}, Liu1;->f()F

    move-result v8

    div-float/2addr v8, v4

    invoke-virtual {v2}, Liu1;->g()F

    move-result v9

    div-float/2addr v9, v4

    invoke-virtual {v2}, Liu1;->d()F

    move-result v2

    div-float/2addr v2, v4

    invoke-direct {v5, v6, v8, v9, v2}, Liu1;-><init>(FFFF)V

    invoke-static {v7}, LNq2;->d(I)Liu1;

    move-result-object v2

    new-instance v4, Liu1;

    invoke-virtual {v2}, Liu1;->e()F

    move-result v6

    invoke-virtual {v5}, Liu1;->e()F

    move-result v8

    mul-float/2addr v6, v8

    invoke-virtual {v2}, Liu1;->f()F

    move-result v8

    invoke-virtual {v5}, Liu1;->f()F

    move-result v9

    mul-float/2addr v8, v9

    invoke-virtual {v2}, Liu1;->g()F

    move-result v9

    invoke-virtual {v5}, Liu1;->g()F

    move-result v10

    mul-float/2addr v9, v10

    invoke-virtual {v2}, Liu1;->d()F

    move-result v2

    invoke-virtual {v5}, Liu1;->d()F

    move-result v5

    mul-float/2addr v2, v5

    invoke-direct {v4, v6, v8, v9, v2}, Liu1;-><init>(FFFF)V

    invoke-static {v7, v4}, LNq2;->q(ILiu1;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2c
    invoke-static {v7}, LNq2;->i(I)F

    move-result v2

    mul-float/2addr v2, v0

    invoke-static {v7, v2}, LNq2;->s(IF)V

    move-object v5, v3

    goto :goto_22

    :cond_2d
    const/4 v5, 0x0

    :goto_22
    invoke-virtual {v1, v5}, Lio/github/sceneview/ar/arcore/LightEstimator;->o(Ljava/lang/Integer;)V

    invoke-virtual/range {p0 .. p0}, Lio/github/sceneview/ar/arcore/LightEstimator;->l()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2e
    :goto_23
    return-void
.end method
