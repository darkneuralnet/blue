.class public final Lio/github/sceneview/ar/arcore/ArSession;
.super Lcom/google/ar/core/Session;
.source "SourceFile"

# interfaces
.implements Lxm;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u000e\u0008\u0002\u0010z\u001a\u0008\u0012\u0004\u0012\u00020y0x\u00a2\u0006\u0004\u0008{\u0010|J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0008\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0008\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0012J \u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00052\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050\u0019R\u0017\u0010\"\u001a\u00020\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u001b\u0010(\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\"\u0010.\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008)\u0010\u000e\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-R\"\u00102\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008/\u0010\u000e\u001a\u0004\u00080\u0010+\"\u0004\u00081\u0010-R\"\u00106\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00083\u0010\u000e\u001a\u0004\u00084\u0010+\"\u0004\u00085\u0010-R\"\u0010:\u001a\u0002078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;\"\u0004\u0008<\u0010=R\"\u0010A\u001a\u0002078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008>\u00109\u001a\u0004\u0008?\u0010;\"\u0004\u0008@\u0010=R\u001a\u0010F\u001a\u00020B8\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008C\u0010D\u001a\u0004\u0008\u001e\u0010ER(\u0010K\u001a\u0004\u0018\u00010\u000f2\u0008\u0010G\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008H\u0010I\u001a\u0004\u0008/\u0010JR(\u0010S\u001a\u0008\u0012\u0004\u0012\u00020M0L8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008&\u0010N\u001a\u0004\u0008O\u0010P\"\u0004\u0008Q\u0010RR$\u0010Z\u001a\u00020T2\u0006\u0010U\u001a\u00020T8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008V\u0010W\"\u0004\u0008X\u0010YR$\u0010]\u001a\u0002072\u0006\u0010U\u001a\u0002078F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008[\u0010;\"\u0004\u0008\\\u0010=R$\u0010c\u001a\u00020^2\u0006\u0010U\u001a\u00020^8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008_\u0010`\"\u0004\u0008a\u0010bR\u0011\u0010d\u001a\u0002078F\u00a2\u0006\u0006\u001a\u0004\u00083\u0010;R$\u0010i\u001a\u00020e2\u0006\u0010U\u001a\u00020e8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008H\u0010f\"\u0004\u0008g\u0010hR$\u0010l\u001a\u0002072\u0006\u0010U\u001a\u0002078F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008j\u0010;\"\u0004\u0008k\u0010=R$\u0010n\u001a\u0002072\u0006\u0010U\u001a\u0002078F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008)\u0010;\"\u0004\u0008m\u0010=R$\u0010q\u001a\u0002072\u0006\u0010U\u001a\u0002078F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008o\u0010;\"\u0004\u0008p\u0010=R$\u0010w\u001a\u00020r2\u0006\u0010U\u001a\u00020r8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008s\u0010t\"\u0004\u0008u\u0010v\u00a8\u0006}"
    }
    d2 = {
        "Lio/github/sceneview/ar/arcore/ArSession;",
        "Lcom/google/ar/core/Session;",
        "Lxm;",
        "LLifecycleOwner;",
        "owner",
        "",
        "onResume",
        "resume",
        "onPause",
        "pause",
        "onDestroy",
        "",
        "width",
        "height",
        "I",
        "Lrm;",
        "arFrame",
        "r",
        "LPy1;",
        "frameTime",
        "D",
        "rotation",
        "widthPx",
        "heightPx",
        "setDisplayGeometry",
        "Lkotlin/Function1;",
        "Lcom/google/ar/core/Config;",
        "config",
        "a",
        "Lio/github/sceneview/ar/ArSceneLifecycle;",
        "b",
        "Lio/github/sceneview/ar/ArSceneLifecycle;",
        "s",
        "()Lio/github/sceneview/ar/ArSceneLifecycle;",
        "lifecycle",
        "Landroid/view/Display;",
        "c",
        "Lkotlin/Lazy;",
        "k",
        "()Landroid/view/Display;",
        "display",
        "d",
        "getDisplayRotation",
        "()I",
        "setDisplayRotation",
        "(I)V",
        "displayRotation",
        "e",
        "n",
        "setDisplayWidth",
        "displayWidth",
        "f",
        "l",
        "setDisplayHeight",
        "displayHeight",
        "",
        "g",
        "Z",
        "isResumed",
        "()Z",
        "setResumed",
        "(Z)V",
        "h",
        "getHasAugmentedImageDatabase",
        "setHasAugmentedImageDatabase",
        "hasAugmentedImageDatabase",
        "",
        "i",
        "F",
        "()F",
        "approximateDistance",
        "<set-?>",
        "j",
        "Lrm;",
        "()Lrm;",
        "currentFrame",
        "",
        "Lcom/google/ar/core/Trackable;",
        "Ljava/util/List;",
        "getAllTrackables",
        "()Ljava/util/List;",
        "setAllTrackables",
        "(Ljava/util/List;)V",
        "allTrackables",
        "Lcom/google/ar/core/Config$FocusMode;",
        "value",
        "o",
        "()Lcom/google/ar/core/Config$FocusMode;",
        "y",
        "(Lcom/google/ar/core/Config$FocusMode;)V",
        "focusMode",
        "u",
        "setPlaneFindingEnabled",
        "planeFindingEnabled",
        "Lcom/google/ar/core/Config$PlaneFindingMode;",
        "v",
        "()Lcom/google/ar/core/Config$PlaneFindingMode;",
        "C",
        "(Lcom/google/ar/core/Config$PlaneFindingMode;)V",
        "planeFindingMode",
        "depthEnabled",
        "Lcom/google/ar/core/Config$DepthMode;",
        "()Lcom/google/ar/core/Config$DepthMode;",
        "x",
        "(Lcom/google/ar/core/Config$DepthMode;)V",
        "depthMode",
        "q",
        "A",
        "instantPlacementEnabled",
        "w",
        "cloudAnchorEnabled",
        "p",
        "z",
        "geospatialEnabled",
        "Lcom/google/ar/core/Config$LightEstimationMode;",
        "t",
        "()Lcom/google/ar/core/Config$LightEstimationMode;",
        "B",
        "(Lcom/google/ar/core/Config$LightEstimationMode;)V",
        "lightEstimationMode",
        "",
        "Lcom/google/ar/core/Session$Feature;",
        "features",
        "<init>",
        "(Lio/github/sceneview/ar/ArSceneLifecycle;Ljava/util/Set;)V",
        "arsceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final b:Lio/github/sceneview/ar/ArSceneLifecycle;

.field public final c:Lkotlin/Lazy;

.field public d:I

.field public e:I

.field public f:I

.field public g:Z

.field public h:Z

.field public final i:F

.field public j:Lrm;

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/google/ar/core/Trackable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lio/github/sceneview/ar/ArSceneLifecycle;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/sceneview/ar/ArSceneLifecycle;",
            "Ljava/util/Set<",
            "+",
            "Lcom/google/ar/core/Session$Feature;",
            ">;)V"
        }
    .end annotation

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "features"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/github/sceneview/ar/ArSceneLifecycle;->w()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/google/ar/core/Session;-><init>(Landroid/content/Context;Ljava/util/Set;)V

    iput-object p1, p0, Lio/github/sceneview/ar/arcore/ArSession;->b:Lio/github/sceneview/ar/ArSceneLifecycle;

    new-instance p2, Lio/github/sceneview/ar/arcore/ArSession$c;

    invoke-direct {p2, p0}, Lio/github/sceneview/ar/arcore/ArSession$c;-><init>(Lio/github/sceneview/ar/arcore/ArSession;)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    iput-object p2, p0, Lio/github/sceneview/ar/arcore/ArSession;->c:Lkotlin/Lazy;

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/ArSession;->k()Landroid/view/Display;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Display;->getRotation()I

    move-result p2

    iput p2, p0, Lio/github/sceneview/ar/arcore/ArSession;->d:I

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/ArSession;->k()Landroid/view/Display;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Display;->getWidth()I

    move-result p2

    iput p2, p0, Lio/github/sceneview/ar/arcore/ArSession;->e:I

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/ArSession;->k()Landroid/view/Display;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Display;->getHeight()I

    move-result p2

    iput p2, p0, Lio/github/sceneview/ar/arcore/ArSession;->f:I

    const/high16 p2, 0x40000000    # 2.0f

    iput p2, p0, Lio/github/sceneview/ar/arcore/ArSession;->i:F

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lio/github/sceneview/ar/arcore/ArSession;->k:Ljava/util/List;

    invoke-virtual {p1, p0}, LTX0;->a(LFq2;)V

    return-void
.end method


# virtual methods
.method public final A(Z)V
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/ArSession;->q()Z

    move-result v0

    if-eq v0, p1, :cond_0

    new-instance v0, Lio/github/sceneview/ar/arcore/ArSession$f;

    invoke-direct {v0, p1}, Lio/github/sceneview/ar/arcore/ArSession$f;-><init>(Z)V

    invoke-virtual {p0, v0}, Lio/github/sceneview/ar/arcore/ArSession;->a(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public final B(Lcom/google/ar/core/Config$LightEstimationMode;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/ArSession;->t()Lcom/google/ar/core/Config$LightEstimationMode;

    move-result-object v0

    if-eq v0, p1, :cond_0

    new-instance v0, Lio/github/sceneview/ar/arcore/ArSession$g;

    invoke-direct {v0, p1}, Lio/github/sceneview/ar/arcore/ArSession$g;-><init>(Lcom/google/ar/core/Config$LightEstimationMode;)V

    invoke-virtual {p0, v0}, Lio/github/sceneview/ar/arcore/ArSession;->a(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public final C(Lcom/google/ar/core/Config$PlaneFindingMode;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/ArSession;->v()Lcom/google/ar/core/Config$PlaneFindingMode;

    move-result-object v0

    if-eq v0, p1, :cond_0

    new-instance v0, Lio/github/sceneview/ar/arcore/ArSession$h;

    invoke-direct {v0, p1}, Lio/github/sceneview/ar/arcore/ArSession$h;-><init>(Lcom/google/ar/core/Config$PlaneFindingMode;)V

    invoke-virtual {p0, v0}, Lio/github/sceneview/ar/arcore/ArSession;->a(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public final D(LPy1;)Lrm;
    .locals 2

    const-string v0, "frameTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0}, Lcom/google/ar/core/Session;->update()Lcom/google/ar/core/Frame;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lrm;

    invoke-direct {v1, p0, p1, v0}, Lrm;-><init>(Lio/github/sceneview/ar/arcore/ArSession;LPy1;Lcom/google/ar/core/Frame;)V

    iput-object v1, p0, Lio/github/sceneview/ar/arcore/ArSession;->j:Lrm;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public F(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lxm$a;->d(Lxm;Ljava/lang/Exception;)V

    return-void
.end method

.method public I(II)V
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/ArSession;->k()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    invoke-virtual {p0, v0, p1, p2}, Lio/github/sceneview/ar/arcore/ArSession;->setDisplayGeometry(III)V

    return-void
.end method

.method public final a(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/google/ar/core/Config;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/ar/core/Session;->getConfig()Lcom/google/ar/core/Config;

    move-result-object v0

    const-string v1, "this"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/ar/core/Config;->getDepthMode()Lcom/google/ar/core/Config$DepthMode;

    move-result-object p1

    sget-object v1, Lcom/google/ar/core/Config$DepthMode;->DISABLED:Lcom/google/ar/core/Config$DepthMode;

    if-eq p1, v1, :cond_0

    invoke-virtual {v0}, Lcom/google/ar/core/Config;->getDepthMode()Lcom/google/ar/core/Config$DepthMode;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/ar/core/Session;->isDepthModeSupported(Lcom/google/ar/core/Config$DepthMode;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Lcom/google/ar/core/Config;->setDepthMode(Lcom/google/ar/core/Config$DepthMode;)Lcom/google/ar/core/Config;

    :cond_0
    invoke-virtual {p0}, Lcom/google/ar/core/Session;->getCameraConfig()Lcom/google/ar/core/CameraConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/ar/core/CameraConfig;->getFacingDirection()Lcom/google/ar/core/CameraConfig$FacingDirection;

    move-result-object p1

    sget-object v1, Lcom/google/ar/core/CameraConfig$FacingDirection;->FRONT:Lcom/google/ar/core/CameraConfig$FacingDirection;

    if-ne p1, v1, :cond_1

    invoke-virtual {v0}, Lcom/google/ar/core/Config;->getLightEstimationMode()Lcom/google/ar/core/Config$LightEstimationMode;

    move-result-object p1

    sget-object v1, Lcom/google/ar/core/Config$LightEstimationMode;->DISABLED:Lcom/google/ar/core/Config$LightEstimationMode;

    if-eq p1, v1, :cond_1

    invoke-virtual {v0, v1}, Lcom/google/ar/core/Config;->setLightEstimationMode(Lcom/google/ar/core/Config$LightEstimationMode;)Lcom/google/ar/core/Config;

    :cond_1
    invoke-virtual {v0}, Lcom/google/ar/core/Config;->getAugmentedImageDatabase()Lcom/google/ar/core/AugmentedImageDatabase;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/google/ar/core/AugmentedImageDatabase;->getNumImages()I

    move-result p1

    goto :goto_0

    :cond_2
    move p1, v1

    :goto_0
    if-lez p1, :cond_3

    const/4 v1, 0x1

    :cond_3
    iput-boolean v1, p0, Lio/github/sceneview/ar/arcore/ArSession;->h:Z

    invoke-super {p0, v0}, Lcom/google/ar/core/Session;->configure(Lcom/google/ar/core/Config;)V

    iget-object p1, p0, Lio/github/sceneview/ar/arcore/ArSession;->b:Lio/github/sceneview/ar/ArSceneLifecycle;

    invoke-virtual {p1}, LTX0;->q()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LFq2;

    instance-of v2, v1, Lxm;

    if-nez v2, :cond_5

    const/4 v1, 0x0

    :cond_5
    check-cast v1, Lxm;

    if-eqz v1, :cond_4

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxm;

    invoke-virtual {p0}, Lcom/google/ar/core/Session;->getConfig()Lcom/google/ar/core/Config;

    move-result-object v1

    const-string v2, "this@ArSession.config"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p0, v1}, Lxm;->i(Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V

    goto :goto_2

    :cond_7
    return-void
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Lio/github/sceneview/ar/arcore/ArSession;->i:F

    return v0
.end method

.method public c(Lio/github/sceneview/ar/arcore/ArSession;)V
    .locals 0

    invoke-static {p0, p1}, Lxm$a;->e(Lxm;Lio/github/sceneview/ar/arcore/ArSession;)V

    return-void
.end method

.method public final d()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/ar/core/Session;->getConfig()Lcom/google/ar/core/Config;

    move-result-object v0

    const-string v1, "config"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LAm;->a(Lcom/google/ar/core/Config;)Z

    move-result v0

    return v0
.end method

.method public final e()Lrm;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/ar/arcore/ArSession;->j:Lrm;

    return-object v0
.end method

.method public final f()Z
    .locals 2

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/ArSession;->j()Lcom/google/ar/core/Config$DepthMode;

    move-result-object v0

    sget-object v1, Lcom/google/ar/core/Config$DepthMode;->DISABLED:Lcom/google/ar/core/Config$DepthMode;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

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

.method public final j()Lcom/google/ar/core/Config$DepthMode;
    .locals 2

    invoke-virtual {p0}, Lcom/google/ar/core/Session;->getConfig()Lcom/google/ar/core/Config;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/ar/core/Config;->getDepthMode()Lcom/google/ar/core/Config$DepthMode;

    move-result-object v0

    const-string v1, "config.depthMode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final k()Landroid/view/Display;
    .locals 2

    iget-object v0, p0, Lio/github/sceneview/ar/arcore/ArSession;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-display>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/Display;

    return-object v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Lio/github/sceneview/ar/arcore/ArSession;->f:I

    return v0
.end method

.method public m(Lio/github/sceneview/ar/arcore/ArSession;)V
    .locals 0

    invoke-static {p0, p1}, Lxm$a;->c(Lxm;Lio/github/sceneview/ar/arcore/ArSession;)V

    return-void
.end method

.method public final n()I
    .locals 1

    iget v0, p0, Lio/github/sceneview/ar/arcore/ArSession;->e:I

    return v0
.end method

.method public final o()Lcom/google/ar/core/Config$FocusMode;
    .locals 2

    invoke-virtual {p0}, Lcom/google/ar/core/Session;->getConfig()Lcom/google/ar/core/Config;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/ar/core/Config;->getFocusMode()Lcom/google/ar/core/Config$FocusMode;

    move-result-object v0

    const-string v1, "config.focusMode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onDestroy(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/ar/core/Session;->close()V

    invoke-super {p0, p1}, LVX0;->onDestroy(LLifecycleOwner;)V

    return-void
.end method

.method public onPause(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/ArSession;->pause()V

    return-void
.end method

.method public onResume(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/ArSession;->resume()V

    return-void
.end method

.method public final p()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/ar/core/Session;->getConfig()Lcom/google/ar/core/Config;

    move-result-object v0

    const-string v1, "config"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LAm;->b(Lcom/google/ar/core/Config;)Z

    move-result v0

    return v0
.end method

.method public pause()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/github/sceneview/ar/arcore/ArSession;->g:Z

    invoke-super {p0}, Lcom/google/ar/core/Session;->pause()V

    return-void
.end method

.method public final q()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/ar/core/Session;->getConfig()Lcom/google/ar/core/Config;

    move-result-object v0

    const-string v1, "config"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LAm;->c(Lcom/google/ar/core/Config;)Z

    move-result v0

    return v0
.end method

.method public r(Lrm;)V
    .locals 1

    const-string v0, "arFrame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p1, Lcom/google/ar/core/Trackable;

    invoke-virtual {p0, p1}, Lcom/google/ar/core/Session;->getAllTrackables(Ljava/lang/Class;)Ljava/util/Collection;

    move-result-object p1

    const-string v0, "getAllTrackables(Trackable::class.java)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lio/github/sceneview/ar/arcore/ArSession;->k:Ljava/util/List;

    return-void
.end method

.method public resume()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/github/sceneview/ar/arcore/ArSession;->g:Z

    invoke-super {p0}, Lcom/google/ar/core/Session;->resume()V

    iget v0, p0, Lio/github/sceneview/ar/arcore/ArSession;->d:I

    iget v1, p0, Lio/github/sceneview/ar/arcore/ArSession;->e:I

    iget v2, p0, Lio/github/sceneview/ar/arcore/ArSession;->f:I

    invoke-virtual {p0, v0, v1, v2}, Lio/github/sceneview/ar/arcore/ArSession;->setDisplayGeometry(III)V

    iget-object v0, p0, Lio/github/sceneview/ar/arcore/ArSession;->b:Lio/github/sceneview/ar/ArSceneLifecycle;

    invoke-virtual {v0}, LTX0;->q()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LFq2;

    instance-of v3, v2, Lxm;

    if-nez v3, :cond_1

    const/4 v2, 0x0

    :cond_1
    check-cast v2, Lxm;

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxm;

    invoke-interface {v1, p0}, Lxm;->c(Lio/github/sceneview/ar/arcore/ArSession;)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final s()Lio/github/sceneview/ar/ArSceneLifecycle;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/ar/arcore/ArSession;->b:Lio/github/sceneview/ar/ArSceneLifecycle;

    return-object v0
.end method

.method public setDisplayGeometry(III)V
    .locals 1

    iput p1, p0, Lio/github/sceneview/ar/arcore/ArSession;->d:I

    iput p2, p0, Lio/github/sceneview/ar/arcore/ArSession;->e:I

    iput p3, p0, Lio/github/sceneview/ar/arcore/ArSession;->f:I

    iget-boolean v0, p0, Lio/github/sceneview/ar/arcore/ArSession;->g:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Lcom/google/ar/core/Session;->setDisplayGeometry(III)V

    :cond_0
    return-void
.end method

.method public final t()Lcom/google/ar/core/Config$LightEstimationMode;
    .locals 2

    invoke-virtual {p0}, Lcom/google/ar/core/Session;->getConfig()Lcom/google/ar/core/Config;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/ar/core/Config;->getLightEstimationMode()Lcom/google/ar/core/Config$LightEstimationMode;

    move-result-object v0

    const-string v1, "config.lightEstimationMode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final u()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/ar/core/Session;->getConfig()Lcom/google/ar/core/Config;

    move-result-object v0

    const-string v1, "config"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LAm;->d(Lcom/google/ar/core/Config;)Z

    move-result v0

    return v0
.end method

.method public final v()Lcom/google/ar/core/Config$PlaneFindingMode;
    .locals 2

    invoke-virtual {p0}, Lcom/google/ar/core/Session;->getConfig()Lcom/google/ar/core/Config;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/ar/core/Config;->getPlaneFindingMode()Lcom/google/ar/core/Config$PlaneFindingMode;

    move-result-object v0

    const-string v1, "config.planeFindingMode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final w(Z)V
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/ArSession;->d()Z

    move-result v0

    if-eq v0, p1, :cond_0

    new-instance v0, Lio/github/sceneview/ar/arcore/ArSession$a;

    invoke-direct {v0, p1}, Lio/github/sceneview/ar/arcore/ArSession$a;-><init>(Z)V

    invoke-virtual {p0, v0}, Lio/github/sceneview/ar/arcore/ArSession;->a(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public final x(Lcom/google/ar/core/Config$DepthMode;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/ArSession;->j()Lcom/google/ar/core/Config$DepthMode;

    move-result-object v0

    if-eq v0, p1, :cond_0

    new-instance v0, Lio/github/sceneview/ar/arcore/ArSession$b;

    invoke-direct {v0, p1}, Lio/github/sceneview/ar/arcore/ArSession$b;-><init>(Lcom/google/ar/core/Config$DepthMode;)V

    invoke-virtual {p0, v0}, Lio/github/sceneview/ar/arcore/ArSession;->a(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public final y(Lcom/google/ar/core/Config$FocusMode;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/ArSession;->o()Lcom/google/ar/core/Config$FocusMode;

    move-result-object v0

    if-eq v0, p1, :cond_0

    new-instance v0, Lio/github/sceneview/ar/arcore/ArSession$d;

    invoke-direct {v0, p1}, Lio/github/sceneview/ar/arcore/ArSession$d;-><init>(Lcom/google/ar/core/Config$FocusMode;)V

    invoke-virtual {p0, v0}, Lio/github/sceneview/ar/arcore/ArSession;->a(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public final z(Z)V
    .locals 1

    invoke-virtual {p0}, Lio/github/sceneview/ar/arcore/ArSession;->p()Z

    move-result v0

    if-eq v0, p1, :cond_0

    new-instance v0, Lio/github/sceneview/ar/arcore/ArSession$e;

    invoke-direct {v0, p1}, Lio/github/sceneview/ar/arcore/ArSession$e;-><init>(Z)V

    invoke-virtual {p0, v0}, Lio/github/sceneview/ar/arcore/ArSession;->a(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method
